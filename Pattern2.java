import java.util.Scanner;
class Pattern2{
  public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        System.out.println(j);
      }
      System.out.println("");
    }
  }
}
