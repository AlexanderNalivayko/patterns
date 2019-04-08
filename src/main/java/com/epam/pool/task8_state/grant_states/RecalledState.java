package com.epam.pool.task8_state.grant_states;

import com.epam.pool.task8_state.Grant;

public class RecalledState implements State {

    @Override
    public String onCreate(Grant grant) {
        return CANT_DO_THAT;
    }

    @Override
    public String onReceive(Grant grant) {
        grant.changeState(new ReceivedState());
        return "Receiving grant: " + grant.getName();
    }

    @Override
    public String onApprove(Grant grant) {
        return CANT_DO_THAT;
    }

    @Override
    public String onDelay(Grant grant) {
        return CANT_DO_THAT;
    }

    @Override
    public String onRecall(Grant grant) {
        return CANT_DO_THAT;
    }
}
