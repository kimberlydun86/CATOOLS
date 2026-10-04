package org.example.catools.domains;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "caterms")
public class Caterm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Uses PostgreSQL SERIAL/BIGSERIAL auto-increment
    private Long catermId;

    @Column(name = "primary_borrower_id", nullable = true, length = 100)
    private Long primaryBorrowerId;

    @Column(name = "requested_morgage_amount", nullable = true, length = 100)
    private Integer requestedMorgageAmount;

    @Column(name = "request_date", nullable = true, length = 100)
    private Date requestDate;

    @Column(name = "approval_date", nullable = true, length = 100)
    private Date approvalDate;




    public Caterm() {
    }

    public Long getCatermId() {
        return catermId;
    }

    public void setCatermId(Long catermId) {
        this.catermId = catermId;
    }

    public Long getPrimaryBorrowerId() {
        return primaryBorrowerId;
    }

    public void setPrimaryBorrowerId(Long primaryBorrowerId) {
        this.primaryBorrowerId = primaryBorrowerId;
    }

    public Integer getRequestedMorgageAmount() {
        return requestedMorgageAmount;
    }

    public void setReguestedMorgageAmount(Integer requestedMorgageAmount) {
        this.requestedMorgageAmount = requestedMorgageAmount;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Date approvalDate) {
        this.approvalDate = approvalDate;
    }
}
