/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbmq;
import com.google.android.gms.internal.ads.zzdwc;
import com.google.android.gms.internal.ads.zzdwh;
import com.google.android.gms.internal.ads.zzdwm;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class zzdwj
extends zzbmq {
    private final zzdwm zza;
    private final zzdwh zzb;
    private final Map zzc;

    public zzdwj(zzdwm zzdwm2, zzdwh zzdwh2) {
        HashMap hashMap;
        this.zzc = hashMap = new HashMap();
        this.zza = zzdwm2;
        this.zzb = zzdwh2;
    }

    /*
     * Exception decompiling
     */
    private static zzl zzc(Map var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [32[CASE]], but top level block is 3[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void zze() {
        this.zzc.clear();
    }

    /*
     * Unable to fully structure code
     */
    public final void zzf(String var1_1) {
        block39: {
            block38: {
                var2_2 = zzbep.zzjU;
                var3_3 = zzba.zzc();
                var2_2 = (Boolean)var3_3.zza((zzbeg)var2_2);
                var4_4 = var2_2.booleanValue();
                if (var4_4 == 0) {
                    return;
                }
                var2_2 = String.valueOf(var1_1);
                var3_3 = "Received H5 gmsg: ";
                zze.zza(var3_3.concat((String)var2_2));
                var1_1 = Uri.parse((String)var1_1);
                zzu.zzp();
                var1_1 = zzt.zzP((Uri)var1_1);
                var2_2 = (String)var1_1.get("action");
                var5_5 = TextUtils.isEmpty((CharSequence)var2_2);
                if (var5_5 != 0) {
                    zzm.zze("H5 gmsg did not contain an action");
                    return;
                }
                var5_5 = var2_2.hashCode();
                var6_6 = 579053441;
                var7_7 = -1;
                var8_8 = false;
                var9_9 = null;
                var10_10 = 1;
                if (var5_5 == var6_6) break block38;
                var6_6 = 871091088;
                if (var5_5 != var6_6 || (var5_5 = (int)var2_2.equals(var3_3 = "initialize")) == 0) ** GOTO lbl-1000
                var5_5 = 0;
                var3_3 = null;
                break block39;
            }
            var3_3 = "dispose_all";
            var5_5 = (int)var2_2.equals(var3_3);
            if (var5_5 != 0) {
                var5_5 = 1;
            } else lbl-1000:
            // 2 sources

            {
                var5_5 = -1;
            }
        }
        if (var5_5 != 0) {
            if (var5_5 != var10_10) {
                var3_3 = (String)var1_1.get("obj_id");
                try {
                    Objects.requireNonNull(var3_3);
                    var11_11 = Long.parseLong((String)var3_3);
                }
                catch (NullPointerException | NumberFormatException v0) {
                    var1_1 = String.valueOf(var3_3);
                    zzm.zze("H5 gmsg did not contain a valid object id: ".concat((String)var1_1));
                    return;
                }
                var13_12 = var2_2.hashCode();
                switch (var13_12) {
                    default: {
                        break;
                    }
                    case 2109237041: {
                        var9_9 = "create_rewarded_ad";
                        var8_8 = var2_2.equals(var9_9);
                        if (!var8_8) break;
                        var7_7 = 3;
                        break;
                    }
                    case 1671767583: {
                        var9_9 = "dispose";
                        var8_8 = var2_2.equals(var9_9);
                        if (!var8_8) break;
                        var7_7 = 6;
                        break;
                    }
                    case 585513149: {
                        var9_9 = "load_interstitial_ad";
                        var8_8 = var2_2.equals(var9_9);
                        if (!var8_8) break;
                        var7_7 = 1;
                        break;
                    }
                    case 393881811: {
                        var14_13 = "create_interstitial_ad";
                        var10_10 = (int)var2_2.equals(var14_13);
                        if (var10_10 == 0) break;
                        var7_7 = 0;
                        var15_14 = null;
                        break;
                    }
                    case -257098725: {
                        var9_9 = "load_rewarded_ad";
                        var8_8 = var2_2.equals(var9_9);
                        if (!var8_8) break;
                        var7_7 = 4;
                        break;
                    }
                    case -1266374734: {
                        var9_9 = "show_rewarded_ad";
                        var8_8 = var2_2.equals(var9_9);
                        if (!var8_8) break;
                        var7_7 = 5;
                        break;
                    }
                    case -1790951212: {
                        var9_9 = "show_interstitial_ad";
                        var8_8 = var2_2.equals(var9_9);
                        if (!var8_8) break;
                        var7_7 = 2;
                    }
                }
                var9_9 = " with ad unit ";
                var14_13 = "Could not create H5 ad, missing ad unit id";
                var16_15 = "ad_unit";
                var17_16 = "Could not create H5 ad, object ID already exists";
                var18_17 = "Could not create H5 ad, too many existing objects";
                var19_18 = "Could not load H5 ad, object ID does not exist";
                var20_19 = "Could not show H5 ad, object ID does not exist";
                switch (var7_7) {
                    default: {
                        zzm.zze("H5 gmsg contained invalid action: ".concat((String)var2_2));
                        return;
                    }
                    case 6: {
                        var1_1 = this.zzc;
                        var2_2 = var11_11;
                        var1_1 = (zzdwc)var1_1.get(var2_2);
                        if (var1_1 == null) {
                            zzm.zze("Could not dispose H5 ad, object ID does not exist");
                            return;
                        }
                        var1_1.zza();
                        this.zzc.remove(var2_2);
                        var1_1 = new StringBuilder("Disposed H5 ad #");
                        var1_1.append(var11_11);
                        zze.zza(var1_1.toString());
                        return;
                    }
                    case 5: {
                        var1_1 = this.zzc;
                        var2_2 = var11_11;
                        var1_1 = (zzdwc)var1_1.get(var2_2);
                        if (var1_1 == null) {
                            zzm.zze(var20_19);
                            this.zzb.zzq(var11_11);
                            return;
                        }
                        var1_1.zzc();
                        return;
                    }
                    case 4: {
                        var2_2 = this.zzc;
                        var15_14 = var11_11;
                        var2_2 = (zzdwc)var2_2.get(var15_14);
                        if (var2_2 == null) {
                            zzm.zze((String)var19_18);
                            this.zzb.zzq(var11_11);
                            return;
                        }
                        var1_1 = zzdwj.zzc((Map)var1_1);
                        var2_2.zzb((zzl)var1_1);
                        return;
                    }
                    case 3: {
                        var2_2 = this.zzc;
                        var4_4 = var2_2.size();
                        var15_14 = zzbep.zzjV;
                        var19_18 = zzba.zzc();
                        var15_14 = (Integer)var19_18.zza((zzbeg)var15_14);
                        var7_7 = var15_14.intValue();
                        if (var4_4 >= var7_7) {
                            zzm.zzj(var18_17);
                            this.zzb.zzi(var11_11);
                            return;
                        }
                        var2_2 = this.zzc;
                        var15_14 = var11_11;
                        var4_4 = (int)var2_2.containsKey(var15_14);
                        if (var4_4 != 0) {
                            zzm.zze(var17_16);
                            this.zzb.zzi(var11_11);
                            return;
                        }
                        var4_4 = (int)TextUtils.isEmpty((CharSequence)(var1_1 = (String)var1_1.get(var16_15)));
                        if (var4_4 != 0) {
                            zzm.zzj(var14_13);
                            this.zzb.zzi(var11_11);
                            return;
                        }
                        var2_2 = this.zza.zzb();
                        var2_2.zzb(var11_11);
                        var2_2.zza((String)var1_1);
                        var2_2 = var2_2.zzc().zzb();
                        this.zzc.put(var15_14, var2_2);
                        this.zzb.zzh(var11_11);
                        var2_2 = new StringBuilder("Created H5 rewarded #");
                        var2_2.append(var11_11);
                        var2_2.append(var9_9);
                        var2_2.append((String)var1_1);
                        zze.zza(var2_2.toString());
                        return;
                    }
                    case 2: {
                        var1_1 = this.zzc;
                        var2_2 = var11_11;
                        var1_1 = (zzdwc)var1_1.get(var2_2);
                        if (var1_1 == null) {
                            zzm.zze(var20_19);
                            this.zzb.zzf(var11_11);
                            return;
                        }
                        var1_1.zzc();
                        return;
                    }
                    case 1: {
                        var2_2 = this.zzc;
                        var15_14 = var11_11;
                        var2_2 = (zzdwc)var2_2.get(var15_14);
                        if (var2_2 == null) {
                            zzm.zze((String)var19_18);
                            this.zzb.zzf(var11_11);
                            return;
                        }
                        var1_1 = zzdwj.zzc((Map)var1_1);
                        var2_2.zzb((zzl)var1_1);
                        return;
                    }
                    case 0: 
                }
                var2_2 = this.zzc;
                var4_4 = var2_2.size();
                var15_14 = zzbep.zzjV;
                var19_18 = zzba.zzc();
                var15_14 = (Integer)var19_18.zza((zzbeg)var15_14);
                var7_7 = var15_14.intValue();
                if (var4_4 >= var7_7) {
                    zzm.zzj(var18_17);
                    this.zzb.zzi(var11_11);
                    return;
                }
                var2_2 = this.zzc;
                var15_14 = var11_11;
                var4_4 = (int)var2_2.containsKey(var15_14);
                if (var4_4 != 0) {
                    zzm.zze(var17_16);
                    this.zzb.zzi(var11_11);
                    return;
                }
                var4_4 = (int)TextUtils.isEmpty((CharSequence)(var1_1 = (String)var1_1.get(var16_15)));
                if (var4_4 != 0) {
                    zzm.zzj(var14_13);
                    this.zzb.zzi(var11_11);
                    return;
                }
                var2_2 = this.zza.zzb();
                var2_2.zzb(var11_11);
                var2_2.zza((String)var1_1);
                var2_2 = var2_2.zzc().zza();
                this.zzc.put(var15_14, var2_2);
                this.zzb.zzh(var11_11);
                var2_2 = new StringBuilder("Created H5 interstitial #");
                var2_2.append(var11_11);
                var2_2.append(var9_9);
                var2_2.append((String)var1_1);
                zze.zza(var2_2.toString());
                return;
            }
            var1_1 = this.zzc.values().iterator();
            while ((var4_4 = var1_1.hasNext()) != 0) {
                var2_2 = (zzdwc)var1_1.next();
                var2_2.zza();
            }
            this.zzc.clear();
            return;
        }
        this.zzc.clear();
        this.zzb.zza();
    }
}

