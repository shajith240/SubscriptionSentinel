package model;

public class RecuringSubscription extends Subscription{
      private String billingCycle;

      public RecuringSubscription(String name,double price,String BillingCycle){
          super(name,price);
          this.billingCycle = billingCycle;
      }


      @Override
      public String toString(){
          return "Subscription : " + getName() + "Princing : " + getPrice() + "plan : "+ billingCycle;
      }
}