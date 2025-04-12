/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Oo
 */
public final class oo_0 {
    public static final Oo$a Companion;
    public final zr1_1 a;
    public final Activity b;
    public AppUpdateInfo c;
    public no_1 d;
    public AppUpdateManager e;
    public final NewCustomEventsRevamp f;
    public final NewEEcommerceEventsRevamp g;

    static {
        Oo$a oo$a;
        Companion = oo$a = new Object();
    }

    public oo_0(zr1_1 object, Activity object2) {
        Intrinsics.checkNotNullParameter(object, "appUpdateMLD");
        Intrinsics.checkNotNullParameter(object2, "activity");
        this.a = object;
        this.b = object2;
        object = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.f = object2;
        this.g = object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
    }

    public final void a(boolean bl2) {
        Object object = Companion;
        object.getClass();
        boolean bl3 = Oo$a.a();
        if (bl3) {
            this.e = object = AppUpdateManagerFactory.create((Context)this.b);
            if (object != null) {
                object = object.getAppUpdateInfo();
            } else {
                bl3 = false;
                object = null;
            }
            if (object != null) {
                lo_2 lo_22 = new lo_2(this, bl2);
                mo_1 mo_12 = new mo_1(lo_22);
                ((Task)object).addOnSuccessListener(mo_12);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        Exception exception2;
        Object object;
        block4: {
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            NewCustomEventsRevamp newCustomEventsRevamp;
            block3: {
                newCustomEventsRevamp = this.f;
                object = this.g;
                object5 = this.c;
                if (object5 == null) return;
                object4 = new no_1(this);
                this.d = object4;
                object3 = this.e;
                if (object3 != null) {
                    object3.registerListener((InstallStateUpdatedListener)object4);
                }
                try {
                    object4 = this.e;
                    if (object4 == null) break block3;
                    object3 = this.b;
                    int n3 = 51;
                    object2 = null;
                    object4.startUpdateFlowForResult((AppUpdateInfo)object5, 0, (Activity)object3, n3);
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            object5 = newCustomEventsRevamp.getEC_APP_UPDATE_INTERACTION();
            object4 = newCustomEventsRevamp.getUPDATE_POP_UP_VIEW();
            object3 = "";
            Object object6 = "event_app_update_interaction";
            object2 = AnalyticsManager.Companion;
            Object object7 = ((AnalyticsManager$Companion)object2).getInstance();
            object7 = ((AnalyticsManager)object7).getGtmEvents();
            object7 = ((GTMEvents)object7).getScreenName();
            object2 = ((AnalyticsManager$Companion)object2).getInstance();
            object2 = ((AnalyticsManager)object2).getGtmEvents();
            object2 = ((GTMEvents)object2).getScreenName();
            String string2 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
            String string3 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
            int n4 = 1536;
            object = object5;
            object5 = object4;
            object4 = object3;
            object3 = object6;
            object6 = object7;
            object7 = string2;
            string2 = null;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object, (String)object5, (String)object4, (String)object3, (String)object6, (String)object2, (String)object7, null, string3, false, null, n4, null);
            return;
        }
        object = yn3_0.a;
        ((yn3$a)object).e(exception2);
    }
}

