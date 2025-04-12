/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PaymentInstrumentType
implements Serializable {
    private Boolean autoSelectEnabled;
    private Boolean emiDataSent;
    private Boolean paymentInstrumentActive;
    private String paymentInstrumentCode;
    private String paymentInstrumentDescription;
    private Boolean paymentInstrumentDisabled;
    private String paymentInstrumentName;
    private ArrayList paymentInstrumentsInfo;

    public PaymentInstrumentType() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public PaymentInstrumentType(String string2, String string3, String string4, Boolean bl2, ArrayList arrayList, Boolean bl3, Boolean bl4, Boolean bl5) {
        this.paymentInstrumentCode = string2;
        this.paymentInstrumentName = string3;
        this.paymentInstrumentDescription = string4;
        this.paymentInstrumentActive = bl2;
        this.paymentInstrumentsInfo = arrayList;
        this.autoSelectEnabled = bl3;
        this.paymentInstrumentDisabled = bl4;
        this.emiDataSent = bl5;
    }

    public /* synthetic */ PaymentInstrumentType(String object, String string2, String string3, Boolean object2, ArrayList serializable, Boolean serializable2, Boolean bl2, Boolean bl3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string4;
        String string5;
        String string6;
        int n4 = n3;
        int n7 = n3 & 1;
        ArrayList arrayList = null;
        if (n7 != 0) {
            n7 = 0;
            string6 = null;
        } else {
            string6 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string5 = null;
        } else {
            string5 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string4 = null;
        } else {
            string4 = string3;
        }
        int n14 = n4 & 8;
        Object object3 = n14 != 0 ? Boolean.FALSE : object2;
        int n15 = n4 & 0x10;
        if (n15 == 0) {
            arrayList = serializable;
        }
        n15 = n4 & 0x20;
        Boolean bl4 = n15 != 0 ? Boolean.FALSE : serializable2;
        int n16 = n4 & 0x40;
        Boolean bl5 = n16 != 0 ? Boolean.FALSE : bl2;
        Boolean bl6 = (n4 &= 0x80) != 0 ? Boolean.FALSE : bl3;
        object = this;
        string2 = string6;
        string3 = string5;
        object2 = string4;
        serializable = object3;
        serializable2 = arrayList;
        bl2 = bl4;
        bl3 = bl5;
        this(string6, string5, string4, (Boolean)object3, arrayList, bl4, bl5, bl6);
    }

    public static /* synthetic */ PaymentInstrumentType copy$default(PaymentInstrumentType paymentInstrumentType, String string2, String string3, String string4, Boolean bl2, ArrayList arrayList, Boolean bl3, Boolean bl4, Boolean bl5, int n3, Object object) {
        PaymentInstrumentType paymentInstrumentType2 = paymentInstrumentType;
        int n4 = n3;
        int n7 = n3 & 1;
        String string5 = n7 != 0 ? paymentInstrumentType.paymentInstrumentCode : string2;
        int n8 = n4 & 2;
        String string6 = n8 != 0 ? paymentInstrumentType2.paymentInstrumentName : string3;
        int n10 = n4 & 4;
        String string7 = n10 != 0 ? paymentInstrumentType2.paymentInstrumentDescription : string4;
        int n14 = n4 & 8;
        Boolean bl6 = n14 != 0 ? paymentInstrumentType2.paymentInstrumentActive : bl2;
        int n15 = n4 & 0x10;
        ArrayList arrayList2 = n15 != 0 ? paymentInstrumentType2.paymentInstrumentsInfo : arrayList;
        int n16 = n4 & 0x20;
        Boolean bl7 = n16 != 0 ? paymentInstrumentType2.autoSelectEnabled : bl3;
        int n17 = n4 & 0x40;
        Boolean bl8 = n17 != 0 ? paymentInstrumentType2.paymentInstrumentDisabled : bl4;
        Boolean bl9 = (n4 &= 0x80) != 0 ? paymentInstrumentType2.emiDataSent : bl5;
        string2 = string5;
        string3 = string6;
        string4 = string7;
        bl2 = bl6;
        arrayList = arrayList2;
        bl3 = bl7;
        bl4 = bl8;
        bl5 = bl9;
        return paymentInstrumentType.copy(string5, string6, string7, bl6, arrayList2, bl7, bl8, bl9);
    }

    public final String component1() {
        return this.paymentInstrumentCode;
    }

    public final String component2() {
        return this.paymentInstrumentName;
    }

    public final String component3() {
        return this.paymentInstrumentDescription;
    }

    public final Boolean component4() {
        return this.paymentInstrumentActive;
    }

    public final ArrayList component5() {
        return this.paymentInstrumentsInfo;
    }

    public final Boolean component6() {
        return this.autoSelectEnabled;
    }

    public final Boolean component7() {
        return this.paymentInstrumentDisabled;
    }

    public final Boolean component8() {
        return this.emiDataSent;
    }

    public final PaymentInstrumentType copy(String string2, String string3, String string4, Boolean bl2, ArrayList arrayList, Boolean bl3, Boolean bl4, Boolean bl5) {
        PaymentInstrumentType paymentInstrumentType = new PaymentInstrumentType(string2, string3, string4, bl2, arrayList, bl3, bl4, bl5);
        return paymentInstrumentType;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PaymentInstrumentType;
        if (!bl3) {
            return false;
        }
        object = (PaymentInstrumentType)object;
        Object object2 = this.paymentInstrumentCode;
        Object object3 = ((PaymentInstrumentType)object).paymentInstrumentCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentInstrumentName;
        object3 = ((PaymentInstrumentType)object).paymentInstrumentName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentInstrumentDescription;
        object3 = ((PaymentInstrumentType)object).paymentInstrumentDescription;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentInstrumentActive;
        object3 = ((PaymentInstrumentType)object).paymentInstrumentActive;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentInstrumentsInfo;
        object3 = ((PaymentInstrumentType)object).paymentInstrumentsInfo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.autoSelectEnabled;
        object3 = ((PaymentInstrumentType)object).autoSelectEnabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentInstrumentDisabled;
        object3 = ((PaymentInstrumentType)object).paymentInstrumentDisabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.emiDataSent;
        object = ((PaymentInstrumentType)object).emiDataSent;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Boolean getAutoSelectEnabled() {
        return this.autoSelectEnabled;
    }

    public final Boolean getEmiDataSent() {
        return this.emiDataSent;
    }

    public final Boolean getPaymentInstrumentActive() {
        return this.paymentInstrumentActive;
    }

    public final String getPaymentInstrumentCode() {
        return this.paymentInstrumentCode;
    }

    public final String getPaymentInstrumentDescription() {
        return this.paymentInstrumentDescription;
    }

    public final Boolean getPaymentInstrumentDisabled() {
        return this.paymentInstrumentDisabled;
    }

    public final String getPaymentInstrumentName() {
        return this.paymentInstrumentName;
    }

    public final ArrayList getPaymentInstrumentsInfo() {
        return this.paymentInstrumentsInfo;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.paymentInstrumentCode;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.paymentInstrumentName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentInstrumentDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentInstrumentActive;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentInstrumentsInfo;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.autoSelectEnabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentInstrumentDisabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.emiDataSent;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setAutoSelectEnabled(Boolean bl2) {
        this.autoSelectEnabled = bl2;
    }

    public final void setEmiDataSent(Boolean bl2) {
        this.emiDataSent = bl2;
    }

    public final void setPaymentInstrumentActive(Boolean bl2) {
        this.paymentInstrumentActive = bl2;
    }

    public final void setPaymentInstrumentCode(String string2) {
        this.paymentInstrumentCode = string2;
    }

    public final void setPaymentInstrumentDescription(String string2) {
        this.paymentInstrumentDescription = string2;
    }

    public final void setPaymentInstrumentDisabled(Boolean bl2) {
        this.paymentInstrumentDisabled = bl2;
    }

    public final void setPaymentInstrumentName(String string2) {
        this.paymentInstrumentName = string2;
    }

    public final void setPaymentInstrumentsInfo(ArrayList arrayList) {
        this.paymentInstrumentsInfo = arrayList;
    }

    public String toString() {
        CharSequence charSequence = this.paymentInstrumentCode;
        String string2 = this.paymentInstrumentName;
        String string3 = this.paymentInstrumentDescription;
        Boolean bl2 = this.paymentInstrumentActive;
        ArrayList arrayList = this.paymentInstrumentsInfo;
        Boolean bl3 = this.autoSelectEnabled;
        Boolean bl4 = this.paymentInstrumentDisabled;
        Boolean bl5 = this.emiDataSent;
        charSequence = og_1.a("PaymentInstrumentType(paymentInstrumentCode=", (String)charSequence, ", paymentInstrumentName=", string2, ", paymentInstrumentDescription=");
        vw0_1.a(bl2, string3, ", paymentInstrumentActive=", ", paymentInstrumentsInfo=", (StringBuilder)charSequence);
        ((StringBuilder)charSequence).append(arrayList);
        ((StringBuilder)charSequence).append(", autoSelectEnabled=");
        ((StringBuilder)charSequence).append(bl3);
        ((StringBuilder)charSequence).append(", paymentInstrumentDisabled=");
        ((StringBuilder)charSequence).append(bl4);
        ((StringBuilder)charSequence).append(", emiDataSent=");
        ((StringBuilder)charSequence).append(bl5);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

