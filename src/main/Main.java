package main;


import model.Subscription;
import model.RecurringSubscription;
import service.Manager;

public class Main{
    public static void main(String args[]){
        Subscription photoshop = new Subscription("PhotoShop" ,3999);
        System.out.println(photoshop);

        RecurringSubscription netfilx = new RecurringSubscription("Netflix" , 5999,"Montly");
        System.out.println(netfilx);


        Manager myManager = new Manager();
        myManager.addSubscription(photoshop);
        myManager.addSubscription(netfilx);

        myManager.printPortfolio();

        double total = myManager.printTotalExpense();

        System.out.println("The anual Expenece is : " + total);
    }
}