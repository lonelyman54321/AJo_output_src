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
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.internal.ads.zzbad;

public final class zzdr
extends zzbad
implements zzdt {
    public zzdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public final void zze() {
        Parcel parcel = this.zza();
        this.zzdc(4, parcel);
    }

    public final void zzf(boolean bl2) {
        Parcel parcel = this.zza();
        parcel.writeInt((int)(bl2 ? 1 : 0));
        this.zzdc(5, parcel);
    }

    public final void zzg() {
        Parcel parcel = this.zza();
        this.zzdc(3, parcel);
    }

    public final void zzh() {
        Parcel parcel = this.zza();
        this.zzdc(2, parcel);
    }

    public final void zzi() {
        Parcel parcel = this.zza();
        this.zzdc(1, parcel);
    }
}

