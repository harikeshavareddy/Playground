import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp=n;
      int r,f=0;
      while(n>0)
      {
        r=n%10;
        n=n/10;
        f=r;
      }
      int l=temp%10;
      int sum=f+l;
      System.out.println(sum);
	}
}