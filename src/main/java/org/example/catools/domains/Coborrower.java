package org.example.catools.domains;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = 'coborrower')
public class Coborrower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Uses PostgreSQL SERIAL/BIGSERIAL auto-increment
    private Integer id;

    @Column(name = "first_name", nullable = true, length = 100)
    private String firstName;


    @Column(name = "last_name", nullable = true, length = 100)
    private String lastName;

    @Column(name = "date_of_birth", nullable = true, length = 100)
    private Date dateOfBirth;

    @Column(name = "creation_date", nullable = true, length = 100)
    private Date creationDate;

    @Column(name = "current_address_id", nullable = true, length = 100)
    private Integer currentAddressId;

    @Column(name = "credit_rating_id", nullable = true, length = 100)
    private Integer creditRatingId;

    @Column(name = "last_modified", nullable = true, length = 100)
    private Date lastUpdateDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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


    public Integer getCurrentAddressId() {
        return currentAddressId;
    }

    public void setCurrentAddressId(Integer currentAddressId) {
        this.currentAddressId = currentAddressId;
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
