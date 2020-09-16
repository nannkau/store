package domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId")
    private Integer productId;
    @Column(name = "name",length = 150)
    private String name;
    @Column(name = "amountTotal")
    private Integer amountTotal;
    @Column(name = "price")
    private Integer price;
    @Column(name = "image",length = 100)
    private String image;
    @ManyToOne
    @JoinColumn(name="supplierId")
    private Supplier supplier;
    @ManyToOne
    @JoinColumn(name="categoryId")
    private Category category;
    @OneToOne(mappedBy = "product")
    private InvoiceDetail invoiceDetail;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(Integer amountTotal) {
        this.amountTotal = amountTotal;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
