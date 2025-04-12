/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzwf;
import java.io.Closeable;

public final class zzwg
implements Closeable {
    private static final ThreadLocal zza;
    private int zzb = 0;

    static {
        zzwf zzwf2 = new zzwf();
        zza = zzwf2;
    }

    public static int zza() {
        return ((zzwg)zzwg.zza.get()).zzb;
    }

    public final void close() {
        int n3 = this.zzb;
        if (n3 > 0) {
            this.zzb = n3 += -1;
            return;
        }
        AssertionError assertionError = new AssertionError((Object)"Mismatched calls to RecursionDepth (possible error in core library)");
        throw assertionError;
    }
}

