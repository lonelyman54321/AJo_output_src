/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.u2f;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.fido.u2f.U2fApiClient;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.zzc;
import com.google.android.gms.internal.fido.zzw;
import com.google.android.gms.internal.fido.zzy;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzb
implements RemoteCall {
    public final /* synthetic */ U2fApiClient zza;
    public final /* synthetic */ RegisterRequestParams zzb;

    public /* synthetic */ zzb(U2fApiClient u2fApiClient, RegisterRequestParams registerRequestParams) {
        this.zza = u2fApiClient;
        this.zzb = registerRequestParams;
    }

    public final void accept(Object object, Object object2) {
        U2fApiClient u2fApiClient = this.zza;
        RegisterRequestParams registerRequestParams = this.zzb;
        object = (zzy)object;
        object2 = (TaskCompletionSource)object2;
        zzc zzc2 = new zzc(u2fApiClient, (TaskCompletionSource)object2);
        ((zzw)((BaseGmsClient)object).getService()).zzc(zzc2, registerRequestParams);
    }
}

