/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.f;
import kotlin.text.b;

public final class t10 {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static Method a(Method[] var0, String var1_1, Class ... var2_2) {
        var3_3 /* !! */  = var0;
        var4_4 = var1_1;
        var5_5 = var2_2;
        var6_6 = var0.length;
        var7_7 = false;
        var8_8 = null;
        var9_9 = 0;
        block0: while (true) {
            block8: {
                block6: {
                    block7: {
                        if (var9_9 >= var6_6) break block6;
                        var10_10 = var3_3 /* !! */ [var9_9];
                        var11_11 = var10_10.getName();
                        var12_12 = Intrinsics.areEqual(var4_4, var11_11);
                        if (var12_12) break block7;
                        var11_11 = var10_10.getName();
                        var13_13 /* !! */  = new StringBuilder();
                        var13_13 /* !! */ .append(var4_4);
                        var14_14 = 45;
                        var13_13 /* !! */ .append((char)var14_14);
                        var13_13 /* !! */  = var13_13 /* !! */ .toString();
                        var12_12 = b.s(var11_11, (String)var13_13 /* !! */ , false);
                        if (!var12_12) ** GOTO lbl61
                    }
                    if ((var14_14 = ((Class<?>[])(var11_11 = var10_10.getParameterTypes())).length) != (var16_16 = (var13_13 /* !! */  = Arrays.copyOf(var5_5, var15_15 = var5_5.length)).length)) ** GOTO lbl61
                    var16_16 = ((Class<?>[])var11_11).length;
                    var17_17 = new ArrayList<Object>(var16_16);
                    var16_16 = ((Class<?>[])var11_11).length;
                    var19_19 = 0;
                    var20_20 = null;
                    break block8;
                }
                var10_10 = null;
                break;
            }
            for (var18_18 = 0; var18_18 < var16_16; ++var18_18) {
                var21_21 = var11_11[var18_18];
                var22_22 = var19_19 + 1;
                var20_20 = var13_13 /* !! */ [var19_19];
                var23_23 = rn1_2.c(var21_21);
                var7_7 = Intrinsics.areEqual(var23_23, var8_8 = rn1_2.c(var20_20));
                if (!var7_7 && !(var7_7 = var21_21.isAssignableFrom(var20_20))) {
                    var7_7 = false;
                    var8_8 = null;
                } else {
                    var7_7 = true;
                }
                var8_8 = var7_7;
                var17_17.add(var8_8);
                var19_19 = var22_22;
                var7_7 = false;
                var8_8 = null;
            }
            var7_7 = var17_17.isEmpty();
            if (var7_7) break;
            var8_8 = var17_17.iterator();
            while (var12_12 = var8_8.hasNext()) {
                var11_11 = (Boolean)var8_8.next();
                var12_12 = var11_11.booleanValue();
                if (var12_12) continue;
lbl61:
                // 3 sources

                ++var9_9;
                var7_7 = false;
                var8_8 = null;
                continue block0;
            }
            break;
        }
        if (var10_10 != null) {
            return var10_10;
        }
        var4_4 = Ft2.a(var4_4, " not found");
        var3_3 /* !! */  = new NoSuchMethodException(var4_4);
        throw var3_3 /* !! */ ;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(String object, String objectArray, b30_0 object2, Object ... object3) {
        int n3;
        Object object4;
        Serializable serializable;
        Object object5;
        int n4;
        Class[] classArray;
        Object object6;
        int n7;
        Class<?> clazz;
        block15: {
            block14: {
                clazz = Class.forName((String)object);
                n7 = ((Object)object3).length;
                object6 = Arrays.copyOf(object3, n7);
                classArray = new ArrayList();
                n4 = ((T[])object6).length;
                int n8 = 0;
                object5 = null;
                while (true) {
                    serializable = null;
                    if (n8 >= n4) break;
                    object4 = object6[n8];
                    if (object4 != null) {
                        serializable = object4.getClass();
                    }
                    if (serializable != null) {
                        classArray.add(serializable);
                    }
                    ++n8;
                }
                object6 = new Class[]{};
                object6 = (Class[])classArray.toArray((T[])object6);
                n3 = ((T[])object6).length;
                if (n3 != 0) break block14;
                n3 = 1;
                break block15;
            }
            double d2 = n3;
            double d5 = 10.0;
            d2 /= d5;
            d2 = Math.ceil(d2);
            n3 = (int)d2;
        }
        try {
            Method[] methodArray = Integer.TYPE;
            classArray = f.m(0, n3);
            int n10 = 10;
            n10 = yx_2.o(classArray, n10);
            object5 = new ArrayList(n10);
            classArray = classArray.d();
            while ((n10 = (int)(classArray.c ? 1 : 0)) != 0) {
                classArray.nextInt();
                ((ArrayList)object5).add(methodArray);
            }
            classArray = new Class[]{};
            classArray = ((ArrayList)object5).toArray(classArray);
            methodArray = clazz.getDeclaredMethods();
            n10 = 3;
            object5 = new SpreadBuilder(n10);
            ((SpreadBuilder)object5).addSpread(object6);
            object6 = b30_0.class;
            ((SpreadBuilder)object5).add(object6);
            ((SpreadBuilder)object5).addSpread(classArray);
            n7 = ((SpreadBuilder)object5).size();
            object6 = new Class[n7];
            object6 = ((SpreadBuilder)object5).toArray((Object[])object6);
            object6 = (Class[])object6;
            object6 = t10.a(methodArray, (String)objectArray, (Class[])object6);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            block17: {
                block16: {
                    try {
                        CharSequence charSequence;
                        object6 = clazz.getDeclaredMethods();
                        n3 = ((T[])object6).length;
                        Object var18_17 = null;
                        for (n4 = 0; n4 < n3; charSequence = charSequence.toString(), ++n4) {
                            object5 = object6[n4];
                            object4 = ((Method)object5).getName();
                            boolean bl2 = Intrinsics.areEqual(object4, objectArray);
                            if (bl2) break block16;
                            object4 = ((Method)object5).getName();
                            charSequence = new StringBuilder();
                            charSequence.append((String)objectArray);
                            char c2 = '-';
                            charSequence.append(c2);
                            bl2 = b.s(object4, (String)charSequence, false);
                            if (!bl2) {
                                continue;
                            }
                            break block16;
                        }
                        break block17;
                    }
                    catch (ReflectiveOperationException reflectiveOperationException2) {
                        break block17;
                    }
                }
                serializable = object5;
            }
            object6 = serializable;
        }
        if (object6 == null) {
            object3 = new StringBuilder("Composable ");
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append('.');
            ((StringBuilder)object3).append((String)objectArray);
            ((StringBuilder)object3).append(" not found");
            object = ((StringBuilder)object3).toString();
            object2 = new NoSuchMethodException((String)object);
            throw object2;
        }
        ((AccessibleObject)object6).setAccessible(true);
        int n14 = Modifier.isStatic(((Method)object6).getModifiers());
        int n15 = 0;
        objectArray = null;
        if (n14 != 0) {
            n14 = ((Object)object3).length;
            object = Arrays.copyOf(object3, n14);
            t10.c((Method)object6, null, (b30_0)object2, object);
            return;
        }
        object = clazz.getConstructor(null).newInstance(null);
        n15 = ((Object)object3).length;
        objectArray = Arrays.copyOf(object3, n15);
        t10.c((Method)object6, object, (b30_0)object2, objectArray);
    }

    public static void c(Method object, Object object2, b30_0 objectArray, Object ... objectArray2) {
        block22: {
            int n3;
            double d2;
            long l2;
            double d5;
            int n4;
            Object[] objectArray3;
            Class<?>[] classArray;
            int n7;
            int n8 = 1;
            Class<?>[] classArray2 = ((Method)object).getParameterTypes();
            int n10 = classArray2.length;
            int n14 = -1;
            if ((n10 += n14) >= 0) {
                while (true) {
                    n7 = n10 + -1;
                    classArray = classArray2[n10];
                    objectArray3 = b30_0.class;
                    n4 = Intrinsics.areEqual(classArray, objectArray3);
                    if (n4 != 0) {
                        n14 = n10;
                        break;
                    }
                    if (n7 < 0) break;
                    n10 = n7;
                }
            }
            classArray2 = null;
            n10 = object2 != null ? 1 : 0;
            if (n14 == 0) {
                n10 = 1;
            } else {
                double d7 = n10 + n14;
                d5 = 10.0;
                d7 = Math.ceil(d7 / d5);
                n10 = (int)d7;
            }
            n7 = n14 + 1;
            classArray = ((Method)object).getParameterTypes();
            n4 = classArray.length;
            if (n4 != (n10 += n7)) {
                d5 = n14;
                l2 = 4629418941960159232L;
                d2 = 31.0;
                d5 = Math.ceil(d5 / d2);
                n3 = (int)d5;
            } else {
                n3 = 0;
                objectArray3 = null;
            }
            if ((n3 += n10) != n4) break block22;
            objectArray3 = new Object[n4];
            for (int i3 = 0; i3 < n4; i3 += n8) {
                block29: {
                    Object object3;
                    block25: {
                        int n15;
                        block28: {
                            block27: {
                                block23: {
                                    block26: {
                                        block24: {
                                            if (i3 < 0 || i3 >= n14) break block23;
                                            if (i3 < 0 || i3 > (n15 = tp_2.C(objectArray2))) break block24;
                                            object3 = objectArray2[i3];
                                            break block25;
                                        }
                                        object3 = ((Method)object).getParameterTypes()[i3].getName();
                                        int n16 = ((String)object3).hashCode();
                                        switch (n16) {
                                            default: {
                                                break;
                                            }
                                            case 109413500: {
                                                String string2 = "short";
                                                n15 = (int)(((String)object3).equals(string2) ? 1 : 0);
                                                if (n15 == 0) break;
                                                object3 = (short)0;
                                                break block25;
                                            }
                                            case 97526364: {
                                                String string2 = "float";
                                                n15 = (int)(((String)object3).equals(string2) ? 1 : 0);
                                                if (n15 == 0) break;
                                                n15 = 0;
                                                object3 = Float.valueOf(0.0f);
                                                break block25;
                                            }
                                            case 64711720: {
                                                String string2 = "boolean";
                                                n15 = (int)(((String)object3).equals(string2) ? 1 : 0);
                                                if (n15 == 0) break;
                                                object3 = Boolean.FALSE;
                                                break block25;
                                            }
                                            case 3327612: {
                                                String string2 = "long";
                                                n15 = (int)(((String)object3).equals(string2) ? 1 : 0);
                                                if (n15 == 0) break;
                                                l2 = 0L;
                                                d2 = 0.0;
                                                object3 = l2;
                                                break block25;
                                            }
                                            case 3052374: {
                                                String string2 = "char";
                                                n15 = (int)(((String)object3).equals(string2) ? 1 : 0);
                                                if (n15 == 0) break;
                                                object3 = Character.valueOf('\u0000');
                                                break block25;
                                            }
                                            case 3039496: {
                                                String string2 = "byte";
                                                n15 = (int)(((String)object3).equals(string2) ? 1 : 0);
                                                if (n15 == 0) break;
                                                object3 = (byte)0;
                                                break block25;
                                            }
                                            case 104431: {
                                                String string2 = "int";
                                                n15 = (int)(((String)object3).equals(string2) ? 1 : 0);
                                                if (n15 == 0) break;
                                                object3 = 0;
                                                break block25;
                                            }
                                            case -1325958191: {
                                                String string2 = "double";
                                                n15 = (int)(((String)object3).equals(string2) ? 1 : 0);
                                                if (n15 != 0) break block26;
                                            }
                                        }
                                        n15 = 0;
                                        object3 = null;
                                        break block25;
                                    }
                                    l2 = 0L;
                                    d2 = 0.0;
                                    object3 = d2;
                                    break block25;
                                }
                                if (i3 != n14) break block27;
                                object3 = objectArray;
                                break block25;
                            }
                            if (n7 > i3 || i3 >= n10) break block28;
                            object3 = 0;
                            break block25;
                        }
                        if (n10 > i3 || i3 >= n4) break block29;
                        n15 = 0x1FFFFF;
                        object3 = n15;
                    }
                    objectArray3[i3] = object3;
                    continue;
                }
                object2 = "Unexpected index".toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
            objectArray = Arrays.copyOf(objectArray3, n4);
            ((Method)object).invoke(object2, objectArray);
            return;
        }
        object2 = "params don't add up to total params".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

