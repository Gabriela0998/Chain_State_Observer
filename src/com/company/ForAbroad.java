package com.company;

public class ForAbroad extends Handler {

    private String name;

    public ForAbroad(Handler successor) {
        this.setSuccessor(successor);
    }

    public ForAbroad() {
    }

    @Override
    public void parse(String fileName) {
       if (canHandleFile(fileName, ".abroad")) {
            System.out.println(" Кише отговарящо за чужбина: " + fileName);
        } else {
            super.parse(fileName);
        }
    }
}