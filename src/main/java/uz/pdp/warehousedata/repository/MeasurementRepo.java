package uz.pdp.warehousedata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedata.entity.Measurement;
import uz.pdp.warehousedata.projection.CustomMeasurement;

@RepositoryRestResource(path = "measurement",collectionResourceRel = "list",excerptProjection = CustomMeasurement.class)
public interface MeasurementRepo extends JpaRepository<Measurement,Integer> {


}
