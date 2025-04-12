/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzalt;
import com.google.android.gms.internal.ads.zzaly;

public final class zzalw
implements zzadx {
    private final zzadx zzb;
    private final zzalt zzc;
    private final SparseArray zzd;

    public zzalw(zzadx zzadx2, zzalt zzalt2) {
        this.zzb = zzadx2;
        this.zzc = zzalt2;
        this.zzd = zzadx2;
    }

    public final void zzD() {
        this.zzb.zzD();
    }

    public final void zzO(zzaet zzaet2) {
        this.zzb.zzO(zzaet2);
    }

    public final zzafa zzw(int n3, int n4) {
        int n7 = 3;
        if (n4 != n7) {
            return this.zzb.zzw(n3, n4);
        }
        Object object = (zzaly)this.zzd.get(n3);
        if (object != null) {
            return object;
        }
        object = this.zzb;
        object = object.zzw(n3, n7);
        zzalt zzalt2 = this.zzc;
        zzaly zzaly2 = new zzaly((zzafa)object, zzalt2);
        this.zzd.put(n3, (Object)zzaly2);
        return zzaly2;
    }
}

