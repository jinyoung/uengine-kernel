package uengine;

import org.junit.Test;

import uengine.domain.entity.Task;
import uengine.infra.BpmnXMLParser;

import static org.junit.Assert.*;

import java.util.List;

public class BpmnXMLParserTest {
    @Test
    public void testParse() {
        BpmnXMLParser parser = new BpmnXMLParser();
        String xml = "<bpmn2:definitions xmlns:bpmn2=\"http://www.omg.org/spec/BPMN/20100524/MODEL\" id=\"sample-definitions\">\n" +
                     "  <bpmn2:process id=\"process1\" name=\"Sample Process\">\n" +
                     "    <bpmn2:task id=\"task1\" name=\"Sample Task\" />\n" +
                     "  </bpmn2:process>\n" +
                     "</bpmn2:definitions>";
    
        try {
            List<Task> tasks = parser.parse(xml);
            assertEquals(1, tasks.size());
            assertEquals("task1", tasks.get(0).getId());
            assertEquals("Sample Task", tasks.get(0).getName());
        } catch (Exception e) {
            fail("Parsing failed with exception: " + e.getMessage());
        }
    }
}
