package com.inburst.server.DataAccess.results;

import com.inburst.server.Entitys.base.Entity;

import java.util.ArrayList;

public interface ListResultState<T extends Entity> {
    ArrayList<T> getListData();
    ResultCode getResultCode();
}
