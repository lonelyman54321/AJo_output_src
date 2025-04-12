/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzb;
import com.google.android.gms.internal.measurement.zzkg$zze;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.internal.measurement.zzmq;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

final class zzlr {
    private static final char[] zza;

    static {
        char[] cArray = new char[80];
        zza = cArray;
        Arrays.fill(cArray, ' ');
    }

    public static String zza(zzlm zzlm2, String charSequence) {
        charSequence = nn_2.a("# ", (String)charSequence);
        zzlr.zza(zzlm2, (StringBuilder)charSequence, 0);
        return ((StringBuilder)charSequence).toString();
    }

    private static void zza(int n3, StringBuilder stringBuilder) {
        while (n3 > 0) {
            char[] cArray = zza;
            int n4 = cArray.length;
            n4 = n3 > n4 ? cArray.length : n3;
            stringBuilder.append(cArray, 0, n4);
            n3 -= n4;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void zza(zzlm var0, StringBuilder var1_1, int var2_2) {
        var3_3 = var0;
        var4_4 = var1_1;
        var5_5 = var2_2;
        var6_6 = new HashSet();
        var7_7 = new HashMap<String, Class<?>>();
        var8_8 = new TreeMap<String, Class<Object>>();
        var9_9 = var0.getClass().getDeclaredMethods();
        var10_10 = ((Method[])var9_9).length;
        var11_11 = 0;
        var12_12 = null;
        while (true) {
            var13_13 = "get";
            var14_14 = "has";
            var15_15 = "set";
            var16_16 = 3;
            var17_17 = 4.2E-45f;
            if (var11_11 >= var10_10) break;
            var18_18 = var9_9[var11_11];
            var19_19 = Modifier.isStatic(var18_18.getModifiers());
            if (var19_19 == 0 && (var19_19 = (var20_20 = var18_18.getName()).length()) >= var16_16) {
                var21_21 = var18_18.getName();
                var22_22 = var21_21.startsWith((String)var15_15);
                if (var22_22 != 0) {
                    var13_13 = var18_18.getName();
                    var6_6.add(var13_13);
                } else {
                    var22_22 = Modifier.isPublic(var18_18.getModifiers());
                    if (var22_22 != 0 && (var22_22 = ((Class<?>[])(var15_15 = var18_18.getParameterTypes())).length) == 0) {
                        var15_15 = var18_18.getName();
                        var23_23 = var15_15.startsWith(var14_14);
                        if (var23_23) {
                            var13_13 = var18_18.getName();
                            var7_7.put(var13_13, (Class<?>)var18_18);
                        } else {
                            var14_14 = var18_18.getName();
                            var24_24 = var14_14.startsWith(var13_13);
                            if (var24_24) {
                                var13_13 = var18_18.getName();
                                var8_8.put(var13_13, (Class<Object>)var18_18);
                            }
                        }
                    }
                }
            }
            ++var11_11;
        }
        var9_9 = var8_8.entrySet().iterator();
        block1: while ((var10_10 = (int)var9_9.hasNext()) != 0) {
            block29: {
                block22: {
                    block19: {
                        block28: {
                            block27: {
                                block26: {
                                    block25: {
                                        block24: {
                                            block23: {
                                                block21: {
                                                    block20: {
                                                        var25_25 = (Map.Entry)var9_9.next();
                                                        var12_12 = ((String)var25_25.getKey()).substring(var16_16);
                                                        var19_19 = (int)var12_12.endsWith((String)(var18_18 = "List"));
                                                        if (var19_19 != 0 && (var19_19 = (int)var12_12.endsWith((String)(var20_20 = "OrBuilderList"))) == 0 && (var26_26 = (int)var12_12.equals(var18_18)) == 0 && (var18_18 = (Method)var25_25.getValue()) != null && (var16_16 = (int)(var20_20 = var18_18.getReturnType()).equals(var21_21 = List.class)) != 0) {
                                                            var10_10 = var12_12.length() + -4;
                                                            var25_25 = var12_12.substring(0, var10_10);
                                                            var12_12 = new Object[]{};
                                                            var12_12 = zzkg.zza(var18_18, var3_3, (Object[])var12_12);
                                                            zzlr.zza(var4_4, var5_5, (String)var25_25, var12_12);
lbl56:
                                                            // 7 sources

                                                            while (true) {
                                                                var16_16 = 3;
                                                                var17_17 = 4.2E-45f;
                                                                continue block1;
                                                                break;
                                                            }
                                                        }
                                                        var21_21 = "Map";
                                                        var26_26 = var12_12.endsWith((String)var21_21);
                                                        if (var26_26 == 0 || (var16_16 = (int)var12_12.equals(var21_21)) != 0 || (var21_21 = (Method)var25_25.getValue()) == null || (var26_26 = (int)(var18_18 = var21_21.getReturnType()).equals(var20_20 = Map.class)) == 0 || (var26_26 = (int)var21_21.isAnnotationPresent((Class<? extends Annotation>)(var18_18 = Deprecated.class))) != 0 || (var26_26 = (int)Modifier.isPublic(var21_21.getModifiers())) == 0) break block20;
                                                        var10_10 = var12_12.length();
                                                        var26_26 = 3;
                                                        var25_25 = var12_12.substring(0, var10_10 -= var26_26);
                                                        var12_12 = new Object[]{};
                                                        var12_12 = zzkg.zza((Method)var21_21, var3_3, (Object[])var12_12);
                                                        zzlr.zza(var4_4, var5_5, (String)var25_25, var12_12);
                                                        ** GOTO lbl56
                                                    }
                                                    var26_26 = 3;
                                                    var21_21 = var15_15.concat((String)var12_12);
                                                    var16_16 = (int)var6_6.contains(var21_21);
                                                    if (var16_16 == 0) ** GOTO lbl56
                                                    var21_21 = "Bytes";
                                                    var16_16 = (int)var12_12.endsWith((String)var21_21);
                                                    if (var16_16 == 0) break block21;
                                                    var16_16 = var12_12.length() + -5;
                                                    var21_21 = var12_12.substring(0, var16_16);
                                                    var20_20 = new StringBuilder(var13_13);
                                                    var20_20.append((String)var21_21);
                                                    var21_21 = var20_20.toString();
                                                    var16_16 = (int)var8_8.containsKey(var21_21);
                                                    if (var16_16 != 0) ** GOTO lbl56
                                                }
                                                var25_25 = (Method)var25_25.getValue();
                                                var21_21 = var14_14.concat((String)var12_12);
                                                var21_21 = (Method)var7_7.get(var21_21);
                                                if (var25_25 == null) ** GOTO lbl56
                                                var20_20 = new Object[]{};
                                                var25_25 = zzkg.zza((Method)var25_25, var3_3, var20_20);
                                                if (var21_21 != null) break block22;
                                                var16_16 = var25_25 instanceof Boolean;
                                                var19_19 = 1;
                                                if (var16_16 != 0) {
                                                    var21_21 = var25_25;
                                                    var21_21 = (Boolean)var25_25;
                                                    var16_16 = (int)var21_21.booleanValue();
                                                    if (var16_16 == 0) lbl-1000:
                                                    // 6 sources

                                                    {
                                                        while (true) {
                                                            var16_16 = 1;
                                                            var17_17 = 1.4E-45f;
                                                            break block19;
                                                            break;
                                                        }
                                                    }
lbl105:
                                                    // 8 sources

                                                    while (true) {
                                                        var16_16 = 0;
                                                        var17_17 = 0.0f;
                                                        var21_21 = null;
                                                        break block19;
                                                        break;
                                                    }
                                                }
                                                var16_16 = var25_25 instanceof Integer;
                                                if (var16_16 == 0) break block23;
                                                var21_21 = var25_25;
                                                var21_21 = (Integer)var25_25;
                                                var16_16 = var21_21.intValue();
                                                if (var16_16 != 0) ** GOTO lbl105
                                                ** GOTO lbl-1000
                                            }
                                            var16_16 = var25_25 instanceof Float;
                                            if (var16_16 == 0) break block24;
                                            var21_21 = var25_25;
                                            var21_21 = (Float)var25_25;
                                            var17_17 = var21_21.floatValue();
                                            var16_16 = Float.floatToRawIntBits(var17_17);
                                            if (var16_16 != 0) ** GOTO lbl105
                                            ** GOTO lbl-1000
                                        }
                                        var16_16 = var25_25 instanceof Double;
                                        if (var16_16 == 0) break block25;
                                        var21_21 = var25_25;
                                        var21_21 = (Double)var25_25;
                                        var27_27 = var21_21.doubleValue();
                                        var29_28 = Double.doubleToRawLongBits(var27_27);
                                        cfr_temp_0 = var29_28 - (var31_29 = 0L);
                                        var16_16 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                        if (var16_16 != 0) ** GOTO lbl105
                                        ** GOTO lbl-1000
                                    }
                                    var16_16 = var25_25 instanceof String;
                                    if (var16_16 == 0) break block26;
                                    var21_21 = "";
                                    var16_16 = (int)var25_25.equals(var21_21);
                                    break block19;
                                }
                                var16_16 = var25_25 instanceof zziy;
                                if (var16_16 == 0) break block27;
                                var21_21 = zziy.zza;
                                var16_16 = (int)var25_25.equals(var21_21);
                                break block19;
                            }
                            var16_16 = var25_25 instanceof zzlm;
                            if (var16_16 == 0) break block28;
                            var21_21 = var25_25;
                            var21_21 = ((zzlm)var25_25).zzal();
                            if (var25_25 != var21_21) ** GOTO lbl105
                            ** GOTO lbl-1000
                        }
                        var16_16 = var25_25 instanceof Enum;
                        if (var16_16 == 0) ** GOTO lbl105
                        var21_21 = var25_25;
                        var21_21 = (Enum)var25_25;
                        var16_16 = var21_21.ordinal();
                        if (var16_16 == 0) ** break;
                        ** continue;
                        ** continue;
                    }
                    if (var16_16 != 0) {
                        var19_19 = 0;
                        var20_20 = null;
                    }
                    break block29;
                }
                var20_20 = new Object[]{};
                var21_21 = (Boolean)zzkg.zza((Method)var21_21, var3_3, var20_20);
                var19_19 = (int)var21_21.booleanValue();
            }
            if (var19_19 == 0) ** GOTO lbl56
            zzlr.zza(var4_4, var5_5, (String)var12_12, var25_25);
            ** continue;
        }
        var33_30 = var3_3 instanceof zzkg$zzb;
        if (var33_30) {
            var6_6 = var3_3;
            var6_6 = ((zzkg$zzb)var3_3).zzc.zzd();
            var34_31 = var6_6.hasNext();
            if (var34_31) {
                var3_3 = (zzkg$zze)((Map.Entry)var6_6.next()).getKey();
                var3_3 = new NoSuchMethodError();
                throw var3_3;
            }
        }
        if ((var3_3 = ((zzkg)var3_3).zzb) != null) {
            var3_3.zza(var4_4, var5_5);
        }
    }

    public static void zza(StringBuilder stringBuilder, int n3, String string2, Object object) {
        String string3;
        CharSequence charSequence;
        char c2 = object instanceof List;
        if (c2 != '\u0000') {
            object = ((List)object).iterator();
            while ((c2 = object.hasNext()) != '\u0000') {
                Object e2 = object.next();
                zzlr.zza(stringBuilder, n3, string2, e2);
            }
            return;
        }
        c2 = object instanceof Map;
        if (c2 != '\u0000') {
            object = ((Map)object).entrySet().iterator();
            while ((c2 = object.hasNext()) != '\u0000') {
                Map.Entry entry = (Map.Entry)object.next();
                zzlr.zza(stringBuilder, n3, string2, entry);
            }
            return;
        }
        stringBuilder.append('\n');
        zzlr.zza(n3, stringBuilder);
        c2 = string2.isEmpty();
        if (c2 == '\u0000') {
            char c3;
            charSequence = new StringBuilder();
            string3 = null;
            int n4 = Character.toLowerCase(string2.charAt(0));
            ((StringBuilder)charSequence).append((char)n4);
            for (n4 = 1; n4 < (c3 = string2.length()); ++n4) {
                c3 = string2.charAt(n4);
                boolean bl2 = Character.isUpperCase(c3);
                if (bl2) {
                    String string4 = "_";
                    ((StringBuilder)charSequence).append(string4);
                }
                c3 = Character.toLowerCase(c3);
                ((StringBuilder)charSequence).append(c3);
            }
            string2 = ((StringBuilder)charSequence).toString();
        }
        stringBuilder.append(string2);
        int n7 = object instanceof String;
        c2 = '\"';
        string3 = ": \"";
        if (n7 != 0) {
            stringBuilder.append(string3);
            String string5 = zzmq.zza(zziy.zza((String)object));
            stringBuilder.append(string5);
            stringBuilder.append(c2);
            return;
        }
        n7 = object instanceof zziy;
        if (n7 != 0) {
            stringBuilder.append(string3);
            String string6 = zzmq.zza((zziy)object);
            stringBuilder.append(string6);
            stringBuilder.append(c2);
            return;
        }
        n7 = object instanceof zzkg;
        charSequence = "}";
        string3 = "\n";
        String string7 = " {";
        if (n7 != 0) {
            stringBuilder.append(string7);
            object = (zzkg)object;
            n7 = n3 + 2;
            zzlr.zza((zzlm)object, stringBuilder, n7);
            stringBuilder.append(string3);
            zzlr.zza(n3, stringBuilder);
            stringBuilder.append((String)charSequence);
            return;
        }
        n7 = object instanceof Map.Entry;
        if (n7 != 0) {
            stringBuilder.append(string7);
            object = (Map.Entry)object;
            n7 = n3 + 2;
            string7 = object.getKey();
            zzlr.zza(stringBuilder, n7, "key", string7);
            object = object.getValue();
            zzlr.zza(stringBuilder, n7, "value", object);
            stringBuilder.append(string3);
            zzlr.zza(n3, stringBuilder);
            stringBuilder.append((String)charSequence);
            return;
        }
        stringBuilder.append(": ");
        stringBuilder.append(object);
    }
}

