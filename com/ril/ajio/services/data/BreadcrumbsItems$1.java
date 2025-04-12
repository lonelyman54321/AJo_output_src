/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.BreadcrumbsItems;

class BreadcrumbsItems$1
implements Parcelable.Creator {
    public BreadcrumbsItems createFromParcel(Parcel parcel) {
        BreadcrumbsItems breadcrumbsItems = new BreadcrumbsItems(parcel, 0);
        return breadcrumbsItems;
    }

    public BreadcrumbsItems[] newArray(int n3) {
        return new BreadcrumbsItems[n3];
    }
}

