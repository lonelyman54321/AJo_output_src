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
import com.ril.ajio.services.data.ratings.ImageMap;
import com.ril.ajio.services.data.ratings.ImageModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class ImageMap$Creator
implements Parcelable.Creator {
    public final ImageMap createFromParcel(Parcel object) {
        int n3;
        Parcelable.Creator creator;
        ArrayList arrayList;
        int n4;
        ArrayList arrayList2;
        String string2 = "parcel";
        Intrinsics.checkNotNullParameter(object, string2);
        int n7 = object.readInt();
        int n8 = 0;
        ArrayList arrayList3 = null;
        if (n7 == 0) {
            arrayList2 = null;
        } else {
            n7 = object.readInt();
            arrayList2 = new ArrayList(n7);
            n4 = 0;
            arrayList = null;
            while (n4 != n7) {
                creator = ImageModel.CREATOR;
                n3 = 1;
                n4 = pz0_2.a(creator, object, arrayList2, n4, n3);
            }
        }
        n7 = object.readInt();
        if (n7 == 0) {
            n4 = 0;
            arrayList = null;
        } else {
            n7 = object.readInt();
            arrayList = new ArrayList(n7);
            int n10 = 0;
            creator = null;
            while (n10 != n7) {
                Parcelable.Creator creator2 = ImageModel.CREATOR;
                int n14 = 1;
                n10 = pz0_2.a(creator2, object, arrayList, n10, n14);
            }
        }
        n7 = object.readInt();
        if (n7 != 0) {
            n7 = object.readInt();
            arrayList3 = new ArrayList(n7);
            while (n8 != n7) {
                creator = ImageModel.CREATOR;
                n3 = 1;
                n8 = pz0_2.a(creator, object, arrayList3, n8, n3);
            }
        }
        object = new ImageMap(arrayList2, arrayList, arrayList3);
        return object;
    }

    public final ImageMap[] newArray(int n3) {
        return new ImageMap[n3];
    }
}

