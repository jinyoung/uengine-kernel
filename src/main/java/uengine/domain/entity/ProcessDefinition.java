package uengine.domain.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
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

    public static ProcessDefinitionRepository repository() {
        ProcessDefinitionRepository processDefinitionRepository = ProcessdefinitionApplication.applicationContext.getBean(
            ProcessDefinitionRepository.class
        );
        return processDefinitionRepository;
    }
}




