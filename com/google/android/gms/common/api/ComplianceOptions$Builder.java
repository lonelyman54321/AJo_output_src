/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api;

import com.google.android.gms.common.api.ComplianceOptions;

public final class ComplianceOptions$Builder {
    private int zza;
    private int zzb;
    private int zzc;
    private boolean zzd;

    public ComplianceOptions$Builder() {
        int n3;
        this.zza = n3 = -1;
        this.zzb = n3;
        this.zzc = 0;
        this.zzd = true;
    }

    public ComplianceOptions build() {
        int n3 = this.zza;
        int n4 = this.zzb;
        int n7 = this.zzc;
        boolean bl2 = this.zzd;
        ComplianceOptions complianceOptions = new ComplianceOptions(n3, n4, n7, bl2);
        return complianceOptions;
    }

    public ComplianceOptions$Builder setCallerProductId(int n3) {
        this.zza = n3;
        return this;
    }

    public ComplianceOptions$Builder setDataOwnerProductId(int n3) {
        this.zzb = n3;
        return this;
    }

    public ComplianceOptions$Builder setIsUserData(boolean bl2) {
        this.zzd = bl2;
        return this;
    }

    public ComplianceOptions$Builder setProcessingReason(int n3) {
        this.zzc = n3;
        return this;
    }
}

