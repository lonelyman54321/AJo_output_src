/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import com.ril.ajio.R$string;
import com.ril.ajio.gamezone.GameZoneWebViewActivity;
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from BY0
 */
public final class by0_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ by0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void run() {
        var1_1 = this.b;
        var2_2 = "this$0";
        var3_3 = this.a;
        switch (var3_3) {
            default: {
                var1_1 = (dj2_2)var1_1;
                Intrinsics.checkNotNullParameter(var1_1, (String)var2_2);
                var1_1.Pa(true);
                return;
            }
            case 0: 
        }
        var4_4 = GameZoneWebViewActivity.Companion;
        var1_1 = (GameZoneWebViewActivity)var1_1;
        Intrinsics.checkNotNullParameter(var1_1, (String)var2_2);
        var2_2 = var1_1.q0;
        var3_3 = 0;
        var4_4 = null;
        if (var2_2 != null) {
            var2_2 = var2_2.getGameUrl();
        } else {
            var5_5 = 0;
            var2_2 = null;
        }
        var5_5 = TextUtils.isEmpty((CharSequence)var2_2);
        if (var5_5 == 0) {
            block19: {
                var2_2 = var1_1.q0;
                if (var2_2 != null) {
                    var4_4 = var2_2.getGameUrl();
                }
                var2_2 = UrlHelper.Companion;
                var6_6 /* !! */  = var2_2.getInstance();
                var7_7 = var6_6 /* !! */ .isUATDomain();
                var8_8 = "";
                if (var7_7 != 0) {
                    var6_6 /* !! */  = var2_2.getInstance();
                    var7_7 = var6_6 /* !! */ .isUAT1Domain();
                    var9_9 /* !! */  = null;
                    var10_10 = "www.ajio.com";
                    if (var7_7 != 0) {
                        if (var4_4 != null && (var2_2 = kotlin.text.b.n((String)var4_4, "qa.services.ajio.com", var10_10, false)) != null) {
                            while (true) {
                                var4_4 = var2_2;
                                break block19;
                                break;
                            }
                        }
lbl41:
                        // 3 sources

                        while (true) {
                            var4_4 = var8_8;
                            break block19;
                            break;
                        }
                    }
                    var5_5 = (int)(var2_2 = var2_2.getInstance()).isUAT2Domain();
                    if (var5_5 != 0) {
                        if (var4_4 != null && (var2_2 = kotlin.text.b.n((String)var4_4, "uat2.ajio.ril.com", var10_10, false)) != null) ** continue;
                        ** continue;
                    }
                }
            }
            var5_5 = R$string.game_zone_share;
            var2_2 = hv3_0.K(var5_5);
            var6_6 /* !! */  = z40_0.Companion;
            var9_9 /* !! */  = var1_1.getApplication();
            var10_10 = "getApplication(...)";
            Intrinsics.checkNotNullExpressionValue(var9_9 /* !! */ , var10_10);
            var6_6 /* !! */ .getClass();
            var11_11 = z40$a.a((Context)var9_9 /* !! */ ).a.b("gamezone_utm_source");
            var6_6 /* !! */  = var1_1.getApplication();
            Intrinsics.checkNotNullExpressionValue(var6_6 /* !! */ , var10_10);
            var12_12 = z40$a.a((Context)var6_6 /* !! */ ).a.b("gamezone_utm_medium");
            var6_6 /* !! */  = var1_1.getApplication();
            Intrinsics.checkNotNullExpressionValue(var6_6 /* !! */ , var10_10);
            var6_6 /* !! */  = z40$a.a((Context)var6_6 /* !! */ ).a;
            var9_9 /* !! */  = "gamezone_utm_campaign";
            var13_13 = var6_6 /* !! */ .b((String)var9_9 /* !! */ );
            var6_6 /* !! */  = var1_1.J0;
            if (var6_6 /* !! */  != null && (var7_7 = var6_6 /* !! */ .length()) != 0) {
                var4_4 = var1_1.J0;
                if (var4_4 != null) {
                    var8_8 = var4_4;
                }
                var1_1.C2((String)var8_8, (String)var2_2);
            } else {
                var6_6 /* !! */  = var1_1.D0;
                if (var6_6 /* !! */  != null) {
                    var6_6 /* !! */ .startLoader();
                }
                cp_1.Companion.getClass();
                var6_6 /* !! */  = cp$a.e();
                var14_14 = var4_4 == null ? var8_8 : var4_4;
                var6_6 /* !! */ .getClass();
                var6_6 /* !! */  = cp_1.c((String)var14_14, var11_11, var12_12, var13_13, null, null);
                if (var6_6 /* !! */  != null) {
                    var4_4 = var6_6 /* !! */ ;
                }
                if (var4_4 != null) {
                    var8_8 = var4_4;
                }
                d23_0.d((String)var2_2, (String)var8_8, (t13_0)var1_1);
            }
        }
    }
}

