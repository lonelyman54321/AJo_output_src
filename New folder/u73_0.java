/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.Credential$Builder;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.view.BaseSplitActivity;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from u73
 */
public final class u73_0
implements F62 {
    public final /* synthetic */ x73_0 a;

    public u73_0(x73_0 x73_02) {
        this.a = x73_02;
    }

    public final void onChanged(Object object) {
        int n3 = 1;
        Object object2 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object2, (DataCallback)(object = (DataCallback)object));
        if (n4 != 0) {
            n4 = ((DataCallback)object).getStatus();
            String string2 = "Sign in with Google Smart Lock pwd - Success";
            String string3 = "Sign In";
            Object object3 = this.a;
            if (n4 == 0) {
                object = new HashMap();
                Object object4 = AnalyticsManager.getInstance().getGtmEvents();
                object2 = AnalyticsManager.getInstance().getGtmEvents().getScreenName();
                ((GTMEvents)object4).pushButtonTapEvent(string3, string2, (String)object2);
                ((HashMap)object).put("Source", "GoogleSmartLockPwd");
                object4 = AnalyticsManager.getInstance().getCt();
                object2 = new AnalyticsData$Builder();
                object = ((AnalyticsData$Builder)object2).eventMap((HashMap)object).build();
                ((CleverTapEvents)object4).loginComplete((AnalyticsData)object);
                object3.getClass();
                tj2_2.Companion.getClass();
                object = tj2$a_0.a();
                object.getClass();
                object4 = "";
                Intrinsics.checkNotNullParameter(object4, "pincode");
                ((tj2_2)object).a = object4;
                object = ((x73_0)object3).e;
                object2 = "LOCATION_DATA";
                ((sw_0)object).putPreference((String)object2, (String)object4);
                ((x73_0)object3).d.n();
                object = ((x73_0)object3).b;
                n3 = object instanceof AjioHomeActivity;
                if (n3 != 0) {
                    ((AjioHomeActivity)object).P2().c();
                    object = Unit.a;
                }
            } else {
                n4 = ((DataCallback)object).getStatus();
                if (n4 == n3) {
                    Object object5;
                    Object object6;
                    object2 = ((x73_0)object3).b;
                    n4 = object2 instanceof BaseSplitActivity;
                    if (n4 != 0 && (object2 = ((DataCallback)object).getError().getErrorMessage()) != null && (n4 = (int)(((String)(object2 = ((DataCallback)object).getError().getErrorMessage().getType())).equalsIgnoreCase((String)(object6 = "InvalidGrantError")) ? 1 : 0)) != 0) {
                        n4 = R$string.acc_error_message;
                        object2 = hv3_0.K(n4);
                        object6 = ((DataCallback)object).getError().getErrorMessage().getMessage();
                        object5 = new Object[n3];
                        object5[0] = object6;
                        object5 = String.format((String)object2, (Object[])object5);
                        object2 = (BaseSplitActivity)((x73_0)object3).b;
                        object6 = ((DataCallback)object).getError().getErrorMessage().getMessage();
                        ((BaseSplitActivity)object2).showNotification((String)object6, (String)object5);
                        object5 = ((BaseSplitActivity)object2).getSmartLockManager();
                        object2 = ((x73_0)object3).c;
                        object3 = ((oa1_1)object2).D;
                        object2 = ((oa1_1)object2).E;
                        object5.getClass();
                        object6 = new Credential$Builder((String)object3);
                        object2 = ((Credential$Builder)object6).setPassword((String)object2).build();
                        object5 = ((x73_0)object5).a.delete((Credential)object2);
                        object2 = new Object();
                        ((Task)object5).addOnCompleteListener((OnCompleteListener)object2);
                    }
                    if ((object5 = ((DataCallback)object).getError()) != null && (object5 = ((DataCallback)object).getError().getErrorMessage()) != null && (object5 = ((DataCallback)object).getError().getErrorMessage().getMessage()) != null && (n3 = (int)(TextUtils.isEmpty((CharSequence)(object5 = ((DataCallback)object).getError().getErrorMessage().getMessage())) ? 1 : 0)) == 0) {
                        object5 = AnalyticsManager.getInstance().getGtmEvents();
                        object = ((DataCallback)object).getError().getErrorMessage().getMessage();
                        object2 = AnalyticsManager.getInstance().getGtmEvents().getScreenName();
                        object3 = "Sign In_Error";
                        ((GTMEvents)object5).pushButtonTapEvent((String)object3, object, (String)object2);
                    }
                    object = AnalyticsManager.getInstance().getGtmEvents();
                    object5 = AnalyticsManager.getInstance().getGtmEvents().getScreenName();
                    ((GTMEvents)object).pushButtonTapEvent(string3, string2, (String)object5);
                }
            }
        }
    }
}

