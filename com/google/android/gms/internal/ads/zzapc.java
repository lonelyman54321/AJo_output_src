/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzapb;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzapp;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgb;
import com.google.android.gms.internal.ads.zzgd;

public final class zzapc
implements zzapp {
    private final zzapb zza;
    private final zzfu zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzapc(zzapb object) {
        this.zza = object;
        this.zzb = object = new zzfu(32);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zza(zzfu zzfu2, int n3) {
        int n4;
        block10: {
            block12: {
                int n7;
                int n8;
                int n10;
                block11: {
                    n4 = 1;
                    n10 = -1;
                    if ((n3 &= n4) != 0) {
                        n8 = zzfu2.zzm();
                        n7 = zzfu2.zzd() + n8;
                    } else {
                        n7 = -1;
                    }
                    n8 = (int)(this.zzf ? 1 : 0);
                    if (n8 == 0) break block11;
                    if (n3 == 0) break block12;
                    this.zzf = false;
                    zzfu2.zzK(n7);
                    this.zzd = 0;
                }
                while ((n3 = zzfu2.zzb()) > 0) {
                    Object object;
                    n3 = this.zzd;
                    n8 = 3;
                    if (n3 < n8) {
                        if (n3 == 0) {
                            n3 = zzfu2.zzm();
                            n7 = zzfu2.zzd() + n10;
                            zzfu2.zzK(n7);
                            n7 = 255;
                            if (n3 == n7) break block10;
                        }
                        n3 = zzfu2.zzb();
                        n7 = this.zzd;
                        n7 = 3 - n7;
                        n3 = Math.min(n3, n7);
                        byte[] byArray = this.zzb.zzM();
                        int n14 = this.zzd;
                        zzfu2.zzG(byArray, n14, n3);
                        this.zzd = n7 = this.zzd + n3;
                        if (n7 != n8) continue;
                        this.zzb.zzK(0);
                        this.zzb.zzJ(n8);
                        this.zzb.zzL(n4);
                        object = this.zzb;
                        n7 = ((zzfu)object).zzm();
                        n14 = n7 & 0x80;
                        n14 = n14 != 0 ? 1 : 0;
                        n3 = ((zzfu)object).zzm();
                        this.zze = n14;
                        n7 = (n7 & 0xF) << 8;
                        this.zzc = n3 = (n3 | n7) + n8;
                        object = this.zzb;
                        n3 = ((zzfu)object).zzc();
                        if (n3 >= (n8 = this.zzc)) continue;
                        object = this.zzb;
                        n3 = ((zzfu)object).zzc();
                        n3 += n3;
                        n3 = Math.max(n8, n3);
                        n8 = 4098;
                        n3 = Math.min(n8, n3);
                        zzfu zzfu3 = this.zzb;
                        zzfu3.zzE(n3);
                        continue;
                    }
                    n8 = zzfu2.zzb();
                    n7 = this.zzc - n3;
                    n3 = Math.min(n8, n7);
                    byte[] byArray = this.zzb.zzM();
                    n7 = this.zzd;
                    zzfu2.zzG(byArray, n7, n3);
                    this.zzd = n8 = this.zzd + n3;
                    n3 = this.zzc;
                    if (n8 != n3) continue;
                    n8 = (int)(this.zze ? 1 : 0);
                    if (n8 != 0) {
                        byte[] byArray2 = this.zzb.zzM();
                        n3 = zzgd.zze(byArray2, 0, n3, n10);
                        if (n3 != 0) break block10;
                        object = this.zzb;
                        n8 = this.zzc + -4;
                        ((zzfu)object).zzJ(n8);
                    } else {
                        zzfu zzfu4 = this.zzb;
                        zzfu4.zzJ(n3);
                    }
                    this.zzb.zzK(0);
                    object = this.zza;
                    zzfu zzfu5 = this.zzb;
                    object.zza(zzfu5);
                    this.zzd = 0;
                }
            }
            return;
        }
        this.zzf = n4;
    }

    public final void zzb(zzgb zzgb2, zzadx zzadx2, zzapo zzapo2) {
        this.zza.zzb(zzgb2, zzadx2, zzapo2);
        this.zzf = true;
    }

    public final void zzc() {
        this.zzf = true;
    }
}

