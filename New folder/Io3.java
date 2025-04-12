/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.web.CustomWebViewActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class Io3
extends zj0_0 {
    public Io3(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super(activity);
    }

    /*
     * Unable to fully structure code
     */
    public final void b(String var1_1) {
        block5: {
            var2_2 = UrlHelper.Companion;
            var3_3 = var2_2.getInstance();
            var4_4 = var3_3.isUATDomain();
            if (!var4_4) break block5;
            var3_3 = var2_2.getInstance();
            var4_4 = var3_3.isUAT1Domain();
            var5_5 = "www.ajio.com";
            if (!var4_4) ** GOTO lbl17
            if (var1_1 != null) {
                var2_2 = "qa.services.ajio.com";
                var1_1 = kotlin.text.b.n(var1_1, var5_5, (String)var2_2, false);
            } else {
                while (true) {
                    var6_6 = 0;
                    var1_1 = null;
                    break block5;
                    break;
                }
lbl17:
                // 1 sources

                var7_7 = (var2_2 = var2_2.getInstance()).isUAT2Domain();
                if (var7_7) {
                    if (var1_1 == null) ** continue;
                    var2_2 = "uat2.ajio.ril.com";
                    var1_1 = kotlin.text.b.n(var1_1, var5_5, (String)var2_2, false);
                }
            }
        }
        CustomWebViewActivity.Companion.getClass();
        var2_2 = this.a;
        if (var2_2 != null) {
            var3_3 = new Intent((Context)var2_2, CustomWebViewActivity.class);
            var5_5 = "URL";
            var3_3.putExtra(var5_5, var1_1);
            var1_1 = "SOURCE";
            var3_3.putExtra(var1_1, 0);
            var6_6 = 50;
            var2_2.startActivityForResult((Intent)var3_3, var6_6);
        }
    }
}

