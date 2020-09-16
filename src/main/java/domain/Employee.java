package domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "employee")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeId")
    private Integer employeeId;
    @Column(name = "name",length = 150)
    private String name;
    @Column(name = "phoneNumber",length = 15)
    private String phoneNumber;
    @Column(name = "idNo",length = 15)
    private String idNo;
    @Column(name = "address",length = 150)
    private String address;
    @DateTimeFormat(pattern ="dd/MM/yyyy")
    @Column(name = "birthDate")
    private String birthDate;
    @OneToOne(mappedBy = "employee")
    private User user;
    @OneToMany(mappedBy = "employee")
    private List<Invoice> invoices= new ArrayList<>();

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
