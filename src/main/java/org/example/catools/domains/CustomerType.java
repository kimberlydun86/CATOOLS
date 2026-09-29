package org.example.catools.domains;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "customer_type")
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Uses PostgreSQL SERIAL/BIGSERIAL auto-increment
    private int typeId;

    @Column(name = "customer_type", nullable = true, length = 100)
    private String customer_type;


    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(String customer_type) {
        this.customer_type = customer_type;
    }

    public CustomerType(){

    }
}
