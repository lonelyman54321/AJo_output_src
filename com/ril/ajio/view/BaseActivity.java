/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.widget.LinearLayout
 */
package com.ril.ajio.view;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$Tab;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.ClevertapGAUtils;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.anim.SlideAnimation;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar$DisplayMode;
import com.ril.ajio.customviews.widgets.FragmentTitlesInterface;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.data.Home.NavigationParent;
import com.ril.ajio.services.data.sis.StoreInfo;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.view.BaseActivity$a;
import com.ril.ajio.view.BaseActivity$b;
import com.ril.ajio.view.BaseActivity$c;
import com.ril.ajio.view.BaseActivity$d;
import com.ril.ajio.view.Hilt_BaseActivity;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public abstract class BaseActivity
extends Hilt_BaseActivity
implements qf1_1 {
    public static final BaseActivity$b Companion;
    public BaseActivity$a A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public StoreInfo F0;
    public final NewEEcommerceEventsRevamp G0;
    public final NewCustomEventsRevamp H0;
    public LinearLayout I0;
    public BaseActivity J0;
    public iq_1 K0;
    public DrawerLayout Y;
    public qv_2 Z;
    public AjioCustomToolbar k0;
    public LinearLayout p0;
    public int q0;
    public TabLayout r0;
    public TabLayout s0;
    public View t0;
    public int u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public final int y0;
    public boolean z0;

    static {
        BaseActivity$b baseActivity$b;
        Companion = baseActivity$b = new Object();
    }

    public BaseActivity() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        boolean bl2;
        this.v0 = bl2 = true;
        this.y0 = 200;
        this.C0 = bl2;
        Object object = AnalyticsManager.Companion;
        this.G0 = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.H0 = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
    }

    public static void y2(BaseActivity object, tm2_2 object2, String string2) {
        block7: {
            int n3;
            FragmentManager fragmentManager = ((FragmentActivity)object).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(fragmentManager, "getSupportFragmentManager(...)");
            fragmentManager.getClass();
            a a2 = new a(fragmentManager);
            String string3 = "beginTransaction(...)";
            Intrinsics.checkNotNullExpressionValue(a2, string3);
            ((BaseActivity)object).q0 = n3 = R$id.content;
            object = ((AppCompatActivity)object).findViewById(n3);
            if (object != null) {
                boolean bl2 = true;
                n3 = R$id.content;
                a2.j(n3, (Fragment)object2, string2);
                a2.c(string2);
                try {
                    a2.o(bl2, bl2);
                    fragmentManager.C();
                }
                catch (IllegalStateException illegalStateException) {
                    boolean bl3;
                    yn3$a yn3$a = yn3_0.a;
                    yn3$a.e(illegalStateException);
                    Fragment fragment = fragmentManager.E(string2);
                    if (fragment != null && (bl3 = fragment.isAdded())) {
                        a2.i(fragment);
                        a2.o(bl2, bl2);
                        a2 = new a(fragmentManager);
                    }
                    n3 = R$id.content;
                    a2.j(n3, (Fragment)object2, string2);
                    a2.c(string2);
                    a2.o(bl2, bl2);
                    object = z40_0.Companion;
                    object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                    object2 = "exec_pending_trans";
                    bl2 = ((ao0_0)object).a((String)object2);
                    if (!bl2) break block7;
                    fragmentManager.C();
                }
            }
        }
    }

    public final void A2(String object, String object2, Boolean object3) {
        boolean bl2;
        int n3;
        Object object4 = "pageName";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        if (!bl3 && (n3 = b.i((String)object, (String)(object4 = "static"), bl2 = true)) != 0) {
            n3 = 0;
            object = null;
            if (object2 != null && (bl3 = StringsKt.F((CharSequence)object2, (CharSequence)(object4 = "selfcare"), false)) == bl2) {
                this.openCustomerCare();
            } else if (object2 != null && (bl3 = StringsKt.F((CharSequence)object2, (CharSequence)(object4 = "update-your-app"), false)) == bl2) {
                object3 = this.getApplication();
                object2 = new jo_2((Context)object3);
                boolean bl4 = this instanceof AjioHomeActivity;
                if (bl4) {
                    object4 = this;
                    object4 = (AjioHomeActivity)this;
                    jc0_0 jc0_02 = new jc0_0();
                    Fragment fragment = ((AjioHomeActivity)object4).T0;
                    Boolean bl5 = Boolean.FALSE;
                    boolean bl6 = true;
                    String string2 = "COUPONSCREEN";
                    ((AjioHomeActivity)object4).Q1(fragment, jc0_02, bl6, string2, bl5);
                } else {
                    object = new Object[]{};
                    object2 = yn3_0.a;
                    object3 = "Coupon Promotion Link Failed";
                    ((yn3$a)object2).k((String)object3, object);
                }
            } else {
                object = CustomWebViewActivity.Companion;
                object4 = UrlHelper.Companion.getInstance();
                object2 = ((UrlHelper)object4).getCompleteUrl((String)object2);
                object.getClass();
                n3 = 14;
                CustomWebViewActivity$a.a((Context)this, (String)object2, n3, (Boolean)object3, this);
            }
        } else {
            int n4;
            object = UrlHelper.Companion.getInstance().getCompleteUrl((String)object2);
            if (object != null && (n4 = object.length()) != 0) {
                at2_1.j((Context)this, (String)object);
            }
        }
    }

    public final void C1(HashMap object) {
        int n3;
        Object object2 = yn3_0.a;
        Object object3 = null;
        Set set = object != null ? ((HashMap)object).keySet() : null;
        Object[] objectArray = new StringBuilder("clevertap inapp: ");
        objectArray.append(set);
        set = objectArray.toString();
        objectArray = new Object[]{};
        ((yn3$a)object2).a((String)((Object)set), objectArray);
        ClevertapGAUtils clevertapGAUtils = ClevertapGAUtils.INSTANCE;
        Object object4 = object != null ? (object2 = (String)((HashMap)object).get("ctaName")) : null;
        object2 = "url";
        Set set2 = object != null ? (set = (String)((HashMap)object).get(object2)) : null;
        Set set3 = object != null ? (set = (String)((HashMap)object).get("campaignId")) : null;
        Set set4 = object != null ? (set = (String)((HashMap)object).get("campaignName")) : null;
        Set set5 = object != null ? (set = (String)((HashMap)object).get("widgetName")) : null;
        Set set6 = object != null ? (set = (String)((HashMap)object).get("additionalMetaData")) : null;
        Set set7 = object != null ? (set = (String)((HashMap)object).get("action")) : null;
        clevertapGAUtils.pushInAppPopUpCTAClick((String)object4, (String)((Object)set2), (String)((Object)set3), (String)((Object)set4), (String)((Object)set5), (String)((Object)set6), (String)((Object)set7));
        if (object != null) {
            object3 = object = ((HashMap)object).get(object2);
            object3 = (String)object;
        }
        if (object3 != null && (n3 = ((String)object3).length()) > 0) {
            object = kj0_1.g();
            ((kj0_1)object).w(this, (String)object3);
        }
    }

    public void C2(int n3, String string2, String string3, String string4) {
    }

    public void D2(String string2) {
    }

    public void E2(Intent object) {
        Object object2 = this.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(object2, "getSupportFragmentManager(...)");
        Object object3 = "CartFragment";
        object2 = ((FragmentManager)object2).E((String)object3);
        if (object2 != null && object != null && (object3 = object.getExtras()) != null) {
            Object object4 = "SHOW_PLP_PAGE";
            int n3 = object3.containsKey((String)object4);
            if (n3 != 0) {
                object = object.getStringExtra((String)object4);
                object3 = kj0_1.g();
                object4 = this.J0;
                n3 = R$id.cart_container;
                ((kj0_1)object3).t((Activity)object4, (String)object, (Fragment)object2, n3);
            } else {
                String string2 = "PDP_DATA";
                boolean bl2 = object3.containsKey(string2);
                if (bl2) {
                    boolean bl3;
                    object = object.getExtras();
                    bl2 = false;
                    object3 = null;
                    if (object != null) {
                        int n4 = Build.VERSION.SDK_INT;
                        int n7 = 33;
                        if (n4 >= n7) {
                            object = C7.a((Bundle)object);
                        } else {
                            n3 = (object = object.getSerializable(string2)) instanceof ri2_0;
                            if (n3 != 0) {
                                object3 = object;
                            }
                            object = object3;
                            object = (ri2_0)object3;
                        }
                        object3 = object;
                        object3 = (ri2_0)object;
                    }
                    if (object3 != null && (object = ((ri2_0)object3).h) != null && (bl3 = ((String)object).equalsIgnoreCase((String)object4))) {
                        object = kj0_1.g();
                        object4 = this.J0;
                        n3 = R$id.cart_container;
                        object3 = ((ri2_0)object3).f;
                        ((kj0_1)object).t((Activity)object4, (String)object3, (Fragment)object2, n3);
                    }
                }
            }
        }
    }

    public final void F2() {
        boolean bl2 = og1_1.c();
        TabLayout tabLayout = bl2 ? this.s0 : this.r0;
        if (tabLayout != null) {
            int n3 = el3.b((Context)this);
            int n4 = -1 << -1;
            n3 = View.MeasureSpec.makeMeasureSpec((int)n3, (int)n4);
            n4 = View.MeasureSpec.makeMeasureSpec((int)el3.a((Context)this), (int)n4);
            tabLayout.measure(n3, n4);
            n3 = tabLayout.getVisibility();
            n4 = 0;
            Object object = null;
            boolean bl3 = true;
            n3 = n3 != 0 ? 1 : 0;
            View view = this.t0;
            if (view != null) {
                int n7 = 8;
                view.setVisibility(n7);
            }
            if (n3 == 0 && (n3 = (int)(this.x0 ? 1 : 0)) == 0) {
                n3 = tabLayout.getMeasuredHeight();
                this.x0 = bl3;
                SlideAnimation slideAnimation = new SlideAnimation((View)tabLayout, n3, 0);
                object = new DecelerateInterpolator();
                slideAnimation.setInterpolator((Interpolator)object);
                n4 = this.y0;
                long l2 = n4;
                slideAnimation.setDuration(l2);
                object = new BaseActivity$d(tabLayout, this, n3);
                slideAnimation.setAnimationListener((Animation.AnimationListener)object);
                tabLayout.setAnimation(slideAnimation);
                tabLayout.startAnimation(slideAnimation);
            }
        }
    }

    public final void G2() {
        BaseActivity baseActivity = this;
        int n3 = this.E0;
        int n4 = 3;
        if (n3 != n4) {
            n3 = (int)(this.z0 ? 1 : 0);
            Object[] objectArray = "Global Nav";
            int n7 = 0x800003;
            if (n3 == 0) {
                Object object;
                Object object2 = this.K0;
                if (object2 != null) {
                    ((iq_1)object2).Pa();
                    object2 = this.K0;
                    if (object2 != null) {
                        object = this.F0;
                        ((iq_1)object2).Xa((StoreInfo)object);
                    }
                    if ((object2 = baseActivity.K0) != null) {
                        ((iq_1)object2).Ra();
                    }
                }
                object2 = this.getSupportFragmentManager();
                int n8 = R$id.content;
                object2 = ((FragmentManager)object2).D(n8);
                object = baseActivity.Y;
                if (object != null) {
                    ((DrawerLayout)((Object)object)).openDrawer(n7);
                }
                if (object2 != null) {
                    String string2;
                    String string3;
                    Object object3;
                    String string4;
                    Object object4 = baseActivity.G0;
                    object = ((NewEEcommerceEventsRevamp)object4).getPrevScreen();
                    n8 = ((String)object).length();
                    String string5 = "home landing screen";
                    object = n8 == 0 ? string5 : ((NewEEcommerceEventsRevamp)object4).getPrevScreen();
                    Object object5 = ((NewEEcommerceEventsRevamp)object4).getPrevScreenType();
                    int n10 = ((String)object5).length();
                    if (n10 != 0) {
                        string5 = ((NewEEcommerceEventsRevamp)object4).getPrevScreenType();
                    }
                    n7 = object2 instanceof bz1_2;
                    object5 = baseActivity.H0;
                    String string6 = "Open Menu";
                    if (n7 != 0) {
                        object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        object4 = "Account Screen";
                        ((GTMEvents)object2).pushButtonTapEvent((String)objectArray, string6, (String)object4);
                        string6 = ((NewCustomEventsRevamp)object5).getEC_USER_INTERACTION();
                        string4 = ((NewCustomEventsRevamp)object5).getEA_NAV_CLICK_MAIN();
                        int n14 = 1536;
                        object3 = "open menu";
                        string3 = "navigation_click";
                        string2 = "my account screen";
                        String string7 = "my account screen";
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, string6, string4, (String)object3, string3, string2, string7, (String)object, null, string5, false, null, n14, null);
                    } else {
                        n3 = object2 instanceof ex1_0;
                        if (n3 != 0) {
                            object2 = AnalyticsManager.Companion;
                            object4 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
                            string4 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
                            ((GTMEvents)object4).pushButtonTapEvent((String)objectArray, string6, string4);
                            string6 = ((NewCustomEventsRevamp)object5).getEC_USER_INTERACTION();
                            string4 = ((NewCustomEventsRevamp)object5).getEA_NAV_CLICK_MAIN();
                            string2 = av_0.a((AnalyticsManager$Companion)object2);
                            int n15 = 1536;
                            object3 = "open menu";
                            string3 = "navigation_click";
                            String string8 = "bag screen";
                            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, string6, string4, (String)object3, string3, string2, string8, (String)object, null, string5, false, null, n15, null);
                        } else {
                            object2 = AnalyticsManager.Companion;
                            object4 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
                            string4 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
                            ((GTMEvents)object4).pushButtonTapEvent((String)objectArray, string6, string4);
                            string6 = ((NewCustomEventsRevamp)object5).getEC_USER_INTERACTION();
                            string4 = ((NewCustomEventsRevamp)object5).getEA_NAV_CLICK_MAIN();
                            string2 = av_0.a((AnalyticsManager$Companion)object2);
                            String string9 = av_0.a((AnalyticsManager$Companion)object2);
                            int n16 = 1536;
                            object3 = "open menu";
                            string3 = "navigation_click";
                            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, string6, string4, (String)object3, string3, string2, string9, (String)object, null, string5, false, null, n16, null);
                        }
                    }
                    string4 = "navigation screen";
                    string3 = null;
                    object5 = baseActivity.H0;
                    string6 = "hamburger navigation screen";
                    object3 = object;
                    string2 = string5;
                    ((NewCustomEventsRevamp)object5).newPushCustomScreenView(string6, string4, (String)object, null, string5);
                } else {
                    object2 = yn3_0.a;
                    n4 = 0;
                    objectArray = new Object[]{};
                    String string10 = "Fragment maanger is null";
                    ((yn3$a)object2).d(string10, objectArray);
                }
                object2 = xl1_1.STOP;
                baseActivity.H2((xl1_1)((Object)object2));
            } else {
                Object object = AnalyticsManager.Companion;
                GTMEvents gTMEvents = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
                String string11 = "Close Menu";
                ak0_0.a((AnalyticsManager$Companion)object, gTMEvents, (String)objectArray, string11);
                object = this.Y;
                if (object != null) {
                    ((DrawerLayout)((Object)object)).closeDrawer(n7);
                }
            }
        } else {
            Object object = AnalyticsManager.Companion;
            GTMEvents gTMEvents = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
            object = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
            String string12 = "Header Click";
            String string13 = "Cart Close";
            gTMEvents.pushButtonTapEvent(string12, string13, (String)object);
            this.onBackPressed();
        }
    }

    public final void H2(xl1_1 xl1_12) {
        Intrinsics.checkNotNullParameter((Object)xl1_12, "action");
        Intent intent = new Intent("media_stop_notification");
        intent.putExtra("action_type", (Serializable)((Object)xl1_12));
        Xv1.a((Context)this).c(intent);
    }

    public final void I2() {
        Object object = this.p0;
        if (object != null) {
            object.setVisibility(0);
        }
        if ((object = this.k0) != null) {
            object.setVisibility(0);
        }
    }

    public final void M0() {
        AjioCustomToolbar ajioCustomToolbar = this.k0;
        if (ajioCustomToolbar != null) {
            this.w0 = true;
            Object object = null;
            ajioCustomToolbar.setVisibility(0);
            LinearLayout linearLayout = this.p0;
            if (linearLayout != null) {
                int n3 = el3.b((Context)this);
                int n4 = -1 << -1;
                n3 = View.MeasureSpec.makeMeasureSpec((int)n3, (int)n4);
                int n7 = el3.a((Context)this);
                n4 = View.MeasureSpec.makeMeasureSpec((int)n7, (int)n4);
                ajioCustomToolbar.measure(n3, n4);
                n3 = ajioCustomToolbar.getMeasuredHeight();
                Object object2 = linearLayout.getLayoutParams();
                object2.height = n3;
                linearLayout.setLayoutParams(object2);
                linearLayout.setVisibility(0);
                object2 = new SlideAnimation((View)linearLayout, 0, n3);
                object = new DecelerateInterpolator();
                object2.setInterpolator((Interpolator)object);
                long l2 = 100;
                object2.setDuration(l2);
                object = new rv_2(linearLayout, ajioCustomToolbar, this);
                object2.setAnimationListener((Animation.AnimationListener)object);
                linearLayout.setAnimation((Animation)object2);
                linearLayout.startAnimation((Animation)object2);
            }
        }
    }

    public final void P0() {
        int n3;
        Object object = this.p0;
        int n4 = 0;
        Object object2 = null;
        int n7 = 1;
        if (object != null && (n3 = object.getVisibility()) == 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        if ((n3 ^= n7) == 0 && (n3 = (int)(this.w0 ? 1 : 0)) == 0) {
            this.w0 = n7;
            object = this.p0;
            if (object != null && (object = this.k0) != null) {
                n7 = el3.b((Context)this);
                int n8 = -1 << -1;
                n7 = View.MeasureSpec.makeMeasureSpec((int)n7, (int)n8);
                int n10 = el3.a((Context)this);
                n8 = View.MeasureSpec.makeMeasureSpec((int)n10, (int)n8);
                object.measure(n7, n8);
                n7 = object.getMeasuredHeight();
                LinearLayout linearLayout = this.p0;
                SlideAnimation slideAnimation = new SlideAnimation((View)linearLayout, n7, 0);
                object2 = new DecelerateInterpolator();
                slideAnimation.setInterpolator((Interpolator)object2);
                n4 = this.y0;
                long l2 = n4;
                slideAnimation.setDuration(l2);
                object2 = new pv_2(this, (AjioCustomToolbar)object, n7);
                slideAnimation.setAnimationListener((Animation.AnimationListener)object2);
                object = this.p0;
                if (object != null) {
                    object.setAnimation((Animation)slideAnimation);
                }
                if ((object = this.p0) != null) {
                    object.startAnimation((Animation)slideAnimation);
                }
            }
        }
    }

    public void U1(int n3) {
        TabLayout$Tab tabLayout$Tab = null;
        this.v0 = false;
        boolean bl2 = og1_1.c();
        if (bl2) {
            Object object = this.s0;
            if (object != null && (object = object.getTabAt(0)) != null && (object = this.s0) != null && (tabLayout$Tab = object.getTabAt(0)) != null) {
                tabLayout$Tab.select();
            }
        } else {
            Object object = this.r0;
            if (object != null && (object = object.getTabAt(0)) != null && (object = this.r0) != null && (tabLayout$Tab = object.getTabAt(0)) != null) {
                tabLayout$Tab.select();
            }
        }
    }

    public final BaseActivity$a e1() {
        return this.A0;
    }

    public final AjioCustomToolbar getToolbar() {
        return this.k0;
    }

    public void hideToolbarLayout() {
        Object object = this.p0;
        if (object != null) {
            object.clearAnimation();
        }
        object = this.p0;
        int n3 = 8;
        if (object != null) {
            object.setVisibility(n3);
        }
        if ((object = this.k0) != null) {
            object.setVisibility(n3);
        }
        this.E0 = 0;
    }

    public void launchFeature(String object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "name");
        object2 = this.getResources();
        int bl2 = R$string.feature_customercare;
        object2 = object2.getString(bl2);
        boolean bl3 = true;
        boolean bl4 = b.i((String)object, (String)object2, bl3);
        if (bl4 && (object = hv3_0.l()) != null) {
            object2 = new Intent((Context)this, (Class)object);
            object = this.getUserViewModel();
            boolean bl5 = ((hy3_0)object).p();
            if (!bl5) {
                int n3 = 7;
                this.startActivityForResult((Intent)object2, n3);
            } else {
                this.startActivity((Intent)object2);
            }
        }
    }

    public void onActivityResult(int n3, int n4, Intent intent) {
        int n7 = -1;
        if (n4 == n7) {
            n7 = 3;
            int n8 = 0;
            Object object = null;
            if (n3 != n7) {
                n7 = 5;
                if (n3 == n7) {
                    if (intent != null) {
                        object = intent.getData();
                    }
                    if (object != null) {
                        Object object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        object = "Noti_Click";
                        String string2 = "NotificationCentre";
                        ((GTMEvents)object2).pushButtonTapEvent(object, string2);
                        object2 = kj0_1.g();
                        n8 = 1;
                        ((kj0_1)object2).o(this, intent, n8 != 0);
                    }
                }
            } else {
                if (intent != null) {
                    String string3 = "TAB_TYPE";
                    n8 = 0;
                    n7 = intent.getIntExtra(string3, 0);
                    object = n7;
                }
                if (object != null && (n7 = ((Integer)object).intValue()) == (n8 = 1003)) {
                    this.E2(intent);
                }
            }
        }
        this.z2(n3, n4, intent);
        super.onActivityResult(n3, n4, intent);
    }

    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        this.J0 = this;
        AJIOApplication.Companion.getClass();
        object = com.clevertap.android.sdk.a.g((Context)AJIOApplication$a.a());
        if (object != null) {
            WeakReference<BaseActivity> weakReference;
            object = (ck_1)((com.clevertap.android.sdk.a)object).b.i;
            object.getClass();
            ((ck_1)object).a = weakReference = new WeakReference<BaseActivity>(this);
        }
    }

    public void onResume() {
        super.onResume();
        this.updateCartWishCount();
    }

    public final void q() {
        AjioCustomToolbar ajioCustomToolbar = this.k0;
        if (ajioCustomToolbar != null && ajioCustomToolbar != null) {
            String string2 = "";
            ajioCustomToolbar.setTitle(string2);
        }
    }

    public final void r(StoreInfo storeInfo) {
        this.F0 = storeInfo;
    }

    public final void setToolbarState(Fragment object) {
        int n3;
        if (object != null && (n3 = object instanceof FragmentTitlesInterface) != 0) {
            Object object2;
            Object object3 = (object = (FragmentTitlesInterface)object).getDisplayMode();
            if (object3 == null) {
                n3 = -1;
            } else {
                object2 = BaseActivity$c.$EnumSwitchMapping$0;
                n3 = object3.ordinal();
                n3 = object2[n3];
            }
            switch (n3) {
                default: {
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
                case 6: {
                    object3 = this.k0;
                    if (object3 != null) {
                        object = object.getDisplayMode();
                        ((AjioCustomToolbar)object3).setDisplayMode((AjioCustomToolbar$DisplayMode)((Object)object));
                    }
                    if ((object = this.k0) == null) break;
                    n3 = 0;
                    object3 = null;
                    ((AjioCustomToolbar)object).setTitle(null);
                    break;
                }
                case 5: {
                    object3 = this.k0;
                    if (object3 != null) {
                        object2 = (Object)object.getDisplayMode();
                        ((AjioCustomToolbar)object3).setDisplayMode((AjioCustomToolbar$DisplayMode)((Object)object2));
                    }
                    if ((object3 = this.k0) != null) {
                        object2 = object.getProductListTitle();
                        ((AjioCustomToolbar)object3).setProductListTitleText((String)object2);
                    }
                    if ((object3 = this.k0) == null) break;
                    object = object.getProductListDetail();
                    ((AjioCustomToolbar)object3).setProductListDetailText((String)object);
                    break;
                }
                case 2: 
                case 3: 
                case 4: {
                    object3 = this.k0;
                    if (object3 == null) break;
                    object = object.getDisplayMode();
                    ((AjioCustomToolbar)object3).setDisplayMode((AjioCustomToolbar$DisplayMode)((Object)object));
                    break;
                }
                case 1: {
                    object3 = this.k0;
                    if (object3 != null) {
                        object2 = (Object)object.getDisplayMode();
                        ((AjioCustomToolbar)object3).setDisplayMode((AjioCustomToolbar$DisplayMode)((Object)object2));
                    }
                    if ((object3 = this.k0) == null) break;
                    object = object.getToolbarTitle();
                    ((AjioCustomToolbar)object3).setTitle((CharSequence)object);
                }
            }
        }
    }

    public final void showTabLayout(boolean bl2) {
        boolean bl3 = this.isFinishing();
        if (!bl3) {
            bl3 = og1_1.c();
            float f5 = 2.0f;
            int n3 = 8;
            int n4 = -1 << -1;
            if (bl3) {
                TabLayout tabLayout = this.s0;
                if (tabLayout != null) {
                    if (bl2) {
                        int n7 = View.MeasureSpec.makeMeasureSpec((int)el3.b((Context)this), (int)n4);
                        n3 = View.MeasureSpec.makeMeasureSpec((int)el3.a((Context)this), (int)n4);
                        tabLayout.measure(n7, n3);
                        ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = n3 = tabLayout.getMeasuredHeight();
                        }
                        tabLayout.setVisibility(0);
                        layoutParams = tabLayout.animate().translationY(0.0f);
                        tabLayout = new DecelerateInterpolator(f5);
                        layoutParams.setInterpolator((TimeInterpolator)tabLayout).start();
                        layoutParams = this.t0;
                        if (layoutParams != null) {
                            layoutParams.setVisibility(0);
                        }
                    } else {
                        tabLayout.setVisibility(n3);
                        View view = this.t0;
                        if (view != null) {
                            view.setVisibility(n3);
                        }
                    }
                }
            } else {
                TabLayout tabLayout = this.r0;
                if (tabLayout != null) {
                    if (bl2) {
                        int n8 = View.MeasureSpec.makeMeasureSpec((int)el3.b((Context)this), (int)n4);
                        n3 = View.MeasureSpec.makeMeasureSpec((int)el3.a((Context)this), (int)n4);
                        tabLayout.measure(n8, n3);
                        ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
                        layoutParams.height = n3 = tabLayout.getMeasuredHeight();
                        tabLayout.setVisibility(0);
                        layoutParams = tabLayout.animate().translationY(0.0f);
                        tabLayout = new DecelerateInterpolator(f5);
                        layoutParams.setInterpolator((TimeInterpolator)tabLayout).start();
                        layoutParams = this.t0;
                        if (layoutParams != null) {
                            layoutParams.setVisibility(0);
                        }
                    } else {
                        tabLayout.setVisibility(n3);
                        View view = this.t0;
                        if (view != null) {
                            view.setVisibility(n3);
                        }
                    }
                }
            }
        }
    }

    public final void showUpButton(boolean bl2, int n3, int n4, String string2) {
        AjioCustomToolbar ajioCustomToolbar = this.k0;
        if (ajioCustomToolbar != null) {
            Object object;
            ajioCustomToolbar.setNavigationIcon(n4);
            this.E0 = n3;
            if (string2 != null && (n3 = string2.length()) > 0 && (object = this.k0) != null) {
                ((AjioCustomToolbar)object).setTitle(string2);
            }
            if ((object = this.getSupportActionBar()) == null) {
                return;
            }
            if (bl2) {
                DrawerLayout drawerLayout = this.Y;
                if (drawerLayout != null) {
                    n3 = 1;
                    drawerLayout.setDrawerLockMode(n3);
                }
            } else {
                Object object2 = this.Z;
                if (object2 != null) {
                    ((androidx.appcompat.app.a)object2).b();
                }
                if ((object2 = this.Y) != null) {
                    n3 = 0;
                    object = null;
                    ((DrawerLayout)((Object)object2)).setDrawerLockMode(0);
                }
                if ((object2 = this.Z) != null) {
                    n3 = 0;
                    object = null;
                    ((androidx.appcompat.app.a)object2).h = null;
                }
            }
        }
    }

    public final void w(NavigationParent navigationParent, String string2) {
        boolean bl2;
        boolean bl3;
        iq_1 iq_12 = this.K0;
        if (iq_12 != null && (bl3 = iq_12.isAdded()) == (bl2 = true) && !(bl3 = this.isFinishing()) && (iq_12 = this.K0) != null) {
            iq_12.Va(navigationParent, string2);
        }
    }

    public void z2(int n3, int n4, Intent intent) {
        Object object = this.getSupportFragmentManager();
        String string2 = "getSupportFragmentManager(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        int n7 = this.q0;
        object = ((FragmentManager)object).D(n7);
        n7 = object instanceof qn_2;
        if (n7 != 0 && (object = ((qn_2)object).k) != null) {
            ((ex1_0)object).onActivityResult(n3, n4, intent);
        }
    }
}

