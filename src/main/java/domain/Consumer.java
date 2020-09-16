package domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "consumer")
public class Consumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "consumerId")
    private Integer consumerId;
    @Column(name = "name",length = 150)
    private String name;
    @Column(name="address",length = 150)
    private String address;
    @Column(name="phoneNumber",length = 150)
    private String phoneNumber;
    @Column(name="email",length = 150)
    private String email;
    @OneToMany(mappedBy = "consumer")
    private List<Invoice> invoices= new ArrayList<>();
}
