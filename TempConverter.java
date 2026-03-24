import java.util.Scanner;
public class TempConverter{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
while(true){
System.out.println("1:Celsius to Fahrenheit !\n");
System.out.println("2:Fahrenheit to Celsius !\n");
System.out.println("3:Exit\n");
System.out.print("Enter your Choice :");
int choice=sc.nextInt();
sc.nextLine();
if(choice==3){
System.out.println("===Exiting program===");
break;
}
System.out.print("Enter the temperature to convert:");
String userIn=sc.nextLine();
try{
double temperature=Double.parseDouble(userIn);
double convertedTemp;
switch(choice){
case 1:
convertedTemp=(temperature * 9/5)+32;
System.out.println(temperature + " C is equal to " + convertedTemp + " F");
break;
case 2:
convertedTemp=(temperature - 32)* 5/9;
System.out.println(temperature + " F is equal to " + convertedTemp + " C");
break;
default:
System.out.println("Error: Invalid menu selection.");
break;
}
}
catch(NumberFormatException e){
System.out.println("Error: Invalid input. You must enter a numerical value.");

}
}
sc.close();
}}
