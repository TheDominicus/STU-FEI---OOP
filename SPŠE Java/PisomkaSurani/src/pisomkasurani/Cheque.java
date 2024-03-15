package pisomkasurani;

/**
 *
 * @author Dominik Šuráni
 */
public class Cheque extends Payment{
    private int ChequeNo;
    private String ChequeType;

    public Cheque(int ID, int Ammount) {
        super(ID, Ammount);
    }

    Cheque() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getChequeNo() {
        return ChequeNo;
    }

    public void setChequeNo(int ChequeNo) {
        this.ChequeNo = ChequeNo;
    }

    public String getChequeType() {
        return ChequeType;
    }

    public void setChequeType(String ChequeType) {
        this.ChequeType = ChequeType;
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
}
