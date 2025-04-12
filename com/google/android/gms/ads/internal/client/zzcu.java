/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.internal.ads.zzbad;

public final class zzcu
extends zzbad
implements zzcw {
    public zzcu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public final String zze() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(1, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final String zzf() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(2, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }
}

