public class Main {
    public static void main(String[] args) {
        //Task #1
        int[] arrT1 = new int[] {1, 2, 3};
        double[] arrT2 = new double[] {1.57, 7.654, 9.986};
        int[] arrT3 = {35, 24, 346, 25, 678, 6546, 323, 68, 47, 567, 976, 6};
        //Task #2
        for(int index = 0; index < arrT1.length; index++ ) {
            if (index == arrT1.length - 1) {
                System.out.println(arrT1[index]);
                break;
            }
            System.out.print(arrT1[index] + ", ");}
        for(int index = 0; index < arrT2.length; index++ ) {
                if (index == arrT1.length - 1) {
                    System.out.println(arrT2[index]);
                    break;
                }
                System.out.print(arrT2[index] + ", ");
        }
        for(int index = 0; index < arrT3.length; index++ ) {
                if (index == arrT3.length - 1) {
                    System.out.println(arrT3[index]);
                    break;
                }
                System.out.print(arrT3[index] + ", ");
        }
    }
}