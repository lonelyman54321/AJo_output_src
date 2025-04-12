/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.appindexing.internal.zzh;

public final class zzg
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final zzg zza;
    public static final zzg zzb;
    public static final zzg zzc;
    public final int zzd;

    static {
        Object object = new zzg(1);
        zza = object;
        object = new zzg(2);
        zzb = object;
        object = new zzg(3);
        zzc = object;
        object = new zzh();
        CREATOR = object;
    }

    public zzg(int n3) {
        this.zzd = n3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zzd;
        SafeParcelWriter.writeInt(parcel, 1, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

