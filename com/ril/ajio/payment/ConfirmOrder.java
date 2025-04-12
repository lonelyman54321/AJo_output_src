/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.payment.ConfirmOrder$a;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class ConfirmOrder
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final float c;
    public final HashMap d;
    public final HashMap e;
    public final String f;

    static {
        ConfirmOrder$a confirmOrder$a = new Object();
        CREATOR = confirmOrder$a;
    }

    public ConfirmOrder(String string2, String string3, float f5, HashMap hashMap, HashMap hashMap2, String string4) {
        Intrinsics.checkNotNullParameter(hashMap, "eddHashMap");
        Intrinsics.checkNotNullParameter(hashMap2, "deliverydateHashMap");
        this.a = string2;
        this.b = string3;
        this.c = f5;
        this.d = hashMap;
        this.e = hashMap2;
        this.f = string4;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2;
        Object object;
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object2 = this.a;
        parcel.writeString((String)object2);
        object2 = this.b;
        parcel.writeString((String)object2);
        float f5 = this.c;
        parcel.writeFloat(f5);
        object2 = this.d;
        int n4 = ((HashMap)object2).size();
        parcel.writeInt(n4);
        object2 = ((HashMap)object2).entrySet().iterator();
        while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object = object2.next();
            string2 = (String)object.getKey();
            parcel.writeString(string2);
            object = (String)object.getValue();
            parcel.writeString((String)object);
        }
        object2 = this.e;
        n4 = ((HashMap)object2).size();
        parcel.writeInt(n4);
        object2 = ((HashMap)object2).entrySet().iterator();
        while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object = object2.next();
            string2 = (String)object.getKey();
            parcel.writeString(string2);
            object = (String)object.getValue();
            parcel.writeString((String)object);
        }
        object2 = this.f;
        parcel.writeString((String)object2);
    }
}

