/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api-phone;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth-api-phone.zzab;
import com.google.android.gms.internal.auth-api-phone.zzh;
import com.google.android.gms.internal.auth-api-phone.zzw;
import com.google.android.gms.internal.auth-api-phone.zzz;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzx
implements RemoteCall {
    public final /* synthetic */ zzab zza;

    public /* synthetic */ zzx(zzab zzab2) {
        this.zza = zzab2;
    }

    public final void accept(Object object, Object object2) {
        object = (zzw)object;
        object2 = (TaskCompletionSource)object2;
        object = (zzh)((BaseGmsClient)object).getService();
        zzab zzab2 = this.zza;
        zzz zzz2 = new zzz(zzab2, (TaskCompletionSource)object2);
        ((zzh)object).zzg(zzz2);
    }
}

