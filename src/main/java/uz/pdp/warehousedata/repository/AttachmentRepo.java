package uz.pdp.warehousedata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedata.entity.Attachment;
import uz.pdp.warehousedata.projection.CustomAttachment;


@RepositoryRestResource(path = "attachment",collectionResourceRel = "list",excerptProjection = CustomAttachment.class)
public interface AttachmentRepo extends JpaRepository<Attachment,Integer> {





}
