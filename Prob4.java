*******************************************************************************/
import java.util.Scanner;
class Prob4 {
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Size:");
        int size=obj.nextInt();
        switch(size){
            case 29:
                System.out.println("Small");
                break;
            case 30:
                System.out.println("Medium");
                break;
            case 38:
                System.out.println("Large");
                break;
            case 42:
                System.out.println("XLarge");
                break;
            default:
                System.out.println("Invalid");
                break;
        }     
            }
        }
