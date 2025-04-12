/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Bundle;
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import kotlin.jvm.internal.Intrinsics;

public final class fa2
implements View.OnClickListener {
    public final /* synthetic */ ga2_2 a;
    public final /* synthetic */ ma2_1 b;

    public /* synthetic */ fa2(ga2_2 ga2_22, ma2_1 ma2_12) {
        this.a = ga2_22;
        this.b = ma2_12;
    }

    public final void onClick(View view) {
        ga2_2 ga2_22 = this.a;
        Intrinsics.checkNotNullParameter(ga2_22, "this$0");
        ma2_1 ma2_12 = this.b;
        Intrinsics.checkNotNullParameter(ma2_12, "$listener");
        Bundle bundle = new Bundle();
        float f5 = ga2_22.e.c();
        bundle.putFloat("amount_payable", f5);
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushCartInteractionsEvent("free gift widget click", "", "widget_interaction", "order confirmation screen", "widget interaction", bundle);
        ma2_12.f4();
    }
}

