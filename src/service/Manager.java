package service;

import model.Subscription;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Subscription> mySubscriptions;

   public Manager(){
        this.mySubscriptions = new ArrayList<>();
    }

    public void addSubscription(Subscription s){
        mySubscriptions.add(s);
    }

    public void printPortfolio(){
        System.out.println("-----------MY PORTFOLIO------------");

        for(Subscription s : mySubscriptions){
            System.out.println(s);
        }
    }


    //this is to calculate the total anual income

    public double printTotalExpense(){
       double total = 0;
       for(Subscription s : mySubscriptions){
           total += s.getAnualCost();
       }
       return  total;
    }
}