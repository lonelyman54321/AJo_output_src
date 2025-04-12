/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzce;
import com.google.android.gms.internal.measurement.zzcn;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzcq;

final class zzcd
extends zzcn {
    private String zza;
    private zzcq zzb;
    private zzcp zzc;
    private byte zzd;

    public final zzcn zza(zzcp object) {
        if (object != null) {
            this.zzc = object;
            return this;
        }
        object = new NullPointerException("Null filePurpose");
        throw object;
    }

    public final zzcn zza(zzcq object) {
        if (object != null) {
            this.zzb = object;
            return this;
        }
        object = new NullPointerException("Null fileChecks");
        throw object;
    }

    public final zzcn zza(String string2) {
        this.zza = string2;
        return this;
    }

    public final zzcn zza(boolean bl2) {
        byte by2;
        this.zzd = by2 = (byte)(this.zzd | 1);
        return this;
    }

    public final zzco zza() {
        Object object;
        byte by2;
        Object object2;
        int n3 = this.zzd;
        int n4 = 1;
        if (n3 == n4 && (object2 = this.zza) != null && (object2 = this.zzb) != null && (object2 = this.zzc) != null) {
            String string2 = this.zza;
            zzcq zzcq2 = this.zzb;
            zzcp zzcp2 = this.zzc;
            Object object3 = object2;
            object2 = new zzce(string2, false, zzcq2, null, null, zzcp2, null);
            return object2;
        }
        object2 = new StringBuilder();
        String string3 = this.zza;
        if (string3 == null) {
            string3 = " fileOwner";
            ((StringBuilder)object2).append(string3);
        }
        if ((n4 &= (by2 = this.zzd)) == 0) {
            object = " hasDifferentDmaOwner";
            ((StringBuilder)object2).append((String)object);
        }
        if ((object = this.zzb) == null) {
            object = " fileChecks";
            ((StringBuilder)object2).append((String)object);
        }
        if ((object = this.zzc) == null) {
            object = " filePurpose";
            ((StringBuilder)object2).append((String)object);
        }
        object2 = String.valueOf(object2);
        object2 = "Missing required properties:".concat((String)object2);
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

