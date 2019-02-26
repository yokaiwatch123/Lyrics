public class replace {
public static void main(String args[]) {

	String Str = new String("Raindrops on roses and whiskers on kittens Bright cooper kettles and warm woolen mittens Brown paper packages tied up with strings These are a few of my favorite things Cream colored ponies and crisp apple strudels Doorbells sleighbells and schnitzel with noodles Wild geese that fly with the moon on their wings These are a few of my favorite things Girls in white dresses, with blue satin sashes Snowflakes that stay on my nose and eyelashes Silver white winters that melt into springs And then I don't feel so bad");
	// Replacing 1st occurrence of strudels with schnitzels
	System.out.println(Str.replaceFirst("strudels", "schnitzels"));
}
}
