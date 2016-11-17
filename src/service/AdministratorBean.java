package service;

import entity.Administrator;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "AdministratorBean")
public class AdministratorBean {
    Administrator administrator = new Administrator();

    private void distributeComponents(){}
    private void addInformationSystem(){}
    private void addDev(){}
    private void changeAccessRights(){}
    private void deleteDev(){}
    private void deleteInformationSystem(){}
}

