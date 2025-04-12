/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.EmiSdkInformation;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.Order;
import com.ril.ajio.services.data.Payment.PaymentChannelInformation;
import com.ril.ajio.services.data.Payment.Tenant;
import com.ril.ajio.services.data.Payment.TransactionInformation;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PayNowResponse
implements Serializable {
    private String MD;
    private String cartCheckSum;
    private String checkSum;
    private Boolean checkSumFailure;
    private Customer customer;
    private String display_message;
    private EmiSdkInformation emiSdkInformation;
    private Error error;
    private String html;
    private Boolean isHtml;
    private Boolean jsonresponse;
    private String message;
    private HashMap notes;
    private OfferDetails offerDetails;
    private Order order;
    private String otpdata;
    private PaymentChannelInformation paymentChannelInformation;
    private Long pollingTime;
    private Tenant tenant;
    private String transactionId;
    private TransactionInformation transactionInformation;

    public PayNowResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFFF, null);
    }

    public PayNowResponse(Order order, Tenant tenant, PaymentChannelInformation paymentChannelInformation, String string2, HashMap hashMap, String string3, Customer customer, String string4, Boolean bl2, Boolean bl3, Error error, Long l2, TransactionInformation transactionInformation, OfferDetails offerDetails, Boolean bl4, String string5, String string6, String string7, String string8, String string9, EmiSdkInformation emiSdkInformation) {
        this.order = order;
        this.tenant = tenant;
        this.paymentChannelInformation = paymentChannelInformation;
        this.checkSum = string2;
        this.notes = hashMap;
        this.cartCheckSum = string3;
        this.customer = customer;
        this.message = string4;
        this.checkSumFailure = bl2;
        this.jsonresponse = bl3;
        this.error = error;
        this.pollingTime = l2;
        this.transactionInformation = transactionInformation;
        this.offerDetails = offerDetails;
        this.isHtml = bl4;
        this.html = string5;
        this.MD = string6;
        this.display_message = string7;
        this.otpdata = string8;
        this.transactionId = string9;
        this.emiSdkInformation = emiSdkInformation;
    }

    public /* synthetic */ PayNowResponse(Order serializable, Tenant serializable2, PaymentChannelInformation serializable3, String object, HashMap object2, String object3, Customer object4, String object5, Boolean object6, Boolean bl2, Error serializable4, Long serializable5, TransactionInformation serializable6, OfferDetails serializable7, Boolean serializable8, String object7, String string2, String string3, String string4, String string5, EmiSdkInformation object8, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        EmiSdkInformation emiSdkInformation;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        OfferDetails offerDetails;
        TransactionInformation transactionInformation;
        Long l2;
        Error error;
        String string11;
        Customer customer;
        String string12;
        HashMap hashMap;
        String string13;
        PaymentChannelInformation paymentChannelInformation;
        Tenant tenant;
        Order order;
        int n4 = n3;
        int n7 = n3 & 1;
        if (n7 != 0) {
            n7 = 0;
            order = null;
        } else {
            order = serializable;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            tenant = null;
        } else {
            tenant = serializable2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            paymentChannelInformation = null;
        } else {
            paymentChannelInformation = serializable3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string13 = null;
        } else {
            string13 = object;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            hashMap = null;
        } else {
            hashMap = object2;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string12 = null;
        } else {
            string12 = object3;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            customer = null;
        } else {
            customer = object4;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string11 = null;
        } else {
            string11 = object5;
        }
        int n19 = n4 & 0x100;
        Object object9 = n19 != 0 ? Boolean.FALSE : object6;
        int n20 = n4 & 0x200;
        Boolean bl3 = n20 != 0 ? Boolean.FALSE : bl2;
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            error = null;
        } else {
            error = serializable4;
        }
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            long l3 = 0L;
            l2 = l3;
        } else {
            l2 = serializable5;
        }
        int n24 = n4 & 0x1000;
        if (n24 != 0) {
            n24 = 0;
            transactionInformation = null;
        } else {
            transactionInformation = serializable6;
        }
        int n25 = n4 & 0x2000;
        if (n25 != 0) {
            n25 = 0;
            offerDetails = null;
        } else {
            offerDetails = serializable7;
        }
        int n26 = n4 & 0x4000;
        Boolean bl4 = n26 != 0 ? Boolean.FALSE : serializable8;
        int n27 = n4 & 0x8000;
        if (n27 != 0) {
            n27 = 0;
            string10 = null;
        } else {
            string10 = object7;
        }
        int n28 = n4 & 0x10000;
        if (n28 != 0) {
            n28 = 0;
            string9 = null;
        } else {
            string9 = string2;
        }
        int n29 = n4 & 0x20000;
        if (n29 != 0) {
            n29 = 0;
            string8 = null;
        } else {
            string8 = string3;
        }
        int n30 = n4 & 0x40000;
        if (n30 != 0) {
            n30 = 0;
            string7 = null;
        } else {
            string7 = string4;
        }
        int n32 = n4 & 0x80000;
        if (n32 != 0) {
            n32 = 0;
            string6 = null;
        } else {
            string6 = string5;
        }
        int n34 = 0x100000;
        if ((n4 &= n34) != 0) {
            n4 = 0;
            emiSdkInformation = null;
        } else {
            emiSdkInformation = object8;
        }
        serializable = this;
        serializable2 = order;
        serializable3 = tenant;
        object = paymentChannelInformation;
        object2 = string13;
        object3 = hashMap;
        object4 = string12;
        object5 = customer;
        object6 = string11;
        bl2 = object9;
        serializable4 = bl3;
        serializable5 = error;
        serializable6 = l2;
        serializable7 = transactionInformation;
        serializable8 = offerDetails;
        object7 = bl4;
        string2 = string10;
        string3 = string9;
        string4 = string8;
        string5 = string7;
        object8 = string6;
        this(order, tenant, paymentChannelInformation, string13, hashMap, string12, customer, string11, (Boolean)object9, bl3, error, l2, transactionInformation, offerDetails, bl4, string10, string9, string8, string7, string6, emiSdkInformation);
    }

    public static /* synthetic */ PayNowResponse copy$default(PayNowResponse payNowResponse, Order order, Tenant tenant, PaymentChannelInformation paymentChannelInformation, String string2, HashMap hashMap, String string3, Customer customer, String string4, Boolean bl2, Boolean bl3, Error error, Long l2, TransactionInformation transactionInformation, OfferDetails offerDetails, Boolean serializable, String object, String object2, String object3, String object4, String object5, EmiSdkInformation emiSdkInformation, int n3, Object object6) {
        PayNowResponse payNowResponse2 = payNowResponse;
        int n4 = n3;
        int n7 = n3 & 1;
        Order order2 = n7 != 0 ? payNowResponse.order : order;
        int n8 = n4 & 2;
        Tenant tenant2 = n8 != 0 ? payNowResponse2.tenant : tenant;
        int n10 = n4 & 4;
        PaymentChannelInformation paymentChannelInformation2 = n10 != 0 ? payNowResponse2.paymentChannelInformation : paymentChannelInformation;
        int n14 = n4 & 8;
        String string5 = n14 != 0 ? payNowResponse2.checkSum : string2;
        int n15 = n4 & 0x10;
        HashMap hashMap2 = n15 != 0 ? payNowResponse2.notes : hashMap;
        int n16 = n4 & 0x20;
        String string6 = n16 != 0 ? payNowResponse2.cartCheckSum : string3;
        int n17 = n4 & 0x40;
        Customer customer2 = n17 != 0 ? payNowResponse2.customer : customer;
        int n18 = n4 & 0x80;
        String string7 = n18 != 0 ? payNowResponse2.message : string4;
        int n19 = n4 & 0x100;
        Boolean bl4 = n19 != 0 ? payNowResponse2.checkSumFailure : bl2;
        int n20 = n4 & 0x200;
        Boolean bl5 = n20 != 0 ? payNowResponse2.jsonresponse : bl3;
        int n21 = n4 & 0x400;
        Error error2 = n21 != 0 ? payNowResponse2.error : error;
        int n22 = n4 & 0x800;
        Long l3 = n22 != 0 ? payNowResponse2.pollingTime : l2;
        int n24 = n4 & 0x1000;
        TransactionInformation transactionInformation2 = n24 != 0 ? payNowResponse2.transactionInformation : transactionInformation;
        int n25 = n4 & 0x2000;
        Object object7 = n25 != 0 ? payNowResponse2.offerDetails : offerDetails;
        offerDetails = object7;
        n25 = n4 & 0x4000;
        object7 = n25 != 0 ? payNowResponse2.isHtml : serializable;
        int n26 = n4 & 0x8000;
        serializable = object7;
        object7 = n26 != 0 ? payNowResponse2.html : object;
        n26 = n4 & 0x10000;
        object = object7;
        object7 = n26 != 0 ? payNowResponse2.MD : object2;
        n26 = n4 & 0x20000;
        object2 = object7;
        object7 = n26 != 0 ? payNowResponse2.display_message : object3;
        n26 = n4 & 0x40000;
        object3 = object7;
        object7 = n26 != 0 ? payNowResponse2.otpdata : object4;
        n26 = n4 & 0x80000;
        object4 = object7;
        object7 = n26 != 0 ? payNowResponse2.transactionId : object5;
        n26 = 0x100000;
        EmiSdkInformation emiSdkInformation2 = (n4 &= n26) != 0 ? payNowResponse2.emiSdkInformation : emiSdkInformation;
        order = order2;
        tenant = tenant2;
        paymentChannelInformation = paymentChannelInformation2;
        string2 = string5;
        hashMap = hashMap2;
        string3 = string6;
        customer = customer2;
        string4 = string7;
        bl2 = bl4;
        bl3 = bl5;
        error = error2;
        l2 = l3;
        transactionInformation = transactionInformation2;
        object5 = object7;
        emiSdkInformation = emiSdkInformation2;
        return payNowResponse.copy(order2, tenant2, paymentChannelInformation2, string5, hashMap2, string6, customer2, string7, bl4, bl5, error2, l3, transactionInformation2, offerDetails, (Boolean)serializable, (String)object, (String)object2, (String)object3, (String)object4, (String)object7, emiSdkInformation2);
    }

    public final Order component1() {
        return this.order;
    }

    public final Boolean component10() {
        return this.jsonresponse;
    }

    public final Error component11() {
        return this.error;
    }

    public final Long component12() {
        return this.pollingTime;
    }

    public final TransactionInformation component13() {
        return this.transactionInformation;
    }

    public final OfferDetails component14() {
        return this.offerDetails;
    }

    public final Boolean component15() {
        return this.isHtml;
    }

    public final String component16() {
        return this.html;
    }

    public final String component17() {
        return this.MD;
    }

    public final String component18() {
        return this.display_message;
    }

    public final String component19() {
        return this.otpdata;
    }

    public final Tenant component2() {
        return this.tenant;
    }

    public final String component20() {
        return this.transactionId;
    }

    public final EmiSdkInformation component21() {
        return this.emiSdkInformation;
    }

    public final PaymentChannelInformation component3() {
        return this.paymentChannelInformation;
    }

    public final String component4() {
        return this.checkSum;
    }

    public final HashMap component5() {
        return this.notes;
    }

    public final String component6() {
        return this.cartCheckSum;
    }

    public final Customer component7() {
        return this.customer;
    }

    public final String component8() {
        return this.message;
    }

    public final Boolean component9() {
        return this.checkSumFailure;
    }

    public final PayNowResponse copy(Order order, Tenant tenant, PaymentChannelInformation paymentChannelInformation, String string2, HashMap hashMap, String string3, Customer customer, String string4, Boolean bl2, Boolean bl3, Error error, Long l2, TransactionInformation transactionInformation, OfferDetails offerDetails, Boolean bl4, String string5, String string6, String string7, String string8, String string9, EmiSdkInformation emiSdkInformation) {
        PayNowResponse payNowResponse = new PayNowResponse(order, tenant, paymentChannelInformation, string2, hashMap, string3, customer, string4, bl2, bl3, error, l2, transactionInformation, offerDetails, bl4, string5, string6, string7, string8, string9, emiSdkInformation);
        return payNowResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PayNowResponse;
        if (!bl3) {
            return false;
        }
        object = (PayNowResponse)object;
        Object object2 = this.order;
        Object object3 = ((PayNowResponse)object).order;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tenant;
        object3 = ((PayNowResponse)object).tenant;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentChannelInformation;
        object3 = ((PayNowResponse)object).paymentChannelInformation;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.checkSum;
        object3 = ((PayNowResponse)object).checkSum;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.notes;
        object3 = ((PayNowResponse)object).notes;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartCheckSum;
        object3 = ((PayNowResponse)object).cartCheckSum;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.customer;
        object3 = ((PayNowResponse)object).customer;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.message;
        object3 = ((PayNowResponse)object).message;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.checkSumFailure;
        object3 = ((PayNowResponse)object).checkSumFailure;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.jsonresponse;
        object3 = ((PayNowResponse)object).jsonresponse;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.error;
        object3 = ((PayNowResponse)object).error;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pollingTime;
        object3 = ((PayNowResponse)object).pollingTime;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.transactionInformation;
        object3 = ((PayNowResponse)object).transactionInformation;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerDetails;
        object3 = ((PayNowResponse)object).offerDetails;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isHtml;
        object3 = ((PayNowResponse)object).isHtml;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.html;
        object3 = ((PayNowResponse)object).html;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.MD;
        object3 = ((PayNowResponse)object).MD;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.display_message;
        object3 = ((PayNowResponse)object).display_message;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.otpdata;
        object3 = ((PayNowResponse)object).otpdata;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.transactionId;
        object3 = ((PayNowResponse)object).transactionId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.emiSdkInformation;
        object = ((PayNowResponse)object).emiSdkInformation;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCartCheckSum() {
        return this.cartCheckSum;
    }

    public final String getCheckSum() {
        return this.checkSum;
    }

    public final Boolean getCheckSumFailure() {
        return this.checkSumFailure;
    }

    public final Customer getCustomer() {
        return this.customer;
    }

    public final String getDisplay_message() {
        return this.display_message;
    }

    public final EmiSdkInformation getEmiSdkInformation() {
        return this.emiSdkInformation;
    }

    public final Error getError() {
        return this.error;
    }

    public final String getHtml() {
        return this.html;
    }

    public final Boolean getJsonresponse() {
        return this.jsonresponse;
    }

    public final String getMD() {
        return this.MD;
    }

    public final String getMessage() {
        return this.message;
    }

    public final HashMap getNotes() {
        return this.notes;
    }

    public final OfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    public final Order getOrder() {
        return this.order;
    }

    public final String getOtpdata() {
        return this.otpdata;
    }

    public final PaymentChannelInformation getPaymentChannelInformation() {
        return this.paymentChannelInformation;
    }

    public final Long getPollingTime() {
        return this.pollingTime;
    }

    public final Tenant getTenant() {
        return this.tenant;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final TransactionInformation getTransactionInformation() {
        return this.transactionInformation;
    }

    public int hashCode() {
        int n3;
        int n4;
        Order order = this.order;
        int n7 = 0;
        if (order == null) {
            n4 = 0;
            order = null;
        } else {
            n4 = order.hashCode();
        }
        n4 *= 31;
        Object object = this.tenant;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Tenant)object).hashCode();
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
        object = this.checkSum;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.notes;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cartCheckSum;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
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
        object = this.message;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.checkSumFailure;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.jsonresponse;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.error;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Error)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pollingTime;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.transactionInformation;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((TransactionInformation)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.offerDetails;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((OfferDetails)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isHtml;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.html;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.MD;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.display_message;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.otpdata;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.transactionId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.emiSdkInformation;
        if (object != null) {
            n7 = ((EmiSdkInformation)object).hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isHtml() {
        return this.isHtml;
    }

    public final void setCartCheckSum(String string2) {
        this.cartCheckSum = string2;
    }

    public final void setCheckSum(String string2) {
        this.checkSum = string2;
    }

    public final void setCheckSumFailure(Boolean bl2) {
        this.checkSumFailure = bl2;
    }

    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public final void setDisplay_message(String string2) {
        this.display_message = string2;
    }

    public final void setEmiSdkInformation(EmiSdkInformation emiSdkInformation) {
        this.emiSdkInformation = emiSdkInformation;
    }

    public final void setError(Error error) {
        this.error = error;
    }

    public final void setHtml(Boolean bl2) {
        this.isHtml = bl2;
    }

    public final void setHtml(String string2) {
        this.html = string2;
    }

    public final void setJsonresponse(Boolean bl2) {
        this.jsonresponse = bl2;
    }

    public final void setMD(String string2) {
        this.MD = string2;
    }

    public final void setMessage(String string2) {
        this.message = string2;
    }

    public final void setNotes(HashMap hashMap) {
        this.notes = hashMap;
    }

    public final void setOfferDetails(OfferDetails offerDetails) {
        this.offerDetails = offerDetails;
    }

    public final void setOrder(Order order) {
        this.order = order;
    }

    public final void setOtpdata(String string2) {
        this.otpdata = string2;
    }

    public final void setPaymentChannelInformation(PaymentChannelInformation paymentChannelInformation) {
        this.paymentChannelInformation = paymentChannelInformation;
    }

    public final void setPollingTime(Long l2) {
        this.pollingTime = l2;
    }

    public final void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public final void setTransactionId(String string2) {
        this.transactionId = string2;
    }

    public final void setTransactionInformation(TransactionInformation transactionInformation) {
        this.transactionInformation = transactionInformation;
    }

    public String toString() {
        Serializable serializable = this;
        Serializable serializable2 = this.order;
        Tenant tenant = this.tenant;
        Object object = this.paymentChannelInformation;
        String string2 = this.checkSum;
        HashMap hashMap = this.notes;
        String string3 = this.cartCheckSum;
        Customer customer = this.customer;
        String string4 = this.message;
        Boolean bl2 = this.checkSumFailure;
        Boolean bl3 = this.jsonresponse;
        Error error = this.error;
        Long l2 = this.pollingTime;
        TransactionInformation transactionInformation = this.transactionInformation;
        OfferDetails offerDetails = this.offerDetails;
        Boolean bl4 = this.isHtml;
        String string5 = this.html;
        String string6 = this.MD;
        String string7 = this.display_message;
        String string8 = this.otpdata;
        String string9 = this.transactionId;
        EmiSdkInformation emiSdkInformation = this.emiSdkInformation;
        serializable = new StringBuilder("PayNowResponse(order=");
        ((StringBuilder)serializable).append(serializable2);
        ((StringBuilder)serializable).append(", tenant=");
        ((StringBuilder)serializable).append(tenant);
        ((StringBuilder)serializable).append(", paymentChannelInformation=");
        ((StringBuilder)serializable).append(object);
        ((StringBuilder)serializable).append(", checkSum=");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append(", notes=");
        ((StringBuilder)serializable).append(hashMap);
        ((StringBuilder)serializable).append(", cartCheckSum=");
        ((StringBuilder)serializable).append(string3);
        ((StringBuilder)serializable).append(", customer=");
        ((StringBuilder)serializable).append(customer);
        ((StringBuilder)serializable).append(", message=");
        ((StringBuilder)serializable).append(string4);
        ((StringBuilder)serializable).append(", checkSumFailure=");
        ((StringBuilder)serializable).append(bl2);
        ((StringBuilder)serializable).append(", jsonresponse=");
        ((StringBuilder)serializable).append(bl3);
        ((StringBuilder)serializable).append(", error=");
        ((StringBuilder)serializable).append(error);
        ((StringBuilder)serializable).append(", pollingTime=");
        ((StringBuilder)serializable).append(l2);
        ((StringBuilder)serializable).append(", transactionInformation=");
        ((StringBuilder)serializable).append(transactionInformation);
        ((StringBuilder)serializable).append(", offerDetails=");
        ((StringBuilder)serializable).append(offerDetails);
        ((StringBuilder)serializable).append(", isHtml=");
        object = bl4;
        string2 = string5;
        xi0_2.a(bl4, ", html=", string5, ", MD=", (StringBuilder)serializable);
        object = string6;
        string2 = string7;
        X50.a((StringBuilder)serializable, string6, ", display_message=", string7, ", otpdata=");
        object = string8;
        string2 = string9;
        X50.a((StringBuilder)serializable, string8, ", transactionId=", string9, ", emiSdkInformation=");
        serializable2 = emiSdkInformation;
        ((StringBuilder)serializable).append(emiSdkInformation);
        ((StringBuilder)serializable).append(")");
        return ((StringBuilder)serializable).toString();
    }
}

