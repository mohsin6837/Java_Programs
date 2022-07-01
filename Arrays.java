public class Arrays {
    public static void main(String[] args) {
//        float[] marks={80.5f,67.5f,78.5f,90,45.5f};
//        System.out.println(marks.length);
//        String[] students={"Aaqib","Sarwar","Shahid","Mohsin","Abid"};
//        System.out.println(students.length);
//        System.out.println(students[2]);
        int[] marks={98,78,48,72,94};
        for (int i=0;i< marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        for (int element:marks){
            System.out.println(element);
        }
    }
}
