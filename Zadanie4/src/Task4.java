public class Task4 {

    public static void change(int[] arr) {
        if (arr.length > 0) {
            arr[1] = 42;
        }
    }

    public static void change(String s) {
        s = "hello";
    }

    public static void main(String[] args) {
        int[] a = {0,1,2,3};
        String str = "jello";

        System.out.println("Obsah pola !a! pred zmenou");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + ", ");
        }

        change(a);
        System.out.println("\nObsah pola !a! po zmene");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + ", ");
        }

        change(str);
        System.out.println("\nRetazec str: " + str);
    }
}