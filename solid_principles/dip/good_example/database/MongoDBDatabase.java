package solid_principles.dip.good_example.database;

public class MongoDBDatabase implements Database {
    
    @Override
    public void connect() {
        System.out.println("Connected to MongoDB");
    }
    
}
