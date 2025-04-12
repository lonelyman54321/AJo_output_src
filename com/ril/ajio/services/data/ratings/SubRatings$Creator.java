/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.ratings;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.ratings.AttributeRatings;
import com.ril.ajio.services.data.ratings.SubRatings;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class SubRatings$Creator
implements Parcelable.Creator {
    public final SubRatings createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        int n3 = object.readInt();
        if (n3 == 0) {
            object = null;
        } else {
            n3 = object.readInt();
            ArrayList arrayList = new ArrayList(n3);
            int n4 = 0;
            while (n4 != n3) {
                Parcelable.Creator creator = AttributeRatings.CREATOR;
                int n7 = 1;
                n4 = pz0_2.a(creator, object, arrayList, n4, n7);
            }
            object = arrayList;
        }
        SubRatings subRatings = new SubRatings(string2, (ArrayList)object);
        return subRatings;
    }

    public final SubRatings[] newArray(int n3) {
        return new SubRatings[n3];
    }
}

