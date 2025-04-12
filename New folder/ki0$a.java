/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class ki0$a {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object a(List var0, xh1 var1_1, f80_0 var2_2) {
        block14: {
            block13: {
                block12: {
                    var3_4 = var2_2 instanceof ii0_1;
                    if (!var3_4) ** GOTO lbl-1000
                    var4_5 = var2_2;
                    var4_5 = (ii0_1)var2_2;
                    var5_6 = var4_5.d;
                    var6_7 = -1 << -1;
                    var7_8 = var5_6 & var6_7;
                    if (var7_8 != 0) {
                        var4_5.d = var5_6 -= var6_7;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_5 = new h80_0((f80_0)var2_2);
                    }
                    var2_2 = var4_5.c;
                    var8_9 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                    var6_7 = var4_5.d;
                    var7_8 = 2;
                    var9_10 = 1;
                    if (var6_7 != 0) {
                        if (var6_7 != var9_10) {
                            if (var6_7 != var7_8) {
                                var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var0;
                            }
                            var0 = var4_5.b;
                            var1_1 = (Ref$ObjectRef)var4_5.a;
                            try {
                                vl2_2.b(var2_2);
                                break block12;
                            }
                            catch (Throwable var2_3) {
                                break block13;
                            }
                        }
                        var0 = (List)var4_5.a;
                        vl2_2.b(var2_2);
                    } else {
                        vl2_2.b(var2_2);
                        var2_2 = new ArrayList();
                        var10_11 = new ji0_0((List)var0, (ArrayList)var2_2, null);
                        var4_5.a = var2_2;
                        var4_5.d = var9_10;
                        var0 = var1_1.a((ji0_0)var10_11, var4_5);
                        if (var0 == var8_9 /* !! */ ) {
                            return var8_9 /* !! */ ;
                        }
                        var0 = var2_2;
                    }
                    var1_1 = new Ref$ObjectRef();
                    var0 = ((Iterable)var0).iterator();
                }
lbl44:
                // 3 sources

                while (true) {
                    if (!(var11_12 = var0.hasNext())) {
                        var0 = (Throwable)var1_1.element;
                        if (var0 != null) throw var0;
                        return Unit.a;
                    }
                    var2_2 = (Function1)var0.next();
                    {
                        var4_5.a = var1_1;
                        var4_5.b = var0;
                        var4_5.d = var7_8;
                        if ((var2_2 = var2_2.invoke(var4_5)) != var8_9 /* !! */ ) continue;
                        return var8_9 /* !! */ ;
                    }
                    break;
                }
            }
            var10_11 = var1_1.element;
            if (var10_11 != null) break block14;
            var1_1.element = var2_3;
            ** GOTO lbl44
        }
        Intrinsics.checkNotNull(var10_11);
        var10_11 = (Throwable)var1_1.element;
        yc0_2.a((Throwable)var10_11, var2_3);
        ** while (true)
    }
}

