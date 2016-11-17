package entity;

public class Developer {
    private int id;
    private String firstname;
    private String lasrtname;
    private String middleName;
    private String officialPosition;
    private int accessRights;

    public Developer() {

    }

    public Developer(int id, String firstname, String lasrtname, String middleName, String officialPosition, int accessRights) {
        this.id = id;
        this.firstname = firstname;
        this.lasrtname = lasrtname;
        this.middleName = middleName;
        this.officialPosition = officialPosition;
        this.accessRights = accessRights;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLasrtname() {
        return lasrtname;
    }

    public void setLasrtname(String lasrtname) {
        this.lasrtname = lasrtname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getOfficialPosition() {
        return officialPosition;
    }

    public void setOfficialPosition(String officialPosition) {
        this.officialPosition = officialPosition;
    }

    public int getAccessRights() {
        return accessRights;
    }

    public void setAccessRights(int accessRights) {
        this.accessRights = accessRights;
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
