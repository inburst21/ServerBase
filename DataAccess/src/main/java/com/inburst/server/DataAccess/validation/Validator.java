package com.inburst.server.DataAccess.validation;

import com.inburst.server.Entitys.base.Entity;

public class Validator {
    public static boolean validateEntity(Entity entity) {
        return entity.getId() != null && entity.getName() != null;
    }
}

