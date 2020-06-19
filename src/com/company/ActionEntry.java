package com.company;

public class ActionEntry {

    private ActionInterface action;

    private long repeatInterval;

    private long timeLastDone;

    public ActionEntry(ActionInterface action, long repeatInterval) {
        this.action = action;
        this.repeatInterval = repeatInterval;
        this.timeLastDone = System.currentTimeMillis();
    }

    public ActionInterface getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public long getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(long ri) {
        this.repeatInterval = ri;
    }

    public long getTimeLastDone() {
        return timeLastDone;
    }

    public void setTimeLastDone(long t) {
        this.timeLastDone = t;
    }

    @Override
    public String toString() {
        return (action + " трябва да бъде изпълнявана на всеки " + repeatInterval
                + " ms; за последно е изпълнена на " + timeLastDone);
    }
}

