public class Myfavthings2
{
private String str;
private int things ,i , max,count; 
//char th[] = new char [str.length()];
public Myfavthings2(){
str = " Raindrops on roses and whiskers on kittens Bright cooper kettles and warm woolen mittens Brown paper packages tied up with strings These are a few of my favorite things Cream colored ponies and crisp apple strudels Doorbells sleighbells and schnitzel with noodles Wild geese that fly with moon on their wings These with blue satin sashes Snowflakes that stay on my nose and eyelashes Silver white winters that melt into springs And then I don't feel so bad ";
things = 0;
i = 0 ;
//char th[] = new char [str.length()];
}
public void getWords(){ 
char th[] = new char [str.length()];
System.out.println ("My favorite things lyrics :" + str);
for (i = 0; i < str.length() - 1 ; i ++){
 th[i]= str.charAt(i);  
 if( ((i>0)&&(th[i]!=' ')&&(th[i-1]==' ')) || (th[0]!=' ')&&(i==0))   
 count++;  
}  
}   
public int getWordcount(){  
 System.out.println ("word count:"  + count );
 return count;
 //System.out.println ("word count:" + count );
}
}




// Main
public class Myfavthings
{
public static void main (String[]args){
Myfavthings2 lyrics = new Myfavthings2();

lyrics.getWords();
lyrics.getWordcount();





}
}
