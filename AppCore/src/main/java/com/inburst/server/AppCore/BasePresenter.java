package com.inburst.server.AppCore;

import com.inburst.server.Buisness.base.view.IView;

import java.util.ArrayList;

public abstract class BasePresenter<V extends IView> {
    protected V view;

    BasePresenter() {
    }

    public void onViewCreated(V view) {
        this.view = view;
    }

    public void onViewDestroyed() {
        this.view = null;
    }

    V getView() {
        return this.view;
    }

    protected void onDataError(String error) {
        getView().showError(error);
    }
}

