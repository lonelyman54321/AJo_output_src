/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Bundle
 *  android.os.IInterface
 */
package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public interface zzf
extends IInterface {
    public Bundle zzd(String var1, Bundle var2);

    public Bundle zze(Account var1, String var2, Bundle var3);

    public Bundle zzf(Account var1);

    public Bundle zzg(String var1);

    public AccountChangeEventsResponse zzh(AccountChangeEventsRequest var1);
}

