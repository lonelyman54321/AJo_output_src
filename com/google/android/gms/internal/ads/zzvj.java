/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzcz;
import com.google.android.gms.internal.ads.zzdb;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzvg;
import com.google.android.gms.internal.ads.zzvh;
import com.google.android.gms.internal.ads.zzvm;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzvq;
import com.google.android.gms.internal.ads.zzxo;
import com.google.android.gms.internal.ads.zzxt;
import com.google.android.gms.internal.ads.zzzv;

public final class zzvj
extends zzxt {
    private final boolean zzb;
    private final zzdb zzc;
    private final zzcz zzd;
    private zzvh zze;
    private zzvg zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzvj(zzvq object, boolean bl2) {
        super((zzvq)object);
        Object object2;
        if (bl2) {
            object.zzv();
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        this.zzb = bl2;
        object2 = new zzdb();
        this.zzc = object2;
        this.zzd = object2 = new zzcz();
        object.zzM();
        this.zze = object = zzvh.zzq(object.zzJ());
    }

    private final Object zzK(Object object) {
        boolean bl2;
        Object object2 = zzvh.zzs(this.zze);
        if (object2 != null && (bl2 = object.equals(object2 = zzvh.zzd))) {
            object = zzvh.zzs(this.zze);
        }
        return object;
    }

    private final void zzL(long l2) {
        long l3;
        int n3;
        zzvg zzvg2 = this.zzf;
        zzvh zzvh2 = this.zze;
        Object object = zzvg2.zza.zza;
        int n4 = zzvh2.zza(object);
        if (n4 == (n3 = -1)) {
            return;
        }
        object = this.zze;
        zzcz zzcz2 = this.zzd;
        ((zzvh)object).zzd(n4, zzcz2, false);
        long l4 = zzcz2.zze;
        long l7 = -9223372036854775807L;
        long l8 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (l8 != false && (l3 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1)) >= 0) {
            l2 = Math.max(0L, l4 += (long)-1);
        }
        zzvg2.zzs(l2);
    }

    public final zzdc zzC() {
        return this.zze;
    }

    public final zzvo zzD(zzvo zzvo2) {
        boolean bl2;
        Object object = zzvh.zzs(this.zze);
        Object object2 = zzvo2.zza;
        if (object != null && (bl2 = (object = zzvh.zzs(this.zze)).equals(object2))) {
            object2 = zzvh.zzd;
        }
        return zzvo2.zza(object2);
    }

    /*
     * Unable to fully structure code
     */
    public final void zzE(zzdc var1_1) {
        block10: {
            block11: {
                block9: {
                    var2_2 = this.zzh;
                    var3_3 = null;
                    if (!var2_2) break block9;
                    var4_4 = this.zze;
                    var1_1 = var4_4.zzp((zzdc)var1_1);
                    this.zze = var1_1;
                    var1_1 = this.zzf;
                    if (var1_1 != null) {
                        var5_8 = var1_1.zzn();
                        this.zzL(var5_8);
                    }
                    break block10;
                }
                var2_2 = var1_1.zzo();
                if (!var2_2) break block11;
                var2_2 = this.zzi;
                if (var2_2) {
                    var4_5 = this.zze;
                    var1_1 = var4_5.zzp((zzdc)var1_1);
                } else {
                    var4_6 = zzdb.zza;
                    var7_9 = zzvh.zzd;
                    var1_1 = zzvh.zzr((zzdc)var1_1, var4_6, var7_9);
                }
                this.zze = var1_1;
                break block10;
            }
            var4_7 = this.zzc;
            var8_11 = false;
            var7_10 = null;
            var9_12 = 0L;
            var1_1.zze(0, (zzdb)var4_7, var9_12);
            var4_7 = this.zzc.zzc;
            var11_13 = this.zzf;
            if (var11_13 == null) ** GOTO lbl-1000
            var12_14 = var11_13.zzq();
            var14_15 = this.zze;
            var15_16 = this.zzd;
            var11_13 = var11_13.zza.zza;
            var14_15.zzn(var11_13, (zzcz)var15_16);
            var11_13 = this.zze;
            var14_15 = this.zzc;
            var11_13.zze(0, (zzdb)var14_15, var9_12);
            var8_11 = var12_14 == var9_12 ? 0 : (var12_14 < var9_12 ? -1 : 1);
            if (var8_11) {
                var16_17 = var12_14;
            } else lbl-1000:
            // 2 sources

            {
                var16_17 = var9_12;
            }
            var15_16 = this.zzc;
            var18_18 = this.zzd;
            var14_15 = var1_1;
            var7_10 = var1_1.zzl((zzdb)var15_16, var18_18, 0, var16_17);
            var19_19 = var7_10.first;
            var7_10 = (Long)var7_10.second;
            var20_20 = var7_10.longValue();
            var8_11 = this.zzi;
            if (var8_11) {
                var4_7 = this.zze;
                var1_1 = var4_7.zzp((zzdc)var1_1);
            } else {
                var1_1 = zzvh.zzr((zzdc)var1_1, var4_7, var19_19);
            }
            this.zze = var1_1;
            var1_1 = this.zzf;
            if (var1_1 != null) {
                this.zzL(var20_20);
                var1_1 = var1_1.zza;
                var4_7 = var1_1.zza;
                var4_7 = this.zzK(var4_7);
                var3_3 = var1_1.zza(var4_7);
            }
        }
        this.zzi = var22_21 = true;
        this.zzh = var22_21;
        var1_1 = this.zze;
        this.zzo((zzdc)var1_1);
        if (var3_3 != null) {
            var1_1 = this.zzf;
            var1_1.getClass();
            var1_1.zzr(var3_3);
        }
    }

    public final void zzF() {
        boolean bl2 = this.zzb;
        if (!bl2) {
            this.zzg = true;
            bl2 = false;
            zzvq zzvq2 = this.zza;
            this.zzB(null, zzvq2);
        }
    }

    public final void zzG(zzvm zzvm2) {
        zzvm zzvm3 = zzvm2;
        ((zzvg)zzvm2).zzt();
        zzvm3 = this.zzf;
        if (zzvm2 == zzvm3) {
            zzvm2 = null;
            this.zzf = null;
        }
    }

    public final zzvg zzH(zzvo zzvo2, zzzv object, long l2) {
        zzvg zzvg2 = new zzvg(zzvo2, (zzzv)object, l2);
        object = this.zza;
        zzvg2.zzu((zzvq)object);
        boolean bl2 = this.zzh;
        if (bl2) {
            object = zzvo2.zza;
            object = this.zzK(object);
            zzvo2 = zzvo2.zza(object);
            zzvg2.zzr(zzvo2);
        } else {
            this.zzf = zzvg2;
            boolean bl3 = this.zzg;
            if (!bl3) {
                this.zzg = true;
                bl3 = false;
                zzvo2 = null;
                object = this.zza;
                this.zzB(null, (zzvq)object);
            }
        }
        return zzvg2;
    }

    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    public final void zzt(zzbu zzbu2) {
        boolean bl2 = this.zzi;
        if (bl2) {
            zzvh zzvh2 = this.zze;
            zzdc zzdc2 = this.zze.zzc;
            zzxo zzxo2 = new zzxo(zzdc2, zzbu2);
            this.zze = zzvh2 = zzvh2.zzp(zzxo2);
        } else {
            zzvh zzvh3;
            this.zze = zzvh3 = zzvh.zzq(zzbu2);
        }
        this.zza.zzt(zzbu2);
    }

    public final void zzz() {
    }
}

