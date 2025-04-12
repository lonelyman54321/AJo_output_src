/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzgp;
import com.google.android.gms.internal.auth.zzgu;
import java.util.Iterator;
import java.util.List;

final class zzgq
implements Iterator {
    final /* synthetic */ zzgu zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzgq(zzgu zzgu2, zzgp zzgp2) {
        this.zza = zzgu2;
    }

    private final Iterator zza() {
        Iterator iterator = this.zzd;
        if (iterator == null) {
            this.zzd = iterator = zzgu.zzh(this.zza).entrySet().iterator();
        }
        return this.zzd;
    }

    public final boolean hasNext() {
        int n3 = this.zzb;
        int n4 = 1;
        List list = zzgu.zzf(this.zza);
        int n7 = list.size();
        if ((n3 += n4) >= n7) {
            Object object = zzgu.zzh(this.zza);
            n3 = (int)(object.isEmpty() ? 1 : 0);
            n7 = 0;
            list = null;
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
            zzgu zzgu2 = this.zza;
            zzgu.zzi(zzgu2);
            n3 = this.zzb;
            List list = zzgu.zzf(this.zza);
            int n4 = list.size();
            if (n3 < n4) {
                int n7;
                zzgu2 = this.zza;
                n4 = this.zzb;
                this.zzb = n7 = n4 + -1;
                zzgu.zzd(zzgu2, n4);
                return;
            }
            this.zza().remove();
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("remove() was called before next()");
        throw illegalStateException;
    }
}

