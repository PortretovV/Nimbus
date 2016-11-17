package service;

import entity.InformationSystem;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean(name = "InformationSystemBean")
public class InformationSystemBean implements Serializable{

    InformationSystem informationSystem = new InformationSystem();

    private void changeStatus(){}
}
