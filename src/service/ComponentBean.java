package service;

import entity.Component;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean(name = "ComponentBean")
public class ComponentBean implements Serializable{

    Component component = new Component();

    private void changeStatus(){}
    private void changeConfiguration(){}

}
