/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.zzt;
import com.google.android.gms.internal.fido.zzk;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzn
implements RemoteCall {
    public final /* synthetic */ Fido2PrivilegedApiClient zza;
    public final /* synthetic */ BrowserPublicKeyCredentialRequestOptions zzb;

    public /* synthetic */ zzn(Fido2PrivilegedApiClient fido2PrivilegedApiClient, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        this.zza = fido2PrivilegedApiClient;
        this.zzb = browserPublicKeyCredentialRequestOptions;
    }

    public final void accept(Object object, Object object2) {
        Fido2PrivilegedApiClient fido2PrivilegedApiClient = this.zza;
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = this.zzb;
        object = (zzk)object;
        object2 = (TaskCompletionSource)object2;
        zzt zzt2 = new zzt(fido2PrivilegedApiClient, (TaskCompletionSource)object2);
        ((com.google.android.gms.internal.fido.zzn)((BaseGmsClient)object).getService()).zze(zzt2, browserPublicKeyCredentialRequestOptions);
    }
}

