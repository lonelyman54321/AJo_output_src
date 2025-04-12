/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class xG1$c
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ xg1_0 b;

    public xG1$c(xg1_0 xg1_02, f80_0 f80_02) {
        this.b = xg1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        xg1_0 xg1_02 = this.b;
        object = new xG1$c(xg1_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (xG1$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xG1$c)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invokeSuspend(Object var1_1) {
        block4: {
            block5: {
                block6: {
                    var2_2 = j90_0.COROUTINE_SUSPENDED;
                    var3_3 = this.a;
                    var4_4 = 2;
                    var5_5 = 1;
                    var6_6 = this.b;
                    if (var3_3 == 0) break block4;
                    if (var3_3 == var5_5) break block5;
                    if (var3_3 != var4_4) break block6;
                    vl2_2.b(var1_1);
                    ** GOTO lbl31
                }
                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var1_1;
            }
            vl2_2.b(var1_1);
            ** GOTO lbl24
        }
        vl2_2.b(var1_1);
        while (true) {
            if ((var1_1 = var6_6.E) != null) {
                this.a = var5_5;
                if ((var1_1 = var1_1.g(this)) == var2_2) {
                    return var2_2;
                }
            }
lbl24:
            // 5 sources

            if ((var1_1 = var6_6.z) == null) continue;
            this.a = var4_4;
            var1_1 = aQ1.a(this.getContext());
            var8_8 = xG1$c$a.c;
            var7_7 = new zp1_1(var8_8);
            if ((var1_1 = var1_1.R(var7_7, this)) == var2_2) {
                return var2_2;
            }
lbl31:
            // 3 sources

            if ((var1_1 = var6_6.z) == null) continue;
            var1_1.c();
        }
    }
}

