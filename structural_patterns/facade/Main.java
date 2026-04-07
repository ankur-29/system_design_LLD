package structural_patterns.facade;

import structural_patterns.facade.facadetype.OrderFacade;

public class Main {

    public static void main(String[] args) {

        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder("Laptop", 50000);
    }
}
