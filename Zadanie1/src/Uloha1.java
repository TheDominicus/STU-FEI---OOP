public class Uloha1 {
    public static void main(String[] args) {
        int x = 100;
        double y = 2.0;
        double result;

        result = equation1(x, y);
        reportResult(result);

        result = equation2(x, y);
        reportResult(result);
    }
    public static double equation1(int a, double b){
        return a-b/(a+b);
    }

    public static double equation2(int a, double b){
        return a-b/a+b;
    }

    public static void reportResult(double res){
        System.out.println("Hodnota premennej res: ");
        System.out.println(res);
    }
}