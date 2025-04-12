/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.gtm.zzpk;
import com.google.android.gms.internal.gtm.zzqh;

public final class zzpl
implements Result {
    private final Status zza;
    private final int zzb;
    private final zzpk zzc;
    private final zzqh zzd;

    public zzpl(Status status, int n3, zzpk zzpk2, zzqh zzqh2) {
        this.zza = status;
        this.zzb = n3;
        this.zzc = zzpk2;
        this.zzd = zzqh2;
    }

    public final Status getStatus() {
        return this.zza;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzpk zzb() {
        return this.zzc;
    }

    public final zzqh zzc() {
        return this.zzd;
    }

    public final String zzd() {
        int n3 = this.zzb;
        if (n3 == 0) {
            return "Network";
        }
        int n4 = 1;
        if (n3 == n4) {
            return "Saved file on disk";
        }
        n4 = 2;
        if (n3 == n4) {
            return "Default resource";
        }
        IllegalStateException illegalStateException = new IllegalStateException("Resource source is unknown.");
        throw illegalStateException;
    }
}

