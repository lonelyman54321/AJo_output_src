/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api-phone;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth-api-phone.zzh;
import com.google.android.gms.internal.auth-api-phone.zzp;
import com.google.android.gms.internal.auth-api-phone.zzr;
import com.google.android.gms.internal.auth-api-phone.zzw;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzk
implements RemoteCall {
    public final /* synthetic */ zzr zza;

    public /* synthetic */ zzk(zzr zzr2) {
        this.zza = zzr2;
    }

    public final void accept(Object object, Object object2) {
        object = (zzw)object;
        object2 = (TaskCompletionSource)object2;
        zzr zzr2 = this.zza;
        zzp zzp2 = new zzp(zzr2, (TaskCompletionSource)object2);
        ((zzh)((BaseGmsClient)object).getService()).zzc(zzp2);
    }
}

