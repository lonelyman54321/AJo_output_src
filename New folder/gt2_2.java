/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.uuid.Uuid
 *  kotlin.uuid.Uuid$Companion
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;
import kotlin.time.a;
import kotlin.time.a$a;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from gt2
 */
public final class gt2_2 {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final KSerializer a(yn1_2 var0, KSerializer ... var1_1) {
        block68: {
            block67: {
                block60: {
                    block66: {
                        block59: {
                            block58: {
                                block57: {
                                    block56: {
                                        block65: {
                                            block54: {
                                                block53: {
                                                    block64: {
                                                        block61: {
                                                            block51: {
                                                                block63: {
                                                                    block52: {
                                                                        block62: {
                                                                            block50: {
                                                                                var2_2 = var1_1;
                                                                                var3_3 /* !! */  = "<this>";
                                                                                var4_4 = var0;
                                                                                Intrinsics.checkNotNullParameter(var0, (String)var3_3 /* !! */ );
                                                                                var5_5 = "args";
                                                                                Intrinsics.checkNotNullParameter(var1_1, (String)var5_5);
                                                                                var4_4 = rn1_2.a(var0);
                                                                                var6_6 = var1_1.length;
                                                                                var2_2 = Arrays.copyOf(var1_1, var6_6);
                                                                                Intrinsics.checkNotNullParameter(var4_4, (String)var3_3 /* !! */ );
                                                                                Intrinsics.checkNotNullParameter(var2_2, (String)var5_5);
                                                                                var7_7 = var4_4.isEnum();
                                                                                var8_8 = mw2_2.class;
                                                                                var9_9 = zz2_0.class;
                                                                                if (var7_7 != 0 && (var5_5 = var4_4.getAnnotation(var9_9)) == null && (var5_5 = var4_4.getAnnotation(var8_8)) == null) {
                                                                                    var2_2 = var4_4.getEnumConstants();
                                                                                    var4_4 = var4_4.getCanonicalName();
                                                                                    Intrinsics.checkNotNullExpressionValue(var4_4, "getCanonicalName(...)");
                                                                                    var5_5 = "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>";
                                                                                    Intrinsics.checkNotNull(var2_2, (String)var5_5);
                                                                                    var2_2 = (Enum[])var2_2;
                                                                                    var3_3 /* !! */  = new na0_2((String)var4_4, (Enum[])var2_2);
                                                                                    return (KSerializer)var3_3 /* !! */ ;
                                                                                }
                                                                                var7_7 = ((KSerializer[])var2_2).length;
                                                                                var5_5 = Arrays.copyOf(var2_2, var7_7);
                                                                                var10_10 /* !! */  = "Companion";
                                                                                var11_11 = 1;
                                                                                try {
                                                                                    var10_10 /* !! */  = var4_4.getDeclaredField((String)var10_10 /* !! */ );
                                                                                    var10_10 /* !! */ .setAccessible((boolean)var11_11);
                                                                                    var10_10 /* !! */  = var10_10 /* !! */ .get(null);
                                                                                }
                                                                                catch (Throwable v0) {
                                                                                    var12_12 = 0;
                                                                                    var10_10 /* !! */  = null;
                                                                                }
                                                                                if (var10_10 /* !! */  == null) {
                                                                                    var7_7 = 0;
                                                                                    var5_5 = null;
                                                                                } else {
                                                                                    var13_13 = ((KSerializer[])var5_5).length;
                                                                                    var5_5 = Arrays.copyOf(var5_5, var13_13);
                                                                                    var5_5 = gt2_2.c(var10_10 /* !! */ , (KSerializer[])var5_5);
                                                                                }
                                                                                if (var5_5 != null) break block61;
                                                                                var5_5 = var4_4.getCanonicalName();
                                                                                var12_12 = 0;
                                                                                var10_10 /* !! */  = null;
                                                                                var14_14 = "INSTANCE";
                                                                                if (var5_5 == null || (var16_16 = b.s((String)var5_5, (String)(var15_15 = "java."), false)) != 0 || (var7_7 = (int)b.s((String)var5_5, (String)(var15_15 = "kotlin."), false)) != 0) ** GOTO lbl-1000
                                                                                var5_5 = var4_4.getDeclaredFields();
                                                                                var15_15 = "getDeclaredFields(...)";
                                                                                Intrinsics.checkNotNullExpressionValue(var5_5, (String)var15_15);
                                                                                var16_16 = ((KSerializer[])var5_5).length;
                                                                                var17_17 = false;
                                                                                var18_18 = null;
                                                                                var20_20 = null;
                                                                                var21_21 = 0;
                                                                                var22_22 = null;
                                                                                for (var19_19 = 0; var19_19 < var16_16; ++var19_19) {
                                                                                    var23_23 = var5_5[var19_19];
                                                                                    var24_24 = var23_23.getName();
                                                                                    var25_25 = Intrinsics.areEqual(var24_24, var14_14);
                                                                                    if (!var25_25 || !(var25_25 = Intrinsics.areEqual(var24_24 = var23_23.getType(), var4_4)) || !(var25_25 = Modifier.isStatic(var23_23.getModifiers()))) continue;
                                                                                    if (var21_21 == 0) {
                                                                                        var18_18 = var23_23;
                                                                                        var21_21 = 1;
                                                                                        continue;
                                                                                    }
                                                                                    break block50;
                                                                                }
                                                                                if (var21_21 != 0) break block62;
                                                                            }
                                                                            var17_17 = false;
                                                                            var18_18 = null;
                                                                        }
                                                                        if (var18_18 != null) {
                                                                            var5_5 = var18_18.get(null);
                                                                            var15_15 = var4_4.getMethods();
                                                                            var20_20 = "getMethods(...)";
                                                                            Intrinsics.checkNotNullExpressionValue(var15_15, (String)var20_20);
                                                                            var19_19 = var15_15.length;
                                                                            var23_23 = null;
                                                                            var22_22 = null;
                                                                            var17_17 = false;
                                                                            var18_18 = null;
                                                                        } else lbl-1000:
                                                                        // 3 sources

                                                                        {
                                                                            while (true) {
                                                                                var7_7 = 0;
                                                                                var5_5 = null;
                                                                                break block51;
                                                                                break;
                                                                            }
                                                                        }
                                                                        for (var21_21 = 0; var21_21 < var19_19; ++var21_21) {
                                                                            var24_24 = var15_15[var21_21];
                                                                            var10_10 /* !! */  = var24_24.getName();
                                                                            var12_12 = (int)Intrinsics.areEqual(var10_10 /* !! */ , var26_26 = "serializer");
                                                                            if (var12_12 != 0) {
                                                                                var10_10 /* !! */  = var24_24.getParameterTypes();
                                                                                var26_26 = "getParameterTypes(...)";
                                                                                Intrinsics.checkNotNullExpressionValue(var10_10 /* !! */ , (String)var26_26);
                                                                                var12_12 = var10_10 /* !! */ .length;
                                                                                if (var12_12 == 0 && (var12_12 = (int)Intrinsics.areEqual(var10_10 /* !! */  = var24_24.getReturnType(), var26_26 = KSerializer.class)) != 0) {
                                                                                    if (var17_17) break block52;
                                                                                    var23_23 = var24_24;
                                                                                    var17_17 = true;
                                                                                }
                                                                            }
                                                                            var12_12 = 0;
                                                                            var10_10 /* !! */  = null;
                                                                            var11_11 = 1;
                                                                        }
                                                                        if (var17_17) break block63;
                                                                    }
                                                                    var23_23 = null;
                                                                }
                                                                ** while (var23_23 == null || (var12_12 = (var5_5 = var23_23.invoke((Object)var5_5, null)) instanceof KSerializer) == 0)
lbl110:
                                                                // 1 sources

                                                                var5_5 = (KSerializer)var5_5;
                                                            }
                                                            if (var5_5 == null) break block64;
                                                        }
                                                        var3_3 /* !! */  = var5_5;
                                                        return (KSerializer)var3_3 /* !! */ ;
                                                    }
                                                    var7_7 = ((Object[])var2_2).length;
                                                    var2_2 = (KSerializer[])Arrays.copyOf(var2_2, var7_7);
                                                    var5_5 = var4_4.getDeclaredClasses();
                                                    var10_10 /* !! */  = "getDeclaredClasses(...)";
                                                    Intrinsics.checkNotNullExpressionValue(var5_5, (String)var10_10 /* !! */ );
                                                    var11_11 = ((KSerializer[])var5_5).length;
                                                    var15_15 = null;
                                                    for (var16_16 = 0; var16_16 < var11_11; ++var16_16) {
                                                        var20_20 = var5_5[var16_16];
                                                        var22_22 = var20_20.getAnnotation(es1_2.class);
                                                        if (var22_22 == null) {
                                                            continue;
                                                        }
                                                        break block53;
                                                    }
                                                    var19_19 = 0;
                                                    var20_20 = null;
                                                }
                                                if (var20_20 == null) {
                                                    var7_7 = 0;
                                                    var5_5 = null;
                                                    var11_11 = 1;
                                                } else {
                                                    block55: {
                                                        var5_5 = var20_20.getSimpleName();
                                                        var26_26 = "getSimpleName(...)";
                                                        Intrinsics.checkNotNullExpressionValue(var5_5, (String)var26_26);
                                                        var5_5 = var4_4.getDeclaredField((String)var5_5);
                                                        var11_11 = 1;
                                                        try {
                                                            var5_5.setAccessible((boolean)var11_11);
                                                            var5_5 = var5_5.get(null);
                                                            break block54;
                                                        }
                                                        catch (Throwable v1) {
                                                            break block55;
                                                        }
                                                        catch (Throwable v2) {
                                                            var11_11 = 1;
                                                        }
                                                    }
                                                    var7_7 = 0;
                                                    var5_5 = null;
                                                }
                                            }
                                            if (var5_5 == null) break block65;
                                            var16_16 = ((Object[])var2_2).length;
                                            var2_2 = (KSerializer[])Arrays.copyOf(var2_2, var16_16);
                                            if ((var2_2 = gt2_2.c(var5_5, (KSerializer[])var2_2)) != null) break block60;
                                        }
                                        try {
                                            var2_2 = var4_4.getDeclaredClasses();
                                            Intrinsics.checkNotNullExpressionValue(var2_2, (String)var10_10 /* !! */ );
                                            var7_7 = ((Object[])var2_2).length;
                                            var19_19 = 0;
                                            var20_20 = null;
                                            var10_10 /* !! */  = null;
                                            var16_16 = 0;
                                            var15_15 = null;
                                            for (var12_12 = 0; var12_12 < var7_7; ++var12_12) {
                                                var22_22 = var2_2[var12_12];
                                                var18_18 = var22_22.getSimpleName();
                                                var17_17 = Intrinsics.areEqual(var18_18, var23_23 = "$serializer");
                                                if (!var17_17) continue;
                                                if (var16_16 == 0) {
                                                    var20_20 = var22_22;
                                                    var16_16 = 1;
                                                    continue;
                                                }
                                                break block56;
                                            }
                                            if (var16_16 != 0) break block57;
                                        }
                                        catch (NoSuchFieldException v3) {}
                                    }
                                    var19_19 = 0;
                                    var20_20 = null;
                                }
                                if (var20_20 != null) {
                                    var2_2 = var20_20.getField(var14_14);
                                    if (var2_2 == null) break block58;
                                    var2_2 = var2_2.get(null);
                                    break block59;
                                }
                            }
                            var27_27 = false;
                            var2_2 = null;
                        }
                        var7_7 = var2_2 instanceof KSerializer;
                        if (var7_7 == 0) break block66;
                        var2_2 = (KSerializer)var2_2;
                        break block60;
                    }
                    var27_27 = false;
                    var2_2 = null;
                }
                if (var2_2 != null) break block67;
                var2_2 = var4_4.getAnnotation(var8_8);
                if (var2_2 == null && ((var2_2 = var4_4.getAnnotation(var9_9)) == null || !(var27_27 = Intrinsics.areEqual(var2_2 = Reflection.getOrCreateKotlinClass(var2_2.with()), var5_5 = Reflection.getOrCreateKotlinClass(qw2_2.class))))) break block68;
                Intrinsics.checkNotNullParameter(var4_4, (String)var3_3 /* !! */ );
                var3_3 /* !! */  = Reflection.getOrCreateKotlinClass((Class)var4_4);
                var2_2 = new qw2_2((yn1_2)var3_3 /* !! */ );
            }
            var3_3 /* !! */  = var2_2;
            return (KSerializer)var3_3 /* !! */ ;
        }
        var3_3 /* !! */  = null;
        return (KSerializer)var3_3 /* !! */ ;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final ng1_2 b() {
        ng1_2 ng1_22 = eh1_2.b();
        Object object = Reflection.getOrCreateKotlinClass(String.class);
        xe_1.D(StringCompanionObject.INSTANCE);
        Object object2 = pe3_2.a;
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(Character.TYPE);
        xe_1.x(CharCompanionObject.INSTANCE);
        object2 = ks_2.a;
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(char[].class);
        object2 = xe_1.c();
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(Double.TYPE);
        xe_1.y(DoubleCompanionObject.INSTANCE);
        object2 = os0_2.a;
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(double[].class);
        object2 = xe_1.d();
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(Float.TYPE);
        xe_1.z(FloatCompanionObject.INSTANCE);
        object2 = ks0_2.a;
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(float[].class);
        object2 = xe_1.e();
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(Long.TYPE);
        xe_1.B(LongCompanionObject.INSTANCE);
        object2 = mb1_2.a;
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(long[].class);
        object2 = xe_1.h();
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(mt3_0.class);
        xe_1.t(mt3_0.b);
        object2 = qt3_0.a;
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(Integer.TYPE);
        xe_1.A(IntCompanionObject.INSTANCE);
        object2 = yi1_2.a;
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(int[].class);
        object2 = xe_1.f();
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(ht3_0.class);
        xe_1.s(ht3_0.b);
        object2 = lt3_0.a;
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(Short.TYPE);
        xe_1.C(ShortCompanionObject.INSTANCE);
        object2 = n43_0.a;
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(short[].class);
        object2 = xe_1.k();
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(lu3_0.class);
        xe_1.u(lu3_0.b);
        object2 = pu3_0.a;
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(Byte.TYPE);
        xe_1.w(ByteCompanionObject.INSTANCE);
        object2 = bf_2.a;
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(byte[].class);
        object2 = xe_1.b();
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(ct3_0.class);
        xe_1.r(ct3_0.b);
        object2 = gt3_0.a;
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(Boolean.TYPE);
        xe_1.v(BooleanCompanionObject.INSTANCE);
        object2 = cz_2.a;
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(boolean[].class);
        object2 = xe_1.a();
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(Unit.class);
        object2 = xe_1.q(Unit.a);
        ng1_22.put(object, object2);
        object = Reflection.getOrCreateKotlinClass(Void.class);
        xe_1.j();
        object2 = s42_0.a;
        ng1_22.put(object, object2);
        object = a.class;
        try {
            object = Reflection.getOrCreateKotlinClass((Class)object);
            object2 = a.b;
            xe_1.E((a$a)object2);
            object2 = zw0_2.a;
            ng1_22.put(object, object2);
        }
        catch (ClassNotFoundException | NoClassDefFoundError throwable) {}
        object = nt3_0.class;
        try {
            object = Reflection.getOrCreateKotlinClass(object);
            object2 = xe_1.n();
            ng1_22.put(object, object2);
        }
        catch (ClassNotFoundException | NoClassDefFoundError throwable) {}
        object = it3_0.class;
        try {
            object = Reflection.getOrCreateKotlinClass(object);
            object2 = xe_1.m();
            ng1_22.put(object, object2);
        }
        catch (ClassNotFoundException | NoClassDefFoundError throwable) {}
        object = mu3_0.class;
        try {
            object = Reflection.getOrCreateKotlinClass(object);
            object2 = xe_1.o();
            ng1_22.put(object, object2);
        }
        catch (ClassNotFoundException | NoClassDefFoundError throwable) {}
        object = dt3_0.class;
        try {
            object = Reflection.getOrCreateKotlinClass(object);
            object2 = xe_1.l();
            ng1_22.put(object, object2);
        }
        catch (ClassNotFoundException | NoClassDefFoundError throwable) {}
        object = Uuid.class;
        try {
            object = Reflection.getOrCreateKotlinClass(object);
            object2 = Uuid.Companion;
            xe_1.F((Uuid.Companion)object2);
            object2 = tz3_0.a;
            ng1_22.put(object, object2);
        }
        catch (ClassNotFoundException | NoClassDefFoundError throwable) {
            return eh1_2.a(ng1_22);
        }
        return eh1_2.a(ng1_22);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final KSerializer c(Object object, KSerializer ... object2) {
        int n3;
        Object object3;
        Object object4;
        Object object5 = null;
        int n4 = ((KSerializer[])object2).length;
        Class<?> clazz = null;
        if (n4 == 0) {
            object4 = new Class[]{};
        } else {
            n4 = ((KSerializer[])object2).length;
            object3 = new Class[n4];
            for (n3 = 0; n3 < n4; ++n3) {
                Class<KSerializer> clazz2;
                object3[n3] = clazz2 = KSerializer.class;
            }
            object4 = object3;
        }
        clazz = object.getClass();
        object3 = "serializer";
        int n7 = ((Class[])object4).length;
        object4 = Arrays.copyOf(object4, n7);
        object4 = clazz.getDeclaredMethod((String)object3, (Class<?>)object4);
        n3 = ((Object)object2).length;
        object2 = Arrays.copyOf(object2, n3);
        object = ((Method)object4).invoke(object, (Object[])object2);
        boolean bl2 = object instanceof KSerializer;
        if (!bl2) return object5;
        try {
            return object = (KSerializer)object;
        }
        catch (InvocationTargetException invocationTargetException) {}
        object2 = invocationTargetException.getCause();
        if (object2 == null) throw invocationTargetException;
        object4 = ((Throwable)object2).getMessage();
        if (object4 == null) {
            object4 = invocationTargetException.getMessage();
        }
        object5 = new InvocationTargetException((Throwable)object2, (String)object4);
        throw object5;
        catch (NoSuchMethodException noSuchMethodException) {}
        return object5;
    }

    public static final boolean d(yn1_2 yn1_22) {
        Intrinsics.checkNotNullParameter(yn1_22, "<this>");
        return rn1_2.a(yn1_22).isInterface();
    }
}

