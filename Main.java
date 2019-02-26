import java.io.*; 
  
public class Main { 
  
static int countOccurences(String str, String word)  
{ 
    String a[] = str.split(" "); 
    int count = 0; 
    for (int i = 0; i < a.length; i++)  
    {
    if (word.equals(a[i])) 
        count++; 
    } 
  
    return count; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    String str = "Raindrops on roses and whiskers on kittens Bright cooper kettles and warm woolen mittens Brown paper packages tied up with strings These are a few of my favorite things Cream colored ponies and crisp apple strudels Doorbells sleighbells and schnitzel with noodles Wild geese that fly with the moon on their wings These are a few of my favorite things Girls in white dresses, with blue satin sashes Snowflakes that stay on my nose and eyelashes Silver white winters that melt into springs And then I don't feel so bad"; 
    String word = "things"; 
    System.out.println(countOccurences(str, word)); 
} 
} 