/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.model.home.transform.HomeData;
import kotlin.jvm.internal.Intrinsics;

public final class r8
implements Runnable {
    public final /* synthetic */ q9_0 a;

    public /* synthetic */ r8(q9_0 q9_02) {
        this.a = q9_02;
    }

    /*
     * Unable to fully structure code
     */
    public final void run() {
        block14: {
            block13: {
                var1_1 = q9_0.Companion;
                var2_2 = this.a;
                Intrinsics.checkNotNullParameter(var2_2, "this$0");
                var1_1 = var2_2.I2;
                if (var1_1 == null) ** GOTO lbl43
                try {
                    var3_3 = var2_2.E0;
                    if (var3_3 == null) break block13;
                }
                catch (Exception v0) {
                    ** continue;
                }
                var3_3 = var3_3.getData();
                var3_3 = (HomeData)var3_3;
                if (var3_3 == null) break block13;
                var3_3 = var3_3.getPageUrl();
                break block14;
            }
            var4_4 = false;
            var3_3 = null;
        }
        var5_5 = var1_1.a;
        var4_4 = Intrinsics.areEqual(var3_3, var5_5);
        if (!var4_4) ** GOTO lbl38
        var1_1 = var1_1.c;
        var6_6 = var1_1.a;
        var2_2 = var2_2.y;
        if (var2_2 == null) ** GOTO lbl43
        var2_2.smoothScrollToPosition(var6_6);
        ** GOTO lbl43
lbl38:
        // 1 sources

        var1_1 = var2_2.y;
        if (var1_1 == null) ** GOTO lbl43
        var2_2 = null;
        var1_1.smoothScrollToPosition(0);
lbl43:
        // 6 sources

    }
}

