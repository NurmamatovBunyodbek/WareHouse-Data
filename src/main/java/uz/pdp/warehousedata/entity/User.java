package uz.pdp.warehousedata.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String first_name;
    @Column(nullable = false)
    private String last_name;
    @Column(unique = true,nullable = false)
    private String phone_number;
    private String code;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private Boolean active = true;
    @ManyToMany
    private Set<WareHouse> warehouse;
}
