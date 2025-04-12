/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzfb;
import com.google.android.gms.internal.ads.zzlw;
import com.google.android.gms.internal.ads.zzlx;
import com.google.android.gms.internal.ads.zzly;
import com.google.android.gms.internal.ads.zzlz;
import com.google.android.gms.internal.ads.zzma;
import com.google.android.gms.internal.ads.zzmd;
import com.google.android.gms.internal.ads.zzmf;
import com.google.android.gms.internal.ads.zzsp;
import com.google.android.gms.internal.ads.zzvf;
import com.google.android.gms.internal.ads.zzvk;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzvy;
import java.io.IOException;

final class zzmb
implements zzvy,
zzsp {
    final /* synthetic */ zzmf zza;
    private final zzmd zzb;

    public zzmb(zzmf zzmf2, zzmd zzmd2) {
        this.zza = zzmf2;
        this.zzb = zzmd2;
    }

    private final Pair zzf(int n3, zzvo zzvo2) {
        zzvo zzvo3 = null;
        if (zzvo2 != null) {
            block3: {
                Object object;
                int n4;
                zzmd zzmd2 = this.zzb;
                Object object2 = null;
                for (int i3 = 0; i3 < (n4 = (object = zzmd2.zzc).size()); ++i3) {
                    object = (zzvo)zzmd2.zzc.get(i3);
                    long l2 = ((zzvo)object).zzd;
                    long l3 = zzvo2.zzd;
                    long l4 = l2 - l3;
                    Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (object3 != false) continue;
                    object2 = zzvo2.zza;
                    zzmd2 = Pair.create((Object)zzmd2.zzb, (Object)object2);
                    zzvo2 = zzvo2.zza(zzmd2);
                    break block3;
                }
                zzvo2 = null;
            }
            if (zzvo2 == null) {
                return null;
            }
            zzvo3 = zzvo2;
        }
        return Pair.create((Object)this.zzb.zzd, zzvo3);
    }

    public final void zzae(int n3, zzvo object, zzvk zzvk2) {
        Pair pair = this.zzf(0, (zzvo)object);
        if (pair != null) {
            object = zzmf.zzd(this.zza);
            zzlz zzlz2 = new zzlz(this, pair, zzvk2);
            object.zzh(zzlz2);
        }
    }

    public final void zzaf(int n3, zzvo object, zzvf zzvf2, zzvk zzvk2) {
        Pair pair = this.zzf(0, (zzvo)object);
        if (pair != null) {
            object = zzmf.zzd(this.zza);
            zzlx zzlx2 = new zzlx(this, pair, zzvf2, zzvk2);
            object.zzh(zzlx2);
        }
    }

    public final void zzag(int n3, zzvo object, zzvf zzvf2, zzvk zzvk2) {
        Pair pair = this.zzf(0, (zzvo)object);
        if (pair != null) {
            object = zzmf.zzd(this.zza);
            zzma zzma2 = new zzma(this, pair, zzvf2, zzvk2);
            object.zzh(zzma2);
        }
    }

    public final void zzah(int n3, zzvo object, zzvf zzvf2, zzvk zzvk2, IOException iOException, boolean bl2) {
        zzfb zzfb2 = null;
        Pair pair = this.zzf(0, (zzvo)object);
        if (pair != null) {
            zzfb2 = zzmf.zzd(this.zza);
            object = new zzlw(this, pair, zzvf2, zzvk2, iOException, bl2);
            zzfb2.zzh((Runnable)object);
        }
    }

    public final void zzai(int n3, zzvo object, zzvf zzvf2, zzvk zzvk2) {
        Pair pair = this.zzf(0, (zzvo)object);
        if (pair != null) {
            object = zzmf.zzd(this.zza);
            zzly zzly2 = new zzly(this, pair, zzvf2, zzvk2);
            object.zzh(zzly2);
        }
    }
}

