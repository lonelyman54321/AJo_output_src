/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlinx.coroutines.channels.ClosedSendChannelException;

public final class Ek2$a$a
implements fs0_2 {
    public final /* synthetic */ x53_0 a;

    public Ek2$a$a(x53_0 x53_02) {
        this.a = x53_02;
    }

    /*
     * Unable to fully structure code
     */
    public final Object c(rk2_0 var1_1, f80_0 var2_2) {
        block10: {
            var3_3 = var2_2 instanceof Ek2$a$a$a;
            if (!var3_3) ** GOTO lbl-1000
            var4_4 = var2_2;
            var4_4 = (Ek2$a$a$a)var2_2;
            var5_5 = var4_4.c;
            var6_6 = -1 << -1;
            var7_7 = var5_5 & var6_6;
            if (var7_7 != 0) {
                var4_4.c = var5_5 -= var6_6;
            } else lbl-1000:
            // 2 sources

            {
                var4_4 = new Ek2$a$a$a(this, (f80_0)var2_2);
            }
            var2_2 = var4_4.a;
            var8_8 = j90_0.COROUTINE_SUSPENDED;
            var6_6 = var4_4.c;
            var7_7 = 1;
            if (var6_6 != 0) {
                if (var6_6 == var7_7) {
                    vl2_2.b(var2_2);
                    break block10;
                }
                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var1_1;
            }
            vl2_2.b(var2_2);
            try {
                var2_2 = this.a;
            }
            catch (ClosedSendChannelException v0) {}
            var4_4.c = var7_7;
            var1_1 = var2_2.o(var4_4, var1_1);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

