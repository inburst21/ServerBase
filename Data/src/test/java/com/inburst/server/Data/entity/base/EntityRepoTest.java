package com.inburst.server.Data.entity.base;

import com.inburst.server.Data.entity.NpcRepoImpl;
import com.inburst.server.Data.entity.PlayerRepoImpl;
import com.inburst.server.DataAccess.EntityRepo;
import com.inburst.server.DataAccess.results.ResultCode;
import com.inburst.server.Entitys.Npc;
import com.inburst.server.Entitys.Player;
import com.inburst.server.Entitys.base.Entity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EntityRepoTest {

    private EntityRepo<Entity> entityRepo;
    private EntityRepo<Npc> npcRepo;
    private EntityRepo<Player> playerRepo;

    @Before
    public void setUp() {
        entityRepo = new EntityRepoImpl<>();
        npcRepo = new NpcRepoImpl();
        playerRepo = new PlayerRepoImpl();
    }

    @Test
    public void testGetById() {
        //Testing Generic functions
        Assert.assertEquals(entityRepo.getById(1).blockingFirst().getData().getId().intValue(), 1);
        Assert.assertEquals(playerRepo.getById(1).blockingFirst().getData().getId().intValue(), 1);
        Assert.assertEquals(npcRepo.getById(1).blockingFirst().getData().getId().intValue(), 1);
    }

    @Test
    public void testGetList() {
        //Testing Generic functions
        Assert.assertEquals(entityRepo.getList().blockingSingle().getListData().size(), 3);
        Assert.assertEquals(playerRepo.getList().blockingSingle().getListData().size(), 3);
        Assert.assertEquals(npcRepo.getList().blockingSingle().getListData().size(), 3);
    }

    @Test
    public void testAdd() {
        Entity entity = new Entity();
        Assert.assertEquals(entityRepo.add(entity).blockingSingle().getResultCode(), ResultCode.ERROR); //No ID/Name

        entity.setId(4);
        Assert.assertEquals(entityRepo.add(entity).blockingSingle().getResultCode(), ResultCode.ERROR); //No Name

        entity.setName("test");
        Assert.assertEquals(entityRepo.add(entity).blockingSingle().getResultCode(), ResultCode.SUCCESS); //Good Entity
        Assert.assertEquals(entityRepo.getList().blockingSingle().getListData().size(), 4); // Make sure only one was added
    }

    @Test
    public void testRemove() {
        Entity entity = new Entity();
        entity.setId(20); //Only need entity id to remove

        Assert.assertEquals(entityRepo.remove(entity.getId()).blockingSingle().getResultCode(), ResultCode.ERROR); //Id Not Found

        entity.setId(2);
        Assert.assertEquals(entityRepo.remove(entity.getId()).blockingSingle().getResultCode(), ResultCode.SUCCESS);

        Assert.assertEquals(entityRepo.getById(entity.getId()).blockingSingle().getResultCode(), ResultCode.ERROR); //Should not be in data
    }


    @After
    public void tearDown() {
        entityRepo = null;
    }
}
