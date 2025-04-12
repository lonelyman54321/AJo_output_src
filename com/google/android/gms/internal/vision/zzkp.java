/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zzc;
import com.google.android.gms.internal.vision.zzjb$zzf;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzlq;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

final class zzkp {
    public static String zza(zzkk zzkk2, String charSequence) {
        charSequence = nn_2.a("# ", (String)charSequence);
        zzkp.zza(zzkk2, (StringBuilder)charSequence, 0);
        return ((StringBuilder)charSequence).toString();
    }

    private static final String zza(String string2) {
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

    /*
     * Unable to fully structure code
     */
    private static void zza(zzkk var0, StringBuilder var1_1, int var2_2) {
        var3_3 = new HashMap();
        var4_4 = new HashMap();
        var5_5 = new TreeSet();
        var6_6 = var0.getClass().getDeclaredMethods();
        var7_7 = ((Method[])var6_6).length;
        var8_8 = null;
        var9_9 = 0;
        var10_10 = null;
        while (true) {
            var11_11 = "get";
            if (var9_9 >= var7_7) break;
            var12_12 = var6_6[var9_9];
            var13_13 = var12_12.getName();
            var4_4.put(var13_13, var12_12);
            var13_13 = var12_12.getParameterTypes();
            var14_14 = ((Class<?>[])var13_13).length;
            if (var14_14 == 0) {
                var13_13 = var12_12.getName();
                var3_3.put(var13_13, var12_12);
                var13_13 = var12_12.getName();
                var15_15 = var13_13.startsWith(var11_11);
                if (var15_15) {
                    var11_11 = var12_12.getName();
                    var5_5.add(var11_11);
                }
            }
            ++var9_9;
        }
        var5_5 = var5_5.iterator();
        while ((var16_16 = var5_5.hasNext()) != 0) {
            block26: {
                block19: {
                    block18: {
                        block25: {
                            block24: {
                                block23: {
                                    block22: {
                                        block21: {
                                            block20: {
                                                var6_6 = (String)var5_5.next();
                                                var7_7 = (int)var6_6.startsWith(var11_11);
                                                var9_9 = 3;
                                                var17_17 = var7_7 != 0 ? var6_6.substring(var9_9) : var6_6;
                                                var12_12 = "List";
                                                var14_14 = (int)var17_17.endsWith((String)var12_12);
                                                var18_18 = 1;
                                                if (var14_14 != 0 && (var14_14 = (int)var17_17.endsWith((String)(var13_13 = "OrBuilderList"))) == 0 && (var19_19 = var17_17.equals(var12_12)) == 0) {
                                                    var12_12 = String.valueOf(var17_17.substring(0, var18_18).toLowerCase());
                                                    var14_14 = var17_17.length() + -4;
                                                    var13_13 = String.valueOf(var17_17.substring(var18_18, var14_14));
                                                    var20_20 = var13_13.length();
                                                    if (var20_20 != 0) {
                                                        var12_12 = var12_12.concat((String)var13_13);
                                                    } else {
                                                        var13_13 = new String((String)var12_12);
                                                        var12_12 = var13_13;
                                                    }
                                                    var13_13 = (Method)var3_3.get(var6_6);
                                                    if (var13_13 != null && (var20_20 = (int)(var21_21 = var13_13.getReturnType()).equals(var22_22 = List.class)) != 0) {
                                                        var6_6 = zzkp.zza(var12_12);
                                                        var17_17 = new Object[]{};
                                                        var17_17 = zzjb.zza((Method)var13_13, var0, (Object[])var17_17);
                                                        zzkp.zza(var1_1, var2_2, (String)var6_6, var17_17);
                                                        continue;
                                                    }
                                                }
                                                if ((var14_14 = (int)var17_17.endsWith((String)(var12_12 = "Map"))) != 0 && (var19_19 = var17_17.equals(var12_12)) == 0) {
                                                    var12_12 = String.valueOf(var17_17.substring(0, var18_18).toLowerCase());
                                                    var14_14 = var17_17.length() - var9_9;
                                                    var10_10 = String.valueOf(var17_17.substring(var18_18, var14_14));
                                                    var10_10 = (var14_14 = var10_10.length()) != 0 ? var12_12.concat((String)var10_10) : new String((String)var12_12);
                                                    if ((var6_6 = (Method)var3_3.get(var6_6)) != null && (var19_19 = (int)(var12_12 = var6_6.getReturnType()).equals(var13_13 = Map.class)) != 0 && (var19_19 = (int)var6_6.isAnnotationPresent((Class<? extends Annotation>)(var12_12 = Deprecated.class))) == 0 && (var19_19 = (int)Modifier.isPublic(var6_6.getModifiers())) != 0) {
                                                        var17_17 = zzkp.zza((String)var10_10);
                                                        var10_10 = new Object[]{};
                                                        var6_6 = zzjb.zza((Method)var6_6, var0, (Object[])var10_10);
                                                        zzkp.zza(var1_1, var2_2, (String)var17_17, var6_6);
                                                        continue;
                                                    }
                                                }
                                                var16_16 = var17_17.length();
                                                var10_10 = "set";
                                                var6_6 = var16_16 != 0 ? var10_10.concat((String)var17_17) : new String((String)var10_10);
                                                if ((var6_6 = (Method)var4_4.get(var6_6)) == null || (var16_16 = (int)var17_17.endsWith((String)(var6_6 = "Bytes"))) != 0 && (var16_16 = (int)var3_3.containsKey(var6_6 = (var9_9 = (var6_6 = String.valueOf(var17_17.substring(0, var16_16 = var17_17.length() + -5))).length()) != 0 ? var11_11.concat((String)var6_6) : new String(var11_11))) != 0) continue;
                                                var6_6 = String.valueOf(var17_17.substring(0, var18_18).toLowerCase());
                                                var10_10 = String.valueOf(var17_17.substring(var18_18));
                                                var19_19 = var10_10.length();
                                                var6_6 = var19_19 != 0 ? var6_6.concat((String)var10_10) : (var10_10 = new String((String)var6_6));
                                                var9_9 = var17_17.length();
                                                var10_10 = var9_9 != 0 ? var11_11.concat((String)var17_17) : new String(var11_11);
                                                var10_10 = (Method)var3_3.get(var10_10);
                                                var19_19 = var17_17.length();
                                                var13_13 = "has";
                                                var17_17 = var19_19 != 0 ? var13_13.concat((String)var17_17) : new String((String)var13_13);
                                                var17_17 = (Method)var3_3.get(var17_17);
                                                if (var10_10 == null) continue;
                                                var12_12 = new Object[]{};
                                                var10_10 = zzjb.zza((Method)var10_10, var0, var12_12);
                                                if (var17_17 != null) break block19;
                                                var7_7 = var10_10 instanceof Boolean;
                                                if (var7_7 != 0) {
                                                    var17_17 = var10_10;
                                                    var17_17 = (Boolean)var10_10;
                                                    var7_7 = (int)var17_17.booleanValue();
                                                    if (var7_7 == 0) lbl-1000:
                                                    // 6 sources

                                                    {
                                                        while (true) {
                                                            var7_7 = 1;
                                                            var23_23 = 1.4E-45f;
                                                            break block18;
                                                            break;
                                                        }
                                                    }
lbl96:
                                                    // 8 sources

                                                    while (true) {
                                                        var7_7 = 0;
                                                        var23_23 = 0.0f;
                                                        var17_17 = null;
                                                        break block18;
                                                        break;
                                                    }
                                                }
                                                var7_7 = var10_10 instanceof Integer;
                                                if (var7_7 == 0) break block20;
                                                var17_17 = var10_10;
                                                var17_17 = (Integer)var10_10;
                                                var7_7 = var17_17.intValue();
                                                if (var7_7 != 0) ** GOTO lbl96
                                                ** GOTO lbl-1000
                                            }
                                            var7_7 = var10_10 instanceof Float;
                                            if (var7_7 == 0) break block21;
                                            var17_17 = var10_10;
                                            var17_17 = (Float)var10_10;
                                            var23_23 = var17_17.floatValue();
                                            var19_19 = 0;
                                            var12_12 = null;
                                            cfr_temp_0 = var23_23 - 0.0f;
                                            var7_7 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                            if (var7_7 != 0) ** GOTO lbl96
                                            ** GOTO lbl-1000
                                        }
                                        var7_7 = var10_10 instanceof Double;
                                        if (var7_7 == 0) break block22;
                                        var17_17 = var10_10;
                                        var17_17 = (Double)var10_10;
                                        var24_24 = var17_17.doubleValue();
                                        cfr_temp_1 = var24_24 - (var26_25 = 0.0);
                                        var7_7 = (int)(cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1));
                                        if (var7_7 != 0) ** GOTO lbl96
                                        ** GOTO lbl-1000
                                    }
                                    var7_7 = var10_10 instanceof String;
                                    if (var7_7 == 0) break block23;
                                    var17_17 = "";
                                    var7_7 = (int)var10_10.equals(var17_17);
                                    break block18;
                                }
                                var7_7 = var10_10 instanceof zzht;
                                if (var7_7 == 0) break block24;
                                var17_17 = zzht.zza;
                                var7_7 = (int)var10_10.equals(var17_17);
                                break block18;
                            }
                            var7_7 = var10_10 instanceof zzkk;
                            if (var7_7 == 0) break block25;
                            var17_17 = var10_10;
                            var17_17 = ((zzkk)var10_10).zzr();
                            if (var10_10 != var17_17) ** GOTO lbl96
                            ** GOTO lbl-1000
                        }
                        var7_7 = var10_10 instanceof Enum;
                        if (var7_7 == 0) ** GOTO lbl96
                        var17_17 = var10_10;
                        var17_17 = (Enum)var10_10;
                        var7_7 = var17_17.ordinal();
                        if (var7_7 == 0) ** break;
                        ** continue;
                        ** continue;
                    }
                    if (var7_7 != 0) {
                        var18_18 = 0;
                    }
                    break block26;
                }
                var12_12 = new Object[]{};
                var17_17 = (Boolean)zzjb.zza((Method)var17_17, var0, var12_12);
                var18_18 = (int)var17_17.booleanValue();
            }
            if (var18_18 == 0) continue;
            var6_6 = zzkp.zza((String)var6_6);
            zzkp.zza(var1_1, var2_2, (String)var6_6, var10_10);
        }
        var28_26 = var0 instanceof zzjb$zzc;
        if (var28_26) {
            var3_3 = var0;
            var3_3 = ((zzjb$zzc)var0).zzc.zzd();
            while (var29_27 = var3_3.hasNext()) {
                var4_4 = (Map.Entry)var3_3.next();
                var30_28 = ((zzjb$zzf)var4_4.getKey()).zzb;
                var16_16 = 13;
                var17_17 = "[";
                var8_8 = "]";
                var5_5 = oe2_0.a(var16_16, var30_28, (String)var17_17, var8_8);
                var4_4 = var4_4.getValue();
                zzkp.zza(var1_1, var2_2, (String)var5_5, var4_4);
            }
        }
        if ((var0 = ((zzjb)var0).zzb) != null) {
            var0.zza(var1_1, var2_2);
        }
    }

    public static final void zza(StringBuilder stringBuilder, int n3, String string2, Object object) {
        char c2;
        int n4 = object instanceof List;
        if (n4 != 0) {
            object = ((List)object).iterator();
            while ((n4 = object.hasNext()) != 0) {
                Object e2 = object.next();
                zzkp.zza(stringBuilder, n3, string2, e2);
            }
            return;
        }
        n4 = object instanceof Map;
        if (n4 != 0) {
            object = ((Map)object).entrySet().iterator();
            while ((n4 = object.hasNext()) != 0) {
                Map.Entry entry = (Map.Entry)object.next();
                zzkp.zza(stringBuilder, n3, string2, entry);
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
            String string5 = zzlq.zza(zzht.zza((String)object));
            stringBuilder.append(string5);
            stringBuilder.append(c3);
            return;
        }
        n7 = object instanceof zzht;
        if (n7 != 0) {
            stringBuilder.append(string4);
            String string6 = zzlq.zza((zzht)object);
            stringBuilder.append(string6);
            stringBuilder.append(c3);
            return;
        }
        n7 = object instanceof zzjb;
        string3 = "}";
        string4 = "\n";
        String string7 = " {";
        if (n7 != 0) {
            stringBuilder.append(string7);
            object = (zzjb)object;
            n7 = n3 + 2;
            zzkp.zza((zzkk)object, stringBuilder, n7);
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
            zzkp.zza(stringBuilder, n7, string8, string7);
            string7 = "value";
            object = object.getValue();
            zzkp.zza(stringBuilder, n7, string7, object);
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
}

