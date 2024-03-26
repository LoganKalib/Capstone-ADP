package za.ac.cput.Factory;
import java.util.List;
import java.util.UUID;


public class OrderFactory {

    // Create new Order with a generated ID
    public static Order createOrder(List<Product> products, Shipping shippingID, Payment paymentID, Customer customerID, float total, String orderNote) {
        String orderID = generateID(); // Generate a unique order ID
        return new Order.Builder()
                .orderID(orderID)
                .products(products)
                .shippingID(shippingID)
                .paymentID(paymentID)
                .customerID(customerID)
                .total(total)
                .orderNote(orderNote)
                .build(); // Build and return the Order object
    }

    //Create a new Order with no custom order note

    public static Order createOrderWithID(String orderID, List<Product> products, Shipping shippingID, Payment paymentID, Customer customerID, float total) {
        return new Order.Builder()
                .orderID(orderID)
                .products(products)
                .shippingID(shippingID)
                .paymentID(paymentID)
                .customerID(customerID)
                .total(total)
                .build();
    }




    // generate a unique ID
    private static String generateID() {
        return UUID.randomUUID().toString();
    }

    // validate input
    private static boolean validateInput(List<Product> products, Shipping shippingID, Payment paymentID, Customer customerID, float total, String orderNote) {

        if (products != null && !products.isEmpty() && shippingID != null && paymentID != null && customerID != null && total >= 0) {
            return true; // Input is valid
        } else {
            return false; // Input is not valid
        }
    }
}
