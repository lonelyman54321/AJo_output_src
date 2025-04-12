/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
package com.ril.ajio.services.data.Payment;

import android.graphics.drawable.Drawable;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PriceValidation;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class UpiAppInfo
implements Serializable {
    private Drawable appDrawabe;
    private String displayUPIInfo;
    private Boolean isSelected;
    private String name;
    private OfferDetails offerDetails;
    private String packageName;
    private String paymentInstrumentId;
    private PriceValidation priceValidation;

    public UpiAppInfo() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public UpiAppInfo(String string2, String string3, Drawable drawable2, Boolean bl2, OfferDetails offerDetails, String string4, PriceValidation priceValidation, String string5) {
        this.name = string2;
        this.packageName = string3;
        this.appDrawabe = drawable2;
        this.isSelected = bl2;
        this.offerDetails = offerDetails;
        this.paymentInstrumentId = string4;
        this.priceValidation = priceValidation;
        this.displayUPIInfo = string5;
    }

    public /* synthetic */ UpiAppInfo(String object, String string2, Drawable object2, Boolean bl2, OfferDetails serializable, String object3, PriceValidation object4, String object5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        PriceValidation priceValidation;
        String string3;
        OfferDetails offerDetails;
        Drawable drawable2;
        String string4;
        String string5;
        int n4 = n3;
        int n7 = n3 & 1;
        String string6 = null;
        if (n7 != 0) {
            n7 = 0;
            string5 = null;
        } else {
            string5 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string4 = null;
        } else {
            string4 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            drawable2 = null;
        } else {
            drawable2 = object2;
        }
        int n14 = n4 & 8;
        Boolean bl3 = n14 != 0 ? Boolean.FALSE : bl2;
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            offerDetails = null;
        } else {
            offerDetails = serializable;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string3 = null;
        } else {
            string3 = object3;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            priceValidation = null;
        } else {
            priceValidation = object4;
        }
        if ((n4 &= 0x80) == 0) {
            string6 = object5;
        }
        object = this;
        string2 = string5;
        object2 = string4;
        bl2 = drawable2;
        serializable = bl3;
        object3 = offerDetails;
        object4 = string3;
        object5 = priceValidation;
        this(string5, string4, drawable2, bl3, offerDetails, string3, priceValidation, string6);
    }

    public static /* synthetic */ UpiAppInfo copy$default(UpiAppInfo upiAppInfo, String string2, String string3, Drawable drawable2, Boolean bl2, OfferDetails offerDetails, String string4, PriceValidation priceValidation, String string5, int n3, Object object) {
        UpiAppInfo upiAppInfo2 = upiAppInfo;
        int n4 = n3;
        int n7 = n3 & 1;
        String string6 = n7 != 0 ? upiAppInfo.name : string2;
        int n8 = n4 & 2;
        String string7 = n8 != 0 ? upiAppInfo2.packageName : string3;
        int n10 = n4 & 4;
        Drawable drawable3 = n10 != 0 ? upiAppInfo2.appDrawabe : drawable2;
        int n14 = n4 & 8;
        Boolean bl3 = n14 != 0 ? upiAppInfo2.isSelected : bl2;
        int n15 = n4 & 0x10;
        OfferDetails offerDetails2 = n15 != 0 ? upiAppInfo2.offerDetails : offerDetails;
        int n16 = n4 & 0x20;
        String string8 = n16 != 0 ? upiAppInfo2.paymentInstrumentId : string4;
        int n17 = n4 & 0x40;
        PriceValidation priceValidation2 = n17 != 0 ? upiAppInfo2.priceValidation : priceValidation;
        String string9 = (n4 &= 0x80) != 0 ? upiAppInfo2.displayUPIInfo : string5;
        string2 = string6;
        string3 = string7;
        drawable2 = drawable3;
        bl2 = bl3;
        offerDetails = offerDetails2;
        string4 = string8;
        priceValidation = priceValidation2;
        string5 = string9;
        return upiAppInfo.copy(string6, string7, drawable3, bl3, offerDetails2, string8, priceValidation2, string9);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.packageName;
    }

    public final Drawable component3() {
        return this.appDrawabe;
    }

    public final Boolean component4() {
        return this.isSelected;
    }

    public final OfferDetails component5() {
        return this.offerDetails;
    }

    public final String component6() {
        return this.paymentInstrumentId;
    }

    public final PriceValidation component7() {
        return this.priceValidation;
    }

    public final String component8() {
        return this.displayUPIInfo;
    }

    public final UpiAppInfo copy(String string2, String string3, Drawable drawable2, Boolean bl2, OfferDetails offerDetails, String string4, PriceValidation priceValidation, String string5) {
        UpiAppInfo upiAppInfo = new UpiAppInfo(string2, string3, drawable2, bl2, offerDetails, string4, priceValidation, string5);
        return upiAppInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof UpiAppInfo;
        if (!bl3) {
            return false;
        }
        object = (UpiAppInfo)object;
        Object object2 = this.name;
        Object object3 = ((UpiAppInfo)object).name;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.packageName;
        object3 = ((UpiAppInfo)object).packageName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.appDrawabe;
        object3 = ((UpiAppInfo)object).appDrawabe;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isSelected;
        object3 = ((UpiAppInfo)object).isSelected;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerDetails;
        object3 = ((UpiAppInfo)object).offerDetails;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentInstrumentId;
        object3 = ((UpiAppInfo)object).paymentInstrumentId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.priceValidation;
        object3 = ((UpiAppInfo)object).priceValidation;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.displayUPIInfo;
        object = ((UpiAppInfo)object).displayUPIInfo;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Drawable getAppDrawabe() {
        return this.appDrawabe;
    }

    public final String getDisplayUPIInfo() {
        return this.displayUPIInfo;
    }

    public final String getName() {
        return this.name;
    }

    public final OfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPaymentInstrumentId() {
        return this.paymentInstrumentId;
    }

    public final PriceValidation getPriceValidation() {
        return this.priceValidation;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.name;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.packageName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.appDrawabe;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isSelected;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
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
        object = this.paymentInstrumentId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.priceValidation;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((PriceValidation)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.displayUPIInfo;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    public final void setAppDrawabe(Drawable drawable2) {
        this.appDrawabe = drawable2;
    }

    public final void setDisplayUPIInfo(String string2) {
        this.displayUPIInfo = string2;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setOfferDetails(OfferDetails offerDetails) {
        this.offerDetails = offerDetails;
    }

    public final void setPackageName(String string2) {
        this.packageName = string2;
    }

    public final void setPaymentInstrumentId(String string2) {
        this.paymentInstrumentId = string2;
    }

    public final void setPriceValidation(PriceValidation priceValidation) {
        this.priceValidation = priceValidation;
    }

    public final void setSelected(Boolean bl2) {
        this.isSelected = bl2;
    }

    public String toString() {
        CharSequence charSequence = this.name;
        String string2 = this.packageName;
        Drawable drawable2 = this.appDrawabe;
        Boolean bl2 = this.isSelected;
        OfferDetails offerDetails = this.offerDetails;
        String string3 = this.paymentInstrumentId;
        PriceValidation priceValidation = this.priceValidation;
        String string4 = this.displayUPIInfo;
        charSequence = og_1.a("UpiAppInfo(name=", (String)charSequence, ", packageName=", string2, ", appDrawabe=");
        ((StringBuilder)charSequence).append(drawable2);
        ((StringBuilder)charSequence).append(", isSelected=");
        ((StringBuilder)charSequence).append(bl2);
        ((StringBuilder)charSequence).append(", offerDetails=");
        ((StringBuilder)charSequence).append(offerDetails);
        ((StringBuilder)charSequence).append(", paymentInstrumentId=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", priceValidation=");
        ((StringBuilder)charSequence).append(priceValidation);
        ((StringBuilder)charSequence).append(", displayUPIInfo=");
        ((StringBuilder)charSequence).append(string4);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

