package uengine.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import uengine.domain.entity.*;

@Component
public class WorklistHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Worklist>> {

    @Override
    public EntityModel<Worklist> process(EntityModel<Worklist> model) {
        return model;
    }
}
