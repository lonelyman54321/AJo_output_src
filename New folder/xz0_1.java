/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XZ0
 */
public final class xz0_1
implements nj1_2 {
    public static final xz0$a_0 Companion;
    public int a;

    static {
        xz0$a_0 xz0$a_0;
        Companion = xz0$a_0 = new Object();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final cl2_2 intercept(nj1$a var1_1) {
        block6: {
            Intrinsics.checkNotNullParameter(var1_1, "chain");
            var2_3 = var1_1;
            var2_3 = (te2_2)var1_1;
            var3_4 = null;
            var4_5 = false;
            block4: while (true) {
                var5_6 = var2_3.e;
                if (var4_5 || (var6_7 = this.a) >= (var7_8 = 3)) break block6;
                var8_9 = var1_1;
                var8_9 = (te2_2)var1_1;
                var3_4 = var8_9.a((kj2_2)var5_6);
                var4_5 = var3_4.d();
lbl14:
                // 2 sources

                while (true) {
                    this.a = var9_10 = this.a + 1;
                    continue block4;
                    break;
                }
                {
                    catch (Throwable var1_2) {
                        break;
                    }
                    catch (Exception v0) {}
                    {
                        var5_6 = yn3_0.a;
                        var6_7 = this.a;
                        var10_11 = new StringBuilder();
                        var11_12 = "Request is not successful - ";
                        var10_11.append(var11_12);
                        var10_11.append(var6_7);
                        var8_9 = var10_11.toString();
                        var10_11 = new Object[]{};
                        var5_6.a((String)var8_9, var10_11);
                        ** continue;
                    }
                }
            }
            this.a = var12_13 = this.a + 1;
            throw var1_2;
        }
        if (var3_4 != null) return var3_4;
        return var2_3.a((kj2_2)var5_6);
    }
}

