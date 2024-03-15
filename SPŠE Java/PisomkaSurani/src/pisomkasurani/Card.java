package pisomkasurani;

/**
 *
 * @author Dominik Šuráni
 */
public class Card extends Payment{
    private int CardNo;
    private String Card_type;

    public Card(int ID, int Ammount) {
        super(ID, Ammount);
    }

    Card() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCardNo() {
        return CardNo;
    }

    public void setCardNo(int CardNo) {
        this.CardNo = CardNo;
    }

    public String getCard_type() {
        return Card_type;
    }

    public void setCard_type(String Card_type) {
        this.Card_type = Card_type;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAmmount() {
        return Ammount;
    }

    public void setAmmount(int Ammount) {
        this.Ammount = Ammount;
    }

    void setCardNo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setCardType(String visa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}