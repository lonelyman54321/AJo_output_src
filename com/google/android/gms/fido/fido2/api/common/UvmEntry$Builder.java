/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2.api.common;

import com.google.android.gms.fido.fido2.api.common.UvmEntry;

public final class UvmEntry$Builder {
    private int zza;
    private short zzb;
    private short zzc;

    public UvmEntry build() {
        int n3 = this.zza;
        short s7 = this.zzb;
        short s8 = this.zzc;
        UvmEntry uvmEntry = new UvmEntry(n3, s7, s8);
        return uvmEntry;
    }

    public UvmEntry$Builder setKeyProtectionType(short s7) {
        this.zzb = s7;
        return this;
    }

    public UvmEntry$Builder setMatcherProtectionType(short s7) {
        this.zzc = s7;
        return this;
    }

    public UvmEntry$Builder setUserVerificationMethod(int n3) {
        this.zza = n3;
        return this;
    }
}

