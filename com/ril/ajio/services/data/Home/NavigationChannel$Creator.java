/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Home;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Home.NavigationChannel;
import kotlin.jvm.internal.Intrinsics;

public final class NavigationChannel$Creator
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     */
    public final NavigationChannel createFromParcel(Parcel parcel) {
        Boolean bl2;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string2 = parcel.readString();
        int bl3 = parcel.readInt();
        boolean bl4 = false;
        Boolean bl5 = null;
        if (bl3 == 0) {
            boolean bl6 = false;
            bl2 = null;
        } else {
            void var4_9;
            int n3 = parcel.readInt();
            if (n3 != 0) {
                boolean bl7 = true;
            } else {
                boolean bl8 = false;
                bl2 = null;
            }
            bl2 = (boolean)var4_9;
        }
        int n4 = parcel.readInt();
        if (n4 != 0) {
            int n7 = parcel.readInt();
            if (n7 != 0) {
                bl4 = true;
            }
            bl5 = bl4;
        }
        NavigationChannel navigationChannel = new NavigationChannel(string2, bl2, bl5);
        return navigationChannel;
    }

    public final NavigationChannel[] newArray(int n3) {
        return new NavigationChannel[n3];
    }
}

