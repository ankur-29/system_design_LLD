package structural_patterns.facade.facadetype;

import structural_patterns.facade.subsystem.*;

public class OrderFacade {

    private InventoryService inventory;
    private PaymentService payment;
    private ShippingService shipping;

    public OrderFacade() {
        this.inventory = new InventoryService();
        this.payment = new PaymentService();
        this.shipping = new ShippingService();
    }

    public void placeOrder(String product, int amount) {

        if (inventory.checkStock(product)) {
            payment.makePayment(amount);
            shipping.shipProduct(product);
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Product out of stock");
        }
    }
}
