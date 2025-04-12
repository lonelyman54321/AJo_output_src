/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.home.landingpage.viewholder.cms.HomeCmsAppUpdateVH;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from b71
 */
public final class b71_0
implements View.OnClickListener {
    public final /* synthetic */ po_0 a;
    public final /* synthetic */ HomeCmsAppUpdateVH b;

    public /* synthetic */ b71_0(po_0 po_02, HomeCmsAppUpdateVH homeCmsAppUpdateVH) {
        this.a = po_02;
        this.b = homeCmsAppUpdateVH;
    }

    public final void onClick(View object) {
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = this.a;
        if (object != null) {
            object.s0();
        }
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object2 = ((HomeCmsAppUpdateVH)object2).d.getText();
        object2 = object2 != null ? object2.toString() : null;
        ((GTMEvents)object).pushUpdateAppEvent("link click", object2, "landing screen");
    }
}

