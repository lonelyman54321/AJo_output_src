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
import com.google.android.gms.internal.ads.zzahv;

final class zzahu
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        zzahv zzahv2 = new zzahv(parcel);
        return zzahv2;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzahv[n3];
    }
}

