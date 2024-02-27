package uenginekernel.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import uenginekernel.ProcessdefinitionApplication;

@Entity
@Table(name = "ProcessDefinition_table")
@Data
//<<< DDD / Aggregate Root
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
//>>> DDD / Aggregate Root
