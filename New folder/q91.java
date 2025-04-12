/*
 * Decompiled with CFR 0.152.
 */
public final class q91 {
    public final Ql3 a;
    public int b;
    public float c;

    public q91(Ql3 ql3) {
        this.a = ql3;
        this.b = -1;
    }

    /*
     * Unable to fully structure code
     */
    public final float a(int var1_1, boolean var2_2, boolean var3_3, boolean var4_4) {
        var5_5 = 1;
        var6_6 = this.a;
        if (!var2_2) ** GOTO lbl-1000
        var7_7 = var6_6.f;
        var8_8 = te3_0.b(var7_7, var1_1, var2_2);
        var9_9 = var6_6.f;
        var10_10 = var9_9.getLineStart(var8_8);
        var8_8 = var6_6.f(var8_8);
        if (var1_1 != var10_10 && var1_1 != var8_8) lbl-1000:
        // 2 sources

        {
            var8_8 = 0;
            var7_7 = null;
        } else {
            var8_8 = 1;
        }
        var10_10 = var1_1 * 4;
        if (var4_4) {
            if (var8_8 != 0) {
                var5_5 = 0;
            }
        } else {
            var5_5 = var8_8 != 0 ? 2 : 3;
        }
        if ((var5_5 = this.b) == (var10_10 += var5_5)) {
            return this.c;
        }
        var11_11 = var4_4 != false ? var6_6.h(var1_1, var2_2) : var6_6.i(var1_1, var2_2);
        if (var3_3) {
            this.b = var10_10;
            this.c = var11_11;
        }
        return var11_11;
    }
}

