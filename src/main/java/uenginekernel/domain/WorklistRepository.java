package uenginekernel.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uenginekernel.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "worklists", path = "worklists")
public interface WorklistRepository
    extends PagingAndSortingRepository<Worklist, Long> {}
