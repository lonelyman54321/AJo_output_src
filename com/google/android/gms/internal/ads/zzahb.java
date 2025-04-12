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
import com.google.android.gms.internal.ads.zzahc;

final class zzahb
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        zzahc zzahc2 = new zzahc(parcel);
        return zzahc2;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzahc[n3];
    }
}

