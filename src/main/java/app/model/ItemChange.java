package app.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class ItemChange extends IdentifiableObject {
    private Date dateOfModification;

    @ManyToOne
    private Item nameOfItemModified;

    @OneToOne
    private User previousBuyer;

    @OneToOne
    private User currentBuyer;

    public ItemChange() {

    }

    public ItemChange(Date dateOfModification, Item nameOfItemModified, User previousBuyer, User currentBuyer) {
        super();
        this.dateOfModification = dateOfModification;
        this.nameOfItemModified = nameOfItemModified;
        this.previousBuyer = previousBuyer;
        this.currentBuyer = currentBuyer;
    }

    public Date getDateOfModification() {
        return dateOfModification;
    }

    public Item getNameOfItemModified() {
        return nameOfItemModified;
    }

    public User getPreviousBuyer() {
        return previousBuyer;
    }

    public User getCurrentBuyer() {
        return currentBuyer;
    }
}

