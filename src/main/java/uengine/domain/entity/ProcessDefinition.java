package uengine.domain.entity;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.*;
import lombok.Data;
import uengine.ProcessdefinitionApplication;

@Entity
@Table(name = "ProcessDefinition_table")
@Data
public class ProcessDefinition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String definition;

    private String version;

    private Date createdAt;

    private Date modified;

    private String author;

    @Transient
    private Map<String, FlowElement> flowElements;

    @Transient
    private Set<SequenceFlow> sequenceFlows;

    public static ProcessDefinitionRepository repository() {
        ProcessDefinitionRepository processDefinitionRepository = ProcessdefinitionApplication.applicationContext.getBean(
            ProcessDefinitionRepository.class
        );
        return processDefinitionRepository;
    }

    void loadDefinition(){
        try {
            InputStream stream = new ByteArrayInputStream(definition.getBytes("UTF_8"));
            //BpmnModel model = new BpmnXMLConverter().convertToBpmnModel(stream, true, true);
    
            //flowElements = model.getMainProcess().getFlowElementMap();
        } catch (Exception e) {
            // Handle exception
        }
    }

}




