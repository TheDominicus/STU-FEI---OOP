package geometric;

public class Svg {

    public static void write(String fileName, AbstractShape[] shapes){
        System.out.println("<svg version=\"1.1\" width=\"500\" height=\"400\" xmlns=\"http://www.w3.org/2000/svg\"");

        for(AbstractShape s: shapes){
            System.out.println(s.toString());
        }
    }


}
