/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi$ProxyResult;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

final class zzbu
implements ProxyApi$ProxyResult {
    private final Status zza;
    private ProxyResponse zzb;

    public zzbu(ProxyResponse abstractSafeParcelable) {
        this.zzb = abstractSafeParcelable;
        abstractSafeParcelable = Status.RESULT_SUCCESS;
        this.zza = abstractSafeParcelable;
    }

    public zzbu(Status status) {
        this.zza = status;
    }

    public final ProxyResponse getResponse() {
        return this.zzb;
    }

    public final Status getStatus() {
        return this.zza;
    }
}

