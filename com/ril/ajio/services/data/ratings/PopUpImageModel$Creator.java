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
import com.ril.ajio.services.data.ratings.PopUpImageModel;
import kotlin.jvm.internal.Intrinsics;

public final class PopUpImageModel$Creator
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final PopUpImageModel createFromParcel(Parcel parcel) {
        PopUpImageModel popUpImageModel;
        void var7_9;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        int n3 = parcel.readInt();
        if (n3 == 0) {
            n3 = 0;
            float f5 = 0.0f;
            Object var7_8 = null;
        } else {
            float f6 = parcel.readFloat();
            Float f7 = Float.valueOf(f6);
        }
        void var8_12 = var7_9;
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        String string9 = parcel.readString();
        PopUpImageModel popUpImageModel2 = popUpImageModel;
        return new PopUpImageModel(string2, string3, (Float)var8_12, string4, string5, string6, string7, string8, string9);
    }

    public final PopUpImageModel[] newArray(int n3) {
        return new PopUpImageModel[n3];
    }
}

