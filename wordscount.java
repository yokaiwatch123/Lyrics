public class wordscount { 

	static final int OUT = 0;
	static final int IN = 1;

	static int countWords(String str)
	{
		int state = OUT;
		int wc = 0;
		int i = 0;

		while (i < str.length())
		{

			if (str.charAt(i) == ' ' || str.charAt(i) == '\n'
					|| str.charAt(i) == '\t')
				state = OUT;
			else if (state == OUT)
			{
				state = IN;
				++wc;
			}

			++i;
		}
		return wc;
	}

	public static void main(String args[])
	{
		String str = "Raindrops on roses and whiskers on kittens Bright cooper kettles and warm woolen mittens Brown paper packages tied up with strings These are a few of my favorite things Cream colored ponies and crisp apple strudels Doorbells sleighbells and schnitzel with noodles Wild geese that fly with the moon on their wings These are a few of my favorite things Girls in white dresses, with blue satin sashes Snowflakes that stay on my nose and eyelashes Silver white winters that melt into springs And then I don't feel so bad";
		System.out.println("No of words : " + countWords(str));
	}
}
