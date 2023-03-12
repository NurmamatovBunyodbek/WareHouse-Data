package uz.pdp.warehousedata.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Output {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Timestamp date;
    @ManyToOne
    private WareHouse warehouse;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Currency currency;
    private String facturNumber;
    @Column(unique = true,nullable = false)
    private String code;

}
