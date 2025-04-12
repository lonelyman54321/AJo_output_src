/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextPaint
 *  android.text.style.ClickableSpan
 *  android.view.View
 */
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gO2
 */
public final class go2_1
extends ClickableSpan {
    public final /* synthetic */ ho2_0 a;
    public final /* synthetic */ String b;

    public go2_1(ho2_0 ho2_02, String string2) {
        this.a = ho2_02;
        this.b = string2;
    }

    public final void onClick(View view) {
        Object object = view;
        Intrinsics.checkNotNullParameter(view, "view");
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        NewCustomEventsRevamp newCustomEventsRevamp = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
        String string2 = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp().getEC_ORDER_DETAIL_INTERACTION();
        String string3 = bv_0.a(analyticsManager$Companion);
        String string4 = cv_0.a(analyticsManager$Companion);
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "delivered return info", "", "delivered_return_info", "consolidated order details screen", "order management screen", string3, null, string4, false, null, 1536, null);
        analyticsManager$Companion = this.a.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(analyticsManager$Companion, "getContext(...)");
        object = this.b;
        at2_1.k((Context)analyticsManager$Companion, 9, (String)object);
    }

    public final void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "ds");
        textPaint.setUnderlineText(false);
    }
}

