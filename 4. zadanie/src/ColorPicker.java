import java.util.Random;

public class ColorPicker {
    public static void printColor(Color c){
        if (c == Color.RED) {
            System.out.println("Red");
        } else if (c == Color.GREEN) {
            System.out.println("Green");
        } else if (c == Color.BLUE) {
            System.out.println("Blue");
        }
    }

    public static Color pickRandomColor() {
        Random rand = new Random(System.currentTimeMillis());

        int num = rand.nextInt(3);

        return switch (num) {
            case 0 -> Color.RED;
            case 1 -> Color.GREEN;
            case 2 -> Color.BLUE;
            default -> null;
        };
    }

    public static void main(String[] args) {
        printColor(pickRandomColor());
    }
}
