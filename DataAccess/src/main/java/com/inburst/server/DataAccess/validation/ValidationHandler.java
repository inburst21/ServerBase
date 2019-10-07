package com.inburst.server.DataAccess.validation;

import com.inburst.server.DataAccess.results.ResultCode;
import com.inburst.server.Entitys.base.Entity;

import java.util.ArrayList;

public class ValidationHandler<T extends Entity> {

    public <T extends Entity> ResultCode isValid(T entitys) {
        boolean valid = Validator.validateEntity(entitys);
        return valid ? ResultCode.SUCCESS : ResultCode.ERROR;
    }

    public <T extends Entity> ResultCode isListValid(ArrayList<T> listData) {
        for(T entitys : listData) {
            if(isValid(entitys) == ResultCode.ERROR) return ResultCode.ERROR;
        }
        return ResultCode.SUCCESS;
    }

}
