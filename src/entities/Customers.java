package entities;

import java.time.LocalDateTime;

public class Customers {
    private static long id;
    private String name;
    private String mobile;
    private String billId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Customers(String name, String mobile) {
        this.id = id+1;
        this.name = name;
        this.mobile = mobile;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Customers.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
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
