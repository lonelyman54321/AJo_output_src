/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

/*
 * Renamed from l63
 */
public final class l63_0 {
    public final l63$b a;

    public l63_0(boolean bl2) {
        l63$b l63$b;
        this.a = l63$b = new l63$b(this, bl2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object a(int var1_1, Function1 var2_2, f80_0 var3_6) {
        block20: {
            block18: {
                block19: {
                    var4_7 = var3_6 instanceof l63$c;
                    if (!var4_7) ** GOTO lbl-1000
                    var5_8 = var3_6;
                    var5_8 = (l63$c)var3_6;
                    var6_9 = var5_8.d;
                    var7_10 = -1 << -1;
                    var8_11 = var6_9 & var7_10;
                    if (var8_11 != 0) {
                        var5_8.d = var6_9 -= var7_10;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var5_8 = new l63$c(this, (f80_0)var3_6);
                    }
                    var3_6 = var5_8.b;
                    var9_12 = j90_0.COROUTINE_SUSPENDED;
                    var7_10 = var5_8.d;
                    var8_11 = 1;
                    if (var7_10 != 0) {
                        if (var7_10 == var8_11) {
                            var10_13 = var5_8.a;
                            try {
                                vl2_2.b(var3_6);
                                break block18;
                            }
                            catch (l63$a var2_3) {
                                break block19;
                            }
                        }
                        var10_14 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var10_14;
                    }
                    vl2_2.b(var3_6);
                    var7_10 = 0;
                    var3_6 = new l63$d(this, var1_1, var2_2, null);
                    var5_8.a = this;
                    var5_8.d = var8_11;
                    try {
                        var10_15 = d.c((Function2)var3_6, var5_8);
                        if (var10_15 == var9_12) {
                            return var9_12;
                        }
                        break block18;
                    }
                    catch (l63$a var2_4) {
                        var10_13 = this;
                    }
                }
                var3_6 = var2_5.a;
                if (var3_6 != var10_13) break block20;
            }
            return Unit.a;
        }
        throw var2_5;
    }
}

