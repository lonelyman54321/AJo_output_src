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
import com.ril.ajio.services.data.Home.LinkDetail;
import kotlin.jvm.internal.Intrinsics;

public final class LinkDetail$Creator
implements Parcelable.Creator {
    public final LinkDetail createFromParcel(Parcel parcel) {
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
            bl2 = false;
        }
        String string6 = parcel.readString();
        LinkDetail linkDetail = new LinkDetail(string2, string3, string4, string5, bl2, string6);
        return linkDetail;
    }

    public final LinkDetail[] newArray(int n3) {
        return new LinkDetail[n3];
    }
}

