/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.PaymentFilter;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Payload
implements Serializable {
    private final String action;
    private final String amount;
    private final String clientAuthToken;
    private final String clientAuthTokenExpiry;
    private final String clientId;
    private final Boolean collectAvsInfo;
    private final String currency;
    private final String customerEmail;
    private final String customerId;
    private final String customerPhone;
    private final String description;
    private final String environment;
    private final String firstName;
    private final String lastName;
    private final String merchantId;
    private final String optionsDeeplinks;
    private final String orderId;
    private final PaymentFilter paymentFilter;
    private final String returnUrl;
    private final String service;

    public Payload() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public Payload(String string2, String string3, String string4, String string5, String string6, Boolean bl2, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, PaymentFilter paymentFilter, String string15, String string16, String string17, String string18, String string19) {
        this.action = string2;
        this.amount = string3;
        this.clientAuthToken = string4;
        this.clientAuthTokenExpiry = string5;
        this.clientId = string6;
        this.collectAvsInfo = bl2;
        this.currency = string7;
        this.customerEmail = string8;
        this.customerId = string9;
        this.customerPhone = string10;
        this.description = string11;
        this.environment = string12;
        this.merchantId = string13;
        this.orderId = string14;
        this.paymentFilter = paymentFilter;
        this.returnUrl = string15;
        this.service = string16;
        this.optionsDeeplinks = string17;
        this.firstName = string18;
        this.lastName = string19;
    }

    public /* synthetic */ Payload(String object, String string2, String string3, String string4, String string5, Boolean object2, String object3, String string6, String string7, String string8, String string9, String string10, String string11, String string12, PaymentFilter object4, String object5, String string13, String string14, String string15, String string16, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string17;
        String string18;
        String string19;
        String string20;
        String string21;
        PaymentFilter paymentFilter;
        String string22;
        String string23;
        String string24;
        String string25;
        String string26;
        String string27;
        String string28;
        String string29;
        Boolean bl2;
        String string30;
        String string31;
        String string32;
        String string33;
        String string34;
        int n4 = n3;
        int n7 = n3 & 1;
        if (n7 != 0) {
            n7 = 0;
            string34 = null;
        } else {
            string34 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string33 = null;
        } else {
            string33 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string32 = null;
        } else {
            string32 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string31 = null;
        } else {
            string31 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string30 = null;
        } else {
            string30 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            bl2 = null;
        } else {
            bl2 = object2;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string29 = null;
        } else {
            string29 = object3;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string28 = null;
        } else {
            string28 = string6;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string27 = null;
        } else {
            string27 = string7;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string26 = null;
        } else {
            string26 = string8;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string25 = null;
        } else {
            string25 = string9;
        }
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            n22 = 0;
            string24 = null;
        } else {
            string24 = string10;
        }
        int n24 = n4 & 0x1000;
        if (n24 != 0) {
            n24 = 0;
            string23 = null;
        } else {
            string23 = string11;
        }
        int n25 = n4 & 0x2000;
        if (n25 != 0) {
            n25 = 0;
            string22 = null;
        } else {
            string22 = string12;
        }
        int n26 = n4 & 0x4000;
        if (n26 != 0) {
            n26 = 0;
            paymentFilter = null;
        } else {
            paymentFilter = object4;
        }
        int n27 = n4 & 0x8000;
        if (n27 != 0) {
            n27 = 0;
            string21 = null;
        } else {
            string21 = object5;
        }
        int n28 = n4 & 0x10000;
        if (n28 != 0) {
            n28 = 0;
            string20 = null;
        } else {
            string20 = string13;
        }
        int n29 = n4 & 0x20000;
        if (n29 != 0) {
            n29 = 0;
            string19 = null;
        } else {
            string19 = string14;
        }
        int n30 = n4 & 0x40000;
        if (n30 != 0) {
            n30 = 0;
            string18 = null;
        } else {
            string18 = string15;
        }
        int n32 = 524288;
        if ((n4 &= n32) != 0) {
            n4 = 0;
            string17 = null;
        } else {
            string17 = string16;
        }
        object = this;
        string2 = string34;
        string3 = string33;
        string4 = string32;
        string5 = string31;
        object2 = string30;
        object3 = bl2;
        string6 = string29;
        string7 = string28;
        string8 = string27;
        string9 = string26;
        string10 = string25;
        string11 = string24;
        string12 = string23;
        object4 = string22;
        object5 = paymentFilter;
        string13 = string21;
        string14 = string20;
        string15 = string19;
        string16 = string18;
        this(string34, string33, string32, string31, string30, bl2, string29, string28, string27, string26, string25, string24, string23, string22, paymentFilter, string21, string20, string19, string18, string17);
    }

    public static /* synthetic */ Payload copy$default(Payload payload, String string2, String string3, String string4, String string5, String string6, Boolean bl2, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, PaymentFilter object, String object2, String object3, String object4, String object5, String string15, int n3, Object object6) {
        Payload payload2 = payload;
        int n4 = n3;
        int n7 = n3 & 1;
        String string16 = n7 != 0 ? payload.action : string2;
        int n8 = n4 & 2;
        String string17 = n8 != 0 ? payload2.amount : string3;
        int n10 = n4 & 4;
        String string18 = n10 != 0 ? payload2.clientAuthToken : string4;
        int n14 = n4 & 8;
        String string19 = n14 != 0 ? payload2.clientAuthTokenExpiry : string5;
        int n15 = n4 & 0x10;
        String string20 = n15 != 0 ? payload2.clientId : string6;
        int n16 = n4 & 0x20;
        Boolean bl3 = n16 != 0 ? payload2.collectAvsInfo : bl2;
        int n17 = n4 & 0x40;
        String string21 = n17 != 0 ? payload2.currency : string7;
        int n18 = n4 & 0x80;
        String string22 = n18 != 0 ? payload2.customerEmail : string8;
        int n19 = n4 & 0x100;
        String string23 = n19 != 0 ? payload2.customerId : string9;
        int n20 = n4 & 0x200;
        String string24 = n20 != 0 ? payload2.customerPhone : string10;
        int n21 = n4 & 0x400;
        String string25 = n21 != 0 ? payload2.description : string11;
        int n22 = n4 & 0x800;
        String string26 = n22 != 0 ? payload2.environment : string12;
        int n24 = n4 & 0x1000;
        String string27 = n24 != 0 ? payload2.merchantId : string13;
        int n25 = n4 & 0x2000;
        Object object7 = n25 != 0 ? payload2.orderId : string14;
        string14 = object7;
        n25 = n4 & 0x4000;
        object7 = n25 != 0 ? payload2.paymentFilter : object;
        int n26 = n4 & 0x8000;
        object = object7;
        object7 = n26 != 0 ? payload2.returnUrl : object2;
        n26 = n4 & 0x10000;
        object2 = object7;
        object7 = n26 != 0 ? payload2.service : object3;
        n26 = n4 & 0x20000;
        object3 = object7;
        object7 = n26 != 0 ? payload2.optionsDeeplinks : object4;
        n26 = n4 & 0x40000;
        object4 = object7;
        object7 = n26 != 0 ? payload2.firstName : object5;
        n26 = 524288;
        String string28 = (n4 &= n26) != 0 ? payload2.lastName : string15;
        string2 = string16;
        string3 = string17;
        string4 = string18;
        string5 = string19;
        string6 = string20;
        bl2 = bl3;
        string7 = string21;
        string8 = string22;
        string9 = string23;
        string10 = string24;
        string11 = string25;
        string12 = string26;
        string13 = string27;
        object5 = object7;
        string15 = string28;
        return payload.copy(string16, string17, string18, string19, string20, bl3, string21, string22, string23, string24, string25, string26, string27, string14, (PaymentFilter)object, (String)object2, (String)object3, (String)object4, (String)object7, string28);
    }

    public final String component1() {
        return this.action;
    }

    public final String component10() {
        return this.customerPhone;
    }

    public final String component11() {
        return this.description;
    }

    public final String component12() {
        return this.environment;
    }

    public final String component13() {
        return this.merchantId;
    }

    public final String component14() {
        return this.orderId;
    }

    public final PaymentFilter component15() {
        return this.paymentFilter;
    }

    public final String component16() {
        return this.returnUrl;
    }

    public final String component17() {
        return this.service;
    }

    public final String component18() {
        return this.optionsDeeplinks;
    }

    public final String component19() {
        return this.firstName;
    }

    public final String component2() {
        return this.amount;
    }

    public final String component20() {
        return this.lastName;
    }

    public final String component3() {
        return this.clientAuthToken;
    }

    public final String component4() {
        return this.clientAuthTokenExpiry;
    }

    public final String component5() {
        return this.clientId;
    }

    public final Boolean component6() {
        return this.collectAvsInfo;
    }

    public final String component7() {
        return this.currency;
    }

    public final String component8() {
        return this.customerEmail;
    }

    public final String component9() {
        return this.customerId;
    }

    public final Payload copy(String string2, String string3, String string4, String string5, String string6, Boolean bl2, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, PaymentFilter paymentFilter, String string15, String string16, String string17, String string18, String string19) {
        Payload payload = new Payload(string2, string3, string4, string5, string6, bl2, string7, string8, string9, string10, string11, string12, string13, string14, paymentFilter, string15, string16, string17, string18, string19);
        return payload;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Payload;
        if (!bl3) {
            return false;
        }
        object = (Payload)object;
        Object object2 = this.action;
        Object object3 = ((Payload)object).action;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.amount;
        object3 = ((Payload)object).amount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.clientAuthToken;
        object3 = ((Payload)object).clientAuthToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.clientAuthTokenExpiry;
        object3 = ((Payload)object).clientAuthTokenExpiry;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.clientId;
        object3 = ((Payload)object).clientId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.collectAvsInfo;
        object3 = ((Payload)object).collectAvsInfo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.currency;
        object3 = ((Payload)object).currency;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.customerEmail;
        object3 = ((Payload)object).customerEmail;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.customerId;
        object3 = ((Payload)object).customerId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.customerPhone;
        object3 = ((Payload)object).customerPhone;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.description;
        object3 = ((Payload)object).description;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.environment;
        object3 = ((Payload)object).environment;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.merchantId;
        object3 = ((Payload)object).merchantId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderId;
        object3 = ((Payload)object).orderId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentFilter;
        object3 = ((Payload)object).paymentFilter;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.returnUrl;
        object3 = ((Payload)object).returnUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.service;
        object3 = ((Payload)object).service;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.optionsDeeplinks;
        object3 = ((Payload)object).optionsDeeplinks;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.firstName;
        object3 = ((Payload)object).firstName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.lastName;
        object = ((Payload)object).lastName;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getClientAuthToken() {
        return this.clientAuthToken;
    }

    public final String getClientAuthTokenExpiry() {
        return this.clientAuthTokenExpiry;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final Boolean getCollectAvsInfo() {
        return this.collectAvsInfo;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getCustomerEmail() {
        return this.customerEmail;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getCustomerPhone() {
        return this.customerPhone;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final String getOptionsDeeplinks() {
        return this.optionsDeeplinks;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final PaymentFilter getPaymentFilter() {
        return this.paymentFilter;
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final String getService() {
        return this.service;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.action;
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
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.clientAuthToken;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.clientAuthTokenExpiry;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.clientId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.collectAvsInfo;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.currency;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.customerEmail;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.customerId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.customerPhone;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.description;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.environment;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.merchantId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentFilter;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((PaymentFilter)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.returnUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.service;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.optionsDeeplinks;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.firstName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.lastName;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        Serializable serializable = this;
        Object object = this.action;
        String string2 = this.amount;
        String string3 = this.clientAuthToken;
        String string4 = this.clientAuthTokenExpiry;
        String string5 = this.clientId;
        Boolean bl2 = this.collectAvsInfo;
        String string6 = this.currency;
        String string7 = this.customerEmail;
        String string8 = this.customerId;
        String string9 = this.customerPhone;
        String string10 = this.description;
        String string11 = this.environment;
        String string12 = this.merchantId;
        String string13 = this.orderId;
        PaymentFilter paymentFilter = this.paymentFilter;
        String string14 = this.returnUrl;
        String string15 = this.service;
        String string16 = this.optionsDeeplinks;
        String string17 = this.firstName;
        String string18 = this.lastName;
        serializable = og_1.a("Payload(action=", (String)object, ", amount=", string2, ", clientAuthToken=");
        X50.a((StringBuilder)serializable, string3, ", clientAuthTokenExpiry=", string4, ", clientId=");
        vw0_1.a(bl2, string5, ", collectAvsInfo=", ", currency=", (StringBuilder)serializable);
        X50.a((StringBuilder)serializable, string6, ", customerEmail=", string7, ", customerId=");
        X50.a((StringBuilder)serializable, string8, ", customerPhone=", string9, ", description=");
        X50.a((StringBuilder)serializable, string10, ", environment=", string11, ", merchantId=");
        string3 = string12;
        X50.a((StringBuilder)serializable, string12, ", orderId=", string13, ", paymentFilter=");
        object = paymentFilter;
        ((StringBuilder)serializable).append(paymentFilter);
        ((StringBuilder)serializable).append(", returnUrl=");
        object = string14;
        ((StringBuilder)serializable).append(string14);
        ((StringBuilder)serializable).append(", service=");
        string3 = string15;
        string4 = string16;
        X50.a((StringBuilder)serializable, string15, ", optionsDeeplinks=", string16, ", firstName=");
        string3 = string17;
        string4 = string18;
        return ko_0.a((StringBuilder)serializable, string17, ", lastName=", string18, ")");
    }
}

