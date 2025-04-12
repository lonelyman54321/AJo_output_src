/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzact;
import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaes;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzanq;
import com.google.android.gms.internal.ads.zzans;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.List;

public final class zzanr
implements zzadu {
    public static final zzaea zza;
    private final zzans zzb;
    private final zzfu zzc;
    private boolean zzd;

    static {
        zzanq zzanq2 = new zzanq();
        zza = zzanq2;
    }

    public zzanr() {
        Object object = new zzans(null, 0);
        this.zzb = object;
        this.zzc = object = new zzfu(2786);
    }

    public final int zzb(zzadv object, zzaeq object2) {
        int n3;
        int n4;
        object2 = this.zzc.zzM();
        int n7 = object.zza((byte[])object2, 0, n4 = 2786);
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
            ((zzans)object).zzd(l2, n3);
            n7 = 1;
            this.zzd = n7;
        }
        object = this.zzb;
        object2 = this.zzc;
        ((zzans)object).zza((zzfu)object2);
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
            if (n7 != n8) {
                zzadv2.zzj();
                object = zzadv2;
                object = (zzadi)zzadv2;
                ((zzadi)object).zzl(n4, false);
                int n10 = n4;
                block1: while (true) {
                    n3 = 0;
                    while (true) {
                        byte[] byArray = zzfu2.zzM();
                        ((zzadi)object).zzm(byArray, 0, 6, false);
                        zzfu2.zzK(0);
                        n8 = zzfu2.zzq();
                        int n14 = 2935;
                        if (n8 != n14) {
                            zzadv2.zzj();
                            n3 = ++n10 - n4;
                            n8 = 8192;
                            if (n3 < n8) {
                                ((zzadi)object).zzl(n10, false);
                                continue block1;
                            }
                            return false;
                        }
                        n8 = 1;
                        n14 = 4;
                        if ((n3 += n8) >= n14) {
                            return n8 != 0;
                        }
                        byArray = zzfu2.zzM();
                        n8 = zzact.zzb(byArray);
                        if (n8 == (n14 = -1)) {
                            return false;
                        }
                        ((zzadi)object).zzl(n8 += -6, false);
                    }
                    break;
                }
            }
            zzfu2.zzL(3);
            n7 = zzfu2.zzl();
            n8 = n7 + 10;
            n4 += n8;
            ((zzadi)zzadv3).zzl(n7, false);
        }
    }
}

