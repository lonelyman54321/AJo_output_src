/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.CardTokenizeConsentDetails;
import com.ril.ajio.services.data.Payment.CashOnDeliveryInformation;
import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.EncryptionData;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.FraudEngineResponse;
import com.ril.ajio.services.data.Payment.Notes;
import com.ril.ajio.services.data.Payment.Order;
import com.ril.ajio.services.data.Payment.OrderSummary;
import com.ril.ajio.services.data.Payment.PaymentChannelInformation;
import com.ril.ajio.services.data.Payment.Tenant;
import com.ril.ajio.services.data.ajiocash.GiftCard;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PaymentInstruments {
    private List banners;
    private final CardTokenizeConsentDetails cardTokenizeConsentDetails;
    private String cartCheckSum;
    private CashOnDeliveryInformation cashOnDeliveryInformation;
    private Customer customer;
    private Boolean displayAjioWalletAboveLoader;
    private final GiftCard eGiftCard;
    private EncryptionData encryptionData;
    private Error error;
    private FraudEngineResponse fraudEngineResponseDetails;
    private List howToFindUPISteps;
    private String loyaltyPointsInfo;
    private String message;
    private Boolean multipleInternalWalletServiceEnabled;
    private String multipleWalletEnabledAmountMessage;
    private final Notes notes;
    private Order order;
    private OrderSummary orderSummary;
    private PaymentChannelInformation paymentChannelInformation;
    private List paymentInstrumentDetails;
    private String paymentInstrumentWalletChecksum;
    private String paymentMessage;
    private String requestChecksum;
    private String roneWalletName;
    private Boolean showEmiInstruments;
    private Tenant tenant;
    private float totalInternalWalletAmountUsed;
    private String transactionToken;
    private Boolean verifyVpa;

    public PaymentInstruments() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, null, null, null, null, null, null, -1 >>> 3, null);
    }

    public PaymentInstruments(Tenant tenant, Customer customer, Order order, OrderSummary orderSummary, List list, CashOnDeliveryInformation cashOnDeliveryInformation, List list2, Error error, String string2, FraudEngineResponse fraudEngineResponse, Boolean bl2, String string3, String string4, PaymentChannelInformation paymentChannelInformation, String string5, String string6, String string7, String string8, Boolean bl3, List list3, EncryptionData encryptionData, Boolean bl4, float f5, String string9, String string10, Notes notes, CardTokenizeConsentDetails cardTokenizeConsentDetails, GiftCard giftCard, Boolean bl5) {
        this.tenant = tenant;
        this.customer = customer;
        this.order = order;
        this.orderSummary = orderSummary;
        this.banners = list;
        this.cashOnDeliveryInformation = cashOnDeliveryInformation;
        this.paymentInstrumentDetails = list2;
        this.error = error;
        this.message = string2;
        this.fraudEngineResponseDetails = fraudEngineResponse;
        this.multipleInternalWalletServiceEnabled = bl2;
        this.paymentMessage = string3;
        this.cartCheckSum = string4;
        this.paymentChannelInformation = paymentChannelInformation;
        this.paymentInstrumentWalletChecksum = string5;
        this.transactionToken = string6;
        this.requestChecksum = string7;
        this.roneWalletName = string8;
        this.verifyVpa = bl3;
        this.howToFindUPISteps = list3;
        this.encryptionData = encryptionData;
        this.displayAjioWalletAboveLoader = bl4;
        this.totalInternalWalletAmountUsed = f5;
        this.loyaltyPointsInfo = string9;
        this.multipleWalletEnabledAmountMessage = string10;
        this.notes = notes;
        this.cardTokenizeConsentDetails = cardTokenizeConsentDetails;
        this.eGiftCard = giftCard;
        this.showEmiInstruments = bl5;
    }

    public /* synthetic */ PaymentInstruments(Tenant object, Customer serializable, Order serializable2, OrderSummary serializable3, List object2, CashOnDeliveryInformation object3, List object4, Error object5, String object6, FraudEngineResponse object7, Boolean object8, String object9, String string2, PaymentChannelInformation object10, String object11, String string3, String string4, String string5, Boolean object12, List object13, EncryptionData object14, Boolean object15, float f5, String string6, String string7, Notes object16, CardTokenizeConsentDetails object17, GiftCard object18, Boolean object19, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        GiftCard giftCard;
        CardTokenizeConsentDetails cardTokenizeConsentDetails;
        Notes notes;
        String string8;
        String string9;
        Boolean bl2;
        EncryptionData encryptionData;
        List list;
        String string10;
        String string11;
        String string12;
        String string13;
        PaymentChannelInformation paymentChannelInformation;
        String string14;
        String string15;
        FraudEngineResponse fraudEngineResponse;
        String string16;
        Error error;
        List list2;
        CashOnDeliveryInformation cashOnDeliveryInformation;
        List list3;
        OrderSummary orderSummary;
        Order order;
        Customer customer;
        Tenant tenant;
        int n4 = n3;
        int n7 = n3 & 1;
        if (n7 != 0) {
            n7 = 0;
            tenant = null;
        } else {
            tenant = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            customer = null;
        } else {
            customer = serializable;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            order = null;
        } else {
            order = serializable2;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            orderSummary = null;
        } else {
            orderSummary = serializable3;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            list3 = null;
        } else {
            list3 = object2;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            cashOnDeliveryInformation = null;
        } else {
            cashOnDeliveryInformation = object3;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            list2 = null;
        } else {
            list2 = object4;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            error = null;
        } else {
            error = object5;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string16 = null;
        } else {
            string16 = object6;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            fraudEngineResponse = null;
        } else {
            fraudEngineResponse = object7;
        }
        int n21 = n4 & 0x400;
        Object object20 = n21 != 0 ? Boolean.FALSE : object8;
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            n22 = 0;
            string15 = null;
        } else {
            string15 = object9;
        }
        int n24 = n4 & 0x1000;
        if (n24 != 0) {
            n24 = 0;
            string14 = null;
        } else {
            string14 = string2;
        }
        int n25 = n4 & 0x2000;
        if (n25 != 0) {
            n25 = 0;
            paymentChannelInformation = null;
        } else {
            paymentChannelInformation = object10;
        }
        int n26 = n4 & 0x4000;
        if (n26 != 0) {
            n26 = 0;
            string13 = null;
        } else {
            string13 = object11;
        }
        int n27 = n4 & 0x8000;
        if (n27 != 0) {
            n27 = 0;
            string12 = null;
        } else {
            string12 = string3;
        }
        int n28 = n4 & 0x10000;
        if (n28 != 0) {
            n28 = 0;
            string11 = null;
        } else {
            string11 = string4;
        }
        int n29 = n4 & 0x20000;
        if (n29 != 0) {
            n29 = 0;
            string10 = null;
        } else {
            string10 = string5;
        }
        int n30 = n4 & 0x40000;
        Object object21 = n30 != 0 ? Boolean.FALSE : object12;
        int n32 = n4 & 0x80000;
        if (n32 != 0) {
            n32 = 0;
            list = null;
        } else {
            list = object13;
        }
        int n34 = n4 & 0x100000;
        if (n34 != 0) {
            n34 = 0;
            encryptionData = null;
        } else {
            encryptionData = object14;
        }
        int n35 = n4 & 0x200000;
        if (n35 != 0) {
            n35 = 0;
            bl2 = null;
        } else {
            bl2 = object15;
        }
        float f6 = 5.877472E-39f;
        int n36 = n4 & 0x400000;
        if (n36 != 0) {
            n36 = 0;
            f6 = 0.0f;
        } else {
            f6 = f5;
        }
        int n37 = n4 & 0x800000;
        if (n37 != 0) {
            n37 = 0;
            string9 = null;
        } else {
            string9 = string6;
        }
        int n38 = n4 & 0x1000000;
        if (n38 != 0) {
            n38 = 0;
            string8 = null;
        } else {
            string8 = string7;
        }
        int n39 = n4 & 0x2000000;
        if (n39 != 0) {
            n39 = 0;
            notes = null;
        } else {
            notes = object16;
        }
        int n41 = n4 & 0x4000000;
        if (n41 != 0) {
            n41 = 0;
            cardTokenizeConsentDetails = null;
        } else {
            cardTokenizeConsentDetails = object17;
        }
        int n42 = n4 & 0x8000000;
        if (n42 != 0) {
            n42 = 0;
            giftCard = null;
        } else {
            giftCard = object18;
        }
        int n43 = 0x10000000;
        Object object22 = (n4 &= n43) != 0 ? Boolean.TRUE : object19;
        object = this;
        serializable = tenant;
        serializable2 = customer;
        serializable3 = order;
        object2 = orderSummary;
        object3 = list3;
        object4 = cashOnDeliveryInformation;
        object5 = list2;
        object6 = error;
        object7 = string16;
        object8 = fraudEngineResponse;
        object9 = object20;
        string2 = string15;
        object10 = string14;
        object11 = paymentChannelInformation;
        string3 = string13;
        string4 = string12;
        string5 = string11;
        object12 = string10;
        object13 = object21;
        object14 = list;
        object15 = encryptionData;
        string7 = string9;
        object16 = string8;
        object17 = notes;
        object18 = cardTokenizeConsentDetails;
        object19 = giftCard;
        this(tenant, customer, order, orderSummary, list3, cashOnDeliveryInformation, list2, error, string16, fraudEngineResponse, (Boolean)object20, string15, string14, paymentChannelInformation, string13, string12, string11, string10, (Boolean)object21, list, encryptionData, bl2, f6, string9, string8, notes, cardTokenizeConsentDetails, giftCard, (Boolean)object22);
    }

    public static /* synthetic */ PaymentInstruments copy$default(PaymentInstruments paymentInstruments, Tenant tenant, Customer customer, Order order, OrderSummary orderSummary, List list, CashOnDeliveryInformation cashOnDeliveryInformation, List list2, Error error, String string2, FraudEngineResponse fraudEngineResponse, Boolean bl2, String string3, String string4, PaymentChannelInformation paymentChannelInformation, String object, String object2, String object3, String object4, Boolean object5, List object6, EncryptionData object7, Boolean object8, float f5, String object9, String object10, Notes object11, CardTokenizeConsentDetails object12, GiftCard object13, Boolean bl3, int n3, Object object14) {
        PaymentInstruments paymentInstruments2 = paymentInstruments;
        int n4 = n3;
        int n7 = n3 & 1;
        Tenant tenant2 = n7 != 0 ? paymentInstruments.tenant : tenant;
        int n8 = n4 & 2;
        Customer customer2 = n8 != 0 ? paymentInstruments2.customer : customer;
        int n10 = n4 & 4;
        Order order2 = n10 != 0 ? paymentInstruments2.order : order;
        int n14 = n4 & 8;
        OrderSummary orderSummary2 = n14 != 0 ? paymentInstruments2.orderSummary : orderSummary;
        int n15 = n4 & 0x10;
        List list3 = n15 != 0 ? paymentInstruments2.banners : list;
        int n16 = n4 & 0x20;
        CashOnDeliveryInformation cashOnDeliveryInformation2 = n16 != 0 ? paymentInstruments2.cashOnDeliveryInformation : cashOnDeliveryInformation;
        int n17 = n4 & 0x40;
        List list4 = n17 != 0 ? paymentInstruments2.paymentInstrumentDetails : list2;
        int n18 = n4 & 0x80;
        Error error2 = n18 != 0 ? paymentInstruments2.error : error;
        int n19 = n4 & 0x100;
        String string5 = n19 != 0 ? paymentInstruments2.message : string2;
        int n20 = n4 & 0x200;
        FraudEngineResponse fraudEngineResponse2 = n20 != 0 ? paymentInstruments2.fraudEngineResponseDetails : fraudEngineResponse;
        int n21 = n4 & 0x400;
        Boolean bl4 = n21 != 0 ? paymentInstruments2.multipleInternalWalletServiceEnabled : bl2;
        int n22 = n4 & 0x800;
        String string6 = n22 != 0 ? paymentInstruments2.paymentMessage : string3;
        int n24 = n4 & 0x1000;
        String string7 = n24 != 0 ? paymentInstruments2.cartCheckSum : string4;
        int n25 = n4 & 0x2000;
        Object object15 = n25 != 0 ? paymentInstruments2.paymentChannelInformation : paymentChannelInformation;
        paymentChannelInformation = object15;
        n25 = n4 & 0x4000;
        object15 = n25 != 0 ? paymentInstruments2.paymentInstrumentWalletChecksum : object;
        int n26 = n4 & 0x8000;
        object = object15;
        object15 = n26 != 0 ? paymentInstruments2.transactionToken : object2;
        n26 = n4 & 0x10000;
        object2 = object15;
        object15 = n26 != 0 ? paymentInstruments2.requestChecksum : object3;
        n26 = n4 & 0x20000;
        object3 = object15;
        object15 = n26 != 0 ? paymentInstruments2.roneWalletName : object4;
        n26 = n4 & 0x40000;
        object4 = object15;
        object15 = n26 != 0 ? paymentInstruments2.verifyVpa : object5;
        n26 = n4 & 0x80000;
        object5 = object15;
        object15 = n26 != 0 ? paymentInstruments2.howToFindUPISteps : object6;
        n26 = n4 & 0x100000;
        object6 = object15;
        object15 = n26 != 0 ? paymentInstruments2.encryptionData : object7;
        n26 = n4 & 0x200000;
        object7 = object15;
        object15 = n26 != 0 ? paymentInstruments2.displayAjioWalletAboveLoader : object8;
        n26 = n4 & 0x400000;
        object8 = object15;
        float f6 = n26 != 0 ? paymentInstruments2.totalInternalWalletAmountUsed : f5;
        n26 = n4 & 0x800000;
        f5 = f6;
        object15 = n26 != 0 ? paymentInstruments2.loyaltyPointsInfo : object9;
        n26 = n4 & 0x1000000;
        object9 = object15;
        object15 = n26 != 0 ? paymentInstruments2.multipleWalletEnabledAmountMessage : object10;
        n26 = n4 & 0x2000000;
        object10 = object15;
        object15 = n26 != 0 ? paymentInstruments2.notes : object11;
        n26 = n4 & 0x4000000;
        object11 = object15;
        object15 = n26 != 0 ? paymentInstruments2.cardTokenizeConsentDetails : object12;
        n26 = n4 & 0x8000000;
        object12 = object15;
        object15 = n26 != 0 ? paymentInstruments2.eGiftCard : object13;
        n26 = 0x10000000;
        Boolean bl5 = (n4 &= n26) != 0 ? paymentInstruments2.showEmiInstruments : bl3;
        tenant = tenant2;
        customer = customer2;
        order = order2;
        orderSummary = orderSummary2;
        list = list3;
        cashOnDeliveryInformation = cashOnDeliveryInformation2;
        list2 = list4;
        error = error2;
        string2 = string5;
        fraudEngineResponse = fraudEngineResponse2;
        bl2 = bl4;
        string3 = string6;
        string4 = string7;
        object13 = object15;
        bl3 = bl5;
        return paymentInstruments.copy(tenant2, customer2, order2, orderSummary2, list3, cashOnDeliveryInformation2, list4, error2, string5, fraudEngineResponse2, bl4, string6, string7, paymentChannelInformation, (String)object, (String)object2, (String)object3, (String)object4, (Boolean)object5, (List)object6, (EncryptionData)object7, (Boolean)object8, f5, (String)object9, (String)object10, (Notes)object11, (CardTokenizeConsentDetails)object12, (GiftCard)object15, bl5);
    }

    public final Tenant component1() {
        return this.tenant;
    }

    public final FraudEngineResponse component10() {
        return this.fraudEngineResponseDetails;
    }

    public final Boolean component11() {
        return this.multipleInternalWalletServiceEnabled;
    }

    public final String component12() {
        return this.paymentMessage;
    }

    public final String component13() {
        return this.cartCheckSum;
    }

    public final PaymentChannelInformation component14() {
        return this.paymentChannelInformation;
    }

    public final String component15() {
        return this.paymentInstrumentWalletChecksum;
    }

    public final String component16() {
        return this.transactionToken;
    }

    public final String component17() {
        return this.requestChecksum;
    }

    public final String component18() {
        return this.roneWalletName;
    }

    public final Boolean component19() {
        return this.verifyVpa;
    }

    public final Customer component2() {
        return this.customer;
    }

    public final List component20() {
        return this.howToFindUPISteps;
    }

    public final EncryptionData component21() {
        return this.encryptionData;
    }

    public final Boolean component22() {
        return this.displayAjioWalletAboveLoader;
    }

    public final float component23() {
        return this.totalInternalWalletAmountUsed;
    }

    public final String component24() {
        return this.loyaltyPointsInfo;
    }

    public final String component25() {
        return this.multipleWalletEnabledAmountMessage;
    }

    public final Notes component26() {
        return this.notes;
    }

    public final CardTokenizeConsentDetails component27() {
        return this.cardTokenizeConsentDetails;
    }

    public final GiftCard component28() {
        return this.eGiftCard;
    }

    public final Boolean component29() {
        return this.showEmiInstruments;
    }

    public final Order component3() {
        return this.order;
    }

    public final OrderSummary component4() {
        return this.orderSummary;
    }

    public final List component5() {
        return this.banners;
    }

    public final CashOnDeliveryInformation component6() {
        return this.cashOnDeliveryInformation;
    }

    public final List component7() {
        return this.paymentInstrumentDetails;
    }

    public final Error component8() {
        return this.error;
    }

    public final String component9() {
        return this.message;
    }

    public final PaymentInstruments copy(Tenant tenant, Customer customer, Order order, OrderSummary orderSummary, List list, CashOnDeliveryInformation cashOnDeliveryInformation, List list2, Error error, String string2, FraudEngineResponse fraudEngineResponse, Boolean bl2, String string3, String string4, PaymentChannelInformation paymentChannelInformation, String string5, String string6, String string7, String string8, Boolean bl3, List list3, EncryptionData encryptionData, Boolean bl4, float f5, String string9, String string10, Notes notes, CardTokenizeConsentDetails cardTokenizeConsentDetails, GiftCard giftCard, Boolean bl5) {
        PaymentInstruments paymentInstruments = new PaymentInstruments(tenant, customer, order, orderSummary, list, cashOnDeliveryInformation, list2, error, string2, fraudEngineResponse, bl2, string3, string4, paymentChannelInformation, string5, string6, string7, string8, bl3, list3, encryptionData, bl4, f5, string9, string10, notes, cardTokenizeConsentDetails, giftCard, bl5);
        return paymentInstruments;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof PaymentInstruments;
        if (n3 == 0) {
            return false;
        }
        object = (PaymentInstruments)object;
        Object object2 = this.tenant;
        Object object3 = ((PaymentInstruments)object).tenant;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.customer;
        object3 = ((PaymentInstruments)object).customer;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.order;
        object3 = ((PaymentInstruments)object).order;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.orderSummary;
        object3 = ((PaymentInstruments)object).orderSummary;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.banners;
        object3 = ((PaymentInstruments)object).banners;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.cashOnDeliveryInformation;
        object3 = ((PaymentInstruments)object).cashOnDeliveryInformation;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.paymentInstrumentDetails;
        object3 = ((PaymentInstruments)object).paymentInstrumentDetails;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.error;
        object3 = ((PaymentInstruments)object).error;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.message;
        object3 = ((PaymentInstruments)object).message;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.fraudEngineResponseDetails;
        object3 = ((PaymentInstruments)object).fraudEngineResponseDetails;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.multipleInternalWalletServiceEnabled;
        object3 = ((PaymentInstruments)object).multipleInternalWalletServiceEnabled;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.paymentMessage;
        object3 = ((PaymentInstruments)object).paymentMessage;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.cartCheckSum;
        object3 = ((PaymentInstruments)object).cartCheckSum;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.paymentChannelInformation;
        object3 = ((PaymentInstruments)object).paymentChannelInformation;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.paymentInstrumentWalletChecksum;
        object3 = ((PaymentInstruments)object).paymentInstrumentWalletChecksum;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.transactionToken;
        object3 = ((PaymentInstruments)object).transactionToken;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.requestChecksum;
        object3 = ((PaymentInstruments)object).requestChecksum;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.roneWalletName;
        object3 = ((PaymentInstruments)object).roneWalletName;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.verifyVpa;
        object3 = ((PaymentInstruments)object).verifyVpa;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.howToFindUPISteps;
        object3 = ((PaymentInstruments)object).howToFindUPISteps;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.encryptionData;
        object3 = ((PaymentInstruments)object).encryptionData;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.displayAjioWalletAboveLoader;
        object3 = ((PaymentInstruments)object).displayAjioWalletAboveLoader;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        float f5 = this.totalInternalWalletAmountUsed;
        float f6 = ((PaymentInstruments)object).totalInternalWalletAmountUsed;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        object2 = this.loyaltyPointsInfo;
        object3 = ((PaymentInstruments)object).loyaltyPointsInfo;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.multipleWalletEnabledAmountMessage;
        object3 = ((PaymentInstruments)object).multipleWalletEnabledAmountMessage;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.notes;
        object3 = ((PaymentInstruments)object).notes;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.cardTokenizeConsentDetails;
        object3 = ((PaymentInstruments)object).cardTokenizeConsentDetails;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.eGiftCard;
        object3 = ((PaymentInstruments)object).eGiftCard;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.showEmiInstruments;
        object = ((PaymentInstruments)object).showEmiInstruments;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final List getBanners() {
        return this.banners;
    }

    public final CardTokenizeConsentDetails getCardTokenizeConsentDetails() {
        return this.cardTokenizeConsentDetails;
    }

    public final String getCartCheckSum() {
        return this.cartCheckSum;
    }

    public final CashOnDeliveryInformation getCashOnDeliveryInformation() {
        return this.cashOnDeliveryInformation;
    }

    public final Customer getCustomer() {
        return this.customer;
    }

    public final Boolean getDisplayAjioWalletAboveLoader() {
        return this.displayAjioWalletAboveLoader;
    }

    public final GiftCard getEGiftCard() {
        return this.eGiftCard;
    }

    public final EncryptionData getEncryptionData() {
        return this.encryptionData;
    }

    public final Error getError() {
        return this.error;
    }

    public final FraudEngineResponse getFraudEngineResponseDetails() {
        return this.fraudEngineResponseDetails;
    }

    public final List getHowToFindUPISteps() {
        return this.howToFindUPISteps;
    }

    public final String getLoyaltyPointsInfo() {
        return this.loyaltyPointsInfo;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Boolean getMultipleInternalWalletServiceEnabled() {
        return this.multipleInternalWalletServiceEnabled;
    }

    public final String getMultipleWalletEnabledAmountMessage() {
        return this.multipleWalletEnabledAmountMessage;
    }

    public final Notes getNotes() {
        return this.notes;
    }

    public final Order getOrder() {
        return this.order;
    }

    public final OrderSummary getOrderSummary() {
        return this.orderSummary;
    }

    public final PaymentChannelInformation getPaymentChannelInformation() {
        return this.paymentChannelInformation;
    }

    public final List getPaymentInstrumentDetails() {
        return this.paymentInstrumentDetails;
    }

    public final String getPaymentInstrumentWalletChecksum() {
        return this.paymentInstrumentWalletChecksum;
    }

    public final String getPaymentMessage() {
        return this.paymentMessage;
    }

    public final String getRequestChecksum() {
        return this.requestChecksum;
    }

    public final String getRoneWalletName() {
        return this.roneWalletName;
    }

    public final Boolean getShowEmiInstruments() {
        return this.showEmiInstruments;
    }

    public final Tenant getTenant() {
        return this.tenant;
    }

    public final float getTotalInternalWalletAmountUsed() {
        return this.totalInternalWalletAmountUsed;
    }

    public final String getTransactionToken() {
        return this.transactionToken;
    }

    public final Boolean getVerifyVpa() {
        return this.verifyVpa;
    }

    public int hashCode() {
        float f5;
        int n3;
        int n4;
        Tenant tenant = this.tenant;
        int n7 = 0;
        if (tenant == null) {
            n4 = 0;
            tenant = null;
        } else {
            n4 = tenant.hashCode();
        }
        int n8 = 31;
        n4 *= 31;
        Object object = this.customer;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((Customer)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.order;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((Order)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderSummary;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((OrderSummary)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.banners;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cashOnDeliveryInformation;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((CashOnDeliveryInformation)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentInstrumentDetails;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.error;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((Error)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.message;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.fraudEngineResponseDetails;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((FraudEngineResponse)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.multipleInternalWalletServiceEnabled;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentMessage;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cartCheckSum;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentChannelInformation;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((PaymentChannelInformation)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentInstrumentWalletChecksum;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.transactionToken;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.requestChecksum;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.roneWalletName;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.verifyVpa;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.howToFindUPISteps;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.encryptionData;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((EncryptionData)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.displayAjioWalletAboveLoader;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        f5 = this.totalInternalWalletAmountUsed;
        n4 = UR0.a(f5, n4, n8);
        object = this.loyaltyPointsInfo;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.multipleWalletEnabledAmountMessage;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.notes;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((Notes)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cardTokenizeConsentDetails;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((CardTokenizeConsentDetails)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.eGiftCard;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((GiftCard)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        Boolean bl2 = this.showEmiInstruments;
        if (bl2 != null) {
            n7 = ((Object)bl2).hashCode();
        }
        return n4 + n7;
    }

    public final void setBanners(List list) {
        this.banners = list;
    }

    public final void setCartCheckSum(String string2) {
        this.cartCheckSum = string2;
    }

    public final void setCashOnDeliveryInformation(CashOnDeliveryInformation cashOnDeliveryInformation) {
        this.cashOnDeliveryInformation = cashOnDeliveryInformation;
    }

    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public final void setDisplayAjioWalletAboveLoader(Boolean bl2) {
        this.displayAjioWalletAboveLoader = bl2;
    }

    public final void setEncryptionData(EncryptionData encryptionData) {
        this.encryptionData = encryptionData;
    }

    public final void setError(Error error) {
        this.error = error;
    }

    public final void setFraudEngineResponseDetails(FraudEngineResponse fraudEngineResponse) {
        this.fraudEngineResponseDetails = fraudEngineResponse;
    }

    public final void setHowToFindUPISteps(List list) {
        this.howToFindUPISteps = list;
    }

    public final void setLoyaltyPointsInfo(String string2) {
        this.loyaltyPointsInfo = string2;
    }

    public final void setMessage(String string2) {
        this.message = string2;
    }

    public final void setMultipleInternalWalletServiceEnabled(Boolean bl2) {
        this.multipleInternalWalletServiceEnabled = bl2;
    }

    public final void setMultipleWalletEnabledAmountMessage(String string2) {
        this.multipleWalletEnabledAmountMessage = string2;
    }

    public final void setOrder(Order order) {
        this.order = order;
    }

    public final void setOrderSummary(OrderSummary orderSummary) {
        this.orderSummary = orderSummary;
    }

    public final void setPaymentChannelInformation(PaymentChannelInformation paymentChannelInformation) {
        this.paymentChannelInformation = paymentChannelInformation;
    }

    public final void setPaymentInstrumentDetails(List list) {
        this.paymentInstrumentDetails = list;
    }

    public final void setPaymentInstrumentWalletChecksum(String string2) {
        this.paymentInstrumentWalletChecksum = string2;
    }

    public final void setPaymentMessage(String string2) {
        this.paymentMessage = string2;
    }

    public final void setRequestChecksum(String string2) {
        this.requestChecksum = string2;
    }

    public final void setRoneWalletName(String string2) {
        this.roneWalletName = string2;
    }

    public final void setShowEmiInstruments(Boolean bl2) {
        this.showEmiInstruments = bl2;
    }

    public final void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public final void setTotalInternalWalletAmountUsed(float f5) {
        this.totalInternalWalletAmountUsed = f5;
    }

    public final void setTransactionToken(String string2) {
        this.transactionToken = string2;
    }

    public final void setVerifyVpa(Boolean bl2) {
        this.verifyVpa = bl2;
    }

    public String toString() {
        Object object = this;
        Object object2 = this.tenant;
        Serializable serializable = this.customer;
        Object object3 = this.order;
        Object object4 = this.orderSummary;
        List list = this.banners;
        CashOnDeliveryInformation cashOnDeliveryInformation = this.cashOnDeliveryInformation;
        List list2 = this.paymentInstrumentDetails;
        Error error = this.error;
        String string2 = this.message;
        FraudEngineResponse fraudEngineResponse = this.fraudEngineResponseDetails;
        Boolean bl2 = this.multipleInternalWalletServiceEnabled;
        String string3 = this.paymentMessage;
        String string4 = this.cartCheckSum;
        PaymentChannelInformation paymentChannelInformation = this.paymentChannelInformation;
        String string5 = this.paymentInstrumentWalletChecksum;
        String string6 = this.transactionToken;
        String string7 = this.requestChecksum;
        String string8 = this.roneWalletName;
        Boolean bl3 = this.verifyVpa;
        List list3 = this.howToFindUPISteps;
        EncryptionData encryptionData = this.encryptionData;
        Boolean bl4 = this.displayAjioWalletAboveLoader;
        float f5 = this.totalInternalWalletAmountUsed;
        String string9 = this.loyaltyPointsInfo;
        String string10 = this.multipleWalletEnabledAmountMessage;
        Notes notes = this.notes;
        CardTokenizeConsentDetails cardTokenizeConsentDetails = this.cardTokenizeConsentDetails;
        GiftCard giftCard = this.eGiftCard;
        Boolean bl5 = this.showEmiInstruments;
        object = new StringBuilder("PaymentInstruments(tenant=");
        ((StringBuilder)object).append(object2);
        ((StringBuilder)object).append(", customer=");
        ((StringBuilder)object).append(serializable);
        ((StringBuilder)object).append(", order=");
        ((StringBuilder)object).append(object3);
        ((StringBuilder)object).append(", orderSummary=");
        ((StringBuilder)object).append(object4);
        ((StringBuilder)object).append(", banners=");
        ((StringBuilder)object).append(list);
        ((StringBuilder)object).append(", cashOnDeliveryInformation=");
        ((StringBuilder)object).append(cashOnDeliveryInformation);
        ((StringBuilder)object).append(", paymentInstrumentDetails=");
        ((StringBuilder)object).append(list2);
        ((StringBuilder)object).append(", error=");
        ((StringBuilder)object).append(error);
        ((StringBuilder)object).append(", message=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(", fraudEngineResponseDetails=");
        ((StringBuilder)object).append(fraudEngineResponse);
        ((StringBuilder)object).append(", multipleInternalWalletServiceEnabled=");
        xi0_2.a(bl2, ", paymentMessage=", string3, ", cartCheckSum=", (StringBuilder)object);
        ((StringBuilder)object).append(string4);
        ((StringBuilder)object).append(", paymentChannelInformation=");
        ((StringBuilder)object).append(paymentChannelInformation);
        ((StringBuilder)object).append(", paymentInstrumentWalletChecksum=");
        object3 = string5;
        object4 = string6;
        X50.a((StringBuilder)object, string5, ", transactionToken=", string6, ", requestChecksum=");
        object3 = string7;
        object4 = string8;
        X50.a((StringBuilder)object, string7, ", roneWalletName=", string8, ", verifyVpa=");
        object2 = bl3;
        ((StringBuilder)object).append(bl3);
        ((StringBuilder)object).append(", howToFindUPISteps=");
        object2 = list3;
        ((StringBuilder)object).append(list3);
        ((StringBuilder)object).append(", encryptionData=");
        object2 = encryptionData;
        ((StringBuilder)object).append(encryptionData);
        ((StringBuilder)object).append(", displayAjioWalletAboveLoader=");
        object2 = bl4;
        ((StringBuilder)object).append(bl4);
        ((StringBuilder)object).append(", totalInternalWalletAmountUsed=");
        ((StringBuilder)object).append(f5);
        ((StringBuilder)object).append(", loyaltyPointsInfo=");
        object2 = string9;
        ((StringBuilder)object).append(string9);
        ((StringBuilder)object).append(", multipleWalletEnabledAmountMessage=");
        object2 = string10;
        ((StringBuilder)object).append(string10);
        ((StringBuilder)object).append(", notes=");
        object2 = notes;
        ((StringBuilder)object).append(notes);
        ((StringBuilder)object).append(", cardTokenizeConsentDetails=");
        object2 = cardTokenizeConsentDetails;
        ((StringBuilder)object).append(cardTokenizeConsentDetails);
        ((StringBuilder)object).append(", eGiftCard=");
        object2 = giftCard;
        ((StringBuilder)object).append(giftCard);
        ((StringBuilder)object).append(", showEmiInstruments=");
        serializable = bl5;
        return nx3_0.a((StringBuilder)object, bl5, ")");
    }
}

