package model;

public class RecurringSubscription extends Subscription{
      private String billingCycle;

      public RecurringSubscription(String name, double price, String billingCycle){
          super(name,price);
          this.billingCycle = billingCycle;
      }


      @Override
      public String toString(){
          return "Subscription : " + getName() + " Pricing : " + getPrice() + " plan : "+ "[ " + billingCycle + " ]";
      }

      @Override
      public double getAnualCost(){
          if(billingCycle.equalsIgnoreCase("Monthly")){
              return getPrice() * 12;
          }
          else{
              return getPrice();
          }
      }
}