/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzfl;
import com.google.android.gms.internal.gtm.zzfq;
import com.google.android.gms.internal.gtm.zzfr;

final class zzfj
extends zzfq {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    public final zzfq zza(String string2) {
        this.zza = "";
        return this;
    }

    public final zzfq zzb(boolean bl2) {
        this.zzb = 1;
        return this;
    }

    public final zzfr zzc() {
        Object object;
        int n3 = this.zzb;
        int n4 = 1;
        if (n3 == n4 && (object = this.zza) != null && (n3 = this.zzc) != 0 && (n3 = this.zzd) != 0) {
            String string2 = this.zza;
            int n7 = this.zzc;
            int n8 = this.zzd;
            Object object2 = object;
            object = new zzfl(string2, false, n7, null, null, n8, null);
            return object;
        }
        object = new StringBuilder();
        Object object3 = this.zza;
        if (object3 == null) {
            object3 = " fileOwner";
            ((StringBuilder)object).append((String)object3);
        }
        if ((n4 = (int)this.zzb) == 0) {
            object3 = " hasDifferentDmaOwner";
            ((StringBuilder)object).append((String)object3);
        }
        if ((n4 = this.zzc) == 0) {
            object3 = " fileChecks";
            ((StringBuilder)object).append((String)object3);
        }
        if ((n4 = this.zzd) == 0) {
            object3 = " filePurpose";
            ((StringBuilder)object).append((String)object3);
        }
        object = object.toString();
        object = "Missing required properties:".concat((String)object);
        object3 = new IllegalStateException((String)object);
        throw object3;
    }

    public final zzfq zzd(int n3) {
        this.zzc = n3;
        return this;
    }

    public final zzfq zze(int n3) {
        this.zzd = 1;
        return this;
    }
}

