package service;

import entity.Developer;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean(name = "DeveloperBean")
public class DeveloperBean implements Serializable {

    Developer developer = new Developer();

    private void viewStatusInformationSystem(){}
    private void testStatusComponent(){}
    private void testInformationSystem(){}
    private void viewStatusComponent(){}
    private void viewChangeLog(){}
}
