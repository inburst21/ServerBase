package com.inburst.server.DataAccess.results;

import com.inburst.server.Entitys.base.Entity;

public interface SingleResultState<T extends Entity> {
    T getData();
    ResultCode getResultCode();
}
