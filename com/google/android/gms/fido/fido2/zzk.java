/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient;
import com.google.android.gms.fido.fido2.zzv;
import com.google.android.gms.internal.fido.zzn;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzk
implements RemoteCall {
    public final /* synthetic */ Fido2PrivilegedApiClient zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzk(Fido2PrivilegedApiClient fido2PrivilegedApiClient, String string2) {
        this.zza = fido2PrivilegedApiClient;
        this.zzb = string2;
    }

    public final void accept(Object object, Object object2) {
        Fido2PrivilegedApiClient fido2PrivilegedApiClient = this.zza;
        String string2 = this.zzb;
        object = (com.google.android.gms.internal.fido.zzk)object;
        object2 = (TaskCompletionSource)object2;
        zzv zzv2 = new zzv(fido2PrivilegedApiClient, (TaskCompletionSource)object2);
        ((zzn)((BaseGmsClient)object).getService()).zzc(zzv2, string2);
    }
}

