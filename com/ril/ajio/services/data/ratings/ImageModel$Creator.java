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
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class ImageModel$Creator
implements Parcelable.Creator {
    public final ImageModel createFromParcel(Parcel object) {
        ImageModel imageModel;
        Object object2;
        Serializable serializable;
        Long l2;
        Intrinsics.checkNotNullParameter(object, "parcel");
        int n3 = object.readInt();
        Long l3 = null;
        if (n3 == 0) {
            l2 = null;
        } else {
            long l4 = object.readLong();
            l2 = serializable = Long.valueOf(l4);
        }
        n3 = object.readInt();
        if (n3 == 0) {
            object2 = null;
        } else {
            long l7 = object.readLong();
            serializable = l7;
            object2 = serializable;
        }
        String string2 = object.readString();
        String string3 = object.readString();
        object = object.readString();
        serializable = imageModel;
        l3 = l2;
        l2 = object2;
        object2 = string2;
        string2 = string3;
        string3 = object;
        imageModel = new ImageModel(l3, l2, (String)object2, string2, (String)object);
        return imageModel;
    }

    public final ImageModel[] newArray(int n3) {
        return new ImageModel[n3];
    }
}

