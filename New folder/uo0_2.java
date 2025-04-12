/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 */
import android.view.View;
import android.widget.AdapterView;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.databinding.FragmentDeleteAccountBinding;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uo0
 */
public final class uo0_2
implements AdapterView.OnItemClickListener {
    public final /* synthetic */ yo0_2 a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ uo0_2(yo0_2 yo0_22, ArrayList arrayList) {
        this.a = yo0_22;
        this.b = arrayList;
    }

    public final void onItemClick(AdapterView adapterView, View view, int n3, long l2) {
        yo0_2 yo0_22 = this.a;
        Intrinsics.checkNotNullParameter(yo0_22, "this$0");
        ArrayList arrayList = this.b;
        Intrinsics.checkNotNullParameter(arrayList, "$listdata");
        NewCustomEventsRevamp newCustomEventsRevamp = yo0_22.d;
        String string2 = newCustomEventsRevamp.getEVENT_CATEGORY_DELETE_PROFILE();
        Object object = yo0_22.d;
        String string3 = ((NewCustomEventsRevamp)object).getEVENT_ACTION_DELETE_REASON_SELECT_OPTION();
        arrayList = arrayList.get(n3);
        Intrinsics.checkNotNullExpressionValue(arrayList, "get(...)");
        Object object2 = arrayList;
        object2 = (String)((Object)arrayList);
        String string4 = ((NewCustomEventsRevamp)object).getEVENT_DELETE_MY_ACCOUNT_INTERACTIONS();
        object = AnalyticsManager.Companion;
        String string5 = bv_0.a((AnalyticsManager$Companion)object);
        String string6 = cv_0.a((AnalyticsManager$Companion)object);
        int n4 = 1664;
        String string7 = "delete your profile screen";
        String string8 = "delete your profile screen";
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, (String)object2, string4, string7, string8, string5, null, string6, false, null, n4, null);
        object = yo0_22.a;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            object = null;
        }
        ((FragmentDeleteAccountBinding)object).tvDeleteAccount.setEnabled(true);
    }
}

