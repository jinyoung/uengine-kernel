package uengine.infra;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import uengine.domain.entity.Task;

public class BpmnXMLParser {

    public List<Task> parse(String xml) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(new StringReader(xml)));

        NodeList taskNodes = document.getElementsByTagName("bpmn2:task");
        List<Task> tasks = new ArrayList<>();

        for (int i = 0; i < taskNodes.getLength(); i++) {
            Node node = taskNodes.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;

                String id = element.getAttribute("id");
                String name = element.getAttribute("name");

                Task task = new Task();
                task.setId(id);
                task.setName(name);
                
                tasks.add(task);
            }
        }

        return tasks;
    }
}
