/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzde;
import com.google.android.gms.internal.vision.zzdq;
import com.google.android.gms.internal.vision.zzeb;
import com.google.android.gms.internal.vision.zzec;
import com.google.android.gms.internal.vision.zzef;
import com.google.android.gms.internal.vision.zzej;
import com.google.android.gms.internal.vision.zzer;
import com.google.android.gms.internal.vision.zzet;
import com.google.android.gms.internal.vision.zzew;
import java.util.Arrays;

final class zzes
extends zzef {
    static final zzef zza;
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    static {
        Object[] objectArray = new Object[]{};
        zzes zzes2 = new zzes(null, objectArray, 0);
        zza = zzes2;
    }

    private zzes(Object object, Object[] objectArray, int n3) {
        this.zzb = object;
        this.zzc = objectArray;
        this.zzd = n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static zzes zza(int var0, Object[] var1_1) {
        block13: {
            block15: {
                block14: {
                    if (var0 == 0) {
                        return (zzes)zzes.zza;
                    }
                    var2_2 = 0;
                    var3_3 /* !! */  = null;
                    var5_5 = null;
                    var6_6 = 1;
                    if (var0 == var6_6) {
                        var7_7 = var1_1[0];
                        var5_5 = var1_1[var6_6];
                        zzdq.zza(var7_7, var5_5);
                        var7_7 = new zzes(null, var1_1, var6_6);
                        return var7_7;
                    }
                    var8_8 = var1_1.length >> var6_6;
                    zzde.zzb(var0, var8_8);
                    var8_8 = zzej.zza(var0);
                    if (var0 != var6_6) break block14;
                    var5_5 = var1_1[0];
                    var9_9 = var1_1[var6_6];
                    zzdq.zza(var5_5, var9_9);
                    break block13;
                }
                var2_2 = var8_8 + -1;
                var6_6 = 128;
                var10_11 = -1;
                if (var8_8 <= var6_6) {
                    var9_10 /* !! */  = new byte[var8_8];
                    Arrays.fill(var9_10 /* !! */ , var10_11);
                    block0: for (var4_4 = 0; var4_4 < var0; ++var4_4) {
                        var8_8 = var4_4 * 2;
                        var11_12 = var1_1[var8_8];
                        var12_14 = var8_8 ^ 1;
                        var13_16 = var1_1[var12_14];
                        zzdq.zza(var11_12, var13_16);
                        var14_19 = zzec.zza(var11_12.hashCode());
                        while (true) {
                            var15_22 = var9_10 /* !! */ [var14_19 &= var2_2];
                            var16_25 = 255;
                            if ((var15_22 &= var16_25) == var16_25) {
                                var9_10 /* !! */ [var14_19] = var8_8 = (int)((byte)var8_8);
                                continue block0;
                            }
                            var17_28 = var1_1[var15_22];
                            var16_25 = (int)var17_28.equals(var11_12);
                            if (var16_25 != 0) break;
                            ++var14_19;
                        }
                        throw zzes.zza(var11_12, var13_16, var1_1, var15_22);
                    }
lbl48:
                    // 3 sources

                    while (true) {
                        var3_3 /* !! */  = var9_10 /* !! */ ;
                        break block13;
                        break;
                    }
                }
                var6_6 = 32768;
                if (var8_8 > var6_6) break block15;
                var9_10 /* !! */  = (byte[])new short[var8_8];
                Arrays.fill((short[])var9_10 /* !! */ , (short)var10_11);
                block3: while (true) {
                    if (var4_4 >= var0) ** GOTO lbl48
                    var8_8 = var4_4 * 2;
                    var11_13 = var1_1[var8_8];
                    var12_15 = var8_8 ^ 1;
                    var13_17 = var1_1[var12_15];
                    zzdq.zza(var11_13, var13_17);
                    var14_20 = zzec.zza(var11_13.hashCode());
                    while (true) {
                        var15_23 = var9_10 /* !! */ [var14_20 &= var2_2];
                        var16_26 = (char)-1;
                        if ((var15_23 &= var16_26) == var16_26) {
                            var9_10 /* !! */ [var14_20] = var8_8 = (int)((short)var8_8);
                            ++var4_4;
                            continue block3;
                        }
                        var17_29 = var1_1[var15_23];
                        var16_26 = (char)var17_29.equals(var11_13);
                        if (var16_26 != '\u0000') break block3;
                        ++var14_20;
                    }
                    break;
                }
                throw zzes.zza(var11_13, var13_17, var1_1, var15_23);
            }
            var9_10 /* !! */  = (byte[])new int[var8_8];
            Arrays.fill((int[])var9_10 /* !! */ , (int)var10_11);
            block5: while (true) lbl-1000:
            // 2 sources

            {
                if (var4_4 >= var0) ** continue;
                var8_8 = var4_4 * 2;
                var13_18 = var1_1[var8_8];
                var14_21 = var8_8 ^ 1;
                var18_30 = var1_1[var14_21];
                zzdq.zza(var13_18, var18_30);
                var15_24 = zzec.zza(var13_18.hashCode());
                while (true) {
                    if ((var16_27 = var9_10 /* !! */ [var15_24 &= var2_2]) == var10_11) {
                        var9_10 /* !! */ [var15_24] = var8_8;
                        ++var4_4;
                        ** continue;
                    }
                    var19_31 = var1_1[var16_27];
                    var20_32 = var19_31.equals(var13_18);
                    if (var20_32) break block5;
                    ++var15_24;
                }
                break;
            }
            throw zzes.zza(var13_18, var18_30, var1_1, var16_27);
        }
        var5_5 = new zzes(var3_3 /* !! */ , var1_1, var0);
        return var5_5;
    }

    private static IllegalArgumentException zza(Object object, Object object2, Object[] object3, int n3) {
        object = String.valueOf(object);
        object2 = String.valueOf(object2);
        String string2 = String.valueOf(object3[n3]);
        object3 = String.valueOf(object3[n3 ^= 1]);
        n3 = ((String)object).length() + 39;
        int n4 = ((String)object2).length() + n3;
        n3 = string2.length() + n4;
        n4 = ((String)object3).length() + n3;
        StringBuilder stringBuilder = new StringBuilder(n4);
        stringBuilder.append("Multiple entries with same key: ");
        stringBuilder.append((String)object);
        object = "=";
        stringBuilder.append((String)object);
        stringBuilder.append((String)object2);
        object = ko_0.a(stringBuilder, " and ", string2, (String)object, (String)object3);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        return illegalArgumentException;
    }

    public final Object get(Object object) {
        Object object2 = this.zzb;
        Object[] objectArray = this.zzc;
        int n3 = this.zzd;
        if (object == null) {
            return null;
        }
        int n4 = 1;
        if (n3 == n4) {
            boolean bl2 = false;
            object2 = objectArray[0];
            boolean bl3 = object2.equals(object);
            if (bl3) {
                return objectArray[n4];
            }
            return null;
        }
        if (object2 == null) {
            return null;
        }
        n3 = object2 instanceof byte[];
        if (n3 != 0) {
            Object object3 = object2;
            object3 = (byte[])object2;
            int n7 = ((Object)object3).length + -1;
            int n8 = zzec.zza(object.hashCode());
            while (true) {
                Object object4 = object3[n8 &= n7];
                int n10 = 255;
                if ((object4 = (Object)(object4 & n10)) == n10) {
                    return null;
                }
                Object object5 = objectArray[object4];
                n10 = (int)(object5.equals(object) ? 1 : 0);
                if (n10 != 0) {
                    int n14 = object4 ^ 1;
                    return objectArray[n14];
                }
                ++n8;
            }
        }
        n3 = object2 instanceof short[];
        if (n3 != 0) {
            Object object6 = object2;
            object6 = (short[])object2;
            int n15 = ((Object)object6).length + -1;
            int n16 = zzec.zza(object.hashCode());
            while (true) {
                Object object7 = object6[n16 &= n15];
                char c2 = (char)-1;
                if ((object7 = (Object)(object7 & c2)) == c2) {
                    return null;
                }
                Object object8 = objectArray[object7];
                c2 = (char)(object8.equals(object) ? 1 : 0);
                if (c2 != '\u0000') {
                    int n17 = object7 ^ 1;
                    return objectArray[n17];
                }
                ++n16;
            }
        }
        object2 = (int[])object2;
        n3 = ((Object)object2).length - n4;
        int n18 = zzec.zza(object.hashCode());
        int n19;
        Object object9;
        while ((object9 = object2[n18 &= n3]) != (n19 = -1)) {
            Object object10 = objectArray[object9];
            n19 = (int)(object10.equals(object) ? 1 : 0);
            if (n19 != 0) {
                int n20 = object9 ^ 1;
                return objectArray[n20];
            }
            ++n18;
        }
        return null;
    }

    public final int size() {
        return this.zzd;
    }

    public final zzej zza() {
        Object[] objectArray = this.zzc;
        int n3 = this.zzd;
        zzer zzer2 = new zzer(this, objectArray, 0, n3);
        return zzer2;
    }

    public final zzej zzb() {
        Object object = this.zzc;
        int n3 = this.zzd;
        zzew zzew2 = new zzew((Object[])object, 0, n3);
        object = new zzet(this, zzew2);
        return object;
    }

    public final zzeb zzc() {
        Object[] objectArray = this.zzc;
        int n3 = this.zzd;
        zzew zzew2 = new zzew(objectArray, 1, n3);
        return zzew2;
    }
}

