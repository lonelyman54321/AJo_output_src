/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$FloatRef;

public final class Vg1$b
extends qg3_2
implements Function2 {
    public Ref$FloatRef a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ tr1_0 d;
    public final /* synthetic */ vg1_0 e;

    public Vg1$b(tr1_0 tr1_02, vg1_0 vg1_02, f80_0 f80_02) {
        this.d = tr1_02;
        this.e = vg1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        tr1_0 tr1_02 = this.d;
        vg1_0 vg1_02 = this.e;
        Vg1$b vg1$b = new Vg1$b(tr1_02, vg1_02, f80_02);
        vg1$b.c = object;
        return vg1$b;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Vg1$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Vg1$b)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invokeSuspend(Object var1_1) {
        block5: {
            block2: {
                block3: {
                    block4: {
                        var2_2 = j90_0.COROUTINE_SUSPENDED;
                        var3_3 = this.b;
                        var4_4 = 1;
                        var5_5 = 2;
                        if (var3_3 == 0) break block2;
                        if (var3_3 == var4_4) break block3;
                        if (var3_3 != var5_5) break block4;
                        var6_6 = this.a;
                        var7_7 = (i90_0)this.c;
                        vl2_2.b(var1_1);
                        var1_1 = var7_7;
                        break block5;
                    }
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                var6_6 = this.a;
                var7_7 = (i90_0)this.c;
                vl2_2.b(var1_1);
                var1_1 = var7_7;
                ** GOTO lbl38
            }
            vl2_2.b(var1_1);
            var1_1 = (i90_0)this.c;
            var6_6 = new Ref$FloatRef();
            var8_8 = 1065353216;
            var6_6.element = var9_9 = 1.0f;
        }
        while (true) {
            var10_10 = this.d;
            var11_11 = this.e;
            var7_7 = new Vg1$b$a((tr1_0)var10_10, var11_11, var6_6, (i90_0)var1_1);
            this.c = var1_1;
            this.a = var6_6;
            this.b = var4_4;
            if ((var7_7 = Tg1.a((Function1)var7_7, this)) == var2_2) {
                return var2_2;
            }
lbl38:
            // 3 sources

            var9_9 = var6_6.element;
            var10_10 = null;
            cfr_temp_0 = var9_9 - 0.0f;
            var8_8 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
            if (var8_8 != 0) continue;
            var7_7 = new Vg1$b$b((i90_0)var1_1);
            var7_7 = J83.k((Function0)var7_7);
            var11_11 = null;
            var10_10 = new qg3_2(var5_5, null);
            this.c = var1_1;
            this.a = var6_6;
            this.b = var5_5;
            if ((var7_7 = ms0_1.k((es0_2)var7_7, (Function2)var10_10, this)) == var2_2) break;
        }
        return var2_2;
    }
}

