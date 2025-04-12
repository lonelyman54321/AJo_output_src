/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from Mv2
 */
public final class mv2_0 {
    public final List a;
    public final zj1 b;
    public final int c;
    public int d;

    public mv2_0() {
        throw null;
    }

    /*
     * Unable to fully structure code
     */
    public mv2_0(List var1_1, zj1 var2_2) {
        block20: {
            block21: {
                super();
                this.a = var1_1;
                this.b = var2_2;
                var3_3 = 0;
                var4_4 = null;
                if (var2_2 != null) {
                    var5_5 = var2_2.b.b;
                } else {
                    var6_6 = 0;
                    var5_5 = null;
                }
                var7_7 = 0;
                if (var5_5 != null) {
                    var6_6 = var5_5.getButtonState();
                } else {
                    var6_6 = 0;
                    var5_5 = null;
                }
                this.c = var6_6;
                if (var2_2 != null) {
                    var5_5 = var2_2.b.b;
                } else {
                    var6_6 = 0;
                    var5_5 = null;
                }
                if (var5_5 != null) {
                    var5_5.getMetaState();
                }
                if (var2_2 != null) {
                    var2_2 = var2_2.b;
                    var4_4 = var2_2.b;
                }
                var8_8 = 1;
                var6_6 = 3;
                var9_9 = 2;
                if (var4_4 == null) break block21;
                var10_10 = var4_4.getActionMasked();
                if (var10_10 == 0) ** GOTO lbl-1000
                if (var10_10 == var8_8) ** GOTO lbl-1000
                if (var10_10 == var9_9) ** GOTO lbl-1000
                switch (var10_10) {
                    default: {
                        break;
                    }
                    case 10: {
                        var7_7 = 5;
                        break;
                    }
                    case 9: {
                        var7_7 = 4;
                        break;
                    }
                    case 8: {
                        var7_7 = 6;
                        break;
                    }
                    case 7: lbl-1000:
                    // 2 sources

                    {
                        var7_7 = 3;
                        break;
                    }
                    case 6: lbl-1000:
                    // 2 sources

                    {
                        var7_7 = 2;
                        break;
                    }
                    case 5: lbl-1000:
                    // 2 sources

                    {
                        var7_7 = 1;
                    }
                }
                var8_8 = var7_7;
                break block20;
            }
            var3_3 = var1_1.size();
            while (var7_7 < var3_3) {
                var11_11 = (aw2_0)var1_1.get(var7_7);
                var12_12 = si0_2.c(var11_11);
                if (var12_12) {
                    var8_8 = 2;
                } else {
                    var13_13 = si0_2.a(var11_11);
                    if (!var13_13) {
                        ++var7_7;
                        continue;
                    }
                }
                break block20;
            }
            var8_8 = 3;
        }
        this.d = var8_8;
    }
}

