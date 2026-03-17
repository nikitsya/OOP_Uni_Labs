package t11_design_patterns_2.exercises.ex06;

interface CheckoutService {
    boolean checkout(int cents);
}

class ThirdPartyGateway {
    boolean makePayment(String euroAmount) {
        if (euroAmount.startsWith("0.00")) return false;
        System.out.print("PAID: " + euroAmount);
        return true;
    }
}

class GatewayCheckoutAdapter implements CheckoutService {
    GatewayCheckoutAdapter(ThirdPartyGateway gateway) {

    }

    public boolean checkout(int cents) {
        return false;
    }
}

public class Exercise {
    public static void run() {
        // TODO
    }
}
