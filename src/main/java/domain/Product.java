package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
    @Column(name = "flagDelete", nullable = false)
    private String flagDelete;
    @ManyToOne
    @JoinColumn(name="supplierId")
    private Supplier supplier;
    @ManyToOne
    @JoinColumn(name="categoryId")
    private Category category;
    @OneToMany(mappedBy = "product")
    private List<InvoiceDetail> invoiceDetails=new ArrayList<>();
    @OneToMany(mappedBy = "product")
    private List<RecevieDetail> recevieDetails= new ArrayList<>();

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

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<InvoiceDetail> getInvoiceDetails() {
        return invoiceDetails;
    }

    public void setInvoiceDetails(List<InvoiceDetail> invoiceDetails) {
        this.invoiceDetails = invoiceDetails;
    }

    public List<RecevieDetail> getRecevieDetails() {
        return recevieDetails;
    }

    public void setRecevieDetails(List<RecevieDetail> recevieDetails) {
        this.recevieDetails = recevieDetails;
    }

    public String getFlagDelete() {
        return flagDelete;
    }

    public void setFlagDelete(String flagDelete) {
        this.flagDelete = flagDelete;
    }
}
