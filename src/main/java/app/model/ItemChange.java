package app.model;

import java.util.Date;

public class ItemChange {
    private Date dateOfModification;
    private String nameOfItemModified;
    private String previousBuyer;
    private String currentBuyer;

    public ItemChange(Date dateOfModification, String nameOfItemModified, String previousBuyer, String currentBuyer) {
        this.dateOfModification = dateOfModification;
        this.nameOfItemModified = nameOfItemModified;
        this.previousBuyer = previousBuyer;
        this.currentBuyer = currentBuyer;
    }

    public Date getDateOfModification() {
        return dateOfModification;
    }

    public String getNameOfItemModified() {
        return nameOfItemModified;
    }

    public String getPreviousBuyer() {
        return previousBuyer;
    }

    public String getCurrentBuyer() {
        return currentBuyer;
    }
}

