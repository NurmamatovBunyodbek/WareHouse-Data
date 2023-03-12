package uz.pdp.warehousedata.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedata.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {

Integer getId();

}
