/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

public final class yj1
extends qg3_2
implements Function2 {
    public hs1_2 a;
    public Object b;
    public xj1 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ aS1 f;
    public final /* synthetic */ xj1 g;
    public final /* synthetic */ Function1 h;

    public yj1(aS1 aS12, xj1 xj12, Function1 function1, f80_0 f80_02) {
        this.f = aS12;
        this.g = xj12;
        this.h = function1;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        xj1 xj12 = this.g;
        Function1 function1 = this.h;
        aS1 aS12 = this.f;
        yj1 yj12 = new yj1(aS12, xj12, function1, f80_02);
        yj12.e = object;
        return yj12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (yj1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((yj1)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block30: {
            block29: {
                block31: {
                    var2_4 = j90_0.COROUTINE_SUSPENDED;
                    var3_6 = this.d;
                    var4_7 = 2;
                    var5_8 = 1;
                    if (var3_6 != 0) {
                        if (var3_6 != var5_8) {
                            if (var3_6 == var4_7) {
                                var2_4 = (xj1)this.b;
                                var6_9 = this.a;
                                var7_10 = (xj1$a)this.e;
                                try {
                                    vl2_2.b(var1_1);
                                    break block29;
                                }
                                catch (Throwable var1_2) {
                                    break block30;
                                }
                            }
                            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var1_1;
                        }
                        var6_9 = this.c;
                        var8_11 = (Function1)this.b;
                        var9_12 = this.a;
                        var10_13 = (xj1$a)this.e;
                        vl2_2.b(var1_1);
                        var1_1 = var6_9;
lbl24:
                        // 2 sources

                        while (true) {
                            var6_9 = var9_12;
                            break block31;
                            break;
                        }
                    }
                    vl2_2.b(var1_1);
                    var1_1 = (i90_0)this.e;
                    var1_1 = var1_1.getCoroutineContext();
                    var9_12 = i$a.a;
                    var1_1 = var1_1.get((CoroutineContext$a)var9_12);
                    Intrinsics.checkNotNull(var1_1);
                    var1_1 = (i)var1_1;
                    var9_12 = this.f;
                    var6_9 = new xj1$a((aS1)var9_12, (i)var1_1);
lbl36:
                    // 2 sources

                    while (true) {
                        var1_1 = this.g;
                        var9_12 = var1_1.a;
                        var10_13 = (xj1$a)var9_12.get();
                        if (var10_13 != null && (var13_16 = (var11_14 /* !! */  = var6_9.a).compareTo(var12_15 = var10_13.a)) < 0) {
                            var1_1 = new CancellationException("Current mutation had a higher priority");
                            throw var1_1;
                        }
lbl43:
                        // 3 sources

                        while (true) {
                            var13_16 = var9_12.compareAndSet(var10_13, var6_9);
                            if (var13_16 == 0) continue;
                            if (var10_13 != null) {
                                var9_12 = var10_13.b;
                                var9_12.d(null);
                            }
                            this.e = var6_9;
                            this.a = var9_12 = var1_1.b;
                            this.b = var10_13 = this.h;
                            this.c = var1_1;
                            this.d = var5_8;
                            var8_11 = var9_12.d(this, null);
                            if (var8_11 == var2_4) {
                                return var2_4;
                            }
                            var8_11 = var10_13;
                            var10_13 = var6_9;
                            ** continue;
                            break;
                        }
                        break;
                    }
                }
                this.e = var10_13;
                this.a = var9_12;
                this.b = var1_1;
                this.c = null;
                this.d = var4_7;
                var7_10 = var8_11.invoke(this);
                if (var7_10 == var2_4) {
                    return var2_4;
                }
                var2_4 = var1_1;
                var1_1 = var7_10;
                var7_10 = var10_13;
            }
            var2_4 = var2_4.a;
            while (true) {
                var5_8 = (int)var2_4.compareAndSet(var7_10, null);
                if (var5_8 != 0) break;
                if ((var8_11 = var2_4.get()) == var7_10) continue;
                break;
            }
            var6_9.b(null);
            return var1_1;
            catch (Throwable var2_5) {
                var7_10 = var10_13;
                var14_17 = var2_5;
                var2_4 = var1_1;
                var1_1 = var14_17;
            }
        }
        var2_4 = var2_4.a;
        while (true) {
            var5_8 = (int)var2_4.compareAndSet(var7_10, null);
            if (var5_8 != 0) break;
            var8_11 = var2_4.get();
            if (var8_11 == var7_10) continue;
            break;
        }
        try {
            throw var1_1;
        }
        catch (Throwable var1_3) {
            var6_9.b(null);
            throw var1_3;
        }
        ** while ((var11_14 /* !! */  = var9_12.get()) == var10_13)
lbl110:
        // 1 sources

        ** while (true)
    }
}

