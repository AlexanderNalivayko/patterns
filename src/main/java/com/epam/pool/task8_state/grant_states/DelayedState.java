package com.epam.pool.task8_state.grant_states;

import com.epam.pool.task8_state.Grant;

public class DelayedState implements State {

    @Override
    public String onCreate(Grant grant) {
        return CANT_DO_THAT;
    }

    @Override
    public String onReceive(Grant grant) {
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
