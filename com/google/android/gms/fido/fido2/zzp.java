/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient;
import com.google.android.gms.fido.fido2.zzu;
import com.google.android.gms.internal.fido.zzk;
import com.google.android.gms.internal.fido.zzn;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzp
implements RemoteCall {
    public final /* synthetic */ Fido2PrivilegedApiClient zza;

    public /* synthetic */ zzp(Fido2PrivilegedApiClient fido2PrivilegedApiClient) {
        this.zza = fido2PrivilegedApiClient;
    }

    public final void accept(Object object, Object object2) {
        Fido2PrivilegedApiClient fido2PrivilegedApiClient = this.zza;
        object = (zzk)object;
        object2 = (TaskCompletionSource)object2;
        zzu zzu2 = new zzu(fido2PrivilegedApiClient, (TaskCompletionSource)object2);
        ((zzn)((BaseGmsClient)object).getService()).zzf(zzu2);
    }
}

