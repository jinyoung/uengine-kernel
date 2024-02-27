package uengine.domain.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import uengine.ProcessdefinitionApplication;

@Entity
@Table(name = "ProcessInstance_table")
@Data
//<<< DDD / Aggregate Root
public class ProcessInstance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String currentActivityIds;

    private String defId;

    private String data;

    private String roleBindings;

    private Date createdAt;

    public static ProcessInstanceRepository repository() {
        ProcessInstanceRepository processInstanceRepository = ProcessdefinitionApplication.applicationContext.getBean(
            ProcessInstanceRepository.class
        );
        return processInstanceRepository;
    }
}
//>>> DDD / Aggregate Root
