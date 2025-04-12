/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class Qr0$a
implements fs0_2 {
    public final /* synthetic */ qr0_2 a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ fs0_2 c;

    public Qr0$a(qr0_2 qr0_22, Ref$ObjectRef ref$ObjectRef, fs0_2 fs0_22) {
        this.a = qr0_22;
        this.b = ref$ObjectRef;
        this.c = fs0_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof Qr0$a$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (Qr0$a$a)var2_2;
        var5_5 = var4_4.c;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.c = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new Qr0$a$a(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.a;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.c;
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
            var2_2 = this.a;
            var9_9 = var2_2.b.invoke(var1_1);
            var10_10 = this.b;
            var11_11 = var10_10.element;
            var12_12 = k52_0.a;
            if (var11_11 != var12_12 && (var13_13 = (var2_2 = (Boolean)var2_2.c.invoke(var11_11, var9_9)).booleanValue())) {
                return Unit.a;
            }
            var10_10.element = var9_9;
            var4_4.c = var7_7;
            var2_2 = this.c;
            if ((var1_1 = var2_2.emit(var1_1, var4_4)) == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

