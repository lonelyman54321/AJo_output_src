/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 */
package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth.zzaa;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzi;
import com.google.android.gms.internal.auth.zzp;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzr
implements RemoteCall {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ Account zzb;

    public /* synthetic */ zzr(zzab zzab2, Account account) {
        this.zza = zzab2;
        this.zzb = account;
    }

    public final void accept(Object object, Object object2) {
        zzab zzab2 = this.zza;
        Account account = this.zzb;
        object = (zzi)object;
        object2 = (TaskCompletionSource)object2;
        object = (zzp)((BaseGmsClient)object).getService();
        zzaa zzaa2 = new zzaa(zzab2, (TaskCompletionSource)object2);
        ((zzp)object).zzg(zzaa2, account);
    }
}

