package uz.pdp.warehousedata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedata.entity.User;
import uz.pdp.warehousedata.projection.CustomUser;

@RepositoryRestResource(path = "user",collectionResourceRel = "list",excerptProjection = CustomUser.class)
public interface UserRepo extends JpaRepository<User,Integer> {
}
