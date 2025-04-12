/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 */
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.AccessProfileOtpResponse;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from xw3
 */
public final class xw3_0
implements F62 {
    public final /* synthetic */ hw3_0 a;

    public /* synthetic */ xw3_0(hw3_0 hw3_02) {
        this.a = hw3_02;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onChanged(Object var1_1) {
        var2_2 = false;
        var3_3 /* !! */  = null;
        var4_4 = 1;
        var5_5 = var1_1;
        var5_5 = (DataCallback)var1_1;
        var6_6 = this.a;
        var7_7 = "this$0";
        Intrinsics.checkNotNullParameter(var6_6, (String)var7_7);
        if (var5_5 != null) {
            var6_6.Oa();
            var8_8 = var5_5.getStatus();
            if (var8_8 == 0) {
                var5_5 = (AccessProfileOtpResponse)var5_5.getData();
                var7_7 = "success";
                if (var5_5 != null && (var4_4 = b.i((String)(var9_9 /* !! */  = var5_5.getMessage()), (String)var7_7, (boolean)var4_4)) != 0) {
                    var3_3 /* !! */  = new Bundle();
                    var10_10 = "verify_ril_profile_success";
                    r0_0.c((Bundle)var3_3 /* !! */ , var6_6, (String)var10_10);
                    var6_6.dismiss();
                } else if (var5_5 != null) {
                    var10_10 = var6_6.b;
                    if (var10_10 != null) {
                        var11_11 = 8;
                        var10_10.setVisibility(var11_11);
                    }
                    if ((var10_10 = var6_6.c) != null) {
                        var10_10.setVisibility(0);
                    }
                    if ((var3_3 /* !! */  = var5_5.getMessage()) != null) {
                        var3_3 /* !! */  = var6_6.c;
                        if (var3_3 /* !! */  != null) {
                            var10_10 = var5_5.getMessage();
                            var3_3 /* !! */ .setText((CharSequence)var10_10);
                        }
                    } else {
                        var3_3 /* !! */  = var6_6.c;
                        if (var3_3 /* !! */  != null) {
                            var4_4 = R$string.otp_invalid;
                            var3_3 /* !! */ .setText(var4_4);
                        }
                    }
                    if ((var3_3 /* !! */  = var6_6.c) != null) {
                        ai0_2.a((View)var3_3 /* !! */ );
                    }
                }
lbl40:
                // 7 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var8_8 = var5_5.getStatus();
            if (var8_8 == var4_4 && (var5_5 = var5_5.getError()) != null && (var7_7 = var5_5.getErrorMessage()) != null && (var8_8 = TextUtils.isEmpty((CharSequence)(var7_7 = var5_5.getErrorMessage().getMessage()))) == 0) {
                var5_5 = var5_5.getErrorMessage().getMessage();
                var7_7 = StringCompanionObject.INSTANCE;
                var8_8 = R$string.acc_alert_message;
                var7_7 = hv3_0.K(var8_8);
                var9_9 /* !! */  = new Object[var4_4];
                var9_9 /* !! */ [0] = var5_5;
                var3_3 /* !! */  = Arrays.copyOf(var9_9 /* !! */ , var4_4);
                var3_3 /* !! */  = String.format((String)var7_7, var3_3 /* !! */ );
                var10_10 = "format(...)";
                Intrinsics.checkNotNullExpressionValue(var3_3 /* !! */ , (String)var10_10);
                hw3_0.Pa((String)var5_5, (String)var3_3 /* !! */ );
            }
            var7_7 = "failure";
            ** continue;
            var12_12 = var7_7;
            var2_2 = var6_6.w;
            var10_10 = var6_6.v;
            if (var2_2) {
                var3_3 /* !! */  = var10_10.getEC_MY_ACC_INTERACTION();
                var10_10 = var10_10.getEN_MY_ACCOUNT_INTERACTIONS();
                var5_5 = "my account screen";
lbl64:
                // 2 sources

                while (true) {
                    var13_13 /* !! */  = var3_3 /* !! */ ;
                    var14_14 /* !! */  = var10_10;
                    var15_15 /* !! */  = var5_5;
                    break;
                }
            } else {
                var2_2 = var6_6.x;
                if (var2_2) {
                    var3_3 /* !! */  = var10_10.getEC_COUPON_INTERACTIONS();
                    var10_10 = var10_10.getEN_COUPON_INTERACTIONS();
                    var5_5 = "coupon screen";
                    ** continue;
                }
                var3_3 /* !! */  = "";
                var13_13 /* !! */  = var3_3 /* !! */ ;
                var14_14 /* !! */  = var3_3 /* !! */ ;
                var15_15 /* !! */  = var3_3 /* !! */ ;
            }
            var16_16 = var6_6.t;
            var17_17 = var6_6.u;
            var9_9 /* !! */  = var6_6.v;
            var18_18 = "email verification";
            var19_19 = "Employee verify email screen";
            var20_20 = 1664;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var9_9 /* !! */ , (String)var13_13 /* !! */ , var18_18, var12_12, (String)var14_14 /* !! */ , var19_19, (String)var15_15 /* !! */ , var16_16, null, var17_17, false, null, var20_20, null);
        }
    }
}

