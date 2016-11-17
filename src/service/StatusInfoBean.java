package service;

import entity.StatusInfo;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "StatusInfoBean")
public class StatusInfoBean {
    StatusInfo statusInfo = new StatusInfo();

    private void publish() {
    }
}
