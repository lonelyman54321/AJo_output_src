/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  android.util.SparseBooleanArray
 *  android.util.SparseIntArray
 */
package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.gms.internal.ads.zzade;
import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaes;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzalt;
import com.google.android.gms.internal.ads.zzanz;
import com.google.android.gms.internal.ads.zzapb;
import com.google.android.gms.internal.ads.zzapc;
import com.google.android.gms.internal.ads.zzapf;
import com.google.android.gms.internal.ads.zzapg;
import com.google.android.gms.internal.ads.zzaph;
import com.google.android.gms.internal.ads.zzapi;
import com.google.android.gms.internal.ads.zzapn;
import com.google.android.gms.internal.ads.zzapp;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgb;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.Collections;
import java.util.List;

public final class zzapk
implements zzadu {
    public static final zzaea zza;
    private final List zzb;
    private final zzfu zzc;
    private final SparseIntArray zzd;
    private final zzapn zze;
    private final zzalt zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzapg zzj;
    private zzapf zzk;
    private zzadx zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    static {
        zzaph zzaph2 = new zzaph();
        zza = zzaph2;
    }

    public zzapk() {
        zzalt zzalt2 = zzalt.zza;
        zzgb zzgb2 = new zzgb(0L);
        zzanz zzanz2 = new zzanz(0);
        this(1, 1, zzalt2, zzgb2, zzanz2, 112800);
    }

    public zzapk(int n3, int n4, zzalt zzalt2, zzgb object, zzapn zzapn2, int n7) {
        this.zze = zzapn2;
        this.zzf = zzalt2;
        Object object2 = Collections.singletonList(object);
        this.zzb = object2;
        Object object3 = new byte[9400];
        zzalt2 = null;
        this.zzc = object2 = new zzfu((byte[])object3, 0);
        object2 = new SparseBooleanArray();
        this.zzh = object2;
        object3 = new SparseBooleanArray;
        this.zzi = (SparseBooleanArray)object3;
        object3 = new SparseArray;
        super();
        this.zzg = (SparseArray)object3;
        super();
        this.zzd = object;
        int n8 = 112800;
        this.zzj = object = new zzapg(n8);
        this.zzl = object = zzadx.zza;
        this.zzr = -1;
        object2.clear();
        object3.clear();
        object2 = new SparseArray();
        n4 = object2.size();
        object = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            zzapn2 = this.zzg;
            n7 = object2.keyAt(i3);
            zzapp zzapp2 = (zzapp)object2.valueAt(i3);
            zzapn2.put(n7, zzapp2);
        }
        object2 = this.zzg;
        object3 = new zzapc;
        object = new zzapi(this);
        super((zzapb)object);
        object2.put(0, object3);
    }

    public static /* bridge */ /* synthetic */ int zza(zzapk zzapk2) {
        return zzapk2.zzm;
    }

    public static /* bridge */ /* synthetic */ SparseArray zzg(zzapk zzapk2) {
        return zzapk2.zzg;
    }

    public static /* bridge */ /* synthetic */ SparseBooleanArray zzh(zzapk zzapk2) {
        return zzapk2.zzh;
    }

    public static /* bridge */ /* synthetic */ SparseBooleanArray zzi(zzapk zzapk2) {
        return zzapk2.zzi;
    }

    public static /* bridge */ /* synthetic */ zzadx zzj(zzapk zzapk2) {
        return zzapk2.zzl;
    }

    public static /* bridge */ /* synthetic */ zzapn zzk(zzapk zzapk2) {
        return zzapk2.zze;
    }

    public static /* bridge */ /* synthetic */ List zzl(zzapk zzapk2) {
        return zzapk2.zzb;
    }

    public static /* bridge */ /* synthetic */ void zzm(zzapk zzapk2, int n3) {
        zzapk2.zzr = n3;
    }

    public static /* bridge */ /* synthetic */ void zzn(zzapk zzapk2, int n3) {
        zzapk2.zzm = n3;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzapk zzapk2, boolean bl2) {
        zzapk2.zzn = true;
    }

    public final int zzb(zzadv zzadv2, zzaeq zzaeq2) {
        int n3;
        zzapk zzapk2;
        block33: {
            long l2;
            long l3;
            int n4;
            int n7;
            long l4;
            block32: {
                SparseBooleanArray sparseBooleanArray;
                zzapp zzapp2;
                int n8;
                int n10;
                Object object;
                int n14;
                zzapf zzapf2;
                Object object2;
                int n15;
                Object object3;
                zzapk2 = this;
                Object object4 = zzadv2;
                Object object5 = zzaeq2;
                l4 = zzadv2.zzd();
                Object object6 = this.zzn;
                long l7 = -1;
                boolean bl2 = true;
                int n16 = 0;
                if (object6 != 0) {
                    long l8;
                    object6 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
                    if (object6 != 0 && (n7 = ((zzapg)(object3 = this.zzj)).zzd()) == 0) {
                        n7 = this.zzr;
                        return ((zzapg)object3).zza(zzadv2, zzaeq2, n7);
                    }
                    object6 = zzapk2.zzo;
                    long l12 = 0L;
                    if (object6 == 0) {
                        long l14;
                        zzapk2.zzo = bl2;
                        object3 = zzapk2.zzj;
                        l8 = ((zzapg)object3).zzb();
                        long l15 = l8 - (l14 = -9223372036854775807L);
                        n15 = (int)(l15 == 0L ? 0 : (l15 < 0L ? -1 : 1));
                        if (n15 != 0) {
                            object2 = ((zzapg)object3).zzc();
                            long l16 = ((zzapg)object3).zzb();
                            object6 = zzapk2.zzr;
                            int n17 = 112800;
                            object3 = zzapf2;
                            l7 = l12;
                            l12 = l4;
                            n14 = object6;
                            n16 = n17;
                            zzapk2.zzk = zzapf2 = new zzapf((zzgb)object2, l16, l4, (int)object6, n17);
                            object3 = zzapk2.zzl;
                            object2 = zzapf2.zzb();
                            object3.zzO((zzaet)object2);
                        } else {
                            l7 = l12;
                            object2 = zzapk2.zzl;
                            long l17 = ((zzapg)object3).zzb();
                            object = new zzaes(l17, l12);
                            object2.zzO((zzaet)object);
                        }
                    } else {
                        l7 = l12;
                    }
                    object6 = zzapk2.zzp;
                    if (object6 != 0) {
                        object6 = 0;
                        object3 = null;
                        zzapk2.zzp = false;
                        zzapk2.zze(l7, l7);
                        l8 = zzadv2.zzf();
                        n15 = (int)(l8 == l7 ? 0 : (l8 < l7 ? -1 : 1));
                        if (n15 != 0) {
                            ((zzaeq)object5).zza = l7;
                            return 1;
                        }
                    } else {
                        object6 = 0;
                        object3 = null;
                    }
                    object2 = zzapk2.zzk;
                    if (object2 != null && (n3 = (int)(((zzade)object2).zze() ? 1 : 0)) != 0) {
                        return ((zzade)object2).zza((zzadv)object4, (zzaeq)object5);
                    }
                } else {
                    object6 = 0;
                    object3 = null;
                }
                object5 = zzapk2.zzc;
                object2 = ((zzfu)object5).zzM();
                n3 = ((zzfu)object5).zzd();
                n15 = 188;
                if ((n3 = 9400 - n3) < n15) {
                    n3 = ((zzfu)object5).zzb();
                    if (n3 > 0) {
                        n10 = ((zzfu)object5).zzd();
                        System.arraycopy(object2, n10, object2, 0, n3);
                    }
                    object5 = zzapk2.zzc;
                    ((zzfu)object5).zzI((byte[])object2, n3);
                }
                while (true) {
                    object5 = zzapk2.zzc;
                    n3 = ((zzfu)object5).zzb();
                    n8 = -1;
                    if (n3 >= n15) break;
                    n10 = ((zzfu)object5).zze();
                    n3 = 9400 - n10;
                    if ((n3 = object4.zza((byte[])object2, n10, n3)) == n8) {
                        return n8;
                    }
                    zzfu zzfu2 = zzapk2.zzc;
                    zzfu2.zzJ(n10 += n3);
                }
                n4 = ((zzfu)object5).zzd();
                n7 = ((zzfu)object5).zze();
                object5 = ((zzfu)object5).zzM();
                n10 = zzapq.zza((byte[])object5, n4, n7);
                object = zzapk2.zzc;
                ((zzfu)object).zzK(n10);
                n3 = n10 + 188;
                if (n3 > n7) {
                    n7 = zzapk2.zzq;
                    zzapk2.zzq = n10 = n10 - n4 + n7;
                } else {
                    zzapk2.zzq = 0;
                }
                object4 = zzapk2.zzc;
                n10 = ((zzfu)object4).zze();
                if (n3 > n10) {
                    return 0;
                }
                n4 = ((zzfu)object4).zzg();
                n7 = 0x800000 & n4;
                if (n7 != 0) {
                    zzapk2.zzc.zzK(n3);
                    return 0;
                }
                n7 = 0x400000 & n4;
                n16 = n7 != 0 ? 1 : 0;
                n7 = n4 >> 8;
                n15 = n4 & 0x20;
                int n18 = n4 & 0x10;
                n7 &= 0x1FFF;
                if (n18 != 0) {
                    zzapp2 = (zzapp)zzapk2.zzg.get(n7);
                } else {
                    n18 = 0;
                    zzapp2 = null;
                }
                if (zzapp2 == null) {
                    zzapk2.zzc.zzK(n3);
                    return 0;
                }
                zzapf2 = zzapk2.zzd;
                int n19 = (n4 &= 0xF) + -1;
                n14 = zzapf2.get(n7, n19);
                SparseIntArray sparseIntArray = zzapk2.zzd;
                sparseIntArray.put(n7, n4);
                if (n14 == n4) {
                    zzapk2.zzc.zzK(n3);
                    return 0;
                }
                n19 = 1;
                if (n4 != (n14 = n14 + n19 & 0xF)) {
                    zzapp2.zzc();
                }
                if (n15 != 0) {
                    object4 = zzapk2.zzc;
                    n15 = ((zzfu)object4).zzm();
                    n4 = ((zzfu)object4).zzm() & 0x40;
                    if (n4 != 0) {
                        n4 = 2;
                    } else {
                        n4 = 0;
                        object4 = null;
                    }
                    n16 |= n4;
                    object4 = zzapk2.zzc;
                    ((zzfu)object4).zzL(n15 += n8);
                }
                if ((n4 = (int)(zzapk2.zzn ? 1 : 0)) == 0 && (n7 = (int)((sparseBooleanArray = zzapk2.zzi).get(n7, false) ? 1 : 0)) != 0) break block32;
                zzapk2.zzc.zzJ(n3);
                object2 = zzapk2.zzc;
                zzapp2.zza((zzfu)object2, n16);
                object2 = zzapk2.zzc;
                ((zzfu)object2).zzJ(n10);
                if (n4 != 0) break block33;
            }
            if ((n4 = (int)(zzapk2.zzn ? 1 : 0)) != 0 && (n7 = (int)((l3 = l4 - (l2 = (long)-1)) == 0L ? 0 : (l3 < 0L ? -1 : 1))) != 0) {
                n4 = 1;
                zzapk2.zzp = n4;
            }
        }
        zzapk2.zzc.zzK(n3);
        return 0;
    }

    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    public final void zzd(zzadx zzadx2) {
        this.zzl = zzadx2;
    }

    public final void zze(long l2, long l3) {
        Object object;
        int n3;
        long l4;
        Object object2 = this.zzb;
        int n4 = object2.size();
        int n7 = 0;
        while (true) {
            long l7;
            long l8;
            long l12;
            long l14;
            l4 = 0L;
            if (n7 >= n4) break;
            zzgb zzgb2 = (zzgb)this.zzb.get(n7);
            long l15 = zzgb2.zzf();
            long l16 = l15 - (l14 = -9223372036854775807L);
            Object object3 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
            if (object3 == false || (object3 = (l12 = (l15 = zzgb2.zzd()) - l14) == 0L ? 0 : (l12 < 0L ? -1 : 1)) != false && (l8 = l15 == l4 ? 0 : (l15 < l4 ? -1 : 1)) != false && (l7 = l15 == l3 ? 0 : (l15 < l3 ? -1 : 1)) != false) {
                zzgb2.zzi(l3);
            }
            ++n7;
        }
        n4 = (int)(l3 == l4 ? 0 : (l3 < l4 ? -1 : 1));
        if (n4 != 0 && (object2 = this.zzk) != null) {
            ((zzade)object2).zzd(l3);
        }
        this.zzc.zzH(0);
        this.zzd.clear();
        object2 = null;
        for (n4 = 0; n4 < (n3 = (object = this.zzg).size()); ++n4) {
            object = (zzapp)this.zzg.valueAt(n4);
            object.zzc();
        }
        this.zzq = 0;
    }

    public final boolean zzf(zzadv zzadv2) {
        int n3;
        byte[] byArray = this.zzc.zzM();
        zzadv2 = (zzadi)zzadv2;
        ((zzadi)zzadv2).zzm(byArray, 0, 940, false);
        block0: for (int i3 = 0; i3 < (n3 = 188); ++i3) {
            int n4;
            for (n3 = 0; n3 < (n4 = 5); ++n3) {
                n4 = n3 * 188 + i3;
                int n7 = 71;
                if ((n4 = byArray[n4]) == n7) continue;
                continue block0;
            }
            ((zzadi)zzadv2).zzo(i3, false);
            return true;
        }
        return false;
    }
}

