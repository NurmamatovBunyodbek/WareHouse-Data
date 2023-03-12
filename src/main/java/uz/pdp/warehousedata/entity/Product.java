package uz.pdp.warehousedata.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Category category;
    @OneToOne
    private Attachment attachment;
    @Column(unique = true,nullable = true)
    private String code;
    @ManyToOne
    private Measurement measurement;

}
