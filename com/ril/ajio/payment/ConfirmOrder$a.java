/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.payment.ConfirmOrder;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class ConfirmOrder$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel object) {
        String string2;
        String string3;
        String string4 = "parcel";
        Intrinsics.checkNotNullParameter(object, string4);
        String string5 = object.readString();
        String string6 = object.readString();
        float f5 = object.readFloat();
        int n3 = object.readInt();
        HashMap<String, String> hashMap = new HashMap<String, String>(n3);
        int n4 = 0;
        HashMap<String, String> hashMap2 = null;
        for (int i3 = 0; i3 != n3; ++i3) {
            string3 = object.readString();
            string2 = object.readString();
            hashMap.put(string3, string2);
        }
        n3 = object.readInt();
        hashMap2 = new HashMap<String, String>(n3);
        while (true) {
            string3 = object.readString();
            if (n4 == n3) break;
            string2 = object.readString();
            hashMap2.put(string3, string2);
            ++n4;
        }
        object = new ConfirmOrder(string5, string6, f5, hashMap, hashMap2, string3);
        return object;
    }

    public final Object[] newArray(int n3) {
        return new ConfirmOrder[n3];
    }
}

