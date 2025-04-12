/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.freebies;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.freebies.FreebieGift;
import com.ril.ajio.services.data.freebies.GiftPromotion;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class GiftPromotion$Creator
implements Parcelable.Creator {
    public final GiftPromotion createFromParcel(Parcel object) {
        String string2 = "parcel";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.readInt();
        int n4 = object.readInt();
        if (n4 == 0) {
            object = null;
        } else {
            n4 = object.readInt();
            ArrayList arrayList = new ArrayList(n4);
            int n7 = 0;
            while (n7 != n4) {
                Parcelable.Creator creator = FreebieGift.CREATOR;
                int n8 = 1;
                n7 = pz0_2.a(creator, object, arrayList, n7, n8);
            }
            object = arrayList;
        }
        GiftPromotion giftPromotion = new GiftPromotion(n3, (List)object);
        return giftPromotion;
    }

    public final GiftPromotion[] newArray(int n3) {
        return new GiftPromotion[n3];
    }
}

