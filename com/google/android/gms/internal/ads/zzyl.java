/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 *  android.content.res.Resources
 */
package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzdl;
import com.google.android.gms.internal.ads.zzfyh;
import com.google.android.gms.internal.ads.zzgar;
import com.google.android.gms.internal.ads.zzgcn;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzys;
import com.google.android.gms.internal.ads.zzza;
import com.google.android.gms.internal.ads.zzze;
import java.util.AbstractCollection;

final class zzyl
extends zzza
implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzys zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    /*
     * Enabled aggressive block sorting
     */
    public zzyl(int n3, zzde object, int n4, zzys object2, int n7, boolean bl2, zzfyh object3, int n8) {
        int n10;
        int n14;
        int n15;
        Object object4;
        int n16;
        int n17;
        block21: {
            Object object5;
            Object object6;
            block20: {
                String string2;
                super(n3, (zzde)object, n4);
                this.zzh = object2;
                n3 = (int)(((zzys)object2).zzR ? 1 : 0);
                n17 = 24;
                n4 = 1;
                n3 = n4 != n3 ? 16 : 24;
                this.zzg = string2 = zzze.zzh(this.zzd.zze);
                string2 = null;
                this.zzi = n16 = zzze.zzo(n7, false);
                n16 = 0;
                object4 = null;
                while (true) {
                    object6 = ((zzdl)object2).zzq;
                    n15 = ((AbstractCollection)object6).size();
                    n14 = -1 >>> 1;
                    if (n16 >= n15) break;
                    object6 = this.zzd;
                    object5 = (String)((zzdl)object2).zzq.get(n16);
                    n15 = zzze.zzc((zzan)object6, (String)object5, false);
                    if (n15 <= 0) {
                        ++n16;
                        continue;
                    }
                    break block20;
                    break;
                }
                n16 = -1 >>> 1;
                n15 = 0;
                object6 = null;
            }
            this.zzk = n16;
            this.zzj = n15;
            this.zzl = n16 = zzze.zzb(this.zzd.zzg, 0);
            object4 = this.zzd;
            n15 = ((zzan)object4).zzg;
            if (n15 == 0 || (n15 &= n4) != 0) {
                n15 = 1;
            } else {
                n15 = 0;
                object6 = null;
            }
            this.zzm = n15;
            n15 = ((zzan)object4).zzf & n4;
            if (n4 != n15) {
                n15 = 0;
                object6 = null;
            } else {
                n15 = 1;
            }
            this.zzp = n15;
            this.zzq = n15 = ((zzan)object4).zzA;
            this.zzr = n15 = ((zzan)object4).zzB;
            this.zzs = n15 = ((zzan)object4).zzj;
            this.zzf = n10 = object3.zza(object4);
            object3 = Resources.getSystem().getConfiguration();
            n16 = zzgd.zza;
            n15 = -1;
            if (n16 >= n17) {
                object = en_0.a(Zm.b((Configuration)object3));
                object3 = ",";
                object = ((String)object).split((String)object3, n15);
            } else {
                object = new String[n4];
                object[0] = object3 = ((Configuration)object3).locale.toLanguageTag();
            }
            object3 = null;
            for (n10 = 0; n10 < (n16 = ((Object)object).length); ++n10) {
                object[n10] = object4 = zzgd.zzD((String)object[n10]);
            }
            object3 = null;
            for (n10 = 0; n10 < (n16 = ((Object)object).length); ++n10) {
                object4 = this.zzd;
                object5 = object[n10];
                n16 = zzze.zzc((zzan)object4, (String)object5, false);
                if (n16 <= 0) {
                    continue;
                }
                break block21;
            }
            n10 = -1 >>> 1;
            n16 = 0;
            object4 = null;
        }
        this.zzn = n10;
        this.zzo = n16;
        object = null;
        for (n17 = 0; n17 < (n10 = ((AbstractCollection)(object3 = ((zzdl)object2).zzu)).size()); ++n17) {
            object3 = this.zzd.zzn;
            if (object3 == null || (n10 = (int)(((String)object3).equals(object4 = ((zzdl)object2).zzu.get(n17)) ? 1 : 0)) == 0) continue;
            n14 = n17;
            break;
        }
        this.zzt = n14;
        n17 = n7 & 0x180;
        int n18 = 128;
        if (n17 == n18) {
            n17 = 1;
        } else {
            n17 = 0;
            object = null;
        }
        this.zzu = n17;
        n17 = n7 & 0x40;
        n18 = 64;
        if (n17 == n18) {
            n17 = 1;
        } else {
            n17 = 0;
            object = null;
        }
        this.zzv = n17;
        object = this.zzh;
        n18 = (int)(((zzys)object).zzT ? 1 : 0);
        n18 = zzze.zzo(n7, n18 != 0);
        if (n18 == 0 || (n18 = this.zzf) == 0 && (n10 = ((zzys)object).zzM) == 0) {
            n4 = 0;
        } else {
            n10 = zzze.zzo(n7, false);
            if (n10 != 0 && n18 != 0) {
                object2 = this.zzd;
                n18 = ((zzan)object2).zzj;
                if (!(n18 == n15 || (n17 = (int)(((zzys)object).zzV ? 1 : 0)) == 0 && bl2 || (n3 &= n7) == 0)) {
                    n4 = 2;
                }
            }
        }
        this.zze = n4;
    }

    public final int zza(zzyl comparable) {
        boolean bl2 = this.zzf;
        zzgcn zzgcn2 = bl2 && (bl2 = this.zzi) ? zzze.zzg() : zzze.zzg().zza();
        boolean bl3 = this.zzi;
        Object object = zzgar.zzk();
        int n3 = comparable.zzi;
        zzgar zzgar2 = ((zzgar)object).zze(bl3, n3 != 0);
        object = this.zzk;
        Object object2 = comparable.zzk;
        zzgcn zzgcn3 = zzgcn.zzc().zza();
        zzgar2 = zzgar2.zzd(object, object2, zzgcn3);
        int n4 = this.zzj;
        n3 = comparable.zzj;
        zzgar2 = zzgar2.zzb(n4, n3);
        n4 = this.zzl;
        n3 = comparable.zzl;
        zzgar2 = zzgar2.zzb(n4, n3);
        n4 = (int)(this.zzp ? 1 : 0);
        n3 = (int)(comparable.zzp ? 1 : 0);
        zzgar2 = zzgar2.zze(n4 != 0, n3 != 0);
        n4 = this.zzm;
        n3 = comparable.zzm;
        zzgar2 = zzgar2.zze(n4 != 0, n3 != 0);
        object = this.zzn;
        object2 = comparable.zzn;
        zzgcn3 = zzgcn.zzc().zza();
        zzgar2 = zzgar2.zzd(object, object2, zzgcn3);
        n4 = this.zzo;
        n3 = comparable.zzo;
        zzgar2 = zzgar2.zzb(n4, n3);
        n4 = (int)(this.zzf ? 1 : 0);
        n3 = (int)(comparable.zzf ? 1 : 0);
        zzgar2 = zzgar2.zze(n4 != 0, n3 != 0);
        object = this.zzt;
        object2 = comparable.zzt;
        zzgcn3 = zzgcn.zzc().zza();
        zzgar2 = zzgar2.zzd(object, object2, zzgcn3);
        n4 = this.zzh.zzB;
        n4 = this.zzu;
        n3 = comparable.zzu;
        zzgar2 = zzgar2.zze(n4 != 0, n3 != 0);
        n4 = this.zzv;
        n3 = comparable.zzv;
        zzgar2 = zzgar2.zze(n4 != 0, n3 != 0);
        object = this.zzq;
        object2 = comparable.zzq;
        zzgar2 = zzgar2.zzd(object, object2, zzgcn2);
        object = this.zzr;
        n3 = comparable.zzr;
        object2 = n3;
        zzgar2 = zzgar2.zzd(object, object2, zzgcn2);
        object = this.zzg;
        object2 = comparable.zzg;
        n4 = zzgd.zzG(object, object2);
        if (n4 != 0) {
            n4 = this.zzs;
            object = n4;
            int n7 = comparable.zzs;
            comparable = Integer.valueOf(n7);
            zzgar2 = zzgar2.zzd(object, comparable, zzgcn2);
        }
        return zzgar2.zza();
    }

    public final int zzb() {
        return this.zze;
    }
}

