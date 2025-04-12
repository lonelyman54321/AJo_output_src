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
import com.google.android.gms.internal.ads.zzagt;

final class zzags
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        zzagt zzagt2 = new zzagt(parcel);
        return zzagt2;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzagt[n3];
    }
}

