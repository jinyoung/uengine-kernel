package uengine.domain.entity;

import lombok.Data;

@Data
public class SequenceFlow {
    private String id;
    private String sourceRef;
    private String targetRef;
}