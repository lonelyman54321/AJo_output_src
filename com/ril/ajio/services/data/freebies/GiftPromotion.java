/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.freebies;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.freebies.FreebieGift;
import com.ril.ajio.services.data.freebies.GiftPromotion$Creator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class GiftPromotion
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final List gifts;
    private final int totalGiftCount;

    static {
        GiftPromotion$Creator giftPromotion$Creator = new GiftPromotion$Creator();
        CREATOR = giftPromotion$Creator;
    }

    public GiftPromotion(int n3, List list) {
        this.totalGiftCount = n3;
        this.gifts = list;
    }

    public static /* synthetic */ GiftPromotion copy$default(GiftPromotion giftPromotion, int n3, List list, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = giftPromotion.totalGiftCount;
        }
        if ((n4 &= 2) != 0) {
            list = giftPromotion.gifts;
        }
        return giftPromotion.copy(n3, list);
    }

    public final int component1() {
        return this.totalGiftCount;
    }

    public final List component2() {
        return this.gifts;
    }

    public final GiftPromotion copy(int n3, List list) {
        GiftPromotion giftPromotion = new GiftPromotion(n3, list);
        return giftPromotion;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof GiftPromotion;
        if (n3 == 0) {
            return false;
        }
        object = (GiftPromotion)object;
        n3 = this.totalGiftCount;
        int n4 = ((GiftPromotion)object).totalGiftCount;
        if (n3 != n4) {
            return false;
        }
        List list = this.gifts;
        object = ((GiftPromotion)object).gifts;
        boolean bl3 = Intrinsics.areEqual(list, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final List getGifts() {
        return this.gifts;
    }

    public final int getTotalGiftCount() {
        return this.totalGiftCount;
    }

    public int hashCode() {
        int n3;
        int n4 = this.totalGiftCount * 31;
        List list = this.gifts;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        return n4 + n3;
    }

    public String toString() {
        int n3 = this.totalGiftCount;
        List list = this.gifts;
        StringBuilder stringBuilder = new StringBuilder("GiftPromotion(totalGiftCount=");
        stringBuilder.append(n3);
        stringBuilder.append(", gifts=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        int n4 = this.totalGiftCount;
        parcel.writeInt(n4);
        Object object = this.gifts;
        if (object == null) {
            n3 = 0;
            parcel.writeInt(0);
        } else {
            int n7 = 1;
            object = oz0_2.a(parcel, (List)object, n7);
            while ((n7 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                FreebieGift freebieGift = (FreebieGift)object.next();
                freebieGift.writeToParcel(parcel, n3);
            }
        }
    }
}

