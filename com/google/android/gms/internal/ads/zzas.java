/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgd;

public final class zzas {
    private static final String zzc;
    private static final String zzd;
    public final String zza;
    public final String zzb;

    static {
        int n3 = 36;
        zzc = Integer.toString(0, n3);
        zzd = Integer.toString(1, n3);
    }

    public zzas(String string2, String string3) {
        this.zza = string2 = zzgd.zzD(string2);
        this.zzb = string3;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = zzas.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (zzas)object;
            object2 = this.zza;
            object3 = ((zzas)object).zza;
            boolean bl4 = zzgd.zzG(object2, object3);
            if (bl4 && (bl3 = zzgd.zzG(object2 = this.zzb, object = ((zzas)object).zzb))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.zzb;
        int n4 = string2.hashCode() * 31;
        String string3 = this.zza;
        if (string3 != null) {
            n3 = string3.hashCode();
        } else {
            n3 = 0;
            string3 = null;
        }
        return n4 + n3;
    }
}

