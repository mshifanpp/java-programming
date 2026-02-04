import java.util.Scanner;
class Product {
//Data members
int pcode;
String pname;
double price;
//1.Defult constructer
Product() {

pcode=0;
pname="unknown";
price=0;
}
//2. Parameteraized Constructer
Product(int c,String n,double p){
pcode=c;
pname=n;
price=p;
}
//method to display detailes
void display ()
{
System.out.println(pcode+"\t"+pname+"\t"+price);
}
}
public class ProductMain{
public static void main (String[] args){
Scanner sc=new Scanner(System.in);
//---creating three objects
// Object 1: Hardcoded (Parameterized)
Product p1= new Product(101,"Laptop",45000.00);
// Object 2: User Input (Parameterized)
System.out.println("Eneter details for product 2:");
System.out.print("Product code:");
int c2=sc.nextInt();
sc.nextLine();
System.out.print("Product name:");
String n2=sc.nextLine();
System.out.print("Price:");
double pr2=sc.nextDouble();
Product p2= new Product (c2,n2,pr2);
// Object 3: User Input (Default Constructor)
System.out.println("Enter details for Product 3:");
Product p3 = new Product();
System.out.print("Product Code: ");
p3.pcode = sc.nextInt();
sc.nextLine();
System.out.print("Product Name: ");
p3.pname = sc.nextLine();
System.out.print("Price: ");
p3.price = sc.nextDouble();
// --- Comparison Logic ---
System.out.println("\n--- Product with Lowest Price ---");
Product low = p1; // Assume p1 is lowest
if (p2.price < low.price) {
low = p2;
}
if (p3.price < low.price) {
low = p3;
 }
System.out.println("Code\tName\tPrice");
low.display();
}
}
