package com.mobileparts.puchsystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Table(name = "employee")
@Entity
public class Employee {

    @Id
    @Column(name = "employee_id", length = 20)
    private String employeeId;

    @NotBlank(message = "First name is required")
    @Column(name = "first_name",nullable = false,length = 50)
    private String firstName;

    @NotBlank(message = "Last Name is required")
    @Column(name = "last_name",nullable = false,length = 50)
    private String lastName;

    @NotBlank(message = "Department is required")
    @Column(name = "department",nullable = false,length = 50)
    private String department;


    @Column(name = "email",unique = true,length = 100)
    @Email(message = "Enter a valid email ")
    private String emailId;

    @NotNull(message = "Hire date is required")
    @Column(name = "hire_date", nullable = false)
    private LocalDate hireDate;

    @Column(name = "is_active",nullable = false)
    private boolean isActive;


    @Column(name="EmployeeType",nullable = false)
    private String employeeType;

    @Column(name = "create_at",nullable = false,updatable = false)
    private LocalDateTime createAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;

    public Employee()
    {
        this.isActive =true;
    }

    // Automatically set timestamps before persisting
    @PrePersist
    protected void timeStamp()
    {
        createAt = LocalDateTime.now();
        updateAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate()
    {
        updateAt = LocalDateTime.now();
    }

    public Employee(String employeeType, LocalDate hireDate, String emailId, String department, String lastName, String firstName, String employeeId) {
        this.employeeType = employeeType;
        this.hireDate = hireDate;
        this.emailId = emailId;
        this.department = department;
        this.lastName = lastName;
        this.firstName = firstName;
        this.employeeId = employeeId;
        this.isActive = true;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public @NotBlank(message = "First name is required") String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotBlank(message = "First name is required") String firstName) {
        this.firstName = firstName;
    }

    public @NotBlank(message = "Last Name is required") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotBlank(message = "Last Name is required") String lastName) {
        this.lastName = lastName;
    }

    public @NotBlank(message = "Department is required") String getDepartment() {
        return department;
    }

    public void setDepartment(@NotBlank(message = "Department is required") String department) {
        this.department = department;
    }

    public @Email(message = "Enter a valid email ") String getEmailId() {
        return emailId;
    }

    public void setEmailId(@Email(message = "Enter a valid email ") String emailId) {
        this.emailId = emailId;
    }

    public @NotNull(message = "Hire date is required") LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(@NotNull(message = "Hire date is required") LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return String.format("Employee[ID=%s, Name=%s, Dept=%s, Active=%s]",
                employeeId, getFullName(), department, isActive);
    }
}
