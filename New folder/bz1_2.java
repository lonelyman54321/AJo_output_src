/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.text.TextUtils
 *  android.view.ContextThemeWrapper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ListAdapter
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  org.json.JSONObject
 */
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.jio.jioads.adinterfaces.JioAdView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.AnalyticsUtil;
import com.ril.ajio.analytics.AnalyticsUtil$Companion;
import com.ril.ajio.analytics.MyRewardsOption;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.anim.CustomCoordinatorBehavior;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioNonScrollableListView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.devsettings.DevSettingsActivity;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.kmm.shared.model.home.transform.BannerAdsMetaData;
import com.ril.ajio.login.activity.LoginActivityRevampNew;
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.data.user.UserProfileData;
import com.ril.ajio.services.entity.Banner;
import com.ril.ajio.services.entity.Component;
import com.ril.ajio.utility.customview.InAppBottomUpdatesView;
import com.ril.ajio.view.BaseActivity;
import com.ril.ajio.view.BaseSplitActivity;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.json.JSONObject;

/*
 * Renamed from BZ1
 */
public final class bz1_2
extends x51_0
implements ms1_2,
View.OnClickListener,
View.OnLongClickListener,
OnNavigationClickListener,
sg1_2,
ns1_2,
xc1_2 {
    public static final BZ1$a Companion;
    public AjioTextView A;
    public ca2_1 A0;
    public AjioTextView B;
    public float B0;
    public AjioTextView C;
    public float C0;
    public AjioTextView D;
    public A71 D0;
    public AjioNonScrollableListView E;
    public pg2_2 E0;
    public AjioNonScrollableListView F;
    public View F0;
    public AjioNonScrollableListView G;
    public final NewEEcommerceEventsRevamp G0;
    public FrameLayout H;
    public final String H0;
    public View I;
    public final String I0;
    public Component J;
    public boolean J0;
    public TextView K;
    public UserInformation K0;
    public AjioButton L;
    public InAppBottomUpdatesView L0;
    public OnFragmentInteractionListener M;
    public Boolean M0;
    public UserProfileData N;
    public View N0;
    public boolean O;
    public ImageView O0;
    public FragmentActivity P;
    public TextView P0;
    public final ArrayList Q;
    public TextView Q0;
    public final ArrayList R;
    public View R0;
    public final ArrayList S;
    public ImageView S0;
    public Bundle T;
    public TextView T0;
    public yg_1 U;
    public TextView U0;
    public View V0;
    public TextView W0;
    public boolean X;
    public TextView X0;
    public int Y;
    public TextView Y0;
    public boolean Z;
    public boolean Z0;
    public BannerAdViewModel a1;
    public boolean b1;
    public aw0_0 c1;
    public JioAdView d1;
    public ConstraintLayout g;
    public ConstraintLayout h;
    public ConstraintLayout i;
    public ConstraintLayout j;
    public ConstraintLayout k;
    public NestedScrollView k0;
    public ConstraintLayout l;
    public ImageView m;
    public wc_1 n;
    public LinearLayout o;
    public j3_0 p;
    public View p0;
    public fo3 q;
    public final boolean[] q0;
    public vh3_2 r;
    public hy3_0 r0;
    public lz1_1 s;
    public b52_0 s0;
    public final NewCustomEventsRevamp t;
    public jo_2 t0;
    public RelativeLayout u;
    public us1_2 u0;
    public RelativeLayout v;
    public us1_2 v0;
    public AjioTextView w;
    public us1_2 w0;
    public AjioTextView x;
    public LinearLayout x0;
    public AjioTextView y;
    public CustomToolbarViewMerger y0;
    public AjioTextView z;
    public int z0;

    static {
        BZ1$a bZ1$a;
        Companion = bZ1$a = new Object();
    }

    public bz1_2() {
        Object object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.t = object2;
        this.O = true;
        object2 = new ArrayList();
        this.Q = object2;
        object2 = new ArrayList();
        this.R = object2;
        object2 = new ArrayList();
        this.S = object2;
        object2 = new boolean[5];
        this.q0 = (boolean[])object2;
        this.z0 = -1;
        this.G0 = object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.H0 = object2 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        this.I0 = object = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        this.M0 = object = Boolean.FALSE;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void Qa(bz1_2 object, Banner object2, int n3) {
        Object object3;
        object.getClass();
        object = ((Banner)object2).getBannerType();
        int n4 = Intrinsics.areEqual(object, "EXTERNAL_AD");
        CharSequence charSequence = "getHost(...)";
        String string2 = null;
        String string3 = "";
        if (n4 != 0) {
            object = ((Banner)object2).getBannerAdsMetaData();
            if (object != null) {
                string2 = ((BannerAdsMetaData)object).getCtaFb();
            }
            if (string2 != null && (n4 = string2.length()) != 0) {
                object = new URL(string2);
                object = ((URL)object).getHost();
                Intrinsics.checkNotNullExpressionValue(object, (String)charSequence);
            } else {
                object = string3;
            }
            charSequence = "TPBA";
        } else {
            object = ((Banner)object2).getBannerType();
            n4 = Intrinsics.areEqual(object, object3 = "AD");
            if (n4 != 0) {
                object = ((Banner)object2).getBannerAdsMetaData();
                if (object != null) {
                    string2 = ((BannerAdsMetaData)object).getCtaFb();
                }
                if (string2 != null && (n4 = string2.length()) != 0) {
                    object = new URL(string2);
                    object = ((URL)object).getHost();
                    Intrinsics.checkNotNullExpressionValue(object, (String)charSequence);
                } else {
                    object = string3;
                }
                charSequence = "jioads_direct_demand";
            } else {
                object = ((Banner)object2).getBannerUrl();
                if (object == null) {
                    object = string3;
                }
                int n7 = 100;
                object = le3_2.E(n7, (String)object);
                charSequence = "paid";
            }
        }
        Object object4 = object;
        cp_1.Companion.getClass();
        object = cp$a.e();
        string2 = ((Banner)object2).getBannerUrl();
        if (string2 != null) {
            string3 = string2;
        }
        object.getClass();
        object = cp_1.k(string3);
        String string4 = n1.a((String)charSequence, " - ", (String)object);
        object = ((Banner)object2).getWidth();
        object2 = ((Banner)object2).getHeight();
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(object);
        ((StringBuilder)charSequence).append("x");
        ((StringBuilder)charSequence).append(object2);
        String string5 = ((StringBuilder)charSequence).toString();
        String string6 = hj0_0.a(n3, "0|");
        object = AnalyticsManager.Companion;
        object3 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        String string7 = av_0.a((AnalyticsManager$Companion)object);
        String string8 = bv_0.a((AnalyticsManager$Companion)object);
        ((NewEEcommerceEventsRevamp)object3).pushSelectContentEventForThirdPartyBanner(string7, string8, (String)object4, string4, string5, string6);
    }

    public final void B7() {
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushNavigationTapEvent("Show AJIO Wallet", "AJIO Wallet", "my account screen");
    }

    public final void K8() {
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushNavigationTapEvent("Show Orders", "ORDERS", "my account screen");
    }

    public final void P8(int n3) {
        float f5;
        int n4;
        Object object;
        bz1_2 bz1_22 = this;
        int n7 = n3;
        int n8 = 4;
        if (n3 == n8 && (object = this.L0) != null) {
            n8 = object.getVisibility();
            n4 = 8;
            f5 = 1.1E-44f;
            if (n8 == n4) {
                NewCustomEventsRevamp newCustomEventsRevamp = this.t;
                String string2 = newCustomEventsRevamp.getEC_APP_UPDATE_INTERACTION();
                String string3 = this.t.getINSTALL_NOW_CTA_VIEW();
                object = AnalyticsManager.Companion;
                String string4 = av_0.a((AnalyticsManager$Companion)object);
                String string5 = av_0.a((AnalyticsManager$Companion)object);
                int n10 = 1536;
                String string6 = "";
                String string7 = "event_app_update_interaction";
                String string8 = this.H0;
                String string9 = this.I0;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string6, string7, string4, string5, string8, null, string9, false, null, n10, null);
            }
        }
        if ((object = bz1_22.L0) != null) {
            object.setUIForState(n7);
        }
        InAppBottomUpdatesView inAppBottomUpdatesView = bz1_22.L0;
        n8 = 0;
        object = null;
        if (inAppBottomUpdatesView != null && (n7 = inAppBottomUpdatesView.getVisibility()) == 0) {
            inAppBottomUpdatesView = bz1_22.o;
            if (inAppBottomUpdatesView != null) {
                Context context = this.getContext();
                if (context != null && (context = context.getResources()) != null) {
                    int n14 = R$dimen.dp50;
                    f5 = context.getDimension(n14);
                    n4 = (int)f5;
                } else {
                    n4 = 0;
                    f5 = 0.0f;
                    context = null;
                }
                inAppBottomUpdatesView.setPadding(0, 0, 0, n4);
            }
        } else {
            inAppBottomUpdatesView = bz1_22.o;
            if (inAppBottomUpdatesView != null) {
                inAppBottomUpdatesView.setPadding(0, 0, 0, 0);
            }
        }
    }

    public final void Ra(int n3, v92_0 v92_02) {
        ArrayList arrayList = this.Q;
        arrayList.add(n3, v92_02);
        us1_2 us1_22 = this.u0;
        if (us1_22 != null) {
            Intrinsics.checkNotNull(us1_22);
            us1_22.a = arrayList;
        }
    }

    public final void Sa(v92_0 object) {
        ArrayList arrayList = this.R;
        arrayList.add(object);
        object = this.v0;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            ((us1_2)object).a = arrayList;
        }
    }

    public final void Ta(int n3) {
        int n4;
        bz1_2 bz1_22 = this;
        Object object = new Rect();
        NestedScrollView nestedScrollView = this.k0;
        String string2 = "mScrollviewAccount";
        Object object2 = 0;
        float f5 = 0.0f;
        NestedScrollView nestedScrollView2 = null;
        if (nestedScrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            nestedScrollView = null;
        }
        nestedScrollView.getHitRect((Rect)object);
        nestedScrollView = bz1_22.H;
        if (nestedScrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banerRootViewItem");
            n4 = 0;
            nestedScrollView = null;
        }
        int n7 = nestedScrollView.getLocalVisibleRect((Rect)object);
        n4 = 1;
        if (n7 != 0 && (n7 = bz1_22.X) == 0) {
            object = bz1_22.U;
            if (object != null) {
                object.w();
            }
            bz1_22.X = n4;
        }
        object = bz1_22.p0;
        Intrinsics.checkNotNull(object);
        n7 = object.getHeight();
        Object object3 = bz1_22.k0;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            nestedScrollView2 = object3;
        }
        Object object4 = nestedScrollView2.getHeight();
        float f6 = n7 - object4;
        float f7 = 100.0f;
        f6 = f7 / f6;
        object2 = n3;
        f5 = (float)n3 * f6;
        n7 = 0x3F000000;
        f6 = 0.5f;
        object3 = bz1_22.t;
        object = bz1_22.q0;
        float f8 = (f5 += f6) - f7;
        object4 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object4 >= 0) {
            object4 = 4;
            f7 = 5.6E-45f;
            object2 = object[object4];
            if (object2 == 0) {
                String string3 = ((NewCustomEventsRevamp)object3).getEC_USER_INTERACTION();
                String string4 = "scroll depth";
                String string5 = "100%";
                String string6 = "scroll_depth";
                String string7 = "my account screen";
                String string8 = "my account screen";
                String string9 = bz1_22.H0;
                String string10 = bz1_22.I0;
                int n8 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string3, string4, string5, string6, string7, string8, string9, null, string10, false, null, n8, null);
                object[object4] = (Rect)n4;
            }
        } else {
            f7 = 80.0f;
            float f11 = f5 - f7;
            object4 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
            if (object4 >= 0) {
                object4 = 3;
                f7 = 4.2E-45f;
                object2 = object[object4];
                if (object2 == 0) {
                    String string11 = ((NewCustomEventsRevamp)object3).getEC_USER_INTERACTION();
                    String string12 = "scroll depth";
                    String string13 = "80%";
                    String string14 = "scroll_depth";
                    String string15 = "my account screen";
                    String string16 = "my account screen";
                    String string17 = bz1_22.H0;
                    String string18 = bz1_22.I0;
                    int n10 = 1536;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string11, string12, string13, string14, string15, string16, string17, null, string18, false, null, n10, null);
                    object[object4] = (Rect)n4;
                }
            } else {
                f7 = 60.0f;
                float f12 = f5 - f7;
                object4 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                if (object4 >= 0) {
                    object4 = 2;
                    f7 = 2.8E-45f;
                    object2 = object[object4];
                    if (object2 == 0) {
                        String string19 = ((NewCustomEventsRevamp)object3).getEC_USER_INTERACTION();
                        String string20 = "scroll depth";
                        String string21 = "60%";
                        String string22 = "scroll_depth";
                        String string23 = "my account screen";
                        String string24 = "my account screen";
                        String string25 = bz1_22.H0;
                        String string26 = bz1_22.I0;
                        int n14 = 1536;
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string19, string20, string21, string22, string23, string24, string25, null, string26, false, null, n14, null);
                        object[object4] = (Rect)n4;
                    }
                } else {
                    f7 = 40.0f;
                    float f14 = f5 - f7;
                    object4 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                    if (object4 >= 0) {
                        object4 = object[n4];
                        if (object4 == 0) {
                            String string27 = ((NewCustomEventsRevamp)object3).getEC_USER_INTERACTION();
                            String string28 = "scroll depth";
                            String string29 = "40%";
                            String string30 = "scroll_depth";
                            String string31 = "my account screen";
                            String string32 = "my account screen";
                            String string33 = bz1_22.H0;
                            String string34 = bz1_22.I0;
                            int n15 = 1536;
                            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string27, string28, string29, string30, string31, string32, string33, null, string34, false, null, n15, null);
                            object[n4] = (Rect)n4;
                        }
                    } else {
                        f7 = 20.0f;
                        float f15 = f5 - f7;
                        object4 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                        if (object4 >= 0) {
                            object4 = 0;
                            f7 = 0.0f;
                            string2 = null;
                            object2 = object[0];
                            if (object2 == 0) {
                                String string35 = ((NewCustomEventsRevamp)object3).getEC_USER_INTERACTION();
                                String string36 = "scroll depth";
                                String string37 = "20%";
                                String string38 = "scroll_depth";
                                String string39 = "my account screen";
                                String string40 = "my account screen";
                                String string41 = bz1_22.H0;
                                String string42 = bz1_22.I0;
                                int n16 = 1536;
                                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string35, string36, string37, string38, string39, string40, string41, null, string42, false, null, n16, null);
                                object[0] = (Rect)n4;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void Ua() {
        ArrayList arrayList = this.S;
        arrayList.clear();
        us1_2 us1_22 = this.w0;
        if (us1_22 != null) {
            Intrinsics.checkNotNull(us1_22);
            us1_22.a = arrayList;
        }
    }

    public final void Va() {
        int n3;
        int n4;
        bz1_2 bz1_22 = this;
        v31.a();
        Object object = AnalyticsManager.Companion;
        Object object2 = "SIGN OUT USER";
        String string2 = "SIGN OUT BTN CLICK";
        tj2_0.e((AnalyticsManager$Companion)object, object2, string2, "my account screen");
        object = this.t;
        String string3 = ((NewCustomEventsRevamp)object).getEC_USER_ACCOUNTS();
        String string4 = "logout";
        String string5 = "";
        String string6 = "logout";
        String string7 = "my account screen";
        String string8 = "my account screen";
        String string9 = this.H0;
        String string10 = this.I0;
        int n7 = 1536;
        Object object3 = object;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string3, string4, string5, string6, string7, string8, string9, null, string10, false, null, n7, null);
        Object object4 = this.M;
        if (object4 != null) {
            object2 = this.T;
            string2 = "BZ1";
            n4 = 11;
            object4.onFragmentInteraction(string2, n4, (Bundle)object2);
        }
        if ((object4 = bz1_22.r0) != null) {
            ((hy3_0)object4).q();
        }
        kx3_0.a = n3 = 1;
        object2 = null;
        kx3_0.b = null;
        kx3_0.c = n3;
        object4 = bz1_22.K;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("button_sign_out");
            n3 = 0;
            object4 = null;
        }
        object4.setTag((Object)"SIGN OUT");
        this.ib();
        tj2_2.Companion.getClass();
        object4 = tj2$a_0.a();
        object4.getClass();
        string2 = "";
        object3 = "pincode";
        Intrinsics.checkNotNullParameter(string2, (String)object3);
        ((tj2_2)object4).a = string2;
        object4 = bz1_22.t0;
        if (object4 != null) {
            object3 = "LOCATION_DATA";
            ((sw_0)object4).putPreference((String)object3, string2);
        }
        if ((object4 = bz1_22.r0) != null) {
            ((hy3_0)object4).g();
        }
        if ((object4 = bz1_22.t0) != null) {
            object3 = "closet_card_in_home";
            ((sw_0)object4).removePreference((String)object3);
        }
        if ((object4 = bz1_22.s0) != null) {
            ((b52_0)object4).b();
        }
        if ((object4 = bz1_22.r0) != null) {
            ((hy3_0)object4).e();
        }
        if ((object4 = bz1_22.r0) != null) {
            ((hy3_0)object4).d();
        }
        if ((object4 = bz1_22.t0) != null) {
            ((jo_2)object4).B();
        }
        if ((object4 = bz1_22.t0) != null) {
            ((jo_2)object4).q(string2);
        }
        object4 = bz1_22.D0;
        n4 = 0;
        object3 = null;
        if (object4 != null) {
            object4.u0(false);
        }
        if ((object4 = bz1_22.D0) != null) {
            object4.x(false);
        }
        if ((object4 = bz1_22.t0) != null) {
            string3 = "USER_ADDRESS";
            ((sw_0)object4).putPreference(string3, string2);
        }
        if ((object4 = bz1_22.t0) != null) {
            string3 = "USER_PINCODE";
            ((sw_0)object4).putPreference(string3, string2);
        }
        if ((object4 = bz1_22.t0) != null) {
            ((jo_2)object4).z(string2);
        }
        vl0_0.a = false;
        vl0_0.b = null;
        bv1_0.a = null;
        bv1_0.b = null;
        bv1_0.c = null;
        bv1_0.d = false;
        bv1_0.h = false;
        bv1_0.e = null;
        bv1_0.f = null;
        bv1_0.g = false;
        object4 = bz1_22.p;
        if (object4 != null && (object4 = bz1_22.s) != null) {
            object4.G();
        }
        AJIOApplication.Companion.getClass();
        object3 = AJIOApplication$a.a();
        object4 = new jo_2((Context)object3);
        ((sw_0)object4).putPreference("PREFERRED_PAYMENT", string2);
        string3 = ((NewCustomEventsRevamp)object).getEC_USER_ACCOUNTS();
        string4 = "logout - success";
        string5 = "";
        string6 = "logout_success";
        string7 = "my account screen";
        string8 = "my account screen";
        string9 = bz1_22.H0;
        string10 = bz1_22.I0;
        n7 = 1536;
        object3 = object;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string3, string4, string5, string6, string7, string8, string9, null, string10, false, null, n7, null);
        object = bz1_22.g;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("walletLayout");
            object = null;
        }
        n3 = 8;
        object.setVisibility(n3);
        object = bz1_22.k;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("verifyEmailLayoutUcp");
            object = null;
        }
        object.setVisibility(n3);
        object = bz1_22.j;
        if (object == null) {
            object = "verifyEmailLayout";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        object2.setVisibility(n3);
    }

    public final void W7(JioAdView jioAdView) {
        this.d1 = jioAdView;
    }

    public final void Wa() {
        j3_0 j3_02 = this.p;
        Intrinsics.checkNotNull(j3_02);
        j3_02.stopLoader();
    }

    public final void Xa() {
        Object object = this.p;
        Intrinsics.checkNotNull(object);
        object.startLoader();
        boolean bl2 = this.b1;
        if (!bl2) {
            object = this.r0;
            Intrinsics.checkNotNull(object);
            ((hy3_0)object).n();
        }
        object = Unit.a;
    }

    public final void Ya() {
        Object object;
        int n3 = 2;
        boolean bl2 = this.b1;
        if (!bl2) {
            Object object2 = this.r0;
            Intrinsics.checkNotNull(object2);
            g53_0 g53_02 = ((hy3_0)object2).g.getStaticLinks();
            Function1 function1 = new tw0_1(object2, n3);
            ry3_0 ry3_02 = new ry3_0((tw0_1)function1);
            function1 = new hm2_1(object2, n3);
            rx1_1 rx1_12 = new rx1_1(n3, function1);
            object = g53_02.f(ry3_02, rx1_12);
            object2 = ((hy3_0)object2).x;
            ((t30_0)object2).b((yr0_2)object);
        }
        object = Unit.a;
    }

    public final UserProfileData Za(String object) {
        UserProfileData userProfileData = new UserProfileData();
        Object object2 = this.K0;
        Intrinsics.checkNotNull(object2);
        object2 = ((UserInformation)object2).getUserName();
        userProfileData.setFirstName((String)object2);
        object2 = this.K0;
        Intrinsics.checkNotNull(object2);
        object2 = ((UserInformation)object2).getDisplayUid();
        userProfileData.setDisplayUid((String)object2);
        object2 = this.K0;
        Intrinsics.checkNotNull(object2);
        object2 = ((UserInformation)object2).getUserPhoneNumber();
        userProfileData.setMobileNumber((String)object2);
        object2 = this.t0;
        Intrinsics.checkNotNull(object2);
        String string2 = "";
        object2 = ((sw_0)object2).getPreference("IDENTITY", string2);
        userProfileData.setIdentity((String)object2);
        userProfileData.setLastName((String)object);
        object = this.t0;
        Intrinsics.checkNotNull(object);
        object2 = "IS_RIL_EMAIL_VERIFIED";
        Object[] objectArray = null;
        boolean bl2 = ((sw_0)object).getPreference((String)object2, false);
        userProfileData.setEmailVerified(bl2);
        object = this.t0;
        Intrinsics.checkNotNull(object);
        object2 = "user_email_account_screen";
        boolean bl3 = true;
        bl2 = ((sw_0)object).getPreference((String)object2, bl3);
        try {
            userProfileData.setDisplayEmail(bl2);
        }
        catch (ClassCastException classCastException) {
            object2 = yn3_0.a;
            String string3 = classCastException.getLocalizedMessage();
            if (string3 != null) {
                string2 = string3;
            }
            string3 = "Exception is :".concat(string2);
            objectArray = new Object[]{};
            ((yn3$a)object2).a(string3, objectArray);
        }
        return userProfileData;
    }

    public final void ab() {
        Object object = h40_0.a;
        object = xv$a_0.MyAccount;
        boolean bl2 = h40_0.S0((xv$a_0)((Object)object));
        String string2 = "banerRootViewItem";
        Object object2 = null;
        if (bl2 && !(bl2 = this.b1)) {
            Object object3 = this.J;
            boolean bl3 = false;
            if (object3 == null) {
                object3 = this.a1;
                if (object3 == null) {
                    object3 = "bannerViewModel";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    object2 = object3;
                }
                object3 = this.r0;
                if (object3 != null) {
                    bl3 = ((hy3_0)object3).p();
                }
                if ((object3 = this.t0) == null || (object3 = ((jo_2)object3).f()) == null) {
                    object3 = "";
                }
                ((BannerAdViewModel)object2).getAdsBannerDataMiscPages((xv$a_0)((Object)object), bl3, (String)object3);
            } else {
                object = this.H;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object2 = object;
                }
                object2.setVisibility(0);
                this.cb();
            }
        } else {
            object = this.H;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object;
            }
            int n3 = 8;
            object2.setVisibility(n3);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean bb() {
        Object object = z40_0.Companion;
        Application application = this.requireActivity().getApplication();
        String string2 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(application, string2);
        object.getClass();
        object = z40$a.a((Context)application).a;
        String string3 = "referral_feature_enable";
        boolean bl2 = ((ao0_0)object).a(string3);
        if (!bl2) return false;
        object = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = z40$a.a((Context)object).a;
        String string4 = "referrer_enable";
        bl2 = ((ao0_0)object).a(string4);
        if (!bl2) return false;
        return true;
    }

    public final void cb() {
        yg_1 yg_12;
        Object object = this.I;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerView");
            object = null;
        }
        Object object2 = new BZ1$c(this);
        this.U = yg_12 = new yg_1((View)object, (Av)object2);
        object = this.J;
        object2 = this.getActivity();
        yg_12.x((Component)object, (Activity)object2, this);
    }

    public final void db(int n3) {
        us1_2 us1_22;
        Object object = z40_0.Companion;
        Object object2 = this.requireActivity().getApplication();
        String string2 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object.getClass();
        object = z40$a.a((Context)object2).a;
        object2 = "enable_customer_care";
        boolean bl2 = ((ao0_0)object).a((String)object2);
        if (bl2) {
            int n4 = R$string.customer_care;
            object2 = hv3_0.K(n4);
            string2 = null;
            int n7 = 121;
            object = new v92_0(n7, (String)object2, false);
            this.Ra(n3, (v92_0)object);
        }
        if ((us1_22 = this.u0) != null) {
            Intrinsics.checkNotNull(us1_22);
            us1_22.a = object = this.Q;
        }
    }

    public final void e2() {
        FragmentActivity fragmentActivity = this.P;
        if (fragmentActivity != null) {
            Intrinsics.checkNotNull(fragmentActivity, "null cannot be cast to non-null type com.ril.ajio.view.BaseActivity");
            fragmentActivity = (BaseActivity)fragmentActivity;
            ((BaseSplitActivity)fragmentActivity).openCustomerCare();
            NewCustomEventsRevamp newCustomEventsRevamp = this.t;
            String string2 = newCustomEventsRevamp.getEC_MY_ACC_INTERACTION();
            String string3 = newCustomEventsRevamp.getEN_MY_ACCOUNT_INTERACTIONS();
            String string4 = "customer care";
            String string5 = "";
            String string6 = "my account screen";
            String string7 = "my account screen";
            String string8 = this.H0;
            String string9 = this.I0;
            int n3 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string4, string5, string3, string6, string7, string8, null, string9, false, null, n3, null);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void eb(UserProfileData object) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        int n3;
        hy3_0 hy3_02;
        h40_0 h40_02 = h40_0.a;
        boolean bl6 = h40_0.u2();
        Object object2 = "userInfoJcp";
        int n4 = 1;
        String string2 = "accountCentreLayout";
        Object object3 = null;
        int n7 = 8;
        if (bl6 && (hy3_02 = this.r0) != null && (n3 = hy3_02.p()) == n4) {
            AjioTextView ajioTextView;
            CharSequence charSequence;
            ConstraintLayout constraintLayout;
            AjioTextView ajioTextView2;
            AjioTextView ajioTextView3;
            AjioTextView ajioTextView4;
            void var2_10;
            void var2_7;
            RelativeLayout relativeLayout = this.u;
            Intrinsics.checkNotNull(relativeLayout);
            relativeLayout.setVisibility(n7);
            ConstraintLayout constraintLayout2 = this.i;
            if (constraintLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl7 = false;
                Object var2_6 = null;
            }
            var2_7.setVisibility(0);
            ConstraintLayout constraintLayout3 = this.h;
            if (constraintLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                boolean bl8 = false;
                Object var2_9 = null;
            }
            var2_10.setVisibility(0);
            AjioTextView ajioTextView5 = this.z;
            if (ajioTextView5 != null) {
                ajioTextView5.setVisibility(0);
            }
            if ((ajioTextView4 = this.x) != null) {
                ajioTextView4.setVisibility(0);
            }
            if ((ajioTextView3 = this.C) != null) {
                ajioTextView3.setVisibility(0);
            }
            if ((ajioTextView2 = this.A) != null) {
                ajioTextView2.setVisibility(0);
            }
            if ((constraintLayout = this.i) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = constraintLayout;
            }
            object3.setOnClickListener((View.OnClickListener)this);
            StringBuilder stringBuilder = new StringBuilder();
            object2 = ((UserProfileData)object).getFirstName();
            char c2 = TextUtils.isEmpty((CharSequence)object2);
            if (c2 == '\u0000') {
                object2 = ((UserProfileData)object).getFirstName();
                c2 = ((String)object2).charAt(0);
                stringBuilder.append(c2);
            }
            if ((c2 = TextUtils.isEmpty((CharSequence)(object2 = ((UserProfileData)object).getLastName()))) == '\u0000') {
                object2 = ((UserProfileData)object).getLastName();
                c2 = ((String)object2).charAt(0);
                stringBuilder.append(c2);
            }
            if ((object2 = this.z) != null) {
                string2 = ((UserProfileData)object).getFirstName();
                object3 = ((UserProfileData)object).getLastName();
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(" ");
                ((StringBuilder)charSequence).append((String)object3);
                string2 = ((StringBuilder)charSequence).toString();
                object2.setText((CharSequence)string2);
            }
            if ((object2 = this.A) != null) {
                string2 = ((UserProfileData)object).getMobileNumber();
                object2.setText((CharSequence)string2);
            }
            if ((object2 = this.D) != null) {
                int n8 = R$string.acc_mobile_number_is;
                object3 = cp_1.Companion;
                charSequence = ((UserProfileData)object).getMobileNumber();
                object3.getClass();
                object3 = cp$a.B((String)charSequence);
                charSequence = new Object[n4];
                charSequence[0] = object3;
                string2 = this.getString(n8, (Object[])charSequence);
                object2.setContentDescription((CharSequence)string2);
            }
            if ((object2 = this.x) != null) {
                String string3 = stringBuilder.toString();
                object2.setText((CharSequence)string3);
            }
            if ((ajioTextView = this.C) != null) {
                object2 = z40_0.Companion;
                object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a.d("UCP_Configuratiion").getString("accountCenterSubtitle");
                string2 = "getString(...)";
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                ajioTextView.setText((CharSequence)object2);
            }
        } else {
            ConstraintLayout constraintLayout;
            AjioTextView ajioTextView;
            AjioTextView ajioTextView6;
            AjioTextView ajioTextView7;
            void var2_23;
            ConstraintLayout constraintLayout4 = this.h;
            if (constraintLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                boolean bl9 = false;
                Object var2_22 = null;
            }
            var2_23.setVisibility(n7);
            AjioTextView ajioTextView8 = this.z;
            if (ajioTextView8 != null) {
                ajioTextView8.setVisibility(n7);
            }
            if ((ajioTextView7 = this.x) != null) {
                ajioTextView7.setVisibility(n7);
            }
            if ((ajioTextView6 = this.C) != null) {
                ajioTextView6.setVisibility(n7);
            }
            if ((ajioTextView = this.A) != null) {
                ajioTextView.setVisibility(n7);
            }
            if ((constraintLayout = this.i) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = constraintLayout;
            }
            object3.setVisibility(n7);
        }
        if ((bl5 = h40_0.d1()) && (bl4 = h40_0.c1()) && !(bl3 = ((UserProfileData)object).getEmailVerified()) && (bl2 = ((UserProfileData)object).getDisplayEmail())) {
            cp$a cp$a = cp_1.Companion;
            object = ((UserProfileData)object).getDisplayUid();
            cp$a.getClass();
            boolean bl10 = cp$a.z((String)object);
            if (bl10) {
                this.hb(n4 != 0);
                return;
            }
        }
        this.hb(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void f1(v92_0 v92_02) {
        String string2;
        Object object;
        bz1_2 bz1_22 = this;
        Object object2 = v92_02;
        Intrinsics.checkNotNullParameter(v92_02, "optionItem");
        Object object3 = new HashMap();
        Object object4 = v92_02.b;
        ((HashMap)object3).put("Action", object4);
        object4 = hv3_0.K(R$string.feedback);
        String string3 = v92_02.b;
        boolean bl2 = true;
        float f5 = Float.MIN_VALUE;
        boolean bl3 = kotlin.text.b.i(string3, (String)object4, bl2);
        if (bl3 && (object4 = this.getActivity()) != null) {
            pk0_2.Companion.getClass();
            object2 = new pk0_2();
            object4 = this.requireActivity().getSupportFragmentManager();
            object = "FeedbackCategoryDialogFragment";
            ((DialogFragment)object2).show((FragmentManager)object4, (String)object);
        } else {
            float f6;
            object4 = new Bundle();
            f5 = bz1_22.B0;
            int n3 = 0;
            String string4 = null;
            float f7 = f5 - 0.0f;
            Object object5 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object5 > 0) {
                string2 = "REFEREE_EARN_AMOUNT";
                object4.putFloat(string2, f5);
            }
            if ((n3 = (f6 = (f5 = bz1_22.C0) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) > 0) {
                string4 = "REFERRER_EARN_AMOUNT";
                object4.putFloat(string4, f5);
            }
            object = bz1_22.M;
            Intrinsics.checkNotNull(object);
            string4 = "BZ1";
            int n4 = ((v92_0)object2).a;
            object.onFragmentInteraction(string4, n4, (Bundle)object4);
        }
        Intrinsics.checkNotNullExpressionValue(string3, "getName(...)");
        object2 = string3.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(object2, "toLowerCase(...)");
        object = "and";
        object2 = oo1_1.a("&", (String)object2, (String)object);
        object4 = "notifications";
        bl3 = string3.equalsIgnoreCase((String)object4);
        if (bl3) {
            object2 = "my account notification";
        } else {
            object4 = "invite friends & earn";
            bl3 = string3.equalsIgnoreCase((String)object4);
            if (bl3 || (bl3 = string3.equalsIgnoreCase((String)(object4 = "invite friends & test")))) {
                object2 = "invite friends";
            }
        }
        object = object2;
        object4 = bz1_22.t;
        string3 = ((NewCustomEventsRevamp)object4).getEC_MY_ACC_INTERACTION();
        string2 = ((NewCustomEventsRevamp)object4).getEN_MY_ACCOUNT_INTERACTIONS();
        String string5 = bz1_22.H0;
        String string6 = bz1_22.I0;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, string3, (String)object2, "", string2, "my account screen", "my account screen", string5, null, string6, false, null, 1536, null);
        object2 = AnalyticsManager.Companion.getInstance().getCt();
        object4 = new AnalyticsData$Builder();
        object3 = ((AnalyticsData$Builder)object4).eventMap((HashMap)object3).build();
        ((CleverTapEvents)object2).accountManagement((AnalyticsData)object3);
    }

    public final void fb() {
        String string2;
        int n3;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        boolean bl2;
        Object object5;
        Object object6;
        Object object7;
        block46: {
            int n4;
            Object object8;
            String string3;
            Object object9;
            Object object10;
            object7 = this.E;
            object6 = "nonscroll_list_1";
            object5 = null;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(object6);
                bl2 = false;
                object7 = null;
            }
            object7.setAdapter(null);
            object7 = this.F;
            object4 = "nonscroll_list_2";
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                bl2 = false;
                object7 = null;
            }
            object7.setAdapter(null);
            object7 = this.G;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nonscroll_list_3");
                bl2 = false;
                object7 = null;
            }
            object7.setAdapter(null);
            object7 = this.Q;
            ((ArrayList)object7).clear();
            object3 = this.u0;
            if (object3 != null) {
                Intrinsics.checkNotNull(object3);
                ((us1_2)object3).a = object7;
            }
            object3 = this.R;
            ((ArrayList)object3).clear();
            object2 = this.v0;
            if (object2 != null) {
                Intrinsics.checkNotNull(object2);
                ((us1_2)object2).a = object3;
            }
            this.Ua();
            object = hv3_0.K(R$string.orders);
            int n10 = 10;
            object2 = new v92_0(n10, (String)object, false);
            this.Ra(0, (v92_0)object2);
            int n7 = 1;
            this.db(n7);
            n3 = this.bb();
            string2 = "getApplication(...)";
            if (n3 != 0) {
                this.z0 = n3 = 2;
                object10 = z40_0.Companion;
                object9 = this.requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(object9, string2);
                object10.getClass();
                object10 = z40$a.a((Context)object9).a.b("referral_myaccount_title");
                object9 = this.requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(object9, string2);
                object9 = z40$a.a((Context)object9).a;
                string3 = "display_referral_new_tag";
                boolean bl3 = ((ao0_0)object9).a(string3);
                int n8 = 42;
                object8 = new v92_0(n8, (String)object10, bl3);
                this.Ra(n3, (v92_0)object8);
            } else {
                n3 = 1;
            }
            object8 = z40_0.Companion;
            object10 = this.requireActivity().getApplication();
            Intrinsics.checkNotNullExpressionValue(object10, string2);
            object8.getClass();
            object8 = z40$a.a((Context)object10).a;
            object10 = "enable_coupon_bonanza";
            boolean bl4 = ((ao0_0)object8).a((String)object10);
            if (bl4) {
                n4 = R$string.coupon_quest;
                object10 = this.getString(n4);
                int n14 = 57;
                object8 = new v92_0(n14, (String)object10, n7 != 0);
                this.Ra(++n3, (v92_0)object8);
            }
            object8 = this.requireActivity();
            object8 = object8.getApplication();
            Intrinsics.checkNotNullExpressionValue(object8, string2);
            object8 = z40$a.a((Context)object8);
            object8 = ((z40_0)object8).a;
            object10 = "enable_gamezone";
            boolean bl5 = ((ao0_0)object8).a((String)object10);
            object10 = this.requireActivity();
            object10 = object10.getApplication();
            Intrinsics.checkNotNullExpressionValue(object10, string2);
            object10 = z40$a.a((Context)object10);
            object10 = ((z40_0)object10).a;
            object9 = "gamezone_myaccount";
            n4 = (int)(((ao0_0)object10).a((String)object9) ? 1 : 0);
            object9 = this.requireActivity();
            object9 = object9.getApplication();
            Intrinsics.checkNotNullExpressionValue(object9, string2);
            object9 = z40$a.a((Context)object9);
            object9 = ((z40_0)object9).a;
            string3 = "myaccount_gamezoneinfo";
            object9 = ((ao0_0)object9).b(string3);
            string3 = new JSONObject((String)object9);
            object9 = "title";
            object9 = string3.getString((String)object9);
            String string4 = "isNewTag";
            boolean bl6 = string3.getBoolean(string4);
            String string5 = "webUrlLink";
            string3 = string3.getString(string5);
            if (!bl5 || n4 == 0) break block46;
            boolean bl7 = TextUtils.isEmpty((CharSequence)string3);
            if (bl7) break block46;
            n3 += n7;
            int n15 = 47;
            object2 = new v92_0(n15, (String)object9, bl6);
            try {
                this.Ra(n3, (v92_0)object2);
            }
            catch (Exception exception) {
                object = yn3_0.a;
                ((yn3$a)object).e(exception);
            }
        }
        object = this.P;
        int n16 = R$layout.row_myaccount_list_refresh;
        object2 = new ca2_1((Context)object, n16, (List)object7, this);
        this.A0 = object2;
        object2 = this.E;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(object6);
            boolean bl8 = false;
            object2 = null;
        }
        object6 = this.A0;
        object2.setAdapter((ListAdapter)object6);
        object6 = this.u0;
        if (object6 != null) {
            Intrinsics.checkNotNull(object6);
            ((us1_2)object6).a = object7;
        }
        if ((bl2 = this.bb()) && !(bl2 = this.b1)) {
            object7 = this.r0;
            Intrinsics.checkNotNull(object7);
            ((hy3_0)object7).l();
        }
        object6 = hv3_0.K(R$string.ajiowallet);
        object2 = z40_0.Companion;
        object = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object2.getClass();
        object2 = z40$a.a((Context)object).a;
        object = "isDisplayAJIOWalletNewTag";
        boolean bl9 = ((ao0_0)object2).a((String)object);
        n3 = 12;
        object7 = new v92_0(n3, (String)object6, bl9);
        object6 = cp_1.Companion;
        object6.getClass();
        int n17 = cp$a.t();
        if (n17 != 0) {
            n17 = R$string.ag_account_wallet_info_add_gift_text;
            object6 = this.getString(n17);
            object2 = " ";
            object6 = Ft2.a(object6, (String)object2);
        } else {
            object6 = "";
        }
        int n18 = R$string.ag_account_wallet_info_refund_reward_text;
        object2 = this.getString(n18);
        object6 = Ft2.a(object6, (String)object2);
        ((v92_0)object7).d = object6;
        this.Sa((v92_0)object7);
        object7 = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object7, string2);
        object7 = z40$a.a((Context)object7).a;
        object6 = "android_enablePaymentEngine";
        bl2 = ((ao0_0)object7).a((String)object6);
        if (bl2) {
            n17 = R$string.saved_cards;
            object6 = hv3_0.K(n17);
            int n19 = 36;
            object7 = new v92_0(n19, (String)object6, false);
            this.Sa((v92_0)object7);
        }
        object7 = AnalyticsUtil.Companion;
        object6 = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object6, string2);
        object6 = z40$a.a((Context)object6).a;
        object2 = "enable_my_rewards_status";
        object6 = ((ao0_0)object6).b((String)object2);
        object7 = ((AnalyticsUtil$Companion)object7).mapperToMyRewardsOption((String)object6);
        if (object7 != null && (n17 = (int)(((MyRewardsOption)object7).isEnabled() ? 1 : 0)) != 0 && (n17 = (int)(TextUtils.isEmpty((CharSequence)(object6 = ((MyRewardsOption)object7).getUrlEndPoint())) ? 1 : 0)) == 0) {
            object2 = ((MyRewardsOption)object7).getTitle();
            bl2 = ((MyRewardsOption)object7).isNewTag();
            n3 = 4;
            object6 = new v92_0(n3, (String)object2, bl2);
            this.Sa((v92_0)object6);
        }
        object6 = hv3_0.K(R$string.address);
        object7 = new v92_0(3, (String)object6, false);
        this.Sa((v92_0)object7);
        n17 = R$string.notifications;
        object6 = hv3_0.K(n17);
        object7 = new v92_0(122, (String)object6, false);
        this.Sa((v92_0)object7);
        object6 = this.P;
        int n20 = R$layout.row_myaccount_list_refresh;
        object7 = new ca2_1((Context)object6, n20, (List)object3, this);
        object6 = this.F;
        if (object6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n17 = 0;
            object6 = null;
        }
        object6.setAdapter((ListAdapter)object7);
        object7 = this.v0;
        if (object7 != null) {
            Intrinsics.checkNotNull(object7);
            ((us1_2)object7).a = object3;
        }
        this.Ya();
        object7 = this.M0;
        object6 = Boolean.TRUE;
        bl2 = Intrinsics.areEqual(object7, object6);
        if (bl2 && !(bl2 = this.b1)) {
            object7 = this.n;
            object6 = "ajioWalletVM";
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(object6);
                bl2 = false;
                object7 = null;
            }
            ((wc_1)object7).b();
            object7 = this.n;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(object6);
            } else {
                object5 = object7;
            }
            object7 = ((wc_1)object5).e;
            object6 = this.getViewLifecycleOwner();
            int n21 = 1;
            object5 = new h7_0(this, n21);
            object4 = new BZ1$b((Function1)object5);
            ((LiveData)object7).e((mu1_1)object6, (F62)object4);
        }
        this.ab();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void gb(UserProfileData object) {
        int n3;
        Object[] objectArray;
        Object object2;
        boolean bl2 = true;
        Object object3 = new StringBuilder();
        this.eb((UserProfileData)object);
        Object object4 = this.y;
        if (object4 != null) {
            object2 = ((UserProfileData)object).getFirstName();
            object4.setText((CharSequence)object2);
        }
        if ((object4 = this.D) != null) {
            object2 = ((UserProfileData)object).getMobileNumber();
            object4.setText((CharSequence)object2);
        }
        if ((object4 = this.D) != null) {
            int n4 = R$string.acc_mobile_number_is;
            objectArray = cp_1.Companion;
            Object[] objectArray2 = ((UserProfileData)object).getMobileNumber();
            objectArray.getClass();
            objectArray = cp$a.B((String)objectArray2);
            objectArray2 = new Object[bl2];
            objectArray2[0] = objectArray;
            object2 = this.getString(n4, objectArray2);
            object4.setContentDescription((CharSequence)object2);
        }
        if ((n3 = TextUtils.isEmpty((CharSequence)(object4 = ((UserProfileData)object).getFirstName()))) == 0) {
            n3 = ((UserProfileData)object).getFirstName().charAt(0);
            ((StringBuilder)object3).append((char)n3);
            object4 = ((UserProfileData)object).getFirstName();
        } else {
            object4 = "";
        }
        object2 = ((UserProfileData)object).getLastName();
        boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl3) {
            char c2 = ((UserProfileData)object).getLastName().charAt(0);
            ((StringBuilder)object3).append(c2);
            object2 = ((UserProfileData)object).getLastName();
            objectArray = " ";
            object4 = n1.a((String)object4, (String)objectArray, (String)object2);
        }
        object2 = this.w;
        Intrinsics.checkNotNull(object2);
        object3 = ((StringBuilder)object3).toString();
        object2.setText((CharSequence)object3);
        object3 = this.t0;
        Intrinsics.checkNotNull(object3);
        if (object4 != null) {
            object2 = "FULL_NAME";
            ((sw_0)object3).putPreference((String)object2, (String)object4);
        } else {
            object3.getClass();
        }
        object3 = this.t0;
        Intrinsics.checkNotNull(object3);
        object4 = ((UserProfileData)object).getMobileNumber();
        if (object4 != null) {
            object2 = "INPUT_MOBILE_NUMBER";
            ((sw_0)object3).putPreference((String)object2, (String)object4);
        } else {
            object3.getClass();
        }
        object3 = this.t0;
        Intrinsics.checkNotNull(object3);
        object4 = ((UserProfileData)object).getIdentity();
        if (object4 != null) {
            object2 = "IDENTITY";
            ((sw_0)object3).putPreference((String)object2, (String)object4);
        } else {
            object3.getClass();
        }
        object3 = this.t0;
        Intrinsics.checkNotNull(object3);
        n3 = (int)(((UserProfileData)object).getEmailVerified() ? 1 : 0);
        ((sw_0)object3).putPreference("IS_RIL_EMAIL_VERIFIED", n3 != 0);
        object3 = this.t0;
        Intrinsics.checkNotNull(object3);
        n3 = ((UserProfileData)object).getDisplayEmail();
        object2 = "user_email_account_screen";
        ((sw_0)object3).putPreference((String)object2, n3 != 0);
        boolean bl4 = ((UserProfileData)object).getDisplayEmail();
        if (!bl4) {
            object3 = this.B;
            if (object3 != null) {
                n3 = 8;
                object3.setVisibility(n3);
            }
        } else {
            if (bl4 != bl2) {
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            object3 = this.B;
            if (object3 != null) {
                object3.setVisibility(0);
            }
            if ((object3 = this.B) != null) {
                object4 = ((UserProfileData)object).getDisplayUid();
                object3.setText((CharSequence)object4);
            }
            if ((object3 = this.B) != null) {
                n3 = R$string.acc_email_id_is;
                object2 = ((UserProfileData)object).getDisplayUid();
                objectArray = new Object[bl2];
                objectArray[0] = object2;
                object4 = this.getString(n3, objectArray);
                object3.setContentDescription((CharSequence)object4);
            }
        }
        object3 = h40_0.a;
        bl4 = h40_0.d1();
        if (bl4 && (bl4 = (boolean)h40_0.c1()) && !(bl4 = (boolean)((UserProfileData)object).getEmailVerified()) && (bl4 = (boolean)((UserProfileData)object).getDisplayEmail())) {
            object3 = cp_1.Companion;
            object = ((UserProfileData)object).getDisplayUid();
            object3.getClass();
            boolean bl5 = cp$a.z((String)object);
            if (bl5) {
                this.hb(bl2);
                return;
            }
        }
        this.hb(false);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void hb(boolean bl2) {
        ConstraintLayout constraintLayout;
        int n3;
        int n4;
        String string2;
        int n7;
        Object object;
        Object object2;
        bz1_2 bz1_22 = this;
        ConstraintLayout constraintLayout2 = null;
        if (bl2) {
            void var5_14;
            void var5_11;
            void var5_8;
            Bundle bundle = new Bundle();
            NewCustomEventsRevamp newCustomEventsRevamp = this.t;
            object2 = newCustomEventsRevamp.getDESCRIPTION();
            bundle.putString((String)object2, "when the verify email widget is in the view port");
            object2 = newCustomEventsRevamp.getEC_WIDGET_INTERACTION_EVENT();
            String string3 = newCustomEventsRevamp.getEC_WIDGET_INTERACTION_EVENT();
            object = "verify email impression";
            n7 = 0;
            string2 = null;
            String string4 = "my account screen";
            String string5 = "my account screen";
            String string6 = this.H0;
            String string7 = this.I0;
            int n8 = 1540;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object2, (String)object, null, string3, string4, string5, string6, bundle, string7, false, null, n8, null);
            TextView textView = this.Y0;
            object2 = "verifyEmailTv";
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                Object var5_7 = null;
            }
            object = h40_0.a;
            object = h40_0.B();
            string2 = "ril_employee_benefits_cta_account";
            n3 = object.has(string2);
            string3 = "getString(...)";
            if (n3 != 0) {
                object = h40_0.B().getString(string2);
            } else {
                AJIOApplication.Companion.getClass();
                object = AJIOApplication$a.a();
                n7 = R$string.verify_email_now;
                object = object.getString(n7);
            }
            Intrinsics.checkNotNullExpressionValue(object, string3);
            var5_8.setText((CharSequence)object);
            TextView textView2 = bz1_22.X0;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("verifyEmailTitleTv");
                n4 = 0;
                Object var5_10 = null;
            }
            if ((n3 = (object = h40_0.B()).has(string2 = "ril_employee_benefits_title_account")) != 0) {
                object = h40_0.B().getString(string2);
            } else {
                AJIOApplication.Companion.getClass();
                object = AJIOApplication$a.a();
                n7 = R$string.ril_employee_benefits_title_text_account;
                object = object.getString(n7);
            }
            Intrinsics.checkNotNullExpressionValue(object, string3);
            var5_11.setText((CharSequence)object);
            TextView textView3 = bz1_22.Y0;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                Object var5_13 = null;
            }
            n3 = 1;
            object2 = new t40_0(bz1_22, n3);
            var5_14.setOnClickListener((View.OnClickListener)object2);
        }
        h40_0 h40_02 = h40_0.a;
        n4 = h40_0.u2();
        int n10 = 8;
        n3 = 0;
        object = null;
        if (n4 != 0) {
            void var5_18;
            ConstraintLayout constraintLayout3 = bz1_22.k;
            if (constraintLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("verifyEmailLayoutUcp");
                n4 = 0;
                Object var5_17 = null;
            }
            if (bl2) {
                n7 = 0;
                string2 = null;
            } else {
                n7 = 8;
            }
            var5_18.setVisibility(n7);
        }
        if ((constraintLayout = bz1_22.j) == null) {
            String string8 = "verifyEmailLayout";
            Intrinsics.throwUninitializedPropertyAccessException(string8);
        } else {
            constraintLayout2 = constraintLayout;
        }
        if (bl2) {
            n4 = 0;
            Object var5_22 = null;
        } else {
            n4 = 8;
        }
        constraintLayout2.setVisibility(n4);
        constraintLayout2 = bz1_22.m;
        if (constraintLayout2 != null) {
            if (bl2) {
                n10 = 0;
                object2 = null;
            }
            constraintLayout2.setVisibility(n10);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void i6(LinkDetail linkDetail) {
        String string2;
        boolean bl2;
        Object object;
        bz1_2 bz1_22 = this;
        Object object2 = linkDetail;
        Intrinsics.checkNotNullParameter(linkDetail, "linkDetail");
        Object object3 = AnalyticsManager.Companion;
        Object object4 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
        String string3 = linkDetail.getLinkName();
        string3 = kp1_0.c("Show ", string3);
        String string4 = linkDetail.getLinkName();
        Object object5 = "my account screen";
        ((GTMEvents)object4).pushNavigationTapEvent(string3, string4, (String)object5);
        object4 = linkDetail.getLinkName();
        string3 = "Promotions Terms & Conditions";
        string4 = "Who We Are";
        String string5 = "We Respect Your Privacy";
        String string6 = "Returns & Refunds Policy";
        boolean bl3 = false;
        Boolean bl4 = null;
        if (object4 != null) {
            boolean bl5 = ((String)object4).equalsIgnoreCase(string6);
            if (bl5) {
                object4 = "return refund";
            } else {
                bl5 = ((String)object4).equalsIgnoreCase(string5);
                if (bl5) {
                    object4 = h40_0.a;
                    object4 = h40_0.s();
                    bl2 = object4.optBoolean((String)(object = "master"));
                    if (bl2) {
                        object4 = "we respect your privacy click";
                        bl3 = true;
                    } else {
                        object4 = "we respect your privacy";
                    }
                } else {
                    object = "Fees & Payments";
                    bl5 = ((String)object4).equalsIgnoreCase((String)object);
                    if (bl5) {
                        object4 = "fees payment";
                    } else {
                        bl5 = ((String)object4).equalsIgnoreCase(string4);
                        if (bl5) {
                            object4 = "about us";
                        } else {
                            object = "How Do I Redeem My Coupon?";
                            bl5 = ((String)object4).equalsIgnoreCase((String)object);
                            if (bl5) {
                                object4 = "how do i redeem";
                            } else {
                                bl5 = ((String)object4).equalsIgnoreCase(string3);
                                if (bl5) {
                                    object4 = "promotion terms and condition";
                                }
                            }
                        }
                    }
                }
            }
            object4 = oo1_1.a("&", (String)object4, "and");
            object4 = oo1_1.a("[^a-zA-Z0-9 ]", (String)object4, "");
            object = bz1_22.t;
            string2 = ((NewCustomEventsRevamp)object).getEC_MY_ACC_INTERACTION();
            String string7 = ((String)object4).toLowerCase();
            Intrinsics.checkNotNullExpressionValue(string7, "toLowerCase(...)");
            String string8 = ((NewCustomEventsRevamp)object).getEN_MY_ACCOUNT_INTERACTIONS();
            String string9 = "";
            String string10 = "my account screen";
            String string11 = "my account screen";
            object4 = bz1_22.H0;
            object5 = bz1_22.I0;
            int n3 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string2, string7, string9, string8, string10, string11, (String)object4, null, (String)object5, false, null, n3, null);
        }
        object4 = new HashMap();
        object = linkDetail.getLinkName();
        ((HashMap)object4).put("Action", object);
        object5 = (BaseActivity)bz1_22.P;
        if (object5 != null) {
            object = linkDetail.getPage();
            Intrinsics.checkNotNull(object);
            string2 = linkDetail.getUrl();
            bl4 = bl3;
            ((BaseActivity)object5).A2((String)object, string2, bl4);
        }
        object3 = ((AnalyticsManager$Companion)object3).getInstance().getCt();
        object5 = new AnalyticsData$Builder();
        object4 = ((AnalyticsData$Builder)object5).eventMap((HashMap)object4).build();
        ((CleverTapEvents)object3).accountManagement((AnalyticsData)object4);
        object3 = linkDetail.getLinkName();
        boolean bl6 = true;
        bl2 = kotlin.text.b.i((String)object3, string4, bl6);
        if (bl2) {
            object3 = "who are we screen";
        } else {
            object4 = "Join Our Team";
            bl2 = kotlin.text.b.i((String)object3, (String)object4, bl6);
            if (bl2) {
                object3 = "join our team screen";
            } else {
                bl2 = kotlin.text.b.i((String)object3, string5, bl6);
                if (bl2) {
                    object3 = "privacy policy screen";
                } else {
                    bl2 = kotlin.text.b.i((String)object3, string6, bl6);
                    if (bl2) {
                        object3 = "refund policy screen";
                    } else {
                        object4 = "Terms & Conditions";
                        bl2 = kotlin.text.b.i((String)object3, (String)object4, bl6);
                        if (bl2) {
                            object3 = "terms and condition screen";
                        } else {
                            boolean bl7 = kotlin.text.b.i((String)object3, string3, bl6);
                            if (!bl7) return;
                            object3 = "promotion terms and condition screen";
                        }
                    }
                }
            }
        }
        object4 = object3;
        if (object3 == null) return;
        object5 = null;
        string5 = "my account screen";
        object2 = bz1_22.t;
        string3 = "know about us screen";
        string4 = "my account screen";
        ((NewCustomEventsRevamp)object2).newPushCustomScreenView((String)object3, string3, string4, null, string5);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void ib() {
        block60: {
            block58: {
                block59: {
                    var1_1 = this;
                    var2_2 = 1;
                    var3_3 /* !! */  = this.r0;
                    Intrinsics.checkNotNull(var3_3 /* !! */ );
                    var3_3 /* !! */  = var3_3 /* !! */ .m();
                    var4_4 = 0;
                    var5_5 /* !! */  = null;
                    if (var3_3 /* !! */  != null) {
                        var3_3 /* !! */  = var3_3 /* !! */ .getUserId();
                    } else {
                        var6_6 = 0;
                        var3_3 /* !! */  = null;
                    }
                    var7_7 = var1_1.r0;
                    Intrinsics.checkNotNull(var7_7);
                    var8_8 = var7_7.p();
                    var9_9 = 0;
                    var10_10 = null;
                    var11_11 = "";
                    var12_12 = "SIGN OUT";
                    var13_13 = "button_sign_out";
                    if (var8_8 && (var3_3 /* !! */  == null || (var6_6 = StringsKt.F((CharSequence)var3_3 /* !! */ , (CharSequence)(var7_7 = "@"), false)) == 0)) {
                        v31.a();
                        var3_3 /* !! */  = var1_1.M;
                        Intrinsics.checkNotNull(var3_3 /* !! */ );
                        var7_7 = var1_1.T;
                        var14_14 = "BZ1";
                        var15_15 = 11;
                        var3_3 /* !! */ .onFragmentInteraction(var14_14, var15_15, (Bundle)var7_7);
                        var3_3 /* !! */  = var1_1.r0;
                        Intrinsics.checkNotNull(var3_3 /* !! */ );
                        var3_3 /* !! */ .h();
                        var3_3 /* !! */  = var1_1.K;
                        if (var3_3 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var13_13);
                            var6_6 = 0;
                            var3_3 /* !! */  = null;
                        }
                        var3_3 /* !! */ .setTag((Object)var12_12);
                        tj2_2.Companion.getClass();
                        var3_3 /* !! */  = tj2$a_0.a();
                        var3_3 /* !! */ .getClass();
                        Intrinsics.checkNotNullParameter(var11_11, "pincode");
                        var3_3 /* !! */ .a = var11_11;
                        var3_3 /* !! */  = var1_1.t0;
                        Intrinsics.checkNotNull(var3_3 /* !! */ );
                        var3_3 /* !! */ .putPreference("LOCATION_DATA", var11_11);
                        var3_3 /* !! */  = var1_1.r0;
                        Intrinsics.checkNotNull(var3_3 /* !! */ );
                        var3_3 /* !! */ .f();
                        var3_3 /* !! */  = var1_1.r0;
                        Intrinsics.checkNotNull(var3_3 /* !! */ );
                        var3_3 /* !! */ .g();
                        var3_3 /* !! */  = var1_1.t0;
                        Intrinsics.checkNotNull(var3_3 /* !! */ );
                        var7_7 = "closet_card_in_home";
                        var3_3 /* !! */ .removePreference((String)var7_7);
                        var3_3 /* !! */  = var1_1.s0;
                        Intrinsics.checkNotNull(var3_3 /* !! */ );
                        var3_3 /* !! */ .b();
                        var3_3 /* !! */  = var1_1.r0;
                        Intrinsics.checkNotNull(var3_3 /* !! */ );
                        var3_3 /* !! */ .e();
                        var3_3 /* !! */  = var1_1.r0;
                        Intrinsics.checkNotNull(var3_3 /* !! */ );
                        var3_3 /* !! */ .d();
                        var3_3 /* !! */  = var1_1.t0;
                        Intrinsics.checkNotNull(var3_3 /* !! */ );
                        var3_3 /* !! */ .B();
                        var3_3 /* !! */  = var1_1.t0;
                        Intrinsics.checkNotNull(var3_3 /* !! */ );
                        var3_3 /* !! */ .q(var11_11);
                        var3_3 /* !! */  = var1_1.D0;
                        Intrinsics.checkNotNull(var3_3 /* !! */ );
                        var3_3 /* !! */ .u0(false);
                        var3_3 /* !! */  = var1_1.D0;
                        Intrinsics.checkNotNull(var3_3 /* !! */ );
                        var3_3 /* !! */ .x(false);
                    }
                    var3_3 /* !! */  = var1_1.r0;
                    Intrinsics.checkNotNull(var3_3 /* !! */ );
                    var6_6 = var3_3 /* !! */ .p();
                    var8_8 = 8 != 0;
                    if (var6_6 == 0) break block59;
                    var16_16 /* !! */  = var1_1.u;
                    Intrinsics.checkNotNull(var16_16 /* !! */ );
                    var16_16 /* !! */ .setVisibility(0);
                    var16_16 /* !! */  = var1_1.v;
                    Intrinsics.checkNotNull(var16_16 /* !! */ );
                    var16_16 /* !! */ .setVisibility((int)var8_8);
                    var16_16 /* !! */  = var1_1.K;
                    if (var16_16 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var13_13);
                        var2_2 = 0;
                        var16_16 /* !! */  = null;
                    }
                    var16_16 /* !! */ .setVisibility(0);
                    var2_2 = var1_1.J0;
                    if (var2_2 == 0) {
                        this.fb();
                        var16_16 /* !! */  = var1_1.p;
                        Intrinsics.checkNotNull(var16_16 /* !! */ );
                        var16_16 /* !! */ .startLoader();
                        this.Xa();
                    }
                    var6_6 = 8;
                    var4_4 = 0;
                    var5_5 /* !! */  = null;
                    break block60;
                }
                var3_3 /* !! */  = var1_1.E;
                var14_14 = "nonscroll_list_1";
                if (var3_3 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var14_14);
                    var6_6 = 0;
                    var3_3 /* !! */  = null;
                }
                var3_3 /* !! */ .setAdapter(null);
                var3_3 /* !! */  = var1_1.F;
                var17_18 = "nonscroll_list_2";
                if (var3_3 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var17_18);
                    var6_6 = 0;
                    var3_3 /* !! */  = null;
                }
                var3_3 /* !! */ .setAdapter(null);
                var3_3 /* !! */  = var1_1.G;
                if (var3_3 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("nonscroll_list_3");
                    var6_6 = 0;
                    var3_3 /* !! */  = null;
                }
                var3_3 /* !! */ .setAdapter(null);
                var3_3 /* !! */  = var1_1.Q;
                var3_3 /* !! */ .clear();
                var18_19 = var1_1.u0;
                if (var18_19 != null) {
                    Intrinsics.checkNotNull(var18_19);
                    var18_19.a = var3_3 /* !! */ ;
                }
                var18_19 = var1_1.R;
                var18_19.clear();
                var19_20 = var1_1.v0;
                if (var19_20 != null) {
                    Intrinsics.checkNotNull(var19_20);
                    var19_20.a = var18_19;
                }
                this.Ua();
                var1_1.db(0);
                var20_21 = this.bb();
                var21_22 = "getApplication(...)";
                if (var20_21) {
                    var1_1.z0 = var2_2;
                    var22_23 = z40_0.Companion;
                    var23_24 = this.requireActivity().getApplication();
                    Intrinsics.checkNotNullExpressionValue(var23_24, (String)var21_22);
                    var22_23.getClass();
                    var22_23 = z40$a.a((Context)var23_24).a.b("referral_myaccount_title");
                    var23_24 = this.requireActivity().getApplication();
                    Intrinsics.checkNotNullExpressionValue(var23_24, (String)var21_22);
                    var23_24 = z40$a.a((Context)var23_24).a;
                    var5_5 /* !! */  = "display_referral_new_tag";
                    var4_4 = (int)var23_24.a((String)var5_5 /* !! */ );
                    var24_25 = 42;
                    var19_20 = new v92_0(var24_25, (String)var22_23, (boolean)var4_4);
                    var1_1.Ra(var2_2, (v92_0)var19_20);
                    var4_4 = 1;
                } else {
                    var4_4 = 0;
                    var5_5 /* !! */  = null;
                }
                var19_20 = z40_0.Companion;
                var22_23 = this.requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(var22_23, (String)var21_22);
                var19_20.getClass();
                var19_20 = z40$a.a((Context)var22_23).a;
                var22_23 = "enable_coupon_bonanza";
                var20_21 = var19_20.a((String)var22_23);
                if (var20_21) {
                    var25_26 = R$string.coupon_quest;
                    var22_23 = var1_1.getString(var25_26);
                    var24_25 = 57;
                    var19_20 = new v92_0(var24_25, (String)var22_23, (boolean)var2_2);
                    var1_1.Ra(var4_4 += var2_2, (v92_0)var19_20);
                }
                var19_20 = this.requireActivity();
                var19_20 = var19_20.getApplication();
                Intrinsics.checkNotNullExpressionValue(var19_20, (String)var21_22);
                var19_20 = z40$a.a((Context)var19_20);
                var19_20 = var19_20.a;
                var22_23 = "enable_gamezone";
                var20_21 = var19_20.a((String)var22_23);
                var22_23 = this.requireActivity();
                var22_23 = var22_23.getApplication();
                Intrinsics.checkNotNullExpressionValue(var22_23, (String)var21_22);
                var22_23 = z40$a.a((Context)var22_23);
                var22_23 = var22_23.a;
                var23_24 = "gamezone_myaccount";
                var25_26 = (int)var22_23.a((String)var23_24);
                var23_24 = this.requireActivity();
                var23_24 = var23_24.getApplication();
                Intrinsics.checkNotNullExpressionValue(var23_24, (String)var21_22);
                var21_22 = z40$a.a((Context)var23_24);
                var21_22 = var21_22.a;
                var23_24 = "myaccount_gamezoneinfo";
                var21_22 = var21_22.b((String)var23_24);
                var23_24 = new JSONObject((String)var21_22);
                var21_22 = "title";
                var21_22 = var23_24.getString((String)var21_22);
                var7_7 = "isNewTag";
                var8_8 = var23_24.getBoolean((String)var7_7);
                var10_10 = "webUrlLink";
                var10_10 = var23_24.getString(var10_10);
                if (!var20_21 || var25_26 == 0) break block58;
                var9_9 = (int)TextUtils.isEmpty((CharSequence)var10_10);
                if (var9_9 != 0) break block58;
                var4_4 += var2_2;
                var9_9 = 47;
                var16_16 /* !! */  = new v92_0(var9_9, (String)var21_22, var8_8);
                try {
                    var1_1.Ra(var4_4, (v92_0)var16_16 /* !! */ );
                }
                catch (Exception var16_17) {
                    var5_5 /* !! */  = yn3_0.a;
                    var5_5 /* !! */ .e(var16_17);
                }
            }
            var5_5 /* !! */  = var1_1.P;
            var8_8 = R$layout.row_myaccount_list_refresh;
            var16_16 /* !! */  = new ca2_1((Context)var5_5 /* !! */ , (int)var8_8, (List)var3_3 /* !! */ , var1_1);
            var1_1.A0 = var16_16 /* !! */ ;
            var16_16 /* !! */  = var1_1.E;
            if (var16_16 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var14_14);
                var2_2 = 0;
                var16_16 /* !! */  = null;
            }
            var5_5 /* !! */  = var1_1.A0;
            var16_16 /* !! */ .setAdapter((ListAdapter)var5_5 /* !! */ );
            var16_16 /* !! */  = var1_1.u0;
            if (var16_16 /* !! */  != null) {
                Intrinsics.checkNotNull(var16_16 /* !! */ );
                var16_16 /* !! */ .a = var3_3 /* !! */ ;
            }
            if ((var2_2 = (int)this.bb()) != 0 && (var2_2 = (int)var1_1.b1) == 0) {
                var16_16 /* !! */  = var1_1.r0;
                Intrinsics.checkNotNull(var16_16 /* !! */ );
                var16_16 /* !! */ .l();
            }
            var6_6 = R$string.notifications;
            var3_3 /* !! */  = hv3_0.K(var6_6);
            var8_8 = false;
            var7_7 = null;
            var16_16 /* !! */  = new v92_0(122, (String)var3_3 /* !! */ , false);
            var1_1.Sa((v92_0)var16_16 /* !! */ );
            var3_3 /* !! */  = var1_1.P;
            var4_4 = R$layout.row_myaccount_list_refresh;
            var16_16 /* !! */  = new ca2_1((Context)var3_3 /* !! */ , var4_4, (List)var18_19, var1_1);
            var3_3 /* !! */  = var1_1.F;
            if (var3_3 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var17_18);
                var6_6 = 0;
                var3_3 /* !! */  = null;
            }
            var3_3 /* !! */ .setAdapter((ListAdapter)var16_16 /* !! */ );
            var16_16 /* !! */  = var1_1.v0;
            if (var16_16 /* !! */  != null) {
                Intrinsics.checkNotNull(var16_16 /* !! */ );
                var16_16 /* !! */ .a = var18_19;
            }
            this.Ya();
            this.ab();
            var16_16 /* !! */  = var1_1.N;
            if (var16_16 /* !! */  != null) {
                var1_1.eb((UserProfileData)var16_16 /* !! */ );
            }
            var16_16 /* !! */  = var1_1.u;
            Intrinsics.checkNotNull(var16_16 /* !! */ );
            var6_6 = 8;
            var16_16 /* !! */ .setVisibility(var6_6);
            var16_16 /* !! */  = var1_1.h;
            if (var16_16 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userInfoJcp");
                var2_2 = 0;
                var16_16 /* !! */  = null;
            }
            var16_16 /* !! */ .setVisibility(var6_6);
            var16_16 /* !! */  = var1_1.i;
            if (var16_16 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountCentreLayout");
                var2_2 = 0;
                var16_16 /* !! */  = null;
            }
            var16_16 /* !! */ .setVisibility(var6_6);
            var16_16 /* !! */  = var1_1.k;
            if (var16_16 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException("verifyEmailLayoutUcp");
                var2_2 = 0;
                var16_16 /* !! */  = null;
            }
            var16_16 /* !! */ .setVisibility(var6_6);
            var16_16 /* !! */  = var1_1.v;
            Intrinsics.checkNotNull(var16_16 /* !! */ );
            var4_4 = 0;
            var5_5 /* !! */  = null;
            var16_16 /* !! */ .setVisibility(0);
            var16_16 /* !! */  = var1_1.K;
            if (var16_16 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var13_13);
                var2_2 = 0;
                var16_16 /* !! */  = null;
            }
            var16_16 /* !! */ .setVisibility(var6_6);
            var16_16 /* !! */  = var1_1.K;
            if (var16_16 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var13_13);
                var2_2 = 0;
                var16_16 /* !! */  = null;
            }
            if ((var16_16 /* !! */  = var16_16 /* !! */ .getTag()) == null) ** GOTO lbl-1000
            var16_16 /* !! */  = var1_1.K;
            if (var16_16 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var13_13);
                var2_2 = 0;
                var16_16 /* !! */  = null;
            }
            if ((var2_2 = (int)Intrinsics.areEqual(var16_16 /* !! */  = var16_16 /* !! */ .getTag().toString(), var12_12)) != 0) {
                var16_16 /* !! */  = var1_1.K;
                if (var16_16 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var13_13);
                    var2_2 = 0;
                    var16_16 /* !! */  = null;
                }
                var16_16 /* !! */ .setTag((Object)var11_11);
            } else lbl-1000:
            // 2 sources

            {
                var16_16 /* !! */  = var1_1.p;
                Intrinsics.checkNotNull(var16_16 /* !! */ );
                var16_16 /* !! */ .startLoader();
            }
        }
        var16_16 /* !! */  = var1_1.L;
        if (var16_16 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException("button_settings");
            var2_2 = 0;
            var16_16 /* !! */  = null;
        }
        var7_7 = var1_1.r0;
        Intrinsics.checkNotNull(var7_7);
        var8_8 = var7_7.p();
        if (!var8_8) ** GOTO lbl-1000
        var7_7 = var1_1.r0;
        Intrinsics.checkNotNull(var7_7);
        var7_7.getClass();
        var10_10 = "ajiomobileapps@gmail.com";
        var11_11 = "userId";
        Intrinsics.checkNotNullParameter(var10_10, var11_11);
        var7_7 = var7_7.g;
        var8_8 = var7_7.isDeveloperUser(var10_10);
        if (var8_8) {
            while (true) {
                var9_9 = 0;
                var10_10 = null;
                break;
            }
        } else lbl-1000:
        // 2 sources

        {
            if ((var7_7 = "prod") == (var10_10 = "qaregression")) ** continue;
            var9_9 = 8;
        }
        var16_16 /* !! */ .setVisibility(var9_9);
    }

    public final void onAttach(Context object) {
        Object[] objectArray;
        String string2;
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        Object[] objectArray2 = this.getActivity();
        this.P = objectArray2;
        boolean bl2 = objectArray2 instanceof su_0;
        if (bl2) {
            charSequence = "null cannot be cast to non-null type com.ril.ajio.listener.BackButtonHandlerInterface";
            Intrinsics.checkNotNull(objectArray2, (String)charSequence);
            objectArray2 = (su_0)objectArray2;
            objectArray2.a();
        }
        try {
            objectArray2 = this.P;
        }
        catch (ClassCastException classCastException) {
            yn3_0.a.e(classCastException);
            objectArray2 = this.P;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(objectArray2);
            ((StringBuilder)charSequence).append(" must implement OnFragmentInteractionListener");
            objectArray2 = ((StringBuilder)charSequence).toString();
            ClassCastException classCastException2 = new ClassCastException((String)objectArray2);
            throw classCastException2;
        }
        objectArray2 = (OnFragmentInteractionListener)objectArray2;
        this.M = objectArray2;
        boolean bl3 = object instanceof j3_0;
        bl2 = false;
        charSequence = null;
        if (bl3) {
            objectArray2 = object;
            objectArray2 = (j3_0)object;
            this.p = objectArray2;
        } else {
            objectArray2 = yn3_0.a;
            string2 = "must implement ActivityFragmentListener";
            objectArray = new Object[]{};
            objectArray2.d(string2, objectArray);
        }
        bl3 = object instanceof vh3_2;
        if (bl3) {
            objectArray2 = object;
            objectArray2 = (vh3_2)object;
            this.r = objectArray2;
        } else {
            objectArray2 = yn3_0.a;
            string2 = "must implement TabListener";
            objectArray = new Object[]{};
            objectArray2.d(string2, objectArray);
        }
        bl3 = object instanceof fo3;
        if (bl3) {
            objectArray2 = object;
            objectArray2 = (fo3)object;
            this.q = objectArray2;
        } else {
            objectArray2 = yn3_0.a;
            string2 = "must implement ToolbarListener";
            objectArray = new Object[]{};
            objectArray2.d(string2, objectArray);
        }
        bl3 = object instanceof lz1_1;
        string2 = "must implement LoginListener";
        if (bl3) {
            objectArray2 = object;
            objectArray2 = (lz1_1)object;
            this.s = objectArray2;
        } else {
            objectArray2 = yn3_0.a;
            objectArray = new Object[]{};
            objectArray2.d(string2, objectArray);
        }
        bl3 = object instanceof A71;
        if (bl3) {
            object = (A71)object;
            this.D0 = object;
        } else {
            object = yn3_0.a;
            objectArray2 = new Object[]{};
            ((yn3$a)object).d(string2, objectArray2);
        }
    }

    public final void onClick(View view) {
        bz1_2 bz1_22 = this;
        Object object = "v";
        Object object2 = view;
        Intrinsics.checkNotNullParameter(view, (String)object);
        int n3 = view.getId();
        int n4 = R$id.account_center_layout;
        Object object3 = this.t;
        if (n3 == n4) {
            object2 = this.getActivity();
            Class<LoginActivityRevampNew> clazz = LoginActivityRevampNew.class;
            object = new Intent((Context)object2, clazz);
            boolean bl2 = true;
            object.putExtra("isEditProfile", bl2);
            NewCustomEventsRevamp newCustomEventsRevamp = this.t;
            String string2 = newCustomEventsRevamp.getEC_MY_ACC_INTERACTION();
            String string3 = ((NewCustomEventsRevamp)object3).getEN_MY_ACCOUNT_INTERACTIONS();
            int n7 = 1536;
            String string4 = "account centre";
            String string5 = "";
            String string6 = "my account screen";
            String string7 = "my account screen";
            String string8 = this.H0;
            Object var19_30 = null;
            String string9 = this.I0;
            boolean bl3 = false;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string4, string5, string3, string6, string7, string8, null, string9, false, null, n7, null);
            object2 = this.getActivity();
            if (object2 != null) {
                int n8 = 70;
                ((ComponentActivity)object2).startActivityForResult((Intent)object, n8);
            }
        } else {
            n4 = R$id.button_setting;
            if (n3 == n4) {
                object = this.getActivity();
                if (object != null && (n3 = (int)((object = this.requireActivity()).isFinishing() ? 1 : 0)) == 0) {
                    object = DevSettingsActivity.Companion;
                    object2 = this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(object2, "requireActivity(...)");
                    object.getClass();
                    Intrinsics.checkNotNullParameter(object2, "context");
                    object3 = DevSettingsActivity.class;
                    object = new Intent((Context)object2, (Class)object3);
                    object2.startActivity((Intent)object);
                }
            } else {
                n4 = R$id.edit_button_layout;
                if (n3 == n4) {
                    Object object4 = this.t;
                    String string10 = ((NewCustomEventsRevamp)object4).getEC_MY_ACC_INTERACTION();
                    String string11 = ((NewCustomEventsRevamp)object3).getEN_MY_ACCOUNT_INTERACTIONS();
                    int n10 = 1536;
                    boolean bl4 = false;
                    String string12 = "edit profile";
                    String string13 = "";
                    String string14 = "my account screen";
                    String string15 = "my account screen";
                    String string16 = this.H0;
                    Object var18_29 = null;
                    String string17 = this.I0;
                    Object var20_33 = null;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, string10, string12, string13, string11, string14, string15, string16, null, string17, false, null, n10, null);
                    object = this.getActivity();
                    if (object != null) {
                        boolean bl5;
                        object = new hw3_0();
                        n4 = 0;
                        ((DialogFragment)object).setCancelable(false);
                        object2 = new Bundle();
                        object3 = this.D;
                        Intrinsics.checkNotNull(object3);
                        object3 = ((Object)((AppCompatTextView)object3).getText()).toString();
                        object2.putString("INTENT_USER_PHONE_NUMBER", (String)object3);
                        object3 = this.B;
                        boolean bl6 = false;
                        object4 = null;
                        if (object3 != null) {
                            object3 = ((AppCompatTextView)object3).getText();
                        } else {
                            bl5 = false;
                            object3 = null;
                        }
                        object3 = String.valueOf(object3);
                        string10 = "INTENT_USER_EMAIL_ID";
                        object2.putString(string10, (String)object3);
                        boolean bl7 = bz1_22.O;
                        object2.putBoolean("INTENT_DISPLAY_EMAIL", bl7);
                        object3 = bz1_22.N;
                        if (object3 != null) {
                            object4 = ((UserProfileData)object3).updateNumberRequestWindow;
                        }
                        object2.putString("INTENT_UPDATE_MOBILE_NUMBER_WINDOW", (String)object4);
                        object3 = bz1_22.N;
                        if (object3 != null) {
                            bl5 = ((UserProfileData)object3).updateRequestPending;
                            object4 = "INTENT_UPDATE_PENDING_REQUEST";
                            object2.putBoolean((String)object4, bl5);
                        }
                        ((Fragment)object).setArguments((Bundle)object2);
                        object2 = this.requireActivity().getSupportFragmentManager();
                        object3 = "UpdateProfileOtpBottomSheetFragment";
                        ((DialogFragment)object).show((FragmentManager)object2, (String)object3);
                    }
                } else {
                    n4 = R$id.button_sign_out;
                    if (n3 == n4) {
                        this.Va();
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = UserInformation.getInstance((Context)this.requireActivity().getApplication());
        this.K0 = object;
        object = new CustomToolbarViewMerger(this);
        this.y0 = object;
        object = kd3_2.a();
        Object object2 = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object2, "getApplication(...)");
        Object object3 = new UserRepo((Application)object2);
        object2 = this.requireActivity().getApplication();
        ((kd3_2)object).a = object3;
        ((kd3_2)object).b = object2;
        Intrinsics.checkNotNull(object);
        object3 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object3);
        object2 = "factory";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object4 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object3);
        Object object5 = this.getDefaultViewModelCreationExtras();
        String string2 = "store";
        Intrinsics.checkNotNullParameter(object4, string2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        String string3 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object5, string3);
        Object object6 = hy3_0.class;
        String string4 = "modelClass";
        object = im_1.a((rd3_0)object4, (kd3_2)object, (Wd0)object5, object6, string4);
        object4 = "<this>";
        object5 = sw0_0.a(object6, (String)object4, object6, string4, string4);
        Intrinsics.checkNotNullParameter(object5, (String)object4);
        object6 = object5.getQualifiedName();
        String string5 = "Local and anonymous classes can not be ViewModels";
        if (object6 != null) {
            String string6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object6 = string6.concat((String)object6);
            this.r0 = object = (hy3_0)((pD3)object).a((yn1_2)object5, (String)object6);
            Intrinsics.checkNotNullParameter(this, (String)object3);
            object = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object3);
            object5 = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(this, (String)object3);
            object6 = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object, string2);
            Intrinsics.checkNotNullParameter(object5, (String)object2);
            Intrinsics.checkNotNullParameter(object6, string3);
            Class clazz = BannerAdViewModel.class;
            object = rl3_0.b((rd3_0)object, (E$b)object5, (Wd0)object6, clazz, string4);
            object5 = sw0_0.a(clazz, (String)object4, clazz, string4, string4);
            Intrinsics.checkNotNullParameter(object5, (String)object4);
            object6 = object5.getQualifiedName();
            if (object6 != null) {
                object6 = string6.concat((String)object6);
                this.a1 = object = (BannerAdViewModel)((pD3)object).a((yn1_2)object5, (String)object6);
                object5 = this.requireActivity().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(object5, "getApplicationContext(...)");
                this.t0 = object = new jo_2((Context)object5);
                Intrinsics.checkNotNullParameter(this, (String)object3);
                object = this.getViewModelStore();
                Intrinsics.checkNotNullParameter(this, (String)object3);
                object5 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(this, (String)object3);
                object6 = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(object, string2);
                Intrinsics.checkNotNullParameter(object5, (String)object2);
                Intrinsics.checkNotNullParameter(object6, string3);
                clazz = b52_0.class;
                object = rl3_0.b((rd3_0)object, (E$b)object5, (Wd0)object6, clazz, string4);
                object5 = sw0_0.a(clazz, (String)object4, clazz, string4, string4);
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                object6 = object5.getQualifiedName();
                if (object6 != null) {
                    object6 = string6.concat((String)object6);
                    this.s0 = object = (b52_0)((pD3)object).a((yn1_2)object5, (String)object6);
                    boolean bl2 = true;
                    this.setHasOptionsMenu(bl2);
                    Intrinsics.checkNotNullParameter(this, (String)object3);
                    object = this.getViewModelStore();
                    Intrinsics.checkNotNullParameter(this, (String)object3);
                    object5 = this.getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullParameter(this, (String)object3);
                    object3 = this.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullParameter(object, string2);
                    Intrinsics.checkNotNullParameter(object5, (String)object2);
                    object = li_2.a((Wd0)object3, string3, (rd3_0)object, (E$b)object5, (Wd0)object3);
                    object3 = wc_1.class;
                    Intrinsics.checkNotNullParameter(object3, string4);
                    Intrinsics.checkNotNullParameter(object3, (String)object4);
                    object3 = Reflection.getOrCreateKotlinClass(object3);
                    Intrinsics.checkNotNullParameter(object3, string4);
                    Intrinsics.checkNotNullParameter(object3, string4);
                    Intrinsics.checkNotNullParameter(object3, (String)object4);
                    object2 = object3.getQualifiedName();
                    if (object2 != null) {
                        boolean bl3;
                        object2 = string6.concat((String)object2);
                        this.n = object = (wc_1)((pD3)object).a((yn1_2)object3, (String)object2);
                        object = z40_0.Companion;
                        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                        object3 = "is_my_account_ajio_wallet_widget_enabled";
                        bl2 = ((ao0_0)object).a((String)object3);
                        this.M0 = object = Boolean.valueOf(bl2);
                        object = this.getActivity();
                        if (object != null && !(bl2 = (object = this.requireActivity()).isFinishing())) {
                            object = this.requireActivity();
                            object.invalidateOptionsMenu();
                        }
                        if ((object = this.getArguments()) != null && (bl3 = object.containsKey((String)(object3 = "IS_FROM_FLEEK")))) {
                            this.Z0 = bl2 = object.getBoolean((String)object3);
                        }
                        return;
                    }
                    object3 = string5.toString();
                    object = new IllegalArgumentException((String)object3);
                    throw object;
                }
                object3 = string5.toString();
                object = new IllegalArgumentException((String)object3);
                throw object;
            }
            object3 = string5.toString();
            object = new IllegalArgumentException((String)object3);
            throw object;
        }
        object3 = string5.toString();
        object = new IllegalArgumentException((String)object3);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        boolean bl2;
        String string2;
        Object object2;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        object = od3_2.a;
        int n3 = object.length();
        if (n3 == 0) {
            object = od3_2.a();
        }
        n3 = (int)(s20.a ? 1 : 0);
        boolean bl3 = true;
        int n4 = 0;
        if (n3 == 0 && (n3 = (int)(Intrinsics.areEqual(object2 = od3_2.a(), string2 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0)) == 0) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = 1;
        }
        if (n3 != 0 || (bl2 = Intrinsics.areEqual(object, object2 = ld3_2.STORE_AJIOGRAM.getStoreId()))) {
            n4 = 1;
        }
        if (n4 != 0 && (object = this.getContext()) != null && (object = object.getTheme()) != null) {
            n3 = R$style.FleekTheme;
            object.applyStyle(n3, bl3);
        }
        if ((object = this.y0) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customToolbarViewMerger");
            bl2 = false;
            object = null;
        }
        object2 = object;
        Context context = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        n4 = R$layout.my_account_frag_main_layout;
        int n7 = R$layout.new_fragment_my_account;
        return ((CustomToolbarViewMerger)object).inflateView(context, n4, n7, layoutInflater, viewGroup);
    }

    public final void onDestroyView() {
        boolean bl2;
        String string2;
        String string3;
        super.onDestroyView();
        Object object = od3_2.a;
        int n3 = object.length();
        if (n3 == 0) {
            object = od3_2.a();
        }
        n3 = (int)(s20.a ? 1 : 0);
        boolean bl3 = true;
        boolean bl4 = false;
        if (n3 == 0 && (n3 = (int)(Intrinsics.areEqual(string3 = od3_2.a(), string2 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0)) == 0) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = 1;
        }
        if (n3 != 0 || (bl2 = Intrinsics.areEqual(object, string3 = ld3_2.STORE_AJIOGRAM.getStoreId()))) {
            bl4 = true;
        }
        if (bl4 && (object = this.getContext()) != null && (object = object.getTheme()) != null) {
            n3 = R$style.MyMaterialThemeStatusBar;
            object.applyStyle(n3, bl3);
        }
        if ((object = this.d1) != null && object != null) {
            ((JioAdView)object).onDestroy();
        }
        object = this.p;
        Intrinsics.checkNotNull(object);
        object.stopLoader();
        object = this.E0;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            ((pg2_2)object).a();
        }
        object = new Message();
        ((Message)object).what = 1002;
        AnalyticsGAEventHandler.Companion.getInstance().sendMessage((Message)object);
    }

    public final void onDetach() {
        super.onDetach();
        this.M = null;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        boolean bl2;
        String string2;
        String string3;
        String string4 = od3_2.a;
        int n3 = string4.length();
        if (n3 == 0) {
            string4 = od3_2.a();
        }
        n3 = (int)(s20.a ? 1 : 0);
        int n4 = 1;
        boolean bl3 = false;
        if (n3 == 0 && (n3 = (int)(Intrinsics.areEqual(string3 = od3_2.a(), string2 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0)) == 0) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = 1;
        }
        if (n3 != 0 || (bl2 = Intrinsics.areEqual(string4, string3 = ld3_2.STORE_AJIOGRAM.getStoreId()))) {
            bl3 = true;
        }
        if (bl3 && (bl2 = kotlin.text.b.i(string4 = od3_2.a(), string3 = ld3_2.STORE_AJIOGRAM.getStoreId(), n4 != 0))) {
            bundle = super.onGetLayoutInflater(bundle);
            string3 = this.requireContext();
            n4 = R$style.FleekTheme;
            string4 = new ContextThemeWrapper((Context)string3, n4);
            bundle = bundle.cloneInContext((Context)string4);
            Intrinsics.checkNotNullExpressionValue(bundle, "cloneInContext(...)");
            return bundle;
        }
        return super.onGetLayoutInflater(bundle);
    }

    public final boolean onLongClick(View object) {
        block10: {
            Object object2 = "v";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            int n3 = object.getId();
            int n4 = R$id.version_layout;
            if (n3 == n4) {
                object = this.getContext();
                n3 = (int)(vV1.e((Context)object) ? 1 : 0);
                if (n3 == 0) break block10;
                object = FirebaseMessaging.getInstance();
                object = ((FirebaseMessaging)object).getToken();
                object2 = new na1_1(this);
                try {
                    ((Task)object).addOnCompleteListener((OnCompleteListener)object2);
                    return true;
                }
                catch (Exception exception) {
                    object2 = yn3_0.a;
                    String string2 = exception.getLocalizedMessage();
                    if (string2 == null) {
                        string2 = "";
                    }
                    string2 = "Exception is :".concat(string2);
                    Object[] objectArray = new Object[]{};
                    ((yn3$a)object2).a(string2, objectArray);
                }
            }
        }
        return false;
    }

    public final void onNavigationClick() {
    }

    public final void onPause() {
        this.J0 = false;
        super.onPause();
    }

    public final void onResume() {
        Object object;
        int n3;
        Object object2;
        int n4;
        int n7 = 1;
        int n8 = 0;
        Object object3 = null;
        this.J0 = false;
        Object object4 = new Bundle();
        Object object5 = this.t0;
        if (object5 != null) {
            n4 = ((jo_2)object5).d();
            object2 = "number_of_items_on_cart";
            object4.putInt((String)object2, n4);
        }
        object5 = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object5).getInstance().getGtmEvents();
        String string2 = "my account screen";
        ((GTMEvents)object2).pushOpenScreenEvent(string2, (Bundle)object4);
        Object object6 = ((AnalyticsManager$Companion)object5).getInstance().getNewCustomEventsRevamp();
        object4 = this.G0;
        String string3 = ((NewEEcommerceEventsRevamp)object4).getPrevScreen();
        String string4 = ((NewEEcommerceEventsRevamp)object4).getPrevScreenType();
        String string5 = "my account screen";
        String string6 = "my account screen";
        ((NewCustomEventsRevamp)object6).newPushCustomScreenView(string5, string6, string3, null, string4);
        super.onResume();
        object4 = this.q0;
        n4 = ((Bundle)object4).length;
        object2 = null;
        for (n3 = 0; n3 < n4; n3 += n7) {
            object4[n3] = (Bundle)false;
        }
        object3 = this.getArguments();
        object4 = null;
        this.setArguments(null);
        if (object3 == null && (n3 = (object5 = this.P) instanceof AjioHomeActivity) != 0) {
            object3 = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
            Intrinsics.checkNotNull(object5, (String)object3);
            object5 = ((AjioHomeActivity)object5).j1;
            object2 = this.P;
            Intrinsics.checkNotNull(object2, (String)object3);
            object2 = (AjioHomeActivity)object2;
            ((AjioHomeActivity)object2).j1 = null;
            object3 = object5;
        }
        object5 = "DEEP_LINK_MY_ACCOUNT";
        if (object3 != null) {
            n3 = (int)(object3.getBoolean((String)object5) ? 1 : 0);
            this.Z = n3;
        }
        if (object3 != null && (n3 = (int)(this.Z ? 1 : 0)) != 0) {
            this.Y = n7;
            object3.remove((String)object5);
            object = "DEEP_LINK_ID";
            n7 = object3.getInt((String)object);
            n4 = 11;
            if (n7 != n4) {
                object5 = bz1_2.class;
                n3 = 12;
                if (n7 != n3) {
                    object = "ORDER_NO";
                    object2 = object3.getString((String)object);
                    object6 = "RETURN_ID";
                    boolean bl2 = object3.containsKey((String)object6);
                    if (bl2) {
                        string5 = object3.getString((String)object6);
                    } else {
                        bl2 = false;
                        string5 = null;
                    }
                    string6 = "clicked_item_code";
                    boolean bl3 = object3.containsKey(string6);
                    if (bl3) {
                        object4 = object3.getString(string6);
                    }
                    object = E1.a((String)object, (String)object2);
                    if (string5 != null) {
                        object.putString((String)object6, string5);
                    }
                    if (object4 != null && (n8 = ((String)object4).length()) != 0) {
                        object.putString(string6, (String)object4);
                    }
                    object3 = this.M;
                    Intrinsics.checkNotNull(object3);
                    object4 = ((Class)object5).getName();
                    n4 = 10;
                    object3.onFragmentInteraction((String)object4, n4, (Bundle)object);
                } else {
                    object = this.M;
                    Intrinsics.checkNotNull(object);
                    object3 = ((Class)object5).getName();
                    object.onFragmentInteraction((String)object3, n3, null);
                }
            } else {
                object = (BaseActivity)this.P;
                Intrinsics.checkNotNull(object);
                object3 = BaseActivity.Companion;
                object3 = Boolean.FALSE;
                object4 = "static";
                object5 = "contact-us-app";
                ((BaseActivity)object).A2((String)object4, (String)object5, (Boolean)object3);
            }
        }
        this.ib();
        object = this.F0;
        if (object != null) {
            object3 = this.F0;
            Intrinsics.checkNotNull(object3);
            object = new pg2_2((View)object3, string2);
            this.E0 = object;
        }
    }

    public final void onStop() {
        super.onStop();
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp();
        String string2 = "my account screen";
        newEEcommerceEventsRevamp.setPreviousScreenData(string2, string2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onViewCreated(View var1_1, Bundle var2_2) {
        var3_4 = 1;
        var4_5 = null;
        Intrinsics.checkNotNullParameter(var1_1, "view");
        super.onViewCreated((View)var1_1, var2_2 /* !! */ );
        var2_2 /* !! */  = this.q;
        Intrinsics.checkNotNull(var2_2 /* !! */ );
        var2_2 /* !! */ .hideToolbarLayout();
        var2_2 /* !! */  = this.y0;
        var5_6 /* !! */  = "customToolbarViewMerger";
        var6_7 = null;
        if (var2_2 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var5_6 /* !! */ );
            var7_8 = 0;
            var2_2 /* !! */  = null;
        }
        if ((var2_2 /* !! */  = var2_2 /* !! */ .getToolbar()) != null) {
            var2_2 /* !! */  = this.y0;
            if (var2_2 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var5_6 /* !! */ );
                var7_8 = 0;
                var2_2 /* !! */  = null;
            }
            var2_2 /* !! */  = var2_2 /* !! */ .getToolbar();
            Intrinsics.checkNotNull(var2_2 /* !! */ );
            var2_2 /* !! */ .invalidate();
        }
        if ((var7_8 = (var2_2 /* !! */  = this.getActivity()) instanceof AppCompatActivity) != 0) {
            var2_2 /* !! */  = (AppCompatActivity)this.getActivity();
            Intrinsics.checkNotNull(var2_2 /* !! */ );
            var8_9 = this.y0;
            if (var8_9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var5_6 /* !! */ );
                var9_10 = false;
                var8_9 = null;
            }
            var8_9 = var8_9.getToolbar();
            var2_2 /* !! */ .setSupportActionBar((Toolbar)var8_9);
        }
        var7_8 = R$id.float_header_view;
        var2_2 /* !! */  = var1_1.findViewById(var7_8);
        var8_9 = var2_2 /* !! */ .getLayoutParams();
        Intrinsics.checkNotNull(var8_9, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        var8_9 = (CoordinatorLayout$e)var8_9;
        var11_12 = this.requireContext();
        var12_13 = "requireContext(...)";
        Intrinsics.checkNotNullExpressionValue(var11_12, (String)var12_13);
        var10_11 /* !! */  = new CustomCoordinatorBehavior((Context)var11_12, null);
        var8_9.b((CoordinatorLayout$Behavior)var10_11 /* !! */ );
        var9_10 = R$id.collapsing_toolbar;
        var8_9 = var1_1.findViewById((int)var9_10);
        var11_12 = this.y0;
        if (var11_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var5_6 /* !! */ );
            var13_14 = 0;
            var11_12 = null;
        }
        var11_12.setNavigationIcon(null, null);
        var10_11 /* !! */ .setBackBtnDisable((boolean)var3_4);
        var2_2 /* !! */ .requestLayout();
        var2_2 /* !! */  = var8_9.getLayoutParams();
        var2_2 /* !! */ .height = var14_15 = hv3_0.q(R$dimen.wishlist_toolbar_height_refresh_1);
        var8_9.requestLayout();
        var2_2 /* !! */  = this.y0;
        if (var2_2 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var5_6 /* !! */ );
            var7_8 = 0;
            var2_2 /* !! */  = null;
        }
        var2_2 /* !! */ .setNavigationClick();
        var2_2 /* !! */  = this.y0;
        if (var2_2 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var5_6 /* !! */ );
            var7_8 = 0;
            var2_2 /* !! */  = null;
        }
        var9_10 = R$string.txt_my_account;
        var8_9 = this.getString((int)var9_10);
        var10_11 /* !! */  = "getString(...)";
        Intrinsics.checkNotNullExpressionValue(var8_9, (String)var10_11 /* !! */ );
        var2_2 /* !! */ .setTitleText((String)var8_9);
        var2_2 /* !! */  = this.y0;
        if (var2_2 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var5_6 /* !! */ );
            var7_8 = 0;
            var2_2 /* !! */  = null;
        }
        if ((var2_2 /* !! */  = var2_2 /* !! */ .getToolbar()) != null) {
            var9_10 = R$string.acc_page_header_my_account;
            var8_9 = hv3_0.K((int)var9_10);
            var2_2 /* !! */ .setContentDescription((CharSequence)var8_9);
        }
        var8_9 = Looper.getMainLooper();
        var2_2 /* !! */  = new Handler((Looper)var8_9);
        var8_9 = new wZ1(this);
        var15_16 = 100;
        var2_2 /* !! */ .postDelayed((Runnable)var8_9, var15_16);
        var2_2 /* !! */  = this.y0;
        if (var2_2 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var5_6 /* !! */ );
            var7_8 = 0;
            var2_2 /* !! */  = null;
        }
        var2_2 /* !! */  = var2_2 /* !! */ .getHeaderTitleTv();
        var8_9 = " ";
        if (var2_2 /* !! */  != null) {
            var14_15 = R$string.header_text;
            var10_11 /* !! */  = hv3_0.K(var14_15);
            var13_14 = R$string.txt_my_account;
            var11_12 = hv3_0.K(var13_14);
            var12_13 = new StringBuilder();
            var12_13.append((String)var10_11 /* !! */ );
            var12_13.append((String)var8_9);
            var12_13.append((String)var11_12);
            var10_11 /* !! */  = var12_13.toString();
            var2_2 /* !! */ .setContentDescription((CharSequence)var10_11 /* !! */ );
        }
        if ((var2_2 /* !! */  = this.y0) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var5_6 /* !! */ );
            var7_8 = 0;
            var2_2 /* !! */  = null;
        }
        if ((var2_2 /* !! */  = var2_2 /* !! */ .getFloatTitleTv()) != null) {
            var14_15 = R$string.title_text;
            var10_11 /* !! */  = hv3_0.K(var14_15);
            var13_14 = R$string.txt_my_account;
            var11_12 = hv3_0.K(var13_14);
            var12_13 = new StringBuilder();
            var12_13.append((String)var10_11 /* !! */ );
            var12_13.append((String)var8_9);
            var12_13.append((String)var11_12);
            var8_9 = var12_13.toString();
            var2_2 /* !! */ .setContentDescription((CharSequence)var8_9);
        }
        if ((var2_2 /* !! */  = this.y0) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var5_6 /* !! */ );
            var7_8 = 0;
            var2_2 /* !! */  = null;
        }
        var17_17 = 8;
        var2_2 /* !! */ .setSubTitleVisibility(var17_17);
        var2_2 /* !! */  = this.r;
        Intrinsics.checkNotNull(var2_2 /* !! */ );
        var9_10 = this.Z0 ^ var3_4;
        var2_2 /* !! */ .showTabLayout(var9_10);
        var7_8 = R$id.wallet_info;
        var2_2 /* !! */  = (ConstraintLayout)var1_1.findViewById(var7_8);
        this.g = var2_2 /* !! */ ;
        var7_8 = R$id.verify_email_layout;
        var2_2 /* !! */  = (ConstraintLayout)var1_1.findViewById(var7_8);
        this.j = var2_2 /* !! */ ;
        var7_8 = R$id.verify_email_layout_ucp;
        var2_2 /* !! */  = (ConstraintLayout)var1_1.findViewById(var7_8);
        this.k = var2_2 /* !! */ ;
        var7_8 = R$id.ril_empl_not_verified_error_icon;
        var2_2 /* !! */  = (ImageView)var1_1.findViewById(var7_8);
        this.m = var2_2 /* !! */ ;
        var7_8 = R$id.fma_scrollview_account;
        var2_2 /* !! */  = (NestedScrollView)var1_1.findViewById(var7_8);
        this.k0 = var2_2 /* !! */ ;
        var8_9 = "mScrollviewAccount";
        if (var2_2 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var8_9);
            var7_8 = 0;
            var2_2 /* !! */  = null;
        }
        var2_2 /* !! */  = var2_2 /* !! */ .getChildAt(0);
        this.p0 = var2_2 /* !! */ ;
        var7_8 = R$id.profile_info_layout;
        var2_2 /* !! */  = (RelativeLayout)var1_1.findViewById(var7_8);
        this.u = var2_2 /* !! */ ;
        var7_8 = R$id.sigin_layout;
        var2_2 /* !! */  = (RelativeLayout)var1_1.findViewById(var7_8);
        this.v = var2_2 /* !! */ ;
        var7_8 = R$id.signin_bt_myact;
        var2_2 /* !! */  = (Button)var1_1.findViewById(var7_8);
        Intrinsics.checkNotNull(var2_2 /* !! */ );
        var10_11 /* !! */  = new rz1_1(this);
        ai0_2.v((View)var2_2 /* !! */ , (Function1)var10_11 /* !! */ );
        var7_8 = R$id.account_center_layout;
        var2_2 /* !! */  = (ConstraintLayout)var1_1.findViewById(var7_8);
        this.i = var2_2 /* !! */ ;
        var7_8 = R$id.user_info_jcp;
        var2_2 /* !! */  = (ConstraintLayout)var1_1.findViewById(var7_8);
        this.h = var2_2 /* !! */ ;
        var10_11 /* !! */  = "userInfoJcp";
        if (var2_2 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var10_11 /* !! */ );
            var7_8 = 0;
            var2_2 /* !! */  = null;
        }
        var13_14 = R$id.name_letters;
        var2_2 /* !! */  = (AjioTextView)var2_2 /* !! */ .findViewById(var13_14);
        this.x = var2_2 /* !! */ ;
        var2_2 /* !! */  = this.h;
        if (var2_2 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var10_11 /* !! */ );
            var7_8 = 0;
            var2_2 /* !! */  = null;
        }
        var13_14 = R$id.user_name;
        var2_2 /* !! */  = (AjioTextView)var2_2 /* !! */ .findViewById(var13_14);
        this.z = var2_2 /* !! */ ;
        var2_2 /* !! */  = this.h;
        if (var2_2 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var10_11 /* !! */ );
            var7_8 = 0;
            var2_2 /* !! */  = null;
        }
        var14_15 = R$id.user_phone_no;
        var2_2 /* !! */  = (AjioTextView)var2_2 /* !! */ .findViewById(var14_15);
        this.A = var2_2 /* !! */ ;
        var2_2 /* !! */  = this.i;
        if (var2_2 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accountCentreLayout");
            var7_8 = 0;
            var2_2 /* !! */  = null;
        }
        var14_15 = R$id.feature_info;
        var2_2 /* !! */  = (AjioTextView)var2_2 /* !! */ .findViewById(var14_15);
        this.C = var2_2 /* !! */ ;
        var7_8 = R$id.name_letters;
        var2_2 /* !! */  = (AjioTextView)var1_1.findViewById(var7_8);
        this.w = var2_2 /* !! */ ;
        var7_8 = R$id.user_name;
        var2_2 /* !! */  = (AjioTextView)var1_1.findViewById(var7_8);
        this.y = var2_2 /* !! */ ;
        var7_8 = R$id.user_email;
        var2_2 /* !! */  = (AjioTextView)var1_1.findViewById(var7_8);
        this.B = var2_2 /* !! */ ;
        var7_8 = R$id.user_phone_no;
        var2_2 /* !! */  = (AjioTextView)var1_1.findViewById(var7_8);
        this.D = var2_2 /* !! */ ;
        var7_8 = R$id.nonscroll_list_1;
        var2_2 /* !! */  = (AjioNonScrollableListView)var1_1.findViewById(var7_8);
        this.E = var2_2 /* !! */ ;
        var7_8 = R$id.nonscroll_list_2;
        var2_2 /* !! */  = (AjioNonScrollableListView)var1_1.findViewById(var7_8);
        this.F = var2_2 /* !! */ ;
        var7_8 = R$id.nonscroll_list_3;
        var2_2 /* !! */  = (AjioNonScrollableListView)var1_1.findViewById(var7_8);
        this.G = var2_2 /* !! */ ;
        var7_8 = R$id.banner_root_view;
        var2_2 /* !! */  = (FrameLayout)var1_1.findViewById(var7_8);
        this.H = var2_2 /* !! */ ;
        if (var2_2 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banerRootViewItem");
            var7_8 = 0;
            var2_2 /* !! */  = null;
        }
        var14_15 = R$id.banner_my_account;
        var2_2 /* !! */  = var2_2 /* !! */ .findViewById(var14_15);
        this.I = var2_2 /* !! */ ;
        var7_8 = R$id.button_sign_out;
        var2_2 /* !! */  = (TextView)var1_1.findViewById(var7_8);
        this.K = var2_2 /* !! */ ;
        var7_8 = R$id.button_setting;
        var2_2 /* !! */  = (AjioButton)var1_1.findViewById(var7_8);
        this.L = var2_2 /* !! */ ;
        var7_8 = R$id.version_layout;
        var2_2 /* !! */  = (LinearLayout)var1_1.findViewById(var7_8);
        this.x0 = var2_2 /* !! */ ;
        var2_2 /* !! */  = this.g;
        var10_11 /* !! */  = "walletLayout";
        if (var2_2 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var10_11 /* !! */ );
            var7_8 = 0;
            var2_2 /* !! */  = null;
        }
        var13_14 = R$id.aw_point_amt;
        var2_2 /* !! */  = (TextView)var2_2 /* !! */ .findViewById(var13_14);
        this.W0 = var2_2 /* !! */ ;
        var2_2 /* !! */  = this.g;
        if (var2_2 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var10_11 /* !! */ );
            var7_8 = 0;
            var2_2 /* !! */  = null;
        }
        var14_15 = R$id.aw_point_bg;
        var2_2 /* !! */  = var2_2 /* !! */ .findViewById(var14_15);
        this.V0 = var2_2 /* !! */ ;
        var2_2 /* !! */  = h40_0.a;
        var7_8 = (int)h40_0.u2();
        if (var7_8 != 0) {
            var2_2 /* !! */  = this.k;
            var10_11 /* !! */  = "verifyEmailLayoutUcp";
            if (var2_2 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var10_11 /* !! */ );
                var7_8 = 0;
                var2_2 /* !! */  = null;
            }
            var13_14 = R$id.ril_employee_verify_email;
            var2_2 /* !! */  = (TextView)var2_2 /* !! */ .findViewById(var13_14);
            this.Y0 = var2_2 /* !! */ ;
            var2_2 /* !! */  = this.k;
            if (var2_2 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var10_11 /* !! */ );
                var7_8 = 0;
                var2_2 /* !! */  = null;
            }
            var14_15 = R$id.ril_employee_info_msg;
            var2_2 /* !! */  = (TextView)var2_2 /* !! */ .findViewById(var14_15);
            this.X0 = var2_2 /* !! */ ;
        } else {
            var2_2 /* !! */  = this.j;
            var10_11 /* !! */  = "verifyEmailLayout";
            if (var2_2 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var10_11 /* !! */ );
                var7_8 = 0;
                var2_2 /* !! */  = null;
            }
            var13_14 = R$id.ril_employee_verify_email;
            var2_2 /* !! */  = (TextView)var2_2 /* !! */ .findViewById(var13_14);
            this.Y0 = var2_2 /* !! */ ;
            var2_2 /* !! */  = this.j;
            if (var2_2 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var10_11 /* !! */ );
                var7_8 = 0;
                var2_2 /* !! */  = null;
            }
            var14_15 = R$id.ril_employee_info_msg;
            var2_2 /* !! */  = (TextView)var2_2 /* !! */ .findViewById(var14_15);
            this.X0 = var2_2 /* !! */ ;
        }
        var2_2 /* !! */  = this.L;
        var10_11 /* !! */  = "button_settings";
        if (var2_2 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var10_11 /* !! */ );
            var7_8 = 0;
            var2_2 /* !! */  = null;
        }
        var11_12 = this.r0;
        Intrinsics.checkNotNull(var11_12);
        var13_14 = (int)var11_12.p();
        if (var13_14 == 0) ** GOTO lbl-1000
        var11_12 = this.r0;
        Intrinsics.checkNotNull(var11_12);
        var11_12.getClass();
        var12_13 = "ajiomobileapps@gmail.com";
        var18_18 = "userId";
        Intrinsics.checkNotNullParameter(var12_13, var18_18);
        var11_12 = var11_12.g;
        var13_14 = (int)var11_12.isDeveloperUser((String)var12_13);
        if (var13_14 != 0) {
            while (true) {
                var13_14 = 0;
                var11_12 = null;
                break;
            }
        } else lbl-1000:
        // 2 sources

        {
            if ((var11_12 = "prod") == (var12_13 = "qaregression")) ** continue;
            var13_14 = 8;
        }
        var2_2 /* !! */ .setVisibility(var13_14);
        var7_8 = R$id.text_ajio_app_version_number;
        var2_2 /* !! */  = var1_1.findViewById(var7_8);
        var11_12 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(var2_2 /* !! */ , (String)var11_12);
        var2_2 /* !! */  = (AjioTextView)var2_2 /* !! */ ;
        var19_19 = R$id.text_ajio_build_version_number;
        var12_13 = var1_1.findViewById(var19_19);
        Intrinsics.checkNotNullExpressionValue(var12_13, (String)var11_12);
        var12_13 = (AjioTextView)var12_13;
        var11_12 = new Bundle();
        this.T = var11_12;
        Intrinsics.checkNotNull(var11_12);
        var20_20 = "signout";
        var11_12.putString("page_name", var20_20);
        var11_12 = this.T;
        Intrinsics.checkNotNull(var11_12);
        var18_18 = "page_url";
        var11_12.putString(var18_18, var20_20);
        var11_12 = this.K;
        if (var11_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("button_sign_out");
            var13_14 = 0;
            var11_12 = null;
        }
        var11_12.setOnClickListener((View.OnClickListener)this);
        var11_12 = this.L;
        if (var11_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var10_11 /* !! */ );
            var13_14 = 0;
            var11_12 = null;
        }
        var11_12.setOnClickListener((View.OnClickListener)this);
        var14_15 = R$id.edit_button_layout;
        var1_1.findViewById(var14_15).setOnClickListener((View.OnClickListener)this);
        var10_11 /* !! */  = this.x0;
        if (var10_11 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException("versionLayout");
            var14_15 = 0;
            var10_11 /* !! */  = null;
        }
        var10_11 /* !! */ .setOnLongClickListener((View.OnLongClickListener)this);
        var11_12 = this.Q;
        this.u0 = var10_11 /* !! */  = new us1_2(this, (ArrayList)var11_12);
        var11_12 = this.R;
        this.v0 = var10_11 /* !! */  = new us1_2(this, (ArrayList)var11_12);
        var11_12 = this.S;
        this.w0 = var10_11 /* !! */  = new us1_2(this, (ArrayList)var11_12);
        var10_11 /* !! */  = this.E;
        if (var10_11 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nonscroll_list_1");
            var14_15 = 0;
            var10_11 /* !! */  = null;
        }
        var11_12 = this.u0;
        var10_11 /* !! */ .setOnItemClickListener((AdapterView.OnItemClickListener)var11_12);
        var10_11 /* !! */  = this.F;
        if (var10_11 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nonscroll_list_2");
            var14_15 = 0;
            var10_11 /* !! */  = null;
        }
        var11_12 = this.v0;
        var10_11 /* !! */ .setOnItemClickListener((AdapterView.OnItemClickListener)var11_12);
        var10_11 /* !! */  = this.G;
        if (var10_11 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nonscroll_list_3");
            var14_15 = 0;
            var10_11 /* !! */  = null;
        }
        var11_12 = this.w0;
        var10_11 /* !! */ .setOnItemClickListener((AdapterView.OnItemClickListener)var11_12);
        var2_2 /* !! */ .setVisibility(var17_17);
        var12_13.setVisibility(var17_17);
        var5_6 /* !! */  = StringCompanionObject.INSTANCE;
        AJIOApplication.Companion.getClass();
        var5_6 /* !! */  = AJIOApplication$a.a().getApplicationContext();
        var10_11 /* !! */  = "getApplicationContext(...)";
        Intrinsics.checkNotNullExpressionValue(var5_6 /* !! */ , (String)var10_11 /* !! */ );
        var5_6 /* !! */  = p90.a((Context)var5_6 /* !! */ );
        var11_12 = new Object[var3_4];
        var11_12[0] = var5_6 /* !! */ ;
        var18_18 = "format(...)";
        n40_0.a((Object[])var11_12, var3_4, "Version %s", var18_18, (AjioTextView)var2_2 /* !! */ );
        var2_2 /* !! */ .setVisibility(0);
        var2_2 /* !! */  = AJIOApplication$a.a().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(var2_2 /* !! */ , (String)var10_11 /* !! */ );
        var5_6 /* !! */  = "context";
        Intrinsics.checkNotNullParameter(var2_2 /* !! */ , (String)var5_6 /* !! */ );
        var5_6 /* !! */  = var2_2 /* !! */ .getPackageManager();
        var2_2 /* !! */  = var2_2 /* !! */ .getPackageName();
        var2_2 /* !! */  = var5_6 /* !! */ .getPackageInfo((String)var2_2 /* !! */ , 0);
        try {
            var7_8 = var2_2 /* !! */ .versionCode;
        }
        catch (Exception var2_3) {
            var5_6 /* !! */  = yn3_0.a;
            var5_6 /* !! */ .e(var2_3);
            var7_8 = 0;
            var2_2 /* !! */  = null;
        }
        var2_2 /* !! */  = Integer.valueOf(var7_8);
        var5_6 /* !! */  = new Object[var3_4];
        var5_6 /* !! */ [0] = var2_2 /* !! */ ;
        var2_2 /* !! */  = "Build %d";
        n40_0.a(var5_6 /* !! */ , var3_4, (String)var2_2 /* !! */ , var18_18, (AjioTextView)var12_13);
        var12_13.setVisibility(0);
        var7_8 = Build.VERSION.SDK_INT;
        var3_4 = 23;
        if (var7_8 >= var3_4) {
            var2_2 /* !! */  = this.k0;
            if (var2_2 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var8_9);
                var7_8 = 0;
                var2_2 /* !! */  = null;
            }
            var21_21 = new sZ1(this);
            oz1_2.a((NestedScrollView)var2_2 /* !! */ , (sZ1)var21_21);
        } else {
            var2_2 /* !! */  = this.k0;
            if (var2_2 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var8_9);
                var7_8 = 0;
                var2_2 /* !! */  = null;
            }
            var2_2 /* !! */  = var2_2 /* !! */ .getViewTreeObserver();
            var21_21 = new tZ1(this);
            var2_2 /* !! */ .addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)var21_21);
        }
        var2_2 /* !! */  = this.getActivity();
        if (var2_2 /* !! */  != null) {
            var2_2 /* !! */  = this.requireActivity();
            var2_2 /* !! */ .invalidateOptionsMenu();
        }
        var7_8 = R$id.refereeWidget;
        var2_2 /* !! */  = var1_1.findViewById(var7_8);
        this.F0 = var2_2 /* !! */ ;
        this.Z = false;
        var7_8 = R$id.inapp_update_widget;
        var2_2 /* !! */  = (InAppBottomUpdatesView)var1_1.findViewById(var7_8);
        this.L0 = var2_2 /* !! */ ;
        var7_8 = R$id.content_container;
        var2_2 /* !! */  = (LinearLayout)var1_1.findViewById(var7_8);
        this.o = var2_2 /* !! */ ;
        var7_8 = R$id.cancel_change_number_request;
        var1_1 = (ConstraintLayout)var1_1.findViewById(var7_8);
        this.l = var1_1;
        var1_1 = this.r0;
        if (var1_1 != null && (var1_1 = var1_1.t) != null) {
            var2_2 /* !! */  = this.getViewLifecycleOwner();
            var17_17 = 2;
            var21_21 = new tz_1(this, var17_17);
            var5_6 /* !! */  = new BZ1$b((Function1)var21_21);
            var1_1.e((mu1_1)var2_2 /* !! */ , (F62)var5_6 /* !! */ );
        }
        var1_1 = this.r0;
        Intrinsics.checkNotNull(var1_1);
        var1_1 = var1_1.l;
        var2_2 /* !! */  = this.getViewLifecycleOwner();
        var21_21 = new yz1_1(this, 0);
        var5_6 /* !! */  = new BZ1$b((Function1)var21_21);
        var1_1.e((mu1_1)var2_2 /* !! */ , (F62)var5_6 /* !! */ );
        var1_1 = this.r0;
        Intrinsics.checkNotNull(var1_1);
        var1_1 = var1_1.n;
        var2_2 /* !! */  = this.getViewLifecycleOwner();
        var21_21 = new zz1_1(this);
        var5_6 /* !! */  = new BZ1$b((Function1)var21_21);
        var1_1.e((mu1_1)var2_2 /* !! */ , (F62)var5_6 /* !! */ );
        var1_1 = this.r0;
        Intrinsics.checkNotNull(var1_1);
        var1_1 = var1_1.z;
        var2_2 /* !! */  = this.getViewLifecycleOwner();
        var21_21 = new az1_1(this, 0);
        var4_5 = new BZ1$b((Function1)var21_21);
        var1_1.e((mu1_1)var2_2 /* !! */ , var4_5);
        var1_1 = this.a1;
        if (var1_1 == null) {
            var1_1 = "bannerViewModel";
            Intrinsics.throwUninitializedPropertyAccessException((String)var1_1);
        } else {
            var6_7 = var1_1;
        }
        var1_1 = var6_7.getAdditionalBannerLD();
        var2_2 /* !! */  = this.getViewLifecycleOwner();
        var21_21 = new pz1_2(this);
        var4_5 = new BZ1$b((Function1)var21_21);
        var1_1.e((mu1_1)var2_2 /* !! */ , var4_5);
        var1_1 = this.requireActivity().getSupportFragmentManager();
        var2_2 /* !! */  = new xz1_1(this);
        var1_1.h0("verify_ril_profile_success", this, (wW0)var2_2 /* !! */ );
    }

    public final void w2() {
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushNavigationTapEvent("Show address book", "ADDRESS BOOK", "my account screen");
    }

    public final void w7() {
        Object object;
        Function1 function1;
        Object object2;
        Object object3 = this.p;
        Intrinsics.checkNotNull(object3);
        object3.startLoader();
        object3 = this.r0;
        if (object3 != null) {
            object2 = ((hy3_0)object3).g.getCancelRequest();
            int n3 = 2;
            function1 = new zz1_0(object3, n3);
            int n4 = 1;
            object = new gy1_1(function1, n4);
            function1 = new hy1_2((Hj)object3, n4);
            int n7 = 1;
            iy1_0 iy1_02 = new iy1_0(function1, n7);
            object2 = ((g53_0)object2).f((o60_0)object, iy1_02);
            object3 = ((hy3_0)object3).x;
            ((t30_0)object3).b((yr0_2)object2);
        }
        if ((object3 = this.r0) != null && (object3 = ((hy3_0)object3).u) != null) {
            object2 = this.getViewLifecycleOwner();
            function1 = new vz1_0(this);
            object = new BZ1$b(function1);
            ((LiveData)object3).e((mu1_1)object2, (F62)object);
        }
    }

    public final void y6() {
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushNavigationTapEvent("SIGN OUT USER", "SIGN OUT", "my account screen");
    }
}

