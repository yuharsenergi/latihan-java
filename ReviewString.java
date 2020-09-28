import java.util.ArrayList;

public class ReviewString {
  
  public static void main(String[] args) {
    String firstName = "Yuharsen Ergi";
    String lastName = "Pratama Julian";
    firstName = firstName.concat(" ");
    String fullName = firstName.concat(lastName);
    System.out.println("Initial : "+fullName.charAt(0));
    System.out.println("Name Length : "+fullName.length());
    System.out.println("Upper case : "+fullName.toUpperCase());
    System.out.println("Lower case : "+fullName.toLowerCase());
    ArrayList<String> listNama = new ArrayList<String>();
    listNama.add(firstName);
    listNama.add(lastName);
    listNama.add(fullName);
    for(String nama : listNama){
      
      if("Ergi".equalsIgnoreCase(nama)){
        System.out.println("It is my name");
      }
      else System.out.println("It is not my name");
    }
    int i = fullName.indexOf("Ergi");
    System.out.println("Index nama \"Ergi\" : "+i);

  }
  
}
