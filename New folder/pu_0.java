/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pu
 */
public final class pu_0
implements B82 {
    public boolean b;
    public ar2_2 c;

    public final /* synthetic */ boolean all(Function1 function1) {
        return mp1_1.a(this, function1);
    }

    public final /* synthetic */ boolean any(Function1 function1) {
        return mp1_1.c(this, function1);
    }

    /*
     * Unable to fully structure code
     */
    public final Object b(f80_0 var1_1) {
        block11: {
            block10: {
                block8: {
                    block9: {
                        var2_2 = var1_1 instanceof pu$a;
                        if (!var2_2) ** GOTO lbl-1000
                        var3_3 = var1_1;
                        var3_3 = (pu$a)var1_1;
                        var4_4 = var3_3.d;
                        var5_5 = -1 << -1;
                        var6_6 = var4_4 & var5_5;
                        if (var6_6 != 0) {
                            var3_3.d = var4_4 -= var5_5;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var3_3 = new pu$a(this, (f80_0)var1_1);
                        }
                        var1_1 = var3_3.b;
                        var7_7 = j90_0.COROUTINE_SUSPENDED;
                        var5_5 = var3_3.d;
                        var6_6 = 1;
                        if (var5_5 == 0) break block8;
                        if (var5_5 != var6_6) break block9;
                        var3_3 = var3_3.a;
                        vl2_2.b(var1_1);
                        break block10;
                    }
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                vl2_2.b(var1_1);
                var8_8 = this.b;
                if (var8_8) break block11;
                var1_1 = this.c;
                var3_3.getClass();
                var3_3.a = var1_1;
                var3_3.d = var6_6;
                var10_10 = zj1_2.b((f80_0)var3_3);
                Intrinsics.checkNotNullParameter(var10_10, "delegate");
                var11_11 = j90_0.UNDECIDED;
                var9_9 = new ar2_2((f80_0)var10_10, (Object)var11_11);
                this.c = var9_9;
                var9_9 = var9_9.a();
                if (var9_9 == var7_7) {
                    var10_10 = "frame";
                    Intrinsics.checkNotNullParameter(var3_3, (String)var10_10);
                }
                if (var9_9 == var7_7) {
                    return var7_7;
                }
                var3_3 = var1_1;
            }
            if (var3_3 != null) {
                var1_1 = tl2_2.b;
                var1_1 = Unit.a;
                var3_3.resumeWith(var1_1);
            }
        }
        return Unit.a;
    }

    public final Object foldIn(Object object, Function2 function2) {
        return function2.invoke(object, this);
    }

    public final void l() {
        boolean bl2 = this.b;
        if (!bl2) {
            this.b = bl2 = true;
            ar2_2 ar2_22 = this.c;
            if (ar2_22 != null) {
                Object object = tl2_2.b;
                object = Unit.a;
                ar2_22.resumeWith(object);
            }
            bl2 = false;
            ar2_22 = null;
            this.c = null;
        }
    }

    public final /* synthetic */ LP1 then(LP1 lP1) {
        return kp1_0.a(this, lP1);
    }
}

