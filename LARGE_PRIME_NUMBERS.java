import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;
 
public class Prime {
	
	public static void main(String[] args) {
		
		
		 	
System.out.println("CHECK FOR PRIME NUMBERS BETWEEN  THE NUMBERS A (ENTER A HERE): ");
Scanner sc=new Scanner(System.in);
int HK=sc.nextInt();
System.out.println("AND   B (ENTER B HERE): ");
int PK=sc.nextInt();
sc.close();
 for(int num=HK;num<PK;num++) {
boolean check = false;
for (int i = 2; i <= num / 2; ++i) {
  
  if (num % i == 0) {
   check = true;
    break;
  }
}

if (!check)
  System.out.println(num + " is a prime number.");
 
}
}
}
© 2021 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
