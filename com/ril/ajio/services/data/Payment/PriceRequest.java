/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.Loyalty;
import com.ril.ajio.services.data.Payment.Order;
import com.ril.ajio.services.data.Payment.PaymentChannelInformation;
import com.ril.ajio.services.data.Payment.Tenant;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PriceRequest {
    private String accessToken;
    private Float amount;
    private String cardNumber;
    private Customer customer;
    private String instrumentInstanceCode;
    private List internalWallets;
    private String isLRManaged;
    private Loyalty loyalty;
    private String netPayableAmount;
    private Order order;
    private PaymentChannelInformation paymentChannelInformation;
    private String paymentInstrument;
    private String paymentInstrumentId;
    private String refreshChecksum;
    private String splitUpId;
    private Tenant tenant;
    private String tenantTransactionId;
    private String totalAmount;
    private String transactionToken;
    private String userToken;

    public PriceRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public PriceRequest(String string2, Float f5, String string3, Loyalty loyalty, String string4, Tenant tenant, String string5, Order order, Customer customer, PaymentChannelInformation paymentChannelInformation, List list, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14) {
        this.accessToken = string2;
        this.amount = f5;
        this.splitUpId = string3;
        this.loyalty = loyalty;
        this.cardNumber = string4;
        this.tenant = tenant;
        this.isLRManaged = string5;
        this.order = order;
        this.customer = customer;
        this.paymentChannelInformation = paymentChannelInformation;
        this.internalWallets = list;
        this.paymentInstrumentId = string6;
        this.transactionToken = string7;
        this.userToken = string8;
        this.instrumentInstanceCode = string9;
        this.paymentInstrument = string10;
        this.refreshChecksum = string11;
        this.totalAmount = string12;
        this.netPayableAmount = string13;
        this.tenantTransactionId = string14;
    }

    public /* synthetic */ PriceRequest(String object, Float object2, String object3, Loyalty object4, String object5, Tenant object6, String object7, Order object8, Customer serializable, PaymentChannelInformation serializable2, List object9, String object10, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        List list;
        PaymentChannelInformation paymentChannelInformation;
        Customer customer;
        Order order;
        String string19;
        Tenant tenant;
        String string20;
        Loyalty loyalty;
        String string21;
        Float f5;
        String string22;
        int n4 = n3;
        int n7 = n3 & 1;
        if (n7 != 0) {
            n7 = 0;
            string22 = null;
        } else {
            string22 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            f5 = Float.valueOf(0.0f);
        } else {
            f5 = object2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string21 = null;
        } else {
            string21 = object3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            loyalty = null;
        } else {
            loyalty = object4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string20 = null;
        } else {
            string20 = object5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            tenant = null;
        } else {
            tenant = object6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string19 = null;
        } else {
            string19 = object7;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            order = null;
        } else {
            order = object8;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            customer = null;
        } else {
            customer = serializable;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            paymentChannelInformation = null;
        } else {
            paymentChannelInformation = serializable2;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            list = null;
        } else {
            list = object9;
        }
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            n22 = 0;
            string18 = null;
        } else {
            string18 = object10;
        }
        int n24 = n4 & 0x1000;
        if (n24 != 0) {
            n24 = 0;
            string17 = null;
        } else {
            string17 = string2;
        }
        int n25 = n4 & 0x2000;
        if (n25 != 0) {
            n25 = 0;
            string16 = null;
        } else {
            string16 = string3;
        }
        int n26 = n4 & 0x4000;
        if (n26 != 0) {
            n26 = 0;
            string15 = null;
        } else {
            string15 = string4;
        }
        int n27 = n4 & 0x8000;
        if (n27 != 0) {
            n27 = 0;
            string14 = null;
        } else {
            string14 = string5;
        }
        int n28 = n4 & 0x10000;
        if (n28 != 0) {
            n28 = 0;
            string13 = null;
        } else {
            string13 = string6;
        }
        int n29 = n4 & 0x20000;
        if (n29 != 0) {
            n29 = 0;
            string12 = null;
        } else {
            string12 = string7;
        }
        int n30 = n4 & 0x40000;
        if (n30 != 0) {
            n30 = 0;
            string11 = null;
        } else {
            string11 = string8;
        }
        int n32 = 524288;
        if ((n4 &= n32) != 0) {
            n4 = 0;
            string10 = null;
        } else {
            string10 = string9;
        }
        object = this;
        object2 = string22;
        object3 = f5;
        object4 = string21;
        object5 = loyalty;
        object6 = string20;
        object7 = tenant;
        object8 = string19;
        serializable = order;
        serializable2 = customer;
        object9 = paymentChannelInformation;
        object10 = list;
        string2 = string18;
        string3 = string17;
        string4 = string16;
        string5 = string15;
        string6 = string14;
        string7 = string13;
        string8 = string12;
        string9 = string11;
        this(string22, f5, string21, loyalty, string20, tenant, string19, order, customer, paymentChannelInformation, list, string18, string17, string16, string15, string14, string13, string12, string11, string10);
    }

    public static /* synthetic */ PriceRequest copy$default(PriceRequest priceRequest, String string2, Float f5, String string3, Loyalty loyalty, String string4, Tenant tenant, String string5, Order order, Customer customer, PaymentChannelInformation paymentChannelInformation, List list, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, int n3, Object object) {
        PriceRequest priceRequest2 = priceRequest;
        int n4 = n3;
        int n7 = n3 & 1;
        String string15 = n7 != 0 ? priceRequest.accessToken : string2;
        int n8 = n4 & 2;
        Float f6 = n8 != 0 ? priceRequest2.amount : f5;
        int n10 = n4 & 4;
        String string16 = n10 != 0 ? priceRequest2.splitUpId : string3;
        int n14 = n4 & 8;
        Loyalty loyalty2 = n14 != 0 ? priceRequest2.loyalty : loyalty;
        int n15 = n4 & 0x10;
        String string17 = n15 != 0 ? priceRequest2.cardNumber : string4;
        int n16 = n4 & 0x20;
        Tenant tenant2 = n16 != 0 ? priceRequest2.tenant : tenant;
        int n17 = n4 & 0x40;
        String string18 = n17 != 0 ? priceRequest2.isLRManaged : string5;
        int n18 = n4 & 0x80;
        Order order2 = n18 != 0 ? priceRequest2.order : order;
        int n19 = n4 & 0x100;
        Customer customer2 = n19 != 0 ? priceRequest2.customer : customer;
        int n20 = n4 & 0x200;
        PaymentChannelInformation paymentChannelInformation2 = n20 != 0 ? priceRequest2.paymentChannelInformation : paymentChannelInformation;
        int n21 = n4 & 0x400;
        List list2 = n21 != 0 ? priceRequest2.internalWallets : list;
        int n22 = n4 & 0x800;
        String string19 = n22 != 0 ? priceRequest2.paymentInstrumentId : string6;
        int n24 = n4 & 0x1000;
        String string20 = n24 != 0 ? priceRequest2.transactionToken : string7;
        int n25 = n4 & 0x2000;
        String string21 = n25 != 0 ? priceRequest2.userToken : string8;
        string8 = string21;
        n25 = n4 & 0x4000;
        string21 = n25 != 0 ? priceRequest2.instrumentInstanceCode : string9;
        int n26 = n4 & 0x8000;
        string9 = string21;
        string21 = n26 != 0 ? priceRequest2.paymentInstrument : string10;
        n26 = n4 & 0x10000;
        string10 = string21;
        string21 = n26 != 0 ? priceRequest2.refreshChecksum : string11;
        n26 = n4 & 0x20000;
        string11 = string21;
        string21 = n26 != 0 ? priceRequest2.totalAmount : string12;
        n26 = n4 & 0x40000;
        string12 = string21;
        string21 = n26 != 0 ? priceRequest2.netPayableAmount : string13;
        n26 = 524288;
        String string22 = (n4 &= n26) != 0 ? priceRequest2.tenantTransactionId : string14;
        string2 = string15;
        f5 = f6;
        string3 = string16;
        loyalty = loyalty2;
        string4 = string17;
        tenant = tenant2;
        string5 = string18;
        order = order2;
        customer = customer2;
        paymentChannelInformation = paymentChannelInformation2;
        list = list2;
        string6 = string19;
        string7 = string20;
        string13 = string21;
        string14 = string22;
        return priceRequest.copy(string15, f6, string16, loyalty2, string17, tenant2, string18, order2, customer2, paymentChannelInformation2, list2, string19, string20, string8, string9, string10, string11, string12, string21, string22);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final PaymentChannelInformation component10() {
        return this.paymentChannelInformation;
    }

    public final List component11() {
        return this.internalWallets;
    }

    public final String component12() {
        return this.paymentInstrumentId;
    }

    public final String component13() {
        return this.transactionToken;
    }

    public final String component14() {
        return this.userToken;
    }

    public final String component15() {
        return this.instrumentInstanceCode;
    }

    public final String component16() {
        return this.paymentInstrument;
    }

    public final String component17() {
        return this.refreshChecksum;
    }

    public final String component18() {
        return this.totalAmount;
    }

    public final String component19() {
        return this.netPayableAmount;
    }

    public final Float component2() {
        return this.amount;
    }

    public final String component20() {
        return this.tenantTransactionId;
    }

    public final String component3() {
        return this.splitUpId;
    }

    public final Loyalty component4() {
        return this.loyalty;
    }

    public final String component5() {
        return this.cardNumber;
    }

    public final Tenant component6() {
        return this.tenant;
    }

    public final String component7() {
        return this.isLRManaged;
    }

    public final Order component8() {
        return this.order;
    }

    public final Customer component9() {
        return this.customer;
    }

    public final PriceRequest copy(String string2, Float f5, String string3, Loyalty loyalty, String string4, Tenant tenant, String string5, Order order, Customer customer, PaymentChannelInformation paymentChannelInformation, List list, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14) {
        PriceRequest priceRequest = new PriceRequest(string2, f5, string3, loyalty, string4, tenant, string5, order, customer, paymentChannelInformation, list, string6, string7, string8, string9, string10, string11, string12, string13, string14);
        return priceRequest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PriceRequest;
        if (!bl3) {
            return false;
        }
        object = (PriceRequest)object;
        Object object2 = this.accessToken;
        Object object3 = ((PriceRequest)object).accessToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.amount;
        object3 = ((PriceRequest)object).amount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.splitUpId;
        object3 = ((PriceRequest)object).splitUpId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.loyalty;
        object3 = ((PriceRequest)object).loyalty;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cardNumber;
        object3 = ((PriceRequest)object).cardNumber;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tenant;
        object3 = ((PriceRequest)object).tenant;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isLRManaged;
        object3 = ((PriceRequest)object).isLRManaged;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.order;
        object3 = ((PriceRequest)object).order;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.customer;
        object3 = ((PriceRequest)object).customer;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentChannelInformation;
        object3 = ((PriceRequest)object).paymentChannelInformation;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.internalWallets;
        object3 = ((PriceRequest)object).internalWallets;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentInstrumentId;
        object3 = ((PriceRequest)object).paymentInstrumentId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.transactionToken;
        object3 = ((PriceRequest)object).transactionToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.userToken;
        object3 = ((PriceRequest)object).userToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.instrumentInstanceCode;
        object3 = ((PriceRequest)object).instrumentInstanceCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentInstrument;
        object3 = ((PriceRequest)object).paymentInstrument;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.refreshChecksum;
        object3 = ((PriceRequest)object).refreshChecksum;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.totalAmount;
        object3 = ((PriceRequest)object).totalAmount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.netPayableAmount;
        object3 = ((PriceRequest)object).netPayableAmount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tenantTransactionId;
        object = ((PriceRequest)object).tenantTransactionId;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final Float getAmount() {
        return this.amount;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final Customer getCustomer() {
        return this.customer;
    }

    public final String getInstrumentInstanceCode() {
        return this.instrumentInstanceCode;
    }

    public final List getInternalWallets() {
        return this.internalWallets;
    }

    public final Loyalty getLoyalty() {
        return this.loyalty;
    }

    public final String getNetPayableAmount() {
        return this.netPayableAmount;
    }

    public final Order getOrder() {
        return this.order;
    }

    public final PaymentChannelInformation getPaymentChannelInformation() {
        return this.paymentChannelInformation;
    }

    public final String getPaymentInstrument() {
        return this.paymentInstrument;
    }

    public final String getPaymentInstrumentId() {
        return this.paymentInstrumentId;
    }

    public final String getRefreshChecksum() {
        return this.refreshChecksum;
    }

    public final String getSplitUpId() {
        return this.splitUpId;
    }

    public final Tenant getTenant() {
        return this.tenant;
    }

    public final String getTenantTransactionId() {
        return this.tenantTransactionId;
    }

    public final String getTotalAmount() {
        return this.totalAmount;
    }

    public final String getTransactionToken() {
        return this.transactionToken;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.accessToken;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.amount;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.splitUpId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
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
        object = this.cardNumber;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
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
        object = this.isLRManaged;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
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
        object = this.customer;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Customer)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentChannelInformation;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((PaymentChannelInformation)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.internalWallets;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentInstrumentId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.transactionToken;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.userToken;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.instrumentInstanceCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentInstrument;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.refreshChecksum;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.totalAmount;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.netPayableAmount;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.tenantTransactionId;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final String isLRManaged() {
        return this.isLRManaged;
    }

    public final void setAccessToken(String string2) {
        this.accessToken = string2;
    }

    public final void setAmount(Float f5) {
        this.amount = f5;
    }

    public final void setCardNumber(String string2) {
        this.cardNumber = string2;
    }

    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public final void setInstrumentInstanceCode(String string2) {
        this.instrumentInstanceCode = string2;
    }

    public final void setInternalWallets(List list) {
        this.internalWallets = list;
    }

    public final void setLRManaged(String string2) {
        this.isLRManaged = string2;
    }

    public final void setLoyalty(Loyalty loyalty) {
        this.loyalty = loyalty;
    }

    public final void setNetPayableAmount(String string2) {
        this.netPayableAmount = string2;
    }

    public final void setOrder(Order order) {
        this.order = order;
    }

    public final void setPaymentChannelInformation(PaymentChannelInformation paymentChannelInformation) {
        this.paymentChannelInformation = paymentChannelInformation;
    }

    public final void setPaymentInstrument(String string2) {
        this.paymentInstrument = string2;
    }

    public final void setPaymentInstrumentId(String string2) {
        this.paymentInstrumentId = string2;
    }

    public final void setRefreshChecksum(String string2) {
        this.refreshChecksum = string2;
    }

    public final void setSplitUpId(String string2) {
        this.splitUpId = string2;
    }

    public final void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public final void setTenantTransactionId(String string2) {
        this.tenantTransactionId = string2;
    }

    public final void setTotalAmount(String string2) {
        this.totalAmount = string2;
    }

    public final void setTransactionToken(String string2) {
        this.transactionToken = string2;
    }

    public final void setUserToken(String string2) {
        this.userToken = string2;
    }

    public String toString() {
        Object object = this;
        String string2 = this.accessToken;
        Float f5 = this.amount;
        String string3 = this.splitUpId;
        Object object2 = this.loyalty;
        String string4 = this.cardNumber;
        Tenant tenant = this.tenant;
        String string5 = this.isLRManaged;
        Order order = this.order;
        Customer customer = this.customer;
        PaymentChannelInformation paymentChannelInformation = this.paymentChannelInformation;
        List list = this.internalWallets;
        String string6 = this.paymentInstrumentId;
        String string7 = this.transactionToken;
        String string8 = this.userToken;
        String string9 = this.instrumentInstanceCode;
        String string10 = this.paymentInstrument;
        String string11 = this.refreshChecksum;
        String string12 = this.totalAmount;
        String string13 = this.netPayableAmount;
        String string14 = this.tenantTransactionId;
        object = new StringBuilder("PriceRequest(accessToken=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(", amount=");
        ((StringBuilder)object).append(f5);
        ((StringBuilder)object).append(", splitUpId=");
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append(", loyalty=");
        ((StringBuilder)object).append(object2);
        ((StringBuilder)object).append(", cardNumber=");
        ((StringBuilder)object).append(string4);
        ((StringBuilder)object).append(", tenant=");
        ((StringBuilder)object).append(tenant);
        ((StringBuilder)object).append(", isLRManaged=");
        ((StringBuilder)object).append(string5);
        ((StringBuilder)object).append(", order=");
        ((StringBuilder)object).append(order);
        ((StringBuilder)object).append(", customer=");
        ((StringBuilder)object).append(customer);
        ((StringBuilder)object).append(", paymentChannelInformation=");
        ((StringBuilder)object).append(paymentChannelInformation);
        ((StringBuilder)object).append(", internalWallets=");
        ((StringBuilder)object).append(list);
        ((StringBuilder)object).append(", paymentInstrumentId=");
        ((StringBuilder)object).append(string6);
        ((StringBuilder)object).append(", transactionToken=");
        X50.a((StringBuilder)object, string7, ", userToken=", string8, ", instrumentInstanceCode=");
        string3 = string9;
        object2 = string10;
        X50.a((StringBuilder)object, string9, ", paymentInstrument=", string10, ", refreshChecksum=");
        string3 = string11;
        object2 = string12;
        X50.a((StringBuilder)object, string11, ", totalAmount=", string12, ", netPayableAmount=");
        string3 = string13;
        object2 = string14;
        return ko_0.a((StringBuilder)object, string13, ", tenantTransactionId=", string14, ")");
    }
}

