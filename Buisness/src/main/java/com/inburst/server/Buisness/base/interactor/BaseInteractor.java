package com.inburst.server.Buisness.base.interactor;

import com.inburst.server.Buisness.base.view.IView;
import com.inburst.server.Entitys.base.Entity;

public abstract class BaseInteractor<T extends Entity> implements IInteractor<T> {

    protected InteractorHanderler<T> interactorHanderler;
    private IView<T> view;

    public BaseInteractor(InteractorHanderler<T> interactorHanderler) {
        this.interactorHanderler = interactorHanderler;
    }

    @Override
    public void registerView(IView<T> view) {
        this.view = view;
    }

    public void unRegisterView() {
        this.view = null;
    }

    @Override
    public void getById(int id) {
        interactorHanderler.getById(id, view);
    }

    @Override
    public void getList() {
        interactorHanderler.getList(view);
    }

    @Override
    public void add(T entity) {
        interactorHanderler.add(entity, view);
    }

    @Override
    public void remove(int id) {
        interactorHanderler.remove(id, view);
    }
}
