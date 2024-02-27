package uenginekernel.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import uenginekernel.domain.*;

@Component
public class ProcessDefinitionHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ProcessDefinition>> {

    @Override
    public EntityModel<ProcessDefinition> process(
        EntityModel<ProcessDefinition> model
    ) {
        return model;
    }
}
