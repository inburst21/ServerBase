package com.inburst.server.DataAccess.results;

import com.inburst.server.DataAccess.validation.ValidationHandler;
import com.inburst.server.Entitys.base.Entity;

import java.util.ArrayList;

public class ResultState<T extends Entity> implements ListResultState<T>, SingleResultState<T> {

    private T data = null;
    private ArrayList<T> listData = null;
    private ResultCode resultCode = null;

    public ResultState(T data) {
        this.data = data;
        this.resultCode = new ValidationHandler<>().isValid(data);
    }

    public ResultState(ArrayList<T> data) {
        this.listData = data;
        this.resultCode = new ValidationHandler<>().isListValid(listData);
    }

    public ResultState() {
        this.resultCode = ResultCode.ERROR;
    }

    public T getData() {
        return data;
    }

    public ArrayList<T> getListData() {
        return listData;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }


}

