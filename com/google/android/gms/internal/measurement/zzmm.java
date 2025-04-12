/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzmj;
import com.google.android.gms.internal.measurement.zzmn;
import com.google.android.gms.internal.measurement.zzmo;
import java.util.Iterator;
import java.util.Map;

final class zzmm
implements Iterator {
    private int zza = -1;
    private boolean zzb;
    private Iterator zzc;
    private final /* synthetic */ zzmj zzd;

    private zzmm(zzmj zzmj2) {
        this.zzd = zzmj2;
    }

    public /* synthetic */ zzmm(zzmj zzmj2, zzmo zzmo2) {
        this(zzmj2);
    }

    private final Iterator zza() {
        Iterator iterator = this.zzc;
        if (iterator == null) {
            this.zzc = iterator = zzmj.zzb(this.zzd).entrySet().iterator();
        }
        return this.zzc;
    }

    public final boolean hasNext() {
        Object object;
        int n3 = this.zza;
        int n4 = 1;
        zzmj zzmj2 = this.zzd;
        int n7 = zzmj.zza(zzmj2);
        if ((n3 += n4) >= n7 && ((n3 = (int)((object = zzmj.zzb(this.zzd)).isEmpty() ? 1 : 0)) != 0 || (n3 = (int)((object = this.zza()).hasNext() ? 1 : 0)) == 0)) {
            return false;
        }
        return n4 != 0;
    }

    public final /* synthetic */ Object next() {
        int n3;
        int n4 = 1;
        this.zzb = n4;
        this.zza = n3 = this.zza + n4;
        Object[] objectArray = this.zzd;
        n4 = zzmj.zza((zzmj)objectArray);
        if (n3 < n4) {
            objectArray = zzmj.zze(this.zzd);
            n3 = this.zza;
            return (zzmn)objectArray[n3];
        }
        return (Map.Entry)this.zza().next();
    }

    public final void remove() {
        int n3 = this.zzb;
        if (n3 != 0) {
            this.zzb = false;
            zzmj zzmj2 = this.zzd;
            zzmj.zzd(zzmj2);
            n3 = this.zza;
            zzmj zzmj3 = this.zzd;
            int n4 = zzmj.zza(zzmj3);
            if (n3 < n4) {
                int n7;
                zzmj2 = this.zzd;
                n4 = this.zza;
                this.zza = n7 = n4 + -1;
                zzmj.zza(zzmj2, n4);
                return;
            }
            this.zza().remove();
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("remove() was called before next()");
        throw illegalStateException;
    }
}

