/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i$a;

/*
 * Renamed from tb1
 */
public final class tb1_1 {
    public final db1_2 a;
    public final da1_2 b;

    public tb1_1(db1_2 db1_22, da1_2 da1_22) {
        Intrinsics.checkNotNullParameter(db1_22, "builder");
        Intrinsics.checkNotNullParameter(da1_22, "client");
        this.a = db1_22;
        this.b = da1_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object a(jb1_2 var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof tb1$a_0;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (tb1$a_0)var2_2;
        var5_5 = var4_4.d;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.d = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new tb1$a_0(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.b;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.d;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl22
        if (var6_6 == var7_7) {
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl22:
            // 1 sources

            vl2_2.b(var2_2);
            var2_2 = var1_1.getCoroutineContext();
            var9_9 = i$a.a;
            var2_2 = var2_2.get(var9_9);
            Intrinsics.checkNotNull(var2_2);
            var2_2 = (g00_0)var2_2;
            var2_2.a();
            try {
                var1_1 = var1_1.b();
            }
            catch (Throwable v0) {}
            vf_1.a((uf_1)var1_1);
            var4_4.a = var2_2;
            var4_4.d = var7_7;
            var1_1 = var2_2.I0(var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object b(f80_0 var1_1) {
        block13: {
            block14: {
                var2_3 = var1_1 instanceof tb1$b_0;
                if (!var2_3) ** GOTO lbl-1000
                var3_4 = var1_1;
                var3_4 = (tb1$b_0)var1_1;
                var4_5 = var3_4.e;
                var5_6 = -1 << -1;
                var6_7 = var4_5 & var5_6;
                if (var6_7 != 0) {
                    var3_4.e = var4_5 -= var5_6;
                } else lbl-1000:
                // 2 sources

                {
                    var3_4 = new tb1$b_0(this, (f80_0)var1_1);
                }
                var1_1 = var3_4.c;
                var7_8 = j90_0.COROUTINE_SUSPENDED;
                var5_6 = var3_4.e;
                var6_7 = 3;
                var8_9 = 2;
                var9_10 = 1;
                if (var5_6 == 0) break block13;
                if (var5_6 == var9_10) break block14;
                if (var5_6 != var8_9) {
                    if (var5_6 != var6_7) {
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var3_4 = (jb1_2)var3_4.a;
                    try {
                        vl2_2.b(var1_1);
                        return var3_4;
                    }
                    catch (CancellationException var1_2) {
                        throw wc0_2.a(var1_2);
                    }
                }
                var10_11 = var3_4.b;
                var11_12 = (tb1_1)var3_4.a;
                {
                    vl2_2.b(var1_1);
                    ** GOTO lbl-1000
                }
            }
            var10_11 = (tb1_1)var3_4.a;
            {
                vl2_2.b(var1_1);
                ** GOTO lbl-1000
            }
        }
        vl2_2.b(var1_1);
        {
            var1_1 = new db1_2();
            var10_11 = this.a;
            var1_1.b((db1_2)var10_11);
            var10_11 = this.b;
            var3_4.a = this;
            var3_4.e = var9_10;
            var1_1 = var10_11.a((db1_2)var1_1, (f80_0)var3_4);
            if (var1_1 == var7_8) {
                return var7_8;
            }
            var10_11 = this;
        }
lbl-1000:
        // 2 sources

        {
            var1_1 = (ea1_2)var1_1;
            var3_4.a = var10_11;
            var3_4.b = var1_1;
            var3_4.e = var8_9;
            var11_12 = ls2_2.a((ea1_2)var1_1, (f80_0)var3_4);
            if (var11_12 == var7_8) {
                return var7_8;
            }
            var12_13 = var10_11;
            var10_11 = var1_1;
            var1_1 = var11_12;
            var11_12 = var12_13;
        }
lbl-1000:
        // 2 sources

        {
            var1_1 = (ea1_2)var1_1;
            var1_1 = var1_1.d();
            var10_11 = var10_11.d();
            var3_4.a = var1_1;
            var9_10 = 0;
            var3_4.b = null;
            var3_4.e = var6_7;
            var3_4 = var11_12.a((jb1_2)var10_11, (f80_0)var3_4);
            if (var3_4 != var7_8) return var1_1;
            return var7_8;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HttpStatement[");
        eu3_0 eu3_02 = this.a.a;
        stringBuilder.append(eu3_02);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

