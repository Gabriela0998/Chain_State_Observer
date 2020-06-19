package com.company;

public class ForCity  extends Handler {

    /*private String name;*/

    public ForCity(Handler successor){
        this.setSuccessor(successor);
    }

    @Override
    public void parse(String fileName) {
        if ( canHandleFile(fileName, ".city")){
            System.out.println("  Кише отговарящо за града: "+fileName);
        }
        else{
            super.parse(fileName);
        }
    }
}