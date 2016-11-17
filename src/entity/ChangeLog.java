package entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ChangeLog {
    private int id;
    private String change;
    private Date date;
    private Set<InformationSystem> informationSystems = new HashSet<InformationSystem>();
    private Set<Developer> author = new HashSet<Developer>();
    private Set<Component> components = new HashSet<Component>();

    public ChangeLog() {
    }

    public ChangeLog(int id, String change, Date date, Set<InformationSystem> informationSystems, Set<Developer> author, Set<Component> components) {
        this.id = id;
        this.change = change;
        this.date = date;
        this.informationSystems = informationSystems;
        this.author = author;
        this.components = components;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<InformationSystem> getInformationSystems() {
        return informationSystems;
    }

    public void setInformationSystems(Set<InformationSystem> informationSystems) {
        this.informationSystems = informationSystems;
    }

    public Set<Developer> getAuthor() {
        return author;
    }

    public void setAuthor(Set<Developer> author) {
        this.author = author;
    }

    public Set<Component> getComponents() {
        return components;
    }

    public void setComponents(Set<Component> components) {
        this.components = components;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
