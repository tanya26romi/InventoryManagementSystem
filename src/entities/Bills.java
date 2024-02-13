package entities;

import enums.PaymentMode;
import enums.Status;
import util.CommonUtil;

import java.time.LocalDateTime;

public class Bills {

    private String id;
    private double totalAmount;
    private double offerAppliedAmount;
    private double billAmount;
    private double paymentAmount;
    private String orderId;
    private PaymentMode mode;
    private Status status;
    private long employeeId;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Bills(double totalAmount, double billAmount, double paymentAmount, String orderId, PaymentMode mode, Status status) {
        this.id = CommonUtil.getUUID();
        this.totalAmount = totalAmount;
        this.billAmount = billAmount;
        this.paymentAmount = paymentAmount;
        this.orderId = orderId;
        this.mode = mode;
        this.status = status;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getOfferAppliedAmount() {
        return offerAppliedAmount;
    }

    public void setOfferAppliedAmount(double offerAppliedAmount) {
        this.offerAppliedAmount = offerAppliedAmount;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

}
