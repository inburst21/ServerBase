package com.inburst.server.Data.entity.base;

import com.inburst.server.DataAccess.EntityRepo;
import com.inburst.server.DataAccess.results.ListResultState;
import com.inburst.server.DataAccess.results.ResultCode;
import com.inburst.server.DataAccess.results.ResultState;
import com.inburst.server.DataAccess.results.SingleResultState;
import com.inburst.server.Entitys.base.Entity;
import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.Optional;

public class EntityRepoImpl<T extends Entity> implements EntityRepo<T> {

    protected ArrayList<T> entityList = new MockEntityList<T>().mockList();

    @Override
    public Observable<SingleResultState<T>> getById(int id) {
        Optional<T> entityMatch = entityList.stream().filter(entity -> entity.getId() == id).findAny();
        if(entityMatch.isPresent()) return Observable.just(new ResultState<>(entityMatch.get()));
        else return Observable.just(new ResultState<>());
    }

    @Override
    public Observable<ListResultState<T>> getList() {
        return Observable.just(new ResultState<>(entityList));
    }

    @Override
    public Observable<SingleResultState<T>> add(T entity) {
        ResultState<T> resultState = new ResultState<>(entity);
        if(resultState.getResultCode() == ResultCode.SUCCESS) entityList.add(entity);
        return Observable.just(resultState);
    }

    @Override
    public Observable<SingleResultState<T>> remove(int id) {
        SingleResultState<T> resultState = getById(id).blockingFirst();
        T entity = resultState.getData();
        if(resultState.getResultCode() == ResultCode.SUCCESS) entityList.remove(resultState.getData());
        return Observable.just(resultState);
    }
}
