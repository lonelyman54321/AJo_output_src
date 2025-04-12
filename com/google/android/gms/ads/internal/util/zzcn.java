/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodecInfo
 *  android.media.MediaCodecList
 *  android.os.Build$VERSION
 *  android.util.Range
 */
package com.google.android.gms.ads.internal.util;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzcn {
    private static final Map zza;
    private static List zzb;
    private static final Object zzc;

    static {
        Object object = new HashMap();
        zza = object;
        zzc = object = new Object();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static List zza(String var0) {
        block21: {
            block20: {
                block19: {
                    block18: {
                        var1_2 = 1;
                        var2_3 = null;
                        var3_4 = zzcn.zzc;
                        // MONITORENTER : var3_4
                        try {
                            var4_5 = zzcn.zza;
                            var5_6 = var4_5.containsKey(var0);
                            if (var5_6) {
                                var0 = var4_5.get(var0);
                                var0 = (List)var0;
                                // MONITOREXIT : var3_4
                                return var0;
                            }
                        }
                        catch (Throwable var0_1) {}
                        try {
                            var4_5 = zzcn.zzb;
                            if (var4_5 == null) break block18;
                            // MONITOREXIT : var3_4
                            break block19;
                        }
                        catch (Throwable var6_7) {
                            break block20;
                        }
                    }
                    var4_5 = new MediaCodecList(0);
                    var4_5 = var4_5.getCodecInfos();
                    zzcn.zzb = var4_5 = Arrays.asList(var4_5);
                    // MONITOREXIT : var3_4
                }
                ** try [egrp 3[TRYBLOCK] [18, 17, 16 : 106->618)] { 
lbl29:
                // 1 sources

                var4_5 = new ArrayList();
                var7_12 = zzcn.zzb;
                var7_12 = var7_12.iterator();
                break block21;
            }
            try {
                throw var6_7;
            }
lbl36:
            // 2 sources

            catch (LinkageError var6_8) {}
lbl37:
            // 2 sources

            catch (RuntimeException var6_9) {}
lbl38:
            // 1 sources

            finally {
                throw var0_1;
            }
        }
        while ((var8_13 = var7_12.hasNext()) != 0) {
            var9_14 /* !! */  = var7_12.next();
            var10_15 = (var9_14 /* !! */  = (MediaCodecInfo)var9_14 /* !! */ ).isEncoder();
            if (var10_15) continue;
            var11_16 = var9_14 /* !! */ .getSupportedTypes();
            var10_15 = (var11_16 = Arrays.asList(var11_16)).contains(var0);
            if (!var10_15) continue;
            var11_16 = new HashMap();
            var12_17 /* !! */  = "codecName";
            var13_18 /* !! */  = var9_14 /* !! */ .getName();
            var11_16.put(var12_17 /* !! */ , var13_18 /* !! */ );
            var9_14 /* !! */  = var9_14 /* !! */ .getCapabilitiesForType((String)var0);
            var12_17 /* !! */  = new ArrayList();
            var13_18 /* !! */  = var9_14 /* !! */ .profileLevels;
            var14_19 = var13_18 /* !! */ .length;
            for (var15_20 = 0; var15_20 < var14_19; var15_20 += var1_2) {
                var16_21 /* !! */  = var13_18 /* !! */ [var15_20];
                var17_22 = var16_21 /* !! */ .profile;
                var18_23 = var17_22;
                var19_24 = var16_21 /* !! */ .level;
                var16_21 /* !! */  = Integer.valueOf(var19_24);
                var20_25 = 2;
                var21_26 = new Integer[var20_25];
                var21_26[0] = var18_23;
                var21_26[var1_2] = var16_21 /* !! */ ;
                var12_17 /* !! */ .add(var21_26);
            }
            var13_18 /* !! */  = "profileLevels";
            var11_16.put(var13_18 /* !! */ , var12_17 /* !! */ );
            var12_17 /* !! */  = var9_14 /* !! */ .getVideoCapabilities();
            var13_18 /* !! */  = "bitRatesBps";
            var22_27 = var12_17 /* !! */ .getBitrateRange();
            var22_27 = zzcn.zzb((Range)var22_27);
            var11_16.put(var13_18 /* !! */ , var22_27);
            var13_18 /* !! */  = "widthAlignment";
            var14_19 = var12_17 /* !! */ .getWidthAlignment();
            var22_27 = var14_19;
            var11_16.put(var13_18 /* !! */ , var22_27);
            var13_18 /* !! */  = "heightAlignment";
            var14_19 = var12_17 /* !! */ .getHeightAlignment();
            var22_27 = var14_19;
            var11_16.put(var13_18 /* !! */ , var22_27);
            var13_18 /* !! */  = "frameRates";
            var22_27 = var12_17 /* !! */ .getSupportedFrameRates();
            var22_27 = zzcn.zzb((Range)var22_27);
            var11_16.put(var13_18 /* !! */ , var22_27);
            var13_18 /* !! */  = "widths";
            var22_27 = var12_17 /* !! */ .getSupportedWidths();
            var22_27 = zzcn.zzb((Range)var22_27);
            var11_16.put(var13_18 /* !! */ , var22_27);
            var13_18 /* !! */  = "heights";
            var12_17 /* !! */  = var12_17 /* !! */ .getSupportedHeights();
            var12_17 /* !! */  = zzcn.zzb((Range)var12_17 /* !! */ );
            var11_16.put(var13_18 /* !! */ , var12_17 /* !! */ );
            var23_28 = Build.VERSION.SDK_INT;
            var24_29 = 23;
            if (var23_28 >= var24_29) {
                var12_17 /* !! */  = "instancesLimit";
                var8_13 = ik3_1.a(var9_14 /* !! */ );
                var9_14 /* !! */  = var8_13;
                var11_16.put(var12_17 /* !! */ , var9_14 /* !! */ );
            }
            var4_5.add(var11_16);
        }
        var6_10 = zzcn.zza;
        var6_10.put(var0, var4_5);
        // MONITOREXIT : var3_4
        return var4_5;
    }

    private static Integer[] zzb(Range object) {
        Integer n3 = (Integer)object.getLower();
        object = (Integer)object.getUpper();
        Integer[] integerArray = new Integer[]{n3, object};
        return integerArray;
    }
}

