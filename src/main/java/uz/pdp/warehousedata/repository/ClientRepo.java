package uz.pdp.warehousedata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedata.entity.Client;
import uz.pdp.warehousedata.projection.CustomClient;

@RepositoryRestResource(path = "client",collectionResourceRel = "list",excerptProjection = CustomClient.class)
public interface ClientRepo extends JpaRepository<Client,Integer> {


}
