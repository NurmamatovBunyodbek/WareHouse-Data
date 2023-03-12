package uz.pdp.warehousedata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedata.projection.CustomCategory;

@RepositoryRestResource(path = "category",collectionResourceRel = "list",excerptProjection = CustomCategory.class)
public interface Category extends JpaRepository<Category,Integer> {
}
