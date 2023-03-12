package uz.pdp.warehousedata.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedata.entity.User;

@Projection(types = User.class)
public interface CustomUser {

    Integer getId();
}
