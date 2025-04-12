/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Gr1$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Gr1 c;
    public final /* synthetic */ un0_0 d;
    public final /* synthetic */ W01 e;

    public Gr1$b(boolean bl2, Gr1 gr1, un0_0 un0_02, W01 w01, f80_0 f80_02) {
        this.b = bl2;
        this.c = gr1;
        this.d = un0_02;
        this.e = w01;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        un0_0 un0_02 = this.d;
        W01 w01 = this.e;
        boolean bl2 = this.b;
        Gr1 gr1 = this.c;
        object = new Gr1$b(bl2, gr1, un0_02, w01, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Gr1$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Gr1$b)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object var1_1) {
        block7: {
            block6: {
                block8: {
                    var2_3 = j90_0.COROUTINE_SUSPENDED;
                    var3_4 = this.a;
                    var4_5 = 2;
                    var5_6 = 1;
                    var6_7 = this.c;
                    if (var3_4 == 0) break block8;
                    if (var3_4 == var5_6) ** GOTO lbl-1000
                    if (var3_4 != var4_5) {
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    try {
                        vl2_2.b(var1_1);
                        break block6;
                    }
                    catch (Throwable var1_2) {
                        break block7;
                    }
lbl-1000:
                    // 1 sources

                    {
                        vl2_2.b(var1_1);
                        ** GOTO lbl-1000
                    }
                }
                vl2_2.b(var1_1);
                {
                    var7_8 = this.b;
                    if (var7_8 == 0) ** GOTO lbl-1000
                    var1_1 = var6_7.p;
                    var9_10 = null;
                    var8_9 = new Float(0.0f);
                    this.a = var5_6;
                    if ((var1_1 = var1_1.e(this, var8_9)) != var2_3) ** GOTO lbl-1000
                    return var2_3;
                }
lbl-1000:
                // 3 sources

                {
                    var9_10 = var6_7.p;
                    var7_8 = 1065353216;
                    var11_12 = 1.0f;
                    var10_11 = new Float(var11_12);
                    var12_13 = this.d;
                    var1_1 = this.e;
                    var13_14 = new Gr1$b$a((W01)var1_1, var6_7);
                    this.a = var4_5;
                    var14_15 = 4;
                    var1_1 = Lj.c(var9_10, var10_11, var12_13, var13_14, this, var14_15);
                    if (var1_1 != var2_3) break block6;
                    return var2_3;
                }
            }
            var7_8 = Gr1.t;
            var6_7.d(false);
            return Unit.a;
        }
        var6_7.d(false);
        throw var1_2;
    }
}

