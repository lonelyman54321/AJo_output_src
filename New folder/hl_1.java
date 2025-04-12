/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from hl
 */
public final class hl_1
extends Lambda
implements gx0_2 {
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ gr3 d;

    public hl_1(Function1 function1, gr3 gr32) {
        this.c = function1;
        this.d = gr32;
        super(3);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1, Object var2_2, Object var3_3) {
        var1_1 = (dl1_1)var1_1;
        var2_2 = (xk1_0)var2_2;
        var3_3 = (c60)var3_3;
        var4_4 = var3_3.a;
        var2_2 = var2_2.Q(var4_4);
        var6_5 = var1_1.W();
        if (var6_5 == 0) ** GOTO lbl-1000
        var3_3 = this.d.d.getValue();
        var7_6 = this.c;
        var6_5 = (int)(var3_3 = (Boolean)var7_6.invoke(var3_3)).booleanValue();
        if (var6_5 == 0) {
            var4_4 = 0L;
        } else lbl-1000:
        // 2 sources

        {
            var6_5 = var2_2.a;
            var8_7 = var2_2.b;
            var4_4 = dj1.a(var6_5, var8_7);
        }
        var6_5 = (int)(var4_4 >> 32);
        var9_8 = (int)(var4_4 & 0xFFFFFFFFL);
        var7_6 = new gl_0((Ns2)var2_2);
        return cl1_0.a((dl1_1)var1_1, var6_5, var9_8, var7_6);
    }
}

