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
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KZ1
 */
public final class kz1_2
implements TabLayout$OnTabSelectedListener {
    public final /* synthetic */ jz1_2 a;

    public kz1_2(jz1_2 jz1_22) {
        this.a = jz1_22;
    }

    public final void onTabReselected(TabLayout$Tab tabLayout$Tab) {
        Intrinsics.checkNotNullParameter(tabLayout$Tab, "tab");
    }

    public final void onTabSelected(TabLayout$Tab tabLayout$Tab) {
        Object object;
        int n3;
        Object object2 = tabLayout$Tab;
        Intrinsics.checkNotNullParameter(tabLayout$Tab, "tab");
        Object object3 = tabLayout$Tab.getCustomView();
        int n4 = tabLayout$Tab.getPosition();
        CharSequence charSequence = null;
        if (object3 != null) {
            n3 = R$id.tab_tv_text;
            object3 = (AjioTextView)object3.findViewById(n3);
        } else {
            object3 = null;
        }
        n3 = 8;
        jz1_2 jz1_22 = this.a;
        if (n4 != 0) {
            int n7 = 1;
            if (n4 != n7) {
                object2 = jz1_22.e;
                if (object2 != null) {
                    object = jz1_22.c;
                    if (object == null || (n7 = (int)(object.isEmpty() ? 1 : 0)) != 0) {
                        n3 = 0;
                    }
                    object2.setVisibility(n3);
                }
                if ((object2 = jz1_22.o) != null && (object2 = ((p52_0)object2).b) != null) {
                    ((RecyclerView)object2).smoothScrollToPosition(0);
                }
                if (object3 != null) {
                    n4 = R$string.noti_label_promotions;
                    object2 = hv3_0.K(n4);
                    object3.setText((CharSequence)object2);
                }
                if (object3 != null) {
                    n4 = hv3_0.m(R$color.white);
                    object3.setTextColor(n4);
                }
                if (object3 != null) {
                    object2 = jz1_22.k;
                    object3.setTypeface((Typeface)object2);
                }
                if (object3 != null) {
                    n4 = R$drawable.right_tab_selected_noti_bg;
                    ((AppCompatTextView)object3).setBackgroundResource(n4);
                }
            } else {
                object2 = jz1_22.e;
                if (object2 != null) {
                    object = jz1_22.b;
                    if (object == null || (n7 = (int)(object.isEmpty() ? 1 : 0)) != 0) {
                        n3 = 0;
                    }
                    object2.setVisibility(n3);
                }
                if ((object2 = jz1_22.n) != null && (object2 = ((p52_0)object2).b) != null) {
                    ((RecyclerView)object2).smoothScrollToPosition(0);
                }
                if (object3 != null) {
                    n4 = R$string.noti_label_order_updates;
                    object2 = hv3_0.K(n4);
                    object3.setText((CharSequence)object2);
                }
                if (object3 != null) {
                    n4 = hv3_0.m(R$color.white);
                    object3.setTextColor(n4);
                }
                if (object3 != null) {
                    object2 = jz1_22.k;
                    object3.setTypeface((Typeface)object2);
                }
                if (object3 != null) {
                    n4 = R$drawable.center_tab_selected_noti_bg;
                    ((AppCompatTextView)object3).setBackgroundResource(n4);
                }
            }
        } else {
            object2 = jz1_22.e;
            if (object2 != null) {
                boolean bl2;
                object = jz1_22.d;
                if (object == null || (bl2 = object.isEmpty())) {
                    n3 = 0;
                }
                object2.setVisibility(n3);
            }
            if ((object2 = jz1_22.m) != null && (object2 = ((p52_0)object2).b) != null) {
                ((RecyclerView)object2).smoothScrollToPosition(0);
            }
            if (object3 != null) {
                n4 = R$string.noti_label_all;
                object2 = hv3_0.K(n4);
                object3.setText((CharSequence)object2);
            }
            if (object3 != null) {
                n4 = hv3_0.m(R$color.white);
                object3.setTextColor(n4);
            }
            if (object3 != null) {
                object2 = jz1_22.k;
                object3.setTypeface((Typeface)object2);
            }
            if (object3 != null) {
                n4 = R$drawable.left_tab_selected_noti_bg;
                ((AppCompatTextView)object3).setBackgroundResource(n4);
            }
        }
        if (object3 != null) {
            charSequence = ((AppCompatTextView)object3).getText();
        }
        String string2 = String.valueOf(charSequence);
        object = jz1_22.s;
        String string3 = ((NewCustomEventsRevamp)object).getEC_NOTI_INTERACTION();
        String string4 = string2.concat(" notification screen");
        String string5 = jz1_22.q;
        object3 = jz1_22.r;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string3, "tab click", string2, "notification_interaction_tab_click", string4, "notification screen", string5, null, (String)object3, false, null, 1536, null);
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
        jz1_2 jz1_22 = this.a;
        if (n3 != 0) {
            int n7 = 1;
            if (n3 != n7) {
                if (object != null) {
                    tabLayout$Tab = jz1_22.l;
                    object.setTypeface((Typeface)tabLayout$Tab);
                }
                if (object != null) {
                    n3 = hv3_0.m(R$color.accent_color_10);
                    object.setTextColor(n3);
                }
                if (object != null) {
                    n3 = R$drawable.right_tab_unselected_noti_bg;
                    ((AppCompatTextView)object).setBackgroundResource(n3);
                }
            } else {
                if (object != null) {
                    tabLayout$Tab = jz1_22.l;
                    object.setTypeface((Typeface)tabLayout$Tab);
                }
                if (object != null) {
                    n3 = hv3_0.m(R$color.accent_color_10);
                    object.setTextColor(n3);
                }
                if (object != null) {
                    n3 = R$drawable.center_tab_unselected_noti_bg;
                    ((AppCompatTextView)object).setBackgroundResource(n3);
                }
            }
        } else {
            if (object != null) {
                tabLayout$Tab = jz1_22.l;
                object.setTypeface((Typeface)tabLayout$Tab);
            }
            if (object != null) {
                n3 = hv3_0.m(R$color.accent_color_10);
                object.setTextColor(n3);
            }
            if (object != null) {
                n3 = R$drawable.left_tab_unselected_noti_bg;
                ((AppCompatTextView)object).setBackgroundResource(n3);
            }
        }
    }
}

