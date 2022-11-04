package hieu.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String producer;

    public Product() {
    }

    public Product(String name, String producer) {
        this.name = name;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return String.format("Product[id=%d, name='%s', producer='%s']", id, name, producer);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
