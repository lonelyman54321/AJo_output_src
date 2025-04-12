/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 */
package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.WorkAccountApi$AddAccountResult;
import com.google.android.gms.common.api.Status;

final class zzai
implements WorkAccountApi$AddAccountResult {
    private static final Account zza;
    private final Status zzb;
    private final Account zzc;

    static {
        Account account;
        zza = account = new Account("DUMMY_NAME", "com.google");
    }

    public zzai(Status status, Account account) {
        this.zzb = status;
        if (account == null) {
            account = zza;
        }
        this.zzc = account;
    }

    public final Account getAccount() {
        return this.zzc;
    }

    public final Status getStatus() {
        return this.zzb;
    }
}

