import java.util.Scanner;
class person {
String name;
String gender;
String address;
int age;
public person(String name,String gender,String address,int age){
this.name=name;
this.gender=gender;
this.address=address;
this.age=age;
}
public void display(){
System.out.println("Persons Name:"+name);
System.out.println("Persons gender:"+gender);
System.out.println("ADDress:"+address);
System.out.println("AGE:"+age);
}
}
class Employee extends person{
int empid;
String companyname;
String qualification;
double salary;
public Employee(String name,String gender,String address,int age,int empid,String companyname,String qualification,double salary){
super(name,gender,address,age);
this.empid=empid;
this.companyname=companyname;
this.qualification=qualification;
this.salary=salary;
}
public void display(){
super.display();
System.out.println("Empid"+empid);
System.out.println("company name:"+companyname);
System.out.println("qualification:"+qualification);
System.out.println("salary:"+salary);
}
}
class Teacher extends Employee{
String subject;
String department;
int teacherId;
public Teacher(String name,String gender,String address,int age,int empid,String companyname,String qualification,double salary,String subject,String department,int teacherId){
super(name,gender,address,age,empid,companyname,qualification,salary);
this.subject=subject;
this.department=department;
this.teacherId=teacherId;
}
public void display(){
super.display();
System.out.println("DEPARTMENT:"+subject);
System.out.println("DEPARTMENT:"+department);
System.out.println("TEACHER ID:"+teacherId);
System.out.println("----------------------------------");
}
}
public class MultilevelInheritance{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of Teachers(N) :");
int n=sc.nextInt();
Teacher[] newT= new Teacher[n];
for(int i=0;i<n;i++){
System.out.println("\n---Enter Details for Teacher"+ (i+1)+"---");
sc.nextLine();
System.out.println("NAME: ");
String name=sc.nextLine();
System.out.println("GENDER: ");
String gender=sc.nextLine();
System.out.println("Address: ");
String address=sc.nextLine();
System.out.println("AGE: ");
int age=sc.nextInt();
System.out.println("Employee Id: ");
int empid=sc.nextInt();
sc.nextLine();
System.out.print("Company name:");
String companyname=sc.nextLine();
System.out.print("Qualification:");
String qualification = sc.nextLine();
System.out.print("Salary: ");
double salary = sc.nextDouble();
sc.nextLine();
System.out.print("Teacher Id:");
int teacherId = sc.nextInt();
sc.nextLine();
System.out.print("Subject: ");
String subject = sc.nextLine();
System.out.print("Department: ");
String department = sc.nextLine();
newT[i]=new Teacher(name,gender,address,age,empid,companyname,qualification,salary,subject,department,teacherId);
}
System.out.println("\n========================================");
System.out.println(" TEACHER RECORDS");
System.out.println("======================================");
for(int i=0;i<n;i++){
newT[i].display();
  }
}
}

  
