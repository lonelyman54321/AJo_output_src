/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 */
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$Tab;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.data.database.entity.NotificationActions;
import com.ril.ajio.data.database.entity.Notifications;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IZ1
 */
public final class iz1_1
implements F62 {
    public final /* synthetic */ List a;
    public final /* synthetic */ jz1_2 b;

    public /* synthetic */ iz1_1(List list, jz1_2 jz1_22) {
        this.a = list;
        this.b = jz1_22;
    }

    public final void onChanged(Object object) {
        block40: {
            Object object2;
            Object object3;
            Object object4;
            String string2;
            Object object5;
            int n3;
            Object object6;
            ArrayList arrayList;
            Object object7;
            int n4;
            Object object8 = object;
            object8 = (List)object;
            jz1_2 jz1_22 = this.b;
            Intrinsics.checkNotNullParameter(jz1_22, "this$0");
            Object object9 = this.a;
            Object object10 = object9.iterator();
            while ((n4 = object10.hasNext()) != 0) {
                object7 = (Notifications)object10.next();
                arrayList = new ArrayList();
                if (object8 != null) {
                    object6 = object8.iterator();
                    while ((n3 = object6.hasNext()) != 0) {
                        boolean bl2;
                        object5 = (NotificationActions)object6.next();
                        if (object5 == null || !(bl2 = Intrinsics.areEqual(string2 = ((Notifications)object7).getId(), object4 = ((NotificationActions)object5).getParentId()))) continue;
                        arrayList.add(object5);
                    }
                }
                if ((object6 = ((Notifications)object7).getActionsList()) != null) {
                    object6 = ((Notifications)object7).getActionsList();
                    object6.clear();
                    object7 = ((Notifications)object7).getActionsList();
                    object7.addAll(arrayList);
                    continue;
                }
                break block40;
            }
            object8 = jz1_22.d;
            if (object8 != null) {
                ((ArrayList)object8).clear();
            }
            object8 = object9;
            object8 = (Collection)object9;
            int n7 = object8.isEmpty();
            if (n7 == 0 && (object10 = jz1_22.d) != null) {
                ((ArrayList)object10).addAll(object8);
            }
            if ((object10 = jz1_22.b) == null) {
                object10 = new ArrayList();
                jz1_22.b = object10;
            } else {
                ((ArrayList)object10).clear();
            }
            object10 = jz1_22.c;
            if (object10 == null) {
                object10 = new ArrayList();
                jz1_22.c = object10;
            } else {
                ((ArrayList)object10).clear();
            }
            n7 = object8.isEmpty();
            if (n7 == 0) {
                object10 = object9.iterator();
                while ((n4 = object10.hasNext()) != 0) {
                    long l2;
                    object7 = (Notifications)object10.next();
                    long l3 = ((Notifications)object7).getNotiType();
                    long l4 = l3 - (l2 = 5001L);
                    object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (object3 == false) {
                        arrayList = jz1_22.b;
                        if (arrayList == null) continue;
                        arrayList.add(object7);
                        continue;
                    }
                    arrayList = jz1_22.c;
                    if (arrayList == null) continue;
                    arrayList.add(object7);
                }
            }
            object10 = jz1_22.j;
            n4 = 0;
            object7 = null;
            if (object10 != null) {
                object10 = ((ViewPager)((Object)object10)).getAdapter();
            } else {
                n7 = 0;
                object10 = null;
            }
            int n8 = 1;
            object6 = null;
            if (object10 == null) {
                object5 = jz1_22.getChildFragmentManager();
                string2 = "getChildFragmentManager(...)";
                Intrinsics.checkNotNullExpressionValue(object5, string2);
                object10 = new JZ1$b(jz1_22, (FragmentManager)object5);
                object5 = jz1_22.j;
                if (object5 != null) {
                    ((ViewPager)((Object)object5)).setAdapter((Uk2)object10);
                }
                if ((object10 = jz1_22.i) != null) {
                    object5 = jz1_22.j;
                    ((TabLayout)((Object)object10)).setupWithViewPager((ViewPager)((Object)object5));
                }
                object10 = null;
                for (n7 = 0; n7 < (n3 = 3); ++n7) {
                    int n10;
                    object5 = jz1_22.i;
                    if (object5 != null) {
                        object5 = ((TabLayout)((Object)object5)).getTabAt(n7);
                    } else {
                        n3 = 0;
                        object5 = null;
                    }
                    if (object5 == null) continue;
                    string2 = LayoutInflater.from((Context)jz1_22.getActivity());
                    object3 = R$layout.tab_notification;
                    string2 = string2.inflate((int)object3, null, false);
                    object3 = R$id.tab_tv_text;
                    object4 = (AjioTextView)string2.findViewById((int)object3);
                    if (n7 != 0) {
                        if (n7 != n8) {
                            n10 = R$string.noti_label_promotions;
                            object2 = hv3_0.K(n10);
                            object4.setText((CharSequence)object2);
                            object2 = jz1_22.c;
                            if (object2 != null && (n10 = (int)(((ArrayList)object2).isEmpty() ? 1 : 0)) == n8) {
                                n10 = hv3_0.m(R$color.black);
                                object4.setTextColor(n10);
                            } else {
                                n10 = hv3_0.m(R$color.accent_color_10);
                                object4.setTextColor(n10);
                            }
                            object2 = jz1_22.l;
                            object4.setTypeface((Typeface)object2);
                            n10 = R$drawable.right_tab_unselected_noti_bg;
                            ((AppCompatTextView)object4).setBackgroundResource(n10);
                        } else {
                            n10 = R$string.noti_label_order_updates;
                            object2 = hv3_0.K(n10);
                            object4.setText((CharSequence)object2);
                            object2 = jz1_22.b;
                            if (object2 != null && (n10 = (int)(((ArrayList)object2).isEmpty() ? 1 : 0)) == n8) {
                                n10 = hv3_0.m(R$color.black);
                                object4.setTextColor(n10);
                            } else {
                                n10 = hv3_0.m(R$color.accent_color_10);
                                object4.setTextColor(n10);
                            }
                            object2 = jz1_22.l;
                            object4.setTypeface((Typeface)object2);
                            n10 = R$drawable.center_tab_unselected_noti_bg;
                            ((AppCompatTextView)object4).setBackgroundResource(n10);
                        }
                    } else {
                        object2 = hv3_0.K(R$string.noti_label_all);
                        object4.setText((CharSequence)object2);
                        n10 = hv3_0.m(R$color.white);
                        object4.setTextColor(n10);
                        object2 = jz1_22.k;
                        object4.setTypeface((Typeface)object2);
                        n10 = R$drawable.left_tab_selected_noti_bg;
                        ((AppCompatTextView)object4).setBackgroundResource(n10);
                    }
                    Intrinsics.checkNotNull(string2);
                    ((TabLayout$Tab)object5).setCustomView((View)string2);
                }
                object10 = jz1_22.i;
                if (object10 != null) {
                    object7 = new kz1_2(jz1_22);
                    ((TabLayout)((Object)object10)).addOnTabSelectedListener((TabLayout$OnTabSelectedListener)object7);
                }
                if ((object10 = jz1_22.j) != null) {
                    ((ViewPager)((Object)object10)).setCurrentItem(0);
                }
            } else {
                object10 = jz1_22.m;
                if (object10 != null) {
                    object7 = jz1_22.d;
                    ((p52_0)object10).Oa((ArrayList)object7);
                }
                if ((object10 = jz1_22.n) != null) {
                    object7 = jz1_22.b;
                    ((p52_0)object10).Oa((ArrayList)object7);
                }
                if ((object10 = jz1_22.o) != null) {
                    object7 = jz1_22.c;
                    ((p52_0)object10).Oa((ArrayList)object7);
                }
            }
            boolean bl3 = object8.isEmpty();
            object10 = jz1_22.p;
            object5 = jz1_22.s;
            if (bl3) {
                object8 = jz1_22.e;
                if (object8 != null) {
                    object8.setVisibility(0);
                }
                object8 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                object9 = "zero notification screen";
                ((GTMEvents)object8).pushOpenScreenEvent((String)object9);
                String string3 = ((NewEEcommerceEventsRevamp)object10).getPrevScreen();
                String string4 = ((NewEEcommerceEventsRevamp)object10).getPrevScreenType();
                jz1_22.s.newPushCustomScreenView("zero notification screen", "notification screen", string3, null, string4);
                string2 = ((NewCustomEventsRevamp)object5).getEC_NOTI_INTERACTION();
                String string5 = jz1_22.q;
                object8 = jz1_22.r;
                int n14 = 1536;
                object4 = "tab click";
                object2 = "All";
                string3 = "notification_interaction_tab_click";
                String string6 = "zero notification screen";
                string4 = "notification screen";
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, string2, (String)object4, (String)object2, string3, string6, string4, string5, null, (String)object8, false, null, n14, null);
            } else {
                object8 = jz1_22.e;
                if (object8 != null) {
                    n4 = 8;
                    object8.setVisibility(n4);
                }
                if (!(bl3 = jz1_22.u)) {
                    jz1_22.u = n8;
                    object8 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    object7 = "All notification screen";
                    ((GTMEvents)object8).pushOpenScreenEvent((String)object7);
                    Object object11 = new Bundle();
                    object8 = ((NewCustomEventsRevamp)object5).getTOTAL_NOTIFICATION();
                    n4 = object9.size();
                    object11.putInt((String)object8, n4);
                    object8 = ((NewCustomEventsRevamp)object5).getNEW_NOTIFICATION();
                    int n15 = jz1_2.Oa((List)object9);
                    object11.putInt((String)object8, n15);
                    String string7 = ((NewEEcommerceEventsRevamp)object10).getPrevScreen();
                    String string8 = ((NewEEcommerceEventsRevamp)object10).getPrevScreenType();
                    jz1_22.s.newPushCustomScreenView("all - notification screen", "notification screen", string7, (Bundle)object11, string8);
                    string2 = ((NewCustomEventsRevamp)object5).getEC_NOTI_INTERACTION();
                    String string9 = jz1_22.q;
                    object8 = jz1_22.r;
                    int n16 = 1536;
                    object4 = "tab click";
                    object2 = "All";
                    string7 = "notification_interaction_tab_click";
                    object11 = "all notification screen";
                    string8 = "notification screen";
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, string2, (String)object4, (String)object2, string7, (String)object11, string8, string9, null, (String)object8, false, null, n16, null);
                }
            }
        }
    }
}

