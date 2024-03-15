package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Dominik
 */
public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadajte vetu na preklad: ");
        String veta = sc.nextLine();
        String preklad = "";
        for (int i=0; i<veta.length(); i++) {
            char znak = Character.toLowerCase(veta.charAt(i));
            switch(znak){
                case ' ': preklad+=" ";
                    break;
                case 'a': preklad+=" .-";
                    break;
                case 'b': preklad+=" -...";
                    break;
                case 'c': preklad+=" -.-.";
                    break;
                case 'd': preklad+=" -..";
                    break;
                case 'e': preklad+=" .";
                    break;
                case 'f': preklad+=" ..-.";
                    break;
                case 'g': preklad+=" --.";
                    break;
                case 'h': preklad+=" ....";
                    break;
                /*case 'ch': preklad+=" ----";
                    break;*/
                case 'i': preklad+=" ..";
                    break;
                case 'j': preklad+=" .---";
                    break;
                case 'k': preklad+=" -.-";
                    break;
                case 'l': preklad+=" .-..";
                    break;
                case 'm': preklad+=" --";
                    break;
                case 'n': preklad+=" -.";
                    break;
                case 'o': preklad+=" ---";
                    break;
                case 'p': preklad+=" -..-";
                    break;
                case 'q': preklad+=" --.-";
                    break;
                case 'r': preklad+=" .-.";
                    break;
                case 's': preklad+=" ...";
                    break;
                case 't': preklad+=" -";
                    break;
                case 'u': preklad+=" ..-";
                    break;
                case 'v': preklad+=" ...-";
                    break;
                case 'w': preklad+=" .--";
                    break;
                case 'x': preklad+=" -..-";
                    break;
                case 'y': preklad+=" -.--";
                    break;
                case 'z': preklad+=" --..";
                    break;
                default: System.out.println("Takéto písmeno neexistuje");
                    break;
                }
        }
        System.out.println("Veta -> "+veta+" -> preložená do morzeovky je: "+preklad);
    }
}