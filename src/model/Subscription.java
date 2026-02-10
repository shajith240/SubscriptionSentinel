package model;

public class Subscription{
    private String name;
    private double price;

    public Subscription(String name,double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "Subscription : " + name + "( $" + price + ")" ;
    }


    public double getAnualCost(){
        return price;
    }
}