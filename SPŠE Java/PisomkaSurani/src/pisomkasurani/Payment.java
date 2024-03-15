package pisomkasurani;

/**
 *
 * @author Dominik Šuráni
 */
public class Payment{
    protected int ID;
    protected int Ammount;
    static int Pocet;
    
    public Payment(int ID, int Ammount) {
        this.ID = ID;
        this.Ammount = Ammount;
    }

    Payment() {
        this.ID = 5;
        this.Ammount = 10;
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

    void setCardNo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setCardType(String visa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getCardNO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getCardType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
