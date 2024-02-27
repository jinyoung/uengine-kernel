package uengine.domain.entity;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "worklists", path = "worklists")
public interface WorklistRepository
    extends PagingAndSortingRepository<Worklist, Long> {}
