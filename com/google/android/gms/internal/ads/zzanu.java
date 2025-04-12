/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaes;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzant;
import com.google.android.gms.internal.ads.zzanv;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.List;

public final class zzanu
implements zzadu {
    public static final zzaea zza;
    private final zzanv zzb;
    private final zzfu zzc;
    private boolean zzd;

    static {
        zzant zzant2 = new zzant();
        zza = zzant2;
    }

    public zzanu() {
        Object object = new zzanv(null, 0);
        this.zzb = object;
        this.zzc = object = new zzfu(16384);
    }

    public final int zzb(zzadv object, zzaeq object2) {
        int n3;
        int n4;
        object2 = this.zzc.zzM();
        int n7 = object.zza((byte[])object2, 0, n4 = 16384);
        if (n7 == (n3 = -1)) {
            return n3;
        }
        this.zzc.zzK(0);
        object2 = this.zzc;
        ((zzfu)object2).zzJ(n7);
        n7 = (int)(this.zzd ? 1 : 0);
        if (n7 == 0) {
            object = this.zzb;
            long l2 = 0L;
            n3 = 4;
            ((zzanv)object).zzd(l2, n3);
            n7 = 1;
            this.zzd = n7;
        }
        object = this.zzb;
        object2 = this.zzc;
        ((zzanv)object).zza((zzfu)object2);
        return 0;
    }

    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    public final void zzd(zzadx zzadx2) {
        Object object = new zzapo(-1 << -1, 0, 1);
        this.zzb.zzb(zzadx2, (zzapo)object);
        zzadx2.zzD();
        object = new zzaes(-9223372036854775807L, 0L);
        zzadx2.zzO((zzaet)object);
    }

    public final void zze(long l2, long l3) {
        this.zzd = false;
        this.zzb.zze();
    }

    public final boolean zzf(zzadv zzadv2) {
        int n3 = 10;
        zzfu zzfu2 = new zzfu(n3);
        int n4 = 0;
        while (true) {
            Object object = zzfu2.zzM();
            zzadv zzadv3 = zzadv2;
            zzadv3 = (zzadi)zzadv2;
            ((zzadi)zzadv3).zzm((byte[])object, 0, n3, false);
            zzfu2.zzK(0);
            int n7 = zzfu2.zzo();
            int n8 = 0x494433;
            int n10 = 3;
            if (n7 != n8) {
                zzadv2.zzj();
                object = zzadv2;
                object = (zzadi)zzadv2;
                ((zzadi)object).zzl(n4, false);
                int n14 = n4;
                block1: while (true) {
                    n3 = 0;
                    while (true) {
                        byte[] byArray = zzfu2.zzM();
                        int n15 = 7;
                        ((zzadi)object).zzm(byArray, 0, n15, false);
                        zzfu2.zzK(0);
                        n8 = zzfu2.zzq();
                        int n16 = 44096;
                        int n17 = 44097;
                        if (n8 != n16 && n8 != n17) {
                            zzadv2.zzj();
                            n3 = ++n14 - n4;
                            n8 = 8192;
                            if (n3 < n8) {
                                ((zzadi)object).zzl(n14, false);
                                continue block1;
                            }
                            return false;
                        }
                        n16 = 1;
                        int n18 = 4;
                        if ((n3 += n16) >= n18) {
                            return n16 != 0;
                        }
                        byte[] byArray2 = zzfu2.zzM();
                        int n19 = byArray2.length;
                        int n20 = -1;
                        if (n19 < n15) {
                            n19 = -1;
                        } else {
                            n19 = byArray2[2] & 0xFF;
                            int n21 = byArray2[n10];
                            n19 <<= 8;
                            n21 &= 0xFF;
                            if ((n19 |= n21) == (n21 = (int)((char)-1))) {
                                n18 = byArray2[n18] & 0xFF;
                                n19 = byArray2[5] & 0xFF;
                                n18 <<= 16;
                                n21 = 6;
                                n16 = byArray2[n21] & 0xFF;
                                n19 = (n18 |= (n19 <<= 8)) | n16;
                            } else {
                                n15 = 4;
                            }
                            if (n8 == n17) {
                                n15 += 2;
                            }
                            n19 += n15;
                        }
                        if (n19 == n20) {
                            return false;
                        }
                        ((zzadi)object).zzl(n19 += -7, false);
                    }
                    break;
                }
            }
            zzfu2.zzL(n10);
            n7 = zzfu2.zzl();
            n8 = n7 + 10;
            n4 += n8;
            ((zzadi)zzadv3).zzl(n7, false);
        }
    }
}

