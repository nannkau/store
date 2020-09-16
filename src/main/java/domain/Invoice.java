package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "invoice")
public class Invoice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoiceId")
    private Integer invoiceId;
    @Column(name = "createDate")
    private Date createDate;
    @Column(name = "priceTotal")
    private Integer priceTotal;
    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "consumerId")
    private Consumer consumer;
    @OneToMany(mappedBy = "invoice")
    private List<InvoiceDetail> invoiceDetails= new ArrayList<>();




}
