package uz.pdp.warehousedata.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedata.entity.Output;

@Projection(types = Output.class)
public interface CustomOutput {

    Integer getId();

}
