package com.epam.pool.task8_state;

import com.epam.pool.task8_state.grant_states.State;

public class Grant {
    private String name;
    private State state;

    public Grant(String name, State state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void create() {
        System.out.println(state.onCreate(this));
    }

    public void receive() {
        System.out.println(state.onReceive(this));
    }

    public void approve() {
        System.out.println(state.onApprove(this));
    }

    public void delay() {
        System.out.println(state.onDelay(this));
    }

    public void recall() {
        System.out.println(state.onRecall(this));
    }
}
