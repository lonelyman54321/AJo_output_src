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
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;

public final class zzbl
extends zzbad
implements zzbn {
    public zzbl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final String zze() {
        throw null;
    }

    public final String zzf() {
        throw null;
    }

    public final void zzg(zzl zzl2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzl2);
        this.zzdc(1, parcel);
    }

    public final void zzh(zzl zzl2, int n3) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzl2);
        parcel.writeInt(n3);
        this.zzdc(5, parcel);
    }

    public final boolean zzi() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(3, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }
}

