/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Order;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Order.ExchangeRequestFailed;
import kotlin.jvm.internal.Intrinsics;

public final class ExchangeRequestFailed$Creator
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final ExchangeRequestFailed createFromParcel(Parcel parcel) {
        ExchangeRequestFailed exchangeRequestFailed;
        void var7_13;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        int n3 = parcel.readInt();
        if (n3 == 0) {
            boolean bl2 = false;
            Object var7_12 = null;
        } else {
            void var6_11;
            int n4 = parcel.readInt();
            if (n4 != 0) {
                boolean bl3 = true;
            } else {
                boolean bl4 = false;
                Object var7_14 = null;
            }
            Boolean bl5 = (boolean)var6_11;
        }
        void var8_17 = var7_13;
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        ExchangeRequestFailed exchangeRequestFailed2 = exchangeRequestFailed;
        return new ExchangeRequestFailed(string2, string3, string4, (Boolean)var8_17, string5, string6);
    }

    public final ExchangeRequestFailed[] newArray(int n3) {
        return new ExchangeRequestFailed[n3];
    }
}

