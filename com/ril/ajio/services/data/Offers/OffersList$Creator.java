/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Offers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Offers.OffersList;
import com.ril.ajio.services.data.Offers.VoucherOfferItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class OffersList$Creator
implements Parcelable.Creator {
    public final OffersList createFromParcel(Parcel object) {
        Object object2 = "parcel";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.readInt();
        if (n3 == 0) {
            object = null;
        } else {
            n3 = object.readInt();
            ArrayList arrayList = new ArrayList(n3);
            int n4 = 0;
            while (n4 != n3) {
                Parcelable.Creator creator = VoucherOfferItem.CREATOR;
                int n7 = 1;
                n4 = pz0_2.a(creator, object, arrayList, n4, n7);
            }
            object = arrayList;
        }
        object2 = new OffersList((List)object);
        return object2;
    }

    public final OffersList[] newArray(int n3) {
        return new OffersList[n3];
    }
}

