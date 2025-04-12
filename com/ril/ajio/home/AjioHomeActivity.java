/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.SharedPreferences
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.os.PersistableBundle
 *  android.text.TextUtils
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 *  android.view.WindowInsetsController
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.AnimationUtils
 *  android.webkit.URLUtil
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  org.json.JSONObject
 */
package com.ril.ajio.home;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.drawerlayout.widget.DrawerLayout$e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.j;
import androidx.fragment.app.k;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.navigation.e;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.Credential$Builder;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$Tab;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.firebase.perf.FirebasePerformance;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.AnalyticsUtil;
import com.ril.ajio.analytics.AnalyticsUtil$Companion;
import com.ril.ajio.analytics.MyRewardsOption;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.Ga4Events;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.bonanza.activity.CouponBonanzaActivity;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.customviews.widgets.managers.ActivityTransitionManager;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.data.model.CMSConfigInitializer;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.HomeRepo;
import com.ril.ajio.data.repo.RtbRepo;
import com.ril.ajio.home.AjioHomeActivity$a;
import com.ril.ajio.home.AjioHomeActivity$b;
import com.ril.ajio.home.AjioHomeActivity$c;
import com.ril.ajio.home.AjioHomeActivity$invalidRefreshTokenNotifier$1;
import com.ril.ajio.home.AjioHomeActivity$loginNotifier$1;
import com.ril.ajio.home.Hilt_AjioHomeActivity;
import com.ril.ajio.home.listener.TabSelectedListener;
import com.ril.ajio.myaccount.order.cancel.CancelReasonFragment;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExReturnAddressActivity;
import com.ril.ajio.myaccount.order.fragment.b$a;
import com.ril.ajio.notifications.activity.NotificationCenterActivity;
import com.ril.ajio.payment.view.PaymentActivity;
import com.ril.ajio.pdp.data.ZoomExtras;
import com.ril.ajio.pdp.fragment.ZoomFragment;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.plp.PLPExtras;
import com.ril.ajio.search.data.CMSSearchConfig;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.ProfileHealth;
import com.ril.ajio.services.data.Home.BottomNavigationData;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.Child;
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.NavigationDataClass;
import com.ril.ajio.services.data.Home.NavigationNode;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductPromotion;
import com.ril.ajio.services.data.Product.fleek.Brand;
import com.ril.ajio.services.data.Product.fleek.BrandResponse;
import com.ril.ajio.services.data.sis.StoreInfo;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.data.user.UserProfileData;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import com.ril.ajio.services.utils.JsonUtils;
import com.ril.ajio.view.BaseActivity;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import com.ril.ajio.web.game.MyRewardsWebActivity;
import com.ril.ajio.web.game.MyRewardsWebActivity$a;
import io.reactivex.Scheduler;
import io.reactivex.internal.functions.Functions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.json.JSONObject;

public final class AjioHomeActivity
extends Hilt_AjioHomeActivity
implements OnFragmentInteractionListener,
ec0_1,
j3_0,
ea2_1,
ps1_2,
D23,
vr2_0,
ActionMode.Callback,
K82,
gd1$c_0,
fo3,
vh3_2,
nm_1,
lz1_1,
A71,
Rj2,
qk2_0,
hc1_2,
ee0_1 {
    public static final AjioHomeActivity$a Companion;
    public static Stack D1;
    public final AjioHomeActivity$loginNotifier$1 A1;
    public final AjioHomeActivity$invalidRefreshTokenNotifier$1 B1;
    public final Handler C1;
    public final s71 M0;
    public final x42_0 N0;
    public final zr1_1 O0;
    public final hh3_2 P0;
    public final hh3_2 Q0;
    public final hh3_2 R0;
    public gj2_1 S0;
    public Fragment T0;
    public AjioLoaderView U0;
    public LinearLayout V0;
    public TextView W0;
    public TextView X0;
    public ActionMode Y0;
    public final TabSelectedListener Z0;
    public final TabSelectedListener a1;
    public boolean b1;
    public int c1;
    public Bundle d1;
    public List e1;
    public final int f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public Bundle j1;
    public Bundle k1;
    public final NewCustomEventsRevamp l1;
    public final String m1;
    public final String n1;
    public boolean o1;
    public SharedPreferences p1;
    public boolean q1;
    public boolean r1;
    public boolean s1;
    public boolean t1;
    public boolean u1;
    public boolean v1;
    public boolean w1;
    public Boolean x1;
    public os1_2 y1;
    public final k7_0 z1;

    static {
        AjioHomeActivity$a ajioHomeActivity$a;
        Companion = ajioHomeActivity$a = new Object();
    }

    public AjioHomeActivity() {
        Object object = new s71(this);
        this.M0 = object;
        this.N0 = object = new x42_0();
        this.O0 = object = new zr1_1();
        object = new W7(this, 0);
        this.P0 = object = yr1_2.b((Function0)object);
        object = new i7_0(this, 0);
        this.Q0 = object = yr1_2.b((Function0)object);
        object = new J7((ContextWrapper)this, 0);
        this.R0 = object = yr1_2.b((Function0)object);
        this.Z0 = object = new TabSelectedListener(this);
        this.a1 = object = new TabSelectedListener(this);
        this.b1 = true;
        this.f1 = -1;
        object = AnalyticsManager.Companion;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.l1 = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.m1 = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.n1 = object = newEEcommerceEventsRevamp.getPrevScreenType();
        this.z1 = object = new k7_0(this);
        object = new AjioHomeActivity$loginNotifier$1(this);
        this.A1 = object;
        object = new AjioHomeActivity$invalidRefreshTokenNotifier$1(this);
        this.B1 = object;
        object = Ga4Events.INSTANCE;
        newEEcommerceEventsRevamp = Looper.getMainLooper();
        object = new Handler((Looper)newEEcommerceEventsRevamp);
        this.C1 = object;
    }

    public static Unit J2(AjioHomeActivity object, DataCallback object2) {
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(object2, "userProfileDataDataCallback");
        Object object3 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object3, (DataCallback)object2);
        if (n4 != 0) {
            n4 = ((DataCallback)object2).getStatus();
            if (n4 == 0) {
                object2 = kj0_1.g();
                BaseActivity baseActivity = ((BaseActivity)object).J0;
                object3 = ((AjioHomeActivity)object).P2().x;
                object = ((AjioHomeActivity)object).P2();
                String string2 = ((h91)object).y;
                object2.getClass();
                String string3 = "";
                String string4 = "";
                String string5 = "";
                String string6 = "";
                kj0_1.m(baseActivity, (String)object3, string2, string3, string4, string5, string6);
            } else {
                int n7 = ((DataCallback)object2).getStatus();
                if (n7 == n3) {
                    object2 = StringCompanionObject.INSTANCE;
                    n7 = R$string.acc_error_message;
                    object2 = hv3_0.K(n7);
                    n4 = R$string.something_wrong_msg;
                    object3 = hv3_0.K(n4);
                    Object[] objectArray = new Object[n3];
                    Object var7_10 = null;
                    objectArray[0] = object3;
                    object3 = "format(...)";
                    object2 = xh2_0.a(objectArray, n3, (String)object2, (String)object3);
                    n3 = R$string.something_wrong_msg;
                    String string7 = hv3_0.K(n3);
                    super.showNotification(string7, (String)object2);
                }
            }
        }
        return Unit.a;
    }

    public static void K2() {
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        jo_2 jo_22 = new jo_2((Context)aJIOApplication);
        jo_22.putPreference("navigation_revamp_master_flag", true);
    }

    public final void A(long l2) {
        Bundle bundle = new Bundle();
        bundle.putLong("paramDBPosition", l2);
        this.M2(bundle);
    }

    public final void B0() {
        Object object = this.P2();
        boolean bl2 = ((h91)object).b();
        if (!bl2) {
            object = "source - closet";
            int n3 = 55;
            this.z0(n3, (String)object);
        } else {
            oy1_1.Companion.getClass();
            Object object2 = new oy1_1();
            object = new Bundle();
            boolean bl3 = true;
            object.putBoolean("FROM_CART", bl3);
            ((Fragment)object2).setArguments((Bundle)object);
            Object object3 = this.T0;
            Boolean bl4 = Boolean.FALSE;
            boolean bl5 = true;
            String string2 = "";
            Object object4 = this;
            this.Q1((Fragment)object3, (Fragment)object2, bl5, string2, bl4);
            object = AnalyticsManager.Companion;
            object4 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
            object3 = "Header Click";
            object2 = "Closet Button";
            ak0_0.a((AnalyticsManager$Companion)object, (GTMEvents)object4, (String)object3, (String)object2);
        }
    }

    public final boolean B1() {
        return this.D0;
    }

    public final void C(String string2) {
        String string3 = "url";
        Intrinsics.checkNotNullParameter(string2, string3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return;
        }
        kj0_1.g().w(this, string2);
    }

    public final int C0() {
        Object object = od3_2.a();
        String string2 = ld3_2.STORE_LUXE.getStoreId();
        boolean bl2 = ((String)object).equals(string2);
        int n3 = 0;
        string2 = null;
        if (bl2) {
            object = this.P2().o;
            if (object != null && (object = ((BottomNavigationData)object).getData()) != null && (object = ((NavigationDataClass)object).getChildDetails()) != null) {
                n3 = object.size();
            }
        } else {
            object = this.P2().n;
            if (object != null && (object = ((BottomNavigationData)object).getData()) != null && (object = ((NavigationDataClass)object).getChildDetails()) != null) {
                n3 = object.size();
            }
        }
        return n3;
    }

    public final void C2(int n3, String object, String string2, String string3) {
        int n4;
        Bundle bundle = new Bundle();
        bundle.putInt("DEEP_LINK_ID", n3);
        boolean bl2 = true;
        bundle.putBoolean("DEEP_LINK_MY_ACCOUNT", bl2);
        String string4 = "ORDER_NO";
        bundle.putString(string4, (String)object);
        if (string2 != null) {
            object = "RETURN_ID";
            bundle.putString((String)object, string2);
        }
        if (string3 != null && (n4 = string3.length()) != 0) {
            object = "clicked_item_code";
            bundle.putString((String)object, string3);
        }
        if ((n4 = (int)(((h91)(object = this.P2())).b() ? 1 : 0)) == 0 && n3 != (n4 = 11)) {
            this.P2().t = bundle;
            String string5 = "source - deeplink";
            n4 = 54;
            this.z0(n4, string5);
        } else {
            this.a3(bundle);
        }
    }

    public final String D() {
        Object object = this.K0;
        object = object != null ? ((iq_1)object).Sa() : null;
        return object;
    }

    public final void D0() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("gotocloset", true);
        Companion.getClass();
        AjioHomeActivity$a.b((Context)this, bundle);
    }

    public final void D1(String string2) {
        AjioHomeActivity ajioHomeActivity = this;
        Object object = this.C1;
        Object object2 = new M7(this, 0);
        long l2 = 250L;
        object.postDelayed((Runnable)object2, l2);
        FirebaseEvents.Companion.getInstance().sendEvent("search_bar_click", null);
        NewCustomEventsRevamp newCustomEventsRevamp = this.l1;
        String string3 = newCustomEventsRevamp.getEC_USER_INTERACTION();
        String string4 = newCustomEventsRevamp.getEA_NAV_CLICK_HEADER();
        object = AnalyticsManager.Companion;
        String string5 = av_0.a((AnalyticsManager$Companion)object);
        String string6 = av_0.a((AnalyticsManager$Companion)object);
        String string7 = "search bar";
        String string8 = "navigation_click";
        String string9 = this.m1;
        object2 = this.n1;
        int n3 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string3, string4, string7, string8, string5, string6, string9, null, (String)object2, false, null, n3, null);
        object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        Object object3 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
        Object object4 = "Search Button";
        ((GTMEvents)object2).pushButtonTapEvent("Show Search", object4, (String)object3);
        object2 = new HashMap();
        String string10 = "Initiated";
        ((HashMap)object2).put("State", string10);
        object = ((AnalyticsManager$Companion)object).getInstance().getCt();
        object3 = new AnalyticsData$Builder();
        object2 = ((AnalyticsData$Builder)object3).eventMap((HashMap)object2).build();
        ((CleverTapEvents)object).search((AnalyticsData)object2);
        this.M0();
        vv2_2.Companion.getClass();
        object2 = new vv2_2();
        object = new Bundle();
        if (string2 != null) {
            object3 = "STORE_ID";
            object.putString((String)object3, string2);
        }
        object3 = od3_2.a();
        object.putString("STORE_THEME", (String)object3);
        ((Fragment)object2).setArguments((Bundle)object);
        object = ajioHomeActivity.T0;
        object4 = Boolean.FALSE;
        this.Q1((Fragment)object, (Fragment)object2, true, "search_tag", (Boolean)object4);
    }

    public final void D2(String string2) {
        Object object = this.P2();
        boolean bl2 = ((h91)object).b();
        if (bl2) {
            object = AnalyticsUtil.Companion;
            Object object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
            String string3 = "enable_my_rewards_status";
            object2 = ((ao0_0)object2).b(string3);
            object = ((AnalyticsUtil$Companion)object).mapperToMyRewardsOption((String)object2);
            object2 = MyRewardsWebActivity.Companion;
            if (object == null || (object = ((MyRewardsOption)object).getTitle()) == null) {
                object = "My Rewards";
            }
            object2.getClass();
            int n3 = 14;
            MyRewardsWebActivity$a.a(n3, this, string2, (String)object);
        }
    }

    public final boolean E0() {
        return this.i1;
    }

    public final void E2(Intent object) {
        Object object2 = this.getSupportFragmentManager();
        int n3 = R$id.content;
        if ((n3 = (object2 = ((FragmentManager)object2).D(n3)) instanceof tm2_2) != 0) {
            object2 = ((tm2_2)object2).getChildFragmentManager();
            n3 = R$id.home_content;
            boolean bl2 = (object2 = ((FragmentManager)object2).D(n3)) instanceof qn_2;
            if (bl2 && object != null && (object2 = object.getExtras()) != null) {
                Object object3 = "SHOW_PLP_PAGE";
                int n4 = object2.containsKey((String)object3);
                if (n4 != 0) {
                    object = object.getStringExtra((String)object3);
                    object2 = kj0_1.g();
                    object3 = this.J0;
                    ((kj0_1)object2).w((Activity)object3, (String)object);
                } else {
                    object = "PDP_DATA";
                    n4 = object2.containsKey((String)object);
                    if (n4 != 0) {
                        n4 = Build.VERSION.SDK_INT;
                        int n7 = 33;
                        if (n4 >= n7) {
                            object = C7.a((Bundle)object2);
                        } else {
                            bl2 = (object = object2.getSerializable((String)object)) instanceof ri2_0;
                            if (!bl2) {
                                object = null;
                            }
                            object = (ri2_0)object;
                        }
                        object = (ri2_0)object;
                        if (object != null && (object2 = object.h) != null && (bl2 = ((String)object2).equalsIgnoreCase((String)object3))) {
                            object2 = kj0_1.g();
                            object3 = this.J0;
                            object = object.f;
                            ((kj0_1)object2).w((Activity)object3, (String)object);
                        }
                    }
                }
            }
        }
    }

    public final void F(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        CustomWebViewActivity$a.b(CustomWebViewActivity.Companion, (Context)this, string2, 5);
    }

    public final void F0() {
        ActionMode actionMode = this.Y0;
        if (actionMode != null) {
            actionMode.finish();
        } else {
            this.n3();
        }
    }

    public final void G() {
        this.getSmartLockManager().a.disableAutoSignIn();
    }

    public final TabLayout$Tab G1() {
        Object object = this.s0;
        object = object != null ? object.getTabAt(0) : null;
        return object;
    }

    public final void H() {
        Companion.getClass();
        AjioHomeActivity$a.a((Context)this);
    }

    public final void J() {
        this.startActionMode(this);
        Object object = this.getSupportFragmentManager();
        int n3 = R$id.content;
        object = ((FragmentManager)object).D(n3);
        n3 = object instanceof tm2_2;
        if (n3 != 0) {
            object = ((tm2_2)object).getChildFragmentManager();
            n3 = R$id.home_content;
            if ((n3 = (object = ((FragmentManager)object).D(n3)) instanceof B23) != 0) {
                object = (B23)object;
                ((B23)object).Va();
            }
        }
    }

    public final void J1(String object) {
        Intrinsics.checkNotNullParameter(object, "store");
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        object = new jo_2((Context)aJIOApplication);
        ((sw_0)object).putPreference("AJIO_STORE_CHANGE_COACH_MARK", 3444);
    }

    public final void K(Intent intent) {
        Integer n3;
        int n4;
        int n7;
        if (intent != null) {
            n7 = 0;
            n4 = intent.getIntExtra("TAB_TYPE", 0);
            n3 = n4;
        } else {
            n4 = 0;
            n3 = null;
        }
        if (n3 != null && (n4 = n3.intValue()) == (n7 = 1003)) {
            this.E2(intent);
        }
    }

    public final void K1(int n3) {
        int n4 = 1;
        TextView textView = this.W0;
        if (textView != null) {
            Object[] objectArray = StringCompanionObject.INSTANCE;
            Object object = n3;
            objectArray = new Object[n4];
            objectArray[0] = object;
            object = "%d Selected";
            String string2 = "format(...)";
            zn0_1.b(objectArray, n4, (String)object, string2, textView);
        }
    }

    public final void L0(String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "msgToShow");
        String string3 = "format(...)";
        int n3 = 1;
        if (bl2) {
            Object object = StringCompanionObject.INSTANCE;
            int n4 = R$string.acc_error_message;
            object = hv3_0.K(n4);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string2;
            object = xh2_0.a(objectArray, n3, (String)object, string3);
            super.showNotification(string2, (String)object);
        } else {
            Object object = StringCompanionObject.INSTANCE;
            int n7 = R$string.acc_alert_message;
            object = hv3_0.K(n7);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string2;
            object = xh2_0.a(objectArray, n3, (String)object, string3);
            super.showNotification(string2, (String)object);
        }
    }

    public final boolean L1() {
        return this.q1;
    }

    public final void L2(Fragment fragment, String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(string2, "tag");
        Fragment fragment2 = this.T0;
        Boolean bl3 = Boolean.FALSE;
        this.Q1(fragment2, fragment, bl2, string2, bl3);
    }

    public final boolean M() {
        return this.h1;
    }

    public final void M1(String string2, String string3, boolean bl2) {
        int n3;
        int n4;
        Object object;
        Object object2;
        AjioHomeActivity ajioHomeActivity = this;
        Object object3 = string2;
        Object object4 = this.getSupportFragmentManager();
        int n7 = R$id.content;
        object4 = ((FragmentManager)object4).D(n7);
        n7 = 0;
        Object object5 = null;
        if (bl2) {
            if (object4 != null && (object2 = ((Fragment)object4).getView()) != null && (object2 = ((Fragment)object4).getView()) != null) {
                AJIOApplication.Companion.getClass();
                object = AJIOApplication$a.a();
                n4 = R$color.fleekColorPrimary;
                n3 = t70.getColor((Context)object, n4);
                object2.setBackgroundColor(n3);
            }
        } else if (object4 != null && (object2 = ((Fragment)object4).getView()) != null && (object2 = ((Fragment)object4).getView()) != null) {
            object2.setBackground(null);
        }
        FirebaseEvents.Companion.getInstance().sendEvent("search_bar_click", null);
        Object object6 = ajioHomeActivity.l1;
        String string4 = ((NewCustomEventsRevamp)object6).getEC_USER_INTERACTION();
        String string5 = ((NewCustomEventsRevamp)object6).getEA_NAV_CLICK_HEADER();
        object2 = AnalyticsManager.Companion;
        String string6 = av_0.a((AnalyticsManager$Companion)object2);
        String string7 = av_0.a((AnalyticsManager$Companion)object2);
        String string8 = "search bar";
        String string9 = "navigation_click";
        String string10 = ajioHomeActivity.m1;
        object = ajioHomeActivity.n1;
        int n8 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, string4, string5, string8, string9, string6, string7, string10, null, (String)object, false, null, n8, null);
        object = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
        Object object7 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
        string4 = "Search Button";
        ((GTMEvents)object).pushButtonTapEvent("Show Search", string4, (String)object7);
        object = new HashMap();
        object6 = "Initiated";
        ((HashMap)object).put("State", object6);
        object2 = ((AnalyticsManager$Companion)object2).getInstance().getCt();
        object7 = new AnalyticsData$Builder();
        object = ((AnalyticsData$Builder)object7).eventMap((HashMap)object).build();
        ((CleverTapEvents)object2).search((AnalyticsData)object);
        vv2_2.Companion.getClass();
        object2 = new vv2_2();
        n3 = object4 instanceof tm2_2;
        if (n3 != 0) {
            object4 = ((tm2_2)object4).getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(object4, "getChildFragmentManager(...)");
            object4 = ((FragmentManager)object4).c.f();
            object = "null cannot be cast to non-null type java.util.ArrayList<androidx.fragment.app.Fragment>";
            Intrinsics.checkNotNull(object4, (String)object);
            object4 = (ArrayList)object4;
            n3 = object4.isEmpty() ^ 1;
            if (n3 != 0) {
                n3 = 0;
                object = null;
                object7 = CollectionsKt.N(0, (List)object4);
                n4 = object7 instanceof q22_0;
                if (n4 != 0) {
                    object4 = ((ArrayList)object4).get(0);
                    Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type com.ril.ajio.plp.fragment.NewProductListFragment");
                    object4 = ((q22_0)object4).cb().d;
                    object5 = ((bv2_0)object4).l();
                }
            }
        }
        object4 = new Bundle();
        if (bl2 && object3 != null && (n3 = string2.length()) != 0) {
            object4.putString("brand_id", (String)object3);
            object = string3;
            object4.putString("brand_name", string3);
            object3 = "STORE_ID";
            object4.putString((String)object3, (String)object5);
        }
        object5 = od3_2.a();
        object4.putString("STORE_THEME", (String)object5);
        ((Fragment)object2).setArguments((Bundle)object4);
        object4 = ajioHomeActivity.T0;
        object7 = Boolean.FALSE;
        object3 = this;
        object5 = object2;
        boolean bl3 = true;
        object = "search_tag";
        this.Q1((Fragment)object4, (Fragment)object2, bl3, (String)object, (Boolean)object7);
    }

    public final void M2(Bundle bundle) {
        B23.Companion.getClass();
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        B23 b23 = new B23();
        b23.setArguments(bundle);
        Fragment fragment = this.T0;
        String string2 = B23.s;
        Boolean bl2 = Boolean.FALSE;
        this.Q1(fragment, b23, true, string2, bl2);
    }

    public final void N0(boolean bl2) {
        if (bl2) {
            TabLayout tabLayout = this.s0;
            int n3 = 8;
            if (tabLayout != null) {
                tabLayout.setVisibility(n3);
            }
            if ((tabLayout = this.r0) != null) {
                tabLayout.setVisibility(n3);
            }
            if ((tabLayout = this.t0) != null) {
                tabLayout.setVisibility(n3);
            }
            this.t();
        }
        this.q1 = bl2;
    }

    public final int N2() {
        int n3;
        block13: {
            Object object;
            Exception exception;
            block12: {
                int n4;
                exception = null;
                object = this.getSupportFragmentManager();
                try {
                    n4 = ((FragmentManager)object).J();
                    n3 = 0;
                }
                catch (Exception exception2) {
                    exception = exception2;
                    n3 = 0;
                }
                for (int i3 = 0; i3 < n4; ++i3) {
                    Object object2;
                    try {
                        object2 = this.getSupportFragmentManager();
                    }
                    catch (Exception exception3) {
                        break block12;
                    }
                    object2 = ((FragmentManager)object2).I(i3);
                    object2 = object2.getName();
                    FragmentManager fragmentManager = this.getSupportFragmentManager();
                    object2 = fragmentManager.E((String)object2);
                    if (object2 == null) continue;
                    object2 = ((Fragment)object2).getChildFragmentManager();
                    int n7 = ((FragmentManager)object2).J();
                    n3 += n7;
                    continue;
                }
                break block13;
            }
            object = yn3_0.a;
            ((yn3$a)object).e(exception);
        }
        return n3;
    }

    public final void O0() {
        Object object = this.P2();
        int n3 = com.ril.mp.services.R$string.rtb_url_home;
        Object object2 = this.getString(n3);
        Intrinsics.checkNotNullExpressionValue(object2, "getString(...)");
        object.getClass();
        Intrinsics.checkNotNullParameter(object2, "Url");
        Object object3 = ((h91)object).e;
        Object object4 = "landing screen";
        object2 = ((RtbRepo)object3).sendRTBRequest((String)object2, (String)object4);
        int n4 = 1;
        object3 = new lc_2(n4);
        Object object5 = new vf0_0(object3);
        object3 = new X81(0);
        Object object6 = new Y81(0, (Function1)object3);
        object2 = ((g53_0)object2).f((o60_0)object5, (o60_0)object6);
        ((h91)object).z.b((yr0_2)object2);
        this.P2().c();
        object = this.P2();
        object.getClass();
        Intrinsics.checkNotNullParameter(object4, "screenName");
        object2 = od3_2.a();
        object3 = ld3_2.STORE_AJIO.getStoreId();
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        object3 = "BOTTOM_BAR_NAV_2.0";
        object5 = "BOTTOM_BAR_NAV_3.0";
        object6 = "toUpperCase(...)";
        HomeRepo homeRepo = ((h91)object).b;
        object = ((h91)object).z;
        if (n3 != 0) {
            n3 = (int)(hu1_2.e() ? 1 : 0);
            if (n3 != 0) {
                object3 = object5;
            }
            object5 = Locale.ROOT;
            object2 = "ajio".toUpperCase((Locale)object5);
            Intrinsics.checkNotNullExpressionValue(object2, (String)object6);
            object2 = homeRepo.callCMSBottomTabsApi((String)object4, (String)object3, (String)object2);
            object2.getClass();
            object3 = Functions.c;
            object4 = Functions.d;
            object2 = ((g53_0)object2).f((o60_0)object3, (o60_0)object4);
            ((t30_0)object).b((yr0_2)object2);
        } else {
            String string2;
            object2 = od3_2.a();
            n3 = (int)(Intrinsics.areEqual(object2, string2 = ld3_2.STORE_LUXE.getStoreId()) ? 1 : 0);
            if (n3 != 0) {
                n3 = (int)(hu1_2.e() ? 1 : 0);
                if (n3 != 0) {
                    object3 = object5;
                }
                object5 = Locale.ROOT;
                object2 = "luxe".toUpperCase((Locale)object5);
                Intrinsics.checkNotNullExpressionValue(object2, (String)object6);
                object2 = homeRepo.callCMSBottomTabsApi((String)object4, (String)object3, (String)object2);
                object2.getClass();
                object3 = Functions.c;
                object4 = Functions.d;
                object2 = ((g53_0)object2).f((o60_0)object3, (o60_0)object4);
                ((t30_0)object).b((yr0_2)object2);
            }
        }
        object = this.K0;
        if (object != null) {
            ((iq_1)object).Qa();
        }
    }

    public final void O2() {
        Object object = this.d1;
        if (object != null) {
            boolean bl2;
            Object object2 = "gotoAjioWallet";
            boolean bl3 = object.containsKey((String)object2);
            Fragment fragment = null;
            if (bl3 && (bl2 = object.getBoolean((String)object2, false))) {
                q5_0.Companion.getClass();
                object = new q5_0();
                bl2 = true;
                String string2 = "AjioCashFragmentRefresh";
                this.L2((Fragment)object, string2, bl2);
            } else {
                object2 = "gotocloset";
                bl3 = object.containsKey((String)object2);
                if (bl3 && (bl2 = object.getBoolean((String)object2, false))) {
                    int n3 = 2;
                    float f5 = 2.8E-45f;
                    this.U1(n3);
                } else {
                    object2 = "gotoReferral";
                    bl2 = object.getBoolean((String)object2, false);
                    if (bl2) {
                        fragment = this.T0;
                        object2 = gg2_1.Companion;
                        float f6 = object.getFloat("REFEREE_EARN_AMOUNT", 0.0f);
                        String string3 = "REFERRER_EARN_AMOUNT";
                        float f7 = object.getFloat(string3, 0.0f);
                        object2.getClass();
                        gg2_1 gg2_12 = GG2$a.a(f6, f7);
                        Boolean bl4 = Boolean.FALSE;
                        boolean bl5 = true;
                        String string4 = "ReferralFragment";
                        AjioHomeActivity ajioHomeActivity = this;
                        this.Q1(fragment, gg2_12, bl5, string4, bl4);
                    } else {
                        object2 = "BUNDLE_LAUNCH_GOOGLE_PLAY";
                        boolean bl6 = object.getBoolean((String)object2);
                        if (bl6) {
                            mz3_0.I((Context)this);
                        }
                    }
                }
            }
        }
    }

    public final void P() {
        Object object = xl1_1.START;
        this.H2((xl1_1)((Object)object));
        object = this.Y;
        if (object != null) {
            int n3 = 0x800003;
            ((DrawerLayout)((Object)object)).closeDrawer(n3);
        }
    }

    public final h91 P2() {
        return (h91)this.Q0.getValue();
    }

    public final CMSNavigation Q() {
        Object object = this.e1;
        object = object != null ? (CMSNavigation)object.get(0) : null;
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Q1(Fragment object, Fragment fragment, boolean bl2, String object2, Boolean bl3) {
        boolean bl4;
        if (object != null && (bl4 = ((Fragment)object).isAdded()) && fragment != null) {
            int n3;
            Object object3;
            block20: {
                Exception exception2;
                block19: {
                    Object object4;
                    int n4;
                    block18: {
                        Object object5;
                        int n7;
                        this.T0 = object;
                        Intrinsics.checkNotNull(object);
                        object = ((Fragment)object).getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(object, "getChildFragmentManager(...)");
                        object3 = ((FragmentManager)object).o;
                        Object object6 = this.z1;
                        ((ArrayList)object3).add(object6);
                        object3 = new a((FragmentManager)object);
                        object6 = "beginTransaction(...)";
                        Intrinsics.checkNotNullExpressionValue(object3, (String)object6);
                        n3 = this.q1;
                        if (n3 != 0) {
                            n3 = R$anim.slide_in_bottom;
                            n4 = R$anim.slide_out_bottom;
                            n7 = 0;
                            object5 = null;
                            ((k)object3).k(n3, n4, 0, 0);
                        }
                        n3 = 1;
                        try {
                            object4 = this.T0;
                            if (object4 == null || (object4 = ((Fragment)object4).getChildFragmentManager()) == null) break block18;
                            object4 = ((FragmentManager)object4).c;
                            if ((object4 = ((j)object4).f()) == null || (n7 = object4.size()) <= 0) break block18;
                            n7 = object4.size() - n3;
                        }
                        catch (Exception exception2) {
                            break block19;
                        }
                        {
                            object4 = object4.get(n7);
                            object4 = (Fragment)object4;
                        }
                        n7 = object4 instanceof q9_0;
                        if (n7 != 0) {
                            object5 = od3_2.a();
                            Object object7 = ld3_2.STORE_AJIOGRAM;
                            n7 = (int)(((String)object5).equals(object7 = object7.getStoreId()) ? 1 : 0);
                            if (n7 != 0) {
                                object4 = (q9_0)object4;
                                object4 = ((q9_0)object4).ab();
                                object5 = D1;
                                if (object5 != null && (n7 = (int)(((AbstractCollection)object5).contains(object4) ? 1 : 0)) == 0 && (object5 = D1) != null) {
                                    ((AbstractCollection)object5).add(object4);
                                }
                            }
                        }
                    }
                    object4 = h40_0.a;
                    {
                        n4 = (int)(h40_0.c() ? 1 : 0);
                        if (n4 != 0 && (n4 = (int)(p50_0.e ? 1 : 0)) != 0 && (n4 = p50_0.d) != 0 && (n4 = fragment instanceof q9_0) != 0 && (n4 = (int)(b.i((String)object2, (String)(object4 = "HOME"), n3 != 0) ? 1 : 0)) == 0) {
                            int n8 = p50_0.d;
                            ((k)object3).j(n8, fragment, (String)object2);
                        } else if (bl3 != null) {
                            int n10 = R$id.home_content;
                            ((k)object3).j(n10, fragment, (String)object2);
                        } else {
                            int n14 = R$id.home_content;
                            ((k)object3).j(n14, fragment, (String)object2);
                        }
                        if (bl2) {
                            ((k)object3).c((String)object2);
                        }
                        break block20;
                    }
                }
                object2 = yn3_0.a;
                ((yn3$a)object2).e(exception2);
            }
            if (!(bl2 = this.isDestroyed()) && !(bl2 = ((FragmentManager)object).K)) {
                try {
                    ((a)object3).o(n3 != 0, n3 != 0);
                    ((FragmentManager)object).C();
                }
                catch (IllegalStateException illegalStateException) {
                    yn3$a yn3$a = yn3_0.a;
                    yn3$a.e(illegalStateException);
                }
            }
            this.setToolbarState(fragment);
        }
    }

    public final bu2_0 Q2() {
        return (bu2_0)this.R0.getValue();
    }

    public final void R() {
        this.Y2("frontPage");
    }

    public final void R0(StoreInfo storeInfo) {
        this.F0 = storeInfo;
    }

    public final void R1(ZoomExtras zoomExtras) {
        Intrinsics.checkNotNullParameter(zoomExtras, "zoomExtras");
        ZoomFragment.Companion.getClass();
        ZoomFragment zoomFragment = new ZoomFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ZOOM_EXTRAS", (Parcelable)zoomExtras);
        zoomFragment.setArguments(bundle);
        Fragment fragment = this.T0;
        Boolean bl2 = Boolean.FALSE;
        this.Q1(fragment, zoomFragment, true, "ZoomFragment", bl2);
    }

    public final void R2(String object) {
        Object object2 = tj2_2.Companion;
        Object object3 = "/p/";
        int n3 = StringsKt.F((CharSequence)object, (CharSequence)object3, false);
        object2.getClass();
        tj2_2.e = n3;
        object2 = "ajioapps://";
        boolean bl2 = b.s((String)object, (String)object2, false);
        if (bl2) {
            object2 = "ajioapps";
            object3 = "https";
            object = b.n((String)object, (String)object2, (String)object3, false);
        }
        if ((n3 = StringsKt.F((CharSequence)object, (CharSequence)(object2 = "linkCohort"), false)) != 0) {
            object2 = Uri.parse((String)object).getQueryParameter((String)object2);
            object3 = h40_0.a;
            n3 = h40_0.V0();
            if (n3 != 0) {
                UserInformation.getInstance((Context)this).setCohortLinkData((String)object2);
                object3 = UserInformation.getInstance((Context)this).getCohortDataForGuestAjioStoreUser();
                Object object4 = "getCohortDataForGuestAjioStoreUser(...)";
                Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                n3 = ((String)object3).length();
                if (n3 == 0 || (n3 = (int)(Intrinsics.areEqual(object3 = UserInformation.getInstance((Context)this).isAjioStoreGuestCohortValueFromCustomerApi(), object4 = Boolean.FALSE) ? 1 : 0)) != 0) {
                    object3 = UserInformation.getInstance((Context)this);
                    object4 = Boolean.FALSE;
                    ((UserInformation)object3).setCohortDataForGuestAjioStoreUser((String)object2, (Boolean)object4);
                }
            }
        }
        if ((n3 = hu1_2.c((String)object, bl2 = true)) != 0) {
            og1_1.g(false, bl2);
            object = this.Z0;
            ((TabSelectedListener)object).a();
            od3_2.d();
            this.recreate();
        } else {
            n3 = hu1_2.b((String)object, bl2);
            if (n3 != 0) {
                og1_1.g(bl2, bl2);
                object = this.a1;
                ((TabSelectedListener)object).a();
                this.recreate();
            } else {
                object2 = Uri.parse((String)object);
                if (object2 != null) {
                    object2 = object2.getHost();
                } else {
                    bl2 = false;
                    object2 = null;
                }
                if (object2 != null) {
                    object2 = kj0_1.g();
                    ((kj0_1)object2).w(this, (String)object);
                }
            }
        }
    }

    public final void S0(int n3, String string2, String string3, String string4, String string5) {
        Serializable serializable;
        Object object = new ri2$a();
        ((ri2$a)object).b(string2);
        ((ri2$a)object).c = serializable = Integer.valueOf(n3);
        ((ri2$a)object).d = string3;
        ((ri2$a)object).n = string5;
        if (string4 == null) {
            string4 = "";
        }
        ((ri2$a)object).e = string4;
        serializable = ((ri2$a)object).a();
        this.Q2().b.k(serializable);
        NewProductDetailsFragment.Companion.getClass();
        NewProductDetailsFragment newProductDetailsFragment = new NewProductDetailsFragment();
        Fragment fragment = this.T0;
        Boolean bl2 = Boolean.FALSE;
        object = this;
        this.Q1(fragment, newProductDetailsFragment, true, "NewProductDetailsFragment", bl2);
    }

    public final void S1(String object) {
        Boolean bl2;
        Intrinsics.checkNotNullParameter(object, "productCode");
        ri2$a ri2$a = new ri2$a();
        ri2$a.b = object;
        ri2$a.g = bl2 = Boolean.FALSE;
        object = ri2$a.a();
        this.Q2().b.k(object);
        NewProductDetailsFragment.Companion.getClass();
        NewProductDetailsFragment newProductDetailsFragment = new NewProductDetailsFragment();
        Fragment fragment = this.T0;
        this.Q1(fragment, newProductDetailsFragment, true, "NewProductDetailsFragment", bl2);
    }

    public final void S2(Intent object) {
        Object object2;
        if (object != null && (object2 = object.getExtras()) != null) {
            Object object3;
            int n3;
            int n4;
            object2 = object.getExtras();
            Object object4 = null;
            if (object2 != null) {
                n4 = Build.VERSION.SDK_INT;
                n3 = 33;
                if (n4 >= n3) {
                    object2 = C7.a(object2);
                } else {
                    object3 = "PDP_DATA";
                    n4 = (object2 = object2.getSerializable((String)object3)) instanceof ri2_0;
                    if (n4 == 0) {
                        object2 = null;
                    }
                    object2 = (ri2_0)object2;
                }
                object2 = (ri2_0)object2;
            } else {
                object2 = null;
            }
            if (object2 != null) {
                object3 = object2.c;
                if (object3 != null) {
                    n4 = (Integer)object3;
                } else {
                    n4 = 0;
                    object3 = null;
                }
                n3 = 1003;
                if (n4 == n3) {
                    this.E2((Intent)object);
                } else {
                    object3 = "SHOW_CART";
                    object = object2.h;
                    n4 = (int)(Intrinsics.areEqual(object3, object) ? 1 : 0);
                    if (n4 != 0) {
                        int n7 = 3;
                        this.U1(n7);
                    } else {
                        object3 = "SHOW_CLOSET";
                        n4 = (int)(Intrinsics.areEqual(object3, object) ? 1 : 0);
                        if (n4 != 0) {
                            int n8 = 2;
                            this.U1(n8);
                        } else {
                            object3 = "SHOW_LANDING_PAGE";
                            n4 = (int)(Intrinsics.areEqual(object3, object) ? 1 : 0);
                            if (n4 != 0) {
                                object = q9_0.Companion;
                                String string2 = object2.f;
                                object.getClass();
                                q9_0 q9_02 = q9$a.b(null, string2);
                                Fragment fragment = this.T0;
                                Boolean bl2 = Boolean.FALSE;
                                boolean bl3 = true;
                                object3 = this;
                                this.Q1(fragment, q9_02, bl3, string2, bl2);
                            } else {
                                object4 = "SHOW_PLP_PAGE";
                                boolean bl4 = Intrinsics.areEqual(object4, object);
                                if (bl4) {
                                    this.getAppPreferences().u();
                                    this.getAppPreferences().v();
                                    this.getAppPreferences().w();
                                    object = this.Q2().a;
                                    object4 = zn0_2.b((ri2_0)object2);
                                    ((LiveData)object).k(object4);
                                    object = zn0_2.b((ri2_0)object2).e;
                                    if (object == null) {
                                        object = "";
                                    }
                                    object4 = zn0_2.b((ri2_0)object2).H;
                                    q22_0 q22_02 = at2_1.b((String)object, (String)object4);
                                    String string3 = object2.i;
                                    if (string3 != null) {
                                        Fragment fragment = this.T0;
                                        Boolean bl5 = Boolean.FALSE;
                                        boolean bl6 = true;
                                        object3 = this;
                                        this.Q1(fragment, q22_02, bl6, string3, bl5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void T0() {
        this.U1(3);
    }

    public final void T1() {
        this.I2();
        this.h1(true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void T2(Intent object) {
        boolean bl2;
        int n3;
        Object object2;
        Object object3 = this.getSupportFragmentManager();
        int n4 = R$id.content;
        if ((n4 = (object3 = ((FragmentManager)object3).D(n4)) instanceof tm2_2) == 0) return;
        object3 = ((tm2_2)object3).getChildFragmentManager();
        n4 = R$id.home_content;
        if ((n4 = (object3 = ((FragmentManager)object3).D(n4)) instanceof bz1_2) != 0) {
            object2 = object3;
            object2 = (bz1_2)object3;
            n3 = ((Fragment)object2).isVisible();
            if (n3 != 0) {
                object2.getClass();
                object3 = "last_name";
                if (object != null) {
                    try {
                        n3 = object.hasExtra((String)object3);
                        if (n3 != 0) {
                            ((bz1_2)object2).J0 = n3 = 1;
                            object = object.getStringExtra((String)object3);
                            object = ((bz1_2)object2).Za((String)object);
                            ((bz1_2)object2).gb((UserProfileData)object);
                            ((bz1_2)object2).fb();
                        }
                    }
                    catch (Exception exception) {
                        ((bz1_2)object2).J0 = false;
                    }
                }
                ((bz1_2)object2).ib();
                object = ((bz1_2)object2).k0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mScrollviewAccount");
                    boolean bl3 = false;
                    object = null;
                }
                int n7 = 33;
                ((NestedScrollView)object).f(n7);
                return;
            }
        }
        if (bl2 = object3 instanceof qn_2) {
            object = object3;
            object = (qn_2)object3;
            n4 = (int)(((Fragment)object).isVisible() ? 1 : 0);
            if (n4 != 0) {
                object3 = ((qn_2)object).k;
                if (object3 != null && (n4 = (int)(((ex1_0)object3).qb() ? 1 : 0)) != 0) {
                    object2 = ((ex1_0)object3).G;
                    if (object2 != null) {
                        n3 = 8;
                        object2.setVisibility(n3);
                    }
                    object2 = ((ex1_0)object3).T;
                    ((ArrayList)object2).clear();
                    object3 = ((ex1_0)object3).S;
                    if (object3 != null) {
                        ((RecyclerView$f)object3).notifyDataSetChanged();
                    }
                }
                if ((object = ((qn_2)object).k) == null) return;
                ((ex1_0)object).sb(false);
                return;
            }
        }
        if (!(bl2 = object3 instanceof q9_0)) return;
        bl2 = ((Fragment)(object3 = (q9_0)object3)).isVisible();
        if (!bl2) return;
        ((q9_0)object3).nb();
    }

    public final void U0() {
        Companion.getClass();
        AjioHomeActivity$a.a((Context)this);
    }

    /*
     * Unable to fully structure code
     */
    public final void U1(int var1_1) {
        var2_2 = false;
        var3_3 = null;
        this.v0 = false;
        var4_4 = new HashMap<Integer, String>();
        var5_5 = true;
        var6_6 = (int)var5_5;
        var4_4.put((Integer)var6_6, "/capsule/newin");
        var6_6 = 2;
        var4_4.put((Integer)var6_6, "/wishlist");
        var6_6 = 3;
        var4_4.put((Integer)var6_6, "/cart");
        var7_7 = 4;
        var6_6 = var7_7;
        var8_8 = "/my-account";
        var4_4.put((Integer)var6_6, (String)var8_8);
        if (var1_1 == 0) ** GOTO lbl36
        var7_7 = (int)og1_1.c();
        var6_6 = var7_7 != 0 ? this.P2().o : this.P2().n;
        if (var6_6 != null && (var8_8 = var6_6.getNavigationNode()) != null && (var8_8 = var6_6.getNavigationNode().getChildren()) != null) {
            var6_6 = var6_6.getNavigationNode().getChildren().iterator();
            var9_9 = 0;
            var8_8 = null;
            while ((var10_10 = (int)var6_6.hasNext()) != 0) {
                var11_11 = ((Child)var6_6.next()).getNodeurlLink();
                var12_12 = var1_1;
                var10_10 = (int)b.i(var11_11, (String)(var12_12 = (String)var4_4.get(var12_12)), var5_5);
                if (var10_10 == 0) {
                    ++var9_9;
                    continue;
                }
                break;
            }
        } else {
            var5_5 = false;
lbl36:
            // 2 sources

            var9_9 = 0;
            var8_8 = null;
        }
        var6_6 = this.W0();
        if (var9_9 == 0 || var6_6 == null || (var10_10 = var6_6.getSelectedTabPosition()) != var9_9) {
            var2_2 = var5_5;
        }
        if (!var2_2) {
            var3_3 = kj0_1.g();
            var13_13 = var1_1;
            var13_13 = (String)var4_4.get(var13_13);
            var3_3.p(this, (String)var13_13);
        } else if (var2_2 && var6_6 != null && (var13_14 = var6_6.getTabAt(var9_9)) != null && (var13_14 = var6_6.getTabAt(var9_9)) != null) {
            var13_14.select();
        }
    }

    public final void U2() {
        tm2_2 tm2_22 = new tm2_2();
        Intrinsics.checkNotNullExpressionValue(tm2_22, "newInstance(...)");
        hv3_0.a.getClass();
        String string2 = hv3_0.M();
        string2 = "first_tab_tag".concat(string2);
        BaseActivity.y2(this, tm2_22, string2);
        this.T0 = tm2_22;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean V2(String string2, boolean bl2) {
        Object object;
        IllegalStateException illegalStateException2;
        int n3;
        block8: {
            int n4;
            Object object2;
            Object object3;
            n3 = 1;
            try {
                object3 = this.T0;
                if (object3 == null) return n3 != 0;
                object3 = ((Fragment)object3).getChildFragmentManager();
                object2 = "getChildFragmentManager(...)";
                Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                n4 = ((FragmentManager)object3).J();
                if (n4 <= 0) return n3 != 0;
            }
            catch (IllegalStateException illegalStateException2) {
                break block8;
            }
            {
                object2 = ((FragmentManager)object3).I(n4 -= n3);
                String string3 = "getBackStackEntryAt(...)";
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                object2 = object2.getName();
                object3 = ((FragmentManager)object3).E((String)object2);
            }
            n4 = object3 instanceof q9_0;
            if (n4 == 0) return n3 != 0;
            if (bl2) {
                object = object3;
                object = (q9_0)object3;
                ((q9_0)object).Hb(string2);
            }
            object3 = (q9_0)object3;
            object = ((q9_0)object3).X;
            if (object != null) {
                object = ((x9_0)object).r;
            } else {
                bl2 = false;
                object = null;
            }
            if (object == null) return n3 != 0;
            int n7 = ((String)object).length();
            if (n7 == 0) {
                return n3 != 0;
            }
            boolean bl3 = ((String)object).equalsIgnoreCase(string2);
            if (bl3) return 0 != 0;
            return n3 != 0;
        }
        object = yn3_0.a;
        ((yn3$a)object).e(illegalStateException2);
        return n3 != 0;
    }

    public final void W() {
        boolean bl2;
        boolean bl3;
        String string2;
        Object object = this.t0;
        if (object != null) {
            string2 = null;
            object.setVisibility(0);
        }
        if (bl3 = b.i((String)(object = od3_2.a()), string2 = ld3_2.STORE_AJIOGRAM.getStoreId(), bl2 = true)) {
            object = this.r0;
            if (object != null) {
                ai0_2.i(object);
            }
            if ((object = this.s0) != null) {
                ai0_2.i(object);
            }
        } else {
            object = od3_2.a();
            bl3 = b.i((String)object, string2 = ld3_2.STORE_LUXE.getStoreId(), bl2);
            if (bl3) {
                object = this.s0;
                if (object != null) {
                    ai0_2.B(object);
                }
                if ((object = this.r0) != null) {
                    ai0_2.i(object);
                }
            } else {
                object = this.r0;
                if (object != null) {
                    ai0_2.B(object);
                }
                if ((object = this.s0) != null) {
                    ai0_2.i(object);
                }
            }
        }
    }

    public final TabLayout W0() {
        boolean bl2 = og1_1.c();
        TabLayout tabLayout = bl2 ? this.s0 : this.r0;
        return tabLayout;
    }

    public final void W2(Intent object) {
        block21: {
            String string2;
            Object object2;
            block20: {
                object2 = null;
                if (object != null) {
                    block19: {
                        block18: {
                            string2 = "PLP_EXTRAS";
                            int n3 = Build.VERSION.SDK_INT;
                            int n4 = 33;
                            if (n3 <= n4) break block18;
                            object = H7.a(object);
                            object = (Parcelable)object;
                            break block19;
                        }
                        object = object.getParcelableExtra(string2);
                        boolean bl2 = object instanceof PLPExtras;
                        if (bl2) {
                            object2 = object;
                        }
                        object = object2;
                        object = (PLPExtras)object2;
                    }
                    object2 = object;
                    object2 = (PLPExtras)object;
                }
                if (object2 == null) break block21;
                this.U2();
                object = this.Q2();
                object = object.a;
                object.k(object2);
                object = object2.e;
                if (object != null) break block20;
                object = "";
            }
            string2 = object2.H;
            q22_0 q22_02 = at2_1.b((String)object, string2);
            Fragment fragment = this.T0;
            String string3 = object2.f;
            Boolean bl3 = Boolean.FALSE;
            boolean bl4 = true;
            try {
                this.Q1(fragment, q22_02, bl4, string3, bl3);
            }
            catch (Exception exception) {
                object = yn3_0.a;
                object2 = new Object[]{};
                string2 = "Exception while adding fragment";
                object.a(string2, (Object[])object2);
            }
        }
    }

    public final LiveData X0() {
        Object object = this.K0;
        object = object != null ? ((iq_1)object).Ua() : null;
        return object;
    }

    public final void X1() {
        this.getWindow().clearFlags(1024);
    }

    public final boolean X2(String string2) {
        int n3;
        block14: {
            IllegalStateException illegalStateException2;
            Object object;
            block17: {
                block16: {
                    int n4;
                    Object object2;
                    block15: {
                        n3 = 1;
                        try {
                            object = this.T0;
                            if (object == null) break block14;
                        }
                        catch (IllegalStateException illegalStateException2) {}
                        object = ((Fragment)object).getChildFragmentManager();
                        object2 = "getChildFragmentManager(...)";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                        n4 = ((FragmentManager)object).J();
                        if (n4 <= 0) break block14;
                        n4 -= n3;
                        object2 = ((FragmentManager)object).I(n4);
                        String string3 = "getBackStackEntryAt(...)";
                        Intrinsics.checkNotNullExpressionValue(object2, string3);
                        object2 = object2.getName();
                        object = ((FragmentManager)object).E((String)object2);
                        n4 = object instanceof ed3_2;
                        if (n4 == 0) break block14;
                        object = (ed3_2)object;
                        object = ((ed3_2)object).j;
                        if (object != null) break block15;
                        object = "mStoreLPViewModel";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                        object = null;
                    }
                    object2 = ((uc3_2)object).b;
                    n4 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                    if (n4 != 0) break block16;
                    object = ((uc3_2)object).b;
                    boolean bl2 = b.i((String)object, string2, n3 != 0);
                    if (!bl2) break block16;
                    n3 = 0;
                    break block17;
                }
                return n3 != 0;
            }
            object = yn3_0.a;
            ((yn3$a)object).e(illegalStateException2);
        }
        return n3 != 0;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void Y2(String object) {
        Object object2 = this.getSupportFragmentManager();
        int n3 = R$id.content;
        if ((n3 = (object2 = ((FragmentManager)object2).D(n3)) instanceof tm2_2) == 0) return;
        object2 = ((tm2_2)object2).getChildFragmentManager();
        n3 = R$id.home_content;
        if ((n3 = (object2 = ((FragmentManager)object2).D(n3)) instanceof vd3_2) == 0) return;
        object2 = (vd3_2)object2;
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, "type");
        String string2 = "backPage";
        n3 = (int)(Intrinsics.areEqual(object, string2) ? 1 : 0);
        int n4 = 0;
        if (n3 != 0) {
            ViewPager2 viewPager2 = ((vd3_2)object2).f;
            if (viewPager2 == null) return;
            int n7 = viewPager2.getCurrentItem();
            if (n7 <= 0) return;
            ((vd3_2)object2).Oa(false);
            return;
        } else {
            string2 = "frontPage";
            int n8 = Intrinsics.areEqual(object, string2);
            if (n8 == 0) return;
            ViewPager2 viewPager2 = ((vd3_2)object2).f;
            if (viewPager2 != null) {
                n8 = viewPager2.getCurrentItem();
            } else {
                n8 = 0;
                Object var1_5 = null;
            }
            n3 = 1;
            n8 += n3;
            Object object3 = ((vd3_2)object2).f;
            if (object3 != null && (object3 = ((ViewPager2)((Object)object3)).getAdapter()) != null) {
                n4 = ((RecyclerView$f)object3).getItemCount();
            }
            if (n8 < n4) {
                ((vd3_2)object2).Oa(n3 != 0);
                return;
            } else {
                void var1_9;
                j3_0 j3_02 = ((vd3_2)object2).g;
                if (j3_02 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                    n8 = 0;
                    Object var1_8 = null;
                }
                var1_9.v1();
            }
        }
        return;
        catch (Exception exception) {
            return;
        }
    }

    public final void Z1() {
        LinearLayout linearLayout = this.I0;
        if (linearLayout != null) {
            int n3 = 8;
            linearLayout.setVisibility(n3);
        }
    }

    public final void Z2(Bundle bundle) {
        Object object;
        Object object2 = this.y1;
        Object object3 = "cartOrderSharedViewModel";
        String string2 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object2 = null;
        }
        object2 = ((os1_2)object2).b;
        int n3 = 33;
        if (bundle != null) {
            int n4 = Build.VERSION.SDK_INT;
            if (n4 >= n3) {
                object = G7.a(bundle);
            } else {
                object = bundle.getSerializable("cart order");
                boolean bl2 = object instanceof CartOrder;
                if (!bl2) {
                    n4 = 0;
                    object = null;
                }
                object = (CartOrder)object;
            }
            object = (CartOrder)object;
        } else {
            boolean bl3 = false;
            object = null;
        }
        ((LiveData)object2).k(object);
        object2 = this.y1;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object2 = null;
        }
        object2 = ((os1_2)object2).c;
        if (bundle != null) {
            int n7 = Build.VERSION.SDK_INT;
            if (n7 >= n3) {
                object3 = E7.a(bundle);
            } else {
                object3 = bundle.getSerializable("GIFTS_ITEMS_DATA");
                n3 = object3 instanceof HashMap;
                if (n3 == 0) {
                    n7 = 0;
                    object3 = null;
                }
                object3 = (HashMap)object3;
            }
            object3 = (HashMap)object3;
        } else {
            boolean bl4 = false;
            object3 = null;
        }
        ((LiveData)object2).k(object3);
        object2 = bundle != null ? bundle.getString("BUNDLE_CART_ORDER_STRING") : null;
        if (bundle != null) {
            object3 = "order_code";
            string2 = bundle.getString((String)object3);
        }
        CancelReasonFragment cancelReasonFragment = new CancelReasonFragment();
        bundle = new Bundle();
        bundle.putString("cart_string", (String)object2);
        bundle.putString("order_no", string2);
        cancelReasonFragment.setArguments(bundle);
        object = this.T0;
        Boolean bl5 = Boolean.FALSE;
        this.Q1((Fragment)object, cancelReasonFragment, true, "cancel_order_tag", bl5);
    }

    public final void a1(CMSNavigation cMSNavigation) {
        boolean bl2;
        Object object = this.C1;
        Object object2 = new U7(this);
        long l2 = 250L;
        object.postDelayed((Runnable)object2, l2);
        object = null;
        if (cMSNavigation != null) {
            object2 = cMSNavigation.getUrl();
        } else {
            bl2 = false;
            object2 = null;
        }
        bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl2) {
            kj0_1 kj0_12 = kj0_1.g();
            if (cMSNavigation != null) {
                object = cMSNavigation.getUrl();
            }
            String string2 = "nav";
            boolean bl3 = true;
            kj0_12.v(this, (String)object, null, bl3, false, string2, 0);
        }
    }

    public final void a3(Bundle bundle) {
        Object object;
        Object object2 = "bundle";
        Intrinsics.checkNotNullParameter(bundle, (String)object2);
        boolean bl2 = og1_1.c();
        object2 = bl2 ? this.P2().o : this.P2().n;
        if (object2 != null && (object = ((BottomNavigationData)object2).getData()) != null && (object = ((BottomNavigationData)object2).getData().getChildDetails()) != null) {
            int n3 = 0;
            object = null;
            this.k1 = null;
            if ((object2 = ((BottomNavigationData)object2).getData().getChildDetails()) != null) {
                object2 = ((Iterable)object2).iterator();
                while ((n3 = object2.hasNext()) != 0) {
                    String string2;
                    boolean bl3;
                    object = (CMSNavigation)object2.next();
                    String string3 = ((CMSNavigation)object).getUrl();
                    if (string3 == null) {
                        string3 = "";
                    }
                    if (!(bl3 = StringsKt.F(string2 = "/my-account", string3, false))) continue;
                    this.j1 = bundle;
                    n3 = (object = ((CMSNavigation)object).getSequence()) != null ? (Integer)object : -1;
                    this.f3(n3);
                }
            }
        } else {
            this.k1 = bundle;
        }
    }

    public final void b(String string2) {
        Intrinsics.checkNotNullParameter(string2, "title");
        int n3 = R$drawable.nav_back;
        int n4 = R$string.shared_with_me;
        String string3 = hv3_0.K(n4);
        boolean bl2 = true;
        int n7 = 3;
        this.showUpButton(bl2, n7, n3, string3);
        AjioCustomToolbar ajioCustomToolbar = this.k0;
        if (ajioCustomToolbar != null) {
            ajioCustomToolbar.setTitle(string2);
        }
        this.showTabLayout(false);
    }

    public final DrawerLayout b0() {
        return this.Y;
    }

    public final void b3(Intent object) {
        boolean bl2;
        Object object2 = null;
        Object object3 = object != null ? object.getStringExtra("user_name") : null;
        if (object != null) {
            object2 = object.getStringExtra("user_pwd");
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)object3)) && !(bl2 = TextUtils.isEmpty((CharSequence)object2))) {
            object = this.getSmartLockManager();
            object.getClass();
            Credential$Builder credential$Builder = new Credential$Builder((String)object3);
            object2 = credential$Builder.setPassword((String)object2).build();
            object2 = ((x73_0)object).a.save((Credential)object2);
            object3 = new v73_0((x73_0)object);
            ((Task)object2).addOnCompleteListener((OnCompleteListener)object3);
        }
        if (bl2 = ((h91)(object = this.P2())).b()) {
            object = this.P2();
            ((h91)object).c();
        }
    }

    public final void c(boolean bl2) {
        boolean bl3 = true;
        if (bl2) {
            Object object;
            Object object2 = this.r0;
            if (object2 != null && (object = this.s0) != null) {
                boolean bl4 = this.q1;
                if (!bl4) {
                    ai0_2.B((View)object2);
                }
                object2 = this.r0;
                object = new AjioHomeActivity$c(this);
                int n3 = R$anim.alpha_anim;
                Animation animation = AnimationUtils.loadAnimation((Context)this, (int)n3);
                String string2 = "loadAnimation(...)";
                Intrinsics.checkNotNullExpressionValue(animation, string2);
                animation.setAnimationListener((Animation.AnimationListener)object);
                if (object2 != null) {
                    object2.startAnimation(animation);
                }
                if ((object2 = this.K0) != null && (bl2 = ((Fragment)object2).isAdded()) == bl3 && !(bl2 = this.isFinishing()) && (object2 = this.K0) != null) {
                    ((iq_1)object2).Wa(null);
                }
            }
        } else {
            Object object = this.r0;
            int n4 = 8;
            if (object != null) {
                object.setVisibility(n4);
            }
            if ((object = this.t0) != null) {
                object.setVisibility(n4);
            }
            if (!(bl2 = this.q1)) {
                object = this.s0;
                if (object != null) {
                    object.setVisibility(0);
                }
                if ((object = this.t0) != null) {
                    object.setVisibility(0);
                }
            }
            og1_1.g(bl3, false);
            og1_1.g(bl3, bl3);
            object = this.s0;
            if (object != null && !(bl2 = object.getTabCount())) {
                this.l3();
            }
            this.updateCartWishCount();
            object = this.K0;
            if (object != null && (bl2 = ((Fragment)object).isAdded()) == bl3 && !(bl2 = this.isFinishing()) && (object = this.K0) != null) {
                ((iq_1)object).Wa(null);
            }
        }
        this.g3();
        s20.a = false;
    }

    public final void c2() {
        this.hideToolbarLayout();
        this.showTabLayout(false);
    }

    public final void c3() {
        int n3;
        int n4 = this.N2();
        if (n4 == (n3 = 1)) {
            this.i3(n3 != 0);
        }
        hv3_0.a.getClass();
        Object object = hv3_0.M();
        object = "first_tab_tag".concat((String)object);
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        object = fragmentManager.E((String)object);
        if (object != null && (n3 = object instanceof tm2_2) != 0) {
            object = ((tm2_2)object).getChildFragmentManager();
            n3 = R$id.home_content;
            if ((object = ((FragmentManager)object).D(n3)) != null && (n3 = object instanceof q9_0) != 0) {
                object = (q9_0)object;
                ((q9_0)object).Qa();
            }
        }
    }

    public final void d0(Product product) {
        String string2 = "product";
        Intrinsics.checkNotNullParameter(product, string2);
        xp2_2 xp2_22 = new xp2_2();
        Intrinsics.checkNotNullParameter(product, string2);
        xp2_22.L = product;
        Fragment fragment = this.T0;
        Boolean bl2 = Boolean.FALSE;
        this.Q1(fragment, xp2_22, true, "", bl2);
    }

    public final void d1(Product serializable, String object, Boolean bl2) {
        Object object2;
        int n3;
        Object object3 = null;
        if (object == null || (n3 = ((String)object).length()) == 0) {
            object = GAEcommerceEvents.INSTANCE;
            if (serializable == null || (object2 = serializable.getCatalogName()) == null) {
                if (serializable != null) {
                    object2 = serializable.getCatalog();
                } else {
                    n3 = 0;
                    object2 = null;
                }
            }
            object = ((GAEcommerceEvents)object).getStoreTypeFromCatalog((String)object2);
        }
        object2 = new ri2$a();
        if (serializable != null) {
            object3 = serializable.getCode();
        }
        ((ri2$a)object2).b((String)object3);
        ((ri2$a)object2).d = object;
        serializable = ((ri2$a)object2).a();
        this.Q2().b.k(serializable);
        NewProductDetailsFragment.Companion.getClass();
        NewProductDetailsFragment newProductDetailsFragment = new NewProductDetailsFragment();
        object2 = this.T0;
        object3 = this;
        this.Q1((Fragment)object2, newProductDetailsFragment, true, "NewProductDetailsFragment", bl2);
    }

    public final void d3() {
        this.getAppPreferences().p(0);
        this.getAppPreferences().o(0.0f);
        ap_0.c = null;
        ap_0.b.removePreference("cart_id");
        ap_0.a.removeCartGuId();
        this.updateCartWishCount();
    }

    public final void dismissDialogBackPressed() {
        int n3;
        TabLayout tabLayout = this.r0;
        int n4 = 1;
        if (tabLayout != null && tabLayout != null && (n3 = tabLayout.getSelectedTabPosition()) == n4 || (tabLayout = this.s0) != null && tabLayout != null && (n3 = tabLayout.getSelectedTabPosition()) == n4) {
            this.onBackPressed();
        }
    }

    public final void e3(String string2) {
        if (string2 == null) {
            return;
        }
        hv3_0.a.getClass();
        String string3 = hv3_0.M();
        String string4 = "first_tab_tag";
        string3 = string4.concat(string3);
        boolean bl2 = string2.equalsIgnoreCase(string3);
        if (bl2) {
            boolean bl3 = false;
            string2 = null;
            this.f3(0);
        } else {
            string3 = hv3_0.M();
            string4 = "second_tab_tag";
            bl2 = string2.equalsIgnoreCase(string3 = string4.concat(string3));
            if (bl2) {
                int n3 = 1;
                this.f3(n3);
            } else {
                string3 = hv3_0.M();
                string4 = "third_tab_tag";
                bl2 = string2.equalsIgnoreCase(string3 = string4.concat(string3));
                if (bl2) {
                    int n4 = 2;
                    this.f3(n4);
                } else {
                    string3 = hv3_0.M();
                    string4 = "fourth_tab_tag";
                    bl2 = string2.equalsIgnoreCase(string3 = string4.concat(string3));
                    if (bl2) {
                        int n7 = 3;
                        this.f3(n7);
                    } else {
                        string3 = hv3_0.M();
                        string4 = "fifth_tab_tag";
                        int n8 = string2.equalsIgnoreCase(string3 = string4.concat(string3));
                        if (n8 != 0) {
                            n8 = 4;
                            this.f3(n8);
                        }
                    }
                }
            }
        }
    }

    public final void f(boolean bl2) {
        if (bl2) {
            TabLayout tabLayout = this.s0;
            if (tabLayout != null && (tabLayout = this.r0) != null) {
                AjioHomeActivity$b ajioHomeActivity$b = new AjioHomeActivity$b(this);
                int n3 = R$anim.alpha_anim;
                Animation animation = AnimationUtils.loadAnimation((Context)this, (int)n3);
                String string2 = "loadAnimation(...)";
                Intrinsics.checkNotNullExpressionValue(animation, string2);
                animation.setAnimationListener((Animation.AnimationListener)ajioHomeActivity$b);
                tabLayout.startAnimation(animation);
                this.w(null, null);
            }
        } else {
            int n4;
            TabLayout tabLayout = this.s0;
            if (tabLayout != null) {
                n4 = 8;
                tabLayout.setVisibility(n4);
                tabLayout = this.t0;
                if (tabLayout != null) {
                    tabLayout.setVisibility(n4);
                }
            }
            if ((tabLayout = this.r0) != null && (n4 = (int)(this.q1 ? 1 : 0)) == 0) {
                tabLayout.setVisibility(0);
                tabLayout = this.t0;
                if (tabLayout != null) {
                    tabLayout.setVisibility(0);
                }
            }
            og1_1.g(false, false);
            bl2 = true;
            og1_1.g(false, bl2);
            od3_2.d();
            tabLayout = this.r0;
            if (tabLayout != null && !(bl2 = tabLayout.getTabCount())) {
                this.l3();
            }
            this.updateCartWishCount();
            this.w(null, null);
        }
        this.g3();
        s20.a = false;
    }

    public final void f3(int n3) {
        this.x1(true);
        TabLayout tabLayout = null;
        this.v0 = false;
        boolean bl2 = og1_1.c();
        TabLayout$Tab tabLayout$Tab = null;
        if (bl2 && (tabLayout = this.s0) != null) {
            if (tabLayout != null) {
                tabLayout$Tab = tabLayout.getTabAt(n3);
            }
        } else {
            bl2 = og1_1.c();
            if (!bl2 && (tabLayout = this.r0) != null && tabLayout != null) {
                tabLayout$Tab = tabLayout.getTabAt(n3);
            }
        }
        if (tabLayout$Tab != null) {
            tabLayout$Tab.select();
        }
    }

    public final void g(String string2) {
        Intrinsics.checkNotNullParameter(string2, "source");
        at2_1.h(this, string2, 6);
    }

    public final void g0() {
        this.D0 = false;
    }

    public final void g3() {
        boolean bl2;
        Object object;
        String string2;
        String string3;
        Object object2 = od3_2.a;
        int n3 = ((String)object2).length();
        if (!n3) {
            object2 = od3_2.a();
        }
        if (!((n3 = (int)(s20.a ? 1 : 0)) || (n3 = (int)(Intrinsics.areEqual(string3 = od3_2.a(), string2 = (object = ld3_2.STORE_AJIOGRAM).getStoreId()) ? 1 : 0)) || (bl2 = Intrinsics.areEqual(object2, string3 = object.getStoreId())))) {
            qv1_2.Companion.getClass();
            this.K0 = object2 = new qv1_2();
            object2 = this.getSupportFragmentManager();
            object2 = Vp0.a((FragmentManager)object2, (FragmentManager)object2);
            n3 = R$id.nav_frg_container;
            object = this.K0;
            Intrinsics.checkNotNull(object);
            string2 = null;
            ((k)object2).j(n3, (Fragment)object, null);
            n3 = 1;
            ((a)object2).o(n3 != 0, n3 != 0);
        }
    }

    public final boolean getRefreshOrderList() {
        return this.g1;
    }

    public final void h0() {
        TabLayout tabLayout = this.s0;
        if (tabLayout == null || (tabLayout = this.r0) == null) {
            this.l3();
        }
    }

    public final void h1(boolean n3) {
        LinearLayout linearLayout = this.V0;
        if (linearLayout != null) {
            n3 = n3 != 0 ? 0 : 8;
            linearLayout.setVisibility(n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void h3(boolean bl2, boolean bl3) {
        String string2;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        String string3;
        String string4;
        String string5;
        Object object5;
        block20: {
            block23: {
                block22: {
                    block21: {
                        object5 = "CORE_CATEGORY_NAME";
                        string5 = "CORE_CATEGORY_ID";
                        string4 = "HOME";
                        string3 = "CORE_CATEGORY_SCREEN_TYPE";
                        object4 = "";
                        if (!bl2) break block20;
                        object3 = od3_2.a();
                        object2 = ld3_2.STORE_AJIOGRAM.getStoreId();
                        bl2 = Intrinsics.areEqual(object3, object2);
                        object2 = "/shop/women";
                        if (!bl2) break block21;
                        object3 = h40_0.a;
                        bl2 = h40_0.c();
                        if (!bl2) break block21;
                        object3 = z40_0.Companion;
                        object3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a;
                        object = "ajiogram_home_page_default_id";
                        boolean bl4 = TextUtils.isEmpty((CharSequence)(object3 = ((ao0_0)object3).b((String)object)));
                        if (!bl4) break block22;
                        break block23;
                    }
                    object3 = z40_0.Companion;
                    object3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a;
                    object = "unisex_home_page_id";
                    boolean bl5 = TextUtils.isEmpty((CharSequence)(object3 = ((ao0_0)object3).b((String)object)));
                    if (bl5) break block23;
                }
                object2 = object3;
            }
            object3 = this.getAppPreferences();
            object = "core";
            ((sw_0)object3).putPreference((String)object5, (String)object);
            bl2 = hu1_2.e();
            if (bl2) {
                object3 = this.getAppPreferences();
                ((sw_0)object3).putPreference(string5, (String)object4);
            } else {
                object3 = this.getAppPreferences();
                ((sw_0)object3).putPreference(string5, (String)object2);
            }
            object3 = this.getAppPreferences();
            ((sw_0)object3).putPreference(string3, string4);
        }
        object3 = new Bundle();
        object2 = this.getAppPreferences().getPreference(string5, (String)object4);
        object3.putString(string5, (String)object2);
        object2 = this.getAppPreferences().e();
        object3.putString((String)object5, (String)object2);
        this.U2();
        String string6 = this.getAppPreferences().getPreference(string3, (String)object4);
        this.r1 = bl3;
        object5 = this.getSupportFragmentManager();
        hv3_0.a.getClass();
        string3 = hv3_0.M();
        object4 = "first_tab_tag";
        string3 = ((String)object4).concat(string3);
        object = ((FragmentManager)object5).E(string3);
        if (object == null) {
            this.U2();
        }
        boolean bl6 = true;
        object3.putBoolean("isStartOfApp", bl6);
        object5 = h40_0.a;
        int n3 = h40_0.b1();
        object4 = null;
        int n4 = 33;
        Object object6 = "deeplinkData";
        if (n3 != 0 && ((n3 = s20.a) != 0 || (n3 = Intrinsics.areEqual(object5 = od3_2.a(), string2 = ld3_2.STORE_AJIOGRAM.getStoreId())) != 0)) {
            int n7;
            object3 = "ajiogram.ajio.com";
            if (bl3 && (object5 = this.d1) != null && (n7 = object5.containsKey((String)object6)) != 0) {
                n7 = Build.VERSION.SDK_INT;
                if (n7 >= n4) {
                    object5 = (Parcelable)z7.a((Bundle)object5);
                } else {
                    n7 = (object5 = object5.getParcelable((String)object6)) instanceof Intent;
                    if (n7 == 0) {
                        n3 = 0;
                        object5 = null;
                    }
                    object5 = (Intent)object5;
                }
                object5 = (Intent)object5;
                if (object5 != null && (object5 = object5.getData()) != null && (object5 = object5.toString()) != null) {
                    object3 = object5;
                }
                if ((n3 = (int)(h40_0.c() ? 1 : 0)) != 0 && (n3 = (int)(Intrinsics.areEqual(object5 = od3_2.a(), string5 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0)) != 0 && (object5 = this.d1) != null) {
                    object5.remove((String)object6);
                }
            }
            object5 = kj0_1.g();
            Boolean bl7 = bl3;
            ((kj0_1)object5).s(this, (String)object3, null, bl7);
            return;
        }
        Object object7 = "landingpage";
        bl3 = b.i(string6, (String)object7, bl6);
        if (!bl3 && !(bl3 = b.i(string6, string4, bl6))) {
            object7 = "storelandingpage";
            bl3 = b.i(string6, (String)object7, bl6);
            if (!bl3) return;
            if ((object3 = object3.getString(string5)) == null) return;
            object7 = ed3_2.Companion;
            object7.getClass();
            object6 = ed3$a.a(null, (String)object3);
            Boolean bl8 = Boolean.FALSE;
            boolean bl9 = true;
            object2 = this;
            this.Q1((Fragment)object, (Fragment)object6, bl9, string6, bl8);
            return;
        }
        bl3 = this.o1;
        if (!bl3 && (object7 = this.d1) != null && (bl3 = object7.containsKey((String)object6)) == bl6) {
            object7 = this.d1;
            if (object7 != null) {
                n3 = Build.VERSION.SDK_INT;
                if (n3 >= n4) {
                    object4 = object7 = A7.a((Bundle)object7);
                    object4 = (Parcelable)object7;
                } else {
                    n3 = (object7 = object7.getParcelable((String)object6)) instanceof Parcelable;
                    if (n3 != 0) {
                        object4 = object7;
                    }
                }
            }
            object3.putParcelable((String)object6, (Parcelable)object4);
            object7 = this.d1;
            if (object7 != null) {
                object7.remove((String)object6);
            }
        }
        object7 = q9_0.Companion;
        object7.getClass();
        object6 = q9$a.a((Bundle)object3);
        Boolean bl10 = Boolean.FALSE;
        boolean bl11 = true;
        object2 = this;
        this.Q1((Fragment)object, (Fragment)object6, bl11, string6, bl10);
    }

    public final void hideToolbarLayout() {
        super.hideToolbarLayout();
        this.h1(false);
    }

    public final void i1(Intent object) {
        boolean bl2;
        String string2;
        int n3;
        Object object2 = null;
        if (object != null && (n3 = object.hasExtra(string2 = "OPTYPE")) != 0) {
            int n4 = object.getIntExtra(string2, 0);
            if (n4 != (n3 = 664)) {
                int n7 = 665;
                if (n4 != n7) {
                    n7 = 668;
                    if (n4 == n7) {
                        this.U1(0);
                    }
                } else {
                    object = this.getSupportFragmentManager();
                    n4 = R$id.content;
                    if ((n4 = (object = ((FragmentManager)object).D(n4)) instanceof tm2_2) != 0) {
                        object = ((tm2_2)object).getChildFragmentManager();
                        n4 = R$id.home_content;
                        if ((n4 = (object = ((FragmentManager)object).D(n4)) instanceof bz1_2) != 0) {
                            object = (bz1_2)object;
                            n4 = ((bz1_2)object).Y;
                            n3 = 1;
                            if (n4 == n3) {
                                ((bz1_2)object).ib();
                                ((bz1_2)object).Y = 0;
                            }
                        }
                    }
                }
            } else {
                if ((object = object.getExtras()) == null) {
                    return;
                }
                object2 = "SELECTED_PRODUCT_CODE_KEY";
                if ((object = object.getString((String)object2)) != null) {
                    object2 = new ri2$a();
                    ((ri2$a)object2).b = object;
                    object = ((ri2$a)object2).a();
                    this.n0((ri2_0)object);
                }
            }
        } else if (object != null && (string2 = object.getExtras()) != null && (bl2 = object.hasExtra(string2 = "PDP_DATA"))) {
            this.S2((Intent)object);
        } else {
            this.U1(0);
        }
    }

    public final void i3(boolean bl2) {
        int n3;
        hv3_0.a.getClass();
        Object object = hv3_0.M();
        object = "first_tab_tag".concat((String)object);
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        object = fragmentManager.E((String)object);
        if (object != null && (n3 = object instanceof tm2_2) != 0) {
            object = ((tm2_2)object).getChildFragmentManager();
            n3 = R$id.home_content;
            if ((object = ((FragmentManager)object).D(n3)) != null && (n3 = object instanceof q9_0) != 0) {
                object = (q9_0)object;
                ((q9_0)object).Jb(bl2);
            }
        }
    }

    public final void j3() {
        block5: {
            int n3;
            TabLayout$Tab tabLayout$Tab;
            Object object;
            CMSNavigation cMSNavigation;
            block7: {
                boolean bl2;
                Object object2;
                Object object3;
                block6: {
                    this.r1("/home");
                    cMSNavigation = this.Q();
                    boolean bl3 = false;
                    object3 = null;
                    object2 = cMSNavigation != null && (object2 = cMSNavigation.getAlternateData()) != null ? ((CMSNavigation)object2).getInactiveImageUrl() : null;
                    if (cMSNavigation == null || (object = cMSNavigation.getAlternateData()) == null || (object = ((CMSNavigation)object).getName()) == null) {
                        object = "";
                    }
                    if (object2 == null || (tabLayout$Tab = (tabLayout$Tab = this.k1()) != null ? tabLayout$Tab.getCustomView() : null) == null) break block5;
                    if ((cMSNavigation = cMSNavigation.getAlternateData()) != null) {
                        object3 = cMSNavigation.getInactiveAltText();
                    }
                    tabLayout$Tab.setContentDescription((CharSequence)object3);
                    n3 = R$id.tab_icon;
                    cMSNavigation = (ImageView)tabLayout$Tab.findViewById(n3);
                    bl3 = URLUtil.isValidUrl((String)object2);
                    if (bl3) break block6;
                    cp_1.Companion.getClass();
                    cp$a.e().getClass();
                    Intrinsics.checkNotNullParameter(object2, "mediaURL");
                    object3 = null;
                    String string2 = "android.resource://";
                    bl3 = StringsKt.F((CharSequence)object2, string2, false);
                    if (!bl3) break block7;
                }
                object3 = new da$a();
                ((da$a)object3).x = bl2 = true;
                ((da$a)object3).y = object2;
                ((da$a)object3).n = object2;
                ((da$a)object3).u = cMSNavigation;
                ((da$a)object3).a();
            }
            n3 = R$id.tab_title;
            cMSNavigation = (TextView)tabLayout$Tab.findViewById(n3);
            cMSNavigation.setText((CharSequence)object);
        }
    }

    public final TabLayout$Tab k1() {
        Object object = this.r0;
        object = object != null ? object.getTabAt(0) : null;
        return object;
    }

    public final void k3(BottomNavigationData object, String object2) {
        block45: {
            block50: {
                Object object3;
                Object object4;
                TabLayout tabLayout;
                Object object5;
                int n3;
                String string2;
                Object object6;
                int n4;
                int n7;
                int n8;
                Object object7;
                block46: {
                    block47: {
                        int n10;
                        Object object8;
                        Object object9;
                        int n14;
                        if (object == null) break block45;
                        object7 = object.getNavigationNode();
                        if (object7 != null) {
                            object7 = object.getNavigationNode();
                            ((NavigationNode)object7).getChildren();
                        }
                        if ((object7 = object.getData()) != null) {
                            this.e1 = object7 = object.getData().getChildDetails();
                        }
                        object7 = ld3_2.STORE_AJIO.getStoreId();
                        n8 = Intrinsics.areEqual(object2, object7);
                        object7 = "android.resource://";
                        n7 = 1;
                        n4 = 0;
                        object6 = "/cart";
                        string2 = null;
                        if (n8 == 0) break block46;
                        object2 = this.e1;
                        Object object10 = this.r0;
                        if (object10 == null) break block47;
                        object10.removeAllTabs();
                        int n15 = R$layout.tab_custom_new_nav;
                        if (object2 != null) {
                            n14 = object2.size();
                        } else {
                            n14 = 0;
                            Object var12_15 = null;
                        }
                        TabLayout$Tab tabLayout$Tab = null;
                        for (int i3 = 0; i3 < n14; ++i3) {
                            if (object2 != null && (object9 = (CMSNavigation)object2.get(i3)) != null) {
                                object9 = ((CMSNavigation)object9).getName();
                            }
                            object9 = object10.newTab().setCustomView(n15);
                            if (object2 != null) {
                                object8 = (CMSNavigation)object2.get(i3);
                            } else {
                                n10 = 0;
                                object8 = null;
                            }
                            object9 = ((TabLayout$Tab)object9).setTag(object8);
                            object10.addTab((TabLayout$Tab)object9);
                        }
                        ImageView imageView = null;
                        for (n15 = 0; n15 < n14; ++n15) {
                            int n16;
                            Object object11;
                            block48: {
                                boolean bl2;
                                block49: {
                                    tabLayout$Tab = object10.getTabAt(n15);
                                    if (tabLayout$Tab == null || object2 == null || (object9 = (CMSNavigation)object2.get(n15)) == null || (tabLayout$Tab = tabLayout$Tab.getCustomView()) == null) continue;
                                    object8 = ((CMSNavigation)object9).getInactiveAltText();
                                    if (object8 != null) {
                                        tabLayout$Tab.setContentDescription((CharSequence)object8);
                                    }
                                    if ((object8 = ((CMSNavigation)object9).getInactiveImageUrl()) == null) break block48;
                                    n10 = R$id.tab_icon;
                                    object8 = (ImageView)tabLayout$Tab.findViewById(n10);
                                    object11 = ((CMSNavigation)object9).getInactiveImageUrl();
                                    bl2 = URLUtil.isValidUrl((String)object11);
                                    if (bl2) break block49;
                                    object11 = ((CMSNavigation)object9).getInactiveImageUrl();
                                    Intrinsics.checkNotNull(object11);
                                    bl2 = StringsKt.F((CharSequence)object11, (CharSequence)object7, false);
                                    if (!bl2) break block48;
                                }
                                object11 = hv3_0.a;
                                String string3 = ((CMSNavigation)object9).getInactiveMediaType();
                                object11.getClass();
                                bl2 = hv3_0.Z(string3);
                                if (bl2) {
                                    object11 = new da$a();
                                    ((da$a)object11).x = n7;
                                    ((da$a)object11).y = string3 = ((CMSNavigation)object9).getInactiveImageUrl();
                                    string3 = ((CMSNavigation)object9).getInactiveImageUrl();
                                    ((da$a)object11).n = string3;
                                    ((da$a)object11).u = object8;
                                    ((da$a)object11).a();
                                } else {
                                    object11 = new da$a();
                                    ((da$a)object11).x = n7;
                                    ((da$a)object11).y = string3 = ((CMSNavigation)object9).getInactiveImageUrl();
                                    string3 = ((CMSNavigation)object9).getInactiveImageUrl();
                                    ((da$a)object11).n = string3;
                                    ((da$a)object11).u = object8;
                                    ((da$a)object11).a();
                                }
                            }
                            n10 = R$id.tab_title;
                            object8 = (TextView)tabLayout$Tab.findViewById(n10);
                            object11 = ((CMSNavigation)object9).getName();
                            object8.setText((CharSequence)object11);
                            object9 = ((CMSNavigation)object9).getUrl();
                            if (object9 == null || (n16 = StringsKt.F((CharSequence)object9, (CharSequence)object6, false)) != n7) continue;
                            n16 = R$id.tab_count_tv;
                            tabLayout$Tab = (TextView)tabLayout$Tab.findViewById(n16);
                            this.X0 = tabLayout$Tab;
                        }
                        object6 = object10.getTabAt(0);
                        if (object6 != null && (object6 = ((TabLayout$Tab)object6).getCustomView()) != null) {
                            int n17;
                            if (object2 != null && (object10 = (CMSNavigation)object2.get(0)) != null && (object10 = ((CMSNavigation)object10).getActiveImageUrl()) != null) {
                                n15 = R$id.tab_icon;
                                imageView = (ImageView)object6.findViewById(n15);
                                n14 = (int)(URLUtil.isValidUrl((String)object10) ? 1 : 0);
                                if (n14 != 0 || (n17 = (int)(StringsKt.F((CharSequence)object10, (CharSequence)object7, false) ? 1 : 0)) != 0) {
                                    object7 = hv3_0.a;
                                    if ((object2 = (CMSNavigation)object2.get(0)) != null) {
                                        string2 = ((CMSNavigation)object2).getActiveMediaType();
                                    }
                                    object7.getClass();
                                    n8 = (int)(hv3_0.Z(string2) ? 1 : 0);
                                    if (n8 != 0) {
                                        object2 = new da$a();
                                        ((da$a)object2).x = n7;
                                        ((da$a)object2).y = object10;
                                        ((da$a)object2).n = object10;
                                        ((da$a)object2).u = imageView;
                                        ((da$a)object2).a();
                                    } else {
                                        object2 = new da$a();
                                        ((da$a)object2).x = n7;
                                        ((da$a)object2).y = object10;
                                        ((da$a)object2).n = object10;
                                        ((da$a)object2).u = imageView;
                                        ((da$a)object2).a();
                                    }
                                }
                            }
                            n8 = R$id.tab_title;
                            object2 = (TextView)object6.findViewById(n8);
                            object7 = "#2C4152";
                            n17 = Color.parseColor((String)object7);
                            object2.setTextColor(n17);
                        }
                    }
                    if ((n8 = this.w1) != 0) {
                        this.j3();
                    }
                    object2 = this.Z0;
                    ((TabSelectedListener)object2).a = object;
                    object = this.r0;
                    if (object != null) {
                        ((TabLayout)((Object)object)).addOnTabSelectedListener((TabLayout$OnTabSelectedListener)object2);
                    }
                    break block45;
                }
                object2 = this.e1;
                if (object2 != null) {
                    n3 = object2.size();
                } else {
                    n3 = 0;
                    object5 = null;
                }
                int n18 = R$layout.tab_custom_new_nav;
                if (object2 == null || (tabLayout = this.s0) == null) break block50;
                tabLayout.removeAllTabs();
                TabLayout$Tab tabLayout$Tab = null;
                for (int i8 = 0; i8 < n3; ++i8) {
                    object4 = (CMSNavigation)object2.get(i8);
                    if (object4 != null) {
                        object4 = ((CMSNavigation)object4).getName();
                    }
                    object4 = tabLayout.newTab().setCustomView(n18);
                    object3 = object2.get(i8);
                    object4 = ((TabLayout$Tab)object4).setTag(object3);
                    tabLayout.addTab((TabLayout$Tab)object4);
                }
                ImageView imageView = null;
                for (n18 = 0; n18 < n3; ++n18) {
                    int n19;
                    Object object12;
                    int n20;
                    block51: {
                        boolean bl3;
                        block52: {
                            tabLayout$Tab = tabLayout.getTabAt(n18);
                            if (tabLayout$Tab == null || (object4 = (CMSNavigation)object2.get(n18)) == null || (tabLayout$Tab = tabLayout$Tab.getCustomView()) == null) continue;
                            object3 = ((CMSNavigation)object4).getInactiveAltText();
                            if (object3 != null) {
                                tabLayout$Tab.setContentDescription((CharSequence)object3);
                            }
                            if ((object3 = ((CMSNavigation)object4).getInactiveImageUrl()) == null) break block51;
                            n20 = R$id.tab_icon;
                            object3 = (ImageView)tabLayout$Tab.findViewById(n20);
                            object12 = ((CMSNavigation)object4).getInactiveImageUrl();
                            bl3 = URLUtil.isValidUrl((String)object12);
                            if (bl3) break block52;
                            object12 = ((CMSNavigation)object4).getInactiveImageUrl();
                            Intrinsics.checkNotNull(object12);
                            bl3 = StringsKt.F((CharSequence)object12, (CharSequence)object7, false);
                            if (!bl3) break block51;
                        }
                        object12 = hv3_0.a;
                        String string4 = ((CMSNavigation)object4).getInactiveMediaType();
                        object12.getClass();
                        bl3 = hv3_0.Z(string4);
                        if (bl3) {
                            object12 = new da$a();
                            ((da$a)object12).x = n7;
                            ((da$a)object12).y = string4 = ((CMSNavigation)object4).getInactiveImageUrl();
                            string4 = ((CMSNavigation)object4).getInactiveImageUrl();
                            ((da$a)object12).n = string4;
                            ((da$a)object12).u = object3;
                            ((da$a)object12).a();
                        } else {
                            object12 = new da$a();
                            ((da$a)object12).x = n7;
                            ((da$a)object12).y = string4 = ((CMSNavigation)object4).getInactiveImageUrl();
                            string4 = ((CMSNavigation)object4).getInactiveImageUrl();
                            ((da$a)object12).n = string4;
                            ((da$a)object12).u = object3;
                            ((da$a)object12).a();
                        }
                    }
                    n20 = R$id.tab_title;
                    object3 = (TextView)tabLayout$Tab.findViewById(n20);
                    object12 = ((CMSNavigation)object4).getName();
                    object3.setText((CharSequence)object12);
                    object4 = ((CMSNavigation)object4).getUrl();
                    if (object4 == null || (n19 = StringsKt.F((CharSequence)object4, (CharSequence)object6, false)) != n7) continue;
                    n19 = R$id.tab_count_tv;
                    tabLayout$Tab = (TextView)tabLayout$Tab.findViewById(n19);
                    this.X0 = tabLayout$Tab;
                }
                object6 = tabLayout.getTabAt(0);
                if (object6 != null && (object6 = ((TabLayout$Tab)object6).getCustomView()) != null) {
                    object5 = (CMSNavigation)object2.get(0);
                    if (object5 != null && (object5 = ((CMSNavigation)object5).getActiveImageUrl()) != null) {
                        boolean bl4;
                        n18 = R$id.tab_icon;
                        imageView = (ImageView)object6.findViewById(n18);
                        boolean bl5 = URLUtil.isValidUrl((String)object5);
                        if (bl5 || (bl4 = StringsKt.F((CharSequence)object5, (CharSequence)object7, false))) {
                            object7 = hv3_0.a;
                            if ((object2 = (CMSNavigation)object2.get(0)) != null) {
                                string2 = ((CMSNavigation)object2).getActiveMediaType();
                            }
                            object7.getClass();
                            n8 = (int)(hv3_0.Z(string2) ? 1 : 0);
                            if (n8 != 0) {
                                object2 = new da$a();
                                ((da$a)object2).x = n7;
                                ((da$a)object2).y = object5;
                                ((da$a)object2).n = object5;
                                ((da$a)object2).u = imageView;
                                ((da$a)object2).a();
                            } else {
                                object2 = new da$a();
                                ((da$a)object2).x = n7;
                                ((da$a)object2).y = object5;
                                ((da$a)object2).n = object5;
                                ((da$a)object2).u = imageView;
                                ((da$a)object2).a();
                            }
                        }
                    }
                    n8 = R$id.tab_title;
                    object2 = (TextView)object6.findViewById(n8);
                    object7 = FontsManager.getInstance();
                    AJIOApplication.Companion.getClass();
                    AJIOApplication aJIOApplication = AJIOApplication$a.a();
                    n4 = 9;
                    object7 = ((FontsManager)object7).getTypefaceWithFont((Context)aJIOApplication, n4);
                    if (object7 != null) {
                        object2.setTypeface((Typeface)object7);
                    }
                }
            }
            object2 = this.a1;
            ((TabSelectedListener)object2).a = object;
            object = this.s0;
            if (object != null) {
                ((TabLayout)((Object)object)).addOnTabSelectedListener((TabLayout$OnTabSelectedListener)object2);
            }
            if ((object = this.s0) != null) {
                object.bringToFront();
            }
        }
    }

    public final void l3() {
        Object object;
        boolean bl2 = og1_1.c();
        if (bl2 && (object = this.P2().o) != null) {
            object = this.P2().o;
            String string2 = ld3_2.STORE_LUXE.getStoreId();
            this.k3((BottomNavigationData)object, string2);
        } else {
            String string3;
            object = od3_2.a;
            int n3 = object.length();
            if (n3 == 0) {
                object = od3_2.a();
            }
            if ((bl2 = Intrinsics.areEqual(object, string3 = ld3_2.STORE_AJIO.getStoreId())) && (object = this.P2().n) != null) {
                object = this.P2().n;
                string3 = ld3_2.STORE_AJIO.getStoreId();
                this.k3((BottomNavigationData)object, string3);
            }
        }
    }

    public final void launchFeature(String string2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(string2, "name");
        super.launchFeature(string2, bundle);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void n(String string2, LinkDetail linkDetail, String string3) {
        int n3;
        Object object;
        boolean bl2;
        boolean bl3;
        AjioHomeActivity ajioHomeActivity = this;
        String string4 = string2;
        Object object2 = this.C1;
        boolean bl4 = false;
        Object object3 = new V7(this, 0);
        long l2 = 250L;
        object2.postDelayed((Runnable)object3, l2);
        if (string2 != null && ((bl3 = string2.equalsIgnoreCase((String)(object2 = "newin"))) || (bl3 = string2.equalsIgnoreCase((String)(object2 = "capsulenewinpage"))))) {
            if (linkDetail == null) return;
            linkDetail.getUrl();
            return;
        }
        if (string4 != null && (bl3 = string4.equalsIgnoreCase((String)(object2 = "capsulelandingpage")))) {
            if (linkDetail == null) return;
            linkDetail.getUrl();
            return;
        }
        object2 = "landingpage";
        bl3 = ((String)object2).equalsIgnoreCase(string4);
        object3 = null;
        bl4 = true;
        Object object4 = null;
        if (bl3) {
            String string5;
            Object object5;
            void var5_8;
            boolean bl5;
            if (linkDetail != null) {
                String string6 = linkDetail.getUrl();
            } else {
                bl5 = false;
                Object var5_7 = null;
            }
            bl5 = ajioHomeActivity.V2((String)var5_8, false);
            if (!bl5) return;
            if (linkDetail != null) {
                String string7 = linkDetail.getUrl();
                object5 = string7;
            } else {
                object5 = null;
            }
            if (object5 != null && (bl5 = StringsKt.F((CharSequence)object5, string5 = "luxe", false)) && !(bl5 = og1_1.c())) {
                og1_1.g(bl4, false);
            }
            q9_0.Companion.getClass();
            object3 = q9$a.b(null, (String)object5);
            object2 = ajioHomeActivity.T0;
            Boolean bl6 = Boolean.FALSE;
            bl4 = true;
            AjioHomeActivity ajioHomeActivity2 = this;
            object4 = object5;
            object5 = bl6;
            this.Q1((Fragment)object2, (Fragment)object3, bl4, (String)object4, bl6);
            return;
        }
        object2 = ajioHomeActivity.M0;
        Object object6 = "";
        if (string4 != null && ((bl2 = string4.equalsIgnoreCase((String)(object = "productListPage"))) || (bl2 = string4.equalsIgnoreCase((String)(object = "productGridPage"))))) {
            Fragment fragment = ajioHomeActivity.T0;
            object4 = ((s71)object2).b;
            ((jo_2)object4).u();
            ((jo_2)object4).v();
            ((jo_2)object4).w();
            if (linkDetail == null || (object4 = linkDetail.getStoreType()) == null) {
                object4 = ld3_2.STORE_AJIO.getStoreId();
            }
            Object object7 = object4;
            Object object8 = linkDetail != null ? (object4 = linkDetail.getUrl()) : null;
            Object object9 = linkDetail != null ? (object4 = linkDetail.getQuery()) : null;
            object = object4;
            int n4 = 1;
            String string8 = "nav";
            int n7 = -24601;
            object4 = new PLPExtras(null, null, null, string8, string3, null, null, null, null, null, null, null, null, (String)object8, (String)object9, null, null, null, null, null, null, null, null, false, false, false, null, null, null, (String)object7, n7, n4);
            object2 = ((s71)object2).a;
            ((AjioHomeActivity)object2).Q2().a.k(object4);
            object = ((PLPExtras)object4).e;
            if (object != null) {
                object6 = object;
            }
            object4 = ((PLPExtras)object4).H;
            object4 = at2_1.b((String)object6, (String)object4);
            if (linkDetail != null) {
                object3 = linkDetail.getUrl();
            }
            j3$a.a((j3_0)object2, fragment, (Fragment)object4, bl4, (String)object3);
            return;
        }
        if (string4 != null && (n3 = string4.equalsIgnoreCase((String)(object = "storelandingpage"))) != 0) {
            void var5_16;
            if (linkDetail != null) {
                String string9 = linkDetail.getUrl();
            } else {
                n3 = 0;
                Object var5_15 = null;
            }
            bl2 = TextUtils.isEmpty((CharSequence)var5_16);
            if (!bl2 && (bl2 = ajioHomeActivity.X2((String)var5_16))) {
                object4 = ajioHomeActivity.T0;
                if (object4 == null) return;
                if (var5_16 != null) {
                    object6 = var5_16;
                }
                object2.getClass();
                Intrinsics.checkNotNullParameter(object6, "storePageId");
                Intrinsics.checkNotNullParameter(object4, "parentFragment");
                ed3_2.Companion.getClass();
                ed3_2 ed3_22 = ed3$a.a(null, (String)object6);
                object2 = ((s71)object2).a;
                j3$a.a((j3_0)object2, (Fragment)object4, ed3_22, bl4, (String)object6);
                return;
            }
            TabLayout tabLayout = this.W0();
            if (tabLayout != null && (n3 = tabLayout.getSelectedTabPosition()) == 0) {
                return;
            }
            ajioHomeActivity.U1(0);
            return;
        }
        if (linkDetail == null) return;
        String string10 = linkDetail.getUrl();
        if (string10 == null) return;
        kj0_1 kj0_12 = kj0_1.g();
        object2 = ajioHomeActivity.J0;
        object3 = linkDetail.getUrl();
        kj0_12.w((Activity)object2, (String)object3);
    }

    public final void n0(ri2_0 ri2_02) {
        Intrinsics.checkNotNullParameter(ri2_02, "pdpExtras");
        this.Q2().b.k(ri2_02);
        NewProductDetailsFragment.Companion.getClass();
        NewProductDetailsFragment newProductDetailsFragment = new NewProductDetailsFragment();
        Fragment fragment = this.T0;
        Boolean bl2 = Boolean.FALSE;
        this.Q1(fragment, newProductDetailsFragment, true, "NewProductDetailsFragment", bl2);
    }

    public final void n3() {
        Object object = this.getSupportFragmentManager();
        int n3 = R$id.content;
        if ((n3 = (object = ((FragmentManager)object).D(n3)) instanceof tm2_2) != 0) {
            object = ((tm2_2)object).getChildFragmentManager();
            n3 = R$id.home_content;
            if ((n3 = (object = ((FragmentManager)object).D(n3)) instanceof B23) != 0) {
                object = (B23)object;
                Object object2 = ((B23)object).Ra().fswmdLayoutCabOptions;
                String string2 = "fswmdLayoutCabOptions";
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                ai0_2.i((View)object2);
                object = ((B23)object).f;
                if (object != null) {
                    n3 = 0;
                    ((m23_0)object).d = false;
                    object2 = ((m23_0)object).e;
                    object2.clear();
                    ((RecyclerView$f)object).notifyDataSetChanged();
                }
            }
        }
    }

    public final void o() {
        this.Y2("backPage");
    }

    public final void o3(int n3) {
        boolean bl2 = this.B0;
        if (bl2 && (bl2 = this.C0)) {
            bl2 = false;
            this.B0 = false;
            this.C0 = false;
            this.f3(n3);
        }
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(actionMode, "mode");
        Intrinsics.checkNotNullParameter(menuItem, "item");
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onActivityResult(int var1_1, int var2_2, Intent var3_3) {
        var4_4 = this;
        var5_5 = var1_1;
        var6_6 = var2_2;
        var7_7 = var3_3;
        var8_8 = this.getSupportFragmentManager();
        var9_9 = "getSupportFragmentManager(...)";
        Intrinsics.checkNotNullExpressionValue(var8_8, (String)var9_9);
        var10_10 = R$id.content;
        var8_8 = var8_8.D(var10_10);
        var10_10 = 51;
        var11_11 = 1;
        if (var1_1 == var10_10 && var2_2 == 0) {
            qo_0.c = var11_11;
            var12_12 = this.l1;
            var13_13 = var12_12.getEC_APP_UPDATE_INTERACTION();
            var9_9 = AnalyticsManager.Companion;
            var14_14 = av_0.a((AnalyticsManager$Companion)var9_9);
            var15_15 = av_0.a((AnalyticsManager$Companion)var9_9);
            var16_16 = "No Thanks";
            var17_17 = "";
            var18_18 = "event_app_update_interaction";
            var9_9 = this.m1;
            var19_19 /* !! */  = this.n1;
            var20_20 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(var12_12, var13_13, var16_16, var17_17, var18_18, var14_14, var15_15, (String)var9_9, null, (String)var19_19 /* !! */ , false, null, var20_20, null);
        }
        var10_10 = var8_8 instanceof tm2_2;
        var12_12 = null;
        if (!var10_10) ** GOTO lbl-1000
        var8_8 = ((tm2_2)var8_8).getChildFragmentManager();
        var10_10 = R$id.home_content;
        if (var10_10 = (var8_8 = var8_8.D(var10_10)) instanceof yv0_1) {
            var8_8 = (yv0_1)var8_8;
            var21_21 = (int)var8_8.d1(var5_5, var6_6);
        } else lbl-1000:
        // 2 sources

        {
            var21_21 = 0;
            var8_8 = null;
        }
        if (var21_21 != 0) {
            return;
        }
        var21_21 = 667;
        if (var6_6 == var21_21) {
            var4_4.U1(0);
            return;
        }
        var21_21 = 1230;
        var22_22 = -1;
        if (var6_6 == var21_21) {
            var4_4.U1(0);
        } else {
            var21_21 = 1231;
            if (var6_6 == var21_21) {
                var21_21 = 2;
                var4_4.U1(var21_21);
            } else {
                var21_21 = 52;
                if (var5_5 == var21_21 && var6_6 == var22_22) {
                    var4_4.b3(var7_7);
                    var4_4.T2(var7_7);
                    var8_8 = this.P2();
                    var21_21 = (int)var8_8.b();
                    if (var21_21 != 0) {
                        var9_9 = var4_4.T0;
                        var8_8 = gg2_1.Companion;
                        var23_23 = this.P2().r;
                        var24_25 = this.P2();
                        var25_26 = var24_25.s;
                        var8_8.getClass();
                        var19_19 /* !! */  = GG2$a.a(var23_23, var25_26);
                        var26_27 = Boolean.FALSE;
                        var27_29 = 1;
                        var25_26 = 1.4E-45f;
                        var28_30 = "ReferralFragment";
                        var8_8 = this;
                        this.Q1((Fragment)var9_9, (Fragment)var19_19 /* !! */ , (boolean)var27_29, (String)var28_30, var26_27);
                    }
                } else {
                    var21_21 = 55;
                    if (var5_5 == var21_21 && var6_6 == var22_22) {
                        var4_4.b3(var7_7);
                        var4_4.T2(var7_7);
                        oy1_1.Companion.getClass();
                        var19_19 /* !! */  = new oy1_1();
                        var8_8 = new Bundle();
                        var8_8.putBoolean("FROM_CART", (boolean)var11_11);
                        var19_19 /* !! */ .setArguments((Bundle)var8_8);
                        var9_9 = var4_4.T0;
                        var26_28 = Boolean.FALSE;
                        var27_29 = 1;
                        var25_26 = 1.4E-45f;
                        var28_30 = "";
                        var8_8 = this;
                        this.Q1((Fragment)var9_9, (Fragment)var19_19 /* !! */ , (boolean)var27_29, (String)var28_30, var26_28);
                        var8_8 = AnalyticsManager.Companion;
                        var9_9 = var8_8.getInstance().getGtmEvents();
                        var19_19 /* !! */  = "Header Click";
                        var24_25 = "Closet Button";
                        ak0_0.a((AnalyticsManager$Companion)var8_8, (GTMEvents)var9_9, (String)var19_19 /* !! */ , (String)var24_25);
                    } else {
                        var21_21 = 54;
                        if (var5_5 == var21_21 && var6_6 == var22_22) {
                            var4_4.b3(var7_7);
                            var4_4.T2(var7_7);
                            var8_8 = this.P2().t;
                            if (var8_8 != null) {
                                var4_4.a3((Bundle)var8_8);
                            }
                        } else {
                            var21_21 = 7;
                            var10_10 = 0;
                            var9_9 = null;
                            var29_31 = 6;
                            var23_24 = 8.4E-45f;
                            if ((var5_5 == var21_21 || var5_5 == var29_31) && var6_6 == var22_22) {
                                var21_21 = var4_4.c1;
                                var29_31 = (int)var4_4.B0;
                                if (var29_31 != 0 && (var29_31 = (int)var4_4.C0) != 0) {
                                    var4_4.B0 = false;
                                    var4_4.C0 = var11_11;
                                    var19_19 /* !! */  = this.W0();
                                    if (var19_19 /* !! */  != null) {
                                        var19_19 /* !! */  = var19_19 /* !! */ .getTabAt(var21_21);
                                    } else {
                                        var29_31 = 0;
                                        var19_19 /* !! */  = null;
                                        var23_24 = 0.0f;
                                    }
                                    if (var19_19 /* !! */  != null && (var29_31 = (int)var19_19 /* !! */ .isSelected()) != 0) {
                                        var29_31 = (int)og1_1.c();
                                        if (var29_31 != 0) {
                                            var19_19 /* !! */  = var4_4.r0;
                                            if (var19_19 /* !! */  != null) {
                                                var9_9 = var19_19 /* !! */ .getTabAt(var21_21);
                                            }
                                            var8_8 = var4_4.a1;
                                            var8_8.onTabSelected((TabLayout$Tab)var9_9);
                                        } else {
                                            var19_19 /* !! */  = var4_4.r0;
                                            if (var19_19 /* !! */  != null) {
                                                var9_9 = var19_19 /* !! */ .getTabAt(var21_21);
                                            }
                                            var8_8 = var4_4.Z0;
                                            var8_8.onTabSelected((TabLayout$Tab)var9_9);
                                        }
                                    } else {
                                        var4_4.f3(var21_21);
                                    }
                                }
                                var4_4.b3(var7_7);
                                var4_4.T2(var7_7);
                                if (var7_7 != null && (var10_10 = (int)var7_7.hasExtra((String)(var8_8 = "GAME_URL"))) == var11_11 && !(var10_10 = (int)TextUtils.isEmpty((CharSequence)(var9_9 = var7_7.getStringExtra((String)var8_8))))) {
                                    var9_9 = z40_0.Companion;
                                    var9_9 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var9_9).a;
                                    var10_10 = (int)var9_9.a("enable_gamification");
                                    var8_8 = String.valueOf(var7_7.getStringExtra((String)var8_8));
                                    var19_19 /* !! */  = new iy0_2(var4_4);
                                    var19_19 /* !! */ .b((String)var8_8, (boolean)var10_10);
                                }
                                this.c3();
                            } else if (var5_5 == var29_31) {
                                var8_8 = this.getSupportFragmentManager();
                                var10_10 = R$id.content;
                                if (var10_10 = (var8_8 = var8_8.D(var10_10)) instanceof tm2_2) {
                                    var8_8 = ((tm2_2)var8_8).getChildFragmentManager();
                                    var10_10 = R$id.home_content;
                                    if ((var10_10 = (var8_8 = var8_8.D(var10_10)) instanceof q9_0) && (var10_10 = (int)(var8_8 = (q9_0)var8_8).isVisible())) {
                                        var8_8.nb();
                                    }
                                }
                                var21_21 = var4_4.u0;
                                var4_4.o3(var21_21);
                                this.c3();
                            } else {
                                var21_21 = 5;
                                if (var6_6 == var21_21) {
                                    var8_8 = this.getSupportFragmentManager();
                                    var10_10 = R$id.content;
                                    if (var10_10 = (var8_8 = var8_8.D(var10_10)) instanceof tm2_2) {
                                        var8_8 = ((tm2_2)var8_8).getChildFragmentManager();
                                        var10_10 = R$id.home_content;
                                        if (var10_10 = (var8_8 = var8_8.D(var10_10)) instanceof bz1_2) {
                                            var8_8 = (bz1_2)var8_8;
                                            var8_8.Xa();
                                        }
                                    }
                                } else if (var6_6 == var22_22) {
                                    var21_21 = 4;
                                    if (var5_5 != var21_21) {
                                        switch (var5_5) {
                                            default: {
                                                break;
                                            }
                                            case 13: {
                                                if (var7_7 != null && (var10_10 = (int)var7_7.hasExtra((String)(var8_8 = "resetpasswordmessage")))) {
                                                    if ((var8_8 = var7_7.getStringExtra((String)var8_8)) == null) {
                                                        var8_8 = "";
                                                    }
                                                    var9_9 = "source - reset password";
                                                    at2_1.g(var29_31, var4_4, (String)var8_8, (String)var9_9);
                                                }
                                                var8_8 = this.P2().c;
                                                var8_8.deleteUserInformation();
                                                this.d3();
                                                break;
                                            }
                                            case 10: 
                                            case 11: 
                                            case 12: {
                                                var4_4.i1(var7_7);
                                                break;
                                            }
                                        }
                                    } else {
                                        var4_4.S2(var7_7);
                                    }
                                } else {
                                    var21_21 = 43;
                                    var29_31 = 44;
                                    var23_24 = 6.2E-44f;
                                    var24_25 = "PLP_URL";
                                    if (var5_5 != var21_21 && var5_5 != (var21_21 = 45)) {
                                        var21_21 = 48;
                                        if (var5_5 == var21_21) {
                                            if (var6_6 == var29_31 && var7_7 != null && (var21_21 = (int)TextUtils.isEmpty((CharSequence)(var8_8 = var7_7.getStringExtra((String)var24_25)))) == 0) {
                                                var8_8 = kj0_1.g();
                                                var9_9 = var7_7.getStringExtra((String)var24_25);
                                                var8_8.w(var4_4, (String)var9_9);
                                            }
                                        } else {
                                            var8_8 = AM0.a();
                                            var8_8.a = null;
                                        }
                                    } else if (var6_6 == var29_31 && var7_7 != null && (var21_21 = (int)TextUtils.isEmpty((CharSequence)(var8_8 = var7_7.getStringExtra((String)var24_25)))) == 0) {
                                        var8_8 = kj0_1.g();
                                        var9_9 = var7_7.getStringExtra((String)var24_25);
                                        var8_8.w(var4_4, (String)var9_9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        var21_21 = 50;
        if (var5_5 == var21_21) {
            if (var6_6 == var22_22 && var7_7 != null && (var10_10 = (int)var7_7.hasExtra((String)(var8_8 = "PLP_LINK"))) && !(var10_10 = (int)TextUtils.isEmpty((CharSequence)(var9_9 = var7_7.getStringExtra((String)var8_8))))) {
                var9_9 = kj0_1.g();
                var8_8 = var7_7.getStringExtra((String)var8_8);
                var9_9.w(var4_4, (String)var8_8);
            } else {
                var8_8 = this.getSupportFragmentManager();
                var10_10 = R$id.content;
                if (var10_10 = (var8_8 = var8_8.D(var10_10)) instanceof tm2_2) {
                    var8_8 = ((tm2_2)var8_8).getChildFragmentManager();
                    var10_10 = R$id.home_content;
                    if ((var10_10 = (var8_8 = var8_8.D(var10_10)) instanceof q9_0) && (var10_10 = (int)(var8_8 = (q9_0)var8_8).isVisible())) {
                        var8_8.nb();
                    }
                }
            }
        } else {
            var21_21 = 60;
            if (var5_5 == var21_21 && var7_7 != null) {
                var8_8 = var7_7.getStringExtra("onboarding_link_url");
                var9_9 = kj0_1.g();
                var9_9.w(var4_4, (String)var8_8);
            } else {
                var21_21 = 70;
                if (var5_5 == var21_21) {
                    var8_8 = this.getSupportFragmentManager();
                    var10_10 = R$id.content;
                    if (var10_10 = (var8_8 = var8_8.D(var10_10)) instanceof tm2_2) {
                        var8_8 = ((tm2_2)var8_8).getChildFragmentManager();
                        var10_10 = R$id.home_content;
                        if (var10_10 = (var8_8 = var8_8.D(var10_10)) instanceof bz1_2) {
                            var8_8 = (bz1_2)var8_8;
                            var8_8.b1 = var11_11;
                            var9_9 = var8_8.p;
                            Intrinsics.checkNotNull(var9_9);
                            var9_9.startLoader();
                            var8_8 = var8_8.r0;
                            if (var8_8 != null) {
                                var9_9 = var8_8.g.validateSession();
                                var27_29 = 3;
                                var25_26 = 4.2E-45f;
                                var19_19 /* !! */  = new c6_0(var8_8, var27_29);
                                var24_25 = new cy1_2(var11_11, (Function1)var19_19 /* !! */ );
                                var19_19 /* !! */  = new jy1_0((Hj)var8_8, var11_11);
                                var28_30 = new gy3_0((jy1_0)var19_19 /* !! */ );
                                var9_9 = var9_9.f((o60_0)var24_25, (o60_0)var28_30);
                                var8_8 = var8_8.x;
                                var8_8.b((yr0_2)var9_9);
                            }
                            var8_8 = Unit.a;
                        }
                    }
                }
            }
        }
        if (var6_6 == var22_22 && var5_5 == (var21_21 = 14)) {
            var8_8 = yn3_0.a;
            var9_9 = "onActivityResult : LAUNCH_PAYMENT_SCREEN";
            var19_19 /* !! */  = new Object[]{};
            var8_8.a((String)var9_9, var19_19 /* !! */ );
        }
        if (var5_5 == (var21_21 = 80) && var6_6 == var22_22) {
            var8_8 = this.getSupportFragmentManager();
            var10_10 = R$id.content;
            if (var10_10 = (var8_8 = var8_8.D(var10_10)) instanceof tm2_2) {
                var8_8 = ((tm2_2)var8_8).getChildFragmentManager();
                var10_10 = R$id.home_content;
                if (var10_10 = (var8_8 = var8_8.D(var10_10)) instanceof bz1_2) {
                    ((bz1_2)var8_8).Va();
                    var8_8 = AjioHomeActivity.Companion;
                    var8_8.getClass();
                    AjioHomeActivity$a.a((Context)this);
                }
            }
        }
        super.onActivityResult(var1_1, var2_2, var3_3);
    }

    public final void onAttachFragment(Fragment object) {
        String string2 = "fragment";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = object instanceof NewProductDetailsFragment;
        if (bl2) {
            object = this.r0;
            int n3 = 8;
            if (object != null) {
                object.setVisibility(n3);
            }
            if ((object = this.s0) != null) {
                object.setVisibility(n3);
            }
            if ((object = this.t0) != null) {
                object.setVisibility(n3);
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onBackPressed() {
        block42: {
            block47: {
                block41: {
                    block43: {
                        block46: {
                            block44: {
                                block45: {
                                    var1_1 /* !! */  = h40_0.a;
                                    var2_3 = h40_0.c();
                                    var3_4 = null;
                                    if (var2_3 != 0 && (var2_3 = Intrinsics.areEqual(var1_1 /* !! */  = od3_2.a(), var4_5 = ld3_2.STORE_AJIOGRAM.getStoreId())) != 0 && (var1_1 /* !! */  = this.T0) != null && (var1_1 /* !! */  = var1_1 /* !! */ .getChildFragmentManager()) != null && (var1_1 /* !! */  = var1_1 /* !! */ .c.f()) != null) {
                                        var1_1 /* !! */  = (Iterable)var1_1 /* !! */ ;
                                        var4_5 = new ArrayList();
                                        var5_6 = var1_1 /* !! */ .iterator();
                                        while ((var6_7 = (int)var5_6.hasNext()) != 0) {
                                            var7_8 = var5_6.next();
                                            var8_9 = var7_8 instanceof q9_0;
                                            if (var8_9 == 0) continue;
                                            var4_5.add(var7_8);
                                        }
                                        if ((var4_5 = (q9_0)CollectionsKt.firstOrNull((List)var4_5)) != null && (var9_10 = var4_5.ib())) {
                                            return;
                                        }
                                        var4_5 = new ArrayList();
                                        var1_1 /* !! */  = var1_1 /* !! */ .iterator();
                                        while ((var10_11 = var1_1 /* !! */ .hasNext()) != 0) {
                                            var5_6 = var1_1 /* !! */ .next();
                                            var6_7 = var5_6 instanceof fq0_2;
                                            if (var6_7 == 0) continue;
                                            var4_5.add(var5_6);
                                        }
                                        var1_1 /* !! */  = (fq0_2)CollectionsKt.firstOrNull((List)var4_5);
                                        if (var1_1 /* !! */  != null) {
                                            var1_1 /* !! */  = var1_1 /* !! */ .q;
                                            if (var1_1 /* !! */  == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("fleekViewModel");
                                                var2_3 = 0;
                                                var1_1 /* !! */  = null;
                                            }
                                            if ((var2_3 = (int)var1_1 /* !! */ .o()) != 0) {
                                                this.finish();
                                            }
                                        }
                                    }
                                    var1_1 /* !! */  = this.p1;
                                    var9_10 = false;
                                    var4_5 = null;
                                    var10_11 = 1;
                                    if (var1_1 /* !! */  != null && (var2_3 = var1_1 /* !! */ .getBoolean((String)(var7_8 = "isFilterSelected"), false)) == var10_11) {
                                        var1_1 /* !! */  = h40_0.a;
                                        var1_1 /* !! */  = z40_0.Companion;
                                        var1_1 /* !! */  = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var1_1 /* !! */ ).a;
                                        var7_8 = "showAlertForDiscardFilter";
                                        var2_3 = (int)var1_1 /* !! */ .a((String)var7_8);
                                        if (var2_3 != 0 && (var2_3 = (int)og1_1.c()) == 0) {
                                            var1_1 /* !! */  = s12.Companion;
                                            var1_1 /* !! */ .getClass();
                                            s12$a.b(this);
                                            return;
                                        }
                                    }
                                    da_2.Companion.getClass();
                                    da$b.a().getClass();
                                    da_2.b();
                                    var1_1 /* !! */  = this.Y;
                                    if (var1_1 /* !! */  != null && (var2_3 = (int)var1_1 /* !! */ .isDrawerOpen(var6_7 = 0x800003)) == var10_11) {
                                        var1_1 /* !! */  = this.K0;
                                        if (var1_1 /* !! */  != null && (var2_3 = (int)var1_1 /* !! */ .Ta()) == var10_11) {
                                            return;
                                        }
                                        var1_1 /* !! */  = this.Y;
                                        if (var1_1 /* !! */  == null) return;
                                        var1_1 /* !! */ .closeDrawer(var6_7);
                                        return;
                                    }
                                    var2_3 = this.N2();
                                    if (var2_3 != var10_11) break block43;
                                    var1_1 /* !! */  = h40_0.a;
                                    var2_3 = (int)h40_0.c();
                                    if (var2_3 == 0 || (var2_3 = (int)Intrinsics.areEqual(var1_1 /* !! */  = od3_2.a(), var4_5 = ld3_2.STORE_AJIOGRAM.getStoreId())) == 0) break block44;
                                    var1_1 /* !! */  = this.T0;
                                    if (var1_1 /* !! */  != null && (var1_1 /* !! */  = var1_1 /* !! */ .getChildFragmentManager()) != null) {
                                        var4_5 = "z6";
                                        var1_1 /* !! */  = var1_1 /* !! */ .E((String)var4_5);
                                    } else {
                                        var2_3 = 0;
                                        var1_1 /* !! */  = null;
                                    }
                                    var9_10 = var1_1 /* !! */  instanceof z6_0;
                                    if (var9_10) {
                                        var1_1 /* !! */  = (z6_0)var1_1 /* !! */ ;
                                    } else {
                                        var2_3 = 0;
                                        var1_1 /* !! */  = null;
                                    }
                                    var4_5 = this.T0;
                                    if (var4_5 != null && (var4_5 = var4_5.getChildFragmentManager()) != null) {
                                        var5_6 = "BZ1";
                                        var4_5 = var4_5.E((String)var5_6);
                                    } else {
                                        var9_10 = false;
                                        var4_5 = null;
                                    }
                                    var10_11 = var4_5 instanceof bz1_2;
                                    if (var10_11 != 0) {
                                        var4_5 = (bz1_2)var4_5;
                                    } else {
                                        var9_10 = false;
                                        var4_5 = null;
                                    }
                                    if (var1_1 /* !! */  == null) break block45;
                                    var4_5 = var1_1 /* !! */ .w;
                                    var5_6 = "navController";
                                    if (var4_5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)var5_6);
                                        var9_10 = false;
                                        var4_5 = null;
                                    }
                                    if ((var4_5 = ((e)var4_5).h()) != null) {
                                        var4_5 = var4_5.h;
                                    } else {
                                        var9_10 = false;
                                        var4_5 = null;
                                    }
                                    var7_8 = "ajio_category_screen_l2";
                                    var9_10 = Intrinsics.areEqual(var4_5, var7_8);
                                    if (var9_10) {
                                        var1_1 /* !! */  = var1_1 /* !! */ .w;
                                        if (var1_1 /* !! */  == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)var5_6);
                                        } else {
                                            var3_4 = var1_1 /* !! */ ;
                                        }
                                        ((e)var3_4).q();
                                        break block46;
                                    } else {
                                        var1_1 /* !! */  = var1_1 /* !! */ .x;
                                        if (var1_1 /* !! */  != null) {
                                            var1_1 /* !! */ .a();
                                        }
                                    }
                                    break block46;
                                }
                                if (var4_5 != null) {
                                    var1_1 /* !! */  = ((bz1_2)var4_5).c1;
                                    if (var1_1 /* !! */  != null) {
                                        var1_1 /* !! */ .a();
                                    }
                                    break block46;
                                } else {
                                    this.finish();
                                }
                                break block46;
                            }
                            this.finish();
                        }
                        var1_1 /* !! */  = ActivityTransitionManager.getInstance();
                        var1_1 /* !! */ .slideInOutRight(this);
                        return;
                    }
                    try {
                        var1_1 /* !! */  = this.T0;
                        if (var1_1 /* !! */  == null) break block41;
                        var7_8 = var1_1 /* !! */ .getChildFragmentManager();
                        var8_9 = R$id.home_content;
                    }
                    catch (Exception var1_2) {
                        break block42;
                    }
                    if ((var8_9 = (var7_8 = var7_8.D(var8_9)) instanceof ik3_2) != 0) {
                        var11_12 = var7_8;
                        var11_12 = (ik3_2)var7_8;
                        var8_9 = (int)var11_12.l();
                    } else {
                        var8_9 = 0;
                        var11_13 = null;
                    }
                    if (var8_9 == 0 && (var13_16 = (var12_15 = var1_1 /* !! */ .getChildFragmentManager()).J()) > var10_11 && var7_8 != null && (var6_7 = (int)((Fragment)var7_8).isStateSaved()) == 0) {
                        var1_1 /* !! */  = var1_1 /* !! */ .getChildFragmentManager();
                        var1_1 /* !! */ .W();
                        var8_9 = 1;
                    }
                    break block47;
                }
                var8_9 = 0;
                var11_14 = null;
            }
            if (var8_9 != 0) ** GOTO lbl191
            super.onBackPressed();
            this.b1 = false;
            var2_3 = this.N2();
            if (var2_3 == var10_11) {
                this.i3((boolean)var10_11);
            }
            this.u0 = 0;
            var1_1 /* !! */  = this.getSupportFragmentManager();
            var6_7 = R$id.content;
            this.T0 = var1_1 /* !! */  = var1_1 /* !! */ .D(var6_7);
            if (var1_1 /* !! */  == null) ** GOTO lbl191
            var7_8 = var1_1 /* !! */ .getChildFragmentManager();
            var6_7 = var7_8.J();
            if (var6_7 <= 0) ** GOTO lbl189
            var7_8 = var1_1 /* !! */ .getChildFragmentManager();
            var4_5 = var7_8.I(0);
            var4_5 = var4_5.getName();
            var7_8 = var1_1 /* !! */ .getChildFragmentManager();
            var4_5 = var7_8.E((String)var4_5);
            var7_8 = this.P2();
            var6_7 = (int)var7_8.b();
            if (var6_7 != 0 || !(var9_10 = var4_5 instanceof oy1_1)) ** GOTO lbl189
            {
                super.onBackPressed();
                var4_5 = this.getSupportFragmentManager();
                var6_7 = R$id.content;
                this.T0 = var4_5 = var4_5.D(var6_7);
lbl189:
                // 3 sources

                var1_1 /* !! */  = var1_1 /* !! */ .getTag();
                this.e3((String)var1_1 /* !! */ );
lbl191:
                // 3 sources

                if ((var2_3 = this.N2()) != var10_11) return;
                var1_1 /* !! */  = od3_2.a();
                var4_5 = ld3_2.STORE_AJIOGRAM;
                var2_3 = (int)Intrinsics.areEqual(var1_1 /* !! */ , var4_5 = var4_5.getStoreId());
                if (var2_3 != 0) {
                    var1_1 /* !! */  = this.T0;
                    if (var1_1 /* !! */  != null && (var1_1 /* !! */  = var1_1 /* !! */ .getChildFragmentManager()) != null) {
                        var3_4 = "HOME";
                        var3_4 = var1_1 /* !! */ .E((String)var3_4);
                    }
                    if (var3_4 != null) {
                        this.finish();
                    }
                }
                this.i3((boolean)var10_11);
                return;
            }
        }
        var3_4 = yn3_0.a;
        var4_5 = "handleBackButtonPress";
        var3_4.l((String)var4_5);
        var3_4.e(var1_2);
        at2_1.e((Context)this);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onCreate(Bundle var1_1) {
        block64: {
            block65: {
                block67: {
                    block71: {
                        block70: {
                            block69: {
                                block68: {
                                    block66: {
                                        var2_2 = this;
                                        var3_3 = 1;
                                        var4_4 = fq2_1.b;
                                        if (var4_4 == null) {
                                            var4_4 = FirebasePerformance.getInstance();
                                            var5_5 = "activity_load_home_v1";
                                            var4_4 = var4_4.newTrace((String)var5_5);
                                            fq2_1.b = var4_4;
                                        }
                                        if ((var4_4 = fq2_1.b) != null) {
                                            var4_4.start();
                                        }
                                        super.onCreate(var1_1);
                                        var4_4 = "owner";
                                        Intrinsics.checkNotNullParameter(var2_2, (String)var4_4);
                                        var5_5 = this.getViewModelStore();
                                        Intrinsics.checkNotNullParameter(var2_2, (String)var4_4);
                                        var6_6 = this.getDefaultViewModelProviderFactory();
                                        Intrinsics.checkNotNullParameter(var2_2, (String)var4_4);
                                        var7_7 /* !! */  = this.getDefaultViewModelCreationExtras();
                                        var8_8 = "store";
                                        Intrinsics.checkNotNullParameter(var5_5, (String)var8_8);
                                        var9_9 = "factory";
                                        Intrinsics.checkNotNullParameter(var6_6, (String)var9_9);
                                        var10_10 = "defaultCreationExtras";
                                        Intrinsics.checkNotNullParameter(var7_7 /* !! */ , var10_10);
                                        var11_11 = os1_2.class;
                                        var12_12 = "modelClass";
                                        var5_5 = rl3_0.b((rd3_0)var5_5, (E$b)var6_6, (Wd0)var7_7 /* !! */ , var11_11, (String)var12_12);
                                        var6_6 = "<this>";
                                        var7_7 /* !! */  = sw0_0.a(var11_11, (String)var6_6, var11_11, (String)var12_12, (String)var12_12);
                                        Intrinsics.checkNotNullParameter(var7_7 /* !! */ , (String)var6_6);
                                        var11_11 = var7_7 /* !! */ .getQualifiedName();
                                        var13_13 = "Local and anonymous classes can not be ViewModels";
                                        if (var11_11 == null) break block64;
                                        var14_14 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                                        var11_11 = var14_14.concat((String)var11_11);
                                        var5_5 = (os1_2)var5_5.a((yn1_2)var7_7 /* !! */ , (String)var11_11);
                                        Intrinsics.checkNotNullParameter(var5_5, "<set-?>");
                                        var2_2.y1 = var5_5;
                                        hu1_2.b = false;
                                        Intrinsics.checkNotNullParameter(var2_2, (String)var4_4);
                                        var5_5 = this.getViewModelStore();
                                        Intrinsics.checkNotNullParameter(var2_2, (String)var4_4);
                                        var7_7 /* !! */  = this.getDefaultViewModelProviderFactory();
                                        Intrinsics.checkNotNullParameter(var2_2, (String)var4_4);
                                        var4_4 = this.getDefaultViewModelCreationExtras();
                                        Intrinsics.checkNotNullParameter(var5_5, (String)var8_8);
                                        Intrinsics.checkNotNullParameter(var7_7 /* !! */ , (String)var9_9);
                                        Intrinsics.checkNotNullParameter(var4_4, var10_10);
                                        var8_8 = gj2_1.class;
                                        var4_4 = rl3_0.b((rd3_0)var5_5, (E$b)var7_7 /* !! */ , (Wd0)var4_4, (Class)var8_8, (String)var12_12);
                                        var5_5 = sw0_0.a((Class)var8_8, (String)var6_6, (Class)var8_8, (String)var12_12, (String)var12_12);
                                        Intrinsics.checkNotNullParameter(var5_5, (String)var6_6);
                                        var6_6 = var5_5.getQualifiedName();
                                        if (var6_6 == null) break block65;
                                        var6_6 = var14_14.concat((String)var6_6);
                                        var2_2.S0 = var4_4 = (gj2_1)var4_4.a((yn1_2)var5_5, (String)var6_6);
                                        var15_15 = R$layout.home_revamp_layout;
                                        var2_2.setContentView(var15_15);
                                        var4_4 = this.P2();
                                        var5_5 = h40_0.a;
                                        var16_16 = h40_0.b1();
                                        var5_5 = var4_4.A.getStoreInfo((boolean)var16_16);
                                        var6_6 = qt2_2.c;
                                        var5_5 = var5_5.h((Scheduler)var6_6);
                                        var6_6 = new Object();
                                        var7_7 /* !! */  = new d91_0((Function1)var6_6);
                                        var6_6 = new Object();
                                        var8_8 = new Yb(var3_3, (Function1)var6_6);
                                        var5_5 = var5_5.f((o60_0)var7_7 /* !! */ , (o60_0)var8_8);
                                        var4_4.z.b((yr0_2)var5_5);
                                        fq2_1.a.stop();
                                        var4_4 = var2_2.N0.c;
                                        var5_5 = new N7(var2_2, 0);
                                        var6_6 = new z7_0((Function1)var5_5);
                                        var4_4.e(var2_2, (F62)var6_6);
                                        var4_4 = nu1_0.a(this);
                                        var10_10 = null;
                                        var5_5 = new x7_0(var2_2, null);
                                        var17_17 = 3;
                                        Ae3.d((i90_0)var4_4, null, null, (Function2)var5_5, var17_17);
                                        var4_4 = this.P2().f;
                                        var5_5 = new Q7(var2_2);
                                        var6_6 = new z7_0((Function1)var5_5);
                                        var4_4.e(var2_2, (F62)var6_6);
                                        var4_4 = this.P2().g;
                                        var5_5 = new R7(var2_2, 0);
                                        var6_6 = new z7_0((Function1)var5_5);
                                        var4_4.e(var2_2, (F62)var6_6);
                                        var4_4 = this.P2().p;
                                        var5_5 = new S7(var2_2);
                                        var6_6 = new z7_0((Function1)var5_5);
                                        var4_4.e(var2_2, (F62)var6_6);
                                        var4_4 = this.P2().m;
                                        var5_5 = new T7(var2_2, 0);
                                        var6_6 = new z7_0((Function1)var5_5);
                                        var4_4.e(var2_2, (F62)var6_6);
                                        var4_4 = Xv1.a(this.getApplicationContext());
                                        var5_5 = new IntentFilter("refresh_token_expire");
                                        var6_6 = var2_2.A1;
                                        var4_4.b((BroadcastReceiver)var6_6, (IntentFilter)var5_5);
                                        var4_4 = Xv1.a(this.getApplicationContext());
                                        var5_5 = new IntentFilter("invalid_refresh_token");
                                        var6_6 = var2_2.B1;
                                        var4_4.b((BroadcastReceiver)var6_6, (IntentFilter)var5_5);
                                        var12_12 = this.getIntent();
                                        if (var12_12 == null) ** GOTO lbl-1000
                                        var15_15 = var12_12.getFlags();
                                        var16_16 = 0x100000;
                                        if ((var15_15 &= var16_16) != 0) {
                                            var15_15 = 1;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var15_15 = 0;
                                            var4_4 = null;
                                        }
                                        var2_2.o1 = var15_15;
                                        if (var12_12 != null) {
                                            var4_4 = var12_12.getExtras();
                                        } else {
                                            var15_15 = 0;
                                            var4_4 = null;
                                        }
                                        if (var4_4 != null) {
                                            var4_4 = var12_12.getExtras();
                                            var2_2.d1 = var4_4;
                                        }
                                        var4_4 = var2_2.d1;
                                        var13_13 = "deeplinkData";
                                        if (var4_4 != null && (var15_15 = (int)var4_4.containsKey((String)var13_13)) != 0) {
                                            hu1_2.b = var3_3;
                                        }
                                        if (var12_12 != null && (var4_4 = var12_12.getExtras()) != null && (var15_15 = (int)var4_4.containsKey((String)(var5_5 = "is_force_start"))) == var3_3) {
                                            var4_4 = var12_12.getExtras();
                                            if (var4_4 != null) {
                                                var15_15 = (int)var4_4.getBoolean((String)var5_5);
                                            } else {
                                                var15_15 = 0;
                                                var4_4 = null;
                                            }
                                            var2_2.u1 = var15_15;
                                        }
                                        var4_4 = CMSConfigInitializer.INSTANCE;
                                        var5_5 = this.getApplication();
                                        var6_6 = "getApplication(...)";
                                        Intrinsics.checkNotNullExpressionValue(var5_5, (String)var6_6);
                                        var4_4.initFromConfig((Application)var5_5);
                                        var4_4 = this.getApplication();
                                        Intrinsics.checkNotNullExpressionValue(var4_4, (String)var6_6);
                                        Intrinsics.checkNotNullParameter(var4_4, "application");
                                        z40_0.Companion.getClass();
                                        var5_5 = z40$a.a((Context)var4_4).a;
                                        var6_6 = "SearchUIConfig";
                                        KU2.a = var5_5 = var5_5.b((String)var6_6);
                                        var16_16 = var5_5.length();
                                        if (var16_16 != 0) {
                                            var5_5 = KU2.a;
                                            var6_6 = CMSSearchConfig.class;
                                            KU2.b = var5_5 = (CMSSearchConfig)JsonUtils.fromJson((String)var5_5, var6_6);
                                        }
                                        z40$a.a((Context)var4_4).a.a("recentSearchNewUIEnabled");
                                        z40$a.a((Context)var4_4).a.a("autoSuggestionNewUIEnabled");
                                        z40$a.a((Context)var4_4).a.a("clearBtnEnabled");
                                        z40$a.a((Context)var4_4).a.a("searchBtnEnabled");
                                        z40$a.a((Context)var4_4).a.a("autoSuggetionAPIFlag");
                                        KU2.c = z40$a.a((Context)var4_4).a.g("searchPageVersionForLuxe");
                                        KU2.d = z40$a.a((Context)var4_4).a.g("searchPageVersionForAjio");
                                        KU2.e = z40$a.a((Context)var4_4).a.a("trendingCategoryEnabledForAjio");
                                        KU2.f = z40$a.a((Context)var4_4).a.a("trendingCategoryEnabledForLuxe");
                                        var5_5 = z40$a.a((Context)var4_4).a;
                                        var6_6 = "image_search";
                                        var5_5.a((String)var6_6);
                                        var4_4 = z40$a.a((Context)var4_4).a;
                                        var5_5 = "ajio_search_wishlist_enabled";
                                        var4_4.a((String)var5_5);
                                        var15_15 = R$id.drawer_layout;
                                        var4_4 = (DrawerLayout)var2_2.findViewById(var15_15);
                                        var2_2.Y = var4_4;
                                        var4_4 = od3_2.a;
                                        var16_16 = var4_4.length();
                                        if (var16_16 == 0) {
                                            var4_4 = od3_2.a();
                                        }
                                        if ((var16_16 = (int)s20.a) == 0 && (var16_16 = (int)Intrinsics.areEqual(var5_5 = od3_2.a(), var7_7 /* !! */  = (var6_6 = ld3_2.STORE_AJIOGRAM).getStoreId())) == 0 && (var15_15 = (int)Intrinsics.areEqual(var4_4, var5_5 = var6_6.getStoreId())) == 0) {
                                            var15_15 = R$id.nav_frg_container;
                                            var4_4 = (FragmentContainerView)var2_2.findViewById(var15_15);
                                            this.g3();
                                        }
                                        var15_15 = R$id.separator_line_container;
                                        var4_4 = (LinearLayout)var2_2.findViewById(var15_15);
                                        var2_2.V0 = var4_4;
                                        p50_0.d = 0;
                                        var15_15 = R$id.toolbar;
                                        var14_14 = var4_4 = var2_2.findViewById(var15_15);
                                        var2_2.k0 = var14_14 = (AjioCustomToolbar)var4_4;
                                        if (var14_14 != null) {
                                            var15_15 = R$id.lin_toolbar_layout;
                                            var4_4 = (LinearLayout)var2_2.findViewById(var15_15);
                                            var2_2.p0 = var4_4;
                                            var15_15 = R$id.bt_toolbar_category;
                                            var4_4 = (AjioTextView)var14_14.findViewById(var15_15);
                                            var15_15 = R$id.ll_toolbar_category;
                                            var4_4 = (LinearLayout)var14_14.findViewById(var15_15);
                                            var2_2.I0 = var4_4;
                                            var2_2.setSupportActionBar((Toolbar)var14_14);
                                            var4_4 = this.getSupportActionBar();
                                            if (var4_4 != null) {
                                                var4_4.x(null);
                                            }
                                            var4_4 = var14_14.getLogoImageView();
                                            var5_5 = new Object();
                                            var4_4.setOnClickListener((View.OnClickListener)var5_5);
                                            var15_15 = R$id.drawer_layout;
                                            var7_7 /* !! */  = var4_4 = var2_2.findViewById(var15_15);
                                            var7_7 /* !! */  = (DrawerLayout)var4_4;
                                            var2_2.Y = var7_7 /* !! */ ;
                                            if (var7_7 /* !! */  != null) {
                                                var18_18 = R$string.navigation_drawer_open;
                                                var19_19 = R$string.navigation_drawer_close;
                                                var4_4 = var20_20;
                                                var5_5 = this;
                                                var6_6 = var14_14;
                                                var20_20 = new qv_2(this, (AjioCustomToolbar)var14_14, (DrawerLayout)var7_7 /* !! */ , var18_18, var19_19);
                                                var2_2.Z = var20_20;
                                                var20_20.b();
                                                var4_4 = var2_2.Y;
                                                if (var4_4 != null) {
                                                    var4_4.addDrawerListener((DrawerLayout$e)var20_20);
                                                }
                                                if ((var21_21 = (var4_4 = var20_20.b).isDrawerOpen(var16_16 = 0x800003)) != 0) {
                                                    var21_21 = 1065353216;
                                                    var22_22 = 1.0f;
                                                    var20_20.c(var22_22);
                                                } else {
                                                    var21_21 = 0;
                                                    var22_22 = 0.0f;
                                                    var6_6 = null;
                                                    var20_20.c(0.0f);
                                                }
                                                var21_21 = (int)var20_20.e;
                                                if (var21_21 != 0) {
                                                    var15_15 = (int)var4_4.isDrawerOpen(var16_16);
                                                    var15_15 = var15_15 != 0 ? var20_20.g : var20_20.f;
                                                    var5_5 = var20_20.c;
                                                    var20_20.a((Drawable)var5_5, var15_15);
                                                }
                                                var4_4 = new ov_1(var2_2, 0);
                                                var14_14.setNavigationOnClickListener((View.OnClickListener)var4_4);
                                            }
                                        }
                                        var15_15 = R$id.tabs;
                                        var4_4 = (TabLayout)var2_2.findViewById(var15_15);
                                        var4_4.setSelectedTabIndicator(null);
                                        var16_16 = R$color.white;
                                        var4_4.setSelectedTabIndicatorColor(var16_16);
                                        var2_2.r0 = var4_4;
                                        var15_15 = R$id.luxeBottomTab;
                                        var4_4 = (TabLayout)var2_2.findViewById(var15_15);
                                        var4_4.setSelectedTabIndicator(null);
                                        var16_16 = R$color.white;
                                        var4_4.setSelectedTabIndicatorColor(var16_16);
                                        var2_2.s0 = var4_4;
                                        var15_15 = R$id.tab_divider;
                                        var4_4 = var2_2.findViewById(var15_15);
                                        var2_2.t0 = var4_4;
                                        var4_4 = od3_2.a();
                                        var5_5 = ld3_2.STORE_LUXE.getStoreId();
                                        var15_15 = (int)Intrinsics.areEqual(var4_4, var5_5);
                                        if (var15_15 != 0) {
                                            var4_4 = this.P2();
                                            var5_5 = var4_4.g;
                                            var4_4 = var4_4.b;
                                            var4_4.getLuxeBottomTabsData((zr1_1)var5_5);
                                        } else {
                                            var4_4 = this.P2();
                                            var5_5 = var4_4.f;
                                            var4_4 = var4_4.b;
                                            var4_4.getBottomTabsData((zr1_1)var5_5);
                                        }
                                        var15_15 = R$id.icon_ajio_tab;
                                        var4_4 = (ImageView)var2_2.findViewById(var15_15);
                                        var15_15 = R$id.count_cart_tab;
                                        var4_4 = (TextView)var2_2.findViewById(var15_15);
                                        var2_2.setNotifCount((TextView)var4_4);
                                        var15_15 = R$id.ajio_loader_view;
                                        var4_4 = (AjioLoaderView)var2_2.findViewById(var15_15);
                                        var2_2.U0 = var4_4;
                                        var4_4 = "OPTYPE";
                                        var16_16 = (int)var12_12.hasExtra((String)var4_4);
                                        var6_6 = "";
                                        if (var16_16 == 0) break block66;
                                        var15_15 = var12_12.getIntExtra((String)var4_4, 0);
                                        if (var15_15 != (var16_16 = 35)) {
                                            var16_16 = 664;
                                            if (var15_15 == var16_16) {
                                                var4_4 = var12_12.getExtras();
                                                if (var4_4 == null) {
                                                    return;
                                                }
                                                var5_5 = "SELECTED_PRODUCT_CODE_KEY";
                                                if ((var4_4 = var4_4.getString((String)var5_5)) != null) {
                                                    var5_5 = new ri2$a();
                                                    var5_5.b = var4_4;
                                                    var4_4 = var5_5.a();
                                                    var2_2.n0((ri2_0)var4_4);
                                                }
                                            }
                                        } else {
                                            var4_4 = var12_12.getExtras();
                                            if (var4_4 == null) {
                                                return;
                                            }
                                            var5_5 = "clicked_item_code";
                                            var23_23 = var4_4.containsKey((String)var5_5);
                                            var14_14 = var23_23 != false ? (var5_5 = var4_4.getString((String)var5_5)) : null;
                                            var5_5 = "product_code";
                                            var23_23 = var4_4.containsKey((String)var5_5);
                                            var13_13 = var23_23 != false ? (var5_5 = var4_4.getString((String)var5_5)) : null;
                                            var5_5 = "exchange_id";
                                            var23_23 = var4_4.containsKey((String)var5_5);
                                            if (var23_23) {
                                                var6_6 = var4_4.getString((String)var5_5);
                                            }
                                            var20_20 = var6_6;
                                            var5_5 = "is_from_customer_care_page";
                                            var21_21 = (int)var4_4.containsKey((String)var5_5);
                                            var24_25 = var21_21 != 0 ? (var15_15 = var4_4.getBoolean((String)var5_5)) : 0;
                                            if (var14_14 != null && (var15_15 = var14_14.length()) != 0 && var13_13 != null && (var15_15 = var13_13.length()) != 0) {
                                                this.U2();
                                                var12_12 = bg2_1.Companion;
                                                var25_26 = 40;
                                                var6_6 = bg2$a.a((bg2$a)var12_12, (String)var13_13, (String)var14_14, (String)var20_20, null, (boolean)var24_25, false, var25_26);
                                                var15_15 = this.isFinishing();
                                                if (var15_15 == 0) {
                                                    var5_5 = var2_2.T0;
                                                    var9_9 = Boolean.FALSE;
                                                    var23_23 = true;
                                                    var8_8 = "OrderSummaryFragment";
                                                    var4_4 = this;
                                                    this.Q1((Fragment)var5_5, (Fragment)var6_6, var23_23, (String)var8_8, (Boolean)var9_9);
                                                }
                                            } else {
                                                this.U2();
                                                com.ril.ajio.myaccount.order.fragment.b.Companion.getClass();
                                                var6_6 = b$a.a();
                                                var4_4 = new Bundle();
                                                var4_4.putString("ORDER_NO", (String)var13_13);
                                                var6_6.setArguments((Bundle)var4_4);
                                                var5_5 = var2_2.T0;
                                                var8_8 = com.ril.ajio.myaccount.order.fragment.b.Z;
                                                var9_9 = Boolean.FALSE;
                                                var23_23 = true;
                                                var4_4 = this;
                                                this.Q1((Fragment)var5_5, (Fragment)var6_6, var23_23, (String)var8_8, (Boolean)var9_9);
                                            }
                                        }
                                        break block67;
                                    }
                                    var4_4 = "plp-coupon-bonanza";
                                    var15_15 = (int)var12_12.hasExtra((String)var4_4);
                                    if (var15_15 == 0) break block68;
                                    this.U2();
                                    var4_4 = var12_12.getExtras();
                                    if (var4_4 != null) {
                                        var5_5 = "BUNDLE_PLP_LINK";
                                        var4_4 = var4_4.getString((String)var5_5);
                                    } else {
                                        var15_15 = 0;
                                        var4_4 = null;
                                    }
                                    var5_5 = kj0_1.g();
                                    var6_6 = Uri.parse((String)var4_4);
                                    var18_18 = 0;
                                    var8_8 = null;
                                    var19_19 = 0;
                                    var9_9 = null;
                                    var23_24 = false;
                                    var7_7 /* !! */  = null;
                                    var4_4 = var5_5;
                                    var5_5 = this;
                                    var4_4.n(this, (Uri)var6_6, null, false, false);
                                    break block67;
                                }
                                var4_4 = "GOTO_PLP_FROM_THANKYOU_AGE";
                                var15_15 = (int)var12_12.hasExtra((String)var4_4);
                                if (var15_15 == 0) break block69;
                                var2_2.W2((Intent)var12_12);
                                break block67;
                            }
                            var4_4 = "/fleek";
                            var15_15 = (int)var12_12.hasExtra((String)var4_4);
                            if (var15_15 == 0) break block70;
                            var4_4 = "fleek-url";
                            var16_16 = (int)var12_12.hasExtra((String)var4_4);
                            if (var16_16 != 0 && (var5_5 = var12_12.getExtras()) != null) {
                                var4_4 = var5_5.getString((String)var4_4);
                            } else {
                                var15_15 = 0;
                                var4_4 = null;
                            }
                            if (var4_4 != null) {
                                this.U2();
                                var5_5 = "/fleek-search";
                                var16_16 = Intrinsics.areEqual(var4_4, var5_5);
                                if (var16_16 != 0) {
                                    var2_2.M1((String)var6_6, (String)var6_6, (boolean)var3_3);
                                } else {
                                    var5_5 = kj0_1.g();
                                    var6_6 = Boolean.FALSE;
                                    var5_5.s(var2_2, (String)var4_4, null, (Boolean)var6_6);
                                }
                            }
                            break block67;
                        }
                        var4_4 = "ORDER_DETAILS_TO_CANCEL";
                        var15_15 = (int)var12_12.hasExtra((String)var4_4);
                        if (var15_15 == 0) break block71;
                        this.U2();
                        var4_4 = var12_12.getExtras();
                        var2_2.Z2((Bundle)var4_4);
                        break block67;
                    }
                    var4_4 = var2_2.d1;
                    if (var4_4 == null || (var16_16 = var4_4.containsKey((String)var13_13)) == 0) ** GOTO lbl-1000
                    var16_16 = Build.VERSION.SDK_INT;
                    var21_21 = 33;
                    var22_22 = 4.6E-44f;
                    if (var16_16 >= var21_21) {
                        var4_4 = (Parcelable)z7.a((Bundle)var4_4);
                    } else {
                        var16_16 = (var4_4 = var4_4.getParcelable((String)var13_13)) instanceof Intent;
                        if (var16_16 == 0) {
                            var15_15 = 0;
                            var4_4 = null;
                        }
                        var4_4 = (Intent)var4_4;
                    }
                    var4_4 = (Intent)var4_4;
                    if (var4_4 != null) {
                        var15_15 = 1;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var15_15 = 0;
                        var4_4 = null;
                    }
                    var2_2.h3((boolean)var3_3, (boolean)var15_15);
                    var4_4 = AnalyticsManager.Companion.getInstance().getCt();
                    var4_4.pushCategorySelectionData();
                }
                if ((var15_15 = (int)(var4_4 = UserInformation.getInstance((Context)this.getApplication())).isUserOnline()) != 0 && (var15_15 = (int)(var4_4 = UserInformation.getInstance((Context)this.getApplication())).checkUserParams()) == 0) {
                    var4_4 = this.P2();
                    var5_5 = var4_4.c.getUserProfile((boolean)var3_3);
                    var6_6 = new z81_0(var4_4, 0);
                    var7_7 /* !! */  = new a91_0((Function1)var6_6);
                    var6_6 = new b91_0(var4_4, 0);
                    var8_8 = new af0_0(var6_6);
                    var5_5 = var5_5.f((o60_0)var7_7 /* !! */ , (o60_0)var8_8);
                    var4_4 = var4_4.z;
                    var4_4.b((yr0_2)var5_5);
                }
                if ((var15_15 = (int)(var4_4 = UrlHelper.Companion).getISPREVIEW()) != 0 && (var4_4 = w61_0.b) != null && (var4_4 = var4_4.getCmsPreviewInfo()) != null && (var16_16 = var4_4.length()) != 0) {
                    var5_5 = new JSONObject((String)var4_4);
                    var21_21 = var5_5.has((String)(var4_4 = "pageId"));
                    if (var21_21 != 0) {
                        ch_2.f = var15_15 = var5_5.getInt((String)var4_4);
                    }
                    if ((var21_21 = (int)var5_5.has((String)(var4_4 = "pageUrl"))) != 0) {
                        ch_2.g = var4_4 = var5_5.getString((String)var4_4);
                    }
                    if ((var21_21 = (int)var5_5.has((String)(var4_4 = "selectedStore"))) != 0) {
                        ch_2.l = var4_4 = var5_5.getString((String)var4_4);
                    }
                    if ((var4_4 = ch_2.l) == null || (var15_15 = var4_4.length()) == 0) {
                        ch_2.l = var4_4 = "AJIO";
                    }
                    if ((var21_21 = var5_5.has((String)(var4_4 = "userType"))) != 0) {
                        ch_2.h = var4_4 = var5_5.getString((String)var4_4);
                    }
                    if ((var21_21 = var5_5.has((String)(var4_4 = "userGroup"))) != 0) {
                        ch_2.j = var4_4 = var5_5.getString((String)var4_4);
                    }
                    if ((var21_21 = var5_5.has((String)(var4_4 = "userSubGroup"))) != 0) {
                        ch_2.m = var4_4 = var5_5.getString((String)var4_4);
                    }
                    if ((var21_21 = var5_5.has((String)(var4_4 = "userStatus"))) != 0) {
                        ch_2.i = var4_4 = var5_5.getString((String)var4_4);
                    }
                    if ((var21_21 = var5_5.has((String)(var4_4 = "appVersion"))) != 0) {
                        ch_2.k = var4_4 = var5_5.getString((String)var4_4);
                    }
                    if ((var21_21 = var5_5.has((String)(var4_4 = "year"))) != 0) {
                        ch_2.e = var15_15 = var5_5.getInt((String)var4_4);
                    }
                    if ((var21_21 = (int)var5_5.has((String)(var4_4 = "month"))) != 0) {
                        ch_2.d = var15_15 = var5_5.getInt((String)var4_4);
                    }
                    if ((var21_21 = (int)var5_5.has((String)(var4_4 = "dayOfMonth"))) != 0) {
                        ch_2.c = var15_15 = var5_5.getInt((String)var4_4);
                    }
                    if ((var21_21 = (int)var5_5.has((String)(var4_4 = "hourOfDay"))) != 0) {
                        ch_2.b = var15_15 = var5_5.getInt((String)var4_4);
                    }
                    if ((var21_21 = (int)var5_5.has((String)(var4_4 = "minute"))) != 0) {
                        ch_2.a = var15_15 = var5_5.getInt((String)var4_4);
                    }
                    if ((var21_21 = (int)var5_5.has((String)(var4_4 = "isUAT"))) != 0) {
                        var15_15 = (int)var5_5.getBoolean((String)var4_4);
                        ch_2.o = var15_15;
                    }
                    if ((var21_21 = (int)var5_5.has((String)(var4_4 = "shouldCallJioAds"))) != 0) {
                        var15_15 = (int)var5_5.getBoolean((String)var4_4);
                        ch_2.n = var15_15;
                    }
                }
                AJIOApplication.Companion.getClass();
                var4_4 = AJIOApplication$a.a().getSharedPreferences("PREFERENCE_NAME", 0);
                var2_2.p1 = var4_4;
                var4_4 = this.getSupportFragmentManager().o;
                var5_5 = var2_2.z1;
                var4_4.add(var5_5);
                var4_4 = var2_2.O0;
                var5_5 = new O7(var2_2, 0);
                var6_6 = new z7_0((Function1)var5_5);
                var4_4.e(var2_2, (F62)var6_6);
                var4_4 = this.P2();
                var4_4.getClass();
                var5_5 = md3_0.c((jD3)var4_4);
                var6_6 = new g91((h91)var4_4, null);
                Ae3.d((i90_0)var5_5, null, null, (Function2)var6_6, var17_17);
                cp_1.Companion.getClass();
                var4_4 = cp$a.e();
                var5_5 = this.getPackageName();
                var6_6 = "getPackageName(...)";
                Intrinsics.checkNotNullExpressionValue(var5_5, (String)var6_6);
                var4_4.getClass();
                cp_1.Q((Context)var2_2, (String)var5_5);
                var4_4 = fq2_1.b;
                if (var4_4 != null) {
                    var4_4.stop();
                }
                fq2_1.b = null;
                return;
            }
            var5_5 = var13_13.toString();
            var4_4 = new IllegalArgumentException((String)var5_5);
            throw var4_4;
        }
        var5_5 = var13_13.toString();
        var4_4 = new IllegalArgumentException((String)var5_5);
        throw var4_4;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu2) {
        Intrinsics.checkNotNullParameter(actionMode, "mode");
        Intrinsics.checkNotNullParameter(menu2, "menu");
        menu2 = LayoutInflater.from((Context)this);
        int n3 = R$layout.layout_context_title;
        menu2 = menu2.inflate(n3, null);
        Intrinsics.checkNotNull(menu2, "null cannot be cast to non-null type android.widget.TextView");
        menu2 = (TextView)menu2;
        this.W0 = menu2;
        actionMode.setCustomView((View)menu2);
        this.Y0 = actionMode;
        return true;
    }

    public final void onDestroy() {
        super.onDestroy();
        AjioHomeActivity.K2();
        yr0_0.Companion.getClass();
        Object object = yr0_0.c;
        if (object != null) {
            object.cancel();
        }
        if ((object = yr0_0.b) != null) {
            object.cancel();
        }
        yr0_0.c = null;
        yr0_0.b = null;
        this.C1.removeCallbacksAndMessages(null);
        object = lw0_1.Companion;
        AJIOApplication.Companion.getClass();
        Object object2 = AJIOApplication$a.a();
        object = ((Lw0$a)object).a((ContextWrapper)object2);
        object2 = ((lw0_1)object).b;
        if (object2 != null) {
            object2.unregisterListener((SplitInstallStateUpdatedListener)object);
        }
        object = Xv1.a(this.getApplicationContext());
        object2 = this.A1;
        ((Xv1)object).d((BroadcastReceiver)object2);
        object = Xv1.a(this.getApplicationContext());
        object2 = this.B1;
        ((Xv1)object).d((BroadcastReceiver)object2);
        object = this.r0;
        if (object != null) {
            object2 = this.Z0;
            ((TabLayout)((Object)object)).removeOnTabSelectedListener((TabLayout$OnTabSelectedListener)object2);
        }
        if ((object = this.s0) != null) {
            object2 = this.a1;
            ((TabLayout)((Object)object)).removeOnTabSelectedListener((TabLayout$OnTabSelectedListener)object2);
        }
        aa_1.d.dispose();
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        Intrinsics.checkNotNullParameter(actionMode, "mode");
        this.n3();
    }

    public final void onDownloadConfirmation(SplitInstallManager splitInstallManager, SplitInstallSessionState object) {
        if (splitInstallManager != null && object != null) {
            int n3 = 37;
            try {
                splitInstallManager.startConfirmationDialogForResult((SplitInstallSessionState)object, this, n3);
            }
            catch (Exception exception) {
                object = yn3_0.a;
                ((yn3$a)object).e(exception);
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onFragmentInteraction(String string2, int n3, Bundle bundle) {
        block130: {
            int n4;
            Object object;
            Object object2;
            String string3;
            int n7;
            Object object3;
            AjioHomeActivity ajioHomeActivity;
            block157: {
                float f5;
                Object object4;
                boolean bl2;
                int n8;
                Object object5;
                Object object6;
                int n10;
                Object object7;
                int n14;
                block158: {
                    block159: {
                        String string4;
                        Object object8;
                        block160: {
                            float f6;
                            block153: {
                                block155: {
                                    int n15;
                                    block156: {
                                        String string5;
                                        String string6;
                                        boolean bl3;
                                        block154: {
                                            float f7;
                                            String string7;
                                            String string8;
                                            block146: {
                                                block152: {
                                                    block147: {
                                                        block148: {
                                                            int n16;
                                                            block149: {
                                                                block150: {
                                                                    block151: {
                                                                        int n17;
                                                                        block143: {
                                                                            block145: {
                                                                                Fragment fragment;
                                                                                void var5_54;
                                                                                void var26_214;
                                                                                block144: {
                                                                                    int n18;
                                                                                    block131: {
                                                                                        block142: {
                                                                                            void var5_44;
                                                                                            String string9;
                                                                                            float f8;
                                                                                            int n19;
                                                                                            block132: {
                                                                                                block129: {
                                                                                                    void var5_39;
                                                                                                    block133: {
                                                                                                        block134: {
                                                                                                            block135: {
                                                                                                                block136: {
                                                                                                                    block137: {
                                                                                                                        float f11;
                                                                                                                        block138: {
                                                                                                                            block139: {
                                                                                                                                block140: {
                                                                                                                                    block141: {
                                                                                                                                        ajioHomeActivity = this;
                                                                                                                                        string8 = string2;
                                                                                                                                        n14 = n3;
                                                                                                                                        object3 = bundle;
                                                                                                                                        object7 = "BZ1";
                                                                                                                                        n7 = 1;
                                                                                                                                        f6 = Float.MIN_VALUE;
                                                                                                                                        n10 = b.i(string2, (String)object7, n7 != 0);
                                                                                                                                        object6 = this.M0;
                                                                                                                                        object5 = "data";
                                                                                                                                        n8 = 4;
                                                                                                                                        int n20 = 3;
                                                                                                                                        n17 = 10;
                                                                                                                                        string7 = "AjioCashFragmentRefresh";
                                                                                                                                        object8 = "";
                                                                                                                                        bl3 = false;
                                                                                                                                        string3 = null;
                                                                                                                                        bl2 = false;
                                                                                                                                        object2 = null;
                                                                                                                                        if (n10 == 0) break block131;
                                                                                                                                        n19 = 11;
                                                                                                                                        f8 = 1.5E-44f;
                                                                                                                                        if (n3 == n19) break block132;
                                                                                                                                        if (n3 == 0) break block133;
                                                                                                                                        if (n3 == n17) break block134;
                                                                                                                                        n19 = 12;
                                                                                                                                        f8 = 1.7E-44f;
                                                                                                                                        if (n3 == n19) break block135;
                                                                                                                                        n19 = 36;
                                                                                                                                        f8 = 5.0E-44f;
                                                                                                                                        n10 = 14;
                                                                                                                                        f11 = 2.0E-44f;
                                                                                                                                        if (n3 == n19) break block136;
                                                                                                                                        n19 = 38;
                                                                                                                                        f8 = 5.3E-44f;
                                                                                                                                        if (n3 == n19) break block137;
                                                                                                                                        n19 = 42;
                                                                                                                                        f8 = 5.9E-44f;
                                                                                                                                        if (n3 == n19) break block138;
                                                                                                                                        n19 = 47;
                                                                                                                                        f8 = 6.6E-44f;
                                                                                                                                        if (n3 == n19) break block139;
                                                                                                                                        n19 = 57;
                                                                                                                                        f8 = 8.0E-44f;
                                                                                                                                        if (n3 == n19) break block140;
                                                                                                                                        n19 = 122;
                                                                                                                                        f8 = 1.71E-43f;
                                                                                                                                        if (n3 == n19) break block141;
                                                                                                                                        if (n3 != n20) {
                                                                                                                                            if (n3 == n8) {
                                                                                                                                                AnalyticsUtil$Companion analyticsUtil$Companion = AnalyticsUtil.Companion;
                                                                                                                                                z40$a z40$a = z40_0.Companion;
                                                                                                                                                ao0_0 ao0_02 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a;
                                                                                                                                                object3 = "enable_my_rewards_status";
                                                                                                                                                String string10 = ao0_02.b((String)object3);
                                                                                                                                                MyRewardsOption myRewardsOption = analyticsUtil$Companion.mapperToMyRewardsOption(string10);
                                                                                                                                                String string11 = UrlHelper.Companion.getInstance().getBaseUrl();
                                                                                                                                                if (myRewardsOption != null) {
                                                                                                                                                    object3 = myRewardsOption.getUrlEndPoint();
                                                                                                                                                } else {
                                                                                                                                                    boolean bl4 = false;
                                                                                                                                                    object3 = null;
                                                                                                                                                }
                                                                                                                                                String string12 = Ft2.a(string11, (String)object3);
                                                                                                                                                object3 = MyRewardsWebActivity.Companion;
                                                                                                                                                if (myRewardsOption != null) {
                                                                                                                                                    object2 = myRewardsOption.getTitle();
                                                                                                                                                }
                                                                                                                                                object3.getClass();
                                                                                                                                                MyRewardsWebActivity$a.a(n10, ajioHomeActivity, string12, (String)object2);
                                                                                                                                            }
                                                                                                                                            break block129;
                                                                                                                                        } else {
                                                                                                                                            s4_0.Companion.getClass();
                                                                                                                                            Intrinsics.checkNotNullParameter(object8, (String)object5);
                                                                                                                                            object7 = new s4_0();
                                                                                                                                            Bundle bundle2 = new Bundle();
                                                                                                                                            bundle2.putString("argument_data", (String)object8);
                                                                                                                                            ((Fragment)object7).setArguments(bundle2);
                                                                                                                                            object3 = this.T0;
                                                                                                                                            object5 = Boolean.FALSE;
                                                                                                                                            n7 = 1;
                                                                                                                                            f6 = Float.MIN_VALUE;
                                                                                                                                            object6 = "AddressListFragment";
                                                                                                                                            AjioHomeActivity ajioHomeActivity2 = this;
                                                                                                                                            this.Q1((Fragment)object3, (Fragment)object7, n7 != 0, (String)object6, (Boolean)object5);
                                                                                                                                        }
                                                                                                                                        break block129;
                                                                                                                                    }
                                                                                                                                    JZ1$a jZ1$a = jz1_2.Companion;
                                                                                                                                    jZ1$a.getClass();
                                                                                                                                    object7 = new jz1_2();
                                                                                                                                    object3 = this.T0;
                                                                                                                                    object5 = Boolean.FALSE;
                                                                                                                                    n7 = 1;
                                                                                                                                    f6 = Float.MIN_VALUE;
                                                                                                                                    object6 = "NewNotificationCenterActivityFragment";
                                                                                                                                    AjioHomeActivity ajioHomeActivity3 = this;
                                                                                                                                    this.Q1((Fragment)object3, (Fragment)object7, n7 != 0, (String)object6, (Boolean)object5);
                                                                                                                                    try {
                                                                                                                                        AJIOApplication$a aJIOApplication$a = AJIOApplication.Companion;
                                                                                                                                        aJIOApplication$a.getClass();
                                                                                                                                        AJIOApplication aJIOApplication = AJIOApplication$a.a();
                                                                                                                                        o43_0.a(aJIOApplication, 0);
                                                                                                                                    }
                                                                                                                                    catch (Exception exception) {
                                                                                                                                        yn3$a yn3$a = yn3_0.a;
                                                                                                                                        yn3$a.e(exception);
                                                                                                                                    }
                                                                                                                                    jo_2 jo_22 = this.getAppPreferences();
                                                                                                                                    String string13 = "NotiBaddge_Count";
                                                                                                                                    jo_22.putPreference(string13, 0);
                                                                                                                                    break block129;
                                                                                                                                }
                                                                                                                                hh3_2 hh3_22 = at2_1.a;
                                                                                                                                AJIOApplication.Companion.getClass();
                                                                                                                                AJIOApplication aJIOApplication = AJIOApplication$a.a();
                                                                                                                                object3 = CouponBonanzaActivity.class;
                                                                                                                                Intent intent = new Intent((Context)aJIOApplication, (Class)object3);
                                                                                                                                this.startActivity(intent);
                                                                                                                                break block129;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                z40$a z40$a = z40_0.Companion;
                                                                                                                                AJIOApplication$a aJIOApplication$a = AJIOApplication.Companion;
                                                                                                                                aJIOApplication$a.getClass();
                                                                                                                                AJIOApplication aJIOApplication = AJIOApplication$a.a();
                                                                                                                                z40$a.getClass();
                                                                                                                                z40_0 z40_02 = z40$a.a((Context)aJIOApplication);
                                                                                                                                ao0_0 ao0_03 = z40_02.a;
                                                                                                                                String string14 = "myaccount_gamezoneinfo";
                                                                                                                                String string15 = ao0_03.b(string14);
                                                                                                                                JSONObject jSONObject = new JSONObject(string15);
                                                                                                                                String string17 = "webUrlLink";
                                                                                                                                string17 = jSONObject.getString(string17);
                                                                                                                                z40_0 z40_03 = z40$a.a((Context)this);
                                                                                                                                ao0_0 ao0_04 = z40_03.a;
                                                                                                                                object3 = "enable_gamezone";
                                                                                                                                n14 = (int)(ao0_04.a((String)object3) ? 1 : 0);
                                                                                                                                object3 = new zj0_0(this);
                                                                                                                                ((ny0_1)object3).b(string17, (String)object8, n14 != 0);
                                                                                                                            }
                                                                                                                            catch (Exception exception) {
                                                                                                                                yn3$a yn3$a = yn3_0.a;
                                                                                                                                yn3$a.e(exception);
                                                                                                                            }
                                                                                                                            break block129;
                                                                                                                        }
                                                                                                                        h91 h912 = this.P2();
                                                                                                                        n19 = (int)(h912.b() ? 1 : 0);
                                                                                                                        String string18 = "REFERRER_EARN_AMOUNT";
                                                                                                                        object7 = "REFEREE_EARN_AMOUNT";
                                                                                                                        n7 = 0;
                                                                                                                        f6 = 0.0f;
                                                                                                                        Object var28_277 = null;
                                                                                                                        if (n19 != 0) {
                                                                                                                            if (bundle != null) {
                                                                                                                                f8 = bundle.getFloat((String)object7, 0.0f);
                                                                                                                                float f12 = bundle.getFloat(string18, 0.0f);
                                                                                                                                f6 = f8;
                                                                                                                                f8 = f12;
                                                                                                                            } else {
                                                                                                                                n19 = 0;
                                                                                                                                f8 = 0.0f;
                                                                                                                                Object var5_25 = null;
                                                                                                                            }
                                                                                                                            object3 = ajioHomeActivity.T0;
                                                                                                                            gg2_1.Companion.getClass();
                                                                                                                            object7 = GG2$a.a(f6, f8);
                                                                                                                            object5 = Boolean.FALSE;
                                                                                                                            n7 = 1;
                                                                                                                            f6 = Float.MIN_VALUE;
                                                                                                                            object6 = "ReferralFragment";
                                                                                                                            AjioHomeActivity ajioHomeActivity4 = this;
                                                                                                                            this.Q1((Fragment)object3, (Fragment)object7, n7 != 0, (String)object6, (Boolean)object5);
                                                                                                                            break block129;
                                                                                                                        } else {
                                                                                                                            float f14;
                                                                                                                            if (bundle != null) {
                                                                                                                                h91 h913 = this.P2();
                                                                                                                                h913.r = f11 = bundle.getFloat((String)object7, 0.0f);
                                                                                                                                h91 h914 = this.P2();
                                                                                                                                h914.s = f14 = bundle.getFloat(string18, 0.0f);
                                                                                                                            }
                                                                                                                            String string19 = "source - referral";
                                                                                                                            String string20 = "source";
                                                                                                                            Intrinsics.checkNotNullParameter(string19, string20);
                                                                                                                            n14 = 52;
                                                                                                                            f14 = 7.3E-44f;
                                                                                                                            at2_1.h(ajioHomeActivity, string19, n14);
                                                                                                                        }
                                                                                                                        break block129;
                                                                                                                    }
                                                                                                                    J23.Companion.getClass();
                                                                                                                    object7 = new J23();
                                                                                                                    Bundle bundle3 = new Bundle();
                                                                                                                    bundle3.putBoolean("ARG_CLEAR_ON_EMPTY", false);
                                                                                                                    ((Fragment)object7).setArguments(bundle3);
                                                                                                                    object3 = this.T0;
                                                                                                                    object6 = J23.i;
                                                                                                                    object5 = Boolean.FALSE;
                                                                                                                    n7 = 1;
                                                                                                                    f6 = Float.MIN_VALUE;
                                                                                                                    AjioHomeActivity ajioHomeActivity5 = this;
                                                                                                                    this.Q1((Fragment)object3, (Fragment)object7, n7 != 0, (String)object6, (Boolean)object5);
                                                                                                                    break block129;
                                                                                                                }
                                                                                                                object6.getClass();
                                                                                                                AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
                                                                                                                GTMEvents gTMEvents = analyticsManager$Companion.getInstance().getGtmEvents();
                                                                                                                String string21 = analyticsManager$Companion.getInstance().getGtmEvents().getScreenName();
                                                                                                                gTMEvents.pushButtonTapEvent("Payments clicked in my accounts", "MyaccountPayments_clicked", string21);
                                                                                                                AjioHomeActivity ajioHomeActivity6 = ((s71)object6).a;
                                                                                                                Intent intent = new Intent((Context)ajioHomeActivity6, PaymentActivity.class);
                                                                                                                object3 = E1.a("viewmode", "savedcard");
                                                                                                                object6 = UrlHelper.Companion;
                                                                                                                ((UrlHelper$Companion)object6).getInstance().getBaseUrl();
                                                                                                                object5 = ((UrlHelper$Companion)object6).getInstance();
                                                                                                                boolean bl5 = ((UrlHelper)object5).isUAT1Domain();
                                                                                                                String string22 = "envmode";
                                                                                                                if (bl5) {
                                                                                                                    object3.putInt(string22, n7);
                                                                                                                } else {
                                                                                                                    boolean bl6 = ((UrlHelper)(object6 = ((UrlHelper$Companion)object6).getInstance())).isUAT2Domain();
                                                                                                                    if (bl6) {
                                                                                                                        object3.putInt(string22, n7);
                                                                                                                    } else {
                                                                                                                        object3.putInt(string22, 0);
                                                                                                                    }
                                                                                                                }
                                                                                                                object6 = "PaymentData";
                                                                                                                intent.putExtra((String)object6, (Bundle)object3);
                                                                                                                intent.putExtra("SAVEDCARD", n7 != 0);
                                                                                                                intent.putExtra("isOrderPayment", false);
                                                                                                                object3 = "toolbarTitle";
                                                                                                                intent.putExtra((String)object3, (String)object8);
                                                                                                                ajioHomeActivity6.startActivityForResult(intent, n10);
                                                                                                                break block129;
                                                                                                            }
                                                                                                            q5_0 q5_02 = new q5_0();
                                                                                                            this.L2(q5_02, string7, n7 != 0);
                                                                                                            break block129;
                                                                                                        }
                                                                                                        b$a b$a = com.ril.ajio.myaccount.order.fragment.b.Companion;
                                                                                                        b$a.getClass();
                                                                                                        object7 = b$a.a();
                                                                                                        ((Fragment)object7).setArguments(bundle);
                                                                                                        object3 = this.T0;
                                                                                                        object6 = com.ril.ajio.myaccount.order.fragment.b.Z;
                                                                                                        object5 = Boolean.FALSE;
                                                                                                        n7 = 1;
                                                                                                        f6 = Float.MIN_VALUE;
                                                                                                        AjioHomeActivity ajioHomeActivity7 = this;
                                                                                                        this.Q1((Fragment)object3, (Fragment)object7, n7 != 0, (String)object6, (Boolean)object5);
                                                                                                        break block129;
                                                                                                    }
                                                                                                    px0_1.Companion.getClass();
                                                                                                    object7 = new px0_1();
                                                                                                    Bundle bundle4 = new Bundle();
                                                                                                    if (bundle != null) {
                                                                                                        Bundle bundle5 = bundle;
                                                                                                    }
                                                                                                    ((Fragment)object7).setArguments((Bundle)var5_39);
                                                                                                    object3 = ajioHomeActivity.T0;
                                                                                                    object5 = Boolean.FALSE;
                                                                                                    n7 = 1;
                                                                                                    f6 = Float.MIN_VALUE;
                                                                                                    object6 = "Px0";
                                                                                                    AjioHomeActivity ajioHomeActivity8 = this;
                                                                                                    this.Q1((Fragment)object3, (Fragment)object7, n7 != 0, (String)object6, (Boolean)object5);
                                                                                                }
                                                                                                ActivityTransitionManager activityTransitionManager = ActivityTransitionManager.getInstance();
                                                                                                activityTransitionManager.slideInOutLeft(ajioHomeActivity);
                                                                                                break block142;
                                                                                            }
                                                                                            if (bundle != null) {
                                                                                                String string23 = bundle.getString("page_name");
                                                                                            } else {
                                                                                                n19 = 0;
                                                                                                Object var5_43 = null;
                                                                                                f8 = 0.0f;
                                                                                            }
                                                                                            if (object3 != null) {
                                                                                                String string24 = "page_url";
                                                                                                object2 = object3.getString(string24);
                                                                                            }
                                                                                            if ((n19 = (int)((string9 = "signout").equalsIgnoreCase((String)var5_44) ? 1 : 0)) != 0 && (n19 = (int)(string9.equalsIgnoreCase((String)object2) ? 1 : 0)) != 0) {
                                                                                                String string25 = "source - account";
                                                                                                n14 = 6;
                                                                                                float f15 = 8.4E-45f;
                                                                                                at2_1.h(ajioHomeActivity, string25, n14);
                                                                                                this.d3();
                                                                                            }
                                                                                        }
                                                                                        Unit unit = Unit.a;
                                                                                        return;
                                                                                    }
                                                                                    q9_0.Companion.getClass();
                                                                                    object7 = q9_0.Q2;
                                                                                    n10 = b.i(string2, (String)object7, n7 != 0);
                                                                                    if (n10 != 0) {
                                                                                        if (n3 == n17) {
                                                                                            b$a b$a = com.ril.ajio.myaccount.order.fragment.b.Companion;
                                                                                            b$a.getClass();
                                                                                            object7 = b$a.a();
                                                                                            ((Fragment)object7).setArguments(bundle);
                                                                                            object3 = this.T0;
                                                                                            object6 = com.ril.ajio.myaccount.order.fragment.b.Z;
                                                                                            object5 = Boolean.FALSE;
                                                                                            n7 = 1;
                                                                                            f6 = Float.MIN_VALUE;
                                                                                            AjioHomeActivity ajioHomeActivity9 = this;
                                                                                            this.Q1((Fragment)object3, (Fragment)object7, n7 != 0, (String)object6, (Boolean)object5);
                                                                                        }
                                                                                        Unit unit = Unit.a;
                                                                                        return;
                                                                                    }
                                                                                    px0_1.Companion.getClass();
                                                                                    object7 = "Px0";
                                                                                    n10 = b.i(string2, (String)object7, n7 != 0);
                                                                                    if (n10 != 0) {
                                                                                        Fragment fragment2 = this.T0;
                                                                                        if (fragment2 != null) {
                                                                                            FragmentManager fragmentManager = fragment2.getChildFragmentManager();
                                                                                            fragmentManager.W();
                                                                                        }
                                                                                        Unit unit = Unit.a;
                                                                                        return;
                                                                                    }
                                                                                    object7 = "category_detail_link";
                                                                                    n10 = (int)(b.i(string2, (String)object7, n7 != 0) ? 1 : 0);
                                                                                    if (n10 == 0) break block143;
                                                                                    if (bundle != null) {
                                                                                        String string26 = bundle.getString("CORE_CATEGORY_ID");
                                                                                    } else {
                                                                                        n18 = 0;
                                                                                        Object var5_53 = null;
                                                                                        float f16 = 0.0f;
                                                                                    }
                                                                                    if (object3 != null) {
                                                                                        String string27 = object3.getString("CORE_CATEGORY_SCREEN_TYPE");
                                                                                    } else {
                                                                                        n14 = 0;
                                                                                        Object var26_213 = null;
                                                                                        float f17 = 0.0f;
                                                                                    }
                                                                                    object3 = "landingpage";
                                                                                    boolean bl7 = ((String)object3).equalsIgnoreCase((String)var26_214);
                                                                                    object7 = "parentFragment";
                                                                                    if (!bl7) break block144;
                                                                                    if (var5_54 != null && (n14 = (int)(ajioHomeActivity.V2((String)var5_54, false) ? 1 : 0)) != 0) {
                                                                                        Fragment fragment3 = ajioHomeActivity.T0;
                                                                                        if (fragment3 != null) {
                                                                                            object6.getClass();
                                                                                            Intrinsics.checkNotNullParameter(var5_54, "pageId");
                                                                                            Intrinsics.checkNotNullParameter(fragment3, (String)object7);
                                                                                            object3 = q9$a.b(null, (String)var5_54);
                                                                                            object7 = ((s71)object6).a;
                                                                                            j3$a.a((j3_0)object7, fragment3, (Fragment)object3, n7 != 0, (String)var5_54);
                                                                                            Unit unit = Unit.a;
                                                                                        }
                                                                                        break block145;
                                                                                    } else {
                                                                                        TabLayout tabLayout = this.W0();
                                                                                        if (tabLayout == null || (n18 = tabLayout.getSelectedTabPosition()) != 0) {
                                                                                            ajioHomeActivity.U1(0);
                                                                                        }
                                                                                        Unit unit = Unit.a;
                                                                                    }
                                                                                    break block145;
                                                                                }
                                                                                object3 = "storelandingpage";
                                                                                n14 = (int)(((String)object3).equalsIgnoreCase((String)var26_214) ? 1 : 0);
                                                                                if (n14 != 0 && var5_54 != null && (fragment = ajioHomeActivity.T0) != null) {
                                                                                    object6.getClass();
                                                                                    Intrinsics.checkNotNullParameter(var5_54, "storePageId");
                                                                                    Intrinsics.checkNotNullParameter(fragment, (String)object7);
                                                                                    ed3_2.Companion.getClass();
                                                                                    object3 = ed3$a.a(null, (String)var5_54);
                                                                                    object7 = ((s71)object6).a;
                                                                                    j3$a.a((j3_0)object7, fragment, (Fragment)object3, n7 != 0, (String)var5_54);
                                                                                    Unit unit = Unit.a;
                                                                                }
                                                                            }
                                                                            Unit unit = Unit.a;
                                                                            return;
                                                                        }
                                                                        object6 = com.ril.ajio.myaccount.order.fragment.b.Z;
                                                                        n10 = (int)(b.i(string2, (String)object6, n7 != 0) ? 1 : 0);
                                                                        n17 = 2;
                                                                        object = "res";
                                                                        object2 = "format(...)";
                                                                        string3 = "OperationRequirement is Null";
                                                                        object4 = "product_code";
                                                                        string6 = "clicked_item_code";
                                                                        if (n10 == 0) break block146;
                                                                        if (n3 == n7) break block147;
                                                                        if (n3 == n17) break block148;
                                                                        n16 = 3;
                                                                        float f18 = 4.2E-45f;
                                                                        if (n3 == n16) break block149;
                                                                        n16 = 4;
                                                                        f18 = 5.6E-45f;
                                                                        if (n3 == n16) break block150;
                                                                        n16 = 1230;
                                                                        f18 = 1.724E-42f;
                                                                        if (n3 == n16) break block151;
                                                                        n16 = 1231;
                                                                        f18 = 1.725E-42f;
                                                                        if (n3 != n16) {
                                                                            n16 = 12134;
                                                                            f18 = 1.7003E-41f;
                                                                            if (n3 == n16) {
                                                                                this.onBackPressed();
                                                                            }
                                                                            break block152;
                                                                        } else {
                                                                            this.D0();
                                                                        }
                                                                        break block152;
                                                                    }
                                                                    AjioHomeActivity$a ajioHomeActivity$a = Companion;
                                                                    ajioHomeActivity$a.getClass();
                                                                    AjioHomeActivity$a.a((Context)this);
                                                                    break block152;
                                                                }
                                                                if (bundle != null) {
                                                                    String string28;
                                                                    n16 = (int)(bundle.containsKey(string6) ? 1 : 0);
                                                                    if (n16 != 0) {
                                                                        object2 = bundle.getString(string6);
                                                                        string28 = object2;
                                                                    } else {
                                                                        string28 = null;
                                                                    }
                                                                    String string29 = "exchange_id";
                                                                    n14 = (int)(object3.containsKey(string29) ? 1 : 0);
                                                                    if (n14 != 0) {
                                                                        object8 = object3.getString(string29);
                                                                    }
                                                                    Object object9 = object8;
                                                                    object = bg2_1.Companion;
                                                                    String string30 = object3.getString((String)object4);
                                                                    Object var39_306 = null;
                                                                    int n21 = 56;
                                                                    object7 = bg2$a.a((bg2$a)object, string30, string28, (String)object8, null, false, false, n21);
                                                                    n16 = (int)(this.isFinishing() ? 1 : 0);
                                                                    if (n16 == 0) {
                                                                        object3 = ajioHomeActivity.T0;
                                                                        object5 = Boolean.FALSE;
                                                                        n7 = 1;
                                                                        f6 = Float.MIN_VALUE;
                                                                        object6 = "OrderSummaryFragment";
                                                                        AjioHomeActivity ajioHomeActivity10 = this;
                                                                        this.Q1((Fragment)object3, (Fragment)object7, n7 != 0, (String)object6, (Boolean)object5);
                                                                    }
                                                                }
                                                                break block152;
                                                            }
                                                            if (bundle != null) {
                                                                bg2$a bg2$a = bg2_1.Companion;
                                                                String string31 = bundle.getString((String)object4);
                                                                String string32 = bundle.getString(string6);
                                                                object8 = bundle.getString("RETURN_ID");
                                                                bl2 = bundle.getBoolean("IS_RETURN_ID_REDIRECTION");
                                                                string7 = null;
                                                                bl3 = false;
                                                                string3 = null;
                                                                int n22 = 16;
                                                                object4 = bg2$a;
                                                                string6 = string31;
                                                                object7 = bg2$a.a(bg2$a, string31, string32, null, (String)object8, false, bl2, n22);
                                                                n16 = (int)(this.isFinishing() ? 1 : 0);
                                                                if (n16 == 0) {
                                                                    object3 = this.T0;
                                                                    object5 = Boolean.FALSE;
                                                                    n7 = 1;
                                                                    f6 = Float.MIN_VALUE;
                                                                    object6 = "OrderSummaryFragment";
                                                                    AjioHomeActivity ajioHomeActivity11 = this;
                                                                    this.Q1((Fragment)object3, (Fragment)object7, n7 != 0, (String)object6, (Boolean)object5);
                                                                }
                                                                break block152;
                                                            } else {
                                                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                                                n16 = R$string.acc_error_message;
                                                                String string33 = hv3_0.K(n16);
                                                                Object[] objectArray = new Object[n7];
                                                                boolean bl8 = false;
                                                                object3 = null;
                                                                objectArray[0] = string3;
                                                                Object[] objectArray2 = Arrays.copyOf(objectArray, n7);
                                                                String string34 = String.format(string33, objectArray2);
                                                                Intrinsics.checkNotNullExpressionValue(string34, (String)object2);
                                                                Intrinsics.checkNotNullParameter(string3, (String)object);
                                                            }
                                                            break block152;
                                                        }
                                                        if (bundle != null) {
                                                            void var28_280;
                                                            void var26_224;
                                                            String string35;
                                                            yN2$a yN2$a = yn2_2.Companion;
                                                            String string36 = bundle.getString((String)object4);
                                                            if (string36 == null) {
                                                                String string37 = object8;
                                                            }
                                                            if ((string35 = object3.getString((String)(object7 = "return_refund_return_id"))) == null) {
                                                                String string38 = object8;
                                                            }
                                                            if ((object3 = object3.getString(string6)) != null) {
                                                                object8 = object3;
                                                            }
                                                            yN2$a.getClass();
                                                            Intrinsics.checkNotNullParameter(var26_224, "orderCode");
                                                            Intrinsics.checkNotNullParameter(var28_280, "returnId");
                                                            Intrinsics.checkNotNullParameter(object8, "productCode");
                                                            yn2_2 yn2_22 = new yn2_2();
                                                            Bundle bundle6 = px1_2.b((String)object4, (String)var26_224, (String)object7, (String)var28_280);
                                                            bundle6.putString(string6, (String)object8);
                                                            yn2_22.setArguments(bundle6);
                                                            object3 = ajioHomeActivity.T0;
                                                            object5 = Boolean.FALSE;
                                                            n7 = 1;
                                                            f6 = Float.MIN_VALUE;
                                                            object6 = "RETURN_ORDER";
                                                            AjioHomeActivity ajioHomeActivity12 = this;
                                                            object7 = yn2_22;
                                                            this.Q1((Fragment)object3, yn2_22, n7 != 0, (String)object6, (Boolean)object5);
                                                            Unit unit = Unit.a;
                                                        }
                                                        break block152;
                                                    }
                                                    if (bundle != null) {
                                                        String string39;
                                                        boolean bl9 = bundle.containsKey(string6);
                                                        if (bl9) {
                                                            object2 = bundle.getString(string6);
                                                            string39 = object2;
                                                        } else {
                                                            string39 = null;
                                                        }
                                                        object = bg2_1.Companion;
                                                        String string40 = object3.getString((String)object4);
                                                        Object var39_307 = null;
                                                        Object var37_302 = null;
                                                        int n24 = 60;
                                                        object7 = bg2$a.a((bg2$a)object, string40, string39, null, null, false, false, n24);
                                                        bl9 = this.isFinishing();
                                                        if (!bl9) {
                                                            object3 = ajioHomeActivity.T0;
                                                            object5 = Boolean.FALSE;
                                                            n7 = 1;
                                                            f6 = Float.MIN_VALUE;
                                                            object6 = "OrderSummaryFragment";
                                                            AjioHomeActivity ajioHomeActivity13 = this;
                                                            this.Q1((Fragment)object3, (Fragment)object7, n7 != 0, (String)object6, (Boolean)object5);
                                                        }
                                                    } else {
                                                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                                        int n25 = R$string.acc_error_message;
                                                        String string41 = hv3_0.K(n25);
                                                        Object[] objectArray = new Object[n7];
                                                        boolean bl10 = false;
                                                        object3 = null;
                                                        objectArray[0] = string3;
                                                        Object[] objectArray3 = Arrays.copyOf(objectArray, n7);
                                                        String string42 = String.format(string41, objectArray3);
                                                        Intrinsics.checkNotNullExpressionValue(string42, (String)object2);
                                                        Intrinsics.checkNotNullParameter(string3, (String)object);
                                                    }
                                                }
                                                Unit unit = Unit.a;
                                                return;
                                            }
                                            object7 = "OrderListItemDetailFragment";
                                            n10 = (int)(b.i(string2, (String)object7, n7 != 0) ? 1 : 0);
                                            object8 = "BASE_PRODUCT_ID";
                                            string4 = "RATING";
                                            if (n10 != 0 || (n10 = (int)(b.i(string2, (String)(object7 = "OrderSummaryFragment"), n7 != 0) ? 1 : 0)) != 0) break block153;
                                            n10 = (int)(this.isFinishing() ? 1 : 0);
                                            if (n10 == 0 && (n10 = (int)(b.i(string2, (String)(object7 = "com.ril.ajio.myaccount.order.cancel.CancelReasonFragment"), n7 != 0) ? 1 : 0)) != 0) {
                                                if (n3 == n7) {
                                                    boolean bl11;
                                                    Fragment fragment = this.T0;
                                                    if (fragment != null) {
                                                        object2 = fragment.getChildFragmentManager();
                                                    } else {
                                                        bl2 = false;
                                                        object2 = null;
                                                    }
                                                    if (object2 != null && !(bl11 = ((FragmentManager)object2).S())) {
                                                        ((FragmentManager)object2).W();
                                                    }
                                                }
                                                Unit unit = Unit.a;
                                                return;
                                            }
                                            object7 = "ZoomFragment";
                                            n10 = (int)(b.i(string8, (String)object7, n7 != 0) ? 1 : 0);
                                            if (n10 != 0) {
                                                n10 = 2;
                                                float f19 = 2.8E-45f;
                                                if (n14 == n10) {
                                                    void var5_86;
                                                    void var5_83;
                                                    float f20;
                                                    boolean bl12;
                                                    FragmentManager fragmentManager;
                                                    Fragment fragment;
                                                    Fragment fragment4 = ajioHomeActivity.T0;
                                                    if (fragment4 != null) {
                                                        FragmentManager fragmentManager2 = fragment4.getChildFragmentManager();
                                                        String string43 = "getChildFragmentManager(...)";
                                                        Intrinsics.checkNotNullExpressionValue(fragmentManager2, string43);
                                                        fragmentManager2.W();
                                                    }
                                                    if ((fragment = ajioHomeActivity.T0) != null && (fragmentManager = fragment.getChildFragmentManager()) != null) {
                                                        String string44 = "NewProductDetailsFragment";
                                                        Fragment fragment5 = fragmentManager.E(string44);
                                                    } else {
                                                        bl12 = false;
                                                        f20 = 0.0f;
                                                        Object var5_82 = null;
                                                    }
                                                    n14 = var5_83 instanceof NewProductDetailsFragment;
                                                    if (n14 != 0) {
                                                        NewProductDetailsFragment newProductDetailsFragment = (NewProductDetailsFragment)var5_83;
                                                    } else {
                                                        bl12 = false;
                                                        f20 = 0.0f;
                                                        Object var5_85 = null;
                                                    }
                                                    if (var5_86 != null) {
                                                        void var26_235;
                                                        long l2;
                                                        if (object3 != null) {
                                                            l2 = object3.getLong("playBackTime");
                                                            Long l3 = l2;
                                                        } else {
                                                            n14 = 0;
                                                            float f22 = 0.0f;
                                                            Object var26_234 = null;
                                                        }
                                                        if (var26_235 != null) {
                                                            var5_86.Y = l2 = var26_235.longValue();
                                                        }
                                                        Unit unit = Unit.a;
                                                    }
                                                    if (var5_86 != null) {
                                                        if (object3 != null) {
                                                            String string45 = "playBackPosition";
                                                            n14 = object3.getInt(string45);
                                                            object2 = n14;
                                                        } else {
                                                            bl2 = false;
                                                            object2 = null;
                                                        }
                                                        if (object2 != null) {
                                                            var5_86.Z = n14 = ((Integer)object2).intValue();
                                                        }
                                                        Unit unit = Unit.a;
                                                    }
                                                }
                                                Unit unit = Unit.a;
                                                return;
                                            }
                                            object7 = "NewNotificationCenterActivityFragment";
                                            n10 = (int)(Intrinsics.areEqual(string8, object7) ? 1 : 0);
                                            if (n10 != 0) {
                                                if (object3 == null) return;
                                                Intent intent = new Intent();
                                                Uri uri = Uri.parse((String)object3.getString("noti_uri"));
                                                intent.setData(uri);
                                                intent.putExtras((Bundle)object3);
                                                kj0_1.g().o(ajioHomeActivity, intent, n7 != 0);
                                                GTMEvents gTMEvents = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                                String string46 = "Noti_click";
                                                object3 = "NotificationCenter";
                                                gTMEvents.pushButtonTapEvent(string46, (String)object3);
                                                Unit unit = Unit.a;
                                                return;
                                            }
                                            object7 = "RatingFeedbackFragment";
                                            n10 = (int)(Intrinsics.areEqual(string8, object7) ? 1 : 0);
                                            if (n10 != 0) {
                                                b$a b$a = com.ril.ajio.myaccount.order.fragment.b.Companion;
                                                b$a.getClass();
                                                object7 = b$a.a();
                                                boolean bl13 = this.isFinishing();
                                                if (!bl13) {
                                                    object3 = ajioHomeActivity.T0;
                                                    object5 = Boolean.FALSE;
                                                    n7 = 0;
                                                    f6 = 0.0f;
                                                    Object var28_281 = null;
                                                    object6 = "RatingFeedbackFragment";
                                                    AjioHomeActivity ajioHomeActivity14 = this;
                                                    this.Q1((Fragment)object3, (Fragment)object7, false, (String)object6, (Boolean)object5);
                                                }
                                                Unit unit = Unit.a;
                                                return;
                                            }
                                            object7 = "RETURN_ORDER";
                                            n10 = (int)(Intrinsics.areEqual(string8, object7) ? 1 : 0);
                                            if (n10 != 0) {
                                                if (object3 != null) {
                                                    void var5_99;
                                                    float f23;
                                                    FragmentManager fragmentManager;
                                                    Fragment fragment = ajioHomeActivity.T0;
                                                    if (fragment != null && (fragmentManager = fragment.getChildFragmentManager()) != null) {
                                                        Fragment fragment6 = fragmentManager.E((String)object6);
                                                    } else {
                                                        boolean bl14 = false;
                                                        f23 = 0.0f;
                                                        Object var5_98 = null;
                                                    }
                                                    n14 = var5_99 instanceof com.ril.ajio.myaccount.order.fragment.b;
                                                    if (n14 != 0) {
                                                        object2 = var5_99;
                                                        object2 = (com.ril.ajio.myaccount.order.fragment.b)var5_99;
                                                    } else {
                                                        bl2 = false;
                                                        object2 = null;
                                                    }
                                                    if (object2 != null) {
                                                        f23 = object3.getFloat(string4);
                                                        String string47 = object3.getString((String)object8);
                                                        ((com.ril.ajio.myaccount.order.fragment.b)object2).Wa(f23, string47);
                                                        Unit unit = Unit.a;
                                                    }
                                                }
                                                Unit unit = Unit.a;
                                                return;
                                            }
                                            n15 = Intrinsics.areEqual(string8, string7);
                                            if (n15 != 0) {
                                                n15 = 929;
                                                f7 = 1.302E-42f;
                                                if (n14 == n15) {
                                                    q5_0.Companion.getClass();
                                                    q5_0 q5_03 = new q5_0();
                                                    ajioHomeActivity.L2(q5_03, string7, n7 != 0);
                                                    Unit unit = Unit.a;
                                                    return;
                                                }
                                            }
                                            n15 = 35;
                                            f7 = 4.9E-44f;
                                            if (n14 == n15) break block154;
                                            n15 = 66;
                                            f7 = 9.2E-44f;
                                            if (n14 == n15) {
                                                void var5_109;
                                                FragmentManager fragmentManager;
                                                Fragment fragment = ajioHomeActivity.T0;
                                                if (fragment != null && (fragmentManager = fragment.getChildFragmentManager()) != null) {
                                                    Fragment fragment7 = fragmentManager.E(string7);
                                                } else {
                                                    n15 = 0;
                                                    f7 = 0.0f;
                                                    Object var5_108 = null;
                                                }
                                                n14 = var5_109 instanceof q5_0;
                                                if (n14 != 0) {
                                                    object2 = var5_109;
                                                    object2 = (q5_0)var5_109;
                                                } else {
                                                    bl2 = false;
                                                    object2 = null;
                                                }
                                                if (object2 != null) {
                                                    ((q5_0)object2).Qa();
                                                    Unit unit = Unit.a;
                                                }
                                            }
                                            break block155;
                                        }
                                        if (object3 == null) break block156;
                                        n15 = (int)(object3.containsKey(string6) ? 1 : 0);
                                        String string48 = n15 != 0 ? (string5 = object3.getString(string6)) : null;
                                        n15 = (int)(object3.containsKey(object4) ? 1 : 0);
                                        if (n15 != 0) {
                                            object2 = object3.getString(object4);
                                        } else {
                                            bl2 = false;
                                            object2 = null;
                                        }
                                        String string49 = "is_from_customer_care_page";
                                        n14 = (int)(object3.containsKey(string49) ? 1 : 0);
                                        boolean bl15 = n14 != 0 ? (bl3 = object3.getBoolean(string49)) : false;
                                        if (string48 != null && (n15 = string48.length()) != 0 && object2 != null && (n15 = ((String)object2).length()) != 0) {
                                            bg2$a bg2$a = bg2_1.Companion;
                                            boolean bl16 = false;
                                            int n26 = 44;
                                            object7 = bg2$a.a(bg2$a, (String)object2, string48, null, null, bl15, false, n26);
                                            n15 = (int)(this.isFinishing() ? 1 : 0);
                                            if (n15 == 0) {
                                                object3 = ajioHomeActivity.T0;
                                                object5 = Boolean.FALSE;
                                                n7 = 1;
                                                f6 = Float.MIN_VALUE;
                                                object6 = "OrderSummaryFragment";
                                                AjioHomeActivity ajioHomeActivity15 = this;
                                                this.Q1((Fragment)object3, (Fragment)object7, n7 != 0, (String)object6, (Boolean)object5);
                                            }
                                            break block155;
                                        } else {
                                            com.ril.ajio.myaccount.order.fragment.b.Companion.getClass();
                                            object7 = b$a.a();
                                            Bundle bundle7 = new Bundle();
                                            bundle7.putString("ORDER_NO", (String)object2);
                                            ((Fragment)object7).setArguments(bundle7);
                                            object3 = ajioHomeActivity.T0;
                                            object5 = Boolean.FALSE;
                                            n7 = 1;
                                            f6 = Float.MIN_VALUE;
                                            AjioHomeActivity ajioHomeActivity16 = this;
                                            this.Q1((Fragment)object3, (Fragment)object7, n7 != 0, (String)object6, (Boolean)object5);
                                        }
                                        break block155;
                                    }
                                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                    n15 = R$string.acc_error_message;
                                    String string50 = hv3_0.K(n15);
                                    Object[] objectArray = new Object[n7];
                                    boolean bl17 = false;
                                    object3 = null;
                                    objectArray[0] = string3;
                                    Object[] objectArray4 = Arrays.copyOf(objectArray, n7);
                                    String string51 = String.format(string50, objectArray4);
                                    Intrinsics.checkNotNullExpressionValue(string51, (String)object2);
                                    Intrinsics.checkNotNullParameter(string3, (String)object);
                                }
                                Unit unit = Unit.a;
                                return;
                            }
                            n4 = 923;
                            f5 = 1.293E-42f;
                            if (n14 == n4) break block157;
                            n4 = 924;
                            f5 = 1.295E-42f;
                            n10 = 33;
                            float f24 = 4.6E-44f;
                            if (n14 == n4) break block158;
                            n4 = 926;
                            f5 = 1.298E-42f;
                            if (n14 == n4) break block159;
                            n4 = 927;
                            f5 = 1.299E-42f;
                            if (n14 == n4) break block160;
                            n4 = 930;
                            f5 = 1.303E-42f;
                            if (n14 == n4 && object3 != null) {
                                void var5_124;
                                n4 = Build.VERSION.SDK_INT;
                                if (n4 >= n10) {
                                    Serializable serializable = F7.a(bundle);
                                } else {
                                    void var5_122;
                                    Serializable serializable = object3.getSerializable((String)object5);
                                    n14 = serializable instanceof ProfileHealth;
                                    if (n14 == 0) {
                                        n4 = 0;
                                        f5 = 0.0f;
                                        Object var5_121 = null;
                                    }
                                    ProfileHealth profileHealth = (ProfileHealth)var5_122;
                                }
                                ProfileHealth profileHealth = (ProfileHealth)var5_124;
                                if (profileHealth != null) {
                                    Ag1$a ag1$a = ag1_1.Companion;
                                    object7 = "profileType";
                                    String string52 = object3.getString((String)object7, (String)object7);
                                    Intrinsics.checkNotNullExpressionValue(string52, "getString(...)");
                                    object6 = "knowMore";
                                    object3 = object3.getString((String)object6, (String)object6);
                                    ag1$a.getClass();
                                    Intrinsics.checkNotNullParameter(string52, (String)object7);
                                    Intrinsics.checkNotNullParameter(profileHealth, "profileHealth");
                                    ag1_1 ag1_12 = new ag1_1();
                                    ag1_12.d = object3;
                                    ag1_12.e = profileHealth;
                                    n4 = 0;
                                    f5 = 0.0f;
                                    Object var5_126 = null;
                                    ag1_12.g = null;
                                    object7 = ag1_12;
                                } else {
                                    n4 = 0;
                                    f5 = 0.0f;
                                    Object var5_127 = null;
                                    n10 = 0;
                                    object7 = null;
                                    f24 = 0.0f;
                                }
                                n4 = (int)(this.isFinishing() ? 1 : 0);
                                if (n4 == 0) {
                                    object3 = ajioHomeActivity.T0;
                                    object5 = Boolean.FALSE;
                                    n7 = 0;
                                    f6 = 0.0f;
                                    Object var28_283 = null;
                                    object6 = "IncentivizeKnowMore";
                                    AjioHomeActivity ajioHomeActivity17 = this;
                                    this.Q1((Fragment)object3, (Fragment)object7, false, (String)object6, (Boolean)object5);
                                }
                            }
                            break block130;
                        }
                        n4 = 0;
                        f5 = 0.0f;
                        Object var5_128 = null;
                        if (object3 != null) {
                            void var26_255;
                            FragmentManager fragmentManager;
                            Fragment fragment = ajioHomeActivity.T0;
                            if (fragment != null && (fragmentManager = fragment.getChildFragmentManager()) != null) {
                                Fragment fragment8 = fragmentManager.E((String)object6);
                            } else {
                                n14 = 0;
                                Object var26_254 = null;
                                float f25 = 0.0f;
                            }
                            n10 = var26_255 instanceof com.ril.ajio.myaccount.order.fragment.b;
                            if (n10 != 0) {
                                object2 = var26_255;
                                object2 = (com.ril.ajio.myaccount.order.fragment.b)var26_255;
                            } else {
                                bl2 = false;
                                object2 = null;
                            }
                            if (object2 != null) {
                                f5 = object3.getFloat(string4);
                                String string53 = object3.getString((String)object8);
                                ((com.ril.ajio.myaccount.order.fragment.b)object2).Wa(f5, string53);
                                Unit unit = Unit.a;
                            }
                        }
                        break block130;
                    }
                    if (object3 != null) {
                        ajioHomeActivity.Z2((Bundle)object3);
                    }
                    break block130;
                }
                n4 = 0;
                f5 = 0.0f;
                Object var5_130 = null;
                if (object3 != null) {
                    void var5_134;
                    n14 = Build.VERSION.SDK_INT;
                    object6 = "RETURN_ITEMS_DATA";
                    if (n14 >= n10) {
                        object5 = D7.a(bundle);
                    } else {
                        object5 = object3.getSerializable((String)object6);
                        n8 = object5 instanceof ReturnOrderItemDetails;
                        if (n8 == 0) {
                            boolean bl18 = false;
                            object5 = null;
                        }
                        object5 = (ReturnOrderItemDetails)object5;
                    }
                    object5 = (ReturnOrderItemDetails)object5;
                    if (object5 == null) {
                        return;
                    }
                    object4 = ((ReturnOrderItemDetails)object5).getDeliveryAddress();
                    if (object4 != null) {
                        object4 = ((ReturnOrderItemDetails)object5).getDeliveryAddress();
                        ((CartDeliveryAddress)object4).setDefaultAddress(n7 != 0);
                        String string54 = ((ReturnOrderItemDetails)object5).getDeliveryAddress().getId();
                        ((ReturnOrderItemDetails)object5).setDefaultAddressId(string54);
                    }
                    object4 = ExReturnAddressActivity.class;
                    Intent intent = new Intent((Context)ajioHomeActivity, object4);
                    intent.putExtra((String)object6, (Serializable)object5);
                    object6 = "GIFTS_ITEMS_DATA";
                    if (n14 >= n10) {
                        Serializable serializable = E7.a(bundle);
                    } else {
                        Serializable serializable = object3.getSerializable((String)object6);
                        n10 = serializable instanceof HashMap;
                        if (n10 == 0) {
                            bl2 = false;
                            object2 = null;
                        } else {
                            object2 = serializable;
                        }
                        Object object10 = object2;
                        HashMap hashMap = (HashMap)object2;
                    }
                    HashMap hashMap = (HashMap)var5_134;
                    String string55 = "IS_FROM_JOUNRNEY";
                    n10 = (int)(object3.containsKey(string55) ? 1 : 0);
                    if (n10 != 0) {
                        object7 = object3.getString(string55);
                        intent.putExtra(string55, (String)object7);
                        String string56 = "product_id";
                        object7 = object3.getString(string56);
                        intent.putExtra(string56, (String)object7);
                        String string57 = "order_status";
                        object7 = object3.getString(string57);
                        intent.putExtra(string57, (String)object7);
                        String string58 = "order_id";
                        object7 = object3.getString(string58);
                        intent.putExtra(string58, (String)object7);
                        String string59 = "non_refundable_fee";
                        object7 = object3.getString(string59);
                        intent.putExtra(string59, (String)object7);
                        String string60 = "discounts";
                        object7 = object3.getString(string60);
                        intent.putExtra(string60, (String)object7);
                        String string61 = "return_percentage";
                        object3 = object3.getString(string61);
                        intent.putExtra(string61, (String)object3);
                    }
                    intent.putExtra((String)object6, (Serializable)hashMap);
                    ajioHomeActivity.startActivity(intent);
                    break block130;
                } else {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    n4 = R$string.acc_error_message;
                    String string62 = hv3_0.K(n4);
                    Object[] objectArray = new Object[n7];
                    boolean bl19 = false;
                    object3 = null;
                    objectArray[0] = string3;
                    Object[] objectArray5 = Arrays.copyOf(objectArray, n7);
                    String string63 = String.format(string62, objectArray5);
                    Intrinsics.checkNotNullExpressionValue(string63, (String)object2);
                    mq0_2.b(string3, string63);
                }
                break block130;
            }
            if (object3 != null) {
                String string64 = object3.getString("PRODUCT_CODE");
                if (string64 != null) {
                    ri2$a ri2$a = new ri2$a();
                    ri2$a.b = string64;
                    ri2_0 ri2_02 = ri2$a.a();
                    ajioHomeActivity.n0(ri2_02);
                }
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                n4 = R$string.acc_error_message;
                String string65 = hv3_0.K(n4);
                Object[] objectArray = new Object[n7];
                boolean bl20 = false;
                object3 = null;
                objectArray[0] = string3;
                Object[] objectArray6 = Arrays.copyOf(objectArray, n7);
                String string66 = String.format(string65, objectArray6);
                Intrinsics.checkNotNullExpressionValue(string66, (String)object2);
                Intrinsics.checkNotNullParameter(string3, (String)object);
            }
        }
        Unit unit = Unit.a;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onNewIntent(Intent intent) {
        block30: {
            float f5;
            int n3;
            Object object;
            float f6;
            int n4;
            Object object2;
            AjioHomeActivity ajioHomeActivity;
            block31: {
                void var8_16;
                String string2;
                int n7;
                boolean bl2;
                block32: {
                    block29: {
                        int n8;
                        ajioHomeActivity = this;
                        Intrinsics.checkNotNullParameter(intent, "intent");
                        object2 = "THANK_YOU_TO_MISC_DEEPLINK_URL";
                        n4 = intent.hasExtra((String)object2);
                        bl2 = false;
                        f6 = 0.0f;
                        object = null;
                        if (!n4) break block29;
                        this.U2();
                        Bundle bundle = intent.getExtras();
                        if (bundle != null) {
                            object = bundle.getString((String)object2);
                        }
                        if (object != null && (n8 = ((String)object).length()) != 0) {
                            object2 = kj0_1.g();
                            object = Uri.parse((String)object);
                            boolean bl3 = false;
                            float f7 = 0.0f;
                            boolean bl4 = false;
                            Object var13_37 = null;
                            Object var14_42 = null;
                            AjioHomeActivity ajioHomeActivity2 = this;
                            ((kj0_1)object2).n(this, (Uri)object, null, false, false);
                        }
                        break block30;
                    }
                    object2 = "OPTYPE";
                    n4 = intent.hasExtra((String)object2);
                    n3 = 0;
                    f5 = 0.0f;
                    if (!n4) break block31;
                    n7 = intent.getIntExtra((String)object2, 0);
                    if (n7 == (n4 = 35)) break block32;
                    n4 = 667;
                    if (n7 == n4) {
                        this.setIntent(null);
                        this.U1(0);
                    }
                    break block30;
                }
                object2 = intent.getExtras();
                if (object2 == null) {
                    return;
                }
                String string3 = "clicked_item_code";
                boolean bl5 = object2.containsKey(string3);
                String string4 = bl5 ? (string2 = object2.getString(string3)) : null;
                String string5 = "product_code";
                bl5 = object2.containsKey(string5);
                if (bl5) {
                    object = object2.getString(string5);
                }
                String string6 = object;
                String string7 = "exchange_id";
                bl2 = object2.containsKey(string7);
                if (bl2) {
                    String string8 = object2.getString(string7);
                } else {
                    String string9 = "";
                }
                void var17_49 = var8_16;
                String string10 = "is_from_customer_care_page";
                bl2 = object2.containsKey(string10);
                int n10 = bl2 ? (n3 = object2.getBoolean(string10)) : 0;
                if (string4 != null && (n7 = string4.length()) && string6 != null && (n7 = string6.length())) {
                    this.U2();
                    bg2$a bg2$a = bg2_1.Companion;
                    int n14 = 40;
                    object = bg2$a.a(bg2$a, string6, string4, (String)var17_49, null, n10 != 0, false, n14);
                    n7 = this.isFinishing();
                    if (!n7) {
                        Fragment fragment = ajioHomeActivity.T0;
                        Boolean bl6 = Boolean.FALSE;
                        n3 = 1;
                        f5 = Float.MIN_VALUE;
                        String string11 = "OrderSummaryFragment";
                        object2 = this;
                        this.Q1(fragment, (Fragment)object, n3 != 0, string11, bl6);
                    }
                    break block30;
                } else {
                    this.U2();
                    com.ril.ajio.myaccount.order.fragment.b.Companion.getClass();
                    object = b$a.a();
                    object2 = new Bundle();
                    object2.putString("ORDER_NO", string6);
                    ((Fragment)object).setArguments((Bundle)object2);
                    Fragment fragment = ajioHomeActivity.T0;
                    String string12 = com.ril.ajio.myaccount.order.fragment.b.Z;
                    Boolean bl7 = Boolean.FALSE;
                    n3 = 1;
                    f5 = Float.MIN_VALUE;
                    object2 = this;
                    this.Q1(fragment, (Fragment)object, n3 != 0, string12, bl7);
                }
                break block30;
            }
            object2 = "plp-coupon-bonanza";
            int n15 = intent.hasExtra((String)object2);
            if (n15 != 0) {
                this.U2();
                object2 = intent.getExtras();
                if (object2 != null) {
                    String string13 = "BUNDLE_PLP_LINK";
                    object = object2.getString(string13);
                }
                object2 = kj0_1.g();
                object = Uri.parse((String)object);
                boolean bl8 = false;
                Object var13_40 = null;
                Object var14_45 = null;
                n3 = 0;
                f5 = 0.0f;
                AjioHomeActivity ajioHomeActivity3 = this;
                ((kj0_1)object2).n(this, (Uri)object, null, false, false);
            } else {
                object2 = "GOTO_PLP_FROM_THANKYOU_AGE";
                n15 = intent.hasExtra((String)object2);
                if (n15 != 0) {
                    this.W2(intent);
                } else {
                    object2 = "gotoAjioWallet";
                    n15 = intent.getBooleanExtra((String)object2, false);
                    n4 = 1;
                    if (n15 != 0) {
                        q5_0.Companion.getClass();
                        object2 = new q5_0();
                        object = "AjioCashFragmentRefresh";
                        this.L2((Fragment)object2, (String)object, n4 != 0);
                    } else {
                        object2 = "gotocloset";
                        n15 = intent.getBooleanExtra((String)object2, false);
                        if (n15 != 0) {
                            n15 = 2;
                            this.U1(n15);
                        } else {
                            object2 = "gotoReferral";
                            n15 = (int)(intent.getBooleanExtra((String)object2, false) ? 1 : 0);
                            if (n15 != 0) {
                                Fragment fragment = this.T0;
                                object2 = gg2_1.Companion;
                                f6 = intent.getFloatExtra("REFEREE_EARN_AMOUNT", 0.0f);
                                f5 = intent.getFloatExtra("REFERRER_EARN_AMOUNT", 0.0f);
                                object2.getClass();
                                object = GG2$a.a(f6, f5);
                                Boolean bl9 = Boolean.FALSE;
                                n3 = 1;
                                f5 = Float.MIN_VALUE;
                                String string14 = "ReferralFragment";
                                object2 = this;
                                this.Q1(fragment, (Fragment)object, n3 != 0, string14, bl9);
                            } else {
                                object2 = "deeplinkData";
                                boolean bl10 = intent.hasExtra((String)object2);
                                if (bl10) {
                                    Boolean bl11;
                                    this.x1 = bl11 = Boolean.TRUE;
                                    n4 = Build.VERSION.SDK_INT;
                                    n3 = 33;
                                    f5 = 4.6E-44f;
                                    if (n4 > n3) {
                                        object2 = (Parcelable)B7.a(intent);
                                    } else {
                                        n4 = (object2 = intent.getParcelableExtra((String)object2)) instanceof Intent;
                                        if (!n4) {
                                            n15 = 0;
                                            object2 = null;
                                        }
                                        object2 = (Intent)object2;
                                    }
                                    object2 = (Intent)object2;
                                    if (object2 != null) {
                                        object = object2.getData();
                                    }
                                    if (object != null) {
                                        ajioHomeActivity.x1 = object2 = Boolean.FALSE;
                                        object2 = object.toString();
                                        String string15 = "toString(...)";
                                        Intrinsics.checkNotNullExpressionValue(object2, string15);
                                        ajioHomeActivity.R2((String)object2);
                                    }
                                } else {
                                    this.setIntent(null);
                                    object2 = "price_drop_data";
                                    n15 = (int)(intent.getBooleanExtra((String)object2, false) ? 1 : 0);
                                    if (n15 != 0) {
                                        this.D0 = n4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        super.onNewIntent(intent);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int n3;
        AjioHomeActivity ajioHomeActivity = this;
        Object object = menuItem;
        Intrinsics.checkNotNullParameter(menuItem, "item");
        Object object2 = this.Z;
        int n4 = 0x800003;
        int n7 = 1;
        int n8 = 16908332;
        if (object2 != null && menuItem != null && (n3 = menuItem.getItemId()) == n8 && (n3 = (int)(((androidx.appcompat.app.a)object2).e ? 1 : 0)) != 0) {
            object = ((androidx.appcompat.app.a)object2).b;
            int n10 = ((DrawerLayout)((Object)object)).getDrawerLockMode(n4);
            n8 = (int)(((DrawerLayout)((Object)object)).isDrawerVisible(n4) ? 1 : 0);
            if (n8 != 0 && n10 != (n8 = 2)) {
                ((DrawerLayout)((Object)object)).closeDrawer(n4);
            } else if (n10 != n7) {
                ((DrawerLayout)((Object)object)).openDrawer(n4);
            }
            return n7 != 0;
        }
        menuItem.getItemId();
        object2 = this.getSupportFragmentManager();
        n3 = R$id.content;
        object2 = ((FragmentManager)object2).D(n3);
        int n14 = menuItem.getItemId();
        n3 = R$id.search;
        int n15 = 0;
        Object object3 = null;
        if (n14 == n3) {
            FirebaseEvents.Companion.getInstance().sendEvent("search_bar_click", null);
            Object object4 = ajioHomeActivity.l1;
            String string2 = ((NewCustomEventsRevamp)object4).getEC_USER_INTERACTION();
            String string3 = ((NewCustomEventsRevamp)object4).getEA_NAV_CLICK_HEADER();
            object = AnalyticsManager.Companion;
            String string4 = av_0.a((AnalyticsManager$Companion)object);
            String string5 = av_0.a((AnalyticsManager$Companion)object);
            String string6 = "search bar";
            String string7 = "navigation_click";
            Object object5 = ajioHomeActivity.m1;
            Object object6 = ajioHomeActivity.n1;
            int n16 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, string2, string3, string6, string7, string4, string5, (String)object5, null, (String)object6, false, null, n16, null);
            object5 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
            object6 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
            object4 = "Search Button";
            ((GTMEvents)object5).pushButtonTapEvent("Show Search", object4, (String)object6);
            object5 = new HashMap();
            ((HashMap)object5).put("State", "Initiated");
            object = ((AnalyticsManager$Companion)object).getInstance().getCt();
            object6 = new AnalyticsData$Builder();
            object5 = ((AnalyticsData$Builder)object6).eventMap((HashMap)object5).build();
            ((CleverTapEvents)object).search((AnalyticsData)object5);
            vv2_2.Companion.getClass();
            object5 = new vv2_2();
            object = new Bundle();
            n3 = object2 instanceof tm2_2;
            Object object7 = "";
            if (n3 != 0) {
                object2 = ((tm2_2)object2).getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(object2, "getChildFragmentManager(...)");
                object2 = ((FragmentManager)object2).c.f();
                object6 = "null cannot be cast to non-null type java.util.ArrayList<androidx.fragment.app.Fragment>";
                Intrinsics.checkNotNull(object2, (String)object6);
                object2 = (ArrayList)object2;
                n3 = object2.isEmpty() ^ n7;
                if (n3 != 0) {
                    object6 = CollectionsKt.N(0, (List)object2);
                    n3 = object6 instanceof q22_0;
                    if (n3 != 0) {
                        object2 = CollectionsKt.N(0, (List)object2);
                        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.plp.fragment.NewProductListFragment");
                        object2 = (q22_0)object2;
                        object6 = ((q22_0)object2).cb().d.Z0;
                        object3 = "rilfnl";
                        if (!(object6 != null && (n3 = ((String)object6).length()) != 0 && (n3 = (int)(((String)object7).equalsIgnoreCase((String)(object6 = ld3_2.STORE_AJIO.getStoreId())) ? 1 : 0)) == 0 ? (object2 = ((q22_0)object2).cb().d.Z0) == null : (object2 = od3_2.a()) == null || (n3 = ((String)object2).length()) == 0 || (n3 = (int)(((String)object2).equalsIgnoreCase((String)(object6 = ld3_2.STORE_AJIO.getStoreId())) ? 1 : 0)) != 0)) {
                            object3 = object2;
                        }
                        object7 = object3;
                        object2 = "STORE_ID";
                        object.putString((String)object2, (String)object3);
                    } else {
                        object6 = CollectionsKt.N(n7, (List)object2);
                        n3 = object6 instanceof NewProductDetailsFragment;
                        if (n3 != 0) {
                            object2 = CollectionsKt.N(n7, (List)object2);
                            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment");
                            object2 = (NewProductDetailsFragment)object2;
                            object6 = ((NewProductDetailsFragment)object2).cb().q;
                            if (object6 == null || (object6 = ((Product)object6).getBrandResponse()) == null || (object6 = ((BrandResponse)object6).getBrand()) == null || (object6 = ((Brand)object6).getCode()) == null) {
                                object6 = object7;
                            }
                            if ((object2 = ((NewProductDetailsFragment)object2).cb().q) == null || (object2 = ((Product)object2).getBrandResponse()) == null || (object2 = ((BrandResponse)object2).getBrand()) == null || (object2 = ((Brand)object2).getName()) == null) {
                                object2 = object7;
                            }
                            if ((n15 = ((String)object6).length()) > 0 && (n15 = ((String)object2).length()) > 0) {
                                object3 = "brand_id";
                                object.putString((String)object3, (String)object6);
                                object6 = "brand_name";
                                object.putString((String)object6, (String)object2);
                            }
                        }
                    }
                }
            }
            object.putString("STORE_THEME", (String)object7);
            ((Fragment)object5).setArguments((Bundle)object);
            object2 = ajioHomeActivity.T0;
            object7 = Boolean.FALSE;
            n3 = 1;
            object3 = "search_tag";
            object = this;
            this.Q1((Fragment)object2, (Fragment)object5, n3 != 0, (String)object3, (Boolean)object7);
        } else {
            int n17 = R$id.notification;
            if (n14 == n17) {
                object2 = NotificationCenterActivity.class;
                object = new Intent((Context)ajioHomeActivity, object2);
                n17 = 5;
                ajioHomeActivity.startActivityForResult((Intent)object, n17);
            } else {
                n17 = R$id.closet_menu_pdp;
                if (n14 == n17) {
                    return false;
                }
                n17 = R$id.closet_menu;
                if (n14 == n17) {
                    this.B0();
                } else if (n14 == n8) {
                    object = this.getSupportFragmentManager();
                    n14 = ((FragmentManager)object).J();
                    if (n14 > n7) {
                        object = this.getSupportFragmentManager();
                        ((FragmentManager)object).V();
                    }
                } else {
                    n17 = R$id.cart;
                    if (n14 == n17) {
                        n14 = 3;
                        ajioHomeActivity.U1(n14);
                    }
                }
            }
        }
        object = ajioHomeActivity.Y;
        if (object != null) {
            ((DrawerLayout)((Object)object)).closeDrawer(n4);
        }
        return n7 != 0;
    }

    public final void onPause() {
        super.onPause();
        AjioHomeActivity.K2();
        i i3 = this.getLifecycle();
        lu1 lu12 = this.N0;
        i3.c(lu12);
        i3 = this.getLifecycle();
        lu12 = (G61)this.P0.getValue();
        i3.c(lu12);
    }

    public final void onPointerCaptureChanged(boolean bl2) {
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu2) {
        Intrinsics.checkNotNullParameter(actionMode, "mode");
        Intrinsics.checkNotNullParameter(menu2, "menu");
        return true;
    }

    public final void onResume() {
        super.onResume();
        int n3 = hv3_0.m(R$color.accent_color_11);
        this.r3(n3);
        Object object = h40_0.a;
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object2 = "reset_link_cohort_data";
        n3 = (int)(((ao0_0)object).a((String)object2) ? 1 : 0);
        if (n3 != 0) {
            object = UserInformation.getInstance((Context)this);
            object2 = Boolean.FALSE;
            String string2 = "";
            ((UserInformation)object).setCohortDataForGuestAjioStoreUser(string2, (Boolean)object2);
            object = UserInformation.getInstance((Context)this);
            ((UserInformation)object).setCohortLinkData(string2);
        }
        object = this.getLifecycle();
        object2 = this.N0;
        ((i)object).a((lu1)object2);
        object = this.getLifecycle();
        object2 = (G61)this.P0.getValue();
        ((i)object).a((lu1)object2);
        object = this.getIntent();
        if (object != null && (object2 = object.getData()) == null) {
            object2 = FirebaseEvents.Companion.getInstance();
            ((FirebaseEvents)object2).sendManualAppOpenEvent();
        }
        if (object != null && (n3 = (int)(object.getBooleanExtra((String)(object2 = "price_drop_data"), false) ? 1 : 0)) != 0) {
            n3 = 1;
            this.D0 = n3;
        }
        this.setIntent(null);
        object = z40$a.a((Context)AJIOApplication$a.a()).a;
        object2 = "ajio_wallet_onboarding_control";
        n3 = (int)(((ao0_0)object).a((String)object2) ? 1 : 0);
        if (n3 != 0) {
            object2 = Looper.getMainLooper();
            object = new Handler((Looper)object2);
            object2 = new L7(this, 0);
            long l2 = 300L;
            object.postDelayed((Runnable)object2, l2);
        }
    }

    public final void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        Intrinsics.checkNotNullParameter(bundle, "outState");
        Intrinsics.checkNotNullParameter(persistableBundle, "outPersistentState");
        super.onSaveInstanceState(bundle, persistableBundle);
        AjioHomeActivity.K2();
    }

    public final void onStop() {
        super.onStop();
        AjioHomeActivity.K2();
    }

    public final void p() {
        og1_1.g(false, false);
        boolean bl2 = true;
        og1_1.g(false, bl2);
        od3_2.a = "";
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a();
        jo_2 jo_22 = new jo_2((Context)object);
        object = ld3_2.STORE_AJIOGRAM.getStoreId();
        jo_22.E((String)object);
        this.s1 = bl2;
        this.a1.a();
        this.Z0.a();
        this.h3(false, false);
    }

    public final void p1() {
        iq_1 iq_12 = this.K0;
        if (iq_12 != null) {
            iq_12.Oa();
        }
    }

    public final void p3() {
        og1_1.g(false, false);
        boolean bl2 = true;
        og1_1.g(false, bl2);
        od3_2.a = "";
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a();
        jo_2 jo_22 = new jo_2((Context)object);
        object = ld3_2.STORE_AJIOGRAM.getStoreId();
        jo_22.E((String)object);
        this.s1 = bl2;
    }

    public final void p5() {
        vv2_2.Companion.getClass();
        vv2_2 vv2_22 = new vv2_2();
        Bundle bundle = E1.a("STORE_ID", "luxe");
        Object object = od3_2.a();
        bundle.putString("STORE_THEME", (String)object);
        vv2_22.setArguments(bundle);
        object = this.T0;
        Boolean bl2 = Boolean.FALSE;
        this.Q1((Fragment)object, vv2_22, true, "search_tag", bl2);
    }

    public final void q3(int n3) {
        int n4;
        Object object = this.T0;
        if (object != null && (object = ((Fragment)object).getChildFragmentManager()) != null) {
            n4 = R$id.home_content;
            object = ((FragmentManager)object).D(n4);
        } else {
            object = null;
        }
        if (object != null && (n4 = object instanceof sg1_2) != 0) {
            object = (sg1_2)object;
            object.P8(n3);
        }
    }

    public final void r1(String string2) {
        Intrinsics.checkNotNullParameter(string2, "displayUrl");
        Object object = this.e1;
        if (object != null && (object = (CMSNavigation)object.get(0)) != null) {
            ((CMSNavigation)object).setDisplayedUrl(string2);
        }
    }

    public final void r3(int n3) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        if (n4 >= n7) {
            Window window = this.getWindow();
            window.clearFlags(0x4000000);
            window.addFlags(-1 << -1);
            window.setStatusBarColor(n3);
            View view = window.getDecorView();
            int n8 = 8192;
            view.setSystemUiVisibility(n8);
            n3 = 30;
            if (n4 >= n3) {
                view = G31.a(window);
                if (view != null) {
                    lp0_0.b((WindowInsetsController)view);
                }
            } else {
                view = window.getDecorView();
                n7 = 26;
                if (n4 >= n7) {
                    n8 = 8208;
                }
                view.setSystemUiVisibility(n8);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int s() {
        int n3;
        Object object = od3_2.a();
        String string2 = ld3_2.STORE_LUXE.getStoreId();
        int n4 = ((String)object).equals(string2);
        string2 = "/switch-stores";
        boolean bl2 = true;
        int n7 = 0;
        if (n4 != 0) {
            object = this.P2().o;
            if (object != null && (object = ((BottomNavigationData)object).getData()) != null && (object = ((NavigationDataClass)object).getChildDetails()) != null) {
                n4 = object.size();
            } else {
                n4 = 0;
                object = null;
            }
            Object object2 = this.P2().o;
            if (object2 == null) return n7;
            if ((object2 = ((BottomNavigationData)object2).getData()) == null) return n7;
            if ((object2 = ((NavigationDataClass)object2).getChildDetails()) == null) return n7;
            n3 = 0;
            while (n7 < n4) {
                boolean bl3;
                String string3 = ((CMSNavigation)object2.get(n7)).getUrl();
                if (string3 != null && (bl3 = string3.equalsIgnoreCase(string2)) == bl2) {
                    n3 = n7;
                }
                ++n7;
            }
            return n3;
        }
        object = this.P2().n;
        if (object != null && (object = ((BottomNavigationData)object).getData()) != null && (object = ((NavigationDataClass)object).getChildDetails()) != null) {
            n4 = object.size();
        } else {
            n4 = 0;
            object = null;
        }
        Object object3 = this.P2().n;
        if (object3 == null) return n7;
        if ((object3 = ((BottomNavigationData)object3).getData()) == null) return n7;
        if ((object3 = ((NavigationDataClass)object3).getChildDetails()) == null) return n7;
        n3 = 0;
        while (n7 < n4) {
            boolean bl4;
            String string4 = ((CMSNavigation)object3.get(n7)).getUrl();
            if (string4 != null && (bl4 = string4.equalsIgnoreCase(string2)) == bl2) {
                n3 = n7;
            }
            ++n7;
        }
        return n3;
    }

    public final void setRefreshOrderList(boolean bl2) {
        this.g1 = bl2;
    }

    public final void showNotificationMyAccountFragment(String string2, String string3) {
        super.showNotification(string2, string3);
    }

    public final void showToastNotification(Context context, String string2, int n3, String string3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(string2, "message");
        this.showNotification(context, string2, n3, string3);
    }

    public final void startLoader() {
        AjioLoaderView ajioLoaderView = this.U0;
        if (ajioLoaderView != null && ajioLoaderView != null) {
            ajioLoaderView.startLoader();
        }
    }

    public final void stopLoader() {
        AjioLoaderView ajioLoaderView = this.U0;
        if (ajioLoaderView != null && ajioLoaderView != null) {
            ajioLoaderView.stopLoader();
        }
    }

    public final void t() {
        TabLayout tabLayout = this.r0;
        int n3 = 8;
        if (tabLayout != null) {
            tabLayout.setVisibility(n3);
        }
        if ((tabLayout = this.s0) != null) {
            tabLayout.setVisibility(n3);
        }
        if ((tabLayout = this.t0) != null) {
            tabLayout.setVisibility(n3);
        }
    }

    public final void t0(String string2, String string3) {
        super.showNotification(string2, string3);
    }

    public final void u(ProductPromotion object) {
        block6: {
            Object object2;
            String string2;
            block8: {
                block7: {
                    int n3 = 1;
                    Intrinsics.checkNotNullParameter(object, "productPromotion");
                    string2 = ((ProductPromotion)object).getCode();
                    if (string2 == null || (string2 = ((ProductPromotion)object).getDetailsURL()) == null) break block6;
                    string2 = new Bundle();
                    object2 = h40_0.a;
                    object2 = z40_0.Companion;
                    boolean bl2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a.a("isAdsDisabledOnCouponLink");
                    String string3 = "is_firebase_coupon_enabled";
                    string2.putBoolean(string3, bl2);
                    string2.putBoolean("isFromCouponScreen", n3 != 0);
                    object2 = kj0_1.g();
                    object = ((ProductPromotion)object).getDetailsURL();
                    if (object == null) break block7;
                    int n4 = ((String)object).length() - n3;
                    int n7 = 0;
                    boolean bl3 = false;
                    while (n7 <= n4) {
                        int n8 = !bl3 ? n7 : n4;
                        n8 = ((String)object).charAt(n8);
                        int n10 = 32;
                        n8 = Intrinsics.compare(n8, n10);
                        n8 = n8 <= 0 ? 1 : 0;
                        if (!bl3) {
                            if (n8 == 0) {
                                bl3 = true;
                                continue;
                            }
                            n7 += n3;
                            continue;
                        }
                        if (n8 == 0) break;
                        n4 += -1;
                    }
                    if ((object = com.jio.jioads.adinterfaces.a.a(n4, n3, n7, (String)object)) != null) break block8;
                }
                object = null;
            }
            ((kj0_1)object2).r(this, (String)object, (Bundle)string2);
        }
    }

    public final void u0(boolean bl2) {
        this.h1 = bl2;
    }

    public final void updateCartWishCount() {
        Object object = this.getAppPreferences();
        int n3 = ((jo_2)object).d();
        TextView textView = this.X0;
        if (textView != null) {
            int n4 = 0;
            textView = null;
            if (n3 == 0) {
                Object object2 = z40_0.Companion;
                object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
                String string2 = "enable_highlight_empty_cart";
                boolean bl2 = ((ao0_0)object2).a(string2);
                if (bl2) {
                    object2 = this.X0;
                    if (object2 != null) {
                        object2.setVisibility(0);
                    }
                    if ((textView = this.X0) != null) {
                        object = String.valueOf(n3);
                        textView.setText((CharSequence)object);
                    }
                    if ((object = this.X0) != null) {
                        n4 = R$drawable.circular_default_cart_count_bg;
                        textView = xn.a((Context)this, n4);
                        object.setBackground((Drawable)textView);
                    }
                } else {
                    object = this.X0;
                    if (object != null) {
                        n4 = 8;
                        object.setVisibility(n4);
                    }
                }
            } else {
                TextView textView2;
                boolean bl3 = og1_1.c();
                if (!bl3 && (textView2 = this.X0) != null) {
                    int n7 = R$drawable.circulartextview_design_revamp;
                    Drawable drawable2 = xn.a((Context)this, n7);
                    textView2.setBackground(drawable2);
                }
                if ((textView2 = this.X0) != null) {
                    textView2.setVisibility(0);
                }
                if (n3 > (n4 = 9)) {
                    object = this.X0;
                    if (object != null) {
                        textView = hv3_0.f("9<sup>+</sup>");
                        object.setText((CharSequence)textView);
                    }
                } else {
                    textView = this.X0;
                    if (textView != null) {
                        object = String.valueOf(n3);
                        textView.setText((CharSequence)object);
                    }
                }
            }
        }
    }

    public final void v() {
        Object object = xl1_1.START;
        this.H2((xl1_1)((Object)object));
        boolean bl2 = og1_1.c();
        if (bl2) {
            object = this.a1;
            ((TabSelectedListener)object).b();
        } else {
            object = this.Z0;
            ((TabSelectedListener)object).b();
        }
        bl2 = og1_1.c();
        int n3 = -1;
        if (bl2 && (object = this.s0) != null) {
            if (object != null) {
                n3 = ((TabLayout)((Object)object)).getSelectedTabPosition();
            }
        } else {
            bl2 = og1_1.c();
            if (!bl2 && (object = this.r0) != null && object != null) {
                n3 = ((TabLayout)((Object)object)).getSelectedTabPosition();
            }
        }
        if (n3 != 0 && (bl2 = this.C0)) {
            bl2 = false;
            object = null;
            this.C0 = false;
            this.f3(0);
        }
        if ((object = this.Y) != null) {
            n3 = 0x800003;
            ((DrawerLayout)((Object)object)).closeDrawer(n3);
        }
    }

    public final void v1() {
        Object object = this.T0;
        if (object != null) {
            object = ((Fragment)object).getChildFragmentManager();
            ((FragmentManager)object).W();
        }
    }

    public final void w1(String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        super.showNotification(string2, null);
    }

    public final void x(boolean bl2) {
        this.i1 = bl2;
    }

    public final void x1(boolean bl2) {
        int n3;
        int n4 = this.N2();
        if (n4 == (n3 = 1)) {
            this.i3(bl2);
        }
    }

    public final Fragment y() {
        return this.T0;
    }

    public final void z(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        kj0_1.g().w(this, string2);
    }

    public final void z0(int n3, String string2) {
        String string3 = "source";
        Intrinsics.checkNotNullParameter(string2, string3);
        boolean bl2 = this.isFinishing();
        if (!bl2) {
            at2_1.h(this, string2, n3);
        }
    }

    public final void z1() {
        Object object = this.T0;
        if (object != null) {
            object = ((Fragment)object).getChildFragmentManager();
            ((FragmentManager)object).W();
        }
    }

    public final void z2(int n3, int n4, Intent intent) {
        Object object = this.getSupportFragmentManager();
        String string2 = "getSupportFragmentManager(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        int n7 = R$id.content;
        object = ((FragmentManager)object).D(n7);
        n7 = object instanceof tm2_2;
        if (n7 != 0) {
            object = ((tm2_2)object).getChildFragmentManager();
            n7 = R$id.home_content;
            if ((n7 = (object = ((FragmentManager)object).D(n7)) instanceof qn_2) != 0 && (object = ((qn_2)object).k) != null) {
                ((ex1_0)object).onActivityResult(n3, n4, intent);
            }
        }
    }
}

