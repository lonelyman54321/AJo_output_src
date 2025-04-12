/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.zzs;
import com.google.android.gms.internal.fido.zzk;
import com.google.android.gms.internal.fido.zzn;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzo
implements RemoteCall {
    public final /* synthetic */ Fido2PrivilegedApiClient zza;
    public final /* synthetic */ BrowserPublicKeyCredentialCreationOptions zzb;

    public /* synthetic */ zzo(Fido2PrivilegedApiClient fido2PrivilegedApiClient, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) {
        this.zza = fido2PrivilegedApiClient;
        this.zzb = browserPublicKeyCredentialCreationOptions;
    }

    public final void accept(Object object, Object object2) {
        Fido2PrivilegedApiClient fido2PrivilegedApiClient = this.zza;
        BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = this.zzb;
        object = (zzk)object;
        object2 = (TaskCompletionSource)object2;
        zzs zzs2 = new zzs(fido2PrivilegedApiClient, (TaskCompletionSource)object2);
        ((zzn)((BaseGmsClient)object).getService()).zzd(zzs2, browserPublicKeyCredentialCreationOptions);
    }
}

