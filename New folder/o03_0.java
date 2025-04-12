/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from o03
 */
public final class o03_0 {
    /*
     * Unable to fully structure code
     */
    public static final KSerializer a(i0_0 var0, kn1_1 var1_1, boolean var2_2) {
        block22: {
            block21: {
                block23: {
                    block24: {
                        var3_3 = kt2_2.c((kn1_1)var1_1);
                        var4_4 = var1_1.isMarkedNullable();
                        var1_1 = var1_1.getArguments();
                        var6_6 = yx_2.o((Iterable)var1_1, 10);
                        var5_5 = new ArrayList<kn1_1>(var6_6);
                        var1_1 = var1_1.iterator();
                        while ((var6_6 = (int)var1_1.hasNext()) != 0) {
                            var7_7 = (KTypeProjection)var1_1.next();
                            Intrinsics.checkNotNullParameter(var7_7, "<this>");
                            var8_8 = var7_7.b;
                            if (var8_8 != null) {
                                var5_5.add((kn1_1)var8_8);
                                continue;
                            }
                            var0 = new StringBuilder("Star projections in type arguments are not allowed, but had ");
                            var1_1 = var7_7.b;
                            var0.append(var1_1);
                            var0 = var0.toString();
                            var0 = var0.toString();
                            var1_1 = new IllegalArgumentException((String)var0);
                            throw var1_1;
                        }
                        var9_9 = var5_5.isEmpty();
                        var7_7 = "clazz";
                        var8_8 = null;
                        if (!var9_9) break block23;
                        var9_9 = gt2_2.d(var3_3);
                        if (var9_9) {
                            var1_1 = mz0_2.a;
                            if ((var1_1 = var0.K(var3_3, (List)var1_1)) != null) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    var9_9 = false;
                                    var1_1 = null;
                                    break block21;
                                    break;
                                }
                            }
                        }
                        var1_1 = l03_0.a;
                        Intrinsics.checkNotNullParameter(var3_3, (String)var7_7);
                        if (var4_4) break block24;
                        var1_1 = l03_0.a.a(var3_3);
                        if (var1_1 == null) ** GOTO lbl-1000
                        break block21;
                    }
                    var1_1 = l03_0.b.a(var3_3);
                    break block21;
                }
                var9_9 = var0.L();
                if (!var9_9) ** break;
                ** while (true)
                var1_1 = l03_0.a;
                Intrinsics.checkNotNullParameter(var3_3, (String)var7_7);
                var1_1 = "types";
                Intrinsics.checkNotNullParameter(var5_5, (String)var1_1);
                var1_1 = var4_4 == false ? l03_0.c.a(var3_3, var5_5) : l03_0.d.a(var3_3, var5_5);
                var7_7 = tl2_2.b;
                var6_6 = var1_1 instanceof tL2$b;
                if (var6_6 != 0) {
                    var9_9 = false;
                    var1_1 = null;
                }
                var1_1 = (KSerializer)var1_1;
            }
            if (var1_1 != null) {
                return var1_1;
            }
            var9_9 = var5_5.isEmpty();
            if (var9_9) {
                var1_1 = m03_0.d(var3_3);
                if (var1_1 == null) {
                    var1_1 = mz0_2.a;
                    if ((var1_1 = var0.K(var3_3, (List)var1_1)) == null) {
                        var10_10 = gt2_2.d(var3_3);
                        if (var10_10) {
                            var0 = new qw2_2(var3_3);
lbl71:
                            // 2 sources

                            while (true) {
                                var1_1 = var0;
                                break block22;
                                break;
                            }
                        }
                        while (true) {
                            var9_9 = false;
                            var1_1 = null;
                            break;
                        }
                    }
                }
            } else {
                var1_1 = m03_0.e((i0_0)var0, var5_5, var2_2);
                if (var1_1 == null) {
                    return null;
                }
                var11_12 = new n03_0(var5_5);
                if ((var11_12 = m03_0.a(var3_3, (ArrayList)var1_1, (Function0)var11_12)) == null) {
                    if ((var1_1 = var0.K(var3_3, (List)var1_1)) == null) {
                        if (!(var10_11 = gt2_2.d(var3_3))) ** continue;
                        var0 = new qw2_2(var3_3);
                        ** continue;
                    }
                } else {
                    var1_1 = var11_12;
                }
            }
        }
        if (var1_1 != null) {
            if (var4_4) {
                var8_8 = var0 = xe_1.p((KSerializer)var1_1);
            } else {
                var0 = "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>";
                Intrinsics.checkNotNull(var1_1, (String)var0);
                var8_8 = var1_1;
            }
        }
        return var8_8;
    }
}

