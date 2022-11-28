package fooddeliverytest.infra;

import fooddeliverytest.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="orderstatuschecks", path="orderstatuschecks")
public interface OrderstatuscheckRepository extends PagingAndSortingRepository<Orderstatuscheck, Long> {

    

    
}
