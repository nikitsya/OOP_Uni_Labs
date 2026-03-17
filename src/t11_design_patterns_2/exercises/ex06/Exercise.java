package t11_design_patterns_2.exercises.ex06;

interface CheckoutService { boolean checkout(int cents); }

class ThirdPartyGateway { boolean makePayment(String euroAmount); }

class GatewayCheckoutAdapter implements CheckoutService {
    GatewayCheckoutAdapter(ThirdPartyGateway gateway);
    boolean checkout(int cents);
}

public class Exercise {
    public static void run() {
        // TODO
    }
}
