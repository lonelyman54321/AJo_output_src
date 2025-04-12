/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdzd;
import com.google.android.gms.internal.ads.zzehp;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzekn;
import com.google.android.gms.internal.ads.zzele;
import com.google.android.gms.internal.ads.zzelf;
import com.google.android.gms.internal.ads.zzelh;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfoa;
import com.google.android.gms.internal.ads.zzgfp;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

final class zzeld
implements zzgfp {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfgw zzb;
    final /* synthetic */ zzfgt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfoa zze;
    final /* synthetic */ zzfhf zzf;
    final /* synthetic */ zzelf zzg;

    public zzeld(zzelf zzelf2, long l2, zzfgw zzfgw2, zzfgt zzfgt2, String string2, zzfoa zzfoa2, zzfhf zzfhf2) {
        this.zza = l2;
        this.zzb = zzfgw2;
        this.zzc = zzfgt2;
        this.zzd = string2;
        this.zze = zzfoa2;
        this.zzf = zzfhf2;
        this.zzg = zzelf2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(Throwable var1_1) {
        block14: {
            block19: {
                block18: {
                    block17: {
                        var2_2 = this;
                        var3_3 = var1_1;
                        var4_5 = zzelf.zze(this.zzg);
                        var5_6 = var4_5.elapsedRealtime();
                        var7_7 = this.zza;
                        var5_6 -= var7_7;
                        var9_8 = var1_1 instanceof TimeoutException;
                        var10_9 = 3;
                        var11_10 = false;
                        var12_11 = null;
                        if (var9_8 != 0) {
                            var9_8 = 2;
lbl13:
                            // 3 sources

                            while (true) {
                                var13_12 = null;
                                break block14;
                                break;
                            }
                        }
                        var9_8 = var1_1 instanceof zzekn;
                        if (var9_8 == 0) break block17;
                        var13_12 = null;
                        var9_8 = 3;
                        break block14;
                    }
                    var9_8 = var1_1 instanceof CancellationException;
                    if (var9_8 == 0) break block18;
                    var9_8 = 4;
                    ** GOTO lbl13
                }
                var9_8 = var1_1 instanceof zzfhv;
                if (var9_8 != 0) {
                    var9_8 = 5;
                    ** continue;
                }
                var9_8 = var1_1 instanceof zzdzd;
                var14_13 = 6;
                var15_14 = 8.4E-45f;
                if (var9_8 == 0) break block19;
                var16_15 = zzfiq.zza(var1_1);
                var9_8 = var16_15.zza;
                if (var9_8 == var10_9) {
                    var14_13 = 1;
                    var15_14 = 1.4E-45f;
                }
                var16_15 = zzbep.zzbD;
                var17_16 = zzba.zzc();
                var16_15 = (Boolean)var17_16.zza((zzbeg)var16_15);
                var9_8 = (int)var16_15.booleanValue();
                if (var9_8 == 0 || (var9_8 = var3_3 instanceof zzehp) == 0) ** GOTO lbl-1000
                var16_15 = var3_3;
                var16_15 = ((zzehp)var3_3).zzb();
                if (var16_15 != null) {
                    var9_8 = var16_15.zza;
                    var13_12 = var16_15 = Integer.valueOf(var9_8);
                } else lbl-1000:
                // 2 sources

                {
                    var13_12 = null;
                }
                var9_8 = var14_13;
                break block14;
            }
            var13_12 = null;
            var9_8 = 6;
        }
        var18_17 = var2_2.zzg;
        synchronized (var18_17) {
            block16: {
                block15: {
                    try {
                        var19_18 = var2_2.zzg;
                        var20_19 = zzelf.zzn((zzelf)var19_18);
                        if (!var20_19) break block15;
                        var19_18 = zzelf.zzc((zzelf)var19_18);
                        var17_16 = var2_2.zzb;
                        var21_20 = var2_2.zzc;
                    }
                    catch (Throwable var3_4) {
                        break block16;
                    }
                    var22_21 = var3_3 instanceof zzehp;
                    if (var22_21) {
                        var12_11 = var3_3;
                        var12_11 = (zzehp)var3_3;
                    }
                    var23_22 = var12_11;
                    var12_11 = var19_18;
                    var19_18 = var17_16;
                    var17_16 = var21_20;
                    var12_11.zza((zzfgw)var19_18, var21_20, var9_8, (zzehp)var23_22, var5_6);
                }
                var12_11 = zzbep.zziu;
                var19_18 = zzba.zzc();
                var12_11 = var19_18.zza((zzbeg)var12_11);
                var11_10 = (var12_11 = (Boolean)var12_11).booleanValue();
                if (var11_10) {
                    var12_11 = var2_2.zzg;
                    var12_11 = zzelf.zzd((zzelf)var12_11);
                    var19_18 = var2_2.zze;
                    var17_16 = var2_2.zzf;
                    var21_20 = var2_2.zzc;
                    var23_22 = var21_20.zzo;
                    var19_18 = var19_18.zzc((zzfhf)var17_16, var21_20, (List)var23_22);
                    var12_11.zzd((List)var19_18);
                }
                if ((var14_13 = (int)zzelf.zzo((zzelf)(var12_11 = var2_2.zzg))) != 0) {
                    return;
                }
                var24_23 = zzelf.zzh((zzelf)var12_11);
                var25_24 = var2_2.zzc;
                var19_18 = var2_2.zzd;
                var17_16 = var25_24.zzag;
                var12_11 = var23_22;
                var16_15 = var23_22;
                var26_25 = var25_24;
                var25_24 = var13_12;
                var23_22 = new zzele((String)var19_18, (String)var17_16, var9_8, var5_6, (Integer)var13_12);
                var24_23.put(var26_25, var23_22);
                var3_3 = zzfiq.zza(var1_1);
                var9_8 = var3_3.zza;
                var10_9 = 3;
                if ((var9_8 == var10_9 || var9_8 == 0) && (var16_15 = var3_3.zzd) != null && (var9_8 = (int)(var16_15 = var16_15.zzc).equals(var26_25 = "com.google.android.gms.ads")) == 0) {
                    var3_3 = var3_3.zzd;
                    var10_9 = 13;
                    var16_15 = new zzehp(var10_9, (zze)var3_3);
                    var3_3 = zzfiq.zza((Throwable)var16_15);
                }
                var16_15 = var2_2.zzg;
                var16_15 = zzelf.zzb((zzelf)var16_15);
                var26_25 = var2_2.zzc;
                var16_15.zzf((zzfgt)var26_25, var5_6, (zze)var3_3);
                return;
            }
            throw var3_4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(Object object) {
        long l2 = zzelf.zze(this.zzg).elapsedRealtime();
        long l3 = this.zza;
        l2 -= l3;
        object = this.zzg;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                Object object2;
                Object object3;
                Object object4;
                boolean bl2;
                Object object5;
                block6: {
                    try {
                        object5 = this.zzg;
                        bl2 = zzelf.zzn((zzelf)object5);
                        if (!bl2) break block6;
                        object4 = zzelf.zzc((zzelf)object5);
                        object3 = this.zzb;
                        object2 = this.zzc;
                        ((zzelh)object4).zza((zzfgw)object3, (zzfgt)object2, 0, null, l2);
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                if (bl2 = zzelf.zzo((zzelf)(object5 = this.zzg))) {
                    return;
                }
                zzfgt zzfgt2 = this.zzc;
                boolean bl3 = zzelf.zzp((zzelf)object5, zzfgt2);
                if (bl3) {
                    object5 = this.zzg;
                    object5 = zzelf.zzh((zzelf)object5);
                    zzfgt2 = this.zzc;
                    object5 = ((LinkedHashMap)object5).get(zzfgt2);
                    object5 = (zzele)object5;
                    ((zzele)object5).zzd = l2;
                } else {
                    zzele zzele2;
                    object5 = this.zzg;
                    object5 = zzelf.zzh((zzelf)object5);
                    zzfgt2 = this.zzc;
                    object3 = this.zzd;
                    object2 = zzfgt2.zzag;
                    object4 = zzele2;
                    zzele2 = new zzele((String)object3, (String)object2, 0, l2, null);
                    ((AbstractMap)object5).put(zzfgt2, zzele2);
                }
                object5 = this.zzg;
                object5 = zzelf.zzb((zzelf)object5);
                zzfgt2 = this.zzc;
                object4 = null;
                ((zzehq)object5).zzg(zzfgt2, l2, null);
                return;
            }
            throw throwable2;
        }
    }
}

