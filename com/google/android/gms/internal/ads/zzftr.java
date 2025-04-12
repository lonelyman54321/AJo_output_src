/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzftt;
import com.google.android.gms.internal.ads.zzfty;
import com.google.android.gms.internal.ads.zzftz;

final class zzftr
extends zzfty {
    private String zza;
    private byte zzb;
    private int zzc;

    public final zzfty zza(String string2) {
        this.zza = "";
        return this;
    }

    public final zzfty zzb(boolean bl2) {
        byte by2;
        this.zzb = by2 = (byte)(this.zzb | 1);
        return this;
    }

    public final zzfty zzc(boolean bl2) {
        byte by2;
        this.zzb = by2 = (byte)(this.zzb | 2);
        return this;
    }

    public final zzftz zzd() {
        Object object;
        int n3 = this.zzb;
        int n4 = 3;
        if (n3 == n4 && (object = this.zza) != null && (n3 = this.zzc) != 0) {
            String string2 = this.zza;
            int n7 = this.zzc;
            Object object2 = object;
            object = new zzftt(string2, false, false, null, null, n7, null);
            return object;
        }
        object = new StringBuilder();
        Object object3 = this.zza;
        if (object3 == null) {
            object3 = " fileOwner";
            ((StringBuilder)object).append((String)object3);
        }
        if ((n4 = this.zzb & 1) == 0) {
            object3 = " hasDifferentDmaOwner";
            ((StringBuilder)object).append((String)object3);
        }
        if ((n4 = this.zzb & 2) == 0) {
            object3 = " skipChecks";
            ((StringBuilder)object).append((String)object3);
        }
        if ((n4 = this.zzc) == 0) {
            object3 = " filePurpose";
            ((StringBuilder)object).append((String)object3);
        }
        object = object.toString();
        object = "Missing required properties:".concat((String)object);
        object3 = new IllegalStateException((String)object);
        throw object3;
    }

    public final zzfty zze(int n3) {
        this.zzc = 1;
        return this;
    }
}

