/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

public final class uZ1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ uZ1(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View view) {
        Object object = this.b;
        Object object2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                gn1_2[] gn1_2Array = sa2_2.j;
                object = (sa2_2)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                ((BottomSheetDialogFragment)object).dismiss();
                return;
            }
            case 1: {
                object = (ho2_2)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
                object2 = ((ho2_2)object).b;
                if (object2 != null) {
                    object = ((ho2_2)object).d;
                    object2.onClick((View)object);
                }
                return;
            }
            case 0: 
        }
        object = (bz1_2)object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = uy1_0.a;
        Bundle bundle = new Bundle();
        object2 = uy1_0.c;
        Object object3 = uy1_0.a();
        bundle.putString((String)object2, (String)object3);
        bundle.putString("page_type", "my account screen");
        object3 = uy1_0.a;
        String string2 = ((NewCustomEventsRevamp)object3).getEC_USER_ACCOUNTS();
        object2 = AnalyticsManager.Companion;
        String string3 = bv_0.a((AnalyticsManager$Companion)object2);
        String string4 = cv_0.a((AnalyticsManager$Companion)object2);
        String string5 = uy1_0.f;
        String string6 = uy1_0.g;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string2, string5, string6, "user_account_interactions", "my account screen", "my account screen", string3, bundle, string4, false, null, 1536, null);
        object.getClass();
        object2 = new ek_2();
        Intrinsics.checkNotNullParameter(object, "clickListener");
        ((ek_2)object2).c = object;
        object = ((Fragment)object).requireActivity().getSupportFragmentManager();
        object3 = hv3_0.K(R$string.cancel_request_text);
        ((DialogFragment)object2).show((FragmentManager)object, (String)object3);
    }
}

