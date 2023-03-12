package uz.pdp.warehousedata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedata.projection.CustomOutputProduct;

@RepositoryRestResource(path = "outputProduct",collectionResourceRel = "list",excerptProjection = CustomOutputProduct.class)
public interface OutputProduct extends JpaRepository<OutputProduct,Integer> {
}
