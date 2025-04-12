/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzahx;

final class zzahw
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        zzahx zzahx2 = new zzahx(parcel);
        return zzahx2;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzahx[n3];
    }
}

