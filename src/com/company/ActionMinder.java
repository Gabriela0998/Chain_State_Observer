package com.company;

import java.util.ArrayList;

 import java.util.ArrayList;
 import java.util.Iterator;



public class ActionMinder extends Thread{
    private long sleepInterval;

    private ArrayList<ActionEntry> actionList;

    public ActionMinder(long sleepInterval) {
        this.sleepInterval = sleepInterval;
        actionList = new ArrayList<ActionEntry>();
        start();
    }

    public void addAction(ActionInterface action, long repeatInterval) {
        long ri = (repeatInterval > 0) ? repeatInterval : 0;
        ActionEntry te = new ActionEntry(action, ri);
        actionList.add(te);
    }

    public void run() {
        while (true) {
            try {
                sleep(sleepInterval);
                long now = System.currentTimeMillis();

                for (ActionEntry te: actionList) {
                    if (te.getRepeatInterval() + te.getTimeLastDone() < now) {
                        te.getAction().performAction();
                        te.setTimeLastDone(now);
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupted sleep: " + e);
            }
        }
    }
}
