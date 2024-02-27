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

    private String name;

    private String definition;

    private String version;

    private Date createdAt;

    private Date modified;

    private String author;

    public static ProcessDefinitionRepository repository() {
        ProcessDefinitionRepository processDefinitionRepository = ProcessdefinitionApplication.applicationContext.getBean(
            ProcessDefinitionRepository.class
        );
        return processDefinitionRepository;
    }
}
//>>> DDD / Aggregate Root
