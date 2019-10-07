package com.inburst.server.Buisness.base.entity;

import com.inburst.server.Buisness.base.interactor.BaseInteractor;
import com.inburst.server.Buisness.base.interactor.InteractorHanderler;
import com.inburst.server.Buisness.base.view.IView;
import com.inburst.server.Entitys.Npc;

import javax.inject.Inject;

public class NpcInteractorImpl extends BaseInteractor<Npc> {

    @Inject
    public NpcInteractorImpl(InteractorHanderler<Npc> interactorHanderler) {
        super(interactorHanderler);
        this.interactorHanderler = interactorHanderler;
    }

    @Override
    public void registerView(IView<Npc> view) {
        super.registerView(view);
    }
}
