/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.flashsale.pdp;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.flashsale.pdp.ModelImage;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class ModelImage$Creator
implements Parcelable.Creator {
    public final ModelImage createFromParcel(Parcel object) {
        ModelImage modelImage;
        Serializable serializable;
        Object object2;
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        int n3 = object.readInt();
        Integer n4 = null;
        if (n3 == 0) {
            object2 = null;
        } else {
            n3 = object.readInt();
            serializable = n3;
            object2 = serializable;
        }
        String string4 = object.readString();
        String string5 = object.readString();
        n3 = object.readInt();
        if (n3 == 0) {
            boolean bl2 = false;
            object = null;
        } else {
            int n7 = object.readInt();
            object = n7;
        }
        serializable = modelImage;
        n4 = object2;
        object2 = string4;
        string4 = string5;
        string5 = object;
        modelImage = new ModelImage(string2, string3, n4, (String)object2, string4, (Integer)object);
        return modelImage;
    }

    public final ModelImage[] newArray(int n3) {
        return new ModelImage[n3];
    }
}

