package entity;

public class PhysicalServer {
    private int id;
    private int HDD;
    private int RAM;
    private Status status;
    private String processorName;
    private String IP;
    private String MAC;

    public PhysicalServer() {
    }

    public PhysicalServer(int id, int HDD, int RAM, Status status, String processorName, String IP, String MAC) {
        this.id = id;
        this.HDD = HDD;
        this.RAM = RAM;
        this.status = status;
        this.processorName = processorName;
        this.IP = IP;
        this.MAC = MAC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMAC() {
        return MAC;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
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
