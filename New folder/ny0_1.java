/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Parcelable
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.ril.ajio.data.model.GameInfo;
import com.ril.ajio.gamezone.GameZoneWebViewActivity;
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from nY0
 */
public final class ny0_1
extends zj0_0 {
    public ny0_1(Activity activity) {
        super(activity);
    }

    /*
     * Unable to fully structure code
     */
    public final void b(String var1_1, String var2_2, boolean var3_3) {
        block9: {
            if (var1_1 != null && (var4_4 = var1_1.length()) == 0) {
                return;
            }
            var5_5 = UrlHelper.Companion;
            var6_6 = var5_5.getInstance();
            var7_7 = var6_6.isUATDomain();
            var8_8 = false;
            if (!var7_7) break block9;
            var6_6 = var5_5.getInstance();
            var7_7 = var6_6.isUAT1Domain();
            var9_9 = "www.ajio.com";
            var10_10 = null;
            if (!var7_7) ** GOTO lbl20
            if (var1_1 != null) {
                var6_6 = "qa.services.ajio.com";
                var1_1 = kotlin.text.b.n(var1_1, var9_9, (String)var6_6, false);
            } else {
                while (true) {
                    var1_1 = null;
                    break block9;
                    break;
                }
lbl20:
                // 1 sources

                var6_6 = var5_5.getInstance();
                var7_7 = var6_6.isUAT2Domain();
                if (var7_7) {
                    if (var1_1 == null) ** continue;
                    var6_6 = "uat2.services.ajio.com";
                    var1_1 = kotlin.text.b.n(var1_1, var9_9, (String)var6_6, false);
                }
            }
        }
        if (var3_3) {
            var11_11 = GameZoneWebViewActivity.Companion;
            var6_6 = this.a;
            var9_9 = "activity";
            Intrinsics.checkNotNullExpressionValue(var6_6, var9_9);
            var10_10 = "";
            if (var1_1 == null) {
                var1_1 = var10_10;
            }
            var11_11.getClass();
            Intrinsics.checkNotNullParameter(var6_6, var9_9);
            Intrinsics.checkNotNullParameter(var1_1, "deeplinkUrl");
            var11_11 = "http";
            var3_3 = kotlin.text.b.s(var1_1, (String)var11_11, false);
            if (!var3_3) {
                var11_11 = var5_5.getInstance().getBaseUrl();
                var1_1 = Ft2.a((String)var11_11, var1_1);
            }
            var11_11 = " ";
            var4_4 = (int)StringsKt.F(var1_1, (CharSequence)var11_11, false);
            if (var4_4 != 0) {
                var5_5 = "%20";
                var8_8 = true;
                var1_1 = kotlin.text.b.n(var1_1, (String)var11_11, (String)var5_5, var8_8);
            }
            var11_11 = var2_2 != null && (var3_3 = var2_2.length()) ? new GameInfo(var10_10, var2_2, var1_1) : new GameInfo(var10_10, var10_10, var1_1);
            var1_1 = new Intent((Context)var6_6, GameZoneWebViewActivity.class);
            var2_2 = "GAME_INFO";
            var1_1.putExtra(var2_2, (Parcelable)var11_11);
            var12_12 = 48;
            var6_6.startActivityForResult((Intent)var1_1, var12_12);
        }
    }
}

