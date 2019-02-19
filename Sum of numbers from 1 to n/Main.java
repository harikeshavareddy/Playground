import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
            Scanner hari = new Scanner(System.in);
      int n = hari.nextInt();
      int sum=0;
      for(int i=1;i<=n;i++)
      {
        sum=sum+i;
          
      }
      System.out.println(sum);
	}
}