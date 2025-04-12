/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzcg$zzd;
import com.google.android.gms.internal.clearcut.zzcg$zze;
import com.google.android.gms.internal.clearcut.zzdo;
import com.google.android.gms.internal.clearcut.zzet;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

final class zzdr {
    public static String zza(zzdo zzdo2, String charSequence) {
        charSequence = nn_2.a("# ", (String)charSequence);
        zzdr.zza(zzdo2, (StringBuilder)charSequence, 0);
        return ((StringBuilder)charSequence).toString();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void zza(zzdo var0, StringBuilder var1_1, int var2_2) {
        var3_3 = var0;
        var4_4 = var1_1;
        var5_5 = var2_2;
        var6_6 = new HashMap();
        var7_7 = new HashMap();
        var8_8 = new TreeSet();
        var9_9 = var0.getClass().getDeclaredMethods();
        var10_10 = ((Method[])var9_9).length;
        var11_11 = null;
        var12_12 = 0;
        var13_13 /* !! */  = null;
        while (true) {
            var14_14 = "get";
            if (var12_12 >= var10_10) break;
            var15_15 = var9_9[var12_12];
            var16_16 = var15_15.getName();
            var7_7.put(var16_16, var15_15);
            var16_16 = var15_15.getParameterTypes();
            var17_17 = ((Class<?>[])var16_16).length;
            if (var17_17 == 0) {
                var16_16 = var15_15.getName();
                var6_6.put(var16_16, var15_15);
                var16_16 = var15_15.getName();
                var18_18 = var16_16.startsWith(var14_14);
                if (var18_18) {
                    var14_14 = var15_15.getName();
                    var8_8.add(var14_14);
                }
            }
            ++var12_12;
        }
        var8_8 = var8_8.iterator();
        while ((var19_19 = var8_8.hasNext()) != 0) {
            block25: {
                block20: {
                    block19: {
                        block24: {
                            block23: {
                                block22: {
                                    block21: {
                                        var9_9 = (String)var8_8.next();
                                        var20_20 = "";
                                        var13_13 /* !! */  = var9_9.replaceFirst(var14_14, (String)var20_20);
                                        var15_15 = "List";
                                        var17_17 = (int)var13_13 /* !! */ .endsWith((String)var15_15);
                                        var21_21 = 1;
                                        if (var17_17 != 0 && (var17_17 = (int)var13_13 /* !! */ .endsWith((String)(var16_16 = "OrBuilderList"))) == 0 && (var22_22 = var13_13 /* !! */ .equals(var15_15)) == 0) {
                                            var15_15 = String.valueOf(var13_13 /* !! */ .substring(0, var21_21).toLowerCase());
                                            var17_17 = var13_13 /* !! */ .length() + -4;
                                            var16_16 = String.valueOf(var13_13 /* !! */ .substring(var21_21, var17_17));
                                            var23_23 = var16_16.length();
                                            var15_15 = var23_23 != 0 ? var15_15.concat((String)var16_16) : (var16_16 = new String((String)var15_15));
                                            var16_16 = (Method)var6_6.get(var9_9);
                                            if (var16_16 != null && (var23_23 = (int)(var24_24 = var16_16.getReturnType()).equals(var25_25 = List.class)) != 0) {
                                                var9_9 = zzdr.zzj((String)var15_15);
                                                var20_20 = new Object[]{};
                                                var20_20 = zzcg.zza((Method)var16_16, var3_3, (Object[])var20_20);
                                                zzdr.zza(var4_4, var5_5, (String)var9_9, var20_20);
                                                continue;
                                            }
                                        }
                                        if ((var17_17 = (int)var13_13 /* !! */ .endsWith((String)(var15_15 = "Map"))) != 0 && (var22_22 = var13_13 /* !! */ .equals(var15_15)) == 0) {
                                            var15_15 = String.valueOf(var13_13 /* !! */ .substring(0, var21_21).toLowerCase());
                                            var17_17 = var13_13 /* !! */ .length() + -3;
                                            var16_16 = String.valueOf(var13_13 /* !! */ .substring(var21_21, var17_17));
                                            var23_23 = var16_16.length();
                                            var15_15 = var23_23 != 0 ? var15_15.concat((String)var16_16) : (var16_16 = new String((String)var15_15));
                                            if ((var9_9 = (Method)var6_6.get(var9_9)) != null && (var17_17 = (int)(var16_16 = var9_9.getReturnType()).equals(var24_24 = Map.class)) != 0 && (var17_17 = (int)var9_9.isAnnotationPresent((Class<? extends Annotation>)(var16_16 = Deprecated.class))) == 0 && (var17_17 = (int)Modifier.isPublic(var9_9.getModifiers())) != 0) {
                                                var20_20 = zzdr.zzj((String)var15_15);
                                                var13_13 /* !! */  = new Object[]{};
                                                var9_9 = zzcg.zza((Method)var9_9, var3_3, var13_13 /* !! */ );
                                                zzdr.zza(var4_4, var5_5, (String)var20_20, var9_9);
                                                continue;
                                            }
                                        }
                                        var19_19 = var13_13 /* !! */ .length();
                                        var15_15 = "set";
                                        var9_9 = var19_19 != 0 ? var15_15.concat((String)var13_13 /* !! */ ) : new String((String)var15_15);
                                        if ((var9_9 = (Method)var7_7.get(var9_9)) == null || (var19_19 = (int)var13_13 /* !! */ .endsWith((String)(var9_9 = "Bytes"))) != 0 && (var19_19 = (int)var6_6.containsKey(var9_9 = (var22_22 = (var9_9 = String.valueOf(var13_13 /* !! */ .substring(0, var19_19 = var13_13 /* !! */ .length() + -5))).length()) != 0 ? var14_14.concat((String)var9_9) : new String(var14_14))) != 0) continue;
                                        var9_9 = String.valueOf(var13_13 /* !! */ .substring(0, var21_21).toLowerCase());
                                        var15_15 = String.valueOf(var13_13 /* !! */ .substring(var21_21));
                                        var17_17 = var15_15.length();
                                        var9_9 = var17_17 != 0 ? var9_9.concat((String)var15_15) : (var15_15 = new String((String)var9_9));
                                        var22_22 = var13_13 /* !! */ .length();
                                        var15_15 = var22_22 != 0 ? var14_14.concat((String)var13_13 /* !! */ ) : new String(var14_14);
                                        var15_15 = (Method)var6_6.get(var15_15);
                                        var17_17 = var13_13 /* !! */ .length();
                                        var24_24 = "has";
                                        var13_13 /* !! */  = var17_17 != 0 ? var24_24.concat((String)var13_13 /* !! */ ) : new String((String)var24_24);
                                        var13_13 /* !! */  = (Method)var6_6.get(var13_13 /* !! */ );
                                        if (var15_15 == null) continue;
                                        var16_16 = new Object[]{};
                                        var15_15 = zzcg.zza((Method)var15_15, var3_3, (Object[])var16_16);
                                        if (var13_13 /* !! */  != null) break block20;
                                        var12_12 = var15_15 instanceof Boolean;
                                        if (var12_12 != 0) {
                                            var20_20 = var15_15;
                                            var20_20 = (Boolean)var15_15;
                                            var10_10 = (int)var20_20.booleanValue();
                                            if (var10_10 == 0) lbl-1000:
                                            // 6 sources

                                            {
                                                while (true) {
                                                    var10_10 = 1;
                                                    var26_26 = 1.4E-45f;
                                                    break block19;
                                                    break;
                                                }
                                            }
lbl95:
                                            // 8 sources

                                            while (true) {
                                                var10_10 = 0;
                                                var26_26 = 0.0f;
                                                var20_20 = null;
                                                break block19;
                                                break;
                                            }
                                        }
                                        var12_12 = var15_15 instanceof Integer;
                                        if (var12_12 == 0) break block21;
                                        var20_20 = var15_15;
                                        var20_20 = (Integer)var15_15;
                                        var10_10 = var20_20.intValue();
                                        if (var10_10 != 0) ** GOTO lbl95
                                        ** GOTO lbl-1000
                                    }
                                    var12_12 = var15_15 instanceof Float;
                                    if (var12_12 == 0) break block22;
                                    var20_20 = var15_15;
                                    var20_20 = (Float)var15_15;
                                    var26_26 = var20_20.floatValue();
                                    var12_12 = 0;
                                    var13_13 /* !! */  = null;
                                    cfr_temp_0 = var26_26 - 0.0f;
                                    var10_10 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                    if (var10_10 != 0) ** GOTO lbl95
                                    ** GOTO lbl-1000
                                }
                                var12_12 = var15_15 instanceof Double;
                                if (var12_12 == 0) break block23;
                                var20_20 = var15_15;
                                var20_20 = (Double)var15_15;
                                var27_27 = var20_20.doubleValue();
                                cfr_temp_1 = var27_27 - (var29_28 = 0.0);
                                var10_10 = (int)(cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1));
                                if (var10_10 != 0) ** GOTO lbl95
                                ** GOTO lbl-1000
                            }
                            var12_12 = var15_15 instanceof String;
                            if (var12_12 != 0) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    var10_10 = (int)var15_15.equals(var20_20);
                                    break block19;
                                    break;
                                }
                            }
                            var10_10 = var15_15 instanceof zzbb;
                            if (var10_10 != 0) {
                                var20_20 = zzbb.zzfi;
                                ** continue;
                            }
                            var10_10 = var15_15 instanceof zzdo;
                            if (var10_10 == 0) break block24;
                            var20_20 = var15_15;
                            var20_20 = ((zzdo)var15_15).zzbe();
                            if (var15_15 != var20_20) ** GOTO lbl95
                            ** GOTO lbl-1000
                        }
                        var10_10 = var15_15 instanceof Enum;
                        if (var10_10 == 0) ** GOTO lbl95
                        var20_20 = var15_15;
                        var20_20 = (Enum)var15_15;
                        var10_10 = var20_20.ordinal();
                        if (var10_10 == 0) ** break;
                        ** continue;
                        ** continue;
                    }
                    if (var10_10 != 0) {
                        var21_21 = 0;
                    }
                    break block25;
                }
                var20_20 = new Object[]{};
                var20_20 = (Boolean)zzcg.zza((Method)var13_13 /* !! */ , var3_3, (Object[])var20_20);
                var21_21 = (int)var20_20.booleanValue();
            }
            if (var21_21 == 0) continue;
            var9_9 = zzdr.zzj((String)var9_9);
            zzdr.zza(var4_4, var5_5, (String)var9_9, var15_15);
        }
        var31_29 = var3_3 instanceof zzcg$zzd;
        if (var31_29) {
            var6_6 = var3_3;
            var6_6 = ((zzcg$zzd)var3_3).zzjv.iterator();
            while (var32_30 = var6_6.hasNext()) {
                var7_7 = (Map.Entry)var6_6.next();
                var33_31 = ((zzcg$zze)var7_7.getKey()).number;
                var19_19 = 13;
                var20_20 = "[";
                var11_11 = "]";
                var8_8 = oe2_0.a(var19_19, var33_31, (String)var20_20, var11_11);
                var7_7 = var7_7.getValue();
                zzdr.zza(var4_4, var5_5, (String)var8_8, var7_7);
            }
        }
        if ((var3_3 = ((zzcg)var3_3).zzjp) != null) {
            var3_3.zza(var4_4, var5_5);
        }
    }

    public static final void zza(StringBuilder stringBuilder, int n3, String string2, Object object) {
        char c2;
        int n4 = object instanceof List;
        if (n4 != 0) {
            object = ((List)object).iterator();
            while ((n4 = object.hasNext()) != 0) {
                Object e2 = object.next();
                zzdr.zza(stringBuilder, n3, string2, e2);
            }
            return;
        }
        n4 = object instanceof Map;
        if (n4 != 0) {
            object = ((Map)object).entrySet().iterator();
            while ((n4 = object.hasNext()) != 0) {
                Map.Entry entry = (Map.Entry)object.next();
                zzdr.zza(stringBuilder, n3, string2, entry);
            }
            return;
        }
        stringBuilder.append('\n');
        n4 = 0;
        Object var5_7 = null;
        char c3 = '\u0000';
        String string3 = null;
        while (true) {
            c2 = ' ';
            if (c3 >= n3) break;
            stringBuilder.append(c2);
            ++c3;
        }
        stringBuilder.append(string2);
        int n7 = object instanceof String;
        c3 = '\"';
        String string4 = ": \"";
        if (n7 != 0) {
            stringBuilder.append(string4);
            String string5 = zzet.zzc(zzbb.zzf((String)object));
            stringBuilder.append(string5);
            stringBuilder.append(c3);
            return;
        }
        n7 = object instanceof zzbb;
        if (n7 != 0) {
            stringBuilder.append(string4);
            String string6 = zzet.zzc((zzbb)object);
            stringBuilder.append(string6);
            stringBuilder.append(c3);
            return;
        }
        n7 = object instanceof zzcg;
        string3 = "}";
        string4 = "\n";
        String string7 = " {";
        if (n7 != 0) {
            stringBuilder.append(string7);
            object = (zzcg)object;
            n7 = n3 + 2;
            zzdr.zza((zzdo)object, stringBuilder, n7);
            stringBuilder.append(string4);
            while (n4 < n3) {
                stringBuilder.append(c2);
                ++n4;
            }
            stringBuilder.append(string3);
            return;
        }
        n7 = object instanceof Map.Entry;
        if (n7 != 0) {
            stringBuilder.append(string7);
            object = (Map.Entry)object;
            n7 = n3 + 2;
            string7 = object.getKey();
            String string8 = "key";
            zzdr.zza(stringBuilder, n7, string8, string7);
            string7 = "value";
            object = object.getValue();
            zzdr.zza(stringBuilder, n7, string7, object);
            stringBuilder.append(string4);
            while (n4 < n3) {
                stringBuilder.append(c2);
                ++n4;
            }
            stringBuilder.append(string3);
            return;
        }
        stringBuilder.append(": ");
        String string9 = object.toString();
        stringBuilder.append(string9);
    }

    private static final String zzj(String string2) {
        int n3;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i3 = 0; i3 < (n3 = string2.length()); ++i3) {
            n3 = string2.charAt(i3);
            boolean bl2 = Character.isUpperCase((char)n3);
            if (bl2) {
                String string3 = "_";
                stringBuilder.append(string3);
            }
            n3 = Character.toLowerCase((char)n3);
            stringBuilder.append((char)n3);
        }
        return stringBuilder.toString();
    }
}

