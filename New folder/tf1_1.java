/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Tf1
 */
public final class tf1_1
implements Runnable {
    /*
     * Unable to fully structure code
     */
    public final void run() {
        block11: {
            block12: {
                var1_1 = FacebookSdk.a();
                var2_2 = wf1_0.h;
                var3_4 = (var2_2 = jg1_1.f(var1_1, var2_2)).isEmpty();
                if (!var3_4) break block11;
                var2_2 = wf1_0.h;
                var4_5 = jg1_1.class;
                var5_6 = td0.b(var4_5);
                if (var5_6) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 = null;
                        break block11;
                        break;
                    }
                }
                var6_7 = "context";
                Intrinsics.checkNotNullParameter(var1_1, (String)var6_7);
                var6_7 = new ArrayList();
                if (var2_2 != null) break block12;
lbl18:
                // 3 sources

                while (true) {
                    var2_2 = var6_7;
                    break block11;
                    break;
                }
            }
            try {
                var7_8 = jg1_1.a;
                var8_9 = "com.android.vending.billing.IInAppBillingService";
            }
            catch (Throwable var2_3) {
                td0.a(var4_5, var2_3);
                ** continue;
            }
            var8_9 = var7_8.b(var1_1, (String)var8_9);
            if (var8_9 == null) ** GOTO lbl18
            var9_10 = "getPurchaseHistory";
            var8_9 = var7_8.c((Class)var8_9, var9_10);
            if (var8_9 == null) ** continue;
            var2_2 = var7_8.d(var1_1, var2_2);
            var2_2 = var7_8.a(var2_2);
        }
        wf1_0.a(wf1_0.a, var1_1, var2_2, false);
    }
}

