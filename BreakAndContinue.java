public class BreakAndContinue {
    public static void main(String[] args) {
//        for(int i=0;i<5;i++){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==3){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
        int i;
        for (i=0;i<5;i++){
            if (i==2){
                System.out.println("Continue the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
            i++;
        }
    }
}
