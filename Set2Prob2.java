import java.util.Scanner;
public class Set2Prob2
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
      System.out.println("Enter x:")
	    int x=obj.nextInt();
	    for (int i=1; i<1000;i++){
	    System.out.println(i*x);
       if(x*i==1000)
        break;
	    }
	}
}
