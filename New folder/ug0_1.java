/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.res.Resources;
import android.view.View;
import com.ril.ajio.R$color;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.web.CustomWebViewActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ug0
 */
public final class ug0_1
implements View.OnClickListener {
    public final /* synthetic */ CustomWebViewActivity a;

    public /* synthetic */ ug0_1(CustomWebViewActivity customWebViewActivity) {
        this.a = customWebViewActivity;
    }

    public final void onClick(View view) {
        Object object = CustomWebViewActivity.Companion;
        CustomWebViewActivity customWebViewActivity = this.a;
        Intrinsics.checkNotNullParameter(customWebViewActivity, "this$0");
        customWebViewActivity.E2().webviewContainerDelete.setVisibility(0);
        object = customWebViewActivity.E2().tvYourData;
        Resources resources = customWebViewActivity.getResources();
        int n3 = R$color.white;
        int n4 = resources.getColor(n3);
        object.setTextColor(n4);
        customWebViewActivity.E2().tvYourData.setSelected(true);
        object = customWebViewActivity.E2().tvPrivacy;
        resources = customWebViewActivity.getResources();
        n3 = R$color.color_202020;
        n4 = resources.getColor(n3);
        object.setTextColor(n4);
        customWebViewActivity.E2().tvPrivacy.setSelected(false);
        customWebViewActivity.E2().webviewContainer.setVisibility(8);
        object = AnalyticsManager.Companion;
        String string2 = bv_0.a((AnalyticsManager$Companion)object);
        String string3 = cv_0.a((AnalyticsManager$Companion)object);
        NewCustomEventsRevamp.newPushCustomEvent$default(customWebViewActivity.u0, "", "", null, "screen_view", "your data screen", "your data screen", string2, null, string3, false, null, 1668, null);
    }
}

