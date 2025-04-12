/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadc;
import com.google.android.gms.internal.ads.zzadd;
import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzaou;
import com.google.android.gms.internal.ads.zzaow;
import com.google.android.gms.internal.ads.zzaox;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgb;
import com.google.android.gms.internal.ads.zzgd;

final class zzaov
implements zzadd {
    private final zzgb zza;
    private final zzfu zzb;

    public /* synthetic */ zzaov(zzgb object, zzaou zzaou2) {
        this.zza = object;
        this.zzb = object = new zzfu();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final zzadc zza(zzadv zzadv2, long l2) {
        zzaov zzaov2 = this;
        long l3 = zzadv2.zzf();
        long l4 = zzadv2.zzd() - l3;
        long l7 = 20000L;
        int n3 = (int)Math.min(l7, l4);
        this.zzb.zzH(n3);
        byte[] byArray = this.zzb.zzM();
        Object object = zzadv2;
        object = (zzadi)zzadv2;
        ((zzadi)object).zzm(byArray, 0, n3, false);
        l4 = -9223372036854775807L;
        int n4 = -1;
        long l8 = l4;
        int n7 = -1;
        while (true) {
            zzfu zzfu2;
            block12: {
                int n8;
                int n10;
                int n14;
                byte[] byArray2;
                int n15;
                int n16;
                block15: {
                    block10: {
                        block16: {
                            block14: {
                                block13: {
                                    block11: {
                                        if ((n16 = (zzfu2 = zzaov2.zzb).zzb()) < (n15 = 4)) break block10;
                                        byArray2 = zzfu2.zzM();
                                        n14 = zzfu2.zzd();
                                        n16 = zzaow.zzh(byArray2, n14);
                                        n14 = 1;
                                        n10 = 442;
                                        if (n16 != n10) {
                                            zzfu2.zzL(n14);
                                            continue;
                                        }
                                        zzfu2.zzL(n15);
                                        long l12 = zzaox.zzc(zzfu2);
                                        n4 = (int)(l12 == l4 ? 0 : (l12 < l4 ? -1 : 1));
                                        if (n4 != 0) {
                                            object = zzaov2.zza;
                                            long l14 = (l12 = ((zzgb)object).zzb(l12)) - l2;
                                            n4 = (int)(l14 == 0L ? 0 : (l14 < 0L ? -1 : 1));
                                            if (n4 > 0) {
                                                n4 = (int)(l8 == l4 ? 0 : (l8 < l4 ? -1 : 1));
                                                if (n4 == 0) {
                                                    return zzadc.zzd(l12, l3);
                                                }
                                                l4 = n7;
                                                return zzadc.zze(l3 += l4);
                                            }
                                            l7 = 100000L + l12;
                                            long l15 = l7 - l2;
                                            Object object2 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                                            if (object2 > 0) {
                                                int n17 = zzfu2.zzd();
                                                l4 = n17;
                                                return zzadc.zze(l3 += l4);
                                            }
                                            n7 = n4 = zzfu2.zzd();
                                            l8 = l12;
                                        }
                                        n4 = zzfu2.zze();
                                        n16 = zzfu2.zzb();
                                        if (n16 >= (n8 = 10)) break block11;
                                        zzfu2.zzK(n4);
                                        break block12;
                                    }
                                    zzfu2.zzL(9);
                                    n16 = zzfu2.zzm() & 7;
                                    n8 = zzfu2.zzb();
                                    if (n8 >= n16) break block13;
                                    zzfu2.zzK(n4);
                                    break block12;
                                }
                                zzfu2.zzL(n16);
                                n16 = zzfu2.zzb();
                                if (n16 >= n15) break block14;
                                zzfu2.zzK(n4);
                                break block12;
                            }
                            byArray2 = zzfu2.zzM();
                            n8 = zzfu2.zzd();
                            n16 = zzaow.zzh(byArray2, n8);
                            if (n16 != (n8 = 443)) break block15;
                            zzfu2.zzL(n15);
                            n16 = zzfu2.zzq();
                            n8 = zzfu2.zzb();
                            if (n8 >= n16) break block16;
                            zzfu2.zzK(n4);
                            break block12;
                        }
                        zzfu2.zzL(n16);
                        break block15;
                    }
                    n7 = (int)(l8 == l4 ? 0 : (l8 < l4 ? -1 : 1));
                    if (n7 == 0) return zzadc.zza;
                    l4 = n4;
                    return zzadc.zzf(l8, l3 += l4);
                }
                while ((n16 = zzfu2.zzb()) >= n15 && (n16 = zzaow.zzh(byArray2 = zzfu2.zzM(), n8 = zzfu2.zzd())) != n10 && n16 != (n8 = 441) && (n16 >>>= 8) == n14) {
                    zzfu2.zzL(n15);
                    n16 = zzfu2.zzb();
                    n8 = 2;
                    if (n16 < n8) {
                        zzfu2.zzK(n4);
                        break;
                    }
                    n16 = zzfu2.zzq();
                    n8 = zzfu2.zze();
                    int n18 = zzfu2.zzd() + n16;
                    n16 = Math.min(n8, n18);
                    zzfu2.zzK(n16);
                }
            }
            n4 = zzfu2.zzd();
        }
    }

    public final void zzb() {
        byte[] byArray = zzgd.zzf;
        int cfr_ignored_0 = byArray.length;
        this.zzb.zzI(byArray, 0);
    }
}

