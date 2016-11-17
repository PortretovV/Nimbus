package entity;

import java.util.HashSet;
import java.util.Set;

public class VirtualServer {
    private int id;
    private String nameVM;
    private String IP;
    private String Mask;
    private int port;
    private Set<PhysicalServer> physicalServers = new HashSet<PhysicalServer>();


    public VirtualServer() {}

    public VirtualServer(int id, String nameVM, String IP, String mask, int port, Set<PhysicalServer> physicalServers) {
        this.id = id;
        this.nameVM = nameVM;
        this.IP = IP;
        Mask = mask;
        this.port = port;
        this.physicalServers = physicalServers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameVM() {
        return nameVM;
    }

    public void setNameVM(String nameVM) {
        this.nameVM = nameVM;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMask() {
        return Mask;
    }

    public void setMask(String mask) {
        Mask = mask;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Set<PhysicalServer> getPhysicalServers() {
        return physicalServers;
    }

    public void setPhysicalServers(Set<PhysicalServer> physicalServers) {
        this.physicalServers = physicalServers;
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
