package com.inburst.server.DataAccess;

import com.inburst.server.DataAccess.results.ListResultState;
import com.inburst.server.DataAccess.results.SingleResultState;
import com.inburst.server.Entitys.base.Entity;
import io.reactivex.Observable;

public interface EntityRepo<T extends Entity> {
    Observable<SingleResultState<T>> getById(int id);
    Observable<ListResultState<T>> getList();
    Observable<SingleResultState<T>> add(T type);
    Observable<SingleResultState<T>> remove(int id);
}
