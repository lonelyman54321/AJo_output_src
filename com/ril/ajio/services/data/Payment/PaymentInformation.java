/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PaymentInformation
implements Serializable {
    private String intentURI;
    private Float netPayableAmount;
    private String paymentEngineTransactionId;
    private String paymentGatewayTransactionId;
    private String paymentGatewayType;
    private String paymentInstrument;
    private String paymentInstrumentInstanceCode;
    private String transactionDate;
    private Boolean transactionStatus;
    private Long transactionTime;

    public PaymentInformation() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public PaymentInformation(String string2, String string3, String string4, String string5, Float f5, Long l2, Boolean bl2, String string6, String string7, String string8) {
        this.paymentGatewayType = string2;
        this.paymentInstrument = string3;
        this.paymentGatewayTransactionId = string4;
        this.paymentEngineTransactionId = string5;
        this.netPayableAmount = f5;
        this.transactionTime = l2;
        this.transactionStatus = bl2;
        this.intentURI = string6;
        this.paymentInstrumentInstanceCode = string7;
        this.transactionDate = string8;
    }

    public /* synthetic */ PaymentInformation(String object, String string2, String string3, String string4, Float object2, Long number, Boolean comparable, String object3, String string5, String string6, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string7;
        String string8;
        Long l2;
        Float f5;
        String string9;
        String string10;
        String string11;
        String string12;
        int n4 = n3;
        int n7 = n3 & 1;
        String string13 = null;
        if (n7 != 0) {
            n7 = 0;
            string12 = null;
        } else {
            string12 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string11 = null;
        } else {
            string11 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string10 = null;
        } else {
            string10 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string9 = null;
        } else {
            string9 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            f5 = Float.valueOf(0.0f);
        } else {
            f5 = object2;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            long l3 = 0L;
            l2 = l3;
        } else {
            l2 = number;
        }
        int n17 = n4 & 0x40;
        Boolean bl2 = n17 != 0 ? Boolean.FALSE : comparable;
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string8 = null;
        } else {
            string8 = object3;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string7 = null;
        } else {
            string7 = string5;
        }
        if ((n4 &= 0x200) == 0) {
            string13 = string6;
        }
        object = this;
        string2 = string12;
        string3 = string11;
        string4 = string10;
        object2 = string9;
        number = f5;
        comparable = l2;
        object3 = bl2;
        string5 = string8;
        string6 = string7;
        this(string12, string11, string10, string9, f5, l2, bl2, string8, string7, string13);
    }

    public static /* synthetic */ PaymentInformation copy$default(PaymentInformation paymentInformation, String string2, String string3, String string4, String string5, Float f5, Long l2, Boolean bl2, String string6, String string7, String string8, int n3, Object object) {
        PaymentInformation paymentInformation2 = paymentInformation;
        int n4 = n3;
        int n7 = n3 & 1;
        String string9 = n7 != 0 ? paymentInformation.paymentGatewayType : string2;
        int n8 = n4 & 2;
        String string10 = n8 != 0 ? paymentInformation2.paymentInstrument : string3;
        int n10 = n4 & 4;
        String string11 = n10 != 0 ? paymentInformation2.paymentGatewayTransactionId : string4;
        int n14 = n4 & 8;
        String string12 = n14 != 0 ? paymentInformation2.paymentEngineTransactionId : string5;
        int n15 = n4 & 0x10;
        Float f6 = n15 != 0 ? paymentInformation2.netPayableAmount : f5;
        int n16 = n4 & 0x20;
        Long l3 = n16 != 0 ? paymentInformation2.transactionTime : l2;
        int n17 = n4 & 0x40;
        Boolean bl3 = n17 != 0 ? paymentInformation2.transactionStatus : bl2;
        int n18 = n4 & 0x80;
        String string13 = n18 != 0 ? paymentInformation2.intentURI : string6;
        int n19 = n4 & 0x100;
        String string14 = n19 != 0 ? paymentInformation2.paymentInstrumentInstanceCode : string7;
        String string15 = (n4 &= 0x200) != 0 ? paymentInformation2.transactionDate : string8;
        string2 = string9;
        string3 = string10;
        string4 = string11;
        string5 = string12;
        f5 = f6;
        l2 = l3;
        bl2 = bl3;
        string6 = string13;
        string7 = string14;
        string8 = string15;
        return paymentInformation.copy(string9, string10, string11, string12, f6, l3, bl3, string13, string14, string15);
    }

    public final String component1() {
        return this.paymentGatewayType;
    }

    public final String component10() {
        return this.transactionDate;
    }

    public final String component2() {
        return this.paymentInstrument;
    }

    public final String component3() {
        return this.paymentGatewayTransactionId;
    }

    public final String component4() {
        return this.paymentEngineTransactionId;
    }

    public final Float component5() {
        return this.netPayableAmount;
    }

    public final Long component6() {
        return this.transactionTime;
    }

    public final Boolean component7() {
        return this.transactionStatus;
    }

    public final String component8() {
        return this.intentURI;
    }

    public final String component9() {
        return this.paymentInstrumentInstanceCode;
    }

    public final PaymentInformation copy(String string2, String string3, String string4, String string5, Float f5, Long l2, Boolean bl2, String string6, String string7, String string8) {
        PaymentInformation paymentInformation = new PaymentInformation(string2, string3, string4, string5, f5, l2, bl2, string6, string7, string8);
        return paymentInformation;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PaymentInformation;
        if (!bl3) {
            return false;
        }
        object = (PaymentInformation)object;
        Object object2 = this.paymentGatewayType;
        Object object3 = ((PaymentInformation)object).paymentGatewayType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentInstrument;
        object3 = ((PaymentInformation)object).paymentInstrument;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentGatewayTransactionId;
        object3 = ((PaymentInformation)object).paymentGatewayTransactionId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentEngineTransactionId;
        object3 = ((PaymentInformation)object).paymentEngineTransactionId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.netPayableAmount;
        object3 = ((PaymentInformation)object).netPayableAmount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.transactionTime;
        object3 = ((PaymentInformation)object).transactionTime;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.transactionStatus;
        object3 = ((PaymentInformation)object).transactionStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.intentURI;
        object3 = ((PaymentInformation)object).intentURI;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentInstrumentInstanceCode;
        object3 = ((PaymentInformation)object).paymentInstrumentInstanceCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.transactionDate;
        object = ((PaymentInformation)object).transactionDate;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getIntentURI() {
        return this.intentURI;
    }

    public final Float getNetPayableAmount() {
        return this.netPayableAmount;
    }

    public final String getPaymentEngineTransactionId() {
        return this.paymentEngineTransactionId;
    }

    public final String getPaymentGatewayTransactionId() {
        return this.paymentGatewayTransactionId;
    }

    public final String getPaymentGatewayType() {
        return this.paymentGatewayType;
    }

    public final String getPaymentInstrument() {
        return this.paymentInstrument;
    }

    public final String getPaymentInstrumentInstanceCode() {
        return this.paymentInstrumentInstanceCode;
    }

    public final String getTransactionDate() {
        return this.transactionDate;
    }

    public final Boolean getTransactionStatus() {
        return this.transactionStatus;
    }

    public final Long getTransactionTime() {
        return this.transactionTime;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.paymentGatewayType;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
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
        object = this.paymentGatewayTransactionId;
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
        object = this.netPayableAmount;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.transactionTime;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.transactionStatus;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.intentURI;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentInstrumentInstanceCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.transactionDate;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setIntentURI(String string2) {
        this.intentURI = string2;
    }

    public final void setNetPayableAmount(Float f5) {
        this.netPayableAmount = f5;
    }

    public final void setPaymentEngineTransactionId(String string2) {
        this.paymentEngineTransactionId = string2;
    }

    public final void setPaymentGatewayTransactionId(String string2) {
        this.paymentGatewayTransactionId = string2;
    }

    public final void setPaymentGatewayType(String string2) {
        this.paymentGatewayType = string2;
    }

    public final void setPaymentInstrument(String string2) {
        this.paymentInstrument = string2;
    }

    public final void setPaymentInstrumentInstanceCode(String string2) {
        this.paymentInstrumentInstanceCode = string2;
    }

    public final void setTransactionDate(String string2) {
        this.transactionDate = string2;
    }

    public final void setTransactionStatus(Boolean bl2) {
        this.transactionStatus = bl2;
    }

    public final void setTransactionTime(Long l2) {
        this.transactionTime = l2;
    }

    public String toString() {
        CharSequence charSequence = this.paymentGatewayType;
        String string2 = this.paymentInstrument;
        String string3 = this.paymentGatewayTransactionId;
        String string4 = this.paymentEngineTransactionId;
        Float f5 = this.netPayableAmount;
        Long l2 = this.transactionTime;
        Boolean bl2 = this.transactionStatus;
        String string5 = this.intentURI;
        String string6 = this.paymentInstrumentInstanceCode;
        String string7 = this.transactionDate;
        charSequence = og_1.a("PaymentInformation(paymentGatewayType=", (String)charSequence, ", paymentInstrument=", string2, ", paymentGatewayTransactionId=");
        X50.a((StringBuilder)charSequence, string3, ", paymentEngineTransactionId=", string4, ", netPayableAmount=");
        ((StringBuilder)charSequence).append(f5);
        ((StringBuilder)charSequence).append(", transactionTime=");
        ((StringBuilder)charSequence).append(l2);
        ((StringBuilder)charSequence).append(", transactionStatus=");
        xi0_2.a(bl2, ", intentURI=", string5, ", paymentInstrumentInstanceCode=", (StringBuilder)charSequence);
        return ko_0.a((StringBuilder)charSequence, string6, ", transactionDate=", string7, ")");
    }
}

