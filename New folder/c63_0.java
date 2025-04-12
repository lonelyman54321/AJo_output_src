/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/*
 * Renamed from c63
 */
public final class c63_0
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;

    public c63_0(fs0_2 fs0_22) {
        this.a = fs0_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        block8: {
            block9: {
                block10: {
                    block7: {
                        block5: {
                            block6: {
                                var3_3 = var2_2 instanceof c63$a;
                                if (!var3_3) ** GOTO lbl-1000
                                var4_4 = var2_2;
                                var4_4 = (c63$a)var2_2;
                                var5_5 = var4_4.b;
                                var6_6 = -1 << -1;
                                var7_7 = var5_5 & var6_6;
                                if (var7_7 != 0) {
                                    var4_4.b = var5_5 -= var6_6;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var4_4 = new c63$a(this, (f80_0)var2_2);
                                }
                                var2_2 = var4_4.a;
                                var8_8 = j90_0.COROUTINE_SUSPENDED;
                                var6_6 = var4_4.b;
                                var7_7 = 1;
                                if (var6_6 == 0) break block5;
                                if (var6_6 != var7_7) break block6;
                                vl2_2.b(var2_2);
                                break block7;
                            }
                            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var1_1;
                        }
                        vl2_2.b(var2_2);
                        var1_1 = (gb3_0)var1_1;
                        var9_9 = var1_1 instanceof AE2;
                        if (var9_9) break block8;
                        var9_9 = var1_1 instanceof ln0_0;
                        if (var9_9) break block9;
                        var9_9 = var1_1 instanceof Yh0;
                        if (var9_9) {
                            var1_1 = ((Yh0)var1_1).a;
                            var4_4.b = var7_7;
                            var2_2 = this.a;
                            if ((var1_1 = var2_2.emit(var1_1, var4_4)) == var8_8) {
                                return var8_8;
                            } else {
                                ** GOTO lbl38
                            }
                        }
                        break block10;
                    }
                    return Unit.a;
                }
                var10_10 = var1_1 instanceof Iv3;
                if (var10_10) {
                    var2_2 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString();
                    var1_1 = new IllegalStateException((String)var2_2);
                    throw var1_1;
                }
                var1_1 = new NoWhenBranchMatchedException();
                throw var1_1;
            }
            throw ((ln0_0)var1_1).a;
        }
        throw ((AE2)var1_1).a;
    }
}

