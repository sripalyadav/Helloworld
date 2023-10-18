import java.util.*;

public class Calculator{

public static void main(String[]args){


int fstval,sndval,ans;

char operator;


Scanner scan= new Scanner(System.in);


System.out.print("Enter First Value :");

fstval=scan.nextInt();


System.out.print("Enter second value:");

sndval=scan.nextInt();

System.out.print("choose Operator(+,-,*,/) :");

operator=scan.next().charAt(0);


switch(operator){

case '+': 
ans=fstval+sndval;

System.out.println(fstval+"+"+sndval+"="+ans);

break;

case '-': 
ans=fstval-sndval;

System.out.println(fstval+"-"+sndval+"="+ans);

break;

case '*': 
ans=fstval*sndval;

System.out.println(fstval+"*"+sndval+"="+ans);

break;

case '/': 
ans=fstval/sndval;

System.out.println(fstval+"/"+sndval+"="+ans);

break;

default:

System.out.println("Invalid Operator");

break;



}


}


}