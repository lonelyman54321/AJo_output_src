/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.sis;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.sis.StoreInfo;

class StoreInfo$1
implements Parcelable.Creator {
    public StoreInfo createFromParcel(Parcel parcel) {
        StoreInfo storeInfo = new StoreInfo(parcel);
        return storeInfo;
    }

    public StoreInfo[] newArray(int n3) {
        return new StoreInfo[n3];
    }
}

