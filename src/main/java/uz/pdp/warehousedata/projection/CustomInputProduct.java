package uz.pdp.warehousedata.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedata.entity.InputProduct;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Integer getId();
}
