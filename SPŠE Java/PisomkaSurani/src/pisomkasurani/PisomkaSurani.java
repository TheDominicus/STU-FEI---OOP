package pisomkasurani;

/**
 *
 * @author Dominik Šuráni
 */
public class PisomkaSurani {

    public static void main(String[] args) {
        Payment A = new Payment();
        
        A.setAmmount(2);
        A.setID(2746);
        A.setCardNo(1265542);
        A.setCardType("VISA");
        
        System.out.println("ID používateľa A je "+A.getID());/*
        System.out.println("Ammount používateľa A je "+A.getID());
        System.out.println("CardNO používateľa A je "+A.getCardNO());
        System.out.println("CardType používateľa A je "+A.getCardType());*/
    }
}
