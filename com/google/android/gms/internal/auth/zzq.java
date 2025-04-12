/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzi;
import com.google.android.gms.internal.auth.zzp;
import com.google.android.gms.internal.auth.zzy;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzq
implements RemoteCall {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzq(zzab zzab2, String string2) {
        this.zza = zzab2;
        this.zzb = string2;
    }

    public final void accept(Object object, Object object2) {
        zzab zzab2 = this.zza;
        String string2 = this.zzb;
        object = (zzi)object;
        object2 = (TaskCompletionSource)object2;
        object = (zzp)((BaseGmsClient)object).getService();
        zzy zzy2 = new zzy(zzab2, (TaskCompletionSource)object2);
        ((zzp)object).zzh(zzy2, string2);
    }
}

