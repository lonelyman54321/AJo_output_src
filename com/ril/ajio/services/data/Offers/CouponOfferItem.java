/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Offers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Offers.CouponOfferItem$Creator;
import kotlin.jvm.internal.Intrinsics;

public final class CouponOfferItem
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String couponDescription;
    private String couponExpireDate;
    private String couponTitle;
    private String type;

    static {
        CouponOfferItem$Creator couponOfferItem$Creator = new CouponOfferItem$Creator();
        CREATOR = couponOfferItem$Creator;
    }

    public CouponOfferItem(String string2, String string3, String string4, String string5) {
        this.couponDescription = string2;
        this.couponExpireDate = string3;
        this.couponTitle = string4;
        this.type = string5;
    }

    public static /* synthetic */ CouponOfferItem copy$default(CouponOfferItem couponOfferItem, String string2, String string3, String string4, String string5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = couponOfferItem.couponDescription;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = couponOfferItem.couponExpireDate;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = couponOfferItem.couponTitle;
        }
        if ((n3 &= 8) != 0) {
            string5 = couponOfferItem.type;
        }
        return couponOfferItem.copy(string2, string3, string4, string5);
    }

    public final String component1() {
        return this.couponDescription;
    }

    public final String component2() {
        return this.couponExpireDate;
    }

    public final String component3() {
        return this.couponTitle;
    }

    public final String component4() {
        return this.type;
    }

    public final CouponOfferItem copy(String string2, String string3, String string4, String string5) {
        CouponOfferItem couponOfferItem = new CouponOfferItem(string2, string3, string4, string5);
        return couponOfferItem;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CouponOfferItem;
        if (!bl3) {
            return false;
        }
        object = (CouponOfferItem)object;
        String string2 = this.couponDescription;
        String string3 = ((CouponOfferItem)object).couponDescription;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.couponExpireDate;
        string3 = ((CouponOfferItem)object).couponExpireDate;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.couponTitle;
        string3 = ((CouponOfferItem)object).couponTitle;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.type;
        object = ((CouponOfferItem)object).type;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCouponDescription() {
        return this.couponDescription;
    }

    public final String getCouponExpireDate() {
        return this.couponExpireDate;
    }

    public final String getCouponTitle() {
        return this.couponTitle;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.couponDescription;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.couponExpireDate;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.couponTitle;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.type;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setCouponDescription(String string2) {
        this.couponDescription = string2;
    }

    public final void setCouponExpireDate(String string2) {
        this.couponExpireDate = string2;
    }

    public final void setCouponTitle(String string2) {
        this.couponTitle = string2;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public String toString() {
        String string2 = this.couponDescription;
        String string3 = this.couponExpireDate;
        String string4 = this.couponTitle;
        String string5 = this.type;
        return ko_0.a(og_1.a("CouponOfferItem(couponDescription=", string2, ", couponExpireDate=", string3, ", couponTitle="), string4, ", type=", string5, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.couponDescription;
        parcel.writeString(string2);
        string2 = this.couponExpireDate;
        parcel.writeString(string2);
        string2 = this.couponTitle;
        parcel.writeString(string2);
        string2 = this.type;
        parcel.writeString(string2);
    }
}

