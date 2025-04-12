/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
import android.graphics.Typeface;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$Tab;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lT
 */
public final class lt_1
implements TabLayout$OnTabSelectedListener {
    public final /* synthetic */ kt_2 a;

    public lt_1(kt_2 kt_22) {
        this.a = kt_22;
    }

    public final void onTabReselected(TabLayout$Tab tabLayout$Tab) {
        Intrinsics.checkNotNullParameter(tabLayout$Tab, "tab");
    }

    public final void onTabSelected(TabLayout$Tab tabLayout$Tab) {
        int n3;
        Object object = tabLayout$Tab;
        Intrinsics.checkNotNullParameter(tabLayout$Tab, "tab");
        Object object2 = tabLayout$Tab.getCustomView();
        kt_2 kt_22 = this.a;
        hv3_0.S(kt_22.e);
        int n4 = tabLayout$Tab.getPosition();
        CharSequence charSequence = null;
        if (object2 != null) {
            int n7 = R$id.tab_tv_text;
            object2 = (AjioTextView)object2.findViewById(n7);
        } else {
            n3 = 0;
            object2 = null;
        }
        String string2 = "Shipping Address Screen";
        String string3 = "Pick from Store-Shipping";
        String string4 = "toLowerCase(...)";
        String string5 = "getDefault(...)";
        NewCustomEventsRevamp newCustomEventsRevamp = null;
        if (n4 == 0) {
            n4 = R$string.title_delivery_address;
            object = hv3_0.K(n4);
            kt_22.Ra((String)object);
            object = kt_22.a;
            if (object != null && (object = ((ot_2)object).d) != null) {
                ((RecyclerView)object).smoothScrollToPosition(0);
            }
            if (object2 != null) {
                n4 = R$string.home_delivery;
                object = hv3_0.K(n4);
                object2.setText((CharSequence)object);
            }
            if ((n4 = (int)(og1_1.b() ? 1 : 0)) != 0) {
                if (object2 != null) {
                    n4 = hv3_0.m(R$color.luxe_color_E0E0E0);
                    object2.setTextColor(n4);
                }
                if (object2 != null) {
                    object = kt_22.k;
                    object2.setTypeface((Typeface)object);
                }
                if (object2 != null) {
                    n4 = R$drawable.lux_right_tab_selected_pickup_bg;
                    ((AppCompatTextView)object2).setBackgroundResource(n4);
                }
            } else {
                if (object2 != null) {
                    n4 = hv3_0.m(R$color.white);
                    object2.setTextColor(n4);
                }
                if (object2 != null) {
                    object = kt_22.k;
                    object2.setTypeface((Typeface)object);
                }
                if (object2 != null) {
                    n4 = R$drawable.revamp_right_tab_selected_pickup_bg;
                    ((AppCompatTextView)object2).setBackgroundResource(n4);
                }
            }
            NewCustomEventsRevamp newCustomEventsRevamp2 = kt_22.q;
            String string6 = newCustomEventsRevamp2.getEC_CHECKOUT_INTERACTIONS();
            if (object2 != null) {
                charSequence = ((AppCompatTextView)object2).getText();
            }
            object2 = String.valueOf(charSequence);
            object = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(object, string5);
            String string7 = ((String)object2).toLowerCase((Locale)object);
            Intrinsics.checkNotNullExpressionValue(string7, string4);
            object2 = kt_22.r;
            object = kt_22.s;
            int n8 = 1664;
            String string8 = "delivery type";
            String string9 = "checkout_click";
            String string10 = "shipping screen";
            String string11 = "shipping screen";
            boolean bl2 = false;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp2, string6, string8, string7, string9, string10, string11, (String)object2, null, (String)object, false, null, n8, null);
            object2 = AnalyticsManager.Companion;
            object = "Click on Home pickup tab";
            tj2_0.e((AnalyticsManager$Companion)object2, string3, (String)object, string2);
            kt_22.Sa(0);
        } else {
            n4 = R$string.title_find_store;
            object = hv3_0.K(n4);
            kt_22.Ra((String)object);
            object = kt_22.b;
            if (object != null && (object = ((du_1)object).c) != null) {
                ((RecyclerView)object).smoothScrollToPosition(0);
            }
            if ((n4 = (int)(og1_1.b() ? 1 : 0)) != 0) {
                if (object2 != null) {
                    n4 = hv3_0.m(R$color.luxe_color_E0E0E0);
                    object2.setTextColor(n4);
                }
                if (object2 != null) {
                    object = kt_22.k;
                    object2.setTypeface((Typeface)object);
                }
                if (object2 != null) {
                    n4 = R$drawable.lux_right_tab_selected_pickup_bg;
                    ((AppCompatTextView)object2).setBackgroundResource(n4);
                }
            } else {
                if (object2 != null) {
                    n4 = hv3_0.m(R$color.white);
                    object2.setTextColor(n4);
                }
                if (object2 != null) {
                    object = kt_22.k;
                    object2.setTypeface((Typeface)object);
                }
                if (object2 != null) {
                    n4 = R$drawable.revamp_left_tab_selected_pickup_bg;
                    ((AppCompatTextView)object2).setBackgroundResource(n4);
                }
            }
            if (object2 != null) {
                n4 = R$string.store_pickup;
                object = hv3_0.K(n4);
                object2.setText((CharSequence)object);
            }
            newCustomEventsRevamp = kt_22.q;
            String string12 = newCustomEventsRevamp.getEC_CHECKOUT_INTERACTIONS();
            if (object2 != null) {
                charSequence = ((AppCompatTextView)object2).getText();
            }
            object2 = String.valueOf(charSequence);
            object = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(object, string5);
            String string13 = ((String)object2).toLowerCase((Locale)object);
            Intrinsics.checkNotNullExpressionValue(string13, string4);
            object2 = kt_22.r;
            object = kt_22.s;
            int n10 = 1664;
            boolean bl3 = false;
            String string14 = "delivery type";
            String string15 = "checkout_click";
            String string16 = "shipping screen";
            String string17 = "shipping screen";
            Object object3 = object2;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string12, string14, string13, string15, string16, string17, (String)object2, null, (String)object, false, null, n10, null);
            object2 = AnalyticsManager.Companion;
            object = "Click on Store pickup tab";
            tj2_0.e((AnalyticsManager$Companion)object2, string3, (String)object, string2);
            n3 = 1;
            kt_22.Sa(n3);
        }
        kt_22.Qa();
    }

    public final void onTabUnselected(TabLayout$Tab tabLayout$Tab) {
        Intrinsics.checkNotNullParameter(tabLayout$Tab, "tab");
        Object object = tabLayout$Tab.getCustomView();
        int n3 = tabLayout$Tab.getPosition();
        if (object != null) {
            int n4 = R$id.tab_tv_text;
            object = (AjioTextView)object.findViewById(n4);
        } else {
            object = null;
        }
        kt_2 kt_22 = this.a;
        if (n3 == 0) {
            n3 = (int)(og1_1.b() ? 1 : 0);
            if (n3 != 0) {
                if (object != null) {
                    tabLayout$Tab = kt_22.l;
                    object.setTypeface((Typeface)tabLayout$Tab);
                }
                if (object != null) {
                    n3 = hv3_0.m(R$color.luxe_color_121212);
                    object.setTextColor(n3);
                }
                if (object != null) {
                    n3 = R$drawable.lux_right_tab_unselected_pickup_bg;
                    ((AppCompatTextView)object).setBackgroundResource(n3);
                }
            } else {
                if (object != null) {
                    tabLayout$Tab = kt_22.l;
                    object.setTypeface((Typeface)tabLayout$Tab);
                }
                if (object != null) {
                    n3 = hv3_0.m(R$color.accent_color_18);
                    object.setTextColor(n3);
                }
                if (object != null) {
                    n3 = R$drawable.revamp_right_tab_unselected_pickup_bg;
                    ((AppCompatTextView)object).setBackgroundResource(n3);
                }
            }
            n3 = 1;
            kt_22.Sa(n3);
        } else {
            n3 = (int)(og1_1.b() ? 1 : 0);
            if (n3 != 0) {
                if (object != null) {
                    tabLayout$Tab = kt_22.l;
                    object.setTypeface((Typeface)tabLayout$Tab);
                }
                if (object != null) {
                    n3 = hv3_0.m(R$color.luxe_color_121212);
                    object.setTextColor(n3);
                }
                if (object != null) {
                    n3 = R$drawable.lux_left_tab_unselected_pickup_bg;
                    ((AppCompatTextView)object).setBackgroundResource(n3);
                }
            } else {
                if (object != null) {
                    tabLayout$Tab = kt_22.l;
                    object.setTypeface((Typeface)tabLayout$Tab);
                }
                if (object != null) {
                    n3 = hv3_0.m(R$color.accent_color_18);
                    object.setTextColor(n3);
                }
                if (object != null) {
                    n3 = R$drawable.revamp_left_tab_unselected_pickup_bg;
                    ((AppCompatTextView)object).setBackgroundResource(n3);
                }
            }
            n3 = 0;
            tabLayout$Tab = null;
            kt_22.Sa(0);
        }
    }
}

