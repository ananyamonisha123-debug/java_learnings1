import java.util.Scanner;

class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println(num + " is a positive number."); 
            }else if (num < 0) {
                System.out.println(num + " is a negative."); 
                }else {
                    System.out.println(num + " is zero.");
                }
                scanner.close();
            }
        
        }

   class Main  {
    public static void main(String[] args) {
        int[] numbers = {3, -1, 7, 0, 9};
        System.out.println(numbers[0]);
    }
   }     

    
