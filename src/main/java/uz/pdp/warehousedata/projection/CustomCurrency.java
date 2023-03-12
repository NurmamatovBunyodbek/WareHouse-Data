package uz.pdp.warehousedata.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedata.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Integer getId();
}
