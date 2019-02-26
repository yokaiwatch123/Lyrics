class charat {

	public static char
	getCharFromString(String str, int index)
	{
		return str.charAt(index);
	}
	public static void main(String[] args)
	{

		String str = "Raindrops on roses and whiskers on kittens Bright cooper kettles and warm woolen mittens Brown paper packages tied up with strings These are a few of my favorite things Cream colored ponies and crisp apple strudels Doorbells sleighbells and schnitzel with noodles Wild geese that fly with the moon on their wings These are a few of my favorite things Girls in white dresses, with blue satin sashes Snowflakes that stay on my nose and eyelashes Silver white winters that melt into springs And then I don't feel so bad";

		int index = 201;
    int index1= 305;

		char ch = getCharFromString(str, index);
    char ch1 = getCharFromString(str, index1);

		System.out.println("The character at location 201 is :- "+ ch +"\nand at location 305 it's :- "+ch1);

		String[] result = str.split(" ", 2);
		String first = result[0];
		int size = first.length();
		int bytesize = (Character.SIZE/8)*size;
		System.out.println("the length of " + first + " is "+size+ " That is "+bytesize+ "bytes");
	}
}
