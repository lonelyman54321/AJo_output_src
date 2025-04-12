/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.google.android.gms.fido.fido2.zzj;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzb
implements RemoteCall {
    public final /* synthetic */ Fido2ApiClient zza;

    public /* synthetic */ zzb(Fido2ApiClient fido2ApiClient) {
        this.zza = fido2ApiClient;
    }

    public final void accept(Object object, Object object2) {
        Fido2ApiClient fido2ApiClient = this.zza;
        object = (zzp)object;
        object2 = (TaskCompletionSource)object2;
        zzj zzj2 = new zzj(fido2ApiClient, (TaskCompletionSource)object2);
        ((zzs)((BaseGmsClient)object).getService()).zze(zzj2);
    }
}

