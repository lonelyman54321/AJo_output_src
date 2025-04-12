/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.zzg;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zze
implements RemoteCall {
    public final /* synthetic */ Fido2ApiClient zza;
    public final /* synthetic */ PublicKeyCredentialRequestOptions zzb;

    public /* synthetic */ zze(Fido2ApiClient fido2ApiClient, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        this.zza = fido2ApiClient;
        this.zzb = publicKeyCredentialRequestOptions;
    }

    public final void accept(Object object, Object object2) {
        Fido2ApiClient fido2ApiClient = this.zza;
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = this.zzb;
        object = (zzp)object;
        object2 = (TaskCompletionSource)object2;
        zzg zzg2 = new zzg(fido2ApiClient, (TaskCompletionSource)object2);
        ((zzs)((BaseGmsClient)object).getService()).zzd(zzg2, publicKeyCredentialRequestOptions);
    }
}

