/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.gamezop;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.gamezop.Body;
import kotlin.jvm.internal.Intrinsics;

public final class Body$Creator
implements Parcelable.Creator {
    /*
     * Enabled aggressive block sorting
     */
    public final Body createFromParcel(Parcel parcel) {
        Long l2;
        Long l3;
        Object object;
        Long l4;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int n3 = parcel.readInt();
        Object object2 = null;
        if (n3 == 0) {
            n3 = 0;
            l4 = null;
        } else {
            long l7 = parcel.readLong();
            l4 = l7;
        }
        Object object3 = parcel.readString();
        int n4 = parcel.readInt();
        if (n4 == 0) {
            n4 = 0;
            object = null;
        } else {
            long l8 = parcel.readLong();
            object = l8;
        }
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        Object object4 = parcel.readString();
        int n7 = parcel.readInt();
        if (n7 == 0) {
            n7 = 0;
            l3 = null;
        } else {
            long l12 = parcel.readLong();
            l3 = l12;
        }
        int n8 = parcel.readInt();
        if (n8 == 0) {
            n8 = 0;
            l2 = null;
        } else {
            long l14 = parcel.readLong();
            l2 = l14;
        }
        int n10 = parcel.readInt();
        if (n10 != 0) {
            long l15 = parcel.readLong();
            object2 = l15;
        }
        Object object5 = object2;
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        object2 = object3;
        object3 = object;
        object = string2;
        string2 = string3;
        string3 = string4;
        string4 = string5;
        string5 = object4;
        object4 = l3;
        l3 = l2;
        l2 = object5;
        object5 = string6;
        string6 = string7;
        string7 = string8;
        return new Body(l4, (String)object2, (Long)object3, (String)object, string2, string3, string4, string5, (Long)object4, l3, l2, (String)object5, string6, string8);
    }

    public final Body[] newArray(int n3) {
        return new Body[n3];
    }
}

