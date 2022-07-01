import java.util.Scanner;

public class Car_Mp {
    static float pow(float j,int n){
        float pow=1;
        for (j=1;j<=n;j++){
            pow*=j;
        }
        return pow;
    }
    public static void main(String[] args) {
        float pp,dp,ar;
        int n;
        System.out.println("Enter the purchase price,down payment,annual interest rate and no. of payments(which is 36,48 or 60)");
        Scanner sc=new Scanner(System.in);
        pp=sc.nextFloat();
        dp=sc.nextFloat();
        ar=sc.nextFloat();
        n= sc.nextInt();
        float P=pp-dp,i=ar/12;
        float mp=i*P/(1-(1/pow(1+i,n)));
        System.out.println("Monthly payment of car is " + mp);
    }
}
