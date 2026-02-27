import java.util.Scanner;
class Geometry{
//circle
double area(double r){
return Math.PI*r*r;
}
//rectangle
double area(double l,double b){
return l*b;
}
//triangle
double area(double a,double b,double c){
if((a+b<=c)||(b+c<=a)||(a+c<=b)){
System.out.println("Invalid triaangle diamensions!!");
return 0.0;
}
double s=(a+b+c)/2;
return Math.sqrt(s*(s-a)*(s-b)*(s-c));
}
}
public class MehodOverloadingDemo{
  public static void main(String[] args){
   Scanner input=new Scanner(System.in);
   Geometry object=new Geometry();
   System.out.println("---Method Overloading Area Calculation----\n");
   System.out.println("Enter radius of the Circle:");
   double r=input.nextDouble();
   System.out.println("Area of Circle : "+object.area(r));
   System.out.println("\nEnter Length and Breadth of the rectangle: ");
   double l=input.nextDouble();
   double b=input.nextDouble();
   System.out.println("Area of Rectangle : "+object.area(l,b));
   System.out.println("\n Enter three sides  of the triangle : ");
   double sa=input.nextDouble();
   double sb=input.nextDouble();
   double sc=input.nextDouble();
   System.out.println("Area of Triangle : "+object.area(sa,sb,sc));
   }}
   

