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
import com.google.android.gms.internal.ads.zzaib;

final class zzaia
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        zzaib zzaib2 = new zzaib(parcel);
        return zzaib2;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzaib[n3];
    }
}

