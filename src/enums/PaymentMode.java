package enums;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum PaymentMode {
    CASH(1), DEBIT_CARD(2), CREDIT_CARD(3), UPI(4), WALLET(5);

    private int paymentModeNumber;

    public static List<PaymentMode> paymentModeList = List.of(CASH, DEBIT_CARD, CREDIT_CARD, UPI, WALLET);
    PaymentMode(int paymentModeNumber) {
        this.paymentModeNumber = paymentModeNumber;
    }

//    private static Map<Integer, PaymentMode> addModes() {
//        paymentModeMap = new HashMap<>();
//        paymentModeMap.put(CASH.getPaymentModeNumber(), CASH);
//        paymentModeMap.put(DEBIT_CARD.getPaymentModeNumber(), DEBIT_CARD);
//        paymentModeMap.put(CREDIT_CARD.getPaymentModeNumber(), CREDIT_CARD);
//        paymentModeMap.put(UPI.getPaymentModeNumber(), UPI);
//        paymentModeMap.put(WALLET.getPaymentModeNumber(), WALLET);
//        return paymentModeMap;
//    }

    public int getPaymentModeNumber() {
        return paymentModeNumber;
    }
}
