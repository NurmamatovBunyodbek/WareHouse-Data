package uz.pdp.warehousedata.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedata.entity.Client;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();
}
