/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Bf3
 */
public final class bf3_2
implements fs0_2 {
    public final fs0_2 a;
    public final Function2 b;

    public bf3_2(fs0_2 fs0_22, Function2 function2) {
        this.a = fs0_22;
        this.b = function2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object c(f80_0 var1_1) {
        block10: {
            block9: {
                var2_3 = var1_1 instanceof bf3$a_1;
                if (!var2_3) ** GOTO lbl-1000
                var3_4 = var1_1;
                var3_4 = (bf3$a_1)var1_1;
                var4_5 = var3_4.e;
                var5_6 = -1 << -1;
                var6_7 = var4_5 & var5_6;
                if (var6_7 != 0) {
                    var3_4.e = var4_5 -= var5_6;
                } else lbl-1000:
                // 2 sources

                {
                    var3_4 = new bf3$a_1(this, (f80_0)var1_1);
                }
                var1_1 = var3_4.c;
                var7_8 = j90_0.COROUTINE_SUSPENDED;
                var5_6 = var3_4.e;
                var6_7 = 2;
                var8_9 = 1;
                if (var5_6 != 0) {
                    if (var5_6 != var8_9) {
                        if (var5_6 == var6_7) {
                            vl2_2.b(var1_1);
                            return Unit.a;
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var9_10 = var3_4.b;
                    var10_11 = var3_4.a;
                    try {
                        vl2_2.b(var1_1);
                        break block9;
                    }
                    catch (Throwable var1_2) {
                        break block10;
                    }
                }
                vl2_2.b(var1_1);
                var1_1 = this.a;
                var11_12 = var3_4.getContext();
                var9_10 = new yr2_2((fs0_2)var1_1, var11_12);
                {
                    var1_1 = this.b;
                    var3_4.a = this;
                    var3_4.b = var9_10;
                    var3_4.e = var8_9;
                    var1_1 = var1_1.invoke(var9_10, var3_4);
                    if (var1_1 == var7_8) {
                        return var7_8;
                    }
                    var10_11 = this;
                }
            }
            var9_10.releaseIntercepted();
            var1_1 = var10_11.a;
            var5_6 = var1_1 instanceof bf3_2;
            if (var5_6 == 0) return Unit.a;
            var1_1 = (bf3_2)var1_1;
            var5_6 = 0;
            var9_10 = null;
            var3_4.a = null;
            var3_4.b = null;
            var3_4.e = var6_7;
            if ((var1_1 = var1_1.c(var3_4)) != var7_8) return Unit.a;
            return var7_8;
        }
        var9_10.releaseIntercepted();
        throw var1_2;
    }

    public final Object emit(Object object, f80_0 f80_02) {
        return this.a.emit(object, f80_02);
    }
}

