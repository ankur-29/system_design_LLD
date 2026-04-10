package behavioral_patterns.template.concrete;

import behavioral_patterns.template.templates.DataProcessor;

public class CSVDataProcessor extends DataProcessor {

    protected void readData() {
        System.out.println("Reading CSV data");
    }

    protected void processData() {
        System.out.println("Processing CSV data");
    }

    protected void saveData() {
        System.out.println("Saving CSV data");
    }
}