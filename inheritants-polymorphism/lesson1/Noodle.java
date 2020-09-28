/*
 * 29 Sept 2020
 * Course 9
 * 30 days challange
 * Inheritans and polymorphism
 * Lesson 1 : file 1
 * https://www.codecademy.com/courses/learn-java/lessons/java-inheritance-and-polymorphism/exercises/inheritance-in-practice
 */

class Noodle {
  
  double lengthInCentimeters;
  String shape;
  String texture = "brittle";
  
  public void cook() {
    
    this.texture = "cooked";
    
  }
  
  public static void main(String[] args) {
    Spaghetti spaghettiPomodoro=new Spaghetti();
    System.out.println(spaghettiPomodoro.texture);
  }
  
}
