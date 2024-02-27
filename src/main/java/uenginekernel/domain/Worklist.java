package uenginekernel.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import uenginekernel.ProcessdefinitionApplication;

@Entity
@Table(name = "Worklist_table")
@Data
//<<< DDD / Aggregate Root
public class Worklist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String instId;

    private String defId;

    private String status;

    private Date dueDate;

    private Date startedDate;

    private Date endDate;

    public static WorklistRepository repository() {
        WorklistRepository worklistRepository = ProcessdefinitionApplication.applicationContext.getBean(
            WorklistRepository.class
        );
        return worklistRepository;
    }
}
//>>> DDD / Aggregate Root
