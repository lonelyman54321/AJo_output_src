/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.IBinder
 */
package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.IBinder;
import com.google.android.gms.auth.zzk;
import com.google.android.gms.internal.auth.zze;
import java.io.IOException;

public final class zzg
implements zzk {
    public final /* synthetic */ Account zza;

    public /* synthetic */ zzg(Account account) {
        this.zza = account;
    }

    public final Object zza(IBinder object) {
        Account account = this.zza;
        if ((object = zze.zzb(object).zzf(account)) != null) {
            return object;
        }
        object = new IOException("Service call returned null.");
        throw object;
    }
}

