/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzgar;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgcn;
import com.google.android.gms.internal.ads.zzys;
import com.google.android.gms.internal.ads.zzza;
import com.google.android.gms.internal.ads.zzze;
import java.lang.constant.Constable;
import java.util.AbstractCollection;

final class zzyy
extends zzza
implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    /*
     * Enabled aggressive block sorting
     */
    public zzyy(int n3, zzde object, int n4, zzys zzys2, int n7, String object2) {
        boolean bl2;
        Object object3;
        int n8;
        Object object4;
        int n10;
        block13: {
            zzan zzan2;
            super(n3, (zzde)object, n4);
            n3 = 0;
            this.zzf = n10 = zzze.zzo(n7, false);
            object = this.zzd;
            n10 = ((zzan)object).zzf;
            n4 = zzys2.zzy;
            n4 = n10 & 1;
            int n14 = 1;
            if (n14 != n4) {
                n4 = 0;
                object4 = null;
            } else {
                n4 = 1;
            }
            this.zzg = n4;
            if ((n10 &= 2) != 0) {
                n10 = 1;
            } else {
                n10 = 0;
                object = null;
            }
            this.zzh = n10;
            object = zzys2.zzw;
            n10 = (int)(((AbstractCollection)object).isEmpty() ? 1 : 0);
            object = n10 != 0 ? zzgbc.zzn("") : zzys2.zzw;
            object4 = null;
            for (n4 = 0; n4 < (n8 = ((AbstractCollection)object).size()); ++n4) {
                zzan2 = this.zzd;
                object3 = (String)object.get(n4);
                n8 = zzze.zzc(zzan2, (String)object3, false);
                if (n8 <= 0) {
                    continue;
                }
                break block13;
            }
            n4 = -1 >>> 1;
            n8 = 0;
            zzan2 = null;
        }
        this.zzi = n4;
        this.zzj = n8;
        object = this.zzd;
        n10 = ((zzan)object).zzg;
        n4 = zzys2.zzx;
        this.zzk = n10 = zzze.zzb(n10, n4);
        object4 = this.zzd;
        n4 = ((zzan)object4).zzg & 0x440;
        if (n4 != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object4 = null;
        }
        this.zzm = n4;
        object4 = zzze.zzh((String)object2);
        if (object4 == null) {
            n4 = 1;
        } else {
            n4 = 0;
            object4 = null;
        }
        object3 = this.zzd;
        this.zzl = n4 = zzze.zzc((zzan)object3, (String)object2, n4 != 0);
        if (n8 > 0 || (bl2 = ((AbstractCollection)(object2 = zzys2.zzw)).isEmpty()) && n10 > 0 || (n10 = (int)(this.zzg ? 1 : 0)) != 0 || (n10 = (int)(this.zzh ? 1 : 0)) != 0 && n4 > 0) {
            n10 = 1;
        } else {
            n10 = 0;
            object = null;
        }
        n4 = (int)(zzys2.zzT ? 1 : 0);
        n4 = (int)(zzze.zzo(n7, n4 != 0) ? 1 : 0);
        if (n4 != 0 && n10 != 0) {
            n3 = 1;
        }
        this.zze = n3;
    }

    public final int zza(zzyy zzyy2) {
        zzgar zzgar2 = zzgar.zzk();
        boolean bl2 = this.zzf;
        int n3 = zzyy2.zzf;
        zzgar2 = zzgar2.zze(bl2, n3 != 0);
        Constable constable = this.zzi;
        Constable constable2 = zzyy2.zzi;
        zzgcn zzgcn2 = zzgcn.zzc().zza();
        zzgar2 = zzgar2.zzd(constable, constable2, zzgcn2);
        int n4 = this.zzj;
        n3 = zzyy2.zzj;
        zzgar2 = zzgar2.zzb(n4, n3);
        int n7 = this.zzk;
        n3 = zzyy2.zzk;
        zzgar2 = zzgar2.zzb(n7, n3);
        boolean bl3 = this.zzg;
        n3 = (int)(zzyy2.zzg ? 1 : 0);
        zzgar2 = zzgar2.zze(bl3, n3 != 0);
        boolean bl4 = this.zzh;
        constable = Boolean.valueOf(bl4);
        n3 = zzyy2.zzh;
        constable2 = Boolean.valueOf(n3 != 0);
        int n8 = this.zzj;
        zzgcn2 = n8 == 0 ? zzgcn.zzc() : zzgcn.zzc().zza();
        zzgar2 = zzgar2.zzd(constable, constable2, zzgcn2);
        int n10 = this.zzl;
        n3 = zzyy2.zzl;
        zzgar2 = zzgar2.zzb(n10, n3);
        int n14 = this.zzk;
        if (n14 == 0) {
            boolean bl5 = this.zzm;
            boolean bl6 = zzyy2.zzm;
            zzgar2 = zzgar2.zzf(bl5, bl6);
        }
        return zzgar2.zza();
    }

    public final int zzb() {
        return this.zze;
    }
}

