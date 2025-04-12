/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzc;
import com.google.android.gms.internal.auth.zzf;

public final class zzd
extends zza
implements zzf {
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    public final Bundle zzd(String string2, Bundle bundle) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        zzc.zzd(parcel, (Parcelable)bundle);
        string2 = this.zzb(2, parcel);
        bundle = Bundle.CREATOR;
        bundle = (Bundle)zzc.zza((Parcel)string2, (Parcelable.Creator)bundle);
        string2.recycle();
        return bundle;
    }

    public final Bundle zze(Account account, String string2, Bundle bundle) {
        Parcel parcel = this.zza();
        zzc.zzd(parcel, (Parcelable)account);
        parcel.writeString(string2);
        zzc.zzd(parcel, (Parcelable)bundle);
        account = this.zzb(5, parcel);
        string2 = Bundle.CREATOR;
        string2 = (Bundle)zzc.zza((Parcel)account, (Parcelable.Creator)string2);
        account.recycle();
        return string2;
    }

    public final Bundle zzf(Account account) {
        Parcel parcel = this.zza();
        zzc.zzd(parcel, (Parcelable)account);
        account = this.zzb(7, parcel);
        parcel = Bundle.CREATOR;
        parcel = (Bundle)zzc.zza((Parcel)account, (Parcelable.Creator)parcel);
        account.recycle();
        return parcel;
    }

    public final Bundle zzg(String string2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        string2 = this.zzb(8, parcel);
        parcel = Bundle.CREATOR;
        parcel = (Bundle)zzc.zza((Parcel)string2, (Parcelable.Creator)parcel);
        string2.recycle();
        return parcel;
    }

    public final AccountChangeEventsResponse zzh(AccountChangeEventsRequest accountChangeEventsRequest) {
        Object object = this.zza();
        zzc.zzd(object, accountChangeEventsRequest);
        accountChangeEventsRequest = this.zzb(3, (Parcel)object);
        object = AccountChangeEventsResponse.CREATOR;
        object = (AccountChangeEventsResponse)zzc.zza((Parcel)accountChangeEventsRequest, (Parcelable.Creator)object);
        accountChangeEventsRequest.recycle();
        return object;
    }
}

