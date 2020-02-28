package ru.mlevshin.testapp.po.order;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(exported = false)
public interface ProductOrderRepository extends MongoRepository<ProductOrder, Long> {
}
