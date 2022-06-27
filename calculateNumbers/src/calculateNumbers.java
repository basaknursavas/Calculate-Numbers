import java.util.Scanner ;
public class calculateNumbers {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n, total = 0 ;

        do {
            System.out.print("Enter a number : ");
            n = inp.nextInt();
            if (n % 4 == 0){
                total += n ;
            }

        } while (n % 2 == 0);
        System.out.println("The total is : " + total);


    }
}
