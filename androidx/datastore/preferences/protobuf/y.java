/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.n$c;
import androidx.datastore.preferences.protobuf.n$d;
import androidx.datastore.preferences.protobuf.p;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public final class y {
    public static final String a(String string2) {
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

    public static final void b(StringBuilder stringBuilder, int n3, String object, Object object2) {
        char c2;
        int n4 = object2 instanceof List;
        if (n4 != 0) {
            object2 = ((List)object2).iterator();
            while ((n4 = object2.hasNext()) != 0) {
                Object e2 = object2.next();
                y.b(stringBuilder, n3, (String)object, e2);
            }
            return;
        }
        n4 = object2 instanceof Map;
        if (n4 != 0) {
            object2 = ((Map)object2).entrySet().iterator();
            while ((n4 = object2.hasNext()) != 0) {
                Map.Entry entry = (Map.Entry)object2.next();
                y.b(stringBuilder, n3, (String)object, entry);
            }
            return;
        }
        stringBuilder.append('\n');
        n4 = 0;
        Object var5_7 = null;
        char c3 = '\u0000';
        String string2 = null;
        while (true) {
            c2 = ' ';
            if (c3 >= n3) break;
            stringBuilder.append(c2);
            ++c3;
        }
        stringBuilder.append((String)object);
        int n7 = object2 instanceof String;
        c3 = '\"';
        String string3 = ": \"";
        if (n7 != 0) {
            stringBuilder.append(string3);
            object2 = (String)object2;
            Object object3 = DF.b;
            object = p.a;
            object = ((String)object2).getBytes((Charset)object);
            object3 = new DF$e((byte[])object);
            object3 = nr1_0.a((DF)object3);
            stringBuilder.append((String)object3);
            stringBuilder.append(c3);
        } else {
            n7 = object2 instanceof DF;
            if (n7 != 0) {
                stringBuilder.append(string3);
                object2 = (DF)object2;
                String string4 = nr1_0.a((DF)object2);
                stringBuilder.append(string4);
                stringBuilder.append(c3);
            } else {
                n7 = object2 instanceof n;
                string2 = "}";
                string3 = "\n";
                String string5 = " {";
                if (n7 != 0) {
                    stringBuilder.append(string5);
                    object2 = (n)object2;
                    n7 = n3 + 2;
                    y.c((wo1_1)object2, stringBuilder, n7);
                    stringBuilder.append(string3);
                    while (n4 < n3) {
                        stringBuilder.append(c2);
                        ++n4;
                    }
                    stringBuilder.append(string2);
                } else {
                    n7 = object2 instanceof Map.Entry;
                    if (n7 != 0) {
                        stringBuilder.append(string5);
                        object2 = (Map.Entry)object2;
                        n7 = n3 + 2;
                        string5 = object2.getKey();
                        String string6 = "key";
                        y.b(stringBuilder, n7, string6, string5);
                        string5 = "value";
                        object2 = object2.getValue();
                        y.b(stringBuilder, n7, string5, object2);
                        stringBuilder.append(string3);
                        while (n4 < n3) {
                            stringBuilder.append(c2);
                            ++n4;
                        }
                        stringBuilder.append(string2);
                    } else {
                        stringBuilder.append(": ");
                        String string7 = object2.toString();
                        stringBuilder.append(string7);
                    }
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void c(wo1_1 var0, StringBuilder var1_1, int var2_2) {
        var3_3 = var0;
        var4_4 = var1_1;
        var5_5 = var2_2;
        var6_6 = new HashMap();
        var7_7 = new HashMap();
        var8_8 = new TreeSet();
        var9_9 = var0.getClass().getDeclaredMethods();
        var10_10 = ((Method[])var9_9).length;
        var11_11 = 0;
        var12_12 = 0;
        var13_13 = null;
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
        while (var19_19 = var8_8.hasNext()) {
            block27: {
                block18: {
                    block17: {
                        block21: {
                            block26: {
                                block25: {
                                    block24: {
                                        block23: {
                                            block22: {
                                                block20: {
                                                    block19: {
                                                        var9_9 = (String)var8_8.next();
                                                        var20_20 = "";
                                                        var13_13 = var9_9.replaceFirst(var14_14, (String)var20_20);
                                                        var15_15 = "List";
                                                        var17_17 = (int)var13_13.endsWith((String)var15_15);
                                                        var21_21 = 1;
                                                        if (var17_17 != 0 && (var17_17 = (int)var13_13.endsWith((String)(var16_16 = "OrBuilderList"))) == 0 && (var22_22 = var13_13.equals(var15_15)) == 0) {
                                                            var15_15 = new StringBuilder();
                                                            var16_16 = var13_13.substring(0, var21_21).toLowerCase();
                                                            var15_15.append((String)var16_16);
                                                            var17_17 = var13_13.length() + -4;
                                                            var16_16 = var13_13.substring(var21_21, var17_17);
                                                            var15_15.append((String)var16_16);
                                                            var15_15 = var15_15.toString();
                                                            var16_16 = (Method)var6_6.get(var9_9);
                                                            if (var16_16 != null && (var25_25 = (var23_23 = var16_16.getReturnType()).equals(var24_24 = List.class))) {
                                                                var9_9 = y.a((String)var15_15);
                                                                var20_20 = new Object[]{};
                                                                var20_20 = n.h((Method)var16_16, var3_3, (Object[])var20_20);
                                                                y.b(var4_4, var5_5, (String)var9_9, var20_20);
                                                                continue;
                                                            }
                                                        }
                                                        if ((var17_17 = (int)var13_13.endsWith((String)(var15_15 = "Map"))) != 0 && (var22_22 = var13_13.equals(var15_15)) == 0) {
                                                            var15_15 = new StringBuilder();
                                                            var16_16 = var13_13.substring(0, var21_21).toLowerCase();
                                                            var15_15.append((String)var16_16);
                                                            var17_17 = var13_13.length() + -3;
                                                            var16_16 = var13_13.substring(var21_21, var17_17);
                                                            var15_15.append((String)var16_16);
                                                            var15_15 = var15_15.toString();
                                                            var9_9 = (Method)var6_6.get(var9_9);
                                                            if (var9_9 != null && (var17_17 = (int)(var16_16 = var9_9.getReturnType()).equals(var23_23 = Map.class)) != 0 && (var17_17 = (int)var9_9.isAnnotationPresent((Class<? extends Annotation>)(var16_16 = Deprecated.class))) == 0 && (var17_17 = (int)Modifier.isPublic(var9_9.getModifiers())) != 0) {
                                                                var20_20 = y.a((String)var15_15);
                                                                var13_13 = new Object[]{};
                                                                var9_9 = n.h((Method)var9_9, var3_3, var13_13);
                                                                y.b(var4_4, var5_5, (String)var20_20, var9_9);
                                                                continue;
                                                            }
                                                        }
                                                        var9_9 = "set".concat((String)var13_13);
                                                        if ((var9_9 = (Method)var7_7.get(var9_9)) == null) continue;
                                                        var9_9 = "Bytes";
                                                        var19_19 = var13_13.endsWith((String)var9_9);
                                                        if (var19_19) {
                                                            var9_9 = new StringBuilder(var14_14);
                                                            var22_22 = var13_13.length() + -5;
                                                            var15_15 = var13_13.substring(0, var22_22);
                                                            var9_9.append((String)var15_15);
                                                            var9_9 = var9_9.toString();
                                                            var19_19 = var6_6.containsKey(var9_9);
                                                            if (var19_19) continue;
                                                        }
                                                        var9_9 = new StringBuilder();
                                                        var15_15 = var13_13.substring(0, var21_21).toLowerCase();
                                                        var9_9.append((String)var15_15);
                                                        var15_15 = var13_13.substring(var21_21);
                                                        var9_9.append((String)var15_15);
                                                        var9_9 = var9_9.toString();
                                                        var15_15 = var14_14.concat((String)var13_13);
                                                        var15_15 = (Method)var6_6.get(var15_15);
                                                        var16_16 = "has";
                                                        var13_13 = var16_16.concat((String)var13_13);
                                                        var13_13 = (Method)var6_6.get(var13_13);
                                                        if (var15_15 == null) continue;
                                                        var16_16 = new Object[]{};
                                                        var15_15 = n.h((Method)var15_15, var3_3, (Object[])var16_16);
                                                        if (var13_13 != null) break block18;
                                                        var12_12 = var15_15 instanceof Boolean;
                                                        if (var12_12 == 0) break block19;
                                                        var20_20 = var15_15;
                                                        var20_20 = (Boolean)var15_15;
                                                        var10_10 = var20_20.booleanValue() ^ var21_21;
                                                        break block17;
                                                    }
                                                    var12_12 = var15_15 instanceof Integer;
                                                    if (var12_12 == 0) break block20;
                                                    var20_20 = var15_15;
                                                    var20_20 = (Integer)var15_15;
                                                    var10_10 = var20_20.intValue();
                                                    if (var10_10 == 0) lbl-1000:
                                                    // 5 sources

                                                    {
                                                        while (true) {
                                                            var10_10 = 1;
                                                            var26_26 = 1.4E-45f;
                                                            break block17;
                                                            break;
                                                        }
                                                    }
                                                    break block21;
                                                }
                                                var12_12 = var15_15 instanceof Float;
                                                if (var12_12 == 0) break block22;
                                                var20_20 = var15_15;
                                                var20_20 = (Float)var15_15;
                                                var26_26 = var20_20.floatValue();
                                                var12_12 = 0;
                                                var13_13 = null;
                                                cfr_temp_0 = var26_26 - 0.0f;
                                                var10_10 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                                if (var10_10 != 0) break block21;
                                                ** GOTO lbl-1000
                                            }
                                            var12_12 = var15_15 instanceof Double;
                                            if (var12_12 == 0) break block23;
                                            var20_20 = var15_15;
                                            var20_20 = (Double)var15_15;
                                            var27_27 = var20_20.doubleValue();
                                            cfr_temp_1 = var27_27 - (var29_28 = 0.0);
                                            var10_10 = (int)(cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1));
                                            if (var10_10 != 0) break block21;
                                            ** GOTO lbl-1000
                                        }
                                        var12_12 = var15_15 instanceof String;
                                        if (var12_12 == 0) break block24;
                                        var10_10 = (int)var15_15.equals(var20_20);
                                        break block17;
                                    }
                                    var10_10 = var15_15 instanceof DF;
                                    if (var10_10 == 0) break block25;
                                    var20_20 = DF.b;
                                    var10_10 = (int)var15_15.equals(var20_20);
                                    break block17;
                                }
                                var10_10 = var15_15 instanceof wo1_1;
                                if (var10_10 == 0) break block26;
                                var20_20 = var15_15;
                                var20_20 = ((wo1_1)var15_15).b();
                                if (var15_15 != var20_20) break block21;
                                ** GOTO lbl-1000
                            }
                            var10_10 = var15_15 instanceof Enum;
                            if (var10_10 != 0) {
                                var20_20 = var15_15;
                                var20_20 = (Enum)var15_15;
                                var10_10 = var20_20.ordinal();
                                if (var10_10 != 0) ** break;
                                ** continue;
                            }
                        }
                        var10_10 = 0;
                        var26_26 = 0.0f;
                        var20_20 = null;
                    }
                    if (var10_10 != 0) {
                        var21_21 = 0;
                    }
                    break block27;
                }
                var20_20 = new Object[]{};
                var20_20 = (Boolean)n.h((Method)var13_13, var3_3, (Object[])var20_20);
                var21_21 = (int)var20_20.booleanValue();
            }
            if (var21_21 == 0) continue;
            var9_9 = y.a((String)var9_9);
            y.b(var4_4, var5_5, (String)var9_9, var15_15);
        }
        var31_29 = var3_3 instanceof n$c;
        if (var31_29 != 0) {
            var6_6 = var3_3;
            var6_6 = ((n$c)var3_3).extensions.i();
            while (var32_30 = var6_6.hasNext()) {
                var7_7 = (Map.Entry)var6_6.next();
                ((n$d)var7_7.getKey()).getClass();
                var8_8 = "[0]";
                var7_7 = var7_7.getValue();
                y.b(var4_4, var5_5, (String)var8_8, var7_7);
            }
        }
        if ((var3_3 = ((n)var3_3).unknownFields) != null) {
            while (var11_11 < (var31_29 = var3_3.a)) {
                var31_29 = var3_3.b[var11_11] >>> 3;
                var6_6 = String.valueOf(var31_29);
                var7_7 = var3_3.c[var11_11];
                y.b(var4_4, var5_5, (String)var6_6, var7_7);
                ++var11_11;
            }
        }
    }
}

