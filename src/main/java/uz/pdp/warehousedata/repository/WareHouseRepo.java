package uz.pdp.warehousedata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedata.entity.WareHouse;
import uz.pdp.warehousedata.projection.CustomWareHouse;

@RepositoryRestResource(path = "warehouse",collectionResourceRel = "list",excerptProjection = CustomWareHouse.class)
public interface WareHouseRepo extends JpaRepository<WareHouse,Integer> {
}
