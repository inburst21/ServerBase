package com.inburst.server.Data.entity.base;

import com.inburst.server.Entitys.base.Entity;

import java.util.ArrayList;

public class MockEntityList<T extends Entity> {
    public ArrayList<T> mockList() {
        Entity entityOne = new Entity();
        entityOne.setId(1);
        entityOne.setName("one");

        Entity entityTwo = new Entity();
        entityTwo.setId(2);
        entityTwo.setName("two");

        Entity entityThree = new Entity();
        entityThree.setId(3);
        entityThree.setName("three");

        ArrayList<T> entities = new ArrayList<>();
        entities.add((T) entityOne);
        entities.add((T) entityTwo);
        entities.add((T) entityThree);
        return entities;
    }
}