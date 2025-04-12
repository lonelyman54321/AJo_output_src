/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzso;
import com.google.android.gms.internal.ads.zzsp;
import com.google.android.gms.internal.ads.zzuo;
import com.google.android.gms.internal.ads.zzuw;
import com.google.android.gms.internal.ads.zzvf;
import com.google.android.gms.internal.ads.zzvk;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzvx;
import com.google.android.gms.internal.ads.zzvy;
import java.io.IOException;

final class zzuu
implements zzvy,
zzsp {
    final /* synthetic */ zzuw zza;
    private final Object zzb;
    private zzvx zzc;
    private zzso zzd;

    public zzuu(zzuw object, Object object2) {
        zzvx zzvx2;
        this.zza = object;
        this.zzc = zzvx2 = ((zzuo)object).zze(null);
        this.zzd = object = ((zzuo)object).zzc(null);
        this.zzb = object2;
    }

    private final zzvk zzf(zzvk zzvk2, zzvo zzvo2) {
        long l2;
        zzuw zzuw2 = this.zza;
        Object object = this.zzb;
        long l3 = zzvk2.zzc;
        zzuw2.zzx(object, l3, zzvo2);
        zzuw2 = this.zza;
        object = this.zzb;
        long l4 = zzvk2.zzd;
        zzuw2.zzx(object, l4, zzvo2);
        long l7 = zzvk2.zzc;
        long l8 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1);
        if (l8 == false && (l8 = (l2 = l4 - (l7 = zzvk2.zzd)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
            return zzvk2;
        }
        int n3 = zzvk2.zza;
        zzan zzan2 = zzvk2.zzb;
        zzvk2 = new zzvk(1, n3, zzan2, 0, null, l3, l4);
        return zzvk2;
    }

    private final boolean zzg(int n3, zzvo zzvo2) {
        Object object;
        Object object2;
        zzso zzso2 = null;
        if (zzvo2 != null) {
            object2 = this.zza;
            object = this.zzb;
            if ((zzvo2 = ((zzuw)object2).zzy(object, zzvo2)) == null) {
                return false;
            }
        } else {
            zzvo2 = null;
        }
        object2 = this.zza;
        object = this.zzb;
        ((zzuw)object2).zzw(object, 0);
        object2 = this.zzc;
        int cfr_ignored_0 = ((zzvx)object2).zza;
        object2 = ((zzvx)object2).zzb;
        boolean bl2 = zzgd.zzG(object2, zzvo2);
        if (!bl2) {
            this.zzc = object2 = this.zza.zzf(0, zzvo2);
        }
        object2 = this.zzd;
        int cfr_ignored_1 = ((zzso)object2).zza;
        object2 = ((zzso)object2).zzb;
        bl2 = zzgd.zzG(object2, zzvo2);
        if (!bl2) {
            object2 = this.zza;
            this.zzd = zzso2 = ((zzuo)object2).zzd(0, zzvo2);
        }
        return true;
    }

    public final void zzae(int n3, zzvo object, zzvk zzvk2) {
        zzvx zzvx2 = null;
        n3 = (int)(this.zzg(0, (zzvo)object) ? 1 : 0);
        if (n3 != 0) {
            zzvx2 = this.zzc;
            object = this.zzf(zzvk2, (zzvo)object);
            zzvx2.zzc((zzvk)object);
        }
    }

    public final void zzaf(int n3, zzvo object, zzvf zzvf2, zzvk zzvk2) {
        zzvx zzvx2 = null;
        n3 = (int)(this.zzg(0, (zzvo)object) ? 1 : 0);
        if (n3 != 0) {
            zzvx2 = this.zzc;
            object = this.zzf(zzvk2, (zzvo)object);
            zzvx2.zzd(zzvf2, (zzvk)object);
        }
    }

    public final void zzag(int n3, zzvo object, zzvf zzvf2, zzvk zzvk2) {
        zzvx zzvx2 = null;
        n3 = (int)(this.zzg(0, (zzvo)object) ? 1 : 0);
        if (n3 != 0) {
            zzvx2 = this.zzc;
            object = this.zzf(zzvk2, (zzvo)object);
            zzvx2.zze(zzvf2, (zzvk)object);
        }
    }

    public final void zzah(int n3, zzvo object, zzvf zzvf2, zzvk zzvk2, IOException iOException, boolean bl2) {
        zzvx zzvx2 = null;
        n3 = (int)(this.zzg(0, (zzvo)object) ? 1 : 0);
        if (n3 != 0) {
            zzvx2 = this.zzc;
            object = this.zzf(zzvk2, (zzvo)object);
            zzvx2.zzf(zzvf2, (zzvk)object, iOException, bl2);
        }
    }

    public final void zzai(int n3, zzvo object, zzvf zzvf2, zzvk zzvk2) {
        zzvx zzvx2 = null;
        n3 = (int)(this.zzg(0, (zzvo)object) ? 1 : 0);
        if (n3 != 0) {
            zzvx2 = this.zzc;
            object = this.zzf(zzvk2, (zzvo)object);
            zzvx2.zzg(zzvf2, (zzvk)object);
        }
    }
}

