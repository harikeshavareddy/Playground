import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,r,p,f=0;
      p=n;
      
      while(n>0)
      {
        r=n%10;
        int s=1;
        for(i=1;i<=r;i++)
        {
          s=s*i;
        }
        f=f+s;
        n=n/10;
	}
      if(p==f)
      System.out.println("Yes");
      else
        System.out.println("No");
    }
}