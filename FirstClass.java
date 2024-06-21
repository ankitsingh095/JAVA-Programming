
// class FirstClass {
//     public static void main(String args[]) {
//         System.out.println("Hello World!");
//         System.out.print("HEllow JAva\n");
//         System.out.println("ANkit");
//     }
// }

// import java.util.*;

// class FirstClass {
//     public static void main(String args[]) {
//         int i = 0;
//         for (int i = 1; i <= 4; i++) {
//             System.out.println(int i * "*");
//         }
//     }
// }
// class FirstClass {
//     public static void main(String args[]) {
//         int a = 10;
//         int b = 3;
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }

// import java.util.*;

// public class FirstClass {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();
//         System.out.println(name);
//     }
// }
// import java.util.*;

// public class FirstClass {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }

// import java.util.*;

// class FirstClass {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int numb = sc.nextInt();
//         if (num > numb) {
//             System.out.println("A is greater");
//         } else if (num == numb) {
//             System.out.println("Equal");
//         } else {
//             System.out.println("B is greater");
//         }

//     }
// }

// import java.util.*;

// class FirstClass {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         switch (num) {
//             case 1:
//                 System.out.println("Hello");
//                 break;
//             case 2:
//                 System.out.println("Namestey");
//                 break;
//             case 3:
//                 System.out.println("Bonjour");
//                 break;
//             default:
//                 System.out.println("Invalid Button");

//         }
//     }
// }

// import java.util.*;

// public class FirstClass {
//     public static void main(String args[]) {
// // int i == 1;
// for (int i = 1; i <= 3; i++) {
// System.out.println("Hello");
// }
// for (int i = 0; i <= 10; i++) {
// System.out.println(i + 1);
// }
// int i = 1;
// while (i < 11) {
// System.out.println(i + 1);
// i++;
// }
// int i = 1;
// do {
// System.out.println(i);
// i++;

// } while (i < 11);
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int sum = 0;
// for (int i = 0; i <= n; i++) {
//     sum = sum + i;

// }
// System.out.println(sum);

//     }
// }

// import java.util.*;

// // import javax.sql.rowset.spi.SyncResolver;

// public class FirstClass {
//     public static void main(String args[]) {
//         // Scanner sc = new Scanner(System.in){
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 4; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;

// public class FirstClass {
//     public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int m = sc.nextInt();
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= m; j++) {
// if (i == 1 || j == 1 || i == n || j == m) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int number = 1;
// for (int i = 1; i <= n; i++) {
//     for (int j = 1; j <= i; j++) {
//         System.out.print(number);
//         number++;

//     }
//     System.out.println();
// }
//     }
// }

// import java.util.*;

// public class FirstClass {
//     public static void printMyName(String name) {
//         System.out.println(name);
//         return;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         printMyName(name); // call kiya function ko
//     }
// }

// import java.util.*;

// public class FirstClass {
//     public static int calculateSum(int a, int b) {
//         int sum = a + b;
//         return sum;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int c = sc.nextInt();
//         int d = sc.nextInt();
//         int e = calculateSum(c, d);
//         System.out.println(e);

//     }
// }

import java.util.*;

public class FirstClass {
    public static void main(String args[]) {
        int[] my = new int[10];
        my[1] = 90;
        my[2] = 12;
        System.out.println(my[2]);
    }
}