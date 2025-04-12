/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 */
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$Tab;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

public final class q9$b
implements TabLayout$OnTabSelectedListener {
    public final /* synthetic */ q9_0 a;

    public q9$b(q9_0 q9_02) {
        this.a = q9_02;
    }

    public final void onTabReselected(TabLayout$Tab tabLayout$Tab) {
        this.onTabSelected(tabLayout$Tab);
    }

    public final void onTabSelected(TabLayout$Tab tabLayout$Tab) {
        block10: {
            Object object;
            int n3;
            Object object2;
            if (tabLayout$Tab == null) break block10;
            boolean bl3 = og1_1.c();
            q9_0 q9_02 = this.a;
            if (bl3 && (object2 = q9_02.G) != null) {
                n3 = R$drawable.tab_indicator_luxe;
                ((TabLayout)((Object)object2)).setSelectedTabIndicator(n3);
            }
            object2 = q9_02.k;
            n3 = 0;
            String string2 = null;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("homeListener");
                bl3 = false;
                object2 = null;
            }
            String string3 = "/home";
            object2.r1(string3);
            bl3 = false;
            object2 = null;
            q9_02.wb(false);
            int n4 = tabLayout$Tab.getPosition();
            Object object3 = q9_02.X;
            Object object4 = "ajiohomeViewModel";
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                object3 = null;
            }
            ((x9_0)object3).x = n4;
            object3 = q9_02.X;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                object3 = null;
            }
            ((x9_0)object3).z = n4;
            object3 = tabLayout$Tab.getCustomView();
            if (object3 != null) {
                int bl2 = R$id.tvTabTitle;
                object3 = (TextView)object3.findViewById(bl2);
            } else {
                object3 = null;
            }
            boolean bl2 = q9_02.X0;
            if (bl2) {
                CharSequence charSequence;
                object4 = AnalyticsManager.Companion;
                object = ((AnalyticsManager$Companion)object4).getInstance().getGtmEvents();
                charSequence = object3 != null && (charSequence = object3.getText()) != null ? ((Object)charSequence).toString() : null;
                String string4 = "LuxeHome";
                String string5 = "landing screen";
                ((GTMEvents)object).pushButtonTapEvent((String)charSequence, string4, string5);
                NewCustomEventsRevamp newCustomEventsRevamp = q9_02.G0;
                String string6 = newCustomEventsRevamp.getEC_USER_INTERACTION();
                object = object3 != null ? object3.getText() : null;
                String string7 = String.valueOf(object);
                String string8 = av_0.a((AnalyticsManager$Companion)object4);
                String string9 = "LuxeHome";
                String string10 = "navigation_click";
                String string11 = "home landing screen";
                object4 = q9_02.H0;
                object = q9_02.I0;
                int n7 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string6, string9, string7, string10, string8, string11, (String)object4, null, (String)object, false, null, n7, null);
            }
            boolean bl4 = true;
            q9_02.Ub((TextView)object3, bl4);
            object = q9_02.S0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appPreferences");
                object = null;
            }
            if (object3 != null && (object3 = object3.getText()) != null) {
                string2 = object3.toString();
            }
            object3 = "LUX_SELECTED_PAGE";
            ((sw_0)object).putPreference((String)object3, (Object)string2);
            q9_02.yb(n4, false);
            bl3 = q9_02.u2;
            if (bl3) {
                q9_02.Fb();
            }
            q9_02.u2 = bl4;
        }
    }

    public final void onTabUnselected(TabLayout$Tab tabLayout$Tab) {
        if (tabLayout$Tab != null && (tabLayout$Tab = tabLayout$Tab.getCustomView()) != null) {
            int n3 = R$id.tvTabTitle;
            tabLayout$Tab = (TextView)tabLayout$Tab.findViewById(n3);
        } else {
            tabLayout$Tab = null;
        }
        this.a.Ub((TextView)tabLayout$Tab, false);
    }
}

