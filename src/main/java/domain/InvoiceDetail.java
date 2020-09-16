package domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "invoiceDetail")
public class InvoiceDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "InvoiceDetailId")
    private Integer InvoiceDetailId;
    @Column(name = "amount")
    private Integer amount;
    @Column(name = "price")
    private Integer price;
    @OneToOne
    @JoinColumn(name = "productId")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "invoiceId")
    private Invoice invoice;
}
