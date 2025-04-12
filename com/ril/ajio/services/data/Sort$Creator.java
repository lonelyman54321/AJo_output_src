/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Sort;
import kotlin.jvm.internal.Intrinsics;

public final class Sort$Creator
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     */
    public final Sort createFromParcel(Parcel object) {
        void var3_6;
        Intrinsics.checkNotNullParameter(object, "parcel");
        int bl2 = object.readInt();
        if (bl2 != 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        String string2 = object.readString();
        object = object.readString();
        Sort sort = new Sort((boolean)var3_6, string2, (String)object);
        return sort;
    }

    public final Sort[] newArray(int n3) {
        return new Sort[n3];
    }
}

