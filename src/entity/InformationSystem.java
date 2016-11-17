package entity;

public class InformationSystem {
    private int id;
    private int SuperSystem;
    private String name;
    private Status status;

    public InformationSystem() {}

    public InformationSystem(int id, int superSystem, String name, Status status) {
        this.id = id;
        SuperSystem = superSystem;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSuperSystem() {
        return SuperSystem;
    }

    public void setSuperSystem(int superSystem) {
        SuperSystem = superSystem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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
