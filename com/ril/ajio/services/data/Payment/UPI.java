/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PriceValidation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class UPI {
    private String appName;
    private Boolean intent;
    private OfferDetails offerDetails;
    private String paymentInstrumentId;
    private PriceValidation priceValidation;
    private Boolean saveUPI;
    private String type;
    private String vpa;

    public UPI() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public UPI(String string2, String string3, Boolean bl2, Boolean bl3, String string4, String string5, OfferDetails offerDetails, PriceValidation priceValidation) {
        this.vpa = string2;
        this.appName = string3;
        this.intent = bl2;
        this.saveUPI = bl3;
        this.paymentInstrumentId = string4;
        this.type = string5;
        this.offerDetails = offerDetails;
        this.priceValidation = priceValidation;
    }

    public /* synthetic */ UPI(String object, String string2, Boolean object2, Boolean bl2, String object3, String string3, OfferDetails object4, PriceValidation serializable, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        OfferDetails offerDetails;
        String string4;
        String string5;
        String string6;
        String string7;
        int n4 = n3;
        int n7 = n3 & 1;
        PriceValidation priceValidation = null;
        if (n7 != 0) {
            n7 = 0;
            string7 = null;
        } else {
            string7 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string6 = null;
        } else {
            string6 = string2;
        }
        int n10 = n4 & 4;
        Object object5 = n10 != 0 ? Boolean.FALSE : object2;
        int n14 = n4 & 8;
        Boolean bl3 = n14 != 0 ? Boolean.FALSE : bl2;
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string5 = null;
        } else {
            string5 = object3;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string4 = null;
        } else {
            string4 = string3;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            offerDetails = null;
        } else {
            offerDetails = object4;
        }
        if ((n4 &= 0x80) == 0) {
            priceValidation = serializable;
        }
        object = this;
        string2 = string7;
        object2 = string6;
        bl2 = object5;
        object3 = bl3;
        string3 = string5;
        object4 = string4;
        serializable = offerDetails;
        this(string7, string6, (Boolean)object5, bl3, string5, string4, offerDetails, priceValidation);
    }

    public static /* synthetic */ UPI copy$default(UPI uPI, String string2, String string3, Boolean bl2, Boolean bl3, String string4, String string5, OfferDetails offerDetails, PriceValidation priceValidation, int n3, Object object) {
        UPI uPI2 = uPI;
        int n4 = n3;
        int n7 = n3 & 1;
        String string6 = n7 != 0 ? uPI.vpa : string2;
        int n8 = n4 & 2;
        String string7 = n8 != 0 ? uPI2.appName : string3;
        int n10 = n4 & 4;
        Boolean bl4 = n10 != 0 ? uPI2.intent : bl2;
        int n14 = n4 & 8;
        Boolean bl5 = n14 != 0 ? uPI2.saveUPI : bl3;
        int n15 = n4 & 0x10;
        String string8 = n15 != 0 ? uPI2.paymentInstrumentId : string4;
        int n16 = n4 & 0x20;
        String string9 = n16 != 0 ? uPI2.type : string5;
        int n17 = n4 & 0x40;
        OfferDetails offerDetails2 = n17 != 0 ? uPI2.offerDetails : offerDetails;
        PriceValidation priceValidation2 = (n4 &= 0x80) != 0 ? uPI2.priceValidation : priceValidation;
        string2 = string6;
        string3 = string7;
        bl2 = bl4;
        bl3 = bl5;
        string4 = string8;
        string5 = string9;
        offerDetails = offerDetails2;
        priceValidation = priceValidation2;
        return uPI.copy(string6, string7, bl4, bl5, string8, string9, offerDetails2, priceValidation2);
    }

    public final String component1() {
        return this.vpa;
    }

    public final String component2() {
        return this.appName;
    }

    public final Boolean component3() {
        return this.intent;
    }

    public final Boolean component4() {
        return this.saveUPI;
    }

    public final String component5() {
        return this.paymentInstrumentId;
    }

    public final String component6() {
        return this.type;
    }

    public final OfferDetails component7() {
        return this.offerDetails;
    }

    public final PriceValidation component8() {
        return this.priceValidation;
    }

    public final UPI copy(String string2, String string3, Boolean bl2, Boolean bl3, String string4, String string5, OfferDetails offerDetails, PriceValidation priceValidation) {
        UPI uPI = new UPI(string2, string3, bl2, bl3, string4, string5, offerDetails, priceValidation);
        return uPI;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof UPI;
        if (!bl3) {
            return false;
        }
        object = (UPI)object;
        Object object2 = this.vpa;
        Object object3 = ((UPI)object).vpa;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.appName;
        object3 = ((UPI)object).appName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.intent;
        object3 = ((UPI)object).intent;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.saveUPI;
        object3 = ((UPI)object).saveUPI;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentInstrumentId;
        object3 = ((UPI)object).paymentInstrumentId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.type;
        object3 = ((UPI)object).type;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerDetails;
        object3 = ((UPI)object).offerDetails;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.priceValidation;
        object = ((UPI)object).priceValidation;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final Boolean getIntent() {
        return this.intent;
    }

    public final OfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    public final String getPaymentInstrumentId() {
        return this.paymentInstrumentId;
    }

    public final PriceValidation getPriceValidation() {
        return this.priceValidation;
    }

    public final Boolean getSaveUPI() {
        return this.saveUPI;
    }

    public final String getType() {
        return this.type;
    }

    public final String getVpa() {
        return this.vpa;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.vpa;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.appName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.intent;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.saveUPI;
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
        object = this.type;
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
            n3 = ((OfferDetails)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.priceValidation;
        if (object != null) {
            n7 = ((PriceValidation)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setAppName(String string2) {
        this.appName = string2;
    }

    public final void setIntent(Boolean bl2) {
        this.intent = bl2;
    }

    public final void setOfferDetails(OfferDetails offerDetails) {
        this.offerDetails = offerDetails;
    }

    public final void setPaymentInstrumentId(String string2) {
        this.paymentInstrumentId = string2;
    }

    public final void setPriceValidation(PriceValidation priceValidation) {
        this.priceValidation = priceValidation;
    }

    public final void setSaveUPI(Boolean bl2) {
        this.saveUPI = bl2;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public final void setVpa(String string2) {
        this.vpa = string2;
    }

    public String toString() {
        CharSequence charSequence = this.vpa;
        String string2 = this.appName;
        Boolean bl2 = this.intent;
        Boolean bl3 = this.saveUPI;
        String string3 = this.paymentInstrumentId;
        String string4 = this.type;
        OfferDetails offerDetails = this.offerDetails;
        PriceValidation priceValidation = this.priceValidation;
        charSequence = og_1.a("UPI(vpa=", (String)charSequence, ", appName=", string2, ", intent=");
        ((StringBuilder)charSequence).append(bl2);
        ((StringBuilder)charSequence).append(", saveUPI=");
        ((StringBuilder)charSequence).append(bl3);
        ((StringBuilder)charSequence).append(", paymentInstrumentId=");
        X50.a((StringBuilder)charSequence, string3, ", type=", string4, ", offerDetails=");
        ((StringBuilder)charSequence).append(offerDetails);
        ((StringBuilder)charSequence).append(", priceValidation=");
        ((StringBuilder)charSequence).append(priceValidation);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

