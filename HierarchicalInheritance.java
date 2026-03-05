import java.util.Scanner;
class Publisher{
String publisherName;
public Publisher(String publisherName){
this.publisherName=publisherName;
}
public void display(){
System.out.println("PUBLISHERNAME:"+publisherName);
}
}
class Book extends Publisher{
String bookName;
String author;
double price;
public Book(String publisherName, String bookName, String author,
double price){
super(publisherName);
this.bookName=bookName;
this.author=author;
this.price=price;
}
public void display(){
super.display();
System.out.println("BOOK NAME:"+bookName);
System.out.println("AUTHOR:"+author);
System.out.println("PRICE:"+price);
}
}
class Literature extends Book{
String type;
public Literature(String publisherName, String bookName, String author,
double price, String type) {
super(publisherName,bookName,author,price);
this.type=type;
}
public void display(){
super.display();
System.out.println("LITERATURE"+type);
System.out.println("--------------------");
}
}
class Fiction extends Book{
String genre;
public Fiction(String publisherName, String bookName, String author,
double price, String genre) {
super(publisherName,bookName,author,price);
this.genre=genre;
}
public void display(){
super.display();
System.out.println("FICTION:"+genre);
System.out.println("-----------------------------------");
}
}
public class HierarchicalInheritance{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.print("Enter total number of books: ");
int n = sc.nextInt();
Book[] newB=new Book[n];
for (int i = 0; i < n; i++) {
System.out.println("\n--- Enter Details for Book " + (i + 1) +" ---");
System.out.print("Select Category (1 for Literature, 2 for Fiction): ");
int choice = sc.nextInt();
sc.nextLine();
System.out.print("Publisher Name:");
String pubName=sc.nextLine();
System.out.print("Book Name:");
String bName = sc.nextLine();
System.out.print("Author: ");
String author = sc.nextLine();
System.out.print("Price: ");
double price = sc.nextDouble();
sc.nextLine();
if (choice == 1) {
System.out.print("Literature Type: ");
String type = sc.nextLine();
newB[i]=new Literature(pubName,bName,author,price,type);
}
else if (choice==2){
System.out.print("Fiction genre:");
String genre = sc.nextLine();
newB[i] =new Fiction(pubName, bName, author, price,genre);
}
else {
System.out.println("Invalid choice.");
}
}
System.out.println("\n--- Display Books by Category ---");
System.out.print("Enter category to display (1 for Literature, 2 for Fiction): ");
int searchChoice = sc.nextInt();
boolean found = false;

for(int i = 0; i < n; i++){
    if(searchChoice == 1 && newB[i] instanceof Literature){
        newB[i].display();
        found = true;
    }
    else if(searchChoice == 2 && newB[i] instanceof Fiction){
        newB[i].display();
        found = true;
    }
}
if (!found) {
System.out.println("No books found in the selected category.");
}
}
}






