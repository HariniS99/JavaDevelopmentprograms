
class Depart
{
int did;
String dname;
void fun()
{
did=10;
dname="sales";
}
}
class Emp extends Depart
{
int eid;
String ename;
double sal;
void accept()
{
 fun();

 eid=100;
ename="john";
sal=12000;
}
void disp()
{
System.out.println("deptid="+did);
System.out.println("deptname="+dname);
System.out.println("empid="+eid);
System.out.println("empname="+ename);
System.out.println("salary="+sal);
}
public static void main(String args[])
{
Emp eobj=new Emp();
eobj.accept();
eobj.disp();
}
}