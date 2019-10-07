package com.inburst.server.Buisness.base.entity;

import com.inburst.server.Buisness.base.interactor.BaseInteractor;
import com.inburst.server.Buisness.base.interactor.InteractorHanderler;
import com.inburst.server.Entitys.Player;

import javax.inject.Inject;

public class PlayerInteractorImpl extends BaseInteractor<Player> {

    @Inject
    public PlayerInteractorImpl(InteractorHanderler<Player> interactorHanderler) {
        super(interactorHanderler);
    }

}
