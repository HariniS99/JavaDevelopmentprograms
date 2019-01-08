import java.util.*;
class ListDemo
{
public static void main(String args[]){
ArrayList list1=new ArrayList();
list1.add("sunil");
list1.add("sudhir");
list1.add("tarun");
list1.add("nitin");

list1.add(100);
list1.add(200);

System.out.println("before iteration:"+list1);

Iterator itr=list1.iterator();
while(itr.hasNext())
{
Object element=itr.next();
if(element instanceof String)
{
String str=(String)element;
System.out.println("String object:"+str);
}
else if(element instanceof Integer)
{
Integer intr=(Integer)element;
System.out.println("Integer object:"+intr);
}
}
System.out.println("after iteration:"+list1);
}
}
