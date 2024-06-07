import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of stairs :");
        int numberStairs = scanner.nextInt();
        int i;
        int j;
        if (numberStairs > 0) {
            for(i = numberStairs; i > 0; --i) {
                for(j = 0; j < i; ++j) {
                    if (j == i - 1) {
                        System.out.println("_|");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
        } else if (numberStairs < 0) {
            for(i = 1; i <= -numberStairs; ++i) {
                for(j = 0; j < i; ++j) {
                    if (j == i - 1) {
                        System.out.println("|_");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
        } else {
            System.out.println("__");
        }

    }
}
