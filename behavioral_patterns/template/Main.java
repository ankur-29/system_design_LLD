package behavioral_patterns.template;

import behavioral_patterns.template.templates.DataProcessor;
import behavioral_patterns.template.concrete.*;

public class Main {

    public static void main(String[] args) {

        DataProcessor csv = new CSVDataProcessor();
        csv.process();

        System.out.println("------");

        DataProcessor json = new JSONDataProcessor();
        json.process();
    }
}