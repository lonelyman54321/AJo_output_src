/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

public final class vV0$b
extends rl2_2
implements Function2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ CoroutineContext d;
    public final /* synthetic */ Function2 e;

    public vV0$b(f80_0 f80_02, CoroutineContext coroutineContext, Function2 function2) {
        this.d = coroutineContext;
        this.e = function2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CoroutineContext coroutineContext = this.d;
        Function2 function2 = this.e;
        vV0$b vV0$b = new vV0$b(f80_02, coroutineContext, function2);
        vV0$b.c = object;
        return vV0$b;
    }

    public final Object invoke(Object object, Object object2) {
        object = (ru_0)object;
        object2 = (f80_0)object2;
        object = (vV0$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((vV0$b)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object var1_1) {
        block15: {
            block14: {
                block16: {
                    var2_3 = j90_0.COROUTINE_SUSPENDED;
                    var3_4 = this.b;
                    var4_5 = this.d;
                    var5_6 = 3;
                    var6_7 = 2;
                    var7_8 = 1;
                    if (var3_4 == 0) break block16;
                    if (var3_4 != var7_8) {
                        if (var3_4 != var6_7) {
                            if (var3_4 != var5_6) {
                                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var1_1;
                            }
                            var8_9 = (ru_0)this.c;
                            vl2_2.b(var1_1);
                        } else {
                            var8_9 = (ru_0)this.c;
                            vl2_2.b(var1_1);
                        }
lbl19:
                        // 4 sources

                        while (true) {
                            var1_1 = var8_9;
                            break block14;
                            break;
                        }
                        catch (CancellationException var1_2) {
                            break block15;
                        }
                    }
                    var8_9 = (ru_0)this.c;
                    {
                        vl2_2.b(var1_1);
                        ** GOTO lbl-1000
                    }
                }
                vl2_2.b(var1_1);
                var1_1 = (ru_0)this.c;
            }
            var3_4 = (int)mm0.g(var4_5);
            if (var3_4 == 0) {
                return Unit.a;
            }
            try {
                var8_9 = this.e;
                this.c = var1_1;
                this.b = var7_8;
                var8_9 = var8_9.invoke(var1_1, this);
                if (var8_9 == var2_3) {
                    return var2_3;
                }
                var8_9 = var1_1;
            }
            catch (CancellationException var9_10) {
                var8_9 = var1_1;
                var1_1 = var9_10;
                break block15;
            }
lbl-1000:
            // 2 sources

            {
                this.c = var8_9;
                this.b = var6_7;
                var1_1 = vv0_0.a((ru_0)var8_9, this);
                if (var1_1 != var2_3) ** GOTO lbl19
                return var2_3;
            }
        }
        var10_11 = mm0.g(var4_5);
        if (!var10_11) {
            throw var1_1;
        }
        this.c = var8_9;
        this.b = var5_6;
        ** while ((var1_1 = vv0_0.a((ru_0)var8_9, (f80_0)this)) != var2_3)
lbl59:
        // 1 sources

        return var2_3;
    }
}

