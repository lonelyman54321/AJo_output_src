/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzcz;
import com.google.android.gms.internal.ads.zzdb;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfb;
import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzkz;
import com.google.android.gms.internal.ads.zzlh;
import com.google.android.gms.internal.ads.zzlq;
import com.google.android.gms.internal.ads.zzlr;
import com.google.android.gms.internal.ads.zzls;
import com.google.android.gms.internal.ads.zzmg;
import com.google.android.gms.internal.ads.zzmx;
import com.google.android.gms.internal.ads.zzvm;
import com.google.android.gms.internal.ads.zzvo;
import java.util.List;

final class zzlt {
    private final zzcz zza;
    private final zzdb zzb;
    private final zzmx zzc;
    private final zzfb zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzlq zzh;
    private zzlq zzi;
    private zzlq zzj;
    private int zzk;
    private Object zzl;
    private long zzm;
    private final zzkz zzn;

    public zzlt(zzmx object, zzfb zzfb2, zzkz zzkz2) {
        this.zzc = object;
        this.zzd = zzfb2;
        this.zzn = zzkz2;
        this.zza = object = new zzcz();
        this.zzb = object = new zzdb();
    }

    private final boolean zzA(zzdc object, zzvo object2) {
        int n3 = zzlt.zzC((zzvo)object2);
        if (n3 == 0) {
            return false;
        }
        Object object3 = ((zzvo)object2).zza;
        Object object4 = this.zza;
        object3 = ((zzdc)object).zzn(object3, (zzcz)object4);
        n3 = ((zzcz)object3).zzd;
        object2 = ((zzvo)object2).zza;
        int n4 = ((zzdc)object).zza(object2);
        object4 = this.zzb;
        long l2 = 0L;
        object = ((zzdc)object).zze(n3, (zzdb)object4, l2);
        int n7 = ((zzdb)object).zzq;
        return n7 == n4;
    }

    private final boolean zzB(zzdc object) {
        int n3;
        Object object2 = this.zzh;
        boolean bl2 = true;
        if (object2 == null) {
            return bl2;
        }
        Object object3 = ((zzlq)object2).zzb;
        int n4 = n3 = ((zzdc)object).zza(object3);
        while (true) {
            Object object4 = this.zza;
            zzdb zzdb2 = this.zzb;
            int n7 = this.zzf;
            boolean bl3 = this.zzg;
            object3 = object;
            n4 = ((zzdc)object).zzi(n4, (zzcz)object4, zzdb2, n7, bl3);
            while (true) {
                object2.getClass();
                object3 = ((zzlq)object2).zzg();
                if (object3 == null) break;
                object3 = ((zzlq)object2).zzf;
                n3 = (int)(((zzlr)object3).zzg ? 1 : 0);
                if (n3 != 0) break;
                object2 = ((zzlq)object2).zzg();
            }
            object3 = ((zzlq)object2).zzg();
            int n8 = -1;
            if (n4 == n8 || object3 == null || (n8 = ((zzdc)object).zza(object4 = ((zzlq)object3).zzb)) != n4) break;
            object2 = object3;
        }
        n3 = (int)(this.zzn((zzlq)object2) ? 1 : 0);
        zzlr zzlr2 = ((zzlq)object2).zzf;
        ((zzlq)object2).zzf = object = this.zzh((zzdc)object, zzlr2);
        if (n3 == 0) {
            return bl2;
        }
        return false;
    }

    private static final boolean zzC(zzvo zzvo2) {
        int n3;
        int n4 = zzvo2.zzb();
        return n4 == 0 && (n3 = zzvo2.zze) == (n4 = -1);
    }

    private final long zzs(zzdc zzdc2, Object object, int n3) {
        zzcz zzcz2 = this.zza;
        zzdc2.zzn(object, zzcz2);
        this.zza.zzi(n3);
        this.zza.zzk(n3);
        return 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final zzlr zzt(zzdc zzdc2, zzlq zzlq2, long l2) {
        int n3;
        Object object;
        Object object2;
        int n4;
        zzlr zzlr2;
        Object object3;
        zzdc zzdc3;
        zzlt zzlt2;
        block13: {
            Object object4;
            int n7;
            long l3;
            long l4;
            block14: {
                block15: {
                    block11: {
                        long l7;
                        long l8;
                        block9: {
                            long l12;
                            long l14;
                            long l15;
                            long l16;
                            Object object5;
                            int n8;
                            long l17;
                            Object object6;
                            int n10;
                            Object object7;
                            block12: {
                                block10: {
                                    zzlt2 = this;
                                    zzdc3 = zzdc2;
                                    object3 = zzlq2;
                                    zzlr2 = zzlq2.zzf;
                                    l4 = zzlq2.zze();
                                    l8 = zzlr2.zze;
                                    int n14 = zzlr2.zzg;
                                    l7 = (l4 += l8) - l2;
                                    n4 = -1;
                                    if (n14 == 0) break block9;
                                    object7 = zzlr2.zza.zza;
                                    int n15 = zzdc2.zza(object7);
                                    n10 = this.zzf;
                                    n14 = this.zzg;
                                    object7 = this.zzb;
                                    Object object8 = this.zza;
                                    Object object9 = object7;
                                    object7 = zzdc2;
                                    object6 = object8;
                                    int n16 = n10;
                                    l17 = 0L;
                                    n8 = n14;
                                    int n17 = zzdc2.zzi(n15, (zzcz)object8, (zzdb)object9, n10, n14 != 0);
                                    if (n17 == n4) return null;
                                    object5 = this.zza;
                                    n10 = zzdc2.zzd((int)n17, (zzcz)object5, (boolean)true).zzd;
                                    object5 = this.zza.zzc;
                                    object5.getClass();
                                    l16 = zzlr2.zza.zzd;
                                    object6 = this.zzb;
                                    object6 = zzdc2.zze(n10, (zzdb)object6, l17);
                                    n14 = ((zzdb)object6).zzp;
                                    if (n14 != n17) break block10;
                                    object5 = this.zzb;
                                    object6 = this.zza;
                                    l16 = -9223372036854775807L;
                                    object7 = zzdc2.zzm((zzdb)object5, (zzcz)object6, n10, l16, l7 = Math.max(l17, l7));
                                    if (object7 == null) break block11;
                                    object5 = ((Pair)object7).first;
                                    l8 = (Long)((Pair)object7).second;
                                    object7 = zzlq2.zzg();
                                    if (object7 != null && (n16 = (int)((object8 = ((zzlq)object7).zzb).equals(object5) ? 1 : 0)) != 0) {
                                        object7 = ((zzlq)object7).zzf.zza;
                                        l16 = ((zzvo)object7).zzd;
                                    } else {
                                        l16 = zzlt2.zze;
                                        zzlt2.zze = l7 = 1L + l16;
                                    }
                                    l15 = l8;
                                    l17 = -9223372036854775807L;
                                    break block12;
                                }
                                l15 = l17;
                            }
                            zzdb zzdb2 = zzlt2.zzb;
                            zzcz zzcz2 = zzlt2.zza;
                            object7 = zzdc2;
                            l8 = l15;
                            object6 = zzlt.zzx(zzdc2, object5, l15, l16, zzdb2, zzcz2);
                            l4 = -9223372036854775807L;
                            n10 = (int)(l17 == l4 ? 0 : (l17 < l4 ? -1 : 1));
                            if (n10 != 0 && (n8 = (int)((l14 = (l12 = zzlr2.zzc) - l4) == 0L ? 0 : (l14 < 0L ? -1 : 1))) != 0) {
                                object7 = zzlr2.zza.zza;
                                object5 = zzlt2.zza;
                                zzdc3.zzn(object7, (zzcz)object5).zzb();
                                object7 = zzlt2.zza;
                                ((zzcz)object7).zzg();
                            }
                            object7 = this;
                            object5 = zzdc2;
                            l12 = l17;
                            long l18 = l15;
                            return this.zzu(zzdc2, (zzvo)object6, l17, l15);
                        }
                        l3 = 0L;
                        object3 = zzlr2.zza;
                        object2 = ((zzvo)object3).zza;
                        object = this.zza;
                        zzdc2.zzn(object2, (zzcz)object);
                        n3 = ((zzvo)object3).zzb();
                        if (n3 == 0) break block13;
                        object2 = this.zza;
                        n7 = ((zzvo)object3).zzb;
                        n3 = ((zzcz)object2).zza(n7);
                        if (n3 == n4) break block11;
                        object2 = this.zza;
                        int n18 = ((zzvo)object3).zzc;
                        int n19 = ((zzcz)object2).zzf(n7, n18);
                        if (n19 < 0) {
                            Object object10 = ((zzvo)object3).zza;
                            long l19 = zzlr2.zzc;
                            long l20 = ((zzvo)object3).zzd;
                            object2 = this;
                            object = zzdc2;
                            return this.zzv(zzdc2, object10, n7, n19, l19, l20);
                        }
                        l4 = zzlr2.zzc;
                        l8 = -9223372036854775807L;
                        long l21 = l4 - l8;
                        n19 = (int)(l21 == 0L ? 0 : (l21 < 0L ? -1 : 1));
                        if (n19 != 0) break block14;
                        object = this.zzb;
                        object4 = this.zza;
                        n7 = ((zzcz)object4).zzd;
                        long l22 = -9223372036854775807L;
                        l7 = Math.max(l3, l7);
                        object2 = zzdc2;
                        object2 = zzdc2.zzm((zzdb)object, (zzcz)object4, n7, l22, l7);
                        if (object2 != null) break block15;
                    }
                    return null;
                }
                object2 = (Long)((Pair)object2).second;
                l4 = (Long)object2;
            }
            object4 = ((zzvo)object3).zza;
            n7 = ((zzvo)object3).zzb;
            zzlt2.zzs(zzdc3, object4, n7);
            object4 = ((zzvo)object3).zza;
            long l23 = Math.max(l3, l4);
            long l24 = zzlr2.zzc;
            long l25 = ((zzvo)object3).zzd;
            object2 = this;
            object = zzdc2;
            return this.zzw(zzdc2, object4, l23, l24, l25);
        }
        n3 = ((zzvo)object3).zze;
        if (n3 != n4) {
            object = this.zza;
            ((zzcz)object).zzm(n3);
        }
        object2 = zzlt2.zza;
        int n20 = ((zzvo)object3).zze;
        int n21 = ((zzcz)object2).zze(n20);
        ((zzcz)object2).zzn(n20);
        object2 = zzlt2.zza;
        n20 = ((zzvo)object3).zze;
        n3 = ((zzcz)object2).zza(n20);
        if (n21 != n3) {
            Object object11 = ((zzvo)object3).zza;
            int n22 = ((zzvo)object3).zze;
            long l26 = zzlr2.zze;
            long l27 = ((zzvo)object3).zzd;
            object2 = this;
            object = zzdc2;
            return this.zzv(zzdc2, object11, n22, n21, l26, l27);
        }
        object2 = ((zzvo)object3).zza;
        n20 = ((zzvo)object3).zze;
        zzlt2.zzs(zzdc3, object2, n20);
        Object object12 = ((zzvo)object3).zza;
        long l28 = zzlr2.zze;
        long l29 = ((zzvo)object3).zzd;
        long l30 = 0L;
        object2 = this;
        object = zzdc2;
        return this.zzw(zzdc2, object12, l30, l28, l29);
    }

    private final zzlr zzu(zzdc zzdc2, zzvo zzvo2, long l2, long l3) {
        Object object = zzvo2.zza;
        Object object2 = this.zza;
        zzdc2.zzn(object, (zzcz)object2);
        boolean bl2 = zzvo2.zzb();
        if (bl2) {
            Object object3 = zzvo2.zza;
            int n3 = zzvo2.zzb;
            int n4 = zzvo2.zzc;
            long l4 = zzvo2.zzd;
            object2 = this;
            return this.zzv(zzdc2, object3, n3, n4, l2, l4);
        }
        Object object4 = zzvo2.zza;
        long l7 = zzvo2.zzd;
        object2 = this;
        return this.zzw(zzdc2, object4, l3, l2, l7);
    }

    private final zzlr zzv(zzdc zzdc2, Object object, int n3, int n4, long l2, long l3) {
        zzlr zzlr2;
        zzvo zzvo2;
        zzlt zzlt2 = this;
        Object object2 = zzvo2;
        int n7 = n3;
        zzvo2 = new zzvo(object, n3, n4, l3);
        object2 = zzvo2.zza;
        int n8 = zzvo2.zzb;
        n7 = zzvo2.zzc;
        zzcz zzcz2 = this.zza;
        long l4 = zzdc2.zzn(object2, zzcz2).zzh(n8, n7);
        object2 = this.zza;
        n8 = n3;
        int n10 = ((zzcz)object2).zze(n3);
        n8 = n4;
        if (n4 == n10) {
            object2 = this.zza;
            ((zzcz)object2).zzj();
        }
        object2 = zzlt2.zza;
        n8 = zzvo2.zzb;
        ((zzcz)object2).zzn(n8);
        long l7 = -9223372036854775807L;
        long l8 = 0L;
        long l12 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (l12 != false && (n10 = (int)(l4 == l8 ? 0 : (l4 < l8 ? -1 : 1))) <= 0) {
            l7 = (long)-1 + l4;
            l8 = l7 = Math.max(l8, l7);
        }
        object2 = zzlr2;
        long l14 = -9223372036854775807L;
        zzlr2 = new zzlr(zzvo2, l8, l2, l14, l4, false, false, false, false);
        return zzlr2;
    }

    private final zzlr zzw(zzdc zzdc2, Object object, long l2, long l3, long l4) {
        long l7;
        long l8;
        long l12;
        long l14;
        zzcz zzcz2;
        zzlt zzlt2 = this;
        Object object2 = zzdc2;
        Object object3 = object;
        long l15 = l2;
        zzcz zzcz3 = this.zza;
        zzdc2.zzn(object, zzcz3);
        zzcz3 = this.zza;
        int n3 = zzcz3.zzc(l2);
        int n4 = -1;
        if (n3 != n4) {
            zzcz2 = this.zza;
            zzcz2.zzm(n3);
        }
        if (n3 == n4) {
            zzcz2 = zzlt2.zza;
            zzcz2.zzb();
        } else {
            zzcz2 = zzlt2.zza;
            zzcz2.zzn(n3);
        }
        long l16 = l4;
        zzvo zzvo2 = new zzvo(object3, l4, n3);
        boolean bl2 = zzlt.zzC(zzvo2);
        boolean bl3 = zzlt2.zzA((zzdc)object2, zzvo2);
        boolean bl4 = zzlt2.zzz((zzdc)object2, zzvo2, bl2);
        if (n3 != n4) {
            object2 = zzlt2.zza;
            ((zzcz)object2).zzn(n3);
        }
        l16 = -9223372036854775807L;
        double d2 = -4.9E-324;
        long l17 = 0L;
        double d5 = 0.0;
        if (n3 != n4) {
            object2 = zzlt2.zza;
            ((zzcz)object2).zzi(n3);
            l14 = l17;
        } else {
            l14 = l16;
        }
        long l18 = l14 == l16 ? 0 : (l14 < l16 ? -1 : 1);
        if (l18 != false) {
            l12 = l17;
            l8 = l17;
        } else {
            object2 = zzlt2.zza;
            l7 = ((zzcz)object2).zze;
            l12 = l14;
            l8 = l7;
        }
        l18 = l8 == l16 ? 0 : (l8 < l16 ? -1 : 1);
        if (l18 != false && (l18 = l15 == l8 ? 0 : (l15 < l8 ? -1 : 1)) >= 0) {
            l15 = l8 + (long)-1;
            l15 = Math.max(l17, l15);
        }
        l17 = l15;
        l7 = l3;
        object2 = new zzlr(zzvo2, l15, l3, l12, l8, false, bl2, bl3, bl4);
        return object2;
    }

    private static zzvo zzx(zzdc zzdc2, Object object, long l2, long l3, zzdb zzdb2, zzcz zzcz2) {
        zzdc2.zzn(object, zzcz2);
        int n3 = zzcz2.zzd;
        long l4 = 0L;
        Object object2 = zzdb2;
        zzdc2.zze(n3, zzdb2, l4);
        zzdc2.zza(object);
        zzcz2.zzb();
        zzdc2.zzn(object, zzcz2);
        n3 = zzcz2.zzd(l2);
        int n4 = -1;
        if (n3 == n4) {
            n4 = zzcz2.zzc(l2);
            l4 = l3;
            zzvo zzvo2 = new zzvo(object, l3, n4);
            return zzvo2;
        }
        l4 = l3;
        int n7 = zzcz2.zze(n3);
        object2 = new zzvo(object, n3, n7, l3);
        return object2;
    }

    private final void zzy() {
        Object object;
        Object object2;
        zzgaz zzgaz2 = new zzgaz();
        for (object2 = this.zzh; object2 != null; object2 = ((zzlq)object2).zzg()) {
            object = ((zzlq)object2).zzf.zza;
            zzgaz2.zzf(object);
        }
        object2 = this.zzi;
        object2 = object2 == null ? null : ((zzlq)object2).zzf.zza;
        object = this.zzd;
        zzls zzls2 = new zzls(this, zzgaz2, (zzvo)object2);
        object.zzh(zzls2);
    }

    private final boolean zzz(zzdc zzdc2, zzvo object, boolean bl2) {
        object = ((zzvo)object).zza;
        int n3 = zzdc2.zza(object);
        object = this.zza;
        int n4 = zzdc2.zzd((int)n3, (zzcz)object, (boolean)false).zzd;
        Object object2 = this.zzb;
        long l2 = 0L;
        object = zzdc2.zze(n4, (zzdb)object2, l2);
        n4 = (int)(((zzdb)object).zzj ? 1 : 0);
        if (n4 == 0) {
            zzcz zzcz2 = this.zza;
            zzdb zzdb2 = this.zzb;
            int n7 = this.zzf;
            boolean bl3 = this.zzg;
            object2 = zzdc2;
            int n8 = zzdc2.zzi(n3, zzcz2, zzdb2, n7, bl3);
            if (n8 == (n4 = -1) && bl2) {
                return true;
            }
        }
        return false;
    }

    public final zzlq zza() {
        int n3;
        Object object = this.zzh;
        Object object2 = null;
        if (object == null) {
            return null;
        }
        zzlq zzlq2 = this.zzi;
        if (object == zzlq2) {
            this.zzi = zzlq2 = ((zzlq)object).zzg();
        }
        ((zzlq)object).zzn();
        this.zzk = n3 = this.zzk + -1;
        if (n3 == 0) {
            long l2;
            this.zzj = null;
            object = this.zzh;
            this.zzl = object2 = ((zzlq)object).zzb;
            object = ((zzlq)object).zzf.zza;
            this.zzm = l2 = ((zzvo)object).zzd;
        }
        object = this.zzh.zzg();
        this.zzh = object;
        this.zzy();
        return this.zzh;
    }

    public final zzlq zzb() {
        zzlq zzlq2 = this.zzi;
        zzeq.zzb(zzlq2);
        this.zzi = zzlq2 = zzlq2.zzg();
        this.zzy();
        zzlq2 = this.zzi;
        zzeq.zzb(zzlq2);
        return zzlq2;
    }

    public final zzlq zzc(zzlr object) {
        int n3;
        long l2;
        Object object2 = this.zzj;
        if (object2 == null) {
            l2 = 1000000000000L;
        } else {
            long l3 = ((zzlq)object2).zze();
            object2 = ((zzlq)object2).zzf;
            long l4 = ((zzlr)object2).zze;
            l3 += l4;
            l4 = ((zzlr)object).zzb;
            l2 = l3 - l4;
        }
        zzlh zzlh2 = this.zzn.zza;
        object = zzlh.zzd(zzlh2, (zzlr)object, l2);
        object2 = this.zzj;
        if (object2 != null) {
            ((zzlq)object2).zzo((zzlq)object);
        } else {
            this.zzh = object;
            this.zzi = object;
        }
        this.zzl = null;
        this.zzj = object;
        this.zzk = n3 = this.zzk + 1;
        this.zzy();
        return object;
    }

    public final zzlq zzd() {
        return this.zzj;
    }

    public final zzlq zze() {
        return this.zzh;
    }

    public final zzlq zzf() {
        return this.zzi;
    }

    public final zzlr zzg(long l2, zzmg object) {
        zzlr zzlr2;
        zzlq zzlq2 = this.zzj;
        if (zzlq2 == null) {
            zzdc zzdc2 = ((zzmg)object).zza;
            zzvo zzvo2 = ((zzmg)object).zzb;
            long l3 = ((zzmg)object).zzc;
            long l4 = ((zzmg)object).zzr;
            zzlr2 = this.zzu(zzdc2, zzvo2, l3, l4);
        } else {
            object = ((zzmg)object).zza;
            zzlr2 = this.zzt((zzdc)object, zzlq2, l2);
        }
        return zzlr2;
    }

    /*
     * Unable to fully structure code
     */
    public final zzlr zzh(zzdc var1_1, zzlr var2_2) {
        var3_3 = this;
        var4_4 = var1_1;
        var5_5 = var2_2;
        var6_6 = var2_2.zza;
        var7_7 = zzlt.zzC(var6_6);
        var8_8 = this.zzA(var1_1, var6_6);
        var9_9 = this.zzz(var1_1, var6_6, var7_7);
        var10_10 = var2_2.zza.zza;
        var11_11 = this.zza;
        var1_1.zzn(var10_10, var11_11);
        var12_12 = var6_6.zzb();
        var13_13 = -1;
        var14_14 = 0L;
        var16_15 = 0.0;
        var18_16 = -9223372036854775807L;
        var20_17 = -4.9E-324;
        if (var12_12 != 0 || (var12_12 = var6_6.zze) == var13_13) {
            var22_18 = var18_16;
            var24_19 = var20_17;
        } else {
            var26_20 = this.zza;
            var26_20.zzi(var12_12);
            var22_18 = var14_14;
            var24_19 = var16_15;
        }
        var12_12 = (int)var6_6.zzb();
        if (var12_12 != 0) {
            var4_4 = var3_3.zza;
            var27_21 = var6_6.zzb;
            var28_22 = var6_6.zzc;
            var14_14 = var4_4.zzh(var27_21, var28_22);
lbl33:
            // 2 sources

            while (true) {
                var18_16 = var22_18;
                var20_17 = var24_19;
                var22_18 = var14_14;
                break;
            }
        } else {
            var12_12 = (int)(var22_18 == var18_16 ? 0 : (var22_18 < var18_16 ? -1 : 1));
            if (var12_12 != 0) {
                var18_16 = var14_14;
                var20_17 = var16_15;
                var22_18 = var14_14;
                var24_19 = var16_15;
            } else {
                var4_4 = var3_3.zza;
                var14_14 = var4_4.zze;
                ** continue;
            }
        }
        var12_12 = (int)var6_6.zzb();
        if (var12_12 != 0) {
            var4_4 = var3_3.zza;
            var13_13 = var6_6.zzb;
            var4_4.zzn(var13_13);
        } else {
            var12_12 = var6_6.zze;
            if (var12_12 != var13_13) {
                var10_10 = var3_3.zza;
                var10_10.zzn(var12_12);
            }
        }
        var30_24 = var5_5.zzb;
        var32_25 = var5_5.zzc;
        var4_4 = var29_23;
        var5_5 = var6_6;
        var14_14 = var32_25;
        var29_23 = new zzlr(var6_6, var30_24, var32_25, var18_16, var22_18, false, var7_7, var8_8, var9_9);
        return var29_23;
    }

    /*
     * Unable to fully structure code
     */
    public final zzvo zzi(zzdc var1_1, Object var2_2, long var3_3) {
        var5_4 = this.zza;
        var5_4 = var1_1.zzn(var2_2, (zzcz)var5_4);
        var6_5 = var5_4.zzd;
        var7_6 = this.zzl;
        var8_7 = false;
        var9_8 = null;
        var10_9 = -1;
        if (var7_6 != null && (var11_10 = var1_1.zza(var7_6)) != var10_9) {
            var12_11 = this.zza;
            var7_6 = var1_1.zzd(var11_10, (zzcz)var12_11, false);
            var11_10 = var7_6.zzd;
            if (var11_10 == var6_5) {
                var13_12 = this.zzm;
lbl14:
                // 5 sources

                while (true) {
                    continue;
                    break;
                }
            }
        }
        for (var7_6 = this.zzh; var7_6 != null; var7_6 = var7_6.zzg()) {
            var12_11 = var7_6.zzb;
            var17_14 = var12_11.equals(var2_2);
            if (var17_14 == 0) continue;
            var5_4 = var7_6.zzf.zza;
            var13_12 = var5_4.zzd;
            ** GOTO lbl14
        }
        for (var7_6 = this.zzh; var7_6 != null; var7_6 = var7_6.zzg()) {
            var12_11 = var7_6.zzb;
            var17_14 = var1_1.zza(var12_11);
            if (var17_14 == var10_9) continue;
            var18_15 = this.zza;
            var12_11 = var1_1.zzd(var17_14, var18_15, false);
            var17_14 = var12_11.zzd;
            if (var17_14 != var6_5) continue;
            var5_4 = var7_6.zzf.zza;
            var13_12 = var5_4.zzd;
            ** GOTO lbl14
        }
        var13_12 = this.zze;
        this.zze = var15_13 = 1L + var13_12;
        var9_8 = this.zzh;
        if (var9_8 != null) ** GOTO lbl14
        this.zzl = var2_2;
        this.zzm = var13_12;
        ** while (true)
        var15_13 = var13_12;
        var5_4 = this.zza;
        var1_1.zzn(var2_2, (zzcz)var5_4);
        var5_4 = this.zza;
        var7_6 = this.zzb;
        var6_5 = var5_4.zzd;
        var19_16 = 0L;
        var1_1.zze(var6_5, (zzdb)var7_6, var19_16);
        var6_5 = var1_1.zza(var2_2);
        var21_17 = var2_2;
        while (true) {
            var22_18 = this.zzb;
            var11_10 = var22_18.zzp;
            if (var6_5 < var11_10) break;
            var7_6 = this.zza;
            var8_7 = true;
            var1_1.zzd(var6_5, (zzcz)var7_6, var8_7);
            this.zza.zzb();
            var7_6 = this.zza;
            var19_16 = var7_6.zze;
            var11_10 = var7_6.zzd(var19_16);
            if (var11_10 != var10_9) {
                var21_17 = this.zza.zzc;
                var21_17.getClass();
            }
            var6_5 += -1;
        }
        var23_19 = this.zza;
        var13_12 = var3_3;
        var12_11 = var22_18;
        var18_15 = var23_19;
        return zzlt.zzx(var1_1, var21_17, var3_3, var15_13, var22_18, var23_19);
    }

    public final void zzj() {
        long l2;
        Object object;
        zzlq zzlq2;
        int n3 = this.zzk;
        if (n3 == 0) {
            return;
        }
        zzeq.zzb(zzlq2);
        this.zzl = object = zzlq2.zzb;
        object = zzlq2.zzf.zza;
        this.zzm = l2 = ((zzvo)object).zzd;
        for (zzlq2 = this.zzh; zzlq2 != null; zzlq2 = zzlq2.zzg()) {
            zzlq2.zzn();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        this.zzy();
    }

    public final /* synthetic */ void zzk(zzgaz object, zzvo zzvo2) {
        zzmx zzmx2 = this.zzc;
        object = ((zzgaz)object).zzi();
        zzmx2.zzS((List)object, zzvo2);
    }

    public final void zzl(long l2) {
        zzlq zzlq2 = this.zzj;
        if (zzlq2 != null) {
            zzlq2.zzm(l2);
        }
    }

    public final boolean zzm(zzvm zzvm2) {
        Object object = this.zzj;
        return object != null && (object = ((zzlq)object).zza) == zzvm2;
    }

    public final boolean zzn(zzlq zzlq2) {
        zzeq.zzb(zzlq2);
        zzlq zzlq3 = this.zzj;
        int n3 = zzlq2.equals(zzlq3);
        boolean bl2 = false;
        if (n3 != 0) {
            return false;
        }
        this.zzj = zzlq2;
        while ((zzlq3 = zzlq2.zzg()) != null) {
            zzlq2 = zzlq2.zzg();
            zzlq2.getClass();
            zzlq3 = this.zzi;
            if (zzlq2 == zzlq3) {
                this.zzi = zzlq3 = this.zzh;
                n3 = 1;
                bl2 = true;
            }
            zzlq2.zzn();
            this.zzk = n3 = this.zzk + -1;
        }
        zzlq2 = this.zzj;
        zzlq2.getClass();
        zzlq2.zzo(null);
        this.zzy();
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean zzo() {
        Object object = this.zzj;
        boolean bl2 = true;
        if (object == null) return bl2;
        zzlr zzlr2 = ((zzlq)object).zzf;
        int n3 = zzlr2.zzi;
        if (n3 != 0) return false;
        boolean bl3 = ((zzlq)object).zzr();
        if (!bl3) return false;
        object = this.zzj.zzf;
        long l2 = ((zzlr)object).zze;
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 == false) return false;
        int n4 = this.zzk;
        n3 = 100;
        if (n4 >= n3) return false;
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean zzp(zzdc var1_1, long var2_2, long var4_3) {
        block11: {
            var6_4 = this;
            var7_5 = var1_1;
            var8_6 = this.zzh;
            var9_7 = null;
            while (true) {
                block12: {
                    var10_9 = true;
                    if (var8_6 == null) break block11;
                    var11_10 = var8_6.zzf;
                    if (var9_7 == null) {
                        var9_7 = var6_4.zzh((zzdc)var7_5, var11_10);
                        var12_11 = var2_2;
                    } else {
                        var12_11 = var2_2;
                        var14_12 = var6_4.zzt((zzdc)var7_5, (zzlq)var9_7, var2_2);
                        if (var14_12 == null) {
                            var15_23 = var6_4.zzn((zzlq)var9_7);
                            if (!var15_23) {
                                return var10_9;
                            }
                            return false;
                        }
                        var16_13 = var11_10.zzb;
                        var18_14 = var14_12.zzb;
                        cfr_temp_0 = var16_13 - var18_14;
                        var20_15 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                        if (var20_15 /* !! */  != false || !(var23_18 = (var21_16 = var11_10.zza).equals(var22_17 = var14_12.zza))) break;
                        var9_7 = var14_12;
                    }
                    var24_19 = var11_10.zzc;
                    var8_6.zzf = var14_12 = var9_7.zza(var24_19);
                    var24_19 = var11_10.zze;
                    var26_20 = -9223372036854775807L;
                    var28_21 = var24_19 == var26_20 ? 0 : (var24_19 < var26_20 ? -1 : 1);
                    var29_22 = var9_7.zze;
                    if (var28_21 == false || (var28_21 = var24_19 == var29_22 ? 0 : (var24_19 < var29_22 ? -1 : 1)) == false) break block12;
                    var8_6.zzq();
                    var12_11 = var9_7.zze;
                    var15_24 /* !! */  = var12_11 == var26_20 ? 0 : (var12_11 < var26_20 ? -1 : 1);
                    if (var15_24 /* !! */  == false) {
                        var12_11 = 0x7FFFFFFFFFFFFFFFL;
                    } else {
                        var24_19 = var8_6.zze();
                        var12_11 += var24_19;
                    }
                    var7_5 = var6_4.zzi;
                    if (var8_6 != var7_5) ** GOTO lbl-1000
                    var7_5 = var8_6.zzf;
                    var15_24 /* !! */  = (long)var7_5.zzf;
                    var24_19 = -9223372036854775808L;
                    cfr_temp_1 = var4_3 - var24_19;
                    var15_24 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                    if (var15_24 /* !! */  == false || (var15_24 /* !! */  = var4_3 == var12_11 ? 0 : (var4_3 < var12_11 ? -1 : 1)) >= 0) {
                        var15_24 /* !! */  = 1;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var15_24 /* !! */  = 0;
                        var7_5 = null;
                    }
                    var31_26 = var6_4.zzn(var8_6);
                    if (!var31_26 && var15_24 /* !! */  == false) {
                        return var10_9;
                    }
                    return false;
                }
                var32_8 = var8_6.zzg();
                var9_7 = var8_6;
                var8_6 = var32_8;
            }
            var15_25 = var6_4.zzn((zzlq)var9_7);
            if (!var15_25) {
                return var10_9;
            }
            return false;
        }
        return var10_9;
    }

    public final boolean zzq(zzdc zzdc2, int n3) {
        this.zzf = n3;
        return this.zzB(zzdc2);
    }

    public final boolean zzr(zzdc zzdc2, boolean bl2) {
        this.zzg = bl2;
        return this.zzB(zzdc2);
    }
}

