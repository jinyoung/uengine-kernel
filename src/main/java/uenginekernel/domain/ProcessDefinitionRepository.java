package uenginekernel.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uenginekernel.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "processDefinitions",
    path = "processDefinitions"
)
public interface ProcessDefinitionRepository
    extends PagingAndSortingRepository<ProcessDefinition, Long> {}
