package com.inburst.server.Buisness.base.interactor;

import com.inburst.server.Buisness.base.view.IView;

public interface IInteractor<T>  {
    void registerView(IView<T> view);
    void unRegisterView();
    void getById(int id);
    void getList();
    void add(T entity);
    void remove(int id);
}
