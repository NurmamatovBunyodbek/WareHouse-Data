package uz.pdp.warehousedata.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedata.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();


}
