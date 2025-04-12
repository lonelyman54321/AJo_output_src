/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzapb;
import com.google.android.gms.internal.ads.zzapc;
import com.google.android.gms.internal.ads.zzapj;
import com.google.android.gms.internal.ads.zzapk;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzft;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgb;

final class zzapi
implements zzapb {
    final /* synthetic */ zzapk zza;
    private final zzft zzb;

    public zzapi(zzapk object) {
        this.zza = object;
        int n3 = 4;
        byte[] byArray = new byte[n3];
        this.zzb = object = new zzft(byArray, n3);
    }

    public final void zza(zzfu zzfu2) {
        int n3 = zzfu2.zzm();
        if (n3 == 0 && (n3 = zzfu2.zzm() & 0x80) != 0) {
            zzfu2.zzL(6);
            n3 = zzfu2.zzb();
            int n4 = 4;
            n3 /= n4;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object;
                Object object2 = this.zzb;
                zzfu2.zzF((zzft)object2, n4);
                object2 = this.zzb;
                int n7 = ((zzft)object2).zzd(16);
                int n8 = 3;
                ((zzft)object2).zzm(n8);
                int n10 = 13;
                if (n7 == 0) {
                    object = this.zzb;
                    ((zzft)object).zzm(n10);
                    continue;
                }
                n10 = this.zzb.zzd(n10);
                object = zzapk.zzg(this.zza).get(n10);
                if (object != null) continue;
                object = this.zza;
                SparseArray sparseArray = zzapk.zzg((zzapk)object);
                zzapj zzapj2 = new zzapj((zzapk)object, n10);
                zzapc zzapc2 = new zzapc(zzapj2);
                sparseArray.put(n10, (Object)zzapc2);
                object2 = this.zza;
                n7 = zzapk.zza((zzapk)object2) + 1;
                zzapk.zzn((zzapk)object2, n7);
            }
            zzfu2 = zzapk.zzg(this.zza);
            zzfu2.remove(0);
        }
    }

    public final void zzb(zzgb zzgb2, zzadx zzadx2, zzapo zzapo2) {
    }
}

