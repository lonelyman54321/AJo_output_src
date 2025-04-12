/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.style.ClickableSpan
 *  android.view.View
 */
import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.web.CustomWebViewActivity;

public final class pD0$a
extends ClickableSpan {
    public String a;

    public final void onClick(View view) {
        Object object = AnalyticsManager.getInstance().getGtmEvents();
        String string2 = AnalyticsManager.getInstance().getGtmEvents().getScreenName();
        ((GTMEvents)object).pushButtonTapEvent("returns", "drop at store", string2);
        view = view.getContext();
        object = this.a;
        CustomWebViewActivity.H2((Context)view, 14, (String)object);
    }
}

