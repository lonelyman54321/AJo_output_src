/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;

public final class zzdo
extends zzbad
implements zzdq {
    public zzdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    public final float zze() {
        throw null;
    }

    public final float zzf() {
        throw null;
    }

    public final float zzg() {
        throw null;
    }

    public final int zzh() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(5, parcel);
        int n3 = parcel2.readInt();
        parcel2.recycle();
        return n3;
    }

    public final zzdt zzi() {
        int n3 = 11;
        Object object = this.zza();
        Parcel parcel = this.zzdb(n3, (Parcel)object);
        if ((object = parcel.readStrongBinder()) == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            boolean bl2 = iInterface instanceof zzdt;
            if (bl2) {
                object = iInterface;
                object = (zzdt)iInterface;
            } else {
                iInterface = new zzdr((IBinder)object);
                object = iInterface;
            }
        }
        parcel.recycle();
        return object;
    }

    public final void zzj(boolean bl2) {
        Parcel parcel = this.zza();
        parcel.writeInt((int)(bl2 ? 1 : 0));
        this.zzdc(3, parcel);
    }

    public final void zzk() {
        Parcel parcel = this.zza();
        this.zzdc(2, parcel);
    }

    public final void zzl() {
        Parcel parcel = this.zza();
        this.zzdc(1, parcel);
    }

    public final void zzm(zzdt zzdt2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzdt2);
        this.zzdc(8, parcel);
    }

    public final void zzn() {
        Parcel parcel = this.zza();
        this.zzdc(13, parcel);
    }

    public final boolean zzo() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(12, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }

    public final boolean zzp() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(10, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }

    public final boolean zzq() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(4, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }
}

