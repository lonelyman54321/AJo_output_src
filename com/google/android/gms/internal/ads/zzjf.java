/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcl;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzje;
import com.google.android.gms.internal.ads.zzjh;
import com.google.android.gms.internal.ads.zzlp;
import com.google.android.gms.internal.ads.zzmn;
import com.google.android.gms.internal.ads.zzmu;

final class zzjf
implements zzlp {
    private final zzmu zza;
    private final zzje zzb;
    private zzmn zzc;
    private zzlp zzd;
    private boolean zze;
    private boolean zzf;

    public zzjf(zzje object, zzer zzer2) {
        this.zzb = object;
        this.zza = object = new zzmu(zzer2);
        this.zze = true;
    }

    public final long zza() {
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final long zzb(boolean var1_1) {
        block8: {
            block7: {
                var2_2 = this.zzc;
                if (var2_2 == null || (var3_3 = var2_2.zzW()) != 0 || var1_1 && (var3_3 = (var2_2 = this.zzc).zzcU()) != (var4_4 = 2) || (var3_3 = (int)(var2_2 = this.zzc).zzX()) == 0 && (var1_1 || (var1_1 = (var5_5 = this.zzc).zzQ()))) break block7;
                var5_5 = this.zzd;
                var5_5.getClass();
                var6_6 = var5_5.zza();
                var8_7 = this.zze;
                if (!var8_7) ** GOTO lbl23
                var9_8 = this.zza;
                var10_9 = var9_8.zza();
                cfr_temp_0 = var6_6 - var10_9;
                var12_10 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                if (var12_10 /* !! */  < 0) {
                    var5_5 = this.zza;
                    var5_5.zze();
                } else {
                    var9_8 = null;
                    this.zze = false;
                    var8_7 = this.zzf;
                    if (var8_7) {
                        var9_8 = this.zza;
                        var9_8.zzd();
                    }
lbl23:
                    // 4 sources

                    var9_8 = this.zza;
                    var9_8.zzb(var6_6);
                    var5_5 = var5_5.zzc();
                    var2_2 = this.zza.zzc();
                    var3_3 = (int)var5_5.equals(var2_2);
                    if (var3_3 == 0) {
                        this.zza.zzg((zzcl)var5_5);
                        var2_2 = this.zzb;
                        var2_2.zza((zzcl)var5_5);
                    }
                }
                break block8;
            }
            this.zze = true;
            var1_1 = this.zzf;
            if (var1_1) {
                var5_5 = this.zza;
                var5_5.zzd();
            }
        }
        var1_1 = this.zze;
        if (var1_1) {
            var5_5 = this.zza;
            var6_6 = var5_5.zza();
        } else {
            var5_5 = this.zzd;
            var5_5.getClass();
            var6_6 = var5_5.zza();
        }
        return var6_6;
    }

    public final zzcl zzc() {
        Object object = this.zzd;
        object = object != null ? object.zzc() : this.zza.zzc();
        return object;
    }

    public final void zzd(zzmn zzmn2) {
        zzmn zzmn3 = this.zzc;
        if (zzmn2 == zzmn3) {
            boolean bl2;
            zzmn2 = null;
            this.zzd = null;
            this.zzc = null;
            this.zze = bl2 = true;
        }
    }

    public final void zze(zzmn object) {
        zzlp zzlp2;
        zzlp zzlp3 = object.zzk();
        if (zzlp3 != null && zzlp3 != (zzlp2 = this.zzd)) {
            if (zzlp2 == null) {
                this.zzd = zzlp3;
                this.zzc = object;
                object = this.zza.zzc();
                zzlp3.zzg((zzcl)object);
                return;
            }
            object = new IllegalStateException("Multiple renderer media clocks enabled.");
            throw zzjh.zzd((RuntimeException)object, 1000);
        }
    }

    public final void zzf(long l2) {
        this.zza.zzb(l2);
    }

    public final void zzg(zzcl zzcl2) {
        zzlp zzlp2 = this.zzd;
        if (zzlp2 != null) {
            zzlp2.zzg(zzcl2);
            zzcl2 = this.zzd.zzc();
        }
        this.zza.zzg(zzcl2);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }

    public final boolean zzj() {
        boolean bl2 = this.zze;
        if (bl2) {
            return false;
        }
        zzlp zzlp2 = this.zzd;
        zzlp2.getClass();
        return zzlp2.zzj();
    }
}

