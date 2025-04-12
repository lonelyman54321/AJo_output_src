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
import com.ril.ajio.payment.fragment.i;
import com.ril.ajio.payment.fragment.i$b$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WW2
 */
public final class ww2_1
implements View.OnClickListener {
    public final /* synthetic */ i a;

    public /* synthetic */ ww2_1(i i3) {
        this.a = i3;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object.getClass();
        Object object2 = AnalyticsManager.Companion.getInstance();
        GTMEvents gTMEvents = ((AnalyticsManager)object2).getGtmEvents();
        int n3 = 32;
        String string2 = "checkout interactions";
        String string3 = "save_card_consent_interaction";
        String string4 = "save card consent";
        String string5 = "accept";
        String string6 = "save card consent screen";
        GTMEvents.gtmEventsToGaWithCategory$default(gTMEvents, string2, string3, string4, string5, string6, null, n3, null);
        object = ((i)object).b;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callBack");
            object = null;
        }
        object2 = i$b$a.a;
        object.invoke(object2);
    }
}

