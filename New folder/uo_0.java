/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from UO
 */
public final class uo_0
implements View.OnClickListener {
    public final /* synthetic */ wo_0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ uo_0(wo_0 wo_02, String string2) {
        this.a = wo_02;
        this.b = string2;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        GTMEvents.pushCartInteractionsEvent$default(AnalyticsManager.Companion.getInstance().getGtmEvents(), "Read policy click", "", "read_policy", "bag screen", "bag interactions", null, 32, null);
        CustomWebViewActivity$a customWebViewActivity$a = CustomWebViewActivity.Companion;
        object = object.g.getContext();
        Intrinsics.checkNotNullExpressionValue(object, "getContext(...)");
        String string2 = this.b;
        CustomWebViewActivity$a.b(customWebViewActivity$a, (Context)object, string2, 14);
    }
}

