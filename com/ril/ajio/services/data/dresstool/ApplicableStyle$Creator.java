/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.dresstool;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.dresstool.ApplicableStyle;
import kotlin.jvm.internal.Intrinsics;

public final class ApplicableStyle$Creator
implements Parcelable.Creator {
    public final ApplicableStyle createFromParcel(Parcel parcel) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        int n3 = parcel.readInt();
        if (n3 != 0) {
            n3 = 1;
            bl2 = true;
        } else {
            n3 = 0;
            parcel = null;
            bl2 = false;
        }
        ApplicableStyle applicableStyle = new ApplicableStyle(string2, string3, string4, string5, bl2);
        return applicableStyle;
    }

    public final ApplicableStyle[] newArray(int n3) {
        return new ApplicableStyle[n3];
    }
}

