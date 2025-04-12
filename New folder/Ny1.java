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
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import kotlin.jvm.internal.Intrinsics;

public final class Ny1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Ny1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                NativeAdViewRenderer.j((NativeAdViewRenderer)this.b, (View)object);
                return;
            }
            case 0: 
        }
        object = (ry1_1)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string2 = "T&C Click";
        String string3 = "login/signup screen";
        String string4 = "Welcome to AJIO";
        ((GTMEvents)object2).pushButtonTapEvent(string4, string2, string3);
        object = ((H51)object).getContext();
        if (object != null) {
            object2 = CustomWebViewActivity.Companion;
            string2 = null;
            int n4 = 13;
            CustomWebViewActivity$a.b((CustomWebViewActivity$a)object2, (Context)object, null, n4);
        }
    }
}

