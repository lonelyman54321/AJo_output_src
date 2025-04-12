/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzaey;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzakw;
import com.google.android.gms.internal.ads.zzalb;
import com.google.android.gms.internal.ads.zzalc;
import com.google.android.gms.internal.ads.zzald;
import com.google.android.gms.internal.ads.zzalf;
import com.google.android.gms.internal.ads.zzalh;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgd;

abstract class zzali {
    private final zzalb zza;
    private zzafa zzb;
    private zzadx zzc;
    private zzald zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private zzalf zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;

    public zzali() {
        Object object = new zzalb();
        this.zza = object;
        this.zzj = object = new zzalf();
    }

    public abstract long zza(zzfu var1);

    /*
     * Enabled aggressive block sorting
     */
    public void zzb(boolean bl2) {
        long l2 = 0L;
        if (bl2) {
            zzalf zzalf2;
            this.zzj = zzalf2 = new zzalf();
            this.zzf = l2;
            bl2 = false;
            zzalf2 = null;
        } else {
            bl2 = true;
        }
        this.zzh = (int)(bl2 ? 1 : 0);
        this.zze = -1;
        this.zzg = l2;
    }

    public abstract boolean zzc(zzfu var1, long var2, zzalf var4);

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int zze(zzadv zzadv2, zzaeq zzaeq2) {
        zzali zzali2 = this;
        Object object = zzadv2;
        Object object2 = this.zzb;
        zzeq.zzb(object2);
        int n3 = zzgd.zza;
        n3 = this.zzh;
        int n4 = 3;
        long l2 = -1;
        int n7 = -1;
        int n8 = 2;
        int n10 = 1;
        if (n3 != 0) {
            if (n3 != n10) {
                long l3;
                long l4;
                boolean bl2;
                long l7;
                long l8;
                long l12;
                if (n3 != n8) return n7;
                object2 = this.zzd;
                long l14 = object2.zzd(zzadv2);
                long l15 = l14 - (l12 = 0L);
                n3 = (int)(l15 == 0L ? 0 : (l15 < 0L ? -1 : 1));
                if (n3 >= 0) {
                    object2 = zzaeq2;
                    zzaeq2.zza = l14;
                    return 1;
                }
                n3 = (int)(l14 == l2 ? 0 : (l14 < l2 ? -1 : 1));
                if (n3 < 0) {
                    long l16 = 2;
                    l14 = -(l14 + l16);
                    this.zzi(l14);
                }
                if ((n3 = (int)(zzali2.zzl ? 1 : 0)) == 0) {
                    object2 = zzali2.zzd.zze();
                    zzeq.zzb(object2);
                    zzadx zzadx2 = zzali2.zzc;
                    zzadx2.zzO((zzaet)object2);
                    zzali2.zzl = n10;
                }
                if ((n3 = (int)((l8 = (l7 = zzali2.zzk) - l12) == 0L ? 0 : (l8 < 0L ? -1 : 1))) <= 0 && !(bl2 = ((zzalb)(object2 = zzali2.zza)).zze((zzadv)object))) {
                    zzali2.zzh = n4;
                    return n7;
                }
                zzali2.zzk = l12;
                object = zzali2.zza.zza();
                long l17 = zzali2.zza((zzfu)object);
                long l18 = l17 - l12;
                n7 = (int)(l18 == 0L ? 0 : (l18 < 0L ? -1 : 1));
                if (n7 >= 0 && (n8 = (int)((l4 = (l14 = (l3 = zzali2.zzg) + l17) - (l12 = zzali2.zze)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) >= 0) {
                    long l19 = zzali2.zzf(l3);
                    zzafa zzafa2 = zzali2.zzb;
                    n10 = ((zzfu)object).zze();
                    zzaey.zzb(zzafa2, (zzfu)object, n10);
                    zzafa zzafa3 = zzali2.zzb;
                    int n14 = ((zzfu)object).zze();
                    int n15 = 1;
                    zzafa3.zzs(l19, n15, n14, 0, null);
                    zzali2.zze = l2;
                }
                zzali2.zzg = l2 = zzali2.zzg + l17;
                return 0;
            }
            n4 = (int)this.zzf;
            ((zzadi)zzadv2).zzo(n4, false);
            this.zzh = n8;
            return 0;
        }
        while (true) {
            zzalf zzalf2;
            if ((n3 = (int)(((zzalb)(object2 = zzali2.zza)).zze((zzadv)object) ? 1 : 0)) == 0) {
                zzali2.zzh = n4;
                return n7;
            }
            long l20 = zzadv2.zzf();
            long l21 = zzali2.zzf;
            zzali2.zzk = l20 -= l21;
            object2 = zzali2.zza.zza();
            n3 = (int)(zzali2.zzc((zzfu)object2, l21, zzalf2 = zzali2.zzj) ? 1 : 0);
            if (n3 == 0) break;
            zzali2.zzf = l20 = zzadv2.zzf();
        }
        object2 = zzali2.zzj.zza;
        zzali2.zzi = n4 = ((zzan)object2).zzB;
        n4 = (int)(zzali2.zzm ? 1 : 0);
        if (n4 == 0) {
            zzafa zzafa4 = zzali2.zzb;
            zzafa4.zzl((zzan)object2);
            zzali2.zzm = n10;
        }
        if ((object2 = zzali2.zzj.zzb) != null) {
            zzali2.zzd = object2;
        } else {
            long l22 = zzadv2.zzd();
            long l23 = l22 - l2;
            n7 = (int)(l23 == 0L ? 0 : (l23 < 0L ? -1 : 1));
            if (n7 == 0) {
                n3 = 0;
                object2 = null;
                zzali2.zzd = object = new zzalh(null);
            } else {
                zzakw zzakw2;
                object2 = zzali2.zza.zzb();
                n4 = ((zzalc)object2).zza & 4;
                boolean bl3 = n4 != 0;
                long l24 = zzali2.zzf;
                long l25 = zzadv2.zzd();
                int n16 = ((zzalc)object2).zzd;
                n10 = ((zzalc)object2).zze;
                long l26 = ((zzalc)object2).zzb;
                long l27 = n16 += n10;
                object = zzakw2;
                object2 = this;
                zzakw2 = new zzakw(this, l24, l25, l27, l26, bl3);
                zzali2.zzd = zzakw2;
            }
        }
        zzali2.zzh = n8;
        object = zzali2.zza;
        ((zzalb)object).zzd();
        return 0;
    }

    public final long zzf(long l2) {
        long l3 = this.zzi;
        return l2 * 1000000L / l3;
    }

    public final long zzg(long l2) {
        return (long)this.zzi * l2 / 1000000L;
    }

    public final void zzh(zzadx zzadx2, zzafa zzafa2) {
        this.zzc = zzadx2;
        this.zzb = zzafa2;
        this.zzb(true);
    }

    public void zzi(long l2) {
        this.zzg = l2;
    }

    public final void zzj(long l2, long l3) {
        zzalb zzalb2 = this.zza;
        zzalb2.zzc();
        long l4 = 0L;
        long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (l7 == false) {
            boolean bl2 = this.zzl ^ true;
            this.zzb(bl2);
            return;
        }
        int n3 = this.zzh;
        if (n3 != 0) {
            this.zze = l2 = this.zzg(l3);
            zzald zzald2 = this.zzd;
            zzald2.zzg(l2);
            this.zzh = n3 = 2;
        }
    }
}

