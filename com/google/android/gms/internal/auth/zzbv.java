/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi$SpatulaHeaderResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbv
implements ProxyApi$SpatulaHeaderResult {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        this.zza = status = (Status)Preconditions.checkNotNull(status);
        this.zzb = "";
    }

    public zzbv(String object) {
        object = (String)Preconditions.checkNotNull(object);
        this.zzb = object;
        this.zza = object = Status.RESULT_SUCCESS;
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    public final Status getStatus() {
        return this.zza;
    }
}

