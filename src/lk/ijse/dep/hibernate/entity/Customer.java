package lk.ijse.dep.hibernate.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Customer {
    @Id
    @Column(name="id")
    private String customerId;
    @Column(name="name")
    private String name;
    @Column(name="address")
    private String address;
    @Temporal(TemporalType.DATE)
    @Column(name="contacted_Date")
    private Date contactDate;

    public Customer() {
    }

    public Customer(String customerId, String name, String address, Date contactDate) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.contactDate = contactDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

    public Date getContactDate() {
        return contactDate;
    }

    public void setContactDate(Date contactDate) {
        this.contactDate = contactDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactDate=" + contactDate +
                '}';
    }
}
