/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Order;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Order.Entries;
import com.ril.ajio.services.data.Order.RtoData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class RtoData$Creator
implements Parcelable.Creator {
    public final RtoData createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        int n3 = object.readInt();
        ArrayList arrayList = new ArrayList(n3);
        int n4 = 0;
        while (n4 != n3) {
            Parcelable.Creator creator = Entries.CREATOR;
            int n7 = 1;
            n4 = pz0_2.a(creator, object, arrayList, n4, n7);
        }
        object = new RtoData(string2, string3, arrayList);
        return object;
    }

    public final RtoData[] newArray(int n3) {
        return new RtoData[n3];
    }
}

