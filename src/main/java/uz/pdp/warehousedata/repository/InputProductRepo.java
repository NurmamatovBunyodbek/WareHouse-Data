package uz.pdp.warehousedata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedata.entity.InputProduct;
import uz.pdp.warehousedata.projection.CustomInputProduct;

@RepositoryRestResource(path = "inputproduct",collectionResourceRel = "list",excerptProjection = CustomInputProduct.class)
public interface InputProductRepo extends JpaRepository<InputProduct ,Integer> {


}
