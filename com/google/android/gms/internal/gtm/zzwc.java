/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzvv;
import com.google.android.gms.internal.gtm.zzwa;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class zzwc {
    private static final Comparator zza;
    private static final zzwc zzb;
    private final zzwa zzc;

    static {
        Object object = new zzvv();
        zza = object;
        List list = Collections.emptyList();
        zzwa zzwa2 = new zzwa(list);
        zzb = object = new zzwc(zzwa2);
    }

    private zzwc(zzwa zzwa2) {
        this.zzc = zzwa2;
    }

    public static zzwc zza() {
        return zzb;
    }

    public static /* bridge */ /* synthetic */ Comparator zzb() {
        return zza;
    }

    public final boolean equals(Object object) {
        zzwa zzwa2;
        boolean bl2;
        boolean bl3 = object instanceof zzwc;
        return bl3 && (bl2 = (object = ((zzwc)object).zzc).equals(zzwa2 = this.zzc));
    }

    public final int hashCode() {
        return ~this.zzc.hashCode();
    }

    public final String toString() {
        return this.zzc.toString();
    }
}

