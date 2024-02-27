package uengine.domain.entity;

import lombok.Data;

@Data
public class Event extends FlowElement{
    private String id;
    private String name;
    private String eventType;
}