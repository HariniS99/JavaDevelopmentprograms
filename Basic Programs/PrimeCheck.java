import java.util.*;
class PrimeCheck
{
   public static void main(String args[])
   {		
	int temp,num,i;
	boolean isPrime=true;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter any number:");
	//capture the input in an integer
	num=s.nextInt();
        
	for(i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}