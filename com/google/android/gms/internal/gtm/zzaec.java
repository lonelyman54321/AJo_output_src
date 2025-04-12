/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaee;
import com.google.android.gms.internal.gtm.zzaef;
import java.util.Iterator;

final class zzaec
implements Iterator {
    final /* synthetic */ zzaef zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzaec(zzaef zzaef2, zzaee zzaee2) {
        this.zza = zzaef2;
    }

    private final Iterator zza() {
        Iterator iterator = this.zzd;
        if (iterator == null) {
            this.zzd = iterator = zzaef.zzh(this.zza).entrySet().iterator();
        }
        return this.zzd;
    }

    public final boolean hasNext() {
        int n3 = this.zzb;
        int n4 = 1;
        zzaef zzaef2 = this.zza;
        int n7 = zzaef.zzb(zzaef2);
        if ((n3 += n4) >= n7) {
            Object object = zzaef.zzh(zzaef2);
            n3 = (int)(object.isEmpty() ? 1 : 0);
            zzaef2 = null;
            if (n3 == 0) {
                object = this.zza();
                n3 = (int)(object.hasNext() ? 1 : 0);
                if (n3 == 0) {
                    return false;
                }
            } else {
                n4 = 0;
            }
        }
        return n4 != 0;
    }

    public final void remove() {
        int n3 = this.zzc;
        if (n3 != 0) {
            this.zzc = false;
            zzaef zzaef2 = this.zza;
            zzaef.zzi(zzaef2);
            n3 = this.zzb;
            zzaef zzaef3 = this.zza;
            int n4 = zzaef.zzb(zzaef3);
            if (n3 < n4) {
                this.zzb = n4 = n3 + -1;
                zzaef.zze(zzaef3, n3);
                return;
            }
            this.zza().remove();
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("remove() was called before next()");
        throw illegalStateException;
    }
}

