/*
 * 28 Sept 2020
 * Course 1
 * 30 days challange
 */

public class Store {
  // instance fields
   String productType;
   double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // advertise method
  public void advertise() {
    String message = "We are selling " + productType + "!";
    System.out.println(message);
  }
  public void greetCustomer(String customer){
    System.out.println("Welcome to the store, "+customer+"!");
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double getPriceWithTax(){
    double totalPrice = price + price * 0.08;
    return totalPrice;
  }
  
  public String toString(){
     return "This store sells "+productType+" at a price of "+price+".";
  }
  
  // main method
  public static void main(String[] args) {
    
    Store lemonadeStand = new Store("Lemonade",3.75);
    lemonadeStand.greetCustomer("Ergi");
    double lemonadePrice = lemonadeStand.getPriceWithTax();
    lemonadeStand.advertise();
    
    Store cookieStand = new Store("Cookie",1.25);
    double cookiePrice = cookieStand.getPriceWithTax();
    cookieStand.advertise();
    System.out.println(cookieStand);
    System.out.println(lemonadeStand);
    
  }
}
