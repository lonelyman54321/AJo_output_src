/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Payment.EMI;
import kotlin.jvm.internal.Intrinsics;

public final class EMI$Creator
implements Parcelable.Creator {
    public final EMI createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        object = object.readString();
        EMI eMI = new EMI(string2, (String)object);
        return eMI;
    }

    public final EMI[] newArray(int n3) {
        return new EMI[n3];
    }
}

