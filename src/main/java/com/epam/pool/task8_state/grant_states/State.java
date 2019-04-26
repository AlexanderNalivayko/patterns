package com.epam.pool.task8_state.grant_states;

import com.epam.pool.task8_state.Grant;

public interface State {
    String CANT_DO_THAT = "Can't do that on current grant state.";
    String DELAYING = "Delaying grant: ";
    String RECALLING = "Delaying grant: ";

    String onCreate(Grant grant);

    String onReceive(Grant grant);

    String onApprove(Grant grant);

    String onDelay(Grant grant);

    String onRecall(Grant grant);
}
