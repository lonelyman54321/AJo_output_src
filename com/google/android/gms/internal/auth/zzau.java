/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzaq;
import com.google.android.gms.internal.auth.zzat;
import com.google.android.gms.internal.auth.zzav;
import com.google.android.gms.internal.auth.zzax;
import com.google.android.gms.internal.auth.zzaz;
import com.google.android.gms.internal.auth.zzbb;
import com.google.android.gms.internal.auth.zzc;

public final class zzau
extends zza
implements IInterface {
    public zzau(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
    }

    public final void zzd(zzat zzat2, zzaq zzaq2) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, zzat2);
        zzc.zzd(parcel, zzaq2);
        this.zzc(7, parcel);
    }

    public final void zze(zzat zzat2, zzbb zzbb2) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, zzat2);
        zzc.zzd(parcel, zzbb2);
        this.zzc(8, parcel);
    }

    public final void zzf(zzat zzat2, zzav zzav2) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, zzat2);
        zzc.zzd(parcel, zzav2);
        this.zzc(9, parcel);
    }

    public final void zzg(zzat zzat2, zzax zzax2) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, zzat2);
        zzc.zzd(parcel, zzax2);
        this.zzc(6, parcel);
    }

    public final void zzh(zzat zzat2, zzaz zzaz2) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, zzat2);
        zzc.zzd(parcel, zzaz2);
        this.zzc(5, parcel);
    }
}

