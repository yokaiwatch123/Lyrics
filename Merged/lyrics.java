import java.io.*;

public class lyrics {

//from Main.java
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
// *******************************************************************************************************

//from charat.java
public static char
getCharFromString(String str, int index)
{
  return str.charAt(index);
}
// *******************************************************************************************************

public static void main(String[] args)
{
    String str = "Raindrops on roses and whiskers on kittens Bright cooper kettles and warm woolen mittens Brown paper packages tied up with strings These are a few of my favorite things Cream colored ponies and crisp apple strudels Doorbells sleighbells and schnitzel with noodles Wild geese that fly with the moon on their wings These are a few of my favorite things Girls in white dresses, with blue satin sashes Snowflakes that stay on my nose and eyelashes Silver white winters that melt into springs And then I don't feel so bad";
    //from Main.java
    String word = "things";
    System.out.println("\n\nNo of times " +word+ " appeared is :- " +countOccurences(str, word));
    int index = 201;
    int index1= 305;

		char ch = getCharFromString(str, index);
    char ch1 = getCharFromString(str, index1);
		System.out.println("\n\nThe character at location 201 is :- "+ ch +"\nThe character at location 305 is :- "+ch1);
    // ***************************************************************************************************

    //from charat.java
		String[] result = str.split(" ", 2);
		String first = result[0];
		int size = first.length();
		int bytesize = (Character.SIZE/8)*size;
		System.out.println("\n\nThe length of " + first + " is "+size+ " that is "+bytesize+ " Bytes");
    // ****************************************************************************************************

    //from location.java
    String subst = new String("dog");
		System.out.print("\n\nFound dog at : ");
		System.out.print(str.indexOf(subst));
    // *****************************************************************************************************

    //from replace.java
    System.out.println("\n\n After replacing 'strudels' with 'schnitzels'\n"+str.replaceFirst("strudels", "schnitzels"));
    // *****************************************************************************************************

    //from replacejava
    System.out.println("\n\n After replacing 'favorite' with 'java'\n"+str.replaceFirst("favorite", "java"));
    // *****************************************************************************************************

    //from substringloc.java
    System.out.print("\n\n Substrings between '50 and 70' are : ");
		System.out.println(str.substring(50, 70));
    // *****************************************************************************************************
}
}
