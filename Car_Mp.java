import java.util.Scanner;

public class Car_Mp {
    static float pow(float a, float b){
        float pow=1;
        for (int i=1;i<=b;i++){
            pow*=a;
        }
        return pow;
    }
    public static void main(String[] args) {
        float pp,dp,ar,mp,P,i,n;
        System.out.println("Enter the purchase price of the car");
        Scanner sc=new Scanner(System.in);
        pp=sc.nextFloat();
        System.out.println("Enter the down payment you have saved for the car");
        dp= sc.nextFloat();
        System.out.println(" Enter the annual rate of interest of the car ");
        ar=sc.nextFloat();
        System.out.println("Enter the no of payments (usually 36,48 or 60)");
        n= sc.nextFloat();
        P=pp-dp;
        i=ar/12;
        mp=i*P/(1-(1/pow(1+i,n)));
        System.out.printf("Monthly payment of car=Rs.%.2f",mp);
    }
}
