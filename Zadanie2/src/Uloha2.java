import java.util.Arrays;

public class Uloha2 {
    static final int CAPACITY = 10;
    void printArrays(int[] n, String[] s) {
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(s) + "\n");
    }

    void initArrays(int[] n, String[] s){
        for (int i = 0; i < n.length; i++){
            n[i] = i+1;
            s[i] = "*";
        }
    }

    void changeOdd(int[] n, String[] s){
        for (int i = 0; i < n.length; i++){
            if ((n[i] % 2 == 1) && (n[i] > 5)){
                s[i] = "odd";
            }
        }
    }

    void changeEven(int[] n, String[] s) {
        for (int i = 0; i < n.length; i++) {
            if ((n[i] % 2 == 1) && (n[i] < 5)) {
                s[i] = "even";
            }
        }
    }

    int sum(String[] in, StringBuilder out) {
        int count = 0;

        for (int i = 0; i < in.length; i++) {
            if (in[i] == "odd") {
                count++;
                out.append("+1");
            }

            else if (in[i] == "even") {
                count += 2;
                out.append("+2");
            }

            else{
                count--;
                out.append("-1");
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Uloha2 object = new Uloha2();

        int[] n = new int[CAPACITY];
        String[] s= new String[CAPACITY];

        object.printArrays(n, s);
        object.initArrays(n, s);
        object.printArrays(n, s);
        object.changeOdd(n, s);
        object.changeEven(n, s);
        object.printArrays(n, s);

        StringBuilder sb = new StringBuilder();

        System.out.println("Final count (sum): " + object.sum(s , sb));
        System.out.println("Final String: " + sb);
    }
}