package com.oocl.packagebooking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CargoPackage {

    @Id
    private Long packageNumber;

    private String customerName;

    @Column(unique = true)
    private Long tel;

    private String state;

    private String appointmentTime;

    public CargoPackage() {
    }

    public CargoPackage(Long packageNumber, String customerName, Long tel, String state, String appointmentTime) {
        this.packageNumber = packageNumber;
        this.customerName = customerName;
        this.tel = tel;
        this.state = state;
        this.appointmentTime = appointmentTime;
    }


    public CargoPackage(Long packageNumber, String customerName, Long tel, String state) {
        this.packageNumber = packageNumber;
        this.customerName = customerName;
        this.tel = tel;
        this.state = state;
    }

    public Long getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(Long packageNumber) {
        this.packageNumber = packageNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
}