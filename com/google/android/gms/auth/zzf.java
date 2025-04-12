/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Bundle
 *  android.os.IBinder
 */
package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.auth.zzk;
import com.google.android.gms.auth.zzl;

public final class zzf
implements zzk {
    public final /* synthetic */ Account zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Bundle zzc;

    public /* synthetic */ zzf(Account account, String string2, Bundle bundle) {
        this.zza = account;
        this.zzb = string2;
        this.zzc = bundle;
    }

    public final Object zza(IBinder iBinder) {
        Account account = this.zza;
        String string2 = this.zzb;
        Bundle bundle = this.zzc;
        return zzl.zzb(account, string2, bundle, iBinder);
    }
}

