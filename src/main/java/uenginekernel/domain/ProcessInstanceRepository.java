package uenginekernel.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uenginekernel.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "processInstances",
    path = "processInstances"
)
public interface ProcessInstanceRepository
    extends PagingAndSortingRepository<ProcessInstance, Long> {}
