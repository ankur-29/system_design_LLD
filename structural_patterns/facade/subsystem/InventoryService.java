package structural_patterns.facade.subsystem;

public class InventoryService {

    public boolean checkStock(String product) {
        System.out.println("Checking stock for " + product);
        return true;
    }
}