import java.util.*;

public class pattern {

    // public static void main(String args[]) {
    // int n = 5;

    // for(int i=1; i<=n; i++){
    // for(int j=1; j<=i; j++){
    // int sum = i+j;
    // if()
    // }
    // }
    // }

    int n=5;

    for(
    int i = 1;i<=n;i++)
    {
        for (int j = 1; j <= i; j++) {
            int sum = i + j;
            if (sum % 2 == 0) {
                System.out.println(" 1");

            } else {
                System.out.println(" 0");
            }
        }

        System.out.println();

    }

}
