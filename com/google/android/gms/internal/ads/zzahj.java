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
import com.google.android.gms.internal.ads.zzahk;

final class zzahj
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        zzahk zzahk2 = new zzahk(parcel);
        return zzahk2;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzahk[n3];
    }
}

