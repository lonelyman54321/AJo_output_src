/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Typeface
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.viewpager.widget.ViewPager;
import com.appsflyer.AppsFlyerLib;
import com.google.android.material.tabs.TabLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.AnalyticsUtil;
import com.ril.ajio.analytics.AnalyticsUtil$Companion;
import com.ril.ajio.analytics.MyRewardsOption;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.data.database.entity.Notifications;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import com.ril.ajio.web.game.MyRewardsWebActivity;
import com.ril.ajio.web.game.MyRewardsWebActivity$a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/*
 * Renamed from JZ1
 */
public final class jz1_2
extends Fragment
implements n52_0,
View.OnClickListener,
OnNavigationClickListener {
    public static final JZ1$a Companion;
    public final hh3_2 a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList d;
    public RelativeLayout e;
    public CustomToolbarViewMerger f;
    public final hh3_2 g;
    public OnFragmentInteractionListener h;
    public TabLayout i;
    public ViewPager j;
    public Typeface k;
    public Typeface l;
    public p52_0 m;
    public p52_0 n;
    public p52_0 o;
    public final NewEEcommerceEventsRevamp p;
    public final String q;
    public final String r;
    public final NewCustomEventsRevamp s;
    public vh3_2 t;
    public boolean u;
    public boolean v;
    public boolean w;

    static {
        JZ1$a jZ1$a;
        Companion = jZ1$a = new Object();
    }

    public jz1_2() {
        String string2;
        Object object = new ez1_2(this);
        this.a = object = yr1_2.b((Function0)object);
        object = new fz1_1(this, 0);
        this.g = object = yr1_2.b((Function0)object);
        object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.p = object2;
        this.q = string2 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        this.r = object2 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        this.s = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
    }

    public static int Oa(List object) {
        int n3;
        Object object2 = object;
        object2 = (Collection)object;
        int n4 = 0;
        if (object2 != null && (n3 = object2.isEmpty()) == 0) {
            object = object.iterator();
            while ((n3 = object.hasNext()) != 0) {
                int n7;
                object2 = (Notifications)object.next();
                n3 = ((Notifications)object2).getUnread();
                if (n3 != (n7 = 1)) continue;
                ++n4;
            }
        }
        return n4;
    }

    public static int Pa(String string2, ArrayList object) {
        int n3 = -1;
        if (object != null) {
            boolean bl2;
            object = object.iterator();
            int n4 = 0;
            while (bl2 = object.hasNext()) {
                Object object2 = object.next();
                int n7 = n4 + 1;
                if (n4 >= 0) {
                    bl2 = Intrinsics.areEqual(string2, object2 = ((Notifications)object2).getId());
                    if (bl2) {
                        n3 = n4;
                    }
                    n4 = n7;
                    continue;
                }
                xx_2.n();
                throw null;
            }
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void J6(Bundle object, Long object2) {
        String string2;
        boolean bl2;
        Object object3;
        boolean bl3;
        long l2;
        long l3 = (Long)object2;
        object2 = this.getActivity();
        if (object2 == null) return;
        int n3 = object.getInt("NOTIFICATION_POSITION");
        String string3 = "DEEP_LINK_MY_ACCOUNT";
        String string4 = object.getString(string3);
        String string5 = "notification clicks";
        Object object4 = "click";
        GAEcommerceEvents.pushNotificationEvent(string5, (String)object4, n3);
        long l4 = 5002L;
        object2 = "requireActivity(...)";
        boolean bl4 = true;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (!(l7 != false && (l7 = (l2 = l3 - (l4 = 5003L)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false || (bl3 = TextUtils.isEmpty((CharSequence)string4)) || string4 == null || (bl3 = StringsKt.F(string4, (CharSequence)(object3 = "my-rewards"), bl4)) != bl4)) {
            object = AnalyticsUtil.Companion;
            object3 = z40_0.Companion;
            object3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a.b("enable_my_rewards_status");
            object = ((AnalyticsUtil$Companion)object).mapperToMyRewardsOption((String)object3);
            object3 = MyRewardsWebActivity.Companion;
            FragmentActivity fragmentActivity = this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivity, (String)object2);
            if (object == null || (object = ((MyRewardsOption)object).getTitle()) == null) {
                object = "My Rewards";
            }
            object3.getClass();
            n3 = 14;
            MyRewardsWebActivity$a.a(n3, fragmentActivity, string4, (String)object);
            return;
        }
        bl3 = false;
        object3 = null;
        if (string4 != null && (bl2 = StringsKt.F(string4, string2 = "onelink", false))) {
            object = this.requireActivity();
            n3 = object instanceof AjioHomeActivity;
            object = n3 != 0 ? (AjioHomeActivity)object : null;
            if (object != null) {
                ((AjioHomeActivity)object).x1 = object2 = Boolean.TRUE;
            }
            object = AppsFlyerLib.getInstance();
            object2 = new Intent();
            object2.setAction("android.intent.action.VIEW");
            object3 = Uri.parse((String)string4);
            object2.setData((Uri)object3);
            object3 = this.requireActivity();
            ((AppsFlyerLib)object).performOnDeepLinking((Intent)object2, (Context)object3);
            return;
        }
        string2 = new Intent();
        string5 = object.getString(string3);
        if (string5 == null) return;
        string5 = Uri.parse((String)object.getString(string3));
        string2.setData((Uri)string5);
        string5 = Uri.parse((String)string4);
        cp_1.Companion.getClass();
        object4 = cp$a.e();
        string5 = string5.getHost();
        object4.getClass();
        string5 = cp_1.g(string5);
        object4 = UrlHelper.Companion.getInstance().getBaseUrl();
        boolean bl5 = StringsKt.F((CharSequence)object4, string5, false);
        if (!bl5) {
            object4 = cp$a.e();
            object4.getClass();
            boolean bl6 = cp_1.H(string5);
            if (!bl6) {
                object = CustomWebViewActivity.Companion;
                object3 = this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                n3 = 8;
                CustomWebViewActivity$a.b((CustomWebViewActivity$a)object, (Context)object3, string4, n3);
                return;
            }
        }
        object.putBoolean("NOTIFICATION_INDICATOR", bl4);
        string3 = object.getString(string3);
        object.putString("noti_uri", string3);
        string2.putExtras((Bundle)object);
        object2 = this.h;
        if (object2 == null) return;
        string2 = "NewNotificationCenterActivityFragment";
        object2.onFragmentInteraction(string2, 0, (Bundle)object);
    }

    public final b52_0 Qa() {
        return (b52_0)this.a.getValue();
    }

    public final void Ra() {
        Object object;
        Object object2;
        Object object3;
        int n3 = 1;
        int n4 = 0;
        Object object4 = null;
        Object object5 = (jo_2)this.g.getValue();
        int n7 = ((sw_0)object5).getPreference("Notification_Count", 0);
        Object object6 = this.f;
        if (object6 != null && (object6 = object6.getToolbar()) != null) {
            int n8 = R$string.acc_page_header_notifications;
            object3 = hv3_0.K(n8);
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append(" title");
            object3 = ((StringBuilder)object2).toString();
            object6.setContentDescription((CharSequence)object3);
        }
        object6 = "getString(...)";
        if (n7 > 0) {
            object3 = this.f;
            if (object3 != null) {
                object2 = StringCompanionObject.INSTANCE;
                int n10 = R$string.notification_center_count;
                object2 = this.getString(n10);
                Intrinsics.checkNotNullExpressionValue(object2, (String)object6);
                object5 = n7;
                object6 = new Object[n3];
                object6[0] = object5;
                object = Arrays.copyOf(object6, n3);
                object = String.format((String)object2, object);
                object4 = "format(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                ((CustomToolbarViewMerger)object3).setTitleText((String)object);
            }
        } else {
            object = this.f;
            if (object != null) {
                n4 = R$string.title_activity_notification_center;
                object4 = this.getString(n4);
                Intrinsics.checkNotNullExpressionValue(object4, (String)object6);
                object.setTitleText((String)object4);
            }
        }
        object4 = Looper.getMainLooper();
        object = new Handler(object4);
        object4 = new Gj(this, 2);
        object.postDelayed((Runnable)object4, 500L);
    }

    public final void ga(String object) {
        Object object2 = this.Qa();
        object2.getClass();
        Object object3 = md3_0.c((jD3)object2);
        d52_0 d52_02 = new d52_0((b52_0)object2, (String)object, null);
        Ae3.d((i90_0)object3, null, null, d52_02, 3);
        int n3 = TextUtils.isEmpty((CharSequence)object);
        if (n3 == 0) {
            int n4;
            object2 = this.b;
            if (object2 != null) {
                Intrinsics.checkNotNull(object2);
                n3 = ((ArrayList)object2).size();
                if (n3 > 0) {
                    Intrinsics.checkNotNull(object);
                    object2 = this.b;
                    n3 = jz1_2.Pa((String)object, (ArrayList)object2);
                    if (n3 >= 0) {
                        object3 = this.b;
                        Intrinsics.checkNotNull(object3);
                        n4 = ((ArrayList)object3).size();
                        if (n3 < n4) {
                            object3 = this.b;
                            if (object3 != null) {
                                object2 = (Notifications)((ArrayList)object3).remove(n3);
                            }
                            if ((object2 = this.n) != null) {
                                object3 = this.b;
                                ((p52_0)object2).Oa((ArrayList)object3);
                            }
                        }
                    }
                }
            }
            if ((object2 = this.d) != null) {
                Intrinsics.checkNotNull(object2);
                n3 = ((ArrayList)object2).size();
                if (n3 > 0) {
                    Intrinsics.checkNotNull(object);
                    object2 = this.d;
                    n3 = jz1_2.Pa((String)object, (ArrayList)object2);
                    if (n3 >= 0) {
                        object3 = this.d;
                        Intrinsics.checkNotNull(object3);
                        n4 = ((ArrayList)object3).size();
                        if (n3 < n4) {
                            object3 = this.d;
                            if (object3 != null) {
                                object2 = (Notifications)((ArrayList)object3).remove(n3);
                            }
                            if ((object2 = this.m) != null) {
                                object3 = this.d;
                                ((p52_0)object2).Oa((ArrayList)object3);
                            }
                        }
                    }
                }
            }
            if ((object2 = this.c) != null) {
                Intrinsics.checkNotNull(object2);
                n3 = ((ArrayList)object2).size();
                if (n3 > 0) {
                    Intrinsics.checkNotNull(object);
                    object2 = this.c;
                    int n7 = jz1_2.Pa((String)object, (ArrayList)object2);
                    if (n7 >= 0) {
                        object2 = this.c;
                        Intrinsics.checkNotNull(object2);
                        n3 = ((ArrayList)object2).size();
                        if (n7 < n3) {
                            object2 = this.c;
                            if (object2 != null) {
                                object = (Notifications)((ArrayList)object2).remove(n7);
                            }
                            if ((object = this.o) != null) {
                                object2 = this.c;
                                ((p52_0)object).Oa((ArrayList)object2);
                            }
                        }
                    }
                }
            }
        }
        this.Ra();
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof vh3_2;
        if (bl2) {
            object = (vh3_2)object;
            this.t = object;
            object = this.getActivity();
            if (object != null) {
                object = this.getActivity();
                object2 = "null cannot be cast to non-null type com.ril.ajio.customviews.widgets.OnFragmentInteractionListener";
                Intrinsics.checkNotNull(object, (String)object2);
                object = (OnFragmentInteractionListener)object;
                this.h = object;
            }
            return;
        }
        object = pn_2.b(object, " Must implement TabListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onClick(View view) {
        Object object = "view";
        Intrinsics.checkNotNullParameter(view, (String)object);
        int n3 = view.getId();
        int n4 = R$id.continue_shopping;
        if (n3 == n4) {
            n4 = -1;
            String string2 = "continue shopping click";
            GAEcommerceEvents.pushNotificationEvent(string2, "continue shopping", n4);
            NewCustomEventsRevamp newCustomEventsRevamp = this.s;
            String string3 = newCustomEventsRevamp.getEC_NOTI_INTERACTION();
            int n7 = 1536;
            String string4 = "continue shopping";
            String string5 = "";
            String string6 = "notification_continue_shopping";
            String string7 = "zero notification screen";
            String string8 = "notification screen";
            String string9 = this.q;
            String string10 = this.r;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string3, string4, string5, string6, string7, string8, string9, null, string10, false, null, n7, null);
            object = this.getActivity();
            at2_1.e((Context)object);
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        this.setHasOptionsMenu(true);
        object = new CustomToolbarViewMerger(this);
        this.f = object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        object = new ArrayList();
        this.d = object;
        CustomToolbarViewMerger customToolbarViewMerger = this.f;
        if (customToolbarViewMerger != null) {
            Context context = this.requireContext();
            object = "requireContext(...)";
            Intrinsics.checkNotNullExpressionValue(context, (String)object);
            int n3 = R$layout.new_nc_layout;
            int n4 = R$layout.fragment_notification_revamp;
            Intrinsics.checkNotNull(viewGroup);
            layoutInflater = customToolbarViewMerger.inflateView(context, n3, n4, layoutInflater, viewGroup);
        } else {
            layoutInflater = null;
        }
        return layoutInflater;
    }

    public final void onDetach() {
        super.onDetach();
        Object object = this.d;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            int n3 = ((ArrayList)object).size();
            if (n3 > 0) {
                Object object2;
                boolean bl2;
                object = this.d;
                Intrinsics.checkNotNull(object);
                object = ((ArrayList)object).iterator();
                Object object3 = "iterator(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                while (bl2 = object.hasNext()) {
                    object3 = object.next();
                    object2 = "next(...)";
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                    object3 = (Notifications)object3;
                    int n4 = ((Notifications)object3).getUnread();
                    int n7 = 1;
                    if (n4 == n7) {
                        n4 = 0;
                        object2 = null;
                        ((Notifications)object3).setUnread(0);
                        continue;
                    }
                    object.remove();
                }
                object = this.Qa();
                object3 = this.d;
                Intrinsics.checkNotNull(object3);
                object.getClass();
                Intrinsics.checkNotNullParameter(object3, "list");
                object2 = e01_0.a;
                wm0_2 wm0_22 = ir0_2.a;
                F52 f52 = new F52((b52_0)object, (ArrayList)object3, null);
                n3 = 2;
                Ae3.d((i90_0)object2, wm0_22, null, f52, n3);
            }
        }
    }

    public final void onNavigationClick() {
        Object object = this.getParentFragment();
        if (object != null && (object = ((Fragment)object).getChildFragmentManager()) != null) {
            ((FragmentManager)object).W();
        }
    }

    public final void onResume() {
        super.onResume();
        p52_0 p52_02 = this.m;
        String string2 = "itemClickListener";
        if (p52_02 != null) {
            Intrinsics.checkNotNullParameter(this, string2);
            p52_02.a = this;
        }
        if ((p52_02 = this.n) != null) {
            Intrinsics.checkNotNullParameter(this, string2);
            p52_02.a = this;
        }
        if ((p52_02 = this.o) != null) {
            Intrinsics.checkNotNullParameter(this, string2);
            p52_02.a = this;
        }
    }

    public final void onStop() {
        super.onStop();
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp();
        String string2 = "notification screen";
        newEEcommerceEventsRevamp.setPreviousScreenData(string2, string2);
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        int n4;
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.getActivity();
        int n7 = object2 instanceof AppCompatActivity;
        if (n7 != 0) {
            object2 = this.getActivity();
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            object2 = (AppCompatActivity)object2;
            object3 = this.f;
            Intrinsics.checkNotNull(object3);
            object3 = ((CustomToolbarViewMerger)object3).getToolbar();
            ((AppCompatActivity)object2).setSupportActionBar((Toolbar)object3);
        }
        if ((object2 = this.f) != null) {
            ((CustomToolbarViewMerger)object2).setNavigationClick();
        }
        if ((object2 = this.f) != null) {
            n4 = 8;
            ((CustomToolbarViewMerger)object2).setSubTitleVisibility(n4);
        }
        this.Ra();
        object2 = this.getActivity();
        if (object2 != null) {
            object2.invalidateOptionsMenu();
        }
        object2 = this.t;
        n4 = 0;
        object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabListener");
            n7 = 0;
            object2 = null;
        }
        Object object4 = null;
        object2.showTabLayout(false);
        AJIOApplication.Companion.getClass();
        object2 = AJIOApplication$a.a();
        object2 = hv3_0.o(10, (Context)object2);
        this.k = object2;
        object2 = AJIOApplication$a.a();
        int n8 = 9;
        object2 = hv3_0.o(n8, (Context)object2);
        this.l = object2;
        n7 = R$id.notification_viewpager;
        object2 = (ViewPager)object.findViewById(n7);
        this.j = object2;
        n7 = R$id.notification_tab;
        object2 = (TabLayout)object.findViewById(n7);
        this.i = object2;
        n7 = R$id.continue_shopping;
        object2 = object.findViewById(n7);
        object2.setOnClickListener((View.OnClickListener)this);
        n7 = R$id.empty_layout;
        object = (RelativeLayout)object.findViewById(n7);
        this.e = object;
        object = this.requireActivity();
        n7 = object instanceof AjioHomeActivity;
        if (n7 != 0) {
            object = (AjioHomeActivity)object;
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            object2 = Boolean.FALSE;
            ((AjioHomeActivity)object).x1 = object2;
        }
        object = this.Qa();
        object.getClass();
        object2 = md3_0.c((jD3)object);
        object4 = new c52_0((b52_0)object, null);
        n3 = 3;
        Ae3.d((i90_0)object2, null, null, (Function2)object4, n3);
        object2 = this.Qa().c;
        object4 = this.getViewLifecycleOwner();
        Object object5 = new gz1_1(this);
        ((LiveData)object2).e((mu1_1)object4, (F62)object5);
        object2 = this.Qa();
        object2.getClass();
        object4 = md3_0.c((jD3)object2);
        object5 = new e52_0((b52_0)object2, null);
        Ae3.d((i90_0)object4, null, null, (Function2)object5, n3);
    }
}

