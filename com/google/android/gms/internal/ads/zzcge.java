/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzgbf;
import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzie;
import java.util.Map;

final class zzcge
implements zzhb {
    private final zzhb zza;
    private final long zzb;
    private final zzhb zzc;
    private long zzd;
    private Uri zze;

    public zzcge(zzhb zzhb2, int n3, zzhb zzhb3) {
        long l2;
        this.zza = zzhb2;
        this.zzb = l2 = (long)n3;
        this.zzc = zzhb3;
    }

    public final int zza(byte[] byArray, int n3, int n4) {
        int n7;
        long l2;
        zzhb zzhb2;
        long l3 = this.zzd;
        long l4 = this.zzb;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object < 0) {
            long l8 = n4;
            int n8 = (int)Math.min(l8, l4 -= l3);
            zzhb2 = this.zza;
            int n10 = zzhb2.zza(byArray, n3, n8);
            long l12 = this.zzd;
            l2 = n10;
            this.zzd = l12 += l2;
            n7 = n10;
            l3 = l12;
        } else {
            n7 = 0;
        }
        l2 = this.zzb;
        long l14 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (l14 >= 0) {
            zzhb2 = this.zzc;
            int n14 = zzhb2.zza(byArray, n3 += n7, n4 -= n7);
            n7 += n14;
            long l15 = this.zzd;
            l3 = n14;
            this.zzd = l15 += l3;
        }
        return n7;
    }

    public final long zzb(zzhh zzhh2) {
        long l2;
        long l3;
        long l4;
        long l7;
        zzcge zzcge2 = this;
        zzhh zzhh3 = zzhh2;
        Object object = zzhh2.zza;
        this.zze = object;
        long l8 = zzhh2.zze;
        long l12 = this.zzb;
        zzhh zzhh4 = null;
        long l14 = -1;
        Object object2 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
        if (object2 >= 0) {
            object = null;
        } else {
            l7 = zzhh2.zzf;
            l12 -= l8;
            object2 = l7 == l14 ? 0 : (l7 < l14 ? -1 : 1);
            if (object2 != false) {
                l12 = Math.min(l7, l12);
            }
            l7 = l12;
            Uri uri = zzhh3.zza;
            object = new zzhh(uri, l8, l12, null);
        }
        long l15 = zzhh3.zzf;
        Object object3 = l15 == l14 ? 0 : (l15 < l14 ? -1 : 1);
        if (object3 == false || (l4 = (l3 = (l8 = zzhh3.zze + l15) - (l15 = zzcge2.zzb)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) > 0) {
            long l16;
            l15 = zzcge2.zzb;
            l8 = zzhh3.zze;
            long l17 = Math.max(l15, l8);
            l15 = zzhh3.zzf;
            long l18 = l15 - l14;
            object3 = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
            if (object3 != false) {
                l8 = zzhh3.zze + l15;
                l7 = zzcge2.zzb;
                l16 = l15 = Math.min(l15, l8 -= l7);
            } else {
                l16 = l14;
            }
            Uri uri = zzhh3.zza;
            zzhh4 = new zzhh(uri, l17, l16, null);
        }
        l15 = 0L;
        if (object != null) {
            zzhb zzhb2 = zzcge2.zza;
            l8 = zzhb2.zzb((zzhh)object);
        } else {
            l8 = l15;
        }
        if (zzhh4 != null) {
            object = zzcge2.zzc;
            l15 = object.zzb(zzhh4);
        }
        zzcge2.zzd = l2 = zzhh3.zze;
        Object object4 = l8 == l14 ? 0 : (l8 < l14 ? -1 : 1);
        if (object4 != false && (object4 = l15 == l14 ? 0 : (l15 < l14 ? -1 : 1)) != false) {
            return l8 + l15;
        }
        return l14;
    }

    public final Uri zzc() {
        return this.zze;
    }

    public final void zzd() {
        this.zza.zzd();
        this.zzc.zzd();
    }

    public final Map zze() {
        return zzgbf.zzd();
    }

    public final void zzf(zzie zzie2) {
    }
}

