/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaf;
import com.google.android.gms.internal.measurement.zzag;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzaj;
import com.google.android.gms.internal.measurement.zzak;
import com.google.android.gms.internal.measurement.zzap;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzar;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzax;
import com.google.android.gms.internal.measurement.zzay;
import com.google.android.gms.internal.measurement.zzbs;
import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import java.util.List;

public final class zzbt
extends zzay {
    public zzbt() {
        List list = this.zza;
        zzbv zzbv2 = zzbv.zzd;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzo;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzq;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzr;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzw;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzaf;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzag;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzah;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzau;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzbc;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzbg;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzbh;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzbi;
        list.add(zzbv2);
    }

    /*
     * Unable to fully structure code
     */
    public final zzaq zza(String var1_1, zzh var2_2, List var3_3) {
        var4_4 = zzbs.zza;
        var5_5 = zzg.zza((String)var1_1);
        var6_6 = var5_5.ordinal();
        var7_7 = var4_4[var6_6];
        var6_6 = 2;
        var9_9 = 1;
        switch (var7_7) {
            default: {
                return this.zza((String)var1_1);
            }
            case 13: {
                zzg.zzb(zzbv.zzbi, var9_9, (List)var3_3);
                var1_1 = var3_3.iterator();
                while (var10_10 = var1_1.hasNext()) {
                    var3_3 = (zzaq)var1_1.next();
                    var7_7 = (var3_3 = var2_2.zza((zzaq)var3_3)) instanceof zzas;
                    if (var7_7 != 0) {
                        var3_3 = ((zzaq)var3_3).zzf();
                        var4_4 = zzaq.zzc;
                        var2_2.zza((String)var3_3, (zzaq)var4_4);
                        continue;
                    }
                    var2_2 = var3_3.getClass().getCanonicalName();
                    var2_2 = kp1_0.c("Expected string for var name. got ", (String)var2_2);
                    var1_1 = new IllegalArgumentException((String)var2_2);
                    throw var1_1;
                }
                return zzaq.zzc;
            }
            case 12: {
                zzg.zza(zzbv.zzbh, 0, (List)var3_3);
                return zzaq.zzc;
            }
            case 11: {
                zzg.zza(zzbv.zzbg, var9_9, (List)var3_3);
                var1_1 = (zzaq)var3_3.get(0);
                var1_1 = var2_2.zza((zzaq)var1_1);
                var11_14 = var1_1 instanceof zzax;
                if (!var11_14) ** GOTO lbl37
                var1_1 = "undefined";
                ** GOTO lbl56
lbl37:
                // 1 sources

                var11_14 = var1_1 instanceof zzag;
                if (!var11_14) ** GOTO lbl41
                var1_1 = "boolean";
                ** GOTO lbl56
lbl41:
                // 1 sources

                var11_14 = var1_1 instanceof zzai;
                if (!var11_14) ** GOTO lbl45
                var1_1 = "number";
                ** GOTO lbl56
lbl45:
                // 1 sources

                var11_14 = var1_1 instanceof zzas;
                if (!var11_14) ** GOTO lbl49
                var1_1 = "string";
                ** GOTO lbl56
lbl49:
                // 1 sources

                var11_14 = var1_1 instanceof zzar;
                if (!var11_14) ** GOTO lbl53
                var1_1 = "function";
                ** GOTO lbl56
lbl53:
                // 1 sources

                var11_14 = var1_1 instanceof zzat;
                if (var11_14 || (var11_14 = var1_1 instanceof zzaj)) ** GOTO lbl58
                var1_1 = "object";
lbl56:
                // 6 sources

                var2_2 = new zzas((String)var1_1);
                return var2_2;
lbl58:
                // 1 sources

                var4_4 = new Object[var9_9];
                var4_4[0] = var1_1;
                var1_1 = String.format("Unsupported value type %s in typeof", (Object[])var4_4);
                var2_2 = new IllegalArgumentException((String)var1_1);
                throw var2_2;
            }
            case 10: {
                var1_1 = zzbv.zzbc;
                var7_7 = 3;
                zzg.zza((zzbv)var1_1, var7_7, (List)var3_3);
                var1_1 = (zzaq)var3_3.get(0);
                var1_1 = var2_2.zza((zzaq)var1_1);
                var4_4 = (zzaq)var3_3.get(var9_9);
                var4_4 = var2_2.zza((zzaq)var4_4);
                var3_3 = (zzaq)var3_3.get(var6_6);
                var2_2 = var2_2.zza((zzaq)var3_3);
                var3_3 = zzaq.zzc;
                if (var1_1 != var3_3 && var1_1 != (var3_3 = zzaq.zzd)) {
                    var10_11 = var1_1 instanceof zzaf;
                    if (var10_11 != 0 && (var10_11 = var4_4 instanceof zzai) != 0) {
                        var1_1 = (zzaf)var1_1;
                        var3_3 = ((zzaq)var4_4).zze();
                        var10_11 = var3_3.intValue();
                        var1_1.zzb(var10_11, (zzaq)var2_2);
                    } else {
                        var10_11 = var1_1 instanceof zzak;
                        if (var10_11 != 0) {
                            var1_1 = (zzak)var1_1;
                            var3_3 = var4_4.zzf();
                            var1_1.zza((String)var3_3, (zzaq)var2_2);
                        }
                    }
                    return var2_2;
                }
                var3_3 = var4_4.zzf();
                var1_1 = var1_1.zzf();
                var1_1 = UX.c("Can't set property ", (String)var3_3, " of ", (String)var1_1);
                var2_2 = new IllegalStateException((String)var1_1);
                throw var2_2;
            }
            case 9: {
                zzg.zza(zzbv.zzau, 0, (List)var3_3);
                return zzaq.zzd;
            }
            case 7: 
            case 8: {
                zzg.zza(zzbv.zzah, var6_6, (List)var3_3);
                var1_1 = (zzaq)var3_3.get(0);
                var1_1 = var2_2.zza((zzaq)var1_1);
                var3_3 = (zzaq)var3_3.get(var9_9);
                var2_2 = var2_2.zza((zzaq)var3_3);
                var10_12 = var1_1 instanceof zzaf;
                if (var10_12 != 0 && (var10_12 = zzg.zzb((zzaq)var2_2)) != 0) {
                    var1_1 = (zzaf)var1_1;
                    var11_15 = var2_2.zze().intValue();
                    return var1_1.zza(var11_15);
                }
                var10_12 = var1_1 instanceof zzak;
                if (var10_12 != 0) {
                    var1_1 = (zzak)var1_1;
                    var2_2 = var2_2.zzf();
                    return var1_1.zza((String)var2_2);
                }
                var10_12 = var1_1 instanceof zzas;
                if (var10_12 != 0) {
                    var4_4 = "length";
                    var3_3 = var2_2.zzf();
                    var10_12 = var4_4.equals(var3_3);
                    if (var10_12 != 0) {
                        var1_1 = (double)((zzaq)var1_1).zzf().length();
                        var2_2 = new zzai((Double)var1_1);
                        return var2_2;
                    }
                    var10_12 = zzg.zzb((zzaq)var2_2);
                    if (var10_12 != 0 && (var10_12 = (cfr_temp_0 = (var12_17 = var2_2.zze().doubleValue()) - (var14_18 = (double)(var3_3 = ((zzaq)var1_1).zzf()).length())) == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1)) < 0) {
                        var1_1 = ((zzaq)var1_1).zzf();
                        var11_16 = var2_2.zze().intValue();
                        var1_1 = String.valueOf(var1_1.charAt(var11_16));
                        var3_3 = new zzas((String)var1_1);
                        return var3_3;
                    }
                }
                return zzaq.zzc;
            }
            case 6: {
                zzg.zza(zzbv.zzaf, var9_9, (List)var3_3);
                var1_1 = (zzaq)var3_3.get(0);
                var1_1 = var2_2.zza((zzaq)var1_1);
                var10_13 = var1_1 instanceof zzas;
                if (var10_13) {
                    var1_1 = ((zzaq)var1_1).zzf();
                    return var2_2.zza((String)var1_1);
                }
                var1_1 = var1_1.getClass().getCanonicalName();
                var1_1 = kp1_0.c("Expected string for get var. got ", (String)var1_1);
                var2_2 = new IllegalArgumentException((String)var1_1);
                throw var2_2;
            }
            case 5: {
                zzg.zzb(zzbv.zzw, var9_9, (List)var3_3);
                var1_1 = zzaq.zzc;
                for (var8_8 = 0; var8_8 < (var7_7 = var3_3.size()); var8_8 += var9_9) {
                    var1_1 = (zzaq)var3_3.get(var8_8);
                    var7_7 = (var1_1 = var2_2.zza((zzaq)var1_1)) instanceof zzaj;
                    if (var7_7 == 0) {
                        continue;
                    }
                    var1_1 = new IllegalStateException("ControlValue cannot be in an expression list");
                    throw var1_1;
                }
                return var1_1;
            }
            case 4: {
                var16_19 = var3_3.isEmpty();
                if (var16_19 != 0) {
                    var1_1 = new zzap();
                    return var1_1;
                }
                var16_19 = var3_3.size() % var6_6;
                if (var16_19 == 0) {
                    var1_1 = new zzap();
                    while (var8_8 < (var7_7 = var3_3.size() - var9_9)) {
                        var4_4 = (zzaq)var3_3.get(var8_8);
                        var4_4 = var2_2.zza((zzaq)var4_4);
                        var17_22 = var8_8 + 1;
                        var18_23 = (zzaq)var3_3.get(var17_22);
                        var18_23 = var2_2.zza(var18_23);
                        var19_24 = var4_4 instanceof zzaj;
                        if (!var19_24 && !(var19_24 = var18_23 instanceof zzaj)) {
                            var4_4 = var4_4.zzf();
                            var1_1.zza((String)var4_4, var18_23);
                            var8_8 += var6_6;
                            continue;
                        }
                        var1_1 = new IllegalStateException("Failed to evaluate map entry");
                        throw var1_1;
                    }
                    return var1_1;
                }
                var2_2 = hj0_0.a(var3_3.size(), "CREATE_OBJECT requires an even number of arguments, found ");
                var1_1 = new IllegalArgumentException((String)var2_2);
                throw var1_1;
            }
            case 3: {
                var16_20 = var3_3.isEmpty();
                if (var16_20) {
                    var1_1 = new zzaf();
                    return var1_1;
                }
                var1_1 = new zzaf();
                var3_3 = var3_3.iterator();
                while ((var7_7 = (int)var3_3.hasNext()) != 0) {
                    var4_4 = (zzaq)var3_3.next();
                    var6_6 = (var4_4 = (Object)var2_2.zza((zzaq)var4_4)) instanceof zzaj;
                    if (var6_6 == 0) {
                        var6_6 = var8_8 + 1;
                        var1_1.zzb(var8_8, (zzaq)var4_4);
                        var8_8 = var6_6;
                        continue;
                    }
                    var1_1 = new IllegalStateException("Failed to evaluate array element");
                    throw var1_1;
                }
                return var1_1;
            }
            case 2: {
                var1_1 = zzbv.zzo;
                zzg.zzb((zzbv)var1_1, var6_6, (List)var3_3);
                var16_21 = var3_3.size() % var6_6;
                if (var16_21 == 0) {
                    while (var8_8 < (var16_21 = var3_3.size() - var9_9)) {
                        var1_1 = (zzaq)var3_3.get(var8_8);
                        var7_7 = (var1_1 = var2_2.zza((zzaq)var1_1)) instanceof zzas;
                        if (var7_7 != 0) {
                            var1_1 = ((zzaq)var1_1).zzf();
                            var7_7 = var8_8 + 1;
                            var4_4 = (zzaq)var3_3.get(var7_7);
                            var4_4 = var2_2.zza((zzaq)var4_4);
                            var2_2.zzb((String)var1_1, (zzaq)var4_4);
                            var8_8 += var6_6;
                            continue;
                        }
                        var1_1 = var1_1.getClass().getCanonicalName();
                        var1_1 = kp1_0.c("Expected string for const name. got ", (String)var1_1);
                        var2_2 = new IllegalArgumentException((String)var1_1);
                        throw var2_2;
                    }
                    return zzaq.zzc;
                }
                var2_2 = hj0_0.a(var3_3.size(), "CONST requires an even number of arguments, found ");
                var1_1 = new IllegalArgumentException((String)var2_2);
                throw var1_1;
            }
            case 1: 
        }
        zzg.zza(zzbv.zzd, var6_6, (List)var3_3);
        var1_1 = (zzaq)var3_3.get(0);
        var1_1 = var2_2.zza((zzaq)var1_1);
        var7_7 = var1_1 instanceof zzas;
        if (var7_7 != 0) {
            var4_4 = ((zzaq)var1_1).zzf();
            var7_7 = (int)var2_2.zzb((String)var4_4);
            if (var7_7 != 0) {
                var3_3 = (zzaq)var3_3.get(var9_9);
                var3_3 = var2_2.zza((zzaq)var3_3);
                var1_1 = ((zzaq)var1_1).zzf();
                var2_2.zzc((String)var1_1, (zzaq)var3_3);
                return var3_3;
            }
            var1_1 = ((zzaq)var1_1).zzf();
            var1_1 = kp1_0.c("Attempting to assign undefined value ", (String)var1_1);
            var2_2 = new IllegalArgumentException((String)var1_1);
            throw var2_2;
        }
        var1_1 = var1_1.getClass().getCanonicalName();
        var1_1 = kp1_0.c("Expected string for assign var. got ", (String)var1_1);
        var2_2 = new IllegalArgumentException((String)var1_1);
        throw var2_2;
    }
}

