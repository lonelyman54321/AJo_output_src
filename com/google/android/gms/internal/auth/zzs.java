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
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzi;
import com.google.android.gms.internal.auth.zzp;
import com.google.android.gms.internal.auth.zzw;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzs
implements RemoteCall {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ Account zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ Bundle zzd;

    public /* synthetic */ zzs(zzab zzab2, Account account, String string2, Bundle bundle) {
        this.zza = zzab2;
        this.zzb = account;
        this.zzc = string2;
        this.zzd = bundle;
    }

    public final void accept(Object object, Object object2) {
        zzab zzab2 = this.zza;
        Account account = this.zzb;
        String string2 = this.zzc;
        Bundle bundle = this.zzd;
        object = (zzi)object;
        object2 = (TaskCompletionSource)object2;
        object = (zzp)((BaseGmsClient)object).getService();
        zzw zzw2 = new zzw(zzab2, (TaskCompletionSource)object2);
        ((zzp)object).zzf(zzw2, account, string2, bundle);
    }
}

