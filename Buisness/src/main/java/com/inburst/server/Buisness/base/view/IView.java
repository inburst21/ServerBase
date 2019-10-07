package com.inburst.server.Buisness.base.view;

import java.util.ArrayList;

public interface IView<T> {
    void showData(T data);
    void showList(ArrayList<T> list);
    void showError(String error);
}
