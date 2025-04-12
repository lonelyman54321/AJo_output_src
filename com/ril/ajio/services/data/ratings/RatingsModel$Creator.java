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
import com.ril.ajio.services.data.ratings.RatingsModel;
import com.ril.ajio.services.data.ratings.ReviewModel;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class RatingsModel$Creator
implements Parcelable.Creator {
    public final RatingsModel createFromParcel(Parcel parcel) {
        Object object;
        ArrayList<Serializable> arrayList;
        ArrayList<Serializable> arrayList2;
        Object object2;
        String string2;
        Object object3;
        Object object4;
        Object object5 = parcel;
        Object object6 = "parcel";
        Intrinsics.checkNotNullParameter(parcel, (String)object6);
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        int n3 = parcel.readInt();
        Object object7 = null;
        if (n3 == 0) {
            object4 = null;
        } else {
            float f5 = parcel.readFloat();
            object4 = object6 = Float.valueOf(f5);
        }
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        n3 = parcel.readInt();
        int n4 = 0;
        ArrayList<Object> arrayList3 = null;
        if (n3 == 0) {
            object3 = null;
        } else {
            n3 = parcel.readInt();
            object3 = new ArrayList(n3);
            string2 = null;
            for (int i3 = 0; i3 != n3; ++i3) {
                object2 = parcel.readSerializable();
                ((ArrayList)object3).add(object2);
            }
        }
        object6 = parcel.readString();
        string2 = parcel.readString();
        object2 = parcel.readString();
        int n7 = parcel.readInt();
        if (n7 == 0) {
            n7 = 0;
            arrayList2 = null;
        } else {
            n7 = parcel.readInt();
            arrayList = new ArrayList<Serializable>(n7);
            while (n4 != n7) {
                object = parcel.readSerializable();
                arrayList.add((Serializable)object);
                ++n4;
            }
            arrayList2 = arrayList;
        }
        arrayList = parcel.createStringArrayList();
        n4 = parcel.readInt();
        if (n4 != 0) {
            object7 = ReviewModel.CREATOR.createFromParcel(object5);
        }
        object = object7;
        object = (ReviewModel)object7;
        String string8 = parcel.readString();
        object7 = object5;
        arrayList3 = object3;
        object3 = object6;
        object5 = new RatingsModel(string3, string4, string5, (Float)object4, string6, string7, arrayList3, (String)object6, string2, (String)object2, arrayList2, arrayList, (ReviewModel)object, string8);
        return object5;
    }

    public final RatingsModel[] newArray(int n3) {
        return new RatingsModel[n3];
    }
}

