import java.util.Scanner;
class Employee{
//define attributes
int eNo;
String eName;
double eSalary;
public Employee(int no,String name,double salary)
{
 eNo=no;
 eName=name;
 eSalary=salary;
 }
 public void display(){
 System.out.println("Employee number:"+eNo);
 System.out.println("Employee NAME:"+eName);
 System.out.println("Employee SALARY:"+eSalary);
 System.out.println("-------------------");
 }
 }
 public class Employeesearch{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.print("enter number of employees (N):");
 int n =sc.nextInt();
 Employee [] emp = new Employee[n];
 System.out.println("\n--- Enter Employee Details ---");
 for(int i=0;i<n;i++)
 {
 System.out.println("Employee"+(i+1)+":");
 System.out.print("Enter eNo:");
 
 int eNo =sc.nextInt();
 sc.nextLine();
 System.out.print("Enter eName:");
 String eName=sc.nextLine();
 System.out.print("Enter salary:");
 double eSalary=sc.nextDouble();
 emp[i]=new Employee(eNo,eName,eSalary);
 System.out.println();
 }
 System.out.println("Enter employee Number to search: ");
int searchId = sc.nextInt();
System.out.println("\n----Search Results----- ");
boolean found = false;
for (int i = 0; i < n; i++){
if(emp[i].eNo == searchId){
System.out.println("\n Employee found");
emp[i].display();
found = true;
break;
}}
if (!found) {
    System.out.println("\nEmployee not found.");
}

}}
 

