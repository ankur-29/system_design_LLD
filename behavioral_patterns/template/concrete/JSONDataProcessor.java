package behavioral_patterns.template.concrete;

import behavioral_patterns.template.templates.DataProcessor;

public class JSONDataProcessor extends DataProcessor {

    protected void readData() {
        System.out.println("Reading JSON data");
    }

    protected void processData() {
        System.out.println("Processing JSON data");
    }

    protected void saveData() {
        System.out.println("Saving JSON data");
    }
}
