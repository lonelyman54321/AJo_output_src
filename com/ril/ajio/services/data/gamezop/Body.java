/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.gamezop;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.gamezop.Body$Creator;
import kotlin.jvm.internal.Intrinsics;

public final class Body
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final Long activeDate;
    private final String bannerImageURL;
    private final Long expiryDate;
    private final String extraLabel;
    private final String gameBannerImageURL;
    private final String id;
    private final String label;
    private final String offerType;
    private final String plpLink;
    private final Long redeemedDate;
    private final Long rewardId;
    private final Long scratchCardExpiryDate;
    private final String serialNumberId;
    private final String status;

    static {
        Body$Creator body$Creator = new Body$Creator();
        CREATOR = body$Creator;
    }

    public Body(Long l2, String string2, Long l3, String string3, String string4, String string5, String string6, String string7, Long l4, Long l7, Long l8, String string8, String string9, String string10) {
        this.activeDate = l2;
        this.bannerImageURL = string2;
        this.expiryDate = l3;
        this.extraLabel = string3;
        this.id = string4;
        this.label = string5;
        this.offerType = string6;
        this.plpLink = string7;
        this.redeemedDate = l4;
        this.rewardId = l7;
        this.scratchCardExpiryDate = l8;
        this.serialNumberId = string8;
        this.gameBannerImageURL = string9;
        this.status = string10;
    }

    public static /* synthetic */ Body copy$default(Body body, Long l2, String string2, Long l3, String string3, String string4, String string5, String string6, String string7, Long l4, Long l7, Long l8, String string8, String string9, String string10, int n3, Object object) {
        Body body2 = body;
        int n4 = n3;
        int n7 = n3 & 1;
        Long l12 = n7 != 0 ? body.activeDate : l2;
        int n8 = n4 & 2;
        String string11 = n8 != 0 ? body2.bannerImageURL : string2;
        int n10 = n4 & 4;
        Long l14 = n10 != 0 ? body2.expiryDate : l3;
        int n14 = n4 & 8;
        String string12 = n14 != 0 ? body2.extraLabel : string3;
        int n15 = n4 & 0x10;
        String string13 = n15 != 0 ? body2.id : string4;
        int n16 = n4 & 0x20;
        String string14 = n16 != 0 ? body2.label : string5;
        int n17 = n4 & 0x40;
        String string15 = n17 != 0 ? body2.offerType : string6;
        int n18 = n4 & 0x80;
        String string16 = n18 != 0 ? body2.plpLink : string7;
        int n19 = n4 & 0x100;
        Long l15 = n19 != 0 ? body2.redeemedDate : l4;
        int n20 = n4 & 0x200;
        Long l16 = n20 != 0 ? body2.rewardId : l7;
        int n21 = n4 & 0x400;
        Long l17 = n21 != 0 ? body2.scratchCardExpiryDate : l8;
        int n22 = n4 & 0x800;
        String string17 = n22 != 0 ? body2.serialNumberId : string8;
        int n24 = n4 & 0x1000;
        String string18 = n24 != 0 ? body2.gameBannerImageURL : string9;
        String string19 = (n4 &= 0x2000) != 0 ? body2.status : string10;
        l2 = l12;
        string2 = string11;
        l3 = l14;
        string3 = string12;
        string4 = string13;
        string5 = string14;
        string6 = string15;
        string7 = string16;
        l4 = l15;
        l7 = l16;
        l8 = l17;
        string8 = string17;
        string9 = string18;
        string10 = string19;
        return body.copy(l12, string11, l14, string12, string13, string14, string15, string16, l15, l16, l17, string17, string18, string19);
    }

    public final Long component1() {
        return this.activeDate;
    }

    public final Long component10() {
        return this.rewardId;
    }

    public final Long component11() {
        return this.scratchCardExpiryDate;
    }

    public final String component12() {
        return this.serialNumberId;
    }

    public final String component13() {
        return this.gameBannerImageURL;
    }

    public final String component14() {
        return this.status;
    }

    public final String component2() {
        return this.bannerImageURL;
    }

    public final Long component3() {
        return this.expiryDate;
    }

    public final String component4() {
        return this.extraLabel;
    }

    public final String component5() {
        return this.id;
    }

    public final String component6() {
        return this.label;
    }

    public final String component7() {
        return this.offerType;
    }

    public final String component8() {
        return this.plpLink;
    }

    public final Long component9() {
        return this.redeemedDate;
    }

    public final Body copy(Long l2, String string2, Long l3, String string3, String string4, String string5, String string6, String string7, Long l4, Long l7, Long l8, String string8, String string9, String string10) {
        Body body = new Body(l2, string2, l3, string3, string4, string5, string6, string7, l4, l7, l8, string8, string9, string10);
        return body;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Body;
        if (!bl3) {
            return false;
        }
        object = (Body)object;
        Object object2 = this.activeDate;
        Object object3 = ((Body)object).activeDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bannerImageURL;
        object3 = ((Body)object).bannerImageURL;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.expiryDate;
        object3 = ((Body)object).expiryDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.extraLabel;
        object3 = ((Body)object).extraLabel;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.id;
        object3 = ((Body)object).id;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.label;
        object3 = ((Body)object).label;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerType;
        object3 = ((Body)object).offerType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.plpLink;
        object3 = ((Body)object).plpLink;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.redeemedDate;
        object3 = ((Body)object).redeemedDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.rewardId;
        object3 = ((Body)object).rewardId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.scratchCardExpiryDate;
        object3 = ((Body)object).scratchCardExpiryDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.serialNumberId;
        object3 = ((Body)object).serialNumberId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.gameBannerImageURL;
        object3 = ((Body)object).gameBannerImageURL;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.status;
        object = ((Body)object).status;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Long getActiveDate() {
        return this.activeDate;
    }

    public final String getBannerImageURL() {
        return this.bannerImageURL;
    }

    public final Long getExpiryDate() {
        return this.expiryDate;
    }

    public final String getExtraLabel() {
        return this.extraLabel;
    }

    public final String getGameBannerImageURL() {
        return this.gameBannerImageURL;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getOfferType() {
        return this.offerType;
    }

    public final String getPlpLink() {
        return this.plpLink;
    }

    public final Long getRedeemedDate() {
        return this.redeemedDate;
    }

    public final Long getRewardId() {
        return this.rewardId;
    }

    public final Long getScratchCardExpiryDate() {
        return this.scratchCardExpiryDate;
    }

    public final String getSerialNumberId() {
        return this.serialNumberId;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int n3;
        int n4;
        Long l2 = this.activeDate;
        int n7 = 0;
        if (l2 == null) {
            n4 = 0;
            l2 = null;
        } else {
            n4 = ((Object)l2).hashCode();
        }
        n4 *= 31;
        Object object = this.bannerImageURL;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.expiryDate;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.extraLabel;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.id;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.label;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.offerType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.plpLink;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.redeemedDate;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.rewardId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.scratchCardExpiryDate;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.serialNumberId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.gameBannerImageURL;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.status;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        Long l2 = this.activeDate;
        String string2 = this.bannerImageURL;
        Long l3 = this.expiryDate;
        String string3 = this.extraLabel;
        String string4 = this.id;
        String string5 = this.label;
        String string6 = this.offerType;
        String string7 = this.plpLink;
        Long l4 = this.redeemedDate;
        Long l7 = this.rewardId;
        Long l8 = this.scratchCardExpiryDate;
        String string8 = this.serialNumberId;
        String string9 = this.gameBannerImageURL;
        String string10 = this.status;
        StringBuilder stringBuilder = new StringBuilder("Body(activeDate=");
        stringBuilder.append(l2);
        stringBuilder.append(", bannerImageURL=");
        stringBuilder.append(string2);
        stringBuilder.append(", expiryDate=");
        stringBuilder.append(l3);
        stringBuilder.append(", extraLabel=");
        stringBuilder.append(string3);
        stringBuilder.append(", id=");
        X50.a(stringBuilder, string4, ", label=", string5, ", offerType=");
        X50.a(stringBuilder, string6, ", plpLink=", string7, ", redeemedDate=");
        stringBuilder.append(l4);
        stringBuilder.append(", rewardId=");
        stringBuilder.append(l7);
        stringBuilder.append(", scratchCardExpiryDate=");
        stringBuilder.append(l8);
        stringBuilder.append(", serialNumberId=");
        stringBuilder.append(string8);
        stringBuilder.append(", gameBannerImageURL=");
        return ko_0.a(stringBuilder, string9, ", status=", string10, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        long l2;
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.activeDate;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            l2 = (Long)object;
            parcel.writeLong(l2);
        }
        object = this.bannerImageURL;
        parcel.writeString((String)object);
        object = this.expiryDate;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            l2 = (Long)object;
            parcel.writeLong(l2);
        }
        object = this.extraLabel;
        parcel.writeString((String)object);
        object = this.id;
        parcel.writeString((String)object);
        object = this.label;
        parcel.writeString((String)object);
        object = this.offerType;
        parcel.writeString((String)object);
        object = this.plpLink;
        parcel.writeString((String)object);
        object = this.redeemedDate;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            l2 = (Long)object;
            parcel.writeLong(l2);
        }
        object = this.rewardId;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            l2 = (Long)object;
            parcel.writeLong(l2);
        }
        object = this.scratchCardExpiryDate;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            long l3 = (Long)object;
            parcel.writeLong(l3);
        }
        object = this.serialNumberId;
        parcel.writeString((String)object);
        object = this.gameBannerImageURL;
        parcel.writeString((String)object);
        object = this.status;
        parcel.writeString((String)object);
    }
}

