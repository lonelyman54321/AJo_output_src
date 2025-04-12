/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.ads.zzbyg;

public final class zzbye
extends zzbyg {
    private final String zza;
    private final int zzb;

    public zzbye(String string2, int n3) {
        this.zza = string2;
        this.zzb = n3;
    }

    public final boolean equals(Object object) {
        int n3;
        if (object != null && (n3 = object instanceof zzbye) != 0) {
            object = (zzbye)object;
            Object object2 = this.zza;
            String string2 = ((zzbye)object).zza;
            n3 = Objects.equal(object2, string2);
            if (n3 != 0) {
                n3 = this.zzb;
                int n4 = ((zzbye)object).zzb;
                object2 = n3;
                n4 = (int)(Objects.equal(object2, object = Integer.valueOf(n4)) ? 1 : 0);
                if (n4 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}

