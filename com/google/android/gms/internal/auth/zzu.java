/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzi;
import com.google.android.gms.internal.auth.zzp;
import com.google.android.gms.internal.auth.zzz;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzu
implements RemoteCall {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ AccountChangeEventsRequest zzb;

    public /* synthetic */ zzu(zzab zzab2, AccountChangeEventsRequest accountChangeEventsRequest) {
        this.zza = zzab2;
        this.zzb = accountChangeEventsRequest;
    }

    public final void accept(Object object, Object object2) {
        zzab zzab2 = this.zza;
        AccountChangeEventsRequest accountChangeEventsRequest = this.zzb;
        object = (zzi)object;
        object2 = (TaskCompletionSource)object2;
        zzz zzz2 = new zzz(zzab2, (TaskCompletionSource)object2);
        ((zzp)((BaseGmsClient)object).getService()).zze(zzz2, accountChangeEventsRequest);
    }
}

