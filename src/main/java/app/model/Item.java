package app.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Item extends IdentifiableObject {


    private String name;
    private Date lastModification;
    @ManyToOne
    private User nameOfLastUser;

    public Item() {
        super();
    }

    public Item(String name, Date lastModification, User nameOfLastUser) {
        super();
        this.name = name;
        this.lastModification = lastModification;
        this.nameOfLastUser = nameOfLastUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastModification() {
        return lastModification;
    }

    public void setLastModification(Date lastModification) {
        this.lastModification = lastModification;
    }

    public User getNameOfLastUser() {
        return nameOfLastUser;
    }

    public void setNameOfLastUser(User nameOfLastUser) {
        this.nameOfLastUser = nameOfLastUser;
    }
}
