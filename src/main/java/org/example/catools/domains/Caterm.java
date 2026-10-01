package org.example.catools.domains;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "caterms")
public class Caterm {

    @Id
    private Integer catermId;
    private Integer primaryBorrowerId;
    private Integer reguestedMorgageAmount;
    private Date reguestDate;
    private Date approvalDate;
    private List<Coborrower> coborrowers;
    private List<Guarantors> guarantors;
    //private List<> collaterals;






    public Integer getCatermId() {
        return catermId;
    }

    public void setCatermId(Integer catermId) {
        this.catermId = catermId;
    }

    public Integer getPrimaryBorrowerId() {
        return primaryBorrowerId;
    }

    public void setPrimaryBorrowerId(Integer primaryBorrowerId) {
        this.primaryBorrowerId = primaryBorrowerId;
    }

    public Integer getReguestedMorgageAmount() {
        return reguestedMorgageAmount;
    }

    public void setReguestedMorgageAmount(Integer reguestedMorgageAmount) {
        this.reguestedMorgageAmount = reguestedMorgageAmount;
    }

    public Date getReguestDate() {
        return reguestDate;
    }

    public void setReguestDate(Date reguestDate) {
        this.reguestDate = reguestDate;
    }

    public Date getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Date approvalDate) {
        this.approvalDate = approvalDate;
    }
}
