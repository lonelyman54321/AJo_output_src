/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg$zzg;
import com.google.android.gms.internal.clearcut.zzdm;
import com.google.android.gms.internal.clearcut.zzdo;
import com.google.android.gms.internal.clearcut.zzed;

final class zzec
implements zzdm {
    private final String info;
    private final zzdo zzmn;
    private final zzed zzng;

    public zzec(zzdo object, String string2, Object[] objectArray) {
        zzed zzed2;
        this.zzmn = object;
        this.info = string2;
        object = object.getClass();
        this.zzng = zzed2 = new zzed((Class)object, string2, objectArray);
    }

    public final int getFieldCount() {
        return zzed.zzd(this.zzng);
    }

    public final int zzcf() {
        zzed zzed2 = this.zzng;
        int n3 = zzed.zza(zzed2);
        int n4 = 1;
        if ((n3 &= n4) == n4) {
            return zzcg$zzg.zzkl;
        }
        return zzcg$zzg.zzkm;
    }

    public final boolean zzcg() {
        zzed zzed2 = this.zzng;
        int n3 = zzed.zza(zzed2);
        int n4 = 2;
        return (n3 &= n4) == n4;
    }

    public final zzdo zzch() {
        return this.zzmn;
    }

    public final zzed zzco() {
        return this.zzng;
    }

    public final int zzcp() {
        return zzed.zzb(this.zzng);
    }

    public final int zzcq() {
        return zzed.zzc(this.zzng);
    }

    public final int zzcr() {
        return zzed.zze(this.zzng);
    }

    public final int zzcs() {
        return zzed.zzf(this.zzng);
    }

    public final int[] zzct() {
        return zzed.zzg(this.zzng);
    }

    public final int zzcu() {
        return zzed.zzh(this.zzng);
    }

    public final int zzcv() {
        return zzed.zzi(this.zzng);
    }
}

