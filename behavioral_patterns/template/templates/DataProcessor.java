package behavioral_patterns.template.templates;

public abstract class DataProcessor {

    // Template method (final to prevent override)
    public final void process() {
        readData();
        processData();
        saveData();
    }

    protected abstract void readData();
    protected abstract void processData();
    protected abstract void saveData();
}