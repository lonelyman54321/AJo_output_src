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
import com.google.android.gms.internal.ads.zzgn;

final class zzgl
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        zzgn zzgn2 = new zzgn(parcel, null);
        return zzgn2;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzgn[n3];
    }
}

