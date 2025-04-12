/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.util.Log
 */
import android.os.Build;
import android.util.Log;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class sk2 {
    public final Function1 a;
    public final Object b;
    public final Kl2 c;
    public final Z40 d;
    public final Z40 e;
    public final es0_2 f;

    public sk2(Function1 object, Object object2, Kl2 kl2) {
        Intrinsics.checkNotNullParameter(object, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(kl2, "config");
        this.a = object;
        this.b = object2;
        this.c = kl2;
        this.d = object = new Z40(0);
        this.e = object = new Z40(0);
        object = new tk2_1(null, this);
        this.f = object = d53.a((Function2)object);
    }

    /*
     * Unable to fully structure code
     */
    public static final Object a(sk2 var0, am2_0 var1_3, f80_0 var2_4) {
        block26: {
            block25: {
                block24: {
                    block22: {
                        block23: {
                            var0.getClass();
                            var3_5 = var2_4 instanceof uk2_2;
                            if (var3_5 == 0) ** GOTO lbl-1000
                            var4_6 = var2_4;
                            var4_6 = (uk2_2)var2_4;
                            var5_7 = var4_6.e;
                            var6_8 = -1 << -1;
                            var7_9 = var5_7 & var6_8;
                            if (var7_9 != 0) {
                                var4_6.e = var5_7 -= var6_8;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var4_6 = new uk2_2((f80_0)var2_4, (sk2)var0);
                            }
                            var2_4 = var4_6.c;
                            var8_10 = j90_0.COROUTINE_SUSPENDED;
                            var6_8 = var4_6.e;
                            var7_9 = 1;
                            if (var6_8 == 0) break block22;
                            if (var6_8 != var7_9) break block23;
                            var1_3 = var4_6.b;
                            var0 = var4_6.a;
                            vl2_2.b(var2_4);
                            break block24;
                        }
                        var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var0;
                    }
                    vl2_2.b(var2_4);
                    var4_6.a = var0;
                    var4_6.b = var1_3;
                    var4_6.e = var7_9;
                    var2_4 = var0.a.invoke(var4_6);
                    if (var2_4 == var8_10) break block25;
                }
                var8_10 = var2_4;
                var8_10 = (am2_0)var2_4;
                var9_11 = var8_10 instanceof r00;
                if (var9_11) {
                    var2_4 = var8_10;
                    var2_4 = (r00)var8_10;
                    var4_6 = var0.c;
                    var3_5 = var4_6.a;
                    var2_4.a();
                }
                if (var8_10 == var1_3) break block26;
                var10_12 = sk2.class;
                var11_13 = "invalidate";
                var12_14 = null;
                var13_15 = "invalidate()V";
                var14_16 = var2_4;
                var2_4 = new FunctionReferenceImpl(0, var0, var10_12, var11_13, var13_15, 0);
                var8_10.getClass();
                var4_6 = "onInvalidatedCallback";
                Intrinsics.checkNotNullParameter(var2_4, (String)var4_6);
                var15_17 = ((am2_0)var8_10).a;
                var14_16 = var15_17.b;
                if (var14_16 != null && (var16_18 = (var14_16 = (Boolean)var14_16.invoke()).booleanValue()) == var7_9) {
                    var15_17.a();
                }
                var16_18 = var15_17.e;
                var12_14 = var15_17.a;
                if (var16_18 != 0) {
                    var12_14.invoke(var2_4);
                } else {
                    block20: {
                        var14_16 = var15_17.c;
                        var14_16.lock();
                        var17_19 = var15_17.e;
                        if (var17_19) break block20;
                        var15_17 = var15_17.d;
                        var15_17.add(var2_4);
                        var7_9 = 0;
                    }
                    var14_16.unlock();
                    if (var7_9 != 0) {
                        var12_14.invoke(var2_4);
                    }
                }
                if (var1_3 != null) {
                    var10_12 = sk2.class;
                    var11_13 = "invalidate";
                    var12_14 = null;
                    var13_15 = "invalidate()V";
                    var14_16 = var2_4;
                    var2_4 = new FunctionReferenceImpl(0, var0, var10_12, var11_13, var13_15, 0);
                    Intrinsics.checkNotNullParameter(var2_4, (String)var4_6);
                    var0 = var1_3.a;
                    var4_6 = var0.c;
                    try {
                        var4_6.lock();
                        var0 = var0.d;
                        var0.remove(var2_4);
                    }
                    finally {
                        var4_6.unlock();
                    }
                }
                if (var1_3 != null) {
                    var1_3.b();
                }
                if ((var0 = Build.ID) != null && (var19_21 = Log.isLoggable((String)(var0 = "Paging"), (int)(var18_20 = 3)))) {
                    var0 = new StringBuilder("Generated new PagingSource ");
                    var0.append(var8_10);
                    var0 = var0.toString();
                    var1_3 = "message";
                    Intrinsics.checkNotNullParameter(var0, (String)var1_3);
                }
            }
            return var8_10;
            catch (Throwable var0_2) {
                var14_16.unlock();
                throw var0_2;
            }
        }
        var1_3 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.".toString();
        var0 = new IllegalStateException((String)var1_3);
        throw var0;
    }
}

