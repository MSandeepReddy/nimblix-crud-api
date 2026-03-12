package com.nimblix.task_api.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@JsonPropertyOrder({"id", "employeeId", "name", "email"}) // This locks the order
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This handles the "automatic id"
    private Long id;

    @NotBlank(message = "Employee ID is mandatory")
    private String employeeId;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @Email(message = "Please provide a valid email")
    @NotBlank(message = "Email is mandatory")
    private String email;

    public Task() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}