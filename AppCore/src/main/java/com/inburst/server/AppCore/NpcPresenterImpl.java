package com.inburst.server.AppCore;

import com.inburst.server.Buisness.base.interactor.IInteractor;
import com.inburst.server.Buisness.base.view.IView;
import com.inburst.server.Entitys.Npc;

import javax.inject.Inject;

public class NpcPresenterImpl extends BasePresenter<IView<Npc>> implements IInteractor<Npc> {

    private final IInteractor<Npc> interactor;

    @Inject
    public NpcPresenterImpl(IInteractor<Npc> interactor) {
        this.interactor = interactor;
    }


    @Override
    public void registerView(IView<Npc> view) {
        super.onViewCreated(view);
        interactor.registerView(view);
    }

    @Override
    public void unRegisterView() {
        interactor.unRegisterView();
    }

    @Override
    public void getById(int id) {
        interactor.getById(id);
    }

    @Override
    public void getList() {
        interactor.getList();
    }

    @Override
    public void add(Npc entity) {
        interactor.add(entity);
    }

    @Override
    public void remove(int id) {
        interactor.remove(id);
    }
}
