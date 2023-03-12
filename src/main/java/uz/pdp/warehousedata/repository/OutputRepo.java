package uz.pdp.warehousedata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedata.entity.Output;
import uz.pdp.warehousedata.projection.CustomOutput;

@RepositoryRestResource(path = "output",collectionResourceRel = "list",excerptProjection = CustomOutput.class)
public interface OutputRepo extends JpaRepository<Output,Integer> {
}
