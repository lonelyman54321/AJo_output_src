/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzc;
import com.google.android.gms.internal.auth.zzk;
import com.google.android.gms.internal.auth.zzm;
import com.google.android.gms.internal.auth.zzo;

public final class zzp
extends zza
implements IInterface {
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void zzd(IStatusCallback iStatusCallback, zzbw zzbw2) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, iStatusCallback);
        zzc.zzd(parcel, zzbw2);
        this.zzc(2, parcel);
    }

    public final void zze(zzm zzm2, AccountChangeEventsRequest accountChangeEventsRequest) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, zzm2);
        zzc.zzd(parcel, accountChangeEventsRequest);
        this.zzc(4, parcel);
    }

    public final void zzf(zzo zzo2, Account account, String string2, Bundle bundle) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, zzo2);
        zzc.zzd(parcel, (Parcelable)account);
        parcel.writeString(string2);
        zzc.zzd(parcel, (Parcelable)bundle);
        this.zzc(1, parcel);
    }

    public final void zzg(zzk zzk2, Account account) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, zzk2);
        zzc.zzd(parcel, (Parcelable)account);
        this.zzc(6, parcel);
    }

    public final void zzh(zzk zzk2, String string2) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, zzk2);
        parcel.writeString(string2);
        this.zzc(3, parcel);
    }
}

