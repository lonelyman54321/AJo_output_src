/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.gamezone.GameZoneWebViewActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from DY0
 */
public final class dy0_0
implements Runnable {
    public final /* synthetic */ GameZoneWebViewActivity a;
    public final /* synthetic */ String b;

    public /* synthetic */ dy0_0(GameZoneWebViewActivity gameZoneWebViewActivity, String string2) {
        this.a = gameZoneWebViewActivity;
        this.b = string2;
    }

    public final void run() {
        int n3;
        Object object = GameZoneWebViewActivity.Companion;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$gameName");
        Object object3 = ((GameZoneWebViewActivity)object).z2();
        if (object3 != null && (n3 = ((String)object3).length()) != 0) {
            boolean bl2;
            Object object4 = GAEcommerceEvents.INSTANCE;
            String string2 = ((GameZoneWebViewActivity)object).H0;
            String string3 = ((GameZoneWebViewActivity)object).A2();
            String string4 = "start playing";
            String string5 = "game rules screen";
            ((GAEcommerceEvents)object4).pushGameZonePlayEvent("gamezone", "game rules screen clicks", string4, string2, string5, string3);
            object3 = AnalyticsManager.Companion;
            object4 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
            String string6 = "game screen";
            ((GTMEvents)object4).pushOpenScreenEvent(string6);
            object3 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
            String string7 = "game started";
            ((GTMEvents)object3).pushEvent("gamezone", string7, object2, string6);
            object3 = mz3_0.Q(((GameZoneWebViewActivity)object).z2());
            object4 = ((GameZoneWebViewActivity)object).G0;
            string6 = "&sub=";
            ((GameZoneWebViewActivity)object).G0 = object3 = n1.a((String)object4, string6, (String)object3);
            object3 = ((GameZoneWebViewActivity)object).y0;
            if (object3 != null) {
                object3.setText((CharSequence)object2);
            }
            if ((object3 = ((GameZoneWebViewActivity)object).B0) != null) {
                object4 = new StringBuilder();
                ((StringBuilder)object4).append((String)object2);
                ((StringBuilder)object4).append(" page");
                object2 = ((StringBuilder)object4).toString();
                object3.setContentDescription((CharSequence)object2);
            }
            ((GameZoneWebViewActivity)object).F0 = bl2 = true;
            object2 = ((GameZoneWebViewActivity)object).k0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gameZoneJavaInterface");
                bl2 = false;
                object2 = null;
            }
            ((my0_1)object2).c = object3 = ((GameZoneWebViewActivity)object).H0;
            object2 = ((GameZoneWebViewActivity)object).G0;
            ((GameZoneWebViewActivity)object).D2((String)object2);
        } else {
            object2 = ((GameZoneWebViewActivity)object).D0;
            if (object2 != null) {
                ((AjioLoaderView)((Object)object2)).startLoader();
            }
            object = ((GameZoneWebViewActivity)object).p0;
            Intrinsics.checkNotNull(object);
            ((hy3_0)object).n();
        }
    }
}

