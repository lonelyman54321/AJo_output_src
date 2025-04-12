/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.view.View
 *  android.widget.TextView
 */
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$Tab;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExReturnAddressActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pC0
 */
public final class pc0_1
implements TabLayout$OnTabSelectedListener {
    public final /* synthetic */ oc0_2 a;

    public pc0_1(oc0_2 oc0_22) {
        this.a = oc0_22;
    }

    public final void onTabReselected(TabLayout$Tab tabLayout$Tab) {
        Intrinsics.checkNotNullParameter(tabLayout$Tab, "tab");
    }

    public final void onTabSelected(TabLayout$Tab object) {
        int n3;
        Object object2 = null;
        Intrinsics.checkNotNullParameter(object, "tab");
        Object object3 = ((TabLayout$Tab)object).getCustomView();
        int n4 = ((TabLayout$Tab)object).getPosition();
        int n7 = 0;
        ArrayList arrayList = null;
        if (object3 != null) {
            int n8 = R$id.tab_tv_text;
            object3 = (TextView)object3.findViewById(n8);
        } else {
            n3 = 0;
            object3 = null;
        }
        Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type android.widget.TextView");
        oc0_2 oc0_22 = this.a;
        Object object4 = oc0_22.m;
        object3.setTypeface(object4);
        object4 = "clAddressLayout";
        Object[] objectArray = "fragmentAddressLayoutProceedTabs";
        String string2 = "Exchange / Return Address Screen";
        String string3 = "Store Returns";
        String string4 = "fragmentAddressLayoutProceed";
        if (n4 == 0) {
            object = AnalyticsManager.Companion;
            object2 = "Click on Home Pick up tab";
            tj2_0.e((AnalyticsManager$Companion)object, string3, (String)object2, string2);
            n4 = hv3_0.m(R$color.white);
            object3.setTextColor(n4);
            object = hv3_0.K(R$string.home_pickup);
            object3.setText((CharSequence)object);
            n4 = R$drawable.revamp_right_tab_selected_pickup_bg;
            object3.setBackgroundResource(n4);
            object = oc0_22.Pa().fragmentAddressLayoutProceedTabs;
            Intrinsics.checkNotNullExpressionValue(object, (String)objectArray);
            ai0_2.B((View)object);
            object = oc0_22.Pa().fragmentAddressLayoutProceed;
            Intrinsics.checkNotNullExpressionValue(object, string4);
            ai0_2.i((View)object);
            object = oc0_22.Pa().clAddressLayout;
            Intrinsics.checkNotNullExpressionValue(object, (String)object4);
            ai0_2.B((View)object);
        } else {
            object = AnalyticsManager.Companion;
            String string5 = "Click on Drop at Store tab";
            tj2_0.e((AnalyticsManager$Companion)object, string3, string5, string2);
            n4 = hv3_0.m(R$color.white);
            object3.setTextColor(n4);
            n4 = R$drawable.revamp_left_tab_selected_pickup_bg;
            object3.setBackgroundResource(n4);
            object = hv3_0.K(R$string.store_return);
            object3.setText((CharSequence)object);
            object = oc0_22.Pa().fragmentAddressLayoutProceedTabs;
            Intrinsics.checkNotNullExpressionValue(object, (String)objectArray);
            ai0_2.i((View)object);
            n4 = (int)(oc0_22.o ? 1 : 0);
            if (n4 != 0) {
                object = oc0_22.Pa().fragmentAddressLayoutProceed;
                Intrinsics.checkNotNullExpressionValue(object, string4);
                ai0_2.B((View)object);
            } else {
                object = oc0_22.Pa().fragmentAddressLayoutProceed;
                Intrinsics.checkNotNullExpressionValue(object, string4);
                ai0_2.i((View)object);
            }
            object = oc0_22.h;
            if (object != null) {
                object = ((ExReturnAddressActivity)object).t0;
            } else {
                n4 = 0;
                object = null;
            }
            if (object != null && (n4 = (int)(object.isEmpty() ? 1 : 0)) == 0) {
                object = oc0_22.h;
                if (object != null) {
                    object = ((ExReturnAddressActivity)object).s0;
                } else {
                    n4 = 0;
                    object = null;
                }
                if (object != null && (n4 = (int)(object.isEmpty() ? 1 : 0)) == 0) {
                    object = oc0_22.h;
                    if (object != null) {
                        object = ((ExReturnAddressActivity)object).s0;
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    Intrinsics.checkNotNull(object);
                    n4 = ((ArrayList)object).size();
                } else {
                    n4 = 0;
                    object = null;
                }
                object3 = oc0_22.h;
                if (object3 != null) {
                    object3 = ((ExReturnAddressActivity)object3).t0;
                } else {
                    n3 = 0;
                    object3 = null;
                }
                if (object3 != null && (n3 = object3.isEmpty()) == 0) {
                    object3 = oc0_22.h;
                    if (object3 != null) {
                        arrayList = ((ExReturnAddressActivity)object3).t0;
                    }
                    Intrinsics.checkNotNull(arrayList);
                    n3 = arrayList.size();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                n7 = R$string.items_elligible;
                object = n4;
                object3 = n3;
                int n10 = 2;
                objectArray = new Object[n10];
                objectArray[0] = object;
                n4 = 1;
                objectArray[n4] = object3;
                object = hv3_0.L(n7, objectArray);
            } else {
                n4 = R$string.all_items_are_eligible;
                object = hv3_0.K(n4);
            }
            object2 = oc0_22.Pa().tvItemElligible;
            object2.setText((CharSequence)object);
            object = oc0_22.Pa().clAddressLayout;
            Intrinsics.checkNotNullExpressionValue(object, (String)object4);
            ai0_2.B((View)object);
        }
    }

    public final void onTabUnselected(TabLayout$Tab tabLayout$Tab) {
        Intrinsics.checkNotNullParameter(tabLayout$Tab, "tab");
        View view = tabLayout$Tab.getCustomView();
        int n3 = tabLayout$Tab.getPosition();
        if (view != null) {
            int n4 = R$id.tab_tv_text;
            view = (TextView)view.findViewById(n4);
        } else {
            view = null;
        }
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
        Typeface typeface = this.a.n;
        view.setTypeface(typeface);
        if (n3 == 0) {
            n3 = hv3_0.m(R$color.accent_color_18);
            view.setTextColor(n3);
            n3 = R$drawable.revamp_right_tab_unselected_pickup_bg;
            view.setBackgroundResource(n3);
        } else {
            n3 = R$drawable.revamp_left_tab_unselected_pickup_bg;
            view.setBackgroundResource(n3);
            n3 = hv3_0.m(R$color.accent_color_18);
            view.setTextColor(n3);
        }
    }
}

