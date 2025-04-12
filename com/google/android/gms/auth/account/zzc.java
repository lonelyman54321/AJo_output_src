/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.account.zzb;
import com.google.android.gms.auth.account.zze;
import com.google.android.gms.internal.auth.zza;

public final class zzc
extends zza
implements zze {
    public zzc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    public final void zzd(zzb zzb2, String string2) {
        Parcel parcel = this.zza();
        com.google.android.gms.internal.auth.zzc.zze(parcel, zzb2);
        parcel.writeString(string2);
        this.zzc(2, parcel);
    }

    public final void zze(zzb zzb2, Account account) {
        Parcel parcel = this.zza();
        com.google.android.gms.internal.auth.zzc.zze(parcel, zzb2);
        com.google.android.gms.internal.auth.zzc.zzd(parcel, (Parcelable)account);
        this.zzc(3, parcel);
    }

    public final void zzf(boolean bl2) {
        Parcel parcel = this.zza();
        com.google.android.gms.internal.auth.zzc.zzc(parcel, bl2);
        this.zzc(1, parcel);
    }
}

