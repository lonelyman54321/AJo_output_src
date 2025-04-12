/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.zzh;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzd
implements RemoteCall {
    public final /* synthetic */ Fido2ApiClient zza;
    public final /* synthetic */ PublicKeyCredentialCreationOptions zzb;

    public /* synthetic */ zzd(Fido2ApiClient fido2ApiClient, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        this.zza = fido2ApiClient;
        this.zzb = publicKeyCredentialCreationOptions;
    }

    public final void accept(Object object, Object object2) {
        Fido2ApiClient fido2ApiClient = this.zza;
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = this.zzb;
        object = (zzp)object;
        object2 = (TaskCompletionSource)object2;
        zzh zzh2 = new zzh(fido2ApiClient, (TaskCompletionSource)object2);
        ((zzs)((BaseGmsClient)object).getService()).zzc(zzh2, publicKeyCredentialCreationOptions);
    }
}

