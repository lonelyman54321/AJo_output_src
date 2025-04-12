/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.payment.fragment.h;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Br2
 */
public final class br2_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ br2_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                boolean bl2;
                vv2_2 vv2_22 = (vv2_2)this.b;
                Intrinsics.checkNotNullParameter(vv2_22, "this$0");
                NewCustomEventsRevamp newCustomEventsRevamp = vv2_22.z0;
                String string2 = newCustomEventsRevamp.getEC_SEARCH_BAR_INTERACTIONS();
                EditText editText = vv2_22.H;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchETVRefresh");
                    bl2 = false;
                    editText = null;
                }
                String string3 = editText.getText().toString();
                String string4 = vv2_22.A0;
                String string5 = vv2_22.B0;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "search icon click", string3, "search_bar_interactions", "search screen", "search screen", string4, null, string5, false, null, 1536, null);
                bl2 = og1_1.c();
                vv2_22.hb(bl2);
                return;
            }
            case 0: 
        }
        h h3 = (h)this.b;
        Intrinsics.checkNotNullParameter(h3, "this$0");
        h3.Xa("year");
        TextView textView = h3.y;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtExpiryYearError");
            n3 = 0;
            textView = null;
        }
        ai0_2.i((View)textView);
    }
}

