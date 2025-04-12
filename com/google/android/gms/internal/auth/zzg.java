/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Bundle
 */
package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.tasks.Task;

public interface zzg
extends HasApiKey {
    public Task zza(zzbw var1);

    public Task zzb(AccountChangeEventsRequest var1);

    public Task zzc(Account var1, String var2, Bundle var3);

    public Task zzd(Account var1);

    public Task zze(String var1);
}

