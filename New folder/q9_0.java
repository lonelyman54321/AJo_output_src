/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.ComponentCallbacks2
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.GradientDrawable
 *  android.graphics.drawable.ShapeDrawable
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.Parcelable
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.webkit.URLUtil
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import androidx.drawerlayout.widget.DrawerLayout$e;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.D;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.media3.exoplayer.e;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient$Builder;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsRequest$Builder;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$Tab;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.FirebasePerformanceAttributable;
import com.google.firebase.perf.metrics.Trace;
import com.google.gson.Gson;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.analytics.events.FacebookSDKHelper;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.analytics.handler.AnalylticsGAHolderForProduct;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.customviews.AddressWidgetView;
import com.ril.ajio.customviews.ChangeLocationListener;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.data.model.CMSConfigInitializer;
import com.ril.ajio.data.repo.AddressRepo;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.OrderListFunctionalRepo;
import com.ril.ajio.earlyaccess.entity.EarlyAccessBannerData;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.kmm.shared.Platform;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.ResponseStatusType;
import com.ril.ajio.kmm.shared.model.home.CMSData;
import com.ril.ajio.kmm.shared.model.home.HomeViewTypes;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HomeData;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.kmm.shared.model.request.HomeReq;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.permission.PermissionTrigger;
import com.ril.ajio.plp.PLPExtras;
import com.ril.ajio.plp.a;
import com.ril.ajio.plp.a$a;
import com.ril.ajio.rto.entity.RtoFirebaseData;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Address.PageType;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Home.LuxeFooterData;
import com.ril.ajio.services.data.Home.LuxeHomeFooter;
import com.ril.ajio.services.data.Home.NativeCategoryNavigationListDetail;
import com.ril.ajio.services.data.sis.SisStoreList;
import com.ril.ajio.services.data.user.GPSLocationData;
import com.ril.ajio.services.data.user.LocationData;
import com.ril.ajio.services.data.user.LocationData$Companion;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import com.ril.ajio.services.utils.ServiceUtil;
import com.ril.ajio.utility.customview.InAppBottomUpdatesView;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment$a;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from q9
 */
public final class q9_0
extends z41_0
implements fy0_1,
mf1_0,
po_0,
lf1_0,
sg1_2,
JU2,
D82,
ComponentCallbacks2,
View.OnTouchListener,
pb_2,
C32,
ChangeLocationListener,
zm_2 {
    public static final q9$a Companion;
    public static final String Q2;
    public ConstraintLayout A;
    public final hh3_2 A0;
    public final Bundle A1;
    public float A2;
    public ConstraintLayout B;
    public final hh3_2 B0;
    public long B1;
    public float B2;
    public ConstraintLayout C;
    public final hh3_2 C0;
    public int C1;
    public boolean C2;
    public ConstraintLayout D;
    public Boolean D0;
    public ConstraintLayout D1;
    public h5_0 D2;
    public View E;
    public BaseResponse E0;
    public ConstraintLayout E1;
    public wx1_1 E2;
    public View F;
    public final NewEEcommerceEventsRevamp F0;
    public ImageView F1;
    public OnFragmentInteractionListener F2;
    public TabLayout G;
    public final NewCustomEventsRevamp G0;
    public ConstraintLayout G1;
    public boolean G2;
    public AjioImageView H;
    public final String H0;
    public LinearLayout H1;
    public boolean H2;
    public ShimmerFrameLayout I;
    public final String I0;
    public ImageView I1;
    public y7 I2;
    public FrameLayout J;
    public final String J0;
    public TextView J1;
    public Handler J2;
    public AjioImageView K;
    public final hh3_2 K0;
    public TextView K1;
    public final q9$f K2;
    public AppCompatImageView L;
    public final hh3_2 L0;
    public View L1;
    public final q9$e L2;
    public TextView M;
    public final hh3_2 M0;
    public TextView M1;
    public final q9$d M2;
    public AjioProgressView N;
    public oa1_1 N0;
    public CircularProgressIndicator N1;
    public final q9$b N2;
    public ImageView O;
    public final lq2_1 O0;
    public ConstraintLayout O1;
    public final e8 O2;
    public ImageView P;
    public Application P0;
    public boolean P1;
    public final hh3_2 P2;
    public AppBarLayout Q;
    public final hh3_2 Q0;
    public View Q1;
    public TabLayout R;
    public final hh3_2 R0;
    public ConstraintLayout R1;
    public View S;
    public jo_2 S0;
    public AjioTextView S1;
    public ArrayList T;
    public final hh3_2 T0;
    public AjioTextView T1;
    public boolean U;
    public oq2_1 U0;
    public AjioTextView U1;
    public ey0_1 V0;
    public AjioTextView V1;
    public boolean W0;
    public ImageView W1;
    public x9_0 X;
    public boolean X0;
    public ConstraintLayout X1;
    public gj2_1 Y;
    public boolean Y0;
    public ConstraintLayout Y1;
    public e00 Z;
    public Boolean Z0;
    public TextView Z1;
    public PlayerView a1;
    public ImageView a2;
    public ConstraintLayout b1;
    public LottieAnimationView b2;
    public ConstraintLayout c1;
    public ConstraintLayout c2;
    public ImageView d1;
    public ConstraintLayout d2;
    public ImageView e1;
    public LottieAnimationView e2;
    public ma_2 f;
    public ImageView f1;
    public TextView f2;
    public ob_2 g;
    public ImageView g1;
    public ImageView g2;
    public j3_0 h;
    public TextView h1;
    public CardView h2;
    public vh3_2 i;
    public final Handler i1;
    public Toolbar i2;
    public fo3 j;
    public final d8 j1;
    public AppCompatImageView j2;
    public A71 k;
    public final hh3_2 k0;
    public long k1;
    public AppCompatImageView k2;
    public nm_1 l;
    public boolean l1;
    public LinearLayout l2;
    public final ArrayList m;
    public boolean m1;
    public LinearLayout m2;
    public ArrayList n;
    public long n1;
    public ConstraintLayout n2;
    public pg2_2 o;
    public long o1;
    public TextView o2;
    public View p;
    public ShimmerFrameLayout p0;
    public String p1;
    public CardView p2;
    public CardView q;
    public FrameLayout q0;
    public boolean q1;
    public TextView q2;
    public LinearLayout r;
    public bo3_0 r0;
    public sb3_2 r1;
    public TextView r2;
    public ImageView s;
    public RecyclerView s0;
    public long s1;
    public AjioImageView s2;
    public TextView t;
    public final D t0;
    public BannerData t1;
    public String t2;
    public AjioImageView u;
    public final hh3_2 u0;
    public SharedPreferences u1;
    public boolean u2;
    public ImageView v;
    public CartAddressListBottomSheet v0;
    public q8 v1;
    public boolean v2;
    public ImageView w;
    public fo_1 w0;
    public InAppBottomUpdatesView w1;
    public float w2;
    public ImageView x;
    public ff0_2 x0;
    public View x1;
    public float x2;
    public RecyclerView y;
    public final boolean y0;
    public View y1;
    public float y2;
    public TextView z;
    public sh2_0 z0;
    public tt2_2 z1;
    public float z2;

    static {
        q9$a q9$a;
        Companion = q9$a = new Object();
        Q2 = q9$a.getClass().getSimpleName();
    }

    public q9_0() {
        Object object;
        sb3_2 sb3_22;
        boolean bl2;
        int n3 = 1;
        Object object2 = new ArrayList();
        this.m = object2;
        object2 = new o9_0(this);
        this.k0 = object2 = yr1_2.b((Function0)object2);
        object2 = Reflection.getOrCreateKotlinClass(lq2_0.class);
        q9$h q9$h = new q9$h(this);
        Object object3 = new q9$i(this);
        Object object4 = new q9$j(this);
        this.t0 = object2 = LW0.a(this, (yn1_2)object2, q9$h, (Function0)object3, (Function0)object4);
        q9$h = null;
        object2 = new g8_0(this, 0);
        this.u0 = object2 = yr1_2.b((Function0)object2);
        object2 = od3_2.a;
        int n4 = ((String)object2).length();
        if (n4 == 0) {
            object2 = od3_2.a();
        }
        object3 = ld3_2.STORE_LUXE.getStoreId();
        this.y0 = bl2 = Intrinsics.areEqual(object2, object3) ^ n3;
        object2 = new h8_0(this, 0);
        this.A0 = object2 = yr1_2.b((Function0)object2);
        object2 = new d41_0(this, 2);
        this.B0 = object2 = yr1_2.b((Function0)object2);
        object2 = new i8_0(this);
        this.C0 = object2 = yr1_2.b((Function0)object2);
        object2 = AnalyticsManager.Companion;
        object3 = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp();
        this.F0 = object3;
        this.G0 = object2 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        this.H0 = object2 = object3.getPrevScreen();
        this.I0 = object2 = object3.getPrevScreenType();
        this.J0 = "home landing screen";
        object2 = new j8_0(this, 0);
        this.K0 = object2 = yr1_2.b((Function0)object2);
        object2 = new k8_0(this, 0);
        this.L0 = object2 = yr1_2.b((Function0)object2);
        object2 = new m8_0(this);
        this.M0 = object2 = yr1_2.b((Function0)object2);
        lq2_1.Companion.getClass();
        object2 = lq2$a_0.a(this);
        ((lq2_1)object2).e();
        object3 = new iq2_1[n3];
        object3[0] = object4 = Iq2$b.b;
        ((lq2_1)object2).g((iq2_1[])object3);
        object3 = PermissionTrigger.SESSIONS;
        ((lq2_1)object2).f((PermissionTrigger)((Object)object3));
        this.O0 = object2;
        object2 = new n8_0(this, 0);
        this.Q0 = object2 = yr1_2.b((Function0)object2);
        object2 = new o8_0(this, 0);
        this.R0 = object2 = yr1_2.b((Function0)object2);
        object2 = new p9_0(this, 0);
        yr1_2.b((Function0)object2);
        object2 = new c8_0(this, 0);
        this.T0 = object2 = yr1_2.b((Function0)object2);
        this.W0 = n3;
        object3 = Looper.getMainLooper();
        object2 = new Handler(object3);
        this.i1 = object2;
        this.j1 = object2 = new d8(this, 0);
        this.p1 = object2 = "";
        object3 = sb3_22;
        this.r1 = sb3_22 = new sb3_2(null, null, null, false, 0.0f, null, null, 255);
        this.A1 = object3;
        this.t2 = object2;
        this.u2 = n3;
        super();
        this.K2 = object;
        this.L2 = object = new Object();
        this.M2 = object = new q9$d(this);
        this.N2 = object = new q9$b(this);
        this.O2 = object = new e8(this, 0);
        object = new Object();
        this.P2 = object = yr1_2.b((Function0)object);
    }

    public static String Va(String string2) {
        Object object = h40_0.a;
        object = "storeId";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        int n3 = string2.length();
        String string3 = "#2F4254";
        if (n3 != 0) {
            object = ld3_2.values();
            int n4 = ((ld3_2[])object).length;
            for (int i3 = 0; i3 < n4; ++i3) {
                String string4 = object[i3].getStoreId();
                boolean bl2 = Intrinsics.areEqual(string4, string2);
                if (!bl2) continue;
                object = Locale.ROOT;
                string2 = string2.toLowerCase((Locale)object);
                Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
                string2 = h40_0.i(string2);
                object = "splash_bg_color";
                n4 = (int)(string2.has((String)object) ? 1 : 0);
                if (n4 == 0) break;
                string3 = string2.getString((String)object);
                Intrinsics.checkNotNull(string3);
                break;
            }
        }
        return string3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Ab(PLPExtras object, String object2) {
        Object object3 = h40_0.a;
        boolean bl2 = h40_0.b();
        boolean bl3 = true;
        Object object4 = null;
        Object object5 = "activityFragmentListener";
        if (bl2) {
            if (object2 == null) return;
            try {
                object = this.getActivity();
                if (object != null) {
                    object = this.h;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                        object = null;
                    }
                    if ((object3 = this.h) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    } else {
                        object4 = object3;
                    }
                    object3 = object4.y();
                    object4 = de0_2.Companion;
                    object5 = Boolean.FALSE;
                    object4.getClass();
                    object2 = de0$a.a((String)object2, (Boolean)object5);
                    object4 = "de0";
                    j3$a.a((j3_0)object, (Fragment)object3, (Fragment)object2, bl3, (String)object4);
                }
                object = Unit.a;
                return;
            }
            catch (Exception exception) {
                object = Unit.a;
                return;
            }
        }
        og1_1.c();
        ((bu2_0)this.u0.getValue()).a.k(object);
        object2 = ((PLPExtras)object).e;
        if (object2 == null) {
            object2 = "";
        }
        object = ((PLPExtras)object).H;
        object = at2_1.b((String)object2, (String)object);
        object2 = this.getActivity();
        if (object2 == null) return;
        object2 = this.h;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            object2 = null;
        }
        if ((object3 = this.h) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            bl2 = false;
            object3 = null;
        }
        object3 = object3.y();
        j3$a.a((j3_0)object2, (Fragment)object3, (Fragment)object, bl3, null);
    }

    public final void Bb(int n3) {
        String string2;
        Object object;
        Object object2;
        block23: {
            block22: {
                object2 = this.Q;
                if ((object2 == null || (n3 = object2.getVisibility()) != 0) && (object2 = this.Q) != null) {
                    ai0_2.B((View)object2);
                }
                object2 = this.X;
                object = null;
                string2 = "ajiohomeViewModel";
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object2 = null;
                }
                if ((n3 = (int)(((x9_0)object2).t ? 1 : 0)) != 0) break block22;
                object2 = this.X;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object2 = null;
                }
                if ((n3 = (int)(((x9_0)object2).c() ? 1 : 0)) == 0) break block23;
            }
            if ((n3 = (int)(og1_1.c() ? 1 : 0)) == 0 && ((object2 = this.H) == null || (n3 = object2.getVisibility()) != 0) && (object2 = this.H) != null) {
                ai0_2.B((View)object2);
            }
        }
        object2 = this.Z0;
        boolean bl2 = false;
        Object object3 = null;
        if (object2 != null) {
            n3 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
        } else {
            n3 = 0;
            object2 = null;
        }
        if (n3 != 0) {
            object2 = this.X;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object2 = null;
            }
            if ((n3 = (int)(((x9_0)object2).t ? 1 : 0)) != 0 && (n3 = (int)(this.rb() ? 1 : 0)) != 0) {
                bl2 = true;
            }
        }
        if ((n3 = (int)(og1_1.f() ? 1 : 0)) != 0 && bl2) {
            object2 = this.K;
            if (object2 != null) {
                ai0_2.B((View)object2);
            }
            if ((object2 = this.K) != null) {
                object3 = this.O2;
                object2.setOnClickListener((View.OnClickListener)object3);
            }
        }
        object2 = od3_2.a();
        bl2 = this.rb();
        if (bl2) {
            object3 = this.X;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object3 = null;
            }
            if (bl2 = ((x9_0)object3).t) {
                object3 = this.X;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    object3 = null;
                }
                if ((n3 = (int)(((x9_0)object3).i((String)object2) ? 1 : 0)) != 0) {
                    object2 = this.k;
                    if (object2 == null) {
                        object2 = "homeListener";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    } else {
                        object = object2;
                    }
                    object2 = od3_2.a();
                    object.J1((String)object2);
                }
            }
        }
    }

    public final void Ca(boolean object) {
        if (object) {
            TimeUnit timeUnit;
            long l2 = this.n1;
            long l3 = 0L;
            long l4 = l2 - l3;
            object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (!object) {
                timeUnit = TimeUnit.MILLISECONDS;
                l2 = System.currentTimeMillis();
                l3 = this.o1;
                l2 -= l3;
                this.n1 = l2 = timeUnit.toSeconds(l2);
            }
            if ((timeUnit = this.f1) != null) {
                ai0_2.a((View)timeUnit);
            }
            timeUnit = this.i1;
            d8 d82 = this.j1;
            long l7 = 1000L;
            timeUnit.postDelayed(d82, l7);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Cb() {
        String[] stringArray;
        int n3 = this.isAdded();
        if (n3 == 0) return;
        n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4 && (stringArray = this.T) != null) {
            n3 = (int)(stringArray.isEmpty() ? 1 : 0);
            n4 = 1;
            if ((n3 ^= n4) == n4) {
                stringArray = this.T;
                Intrinsics.checkNotNull(stringArray);
                n3 = stringArray.size();
                stringArray = new String[n3];
                ArrayList arrayList = this.T;
                Intrinsics.checkNotNull(arrayList);
                stringArray = arrayList.toArray(stringArray);
                n4 = 1771;
                this.requestPermissions(stringArray, n4);
                return;
            }
        }
        if ((stringArray = this.U0) != null) {
            stringArray.dismissAllowingStateLoss();
        }
        this.Eb();
    }

    public final void Db() {
        long l2;
        this.k1 = l2 = 0L;
        Object object = this.i1;
        d8 d82 = this.j1;
        object.removeCallbacks((Runnable)d82);
        object = this.g;
        if (object != null) {
            ((ob_2)object).l();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Eb() {
        SecurityException securityException2;
        block3: {
            Object object;
            block2: {
                try {
                    object = this.V0;
                    if (object == null) return;
                    int n3 = Build.VERSION.SDK_INT;
                    int n4 = 23;
                    if (n3 < n4 || (object = this.T) == null) break block2;
                    n3 = ((ArrayList)object).size();
                    if (n3 != 0) return;
                }
                catch (SecurityException securityException2) {
                    break block3;
                }
            }
            if ((object = this.V0) == null) return;
            Object object2 = ((ey0_1)object).b;
            if (object2 == null) return;
            if ((object2 = object2.getLastLocation()) == null) return;
            cy0_2 cy0_22 = new cy0_2(object, 0);
            object = new me_1(cy0_22);
            ((Task)object2).addOnSuccessListener((OnSuccessListener)object);
            return;
        }
        yn3$a yn3$a = yn3_0.a;
        yn3$a.e(securityException2);
    }

    public final void F5() {
        Object object;
        int n3;
        Object object2;
        long l2;
        long l3 = this.o1;
        long l4 = 0L;
        long l7 = l3 - l4;
        Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object3 == false) {
            this.o1 = l3 = System.currentTimeMillis();
        }
        if ((object3 = (l2 = (l3 = this.n1) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
            object2 = TimeUnit.MILLISECONDS;
            long l8 = System.currentTimeMillis();
            long l12 = this.o1;
            this.n1 = l3 = ((TimeUnit)((Object)object2)).toSeconds(l8 -= l12);
        }
        if ((object2 = this.b1) != null && (n3 = object2.getVisibility()) != 0) {
            object2 = this.S0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appPreferences");
                n3 = 0;
                object2 = null;
            }
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            jo_2 jo_22 = new jo_2((Context)object);
            object = null;
            String string2 = "widget_max_apperance_count";
            int n4 = jo_22.getPreference(string2, 0) + 1;
            ((sw_0)object2).putPreference(string2, n4);
        }
        if ((object2 = this.b1) != null) {
            ai0_2.B((View)object2);
        }
        if ((object2 = this.g) != null) {
            ((ob_2)object2).k();
        }
        object2 = sq0_1.a;
        object2 = this.t1;
        if (object2 == null || (object2 = ((BannerData)object2).getBannerUrl()) == null) {
            object2 = "";
        }
        object = this.Ua((String)object2);
        sq0_1.i("ingress screen", (String)object, "fleek_ingress_banner", "explore ajio fleek", "", false);
    }

    public final void Fb() {
        boolean bl2;
        RecyclerView recyclerView = this.y;
        if (recyclerView != null && (bl2 = this.isAdded()) && !(bl2 = this.isRemoving())) {
            t8 t84 = new t8(recyclerView, 0);
            recyclerView.post(t84);
        }
    }

    public final void Gb(AddressType addressType, String string2, String string3, String string4, String string5) {
        Object object = this.getContext();
        if (object != null) {
            Object object2 = this.D;
            AddressWidgetView addressWidgetView = new AddressWidgetView((Context)object, (View)object2, this);
            object = new q9$g(this);
            addressWidgetView.updatePdDeeplinkListener((uw3_0)object);
            String string6 = "home landing screen";
            PageType pageType = PageType.HOME;
            object2 = addressType;
            addressWidgetView.setData(addressType, string4, string5, string3, string2, string6, pageType);
        }
    }

    public final void Ha(PLPExtras pLPExtras) {
        Intrinsics.checkNotNullParameter(pLPExtras, "plpExtras");
        String string2 = String.valueOf(pLPExtras.w);
        this.Ab(pLPExtras, string2);
    }

    public final void Hb(String string2) {
        if (string2 != null) {
            boolean bl2;
            Object object = this.X;
            x9_0 x9_02 = null;
            String string3 = "ajiohomeViewModel";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                object = null;
            }
            ((x9_0)object).t = false;
            object = this.X;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                object = null;
            }
            object.getClass();
            String string4 = "<set-?>";
            Intrinsics.checkNotNullParameter(string2, string4);
            ((x9_0)object).r = string2;
            object = this.X;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                x9_02 = object;
            }
            object = x9_02.I;
            if (object != null && (object = (NativeCategoryNavigationListDetail)((ArrayList)object).get(0)) != null) {
                ((NativeCategoryNavigationListDetail)object).setNativeCategoryPageId(string2);
            }
            this.U = bl2 = true;
        }
    }

    public final void Ib(String string2) {
        Object object;
        Object object2;
        Object object3 = this.g;
        long l2 = object3 != null && (object3 = ((ob_2)object3).i) != null ? ((e)object3).getCurrentPosition() : 0L;
        this.s1 = l2;
        String string3 = this.p1;
        Object object4 = this.g;
        if (object4 != null && (object4 = ((ob_2)object4).i) != null) {
            int n3 = ((e)object4).getCurrentMediaItemIndex();
            object2 = object4 = Integer.valueOf(n3);
        } else {
            object2 = null;
        }
        object4 = this.g;
        if (object4 != null && (object4 = ((ob_2)object4).i) != null) {
            long l3 = ((e)object4).getCurrentPosition();
            object = object4 = Long.valueOf(l3);
        } else {
            object = null;
        }
        boolean bl2 = this.q1;
        this.r1 = object3 = new sb3_2(string3, (Integer)object2, (Long)object, bl2, 0.0f, null, null, 240);
        eb_2.c.put(string2, object3);
    }

    public final void J4(String object, int n3, boolean bl2, boolean bl3) {
        String string2;
        int n4;
        int n7;
        Object object2;
        boolean bl4;
        int n8 = -1;
        boolean bl5 = false;
        n8 = n3 == n8 ? 0 : n3;
        bo3_0 bo3_02 = this.r0;
        if (bo3_02 != null) {
            bo3_02.d = n8;
        }
        int n10 = 1;
        if (object != null && (bl4 = ((String)object).equalsIgnoreCase((String)(object2 = "/shop/luxe")))) {
            this.Tb(n10 != 0);
            return;
        }
        object = this.X;
        object2 = "ajiohomeViewModel";
        Object object3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(object2);
            bl4 = false;
            object = null;
        }
        if ((object = ((x9_0)object).I) != null) {
            object = (NativeCategoryNavigationListDetail)((ArrayList)object).get(n8);
        } else {
            bl4 = false;
            object = null;
        }
        Object object4 = "homeListener";
        if (object != null && (n7 = ((NativeCategoryNavigationListDetail)object).getDefaultNode()) == n10) {
            A71 a71 = this.k;
            if (a71 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n7 = 0;
                a71 = null;
            }
            object4 = "/switch-stores";
            a71.r1((String)object4);
            this.tb(n10 != 0);
        } else {
            A71 a71 = this.k;
            if (a71 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n7 = 0;
                a71 = null;
            }
            object4 = "/home";
            a71.r1((String)object4);
            this.tb(false);
        }
        this.C1 = n8;
        object4 = this.X;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(object2);
            object4 = null;
        }
        ((x9_0)object4).x = n7 = this.C1;
        object4 = this.X;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(object2);
        } else {
            object3 = object4;
        }
        ((x9_0)object3).z = n4 = this.C1;
        object2 = this.Q1;
        if (object2 != null) {
            ai0_2.i((View)object2);
        }
        object2 = this.I;
        object3 = this.J;
        hv3_0.r0((ShimmerFrameLayout)((Object)object2), (View)object3);
        if (bl3) {
            this.Ob();
        }
        this.yb(n8, false);
        Object object5 = "";
        if (object == null || (object2 = ((NativeCategoryNavigationListDetail)object).getInactiveAltText()) == null) {
            object2 = object5;
        }
        if (object != null && (object = ((NativeCategoryNavigationListDetail)object).getImgUrlForTab()) != null) {
            object5 = object;
        }
        this.Vb(n8, (String)object2, (String)object5);
        object = this.r0;
        if (object != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
        if (bl2) {
            this.Fb();
        }
        object = h40_0.a;
        bl4 = h40_0.c();
        if (bl4 && (bl4 = Intrinsics.areEqual(object = od3_2.a(), string2 = ld3_2.STORE_AJIOGRAM.getStoreId()))) {
            if (n3 > 0) {
                bl5 = true;
            }
            this.hb(bl5);
        }
    }

    public final void Jb(boolean bl2) {
        boolean bl3;
        x9_0 x9_02 = this.X;
        x9_0 x9_03 = null;
        String string2 = "ajiohomeViewModel";
        if (x9_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            x9_02 = null;
        }
        x9_02.t = bl3 = true;
        x9_02 = this.X;
        if (x9_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            x9_03 = x9_02;
        }
        x9_03.C = bl2;
    }

    public final void Kb() {
        Object object = od3_2.a;
        int n3 = object.length();
        if (n3 == 0) {
            object = od3_2.a();
        }
        Object object2 = ld3_2.STORE_LUXE.getStoreId();
        int n4 = Intrinsics.areEqual(object, object2);
        object2 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
        float f5 = 200.0f;
        String string2 = "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams";
        Object object3 = null;
        if (n4 != 0) {
            n4 = h40_0.Q1();
            if (n4 != 0) {
                float f6;
                object = this.Q;
                if (object != null) {
                    n4 = object.getHeight();
                    object = n4;
                } else {
                    n4 = 1101004800;
                    f6 = hv3_0.x(20.0f);
                    object = Float.valueOf(f6);
                }
                Object object4 = this.Q1;
                object4 = object4 != null ? object4.getLayoutParams() : null;
                Intrinsics.checkNotNull(object4, string2);
                object4 = (CoordinatorLayout$e)((Object)object4);
                n4 = ((Number)object).intValue();
                object4.setMargins(0, n4, 0, 0);
                object = this.Q1;
                if (object != null) {
                    object.setLayoutParams((ViewGroup.LayoutParams)object4);
                }
                if ((object = this.x1) != null) {
                    object.setLayoutParams((ViewGroup.LayoutParams)object4);
                }
                f6 = hv3_0.x(f5);
                ConstraintLayout constraintLayout = this.R1;
                if (constraintLayout != null) {
                    object3 = constraintLayout.getLayoutParams();
                }
                Intrinsics.checkNotNull(object3, (String)object2);
                object3 = (ConstraintLayout$LayoutParams)((Object)object3);
                n4 = (int)f6;
                object3.setMargins(0, n4, 0, 0);
                object = this.R1;
                if (object != null) {
                    object.setLayoutParams(object3);
                }
                if ((object = this.U1) != null) {
                    ai0_2.i((View)object);
                }
                if ((object = this.V1) != null) {
                    ai0_2.B((View)object);
                }
            } else {
                object = this.U1;
                if (object != null) {
                    ai0_2.i((View)object);
                }
                if ((object = this.V1) != null) {
                    ai0_2.B((View)object);
                }
            }
        } else {
            float f7;
            object = this.U1;
            if (object != null) {
                ai0_2.B((View)object);
            }
            if ((object = this.V1) != null) {
                ai0_2.i((View)object);
            }
            if ((object = this.Q) != null) {
                n4 = object.getHeight();
                object = n4;
            } else {
                n4 = 1125515264;
                f7 = hv3_0.x(150.0f);
                object = Float.valueOf(f7);
            }
            Object object5 = this.Q1;
            object5 = object5 != null ? object5.getLayoutParams() : null;
            Intrinsics.checkNotNull(object5, string2);
            object5 = (CoordinatorLayout$e)((Object)object5);
            n4 = ((Number)object).intValue();
            object5.setMargins(0, n4, 0, 0);
            object = this.Q1;
            if (object != null) {
                object.setLayoutParams((ViewGroup.LayoutParams)object5);
            }
            if ((object = this.x1) != null) {
                object.setLayoutParams((ViewGroup.LayoutParams)object5);
            }
            f7 = hv3_0.x(f5);
            ConstraintLayout constraintLayout = this.R1;
            if (constraintLayout != null) {
                object3 = constraintLayout.getLayoutParams();
            }
            Intrinsics.checkNotNull(object3, (String)object2);
            object3 = (ConstraintLayout$LayoutParams)((Object)object3);
            n4 = (int)f7;
            object3.setMargins(0, n4, 0, 0);
            object = this.R1;
            if (object != null) {
                object.setLayoutParams(object3);
            }
        }
        if ((object = this.y1) != null) {
            object2 = new X8(this);
            object.post((Runnable)object2);
        }
    }

    public final void Lb(CartDeliveryAddress object) {
        boolean bl2 = false;
        Object object2 = null;
        Object object3 = object != null ? ((CartDeliveryAddress)object).getCompleteAddress() : null;
        if (object != null) {
            object2 = ((CartDeliveryAddress)object).getDistrict();
        }
        Object object4 = n1.a((String)object3, ", ", (String)object2);
        object2 = od3_2.a();
        object3 = ld3_2.STORE_AJIO;
        Object object5 = ((ld3_2)((Object)object3)).getStoreId();
        bl2 = Intrinsics.areEqual(object2, object5);
        object5 = "isEnabled";
        Object object6 = "navigation_experiment3";
        Object object7 = "";
        if (bl2) {
            object2 = h40_0.a;
            object2 = z40_0.Companion;
            Object object8 = AJIOApplication.Companion;
            object2 = Q.a((AJIOApplication$a)object8, (z40$a)object2).a.d((String)object6);
            bl2 = object2.optBoolean((String)object5);
            if (bl2) {
                if (object == null || (object2 = ((CartDeliveryAddress)object).getAddressType()) == null) {
                    object2 = AddressType.None;
                }
                Object object9 = object != null && (object5 = ((CartDeliveryAddress)object).getPostalCode()) != null ? object5 : object7;
                if (object == null || (object = ((CartDeliveryAddress)object).getFirstName()) == null) {
                    object = object7;
                }
                String string2 = ((ld3_2)((Object)object3)).getStoreId();
                object3 = this.getContext();
                if (object3 != null) {
                    object5 = this.C;
                    object6 = new AddressWidgetView((Context)object3, (View)object5, this);
                    object3 = new v9_0(this);
                    ((AddressWidgetView)object6).updatePdDeeplinkListener((uw3_0)object3);
                    String string3 = "home landing screen";
                    PageType pageType = PageType.HOME;
                    object7 = object2;
                    object8 = object4;
                    object4 = object;
                    ((AddressWidgetView)object6).setData((AddressType)((Object)object2), (String)object8, string2, (String)object, (String)object9, string3, pageType);
                }
            } else {
                if (object == null || (object2 = ((CartDeliveryAddress)object).getAddressType()) == null) {
                    object2 = AddressType.None;
                }
                object8 = object != null && (object5 = ((CartDeliveryAddress)object).getPostalCode()) != null ? object5 : object7;
                Object object10 = object != null && (object = ((CartDeliveryAddress)object).getFirstName()) != null ? object : object7;
                String string4 = ((ld3_2)((Object)object3)).getStoreId();
                object6 = this;
                object7 = object2;
                this.Gb((AddressType)((Object)object2), (String)object8, (String)object10, (String)object4, string4);
            }
        } else {
            Object object11;
            object2 = od3_2.a();
            bl2 = Intrinsics.areEqual(object2, object11 = ((ld3_2)((Object)(object3 = ld3_2.STORE_LUXE))).getStoreId());
            if (bl2) {
                if (object == null || (object2 = ((CartDeliveryAddress)object).getAddressType()) == null) {
                    object2 = AddressType.None;
                }
                object11 = object != null && (object5 = ((CartDeliveryAddress)object).getPostalCode()) != null ? object5 : object7;
                Object object12 = object != null && (object = ((CartDeliveryAddress)object).getFirstName()) != null ? object : object7;
                String string5 = ((ld3_2)((Object)object3)).getStoreId();
                object6 = this;
                object7 = object2;
                this.Gb((AddressType)((Object)object2), (String)object11, (String)object12, (String)object4, string5);
            } else {
                object2 = h40_0.a;
                bl2 = h40_0.c();
                if (bl2 && (bl2 = Intrinsics.areEqual(object2 = od3_2.a(), object11 = ((ld3_2)((Object)(object3 = ld3_2.STORE_AJIOGRAM))).getStoreId()))) {
                    object2 = z40_0.Companion;
                    object11 = AJIOApplication.Companion;
                    object2 = Q.a((AJIOApplication$a)object11, (z40$a)object2).a.d((String)object6);
                    bl2 = object2.optBoolean((String)object5);
                    if (bl2) {
                        if (object == null || (object2 = ((CartDeliveryAddress)object).getAddressType()) == null) {
                            object2 = AddressType.None;
                        }
                        Object object13 = object != null && (object5 = ((CartDeliveryAddress)object).getPostalCode()) != null ? object5 : object7;
                        if (object == null || (object = ((CartDeliveryAddress)object).getFirstName()) == null) {
                            object = object7;
                        }
                        String string6 = ((ld3_2)((Object)object3)).getStoreId();
                        object3 = this.getContext();
                        if (object3 != null) {
                            object5 = this.C;
                            object6 = new AddressWidgetView((Context)object3, (View)object5, this);
                            object3 = new w9_0(this);
                            ((AddressWidgetView)object6).updatePdDeeplinkListener((uw3_0)object3);
                            String string7 = "home landing screen";
                            PageType pageType = PageType.HOME;
                            object7 = object2;
                            object11 = object4;
                            object4 = object;
                            ((AddressWidgetView)object6).setData((AddressType)((Object)object2), (String)object11, string6, (String)object, (String)object13, string7, pageType);
                        }
                    } else {
                        if (object == null || (object2 = ((CartDeliveryAddress)object).getAddressType()) == null) {
                            object2 = AddressType.None;
                        }
                        object11 = object != null && (object5 = ((CartDeliveryAddress)object).getPostalCode()) != null ? object5 : object7;
                        Object object14 = object != null && (object = ((CartDeliveryAddress)object).getFirstName()) != null ? object : object7;
                        String string8 = ((ld3_2)((Object)object3)).getStoreId();
                        object6 = this;
                        object7 = object2;
                        this.Gb((AddressType)((Object)object2), (String)object11, (String)object14, (String)object4, string8);
                    }
                }
            }
        }
    }

    public final void M0() {
    }

    public final void M9(String object) {
        String string2 = "addressId";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = h40_0.Q1();
        if (bl2 && (object = this.v0) != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
    }

    public final void Mb() {
        String string2;
        boolean bl2;
        int n3;
        Object object = this.p;
        int n4 = 0;
        Object object2 = null;
        if (object != null) {
            n3 = R$id.newNavigationTabBarContainer;
            object = object.findViewById(n3);
        } else {
            bl2 = false;
            object = null;
        }
        this.S = object;
        object = od3_2.a;
        n3 = object.length();
        if (n3 == 0) {
            object = od3_2.a();
        }
        if (bl2 = Intrinsics.areEqual(object, string2 = ld3_2.STORE_LUXE.getStoreId())) {
            object = this.p;
            if (object != null) {
                n4 = R$id.newNavigationLuxeTabBar;
                object = object.findViewById(n4);
                object2 = object;
                object2 = (TabLayout)((Object)object);
            }
        } else {
            object = this.p;
            if (object != null) {
                n4 = R$id.newNavigationAjioTabBar;
                object = object.findViewById(n4);
                object2 = object;
                object2 = (TabLayout)((Object)object);
            }
        }
        this.R = object2;
        object = this.S;
        if (object != null) {
            ai0_2.B(object);
        }
        if ((object = this.R) != null) {
            ai0_2.B(object);
        }
    }

    public final void N7() {
        AddressType addressType;
        lm_2 lm_22 = new lm_2();
        Intrinsics.checkNotNullParameter(this, "cartAddressCallBackListener");
        lm_22.S = this;
        Object object = this.S0;
        String string2 = "appPreferences";
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        if ((object = (object = ((jo_2)object).l()) != null ? ((CartDeliveryAddress)object).getAddressType() : null) == (addressType = AddressType.Pincode)) {
            object = this.S0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object;
            }
            object = ((jo_2)object2).m();
            if (object == null) {
                object = "";
            }
            string2 = "preFillPinCode";
            Intrinsics.checkNotNullParameter(object, string2);
            lm_22.R = object;
        }
        object = this.requireActivity().getSupportFragmentManager();
        lm_22.show((FragmentManager)object, "CartAddAddressBottomSheet");
    }

    public final void Nb(String object) {
        Object object2 = null;
        Object object3 = Locale.ROOT;
        object3 = object.toLowerCase((Locale)object3);
        Intrinsics.checkNotNullExpressionValue(object3, "toLowerCase(...)");
        Object object4 = "ajio";
        boolean bl2 = Intrinsics.areEqual(object3, object4);
        String string2 = "_lottie_json";
        int n3 = 1;
        Object[] objectArray = "getString(...)";
        String string3 = "format(...)";
        Object object5 = this.O2;
        Object object6 = "open(...)";
        if (bl2) {
            int n4;
            AJIOApplication.Companion.getClass();
            object3 = AJIOApplication$a.a().getAssets().open("ajio_search_bar_lottie.json");
            Intrinsics.checkNotNullExpressionValue(object3, (String)object6);
            object4 = this.d2;
            if (object4 != null) {
                object4.setOnClickListener((View.OnClickListener)object5);
            }
            if ((object4 = this.e2) != null) {
                object4.setOnClickListener((View.OnClickListener)object5);
            }
            if ((object4 = this.W1) != null) {
                object4.setOnClickListener((View.OnClickListener)object5);
            }
            object4 = h40_0.a;
            object4 = h40_0.y0(object);
            object5 = this.f2;
            if (object5 != null) {
                object5.setText((CharSequence)object4);
            }
            if ((object5 = this.e2) != null) {
                object6 = StringCompanionObject.INSTANCE;
                object6 = this.getResources();
                n4 = R$string.acc_search_box_ajio;
                object6 = object6.getString(n4);
                Intrinsics.checkNotNullExpressionValue(object6, (String)objectArray);
                Object[] objectArray2 = new Object[n3];
                objectArray2[0] = object4;
                objectArray2 = Arrays.copyOf(objectArray2, n3);
                object6 = String.format((String)object6, objectArray2);
                Intrinsics.checkNotNullExpressionValue(object6, string3);
                object5.setContentDescription((CharSequence)object6);
            }
            if ((object5 = this.d2) != null) {
                object6 = StringCompanionObject.INSTANCE;
                object6 = this.getResources();
                n4 = R$string.acc_search_box_ajio;
                object6 = object6.getString(n4);
                Intrinsics.checkNotNullExpressionValue(object6, (String)objectArray);
                objectArray = new Object[n3];
                objectArray[0] = object4;
                an_1.a(objectArray, n3, (String)object6, string3, (ConstraintLayout)((Object)object5));
            }
            if ((object2 = this.g2) != null) {
                object4 = new da$a();
                ((da$a)object4).k = n3;
                ((da$a)object4).g = n3;
                objectArray = h40_0.I0(object);
                ((da$a)object4).n = objectArray;
                ((da$a)object4).u = object2;
                ((da$a)object4).a();
            }
            if (object3 == null) {
                object = this.e2;
                if (object != null) {
                    ai0_2.i((View)object);
                }
                if ((object = this.d2) != null) {
                    ai0_2.B((View)object);
                }
            } else {
                object2 = this.e2;
                if (object2 != null) {
                    object4 = object.concat(string2);
                    object2.setAnimation((InputStream)object3, (String)object4);
                    long l2 = h40_0.x0(object);
                    int n7 = (int)l2 - n3;
                    object2.setRepeatCount(n7);
                }
            }
        } else {
            object4 = "luxe";
            boolean bl3 = Intrinsics.areEqual(object3, object4);
            if (bl3) {
                int n8;
                AJIOApplication.Companion.getClass();
                object3 = AJIOApplication$a.a().getAssets().open("luxe_search_bar_lottie.json");
                Intrinsics.checkNotNullExpressionValue(object3, (String)object6);
                object4 = this.c2;
                if (object4 != null) {
                    object4.setOnClickListener((View.OnClickListener)object5);
                }
                if ((object4 = this.b2) != null) {
                    object4.setOnClickListener((View.OnClickListener)object5);
                }
                object4 = h40_0.a;
                object4 = h40_0.y0(object);
                object5 = this.Z1;
                if (object5 != null) {
                    object5.setText((CharSequence)object4);
                }
                if ((object5 = this.c2) != null) {
                    object6 = StringCompanionObject.INSTANCE;
                    object6 = this.getResources();
                    n8 = R$string.acc_search_box_luxe;
                    object6 = object6.getString(n8);
                    Intrinsics.checkNotNullExpressionValue(object6, (String)objectArray);
                    Object[] objectArray3 = new Object[n3];
                    objectArray3[0] = object4;
                    an_1.a(objectArray3, n3, (String)object6, string3, (ConstraintLayout)((Object)object5));
                }
                if ((object5 = this.b2) != null) {
                    object6 = StringCompanionObject.INSTANCE;
                    object6 = this.getResources();
                    n8 = R$string.acc_search_box_luxe;
                    object6 = object6.getString(n8);
                    Intrinsics.checkNotNullExpressionValue(object6, (String)objectArray);
                    objectArray = new Object[n3];
                    objectArray[0] = object4;
                    object2 = Arrays.copyOf(objectArray, n3);
                    object2 = String.format((String)object6, object2);
                    Intrinsics.checkNotNullExpressionValue(object2, string3);
                    object5.setContentDescription((CharSequence)object2);
                }
                if ((object2 = this.a2) != null) {
                    object4 = new da$a();
                    ((da$a)object4).k = n3;
                    ((da$a)object4).g = n3;
                    ((da$a)object4).n = objectArray = h40_0.I0(object);
                    ((da$a)object4).u = object2;
                    ((da$a)object4).a();
                }
                if (object3 == null) {
                    object = this.b2;
                    if (object != null) {
                        ai0_2.i((View)object);
                    }
                    if ((object = this.c2) != null) {
                        ai0_2.B((View)object);
                    }
                } else {
                    object2 = this.b2;
                    if (object2 != null) {
                        object4 = object.concat(string2);
                        object2.setAnimation((InputStream)object3, (String)object4);
                        long l3 = h40_0.x0(object);
                        int n10 = (int)l3 - n3;
                        object2.setRepeatCount(n10);
                    }
                }
            }
        }
    }

    public final void Ob() {
        long l2;
        boolean bl2 = og1_1.c();
        if (bl2) {
            FirebasePerformanceAttributable firebasePerformanceAttributable = fq2_1.a;
            firebasePerformanceAttributable = fq2_1.d;
            if (firebasePerformanceAttributable == null) {
                firebasePerformanceAttributable = FirebasePerformance.getInstance();
                String string2 = "page_load_home_luxe_v5";
                firebasePerformanceAttributable = ((FirebasePerformance)firebasePerformanceAttributable).newTrace(string2);
                fq2_1.d = firebasePerformanceAttributable;
            }
            if ((firebasePerformanceAttributable = fq2_1.d) != null) {
                ((Trace)firebasePerformanceAttributable).start();
            }
        } else {
            FirebasePerformanceAttributable firebasePerformanceAttributable = fq2_1.a;
            firebasePerformanceAttributable = fq2_1.c;
            if (firebasePerformanceAttributable == null) {
                firebasePerformanceAttributable = FirebasePerformance.getInstance();
                String string3 = "page_load_home_v5";
                firebasePerformanceAttributable = ((FirebasePerformance)firebasePerformanceAttributable).newTrace(string3);
                fq2_1.c = firebasePerformanceAttributable;
            }
            if ((firebasePerformanceAttributable = fq2_1.c) != null) {
                ((Trace)firebasePerformanceAttributable).start();
            }
        }
        this.B1 = l2 = Calendar.getInstance().getTimeInMillis();
    }

    public final void P8(int n3) {
        int n4;
        Object object;
        q9_0 q9_02 = this;
        int n7 = n3;
        int n8 = 4;
        if (n3 == n8 && (object = this.w1) != null && (n8 = object.getVisibility()) == (n4 = 8)) {
            NewCustomEventsRevamp newCustomEventsRevamp = this.G0;
            String string2 = newCustomEventsRevamp.getEC_APP_UPDATE_INTERACTION();
            String string3 = this.G0.getINSTALL_NOW_CTA_VIEW();
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
        if ((object = q9_02.w1) != null) {
            object.setUIForState(n7);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void Pa(ArrayList var1_1) {
        block69: {
            block71: {
                block70: {
                    block68: {
                        var2_2 = this;
                        var3_3 = var1_1;
                        var4_4 = hu1_2.e();
                        var5_5 = "ajiohomeViewModel";
                        var6_6 = 1;
                        var7_7 = 0;
                        if (var4_4 == 0) break block68;
                        var8_8 = this.s0;
                        if (var8_8 != null) {
                            ai0_2.B((View)var8_8);
                        }
                        var8_8 = var2_2.p0;
                        var9_10 /* !! */  = var2_2.q0;
                        hv3_0.t0((ShimmerFrameLayout)var8_8, (View)var9_10 /* !! */ );
                        var8_8 = var2_2.S;
                        if (var8_8 != null) {
                            ai0_2.i((View)var8_8);
                        }
                        if ((var8_8 = var2_2.s0) != null) {
                            var10_12 = (int)var1_1.isEmpty();
                            if ((var6_6 ^= var10_12) != 0) {
                                this.Wb(var1_1);
                            }
                            var9_10 /* !! */  = var8_8.getContext();
                            var11_14 = new LinearLayoutManager((Context)var9_10 /* !! */ , 0, false);
                            var8_8.setLayoutManager((RecyclerView$o)var11_14);
                            var9_10 /* !! */  = var2_2.X;
                            if (var9_10 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var5_5);
                                var10_12 = 0;
                                var9_10 /* !! */  = null;
                            }
                            var9_10 /* !! */  = var9_10 /* !! */ .K;
                            var2_2.r0 = var11_14 = new bo3_0((ArrayList)var3_3, var2_2, (String)var9_10 /* !! */ );
                            var8_8.setAdapter((RecyclerView$f)var11_14);
                        }
                        if ((var3_3 = var2_2.X) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var5_5);
                            var12_16 = 0;
                            var3_3 = null;
                        }
                        var12_16 = var3_3.z;
                        var8_8 = var2_2.X;
                        if (var8_8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var5_5);
                            var4_4 = 0;
                            var8_8 = null;
                        }
                        if ((var8_8 = var8_8.I) != null && (var8_8 = (NativeCategoryNavigationListDetail)var8_8.get(0)) != null) {
                            var13_17 = var8_8.getNativeCategoryPageId();
                        } else {
                            var14_19 = false;
                            var13_17 = null;
                        }
                        var2_2.J4(var13_17, var12_16, false, false);
                        break block69;
                    }
                    var8_9 /* !! */  = this.S;
                    if (var8_9 /* !! */  != null) {
                        ai0_2.B(var8_9 /* !! */ );
                    }
                    if ((var8_9 /* !! */  = var2_2.s0) != null) {
                        ai0_2.i(var8_9 /* !! */ );
                    }
                    if ((var8_9 /* !! */  = var2_2.R) != null) {
                        var4_4 = var8_9 /* !! */ .getTabCount();
                    } else {
                        var4_4 = 0;
                        var8_9 /* !! */  = null;
                    }
                    if (var4_4 <= var6_6) break block70;
                    var8_9 /* !! */  = var2_2.R;
                    if (var8_9 /* !! */  != null) {
                        var8_9 /* !! */  = var8_9 /* !! */ .getTabAt(var6_6);
                    } else {
                        var4_4 = 0;
                        var8_9 /* !! */  = null;
                    }
                    if (var8_9 /* !! */  != null) {
                        var8_9 /* !! */  = var8_9 /* !! */ .getTag();
                    } else {
                        var4_4 = 0;
                        var8_9 /* !! */  = null;
                    }
                    if (var8_9 /* !! */  != null && (var10_13 = var8_9 /* !! */  instanceof NativeCategoryNavigationListDetail) != 0 && (var4_4 = (int)(var8_9 /* !! */  = (NativeCategoryNavigationListDetail)var8_9 /* !! */ ).isShimmer()) == 0) break block69;
                }
                if ((var10_13 = (var8_9 /* !! */  = od3_2.a).length()) == 0) {
                    var8_9 /* !! */  = od3_2.a();
                }
                if ((var4_4 = (int)Intrinsics.areEqual(var8_9 /* !! */ , var9_11 = ld3_2.STORE_LUXE.getStoreId())) != 0 && (var8_9 /* !! */  = this.getContext()) != null) {
                    var10_13 = R$color.black;
                    var8_9 /* !! */  = (gc3_2)var8_9 /* !! */ ;
                    var4_4 = b8.a((gc3_2)var8_9 /* !! */ , var10_13);
                    var9_11 = var2_2.S;
                    if (var9_11 != null) {
                        var9_11.setBackgroundColor(var4_4);
                    }
                }
                var8_9 /* !! */  = h40_0.a;
                var4_4 = (int)h40_0.c();
                if (var4_4 != 0 && (var4_4 = (int)Intrinsics.areEqual(var8_9 /* !! */  = od3_2.a(), var9_11 = ld3_2.STORE_AJIOGRAM.getStoreId())) != 0 && (var8_9 /* !! */  = this.getContext()) != null) {
                    var10_13 = R$color.black;
                    var8_9 /* !! */  = (gc3_2)var8_9 /* !! */ ;
                    var4_4 = b8.a((gc3_2)var8_9 /* !! */ , var10_13);
                    var9_11 = var2_2.S;
                    if (var9_11 != null) {
                        var9_11.setBackgroundColor(var4_4);
                    }
                }
                if ((var4_4 = (int)var1_1.isEmpty()) == 0) break block71;
                var3_3 = var2_2.S;
                if (var3_3 == null) break block69;
                ai0_2.i((View)var3_3);
                break block69;
            }
            var8_9 /* !! */  = var2_2.R;
            if (var8_9 /* !! */  != null) {
                var8_9 /* !! */ .removeAllTabs();
            }
            AJIOApplication.Companion.getClass();
            var8_9 /* !! */  = AJIOApplication$a.a();
            var10_13 = R$color.color_636363;
            var4_4 = t70.getColor((Context)var8_9 /* !! */ , var10_13);
            var9_11 = od3_2.a();
            var15_21 /* !! */  = ld3_2.STORE_AJIOGRAM;
            var16_22 = var15_21 /* !! */ .getStoreId();
            var10_13 = (int)Intrinsics.areEqual(var9_11, var16_22);
            if (var10_13 != 0 && (var10_13 = (int)h40_0.c()) != 0) {
                var8_9 /* !! */  = AJIOApplication$a.a();
                var10_13 = R$color.color_6B6D70;
                var4_4 = t70.getColor((Context)var8_9 /* !! */ , var10_13);
            }
            var9_11 = od3_2.a();
            var15_21 /* !! */  = var15_21 /* !! */ .getStoreId();
            var10_13 = (int)Intrinsics.areEqual(var9_11, (Object)var15_21 /* !! */ );
            var15_21 /* !! */  = var2_2.M2;
            if (var10_13 != 0 && (var9_11 = var2_2.R) != null) {
                var9_11.removeOnTabSelectedListener((TabLayout$OnTabSelectedListener)var15_21 /* !! */ );
            }
            var10_13 = var1_1.size();
            var16_22 = null;
            var18_24 = 0;
            var19_25 = 0.0f;
            var20_26 /* !! */  = null;
            for (var17_23 = 0; var17_23 < var10_13; var17_23 += var6_6) {
                block72: {
                    block73: {
                        block76: {
                            block74: {
                                block75: {
                                    block67: {
                                        var21_27 = var3_3.get(var17_23);
                                        var22_28 /* !! */  = "get(...)";
                                        Intrinsics.checkNotNullExpressionValue(var21_27, var22_28 /* !! */ );
                                        var21_27 = (NativeCategoryNavigationListDetail)var21_27;
                                        var23_29 = var21_27.isShimmer();
                                        if (var23_29 != 0) {
                                            var20_26 /* !! */  = var2_2.R;
                                            if (var20_26 /* !! */  != null && (var20_26 /* !! */  = var20_26 /* !! */ .newTab()) != null) {
                                                var23_29 = R$layout.shimmer_tab_item_new_nav;
                                                var20_26 /* !! */  = var20_26 /* !! */ .setCustomView(var23_29);
                                            } else {
                                                var18_24 = 0;
                                                var19_25 = 0.0f;
                                                var20_26 /* !! */  = null;
                                            }
                                            if (var20_26 /* !! */  != null && (var22_28 /* !! */  = var20_26 /* !! */ .getCustomView()) != null) {
                                                var22_28 /* !! */ .setClickable((boolean)var6_6);
                                            }
                                            var23_29 = 1;
                                            var24_30 = 1.4E-45f;
                                        } else {
                                            var23_29 = var21_27.getDefaultNode();
                                            if (var23_29 != 0) {
                                                var22_28 /* !! */  = var2_2.R;
                                                if (var22_28 /* !! */  != null && (var22_28 /* !! */  = var22_28 /* !! */ .newTab()) != null) {
                                                    var25_31 = R$layout.new_nav_home_tab_item;
                                                    var22_28 /* !! */  = var22_28 /* !! */ .setCustomView(var25_31);
lbl151:
                                                    // 2 sources

                                                    while (true) {
                                                        var23_29 = var18_24;
                                                        var24_30 = var19_25;
                                                        var20_26 /* !! */  = var22_28 /* !! */ ;
                                                        break block67;
                                                        break;
                                                    }
                                                }
                                                while (true) {
                                                    var23_29 = var18_24;
                                                    var24_30 = var19_25;
                                                    var18_24 = 0;
                                                    var19_25 = 0.0f;
                                                    var20_26 /* !! */  = null;
                                                    break block67;
                                                    break;
                                                }
                                            }
                                            if ((var22_28 /* !! */  = var2_2.R) == null || (var22_28 /* !! */  = var22_28 /* !! */ .newTab()) == null) ** continue;
                                            var25_31 = R$layout.new_navigation_tab_item;
                                            var22_28 /* !! */  = var22_28 /* !! */ .setCustomView(var25_31);
                                            ** continue;
                                        }
                                    }
                                    if (var20_26 /* !! */  == null) break block72;
                                    var25_31 = (int)var21_27.isShimmer();
                                    if (var25_31 != 0) break block73;
                                    var26_32 = var20_26 /* !! */ .getCustomView();
                                    if (var26_32 != null) {
                                        var27_33 = var21_27.getInactiveAltText();
                                        if (var27_33 == null) {
                                            var27_33 = var21_27.getNativeCategoryName();
                                        }
                                        var26_32.setContentDescription((CharSequence)var27_33);
                                    }
                                    if ((var26_32 = var20_26 /* !! */ .getCustomView()) != null) {
                                        var28_34 = R$id.category_label;
                                        var26_32 = (TextView)var26_32.findViewById(var28_34);
                                    } else {
                                        var25_31 = 0;
                                        var26_32 = null;
                                    }
                                    var27_33 = var20_26 /* !! */ .getCustomView();
                                    if (var27_33 != null) {
                                        var29_35 = R$id.category_img;
                                        var27_33 = (AjioImageView)var27_33.findViewById(var29_35);
                                    } else {
                                        var28_34 = 0;
                                        var27_33 = null;
                                    }
                                    var29_35 = (int)var21_27.getDefaultNode();
                                    if (var29_35 == 0) break block74;
                                    var30_36 /* !! */  = var20_26 /* !! */ .getCustomView();
                                    if (var30_36 /* !! */  != null) {
                                        var31_37 = R$string.acc_top_navigation_active_home;
                                        var13_18 = hv3_0.K(var31_37);
                                        var30_36 /* !! */ .setContentDescription((CharSequence)var13_18);
                                    }
                                    if ((var29_35 = (var13_18 = od3_2.a).length()) == 0) {
                                        var13_18 = od3_2.a();
                                    }
                                    if ((var14_20 = Intrinsics.areEqual(var13_18, var30_36 /* !! */  = ld3_2.STORE_LUXE.getStoreId())) == 0) break block75;
                                    if (var27_33 != null) {
                                        var14_20 = R$drawable.luxe_home_selected_nav;
                                        var27_33.setImageResource(var14_20);
                                    }
                                    break block76;
                                }
                                var13_18 = od3_2.a();
                                var14_20 = (int)Intrinsics.areEqual(var13_18, var30_36 /* !! */  = ld3_2.STORE_AJIOGRAM.getStoreId());
                                if (var14_20 == 0) ** GOTO lbl-1000
                                var13_18 = h40_0.a;
                                var14_20 = (int)h40_0.c();
                                if (var14_20 != 0) {
                                    if (var27_33 != null) {
                                        var14_20 = R$drawable.luxe_home_selected_nav;
                                        var27_33.setImageResource(var14_20);
                                    }
                                } else if (var27_33 != null) {
                                    var14_20 = R$drawable.home_selected_ajio_tab;
                                    var27_33.setImageResource(var14_20);
                                }
                                break block76;
                            }
                            if (var26_32 != null) {
                                var13_18 = var21_27.getNativeCategoryName();
                                var26_32.setText((CharSequence)var13_18);
                            }
                            if (var27_33 != null) {
                                var13_18 = new da$a();
                                var13_18.k = var6_6;
                                var13_18.g = var6_6;
                                var13_18.b = var29_35 = R$drawable.bg_tab_image;
                                var30_36 /* !! */  = var21_27.getImgUrlForTab();
                                var13_18.n = var30_36 /* !! */ ;
                                var13_18.u = var27_33;
                                var13_18.i = var6_6;
                                var13_18.a();
                            }
                        }
                        if (var26_32 != null) {
                            var26_32.setTextColor(var4_4);
                        }
                    }
                    var20_26 /* !! */ .setTag(var21_27);
                    var13_18 = var2_2.R;
                    if (var13_18 != null) {
                        var13_18.addTab((TabLayout$Tab)var20_26 /* !! */ );
                    }
                }
                var18_24 = var23_29;
                var19_25 = var24_30;
            }
            var8_9 /* !! */  = var2_2.R;
            if (var8_9 /* !! */  != null) {
                var8_9 /* !! */ .setClickable((boolean)(var6_6 ^= var18_24));
            }
            if ((var8_9 /* !! */  = var2_2.R) != null) {
                var8_9 /* !! */ .addOnTabSelectedListener((TabLayout$OnTabSelectedListener)var15_21 /* !! */ );
            }
            if ((var8_9 /* !! */  = var2_2.X) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var5_5);
                var4_4 = 0;
                var8_9 /* !! */  = null;
            }
            if ((var4_4 = var8_9 /* !! */ .z) != (var6_6 = -1)) {
                var8_9 /* !! */  = var2_2.X;
                if (var8_9 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var5_5);
                    var4_4 = 0;
                    var8_9 /* !! */  = null;
                }
                var4_4 = var8_9 /* !! */ .z;
            } else {
                var4_4 = 0;
                var8_9 /* !! */  = null;
            }
            var2_2.u2 = false;
            var11_15 = h40_0.a;
            var6_6 = (int)h40_0.c();
            if (var6_6 != 0 && (var6_6 = (int)Intrinsics.areEqual(var11_15 = od3_2.a(), var13_18 = ld3_2.STORE_AJIOGRAM.getStoreId())) != 0) {
                var8_9 /* !! */  = var2_2.I2;
                if (var8_9 /* !! */  != null) {
                    var7_7 = var8_9 /* !! */ .b;
                }
                var4_4 = var7_7;
            }
            if (var18_24 == 0) {
                var11_15 = var2_2.R;
                var14_20 = 0;
                var13_18 = null;
                if (var11_15 != null) {
                    var11_15.selectTab(null);
                }
                if ((var11_15 = var2_2.R) != null) {
                    var8_9 /* !! */  = var11_15.getTabAt(var4_4);
                    var11_15.selectTab((TabLayout$Tab)var8_9 /* !! */ );
                }
            } else {
                var14_20 = 0;
                var13_18 = null;
            }
            if ((var8_9 /* !! */  = var2_2.X) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var5_5);
            } else {
                var13_18 = var8_9 /* !! */ ;
            }
            var13_18.getClass();
            Intrinsics.checkNotNullParameter(var3_3, "categories");
            var8_9 /* !! */  = var1_1.iterator();
            while ((var32_38 = var8_9 /* !! */ .hasNext()) != 0) {
                var5_5 = ((NativeCategoryNavigationListDetail)var8_9 /* !! */ .next()).getNativeCategoryName();
                if (var5_5 == null || (var32_38 = var5_5.length()) == 0) continue;
                this.Wb(var1_1);
                break;
            }
        }
    }

    public final void Pb(String string2) {
        boolean bl2;
        q9_0 q9_02 = this;
        Object object = Calendar.getInstance();
        long l2 = ((Calendar)object).getTimeInMillis();
        long l3 = this.B1;
        float f5 = l2 -= l3;
        float f6 = 1000.0f;
        f5 /= f6;
        String string3 = "#.##";
        Object object2 = new DecimalFormat(string3);
        object = Float.valueOf(f5);
        object = ((Format)object2).format(object);
        try {
            Intrinsics.checkNotNull(object);
            f5 = Float.parseFloat((String)object);
        }
        catch (Exception exception) {
            object2 = yn3_0.a;
            ((yn3$a)object2).e(exception);
            bl2 = false;
            f5 = 0.0f;
            object = null;
        }
        l3 = q9_02.B1;
        long l4 = 0L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 > 0) {
            Object object3;
            object2 = fq2_1.a;
            string3 = "LocalCapturedTime";
            Intrinsics.checkNotNullParameter(string3, "key");
            object2 = fq2_1.c;
            if (object2 != null) {
                ((Trace)object2).putMetric(string3, l2);
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("screen_load", f5);
            object = q9_02.X;
            String string4 = "ajiohomeViewModel";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                bl2 = false;
                object = null;
                f5 = 0.0f;
            }
            object.getClass();
            object2 = x9_0.h();
            object = ((x9_0)object).r;
            bl2 = Intrinsics.areEqual(object2, object);
            object2 = "home landing screen";
            if (bl2) {
                object3 = object2;
            } else {
                string3 = string2;
                object3 = object = kp1_0.c("landing screen/sis-", string2);
            }
            object = q9_02.X;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                bl2 = false;
                object = null;
                f5 = 0.0f;
            }
            object.getClass();
            string4 = x9_0.h();
            object = ((x9_0)object).r;
            bl2 = Intrinsics.areEqual(string4, object);
            Object object4 = bl2 ? object2 : (object = "landing screen");
            NewCustomEventsRevamp newCustomEventsRevamp = q9_02.G0;
            String string5 = newCustomEventsRevamp.getPAGELOAD();
            String string6 = newCustomEventsRevamp.getPAGE_LOAD();
            object = q9_02.F0;
            String string7 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
            String string8 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
            int n3 = 1536;
            String string9 = "";
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string5, (String)object3, string9, string6, (String)object3, (String)object4, string7, bundle, string8, false, null, n3, null);
            q9_02.B1 = l4;
        }
        if (bl2 = og1_1.c()) {
            object = fq2_1.d;
            if (object != null) {
                ((Trace)object).stop();
            }
            fq2_1.d = null;
        } else {
            object = fq2_1.c;
            if (object != null) {
                ((Trace)object).stop();
            }
            fq2_1.c = null;
        }
    }

    public final void Qa() {
        int n3;
        boolean bl2;
        Object object = this.X;
        Object object2 = "ajiohomeViewModel";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        ((x9_0)object).B.clear();
        object = this.R;
        if (object != null) {
            ((TabLayout)((Object)object)).removeAllTabs();
        }
        if ((object = this.X) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        ((x9_0)object).z = n3 = -1;
        object = this.X;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        ((x9_0)object).m.i(null);
        object2 = ((x9_0)object).I;
        if (object2 != null) {
            ((ArrayList)object2).clear();
        }
        ((x9_0)object).I = null;
        bl2 = og1_1.c();
        if (bl2) {
            this.ob();
        } else {
            bl2 = false;
            object = null;
            this.lb(false);
        }
    }

    public final void Qb() {
        Object object;
        Object object2;
        Object object3 = z40_0.Companion;
        object3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a;
        Object object4 = "newnotificationCenterEnable";
        boolean bl2 = ((ao0_0)object3).a((String)object4);
        if (bl2) {
            object3 = this.L;
            object4 = this.O2;
            if (object3 != null) {
                object3.setOnClickListener((View.OnClickListener)object4);
            }
            if ((object3 = this.n2) != null) {
                object3.setOnClickListener((View.OnClickListener)object4);
            }
            object3 = ((b52_0)this.Q0.getValue()).g;
            object4 = this.getViewLifecycleOwner();
            object2 = new y8_0(this, 0);
            object = new c9_0((Function1)object2);
            ((LiveData)object3).e((mu1_1)object4, (F62)object);
        } else {
            object3 = this.M;
            if (object3 != null) {
                ai0_2.i((View)object3);
            }
        }
        object3 = this.getViewLifecycleOwner();
        object4 = "getViewLifecycleOwner(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        object3 = nu1_0.a((mu1_1)object3);
        object = null;
        object2 = new b9_0(this, null);
        ((iu1_0)object3).c((Function2)object2);
        object3 = ((BannerAdViewModel)this.C0.getValue()).getBannerAdsHome();
        object2 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
        object4 = new K8(this, 0);
        Object object5 = new c9_0((Function1)object4);
        ((R53)object3).e((mu1_1)object2, (F62)object5);
        object3 = this.X;
        object4 = "ajiohomeViewModel";
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            bl2 = false;
            object3 = null;
        }
        object3 = ((x9_0)object3).e;
        object2 = this.getViewLifecycleOwner();
        object5 = new L8(this, 0);
        Object object6 = new c9_0((Function1)object5);
        ((LiveData)object3).e((mu1_1)object2, (F62)object6);
        object3 = this.X;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            bl2 = false;
            object3 = null;
        }
        object3 = ((x9_0)object3).p;
        object2 = this.getViewLifecycleOwner();
        object5 = new M8(this, 0);
        object6 = new c9_0((Function1)object5);
        ((LiveData)object3).e((mu1_1)object2, (F62)object6);
        object3 = ((tf2_2)this.L0.getValue()).e;
        object2 = this.getViewLifecycleOwner();
        object5 = new N8(this, 0);
        object6 = new c9_0((Function1)object5);
        ((LiveData)object3).e((mu1_1)object2, (F62)object6);
        object3 = this.R0;
        object2 = ((ky1_0)((hh3_2)object3).getValue()).m;
        object5 = this.getViewLifecycleOwner();
        object6 = new O8(this, 0);
        c9_0 c9_02 = new c9_0((Function1)object6);
        ((LiveData)object2).e((mu1_1)object5, c9_02);
        object3 = ((ky1_0)((hh3_2)object3).getValue()).o;
        object2 = this.getViewLifecycleOwner();
        object5 = new p8_0(this, 0);
        object6 = new c9_0((Function1)object5);
        ((LiveData)object3).e((mu1_1)object2, (F62)object6);
        object3 = this.gb().m;
        object2 = this.getViewLifecycleOwner();
        object5 = new q8_0(this);
        object6 = new c9_0((Function1)object5);
        ((LiveData)object3).e((mu1_1)object2, (F62)object6);
        object3 = this.N0;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginViewModel");
            bl2 = false;
            object3 = null;
        }
        object3 = ((oa1_1)object3).t;
        object2 = this.getViewLifecycleOwner();
        object5 = new r8_0(this, 0);
        object6 = new c9_0((Function1)object5);
        ((LiveData)object3).e((mu1_1)object2, (F62)object6);
        object3 = this.D2;
        if (object3 != null && (object3 = ((h5_0)object3).i) != null) {
            object2 = this.getViewLifecycleOwner();
            object5 = new t8_0(this, 0);
            object6 = new c9_0((Function1)object5);
            ((LiveData)object3).e((mu1_1)object2, (F62)object6);
        }
        object3 = this.gb().w;
        object2 = this.getViewLifecycleOwner();
        object5 = new z8_0(this, 0);
        object6 = new c9_0((Function1)object5);
        ((LiveData)object3).e((mu1_1)object2, (F62)object6);
        object3 = this.X;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            bl2 = false;
            object3 = null;
        }
        object3 = ((x9_0)object3).h;
        object2 = this.getViewLifecycleOwner();
        object5 = new a8_0(this, 0);
        object6 = new c9_0((Function1)object5);
        ((LiveData)object3).e((mu1_1)object2, (F62)object6);
        object3 = ((yw2_0)this.K0.getValue()).f;
        object2 = this.getViewLifecycleOwner();
        object5 = new b8_0(this, 0);
        object6 = new c9_0((Function1)object5);
        ((LiveData)object3).e((mu1_1)object2, (F62)object6);
        object3 = this.k;
        object2 = "homeListener";
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object3 = null;
        }
        if ((object3 = object3.X0()) != null) {
            object5 = this.getViewLifecycleOwner();
            c9_02 = null;
            object6 = new C8(this, 0);
            ((LiveData)object3).e((mu1_1)object5, (F62)object6);
            object3 = this.k;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                object3 = null;
            }
            object3.p1();
        } else {
            this.Z0 = object3 = Boolean.FALSE;
        }
        object3 = this.X;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            bl2 = false;
            object3 = null;
        }
        object3 = ((x9_0)object3).g;
        object2 = this.getViewLifecycleOwner();
        object5 = new d8_0(this, 0);
        object6 = new c9_0((Function1)object5);
        ((LiveData)object3).e((mu1_1)object2, (F62)object6);
        object3 = this.X;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            bl2 = false;
            object3 = null;
        }
        object3 = ((x9_0)object3).j;
        object2 = this.getViewLifecycleOwner();
        object5 = new e8_0(this, 0);
        object6 = new c9_0((Function1)object5);
        ((LiveData)object3).e((mu1_1)object2, (F62)object6);
        object3 = this.X;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            bl2 = false;
            object3 = null;
        }
        object3 = ((x9_0)object3).n;
        object4 = this.getViewLifecycleOwner();
        object2 = new F8(this, 0);
        object5 = new c9_0((Function1)object2);
        ((LiveData)object3).e((mu1_1)object4, (F62)object5);
        object3 = this.Za().i;
        object4 = this.getViewLifecycleOwner();
        object2 = new G8(this, 0);
        object5 = new c9_0((Function1)object2);
        ((R53)object3).e((mu1_1)object4, (F62)object5);
        object3 = this.D2;
        if (object3 != null && (object3 = ((h5_0)object3).f) != null) {
            object4 = this.getViewLifecycleOwner();
            object2 = new I8(this, 0);
            object5 = new c9_0((Function1)object2);
            ((LiveData)object3).e((mu1_1)object4, (F62)object5);
        }
        if ((object3 = this.E2) == null) {
            object3 = "cartViewModel";
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
        } else {
            object = object3;
        }
        object3 = ((wx1_1)object).v;
        object4 = this.getViewLifecycleOwner();
        object2 = new Object();
        object = new c9_0((Function1)object2);
        ((LiveData)object3).e((mu1_1)object4, (F62)object);
    }

    public final void Ra(boolean bl2) {
        boolean bl3;
        Object object = this.Z0;
        boolean bl4 = false;
        if (object != null) {
            bl3 = (Boolean)object;
        } else {
            bl3 = false;
            object = null;
        }
        if (bl3) {
            object = this.X;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ajiohomeViewModel");
                bl3 = false;
                object = null;
            }
            if ((bl3 = ((x9_0)object).t) && (bl3 = this.rb())) {
                bl4 = true;
            }
        }
        object = this.O2;
        if (bl2) {
            if (bl4) {
                ImageView imageView = this.O;
                if (imageView != null) {
                    ai0_2.B((View)imageView);
                }
                if ((imageView = this.O) != null) {
                    imageView.setOnClickListener((View.OnClickListener)object);
                }
                if ((imageView = this.P) != null) {
                    imageView.setOnClickListener((View.OnClickListener)object);
                }
            } else {
                ImageView imageView = this.O;
                if (imageView != null) {
                    ai0_2.i((View)imageView);
                }
                if ((imageView = this.P) != null) {
                    imageView.setOnClickListener(null);
                }
            }
        } else {
            bl2 = og1_1.f();
            if (bl2 && bl4) {
                AjioImageView ajioImageView = this.K;
                if (ajioImageView != null) {
                    ai0_2.B((View)ajioImageView);
                }
                if ((ajioImageView = this.H) != null) {
                    ajioImageView.setOnClickListener((View.OnClickListener)object);
                }
                if ((ajioImageView = this.K) != null) {
                    ajioImageView.setOnClickListener((View.OnClickListener)object);
                }
                if ((ajioImageView = this.z) != null) {
                    ajioImageView.setOnClickListener((View.OnClickListener)object);
                }
            } else {
                AjioImageView ajioImageView = this.K;
                if (ajioImageView != null) {
                    ai0_2.i((View)ajioImageView);
                }
                if ((ajioImageView = this.H) != null) {
                    ajioImageView.setOnClickListener(null);
                }
                if ((ajioImageView = this.K) != null) {
                    ajioImageView.setOnClickListener(null);
                }
                if ((ajioImageView = this.z) != null) {
                    ajioImageView.setOnClickListener(null);
                }
            }
        }
    }

    public final void Rb() {
        boolean bl2;
        String string2;
        String string3;
        String string4 = od3_2.a;
        int n3 = string4.length();
        if (n3 == 0) {
            string4 = od3_2.a();
        }
        n3 = (int)(s20.a ? 1 : 0);
        boolean bl3 = true;
        if (n3 == 0 && (n3 = (int)(Intrinsics.areEqual(string3 = od3_2.a(), string2 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0)) == 0) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = 1;
        }
        if (n3 == 0 && !(bl2 = Intrinsics.areEqual(string4, string3 = ld3_2.STORE_AJIOGRAM.getStoreId()))) {
            bl3 = false;
        }
        this.sb(bl3, false);
    }

    public final void S9(double d2, double d5) {
        int n3;
        Object object = this.gb();
        ((hy3_0)object).a = d2;
        ((hy3_0)object).b = d5;
        Object object2 = yn3_0.a;
        String string2 = "locale gps state: ".concat("STATE_SUCCESS");
        Object[] objectArray = new Object[]{};
        ((yn3$a)object2).a(string2, objectArray);
        ((hy3_0)object).d = n3 = 102;
        ((hy3_0)object).c();
        object = el1_2.a;
        boolean bl2 = el1_2.j();
        if (bl2) {
            nl1_1 nl1_12;
            object = el1_2.b;
            object2 = nl1_12;
            nl1_12 = new nl1_1(d2, d5, null);
            int n4 = 3;
            Ae3.d((i90_0)object, null, null, nl1_12, n4);
        }
    }

    public final void Sa() {
        boolean bl2 = this.W0;
        if (bl2) {
            Object object;
            bl2 = og1_1.c();
            A71 a71 = null;
            if (bl2 && !(bl2 = this.y0)) {
                object = this.X;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ajiohomeViewModel");
                    bl2 = false;
                    object = null;
                }
                ((x9_0)object).g();
            }
            if ((object = this.k) == null) {
                object = "homeListener";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                a71 = object;
            }
            a71.O0();
            bl2 = false;
            object = null;
            this.W0 = false;
        }
    }

    public final void Sb(boolean bl2) {
        Object object;
        Object object2;
        int n3;
        int n4;
        Object object3;
        Object object4;
        int n7 = h40_0.Q1();
        boolean bl3 = false;
        String string2 = null;
        boolean bl4 = true;
        String string3 = "appPreferences";
        Object object5 = null;
        if (n7 != 0) {
            object4 = this.S0;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n7 = 0;
                object4 = null;
            }
            if ((object4 = ((jo_2)object4).m()) != null && (n7 = ((String)object4).length()) != 0) {
                object3 = this.S0;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n4 = 0;
                    object3 = null;
                }
                String string4 = ((jo_2)object3).m();
                n3 = 0;
                object2 = null;
                object = null;
                int n8 = 3;
                object3 = object4;
                object4 = new GPSLocationData(null, null, string4, n8, null);
                object3 = this.gb();
                ((hy3_0)object3).j((GPSLocationData)object4, bl4);
                object4 = this.S0;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n7 = 0;
                    object4 = null;
                }
                object3 = "SHOULD_PINCODE_REFRESH_HOME_PAGE";
                ((sw_0)object4).putPreference((String)object3, false);
            }
        }
        og1_1.g(false, bl2);
        od3_2.d();
        object4 = this.H;
        if (object4 != null) {
            object3 = new da$a();
            ((da$a)object3).k = bl4;
            ((da$a)object3).g = bl4;
            ((da$a)object3).b = n3 = R$drawable.ajio_logo_toolbar;
            n3 = R$string.acc_ajio_logo;
            object2 = hv3_0.K(n3);
            ((da$a)object3).b((String)object2);
            ((da$a)object3).s = bl4;
            object2 = this.S0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n3 = 0;
                object2 = null;
            }
            object = ld3_2.STORE_AJIO.getStoreId();
            ((da$a)object3).n = object2 = ((jo_2)object2).j((String)object);
            ((da$a)object3).u = object4;
            ((da$a)object3).i = bl4;
            ((da$a)object3).a();
        }
        if ((object4 = this.i2) != null) {
            ai0_2.i((View)object4);
        }
        if ((object4 = this.A) != null) {
            ai0_2.i((View)object4);
        }
        if ((object4 = this.h2) != null) {
            ai0_2.i((View)object4);
        }
        if ((object4 = this.Y1) != null) {
            ai0_2.i((View)object4);
        }
        if ((object4 = this.X1) != null) {
            ai0_2.B((View)object4);
        }
        if ((object4 = this.D) != null) {
            ai0_2.i((View)object4);
        }
        if ((object4 = this.B) != null) {
            ai0_2.i((View)object4);
        }
        if ((object4 = this.G) != null) {
            ai0_2.i((View)object4);
        }
        if (bl2) {
            this.X0 = false;
            object4 = this.X;
            string2 = "ajiohomeViewModel";
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n7 = 0;
                object4 = null;
            }
            ((x9_0)object4).z = n4 = -1;
            object4 = this.S0;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n7 = 0;
                object4 = null;
            }
            object4 = ((jo_2)object4).e();
            object3 = "";
            if (object4 == null) {
                object4 = object3;
            }
            if ((object2 = this.X) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object2 = null;
            }
            if ((object = this.S0) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                object = null;
            }
            if ((string3 = ((sw_0)object).getPreference("CORE_CATEGORY_ID", (String)object3)) != null) {
                object3 = string3;
            }
            object2.getClass();
            string3 = "<set-?>";
            Intrinsics.checkNotNullParameter(object3, string3);
            ((x9_0)object2).r = object3;
            object3 = this.X;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n4 = 0;
                object3 = null;
            }
            object3.getClass();
            Intrinsics.checkNotNullParameter(object4, string3);
            ((x9_0)object3).s = object4;
            object4 = this.X;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n7 = 0;
                object4 = null;
            }
            if (bl3 = (object4 = ((x9_0)object4).A).isEmpty() ^ bl4) {
                ((LinkedHashMap)object4).clear();
            }
            object4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            string2 = "landing screen/ajio";
            ((GTMEvents)object4).setScreenName(string2);
            object4 = this.bb();
            if (object4 != null) {
                n7 = ((Number)object4).intValue();
                this.Bb(n7);
            }
        }
        if ((object4 = this.k) == null) {
            object4 = "homeListener";
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
        } else {
            object5 = object4;
        }
        object5.f(bl2);
    }

    public final void T2() {
        boolean bl2;
        Object object = new fo_1();
        this.w0 = object;
        ((fo_1)object).h = bl2 = true;
        Object object2 = "changeLocationListener";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        ((fo_1)object).i = this;
        object = this.w0;
        if (object != null) {
            object = "cartAddressCallBackListener";
            Intrinsics.checkNotNullParameter(this, (String)object);
        }
        if ((object = this.w0) != null) {
            object2 = this.requireActivity().getSupportFragmentManager();
            String string2 = "CartPinCodeCheckBottomSheet";
            ((DialogFragment)object).show((FragmentManager)object2, string2);
        }
    }

    public final void Ta() {
        Object object;
        Object object2 = od3_2.a();
        int n3 = Intrinsics.areEqual(object2, object = ld3_2.STORE_AJIOGRAM.getStoreId());
        if (n3 != 0) {
            return;
        }
        object2 = this.D1;
        if (object2 != null && (n3 = object2.getVisibility()) == 0 && (n3 = (int)(this.P1 ? 1 : 0)) == 0) {
            n3 = 1;
            this.P1 = n3;
            object = Looper.getMainLooper();
            object2 = new Handler((Looper)object);
            object = new W8(this);
            long l2 = 1000L;
            object2.postDelayed((Runnable)object, l2);
        }
    }

    public final void Tb(boolean bl2) {
        Object object;
        String string2;
        Object object2;
        int n3;
        Object object3;
        int n4 = 1;
        og1_1.g(n4 != 0, bl2);
        Object object4 = this.A;
        if (object4 != null) {
            ai0_2.i((View)object4);
        }
        if ((object4 = this.h2) != null) {
            ai0_2.i((View)object4);
        }
        if ((object4 = this.i2) != null) {
            ai0_2.i((View)object4);
        }
        if ((object4 = this.Y1) != null) {
            ai0_2.B((View)object4);
        }
        if ((object4 = this.X1) != null) {
            ai0_2.i((View)object4);
        }
        object4 = this.P;
        A71 a71 = null;
        if (object4 != null) {
            object3 = new da$a();
            ((da$a)object3).k = n4;
            ((da$a)object3).g = n4;
            ((da$a)object3).s = n4;
            ((da$a)object3).b = n3 = R$drawable.luxe_toolbar_ic;
            n3 = R$string.acc_luxe_logo;
            object2 = hv3_0.K(n3);
            ((da$a)object3).b((String)object2);
            object2 = this.S0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appPreferences");
                n3 = 0;
                object2 = null;
            }
            string2 = ld3_2.STORE_LUXE.getStoreId();
            ((da$a)object3).n = object2 = ((jo_2)object2).j(string2);
            ((da$a)object3).u = object4;
            ((da$a)object3).i = n4;
            ((da$a)object3).a();
        }
        object4 = this.X;
        object3 = "ajiohomeViewModel";
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object4 = null;
        }
        object4.getClass();
        object2 = "Luxe";
        string2 = "<set-?>";
        Intrinsics.checkNotNullParameter(object2, string2);
        ((x9_0)object4).s = object2;
        if (bl2) {
            this.X0 = n4;
            object4 = this.X;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                object4 = null;
            }
            ((x9_0)object4).z = n3 = -1;
            object4 = this.X;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                object4 = null;
            }
            if ((n4 ^= (n3 = (int)((object4 = ((x9_0)object4).A).isEmpty() ? 1 : 0))) != 0) {
                ((LinkedHashMap)object4).clear();
            }
            if ((n4 = (int)(this.y0 ? 1 : 0)) == 0) {
                object = this.X;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n4 = 0;
                    object = null;
                }
                ((x9_0)object).f();
            }
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            object4 = "landing screen/luxe";
            ((GTMEvents)object).setScreenName((String)object4);
            object = this.bb();
            if (object != null) {
                n4 = ((Number)object).intValue();
                this.Bb(n4);
            }
        }
        if ((object = this.k) == null) {
            object = "homeListener";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            a71 = object;
        }
        a71.c(bl2);
    }

    public final String Ua(String string2) {
        Intrinsics.checkNotNullParameter(string2, "bannerUrl");
        String string3 = "?";
        int n3 = StringsKt.F(string2, string3, false);
        String string4 = "/";
        int n4 = 6;
        String string5 = "substring(...)";
        int n7 = 1;
        if (n3 == n7) {
            int n8 = StringsKt.R(string2, string4, 0, n4) + n7;
            int n10 = StringsKt.O(string2, string3, 0, false, n4);
            string2 = string2.substring(n8, n10);
            Intrinsics.checkNotNullExpressionValue(string2, string5);
        } else {
            int n10 = StringsKt.R(string2, string4, 0, n4) + n7;
            string2 = string2.substring(n10);
            Intrinsics.checkNotNullExpressionValue(string2, string5);
        }
        if (string2 == null) {
            string2 = "";
        }
        return string2;
    }

    public final void Ub(TextView textView, boolean bl2) {
        if (textView != null) {
            if (bl2) {
                int n3;
                FontsManager fontsManager = FontsManager.getInstance();
                Context context = this.requireContext();
                if ((fontsManager = fontsManager.getTypefaceWithFont(context, n3 = 10)) != null) {
                    textView.setTypeface((Typeface)fontsManager);
                }
            } else {
                int n4;
                FontsManager fontsManager = FontsManager.getInstance();
                Context context = this.requireContext();
                if ((fontsManager = fontsManager.getTypefaceWithFont(context, n4 = 9)) != null) {
                    textView.setTypeface((Typeface)fontsManager);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Vb(int n3, String string2, String string3) {
        Object object;
        boolean bl2 = hu1_2.d();
        if (bl2) {
            object = hu1_2.e;
        } else {
            bl2 = false;
            object = null;
        }
        String string4 = object;
        object = AnalyticsManager.Companion;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        String string5 = av_0.a((AnalyticsManager$Companion)object);
        String string6 = String.valueOf(n3);
        object = this;
        String string7 = this.H0;
        NewEEcommerceEventsRevamp.pushEECustomForTab$default(newEEcommerceEventsRevamp, string5, string7, string2, string3, string6, true, null, false, string4, 192, null);
    }

    public final void Wa() {
        Object object = h40_0.a;
        int n3 = h40_0.Y0();
        Object object2 = "rilfnl";
        Object object3 = "";
        String string2 = "<get-userInformation>(...)";
        if (n3 != 0) {
            boolean bl2;
            object = CustomerStoreType.a;
            object = this.db();
            Intrinsics.checkNotNullExpressionValue(object, string2);
            ScreenType screenType = ScreenType.SCREEN_HOME;
            String string3 = od3_2.a();
            int n4 = ((String)object3).length();
            if (n4 == 0) {
                object3 = string3;
            }
            if (!(bl2 = Intrinsics.areEqual(object3, string3 = ld3_2.STORE_AJIO.getStoreId()))) {
                object2 = object3;
            }
            object3 = null;
            object = CustomerStoreType.c(false, (UserInformation)object, screenType, (String)object2);
        } else {
            object = CustomerStoreType.a;
            object = od3_2.a();
            int n7 = ((String)object3).length();
            if (n7 == 0) {
                object3 = object;
            }
            if ((n3 = Intrinsics.areEqual(object3, object = ld3_2.STORE_AJIO.getStoreId())) == 0) {
                object2 = object3;
            }
            object = this.db();
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = CustomerStoreType.b((String)object2, (UserInformation)object);
        }
        n3 = ((String)object).length();
        if (n3 == 0) {
            object = this.db();
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = ServiceUtil.getToken((UserInformation)object);
            n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(TextUtils.isEmpty((CharSequence)(object = this.db().getGuestAccessToken())) ? 1 : 0)) != 0) {
                n3 = 1;
                this.C2 = n3;
                object = this.N0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loginViewModel");
                    n3 = 0;
                    object = null;
                }
                object2 = "home landing screen";
                ((oa1_1)object).j((String)object2);
            } else {
                object = this.gb();
                ((hy3_0)object).i();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Wb(ArrayList arrayList) {
        Object object;
        boolean bl2 = hu1_2.d();
        if (bl2) {
            object = hu1_2.e;
        } else {
            bl2 = false;
            object = null;
        }
        String string2 = object;
        object = AnalyticsManager.Companion;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        String string3 = av_0.a((AnalyticsManager$Companion)object);
        String string4 = this.H0;
        NewEEcommerceEventsRevamp.pushEECustomForTabs$default(newEEcommerceEventsRevamp, string3, string4, arrayList, null, string2, 8, null);
    }

    public final void X4() {
    }

    public final void Xa() {
        boolean bl2 = h40_0.Q1();
        int n3 = 103;
        Object object = "appPreferences";
        Object object2 = null;
        if (bl2) {
            Object object3 = this.S0;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                bl2 = false;
                object3 = null;
            }
            if ((bl2 = TextUtils.isEmpty((CharSequence)(object3 = ((jo_2)object3).m()))) && !(bl2 = ((UserInformation)(object3 = this.db())).isUserOnline())) {
                object3 = this.gb();
                ((hy3_0)object3).s(n3);
            } else {
                object3 = this.S0;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    bl2 = false;
                    object3 = null;
                }
                object3 = ((jo_2)object3).l();
                object = this.db();
                boolean n4 = ((UserInformation)object).isUserOnline();
                if (n4) {
                    if (object3 != null) {
                        AddressType addressType = ((CartDeliveryAddress)object3).getAddressType();
                        if (addressType == (object = AddressType.Pincode)) {
                            ((CartDeliveryAddress)object3).setAddressType((AddressType)((Object)object));
                        } else {
                            addressType = ((CartDeliveryAddress)object3).getAddressType();
                            if (addressType == (object = AddressType.Address)) {
                                ((CartDeliveryAddress)object3).setAddressType((AddressType)((Object)object));
                            } else {
                                addressType = ((CartDeliveryAddress)object3).getAddressType();
                                if (addressType == (object = AddressType.PinCodeEmpty)) {
                                    ((CartDeliveryAddress)object3).setAddressType((AddressType)((Object)object));
                                } else {
                                    addressType = AddressType.None;
                                    ((CartDeliveryAddress)object3).setAddressType(addressType);
                                }
                            }
                        }
                        this.Lb((CartDeliveryAddress)object3);
                    } else {
                        object3 = this.gb();
                        ((hy3_0)object3).s(n3);
                    }
                } else {
                    int n7;
                    if (object3 != null) {
                        object2 = ((CartDeliveryAddress)object3).getPostalCode();
                    }
                    if (object2 != null && (n7 = ((String)object2).length()) != 0) {
                        if (object3 != null) {
                            AddressType object5 = AddressType.Pincode;
                            ((CartDeliveryAddress)object3).setAddressType(object5);
                        }
                        this.Lb((CartDeliveryAddress)object3);
                    } else {
                        object3 = this.gb();
                        ((hy3_0)object3).s(n3);
                    }
                }
            }
        } else {
            Object object4 = this.S0;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                bl2 = false;
                object4 = null;
            }
            if (bl2 = TextUtils.isEmpty((CharSequence)(object4 = ((jo_2)object4).m()))) {
                object4 = this.gb();
                ((hy3_0)object4).s(n3);
            } else {
                object4 = p3.a("client_type", "Android");
                AJIOApplication.Companion.getClass();
                Object object3 = p90.a((Context)AJIOApplication$a.a());
                ((HashMap)object4).put("client_version", object3);
                object3 = UserInformation.getInstance((Context)AJIOApplication$a.a());
                Object object5 = "getInstance(...)";
                Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
                object3 = ServiceUtil.getToken((UserInformation)object3);
                if (object3 != null && (object5 = this.D2) != null) {
                    jo_2 jo_22 = this.S0;
                    if (jo_22 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    } else {
                        object2 = jo_22;
                    }
                    object = ((jo_2)object2).m();
                    Intrinsics.checkNotNull(object);
                    ((h5_0)object5).b((String)object3, (String)object, (HashMap)object4);
                }
            }
        }
    }

    public final void Ya() {
        boolean bl2;
        boolean bl3;
        Object object = this.db();
        if (object != null && (bl3 = ((UserInformation)object).isUserOnline()) == (bl2 = true)) {
            object = this.Za().l;
            if (object != null) {
                object = ((RtoFirebaseData)object).isRTOEnabled();
                Boolean bl4 = Boolean.TRUE;
                bl3 = Intrinsics.areEqual(object, bl4);
            } else {
                bl3 = false;
                object = null;
            }
            if (bl3) {
                bl3 = EQ2.a;
                bl3 = EQ2.a;
                if (!bl3) {
                    object = this.Za();
                    ((lq2_0)object).c();
                }
            }
        }
    }

    public final void Z1() {
    }

    public final lq2_0 Za() {
        return (lq2_0)this.t0.getValue();
    }

    public final void a8(PLPExtras pLPExtras) {
        Intrinsics.checkNotNullParameter(pLPExtras, "plpExtras");
        String string2 = pLPExtras.x;
        if (string2 == null) {
            string2 = "";
        }
        Object object = new File(string2);
        object = Uri.fromFile((File)object).toString();
        this.Ab(pLPExtras, (String)object);
    }

    public final y7 ab() {
        Object object = this.y;
        x9_0 x9_02 = null;
        if (object != null && (object = ((RecyclerView)object).getLayoutManager()) != null) {
            object = (LinearLayoutManager)object;
            int bl2 = ((LinearLayoutManager)object).findFirstCompletelyVisibleItemPosition();
            Object object2 = this.y;
            int n3 = 0;
            x9_0 x9_03 = null;
            if (object2 != null && (object2 = ((RecyclerView)object2).getLayoutManager()) != null && (object2 = ((RecyclerView$o)object2).getChildAt(0)) != null) {
                n3 = object2.getTop();
            }
            Object object3 = this.X;
            String string2 = "ajiohomeViewModel";
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object3 = null;
            }
            String string3 = ((x9_0)object3).r;
            object3 = this.X;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object3 = null;
            }
            int n4 = ((x9_0)object3).z;
            object3 = this.z1;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scrollStateHolder");
                object3 = null;
            }
            P81 p81 = new P81(bl2, n3, (tt2_2)object3);
            object = this.X;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl3 = false;
                object = null;
            }
            boolean bl4 = ((x9_0)object).t;
            x9_03 = this.X;
            if (x9_03 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                x9_02 = x9_03;
            }
            ArrayList arrayList = x9_02.I;
            object3 = object2;
            string2 = string3;
            object2 = new y7(string3, n4, p81, bl4, arrayList);
            return object2;
        }
        return null;
    }

    public final void b8(double d2, double d5) {
        ff0_2 ff0_22;
        this.x0 = ff0_22 = new ff0_2();
        String string2 = "changeLocationListener";
        Intrinsics.checkNotNullParameter(this, string2);
        ff0_22.j = this;
        ff0_22 = this.x0;
        if (ff0_22 != null) {
            string2 = "cartAddressCallBackListener";
            Intrinsics.checkNotNullParameter(this, string2);
            ff0_22.i = this;
        }
        if ((ff0_22 = this.x0) != null) {
            ff0_22.l = d2;
            ff0_22.m = d5;
        }
        if (ff0_22 != null) {
            FragmentManager fragmentManager = this.requireActivity().getSupportFragmentManager();
            String string3 = "CartLocationBottomSheet";
            ff0_22.show(fragmentManager, string3);
        }
    }

    public final Integer bb() {
        int n3 = og1_1.c();
        int n4 = -1;
        String string2 = "ajiohomeViewModel";
        Object object = null;
        if (n3 != 0) {
            Object object2 = this.X;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object2 = null;
            }
            if ((object2 = ((x9_0)object2).y) != null) {
                object2 = this.X;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object2 = null;
                }
                if ((n3 = ((x9_0)object2).x) != n4) {
                    object2 = this.X;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object = object2;
                    }
                    n4 = ((x9_0)object).x;
                }
                object = n4;
            } else {
                object2 = this.G;
                if (object2 != null) {
                    n3 = ((TabLayout)((Object)object2)).getSelectedTabPosition();
                    object = n3;
                }
            }
            return object;
        }
        x9_0 x9_02 = this.X;
        if (x9_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            x9_02 = null;
        }
        if ((n3 = x9_02.x) == n4) {
            return 0;
        }
        x9_02 = this.X;
        if (x9_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object = x9_02;
        }
        return ((x9_0)object).x;
    }

    public final void cb() {
        HashMap hashMap = p3.a("client_type", "Android");
        AJIOApplication.Companion.getClass();
        Object object = p90.a((Context)AJIOApplication$a.a());
        hashMap.put("client_version", object);
        hashMap.put("returnDefault", "true");
        object = this.db();
        Object object2 = "<get-userInformation>(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = ServiceUtil.getToken((UserInformation)object);
        if (object != null && (object2 = this.D2) != null) {
            String string2 = this.db().getUserId();
            String string3 = "getUserId(...)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            ((h5_0)object2).d((String)object, string2, hashMap);
        }
    }

    public final UserInformation db() {
        return (UserInformation)this.T0.getValue();
    }

    public final void eb(boolean bl2) {
        Object object;
        boolean bl3;
        Object object2 = this.db().getUserEmailId();
        Object object3 = this.db();
        Object object4 = null;
        if (object3 != null) {
            object3 = ((UserInformation)object3).getUserDeviceId();
        } else {
            bl3 = false;
            object3 = null;
        }
        if (object3 != null) {
            object = FirebaseEvents.Companion.getInstance();
            ((FirebaseEvents)object).updateDeviceIdTempDate((String)object3);
        }
        object3 = this.gb();
        bl3 = ((hy3_0)object3).p();
        object = "enable_deviceId_cohort";
        if (bl3 && !(bl3 = TextUtils.isEmpty((CharSequence)object2))) {
            object3 = this.k;
            if (object3 == null) {
                object3 = "homeListener";
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            } else {
                object4 = object3;
            }
            bl3 = object4.M();
            if (!bl3) {
                String string2 = mz3_0.u("User_Type");
                object3 = this.I;
                object4 = this.J;
                hv3_0.r0((ShimmerFrameLayout)((Object)object3), (View)object4);
                object3 = h40_0.a;
                object3 = z40_0.Companion;
                object4 = AJIOApplication.Companion;
                object3 = Q.a((AJIOApplication$a)object4, (z40$a)object3).a;
                bl3 = ((ao0_0)object3).a((String)object);
                if (bl3) {
                    this.Wa();
                }
                object3 = this.gb();
                Intrinsics.checkNotNull(object2);
                ((hy3_0)object3).o((String)object2, string2);
            } else {
                this.lb(bl2);
            }
        } else {
            object2 = h40_0.a;
            object2 = z40_0.Companion;
            object3 = AJIOApplication.Companion;
            object2 = Q.a((AJIOApplication$a)object3, (z40$a)object2).a;
            boolean bl4 = ((ao0_0)object2).a((String)object);
            if (bl4) {
                this.Wa();
            }
            this.lb(bl2);
            this.Xa();
        }
    }

    public final void f0(boolean bl2) {
        if (bl2) {
            NewCustomEventsRevamp newCustomEventsRevamp = this.G0;
            String string2 = newCustomEventsRevamp.getEC_IMAGE_SEARCH();
            AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
            String string3 = av_0.a(analyticsManager$Companion);
            String string4 = "upload image icon interactions";
            String string5 = "pop up close";
            String string6 = "event_upload_image_icon_interactions";
            String string7 = "home landing screen";
            String string8 = this.H0;
            String string9 = this.I0;
            int n3 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string4, string5, string6, string3, string7, string8, null, string9, false, null, n3, null);
        }
    }

    public final void fb() {
        String string2 = this.db().getUserEmailId();
        Object object = this.gb();
        boolean bl2 = ((hy3_0)object).p();
        if (bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            object = this.k;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("homeListener");
                bl2 = false;
                object = null;
            }
            if (!(bl2 = object.M())) {
                object = this.gb();
                Intrinsics.checkNotNull(string2);
                String string3 = "BackGround_User_Type";
                ((hy3_0)object).o(string2, string3);
            }
        }
    }

    public final void g7(String string2) {
        Intrinsics.checkNotNullParameter(string2, "link");
        kj0_1 kj0_12 = kj0_1.g();
        FragmentActivity fragmentActivity = this.getActivity();
        kj0_12.p(fragmentActivity, string2);
    }

    public final hy3_0 gb() {
        return (hy3_0)this.M0.getValue();
    }

    public final void getOrders() {
        Object object = this.gb();
        boolean n3 = ((hy3_0)object).p();
        if (n3) {
            boolean bl2;
            object = hv3_0.a;
            object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
            Object object2 = "homePageCardPosition";
            int n4 = ((ao0_0)object).g((String)object2);
            if (n4 > 0 && !(bl2 = og1_1.c())) {
                rf2_2 rf2_22;
                Object object3 = object = this.L0.getValue();
                object3 = (tf2_2)object;
                String string2 = OrderListFunctionalRepo.INSTANCE.getCurrentOrderDateRangeKey();
                boolean bl3 = hv3_0.D();
                object3.getClass();
                object = md3_0.c((jD3)object3);
                object2 = rf2_22;
                rf2_22 = new rf2_2((tf2_2)object3, string2, bl3, false, null);
                int n7 = 3;
                object3 = null;
                Ae3.d((i90_0)object, null, null, rf2_22, n7);
            }
        }
    }

    public final void h3() {
        a$a a$a = com.ril.ajio.plp.a.Companion;
        Object object = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(object, "requireContext(...)");
        Object object2 = this.requireActivity().getActivityResultRegistry();
        a$a.getClass();
        a$a.a((Context)object, (K3)object2, this).b();
        object = this.G0;
        object2 = ((NewCustomEventsRevamp)object).getEC_IMAGE_SEARCH();
        String string2 = av_0.a(AnalyticsManager.Companion);
        String string3 = this.H0;
        String string4 = this.I0;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object2, "upload image icon interactions", "Select from gallery", "event_upload_image_icon_interactions", string2, "home landing screen", string3, null, string4, false, null, 1536, null);
    }

    public final void ha() {
        this.l1 = false;
        Object object = h40_0.a;
        boolean bl2 = h40_0.A();
        if (bl2) {
            this.Db();
            object = this.b1;
            if (object != null) {
                ai0_2.i((View)object);
            }
        } else {
            this.m1 = bl2 = true;
            object = this.g;
            if (object != null && (object = ((ob_2)object).i) != null) {
                int n3 = 5;
                long l2 = 0L;
                ((androidx.media3.common.b)object).c(n3, l2);
            }
            if (bl2 = this.q1) {
                object = this.g;
                if (object != null) {
                    ((ob_2)object).i();
                }
            } else {
                object = this.g;
                if (object != null) {
                    ((ob_2)object).n();
                }
            }
        }
    }

    public final void hb(boolean bl2) {
        Object object = this.getActivity();
        boolean bl3 = object instanceof AjioHomeActivity;
        Object object2 = null;
        object = bl3 ? (AjioHomeActivity)object : null;
        if (object != null) {
            Object object3;
            object = this.getParentFragment();
            if (object != null && (object = ((Fragment)object).getChildFragmentManager()) != null) {
                fq0_2.Companion.getClass();
                object3 = fq0_2.J;
                object = ((FragmentManager)object).E((String)object3);
            } else {
                object = null;
            }
            bl3 = object instanceof fq0_2;
            object = bl3 ? (fq0_2)object : null;
            if (object != null) {
                object3 = ((fq0_2)object).q;
                String string2 = "fleekViewModel";
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl3 = false;
                    object3 = null;
                }
                boolean bl4 = bl2 ^ true;
                ((dr0_0)object3).Z(bl4);
                object3 = ((fq0_2)object).q;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl3 = false;
                    object3 = null;
                }
                Object object4 = bl2;
                object3 = ((dr0_0)object3).s;
                ((h83_0)object3).setValue(object4);
                object4 = ((fq0_2)object).q;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object2 = object4;
                }
                object4 = Boolean.TRUE;
                object = ((dr0_0)object2).l;
                ((h83_0)object).setValue(object4);
            }
        }
    }

    public final boolean ib() {
        AjioHomeActivity.Companion.getClass();
        Object object = AjioHomeActivity.D1;
        if (object != null) {
            boolean bl2 = object.isEmpty();
            boolean bl3 = true;
            if ((bl2 ^= bl3) == bl3) {
                Object object2;
                object = AjioHomeActivity.D1;
                Object object3 = null;
                if (object != null) {
                    object = (y7)((Stack)object).pop();
                } else {
                    bl2 = false;
                    object = null;
                }
                this.I2 = object;
                object = this.X;
                String string2 = "ajiohomeViewModel";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    object = null;
                }
                if ((object2 = this.I2) == null || (object2 = ((y7)object2).a) == null) {
                    object2 = "";
                }
                object.getClass();
                Object object4 = "<set-?>";
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                ((x9_0)object).r = object2;
                object = this.I2;
                int n3 = -1;
                if (object != null && (bl2 = ((y7)object).d) == bl3) {
                    this.Mb();
                    object = this.I2;
                    if (object != null && (object = ((y7)object).e) != null) {
                        object4 = this.X;
                        if (object4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            object4 = null;
                        }
                        ((x9_0)object4).I = object;
                        this.Pa((ArrayList)object);
                    }
                    if ((object = this.X) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        bl2 = false;
                        object = null;
                    }
                    ((x9_0)object).u = false;
                    bl2 = h40_0.Q1();
                    if (bl2 && (object = this.D) != null) {
                        ai0_2.B((View)object);
                    }
                    this.G2 = false;
                    object = this.X;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object3 = object;
                    }
                    ((x9_0)object3).t = bl3;
                    object = this.I2;
                    if (object != null) {
                        n3 = ((y7)object).b;
                    }
                    this.yb(n3, false);
                } else {
                    object = this.S;
                    if (object != null) {
                        ai0_2.i((View)object);
                    }
                    if ((object = this.R) != null) {
                        ai0_2.i((View)object);
                    }
                    if ((object = this.D) != null) {
                        ai0_2.i((View)object);
                    }
                    this.G2 = bl3;
                    object = this.X;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object3 = object;
                    }
                    ((x9_0)object3).t = false;
                    this.yb(n3, false);
                }
                return bl3;
            }
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void jb(BaseResponse var1_1) {
        block99: {
            block100: {
                block101: {
                    block102: {
                        var2_2 = this;
                        var3_3 = var1_1;
                        var4_5 = false;
                        var5_6 /* !! */  = null;
                        var6_7 /* !! */  = var1_1.getResponseStatusType();
                        if (var6_7 /* !! */  == (var7_8 = ResponseStatusType.API_LOADING) || !(var8_9 = this.isAdded())) break block99;
                        var6_7 /* !! */  = this.I;
                        var7_8 = this.J;
                        hv3_0.t0((ShimmerFrameLayout)var6_7 /* !! */ , (View)var7_8);
                        var6_7 /* !! */  = var1_1.getResponseStatusType();
                        var7_8 = ResponseStatusType.API_SUCCESS;
                        var9_10 /* !! */  = this.m;
                        var10_11 = "homeListener";
                        var11_12 /* !! */  = "commonCmsViewDelegate";
                        var12_13 = "ajiohomeViewModel";
                        var13_14 = null;
                        if (var6_7 /* !! */  != var7_8) break block100;
                        var6_7 /* !! */  = (HomeData)var1_1.getData();
                        if (var6_7 /* !! */  == null) break block99;
                        var7_8 = this.y;
                        if (var7_8 != null) {
                            ai0_2.B((View)var7_8);
                        }
                        if ((var7_8 = var2_2.X) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var12_13);
                            var14_15 = 0;
                            var7_8 = null;
                        }
                        var15_16 = var7_8.B;
                        var7_8 = var7_8.r;
                        var7_8 = (BaseResponse)var15_16.get(var7_8);
                        var15_16 = var2_2.C0;
                        if (var7_8 != null) break block101;
                        var14_15 = xv_0.g();
                        if (var14_15 != 0) break block102;
                        var7_8 = h40_0.a;
                        var14_15 = h40_0.Z0();
                        if (var14_15 == 0) break block101;
                    }
                    var7_8 = ((BannerAdViewModel)var15_16.getValue()).getHomePageBannerAdsMap();
                    var16_18 /* !! */  = ((BannerAdViewModel)var15_16.getValue()).getHomePageExternalAdsMap();
                    xv_0.e((HomeData)var6_7 /* !! */ , (HashMap)var7_8, (HashMap)var16_18 /* !! */ );
                }
                if ((var7_8 = var2_2.X) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var12_13);
                    var14_15 = 0;
                    var7_8 = null;
                }
                var7_8.getClass();
                var16_18 /* !! */  = "response";
                Intrinsics.checkNotNullParameter(var3_3, (String)var16_18 /* !! */ );
                var17_20 = var7_8.v;
                var18_21 = 1;
                if (var17_20 != 0) {
                    var16_18 /* !! */  = var7_8.o;
                    var19_23 = Boolean.TRUE;
                    var16_18 /* !! */ .k(var19_23);
                    var16_18 /* !! */ .k(null);
                    var7_8.v = false;
                    var7_8.w = var18_21;
                } else {
                    var16_18 /* !! */  = var7_8.B;
                    var19_23 = var7_8.r;
                    var16_18 /* !! */ .put(var19_23, var3_3);
                }
                var7_8.u = false;
                var7_8 = var2_2.X;
                if (var7_8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var12_13);
                    var14_15 = 0;
                    var7_8 = null;
                }
                var3_3 = var1_1.getStatusInfo();
                var16_18 /* !! */  = "null cannot be cast to non-null type com.ril.ajio.kmm.shared.model.home.CMSData";
                Intrinsics.checkNotNull(var3_3, (String)var16_18 /* !! */ );
                var3_3 = ((CMSData)var3_3).getUsergroup();
                var7_8.J = var3_3;
                ((BannerAdViewModel)var15_16.getValue()).resetAdsMap();
                var2_2.D0 = null;
                var3_3 = var2_2.X;
                if (var3_3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var12_13);
                    var20_25 = false;
                    var3_3 = null;
                }
                if (var20_25 = var3_3.t) ** GOTO lbl-1000
                var3_3 = var2_2.X;
                if (var3_3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var12_13);
                    var20_25 = false;
                    var3_3 = null;
                }
                if (!(var20_25 = var3_3.c())) {
                    var3_3 = var2_2.z;
                    if (var3_3 != null) {
                        var7_8 = var6_7 /* !! */ .getPageName();
                        var3_3.setText((CharSequence)var7_8);
                    }
                    if ((var3_3 = var2_2.z) != null) {
                        ai0_2.B((View)var3_3);
                    }
                } else if ((var3_3 = var2_2.z) != null) {
                    ai0_2.i((View)var3_3);
                }
                yx0_0.a = var3_3 = var6_7 /* !! */ .getPageTitle();
                var20_25 = var2_2.v2;
                if (!var20_25) {
                    var3_3 = var2_2.X;
                    if (var3_3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var12_13);
                        var20_25 = false;
                        var3_3 = null;
                    }
                    var7_8 = var6_7 /* !! */ .getPageTitle();
                    var15_16 = "";
                    if (var7_8 == null) {
                        var7_8 = var15_16;
                    }
                    var16_18 /* !! */  = var2_2.t2;
                    var3_3.getClass();
                    Intrinsics.checkNotNullParameter(var7_8, "pageTitle");
                    Intrinsics.checkNotNullParameter(var16_18 /* !! */ , "current_exp");
                    var19_23 = new Bundle();
                    var21_27 = "page_type";
                    var19_23.putString(var21_27, (String)var7_8);
                    var19_23.putBoolean("served_from_cms", (boolean)var18_21);
                    var19_23.putString("ecomm_pageType", "home");
                    var13_14 = AnalyticsManager.Companion;
                    var13_14.getInstance().getNewEEcommerceEventsRevamp().addCohortLInkData((Bundle)var19_23, (String)var16_18 /* !! */ );
                    var22_29 = var3_3.J;
                    var19_23.putString("akamai_personalization", (String)var22_29);
                    var16_18 /* !! */  = x9_0.h();
                    var22_29 = var3_3.r;
                    var17_20 = Intrinsics.areEqual(var16_18 /* !! */ , var22_29);
                    if (var17_20 != 0) {
                        var7_8 = "home landing screen";
                    } else {
                        var16_18 /* !! */  = "landing screen/sis-";
                        var7_8 = var16_18 /* !! */ .concat((String)var7_8);
                    }
                    var16_18 /* !! */  = var3_3.r;
                    var17_20 = var16_18 /* !! */ .length();
                    if (var17_20 > 0) {
                        var16_18 /* !! */  = CustomerStoreType.a;
                        var16_18 /* !! */  = ScreenType.SCREEN_HOME;
                        var15_16 = CustomerStoreType.a((String)var15_16, (ScreenType)var16_18 /* !! */ );
                    } else {
                        var23_30 = false;
                        var15_16 = null;
                    }
                    if (var15_16 != null && (var17_20 = var15_16.length()) != 0) {
                        var16_18 /* !! */  = "user_personalization_bucket";
                        var19_23.putString((String)var16_18 /* !! */ , var15_16);
                    }
                    var20_25 = var3_3.b.d();
                    var19_23.putInt("number_of_items_on_cart", (int)var20_25);
                    var13_14.getInstance().getGtmEvents().pushOpenScreenEvent((String)var7_8, (Bundle)var19_23);
                    var3_3 = new HashMap();
                    var7_8 = "Name";
                    var15_16 = "landing screen";
                    var3_3.put(var7_8, var15_16);
                    var14_15 = (int)og1_1.c();
                    var7_8 = var14_15 != 0 ? "luxe" : "basic";
                    var3_3.put(var21_27, var7_8);
                    var7_8 = var13_14.getInstance().getCt();
                    var13_14 = new AnalyticsData$Builder();
                    var3_3 = var13_14.eventMap((HashMap)var3_3).build();
                    var7_8.pageViewed((AnalyticsData)var3_3);
                }
                var2_2.v2 = false;
                var3_3 = var2_2.y;
                if (var3_3 != null) {
                    ai0_2.B((View)var3_3);
                }
                if ((var3_3 = var6_7 /* !! */ .getHomeRowData()) != null) {
                    var7_8 = new Handler();
                    var13_14 = new r8(var2_2);
                    var24_31 = 500L;
                    var7_8.postDelayed((Runnable)var13_14, var24_31);
                    var9_10 /* !! */ .clear();
                    var3_3 = (Collection)var3_3;
                    var9_10 /* !! */ .addAll(var3_3);
                    var20_25 = og1_1.c();
                    if (var20_25) {
                        block98: {
                            var3_3 = var2_2.X;
                            if (var3_3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var12_13);
                                var14_15 = 0;
                                var7_8 = null;
                            } else {
                                var7_8 = var3_3;
                            }
                            var7_8.getClass();
                            Intrinsics.checkNotNullParameter(var9_10 /* !! */ , "homeDataList");
                            var3_3 = var7_8.F;
                            if (var3_3 == null) {
                                var3_3 = z40_0.Companion;
                                var13_14 = var7_8.getApplication();
                                var3_3.getClass();
                                var3_3 = z40$a.a((Context)var13_14);
                                var3_3 = var3_3.a;
                                var13_14 = "selfcarekeys";
                                var3_3 = var3_3.b((String)var13_14);
                                var13_14 = new Gson();
                                var15_16 = LuxeHomeFooter.class;
                                var3_3 = var13_14.fromJson((String)var3_3, (Class)var15_16);
                                var3_3 = (LuxeHomeFooter)var3_3;
                                var7_8.F = var3_3;
                                if (var3_3 == null) break block98;
                                try {
                                    var13_14 = var3_3.iterator();
                                }
                                catch (Exception var3_4) {
                                    var13_14 = yn3_0.a;
                                    var13_14.e(var3_4);
                                    var7_8.F = var3_3 = new LuxeHomeFooter();
                                }
                                while (true) {
                                    var23_30 = var13_14.hasNext();
                                    if (!var23_30) break;
                                    var15_16 = var13_14.next();
                                    var15_16 = (LuxeFooterData)var15_16;
                                    var17_20 = (int)var15_16.isEnable();
                                    if (var17_20 != 0) continue;
                                    var3_3.remove(var15_16);
                                    continue;
                                    break;
                                }
                            }
                        }
                        if ((var3_3 = var7_8.F) != null) {
                            var26_32 = HomeViewTypes.ROW_TYPE_SPACE;
                            var27_33 = 1011;
                            var28_34 = 0;
                            var7_8 = new HomeRowData(null, null, 0, var26_32, null, null, null, null, null, null, var27_33, null);
                            var9_10 /* !! */ .add(var7_8);
                            var14_15 = var3_3.size();
                            if (var14_15 > 0) {
                                var3_3 = var3_3.iterator();
                                var7_8 = "iterator(...)";
                                Intrinsics.checkNotNullExpressionValue(var3_3, (String)var7_8);
                                while ((var14_15 = (int)var3_3.hasNext()) != 0) {
                                    var7_8 = var3_3.next();
                                    Intrinsics.checkNotNullExpressionValue(var7_8, "next(...)");
                                    var7_8 = (LuxeFooterData)var7_8;
                                    var26_32 = HomeViewTypes.ROW_TYPE_LUXE_BOTTOM_LINKS;
                                    var27_33 = 1011;
                                    var28_34 = 0;
                                    var13_14 = new HomeRowData(null, null, 0, var26_32, null, null, null, null, null, null, var27_33, null);
                                    var13_14.setCustomData(var7_8);
                                    var9_10 /* !! */ .add(var13_14);
                                }
                            }
                        }
                        var29_35 = HomeViewTypes.ROW_TYPE_SPACE;
                        var30_36 = 1011;
                        var3_3 = new HomeRowData(null, null, 0, var29_35, null, null, null, null, null, null, var30_36, null);
                        var9_10 /* !! */ .add(var3_3);
                        var26_32 = HomeViewTypes.ROW_TYPE_LUXE_BOTTOM_SCROLL_TO_TOP;
                        var27_33 = 1011;
                        var28_34 = 0;
                        var3_3 = new HomeRowData(null, null, 0, var26_32, null, null, null, null, null, null, var27_33, null);
                        var9_10 /* !! */ .add(var3_3);
                    }
                    var3_3 = oo_0.Companion;
                    var3_3.getClass();
                    var20_25 = Oo$a.a();
                    if (var20_25 && !(var20_25 = qo_0.b)) {
                        var3_3 = var2_2.X;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var12_13);
                            var20_25 = false;
                            var3_3 = null;
                        }
                        var7_8 = this.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(var7_8, "requireActivity(...)");
                        var3_3.getClass();
                        Intrinsics.checkNotNullParameter(var7_8, "activity");
                        var15_16 = var3_3.i;
                        var3_3.G = var13_14 = new oo_0((zr1_1)var15_16, (Activity)var7_8);
                        var13_14.a(false);
                    }
                    var3_3 = FacebookSDKHelper.INSTANCE;
                    var3_3.initialize();
                    var7_8 = var2_2.X;
                    if (var7_8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var12_13);
                        var14_15 = 0;
                        var7_8 = null;
                    }
                    if (!(var31_37 = var7_8.E)) {
                        var7_8.E = var18_21;
                        var3_3.initialize();
                        AJIOApplication.Companion.getClass();
                        var3_3 = AJIOApplication$a.a();
                        var12_13 = new W9(var7_8);
                        com.facebook.applinks.a.c((AJIOApplication)var3_3, (W9)var12_13);
                    }
                    if ((var3_3 = var2_2.Z) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var11_12 /* !! */ );
                        var20_25 = false;
                        var3_3 = null;
                    }
                    var3_3.q(var9_10 /* !! */ );
                    var3_3 = var2_2.Z;
                    if (var3_3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var11_12 /* !! */ );
                        var20_25 = false;
                        var3_3 = null;
                    }
                    if ((var3_3 = var3_3.v) != null) {
                        var3_3.notifyDataSetChanged();
                    }
                    if ((var3_3 = var2_2.Q1) != null) {
                        ai0_2.i((View)var3_3);
                    }
                    if ((var3_3 = var2_2.Z) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var11_12 /* !! */ );
                        var20_25 = false;
                        var3_3 = null;
                    }
                    var3_3.e();
                    this.getOrders();
                    var3_3 = var2_2.Z;
                    if (var3_3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var11_12 /* !! */ );
                        var20_25 = false;
                        var3_3 = null;
                    }
                    var3_3.getClass();
                    var14_15 = (int)hv3_0.U();
                    if (var14_15 != 0) {
                        var7_8 = var3_3.f();
                        var14_15 = (int)var7_8.h;
                        if (var14_15 != 0 && (var3_3 = var3_3.b) != null) {
                            var7_8 = cp_1.Companion;
                            var7_8.getClass();
                            var14_15 = (int)cp$a.y();
                            if (var14_15 != 0) {
                                var14_15 = 5;
                                var7_8 = var3_3.c.getWishList(0, var14_15, (boolean)var18_21);
                                var9_10 /* !! */  = new uy1_2((ky1_0)var3_3);
                                var11_12 /* !! */  = new vy1_1((uy1_2)var9_10 /* !! */ );
                                var9_10 /* !! */  = new wy1_2(var3_3, 0);
                                var12_13 = new xy1_0((Function1)var9_10 /* !! */ );
                                var7_8 = var7_8.f((o60_0)var11_12 /* !! */ , (o60_0)var12_13);
                                var3_3 = var3_3.G;
                                var3_3.b((yr0_2)var7_8);
                            }
                        }
                    }
                    var20_25 = ih3_1.a;
                    var20_25 = this.gb().p();
                    ih3_1.a(var20_25);
                    this.Sa();
                    var3_3 = var2_2.k;
                    if (var3_3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var10_11);
                        var13_14 = null;
                    } else {
                        var13_14 = var3_3;
                    }
                    var20_25 = var13_14.E0();
                    if (var20_25) {
                        this.fb();
                    }
                }
                cp_1.Companion.getClass();
                var3_3 = cp$a.e();
                var3_3.getClass();
                var20_25 = cp_1.R();
                if (var20_25 && (var3_3 = var6_7 /* !! */ .getFloatingWidget()) != null && (var3_3 = var3_3.getBanners()) != null && (var3_3 = (BannerData)CollectionsKt.firstOrNull((List)var3_3)) != null) {
                    var2_2.t1 = var3_3;
                    if ((var3_3 = var3_3.getBannerType()) != null) {
                        var14_15 = var3_3.hashCode();
                        if (var14_15 != (var32_38 = 70564)) {
                            var32_38 = 69775675;
                            if (var14_15 != var32_38) {
                                var32_38 = 81665115;
                                if (var14_15 == var32_38 && (var20_25 = var3_3.equals(var7_8 = "VIDEO")) && (var3_3 = var2_2.t1) != null) {
                                    var32_38 = var3_3.getWidth();
                                    var33_40 = var3_3.getHeight();
                                    var7_8 = new ConstraintLayout$LayoutParams(var32_38, var33_40);
                                    var9_10 /* !! */  = var2_2.c1;
                                    if (var9_10 /* !! */  != null) {
                                        var9_10 /* !! */ .setLayoutParams((ViewGroup.LayoutParams)var7_8);
                                    }
                                    var7_8 = String.valueOf(var3_3.getBannerUrl());
                                    var2_2.p1 = var7_8;
                                    var7_8 = var2_2.f1;
                                    if (var7_8 != null) {
                                        ai0_2.B((View)var7_8);
                                    }
                                    if ((var7_8 = var2_2.f1) != null) {
                                        ai0_2.a((View)var7_8);
                                    }
                                    var9_10 /* !! */  = this.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(var9_10 /* !! */ , "requireContext(...)");
                                    var11_12 /* !! */  = var2_2.a1;
                                    var12_13 = var2_2.p1;
                                    var2_2.g = var7_8 = new ob_2((Context)var9_10 /* !! */ , (PlayerView)var11_12 /* !! */ , var2_2, (String)var12_13);
                                    var9_10 /* !! */  = Boolean.TRUE;
                                    var28_34 = 13;
                                    var21_27 = null;
                                    var19_23 = var7_8;
                                    var22_29 = var9_10 /* !! */ ;
                                    var7_8 = new VideoSetting(null, (Boolean)var9_10 /* !! */ , null, null, var28_34, null);
                                    Intrinsics.areEqual(var7_8.getLoop(), var9_10 /* !! */ );
                                    var7_8 = var2_2.g;
                                    if (var7_8 != null) {
                                        var7_8.g = var18_21;
                                    }
                                    if (var7_8 != null) {
                                        var34_41 = var2_2.s1;
                                        ob_2.h((ob_2)var7_8, var34_41, 0, var18_21);
                                    }
                                    if ((var7_8 = this.getView()) != null && (var7_8 = var2_2.g) != null && (var7_8 = var7_8.o) != null) {
                                        var11_12 /* !! */  = this.getViewLifecycleOwner();
                                        var12_13 = new V8(var2_2, 0);
                                        var10_11 = new c9_0((Function1)var12_13);
                                        var7_8.e((mu1_1)var11_12 /* !! */ , (F62)var10_11);
                                    }
                                    if ((var3_3 = var3_3.getAudioSettings()) != null) {
                                        var3_3 = var3_3.getMuteOnMinimizedScreen();
                                        var4_5 = Intrinsics.areEqual(var3_3, var9_10 /* !! */ );
                                    }
                                    if (var4_5) {
                                        this.zb();
                                    } else {
                                        var2_2.q1 = var18_21;
                                        this.zb();
                                    }
                                }
                            } else {
                                var7_8 = "IMAGE";
                                var20_25 = var3_3.equals(var7_8);
                                if (var20_25) {
                                    var2_2.vb(false);
                                }
                            }
                        } else {
                            var5_6 /* !! */  = "GIF";
                            var20_25 = var3_3.equals(var5_6 /* !! */ );
                            if (var20_25) {
                                var2_2.vb((boolean)var18_21);
                            }
                        }
                    }
                }
                var3_3 = var6_7 /* !! */ .getPageName();
                var2_2.Pb((String)var3_3);
                break block99;
            }
            var6_7 /* !! */  = this.X;
            if (var6_7 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var12_13);
                var8_9 = false;
                var6_7 /* !! */  = null;
            }
            var6_7 /* !! */ .u = false;
            var9_10 /* !! */ .clear();
            var6_7 /* !! */  = var2_2.Z;
            if (var6_7 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var11_12 /* !! */ );
                var8_9 = false;
                var6_7 /* !! */  = null;
            }
            if ((var6_7 /* !! */  = var6_7 /* !! */ .v) != null) {
                var6_7 /* !! */ .notifyDataSetChanged();
            }
            var7_8 = Looper.getMainLooper();
            var6_7 /* !! */  = new Handler((Looper)var7_8);
            var7_8 = new s8_0(var2_2, 0);
            var36_42 = 1000L;
            var6_7 /* !! */ .postDelayed((Runnable)var7_8, var36_42);
            var5_6 /* !! */  = var2_2.y;
            if (var5_6 /* !! */  != null) {
                ai0_2.i((View)var5_6 /* !! */ );
            }
            if ((var5_6 /* !! */  = var2_2.Q1) != null) {
                ai0_2.B((View)var5_6 /* !! */ );
            }
            if ((var5_6 /* !! */  = var1_1.getResponseStatusType()) == (var6_7 /* !! */  = ResponseStatusType.API_FAILURE)) {
                var5_6 /* !! */  = ApiErrorRepo.INSTANCE;
                var7_8 = "HOME_CMS";
                var32_39 = true;
                var11_12 /* !! */  = "landing screen";
                var12_13 = "Forward";
                var6_7 /* !! */  = var1_1;
                var5_6 /* !! */ .logApiErrorKMM(var1_1, (String)var7_8, var32_39, var11_12 /* !! */ , (String)var12_13);
                this.Sa();
            } else {
                var5_6 /* !! */  = var1_1.getResponseStatusType();
                if (var5_6 /* !! */  == (var6_7 /* !! */  = ResponseStatusType.API_EXCEPTION) && (var15_17 = var1_1.getThrowable()) != null) {
                    var13_14 = ApiErrorRepo.INSTANCE;
                    var16_19 = "HOME_CMS";
                    var18_22 = true;
                    var19_24 = "landing screen";
                    var21_28 = "Forward";
                    var13_14.logApiException(var15_17, var16_19, var18_22, var19_24, var21_28);
                }
            }
            var3_3 = var2_2.k;
            if (var3_3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var10_11);
                var13_14 = null;
            } else {
                var13_14 = var3_3;
            }
            var20_26 = var13_14.E0();
            if (var20_26) {
                this.fb();
            }
            var3_3 = "page load error";
            var2_2.Pb((String)var3_3);
        }
        var3_3 = var2_2.I;
        var5_6 /* !! */  = var2_2.J;
        hv3_0.t0((ShimmerFrameLayout)var3_3, (View)var5_6 /* !! */ );
        this.Ta();
    }

    public final void kb() {
        Object object;
        int n3 = og1_1.c();
        if (n3 != 0 && (object = this.G) != null && (n3 = object.getVisibility()) == 0) {
            object = this.X;
            Object object2 = "ajiohomeViewModel";
            Object object3 = null;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object = null;
            }
            if ((object = ((x9_0)object).y) != null) {
                int n4;
                object = this.X;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n3 = 0;
                    object = null;
                }
                if ((n3 = ((x9_0)object).x) != (n4 = -1)) {
                    int n7;
                    x9_0 x9_02;
                    object = this.G;
                    if (object != null) {
                        x9_02 = this.X;
                        if (x9_02 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                            n7 = 0;
                            x9_02 = null;
                        }
                        n7 = x9_02.x;
                        object = object.getTabAt(n7);
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    if (object != null && (object = ((TabLayout$Tab)object).getCustomView()) != null) {
                        n7 = R$id.tvTabTitle;
                        object = (TextView)object.findViewById(n7);
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    n7 = 0;
                    x9_02 = null;
                    this.Ub((TextView)object, false);
                    object = this.X;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n3 = 0;
                        object = null;
                    }
                    ((x9_0)object).z = n4;
                    object = this.X;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    } else {
                        object3 = object;
                    }
                    ((x9_0)object3).x = n4;
                    this.yb(n4, false);
                    object = this.G;
                    if (object != null) {
                        object2 = new U8(this);
                        object.post((Runnable)object2);
                    }
                }
            }
        }
    }

    public final void lb(boolean bl2) {
        boolean bl3 = this.y0;
        String string2 = "ajiohomeViewModel";
        x9_0 x9_02 = null;
        if (bl3) {
            if (!bl2) {
                x9_0 x9_03 = this.X;
                if (x9_03 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    x9_03 = null;
                }
                if (bl2 = x9_03.t) {
                    x9_03 = this.X;
                    if (x9_03 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        x9_02 = x9_03;
                    }
                    x9_02.e();
                } else {
                    this.yb(0, false);
                }
            }
        } else {
            bl2 = og1_1.c();
            if (bl2) {
                x9_0 x9_04 = this.X;
                if (x9_04 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    x9_02 = x9_04;
                }
                x9_02.f();
            } else {
                this.yb(0, false);
            }
        }
    }

    public final void loadCartBasedOnSelectedAddress(String object, String object2) {
        boolean bl2;
        boolean bl3;
        object2 = this.I;
        Object object3 = this.J;
        hv3_0.r0((ShimmerFrameLayout)((Object)object2), (View)object3);
        object2 = this.Q1;
        if (object2 != null) {
            ai0_2.i((View)object2);
        }
        this.H2 = bl3 = true;
        object3 = this.w0;
        if (object3 != null) {
            ((BottomSheetDialogFragment)object3).dismissAllowingStateLoss();
        }
        if ((object3 = this.v0) != null) {
            ((BottomSheetDialogFragment)object3).dismissAllowingStateLoss();
        }
        if ((object3 = this.x0) != null) {
            ((BottomSheetDialogFragment)object3).dismissAllowingStateLoss();
        }
        object3 = new CartDeliveryAddress();
        Object object4 = AddressType.Pincode;
        ((CartDeliveryAddress)object3).setAddressType((AddressType)((Object)object4));
        ((CartDeliveryAddress)object3).setPostalCode((String)object);
        object4 = this.S0;
        Object object5 = null;
        String string2 = "appPreferences";
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object4 = null;
        }
        ((jo_2)object4).F((CartDeliveryAddress)object3);
        object4 = this.S0;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object4 = null;
        }
        ((jo_2)object4).G((String)object);
        object = this.S0;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object5 = object;
        }
        ((sw_0)object5).putPreference("SHOULD_PINCODE_REFRESH_HOME_PAGE", bl3);
        this.Lb((CartDeliveryAddress)object3);
        object = this.Y;
        if (object != null && (bl2 = ((gj2_1)object).a) == bl3) {
            object = this.z0;
            if (object != null) {
                object.a();
            }
        } else {
            this.Qa();
        }
    }

    public final void mb() {
        int n3;
        boolean bl2;
        Object object = this.X;
        Object object2 = "ajiohomeViewModel";
        String string2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        object.z = n3 = -1;
        bl2 = true;
        this.Jb(bl2);
        boolean bl3 = og1_1.c();
        if (bl3) {
            boolean bl4 = this.G2;
            if (bl4) {
                this.Tb(bl2);
            } else {
                object2 = this.k;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("homeListener");
                    bl4 = false;
                    object2 = null;
                }
                String string3 = "/switch-stores";
                object2.r1(string3);
                this.wb(bl2);
                this.yb(n3, false);
                object = this.G;
                if (object != null) {
                    ((TabLayout)((Object)object)).selectTab(null);
                }
            }
        } else {
            n3 = (int)(this.G2 ? 1 : 0);
            if (n3 != 0) {
                this.Sb(bl2);
            } else {
                n3 = (int)(hu1_2.e() ? 1 : 0);
                if (n3 != 0 && (n3 = (int)(this.G2 ? 1 : 0)) == 0) {
                    x9_0 x9_02 = this.X;
                    if (x9_02 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n3 = 0;
                        x9_02 = null;
                    }
                    if ((object2 = x9_02.I) != null && (object2 = (NativeCategoryNavigationListDetail)((ArrayList)object2).get(0)) != null) {
                        string2 = ((NativeCategoryNavigationListDetail)object2).getNativeCategoryPageId();
                    }
                    this.J4(string2, 0, bl2, false);
                } else {
                    object = this.R;
                    if (object != null) {
                        ((TabLayout)((Object)object)).selectTab(null);
                    }
                    if ((object = this.R) != null) {
                        object2 = ((TabLayout)((Object)object)).getTabAt(0);
                        ((TabLayout)((Object)object)).selectTab((TabLayout$Tab)object2);
                    }
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void nb() {
        block193: {
            block192: {
                var1_1 = 1;
                var2_2 = 0;
                this.Ob();
                var3_3 /* !! */  = this.p;
                var4_4 = null;
                if (var3_3 /* !! */  != null) {
                    var5_5 = R$id.llpsIvCamera;
                    var6_6 /* !! */  = (AjioImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.s2 = var6_6 /* !! */ ;
                    var5_5 = R$id.fahRefereeWidgetItem;
                    var6_6 /* !! */  = (CardView)var3_3 /* !! */ .findViewById(var5_5);
                    this.q = var6_6 /* !! */ ;
                    var5_5 = R$id.llpsSearchLayout;
                    var6_6 /* !! */  = (LinearLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.r = var6_6 /* !! */ ;
                    var5_5 = R$id.llpsIvSearch;
                    var6_6 /* !! */  = (ImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.s = var6_6 /* !! */ ;
                    var5_5 = R$id.llpsTvSearch;
                    var6_6 /* !! */  = (TextView)var3_3 /* !! */ .findViewById(var5_5);
                    this.t = var6_6 /* !! */ ;
                    var5_5 = R$id.fahIvMenu;
                    var6_6 /* !! */  = (AjioImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.u = var6_6 /* !! */ ;
                    var5_5 = R$id.lltIvLuxeSearch;
                    var6_6 /* !! */  = (ImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.v = var6_6 /* !! */ ;
                    var5_5 = R$id.lltIvLuxeHamburger;
                    var6_6 /* !! */  = (ImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.w = var6_6 /* !! */ ;
                    var5_5 = R$id.lltIvLuxeBack;
                    var6_6 /* !! */  = (ImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.x = var6_6 /* !! */ ;
                    var5_5 = R$id.homeListRV;
                    var6_6 /* !! */  = (RecyclerView)var3_3 /* !! */ .findViewById(var5_5);
                    this.y = var6_6 /* !! */ ;
                    var5_5 = R$id.fahTvStoreName;
                    var6_6 /* !! */  = (TextView)var3_3 /* !! */ .findViewById(var5_5);
                    this.z = var6_6 /* !! */ ;
                    var5_5 = R$id.fahLayoutTopbar;
                    var6_6 /* !! */  = (ConstraintLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.A = var6_6 /* !! */ ;
                    var5_5 = R$id.lltLuxeToolbar;
                    var6_6 /* !! */  = (Toolbar)var3_3 /* !! */ .findViewById(var5_5);
                    var5_5 = R$id.llpsSearchCardView;
                    var6_6 /* !! */  = (CardView)var3_3 /* !! */ .findViewById(var5_5);
                    var5_5 = R$id.address_bar_ui_ajio;
                    var6_6 /* !! */  = (ConstraintLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.C = var6_6 /* !! */ ;
                    var5_5 = R$id.address_bar_ui_luxe;
                    var6_6 /* !! */  = (ConstraintLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.D = var6_6 /* !! */ ;
                    if (var6_6 /* !! */  != null) {
                        var7_7 = R$id.address_bar_ui_divider_bottom;
                        var6_6 /* !! */  = var6_6 /* !! */ .findViewById(var7_7);
                    } else {
                        var5_5 = 0;
                        var6_6 /* !! */  = null;
                    }
                    this.E = var6_6 /* !! */ ;
                    var6_6 /* !! */  = this.D;
                    if (var6_6 /* !! */  != null) {
                        var7_7 = R$id.address_bar_ui_divider_top;
                        var6_6 /* !! */  = var6_6 /* !! */ .findViewById(var7_7);
                    } else {
                        var5_5 = 0;
                        var6_6 /* !! */  = null;
                    }
                    this.F = var6_6 /* !! */ ;
                    var5_5 = R$id.fahLuxeTabContainer;
                    var6_6 /* !! */  = (ConstraintLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.B = var6_6 /* !! */ ;
                    var5_5 = R$id.fahLuxeTabLayout;
                    var6_6 /* !! */  = (TabLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.G = var6_6 /* !! */ ;
                    var5_5 = R$id.fahIvAjioLogo;
                    var6_6 /* !! */  = (AjioImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.H = var6_6 /* !! */ ;
                    var6_6 /* !! */  = od3_2.a;
                    var7_7 = var6_6 /* !! */ .length();
                    if (var7_7 == 0) {
                        var6_6 /* !! */  = od3_2.a();
                    }
                    if ((var5_5 = (int)Intrinsics.areEqual(var6_6 /* !! */ , var8_8 = ld3_2.STORE_AJIO.getStoreId())) != 0) {
                        var6_6 /* !! */  = this.H;
                        if (var6_6 /* !! */  != null) {
                            var7_7 = R$string.ajio_store;
                            var8_8 = hv3_0.K(var7_7);
                            var6_6 /* !! */ .setContentDescription((CharSequence)var8_8);
                        }
                    } else {
                        var5_5 = (int)od3_2.c();
                        if (var5_5 != 0) {
                            var6_6 /* !! */  = this.H;
                            if (var6_6 /* !! */  != null) {
                                var7_7 = R$string.luxe_store;
                                var8_8 = hv3_0.K(var7_7);
                                var6_6 /* !! */ .setContentDescription((CharSequence)var8_8);
                            }
                        } else {
                            var5_5 = (int)od3_2.b();
                            if (var5_5 != 0 && (var6_6 /* !! */  = this.H) != null) {
                                var7_7 = R$string.ajiogram_store;
                                var8_8 = hv3_0.K(var7_7);
                                var6_6 /* !! */ .setContentDescription((CharSequence)var8_8);
                            }
                        }
                    }
                    var5_5 = R$id.shimmerParent;
                    var6_6 /* !! */  = (ShimmerFrameLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.I = var6_6 /* !! */ ;
                    if (var6_6 /* !! */  == null) {
                        var5_5 = R$id.layoutHomeShimmer;
                        var6_6 /* !! */  = (ShimmerFrameLayout)var3_3 /* !! */ .findViewById(var5_5);
                        this.I = var6_6 /* !! */ ;
                    }
                    var5_5 = R$id.homeCmsShimmerParent;
                    var6_6 /* !! */  = (FrameLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.J = var6_6 /* !! */ ;
                    var5_5 = R$id.shimmerParentTabs;
                    var6_6 /* !! */  = (ShimmerFrameLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.p0 = var6_6 /* !! */ ;
                    var5_5 = R$id.tabNavshimmerParent;
                    var6_6 /* !! */  = (FrameLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.q0 = var6_6 /* !! */ ;
                    var5_5 = R$id.fahIvDropdown;
                    var6_6 /* !! */  = (AjioImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.K = var6_6 /* !! */ ;
                    var5_5 = R$id.fahNotiIcon;
                    var6_6 /* !! */  = (AppCompatImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.L = var6_6 /* !! */ ;
                    var5_5 = R$id.fahTvNotification;
                    var6_6 /* !! */  = (TextView)var3_3 /* !! */ .findViewById(var5_5);
                    this.M = var6_6 /* !! */ ;
                    var5_5 = R$id.fahPbLoading;
                    var6_6 /* !! */  = (AjioProgressView)var3_3 /* !! */ .findViewById(var5_5);
                    this.N = var6_6 /* !! */ ;
                    var5_5 = R$id.lltIvLuxeDropdown;
                    var6_6 /* !! */  = (ImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.O = var6_6 /* !! */ ;
                    var5_5 = R$id.lltIvLuxeLogo;
                    var6_6 /* !! */  = (ImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.P = var6_6 /* !! */ ;
                    var5_5 = R$id.fahAppBarLayout;
                    var6_6 /* !! */  = (AppBarLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.Q = var6_6 /* !! */ ;
                    var5_5 = R$id.error_container;
                    var6_6 /* !! */  = var3_3 /* !! */ .findViewById(var5_5);
                    this.Q1 = var6_6 /* !! */ ;
                    var5_5 = R$id.error_content_layout;
                    var6_6 /* !! */  = (ConstraintLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.R1 = var6_6 /* !! */ ;
                    var5_5 = R$id.error_desc;
                    var6_6 /* !! */  = (AjioTextView)var3_3 /* !! */ .findViewById(var5_5);
                    this.S1 = var6_6 /* !! */ ;
                    var5_5 = R$id.error_title;
                    var6_6 /* !! */  = (AjioTextView)var3_3 /* !! */ .findViewById(var5_5);
                    this.T1 = var6_6 /* !! */ ;
                    var5_5 = R$id.refreshButton;
                    var6_6 /* !! */  = (AjioTextView)var3_3 /* !! */ .findViewById(var5_5);
                    this.U1 = var6_6 /* !! */ ;
                    var5_5 = R$id.refreshButtonLuxe;
                    var6_6 /* !! */  = (AjioTextView)var3_3 /* !! */ .findViewById(var5_5);
                    this.V1 = var6_6 /* !! */ ;
                    var5_5 = R$id.top_toolbar_ajio_lyt_revamp;
                    var6_6 /* !! */  = (ConstraintLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.X1 = var6_6 /* !! */ ;
                    var5_5 = R$id.top_toolbar_luxe_lyt_revamp;
                    var6_6 /* !! */  = (ConstraintLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.Y1 = var6_6 /* !! */ ;
                    var5_5 = R$id.search_bar_static_tv_revamp_luxe;
                    var6_6 /* !! */  = (TextView)var3_3 /* !! */ .findViewById(var5_5);
                    this.Z1 = var6_6 /* !! */ ;
                    var5_5 = R$id.search_bar_static_iv_revamp_luxe;
                    var6_6 /* !! */  = (ImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.a2 = var6_6 /* !! */ ;
                    var5_5 = R$id.toolbar_search_img_revamp_luxe;
                    var6_6 /* !! */  = (LottieAnimationView)var3_3 /* !! */ .findViewById(var5_5);
                    this.b2 = var6_6 /* !! */ ;
                    var5_5 = R$id.top_toolbar_static_layout_revamp_luxe;
                    var6_6 /* !! */  = (ConstraintLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.c2 = var6_6 /* !! */ ;
                    var5_5 = R$id.camera_iv_ajio_revamp;
                    var6_6 /* !! */  = (ImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.W1 = var6_6 /* !! */ ;
                    var5_5 = R$id.search_bar_static_tv_revamp_ajio;
                    var6_6 /* !! */  = (TextView)var3_3 /* !! */ .findViewById(var5_5);
                    this.f2 = var6_6 /* !! */ ;
                    var5_5 = R$id.search_bar_static_iv_revamp_ajio;
                    var6_6 /* !! */  = (ImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.g2 = var6_6 /* !! */ ;
                    var5_5 = R$id.toolbar_search_img_revamp_ajio;
                    var6_6 /* !! */  = (LottieAnimationView)var3_3 /* !! */ .findViewById(var5_5);
                    this.e2 = var6_6 /* !! */ ;
                    var5_5 = R$id.top_toolbar_static_layout_revamp_ajio;
                    var6_6 /* !! */  = (ConstraintLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.d2 = var6_6 /* !! */ ;
                    var5_5 = R$id.fahSearchLayout;
                    var6_6 /* !! */  = (CardView)var3_3 /* !! */ .findViewById(var5_5);
                    this.h2 = var6_6 /* !! */ ;
                    var5_5 = R$id.fahTbLuxe;
                    var6_6 /* !! */  = (Toolbar)var3_3 /* !! */ .findViewById(var5_5);
                    this.i2 = var6_6 /* !! */ ;
                    var5_5 = R$id.wishlist_iv_ajio_revamp;
                    var6_6 /* !! */  = (AppCompatImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.j2 = var6_6 /* !! */ ;
                    var5_5 = R$id.menu_cart_layout_ajio_revamp;
                    var6_6 /* !! */  = (LinearLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.m2 = var6_6 /* !! */ ;
                    var5_5 = R$id.menu_notification_layout_ajio_revamp;
                    var6_6 /* !! */  = (ConstraintLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.n2 = var6_6 /* !! */ ;
                    var5_5 = R$id.menu_notification_tv_ajio_revamp;
                    var6_6 /* !! */  = (TextView)var3_3 /* !! */ .findViewById(var5_5);
                    this.o2 = var6_6 /* !! */ ;
                    var5_5 = R$id.menu_cart_count_tv_ajio_revamp;
                    var6_6 /* !! */  = (TextView)var3_3 /* !! */ .findViewById(var5_5);
                    this.q2 = var6_6 /* !! */ ;
                    var5_5 = R$id.wishlist_iv_luxe_revamp;
                    var6_6 /* !! */  = (AppCompatImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.k2 = var6_6 /* !! */ ;
                    var5_5 = R$id.menu_cart_layout_luxe_revamp;
                    var6_6 /* !! */  = (LinearLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.l2 = var6_6 /* !! */ ;
                    var5_5 = R$id.menu_cart_count_tv_luxe_revamp;
                    var6_6 /* !! */  = (TextView)var3_3 /* !! */ .findViewById(var5_5);
                    this.r2 = var6_6 /* !! */ ;
                    var5_5 = R$id.fahRefereeWidget;
                    var6_6 /* !! */  = (CardView)var3_3 /* !! */ .findViewById(var5_5);
                    this.p2 = var6_6 /* !! */ ;
                    var5_5 = R$id.clFloatingView;
                    var6_6 /* !! */  = (ConstraintLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.b1 = var6_6 /* !! */ ;
                    var5_5 = R$id.clFloatingVideoView;
                    var6_6 /* !! */  = (ConstraintLayout)var3_3 /* !! */ .findViewById(var5_5);
                    this.c1 = var6_6 /* !! */ ;
                    var6_6 /* !! */  = this.b1;
                    if (var6_6 /* !! */  != null) {
                        var6_6 /* !! */ .setOnTouchListener(this);
                    }
                    var5_5 = R$id.draggableMiniPlayer;
                    var6_6 /* !! */  = (PlayerView)var3_3 /* !! */ .findViewById(var5_5);
                    this.a1 = var6_6 /* !! */ ;
                    if (var6_6 /* !! */  != null) {
                        var7_7 = R$string.video_player;
                        var8_8 = hv3_0.K(var7_7);
                        var6_6 /* !! */ .setContentDescription((CharSequence)var8_8);
                    }
                    var5_5 = R$id.imgClose;
                    var6_6 /* !! */  = (ImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.d1 = var6_6 /* !! */ ;
                    if (var6_6 /* !! */  != null) {
                        var7_7 = R$string.close_txt;
                        var8_8 = this.getString(var7_7);
                        var6_6 /* !! */ .setContentDescription((CharSequence)var8_8);
                    }
                    var5_5 = R$id.imgFullScreen;
                    var6_6 /* !! */  = (ImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.e1 = var6_6 /* !! */ ;
                    if (var6_6 /* !! */  != null) {
                        var7_7 = R$string.video_full_screen;
                        var8_8 = this.getString(var7_7);
                        var6_6 /* !! */ .setContentDescription((CharSequence)var8_8);
                    }
                    if ((var6_6 /* !! */  = this.e1) != null) {
                        var8_8 = new x8_0(this);
                        var6_6 /* !! */ .setOnClickListener((View.OnClickListener)var8_8);
                    }
                    var5_5 = R$id.imgVolume;
                    var6_6 /* !! */  = (ImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.f1 = var6_6 /* !! */ ;
                    var5_5 = R$id.tvDuration;
                    var6_6 /* !! */  = (TextView)var3_3 /* !! */ .findViewById(var5_5);
                    this.h1 = var6_6 /* !! */ ;
                    var5_5 = R$id.imageGifPlayer;
                    var3_3 /* !! */  = (ImageView)var3_3 /* !! */ .findViewById(var5_5);
                    this.g1 = var3_3 /* !! */ ;
                }
                var3_3 /* !! */  = this.Za();
                var6_6 /* !! */  = h40_0.a;
                var6_6 /* !! */  = h40_0.v0();
                var3_3 /* !! */ .l = var6_6 /* !! */ ;
                this.v2 = false;
                var9_9 = hu1_2.c;
                var6_6 /* !! */  = "navigation_revamp_master_flag";
                var8_8 = "homeListener";
                if (var9_9 != 0) {
                    AJIOApplication.Companion.getClass();
                    var10_10 = AJIOApplication$a.a();
                    var3_3 /* !! */  = new jo_2((Context)var10_10);
                    var3_3 /* !! */ .putPreference((String)var6_6 /* !! */ , (boolean)var1_1);
                    var9_9 = hu1_2.b;
                    if (var9_9 == 0) {
                        var3_3 /* !! */  = this.k;
                        if (var3_3 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                            var9_9 = 0;
                            var3_3 /* !! */  = null;
                        }
                        if ((var9_9 = var3_3 /* !! */ .L1()) == 0 && (var9_9 = hu1_2.f((Boolean)(var3_3 /* !! */  = Boolean.FALSE))) != 0) {
                            this.v2 = var1_1;
                            this.sb(false, (boolean)var1_1);
                        }
                    }
                } else {
                    AJIOApplication.Companion.getClass();
                    var10_10 = AJIOApplication$a.a();
                    var3_3 /* !! */  = new jo_2((Context)var10_10);
                    var3_3 /* !! */ .putPreference((String)var6_6 /* !! */ , false);
                }
                if ((var9_9 = h40_0.i1()) != 0) {
                    var3_3 /* !! */  = this.W1;
                    if (var3_3 /* !! */  != null) {
                        ai0_2.B(var3_3 /* !! */ );
                    }
                    if ((var3_3 /* !! */  = this.s2) != null) {
                        var3_3 /* !! */ .setVisibility(0);
                    }
                } else {
                    var3_3 /* !! */  = this.W1;
                    if (var3_3 /* !! */  != null) {
                        ai0_2.i(var3_3 /* !! */ );
                    }
                }
                if ((var3_3 /* !! */  = this.k) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                    var9_9 = 0;
                    var3_3 /* !! */  = null;
                }
                var9_9 = var3_3 /* !! */ .L1();
                var6_6 /* !! */  = "luxe";
                var11_11 = 8;
                if (var9_9 != 0) {
                    var3_3 /* !! */  = this.p;
                    if (var3_3 /* !! */  != null) {
                        var12_12 = R$id.splash_to_coach_lyt;
                        var3_3 /* !! */  = (ConstraintLayout)var3_3 /* !! */ .findViewById(var12_12);
                    } else {
                        var9_9 = 0;
                        var3_3 /* !! */  = null;
                    }
                    this.D1 = var3_3 /* !! */ ;
                    if (var3_3 /* !! */  != null) {
                        var3_3 /* !! */ .setVisibility(0);
                        var12_12 = R$id.splash_img;
                        var13_13 /* !! */  = (ImageView)var3_3 /* !! */ .findViewById(var12_12);
                        this.F1 = var13_13 /* !! */ ;
                        var12_12 = R$id.splash_layout;
                        var13_13 /* !! */  = (ConstraintLayout)var3_3 /* !! */ .findViewById(var12_12);
                        this.E1 = var13_13 /* !! */ ;
                        var12_12 = R$id.coach_mark_lyt;
                        var13_13 /* !! */  = (ConstraintLayout)var3_3 /* !! */ .findViewById(var12_12);
                        this.G1 = var13_13 /* !! */ ;
                        var12_12 = R$id.coach_mark_view;
                        var13_13 /* !! */  = (LinearLayout)var3_3 /* !! */ .findViewById(var12_12);
                        this.H1 = var13_13 /* !! */ ;
                        var12_12 = R$id.coach_icon;
                        var13_13 /* !! */  = (ImageView)var3_3 /* !! */ .findViewById(var12_12);
                        this.I1 = var13_13 /* !! */ ;
                        var12_12 = R$id.coach_mark_title_txt;
                        var13_13 /* !! */  = (TextView)var3_3 /* !! */ .findViewById(var12_12);
                        this.J1 = var13_13 /* !! */ ;
                        var12_12 = R$id.coach_mark_sub_title_txt;
                        var13_13 /* !! */  = (TextView)var3_3 /* !! */ .findViewById(var12_12);
                        this.K1 = var13_13 /* !! */ ;
                        var12_12 = R$id.coach_mark_down_arrow;
                        var13_13 /* !! */  = var3_3 /* !! */ .findViewById(var12_12);
                        this.L1 = var13_13 /* !! */ ;
                        var12_12 = R$id.progress_txt;
                        var13_13 /* !! */  = (TextView)var3_3 /* !! */ .findViewById(var12_12);
                        this.M1 = var13_13 /* !! */ ;
                        var12_12 = R$id.progress_bar;
                        var13_13 /* !! */  = (CircularProgressIndicator)var3_3 /* !! */ .findViewById(var12_12);
                        this.N1 = var13_13 /* !! */ ;
                        var12_12 = R$id.progress_lyt;
                        var3_3 /* !! */  = (ConstraintLayout)var3_3 /* !! */ .findViewById(var12_12);
                        this.O1 = var3_3 /* !! */ ;
                        if (var3_3 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("progressLyt");
                            var9_9 = 0;
                            var3_3 /* !! */  = null;
                        }
                        var3_3 /* !! */ .setVisibility(var11_11);
                    }
                    if ((var9_9 = h40_0.c()) != 0 && (var9_9 = Intrinsics.areEqual(var3_3 /* !! */  = od3_2.a(), var13_13 /* !! */  = ld3_2.STORE_AJIOGRAM.getStoreId())) != 0 && (var3_3 /* !! */  = this.D1) != null) {
                        ai0_2.i(var3_3 /* !! */ );
                    }
                    var3_3 /* !! */  = od3_2.a();
                    var13_13 /* !! */  = this.E1;
                    if (var13_13 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("splashLayout");
                        var12_12 = 0;
                        var13_13 /* !! */  = null;
                    }
                    var13_13 /* !! */  = var13_13 /* !! */ .getBackground();
                    var14_14 = "getBackground(...)";
                    Intrinsics.checkNotNullExpressionValue(var13_13 /* !! */ , (String)var14_14);
                    var15_15 = var13_13 /* !! */  instanceof ShapeDrawable;
                    if (var15_15 != 0) {
                        var13_13 /* !! */  = ((ShapeDrawable)var13_13 /* !! */ ).getPaint();
                        var16_16 = q9_0.Va((String)var3_3 /* !! */ );
                        var15_15 = Color.parseColor((String)var16_16);
                        var13_13 /* !! */ .setColor(var15_15);
                    } else {
                        var15_15 = var13_13 /* !! */  instanceof GradientDrawable;
                        if (var15_15 != 0) {
                            var13_13 /* !! */  = (GradientDrawable)var13_13 /* !! */ ;
                            var16_16 = q9_0.Va((String)var3_3 /* !! */ );
                            var15_15 = Color.parseColor((String)var16_16);
                            var13_13 /* !! */ .setColor(var15_15);
                        } else {
                            var15_15 = var13_13 /* !! */  instanceof ColorDrawable;
                            if (var15_15 != 0) {
                                var13_13 /* !! */  = (ColorDrawable)var13_13 /* !! */ ;
                                var16_16 = q9_0.Va((String)var3_3 /* !! */ );
                                var15_15 = Color.parseColor((String)var16_16);
                                var13_13 /* !! */ .setColor(var15_15);
                            }
                        }
                    }
                    var13_13 /* !! */  = this.H1;
                    if (var13_13 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("coachMarkView");
                        var12_12 = 0;
                        var13_13 /* !! */  = null;
                    }
                    var13_13 /* !! */  = var13_13 /* !! */ .getBackground();
                    Intrinsics.checkNotNullExpressionValue(var13_13 /* !! */ , (String)var14_14);
                    var17_17 = var13_13 /* !! */  instanceof ShapeDrawable;
                    if (var17_17 != 0) {
                        var13_13 /* !! */  = ((ShapeDrawable)var13_13 /* !! */ ).getPaint();
                        var14_14 = q9_0.Va((String)var3_3 /* !! */ );
                        var17_17 = Color.parseColor((String)var14_14);
                        var13_13 /* !! */ .setColor(var17_17);
                    } else {
                        var17_17 = var13_13 /* !! */  instanceof GradientDrawable;
                        if (var17_17 != 0) {
                            var13_13 /* !! */  = (GradientDrawable)var13_13 /* !! */ ;
                            var14_14 = q9_0.Va((String)var3_3 /* !! */ );
                            var17_17 = Color.parseColor((String)var14_14);
                            var13_13 /* !! */ .setColor(var17_17);
                        } else {
                            var17_17 = var13_13 /* !! */  instanceof ColorDrawable;
                            if (var17_17 != 0) {
                                var13_13 /* !! */  = (ColorDrawable)var13_13 /* !! */ ;
                                var14_14 = q9_0.Va((String)var3_3 /* !! */ );
                                var17_17 = Color.parseColor((String)var14_14);
                                var13_13 /* !! */ .setColor(var17_17);
                            }
                        }
                    }
                    var13_13 /* !! */  = "storeId";
                    Intrinsics.checkNotNullParameter(var3_3 /* !! */ , (String)var13_13 /* !! */ );
                    var17_17 = var3_3 /* !! */ .length();
                    var16_16 = "";
                    var18_18 = "toLowerCase(...)";
                    if (var17_17 != 0) {
                        var14_14 = ld3_2.values();
                        var19_19 = ((ld3_2[])var14_14).length;
                        var21_21 = null;
                        for (var20_20 = 0; var20_20 < var19_19; var20_20 += var1_1) {
                            var22_22 = var14_14[var20_20].getStoreId();
                            var23_23 = (int)Intrinsics.areEqual(var22_22, var3_3 /* !! */ );
                            if (var23_23 == 0) continue;
                            var14_14 = Locale.ROOT;
                            var14_14 = var3_3 /* !! */ .toLowerCase((Locale)var14_14);
                            Intrinsics.checkNotNullExpressionValue(var14_14, var18_18);
                            var14_14 = h40_0.i((String)var14_14);
                            var24_24 = "splash_image_icon";
                            var20_20 = (int)var14_14.has((String)var24_24);
                            if (var20_20 == 0) break;
                            var14_14 = var14_14.getString((String)var24_24);
                            Intrinsics.checkNotNull(var14_14);
                            break;
                        }
                    } else {
                        var14_14 = var16_16;
                    }
                    var19_19 = var14_14.length();
                    var21_21 = "coachIcon";
                    if (var19_19 > 0) {
                        var24_24 = new da$a();
                        var24_24.k = var1_1;
                        var24_24.g = var1_1;
                        var22_22 = this.F1;
                        if (var22_22 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("splashImageView");
                            var23_23 = 0;
                            var22_22 = null;
                        }
                        var24_24.n = var14_14;
                        var24_24.u = var22_22;
                        var24_24.a();
                        var24_24 = new da$a();
                        var24_24.k = var1_1;
                        var24_24.g = var1_1;
                        var22_22 = this.I1;
                        if (var22_22 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var21_21);
                            var23_23 = 0;
                            var22_22 = null;
                        }
                        var24_24.n = var14_14;
                        var24_24.u = var22_22;
                        var24_24.a();
                    }
                    var14_14 = h40_0.a;
                    var14_14 = h40_0.p((String)var3_3 /* !! */ );
                    var24_24 = h40_0.n((String)var3_3 /* !! */ );
                    var23_23 = var14_14.length();
                    if (var23_23 > 0) {
                        var22_22 = this.J1;
                        if (var22_22 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("coackMarkTitleTxt");
                            var23_23 = 0;
                            var22_22 = null;
                        }
                        var22_22.setText((CharSequence)var14_14);
                    }
                    if ((var17_17 = var24_24.length()) > 0) {
                        var14_14 = this.K1;
                        if (var14_14 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("coackMarkSubTitleTxt");
                            var17_17 = 0;
                            var14_14 = null;
                            var25_25 = 0.0f;
                        }
                        var14_14.setText((CharSequence)var24_24);
                    }
                    if ((var14_14 = this.I1) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var21_21);
                        var17_17 = 0;
                        var14_14 = null;
                        var25_25 = 0.0f;
                    }
                    var14_14 = var14_14.getResources();
                    var19_19 = R$dimen.dp19;
                    var25_25 = var14_14.getDimension(var19_19);
                    var24_24 = this.I1;
                    if (var24_24 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var21_21);
                        var19_19 = 0;
                        var24_24 = null;
                        var26_26 = 0.0f;
                    }
                    var24_24 = var24_24.getResources();
                    var23_23 = R$dimen.dp11;
                    var26_26 = var24_24.getDimension(var23_23);
                    var22_22 = Locale.ROOT;
                    var22_22 = var3_3 /* !! */ .toLowerCase((Locale)var22_22);
                    Intrinsics.checkNotNullExpressionValue(var22_22, var18_18);
                    var27_27 = "ajio";
                    var28_28 = Intrinsics.areEqual(var22_22, var27_27);
                    if (var28_28) {
                        var22_22 = this.I1;
                        if (var22_22 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var21_21);
                            var23_23 = 0;
                            var22_22 = null;
                        }
                        var19_19 = (int)var26_26;
                        var17_17 = (int)var25_25;
                        var22_22.setPadding(var19_19, var17_17, var19_19, var17_17);
                    } else {
                        var19_19 = (int)Intrinsics.areEqual(var22_22, var6_6 /* !! */ );
                        if (var19_19 != 0) {
                            var24_24 = this.I1;
                            if (var24_24 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var21_21);
                                var19_19 = 0;
                                var24_24 = null;
                                var26_26 = 0.0f;
                            }
                            var24_24 = var24_24.getResources();
                            var23_23 = R$dimen.dp4;
                            var26_26 = var24_24.getDimension(var23_23);
                            var22_22 = this.I1;
                            if (var22_22 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var21_21);
                                var23_23 = 0;
                                var22_22 = null;
                            }
                            var19_19 = (int)var26_26;
                            var17_17 = (int)var25_25;
                            var22_22.setPadding(var19_19, var17_17, var19_19, var17_17);
                        }
                    }
                    var14_14 = this.i;
                    var24_24 = "tabListener";
                    if (var14_14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var24_24);
                        var17_17 = 0;
                        var14_14 = null;
                        var25_25 = 0.0f;
                    }
                    var14_14.s();
                    var14_14 = this.L1;
                    var21_21 = "coachMarkDownArrow";
                    if (var14_14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var21_21);
                        var17_17 = 0;
                        var14_14 = null;
                        var25_25 = 0.0f;
                    }
                    var14_14 = var14_14.getResources();
                    var23_23 = R$dimen.dp2;
                    var14_14.getDimension(var23_23);
                    var14_14 = this.i;
                    if (var14_14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var24_24);
                        var17_17 = 0;
                        var14_14 = null;
                        var25_25 = 0.0f;
                    }
                    var17_17 = var14_14.C0();
                    var19_19 = 3;
                    var26_26 = 4.2E-45f;
                    var22_22 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
                    if (var17_17 != var19_19) {
                        var19_19 = 4;
                        var26_26 = 5.6E-45f;
                        if (var17_17 == var19_19) {
                            var14_14 = this.L1;
                            if (var14_14 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var21_21);
                                var17_17 = 0;
                                var14_14 = null;
                                var25_25 = 0.0f;
                            }
                            var14_14 = var14_14.getResources();
                            var19_19 = R$dimen.dp43;
                            var25_25 = var14_14.getDimension(var19_19);
                            var24_24 = this.L1;
                            if (var24_24 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var21_21);
                                var19_19 = 0;
                                var24_24 = null;
                                var26_26 = 0.0f;
                            }
                            var24_24 = var24_24.getLayoutParams();
                            Intrinsics.checkNotNull(var24_24, (String)var22_22);
                            var24_24 = (ViewGroup.MarginLayoutParams)var24_24;
                            var17_17 = (int)var25_25;
                            var24_24.setMarginStart(var17_17);
                            var14_14 = this.L1;
                            if (var14_14 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var21_21);
                                var17_17 = 0;
                                var14_14 = null;
                                var25_25 = 0.0f;
                            }
                            var14_14.setLayoutParams((ViewGroup.LayoutParams)var24_24);
                        }
                    } else {
                        var14_14 = this.L1;
                        if (var14_14 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var21_21);
                            var17_17 = 0;
                            var14_14 = null;
                            var25_25 = 0.0f;
                        }
                        var14_14 = var14_14.getResources();
                        var19_19 = R$dimen.dp60;
                        var25_25 = var14_14.getDimension(var19_19);
                        var24_24 = this.L1;
                        if (var24_24 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var21_21);
                            var19_19 = 0;
                            var24_24 = null;
                            var26_26 = 0.0f;
                        }
                        var24_24 = var24_24.getLayoutParams();
                        Intrinsics.checkNotNull(var24_24, (String)var22_22);
                        var24_24 = (ViewGroup.MarginLayoutParams)var24_24;
                        var17_17 = (int)var25_25;
                        var24_24.setMarginStart(var17_17);
                        var14_14 = this.L1;
                        if (var14_14 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var21_21);
                            var17_17 = 0;
                            var14_14 = null;
                            var25_25 = 0.0f;
                        }
                        var14_14.setLayoutParams((ViewGroup.LayoutParams)var24_24);
                    }
                    Intrinsics.checkNotNullParameter(var3_3 /* !! */ , (String)var13_13 /* !! */ );
                    var17_17 = var3_3 /* !! */ .length();
                    if (var17_17 != 0) {
                        var14_14 = ld3_2.values();
                        var19_19 = ((Object)var14_14).length;
                        var21_21 = null;
                        for (var20_20 = 0; var20_20 < var19_19; var20_20 += var1_1) {
                            var22_22 = var14_14[var20_20].getStoreId();
                            var23_23 = (int)Intrinsics.areEqual(var22_22, var3_3 /* !! */ );
                            if (var23_23 == 0) continue;
                            var14_14 = Locale.ROOT;
                            var14_14 = var3_3 /* !! */ .toLowerCase((Locale)var14_14);
                            Intrinsics.checkNotNullExpressionValue(var14_14, var18_18);
                            var14_14 = h40_0.i((String)var14_14);
                            var24_24 = "splash_loader_text";
                            var20_20 = (int)var14_14.has((String)var24_24);
                            if (var20_20 == 0) break;
                            var14_14 = var14_14.getString((String)var24_24);
                            Intrinsics.checkNotNull(var14_14);
                            break;
                        }
                    } else {
                        var14_14 = var16_16;
                    }
                    var24_24 = h40_0.a;
                    Intrinsics.checkNotNullParameter(var3_3 /* !! */ , (String)var13_13 /* !! */ );
                    var12_12 = var3_3 /* !! */ .length();
                    if (var12_12 != 0) {
                        var13_13 /* !! */  = ld3_2.values();
                        var19_19 = var13_13 /* !! */ .length;
                        var21_21 = null;
                        block2: for (var20_20 = 0; var20_20 < var19_19; var20_20 += var1_1) {
                            var22_22 = var13_13 /* !! */ [var20_20].getStoreId();
                            var23_23 = (int)Intrinsics.areEqual(var22_22, var3_3 /* !! */ );
                            if (var23_23 == 0) continue;
                            var13_13 /* !! */  = Locale.ROOT;
                            var3_3 /* !! */  = var3_3 /* !! */ .toLowerCase((Locale)var13_13 /* !! */ );
                            Intrinsics.checkNotNullExpressionValue(var3_3 /* !! */ , var18_18);
                            var3_3 /* !! */  = h40_0.i((String)var3_3 /* !! */ );
                            var13_13 /* !! */  = "splash_loader_text_color";
                            var15_15 = (int)var3_3 /* !! */ .has((String)var13_13 /* !! */ );
                            if (var15_15 != 0) {
                                var3_3 /* !! */  = var3_3 /* !! */ .getString((String)var13_13 /* !! */ );
                                Intrinsics.checkNotNull(var3_3 /* !! */ );
lbl669:
                                // 2 sources

                                while (true) {
                                    var16_16 = var3_3 /* !! */ ;
                                    break block2;
                                    break;
                                }
                            }
                            var3_3 /* !! */  = "#FFFFFF";
                            ** continue;
                        }
                    }
                    var9_9 = var14_14.length();
                    var13_13 /* !! */  = "progressTxt";
                    if (var9_9 > 0) {
                        var3_3 /* !! */  = this.M1;
                        if (var3_3 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var13_13 /* !! */ );
                            var9_9 = 0;
                            var3_3 /* !! */  = null;
                        }
                        var3_3 /* !! */ .setText((CharSequence)var14_14);
                    }
                    if ((var9_9 = var16_16.length()) > 0) {
                        var3_3 /* !! */  = this.M1;
                        if (var3_3 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var13_13 /* !! */ );
                            var9_9 = 0;
                            var3_3 /* !! */  = null;
                        }
                        var12_12 = Color.parseColor((String)var16_16);
                        var3_3 /* !! */ .setTextColor(var12_12);
                        var3_3 /* !! */  = this.N1;
                        if (var3_3 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                            var9_9 = 0;
                            var3_3 /* !! */  = null;
                        }
                        var12_12 = Color.parseColor((String)var16_16);
                        var13_13 /* !! */  = (ld3_2[])new int[]{var12_12};
                        var3_3 /* !! */ .setIndicatorColor((int[])var13_13 /* !! */ );
                    }
                }
                if ((var3_3 /* !! */  = this.u) != null) {
                    ai0_2.i(var3_3 /* !! */ );
                }
                if ((var3_3 /* !! */  = this.A) != null) {
                    ai0_2.i(var3_3 /* !! */ );
                }
                if ((var3_3 /* !! */  = this.h2) != null) {
                    ai0_2.i(var3_3 /* !! */ );
                }
                if ((var3_3 /* !! */  = this.i2) != null) {
                    ai0_2.i(var3_3 /* !! */ );
                }
                if ((var9_9 = kotlin.text.b.i((String)(var3_3 /* !! */  = od3_2.a()), (String)var6_6 /* !! */ , (boolean)var1_1)) != 0) {
                    var3_3 /* !! */  = this.Y1;
                    if (var3_3 /* !! */  != null) {
                        ai0_2.B(var3_3 /* !! */ );
                    }
                    if ((var3_3 /* !! */  = this.X1) != null) {
                        ai0_2.i(var3_3 /* !! */ );
                    }
                } else {
                    var3_3 /* !! */  = this.Y1;
                    if (var3_3 /* !! */  != null) {
                        ai0_2.i(var3_3 /* !! */ );
                    }
                    if ((var3_3 /* !! */  = this.X1) != null) {
                        ai0_2.B(var3_3 /* !! */ );
                    }
                }
                if ((var3_3 /* !! */  = this.Q) != null) {
                    var5_5 = R$color.white;
                    var3_3 /* !! */ .setBackgroundResource(var5_5);
                }
                var3_3 /* !! */  = this.j2;
                var6_6 /* !! */  = this.O2;
                if (var3_3 /* !! */  != null) {
                    var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var6_6 /* !! */ );
                }
                if ((var3_3 /* !! */  = this.k2) != null) {
                    var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var6_6 /* !! */ );
                }
                if ((var3_3 /* !! */  = this.l2) != null) {
                    var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var6_6 /* !! */ );
                }
                if ((var3_3 /* !! */  = this.m2) != null) {
                    var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var6_6 /* !! */ );
                }
                if ((var3_3 /* !! */  = this.S0) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appPreferences");
                    var9_9 = 0;
                    var3_3 /* !! */  = null;
                }
                if ((var9_9 = var3_3 /* !! */ .d()) == 0) {
                    var3_3 /* !! */  = this.q2;
                    if (var3_3 /* !! */  != null) {
                        ai0_2.i(var3_3 /* !! */ );
                    }
                    if ((var3_3 /* !! */  = this.r2) != null) {
                        ai0_2.i(var3_3 /* !! */ );
                    }
                    var3_3 /* !! */  = z40_0.Companion;
                    var3_3 /* !! */  = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var3_3 /* !! */ ).a;
                    var13_13 /* !! */  = "enable_highlight_empty_cart";
                    var9_9 = (int)var3_3 /* !! */ .a((String)var13_13 /* !! */ );
                    if (var9_9 != 0) {
                        var3_3 /* !! */  = this.q2;
                        if (var3_3 /* !! */  != null) {
                            ai0_2.B(var3_3 /* !! */ );
                        }
                        if ((var3_3 /* !! */  = this.r2) != null) {
                            ai0_2.B(var3_3 /* !! */ );
                        }
                    } else {
                        var3_3 /* !! */  = this.q2;
                        if (var3_3 /* !! */  != null) {
                            ai0_2.i(var3_3 /* !! */ );
                        }
                        if ((var3_3 /* !! */  = this.r2) != null) {
                            ai0_2.i(var3_3 /* !! */ );
                        }
                    }
                } else {
                    var13_13 /* !! */  = this.q2;
                    if (var13_13 /* !! */  != null) {
                        ai0_2.B((View)var13_13 /* !! */ );
                    }
                    if ((var13_13 /* !! */  = this.r2) != null) {
                        ai0_2.B((View)var13_13 /* !! */ );
                    }
                    if (var9_9 > (var12_12 = 9)) {
                        var3_3 /* !! */  = this.q2;
                        var13_13 /* !! */  = "9<sup>+</sup>";
                        if (var3_3 /* !! */  != null) {
                            var14_14 = hv3_0.f((String)var13_13 /* !! */ );
                            var3_3 /* !! */ .setText((CharSequence)var14_14);
                        }
                        if ((var3_3 /* !! */  = this.r2) != null) {
                            var13_13 /* !! */  = hv3_0.f((String)var13_13 /* !! */ );
                            var3_3 /* !! */ .setText((CharSequence)var13_13 /* !! */ );
                        }
                    } else {
                        var13_13 /* !! */  = this.q2;
                        if (var13_13 /* !! */  != null) {
                            var14_14 = String.valueOf(var9_9);
                            var13_13 /* !! */ .setText((CharSequence)var14_14);
                        }
                        if ((var13_13 /* !! */  = this.r2) != null) {
                            var3_3 /* !! */  = String.valueOf(var9_9);
                            var13_13 /* !! */ .setText((CharSequence)var3_3 /* !! */ );
                        }
                    }
                }
                var9_9 = (int)og1_1.c();
                var13_13 /* !! */  = "ajiohomeViewModel";
                if (var9_9 != 0) {
                    var3_3 /* !! */  = this.X;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var13_13 /* !! */ );
                        var9_9 = 0;
                        var3_3 /* !! */  = null;
                    }
                    var3_3 /* !! */ .getClass();
                    var3_3 /* !! */  = this.A;
                    if (var3_3 /* !! */  != null) {
                        ai0_2.i(var3_3 /* !! */ );
                    }
                    if ((var3_3 /* !! */  = this.i2) != null) {
                        ai0_2.B(var3_3 /* !! */ );
                    }
                    if ((var3_3 /* !! */  = this.h2) != null) {
                        ai0_2.i(var3_3 /* !! */ );
                    }
                    this.Tb(false);
                } else {
                    var3_3 /* !! */  = od3_2.a;
                    var17_17 = var3_3 /* !! */ .length();
                    if (var17_17 == 0) {
                        var3_3 /* !! */  = od3_2.a();
                    }
                    if ((var17_17 = (int)s20.a) == 0 && (var17_17 = (int)Intrinsics.areEqual(var14_14 = od3_2.a(), var18_18 = (var16_16 = ld3_2.STORE_AJIOGRAM).getStoreId())) == 0 && (var9_9 = (int)Intrinsics.areEqual(var3_3 /* !! */ , var14_14 = var16_16.getStoreId())) == 0) {
                        this.Sb(false);
                    } else {
                        var3_3 /* !! */  = this.getActivity();
                        var17_17 = var3_3 /* !! */  instanceof AjioHomeActivity;
                        if (var17_17 != 0) {
                            var3_3 /* !! */  = (AjioHomeActivity)var3_3 /* !! */ ;
                        } else {
                            var9_9 = 0;
                            var3_3 /* !! */  = null;
                        }
                        if (var3_3 /* !! */  != null) {
                            var3_3 /* !! */ .p3();
                        }
                    }
                }
                var3_3 /* !! */  = z40_0.Companion;
                var3_3 /* !! */  = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var3_3 /* !! */ ).a;
                var14_14 = "enable_locale";
                var9_9 = (int)var3_3 /* !! */ .a((String)var14_14);
                if (var9_9 != 0) {
                    var3_3 /* !! */  = this.gb();
                    var17_17 = 101;
                    var25_25 = 1.42E-43f;
                    var3_3 /* !! */ .c = var17_17;
                    var3_3 /* !! */ .d = var17_17;
                    var3_3 /* !! */  = yn3_0.a;
                    var14_14 = new Object[]{};
                    var16_16 = "locale state reset";
                    var3_3 /* !! */ .a((String)var16_16, (Object[])var14_14);
                }
                var3_3 /* !! */  = h40_0.a;
                var9_9 = (int)h40_0.k1();
                if (var9_9 == 0) {
                    var9_9 = (int)hu1_2.c;
                    if (var9_9 != 0 && (var9_9 = (int)(var3_3 /* !! */  = z40$a.a((Context)AJIOApplication$a.a()).a).a((String)(var14_14 = "mandatory_on_start_permissions"))) != 0) {
                        this.pb();
                    }
                    hu1_2.c = false;
                }
                var3_3 /* !! */  = new l8_0(this, 0);
                var14_14 = this.O0;
                var14_14.a((Function1)var3_3 /* !! */ );
                var3_3 /* !! */  = this.k;
                if (var3_3 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                    var9_9 = 0;
                    var3_3 /* !! */  = null;
                }
                if ((var3_3 /* !! */  = var3_3 /* !! */ .b0()) != null) {
                    var3_3 /* !! */  = this.k;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                        var9_9 = 0;
                        var3_3 /* !! */  = null;
                    }
                    if ((var3_3 /* !! */  = var3_3 /* !! */ .b0()) != null) {
                        var3_3 /* !! */ .setDrawerLockMode(var1_1);
                    }
                }
                this.Qb();
                var3_3 /* !! */  = this.getArguments();
                if (var3_3 /* !! */  != null) {
                    var14_14 = this.X;
                    if (var14_14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var13_13 /* !! */ );
                        var17_17 = 0;
                        var14_14 = null;
                        var25_25 = 0.0f;
                    }
                    var16_16 = this.getArguments();
                    var14_14.j((Bundle)var16_16);
                    var3_3 /* !! */ .clear();
                }
                if ((var9_9 = (int)h40_0.c()) == 0 || (var9_9 = (int)Intrinsics.areEqual(var3_3 /* !! */  = od3_2.a(), var14_14 = ld3_2.STORE_AJIOGRAM.getStoreId())) == 0) ** GOTO lbl-1000
                AjioHomeActivity.Companion.getClass();
                var3_3 /* !! */  = AjioHomeActivity.D1;
                if (var3_3 /* !! */  != null && (var9_9 = var3_3 /* !! */ .isEmpty() ^ var1_1) == var1_1) {
                    this.ib();
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = 0;
                    var29_29 = null;
                }
                var3_3 /* !! */  = this.q;
                if (var3_3 /* !! */  != null) {
                    var3_3 /* !! */ .setVisibility(var11_11);
                }
                if ((var3_3 /* !! */  = this.r) != null) {
                    var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var6_6 /* !! */ );
                }
                if ((var3_3 /* !! */  = this.s) != null) {
                    var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var6_6 /* !! */ );
                }
                if ((var3_3 /* !! */  = this.t) != null) {
                    var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var6_6 /* !! */ );
                }
                if ((var3_3 /* !! */  = this.s2) != null) {
                    var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var6_6 /* !! */ );
                }
                if ((var3_3 /* !! */  = this.u) != null) {
                    var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var6_6 /* !! */ );
                }
                if ((var3_3 /* !! */  = this.v) != null) {
                    var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var6_6 /* !! */ );
                }
                if ((var3_3 /* !! */  = this.w) != null) {
                    var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var6_6 /* !! */ );
                }
                if ((var3_3 /* !! */  = this.x) != null) {
                    var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var6_6 /* !! */ );
                }
                var3_3 /* !! */  = od3_2.a();
                this.Nb((String)var3_3 /* !! */ );
                var3_3 /* !! */  = this.X;
                if (var3_3 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var13_13 /* !! */ );
                    var9_9 = 0;
                    var3_3 /* !! */  = null;
                }
                if ((var9_9 = (int)TextUtils.isEmpty((CharSequence)(var3_3 /* !! */  = var3_3 /* !! */ .r))) != 0) break block192;
                var3_3 /* !! */  = this.X;
                if (var3_3 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var13_13 /* !! */ );
                    var9_9 = 0;
                    var3_3 /* !! */  = null;
                }
                if ((var9_9 = (int)(var3_3 /* !! */  = var3_3 /* !! */ .A).isEmpty()) == 0) break block193;
            }
            this.Bb(0);
        }
        this.eb((boolean)var1_1);
        var3_3 /* !! */  = this.k;
        if (var3_3 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
            var9_9 = 0;
            var3_3 /* !! */  = null;
        }
        if ((var3_3 /* !! */  = var3_3 /* !! */ .b0()) != null) {
            var6_6 /* !! */  = new q9$c(this);
            var3_3 /* !! */ .addDrawerListener((DrawerLayout$e)var6_6 /* !! */ );
        }
        if ((var3_3 /* !! */  = this.p) != null) {
            var5_5 = R$id.updateBottomWidget;
            var3_3 /* !! */  = (InAppBottomUpdatesView)var3_3 /* !! */ .findViewById(var5_5);
        } else {
            var9_9 = 0;
            var3_3 /* !! */  = null;
        }
        this.w1 = var3_3 /* !! */ ;
        var3_3 /* !! */  = this.V1;
        if (var3_3 /* !! */  != null) {
            var6_6 /* !! */  = new w8_0(this);
            var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var6_6 /* !! */ );
        }
        var3_3 /* !! */  = this.p0;
        var6_6 /* !! */  = this.q0;
        hv3_0.t0((ShimmerFrameLayout)var3_3 /* !! */ , (View)var6_6 /* !! */ );
        var3_3 /* !! */  = this.s0;
        if (var3_3 /* !! */  != null) {
            ai0_2.i(var3_3 /* !! */ );
        }
        if ((var3_3 /* !! */  = this.U1) != null) {
            var6_6 /* !! */  = new H8(this, 0);
            var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var6_6 /* !! */ );
        }
        var9_9 = (int)this.y0;
        var30_30 = 500L;
        if (var9_9 == 0) ** GOTO lbl-1000
        var3_3 /* !! */  = this.X;
        if (var3_3 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var13_13 /* !! */ );
            var9_9 = 0;
            var3_3 /* !! */  = null;
        }
        if ((var9_9 = (int)var3_3 /* !! */ .t) != 0) {
            if (var1_1 == 0) {
                this.Mb();
                var1_1 = (int)this.U;
                if (var1_1 == 0) {
                    var1_1 = (int)hu1_2.d();
                    if (var1_1 != 0) {
                        var29_29 = this.p0;
                        var3_3 /* !! */  = this.q0;
                        hv3_0.r0((ShimmerFrameLayout)var29_29, var3_3 /* !! */ );
                    } else {
                        var29_29 = this.X;
                        if (var29_29 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var13_13 /* !! */ );
                            var1_1 = 0;
                            var29_29 = null;
                        }
                        var29_29.b();
                    }
                }
                this.U = false;
                var29_29 = od3_2.a;
                var9_9 = var29_29.length();
                if (var9_9 == 0) {
                    var29_29 = od3_2.a();
                }
                if ((var1_1 = (int)Intrinsics.areEqual(var29_29, var3_3 /* !! */  = ld3_2.STORE_LUXE.getStoreId())) == 0) {
                    var29_29 = this.Q;
                    if (var29_29 != null) {
                        var9_9 = R$string.acc_page_header_ajio_home;
                        var3_3 /* !! */  = hv3_0.K(var9_9);
                        var29_29.setContentDescription((CharSequence)var3_3 /* !! */ );
                    }
                    var3_3 /* !! */  = Looper.getMainLooper();
                    var29_29 = new Handler((Looper)var3_3 /* !! */ );
                    var3_3 /* !! */  = new S8(this);
                    var29_29.postDelayed((Runnable)var3_3 /* !! */ , var30_30);
                }
            }
        } else lbl-1000:
        // 2 sources

        {
            if ((var9_9 = (var29_29 = od3_2.a).length()) == 0) {
                var29_29 = od3_2.a();
            }
            if ((var1_1 = (int)Intrinsics.areEqual(var29_29, var3_3 /* !! */  = ld3_2.STORE_LUXE.getStoreId())) == 0) {
                var1_1 = (int)hu1_2.d();
                if (var1_1 != 0) {
                    var29_29 = this.p0;
                    var3_3 /* !! */  = this.q0;
                    hv3_0.t0((ShimmerFrameLayout)var29_29, var3_3 /* !! */ );
                    var29_29 = this.s0;
                    if (var29_29 != null) {
                        ai0_2.i((View)var29_29);
                    }
                }
                if ((var29_29 = this.Q) != null) {
                    var9_9 = R$string.acc_page_header_banner_landing_page;
                    var3_3 /* !! */  = hv3_0.K(var9_9);
                    var29_29.setContentDescription((CharSequence)var3_3 /* !! */ );
                }
                var3_3 /* !! */  = Looper.getMainLooper();
                var29_29 = new Handler((Looper)var3_3 /* !! */ );
                var3_3 /* !! */  = new d9_0(this, 0);
                var29_29.postDelayed((Runnable)var3_3 /* !! */ , var30_30);
            }
        }
        if ((var29_29 = this.p) != null) {
            var9_9 = R$id.homeCmsShimmerParent;
            var29_29 = var29_29.findViewById(var9_9);
        } else {
            var1_1 = 0;
            var29_29 = null;
        }
        this.x1 = var29_29;
        var29_29 = this.p;
        if (var29_29 != null) {
            var9_9 = R$id.fahAppBarLayout;
            var29_29 = var29_29.findViewById(var9_9);
        } else {
            var1_1 = 0;
            var29_29 = null;
        }
        this.y1 = var29_29;
        this.Kb();
        var29_29 = this.d1;
        if (var29_29 != null) {
            var3_3 /* !! */  = new m9(this, 0);
            var29_29.setOnClickListener((View.OnClickListener)var3_3 /* !! */ );
        }
        if ((var29_29 = this.f1) != null) {
            var3_3 /* !! */  = new n9(this, 0);
            var29_29.setOnClickListener((View.OnClickListener)var3_3 /* !! */ );
        }
        if ((var29_29 = this.p) != null) {
            var2_2 = R$id.rvTopCollapsing;
            var4_4 = var29_29 = var29_29.findViewById(var2_2);
            var4_4 = (RecyclerView)var29_29;
        }
        this.s0 = var4_4;
    }

    public final void ob() {
        Object object;
        Object object2;
        int n3;
        int n4;
        int n7;
        q9_0 q9_02 = this;
        Object object3 = this.S0;
        Object object4 = "appPreferences";
        int n8 = 0;
        Object object5 = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n7 = 0;
            object3 = null;
        }
        int n10 = 0;
        Object object6 = null;
        ((jo_2)object3).D(false);
        object3 = q9_02.I;
        Object object7 = q9_02.J;
        hv3_0.r0((ShimmerFrameLayout)((Object)object3), (View)object7);
        object3 = q9_02.X;
        object7 = "ajiohomeViewModel";
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object7);
            n7 = 0;
            object3 = null;
        }
        ((x9_0)object3).u = n4 = 1;
        object3 = q9_02.Q1;
        if (object3 != null) {
            n3 = 8;
            object3.setVisibility(n3);
        }
        if ((n3 = (int)(((UrlHelper$Companion)(object3 = UrlHelper.Companion)).getISPREVIEW() ? 1 : 0)) != 0) {
            object2 = ch_2.l;
            object = ld3_2.STORE_LUXE.getStoreId();
            n3 = (int)(Intrinsics.areEqual(object2, object) ? 1 : 0);
            if (n3 != 0) {
                q9_02.Tb(false);
            } else {
                q9_02.Sb(false);
            }
        }
        if ((object2 = q9_02.X) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object7);
            n3 = 0;
            object2 = null;
        }
        if ((n3 = ((String)(object2 = ((x9_0)object2).r)).length()) > 0) {
            int n14;
            object = q9_02.X;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                object = null;
            }
            Object object8 = ((x9_0)object).r;
            object = q9_02.S0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                object = null;
            }
            Object object9 = ((jo_2)object).f();
            object = h40_0.a;
            boolean bl2 = h40_0.B0();
            boolean bl3 = h40_0.Z0();
            HashMap<Object, Object> hashMap = null;
            Object object10 = null;
            int n15 = 0;
            String string2 = null;
            Object object11 = null;
            int n16 = 0;
            String string3 = null;
            Object object12 = null;
            String string4 = null;
            String string5 = null;
            String string6 = null;
            boolean bl4 = false;
            int n17 = 0xCFFFFA;
            object = object2;
            object2 = new HomeReq((String)object8, null, (String)object9, null, null, null, null, null, null, null, false, false, false, null, false, false, null, false, false, false, bl2, bl3, false, null, n17, null);
            object = z40_0.Companion;
            object8 = AJIOApplication.Companion;
            Object object13 = Q.a((AJIOApplication$a)object8, (z40$a)object).a;
            object9 = "enable_locale";
            boolean bl5 = ((ao0_0)object13).a((String)object9);
            if (bl5) {
                object13 = q9_02.S0;
                if (object13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    bl5 = false;
                    object13 = null;
                }
                if ((object13 = ((jo_2)object13).i()) != null) {
                    object9 = ((LocationData)object13).getCity();
                    ((HomeReq)object2).setCity((String)object9);
                    object9 = ((LocationData)object13).getState();
                    ((HomeReq)object2).setState((String)object9);
                    object9 = ((LocationData)object13).getZone();
                    ((HomeReq)object2).setZone((String)object9);
                    object13 = ((LocationData)object13).getPincode();
                    ((HomeReq)object2).setPincode((String)object13);
                }
            }
            ((HomeReq)object2).setSTLEnabled(n4 != 0);
            ((HomeReq)object2).setRecentlyViewedEnabled(n4 != 0);
            object13 = UserInformation.getInstance((Context)AJIOApplication$a.a());
            bl5 = ((UserInformation)object13).isUserOnline();
            object13 = bl5 ? "LOGGED_IN" : "NON_LOGGED_IN";
            ((HomeReq)object2).setLoggedIn((String)object13);
            hashMap = new HashMap<Object, Object>();
            object13 = q9_02.X;
            if (object13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                bl5 = false;
                object13 = null;
            }
            if ((bl5 = ((String)(object13 = ((x9_0)object13).r)).length()) > false) {
                bl5 = true;
            } else {
                bl5 = false;
                object13 = null;
            }
            object9 = od3_2.a();
            object10 = CustomerStoreType.a;
            object10 = ScreenType.SCREEN_HOME;
            object9 = CustomerStoreType.a((String)object9, (ScreenType)((Object)object10));
            object10 = "userGroup";
            if (object9 != null && (n15 = ((String)object9).length()) != 0) {
                hashMap.put(object10, object9);
            }
            string2 = "";
            object11 = object9 == null ? string2 : object9;
            q9_02.t2 = object11;
            object11 = w61_0.a();
            n16 = ((String)object11).length();
            if (n16 > 0) {
                object6 = "experiments";
                hashMap.put(object6, object11);
            }
            object6 = od3_2.a();
            object11 = Locale.ROOT;
            object6 = ((String)object6).toUpperCase((Locale)object11);
            Intrinsics.checkNotNullExpressionValue(object6, "toUpperCase(...)");
            ((HomeReq)object2).setStore((String)object6);
            ((HomeReq)object2).setVideoEnableOnCMS(n4 != 0);
            ((HomeReq)object2).setVideoEnableOnSTL(n4 != 0);
            ((HomeReq)object2).setProductWidgetEnabled(n4 != 0);
            ((HomeReq)object2).setProductWidgetEnabled(n4 != 0);
            object6 = eb_2.f();
            object11 = Boolean.TRUE;
            n10 = Intrinsics.areEqual(object6, object11);
            ((HomeReq)object2).setVideoEnableOnCMS(n10 != 0);
            n10 = Intrinsics.areEqual(eb_2.g(), object11);
            ((HomeReq)object2).setVideoEnableOnSTL(n10 != 0);
            object8.getClass();
            object6 = AJIOApplication$a.a();
            object.getClass();
            object6 = z40$a.a((Context)object6).a;
            object = "apiVersion";
            object6 = ((ao0_0)object6).b((String)object);
            ((HomeReq)object2).setApiVersion((String)object6);
            object6 = q9_02.S0;
            if (object6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n10 = 0;
                object6 = null;
            }
            if ((object6 = ((jo_2)object6).m()) == null) {
                object6 = string2;
            }
            ((HomeReq)object2).setPincode((String)object6);
            n10 = h40_0.Q1();
            if (n10 != 0) {
                object6 = q9_02.S0;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n10 = 0;
                    object6 = null;
                }
                if ((object6 = ((sw_0)object6).getPreference((String)(object = "pc_grp"), string2)) != null && (n10 = ((String)object6).length()) != 0) {
                    object6 = q9_02.S0;
                    if (object6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        n10 = 0;
                        object6 = null;
                    }
                    object4 = ((sw_0)object6).getPreference((String)object, string2);
                    ((HomeReq)object2).setPcGroup((String)object4);
                } else {
                    ((HomeReq)object2).setPcGroup(null);
                }
            }
            if ((n14 = ((UrlHelper$Companion)object3).getISPREVIEW()) != 0) {
                object3 = ch_2.a();
                if (object3 != null && (n14 = ((String)object3).length()) != 0) {
                    ((HomeReq)object2).setTimeStamp((String)object3);
                }
                object3 = this.getParentFragment();
                object4 = ch_2.l;
                ((HomeReq)object2).setStore((String)object4);
                object4 = ((HomeReq)object2).getStore();
                object6 = "AJIO";
                n14 = (int)(kotlin.text.b.i((String)object4, (String)object6, n4 != 0) ? 1 : 0);
                if (n14 == 0 && (n14 = (int)(kotlin.text.b.i((String)(object4 = ((HomeReq)object2).getStore()), (String)(object6 = "LUXE"), n4 != 0) ? 1 : 0)) == 0) {
                    object3 = new Bundle();
                    object4 = ch_2.l;
                    object3.putString("STORE_ID", (String)object4);
                    object4 = ed3_2.Companion;
                    object5 = ((HomeReq)object2).getStore();
                    Intrinsics.checkNotNull(object5);
                    object4.getClass();
                    object3 = ed3$a.a((Bundle)object3, (String)object5);
                    object4 = this.requireActivity();
                    Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity");
                    ((AjioHomeActivity)object4).L2((Fragment)object3, string2, false);
                    return;
                }
                if (object3 != null && (n14 = object3 instanceof tm2_2) != 0) {
                    object3 = ((tm2_2)object3).getChildFragmentManager();
                    n7 = ((FragmentManager)object3).J();
                } else {
                    n7 = 1;
                }
                n14 = ch_2.f;
                if (n7 == n4) {
                    n7 = -1;
                    if (n14 != n7) {
                        object3 = n14;
                        ((HomeReq)object2).setPageID((Integer)object3);
                        ((HomeReq)object2).setPageUrl(null);
                    } else {
                        object3 = ch_2.g;
                        if (object3 != null && (n7 = ((String)object3).length()) > 0) {
                            object3 = ch_2.g;
                            ((HomeReq)object2).setPageUrl((String)object3);
                        }
                    }
                    object3 = ch_2.i;
                    ((HomeReq)object2).setLoggedIn((String)object3);
                    object3 = ch_2.h;
                    ((HomeReq)object2).setUserType((String)object3);
                    object3 = Platform.INSTANCE;
                    object4 = ch_2.k;
                    ((Platform)object3).setClientVersion((String)object4);
                    object3 = ch_2.j;
                    if (object3 != null && (n7 = ((String)object3).length()) != 0) {
                        object3 = ch_2.j;
                        Intrinsics.checkNotNull(object3);
                        hashMap.put(object10, object3);
                    }
                    if ((object3 = ch_2.m) != null && (n7 = ((String)object3).length()) != 0) {
                        object3 = ch_2.m;
                        Intrinsics.checkNotNull(object3);
                        object4 = "userSubGroup";
                        hashMap.put(object4, object3);
                    }
                }
                n7 = CMSConfigInitializer.getPreviewAdBufferTime();
                n14 = rj_0.a();
                if (n14 <= n7) {
                    n10 = 1;
                } else {
                    n10 = 0;
                    object6 = null;
                }
                ch_2.n = n10;
                object3 = CMSConfigInitializer.getPreviewUrlForHome();
            } else {
                object3 = ((UrlHelper$Companion)object3).getInstance();
                n14 = 0;
                object4 = new Object[]{};
                object6 = "homepage";
                String string7 = "home_cms";
                object3 = ((UrlHelper)object3).getApiUrl((String)object6, string7, (Object[])object4);
            }
            object10 = new HashMap();
            cp_1.Companion.getClass();
            object4 = cp$a.e();
            object6 = ((HomeReq)object2).getStore();
            object4.getClass();
            object4 = cp_1.a((String)object6, (String)object3, bl5);
            if (object4 != null && (n10 = ((String)object4).length()) != 0) {
                object6 = "Cookie";
                ((HashMap)object10).put(object6, object4);
            }
            object4 = "userCohortValues";
            ((HashMap)object10).put(object4, object9);
            n14 = (int)(xv_0.g() ? 1 : 0);
            if ((n14 != 0 || (n14 = (int)(h40_0.Z0() ? 1 : 0)) != 0) && (n14 = (int)(Intrinsics.areEqual(object4 = od3_2.a(), object6 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0)) == 0) {
                object11 = object4 = q9_02.C0.getValue();
                object11 = (BannerAdViewModel)object4;
                object4 = h40_0.I();
                n14 = (int)(object4.has((String)(object6 = "adSpotId")) ? 1 : 0);
                if (n14 != 0) {
                    object4 = h40_0.I().getString((String)object6);
                    Intrinsics.checkNotNull(object4);
                    string3 = object4;
                } else {
                    string3 = string2;
                }
                object4 = ((HomeReq)object2).getPageUrl();
                object12 = object4 == null ? string2 : object4;
                string4 = ((HomeReq)object2).getStore();
                string5 = ((HomeReq)object2).getLoggedIn();
                string6 = ((HomeReq)object2).getUserType();
                object4 = q9_02.X;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    n14 = 0;
                    object4 = null;
                }
                object4.getClass();
                object6 = x9_0.h();
                object4 = ((x9_0)object4).r;
                bl4 = Intrinsics.areEqual(object6, object4);
                ((BannerAdViewModel)object11).callBannerAdsHomeApi(string3, (String)object12, string4, string5, string6, bl4);
            } else {
                q9_02.D0 = object4 = Boolean.FALSE;
            }
            object4 = q9_02.I;
            object6 = q9_02.J;
            hv3_0.r0((ShimmerFrameLayout)((Object)object4), (View)object6);
            object4 = q9_02.X;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                object = null;
            } else {
                object = object4;
            }
            n14 = hv3_0.F();
            object5 = hv3_0.a;
            object5.getClass();
            n8 = hv3_0.E();
            object8 = new ScreenInfo(n14, n8);
            object13 = object3;
            object9 = object2;
            ((x9_0)object).fetchHomeData((ScreenInfo)object8, (String)object3, (HomeReq)object2, hashMap, (Map)object10);
        }
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        block34: {
            block31: {
                int n7;
                boolean bl2;
                block28: {
                    block33: {
                        Object object;
                        block29: {
                            block32: {
                                Object object2;
                                boolean bl3;
                                int n8;
                                block30: {
                                    n8 = 5;
                                    bl2 = true;
                                    n7 = -1;
                                    if (n3 == n8) break block28;
                                    n8 = 10;
                                    object = null;
                                    if (n3 == n8) break block29;
                                    n8 = 15;
                                    if (n3 == n8) break block30;
                                    n8 = 46;
                                    if (n3 != n8) {
                                        n8 = 102;
                                        if (n3 != n8) {
                                            n8 = 1770;
                                            if (n3 != n8) {
                                                n8 = 1773;
                                                if (n3 == n8) {
                                                    String string2 = "settings dislog inside ok resultcode ";
                                                    if (n4 == n7) {
                                                        yn3$a yn3$a = yn3_0.a;
                                                        string2 = hj0_0.a(n4, string2);
                                                        Object[] objectArray = new Object[]{};
                                                        yn3$a.a(string2, objectArray);
                                                    } else {
                                                        hv3_0.a.getClass();
                                                        hv3_0.R("android.permission.POST_NOTIFICATIONS");
                                                        yn3$a yn3$a = yn3_0.a;
                                                        string2 = hj0_0.a(n4, string2);
                                                        Object[] objectArray = new Object[]{};
                                                        yn3$a.a(string2, objectArray);
                                                    }
                                                }
                                            } else {
                                                this.Cb();
                                            }
                                        } else if (n4 == n7) {
                                            this.Eb();
                                        }
                                    } else {
                                        this.nb();
                                    }
                                    break block31;
                                }
                                if (intent == null || n4 != n7) break block32;
                                Object object3 = intent.getExtras();
                                String string3 = "ajiohomeViewModel";
                                if (object3 != null && !(bl3 = TextUtils.isEmpty((CharSequence)(object3 = object3.getString((String)(object2 = "CORE_CATEGORY_ID")))))) {
                                    object2 = this.X;
                                    if (object2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                                        bl3 = false;
                                        object2 = null;
                                    }
                                    if ((n8 = (int)(kotlin.text.b.i((String)object3, (String)(object2 = ((x9_0)object2).r), bl2) ? 1 : 0)) != 0) {
                                        return;
                                    }
                                }
                                if ((object3 = intent.getExtras()) != null) {
                                    object2 = "CORE_CATEGORY_SCREEN_TYPE";
                                    object3 = object3.getString((String)object2);
                                } else {
                                    n8 = 0;
                                    object3 = null;
                                }
                                bl3 = TextUtils.isEmpty((CharSequence)object3);
                                if (!bl3 && (n8 = (int)(kotlin.text.b.i((String)object3, (String)(object2 = "landingpage"), bl2) ? 1 : 0)) == 0) {
                                    object3 = this.h;
                                    if (object3 == null) {
                                        object3 = "activityFragmentListener";
                                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                                    } else {
                                        object = object3;
                                    }
                                    object3 = "category_detail_link";
                                    Bundle bundle = intent.getExtras();
                                    object.onFragmentInteraction((String)object3, 0, bundle);
                                } else {
                                    object3 = intent.getExtras();
                                    x9_0 x9_02 = this.X;
                                    if (x9_02 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                                    } else {
                                        object = x9_02;
                                    }
                                    ((x9_0)object).j((Bundle)object3);
                                    this.getOrders();
                                }
                                break block31;
                            }
                            return;
                        }
                        if (intent == null || n4 != n7) break block33;
                        this.getOrders();
                        Object object4 = this.k;
                        if (object4 == null) {
                            object4 = "homeListener";
                            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        } else {
                            object = object4;
                        }
                        object.i1(intent);
                        break block31;
                    }
                    return;
                }
                if (intent == null || n4 != n7) break block34;
                Object object = intent.getData();
                if (object != null) {
                    object = kj0_1.g();
                    Object object5 = this.getActivity();
                    ((kj0_1)object).o((Activity)object5, intent, bl2);
                    object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    String string4 = "Noti_click";
                    object5 = "NotificationCenter";
                    ((GTMEvents)object).pushButtonTapEvent(string4, (String)object5);
                }
            }
            super.onActivityResult(n3, n4, intent);
        }
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object2 = object;
            this.h = object2 = (j3_0)object;
            bl2 = object instanceof vh3_2;
            if (bl2) {
                object2 = object;
                this.i = object2 = (vh3_2)object;
                bl2 = object instanceof fo3;
                if (bl2) {
                    object2 = object;
                    this.j = object2 = (fo3)object;
                    bl2 = object instanceof A71;
                    if (bl2) {
                        object2 = object;
                        this.k = object2 = (A71)object;
                        bl2 = object instanceof nm_1;
                        Object[] objectArray = null;
                        String string2 = " must implement CartClosetListener";
                        if (bl2) {
                            Object object3 = object;
                            object3 = (nm_1)object;
                            this.l = object3;
                        } else {
                            yn3$a yn3$a = yn3_0.a;
                            String string3 = pn_2.b(object, string2);
                            Object[] objectArray2 = new Object[]{};
                            yn3$a.d(string3, objectArray2);
                        }
                        if (bl2) {
                            object2 = object;
                            this.l = object2 = (nm_1)object;
                        } else {
                            object2 = yn3_0.a;
                            string2 = pn_2.b(object, string2);
                            objectArray = new Object[]{};
                            ((yn3$a)object2).d(string2, objectArray);
                        }
                        bl2 = object instanceof su_0;
                        if (bl2) {
                            object2 = object;
                            object2 = (su_0)object;
                            object2.a();
                        }
                        if (bl2 = object instanceof OnFragmentInteractionListener) {
                            object = (OnFragmentInteractionListener)object;
                            this.F2 = object;
                            return;
                        }
                        object = pn_2.b(object, " must implement OnFragmentInteractionListener");
                        object2 = new ClassCastException((String)object);
                        throw object2;
                    }
                    object = pn_2.b(object, " must implement HomeListener");
                    object2 = new ClassCastException((String)object);
                    throw object2;
                }
                object = pn_2.b(object, " must implement ToolbarListener");
                object2 = new ClassCastException((String)object);
                throw object2;
            }
            object = pn_2.b(object, " must implement TabListener");
            object2 = new ClassCastException((String)object);
            throw object2;
        }
        object = pn_2.b(object, " must implement ActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onChangeLocationClick() {
        CartAddressListBottomSheet cartAddressListBottomSheet;
        this.v0 = cartAddressListBottomSheet = new CartAddressListBottomSheet();
        Object object = "cartAddressCallBackListener";
        Intrinsics.checkNotNullParameter(this, (String)object);
        cartAddressListBottomSheet.u = this;
        cartAddressListBottomSheet = this.v0;
        if (cartAddressListBottomSheet != null) {
            object = this.requireActivity().getSupportFragmentManager();
            String string2 = "CartLocationBottomSheet";
            cartAddressListBottomSheet.show((FragmentManager)object, string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCreate(Bundle bundle) {
        Object object;
        Object object2;
        int n3;
        Object object3;
        block18: {
            int n4;
            Object object4;
            block17: {
                int n7;
                Object object5;
                Object object6 = this;
                super.onCreate(bundle);
                object3 = this.getActivity();
                Object object7 = null;
                if (object3 != null) {
                    object3 = object3.getApplication();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                Intrinsics.checkNotNull(object3);
                ((q9_0)object6).P0 = object3;
                object3 = kd3_2.a();
                object2 = n9_0.a;
                object = this.requireActivity().getApplication();
                ((kd3_2)object3).a = object2;
                ((kd3_2)object3).b = object;
                Intrinsics.checkNotNull(object3);
                object2 = "owner";
                Intrinsics.checkNotNullParameter(object6, (String)object2);
                object = "factory";
                Intrinsics.checkNotNullParameter(object3, (String)object);
                Object object8 = this.getViewModelStore();
                Intrinsics.checkNotNullParameter(object6, (String)object2);
                object4 = this.getDefaultViewModelCreationExtras();
                Object object9 = "store";
                Intrinsics.checkNotNullParameter(object8, (String)object9);
                Intrinsics.checkNotNullParameter(object3, (String)object);
                Object object10 = "defaultCreationExtras";
                Intrinsics.checkNotNullParameter(object4, (String)object10);
                Object object11 = x9_0.class;
                Object object12 = "modelClass";
                object3 = im_1.a((rd3_0)object8, (kd3_2)object3, (Wd0)object4, object11, (String)object12);
                object8 = "<this>";
                object4 = sw0_0.a(object11, (String)object8, object11, (String)object12, (String)object12);
                Intrinsics.checkNotNullParameter(object4, (String)object8);
                object11 = object4.getQualifiedName();
                Object object13 = "Local and anonymous classes can not be ViewModels";
                if (object11 == null) {
                    object2 = object6;
                    object = object13.toString();
                    object3 = new IllegalArgumentException((String)object);
                    throw object3;
                }
                Object object14 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                object11 = ((String)object14).concat((String)object11);
                ((q9_0)object6).X = object3 = (x9_0)((pD3)object3).a((yn1_2)object4, (String)object11);
                object3 = this.getActivity();
                if (object3 != null) {
                    Intrinsics.checkNotNullParameter(object3, (String)object2);
                    object4 = object3.getViewModelStore();
                    Intrinsics.checkNotNullParameter(object3, (String)object2);
                    object11 = object3.getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullParameter(object3, (String)object2);
                    object3 = object3.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullParameter(object4, (String)object9);
                    Intrinsics.checkNotNullParameter(object11, (String)object);
                    Intrinsics.checkNotNullParameter(object3, (String)object10);
                    object2 = gj2_1.class;
                    object3 = rl3_0.b((rd3_0)object4, (E$b)object11, (Wd0)object3, object2, (String)object12);
                    object2 = sw0_0.a((Class)object2, (String)object8, (Class)object2, (String)object12, (String)object12);
                    Intrinsics.checkNotNullParameter(object2, (String)object8);
                    object = object2.getQualifiedName();
                    if (object == null) {
                        object2 = object13.toString();
                        object3 = new IllegalArgumentException((String)object2);
                        throw object3;
                    }
                    object = ((String)object14).concat((String)object);
                    ((q9_0)object6).Y = object3 = (gj2_1)((pD3)object3).a((yn1_2)object2, (String)object);
                }
                if ((object3 = ((q9_0)object6).X) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ajiohomeViewModel");
                    n3 = 0;
                    object3 = null;
                }
                ((x9_0)object3).C = false;
                ((Fragment)object6).setHasOptionsMenu(false);
                object2 = this.requireActivity().getApplicationContext();
                object = "getApplicationContext(...)";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object);
                ((q9_0)object6).S0 = object3 = new jo_2((Context)object2);
                try {
                    object2 = this.requireContext();
                    object = "requireContext(...)";
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object);
                    ((q9_0)object6).f = object3 = new ma_2((Context)object2);
                }
                catch (Exception exception) {
                    object2 = yn3_0.a;
                    object3 = String.valueOf(exception.getMessage());
                    object = new Object[]{};
                    ((yn3$a)object2).a((String)object3, (Object[])object);
                }
                ((q9_0)object6).X0 = n3 = og1_1.c();
                this.db().getUserEmailId();
                object = this.requireActivity();
                object2 = "requireActivity(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                object8 = (ky1_0)((q9_0)object6).R0.getValue();
                object4 = ((q9_0)object6).i;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tabListener");
                    n4 = 0;
                    object4 = null;
                }
                object14 = this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(object14, (String)object2);
                boolean bl2 = ((q9_0)object6).X0;
                Object object15 = object2 = ((q9_0)object6).A0.getValue();
                object15 = (F12)object2;
                object2 = ((q9_0)object6).F2;
                if (object2 == null) {
                    object2 = "mListener";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    object5 = null;
                } else {
                    object5 = object2;
                }
                object12 = ((q9_0)object6).K2;
                q9$e q9$e = ((q9_0)object6).L2;
                int n8 = 507968;
                object2 = object3;
                object9 = this;
                object10 = this;
                object11 = this;
                object13 = this;
                object6 = object5;
                object3 = new e00((FragmentActivity)object, (ky1_0)object8, (vh3_2)object4, this, this, this, (OnGAEventHandlerListener)object12, this, (sD3)object14, bl2, (F12)object15, (OnFragmentInteractionListener)object5, q9$e, null, null, null, null, null, n8);
                object2 = this;
                this.Z = object3;
                ((e00)object3).i();
                object3 = this.getArguments();
                if (object3 == null || (n7 = object3.containsKey((String)(object = "deeplinkData"))) == 0) break block17;
                n7 = Build.VERSION.SDK_INT;
                n4 = 33;
                if (n7 >= n4) {
                    object3 = (Parcelable)z7.a((Bundle)object3);
                } else {
                    boolean bl3 = (object3 = object3.getParcelable((String)object)) instanceof Intent;
                    if (bl3) {
                        object7 = object3;
                    }
                    object3 = object7;
                    object3 = (Intent)object7;
                }
                object3 = (Intent)object3;
                if (object3 == null) break block17;
                object = kj0_1.g();
                object8 = this.getActivity();
                n4 = 0;
                object4 = null;
                ((kj0_1)object).o((Activity)object8, (Intent)object3, false);
                object3 = h40_0.a;
                n3 = h40_0.V0();
                if (n3 != 0) {
                    object3 = this.db().getCohortDataForGuestAjioStoreUser();
                    object = "getCohortDataForGuestAjioStoreUser(...)";
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object);
                    n3 = ((String)object3).length();
                    if (n3 == 0 || (n3 = (int)(Intrinsics.areEqual(object3 = this.db().isAjioStoreGuestCohortValueFromCustomerApi(), object = Boolean.FALSE) ? 1 : 0)) != 0) {
                        object3 = this.db();
                        object = this.db().getCohortLinkData();
                        object8 = Boolean.FALSE;
                        ((UserInformation)object3).setCohortDataForGuestAjioStoreUser((String)object, (Boolean)object8);
                    }
                }
                break block18;
            }
            n4 = 0;
            object4 = null;
        }
        if ((n3 = this.qb()) != 0) {
            AJIOApplication.Companion.getClass();
            object3 = AJIOApplication$a.a();
            object = "google.analytics.deferred.deeplink.prefs";
            object3 = object3.getSharedPreferences((String)object, 0);
            ((q9_0)object2).u1 = object3;
            ((q9_0)object2).v1 = object3 = new q8((q9_0)object2);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        Object object2;
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        og1_1.g(this.X0, false);
        int n3 = this.X0;
        if (n3 != 0) {
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            object2 = "landing screen/luxe";
            ((GTMEvents)object).setScreenName((String)object2);
        } else {
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            object2 = "landing screen/ajio";
            ((GTMEvents)object).setScreenName((String)object2);
        }
        object2 = this.X;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ajiohomeViewModel");
            object2 = null;
        }
        object2 = ((x9_0)object2).H;
        this.z1 = object = new tt2_2((Bundle)object2);
        n3 = R$layout.fragment_ajio_home;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        int n3 = gz3.a;
        int n4 = 23;
        if (n3 > n4) {
            Object object = this.f;
            if (object != null) {
                ((ma_2)object).l();
            }
            cp_1.Companion.getClass();
            object = cp$a.e();
            object.getClass();
            n3 = (int)(cp_1.R() ? 1 : 0);
            if (n3 != 0) {
                this.Db();
            }
        }
        eb_2.c.clear();
        eb_2.e.clear();
        eb_2.b = null;
        eb_2.f = null;
    }

    public final void onDestroyView() {
        boolean bl2;
        Object object;
        Object object2;
        boolean bl3;
        Object object3;
        Object object4;
        block21: {
            object4 = this.S0;
            object3 = null;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appPreferences");
                bl3 = false;
                object4 = null;
            }
            object2 = "LUX_SELECTED_PAGE";
            object = "";
            ((sw_0)object4).putPreference((String)object2, object);
            object4 = this.getActivity();
            if (object4 == null) break block21;
            object4 = this.requireActivity();
            bl3 = object4.isFinishing();
            if (bl3) break block21;
            object4 = da_2.Companion;
            object4.getClass();
            object4 = da$b.a();
            try {
                object4.getClass();
                da_2.a();
            }
            catch (Exception exception) {
                object2 = yn3_0.a;
                ((yn3$a)object2).e(exception);
            }
        }
        if ((object4 = this.G) != null) {
            object2 = this.N2;
            ((TabLayout)((Object)object4)).removeOnTabSelectedListener((TabLayout$OnTabSelectedListener)object2);
        }
        if ((object4 = this.o) != null) {
            ((pg2_2)object4).a();
        }
        object4 = this.G0;
        boolean bl4 = ((NewCustomEventsRevamp)object4).isUserLanding();
        object = "landing screen";
        Object object5 = this.F0;
        if (bl4) {
            bl4 = false;
            object2 = null;
            ((NewCustomEventsRevamp)object4).setUserLanding(false);
            ((NewEEcommerceEventsRevamp)object5).setPreviousScreenData((String)object, (String)object);
        } else {
            object4 = this.J0;
            object2 = "home landing screen";
            boolean bl5 = ((String)object4).equals(object2);
            if (bl5) {
                ((NewEEcommerceEventsRevamp)object5).setPreviousScreenData((String)object4, (String)object2);
            } else {
                ((NewEEcommerceEventsRevamp)object5).setPreviousScreenData((String)object4, (String)object);
            }
        }
        object4 = this.y;
        if (object4 != null && (object4 = ((RecyclerView)object4).getLayoutManager()) != null) {
            object4 = ((RecyclerView$o)object4).onSaveInstanceState();
        } else {
            bl3 = false;
            object4 = null;
        }
        object2 = this.A1;
        object2.putParcelable("IDEAL_KEY", (Parcelable)object4);
        object4 = this.X;
        object = "ajiohomeViewModel";
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            bl3 = false;
            object4 = null;
        }
        object4.getClass();
        object5 = "<set-?>";
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        ((x9_0)object4).H = object2;
        object4 = this.z1;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scrollStateHolder");
            bl3 = false;
            object4 = null;
        }
        if ((object2 = this.X) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object3 = object2;
        }
        object3 = ((x9_0)object3).H;
        object4.getClass();
        Intrinsics.checkNotNullParameter(object3, "outState");
        object2 = new Bundle();
        object4 = ((tt2_2)object4).a.entrySet();
        object = "<get-entries>(...)";
        Intrinsics.checkNotNullExpressionValue(object4, (String)object);
        object4 = ((Iterable)object4).iterator();
        while (bl2 = object4.hasNext()) {
            object = (Map.Entry)object4.next();
            object5 = (String)object.getKey();
            object = (Parcelable)object.getValue();
            object2.putParcelable((String)object5, (Parcelable)object);
        }
        object3.putBundle("scroll_state_bundle", (Bundle)object2);
        super.onDestroyView();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        boolean bl2;
        String string2;
        String string3;
        Object object = od3_2.a;
        int n3 = object.length();
        if (n3 == 0) {
            object = od3_2.a();
        }
        n3 = (int)(s20.a ? 1 : 0);
        int n4 = 1;
        boolean bl3 = false;
        String string4 = null;
        if (n3 == 0 && (n3 = (int)(Intrinsics.areEqual(string3 = od3_2.a(), string2 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0)) == 0) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = 1;
        }
        if (n3 != 0 || (bl2 = Intrinsics.areEqual(object, string3 = ld3_2.STORE_AJIOGRAM.getStoreId()))) {
            bl3 = true;
        }
        object = "onGetLayoutInflater(...)";
        if (bl3 && (n3 = (int)(kotlin.text.b.i(string3 = od3_2.a(), string4 = ld3_2.STORE_AJIOGRAM.getStoreId(), n4 != 0) ? 1 : 0)) != 0) {
            bundle = super.onGetLayoutInflater(bundle);
            Intrinsics.checkNotNullExpressionValue(bundle, object);
            string3 = this.requireContext();
            n4 = R$style.FleekTheme;
            object = new d80((Context)string3, n4);
            bundle = bundle.cloneInContext((Context)object);
            Intrinsics.checkNotNullExpressionValue(bundle, "cloneInContext(...)");
            return bundle;
        }
        bundle = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(bundle, object);
        return bundle;
    }

    public final void onPause() {
        int n3;
        super.onPause();
        Object object = this.J2;
        int n4 = 0;
        String string2 = null;
        if (object != null) {
            object.removeCallbacksAndMessages(null);
        }
        this.J2 = null;
        object = this.g;
        if (object != null) {
            object = this.p1;
            n4 = 0;
            string2 = ow_0.c(0, (String)object);
        }
        if (string2 != null) {
            this.Ib(string2);
        }
        if ((n3 = gz3.a) <= (n4 = 23)) {
            this.Db();
        }
        this.Pb("back pressed");
    }

    public final void onRequestPermissionsResult(int n3, String[] object, int[] object2) {
        String string2 = "permissions";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, "grantResults");
        object = new ArrayList();
        int n4 = 1771;
        if (n3 == n4) {
            object2 = Looper.getMainLooper();
            Object object3 = new Handler((Looper)object2);
            object2 = new p8;
            ((p8)object2)(this);
            long l2 = 500L;
            object3.postDelayed((Runnable)object2, l2);
            object3 = this.T;
            if (object3 != null) {
                int n7;
                Object object4;
                boolean bl2;
                object3 = ((ArrayList)object3).iterator();
                object2 = "iterator(...)";
                Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                while (true) {
                    n4 = (int)(object3.hasNext() ? 1 : 0);
                    bl2 = true;
                    if (n4 == 0) break;
                    object2 = object3.next();
                    Intrinsics.checkNotNullExpressionValue(object2, "next(...)");
                    object2 = (String)object2;
                    object4 = hv3_0.a;
                    object4.getClass();
                    boolean bl3 = hv3_0.R((String)object2);
                    if (!bl3) {
                        ((ArrayList)object).add(object2);
                    }
                    if ((n4 = (int)(Intrinsics.areEqual(object2, object4 = "android.permission.POST_NOTIFICATIONS") ? 1 : 0)) == 0) continue;
                    object2 = this.getActivity();
                    hv3_0.a((FragmentActivity)object2, bl2);
                }
                object3 = new Gson();
                object3 = ((Gson)object3).toJson(object);
                object2 = this.S0;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appPreferences");
                    n4 = 0;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object3);
                object2.getClass();
                Intrinsics.checkNotNullParameter(object3, "permissionsRejectedString");
                object4 = "permissions_not_granted";
                ((sw_0)object2).putPreference((String)object4, (String)object3);
                n3 = ((ArrayList)object).size();
                if (n3 == 0 || (n3 = Build.VERSION.SDK_INT) < (n7 = 23)) {
                    object3 = this.T;
                    if (object3 != null) {
                        ((ArrayList)object3).clear();
                    }
                    if ((object3 = this.getContext()) != null) {
                        object = new GoogleApiClient$Builder((Context)object3);
                        object3 = LocationServices.API;
                        object3 = ((GoogleApiClient$Builder)object).addApi((Api)object3).build();
                        Intrinsics.checkNotNullExpressionValue(object3, "build(...)");
                        ((GoogleApiClient)object3).connect();
                        object = LocationRequest.create();
                        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
                        n4 = 100;
                        ((LocationRequest)object).setPriority(n4);
                        ((LocationRequest)object).setInterval(10000L);
                        long l3 = 5000L;
                        ((LocationRequest)object).setFastestInterval(l3);
                        object2 = new LocationSettingsRequest$Builder();
                        object = ((LocationSettingsRequest$Builder)object2).addLocationRequest((LocationRequest)object);
                        Intrinsics.checkNotNullExpressionValue(object, "addLocationRequest(...)");
                        ((LocationSettingsRequest$Builder)object).setAlwaysShow(bl2);
                        object2 = LocationServices.SettingsApi;
                        object = ((LocationSettingsRequest$Builder)object).build();
                        object3 = object2.checkLocationSettings((GoogleApiClient)object3, (LocationSettingsRequest)object);
                        Intrinsics.checkNotNullExpressionValue(object3, "checkLocationSettings(...)");
                        object = new r9_0(this);
                        ((PendingResult)object3).setResultCallback((ResultCallback)object);
                    }
                }
            }
        }
    }

    public final void onResume() {
        block38: {
            int n3;
            Object object;
            int n4;
            Object object2;
            block39: {
                int n7;
                block41: {
                    block40: {
                        int n8;
                        String string2;
                        super.onResume();
                        object2 = this.getActivity();
                        if (object2 == null || (n4 = (object2 = this.requireActivity()).isFinishing()) != 0) break block38;
                        object2 = h40_0.a;
                        n4 = h40_0.c();
                        n7 = 0;
                        object = null;
                        if (n4 != 0 && (n4 = Intrinsics.areEqual(object2 = od3_2.a(), string2 = ld3_2.STORE_AJIOGRAM.getStoreId())) != 0) {
                            object2 = this.getActivity();
                            n3 = object2 instanceof AjioHomeActivity;
                            if (n3 != 0) {
                                object2 = (AjioHomeActivity)object2;
                            } else {
                                n4 = 0;
                                object2 = null;
                            }
                            if (object2 != null) {
                                n3 = hv3_0.m(R$color.color_060C10);
                                ((AjioHomeActivity)object2).r3(n3);
                            }
                        } else {
                            object2 = this.getActivity();
                            n3 = object2 instanceof AjioHomeActivity;
                            if (n3 != 0) {
                                object2 = (AjioHomeActivity)object2;
                            } else {
                                n4 = 0;
                                object2 = null;
                            }
                            if (object2 != null) {
                                n3 = hv3_0.m(R$color.accent_color_11);
                                ((AjioHomeActivity)object2).r3(n3);
                            }
                        }
                        if ((n3 = (object2 = this.getActivity()) instanceof AjioHomeActivity) != 0) {
                            object2 = (AjioHomeActivity)object2;
                        } else {
                            n4 = 0;
                            object2 = null;
                        }
                        n3 = 1;
                        if (object2 != null) {
                            ((AjioHomeActivity)object2).x1(n3 != 0);
                        }
                        ((b52_0)this.Q0.getValue()).c();
                        object2 = this.j;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("toolbarListener");
                            n4 = 0;
                            object2 = null;
                        }
                        object2.hideToolbarLayout();
                        n4 = h40_0.e2();
                        if (n4 != 0) {
                            object2 = SV2.a;
                            if (object2 != null && (n8 = object2.isEmpty()) == 0) {
                                ((AbstractCollection)object2).clear();
                            }
                            SV2.b = false;
                        }
                        if ((n4 = og1_1.c()) == 0 && (object2 = this.p2) != null) {
                            pg2_2 pg2_22;
                            String string3 = "landing screen";
                            this.o = pg2_22 = new pg2_2((View)object2, string3);
                        }
                        cp_1.Companion.getClass();
                        object2 = cp$a.e();
                        object2.getClass();
                        n4 = cp_1.R();
                        if (n4 == 0) break block39;
                        n4 = gz3.a;
                        n8 = 23;
                        if (n4 <= n8) break block40;
                        object2 = this.g;
                        if (object2 != null) {
                            object = ((ob_2)object2).i;
                        }
                        if (object != null) break block41;
                    }
                    if ((object2 = this.g) != null) {
                        long l2 = this.s1;
                        ob_2.h((ob_2)object2, l2, 0, n3);
                    }
                }
                if ((n4 = (int)(this.q1 ? 1 : 0)) != 0) {
                    object2 = this.g;
                    if (object2 != null) {
                        ((ob_2)object2).i();
                    }
                    if ((object2 = this.f1) != null) {
                        n7 = R$string.video_unmute;
                        object = hv3_0.K(n7);
                        object2.setContentDescription((CharSequence)object);
                    }
                    if ((object2 = this.f1) != null) {
                        n7 = R$drawable.ic_mute;
                        object2.setImageResource(n7);
                    }
                } else {
                    object2 = this.g;
                    if (object2 != null) {
                        ((ob_2)object2).n();
                    }
                    if ((object2 = this.f1) != null) {
                        n7 = R$string.video_mute;
                        object = hv3_0.K(n7);
                        object2.setContentDescription((CharSequence)object);
                    }
                    if ((object2 = this.f1) != null) {
                        n7 = R$drawable.ic_unmute;
                        object2.setImageResource(n7);
                    }
                }
            }
            if ((n4 = (int)(h40_0.c() ? 1 : 0)) != 0 && (n4 = (int)(kotlin.text.b.i((String)(object2 = od3_2.a()), (String)(object = ld3_2.STORE_AJIOGRAM.getStoreId()), n3 != 0) ? 1 : 0)) != 0) {
                object2 = this.i2;
                if (object2 != null) {
                    ai0_2.i((View)object2);
                }
                if ((object2 = this.X1) != null) {
                    ai0_2.i((View)object2);
                }
                if ((object2 = this.Y1) != null) {
                    ai0_2.i((View)object2);
                }
                if ((object2 = this.A) != null) {
                    ai0_2.i((View)object2);
                }
                if ((object2 = this.h2) != null) {
                    ai0_2.i((View)object2);
                }
                if ((object2 = this.B) != null) {
                    ai0_2.i((View)object2);
                }
            }
            if ((n4 = (int)(bo1_1.b ? 1 : 0)) != 0) {
                bo1_1.e();
            } else {
                long l3;
                bo1_1.d = l3 = SystemClock.uptimeMillis();
                bo1_1.f();
            }
        }
    }

    public final void onStart() {
        int n3;
        Object object;
        Object object2;
        q9_0 q9_02 = this;
        super.onStart();
        int n4 = 1;
        this.W0 = n4;
        int n7 = this.qb();
        if (n7 != 0 && (object2 = this.v1) != null && (object = this.u1) != null) {
            object.registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)object2);
        }
        object2 = CustomerStoreType.a;
        object = ScreenType.SCREEN_HOME;
        object2 = CustomerStoreType.a("", (ScreenType)((Object)object));
        object = tr2_2.a;
        object = tr2_2.b();
        String string2 = null;
        if (object != null) {
            object = ((EarlyAccessBannerData)object).getOnboardingCMSPath();
        } else {
            n3 = 0;
            object = null;
        }
        object = String.valueOf(object);
        n3 = ((String)object).length();
        if (n3 > 0 && (n3 = (int)(((Boolean)(object = this.db().isOnBoardingShown())).booleanValue() ? 1 : 0)) == 0 && (n3 = (int)(mz3_0.y((String)object2) ? 1 : 0)) != 0) {
            Object object3;
            object = tr2_2.b();
            if (object != null) {
                object = ((EarlyAccessBannerData)object).getEnableEarlyAccess();
                object3 = Boolean.TRUE;
                n3 = (int)(Intrinsics.areEqual(object, object3) ? 1 : 0);
            } else {
                n3 = 0;
                object = null;
            }
            if (n3 != 0 && (n3 = (int)(q9_02.X0 ? 1 : 0)) == 0) {
                boolean bl2;
                object3 = tr2_2.b();
                if (object3 != null) {
                    object3 = ((EarlyAccessBannerData)object3).getOnboardingCMSPath();
                } else {
                    bl2 = false;
                    object3 = null;
                }
                Object object4 = String.valueOf(object3);
                object3 = q9_02.S0;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appPreferences");
                    bl2 = false;
                    object3 = null;
                }
                Object object5 = ((jo_2)object3).f();
                object3 = h40_0.a;
                boolean bl3 = h40_0.B0();
                int n8 = 0xEFFFFA;
                Object object6 = null;
                Object object7 = null;
                object3 = object;
                object = new HomeReq((String)object4, null, (String)object5, null, null, null, null, null, null, null, false, false, false, null, false, false, null, false, false, false, bl3, false, false, null, n8, null);
                bl2 = og1_1.c();
                object3 = bl2 ? "LUXE" : "AJIO";
                ((HomeReq)object).setStore((String)object3);
                object3 = new HashMap();
                object4 = UrlHelper.Companion.getInstance();
                object6 = new Object[]{};
                object5 = "homepage";
                object7 = "home_cms";
                object6 = ((UrlHelper)object4).getApiUrl((String)object5, (String)object7, object6);
                int n10 = ((String)object2).length();
                if (n10 != 0) {
                    object4 = "userGroup";
                    ((HashMap)object3).put(object4, object2);
                }
                object7 = p3.a("userCohortValues", (String)object2);
                object3 = object2 = q9_02.k0.getValue();
                object3 = (xw0_2)object2;
                n7 = hv3_0.F();
                hv3_0.a.getClass();
                int n14 = hv3_0.E();
                object4 = new ScreenInfo(n7, n14);
                object5 = object;
                ((xw0_2)object3).c((ScreenInfo)object4, (String)object6, (HomeReq)object, (Map)object7, null);
                object2 = this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(object2, "getViewLifecycleOwner(...)");
                object2 = nu1_0.a((mu1_1)object2);
                object = new u9_0(q9_02, null);
                ((iu1_0)object2).c((Function2)object);
            }
        }
        if ((n7 = gz3.a) > (n3 = 23)) {
            object2 = xl1_1.START;
            object = new Intent("media_stop_notification");
            string2 = "action_type";
            object.putExtra(string2, (Serializable)object2);
            Xv1.a(this.requireContext()).c((Intent)object);
            object2 = q9_02.f;
            if (object2 != null) {
                n3 = 2;
                ((ma_2)object2).j(n3, false);
            }
            object2 = eb_2.a;
            eb_2.a = q9_02.f;
            cp_1.Companion.getClass();
            object2 = cp$a.e();
            object2.getClass();
            n7 = (int)(cp_1.R() ? 1 : 0);
            if (n7 != 0) {
                object2 = q9_02.r1;
                object = ((sb3_2)object2).c;
                long l2 = object != null ? (Long)object : 0L;
                q9_02.s1 = l2;
                n7 = (int)(((sb3_2)object2).d ? 1 : 0);
                q9_02.q1 = n7;
                object2 = q9_02.g;
                if (object2 != null) {
                    ob_2.h((ob_2)object2, l2, 0, n4);
                }
            }
        }
    }

    public final void onStop() {
        Object object;
        int n3;
        super.onStop();
        int n4 = 0;
        this.W0 = false;
        Object object2 = this.U0;
        int n7 = 0;
        Intent intent = null;
        if (object2 != null && (n4 = ((Fragment)object2).isVisible()) == (n3 = 1)) {
            object2 = this.U0;
            if (object2 != null) {
                ((BottomSheetDialogFragment)object2).dismissAllowingStateLoss();
            }
            this.U0 = null;
        }
        if ((n4 = this.qb()) != 0 && (object2 = this.v1) != null) {
            object = this.u1;
            if (object != null) {
                object.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)object2);
            }
            this.v1 = null;
        }
        object2 = AnalylticsGAHolderForProduct.INSTANCE;
        ((AnalylticsGAHolderForProduct)object2).clearAllRemainingEvents();
        n4 = gz3.a;
        n7 = 23;
        if (n4 > n7) {
            object2 = this.f;
            if (object2 != null) {
                n7 = ((ma_2)object2).r;
                n3 = ((ow_0)object2).b;
                if ((object2 = ((ow_0)object2).a(n7 %= n3)) != null) {
                    object2.pause();
                }
            }
            object2 = xl1_1.STOP;
            intent = new Intent("media_stop_notification");
            object = "action_type";
            intent.putExtra((String)object, (Serializable)object2);
            Xv1.a(this.requireContext()).c(intent);
            cp_1.Companion.getClass();
            object2 = cp$a.e();
            object2.getClass();
            n4 = (int)(cp_1.R() ? 1 : 0);
            if (n4 != 0) {
                this.Db();
            }
        }
        object2 = new Message();
        ((Message)object2).what = 1004;
        AnalyticsGAEventHandler.Companion.getInstance().sendMessage((Message)object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean onTouch(View var1_1, MotionEvent var2_2) {
        block44: {
            block42: {
                block43: {
                    block41: {
                        var3_3 = 0;
                        var4_4 = 0.0f;
                        var5_5 = null;
                        if (var2_2 /* !! */  != null) {
                            var6_6 = var2_2 /* !! */ .getActionMasked();
                            var7_7 = var6_6;
                        } else {
                            var6_6 = 0;
                            var7_7 = null;
                            var8_8 = 0.0f;
                        }
                        var9_9 = 1;
                        var10_10 = 0;
                        var11_11 = 0.0f;
                        var12_12 = null;
                        if (var7_7 == null || (var13_13 = var7_7.intValue()) != 0) break block41;
                        if (var1_1 != null) {
                            var4_4 = var1_1.getX();
                        } else {
                            var3_3 = 0;
                            var4_4 = 0.0f;
                            var5_5 = null;
                        }
                        this.w2 = var4_4;
                        if (var1_1 != null) {
                            var11_11 = var1_1.getY();
                        }
                        this.x2 = var11_11;
                        this.y2 = var14_14 = var2_2 /* !! */ .getRawX();
                        this.z2 = var14_14 = var2_2 /* !! */ .getRawY();
                        this.A2 = var14_14 = var2_2 /* !! */ .getRawX();
                        this.B2 = var14_14 = var2_2 /* !! */ .getRawY();
                        break block42;
                    }
                    var13_13 = 0;
                    var15_16 = 0.0f;
                    var16_17 = null;
                    if (var7_7 == null) break block43;
                    var17_18 = var7_7.intValue();
                    var18_19 = 2;
                    var19_20 = 2.8E-45f;
                    if (var17_18 != var18_19) break block43;
                    var8_8 = this.w2;
                    var20_21 = var2_2 /* !! */ .getRawX();
                    var19_20 = this.y2;
                    var20_21 = var20_21 - var19_20 + var8_8;
                    var8_8 = this.x2;
                    var19_20 = var2_2 /* !! */ .getRawY();
                    var21_22 = this.z2;
                    var19_20 = var19_20 - var21_22 + var8_8;
                    var8_8 = this.w2;
                    var21_22 = var2_2 /* !! */ .getRawX();
                    var22_23 = this.y2;
                    var21_22 = var21_22 - var22_23 + var8_8;
                    if (var1_1 != null) {
                        var6_6 = var1_1.getWidth();
                    } else {
                        var6_6 = 0;
                        var8_8 = 0.0f;
                        var7_7 = null;
                    }
                    var8_8 = var6_6;
                    var21_22 += var8_8;
                    var8_8 = this.x2;
                    var23_24 = var2_2 /* !! */ .getRawY();
                    var22_23 = this.z2;
                    var23_24 = var23_24 - var22_23 + var8_8;
                    if (var1_1 != null) {
                        var13_13 = var1_1.getHeight();
                    }
                    var8_8 = var13_13;
                    var23_24 += var8_8;
                    cfr_temp_0 = var20_21 - 0.0f;
                    var6_6 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                    if (var6_6 < 0) ** GOTO lbl-1000
                    var7_7 = hv3_0.a;
                    var16_17 = this.getActivity();
                    var7_7.getClass();
                    var8_8 = hv3_0.Q(var16_17);
                    var6_6 = (int)(var21_22 == var8_8 ? 0 : (var21_22 < var8_8 ? -1 : 1));
                    if (var6_6 <= 0) {
                        if (var1_1 != null) {
                            var1_1.setX(var20_21);
                        }
                    } else if ((var6_6 = (int)((cfr_temp_1 = var20_21 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1))) < 0) {
                        if (var1_1 != null) {
                            var1_1.setX(0.0f);
                        }
                    } else {
                        var7_7 = hv3_0.a;
                        var16_17 = this.getActivity();
                        var7_7.getClass();
                        var8_8 = hv3_0.Q(var16_17);
                        var6_6 = (int)(var21_22 == var8_8 ? 0 : (var21_22 > var8_8 ? 1 : -1));
                        if (var6_6 > 0 && var1_1 != null) {
                            var7_7 = this.getActivity();
                            var6_6 = hv3_0.Q((FragmentActivity)var7_7);
                            var8_8 = var6_6;
                            var13_13 = var1_1.getWidth();
                            var15_16 = var13_13;
                            var1_1.setX(var8_8 -= var15_16);
                        }
                    }
                    if ((var6_6 = (int)og1_1.c()) != 0) {
                        var7_7 = this.getActivity();
                        var13_13 = var7_7 instanceof AjioHomeActivity;
                        if (var13_13 != 0) {
                            var5_5 = var7_7;
                            var5_5 = (AjioHomeActivity)var7_7;
                        }
                        if (var5_5 != null && (var5_5 = var5_5.s0) != null) {
                            var3_3 = var5_5.getHeight();
                            var5_5 = var3_3;
                        } else {
                            var5_5 = Float.valueOf(0.0f);
                        }
                    } else {
                        var7_7 = this.getActivity();
                        var13_13 = var7_7 instanceof AjioHomeActivity;
                        if (var13_13 != 0) {
                            var5_5 = var7_7;
                            var5_5 = (AjioHomeActivity)var7_7;
                        }
                        if (var5_5 != null && (var5_5 = var5_5.r0) != null) {
                            var3_3 = var5_5.getHeight();
                            var5_5 = var3_3;
                        } else {
                            var5_5 = Float.valueOf(0.0f);
                        }
                    }
                    var7_7 = this.y;
                    if (var7_7 != null) {
                        var8_8 = var7_7.getY();
                    } else {
                        var6_6 = 0;
                        var8_8 = 0.0f;
                        var7_7 = null;
                    }
                    var6_6 = (int)(var19_20 == var8_8 ? 0 : (var19_20 > var8_8 ? 1 : -1));
                    if (var6_6 < 0) ** GOTO lbl-1000
                    var7_7 = hv3_0.a;
                    var16_17 = this.getActivity();
                    var7_7.getClass();
                    var6_6 = hv3_0.P(var16_17);
                    var13_13 = var5_5.intValue();
                    var8_8 = var6_6 - var13_13;
                    var6_6 = (int)(var23_24 == var8_8 ? 0 : (var23_24 < var8_8 ? -1 : 1));
                    if (var6_6 <= 0) {
                        if (var1_1 != null) {
                            var1_1.setY(var19_20);
                        }
                    } else lbl-1000:
                    // 2 sources

                    {
                        if ((var7_7 = this.y) != null) {
                            var8_8 = var7_7.getY();
                        } else {
                            var6_6 = 0;
                            var8_8 = 0.0f;
                            var7_7 = null;
                        }
                        var6_6 = (int)(var19_20 == var8_8 ? 0 : (var19_20 < var8_8 ? -1 : 1));
                        if (var6_6 < 0) {
                            if (var1_1 != null) {
                                var2_2 /* !! */  = this.y;
                                if (var2_2 /* !! */  != null) {
                                    var11_11 = var2_2 /* !! */ .getY();
                                }
                                var1_1.setY(var11_11);
                            }
                        } else {
                            var7_7 = hv3_0.a;
                            var12_12 = this.getActivity();
                            var7_7.getClass();
                            var6_6 = hv3_0.P(var12_12);
                            var10_10 = var5_5.intValue();
                            var8_8 = var6_6 -= var10_10;
                            var24_26 = var23_24 == var8_8 ? 0 : (var23_24 > var8_8 ? 1 : -1);
                            if (var24_26 > 0 && var1_1 != null) {
                                var2_2 /* !! */  = this.getActivity();
                                var24_26 = hv3_0.P((FragmentActivity)var2_2 /* !! */ );
                                var3_3 = var5_5.intValue();
                                var24_26 -= var3_3;
                                var3_3 = var1_1.getHeight();
                                var23_24 = var24_26 -= var3_3;
                                var1_1.setY(var23_24);
                            }
                        }
                    }
                    break block42;
                }
                if (var7_7 == null || (var25_27 = var7_7.intValue()) != var9_9) break block44;
                var14_15 = var2_2 /* !! */ .getRawX();
                var23_25 = var2_2 /* !! */ .getRawY();
                var4_4 = this.A2;
                var8_8 = this.B2;
                var4_4 -= var14_15;
                var14_15 = Math.abs(var4_4);
                var8_8 -= var23_25;
                var23_25 = Math.abs(var8_8);
                var5_5 = this.getContext();
                if (var5_5 != null) {
                    var5_5 = ViewConfiguration.get((Context)var5_5);
                    var13_13 = var5_5.getScaledTouchSlop();
                }
                if ((var25_27 = (cfr_temp_2 = var14_15 - (var4_4 = (float)var13_13)) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1)) <= 0 && (var25_27 = (int)(var23_25 == var4_4 ? 0 : (var23_25 > var4_4 ? 1 : -1))) <= 0) {
                    this.ub();
                }
            }
            return (boolean)var9_9;
        }
        return false;
    }

    public final void onTrimMemory(int n3) {
        ma_2 ma_22 = this.f;
        if (ma_22 != null) {
            ma_22.l();
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        this.p = object;
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object4 = this.getDefaultViewModelCreationExtras();
        Object object5 = "store";
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        Object object6 = "factory";
        Intrinsics.checkNotNullParameter(object3, (String)object6);
        String string2 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object4, string2);
        Object object7 = oa1_1.class;
        String string3 = "modelClass";
        object2 = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object4, object7, string3);
        object3 = "<this>";
        object4 = sw0_0.a(object7, (String)object3, object7, string3, string3);
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        object7 = object4.getQualifiedName();
        String string4 = "Local and anonymous classes can not be ViewModels";
        if (object7 != null) {
            String string5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object7 = string5.concat((String)object7);
            this.N0 = object2 = (oa1_1)object2.a((yn1_2)object4, (String)object7);
            object2 = kd3_2.a();
            object4 = new AddressRepo();
            object7 = this.requireActivity().getApplication();
            object2.a = object4;
            object2.b = object7;
            object4 = this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(object4, "requireActivity(...)");
            Intrinsics.checkNotNull(object2);
            Intrinsics.checkNotNullParameter(object4, (String)object);
            Intrinsics.checkNotNullParameter(object2, (String)object6);
            object7 = object4.getViewModelStore();
            Intrinsics.checkNotNullParameter(object4, (String)object);
            object4 = object4.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object7, (String)object5);
            Intrinsics.checkNotNullParameter(object2, (String)object6);
            Intrinsics.checkNotNullParameter(object4, string2);
            pD3 pD32 = new pD3((rd3_0)object7, (E$b)object2, (Wd0)object4);
            object2 = h5_0.class;
            Intrinsics.checkNotNullParameter(object2, string3);
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            object2 = Reflection.getOrCreateKotlinClass((Class)object2);
            Intrinsics.checkNotNullParameter(object2, string3);
            Intrinsics.checkNotNullParameter(object2, string3);
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            object4 = object2.getQualifiedName();
            if (object4 != null) {
                object4 = string5.concat((String)object4);
                this.D2 = object2 = (h5_0)pD32.a((yn1_2)object2, (String)object4);
                Intrinsics.checkNotNullParameter(this, (String)object);
                object2 = this.getViewModelStore();
                Intrinsics.checkNotNullParameter(this, (String)object);
                object4 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(this, (String)object);
                object = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(object2, (String)object5);
                Intrinsics.checkNotNullParameter(object4, (String)object6);
                Intrinsics.checkNotNullParameter(object, string2);
                object5 = wx1_1.class;
                object = rl3_0.b((rd3_0)object2, (E$b)object4, (Wd0)object, (Class)object5, string3);
                object2 = sw0_0.a((Class)object5, (String)object3, (Class)object5, string3, string3);
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object3 = object2.getQualifiedName();
                if (object3 != null) {
                    int n3;
                    int n4;
                    object3 = string5.concat((String)object3);
                    this.E2 = object = (wx1_1)((pD3)object).a((yn1_2)object2, (String)object3);
                    this.nb();
                    object = this.z1;
                    int n7 = 0;
                    object2 = null;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("scrollStateHolder");
                        n4 = 0;
                        object = null;
                    }
                    if ((object3 = this.y) != null) {
                        object5 = this.getContext();
                        object4 = new WrapperLinearLayoutManager((Context)object5);
                        ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object4);
                        object4 = this.Z;
                        object5 = "commonCmsViewDelegate";
                        if (object4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                            n3 = 0;
                            object4 = null;
                        }
                        if ((object6 = this.X) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("ajiohomeViewModel");
                            object6 = null;
                        }
                        ((e00)object4).g = object6 = ((x9_0)object6).r;
                        object4 = this.Z;
                        if (object4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                            n3 = 0;
                            object4 = null;
                        }
                        ((e00)object4).p((RecyclerView)object3, (tt2_2)object);
                        object = new Object();
                        ((bb3_1)object).a = object3;
                        ((bb3_1)object).d = -1;
                        ((bb3_1)object).h = 40;
                        object4 = new ab3_1((bb3_1)object);
                        ((RecyclerView)object3).addOnScrollListener((RecyclerView$s)object4);
                        ((bb3_1)object).h = n3 = 70;
                        object = z40_0.Companion;
                        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                        object4 = "cms_list_cache_size";
                        n4 = ((ao0_0)object).g((String)object4);
                        if (n4 > 0) {
                            ((RecyclerView)object3).setItemViewCacheSize(n4);
                        }
                    }
                    if ((n4 = h40_0.Q1()) != 0) {
                        object = this.S0;
                        if (object == null) {
                            object = "appPreferences";
                            Intrinsics.throwUninitializedPropertyAccessException((String)object);
                        } else {
                            object2 = object;
                        }
                        object = object2.l();
                        object2 = this.db();
                        n7 = object2.isUserOnline();
                        if (n7 != 0) {
                            AJIOApplication.Companion.getClass();
                            object2 = AJIOApplication$a.a();
                            n7 = object2.d;
                            if (n7 != 0) {
                                this.cb();
                                object2 = AJIOApplication$a.a();
                                boolean bl2 = false;
                                object3 = null;
                                object2.d = false;
                            } else if (object != null) {
                                this.Lb((CartDeliveryAddress)object);
                            } else {
                                this.cb();
                            }
                            object2 = h40_0.a;
                            n7 = (int)(h40_0.c() ? 1 : 0);
                            if (n7 != 0 && (n7 = (int)(Intrinsics.areEqual(object2 = od3_2.a(), object3 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0)) != 0) {
                                this.Lb((CartDeliveryAddress)object);
                            }
                        } else if (object != null) {
                            object2 = ((CartDeliveryAddress)object).getPostalCode();
                            if (object2 != null && (n7 = object2.length()) != 0) {
                                object2 = AddressType.Pincode;
                                ((CartDeliveryAddress)object).setAddressType((AddressType)((Object)object2));
                                this.Lb((CartDeliveryAddress)object);
                                object2 = ((CartDeliveryAddress)object).getPostalCode();
                                if (object2 != null && (n7 = object2.length()) != 0) {
                                    object6 = ((CartDeliveryAddress)object).getPostalCode();
                                    n3 = 0;
                                    object4 = null;
                                    object5 = null;
                                    int n8 = 3;
                                    object7 = null;
                                    object3 = object2;
                                    object2 = new GPSLocationData(null, null, (String)object6, n8, null);
                                    object = this.gb();
                                    boolean bl3 = true;
                                    ((hy3_0)object).j((GPSLocationData)object2, bl3);
                                }
                            } else {
                                object2 = ((CartDeliveryAddress)object).getAddressType();
                                if (object2 == null) {
                                    object2 = AddressType.None;
                                    ((CartDeliveryAddress)object).setAddressType((AddressType)((Object)object2));
                                }
                                this.Lb((CartDeliveryAddress)object);
                            }
                        } else {
                            object = new CartDeliveryAddress();
                            object2 = ((CartDeliveryAddress)object).getAddressType();
                            if (object2 == null) {
                                object2 = AddressType.None;
                                ((CartDeliveryAddress)object).setAddressType((AddressType)((Object)object2));
                            }
                            this.Lb((CartDeliveryAddress)object);
                        }
                    }
                    return;
                }
                object2 = string4.toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            object2 = string4.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = string4.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void pb() {
        boolean bl2;
        boolean bl3;
        Object object;
        boolean bl4;
        int n3;
        Object object2 = this.gb();
        ((hy3_0)object2).c = n3 = 101;
        ((hy3_0)object2).d = n3;
        object2 = yn3_0.a;
        n3 = 0;
        Object object3 = null;
        Object object4 = new Object[]{};
        ((yn3$a)object2).a("locale state reset", (Object[])object4);
        object2 = this.S0;
        object4 = null;
        String string2 = "appPreferences";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl4 = false;
            object2 = null;
        }
        Object object5 = hv3_0.a;
        object5.getClass();
        boolean bl5 = hv3_0.X();
        boolean bl6 = true;
        ((jo_2)object2).s(bl5 ^= bl6);
        object2 = new ArrayList();
        this.T = object2;
        object2 = this.S0;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl4 = false;
            object2 = null;
        }
        object5 = "IS_MANDATORY_PERMISSIONS_DIALOG_SHOWN";
        bl4 = ((sw_0)object2).getPreference((String)object5, false);
        Object object6 = "mandatory_on_start_permissions";
        if (!bl4) {
            boolean bl7;
            object2 = z40_0.Companion;
            object = AJIOApplication.Companion;
            object2 = Q.a((AJIOApplication$a)object, (z40$a)object2).a;
            bl4 = ((ao0_0)object2).a((String)object6);
            if (bl4) {
                object2 = this.T;
                if (object2 != null) {
                    object = "android.permission.ACCESS_FINE_LOCATION";
                    ((ArrayList)object2).add(object);
                }
                if ((object2 = this.T) != null) {
                    object = "android.permission.ACCESS_COARSE_LOCATION";
                    ((ArrayList)object2).add(object);
                }
                if ((object2 = this.T) != null) {
                    object = "android.permission.READ_PHONE_STATE";
                    ((ArrayList)object2).add(object);
                }
            }
            object2 = h40_0.a;
            bl4 = h40_0.N1();
            if (bl4 && !(bl3 = (boolean)hv3_0.R((String)(object2 = "android.permission.POST_NOTIFICATIONS"))) && (bl3 = Build.VERSION.SDK_INT) >= (bl7 = 33 != 0) && (object = this.T) != null) {
                ((ArrayList)object).add(object2);
            }
            object2 = this.T;
            Intrinsics.checkNotNull(object2);
            this.T = object2 = hv3_0.e((ArrayList)object2);
            object2 = new Gson();
            object = this.T;
            object2 = ((Gson)object2).toJson(object);
            object = this.S0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl3 = false;
                object = null;
            }
            Intrinsics.checkNotNull(object2);
            object.getClass();
            Intrinsics.checkNotNullParameter(object2, "permissionsRejectedString");
            String string3 = "permissions_not_granted";
            ((sw_0)object).putPreference(string3, (String)object2);
        }
        object2 = z40_0.Companion;
        object = AJIOApplication.Companion;
        object2 = Q.a((AJIOApplication$a)object, (z40$a)object2).a;
        bl4 = ((ao0_0)object2).a((String)object6);
        if (!bl4) {
            this.Ya();
            return;
        }
        if (bl4) {
            object = this.getActivity();
            this.V0 = object6 = new ey0_1((FragmentActivity)object, this);
        }
        if ((bl2 = Build.VERSION.SDK_INT) >= (bl3 = 23 != 0) && (object6 = this.T) != null && (bl2 = ((ArrayList)object6).isEmpty() ^ bl6) == bl6) {
            object2 = this.S0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl4 = false;
                object2 = null;
            }
            if (bl4 = ((sw_0)object2).getPreference((String)object5, false)) return;
            object2 = z40$a.a((Context)AJIOApplication$a.a()).a;
            object5 = "android_mandatory_on_start_perm_dialog_enable";
            bl4 = ((ao0_0)object2).a((String)object5);
            if (bl4) {
                Exception exception2;
                block28: {
                    block27: {
                        object2 = this.h;
                        object5 = "activityFragmentListener";
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                            bl4 = false;
                            object2 = null;
                        }
                        if ((object2 = object2.y()) == null) return;
                        object2 = this.h;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                            bl4 = false;
                            object2 = null;
                        }
                        if ((object2 = object2.y()) == null) return;
                        bl4 = ((Fragment)object2).isAdded();
                        if (bl4 != bl6) return;
                        bl4 = this.isAdded();
                        if (!bl4) return;
                        object2 = new Bundle();
                        object6 = this.T;
                        Intrinsics.checkNotNull(object6);
                        object6 = (String)hv3_0.p((ArrayList)object6).a;
                        object2.putString("permission_dialog_title", (String)object6);
                        object6 = this.T;
                        Intrinsics.checkNotNull(object6);
                        object6 = (String)hv3_0.p((ArrayList)object6).b;
                        object2.putString("permission_dialog_description", (String)object6);
                        object6 = this.T;
                        Intrinsics.checkNotNull(object6);
                        object6 = (String)hv3_0.p((ArrayList)object6).c;
                        object2.putString("permission_list", (String)object6);
                        object6 = od3_2.a();
                        object = ld3_2.STORE_AJIOGRAM.getStoreId();
                        bl2 = Intrinsics.areEqual(object6, object);
                        if (bl2) return;
                        try {
                            this.U0 = object6 = new oq2_1();
                            ((DialogFragment)object6).setCancelable(false);
                            object3 = this.U0;
                            if (object3 == null) break block27;
                            bl2 = 1770 != 0;
                            ((Fragment)object3).setTargetFragment(this, (int)(bl2 ? 1 : 0));
                        }
                        catch (Exception exception2) {
                            break block28;
                        }
                    }
                    if ((object3 = this.U0) != null) {
                        ((Fragment)object3).setArguments((Bundle)object2);
                    }
                    if ((object2 = this.U0) == null) return;
                    object3 = this.h;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                        n3 = 0;
                        object3 = null;
                    }
                    object3 = object3.y();
                    Intrinsics.checkNotNull(object3);
                    object3 = ((Fragment)object3).getChildFragmentManager();
                    object5 = "PermissionsDialog";
                    ((DialogFragment)object2).show((FragmentManager)object3, (String)object5);
                    return;
                }
                object3 = yn3_0.a;
                ((yn3$a)object3).e(exception2);
                jo_2 jo_22 = this.S0;
                if (jo_22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl4 = false;
                    jo_22 = null;
                }
                long l2 = System.currentTimeMillis();
                jo_22.t(l2);
                jo_22 = this.S0;
                if (jo_22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object4 = jo_22;
                }
                ((jo_2)object4).s(bl6);
                this.Cb();
                return;
            }
            object2 = this.S0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl4 = false;
                object2 = null;
            }
            long l3 = System.currentTimeMillis();
            ((jo_2)object2).t(l3);
            object2 = this.S0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object4 = object2;
            }
            ((jo_2)object4).s(bl6);
            this.Cb();
            return;
        }
        if (bl4) {
            this.Eb();
        }
        this.Ya();
    }

    public final void q4(String object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "pinCode");
        Object object2 = new fo_1();
        this.w0 = object2;
        ((fo_1)object2).h = bl2 = true;
        String string2 = "changeLocationListener";
        Intrinsics.checkNotNullParameter(this, string2);
        ((fo_1)object2).i = this;
        object2 = this.w0;
        if (object2 != null) {
            ((fo_1)object2).Ra((String)object);
        }
        if ((object = this.w0) != null) {
            object = "cartAddressCallBackListener";
            Intrinsics.checkNotNullParameter(this, (String)object);
        }
        if ((object = this.w0) != null) {
            object2 = this.requireActivity().getSupportFragmentManager();
            string2 = "CartPinCodeCheckBottomSheet";
            ((DialogFragment)object).show((FragmentManager)object2, string2);
        }
    }

    public final void q9() {
        boolean bl2;
        RecyclerView recyclerView = this.y;
        if (recyclerView != null && (bl2 = this.isAdded()) && !(bl2 = this.isRemoving())) {
            c9 c94 = new c9(recyclerView, 0);
            recyclerView.post(c94);
        }
    }

    public final boolean qb() {
        return (Boolean)this.P2.getValue();
    }

    public final void r3() {
        a$a a$a = com.ril.ajio.plp.a.Companion;
        Object object = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(object, "requireContext(...)");
        Object object2 = this.requireActivity().getActivityResultRegistry();
        a$a.getClass();
        a$a.a((Context)object, (K3)object2, this).a();
        object = this.G0;
        object2 = ((NewCustomEventsRevamp)object).getEC_IMAGE_SEARCH();
        String string2 = av_0.a(AnalyticsManager.Companion);
        String string3 = this.H0;
        String string4 = this.I0;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object2, "upload image icon interactions", "Click a photo", "event_upload_image_icon_interactions", string2, "home landing screen", string3, null, string4, false, null, 1536, null);
    }

    public final boolean rb() {
        boolean bl2;
        Object object = this.getContext();
        if (object != null) {
            z40_0.Companion.getClass();
            object = z40$a.a((Context)object).a;
            String string2 = "flag_store_switch";
            bl2 = ((ao0_0)object).a(string2);
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final void s0() {
        Object object = this.X;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ajiohomeViewModel");
            object = null;
        }
        if ((object = ((x9_0)object).G) != null) {
            boolean bl2 = true;
            ((oo_0)object).a(bl2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void sb(boolean bl2, boolean bl3) {
        Exception exception2;
        block5: {
            Object object;
            Object object2;
            Object object3;
            ArrayList arrayList;
            block4: {
                Object object4;
                block3: {
                    boolean bl4;
                    arrayList = hu1_2.a;
                    object3 = null;
                    arrayList = arrayList != null ? ((SisStoreList)((Object)arrayList)).getStores() : null;
                    object4 = hu1_2.a;
                    object2 = object4 != null ? (object4 = ((SisStoreList)object4).getHeaderTitle()) : null;
                    object4 = hu1_2.a;
                    object = object4 != null ? (object4 = ((SisStoreList)object4).getSubText()) : null;
                    object4 = this.getParentFragment();
                    if (object4 == null) return;
                    boolean bl5 = ((Fragment)object4).isAdded();
                    if (bl5 != (bl4 = true)) return;
                    bl5 = this.isAdded();
                    if (!bl5) return;
                    if (arrayList == null) return;
                    bl5 = arrayList.isEmpty();
                    if (bl5) {
                        return;
                    }
                    try {
                        object4 = this.B0;
                        object4 = ((hh3_2)object4).getValue();
                        object4 = (r81_0)object4;
                        object4 = ((r81_0)object4).a;
                        ((LiveData)object4).k(arrayList);
                        arrayList = nc3_2.Companion;
                        object4 = this.X;
                        if (object4 != null) break block3;
                        object4 = "ajiohomeViewModel";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        break block4;
                    }
                    catch (Exception exception2) {
                        break block5;
                    }
                }
                object3 = object4;
            }
            String string2 = ((x9_0)object3).J;
            String string3 = this.t2;
            arrayList.getClass();
            nc3_2 nc3_22 = Nc3$a.a((String)object2, (String)object, string2, string3, bl2, bl3);
            bl3 = 1789;
            nc3_22.setTargetFragment(this, (int)(bl3 ? 1 : 0));
            Object object5 = this.requireParentFragment();
            object5 = ((Fragment)object5).getChildFragmentManager();
            arrayList = "StoreChooserBSFragment";
            nc3_22.show((FragmentManager)object5, (String)((Object)arrayList));
            return;
        }
        yn3$a yn3$a = yn3_0.a;
        yn3$a.e(exception2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void tb(boolean var1_1) {
        block15: {
            block17: {
                block16: {
                    block14: {
                        var2_2 = this.k;
                        var3_3 = "homeListener";
                        var4_4 = false;
                        var5_5 = null;
                        if (var2_2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var3_3);
                            var6_6 = false;
                            var2_2 = null;
                        }
                        var2_2 = var2_2.Q();
                        if (!var1_1) ** GOTO lbl17
                        if (var2_2 != null) {
                            var7_7 = var2_2.getInactiveImageUrl();
                        } else {
                            while (true) {
                                var7_7 = null;
                                break block14;
                                break;
                            }
lbl17:
                            // 1 sources

                            if (var2_2 == null || (var7_7 = var2_2.getAlternateData()) == null) ** continue;
                            var7_7 = var7_7.getInactiveImageUrl();
                        }
                    }
                    var8_8 = "";
                    if (!(var1_1 != false ? var2_2 == null || (var9_9 = var2_2.getName()) == null : var2_2 == null || (var9_9 = var2_2.getAlternateData()) == null || (var9_9 = var9_9.getName()) == null)) {
                        var8_8 = var9_9;
                    }
                    if (var7_7 == null) break block15;
                    var9_9 = this.k;
                    if (var9_9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var3_3);
                        var9_9 = null;
                    }
                    if ((var3_3 = (var3_3 = var9_9.k1()) != null ? var3_3.getCustomView() : null) == null) break block15;
                    if (var1_1) {
                        if (var2_2 != null) {
                            var5_5 = var2_2.getInactiveAltText();
                        }
                        var3_3.setContentDescription((CharSequence)var5_5);
                    } else {
                        if (var2_2 != null && (var10_10 = var2_2.getAlternateData()) != null) {
                            var5_5 = var10_10.getInactiveAltText();
                        }
                        var3_3.setContentDescription((CharSequence)var5_5);
                    }
                    var1_1 = R$id.tab_icon;
                    var10_10 = (ImageView)var3_3.findViewById((int)var1_1);
                    var6_6 = URLUtil.isValidUrl((String)var7_7);
                    if (var6_6) break block16;
                    cp_1.Companion.getClass();
                    cp$a.e().getClass();
                    Intrinsics.checkNotNullParameter(var7_7, "mediaURL");
                    var2_2 = null;
                    var5_5 = "android.resource://";
                    var6_6 = StringsKt.F((CharSequence)var7_7, var5_5, false);
                    if (!var6_6) break block17;
                }
                var2_2 = new da$a();
                var2_2.x = var4_4 = true;
                var2_2.y = var7_7;
                var2_2.n = var7_7;
                var2_2.u = var10_10;
                var2_2.a();
            }
            var1_1 = R$id.tab_title;
            var10_10 = (TextView)var3_3.findViewById((int)var1_1);
            var10_10.setText((CharSequence)var8_8);
        }
    }

    public final void u4() {
    }

    public final void ub() {
        Object object = sq0_1.a;
        object = this.t1;
        if (object == null || (object = ((BannerData)object).getBannerUrl()) == null) {
            object = "";
        }
        Object object2 = this.Ua((String)object);
        Object object3 = "fleek_ingress_banner";
        Object object4 = "explore ajio fleek";
        Object object5 = "";
        boolean bl2 = true;
        sq0_1.i("ingress screen", (String)object2, (String)object3, (String)object4, (String)object5, bl2);
        object = this.g;
        Object object6 = null;
        if (object != null) {
            object = this.p1;
            object2 = null;
            object = ow_0.c(0, (String)object);
        } else {
            object = null;
        }
        if (object != null) {
            this.Ib((String)object);
        }
        object2 = eb_2.a;
        object2 = this.t1;
        if (object2 != null) {
            object6 = ((BannerData)object2).getCtaSettings();
        }
        eb_2.b = object6;
        object6 = AjioVideoPlayerFullScreenFragment.Companion;
        object2 = this.t1;
        object6.getClass();
        object5 = AjioVideoPlayerFullScreenFragment$a.a((BannerData)object2, (String)object);
        object = this.requireActivity();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity");
        object3 = object;
        object3 = (AjioHomeActivity)object;
        object4 = ((AjioHomeActivity)object3).T0;
        String string2 = Reflection.getOrCreateKotlinClass(AjioVideoPlayerFullScreenFragment.class).getSimpleName();
        Boolean bl3 = Boolean.FALSE;
        ((AjioHomeActivity)object3).Q1((Fragment)object4, (Fragment)object5, true, string2, bl3);
    }

    public final void vb(boolean bl2) {
        BannerData bannerData = this.t1;
        if (bannerData != null) {
            String string2;
            Object object;
            Object object2;
            Object object3;
            int n3;
            int n4 = bannerData.getWidth();
            int n7 = bannerData.getHeight();
            Object object4 = new ConstraintLayout$LayoutParams(n4, n7);
            ImageView imageView = this.d1;
            if (imageView != null) {
                ai0_2.a((View)imageView);
            }
            if ((imageView = this.g1) != null) {
                imageView.setLayoutParams((ViewGroup.LayoutParams)object4);
            }
            object4 = this.b1;
            n4 = 0;
            imageView = null;
            n7 = 1;
            if (object4 != null && (n3 = object4.getVisibility()) != 0) {
                object4 = this.S0;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appPreferences");
                    n3 = 0;
                    object4 = null;
                }
                AJIOApplication.Companion.getClass();
                object3 = AJIOApplication$a.a();
                object2 = new jo_2((Context)object3);
                object3 = "widget_max_apperance_count";
                int n8 = ((sw_0)object2).getPreference((String)object3, 0) + n7;
                ((sw_0)object4).putPreference((String)object3, n8);
            }
            if ((object4 = this.b1) != null) {
                ai0_2.B((View)object4);
            }
            if ((object4 = this.g1) != null) {
                ai0_2.B((View)object4);
            }
            if ((object4 = this.c1) != null) {
                ai0_2.i((View)object4);
            }
            if ((object4 = this.f1) != null) {
                ai0_2.i((View)object4);
            }
            if ((object4 = this.e1) != null) {
                ai0_2.B((View)object4);
            }
            if ((object4 = this.g1) != null) {
                if (bl2) {
                    object = new da$a();
                    ((da$a)object).k = n7;
                    ((da$a)object).r = n7;
                    ((da$a)object).p = string2 = bannerData.getAltText();
                    string2 = bannerData.getBannerUrl();
                    ((da$a)object).n = string2;
                    ((da$a)object).u = object4;
                    ((da$a)object).a();
                } else {
                    object = new da$a();
                    ((da$a)object).k = n7;
                    ((da$a)object).r = n7;
                    ((da$a)object).p = object2 = bannerData.getAltText();
                    ((da$a)object).n = object2 = bannerData.getBannerUrl();
                    ((da$a)object).u = object4;
                    ((da$a)object).i = n7;
                    ((da$a)object).a();
                }
            }
            object = sq0_1.a;
            object = bannerData.getBannerUrl();
            if (object == null) {
                object = "";
            }
            object2 = this.Ua((String)object);
            object3 = "fleek_ingress_banner";
            String string3 = "explore ajio fleek";
            string2 = "ingress screen";
            String string4 = "";
            sq0_1.i(string2, (String)object2, (String)object3, string3, string4, false);
            object = h40_0.a;
            object = "autoDismissDuration";
            Intrinsics.checkNotNullParameter(object, "key");
            bannerData = h40_0.z();
            n3 = (int)(bannerData.has((String)object) ? 1 : 0);
            if (n3 != 0) {
                n4 = bannerData.getInt((String)object);
            }
            long l2 = n4 *= 1000;
            object = new s9(this, l2);
            object.start();
        }
    }

    public final void w9() {
        boolean bl2;
        qo_0.b = bl2 = true;
        Object object = this.X;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ajiohomeViewModel");
            bl2 = false;
            object = null;
        }
        if (bl2 = w61_0.b((String)(object = ((x9_0)object).r))) {
            object = this.Z;
            if (object == null) {
                object = "commonCmsViewDelegate";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object2 = object;
            }
            ((e00)object2).l();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void wb(boolean var1_1) {
        block15: {
            block17: {
                block16: {
                    block14: {
                        var2_2 = this.k;
                        var3_3 = "homeListener";
                        var4_4 = false;
                        var5_5 = null;
                        if (var2_2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var3_3);
                            var6_6 = false;
                            var2_2 = null;
                        }
                        var2_2 = var2_2.Q();
                        if (!var1_1) ** GOTO lbl17
                        if (var2_2 != null) {
                            var7_7 = var2_2.getInactiveImageUrl();
                        } else {
                            while (true) {
                                var7_7 = null;
                                break block14;
                                break;
                            }
lbl17:
                            // 1 sources

                            if (var2_2 == null || (var7_7 = var2_2.getAlternateData()) == null) ** continue;
                            var7_7 = var7_7.getInactiveImageUrl();
                        }
                    }
                    var8_8 = "";
                    if (!(var1_1 != false ? var2_2 == null || (var9_9 = var2_2.getName()) == null : var2_2 == null || (var9_9 = var2_2.getAlternateData()) == null || (var9_9 = var9_9.getName()) == null)) {
                        var8_8 = var9_9;
                    }
                    if (var7_7 == null) break block15;
                    var9_9 = this.k;
                    if (var9_9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var3_3);
                        var9_9 = null;
                    }
                    if ((var3_3 = (var3_3 = var9_9.G1()) != null ? var3_3.getCustomView() : null) == null) break block15;
                    if (var1_1) {
                        if (var2_2 != null) {
                            var5_5 = var2_2.getInactiveAltText();
                        }
                        var3_3.setContentDescription((CharSequence)var5_5);
                    } else {
                        if (var2_2 != null && (var10_10 = var2_2.getAlternateData()) != null) {
                            var5_5 = var10_10.getInactiveAltText();
                        }
                        var3_3.setContentDescription((CharSequence)var5_5);
                    }
                    var1_1 = R$id.tab_icon;
                    var10_10 = (ImageView)var3_3.findViewById((int)var1_1);
                    var6_6 = URLUtil.isValidUrl((String)var7_7);
                    if (var6_6) break block16;
                    cp_1.Companion.getClass();
                    cp$a.e().getClass();
                    Intrinsics.checkNotNullParameter(var7_7, "mediaURL");
                    var2_2 = null;
                    var5_5 = "android.resource://";
                    var6_6 = StringsKt.F((CharSequence)var7_7, var5_5, false);
                    if (!var6_6) break block17;
                }
                var2_2 = new da$a();
                var2_2.x = var4_4 = true;
                var2_2.y = var7_7;
                var2_2.n = var7_7;
                var2_2.u = var10_10;
                var2_2.a();
            }
            var1_1 = R$id.tab_title;
            var10_10 = (TextView)var3_3.findViewById((int)var1_1);
            var10_10.setText((CharSequence)var8_8);
        }
    }

    public final void xb(LocationData locationData) {
        block6: {
            Object object;
            block7: {
                object = this.gb();
                boolean bl2 = ((hy3_0)object).p();
                if (!bl2) break block6;
                object = this.S0;
                Object object2 = null;
                String string2 = "appPreferences";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    object = null;
                }
                if ((object = ((jo_2)object).i()) == null) break block7;
                object = LocationData.Companion;
                jo_2 jo_22 = this.S0;
                if (jo_22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object2 = jo_22;
                }
                object2 = ((jo_2)object2).i();
                bl2 = ((LocationData$Companion)object).isDiffLocaleData((LocationData)object2, locationData);
                if (!bl2) break block6;
            }
            object = AnalyticsManager.Companion.getInstance().getCt();
            ((CleverTapEvents)object).pushLocaleData(locationData);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void yb(int var1_1, boolean var2_2) {
        block17: {
            block20: {
                block18: {
                    block19: {
                        block16: {
                            var3_3 = this.v2;
                            if (var3_3) {
                                return;
                            }
                            var4_4 = this.X;
                            var5_5 = "ajiohomeViewModel";
                            var6_6 = null;
                            if (var4_4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var5_5);
                                var3_3 = false;
                                var4_4 = null;
                            }
                            var4_4.getClass();
                            var7_7 = hu1_2.d();
                            if (var7_7 != 0 && (var7_7 = var4_4.t) != 0) {
                                var8_8 = "";
                                var4_4.r = var8_8;
                            }
                            if ((var7_7 = og1_1.c()) != 0) break block16;
                            var7_7 = var4_4.t;
                            if (var7_7 != 0 && (var8_8 = var4_4.I) != null) {
                                Intrinsics.checkNotNull(var8_8);
                                var7_7 = var8_8.size();
                                if (var7_7 > var1_1 && var1_1 >= 0) {
                                    var8_8 = var4_4.I;
                                    if (var8_8 == null || (var9_9 = (NativeCategoryNavigationListDetail)var8_8.get(var1_1)) == null || (var9_9 = var9_9.getNativeCategoryPageId()) == null) {
                                        var9_9 = var4_4.r;
                                    }
                                    var4_4.r = var9_9;
                                }
                            }
                            break block17;
                        }
                        var7_7 = og1_1.c();
                        if (var7_7 == 0) break block17;
                        var7_7 = var4_4.t;
                        if (var7_7 == 0) break block18;
                        var7_7 = -1;
                        if (var1_1 != var7_7) break block19;
                        var9_9 = x9_0.d();
                        break block20;
                    }
                    var8_8 = var4_4.D;
                    if (var8_8 == null) ** GOTO lbl-1000
                    Intrinsics.checkNotNull(var8_8);
                    var7_7 = var8_8.size();
                    if (var7_7 > var1_1 && var1_1 >= 0) {
                        var8_8 = var4_4.D;
                        if (var8_8 == null || (var9_9 = (NativeCategoryNavigationListDetail)var8_8.get(var1_1)) == null || (var9_9 = var9_9.getNativeCategoryPageId()) == null) {
                            var9_9 = var4_4.r;
                        }
                    } else lbl-1000:
                    // 2 sources

                    {
                        var9_9 = var4_4.r;
                    }
                    break block20;
                }
                var9_9 = var4_4.r;
            }
            var4_4.r = var9_9;
        }
        if ((var9_9 = this.X) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var5_5);
            var1_1 = 0;
            var9_9 = null;
        }
        var4_4 = var9_9.B;
        var9_9 = var9_9.r;
        if ((var9_9 = (BaseResponse)var4_4.get(var9_9)) == null || var2_2) ** GOTO lbl-1000
        var10_10 = this.S0;
        if (var10_10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appPreferences");
            var2_2 = false;
            var10_10 = null;
        }
        var4_4 = "SHOULD_REFRESH_HOME_PAGE";
        var7_7 = 0;
        var8_8 = null;
        var2_2 = var10_10.getPreference((String)var4_4, false);
        if (!var2_2) {
            this.jb((BaseResponse)var9_9);
        } else lbl-1000:
        // 2 sources

        {
            if ((var9_9 = this.X) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var5_5);
            } else {
                var6_6 = var9_9;
            }
            var1_1 = (int)var6_6.u;
            if (var1_1 != 0) {
                return;
            }
            this.ob();
        }
    }

    public final void z4() {
        Object object = this.X;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ajiohomeViewModel");
            object = null;
        }
        if ((object = ((x9_0)object).G) != null && (object = ((oo_0)object).e) != null) {
            object.completeUpdate();
        }
    }

    public final void z8(CartDeliveryAddress object) {
        boolean bl2;
        int n3;
        boolean bl3;
        Intrinsics.checkNotNullParameter(object, "address");
        ShimmerFrameLayout shimmerFrameLayout = this.I;
        Object object2 = this.J;
        hv3_0.r0(shimmerFrameLayout, (View)object2);
        shimmerFrameLayout = this.Q1;
        if (shimmerFrameLayout != null) {
            ai0_2.i((View)shimmerFrameLayout);
        }
        this.H2 = bl3 = true;
        object2 = this.w0;
        if (object2 != null) {
            ((BottomSheetDialogFragment)object2).dismissAllowingStateLoss();
        }
        if ((object2 = this.v0) != null) {
            ((BottomSheetDialogFragment)object2).dismissAllowingStateLoss();
        }
        object2 = AddressType.Address;
        ((CartDeliveryAddress)object).setAddressType((AddressType)((Object)object2));
        object2 = ((CartDeliveryAddress)object).getFormattedAddress();
        if (object2 == null || (n3 = ((String)object2).length()) == 0) {
            object2 = ai0_2.g((CartDeliveryAddress)object);
            ((CartDeliveryAddress)object).setFormattedAddress((String)object2);
        }
        object2 = this.S0;
        Object object3 = null;
        String string2 = "appPreferences";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
        }
        ((jo_2)object2).F((CartDeliveryAddress)object);
        object2 = this.S0;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
        }
        String string3 = ((CartDeliveryAddress)object).getPostalCode();
        ((jo_2)object2).G(string3);
        object2 = this.S0;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object3 = object2;
        }
        object2 = "SHOULD_PINCODE_REFRESH_HOME_PAGE";
        ((sw_0)object3).putPreference((String)object2, bl3);
        this.Lb((CartDeliveryAddress)object);
        object = this.Y;
        if (object != null && (bl2 = ((gj2_1)object).a) == bl3) {
            object = this.z0;
            if (object != null) {
                object.a();
            }
        } else {
            this.Qa();
        }
    }

    public final void zb() {
        Object object;
        boolean bl2 = this.q1;
        if (bl2) {
            int n3;
            Object object2 = this.f1;
            if (object2 != null) {
                n3 = R$string.video_mute;
                object = hv3_0.K(n3);
                object2.setContentDescription((CharSequence)object);
            }
            if ((object2 = this.g) != null) {
                ((ob_2)object2).n();
            }
            if ((object2 = this.f1) != null) {
                n3 = R$drawable.ic_unmute;
                object2.setImageResource(n3);
            }
        } else {
            int n4;
            Object object3 = this.f1;
            if (object3 != null) {
                n4 = R$string.video_unmute;
                object = hv3_0.K(n4);
                object3.setContentDescription((CharSequence)object);
            }
            if ((object3 = this.g) != null) {
                ((ob_2)object3).i();
            }
            if ((object3 = this.f1) != null) {
                n4 = R$drawable.ic_mute;
                object3.setImageResource(n4);
            }
        }
        this.q1 = bl2 = this.q1 ^ true;
        object = VideoComponentEvents.Companion.getInstance();
        boolean bl3 = this.q1;
        String string2 = ai0_2.h(this.p1);
        long l2 = this.n1;
        ((VideoComponentEvents)object).logMuteUnMuteEvent("video_banner_interactions", true, bl3, string2, false, l2, "video_screen_interaction");
    }
}

