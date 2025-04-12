/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.b;
import androidx.lifecycle.e_0;
import androidx.lifecycle.p;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qu1
 */
public final class qu1_2 {
    public static final HashMap a;
    public static final HashMap b;

    static {
        HashMap hashMap;
        a = hashMap = new HashMap();
        b = hashMap = new HashMap();
    }

    public static e_0 a(Constructor constructor, Object object) {
        IllegalAccessException illegalAccessException2;
        block9: {
            InstantiationException instantiationException2;
            block8: {
                int n3 = 1;
                Object[] objectArray = new Object[n3];
                objectArray[0] = object;
                constructor = constructor.newInstance(objectArray);
                object = "{\n            constructo\u2026tance(`object`)\n        }";
                try {
                    Intrinsics.checkNotNullExpressionValue(constructor, (String)object);
                    return (e_0)((Object)constructor);
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (InstantiationException instantiationException2) {
                    break block8;
                }
                catch (IllegalAccessException illegalAccessException2) {
                    break block9;
                }
                object = new RuntimeException(invocationTargetException);
                throw object;
            }
            object = new RuntimeException(instantiationException2);
            throw object;
        }
        object = new RuntimeException(illegalAccessException2);
        throw object;
    }

    public static final String b(String string2) {
        Intrinsics.checkNotNullParameter(string2, "className");
        StringBuilder stringBuilder = new StringBuilder();
        string2 = kotlin.text.b.n(string2, ".", "_", false);
        return h30_0.a(stringBuilder, string2, "_LifecycleAdapter");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int c(Class var0) {
        block31: {
            block29: {
                block28: {
                    block27: {
                        var1_3 = null;
                        var2_4 = 1;
                        var3_5 = qu1_2.a;
                        var4_6 = (Integer)var3_5.get(var0);
                        if (var4_6 != null) {
                            return var4_6.intValue();
                        }
                        var4_6 = var0.getCanonicalName();
                        if (var4_6 == null) ** GOTO lbl127
                        var5_7 = 0;
                        var4_6 = null;
                        try {
                            var6_8 /* !! */  = var0.getPackage();
                            var7_9 = var0.getCanonicalName();
                            var6_8 /* !! */  = var6_8 /* !! */  != null ? var6_8 /* !! */ .getName() : "";
                        }
                        catch (NoSuchMethodException var0_1) {
                            break block27;
                        }
                        catch (ClassNotFoundException v0) {
                            break block28;
                        }
                        var8_10 = "fullPackage";
                        {
                            Intrinsics.checkNotNullExpressionValue(var6_8 /* !! */ , (String)var8_10);
                            var9_11 = var6_8 /* !! */ .length();
                            if (var9_11 != 0) {
                                var8_10 = "name";
                                Intrinsics.checkNotNullExpressionValue(var7_9, (String)var8_10);
                                var9_11 = var6_8 /* !! */ .length() + var2_4;
                                var7_9 = var7_9.substring(var9_11);
                                var8_10 = "this as java.lang.String).substring(startIndex)";
                                Intrinsics.checkNotNullExpressionValue(var7_9, (String)var8_10);
                            }
                            var8_10 = "if (fullPackage.isEmpty(\u2026g(fullPackage.length + 1)";
                            Intrinsics.checkNotNullExpressionValue(var7_9, (String)var8_10);
                            var7_9 = qu1_2.b((String)var7_9);
                            var9_11 = var6_8 /* !! */ .length();
                            if (var9_11 != 0) {
                                var8_10 = new StringBuilder();
                                var8_10.append((String)var6_8 /* !! */ );
                                var10_12 = '.';
                                var8_10.append(var10_12);
                                var8_10.append((String)var7_9);
                                var7_9 = var8_10.toString();
                            }
                            var6_8 /* !! */  = Class.forName((String)var7_9);
                            var7_9 = "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>";
                            Intrinsics.checkNotNull(var6_8 /* !! */ , (String)var7_9);
                            var7_9 = new Class[var2_4];
                            var7_9[0] = var0;
                            var6_8 /* !! */  = var6_8 /* !! */ .getDeclaredConstructor((Class<?>)var7_9);
                            var11_13 = var6_8 /* !! */ .isAccessible();
                            if (!var11_13) {
                                var6_8 /* !! */ .setAccessible((boolean)var2_4);
                            }
                            break block29;
                        }
                    }
                    var1_3 = new RuntimeException(var0_1);
                    throw var1_3;
                }
                var10_12 = '\u0000';
                var6_8 /* !! */  = null;
            }
            var7_9 = qu1_2.b;
            var9_11 = 2;
            if (var6_8 /* !! */  == null) break block31;
            var1_3 = kotlin.collections.a.b(var6_8 /* !! */ );
            var7_9.put(var0, var1_3);
lbl66:
            // 2 sources

            while (true) {
                var2_4 = 2;
                ** GOTO lbl127
                break;
            }
        }
        var6_8 /* !! */  = androidx.lifecycle.b.c;
        var12_14 = var6_8 /* !! */ .b;
        var13_15 = (Method[])var12_14.get(var0);
        if (var13_15 != null) {
            var10_12 = var13_15.booleanValue();
        } else {
            var13_15 = var0.getDeclaredMethods();
        }
lbl79:
        // 3 sources

        while (true) {
            block30: {
                block32: {
                    if (var10_12 != '\u0000') break block30;
                    var6_8 /* !! */  = var0.getSuperclass();
                    var12_14 = lu1.class;
                    if (var6_8 /* !! */  != null && (var19_21 = var12_14.isAssignableFrom((Class<?>)var6_8 /* !! */ )) != 0) {
                        var19_21 = 1;
                    } else {
                        var19_21 = 0;
                        var13_15 = null;
                    }
                    if (var19_21 == 0) break block32;
                    var4_6 = "superclass";
                    Intrinsics.checkNotNullExpressionValue(var6_8 /* !! */ , (String)var4_6);
                    var5_7 = qu1_2.c(var6_8 /* !! */ );
                    if (var5_7 == var2_4) break block30;
                    var6_8 /* !! */  = var7_9.get(var6_8 /* !! */ );
                    Intrinsics.checkNotNull(var6_8 /* !! */ );
                    var6_8 /* !! */  = (Collection)var6_8 /* !! */ ;
                    var4_6 = new Object(var6_8 /* !! */ );
                }
                var6_8 /* !! */  = var0.getInterfaces();
                var13_15 = "klass.interfaces";
                Intrinsics.checkNotNullExpressionValue(var6_8 /* !! */ , (String)var13_15);
                var19_21 = var6_8 /* !! */ .length;
                for (var14_16 = 0; var14_16 < var19_21; var14_16 += var2_4) {
                    var16_18 = var6_8 /* !! */ [var14_16];
                    if (var16_18 != null && (var20_22 = var12_14.isAssignableFrom(var16_18)) != 0) {
                        var20_22 = 1;
                    } else {
                        var20_22 = 0;
                        var17_19 = null;
                    }
                    if (var20_22 == 0) continue;
                    var17_19 = "intrface";
                    Intrinsics.checkNotNullExpressionValue(var16_18, (String)var17_19);
                    var20_22 = qu1_2.c(var16_18);
                    if (var20_22 != var2_4) {
                        if (var4_6 == null) {
                            var4_6 = new Object();
                        }
                        var16_18 = var7_9.get(var16_18);
                        Intrinsics.checkNotNull(var16_18);
                        var16_18 = (Collection)var16_18;
                        var4_6.addAll(var16_18);
                        continue;
                    }
                    break block30;
                }
                if (var4_6 != null) {
                    var7_9.put(var0, var4_6);
                    ** continue;
                }
            }
            var1_3 = var2_4;
            var3_5.put(var0, var1_3);
            return var2_4;
        }
        catch (NoClassDefFoundError var0_2) {
            var1_3 = new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", var0_2);
            throw var1_3;
        }
        var14_16 = var13_15.length;
        var16_18 = null;
        for (var15_17 = 0; var15_17 < var14_16; var15_17 += var2_4) {
            var17_19 = var13_15[var15_17];
            var18_20 = p.class;
            if ((var17_19 = var17_19.getAnnotation(var18_20)) == null) continue;
            var6_8 /* !! */ .a(var0, var13_15);
            var10_12 = '\u0001';
            ** GOTO lbl79
        }
        var6_8 /* !! */  = Boolean.FALSE;
        var12_14.put(var0, var6_8 /* !! */ );
        var10_12 = '\u0000';
        var6_8 /* !! */  = null;
        ** while (true)
    }
}

