package uengine.domain.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class Task {
    private String id;
    private String name;
    private String formKey;
    private String description;
    private int priority;
}
