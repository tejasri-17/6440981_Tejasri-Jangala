import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder reversed = new StringBuilder(input).reverse();
        System.out.println("Reversed string: " + reversed);
    }
}
