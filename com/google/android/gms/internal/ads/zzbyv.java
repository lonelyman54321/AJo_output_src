/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbyx;

public final class zzbyv
extends zzbad
implements zzbyx {
    public zzbyv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public final int zze() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(2, parcel);
        int n3 = parcel2.readInt();
        parcel2.recycle();
        return n3;
    }

    public final String zzf() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(1, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }
}

