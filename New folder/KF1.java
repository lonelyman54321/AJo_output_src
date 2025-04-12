/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 */
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.payment.fragment.h;
import com.ril.ajio.payment.fragment.i;
import kotlin.jvm.internal.Intrinsics;

public final class KF1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ KF1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onClick(View var1_1) {
        var2_2 = "this$0";
        var3_3 = this.b;
        var4_4 = this.a;
        switch (var4_4) {
            default: {
                var5_5 = nc3_2.Companion;
                var3_3 = (nc3_2)var3_3;
                Intrinsics.checkNotNullParameter(var3_3, (String)var2_2);
                var2_2 = var3_3.getDialog();
                if (var2_2 != null) {
                    var2_2.cancel();
                }
                return;
            }
            case 1: {
                var3_3 = (h)var3_3;
                Intrinsics.checkNotNullParameter(var3_3, (String)var2_2);
                var2_2 = var3_3.Pa();
                var5_6 = var3_3.f;
                var6_7 = "checkBox";
                if (var5_6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var6_7);
                    var4_4 = 0;
                    var5_6 = null;
                }
                var4_4 = (int)var5_6.isChecked();
                var7_8 = "";
                if (var4_4 == 0) ** GOTO lbl78
                var2_2 = (Boolean)var2_2.J.getValue();
                var8_9 = var2_2.booleanValue();
                if (!var8_9) ** GOTO lbl80
                var8_9 = var3_3.Ya();
                if (var8_9) {
                    var2_2 = var3_3.B;
                    if (var2_2 != null) {
                        var2_2 = var2_2.getCardNetwork();
                    } else {
                        var8_9 = false;
                        var2_2 = null;
                    }
                    if (var2_2 != null && (var8_9 = var2_2.length())) {
                        var2_2 = var3_3.B;
                        if (var2_2 != null) {
                            var2_2 = var2_2.getCardNetwork();
                        } else {
                            var8_9 = false;
                            var2_2 = null;
                        }
                    } else {
                        var8_9 = R$string.default_card_type;
                        var2_2 = var3_3.getString((int)var8_9);
                    }
                    var5_6 = var3_3.getActivity();
                    if (var5_6 != null && (var4_4 = (int)var5_6.isFinishing()) == 0 && (var4_4 = (int)var3_3.isAdded()) != 0) {
                        if (var2_2 == null) {
                            var2_2 = var7_8;
                        }
                        if ((var5_6 = var3_3.B) != null) {
                            var5_6 = var5_6.getIconUrl();
                        } else {
                            var4_4 = 0;
                            var5_6 = null;
                        }
                        if (var5_6 == null) {
                            var5_6 = var7_8;
                        }
                        var9_10 = new yr2_0((h)var3_3);
                        Intrinsics.checkNotNullParameter(var9_10, "callback");
                        var10_11 = new i();
                        var10_11.b = var9_10;
                        var10_11.h = var5_6;
                        var10_11.i = var2_2;
                        var2_2 = var3_3.getChildFragmentManager();
                        var2_2.getClass();
                        var5_6 = new a((FragmentManager)var2_2);
                        var2_2 = "beginTransaction(...)";
                        Intrinsics.checkNotNullExpressionValue(var5_6, (String)var2_2);
                        var8_9 = R$id.lay_secure_pay;
                        var9_10 = var3_3.getTag();
                        var5_6.j((int)var8_9, var10_11, (String)var9_10);
                        var5_6.c(null);
                        var8_9 = true;
                        var5_6.o(var8_9, var8_9);
                    }
                }
                ** GOTO lbl83
lbl78:
                // 1 sources

                var2_2.getClass();
lbl80:
                // 2 sources

                var8_9 = false;
                var2_2 = null;
                var3_3.Ta(false);
lbl83:
                // 2 sources

                if ((var2_2 = var3_3.f) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var6_7);
                    var8_9 = false;
                    var2_2 = null;
                }
                if (var8_9 = var2_2.isChecked()) {
                    var2_2 = "check";
lbl89:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var2_2 = "uncheck";
                ** continue;
                var11_12 = var2_2;
                var12_13 = "save card for faster checkout";
                Intrinsics.checkNotNullParameter(var12_13, "eventAction");
                var13_14 = new Bundle();
                var13_14.putString("order_id", null);
                var13_14.putString("return_id", var7_8);
                var13_14.putString("order_status", var7_8);
                var2_2 = AnalyticsManager.Companion;
                var9_10 = var2_2.getInstance().getNewCustomEventsRevamp();
                var14_15 = bv_0.a((AnalyticsManager$Companion)var2_2);
                var15_16 = cv_0.a((AnalyticsManager$Companion)var2_2);
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var9_10, "checkout_interactions", var12_13, (String)var11_12, "spc_interactions", "single page checkout", "order management screen", var14_15, var13_14, var15_16, false, null, 1536, null);
                return;
            }
            case 0: 
        }
        var3_3 = (EditText)var3_3;
        if (var3_3 != null) {
            var3_3.requestFocus();
        }
    }
}

