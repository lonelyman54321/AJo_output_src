/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 */
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

public final class r22
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sm3_0 b;

    public /* synthetic */ r22(sm3_0 sm3_02, int n3) {
        this.a = n3;
        this.b = sm3_02;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                vv2_2 vv2_22 = (vv2_2)this.b;
                Intrinsics.checkNotNullParameter(vv2_22, "this$0");
                NewCustomEventsRevamp newCustomEventsRevamp = vv2_22.z0;
                String string2 = newCustomEventsRevamp.getEC_SEARCH_BAR_INTERACTIONS();
                EditText editText = vv2_22.H;
                EditText editText2 = null;
                String string3 = "searchETVRefresh";
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    editText = null;
                }
                String string4 = editText.getText().toString();
                int n4 = 1536;
                String string5 = "cross icon click";
                String string6 = "search_bar_interactions";
                String string7 = "search screen";
                String string8 = "search screen";
                String string9 = vv2_22.A0;
                Object var16_27 = null;
                String string10 = vv2_22.B0;
                Object var18_31 = null;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string5, string4, string6, string7, string8, string9, null, string10, false, null, n4, null);
                editText = vv2_22.H;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                } else {
                    editText2 = editText;
                }
                editText2.getText().clear();
                editText = vv2_22.T;
                if (editText != null) {
                    int n7 = 8;
                    editText.setVisibility(n7);
                }
                return;
            }
            case 0: 
        }
        Object object = (q22_0)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        Object object3 = o72_0.a;
        String string11 = "plp_sort_clicked";
        String string12 = "PLP";
        ((GTMEvents)object2).pushButtonTapEvent(string11, string12, (String)object3);
        NewCustomEventsRevamp newCustomEventsRevamp = ((q22_0)object).D0;
        String string13 = newCustomEventsRevamp.getEC_PRODUCT_LIST_INTERACTIONS();
        String string14 = o72_0.a;
        String string15 = ((q22_0)object).E0;
        String string16 = ((q22_0)object).F0;
        int n8 = 1664;
        String string17 = "sort menu open";
        String string18 = "";
        String string19 = "plp_sort_menu_open";
        String string20 = "plp screen";
        Object var7_12 = null;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string13, string17, string18, string19, string14, string20, string15, null, string16, false, null, n8, null);
        object2 = ((Fragment)object).getArguments();
        if (object2 != null && (n3 = (int)((object2 = ((Fragment)object).requireArguments()).containsKey((String)(object3 = "PLP_TYPE")) ? 1 : 0)) != 0) {
            object2 = x32_0.Companion;
            string11 = ((Fragment)object).requireArguments();
            int n10 = string11.getInt((String)object3);
            object2.getClass();
            n3 = 100;
            object2 = n10 != n3 ? (n10 != (n3 = 101) ? new x32_0() : new ng1_0()) : new x32_0();
            string12 = new Bundle();
            string12.putInt((String)object3, n10);
            ((Fragment)object2).setArguments((Bundle)string12);
            object3 = ((Fragment)object).getChildFragmentManager();
            object = ((Fragment)object).getTag();
            ((DialogFragment)object2).show((FragmentManager)object3, (String)object);
        }
    }
}

