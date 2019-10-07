package com.inburst.server.App;

import com.inburst.server.AppCore.NpcPresenterImpl;
import com.inburst.server.Buisness.base.view.IView;
import com.inburst.server.Entitys.Npc;

import javax.inject.Inject;
import java.util.ArrayList;

public class Activity implements IView<Npc> {

    @Inject
    NpcPresenterImpl impl;


    public void onStart() {
        Application.getAppComponent().inject(this);
        Application.getInstance().onCreate();
        impl.registerView(this);
        impl.getList();
        impl.getById(1);

        Npc npc = new Npc();
        npc.setId(9);
        npc.setName("ddd");
        impl.add(npc);
        impl.remove(1);
    }


    @Override
    public void showData(Npc data) {
        System.out.println(data.toString() + " Made it to the app");
    }

    @Override
    public void showList(ArrayList<Npc> list) {
        System.out.println(list.size() + " Made it to the app");
    }

    @Override
    public void showError(String error) {
        System.out.println(error);
    }
}
