package uz.pdp.warehousedata.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedata.entity.Input;
import uz.pdp.warehousedata.projection.CustomInput;

@RepositoryRestResource(path = "input",collectionResourceRel = "list",excerptProjection = CustomInput.class)
public interface InputRepo  extends JpaRepository<Input,Integer> {


}
