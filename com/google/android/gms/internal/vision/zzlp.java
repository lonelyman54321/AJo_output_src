/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzlg;
import com.google.android.gms.internal.vision.zzlh;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzlp
implements Iterator {
    private int zza = -1;
    private boolean zzb;
    private Iterator zzc;
    private final /* synthetic */ zzlh zzd;

    private zzlp(zzlh zzlh2) {
        this.zzd = zzlh2;
    }

    public /* synthetic */ zzlp(zzlh zzlh2, zzlg zzlg2) {
        this(zzlh2);
    }

    private final Iterator zza() {
        Iterator iterator = this.zzc;
        if (iterator == null) {
            this.zzc = iterator = zzlh.zzc(this.zzd).entrySet().iterator();
        }
        return this.zzc;
    }

    public final boolean hasNext() {
        Object object;
        int n3 = this.zza;
        int n4 = 1;
        List list = zzlh.zzb(this.zzd);
        int n7 = list.size();
        if ((n3 += n4) >= n7 && ((n3 = (int)((object = zzlh.zzc(this.zzd)).isEmpty() ? 1 : 0)) != 0 || (n3 = (int)((object = this.zza()).hasNext() ? 1 : 0)) == 0)) {
            return false;
        }
        return n4 != 0;
    }

    public final /* synthetic */ Object next() {
        int n3;
        int n4 = 1;
        this.zzb = n4;
        this.zza = n3 = this.zza + n4;
        List list = zzlh.zzb(this.zzd);
        n4 = list.size();
        if (n3 < n4) {
            list = zzlh.zzb(this.zzd);
            n3 = this.zza;
            return (Map.Entry)list.get(n3);
        }
        return (Map.Entry)this.zza().next();
    }

    public final void remove() {
        int n3 = this.zzb;
        if (n3 != 0) {
            this.zzb = false;
            zzlh zzlh2 = this.zzd;
            zzlh.zza(zzlh2);
            n3 = this.zza;
            List list = zzlh.zzb(this.zzd);
            int n4 = list.size();
            if (n3 < n4) {
                int n7;
                zzlh2 = this.zzd;
                n4 = this.zza;
                this.zza = n7 = n4 + -1;
                zzlh.zza(zzlh2, n4);
                return;
            }
            this.zza().remove();
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("remove() was called before next()");
        throw illegalStateException;
    }
}

