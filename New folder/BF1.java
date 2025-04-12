/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.payment.fragment.h;
import kotlin.jvm.internal.Intrinsics;

public final class BF1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ BF1(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = (vv2_2)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                object.getClass();
                Object object2 = z40_0.Companion;
                object2 = Q.a((AJIOApplication.a)AJIOApplication.Companion, (z40$a)object2).a;
                boolean bl2 = ((ao0_0)object2).a("autoSuggestionNewUIEnabled");
                NewCustomEventsRevamp newCustomEventsRevamp = ((vv2_2)object).z0;
                if (bl2) {
                    String string2 = newCustomEventsRevamp.getEC_USER_INTERACTION();
                    String string3 = newCustomEventsRevamp.getEA_NAV_CLICK_HEADER();
                    int n4 = 1536;
                    String string4 = "back button";
                    String string5 = "navigation_click";
                    String string6 = "search screen";
                    String string7 = "search screen";
                    String string8 = ((vv2_2)object).A0;
                    String string9 = ((vv2_2)object).B0;
                    NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string4, string5, string6, string7, string8, null, string9, false, null, n4, null);
                } else {
                    String string10 = newCustomEventsRevamp.getEC_USER_INTERACTION();
                    String string11 = newCustomEventsRevamp.getEA_NAV_CLICK_HEADER();
                    int n7 = 1536;
                    String string12 = "cross button";
                    String string13 = "navigation_click";
                    String string14 = "search screen";
                    String string15 = "search screen";
                    String string16 = ((vv2_2)object).A0;
                    String string17 = ((vv2_2)object).B0;
                    NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string10, string11, string12, string13, string14, string15, string16, null, string17, false, null, n7, null);
                }
                try {
                    object2 = ((Fragment)object).getActivity();
                    if (object2 == null) return;
                    object2 = ((Fragment)object).requireActivity();
                    bl2 = object2.isFinishing();
                    if (bl2) return;
                    object2 = ((vv2_2)object).n;
                    if (object2 == null) {
                        object2 = "activityFragmentListener";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        bl2 = false;
                        object2 = null;
                    }
                    if ((object2 = object2.y()) != null && (object2 = ((Fragment)object2).getChildFragmentManager()) != null) {
                        ((FragmentManager)object2).W();
                    }
                    if ((object = ((vv2_2)object).o) == null) return;
                }
                catch (IllegalStateException illegalStateException) {}
                bl2 = object instanceof AjioHomeActivity;
                if (!bl2) return;
                bl2 = false;
                object2 = null;
                ((hc1_2)object).x1(false);
                return;
                object2 = yn3_0.a;
                ((yn3$a)object2).e(illegalStateException);
                return;
            }
            case 1: {
                Object object = (h)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Object object3 = AnalyticsManager.Companion;
                Object object4 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
                object3 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents().getScreenName();
                String string18 = "WhatisCVV_clicked";
                String string19 = "What is CVV clicked";
                ((GTMEvents)object4).pushButtonTapEvent(string18, string19, (String)object3);
                object = ((Fragment)object).getContext();
                boolean bl3 = object instanceof AppCompatActivity;
                if (!bl3) return;
                lh0_2.Companion.getClass();
                object3 = new lh0_2();
                object = ((AppCompatActivity)object).getSupportFragmentManager();
                object4 = "CvvInfoBottomFragment";
                ((DialogFragment)object3).show((FragmentManager)object, (String)object4);
                return;
            }
            case 0: 
        }
        CF1 cF1 = (CF1)this.b;
        Intrinsics.checkNotNullParameter(cF1, "this$0");
        Object object = cF1.c;
        if (object != null) {
            object.z2();
        }
        if ((object = cF1.Ta()) != null && (object = ((F12)object).d) != null) {
            Object var6_14 = null;
            ((bv2_0)object).O = false;
        }
        cF1.Xa();
        cF1.Qa();
        object = cF1.getParentFragment();
        if (object == null) return;
        if ((object = ((Fragment)object).getChildFragmentManager()) == null) return;
        ((FragmentManager)object).W();
    }
}

