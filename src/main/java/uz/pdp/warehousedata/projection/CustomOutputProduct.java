package uz.pdp.warehousedata.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedata.entity.OutputProduct;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

    Integer getId();
}
