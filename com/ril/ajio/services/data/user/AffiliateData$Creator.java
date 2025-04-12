/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.user.AffiliateData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class AffiliateData$Creator
implements Parcelable.Creator {
    public final AffiliateData createFromParcel(Parcel object) {
        AffiliateData affiliateData;
        Long l2;
        Serializable serializable;
        Long l3;
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        String string4 = object.readString();
        String string5 = object.readString();
        String string6 = object.readString();
        String string7 = object.readString();
        String string8 = object.readString();
        String string9 = object.readString();
        int n3 = object.readInt();
        Long l4 = null;
        if (n3 == 0) {
            l3 = null;
        } else {
            long l7 = object.readLong();
            l3 = serializable = Long.valueOf(l7);
        }
        n3 = object.readInt();
        if (n3 == 0) {
            l2 = null;
        } else {
            long l8 = object.readLong();
            l2 = serializable = Long.valueOf(l8);
        }
        object = object.readString();
        serializable = affiliateData;
        l4 = l3;
        l3 = l2;
        l2 = object;
        affiliateData = new AffiliateData(string2, string3, string4, string5, string6, string7, string8, string9, l4, l3, (String)object);
        return affiliateData;
    }

    public final AffiliateData[] newArray(int n3) {
        return new AffiliateData[n3];
    }
}

