package DANHHT.Fashion.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "Brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
    private List<Product> products;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

  public Brand(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
