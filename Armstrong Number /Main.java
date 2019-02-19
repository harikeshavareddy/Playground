import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
        Scanner hari = new Scanner(System.in);
      int n=hari.nextInt();
      int c=1,r,i,s=0;
      int temp=n,num=n;
      while(n>0)
      {
        n=n/10;
        ++c;
      }
      while(temp>0)
      {
       r=temp%10;
        int p=1;
      for(i=1;i<c;i++)
      {
        p=p*r;
      }

      
   s=s+p;
        temp=temp/10;
      }
      if(num==s)
      System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
        
	}
}