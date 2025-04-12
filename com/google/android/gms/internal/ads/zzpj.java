/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.metrics.LogSessionId
 */
package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzpi;
import java.util.Objects;

public final class zzpj {
    public static final zzpj zza;
    public final String zzb;
    private final zzpi zzc;
    private final Object zzd;

    static {
        zzpj zzpj2;
        int n3 = zzgd.zza;
        int n4 = 31;
        String string2 = "";
        if (n3 < n4) {
            zzpj2 = new zzpj(string2);
        } else {
            zzpi zzpi2 = zzpi.zza;
            zzpj2 = new zzpj(zzpi2, string2);
        }
        zza = zzpj2;
    }

    public zzpj(LogSessionId logSessionId, String string2) {
        zzpi zzpi2 = new zzpi(logSessionId);
        this(zzpi2, string2);
    }

    private zzpj(zzpi object, String string2) {
        this.zzc = object;
        this.zzb = string2;
        this.zzd = object = new Object();
    }

    /*
     * WARNING - void declaration
     */
    public zzpj(String object) {
        void var2_5;
        int bl2 = zzgd.zza;
        int n3 = 31;
        if (bl2 < n3) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        zzeq.zzf((boolean)var2_5);
        this.zzb = object;
        this.zzc = null;
        this.zzd = object = new Object();
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof zzpj;
        if (!bl4) {
            return false;
        }
        object = (zzpj)object;
        Object object2 = this.zzb;
        Object object3 = ((zzpj)object).zzb;
        bl4 = Objects.equals(object2, object3);
        if (bl4 && (bl4 = Objects.equals(object2 = this.zzc, object3 = ((zzpj)object).zzc)) && (bl2 = Objects.equals(object2 = this.zzd, object = ((zzpj)object).zzd))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.zzb;
        zzpi zzpi2 = this.zzc;
        Object object = this.zzd;
        Object[] objectArray = new Object[]{string2, zzpi2, object};
        return Objects.hash(objectArray);
    }

    public final LogSessionId zza() {
        zzpi zzpi2 = this.zzc;
        zzpi2.getClass();
        return zzpi2.zzb;
    }
}

