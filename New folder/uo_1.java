/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 */
import android.app.Activity;
import android.os.Bundle;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uo
 */
public final class uo_1
implements Function1 {
    public final /* synthetic */ wo a;
    public final /* synthetic */ AppUpdateManager b;

    public /* synthetic */ uo_1(wo wo2, AppUpdateManager appUpdateManager) {
        this.a = wo2;
        this.b = appUpdateManager;
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (AppUpdateInfo)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Object object4 = "$appUpdateManager";
        Object object5 = this.b;
        Intrinsics.checkNotNullParameter(object5, (String)object4);
        Intrinsics.checkNotNull(object2);
        object3.getClass();
        int n3 = ((AppUpdateInfo)object2).updateAvailability();
        int n4 = 2;
        xo_0 xo_02 = ((wo)object3).a;
        if (n3 == n4 && (n4 = (int)(((AppUpdateInfo)object2).isUpdateTypeAllowed(n3 = 1) ? 1 : 0)) != 0) {
            n4 = ((AppUpdateInfo)object2).availableVersionCode();
            qo_0.a = n4;
            object3 = ((wo)object3).b;
            n4 = 51;
            object5.startUpdateFlowForResult((AppUpdateInfo)object2, n3, (Activity)object3, n4);
            object4 = AnalyticsManager.Companion;
            object3 = ((AnalyticsManager$Companion)object4).getInstance();
            object3 = ((AnalyticsManager)object3).getGtmEvents();
            object5 = "hard update widget - viewed";
            int n7 = ((AppUpdateInfo)object2).availableVersionCode();
            object2 = n7;
            String string2 = "splash screen";
            ((GTMEvents)object3).pushUpdateAppEvent((String)object5, object2, string2);
            Bundle bundle = new Bundle();
            object2 = "current app version";
            int n8 = 3444;
            bundle.putInt((String)object2, n8);
            object2 = "proposed app version";
            n8 = qo_0.a;
            bundle.putInt((String)object2, n8);
            object2 = ((AnalyticsManager$Companion)object4).getInstance();
            NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager)object2).getNewCustomEventsRevamp();
            object2 = ((AnalyticsManager$Companion)object4).getInstance();
            object2 = ((AnalyticsManager)object2).getNewCustomEventsRevamp();
            String string3 = ((NewCustomEventsRevamp)object2).getEC_USER_INTERACTION();
            String string4 = "update widget viewed - hard";
            n7 = qo_0.a;
            String string5 = String.valueOf(n7);
            String string6 = "update_click_widget";
            String string7 = "splash screen";
            String string8 = "splash screen";
            object2 = ((AnalyticsManager$Companion)object4).getInstance();
            object2 = ((AnalyticsManager)object2).getNewEEcommerceEventsRevamp();
            String string9 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
            object2 = ((AnalyticsManager$Companion)object4).getInstance();
            object2 = ((AnalyticsManager)object2).getNewEEcommerceEventsRevamp();
            String string10 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
            int n10 = 1536;
            try {
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string3, string4, string5, string6, string7, string8, string9, bundle, string10, false, null, n10, null);
            }
            catch (Exception exception) {
                object4 = yn3_0.a;
                ((yn3$a)object4).e(exception);
                xo_02.Z();
            }
        } else {
            xo_02.Z();
        }
        return Unit.a;
    }
}

