package entities;

import enums.Department;
import enums.Gender;
import enums.Position;

import java.time.LocalDateTime;

public class Employees {
    private static long id;
    private String name;
    private String address;
    private String mobile;
    private String role;
    private Position position;
    private Department department;
    private Gender gender;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Employees(String name, String address, String mobile, String role, Position position, Department department, Gender gender, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id+1;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.role = role;
        this.position = position;
        this.department = department;
        this.gender = gender;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Employees.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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
