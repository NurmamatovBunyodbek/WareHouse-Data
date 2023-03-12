package uz.pdp.warehousedata.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedata.entity.Measurement;

@Projection(types = Measurement.class)
public interface CustomMeasurement {

    Integer getId();
}
