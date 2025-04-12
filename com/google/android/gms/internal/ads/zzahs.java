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
import com.google.android.gms.internal.ads.zzaht;

final class zzahs
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        zzaht zzaht2 = new zzaht(parcel);
        return zzaht2;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzaht[n3];
    }
}

