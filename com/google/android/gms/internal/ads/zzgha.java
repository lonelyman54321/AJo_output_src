/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgwu;
import java.io.OutputStream;

public final class zzgha {
    private final OutputStream zza;

    private zzgha(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgha zzb(OutputStream outputStream) {
        zzgha zzgha2 = new zzgha(outputStream);
        return zzgha2;
    }

    public final void zza(zzgwu zzgwu2) {
        try {
            OutputStream outputStream = this.zza;
            zzgwu2.zzaU(outputStream);
            return;
        }
        finally {
            this.zza.close();
        }
    }
}

