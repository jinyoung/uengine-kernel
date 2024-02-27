package uengine.domain.entity;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uengine.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "processInstances",
    path = "processInstances"
)
public interface ProcessInstanceRepository
    extends PagingAndSortingRepository<ProcessInstance, Long> {}
