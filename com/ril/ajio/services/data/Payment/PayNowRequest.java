/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Card;
import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.EMI;
import com.ril.ajio.services.data.Payment.Loyalty;
import com.ril.ajio.services.data.Payment.NetBanking;
import com.ril.ajio.services.data.Payment.Order;
import com.ril.ajio.services.data.Payment.PaymentChannelInformation;
import com.ril.ajio.services.data.Payment.Tenant;
import com.ril.ajio.services.data.Payment.UPI;
import com.ril.ajio.services.data.Payment.Wallet;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PayNowRequest {
    private String accesToken;
    private Card card;
    private Customer customer;
    private EMI emi;
    private String encryptedCardInfo;
    private boolean encryptedPaymentInstrumentPresent;
    private String isLRManaged;
    private Loyalty loyalty;
    private NetBanking netBanking;
    private Float netPayableAmount;
    private Map offerDetails;
    private String onepTotalPrice;
    private Order order;
    private PaymentChannelInformation paymentChannelInformation;
    private String paymentEngineTransactionId;
    private String paymentInstrument;
    private String reason;
    private String registeredMobile;
    private Tenant tenant;
    private String threepTotalPrice;
    private UPI upi;
    private Wallet wallet;

    public PayNowRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, 0x3FFFFF, null);
    }

    public PayNowRequest(PaymentChannelInformation paymentChannelInformation, String string2, Card card, Tenant tenant, NetBanking netBanking, Wallet wallet, UPI uPI, Customer customer, Order order, Loyalty loyalty, String string3, String string4, String string5, String string6, Map map2, Float f5, String string7, String string8, String string9, boolean bl2, String string10, EMI eMI) {
        this.paymentChannelInformation = paymentChannelInformation;
        this.paymentInstrument = string2;
        this.card = card;
        this.tenant = tenant;
        this.netBanking = netBanking;
        this.wallet = wallet;
        this.upi = uPI;
        this.customer = customer;
        this.order = order;
        this.loyalty = loyalty;
        this.isLRManaged = string3;
        this.registeredMobile = string4;
        this.paymentEngineTransactionId = string5;
        this.reason = string6;
        this.offerDetails = map2;
        this.netPayableAmount = f5;
        this.accesToken = string7;
        this.onepTotalPrice = string8;
        this.threepTotalPrice = string9;
        this.encryptedPaymentInstrumentPresent = bl2;
        this.encryptedCardInfo = string10;
        this.emi = eMI;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ PayNowRequest(PaymentChannelInformation object, String object2, Card object3, Tenant object4, NetBanking object5, Wallet object6, UPI object7, Customer object8, Order serializable, Loyalty serializable2, String object9, String string2, String string3, String string4, Map object10, Float object11, String object12, String string5, String string6, boolean bl2, String string7, EMI object13, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        void var64_67;
        Object object14;
        String string8;
        String string9;
        String string10;
        Object string11;
        Object f5;
        Object map2;
        String string12;
        String string13;
        String string14;
        Object string15;
        Serializable loyalty;
        Serializable order;
        Object customer;
        Object uPI;
        Object wallet;
        Object netBanking;
        Object tenant;
        Object card;
        Object string16;
        Object paymentChannelInformation;
        int n4 = n3;
        int n7 = n3 & 1;
        if (n7 != 0) {
            n7 = 0;
            paymentChannelInformation = null;
        } else {
            paymentChannelInformation = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string16 = null;
        } else {
            string16 = object2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            card = null;
        } else {
            card = object3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            tenant = null;
        } else {
            tenant = object4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            netBanking = null;
        } else {
            netBanking = object5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            wallet = null;
        } else {
            wallet = object6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            uPI = null;
        } else {
            uPI = object7;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            customer = null;
        } else {
            customer = object8;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            order = null;
        } else {
            order = serializable;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            loyalty = null;
        } else {
            loyalty = serializable2;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string15 = null;
        } else {
            string15 = object9;
        }
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            n22 = 0;
            string14 = null;
        } else {
            string14 = string2;
        }
        int n24 = n4 & 0x1000;
        if (n24 != 0) {
            n24 = 0;
            string13 = null;
        } else {
            string13 = string3;
        }
        int n25 = n4 & 0x2000;
        if (n25 != 0) {
            n25 = 0;
            string12 = null;
        } else {
            string12 = string4;
        }
        int n26 = n4 & 0x4000;
        if (n26 != 0) {
            n26 = 0;
            map2 = null;
        } else {
            map2 = object10;
        }
        int n27 = n4 & 0x8000;
        if (n27 != 0) {
            n27 = 0;
            f5 = Float.valueOf(0.0f);
        } else {
            f5 = object11;
        }
        int n28 = n4 & 0x10000;
        if (n28 != 0) {
            n28 = 0;
            string11 = null;
        } else {
            string11 = object12;
        }
        int n29 = n4 & 0x20000;
        if (n29 != 0) {
            n29 = 0;
            string10 = null;
        } else {
            string10 = string5;
        }
        int n30 = n4 & 0x40000;
        if (n30 != 0) {
            n30 = 0;
            string9 = null;
        } else {
            string9 = string6;
        }
        int bl3 = n4 & 0x80000;
        if (bl3 != 0) {
            boolean bl4 = false;
        } else {
            boolean bl5 = bl2;
        }
        int n32 = n4 & 0x100000;
        if (n32 != 0) {
            n32 = 0;
            string8 = null;
        } else {
            string8 = string7;
        }
        int n34 = 0x200000;
        if ((n4 &= n34) != 0) {
            n4 = 0;
            object14 = null;
        } else {
            object14 = object13;
        }
        object = this;
        object2 = paymentChannelInformation;
        object3 = string16;
        object4 = card;
        object5 = tenant;
        object6 = netBanking;
        object7 = wallet;
        object8 = uPI;
        serializable = customer;
        serializable2 = order;
        object9 = loyalty;
        string2 = string15;
        string3 = string14;
        string4 = string13;
        object10 = string12;
        object11 = map2;
        object12 = f5;
        string5 = string11;
        string6 = string10;
        object13 = string8;
        this((PaymentChannelInformation)paymentChannelInformation, (String)string16, (Card)card, (Tenant)tenant, (NetBanking)netBanking, (Wallet)wallet, (UPI)uPI, (Customer)customer, (Order)order, (Loyalty)loyalty, (String)string15, string14, string13, string12, (Map)map2, (Float)f5, (String)string11, string10, string9, (boolean)var64_67, string8, (EMI)object14);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ PayNowRequest copy$default(PayNowRequest payNowRequest, PaymentChannelInformation paymentChannelInformation, String string2, Card card, Tenant tenant, NetBanking netBanking, Wallet wallet, UPI uPI, Customer customer, Order order, Loyalty loyalty, String string3, String string4, String string5, String string6, Map object, Float object2, String object3, String object4, String object5, boolean bl2, String object6, EMI eMI, int n3, Object object7) {
        EMI eMI2;
        Object object8;
        void var23_24;
        PayNowRequest payNowRequest2 = payNowRequest;
        int n4 = var23_24;
        int n7 = var23_24 & 1;
        PaymentChannelInformation paymentChannelInformation2 = n7 != 0 ? payNowRequest.paymentChannelInformation : paymentChannelInformation;
        int n8 = n4 & 2;
        String string7 = n8 != 0 ? payNowRequest2.paymentInstrument : string2;
        int n10 = n4 & 4;
        Card card2 = n10 != 0 ? payNowRequest2.card : card;
        int n14 = n4 & 8;
        Tenant tenant2 = n14 != 0 ? payNowRequest2.tenant : tenant;
        int n15 = n4 & 0x10;
        NetBanking netBanking2 = n15 != 0 ? payNowRequest2.netBanking : netBanking;
        int n16 = n4 & 0x20;
        Wallet wallet2 = n16 != 0 ? payNowRequest2.wallet : wallet;
        int n17 = n4 & 0x40;
        UPI uPI2 = n17 != 0 ? payNowRequest2.upi : uPI;
        int n18 = n4 & 0x80;
        Customer customer2 = n18 != 0 ? payNowRequest2.customer : customer;
        int n19 = n4 & 0x100;
        Order order2 = n19 != 0 ? payNowRequest2.order : order;
        int n20 = n4 & 0x200;
        Loyalty loyalty2 = n20 != 0 ? payNowRequest2.loyalty : loyalty;
        int n21 = n4 & 0x400;
        String string8 = n21 != 0 ? payNowRequest2.isLRManaged : string3;
        int n22 = n4 & 0x800;
        String string9 = n22 != 0 ? payNowRequest2.registeredMobile : string4;
        int n24 = n4 & 0x1000;
        String string10 = n24 != 0 ? payNowRequest2.paymentEngineTransactionId : string5;
        boolean bl3 = n4 & 0x2000;
        Object object9 = bl3 ? payNowRequest2.reason : string6;
        string6 = object9;
        bl3 = n4 & 0x4000;
        object9 = bl3 ? payNowRequest2.offerDetails : object;
        int n25 = n4 & 0x8000;
        object = object9;
        object9 = n25 != 0 ? payNowRequest2.netPayableAmount : object2;
        n25 = n4 & 0x10000;
        object2 = object9;
        object9 = n25 != 0 ? payNowRequest2.accesToken : object3;
        n25 = n4 & 0x20000;
        object3 = object9;
        object9 = n25 != 0 ? payNowRequest2.onepTotalPrice : object4;
        n25 = n4 & 0x40000;
        object4 = object9;
        object9 = n25 != 0 ? payNowRequest2.threepTotalPrice : object5;
        n25 = n4 & 0x80000;
        object5 = object9;
        bl3 = n25 != 0 ? (boolean)payNowRequest2.encryptedPaymentInstrumentPresent : (boolean)bl2;
        n25 = n4 & 0x100000;
        boolean bl4 = bl3;
        object9 = n25 != 0 ? payNowRequest2.encryptedCardInfo : object8;
        n25 = 0x200000;
        EMI eMI3 = (n4 &= n25) != 0 ? payNowRequest2.emi : eMI2;
        paymentChannelInformation = paymentChannelInformation2;
        string2 = string7;
        card = card2;
        tenant = tenant2;
        netBanking = netBanking2;
        wallet = wallet2;
        uPI = uPI2;
        customer = customer2;
        order = order2;
        loyalty = loyalty2;
        string3 = string8;
        string4 = string9;
        string5 = string10;
        object8 = object9;
        eMI2 = eMI3;
        return payNowRequest.copy(paymentChannelInformation2, string7, card2, tenant2, netBanking2, wallet2, uPI2, customer2, order2, loyalty2, string8, string9, string10, string6, (Map)object, (Float)object2, (String)object3, (String)object4, (String)object5, bl4, (String)object9, eMI3);
    }

    public final PaymentChannelInformation component1() {
        return this.paymentChannelInformation;
    }

    public final Loyalty component10() {
        return this.loyalty;
    }

    public final String component11() {
        return this.isLRManaged;
    }

    public final String component12() {
        return this.registeredMobile;
    }

    public final String component13() {
        return this.paymentEngineTransactionId;
    }

    public final String component14() {
        return this.reason;
    }

    public final Map component15() {
        return this.offerDetails;
    }

    public final Float component16() {
        return this.netPayableAmount;
    }

    public final String component17() {
        return this.accesToken;
    }

    public final String component18() {
        return this.onepTotalPrice;
    }

    public final String component19() {
        return this.threepTotalPrice;
    }

    public final String component2() {
        return this.paymentInstrument;
    }

    public final boolean component20() {
        return this.encryptedPaymentInstrumentPresent;
    }

    public final String component21() {
        return this.encryptedCardInfo;
    }

    public final EMI component22() {
        return this.emi;
    }

    public final Card component3() {
        return this.card;
    }

    public final Tenant component4() {
        return this.tenant;
    }

    public final NetBanking component5() {
        return this.netBanking;
    }

    public final Wallet component6() {
        return this.wallet;
    }

    public final UPI component7() {
        return this.upi;
    }

    public final Customer component8() {
        return this.customer;
    }

    public final Order component9() {
        return this.order;
    }

    public final PayNowRequest copy(PaymentChannelInformation paymentChannelInformation, String string2, Card card, Tenant tenant, NetBanking netBanking, Wallet wallet, UPI uPI, Customer customer, Order order, Loyalty loyalty, String string3, String string4, String string5, String string6, Map map2, Float f5, String string7, String string8, String string9, boolean bl2, String string10, EMI eMI) {
        PayNowRequest payNowRequest = new PayNowRequest(paymentChannelInformation, string2, card, tenant, netBanking, wallet, uPI, customer, order, loyalty, string3, string4, string5, string6, map2, f5, string7, string8, string9, bl2, string10, eMI);
        return payNowRequest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PayNowRequest;
        if (!bl3) {
            return false;
        }
        object = (PayNowRequest)object;
        Object object2 = this.paymentChannelInformation;
        Object object3 = ((PayNowRequest)object).paymentChannelInformation;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentInstrument;
        object3 = ((PayNowRequest)object).paymentInstrument;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.card;
        object3 = ((PayNowRequest)object).card;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tenant;
        object3 = ((PayNowRequest)object).tenant;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.netBanking;
        object3 = ((PayNowRequest)object).netBanking;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.wallet;
        object3 = ((PayNowRequest)object).wallet;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.upi;
        object3 = ((PayNowRequest)object).upi;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.customer;
        object3 = ((PayNowRequest)object).customer;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.order;
        object3 = ((PayNowRequest)object).order;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.loyalty;
        object3 = ((PayNowRequest)object).loyalty;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isLRManaged;
        object3 = ((PayNowRequest)object).isLRManaged;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.registeredMobile;
        object3 = ((PayNowRequest)object).registeredMobile;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentEngineTransactionId;
        object3 = ((PayNowRequest)object).paymentEngineTransactionId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reason;
        object3 = ((PayNowRequest)object).reason;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerDetails;
        object3 = ((PayNowRequest)object).offerDetails;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.netPayableAmount;
        object3 = ((PayNowRequest)object).netPayableAmount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.accesToken;
        object3 = ((PayNowRequest)object).accesToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.onepTotalPrice;
        object3 = ((PayNowRequest)object).onepTotalPrice;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.threepTotalPrice;
        object3 = ((PayNowRequest)object).threepTotalPrice;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.encryptedPaymentInstrumentPresent;
        boolean bl4 = ((PayNowRequest)object).encryptedPaymentInstrumentPresent;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.encryptedCardInfo;
        object3 = ((PayNowRequest)object).encryptedCardInfo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.emi;
        object = ((PayNowRequest)object).emi;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final String getAccesToken() {
        return this.accesToken;
    }

    public final Card getCard() {
        return this.card;
    }

    public final Customer getCustomer() {
        return this.customer;
    }

    public final EMI getEmi() {
        return this.emi;
    }

    public final String getEncryptedCardInfo() {
        return this.encryptedCardInfo;
    }

    public final boolean getEncryptedPaymentInstrumentPresent() {
        return this.encryptedPaymentInstrumentPresent;
    }

    public final Loyalty getLoyalty() {
        return this.loyalty;
    }

    public final NetBanking getNetBanking() {
        return this.netBanking;
    }

    public final Float getNetPayableAmount() {
        return this.netPayableAmount;
    }

    public final Map getOfferDetails() {
        return this.offerDetails;
    }

    public final String getOnepTotalPrice() {
        return this.onepTotalPrice;
    }

    public final Order getOrder() {
        return this.order;
    }

    public final PaymentChannelInformation getPaymentChannelInformation() {
        return this.paymentChannelInformation;
    }

    public final String getPaymentEngineTransactionId() {
        return this.paymentEngineTransactionId;
    }

    public final String getPaymentInstrument() {
        return this.paymentInstrument;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRegisteredMobile() {
        return this.registeredMobile;
    }

    public final Tenant getTenant() {
        return this.tenant;
    }

    public final String getThreepTotalPrice() {
        return this.threepTotalPrice;
    }

    public final UPI getUpi() {
        return this.upi;
    }

    public final Wallet getWallet() {
        return this.wallet;
    }

    public int hashCode() {
        int n3;
        int n4;
        PaymentChannelInformation paymentChannelInformation = this.paymentChannelInformation;
        int n7 = 0;
        if (paymentChannelInformation == null) {
            n4 = 0;
            paymentChannelInformation = null;
        } else {
            n4 = paymentChannelInformation.hashCode();
        }
        n4 *= 31;
        Object object = this.paymentInstrument;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.card;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Card)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.tenant;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Tenant)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.netBanking;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((NetBanking)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.wallet;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Wallet)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.upi;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((UPI)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.customer;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Customer)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.order;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Order)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.loyalty;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Loyalty)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isLRManaged;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.registeredMobile;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentEngineTransactionId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.reason;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.offerDetails;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.netPayableAmount;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.accesToken;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.onepTotalPrice;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.threepTotalPrice;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.encryptedPaymentInstrumentPresent ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.encryptedCardInfo;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.emi;
        if (object != null) {
            n7 = ((EMI)object).hashCode();
        }
        return n4 + n7;
    }

    public final String isLRManaged() {
        return this.isLRManaged;
    }

    public final void setAccesToken(String string2) {
        this.accesToken = string2;
    }

    public final void setCard(Card card) {
        this.card = card;
    }

    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public final void setEmi(EMI eMI) {
        this.emi = eMI;
    }

    public final void setEncryptedCardInfo(String string2) {
        this.encryptedCardInfo = string2;
    }

    public final void setEncryptedPaymentInstrumentPresent(boolean bl2) {
        this.encryptedPaymentInstrumentPresent = bl2;
    }

    public final void setLRManaged(String string2) {
        this.isLRManaged = string2;
    }

    public final void setLoyalty(Loyalty loyalty) {
        this.loyalty = loyalty;
    }

    public final void setNetBanking(NetBanking netBanking) {
        this.netBanking = netBanking;
    }

    public final void setNetPayableAmount(Float f5) {
        this.netPayableAmount = f5;
    }

    public final void setOfferDetails(Map map2) {
        this.offerDetails = map2;
    }

    public final void setOnepTotalPrice(String string2) {
        this.onepTotalPrice = string2;
    }

    public final void setOrder(Order order) {
        this.order = order;
    }

    public final void setPaymentChannelInformation(PaymentChannelInformation paymentChannelInformation) {
        this.paymentChannelInformation = paymentChannelInformation;
    }

    public final void setPaymentEngineTransactionId(String string2) {
        this.paymentEngineTransactionId = string2;
    }

    public final void setPaymentInstrument(String string2) {
        this.paymentInstrument = string2;
    }

    public final void setReason(String string2) {
        this.reason = string2;
    }

    public final void setRegisteredMobile(String string2) {
        this.registeredMobile = string2;
    }

    public final void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public final void setThreepTotalPrice(String string2) {
        this.threepTotalPrice = string2;
    }

    public final void setUpi(UPI uPI) {
        this.upi = uPI;
    }

    public final void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public String toString() {
        Object object = this;
        Object object2 = this.paymentChannelInformation;
        String string2 = this.paymentInstrument;
        Object object3 = this.card;
        Object object4 = this.tenant;
        NetBanking netBanking = this.netBanking;
        Wallet wallet = this.wallet;
        UPI uPI = this.upi;
        Customer customer = this.customer;
        Order order = this.order;
        Loyalty loyalty = this.loyalty;
        String string3 = this.isLRManaged;
        String string4 = this.registeredMobile;
        String string5 = this.paymentEngineTransactionId;
        String string6 = this.reason;
        Map map2 = this.offerDetails;
        Float f5 = this.netPayableAmount;
        String string7 = this.accesToken;
        String string8 = this.onepTotalPrice;
        String string9 = this.threepTotalPrice;
        boolean bl2 = this.encryptedPaymentInstrumentPresent;
        String string10 = this.encryptedCardInfo;
        EMI eMI = this.emi;
        object = new StringBuilder("PayNowRequest(paymentChannelInformation=");
        ((StringBuilder)object).append(object2);
        ((StringBuilder)object).append(", paymentInstrument=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(", card=");
        ((StringBuilder)object).append(object3);
        ((StringBuilder)object).append(", tenant=");
        ((StringBuilder)object).append(object4);
        ((StringBuilder)object).append(", netBanking=");
        ((StringBuilder)object).append(netBanking);
        ((StringBuilder)object).append(", wallet=");
        ((StringBuilder)object).append(wallet);
        ((StringBuilder)object).append(", upi=");
        ((StringBuilder)object).append(uPI);
        ((StringBuilder)object).append(", customer=");
        ((StringBuilder)object).append(customer);
        ((StringBuilder)object).append(", order=");
        ((StringBuilder)object).append(order);
        ((StringBuilder)object).append(", loyalty=");
        ((StringBuilder)object).append(loyalty);
        ((StringBuilder)object).append(", isLRManaged=");
        X50.a((StringBuilder)object, string3, ", registeredMobile=", string4, ", paymentEngineTransactionId=");
        X50.a((StringBuilder)object, string5, ", reason=", string6, ", offerDetails=");
        object2 = map2;
        ((StringBuilder)object).append(map2);
        ((StringBuilder)object).append(", netPayableAmount=");
        object2 = f5;
        ((StringBuilder)object).append(f5);
        ((StringBuilder)object).append(", accesToken=");
        object3 = string7;
        object4 = string8;
        X50.a((StringBuilder)object, string7, ", onepTotalPrice=", string8, ", threepTotalPrice=");
        object2 = string9;
        ((StringBuilder)object).append(string9);
        ((StringBuilder)object).append(", encryptedPaymentInstrumentPresent=");
        ((StringBuilder)object).append(bl2);
        ((StringBuilder)object).append(", encryptedCardInfo=");
        object2 = string10;
        ((StringBuilder)object).append(string10);
        ((StringBuilder)object).append(", emi=");
        object2 = eMI;
        ((StringBuilder)object).append(eMI);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }
}

