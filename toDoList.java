/*
 * 28 Sept 2020
 * 30 days challange
 * Course 6 Example
 * https://www.codecademy.com/courses/learn-java/lessons/learn-java-arrays/exercises/introduction
 * Sherlock case to do
*/

import java.util.ArrayList;
import java.util.Random;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("listen to Dr. Watson for amusement");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    sherlocksToDos.remove("visit the crime scene");
    /* sherlocksToDos.get(1); untuk mendapatkan isi dari sherlocks to do index ke 1
     * sherlocksToDos.set(1,"say hello"); Untuk mengganti isi dari index 1 dari
     *      "play violin" menjadi "say hello"
     */
     
    // Calculate to-dos until case is solved:
    int remaining = sherlocksToDos.indexOf("solve the case"); //untuk mendapatkan index dari array tsb
      
    // Change the value printed:
    System.out.println("Sherlock has "+remaining+" task to do before solve the case");
  }
  
}
