package com.inburst.server.Buisness.base.interactor;

import com.inburst.server.Buisness.base.view.IView;
import com.inburst.server.DataAccess.EntityRepo;
import com.inburst.server.DataAccess.results.ResultCode;
import com.inburst.server.DataAccess.results.ResultState;
import com.inburst.server.DataAccess.results.SingleResultState;
import com.inburst.server.Entitys.base.Entity;

import javax.inject.Inject;

public class InteractorHanderler<T extends Entity> {

    private final EntityRepo<T> repo;

    @Inject
    public InteractorHanderler(EntityRepo<T> repo) {
        this.repo = repo;
    }

    public void getById(int id, IView<T> view) {
        SingleResultState code = repo.getById(id).blockingFirst();
        view.showError("get by id" + code.getData().toString());
    }

    public void getList(IView listIView) {
        listIView.showList(repo.getList().blockingFirst().getListData());
    }

    public void add(T entity, IView<T> view) {
        SingleResultState code = repo.add(entity).blockingFirst();
        view.showError("add " + code.getData().toString());
    }

    public void remove(int id, IView<T> view) {
        SingleResultState code = repo.remove(id).blockingFirst();
        view.showError("remove " + code.getData().toString());
    }


}
