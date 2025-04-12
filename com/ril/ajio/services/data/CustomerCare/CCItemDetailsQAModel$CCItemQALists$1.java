/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.CustomerCare;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.CustomerCare.CCItemDetailsQAModel$CCItemQALists;

class CCItemDetailsQAModel$CCItemQALists$1
implements Parcelable.Creator {
    public CCItemDetailsQAModel$CCItemQALists createFromParcel(Parcel parcel) {
        CCItemDetailsQAModel$CCItemQALists cCItemDetailsQAModel$CCItemQALists = new CCItemDetailsQAModel$CCItemQALists(parcel);
        return cCItemDetailsQAModel$CCItemQALists;
    }

    public CCItemDetailsQAModel$CCItemQALists[] newArray(int n3) {
        return new CCItemDetailsQAModel$CCItemQALists[n3];
    }
}

