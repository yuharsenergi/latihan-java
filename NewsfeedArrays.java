/*
 * 28 Sept 2020
 * 30 days challange
 * Course 5 Example
 * https://www.codecademy.com/courses/learn-java/lessons/learn-java-arrays/exercises/introduction
 * 
*/
import java.util.Arrays;

public class NewsfeedArrays {
  
  String[] topics;
  
  public Newsfeed(String[] initialTopics) {
		topics = initialTopics;
  }
  
  public static void main(String[] args) {
		Newsfeed feed;
    if (args[0].equals("Human")) {
      
      //topics for a Human feed:
      String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
			feed = new Newsfeed(humanTopics);
      
    } else if(args[0].equals("Robot")) {
      
      //topics for a Robot feed:
      String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
      feed = new Newsfeed(robotTopics);
      
    } else {
      String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
      feed = new Newsfeed(genericTopics);
    }
        
    System.out.println("The topics in this feed are: "+Arrays.toString(feed.topics));
    System.out.println("Total topics are : "+feed.length);
  }
}
