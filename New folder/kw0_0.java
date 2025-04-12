/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Kw0
 */
public final class kw0_0
implements OnFailureListener,
o60_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ kw0_0(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onFailure(Exception object) {
        Object object2 = (lw0_1)this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = "exception";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n3 = object instanceof SplitInstallException;
        if (n3 == 0) return;
        object = (SplitInstallException)object;
        int n4 = ((SplitInstallException)object).getErrorCode();
        n3 = -6;
        Iterator iterator = "Dynamic Module Missing";
        Object object4 = "Proceed to Payments";
        Object object5 = "ServiceErrorEvent";
        if (n4 != n3) {
            int n7;
            n3 = -1;
            if (n4 != n3) return;
            object = AnalyticsManager.Companion;
            object3 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
            object = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
            ((GTMEvents)object3).pushEvent((String)object5, (String)object4, iterator, (String)object);
            object = "ActiveDownloads";
            object3 = ((lw0_1)object2).b;
            if (object3 == null) return;
            iterator = object3.getSessionStates();
            if (iterator == null) return;
            iterator = object3.getSessionStates();
            iterator = ((Task)((Object)iterator)).getResult();
            if (iterator == null) return;
            iterator = object3.getSessionStates();
            iterator = ((Task)((Object)iterator)).getResult();
            iterator = (List)((Object)iterator);
            try {
                iterator = iterator.iterator();
            }
            catch (IllegalStateException illegalStateException) {
                object2 = AnalyticsManager.Companion;
                object3 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
                object2 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
                iterator = "Check for Active Downloads Error";
                ((GTMEvents)object3).pushEvent((String)object, (String)object, iterator, (String)object2);
                return;
            }
            while (true) {
                n7 = iterator.hasNext();
                if (n7 == 0) return;
                break;
            }
            {
                int n8;
                object4 = iterator.next();
                if ((object4 = (SplitInstallSessionState)object4) == null) continue;
                n7 = ((SplitInstallSessionState)object4).status();
                if (n7 != (n8 = 2)) continue;
                object4 = ((lw0_1)object2).e;
                object3.deferredInstall((List)object4);
                object4 = AnalyticsManager.Companion;
                object5 = ((AnalyticsManager$Companion)object4).getInstance();
                object5 = ((AnalyticsManager)object5).getGtmEvents();
                String string2 = "Defer Install of Active Downloads";
                object4 = ((AnalyticsManager$Companion)object4).getInstance();
                object4 = ((AnalyticsManager)object4).getGtmEvents();
                object4 = ((GTMEvents)object4).getScreenName();
                ((GTMEvents)object5).pushEvent((String)object, (String)object, string2, (String)object4);
                continue;
            }
        } else {
            object = AnalyticsManager.Companion;
            object3 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
            object = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
            ((GTMEvents)object3).pushEvent((String)object5, (String)object4, iterator, (String)object);
            object = new Intent("ACTION_API_FAILURE");
            object.putExtra("alert_type", 0);
            object3 = "ALERT_TYPE_DYNAMIC_FEATURES";
            iterator = "alert_type_dynamic_features";
            object.putExtra((String)object3, (String)((Object)iterator));
            object2 = Xv1.a(((lw0_1)object2).a.getApplicationContext());
            ((Xv1)object2).c((Intent)object);
        }
    }
}

