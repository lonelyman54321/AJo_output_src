/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
import android.graphics.Typeface;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$Tab;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RV1
 */
public final class rv1_2
implements TabLayout$OnTabSelectedListener {
    public final /* synthetic */ qv1_2 a;

    public rv1_2(qv1_2 qv1_22) {
        this.a = qv1_22;
    }

    public final void onTabReselected(TabLayout$Tab tabLayout$Tab) {
        Intrinsics.checkNotNullParameter(tabLayout$Tab, "tab");
    }

    public final void onTabSelected(TabLayout$Tab object) {
        Intrinsics.checkNotNullParameter(object, "tab");
        object = ((TabLayout$Tab)object).getCustomView();
        Object object2 = this.a;
        hv3_0.S(((qv1_2)object2).n);
        String string2 = null;
        if (object != null) {
            int n3 = R$id.tab_tv_text;
            object = (AjioTextView)object.findViewById(n3);
        } else {
            object = null;
        }
        if (object != null) {
            object2 = ((qv1_2)object2).C;
            object.setTypeface((Typeface)object2);
        }
        if (object != null) {
            ((AjioTextView)object).underlineText();
        }
        object2 = AnalyticsManager.Companion;
        GTMEvents gTMEvents = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
        if (object != null && (object = ((AppCompatTextView)object).getText()) != null) {
            string2 = object.toString();
        }
        ak0_0.a((AnalyticsManager$Companion)object2, gTMEvents, "Global Nav", string2);
    }

    public final void onTabUnselected(TabLayout$Tab object) {
        String string2 = "tab";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((TabLayout$Tab)object).getCustomView();
        if (object != null) {
            int n3 = R$id.tab_tv_text;
            object = (AjioTextView)object.findViewById(n3);
        } else {
            object = null;
        }
        if (object != null) {
            string2 = this.a.D;
            object.setTypeface((Typeface)string2);
        }
        if (object != null) {
            ((AjioTextView)object).removeUnderlineText();
        }
    }
}

