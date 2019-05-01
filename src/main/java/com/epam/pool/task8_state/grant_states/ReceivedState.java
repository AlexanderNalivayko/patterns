package com.epam.pool.task8_state.grant_states;

import com.epam.pool.task8_state.Grant;

public class ReceivedState implements State {

    @Override
    public String onCreate(Grant grant) {
        return CANT_DO_THAT;
    }

    @Override
    public String onReceive(Grant grant) {
        return CANT_DO_THAT;
    }

    @Override
    public String onApprove(Grant grant) {
        grant.changeState(new ApprovedState());
        return "Approving grant: " + grant.getName();
    }

    @Override
    public String onDelay(Grant grant) {
        grant.changeState(new DelayedState());
        return DELAYING + grant.getName();
    }

    @Override
    public String onRecall(Grant grant) {
        grant.changeState(new RecalledState());
        return RECALLING + grant.getName();
    }
}
