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
import com.ril.ajio.services.data.ratings.ImageModel;
import com.ril.ajio.services.data.ratings.ReviewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class ReviewModel$Creator
implements Parcelable.Creator {
    public final ReviewModel createFromParcel(Parcel object) {
        int n3;
        ArrayList arrayList;
        String string2 = "parcel";
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = object.readInt();
        Long l2 = null;
        if (n4 == 0) {
            arrayList = null;
        } else {
            n4 = object.readInt();
            arrayList = new ArrayList(n4);
            n3 = 0;
            while (n3 != n4) {
                Parcelable.Creator creator = ImageModel.CREATOR;
                int n7 = 1;
                n3 = pz0_2.a(creator, object, arrayList, n3, n7);
            }
        }
        string2 = object.readString();
        n3 = object.readInt();
        if (n3 != 0) {
            long l3 = object.readLong();
            l2 = l3;
        }
        object = new ReviewModel(arrayList, string2, l2);
        return object;
    }

    public final ReviewModel[] newArray(int n3) {
        return new ReviewModel[n3];
    }
}

