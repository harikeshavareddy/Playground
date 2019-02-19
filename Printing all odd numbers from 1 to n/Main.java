import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner hari = new Scanner(System.in);
      int n = hari.nextInt();
      for(int i=1;i<=n;i++)
      {
        if(i%2==1)
          System.out.println(i);
      }
	}
}