public class Uloha3 {
    public static int[][] matrixMultiply (int[][] m1, int[][] m2) {
        if (m1[0].length == m2.length) {
            int[][] m3 = new int[m1.length][m2[0].length];

            for (int m1r = 0;  m1r < m1.length; m1r++) {
                for (int m2c = 0; m2c < m2[0].length; m2c++) {
                    for (int m1c = 0; m1c < m1[0].length; m1c++) {
                        m3[m1r][m2c] = m1[m1r][m1c] * m2[m1c][m2c];
                    }
                }
            }
            return m3;
        } else {
            return null;
        }
    }
    public static boolean identicalColumns (int[][] m, int c1, int c2) {
        for (int r = 0; r < m.length; r++) {
            if (m[r][c1] != m[r][c2]) {
                return false;
            }
        }
        return true;
    }
    public static String onlyUpper (String s) {
        StringBuilder up = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                up.append(s.charAt(i));
            }
        }
        return up.toString();
    }
    public static String encryptCaesar (String text, int k) {
        text = text.toUpperCase();

        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                newString.append((char) ((((text.charAt(i) - 'A') + k) % 26) + 'A'));
            } else {
                newString.append(text.charAt(i));
            }
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        int[][] m1 = {{2,4,6}, {1,3,5}, {7,8,9}};
        int[][] m2 = {{2,4,6,8}, {1,3,5,7}, {8,9,0,1}};
        int[][] m3 = matrixMultiply(m1, m2);

        System.out.println("M3 before:\n");
        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[0].length; j++){
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }

        int[][] m = {{1,0,0}, {0,1,0}, {0,0,1}};

        System.out.println("\nM3 now:\n" + identicalColumns(m, 1, 2) + "\n");
        System.out.println("OnlyUpper - arg z programu: " + onlyUpper("StuDenTi"));
        System.out.println("OnlyUpper - arg z cli: " + onlyUpper(args[0]) + "\n");
        System.out.println("Caesar: " + encryptCaesar("Dominik", -10));
    }
}