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
@Table(name = "Size")
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "size", cascade = CascadeType.ALL)
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

    public Size(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
