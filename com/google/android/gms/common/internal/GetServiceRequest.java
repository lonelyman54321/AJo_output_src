/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountAccessor;
import com.google.android.gms.common.internal.IAccountAccessor$Stub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzn;

public class GetServiceRequest
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    static final Scope[] zza;
    static final Feature[] zzb;
    final int zzc;
    final int zzd;
    final int zze;
    String zzf;
    IBinder zzg;
    Scope[] zzh;
    Bundle zzi;
    Account zzj;
    Feature[] zzk;
    Feature[] zzl;
    final boolean zzm;
    final int zzn;
    boolean zzo;
    private final String zzp;

    static {
        zzn zzn2 = new zzn();
        CREATOR = zzn2;
        zza = new Scope[0];
        zzb = new Feature[0];
    }

    public GetServiceRequest(int n3, int n4, int n7, String string2, IBinder iBinder, Scope[] scopeArray, Bundle bundle, Account account, Feature[] featureArray, Feature[] featureArray2, boolean bl2, int n8, boolean bl3, String string3) {
        if (scopeArray == null) {
            scopeArray = zza;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (featureArray == null) {
            featureArray = zzb;
        }
        if (featureArray2 == null) {
            featureArray2 = zzb;
        }
        this.zzc = n3;
        this.zzd = n4;
        this.zze = n7;
        String string4 = "com.google.android.gms";
        n7 = (int)(string4.equals(string2) ? 1 : 0);
        this.zzf = n7 != 0 ? string4 : string2;
        n4 = 2;
        if (n3 < n4) {
            Account account2;
            if (iBinder != null) {
                account2 = AccountAccessor.getAccountBinderSafe(IAccountAccessor$Stub.asInterface(iBinder));
            } else {
                n3 = 0;
                account2 = null;
            }
            this.zzj = account2;
        } else {
            this.zzg = iBinder;
            this.zzj = account;
        }
        this.zzh = scopeArray;
        this.zzi = bundle;
        this.zzk = featureArray;
        this.zzl = featureArray2;
        this.zzm = bl2;
        this.zzn = n8;
        this.zzo = bl3;
        this.zzp = string3;
    }

    public String getAttributionTag() {
        return this.zzp;
    }

    public String getCallingPackage() {
        return this.zzf;
    }

    public Feature[] getClientApiFeatures() {
        return this.zzl;
    }

    public int getClientLibraryVersion() {
        return this.zze;
    }

    public Bundle getExtraArgs() {
        return this.zzi;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        com.google.android.gms.common.internal.zzn.zza(this, parcel, n3);
    }
}

