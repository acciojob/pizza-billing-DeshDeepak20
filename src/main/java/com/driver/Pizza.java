package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean CheeseEx;
    private boolean Toppings;
    private boolean TakeAway;
    private int total;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        price = this.isVeg?300:400;
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        if (!CheeseEx){
            CheeseEx = true;
            price +=80;
        }
    }

    public void addExtraToppings(){
        if(!Toppings){
            Toppings=true;
            price += isVeg?70:120;
        }
    }

    public void addTakeaway(){
        if(!TakeAway){
            TakeAway = true;
            price += 20;
        }
    }

    public String getBill(){
        bill = "Base Price Of The Pizza: "+(isVeg?300:400)+"\n"+(CheeseEx?("Extra Cheese Added: "+80+"\n"):"")+(Toppings?("Extra Toppings Added: "+(isVeg?70:120)+"\n"):"")+
                (TakeAway?("Paperbag Added: "+20+"\n"):"")+"Total Price: "+price+"\n";
        return this.bill;
    }
}
