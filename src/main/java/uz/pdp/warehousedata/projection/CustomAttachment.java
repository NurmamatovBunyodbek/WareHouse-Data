package uz.pdp.warehousedata.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedata.entity.Attachment;

@Projection(types = Attachment.class)
public interface CustomAttachment {

    Integer getId();

}
