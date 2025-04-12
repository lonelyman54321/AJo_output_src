/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api-phone;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth-api-phone.zzh;
import com.google.android.gms.internal.auth-api-phone.zzu;
import com.google.android.gms.internal.auth-api-phone.zzv;
import com.google.android.gms.internal.auth-api-phone.zzw;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzs
implements RemoteCall {
    public final /* synthetic */ zzv zza;

    public /* synthetic */ zzs(zzv zzv2) {
        this.zza = zzv2;
    }

    public final void accept(Object object, Object object2) {
        object = (zzw)object;
        object2 = (TaskCompletionSource)object2;
        zzv zzv2 = this.zza;
        zzu zzu2 = new zzu(zzv2, (TaskCompletionSource)object2);
        ((zzh)((BaseGmsClient)object).getService()).zzf(zzu2);
    }
}

