package uz.pdp.warehousedata.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedata.entity.WareHouse;

@Projection(types = WareHouse.class)
public interface CustomWareHouse {

    Integer getId();
}
