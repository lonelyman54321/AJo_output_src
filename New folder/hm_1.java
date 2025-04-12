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
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HM
 */
public final class hm_1
implements View.OnClickListener {
    public final /* synthetic */ im_2 a;

    public /* synthetic */ hm_1(im_2 im_22) {
        this.a = im_22;
    }

    public final void onClick(View object) {
        im_2 im_22 = this.a;
        Intrinsics.checkNotNullParameter(im_22, "this$0");
        GTMEvents gTMEvents = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string2 = "bag interactions";
        String string3 = "know more click";
        String string4 = "";
        String string5 = "know_more_click";
        String string6 = "bag screen";
        gTMEvents.pushCartInteractionsEvent(string3, string4, string5, string6, string2, null);
        object = im_22.a;
        if (object != null) {
            object.m0();
        }
    }
}

