/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzacx;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzagf;
import com.google.android.gms.internal.ads.zzagg;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgr;
import java.util.List;

final class zzagh
extends zzagg {
    private final zzfu zzb;
    private final zzfu zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzagh(zzafa object) {
        super((zzafa)object);
        byte[] byArray = zzgr.zza;
        this.zzb = object = new zzfu(byArray);
        this.zzc = object = new zzfu(4);
    }

    public final boolean zza(zzfu object) {
        int n3 = ((zzfu)object).zzm();
        int n4 = n3 >> 4;
        int n7 = 7;
        if ((n3 &= 0xF) == n7) {
            this.zzg = n4;
            n3 = 5;
            return n4 != n3;
        }
        object = hj0_0.a(n3, "Video format not supported: ");
        zzagf zzagf2 = new zzagf((String)object);
        throw zzagf2;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean zzb(zzfu zzfu2, long l2) {
        block5: {
            int n3;
            int n4;
            int n7;
            byte[] byArray;
            int n8;
            long l3;
            Object object;
            zzagh zzagh2;
            block7: {
                void var6_12;
                block6: {
                    boolean bl2;
                    int bl4;
                    block4: {
                        zzagh2 = this;
                        object = zzfu2;
                        bl4 = zzfu2.zzm();
                        int n10 = zzfu2.zzh();
                        l3 = n10;
                        n8 = 1;
                        if (bl4) break block4;
                        boolean bl3 = this.zze;
                        if (!bl3) {
                            int n14;
                            Object object2 = new byte[zzfu2.zzb()];
                            Object object3 = new zzfu((byte[])object2);
                            object2 = ((zzfu)object3).zzM();
                            int n15 = zzfu2.zzb();
                            zzfu2.zzG((byte[])object2, 0, n15);
                            object = zzacx.zza((zzfu)object3);
                            this.zzd = n14 = ((zzacx)object).zzb;
                            object3 = new zzal();
                            ((zzal)object3).zzX("video/avc");
                            object2 = ((zzacx)object).zzk;
                            ((zzal)object3).zzz((String)object2);
                            n10 = ((zzacx)object).zzc;
                            ((zzal)object3).zzac(n10);
                            n10 = ((zzacx)object).zzd;
                            ((zzal)object3).zzI(n10);
                            float f5 = ((zzacx)object).zzj;
                            ((zzal)object3).zzT(f5);
                            object = ((zzacx)object).zza;
                            ((zzal)object3).zzL((List)object);
                            object = ((zzal)object3).zzad();
                            this.zza.zzl((zzan)object);
                            this.zze = n8;
                            return false;
                        }
                        break block5;
                    }
                    if (bl4 != n8 || !(bl2 = this.zze)) break block5;
                    int n16 = this.zzg;
                    if (n16 == n8) {
                        boolean bl5 = true;
                    } else {
                        boolean bl6 = false;
                        byArray = null;
                    }
                    n7 = zzagh2.zzf;
                    if (n7 != 0) break block6;
                    if (var6_12 == false) break block5;
                    n4 = 1;
                    break block7;
                }
                n4 = var6_12;
            }
            byArray = zzagh2.zzc.zzM();
            byArray[0] = 0;
            byArray[n8] = 0;
            byArray[2] = 0;
            int n17 = zzagh2.zzd;
            n7 = 4;
            int n18 = 4 - n17;
            int n19 = 0;
            while ((n3 = zzfu2.zzb()) > 0) {
                Object object4 = zzagh2.zzc.zzM();
                int n20 = zzagh2.zzd;
                ((zzfu)object).zzG((byte[])object4, n18, n20);
                zzagh2.zzc.zzK(0);
                object4 = zzagh2.zzc;
                Object object5 = zzagh2.zzb;
                n3 = ((zzfu)object4).zzp();
                ((zzfu)object5).zzK(0);
                object5 = zzagh2.zza;
                zzfu zzfu3 = zzagh2.zzb;
                object5.zzq(zzfu3, n7);
                n19 += 4;
                object5 = zzagh2.zza;
                object5.zzq((zzfu)object, n3);
                n19 += n3;
            }
            long l4 = l3 * 1000L + l2;
            zzagh2.zza.zzs(l4, n4, n19, 0, null);
            zzagh2.zzf = n8;
            return n8;
        }
        return false;
    }
}

