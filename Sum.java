import java.util.Scanner;

public class Sum {
    static int sum(int n){
        if (n==1){
            return 1;
        }
        else {
            return n+sum(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of natural no's you want to find the sum");
        int n=sc.nextInt();
        System.out.println("Sum of first "+n+" natural no.'s is "+sum(n));
    }
}
