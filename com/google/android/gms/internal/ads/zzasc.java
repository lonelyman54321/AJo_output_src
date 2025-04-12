/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class zzasc {
    private final int zza;
    private final List zzb;
    private final int zzc;
    private final InputStream zzd;

    public zzasc(int n3, List list, int n4, InputStream inputStream) {
        this.zza = n3;
        this.zzb = list;
        this.zzc = n4;
        this.zzd = inputStream;
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final InputStream zzc() {
        InputStream inputStream = this.zzd;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final List zzd() {
        return Collections.unmodifiableList(this.zzb);
    }
}

