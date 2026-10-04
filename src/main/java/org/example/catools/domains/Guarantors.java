package org.example.catools.domains;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "guarantors")
public class Guarantors {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Uses PostgreSQL SERIAL/BIGSERIAL auto-increment
    private Integer guarantorId;


    @Column(name = "first_name", nullable = true, length = 100)
    private String firstName;

    @Column(name = "last_name", nullable = true, length = 100)
    private String lastName;

    @Column(name = "date_of_birth", nullable = true, length = 100)
    private Date dateOfBirth;

    @Column(name = "creation_date", nullable = true, length = 100)
    private Date creationDate;

    @Column(name = "primary_address_id", nullable = true, length = 100)
    private Integer primaryAddressId;

    @Column(name = "credit_rating_id", nullable = true, length = 100)
    private Integer creditRatingId;

    @Column(name = "last_update_date", nullable = true, length = 100)
    private Date lastUpdateDate;


    public Integer getGuarantorId() {
        return guarantorId;
    }

    public void setGuarantorId(Integer guarantorId) {
        this.guarantorId = guarantorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getPrimaryAddressId() {
        return primaryAddressId;
    }

    public void setPrimaryAddressId(Integer primaryAddressId) {
        this.primaryAddressId = primaryAddressId;
    }

    public Integer getCreditRatingId() {
        return creditRatingId;
    }

    public void setCreditRatingId(Integer creditRatingId) {
        this.creditRatingId = creditRatingId;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}
