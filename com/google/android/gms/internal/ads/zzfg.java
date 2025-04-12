/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzah;
import com.google.android.gms.internal.ads.zzfe;
import com.google.android.gms.internal.ads.zzff;

final class zzfg {
    public final Object zza;
    private zzaf zzb;
    private boolean zzc;
    private boolean zzd;

    public zzfg(Object object) {
        this.zza = object;
        this.zzb = object = new zzaf();
    }

    public final boolean equals(Object object) {
        Object object2;
        Class<zzfg> clazz;
        if (this == object) {
            return true;
        }
        if (object != null && (clazz = zzfg.class) == (object2 = object.getClass())) {
            object2 = this.zza;
            object = ((zzfg)object).zza;
            return object2.equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int n3, zzfe zzfe2) {
        int n4 = this.zzd;
        if (n4 == 0) {
            n4 = -1;
            if (n3 != n4) {
                zzaf zzaf2 = this.zzb;
                zzaf2.zza(n3);
            }
            n3 = 1;
            this.zzc = n3;
            Object object = this.zza;
            zzfe2.zza(object);
        }
    }

    public final void zzb(zzff zzff2) {
        boolean bl2 = this.zzd;
        if (!bl2 && (bl2 = this.zzc)) {
            zzah zzah2 = this.zzb.zzb();
            Object object = new zzaf();
            this.zzb = object;
            this.zzc = false;
            object = this.zza;
            zzff2.zza(object, zzah2);
        }
    }

    public final void zzc(zzff zzff2) {
        this.zzd = true;
        boolean bl2 = this.zzc;
        if (bl2) {
            bl2 = false;
            this.zzc = false;
            Object object = this.zza;
            zzah zzah2 = this.zzb.zzb();
            zzff2.zza(object, zzah2);
        }
    }
}

