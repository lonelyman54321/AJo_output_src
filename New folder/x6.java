/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

public final class x6
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ x6(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View view) {
        Fragment fragment = this.b;
        Object object = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                fragment = (ag1_1)fragment;
                Intrinsics.checkNotNullParameter(fragment, (String)object);
                object = AnalyticsManager.Companion;
                NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
                String string2 = bv_0.a((AnalyticsManager$Companion)object);
                String string3 = cv_0.a((AnalyticsManager$Companion)object);
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "severe return detail screen interaction", "okay click", "", "severe_return_detail_screen_interaction", "return - exchange nudge severe return detail screen", null, string2, null, string3, false, null, 1568, null);
                object = ((ag1_1)fragment).d;
                ((BottomSheetDialogFragment)fragment).dismiss();
                return;
            }
            case 0: 
        }
        fragment = (z6_0)fragment;
        Intrinsics.checkNotNullParameter(fragment, (String)object);
        fragment.getParentFragmentManager().W();
    }
}

