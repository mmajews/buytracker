package app.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Item {

    @Id
    private String name;
    private Date lastModification;
    private String nameOfLastUser;

    public Item() {

    }

    public Item(String name, Date lastModification, String nameOfLastUser) {
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

    public String getNameOfLastUser() {
        return nameOfLastUser;
    }

    public void setNameOfLastUser(String nameOfLastUser) {
        this.nameOfLastUser = nameOfLastUser;
    }
}
