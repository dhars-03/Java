import java.util.Scanner;
class Prob2 {
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Side1:");
        int a=obj.nextInt();
        System.out.println("Side2:");
        int b=obj.nextInt();
        System.out.println("Side3:");
        int c=obj.nextInt();
        if(a+b+c==180)
        System.out.println("Triangle can be formed");
        else
        System.out.println("Triangle cannot be formed");
                
            }
        }
