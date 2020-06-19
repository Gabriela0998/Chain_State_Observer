package com.company;

public class ForCountry extends Handler {

    private String name;

    public ForCountry(Handler successor){
        this.setSuccessor(successor);
    }

    @Override
    public void parse(String fileName) {
        if ( canHandleFile(fileName, ".country")){
            System.out.println("  Кише отговарящо за страната: "+fileName);
        }
        else{
            super.parse(fileName);
        }
    }
}