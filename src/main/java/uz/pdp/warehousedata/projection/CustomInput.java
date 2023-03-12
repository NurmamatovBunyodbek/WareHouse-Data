package uz.pdp.warehousedata.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedata.entity.Input;

@Projection(types = Input.class)
public interface CustomInput {

    Integer getId();
}
