/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Deal;
import com.ril.ajio.services.data.Price$Creator;
import com.ril.ajio.services.data.Product.PriceReveal;
import com.ril.ajio.services.data.Product.TaxInformation;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public class Price
implements Serializable,
Parcelable,
Cloneable {
    public static final Parcelable.Creator CREATOR;
    private final Deal deal;
    private final String discountPercent;
    private final String discountValue;
    private String displayformattedValue;
    private String experimentId;
    private String formattedValue;
    private Float futureBestPrice;
    private String futureDiscountPercent;
    private final Boolean giftAvailable;
    private PriceReveal priceReveal;
    private String segmentId;
    private TaxInformation taxInformation;
    private String value;

    static {
        Price$Creator price$Creator = new Price$Creator();
        CREATOR = price$Creator;
    }

    public Price() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public Price(String string2, String string3, String string4, TaxInformation taxInformation, Deal deal, String string5, PriceReveal priceReveal, Float f5, String string6, String string7, String string8, String string9, Boolean bl2) {
        this.formattedValue = string2;
        this.displayformattedValue = string3;
        this.value = string4;
        this.taxInformation = taxInformation;
        this.deal = deal;
        this.discountPercent = string5;
        this.priceReveal = priceReveal;
        this.futureBestPrice = f5;
        this.futureDiscountPercent = string6;
        this.experimentId = string7;
        this.segmentId = string8;
        this.discountValue = string9;
        this.giftAvailable = bl2;
    }

    public /* synthetic */ Price(String object, String string2, String string3, TaxInformation object2, Deal parcelable, String object3, PriceReveal object4, Float serializable, String object5, String string4, String string5, String string6, Boolean object6, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string7;
        String string8;
        String string9;
        Float f5;
        PriceReveal priceReveal;
        String string10;
        Deal deal;
        TaxInformation taxInformation;
        String string11;
        String string12;
        int n4 = n3;
        int n7 = n3 & 1;
        Object object7 = n7 != 0 ? "00.00" : object;
        int n8 = n4 & 2;
        String string13 = null;
        if (n8 != 0) {
            n8 = 0;
            string12 = null;
        } else {
            string12 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string11 = null;
        } else {
            string11 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            taxInformation = null;
        } else {
            taxInformation = object2;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            deal = null;
        } else {
            deal = parcelable;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string10 = null;
        } else {
            string10 = object3;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            priceReveal = null;
        } else {
            priceReveal = object4;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            f5 = null;
        } else {
            f5 = serializable;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string9 = null;
        } else {
            string9 = object5;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string8 = null;
        } else {
            string8 = string4;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string7 = null;
        } else {
            string7 = string5;
        }
        int n22 = n4 & 0x800;
        if (n22 == 0) {
            string13 = string6;
        }
        Object object8 = (n4 &= 0x1000) != 0 ? Boolean.FALSE : object6;
        object = this;
        string2 = object7;
        string3 = string12;
        object2 = string11;
        parcelable = taxInformation;
        object3 = deal;
        object4 = string10;
        serializable = priceReveal;
        object5 = f5;
        string4 = string9;
        string5 = string8;
        string6 = string7;
        object6 = string13;
        this((String)object7, string12, string11, taxInformation, deal, string10, priceReveal, f5, string9, string8, string7, string13, (Boolean)object8);
    }

    public Price clone() {
        Object object = super.clone();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.Price");
        object = (Price)object;
        Parcelable parcelable = this.taxInformation;
        PriceReveal priceReveal = null;
        parcelable = parcelable != null ? parcelable.clone() : null;
        ((Price)object).taxInformation = parcelable;
        parcelable = this.priceReveal;
        if (parcelable != null) {
            priceReveal = parcelable.clone();
        }
        ((Price)object).priceReveal = priceReveal;
        return object;
    }

    public int describeContents() {
        return 0;
    }

    public final Deal getDeal() {
        return this.deal;
    }

    public final String getDiscountPercent() {
        return this.discountPercent;
    }

    public final String getDiscountValue() {
        return this.discountValue;
    }

    public final String getDisplayformattedValue() {
        return this.displayformattedValue;
    }

    public final String getExperimentId() {
        return this.experimentId;
    }

    public final String getFormattedValue() {
        return this.formattedValue;
    }

    public final Float getFutureBestPrice() {
        return this.futureBestPrice;
    }

    public final String getFutureDiscountPercent() {
        return this.futureDiscountPercent;
    }

    public final Boolean getGiftAvailable() {
        return this.giftAvailable;
    }

    public final PriceReveal getPriceReveal() {
        return this.priceReveal;
    }

    public final String getSegmentId() {
        return this.segmentId;
    }

    public final TaxInformation getTaxInformation() {
        return this.taxInformation;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setDisplayformattedValue(String string2) {
        this.displayformattedValue = string2;
    }

    public final void setExperimentId(String string2) {
        this.experimentId = string2;
    }

    public final void setFormattedValue(String string2) {
        this.formattedValue = string2;
    }

    public final void setFutureBestPrice(Float f5) {
        this.futureBestPrice = f5;
    }

    public final void setFutureDiscountPercent(String string2) {
        this.futureDiscountPercent = string2;
    }

    public final void setPriceReveal(PriceReveal priceReveal) {
        this.priceReveal = priceReveal;
    }

    public final void setSegmentId(String string2) {
        this.segmentId = string2;
    }

    public final void setTaxInformation(TaxInformation taxInformation) {
        this.taxInformation = taxInformation;
    }

    public final void setValue(String string2) {
        this.value = string2;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.formattedValue;
        parcel.writeString((String)object);
        object = this.displayformattedValue;
        parcel.writeString((String)object);
        object = this.value;
        parcel.writeString((String)object);
        object = this.taxInformation;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            ((TaxInformation)object).writeToParcel(parcel, n3);
        }
        object = this.deal;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            ((Deal)object).writeToParcel(parcel, n3);
        }
        object = this.discountPercent;
        parcel.writeString((String)object);
        object = this.priceReveal;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            ((PriceReveal)object).writeToParcel(parcel, n3);
        }
        Object object2 = this.futureBestPrice;
        if (object2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            float f5 = ((Float)object2).floatValue();
            parcel.writeFloat(f5);
        }
        object2 = this.futureDiscountPercent;
        parcel.writeString((String)object2);
        object2 = this.experimentId;
        parcel.writeString((String)object2);
        object2 = this.segmentId;
        parcel.writeString((String)object2);
        object2 = this.discountValue;
        parcel.writeString((String)object2);
        object2 = this.giftAvailable;
        if (object2 == null) {
            parcel.writeInt(0);
        } else {
            yi0_2.a(parcel, n4, (Boolean)object2);
        }
    }
}

