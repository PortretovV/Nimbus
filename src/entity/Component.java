package entity;

import java.util.HashSet;
import java.util.Set;

public class Component {
    private int id;
    private String name;
    private Status status;
    private String version;
    private int load;
    private int port;
    private Set<InformationSystem> informationSystems = new HashSet<InformationSystem>();
    private Set<VirtualServer> virtualServers = new HashSet<VirtualServer>();

    public Component() {}

    public Component(int id, String name, Status status, String version, int load, int port, Set<InformationSystem> informationSystems, Set<VirtualServer> virtualServers) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.version = version;
        this.load = load;
        this.port = port;
        this.informationSystems = informationSystems;
        this.virtualServers = virtualServers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Set<InformationSystem> getInformationSystems() {
        return informationSystems;
    }

    public void setInformationSystems(Set<InformationSystem> informationSystems) {
        this.informationSystems = informationSystems;
    }

    public Set<VirtualServer> getVirtualServers() {
        return virtualServers;
    }

    public void setVirtualServers(Set<VirtualServer> virtualServers) {
        this.virtualServers = virtualServers;
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
