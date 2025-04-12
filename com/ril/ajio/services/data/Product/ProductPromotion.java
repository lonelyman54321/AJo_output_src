/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Product.ProductPromotion$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ProductPromotion
implements Serializable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String code;
    private String description;
    private String detailsURL;
    private final String endTime;
    private float maxSavingPrice;
    private final Boolean restrictedToNewUser;
    private final Boolean showEndTimer;
    private String termsLink;
    private final String timerShowDuration;
    private String title;

    static {
        ProductPromotion$Creator productPromotion$Creator = new ProductPromotion$Creator();
        CREATOR = productPromotion$Creator;
    }

    public ProductPromotion() {
        this(null, null, null, null, null, 0.0f, null, null, null, null, 1023, null);
    }

    public ProductPromotion(String string2, String string3, String string4, String string5, String string6, float f5, Boolean bl2, String string7, String string8, Boolean bl3) {
        this.code = string2;
        this.description = string3;
        this.detailsURL = string4;
        this.termsLink = string5;
        this.title = string6;
        this.maxSavingPrice = f5;
        this.showEndTimer = bl2;
        this.endTime = string7;
        this.timerShowDuration = string8;
        this.restrictedToNewUser = bl3;
    }

    public /* synthetic */ ProductPromotion(String object, String string2, String string3, String string4, String string5, float f5, Boolean bl2, String object2, String string6, Boolean object3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string7;
        float f6;
        String string8;
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
            string8 = null;
        } else {
            string8 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            f6 = 0.0f;
        } else {
            f6 = f5;
        }
        int n17 = n4 & 0x40;
        Boolean bl3 = n17 != 0 ? Boolean.FALSE : bl2;
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string7 = null;
        } else {
            string7 = object2;
        }
        int n19 = n4 & 0x100;
        if (n19 == 0) {
            string13 = string6;
        }
        Object object4 = (n4 &= 0x200) != 0 ? Boolean.FALSE : object3;
        object = this;
        string2 = string12;
        string3 = string11;
        string4 = string10;
        string5 = string9;
        object2 = bl3;
        string6 = string7;
        object3 = string13;
        this(string12, string11, string10, string9, string8, f6, bl3, string7, string13, (Boolean)object4);
    }

    public final int describeContents() {
        return 0;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDetailsURL() {
        return this.detailsURL;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final float getMaxSavingPrice() {
        return this.maxSavingPrice;
    }

    public final Boolean getRestrictedToNewUser() {
        return this.restrictedToNewUser;
    }

    public final Boolean getShowEndTimer() {
        return this.showEndTimer;
    }

    public final String getTermsLink() {
        return this.termsLink;
    }

    public final String getTimerShowDuration() {
        return this.timerShowDuration;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setDetailsURL(String string2) {
        this.detailsURL = string2;
    }

    public final void setMaxSavingPrice(float f5) {
        this.maxSavingPrice = f5;
    }

    public final void setTermsLink(String string2) {
        this.termsLink = string2;
    }

    public final void setTitle(String string2) {
        this.title = string2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.code;
        parcel.writeString((String)object);
        object = this.description;
        parcel.writeString((String)object);
        object = this.detailsURL;
        parcel.writeString((String)object);
        object = this.termsLink;
        parcel.writeString((String)object);
        object = this.title;
        parcel.writeString((String)object);
        float f5 = this.maxSavingPrice;
        parcel.writeFloat(f5);
        object = this.showEndTimer;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            yi0_2.a(parcel, n4, (Boolean)object);
        }
        object = this.endTime;
        parcel.writeString((String)object);
        object = this.timerShowDuration;
        parcel.writeString((String)object);
        object = this.restrictedToNewUser;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            yi0_2.a(parcel, n4, (Boolean)object);
        }
    }
}

