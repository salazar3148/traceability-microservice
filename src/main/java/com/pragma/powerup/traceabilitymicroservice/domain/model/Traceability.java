package com.pragma.powerup.traceabilitymicroservice.domain.model;

import java.time.LocalDateTime;

public class Traceability {
    private Long orderId;
    private Long customerId;
    private String customerMail;
    private LocalDateTime date;
    private String oldStatus;
    private String newStatus;
    private Long employeeId;
    private String employeeMail;

    public Traceability() {
    }

    public Traceability(Long orderId, Long customerId, String customerMail, LocalDateTime date, String oldStatus, String newStatus, Long employeeId, String employeeMail) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.customerMail = customerMail;
        this.date = date;
        this.oldStatus = oldStatus;
        this.newStatus = newStatus;
        this.employeeId = employeeId;
        this.employeeMail = employeeMail;
    }
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getOldStatus() {
        return oldStatus;
    }

    public void setOldStatus(String oldStatus) {
        this.oldStatus = oldStatus;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeMail() {
        return employeeMail;
    }

    public void setEmployeeMail(String employeeMail) {
        this.employeeMail = employeeMail;
    }
}
