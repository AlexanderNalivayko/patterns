package com.epam.pool.task8_state;

import com.epam.pool.task8_state.grant_states.CreatedState;

public class Runner {

    public static void main(String[] args) {
        Grant grant = new Grant("World climate studying grant.", new CreatedState());

        grant.create();
        grant.receive();
        grant.approve();

        grant.recall();
        grant.receive();
        grant.approve();

        grant.delay();
    }
}
