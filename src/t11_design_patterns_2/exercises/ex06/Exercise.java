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

    ThirdPartyGateway _gateway = new ThirdPartyGateway();

    GatewayCheckoutAdapter(ThirdPartyGateway gateway) {
        if (gateway == null) throw new IllegalArgumentException("gateway is null.");
        _gateway = gateway;
    }

    public boolean checkout(int cents) {
        if (cents < 0)
            throw new IllegalArgumentException("cents must be >= 0.");

        String euroAmount = formatEuro(cents);
        return _gateway.makePayment(euroAmount);
    }

    private String formatEuro(int cents) {
        int euros = cents / 100;
        int remainder = cents % 100;

        String rem = String.valueOf(remainder);
        if (remainder < 10)
            rem = "0" + rem;

        return euros + "." + rem;
    }
}

public class Exercise {
    public static void run() {
        ThirdPartyGateway gateway = new ThirdPartyGateway();
        CheckoutService checkout = new GatewayCheckoutAdapter(gateway);

        System.out.println("checkout(0) -> " + checkout.checkout(0));
        System.out.println("checkout(199) -> " + checkout.checkout(199));
        System.out.println("checkout(1299) -> " + checkout.checkout(1299));
        System.out.println("checkout(1205) -> " + checkout.checkout(1205));
    }
}
