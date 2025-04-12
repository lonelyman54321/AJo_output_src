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
import com.ril.ajio.services.data.Offers.VoucherOfferItem$Creator;
import kotlin.jvm.internal.Intrinsics;

public final class VoucherOfferItem
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String cartPageDescription;
    private String detailsURL;
    private String type;
    private String voucherCode;
    private String voucherDescription;
    private String voucherExpireDate;
    private String voucherTncUrl;

    static {
        VoucherOfferItem$Creator voucherOfferItem$Creator = new VoucherOfferItem$Creator();
        CREATOR = voucherOfferItem$Creator;
    }

    public VoucherOfferItem(String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        this.detailsURL = string2;
        this.type = string3;
        this.voucherCode = string4;
        this.cartPageDescription = string5;
        this.voucherDescription = string6;
        this.voucherTncUrl = string7;
        this.voucherExpireDate = string8;
    }

    public static /* synthetic */ VoucherOfferItem copy$default(VoucherOfferItem voucherOfferItem, String string2, String object, String string3, String object2, String string4, String string5, String string6, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = voucherOfferItem.detailsURL;
        }
        if ((n4 = n3 & 2) != 0) {
            object = voucherOfferItem.type;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = voucherOfferItem.voucherCode;
        }
        String string7 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = voucherOfferItem.cartPageDescription;
        }
        String string8 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = voucherOfferItem.voucherDescription;
        }
        String string9 = string4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            string5 = voucherOfferItem.voucherTncUrl;
        }
        String string10 = string5;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            string6 = voucherOfferItem.voucherExpireDate;
        }
        String string11 = string6;
        object = voucherOfferItem;
        string3 = string2;
        object2 = object3;
        string4 = string7;
        string5 = string8;
        string6 = string9;
        object3 = string11;
        return voucherOfferItem.copy(string2, (String)object2, string7, string8, string9, string10, string11);
    }

    public final String component1() {
        return this.detailsURL;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.voucherCode;
    }

    public final String component4() {
        return this.cartPageDescription;
    }

    public final String component5() {
        return this.voucherDescription;
    }

    public final String component6() {
        return this.voucherTncUrl;
    }

    public final String component7() {
        return this.voucherExpireDate;
    }

    public final VoucherOfferItem copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        VoucherOfferItem voucherOfferItem = new VoucherOfferItem(string2, string3, string4, string5, string6, string7, string8);
        return voucherOfferItem;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof VoucherOfferItem;
        if (!bl3) {
            return false;
        }
        object = (VoucherOfferItem)object;
        String string2 = this.detailsURL;
        String string3 = ((VoucherOfferItem)object).detailsURL;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.type;
        string3 = ((VoucherOfferItem)object).type;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.voucherCode;
        string3 = ((VoucherOfferItem)object).voucherCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.cartPageDescription;
        string3 = ((VoucherOfferItem)object).cartPageDescription;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.voucherDescription;
        string3 = ((VoucherOfferItem)object).voucherDescription;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.voucherTncUrl;
        string3 = ((VoucherOfferItem)object).voucherTncUrl;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.voucherExpireDate;
        object = ((VoucherOfferItem)object).voucherExpireDate;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCartPageDescription() {
        return this.cartPageDescription;
    }

    public final String getDetailsURL() {
        return this.detailsURL;
    }

    public final String getType() {
        return this.type;
    }

    public final String getVoucherCode() {
        return this.voucherCode;
    }

    public final String getVoucherDescription() {
        return this.voucherDescription;
    }

    public final String getVoucherExpireDate() {
        return this.voucherExpireDate;
    }

    public final String getVoucherTncUrl() {
        return this.voucherTncUrl;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.detailsURL;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.type;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.voucherCode;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.cartPageDescription;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.voucherDescription;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.voucherTncUrl;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.voucherExpireDate;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setCartPageDescription(String string2) {
        this.cartPageDescription = string2;
    }

    public final void setDetailsURL(String string2) {
        this.detailsURL = string2;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public final void setVoucherCode(String string2) {
        this.voucherCode = string2;
    }

    public final void setVoucherDescription(String string2) {
        this.voucherDescription = string2;
    }

    public final void setVoucherExpireDate(String string2) {
        this.voucherExpireDate = string2;
    }

    public final void setVoucherTncUrl(String string2) {
        this.voucherTncUrl = string2;
    }

    public String toString() {
        CharSequence charSequence = this.detailsURL;
        String string2 = this.type;
        String string3 = this.voucherCode;
        String string4 = this.cartPageDescription;
        String string5 = this.voucherDescription;
        String string6 = this.voucherTncUrl;
        String string7 = this.voucherExpireDate;
        charSequence = og_1.a("VoucherOfferItem(detailsURL=", charSequence, ", type=", string2, ", voucherCode=");
        X50.a((StringBuilder)charSequence, string3, ", cartPageDescription=", string4, ", voucherDescription=");
        X50.a((StringBuilder)charSequence, string5, ", voucherTncUrl=", string6, ", voucherExpireDate=");
        return h30_0.a((StringBuilder)charSequence, string7, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.detailsURL;
        parcel.writeString(string2);
        string2 = this.type;
        parcel.writeString(string2);
        string2 = this.voucherCode;
        parcel.writeString(string2);
        string2 = this.cartPageDescription;
        parcel.writeString(string2);
        string2 = this.voucherDescription;
        parcel.writeString(string2);
        string2 = this.voucherTncUrl;
        parcel.writeString(string2);
        string2 = this.voucherExpireDate;
        parcel.writeString(string2);
    }
}

