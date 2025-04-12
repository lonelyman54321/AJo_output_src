/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Ref$BooleanRef;

public final class Bb3$a$a
implements fs0_2 {
    public final /* synthetic */ Ref$BooleanRef a;
    public final /* synthetic */ fs0_2 b;

    public Bb3$a$a(Ref$BooleanRef ref$BooleanRef, fs0_2 fs0_22) {
        this.a = ref$BooleanRef;
        this.b = fs0_22;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object c(int var1_1, f80_0 var2_2) {
        block8: {
            block7: {
                block5: {
                    block6: {
                        var3_3 = var2_2 instanceof Bb3$a$a$a;
                        if (!var3_3) ** GOTO lbl-1000
                        var4_4 = var2_2;
                        var4_4 = (Bb3$a$a$a)var2_2;
                        var5_5 = var4_4.c;
                        var6_6 = -1 << -1;
                        var7_7 = var5_5 & var6_6;
                        if (var7_7 != 0) {
                            var4_4.c = var5_5 -= var6_6;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var4_4 = new Bb3$a$a$a(this, (f80_0)var2_2);
                        }
                        var2_2 = var4_4.a;
                        var8_8 = j90_0.COROUTINE_SUSPENDED;
                        var6_6 = var4_4.c;
                        var7_7 = 1;
                        if (var6_6 == 0) break block5;
                        if (var6_6 != var7_7) break block6;
                        vl2_2.b(var2_2);
                        break block7;
                    }
                    var9_9 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var9_9;
                }
                vl2_2.b(var2_2);
                if (var1_1 > 0) {
                    var9_10 /* !! */  = this.a;
                    var10_11 = var9_10 /* !! */ .element;
                    if (!var10_11) {
                        var9_10 /* !! */ .element = var7_7;
                        var9_10 /* !! */  = b33.START;
                        var4_4.c = var7_7;
                        var2_2 = this.b;
                        if ((var9_10 /* !! */  = var2_2.emit(var9_10 /* !! */ , var4_4)) == var8_8) {
                            return var8_8;
                        } else {
                            ** GOTO lbl36
                        }
                    }
                }
                break block8;
            }
            return Unit.a;
        }
        return Unit.a;
    }
}

