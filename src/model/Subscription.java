package model;


public class Subscription{
    private String name;
    private double price;

    public Subscription(String name,double price){
        if(name == null || name.isEmpty() ){
            System.out.println("You enter invalid subscription! setting it is default subscription\n");
            this.name = "Default Subscription";
        }

        else{
            this.name = name;
        }

        if(price < 0 ){
            System.out.println("This is invalid price! setting it to zero");
            this.price = 0;
        }
        else{
            this.price = price;
        }
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
        return "Subscription : " + name + " Pricing : " + price;
    }


    public double getAnnualCost(){
        return price;
    }
}