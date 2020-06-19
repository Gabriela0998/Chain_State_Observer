package com.company;

public class Action implements ActionInterface {

    private int nextFortune = 0;
    private String[] fortunes = {"стоят и чакат",
            "състояние на подготовка"};

    @Override
    public void performAction() {
        if(fortunes[nextFortune] == "състояние на подготовка") {
            System.out.println("Действие на служителя: " + fortunes[nextFortune] + " Момчето взима пратката и я отнася в склада. ");
        }
        else {
            System.out.println("Действие на служителя: " + fortunes[nextFortune]);
        }nextFortune = (nextFortune + 1) % fortunes.length;
    }

    @Override
    public String toString() {
        return ("Task: Задача");
    }

}