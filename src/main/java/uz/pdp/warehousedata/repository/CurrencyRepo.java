package uz.pdp.warehousedata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedata.entity.Currency;
import uz.pdp.warehousedata.projection.CustomCurrency;

@RepositoryRestResource(path = "currency",collectionResourceRel = "list",excerptProjection = CustomCurrency.class)
public interface CurrencyRepo extends JpaRepository<Currency,Integer> {

}
