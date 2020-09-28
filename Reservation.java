/*
 * 28 Sept 2020
 * 30 days challange
 * Course 3
 * https://www.codecademy.com/courses/learn-java/lessons/java-boolean-operators/exercises/review
 */
 
public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public Reservation(int count, int capacity, boolean open) {
    if (count < 1 || count > 8) {
      System.out.println("Invalid reservation!");
    }
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }  
  
  public void confirmReservation() {
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
			isConfirmed = false;
    }
  }
  
  public void informUser() {
    if (!isConfirmed) {
      System.out.println("Unable to confirm reservation, please contact restaurant.");
    } else {
      System.out.println("Please enjoy your meal!");
    }
  }
  
  public static void main(String[] args) {
    // Create instances here
    Reservation Ella = new Reservation(4,10,true);
    Ella.confirmReservation();
    Ella.informUser();
    
    Reservation Ergi = new Reservation(4,10,true);
    Ergi.confirmReservation();
    Ergi.informUser();
  }
}
