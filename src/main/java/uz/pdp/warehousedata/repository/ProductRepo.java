package uz.pdp.warehousedata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedata.entity.Product;
import uz.pdp.warehousedata.projection.CustomProduct;

@RepositoryRestResource(path = "product",collectionResourceRel = "list",excerptProjection = CustomProduct.class)
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
