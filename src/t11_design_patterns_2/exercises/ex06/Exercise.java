package t11_design_patterns_2.exercises.ex06;

interface CheckoutService {
    boolean checkout(int cents);
}

class ThirdPartyGateway {
    boolean makePayment(String euroAmount) {
        return false;
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
