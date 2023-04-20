package aufgabenblatt7.aufgabe24;

import java.util.Date;

public class Rabattmarke implements java.io.Serializable{
    private int number;
    private String ownerName;
    private int ownerNumber;

    public int getOwnerNumber() {
        return ownerNumber;
    }

    private int discountValue;
    private Date createdDate;

    public Rabattmarke(int number, String ownerName, int ownerNumber, int discountValue) {
        this.number = number;
        this.ownerName = ownerName;
        this.ownerNumber = ownerNumber;
        this.discountValue = discountValue;
        this.createdDate = new Date();
    }

    @Override
    public String toString() {
        return "Rabattmarke [createdDate=" + createdDate + ", discountValue=" + discountValue + ", number=" + number
                + ", ownerName=" + ownerName + ", ownerNumber=" + ownerNumber + "]";
    }
}
