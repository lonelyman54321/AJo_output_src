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
import com.ril.ajio.services.data.Offers.AllOffersItem$Companion;
import com.ril.ajio.services.data.Offers.AllOffersItem$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AllOffersItem
implements Parcelable {
    private static final String COUPON_TYPE;
    private static final String COUPON_TYPE_ALL;
    private static final String COUPON_TYPE_BANK;
    private static final String COUPON_TYPE_VOUCHER;
    public static final Parcelable.Creator CREATOR;
    public static final AllOffersItem$Companion Companion;
    private String description;
    private long expiryDays;
    private long expiryHours;
    private long expiryMinutes;
    private boolean isClicked;
    private String redirectUrl;
    private String title;
    private String tncUrl;
    private String type;
    private String voucherCode;

    static {
        Object object = new AllOffersItem$Companion(null);
        Companion = object;
        object = new AllOffersItem$Creator();
        CREATOR = object;
        COUPON_TYPE_ALL = "ALL";
        COUPON_TYPE_VOUCHER = "VOUCHER";
        COUPON_TYPE_BANK = "BANKOFFER";
        COUPON_TYPE = "COUPON_TYPE";
    }

    public AllOffersItem(String string2, String string3, String string4, String string5, String string6, long l2, long l3, long l4, String string7, boolean bl2) {
        this.redirectUrl = string2;
        this.voucherCode = string3;
        this.description = string4;
        this.title = string5;
        this.tncUrl = string6;
        this.expiryDays = l2;
        this.expiryHours = l3;
        this.expiryMinutes = l4;
        this.type = string7;
        this.isClicked = bl2;
    }

    public /* synthetic */ AllOffersItem(String string2, String string3, String string4, String string5, String string6, long l2, long l3, long l4, String string7, boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        boolean bl3;
        int n4 = n3;
        int n7 = n3 & 0x20;
        long l7 = 0L;
        long l8 = n7 != 0 ? l7 : l2;
        n7 = n4 & 0x40;
        long l12 = n7 != 0 ? l7 : l3;
        n7 = n4 & 0x80;
        long l14 = n7 != 0 ? l7 : l4;
        if ((n4 &= 0x200) != 0) {
            n4 = 0;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        this(string2, string3, string4, string5, string6, l8, l12, l14, string7, bl3);
    }

    public static final /* synthetic */ String access$getCOUPON_TYPE$cp() {
        return COUPON_TYPE;
    }

    public static final /* synthetic */ String access$getCOUPON_TYPE_ALL$cp() {
        return COUPON_TYPE_ALL;
    }

    public static final /* synthetic */ String access$getCOUPON_TYPE_BANK$cp() {
        return COUPON_TYPE_BANK;
    }

    public static final /* synthetic */ String access$getCOUPON_TYPE_VOUCHER$cp() {
        return COUPON_TYPE_VOUCHER;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ AllOffersItem copy$default(AllOffersItem allOffersItem, String string2, String string3, String string4, String string5, String string6, long l2, long l3, long l4, String string7, boolean bl2, int n3, Object object) {
        void var14_12;
        AllOffersItem allOffersItem2 = allOffersItem;
        int bl3 = var14_12;
        int n4 = var14_12 & 1;
        String string8 = n4 != 0 ? allOffersItem.redirectUrl : string2;
        int n7 = bl3 & 2;
        String string9 = n7 != 0 ? allOffersItem2.voucherCode : string3;
        int n8 = bl3 & 4;
        String string10 = n8 != 0 ? allOffersItem2.description : string4;
        int n10 = bl3 & 8;
        String string11 = n10 != 0 ? allOffersItem2.title : string5;
        int n14 = bl3 & 0x10;
        String string12 = n14 != 0 ? allOffersItem2.tncUrl : string6;
        int n15 = bl3 & 0x20;
        long l7 = n15 != 0 ? allOffersItem2.expiryDays : l2;
        int n16 = bl3 & 0x40;
        long l8 = n16 != 0 ? allOffersItem2.expiryHours : l3;
        int n17 = bl3 & 0x80;
        long l12 = n17 != 0 ? allOffersItem2.expiryMinutes : l4;
        int n18 = bl3 & 0x100;
        String string13 = n18 != 0 ? allOffersItem2.type : string7;
        bl3 = (bl3 &= 0x200) ? (int)allOffersItem2.isClicked : (int)bl2;
        string2 = string8;
        string3 = string9;
        string4 = string10;
        string5 = string11;
        string6 = string12;
        l2 = l7;
        l3 = l8;
        l4 = l12;
        string7 = string13;
        int bl4 = bl3;
        return allOffersItem.copy(string8, string9, string10, string11, string12, l7, l8, l12, string13, (boolean)bl3);
    }

    public final String component1() {
        return this.redirectUrl;
    }

    public final boolean component10() {
        return this.isClicked;
    }

    public final String component2() {
        return this.voucherCode;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.tncUrl;
    }

    public final long component6() {
        return this.expiryDays;
    }

    public final long component7() {
        return this.expiryHours;
    }

    public final long component8() {
        return this.expiryMinutes;
    }

    public final String component9() {
        return this.type;
    }

    public final AllOffersItem copy(String string2, String string3, String string4, String string5, String string6, long l2, long l3, long l4, String string7, boolean bl2) {
        AllOffersItem allOffersItem = new AllOffersItem(string2, string3, string4, string5, string6, l2, l3, l4, string7, bl2);
        return allOffersItem;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof AllOffersItem;
        if (!object2) {
            return false;
        }
        object = (AllOffersItem)object;
        String string2 = this.redirectUrl;
        String string3 = ((AllOffersItem)object).redirectUrl;
        object2 = Intrinsics.areEqual(string2, string3);
        if (!object2) {
            return false;
        }
        string2 = this.voucherCode;
        string3 = ((AllOffersItem)object).voucherCode;
        object2 = Intrinsics.areEqual(string2, string3);
        if (!object2) {
            return false;
        }
        string2 = this.description;
        string3 = ((AllOffersItem)object).description;
        object2 = Intrinsics.areEqual(string2, string3);
        if (!object2) {
            return false;
        }
        string2 = this.title;
        string3 = ((AllOffersItem)object).title;
        object2 = Intrinsics.areEqual(string2, string3);
        if (!object2) {
            return false;
        }
        string2 = this.tncUrl;
        string3 = ((AllOffersItem)object).tncUrl;
        object2 = Intrinsics.areEqual(string2, string3);
        if (!object2) {
            return false;
        }
        long l2 = this.expiryDays;
        long l3 = ((AllOffersItem)object).expiryDays;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        l2 = this.expiryHours;
        l3 = ((AllOffersItem)object).expiryHours;
        long l7 = l2 - l3;
        object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        l2 = this.expiryMinutes;
        l3 = ((AllOffersItem)object).expiryMinutes;
        long l8 = l2 - l3;
        object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        string2 = this.type;
        string3 = ((AllOffersItem)object).type;
        object2 = Intrinsics.areEqual(string2, string3);
        if (!object2) {
            return false;
        }
        object2 = this.isClicked;
        boolean bl3 = ((AllOffersItem)object).isClicked;
        if (object2 != bl3) {
            return false;
        }
        return bl2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getExpiryDays() {
        return this.expiryDays;
    }

    public final long getExpiryHours() {
        return this.expiryHours;
    }

    public final long getExpiryMinutes() {
        return this.expiryMinutes;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTncUrl() {
        return this.tncUrl;
    }

    public final String getType() {
        return this.type;
    }

    public final String getVoucherCode() {
        return this.voucherCode;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.redirectUrl;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.voucherCode;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.description;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.title;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.tncUrl;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        long l2 = this.expiryDays;
        int n8 = 32;
        long l3 = l2 >>> n8;
        int n10 = (int)(l2 ^ l3);
        n4 = (n4 + n10) * 31;
        l2 = this.expiryHours;
        l3 = l2 >>> n8;
        n10 = (int)(l2 ^ l3);
        n4 = (n4 + n10) * 31;
        l2 = this.expiryMinutes;
        long l4 = l2 >>> n8;
        n10 = (int)(l2 ^= l4);
        n4 = (n4 + n10) * 31;
        string3 = this.type;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.isClicked ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        return n4 + n7;
    }

    public final boolean isClicked() {
        return this.isClicked;
    }

    public final void setClicked(boolean bl2) {
        this.isClicked = bl2;
    }

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setExpiryDays(long l2) {
        this.expiryDays = l2;
    }

    public final void setExpiryHours(long l2) {
        this.expiryHours = l2;
    }

    public final void setExpiryMinutes(long l2) {
        this.expiryMinutes = l2;
    }

    public final void setRedirectUrl(String string2) {
        this.redirectUrl = string2;
    }

    public final void setTitle(String string2) {
        this.title = string2;
    }

    public final void setTncUrl(String string2) {
        this.tncUrl = string2;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public final void setVoucherCode(String string2) {
        this.voucherCode = string2;
    }

    public String toString() {
        Object object = this;
        String string2 = this.redirectUrl;
        String string3 = this.voucherCode;
        String string4 = this.description;
        String string5 = this.title;
        String string6 = this.tncUrl;
        long l2 = this.expiryDays;
        long l3 = this.expiryHours;
        long l4 = this.expiryMinutes;
        String string7 = this.type;
        boolean bl2 = this.isClicked;
        object = og_1.a("AllOffersItem(redirectUrl=", string2, ", voucherCode=", string3, ", description=");
        X50.a((StringBuilder)object, string4, ", title=", string5, ", tncUrl=");
        ((StringBuilder)object).append(string6);
        ((StringBuilder)object).append(", expiryDays=");
        ((StringBuilder)object).append(l2);
        fn0_2.b((StringBuilder)object, ", expiryHours=", l3, ", expiryMinutes=");
        ((StringBuilder)object).append(l4);
        ((StringBuilder)object).append(", type=");
        ((StringBuilder)object).append(string7);
        ((StringBuilder)object).append(", isClicked=");
        ((StringBuilder)object).append(bl2);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.redirectUrl;
        parcel.writeString(string2);
        string2 = this.voucherCode;
        parcel.writeString(string2);
        string2 = this.description;
        parcel.writeString(string2);
        string2 = this.title;
        parcel.writeString(string2);
        string2 = this.tncUrl;
        parcel.writeString(string2);
        long l2 = this.expiryDays;
        parcel.writeLong(l2);
        l2 = this.expiryHours;
        parcel.writeLong(l2);
        l2 = this.expiryMinutes;
        parcel.writeLong(l2);
        string2 = this.type;
        parcel.writeString(string2);
        n3 = (int)(this.isClicked ? 1 : 0);
        parcel.writeInt(n3);
    }
}

