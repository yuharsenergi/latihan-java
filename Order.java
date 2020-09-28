/*
 * 28 Sept 2020
 * 30 days challange
 * Course 2
 * https://www.codecademy.com/courses/learn-java/lessons/java-conditionals-and-control-flow/exercises/review
 */

public class Order {
  boolean isFilled;
  double billAmount;
  String shipping;
  
  public Order(boolean filled, double cost, String shippingMethod) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    } else {
      System.out.println("Low value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
  
  public boolean ship() {
    boolean status;
    if (isFilled) {
      System.out.println("Status : Shipping!");
      status = true;
    } else {
      System.out.println("Status : Order not ready");
      status = false;
    }
    return status;
  }
  
  public double calculateShipping() {
    double shippingCost;
    switch (shipping) {
      case "Regular":
        shippingCost = 0;
        break;
      case "Express":    
        shippingCost = 1.75;
        break;
      default:
        shippingCost = .50;
        break;
    }
    return shippingCost;
 	}
  
  public static void main(String[] args) {
    // create instances and call methods here!
   Order myOrder = new Order(true,19.0,"None");
   if(myOrder.ship()){
   double shipFee = myOrder.calculateShipping();
   System.out.println("Shipping cost: " + shipFee);
   }
   
  }
}
