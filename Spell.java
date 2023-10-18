import java.util.*;

public class Spell {

public static void main(String[]args){

Scanner scan=new Scanner(System.in);
System.out.println("Enter any Word :");
String str=scan.next();

for(int i=0; i<str.length(); i++){

if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){

System.out.println(str.charAt(i)+"vowels");

}else{

System.out.println(str.charAt(i)+"consonants");
}

}
  
}

}