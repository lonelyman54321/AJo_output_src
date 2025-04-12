/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzade;
import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaes;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzans;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzaoe;
import com.google.android.gms.internal.ads.zzaoq;
import com.google.android.gms.internal.ads.zzaow;
import com.google.android.gms.internal.ads.zzaox;
import com.google.android.gms.internal.ads.zzaoy;
import com.google.android.gms.internal.ads.zzaoz;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgb;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.List;

public final class zzapa
implements zzadu {
    public static final zzaea zza;
    private final zzgb zzb;
    private final SparseArray zzc;
    private final zzfu zzd;
    private final zzaox zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private zzaow zzj;
    private zzadx zzk;
    private boolean zzl;

    static {
        zzaoy zzaoy2 = new zzaoy();
        zza = zzaoy2;
    }

    public zzapa() {
        Object object = new zzgb(0L);
        this.zzb = object;
        this.zzd = object = new zzfu(4096);
        object = new SparseArray();
        this.zzc = object;
        this.zze = object = new zzaox();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int zzb(zzadv zzadv2, zzaeq zzaeq2) {
        Object object;
        int n3;
        int n4;
        int n7;
        Object object2;
        Object object3;
        Object object4;
        zzapa zzapa2;
        block20: {
            long l2;
            long l3;
            long l4;
            long l7;
            block21: {
                Object object5;
                block25: {
                    block23: {
                        int n8;
                        Object object6;
                        block24: {
                            block22: {
                                boolean bl2;
                                zzaes zzaes2;
                                Object object7;
                                long l8;
                                Object object8;
                                zzapa2 = this;
                                object4 = zzadv2;
                                object3 = zzaeq2;
                                object2 = this.zzk;
                                zzeq.zzb(object2);
                                long l12 = zzadv2.zzd();
                                long l14 = -1;
                                object6 = l12 == l14 ? 0 : (l12 < l14 ? -1 : 1);
                                if (object6 != false) {
                                    object8 = this.zze;
                                    n7 = ((zzaox)object8).zze();
                                    if (n7 == 0) return ((zzaox)object8).zza(zzadv2, zzaeq2);
                                }
                                n8 = zzapa2.zzl;
                                boolean bl3 = true;
                                if (n8 == 0) {
                                    long l15;
                                    zzapa2.zzl = bl3;
                                    object8 = zzapa2.zze;
                                    l8 = ((zzaox)object8).zzb();
                                    long l16 = l8 - (l15 = -9223372036854775807L);
                                    Object object9 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                                    if (object9 != false) {
                                        zzaow zzaow2;
                                        object7 = ((zzaox)object8).zzd();
                                        long l17 = ((zzaox)object8).zzb();
                                        object8 = zzaow2;
                                        zzapa2.zzj = zzaow2 = new zzaow((zzgb)object7, l17, l12);
                                        object8 = zzapa2.zzk;
                                        object7 = zzaow2.zzb();
                                        object8.zzO((zzaet)object7);
                                    } else {
                                        object7 = zzapa2.zzk;
                                        l15 = ((zzaox)object8).zzb();
                                        long l18 = 0L;
                                        zzaes2 = new zzaes(l15, l18);
                                        object7.zzO(zzaes2);
                                    }
                                }
                                if ((object7 = zzapa2.zzj) != null) {
                                    bl2 = ((zzade)object7).zze();
                                    if (bl2) return ((zzade)object7).zza((zzadv)object4, (zzaeq)object3);
                                }
                                zzadv2.zzj();
                                if (object6 != false) {
                                    l7 = zzadv2.zze();
                                    l12 -= l7;
                                } else {
                                    l12 = l14;
                                }
                                n4 = -1;
                                object6 = l12 == l14 ? 0 : (l12 < l14 ? -1 : 1);
                                if (object6 != false) {
                                    l8 = 4;
                                    long l19 = l12 - l8;
                                    object6 = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
                                    if (object6 < 0) return n4;
                                }
                                object2 = zzapa2.zzd.zzM();
                                n7 = 4;
                                bl2 = false;
                                zzaes2 = null;
                                n8 = 1;
                                object6 = object4.zzm((byte[])object2, 0, n7, n8 != 0);
                                if (object6 == false) {
                                    return n4;
                                }
                                zzapa2.zzd.zzK(0);
                                object2 = zzapa2.zzd;
                                object6 = ((zzfu)object2).zzg();
                                n7 = 441;
                                if (object6 == n7) {
                                    return n4;
                                }
                                n4 = 442;
                                if (object6 == n4) {
                                    object3 = zzapa2.zzd.zzM();
                                    object4 = (zzadi)object4;
                                    ((zzadi)object4).zzm((byte[])object3, 0, 10, false);
                                    zzapa2.zzd.zzK(9);
                                    n4 = (zzapa2.zzd.zzm() & 7) + 14;
                                    ((zzadi)object4).zzo(n4, false);
                                    return 0;
                                }
                                n4 = 443;
                                n7 = 2;
                                n3 = 6;
                                if (object6 == n4) {
                                    object3 = zzapa2.zzd.zzM();
                                    object4 = (zzadi)object4;
                                    ((zzadi)object4).zzm((byte[])object3, 0, n7, false);
                                    zzapa2.zzd.zzK(0);
                                    n4 = zzapa2.zzd.zzq() + n3;
                                    ((zzadi)object4).zzo(n4, false);
                                    return 0;
                                }
                                n4 = (int)(object6 >> 8);
                                n8 = 1;
                                if (n4 != n8) {
                                    ((zzadi)object4).zzo(n8, false);
                                    return 0;
                                }
                                n4 = object6 & 0xFF;
                                object = (zzaoz)zzapa2.zzc.get(n4);
                                boolean bl4 = zzapa2.zzf;
                                if (bl4) break block20;
                                if (object != null) break block21;
                                int n10 = 189;
                                object5 = null;
                                if (n4 != n10) break block22;
                                object2 = new zzans(null, 0);
                                n8 = 1;
                                zzapa2.zzg = n8;
                                zzapa2.zzi = l4 = zzadv2.zzf();
                                break block23;
                            }
                            n8 = 1;
                            int n14 = object6 & 0xE0;
                            l3 = 192;
                            if (n14 != l3) break block24;
                            object2 = new zzaoq(null, 0);
                            zzapa2.zzg = n8;
                            zzapa2.zzi = l4 = zzadv2.zzf();
                            break block23;
                        }
                        int n15 = 224;
                        if ((object6 = (Object)(object6 & 0xF0)) != n15) break block25;
                        object2 = new zzaoe(null);
                        zzapa2.zzh = n8;
                        zzapa2.zzi = l4 = zzadv2.zzf();
                    }
                    object5 = object2;
                }
                if (object5 != null) {
                    int n16 = -1 << -1;
                    int n17 = 256;
                    object2 = new zzapo(n16, n4, n17);
                    object = zzapa2.zzk;
                    object5.zzb((zzadx)object, (zzapo)object2);
                    object2 = zzapa2.zzb;
                    object = new zzaoz((zzaoc)object5, (zzgb)object2);
                    object2 = zzapa2.zzc;
                    object2.put(n4, object);
                }
            }
            n4 = (int)(zzapa2.zzg ? 1 : 0);
            l4 = 0x100000L;
            if (n4 != 0 && (n4 = (int)(zzapa2.zzh ? 1 : 0)) != 0) {
                l7 = zzapa2.zzi;
                l4 = 8192L + l7;
            }
            if ((l3 = (l2 = (l7 = zzadv2.zzf()) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1)) > 0) {
                n4 = 1;
                zzapa2.zzf = n4;
                object3 = zzapa2.zzk;
                object3.zzD();
            }
        }
        object3 = zzapa2.zzd.zzM();
        object4 = (zzadi)object4;
        ((zzadi)object4).zzm((byte[])object3, 0, n7, false);
        zzapa2.zzd.zzK(0);
        object3 = zzapa2.zzd;
        n4 = ((zzfu)object3).zzq() + n3;
        if (object == null) {
            ((zzadi)object4).zzo(n4, false);
            return 0;
        }
        zzapa2.zzd.zzH(n4);
        object2 = zzapa2.zzd.zzM();
        ((zzadi)object4).zzn((byte[])object2, 0, n4, false);
        zzapa2.zzd.zzK(n3);
        object4 = zzapa2.zzd;
        ((zzaoz)object).zza((zzfu)object4);
        object4 = zzapa2.zzd;
        n4 = ((zzfu)object4).zzc();
        ((zzfu)object4).zzJ(n4);
        return 0;
    }

    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    public final void zzd(zzadx zzadx2) {
        this.zzk = zzadx2;
    }

    public final void zze(long l2, long l3) {
        int n3;
        long l4;
        long l7;
        long l8;
        Object object = this.zzb;
        long l12 = ((zzgb)object).zzf();
        long l14 = l12 - (l8 = -9223372036854775807L);
        Object object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object2 == false || (object2 = (l7 = (l12 = ((zzgb)object).zzd()) - l8) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false && (object2 = (l4 = l12 - (l8 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false && (object2 = l12 == l3 ? 0 : (l12 < l3 ? -1 : 1)) != false) {
            ((zzgb)object).zzi(l3);
        }
        object = this.zzj;
        object2 = 0;
        if (object != null) {
            ((zzade)object).zzd(l3);
        }
        while (object2 < (n3 = (object = this.zzc).size())) {
            object = (zzaoz)this.zzc.valueAt((int)object2);
            ((zzaoz)object).zzb();
            ++object2;
        }
    }

    public final boolean zzf(zzadv zzadv2) {
        int n3 = 14;
        byte[] byArray = new byte[n3];
        zzadv2 = (zzadi)zzadv2;
        ((zzadi)zzadv2).zzm(byArray, 0, n3, false);
        n3 = byArray[0] & 0xFF;
        int n4 = 1;
        int n7 = byArray[n4] & 0xFF;
        int n8 = 2;
        int n10 = byArray[n8] & 0xFF;
        int n14 = 3;
        int n15 = byArray[n14] & 0xFF;
        n3 <<= 24;
        n3 |= (n7 <<= 16);
        n7 = 8;
        n3 = n3 | (n10 <<= n7) | n15;
        n10 = 442;
        if (n3 != n10) {
            return false;
        }
        n3 = 4;
        n10 = byArray[n3] & 0xC4;
        n15 = 68;
        if (n10 != n15) {
            return false;
        }
        n10 = byArray[6] & n3;
        if (n10 != n3) {
            return false;
        }
        n10 = byArray[n7] & n3;
        if (n10 != n3) {
            return false;
        }
        n3 = byArray[9] & n4;
        if (n3 != n4) {
            return false;
        }
        n3 = byArray[12] & n14;
        if (n3 != n14) {
            return false;
        }
        n3 = byArray[13] & 7;
        ((zzadi)zzadv2).zzl(n3, false);
        ((zzadi)zzadv2).zzm(byArray, 0, n14, false);
        int n16 = (byArray[0] & 0xFF) << 16;
        n3 = (byArray[n4] & 0xFF) << n7;
        int n17 = byArray[n8] & 0xFF;
        n16 = n16 | n3 | n17;
        if (n16 == n4) {
            return n4 != 0;
        }
        return false;
    }
}

