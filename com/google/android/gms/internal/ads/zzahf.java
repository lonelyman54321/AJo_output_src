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
import com.google.android.gms.internal.ads.zzahg;

final class zzahf
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        zzahg zzahg2 = new zzahg(parcel);
        return zzahg2;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzahg[n3];
    }
}

