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
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.jvm.internal.Intrinsics;

public final class K22
implements View.OnClickListener {
    public final /* synthetic */ q22_0 a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ K22(q22_0 q22_02, Bundle bundle) {
        this.a = q22_02;
        this.b = bundle;
    }

    public final void onClick(View object) {
        q22_0 q22_02 = this.a;
        Intrinsics.checkNotNullParameter(q22_02, "this$0");
        Bundle bundle = this.b;
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        object = q22_02.requireActivity();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity");
        ((AjioHomeActivity)object).v();
        GTMEvents.pushButtonTapEvent$default(AnalyticsManager.Companion.getInstance().getGtmEvents(), "No faster delivery screen interaction", "continue shopping", "No faster delivery screen", null, bundle, 8, null);
    }
}

