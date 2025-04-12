/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.content.Intent
 *  android.graphics.Typeface
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.CountDownTimer
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager$b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.getkeepsafe.taptargetview.TapTargetView$Listener;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.gson.Gson;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.events.PlpListViewEvents;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.CircularImageView;
import com.ril.ajio.customviews.widgets.ImageSearchCategoryWidget;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.earlyaccess.entity.EarlyAccessBannerData;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.kmm.shared.model.request.HomeReq;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.plp.PLPExtras;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.FacetValue;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.BannerAdTargetedFormulaData;
import com.ril.ajio.services.data.Product.BrandDetails;
import com.ril.ajio.services.data.Product.JioBannerAdsPLPFacet;
import com.ril.ajio.services.data.Product.JioBannerAdsPLPFacetData;
import com.ril.ajio.services.data.Product.NewUserBanner;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.PriceRevealMetaInfo;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.Product.SaleGAData;
import com.ril.ajio.services.data.Sort;
import com.ril.ajio.services.data.user.AppliedFacetValue;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from Q22
 */
public abstract class q22_0
extends Z51
implements M82,
OnNavigationClickListener,
ik3_2,
jv2_0,
xE3,
Cw2,
WA,
yv0_1,
hZ1$e,
s82_0,
J43,
Ev2 {
    public static final Q22$a Companion;
    public final hh3_2 A;
    public int A0;
    public RecyclerView B;
    public int B0;
    public ImageSearchCategoryWidget C;
    public final NewEEcommerceEventsRevamp C0;
    public RecyclerView D;
    public final NewCustomEventsRevamp D0;
    public View E;
    public String E0;
    public View F;
    public String F0;
    public View G;
    public Yj2 G0;
    public View H;
    public boolean H0;
    public Toolbar I;
    public CircularImageView I0;
    public View J;
    public MenuItem J0;
    public View K;
    public boolean K0;
    public TextView L;
    public n32_0 L0;
    public TextView M;
    public Product M0;
    public ShimmerFrameLayout N;
    public final hh3_2 N0;
    public View O;
    public final hh3_2 O0;
    public Q22$b P;
    public List P0;
    public CountDownTimer Q;
    public final hh3_2 Q0;
    public View R;
    public String R0;
    public TextView S;
    public CardView S0;
    public View T;
    public ImageView T0;
    public TextView U;
    public ma_2 U0;
    public TextView V0;
    public String W0;
    public boolean X;
    public final hh3_2 X0;
    public View Y;
    public final hh3_2 Y0;
    public AjioTextView Z;
    public String Z0;
    public int a1;
    public int b1;
    public CartDeliveryAddress c1;
    public gj2_1 d1;
    public final hh3_2 e1;
    public final hh3_2 f1;
    public List g;
    public final hh3_2 g1;
    public String h;
    public final Q22$c h1;
    public fv_0 i;
    public String j;
    public final hh3_2 k;
    public AjioTextView k0;
    public final int l;
    public final int m;
    public final ArrayList n;
    public j3_0 o;
    public fo3 p;
    public AjioTextView p0;
    public vh3_2 q;
    public View q0;
    public A71 r;
    public int r0;
    public ea2_1 s;
    public boolean s0;
    public hZ1 t;
    public pg2_2 t0;
    public lz1_1 u;
    public View u0;
    public View v;
    public LottieAnimationView v0;
    public View w;
    public ArrayList w0;
    public View x;
    public boolean x0;
    public View y;
    public boolean y0;
    public CardView z;
    public String z0;

    static {
        Q22$a q22$a;
        Companion = q22$a = new Object();
    }

    public q22_0() {
        int n3;
        new ArrayList();
        Object object = "";
        this.j = object;
        Object object2 = new L22(this);
        this.k = object2 = yr1_2.b((Function0)object2);
        this.l = n3 = 1;
        this.m = 2;
        Object object3 = new ArrayList();
        this.n = object3;
        object3 = new M22(this, 0);
        this.A = object3 = yr1_2.b((Function0)object3);
        object3 = new ArrayList();
        this.w0 = object3;
        this.x0 = n3;
        this.z0 = object;
        this.B0 = n3;
        object2 = AnalyticsManager.Companion;
        this.C0 = object3 = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp();
        this.D0 = object2 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        this.E0 = object2 = ((NewEEcommerceEventsRevamp)object3).getPrevScreen();
        this.F0 = object2 = ((NewEEcommerceEventsRevamp)object3).getPrevScreenType();
        object2 = new N22(this);
        this.N0 = object2 = yr1_2.b((Function0)object2);
        object2 = new ob_0(this, 1);
        this.O0 = object2 = yr1_2.b((Function0)object2);
        object2 = new ArrayList();
        this.P0 = object2;
        object2 = new O22(this);
        this.Q0 = object2 = yr1_2.b((Function0)object2);
        this.W0 = object;
        object2 = new qb_0(1);
        this.X0 = object2 = yr1_2.b((Function0)object2);
        object2 = new Object();
        this.Y0 = object2 = yr1_2.b((Function0)object2);
        this.Z0 = object;
        object = new up0_2(this, 1);
        this.e1 = object = yr1_2.b((Function0)object);
        object = new s22(this, 0);
        this.f1 = object = yr1_2.b((Function0)object);
        object = new t22(this);
        this.g1 = object = yr1_2.b((Function0)object);
        this.h1 = object = new Q22$c(this);
    }

    public static void Gb() {
        Object object = StringCompanionObject.INSTANCE;
        object = hv3_0.K(R$string.acc_error_message);
        String string2 = hv3_0.K(R$string.plp_similar_products_error);
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        object = xh2_0.a(objectArray, n3, (String)object, "format(...)");
        string2 = hv3_0.K(R$string.plp_similar_products_error);
        hv3_0.o0(0, string2, (String)object);
    }

    public static void pb(Product object) {
        boolean bl2 = el1_2.l();
        if (bl2) {
            bl2 = false;
            Object object2 = object != null ? ((Product)object).getAdsData() : null;
            if (object2 != null) {
                object2 = el1_2.e(yt2_2.PLP, (Product)object);
                Intrinsics.checkNotNull(object2);
                Object object3 = new Gson();
                object = ((Product)object).getAdsData();
                object = ((Gson)object3).toJson(object);
                Intrinsics.checkNotNullExpressionValue(object, "toJson(...)");
                Intrinsics.checkNotNullParameter(object2, "productId");
                Intrinsics.checkNotNullParameter(object, "jioAdsTrackerJson");
                object3 = "adSize";
                Object object4 = "";
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                boolean bl3 = el1_2.j();
                if (bl3) {
                    object3 = el1_2.b;
                    object4 = new kl1_1((String)object, (String)object2, null);
                    int n3 = 3;
                    Ae3.d((i90_0)object3, null, null, (Function2)object4, n3);
                }
            }
        }
    }

    public final HashSet A2(String hashSet) {
        Object object = "facetName";
        Intrinsics.checkNotNullParameter(hashSet, (String)object);
        Object object2 = this.cb();
        object2.getClass();
        Intrinsics.checkNotNullParameter(hashSet, (String)object);
        object2 = ((F12)object2).d;
        object2.getClass();
        Intrinsics.checkNotNullParameter(hashSet, (String)object);
        object = ((bv2_0)object2).V;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            hashSet = (HashSet)((HashMap)object).get(hashSet);
        } else {
            hashSet = null;
        }
        if (hashSet == null) {
            hashSet = new HashSet();
        }
        return hashSet;
    }

    public final void Ab() {
        int n3;
        Object object;
        Object object2;
        Object object3 = this.B;
        if (object3 != null) {
            object2 = this.P;
            Intrinsics.checkNotNull(object2);
            ((RecyclerView)object3).addOnScrollListener((RecyclerView$s)object2);
        }
        if ((object3 = this.B) != null && (object3 = ((RecyclerView)object3).getAdapter()) != null) {
            object3 = (q22)object3;
            object2 = this.G0;
            if (object2 == null) {
                object2 = Yj2.GRID;
            }
            object = "<set-?>";
            Intrinsics.checkNotNullParameter(object2, (String)object);
            ((q22)object3).e = object2;
        }
        if ((object3 = this.T0) != null) {
            object2 = this.G0;
            object = Yj2.LIST;
            if (object2 == object) {
                int n4 = R$drawable.ic_plp_grid_view;
                object3.setBackgroundResource(n4);
                object2 = object3.getContext();
                n3 = R$string.acc_grid_view;
                object2 = object2.getString(n3);
                object3.setContentDescription((CharSequence)object2);
            } else {
                int n7 = R$drawable.ic_plp_list_view;
                object3.setBackgroundResource(n7);
                object2 = object3.getContext();
                n3 = R$string.acc_list_view;
                object2 = object2.getString(n3);
                object3.setContentDescription((CharSequence)object2);
            }
        }
        if ((object3 = this.G0) == (object2 = Yj2.LIST)) {
            object2 = this.requireActivity();
            object3 = new LinearLayoutManager((Context)object2);
        } else {
            object2 = this.getContext();
            n3 = 2;
            object3 = new GridLayoutManager((Context)object2, n3);
            object2 = new Q22$f(this);
            ((GridLayoutManager)object3).setSpanSizeLookup((GridLayoutManager$b)object2);
        }
        object2 = this.B;
        if (object2 != null) {
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object3);
        }
    }

    public abstract void Bb(CartDeliveryAddress var1);

    public final void C(Product object, String object2) {
        int n3;
        if (object != null && (object2 = ((Product)object).getFnlColorVariantData()) != null && (object2 = ((ProductFnlColorVariantData)object2).getColorGroup()) != null && (n3 = ((String)object2).length()) > 0) {
            this.Ua().startLoader();
            this.cb().e.c = object;
            object = this.cb();
            object.getClass();
            Intrinsics.checkNotNullParameter(object2, "productCode");
            aW aW2 = md3_0.c((jD3)object);
            H12 h12 = new H12((F12)object, (String)object2, null);
            int n4 = 3;
            Ae3.d(aW2, null, null, h12, n4);
        }
    }

    public final void C2(int n3, int n4, int n7, String string2, String string3) {
        AnalyticsData analyticsData;
        Object object;
        Object object2 = this.cb().d;
        object2.getClass();
        Bundle bundle = object;
        object = new Bundle();
        object.putInt("no_of_filters", n3);
        object.putInt("position_of_click", n7);
        object.putInt("position_of_filter", n4);
        object = analyticsData;
        analyticsData = new AnalyticsData(null, null, null, 0L, null, null, null, null, null, bundle, null, null, null, null, null, null, 65023, null);
        object = new StringBuilder();
        String string4 = string2;
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("-");
        string4 = string3;
        ((StringBuilder)object).append(string3);
        String string5 = ((StringBuilder)object).toString();
        Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
        object = AnalyticsManager.Companion;
        GTMEvents gTMEvents = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        String string6 = av_0.a((AnalyticsManager$Companion)object);
        gTMEvents.gtmEventsToGaWithCategory("widget interaction", "widget_interaction_visual_filter", "visual filter - widget clicks", string5, string6, analyticsData);
        string4 = new Bundle();
        String string7 = ((bv2_0)object2).h1;
        string4.putString("plp_source", string7);
        string7 = ((bv2_0)object2).i1;
        string4.putString("plp_source_details", string7);
        object2 = ((bv2_0)object2).g1;
        String string8 = ((NewCustomEventsRevamp)object2).getEC_PRODUCT_LIST_INTERACTIONS();
        String string9 = o72_0.a;
        String string10 = bv_0.a((AnalyticsManager$Companion)object);
        String string11 = cv_0.a((AnalyticsManager$Companion)object);
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, string8, "visual filter applied", "", "plp_visual_filter_applied", string9, "plp screen", string10, (Bundle)string4, string11, false, null, 1536, null);
    }

    public final void C6() {
        this.cb().d.getClass();
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        GTMEvents gTMEvents = analyticsManager$Companion.getInstance().getGtmEvents();
        String string2 = av_0.a(analyticsManager$Companion);
        GTMEvents.gtmEventsToGaWithCategory$default(gTMEvents, "widget interaction", "widget_impression_nudget", "nudget view", "", string2, null, 32, null);
    }

    public abstract void Cb();

    public abstract void Db(String var1);

    public abstract void Eb(String var1, String var2);

    public final void F(Product product, int n3, String string2) {
        Object object = "listType";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        if (product != null) {
            object = product.getFnlColorVariantData();
            string2 = null;
            if ((object = object != null ? ((ProductFnlColorVariantData)object).getColorGroup() : null) != null) {
                object = product.getFnlColorVariantData();
                Object object2 = object != null ? (object = ((ProductFnlColorVariantData)object).getColorGroup()) : null;
                Intrinsics.checkNotNull(object2);
                object = product.getPrice();
                if (object != null) {
                    string2 = ((Price)object).getDisplayformattedValue();
                }
                String string3 = String.valueOf(string2);
                int n4 = -1;
                this.S6((String)object2, n4, product, string3, null, null);
            }
        }
    }

    public final void F0(Facet facet) {
        bv2_0 bv2_02 = this.cb().d;
        String string2 = facet != null ? facet.getCode() : null;
        bv2_02.Y = string2;
        bv2_02 = this.cb().d;
        bv2_02.X = facet;
        facet = this.J;
        if (facet != null) {
            facet.performClick();
        }
    }

    public final void Fb(int n3, View view) {
        Object object = cp_1.Companion;
        object.getClass();
        int n4 = cp$a.h();
        if (n4 == 0) {
            object = this.cb().d;
            object.getClass();
            int n7 = og1_1.c();
            String string2 = "PLP_VIEW_TOGGLE_COACH_MARK";
            Object object2 = "PLP_VIEW_TOGGLE_COACH_MARK_LUXE";
            int n8 = 1;
            object = ((bv2_0)object).v;
            if (n7 != 0 ? (n4 = ((sw_0)object).getPreference((String)object2, 0)) < n8 : (n4 = ((sw_0)object).getPreference(string2, 0)) < n8) {
                object = this.cb().d;
                object.getClass();
                n7 = og1_1.c();
                object = ((bv2_0)object).v;
                if (n7 != 0) {
                    n7 = ((sw_0)object).getPreference((String)object2, 0) + n8;
                    ((sw_0)object).putPreference((String)object2, n7);
                } else {
                    n7 = ((sw_0)object).getPreference(string2, 0) + n8;
                    ((sw_0)object).putPreference(string2, n7);
                }
                object2 = this.getActivity();
                int n10 = R$string.toggle_coach_mark_header;
                int n14 = R$string.toggle_coach_mark_desc;
                object = FontsManager.getInstance();
                AJIOApplication.Companion.getClass();
                AJIOApplication aJIOApplication = AJIOApplication$a.a();
                Typeface typeface = ((FontsManager)object).getTypefaceWithFont((Context)aJIOApplication, 10);
                object = FontsManager.getInstance();
                aJIOApplication = AJIOApplication$a.a();
                int n15 = 9;
                Typeface typeface2 = ((FontsManager)object).getTypefaceWithFont((Context)aJIOApplication, n15);
                v22_0 v22_02 = new TapTargetView$Listener();
                int n16 = 50;
                n8 = n3;
                iw_2.a((FragmentActivity)object2, view, n3, n10, n14, n16, typeface, typeface2, v22_02);
            }
        }
    }

    public final void Hb() {
        qn_2.Companion.getClass();
        Object object = new qn_2();
        Object object2 = new Bundle();
        boolean bl2 = true;
        object2.putBoolean("cart_tab_selection", bl2);
        ((Fragment)object).setArguments((Bundle)object2);
        object2 = this.Ua();
        Fragment fragment = this.Ua().y();
        j3$a.a((j3_0)object2, fragment, (Fragment)object, bl2, "CartFragment");
        Bundle bundle = new Bundle();
        object = String.valueOf(this.Va().d());
        bundle.putString("number_of_items_on_cart", (String)object);
        object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string2 = o72_0.a;
        Object object3 = ne_0.b(bundle);
        GTMEvents.pushButtonTapEvent$default((GTMEvents)object2, "Header Click", "Proceed to Bag", string2, (AnalyticsData)object3, null, 16, null);
        object3 = this.D0;
        String string3 = ((NewCustomEventsRevamp)object3).getEA_NAV_CLICK_HEADER();
        String string4 = ((NewCustomEventsRevamp)object3).getEN_NAV_CLICK();
        String string5 = o72_0.a;
        String string6 = this.E0;
        String string7 = this.F0;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, "buttonTap", string3, "bag button", string4, string5, "plp screen", string6, bundle, string7, false, null, 1536, null);
    }

    public final void I7(FacetValue facetValue, Facet facet) {
        block11: {
            StringBuilder stringBuilder;
            CharSequence charSequence;
            String string2;
            String string3;
            Object object;
            Object object2;
            Object object3;
            block14: {
                String string4;
                String string5;
                String string6;
                String string7;
                Object object4;
                Object object5;
                block12: {
                    block13: {
                        boolean bl2;
                        object3 = facetValue;
                        object5 = null;
                        if (facetValue != null) {
                            if (facet != null) {
                                object4 = facet.getCode();
                            } else {
                                bl2 = false;
                                object4 = null;
                            }
                            ((FacetValue)object3).setFacetCode((String)object4);
                        }
                        if (object3 == null || (object4 = this.cb().d.M) == null) break block11;
                        if (facet != null) {
                            object4 = facet.getName();
                        } else {
                            bl2 = false;
                            object4 = null;
                        }
                        if (object4 != null) {
                            object4 = facet.getName();
                            Intrinsics.checkNotNull(object4);
                            object4 = this.A2((String)object4);
                        } else {
                            object4 = new HashSet();
                        }
                        boolean bl3 = facetValue.getSelected();
                        string7 = "_";
                        string6 = "_AutoApplied";
                        string5 = "Selected";
                        string4 = "Visual Filter Clicked";
                        object2 = "-";
                        if (!bl3) break block12;
                        Object object6 = this.cb().d.S;
                        object = facetValue.getCode();
                        Intrinsics.checkNotNull(object);
                        ((HashMap)object6).put(object, object3);
                        object6 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        object = facet != null ? facet.getName() : null;
                        string3 = facet != null ? facet.getName() : null;
                        string2 = this.cb().d.x0;
                        object3 = facetValue.getName();
                        charSequence = o72_0.a;
                        stringBuilder = new StringBuilder(string5);
                        stringBuilder.append((String)object);
                        stringBuilder.append((String)object2);
                        stringBuilder.append(object4);
                        stringBuilder.append(string6);
                        X50.a(stringBuilder, string3, (String)object2, string2, "_DisableFilter-");
                        object3 = BW0.b(stringBuilder, (String)object3, string7, (String)charSequence);
                        object4 = o72_0.a;
                        ((GTMEvents)object6).pushButtonTapEvent(string4, object3, (String)object4);
                        boolean bl4 = true;
                        if (facet != null && (object4 = facet.getName()) != null && (object4 = facet.getCode()) != null && (bl2 = kotlin.text.b.i((String)(object4 = facet.getName()), (String)(object6 = "Rating"), bl4))) break block13;
                        if (facet != null) {
                            object5 = facet.getCode();
                        }
                        if (!(bl4 = kotlin.text.b.i((String)object5, (String)(object4 = "rating"), bl4))) break block14;
                    }
                    object3 = this.cb().d;
                    ((bv2_0)object3).I = object5 = Boolean.TRUE;
                    break block14;
                }
                Object object7 = this.cb().d.R;
                object = facetValue.getCode();
                Intrinsics.checkNotNull(object);
                ((HashMap)object7).put(object, object3);
                object7 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                object = facet != null ? facet.getName() : null;
                if (facet != null) {
                    object5 = facet.getName();
                }
                string3 = this.cb().d.x0;
                object3 = facetValue.getName();
                string2 = o72_0.a;
                charSequence = new StringBuilder(string5);
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append((String)object2);
                ((StringBuilder)charSequence).append(object4);
                ((StringBuilder)charSequence).append(string6);
                object4 = "_EnableFilter-";
                X50.a((StringBuilder)charSequence, (String)object5, (String)object2, string3, (String)object4);
                object3 = BW0.b((StringBuilder)charSequence, (String)object3, string7, string2);
                object5 = o72_0.a;
                ((GTMEvents)object7).pushButtonTapEvent(string4, object3, (String)object5);
            }
            object2 = this.cb();
            object3 = this.cb().d;
            object = ((bv2_0)object3).M;
            Intrinsics.checkNotNull(object);
            charSequence = null;
            stringBuilder = null;
            string3 = null;
            string2 = null;
            int n3 = 28;
            F12.j((F12)object2, (ProductsList)object, false, null, null, null, n3);
            this.P2();
        }
    }

    public abstract void Ib();

    public final void L(lv2 object) {
        Object object2 = "plpPeek";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = this.isAdded();
        if (bl2 && !(bl2 = this.isRemoving()) && (bl2 = this.isVisible()) && !(bl2 = this.isDetached())) {
            int n3;
            Object object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            Object object4 = o72_0.a;
            Object object5 = "pop_peek";
            Object object6 = "pop_peek_used";
            ((GTMEvents)object3).pushButtonTapEvent((String)object5, object6, (String)object4);
            object3 = this.bb().a.d();
            if (object3 != null) {
                String string2;
                object3 = (PLPExtras)this.bb().a.d();
                object4 = GAEcommerceEvents.INSTANCE;
                object5 = ((lv2)object).a;
                object6 = null;
                if (object5 == null || (string2 = ((Product)object5).getCatalogName()) == null) {
                    string2 = object5 != null ? ((Product)object5).getCatalog() : null;
                }
                ((GAEcommerceEvents)object4).getStoreTypeFromCatalog(string2);
                if (object3 != null) {
                    object6 = ((PLPExtras)object3).a;
                }
                if (object6 != null) {
                    int n4;
                    object4 = ((PLPExtras)object3).a;
                    Intrinsics.checkNotNull(object4);
                    n3 = (Integer)object4;
                    object5 = this.cb().d.l();
                    if (object5 != null && (n4 = ((String)object5).length()) != 0) {
                        object5 = this.cb().d;
                        ((bv2_0)object5).l();
                    }
                    ((lv2)object).d = n3;
                    ((lv2)object).e = object3 = ((PLPExtras)object3).j;
                }
            }
            if ((object3 = this.getArguments()) != null && (bl2 = (object3 = this.requireArguments()).containsKey((String)(object4 = "PLP_TYPE")))) {
                object3 = nv2_2.Companion;
                n3 = this.requireArguments().getInt((String)object4);
                object5 = this.cb().d.l();
                object3.getClass();
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = "storeType";
                Intrinsics.checkNotNullParameter(object5, (String)object2);
                int n7 = 101;
                object3 = "PLP_PEEK_STORE_TYPE";
                object6 = "PLP_PEEK";
                if (n3 == n7) {
                    object2 = new DF1();
                    object4 = new Bundle();
                    object4.putSerializable((String)object6, (Serializable)object);
                    object4.putString((String)object3, (String)object5);
                    ((Fragment)object2).setArguments((Bundle)object4);
                } else {
                    object2 = new nv2_2();
                    object4 = new Bundle();
                    object4.putSerializable((String)object6, (Serializable)object);
                    object4.putString((String)object3, (String)object5);
                    ((Fragment)object2).setArguments((Bundle)object4);
                }
                object = this.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(object, "getChildFragmentManager(...)");
                object3 = "PlpPeek";
                ((nv2_2)object2).show((FragmentManager)object, (String)object3);
            }
        }
    }

    public final void M3() {
        int n3;
        View view = this.T;
        if (view != null) {
            n3 = R$color.transparent;
            view.setBackgroundResource(n3);
        }
        if ((view = this.T) != null) {
            n3 = 1065353216;
            float f5 = 1.0f;
            view.setAlpha(f5);
        }
    }

    public final void P2() {
        Object object = this.N;
        View view = this.O;
        hv3_0.r0(object, view);
        object = this.B;
        int n3 = 8;
        if (object != null) {
            object.setVisibility(n3);
        }
        if ((object = this.E) != null) {
            object.setVisibility(n3);
        }
        if ((object = this.G) != null) {
            object.setVisibility(n3);
        }
    }

    public final void Q8(int n3, FacetValue facetValue) {
        Object object;
        int n4;
        Object object2;
        int n7 = n3;
        Object object3 = facetValue;
        Object object4 = "facetValue";
        Intrinsics.checkNotNullParameter(facetValue, (String)object4);
        this.P2();
        Object object5 = this.t;
        if (object5 != null) {
            object2 = ((hZ1)object5).b;
            ((ArrayList)object2).remove(n3);
            ((RecyclerView$f)object5).notifyItemRemoved(n3);
            int n8 = ((ArrayList)object2).size();
            ((RecyclerView$f)object5).notifyItemRangeChanged(n3, n8);
        }
        object5 = this.cb().d;
        Boolean bl2 = Boolean.TRUE;
        object5.getClass();
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        object4 = ((bv2_0)object5).R;
        object2 = ((bv2_0)object5).S;
        Object object6 = facetValue.getCode();
        if (object6 != null) {
            object6 = facetValue.getCode();
            Intrinsics.checkNotNull(object6);
            ((HashMap)object2).put(object6, object3);
            object2 = facetValue.getCode();
            Intrinsics.checkNotNull(object2);
            ((HashMap)object4).remove(object2);
        }
        if ((object4 = ((bv2_0)object5).i0) != null) {
            object2 = facetValue.getCode();
            object4 = (Integer)object4.get(object2);
        } else {
            n4 = 0;
            object4 = null;
        }
        int n10 = 1;
        if (object4 != null) {
            object2 = ((bv2_0)object5).i0;
            if (object2 != null) {
                object6 = String.valueOf(facetValue.getCode());
                n4 = (Integer)object4 - n10;
                object4 = n4;
                object4 = (Integer)((HashMap)object2).put(object6, object4);
            }
        } else {
            object4 = ((bv2_0)object5).i0;
            if (object4 != null) {
                object2 = String.valueOf(facetValue.getCode());
                object6 = 0;
                object4 = (Integer)((HashMap)object4).put(object2, object6);
            }
        }
        object6 = ((bv2_0)object5).M;
        Intrinsics.checkNotNull(object6);
        String string2 = null;
        n4 = 52;
        boolean bl3 = true;
        object2 = object5;
        int n14 = 1;
        n10 = n4;
        bv2_0.B((bv2_0)object5, (ProductsList)object6, bl3, false, bl2, null, null, n4);
        object4 = ((bv2_0)object5).i0;
        if (object4 != null) {
            object2 = facetValue.getFacetCode();
            object = object4 = (Integer)object4.get(object2);
        } else {
            object = null;
        }
        if (object != null) {
            object4 = ((bv2_0)object5).i0;
            if (object4 != null) {
                object2 = String.valueOf(facetValue.getFacetCode());
                int n15 = (Integer)object - n14;
                object6 = n15;
                object4 = (Integer)((HashMap)object4).put(object2, object6);
            }
        } else {
            object4 = ((bv2_0)object5).i0;
            if (object4 != null) {
                object2 = String.valueOf(facetValue.getFacetCode());
                object6 = 0;
                object4 = (Integer)((HashMap)object4).put(object2, object6);
            }
        }
        if ((object4 = facetValue.getFacetCode()) != null && (n4 = (int)(StringsKt.F((CharSequence)object4, (CharSequence)(object2 = "rating"), false) ? 1 : 0)) == n14) {
            ((bv2_0)object5).I = bl2;
        }
        this.cb().d.e1 = false;
        object4 = facetValue.getName();
        if (object4 != null) {
            object5 = this.cb().d;
            Object object7 = String.valueOf(n7 += n14);
            object3 = String.valueOf(facetValue.getFacetCode());
            object5.getClass();
            Intrinsics.checkNotNullParameter(object4, "filterName");
            object2 = dm_1.a((String)object7, "filterIndex", (String)object3, "filterCategory");
            object6 = "filter_category";
            object2.putString((String)object6, (String)object3);
            object2.putString("event_category", "product list interactions");
            string2 = "top filter remove";
            object2.putString("event_action", string2);
            String string3 = "event_label";
            object2.putString(string3, (String)object4);
            object4 = "remove_position";
            object2.putString((String)object4, (String)object7);
            object2.putString((String)object6, (String)object3);
            object7 = o72_0.a;
            object2.putString("screenname", (String)object7);
            object7 = ((bv2_0)object5).g1;
            object3 = "top_filter_remove";
            ((NewCustomEventsRevamp)object7).pushTopPLPFilterRemoveEvents((String)object3, (Bundle)object2);
        }
    }

    public final void R4(Product object, String object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "product");
        Intrinsics.checkNotNullParameter(object2, "itemCode");
        Object object3 = this.getActivity();
        if (object3 != null && !(bl2 = (object3 = this.requireActivity()).isFinishing())) {
            object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            Object object4 = o72_0.a;
            String string2 = "Add To Closet";
            Object object5 = "Closet Button";
            ((GTMEvents)object3).pushButtonTapEvent(string2, object5, (String)object4);
            object3 = this.cb();
            bl2 = ((F12)object3).g();
            object4 = null;
            if (!bl2) {
                object2 = this.cb().e;
                ((BH3)object2).b = object;
                object = this.u;
                if (object != null) {
                    object4 = object;
                } else {
                    object = "loginListener";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                }
                object = "source - add to closet";
                int n3 = 53;
                object4.z0(n3, (String)object);
            } else {
                object3 = this.getArguments();
                int n4 = 100;
                if (object3 != null && (bl2 = (object3 = this.requireArguments()).containsKey((String)(object5 = "PLP_TYPE")))) {
                    object3 = this.requireArguments();
                    n4 = object3.getInt((String)object5, n4);
                }
                this.Ua().startLoader();
                this.cb().e.b = object;
                object = this.cb();
                object.getClass();
                Intrinsics.checkNotNullParameter(object2, "productCode");
                object3 = md3_0.c((jD3)object);
                object5 = new G12(n4, (F12)object, (String)object2, null);
                int n7 = 3;
                Ae3.d((i90_0)object3, null, null, (Function2)object5, n7);
            }
        }
    }

    public final void Ra(int n3) {
        Object object = this.w;
        if (object != null) {
            object.setVisibility(n3);
        }
        if ((object = this.z) != null) {
            object.setVisibility(n3);
        }
        if ((object = this.v) != null) {
            object.setVisibility(n3);
        }
        if ((object = this.E) != null) {
            object.setVisibility(n3);
        }
        if ((object = this.B) != null) {
            object.setVisibility(n3);
        }
        if ((object = this.I) != null) {
            object.setVisibility(n3);
        }
    }

    public final ArrayList S(ArrayList arrayList) {
        ArrayList arrayList2 = this.cb().d;
        arrayList2.getClass();
        if (arrayList != null) {
            arrayList2 = new ArrayList();
            su2_0 su2_02 = new su2_0((ru2_1)((Object)arrayList2));
            bx_2.q(arrayList, su2_02);
            arrayList2 = new ArrayList();
            int n3 = arrayList.size();
            int n4 = 5;
            if (n3 < n4) {
                n4 = arrayList.size();
            }
            n3 = 0;
            su2_02 = null;
            Uu2 uu2 = null;
            for (int i3 = 0; i3 < n4; ++i3) {
                Object e2 = arrayList.get(i3);
                arrayList2.add(e2);
            }
            ArrayList arrayList3 = new ArrayList();
            uu2 = new Uu2((tu2_1)((Object)arrayList3));
            bx_2.q(arrayList, uu2);
            arrayList3 = new ArrayList();
            arrayList3.addAll(arrayList);
            arrayList3.addAll(0, arrayList2);
            arrayList = arrayList3;
        }
        return arrayList;
    }

    /*
     * Unable to fully structure code
     */
    public final void S6(String var1_1, int var2_2, Product var3_3, String var4_4, SaleGAData var5_5, String var6_6) {
        block49: {
            block48: {
                block47: {
                    block46: {
                        var7_7 = this;
                        var8_8 = var1_1;
                        Intrinsics.checkNotNullParameter(var1_1, "productCode");
                        Intrinsics.checkNotNullParameter(var3_3, "clickedProduct");
                        var9_9 = var4_4;
                        Intrinsics.checkNotNullParameter(var4_4, "price");
                        var10_10 = this.bb().a.d();
                        var11_11 = null;
                        var12_12 = "";
                        if (var10_10 != null && (var10_10 = (PLPExtras)this.bb().a.d()) != null) {
                            var9_9 = var10_10.a;
                            if (var9_9 != null) {
                                Intrinsics.checkNotNull(var9_9);
                                var13_13 = var9_9.intValue();
                            } else {
                                var13_13 = 0;
                                var9_9 = null;
                            }
                            var14_14 = var10_10.j;
                            var15_15 = var10_10 = var10_10.l;
                            var16_16 = var14_14;
                            var17_17 = var13_13;
                        } else {
                            var16_16 = var12_12;
                            var17_17 = 0;
                            var14_14 = null;
                            var18_18 = 0;
                            var15_15 = null;
                        }
                        var10_10 = ld3_2.STORE_AJIO.getStoreId();
                        var9_9 = this.getArguments();
                        if (var9_9 != null && (var13_13 = (int)(var9_9 = this.requireArguments()).containsKey((String)(var19_19 = "PLP_TYPE"))) != 0) {
                            var10_10 = this.getArguments();
                            if (var10_10 != null) {
                                var20_20 = var10_10.getInt((String)var19_19);
                                var10_10 = var20_20;
                            } else {
                                var20_20 = 0;
                                var10_10 = null;
                            }
                            var10_10 = var10_10 != null && (var13_13 = var10_10.intValue()) == (var21_21 = 101) ? "luxe" : (var10_10 != null && (var20_20 = var10_10.intValue()) == (var13_13 = 103) ? "ajiogram" : "ajio");
                        }
                        var19_19 = var10_10;
                        var10_10 = var7_7.s;
                        if (var10_10 == null) {
                            var10_10 = "productDetailListener";
                            Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                            var13_13 = 0;
                            var9_9 = null;
                        } else {
                            var9_9 = var10_10;
                        }
                        var8_8 = var1_1;
                        var9_9.S0(var17_17, var1_1, (String)var19_19, (String)var16_16, (String)var15_15);
                        var10_10 = this.cb().d.s0;
                        if (var10_10 != null) {
                            var9_9 = "plp_page_title";
                            var10_10 = var10_10.get((String)var9_9);
                        } else {
                            var20_20 = 0;
                            var10_10 = null;
                        }
                        var10_10 = String.valueOf(var10_10);
                        var9_9 = Locale.getDefault();
                        var14_14 = "getDefault(...)";
                        Intrinsics.checkNotNullExpressionValue(var9_9, (String)var14_14);
                        var10_10 = var10_10.toLowerCase((Locale)var9_9);
                        Intrinsics.checkNotNullExpressionValue(var10_10, "toLowerCase(...)");
                        var9_9 = Ft2.a((String)var10_10, " - ");
                        var17_17 = (int)TextUtils.isEmpty((CharSequence)var9_9);
                        if (var17_17 != 0) {
                            var9_9 = var12_12;
                        }
                        var14_14 = this.cb().d.s0;
                        var8_8 = "null cannot be cast to non-null type kotlin.String";
                        var21_21 = 1;
                        if (var14_14 != null && (var18_18 = var14_14.containsKey((String)(var16_16 = "plp_source"))) == var21_21) {
                            var16_16 = var14_14.get((String)var16_16);
                            Intrinsics.checkNotNull(var16_16, (String)var8_8);
                            var16_16 = (String)var16_16;
                        } else {
                            var16_16 = var12_12;
                        }
                        if (var14_14 != null && (var22_22 = var14_14.containsKey((String)(var15_15 = "plp_source_details"))) == var21_21) {
                            var14_14 = var14_14.get((String)var15_15);
                            Intrinsics.checkNotNull(var14_14, (String)var8_8);
                            var12_12 = var14_14;
                            var12_12 = (String)var14_14;
                        }
                        if ((var17_17 = (int)var7_7.y0) != 0) {
                            var9_9 = var10_10 = var7_7.z0;
                        }
                        var14_14 = this.cb().d;
                        var17_17 = (int)var14_14.n1;
                        if (var17_17 != 0) break block46;
                        var14_14 = this.cb().d;
                        var17_17 = (int)var14_14.p1;
                        if (var17_17 == 0) break block47;
                    }
                    var9_9 = "jio ads banner ";
                }
                var9_9 = Ft2.a((String)var9_9, "plp list");
                var14_14 = this.cb();
                var17_17 = (int)var14_14.b();
                var8_8 = "_";
                if (var17_17 != 0) {
                    var9_9 = this.cb().d;
                    var13_13 = (int)var9_9.s;
                    var9_9 = var13_13 != 0 ? "b" : "m";
                    var14_14 = "fleek_";
lbl101:
                    // 2 sources

                    while (true) {
                        var9_9 = UX.c((String)var14_14, (String)var9_9, (String)var8_8, (String)var10_10);
                        break;
                    }
                } else {
                    var10_10 = this.cb().d.A1;
                    if (var10_10 != null) {
                        var14_14 = "CURATED_WIDGET";
                        var20_20 = (int)var10_10.equalsIgnoreCase((String)var14_14);
                        var10_10 = (boolean)var20_20;
                    } else {
                        var20_20 = 0;
                        var10_10 = null;
                    }
                    var14_14 = Boolean.TRUE;
                    var20_20 = Intrinsics.areEqual(var10_10, var14_14);
                    if (var20_20 != 0) {
                        var10_10 = this.cb().d;
                        var9_9 = var10_10.D1;
                        var10_10 = var10_10.C1;
                        var14_14 = "cw_";
                        ** continue;
                    }
                }
                var10_10 = this.cb().d.M0;
                var14_14 = Boolean.TRUE;
                var20_20 = Intrinsics.areEqual(var10_10, var14_14);
                var19_19 = var20_20 != 0 ? (var10_10 = "fleek_visit_ajiogram_store") : var9_9;
                var10_10 = var7_7.C0;
                var8_8 = var10_10.getEE_SELECT_ITEM();
                var9_9 = sq0_1.a;
                var9_9 = o72_0.a;
                var15_15 = sq0_1.d((String)var9_9);
                var23_23 = var7_7.E0;
                var24_24 = sq0_1.e();
                if (var5_5 != null) {
                    var13_13 = (int)var5_5.isSalePriceAvailable();
                    var25_25 = var9_9 = Boolean.valueOf((boolean)var13_13);
                } else {
                    var25_25 = null;
                }
                var26_26 = var7_7.F0;
                var9_9 = this.cb().d.i1;
                var27_27 = var9_9 == null ? var12_12 : var9_9;
                var9_9 = this.cb().d.h1;
                var28_28 = var9_9 == null ? var16_16 : var9_9;
                var17_17 = var7_7.y0;
                var9_9 = var7_7.z0;
                var12_12 = var7_7.G0;
                var16_16 = this.cb().d.M;
                var29_29 = var16_16 != null ? (var16_16 = var16_16.getFreeTextSearch()) : null;
                var16_16 = this.cb().d;
                var30_30 = this.cb().d.M;
                if (var30_30 != null) {
                    var30_30 = var30_30.getFreeTextSearch();
                } else {
                    var31_31 = false;
                    var30_30 = null;
                }
                var32_32 = var16_16.p((String)var30_30);
                var33_33 = 0L;
                var16_16 = "NA";
                var31_31 = true;
                var35_34 = 0x118000;
                var36_35 = var9_9;
                var9_9 = var3_3;
                var37_36 = var17_17;
                var17_17 = var2_2;
                var30_30 = var27_27;
                var11_11 = var28_28;
                var27_27 = var36_35;
                var28_28 = var12_12;
                NewEEcommerceEventsRevamp.pushEEProductSelect$default((NewEEcommerceEventsRevamp)var10_10, var3_3, var2_2, (String)var8_8, (String)var19_19, (String)var16_16, (String)var15_15, var31_31, var23_23, var24_24, (Boolean)var25_25, var26_26, (String)var30_30, (String)var11_11, (boolean)var37_36, (String)var36_35, null, var33_33, (Yj2)var12_12, (String)var29_29, var32_32, null, var6_6, var35_34, null);
                var10_10 = this.cb().d.M;
                if (var10_10 != null) {
                    var30_30 = var10_10.getPlpExtendedBanner();
                } else {
                    var31_31 = false;
                    var30_30 = null;
                }
                var10_10 = "banner_theme_extended";
                if (var30_30 == null) ** GOTO lbl-1000
                var9_9 = this.cb().d;
                var17_17 = 0;
                var14_14 = null;
                var13_13 = var9_9.v(false);
                if (var13_13 != 0) ** GOTO lbl-1000
                var9_9 = h40_0.a;
                var13_13 = h40_0.G1();
                if (var13_13 != 0) {
                    var9_9 = this.cb().d.s0;
                    if (var9_9 != null) {
                        var14_14 = "yes";
                        var9_9.putString((String)var10_10, (String)var14_14);
                    }
                } else if ((var9_9 = this.cb().d.s0) != null) {
                    var14_14 = "no";
                    var9_9.putString((String)var10_10, (String)var14_14);
                }
                if ((var20_20 = (var10_10 = this.Wa()).shouldCallConversionTracker((bv2_0)(var9_9 = this.cb().d), (String)(var14_14 = var7_7.R0), (String)(var8_8 = (String)var7_7.g1.getValue()))) == 0) break block48;
                var10_10 = this.cb().d;
                var20_20 = var10_10.n1;
                if (var20_20 != 0) ** GOTO lbl-1000
                var10_10 = this.cb().d;
                var20_20 = var10_10.p1;
                if (var20_20 == 0) {
                    var10_10 = var3_3;
                    if (var3_3 != null) {
                        var30_30 = var3_3.getCcbValue();
                    } else {
                        var31_31 = false;
                        var30_30 = null;
                    }
                    if ((var30_30 == null || (var13_13 = var30_30.length()) == 0) && var10_10 != null) {
                        cp_1.Companion.getClass();
                        var9_9 = cp$a.e();
                        var14_14 = UUID.randomUUID().toString();
                        var9_9.getClass();
                        var9_9 = cp_1.n((String)var14_14);
                        var10_10.setCcbValue((String)var9_9);
                    }
                } else lbl-1000:
                // 2 sources

                {
                    var10_10 = var3_3;
                    if (var3_3 != null) {
                        var9_9 = this.cb().d.o1;
                        var3_3.setCcbValue((String)var9_9);
                    }
                }
                var9_9 = this.Wa();
                var14_14 = this.cb().d.s1;
                if (var10_10 != null) {
                    var30_30 = var3_3.getCcbValue();
                } else {
                    var31_31 = false;
                    var30_30 = null;
                }
                var9_9 = var9_9.getClickIdWithTimestamp((String)var14_14, (String)var30_30);
                var14_14 = el1_2.a;
                var17_17 = (int)el1_2.j();
                if (var17_17 != 0) {
                    var14_14 = el1_2.b;
                    var21_21 = 0;
                    var19_19 = null;
                    var8_8 = new jl1_2((Product)var10_10, (String)var9_9, null);
                    var13_13 = 3;
                    Ae3.d((i90_0)var14_14, null, null, (Function2)var8_8, var13_13);
                }
                break block49;
            }
            var10_10 = var3_3;
        }
        q22_0.pb(var3_3);
    }

    public final void S7() {
        boolean bl2;
        Object object;
        Object object2;
        Object object3;
        boolean bl3;
        this.P2();
        Object object4 = this.cb().d;
        ArrayList arrayList = this.w0;
        object4.getClass();
        Intrinsics.checkNotNullParameter(arrayList, "appliedFacetValueList");
        Object object5 = ((bv2_0)object4).U;
        arrayList.addAll(object5);
        ((ArrayList)object5).clear();
        ((bv2_0)object4).T.clear();
        object5 = ((bv2_0)object4).R;
        Object object6 = ((bv2_0)object4).S;
        Object object7 = arrayList.iterator();
        while (true) {
            int n3;
            bl3 = object7.hasNext();
            String string2 = null;
            if (!bl3) break;
            object3 = ((AppliedFacetValue)object7.next()).getFacetValue();
            if (object3 != null) {
                object2 = ((FacetValue)object3).getCode();
            } else {
                n3 = 0;
                object2 = null;
            }
            if (object2 != null) {
                object2 = ((FacetValue)object3).getCode();
                Intrinsics.checkNotNull(object2);
                ((HashMap)object6).put(object2, object3);
                object2 = ((FacetValue)object3).getCode();
                Intrinsics.checkNotNull(object2);
                ((HashMap)object5).remove(object2);
            }
            if ((object2 = ((bv2_0)object4).i0) != null) {
                object = object3 != null ? ((FacetValue)object3).getCode() : null;
                object2 = (Integer)object2.get(object);
            } else {
                n3 = 0;
                object2 = null;
            }
            if (object2 != null) {
                object = ((bv2_0)object4).i0;
                if (object == null) continue;
                if (object3 != null) {
                    string2 = ((FacetValue)object3).getCode();
                }
                object3 = String.valueOf(string2);
                n3 = (Integer)object2 + -1;
                object2 = n3;
                object3 = (Integer)((HashMap)object).put(object3, object2);
                continue;
            }
            object2 = ((bv2_0)object4).i0;
            if (object2 == null) continue;
            if (object3 != null) {
                string2 = ((FacetValue)object3).getCode();
            }
            object3 = String.valueOf(string2);
            object = 0;
            object3 = (Integer)((HashMap)object2).put(object3, object);
        }
        ((bv2_0)object4).e1 = false;
        object6 = ((bv2_0)object4).M;
        Intrinsics.checkNotNull(object6);
        object2 = Boolean.TRUE;
        bl3 = false;
        object3 = null;
        int n4 = 52;
        int n7 = 1;
        object = null;
        object5 = object4;
        bv2_0.B((bv2_0)object4, (ProductsList)object6, n7 != 0, false, (Boolean)object2, null, null, n4);
        object5 = arrayList.iterator();
        while (bl2 = object5.hasNext()) {
            object6 = ((AppliedFacetValue)object5.next()).getFacetValue();
            object7 = ((bv2_0)object4).i0;
            if (object7 != null) {
                if (object6 != null) {
                    object3 = ((FacetValue)object6).getFacetCode();
                } else {
                    bl3 = false;
                    object3 = null;
                }
                object7 = (Integer)object7.get(object3);
            } else {
                n7 = 0;
                object7 = null;
            }
            if (object7 != null) {
                object3 = ((bv2_0)object4).i0;
                if (object3 == null) continue;
                if (object6 != null) {
                    object6 = ((FacetValue)object6).getFacetCode();
                } else {
                    bl2 = false;
                    object6 = null;
                }
                object6 = String.valueOf(object6);
                n7 = (Integer)object7 + -1;
                object7 = n7;
                object6 = (Integer)((HashMap)object3).put(object6, object7);
                continue;
            }
            object7 = ((bv2_0)object4).i0;
            if (object7 == null) continue;
            if (object6 != null) {
                object6 = ((FacetValue)object6).getFacetCode();
            } else {
                bl2 = false;
                object6 = null;
            }
            object6 = String.valueOf(object6);
            object3 = 0;
            object6 = (Integer)((HashMap)object7).put(object6, object3);
        }
        object4 = ((bv2_0)object4).o;
        object5 = Boolean.TRUE;
        ((LiveData)object4).k(object5);
    }

    public final void Sa() {
        String string2;
        Object object;
        Object object2;
        Object object3 = this.Wa();
        boolean bl2 = ((BannerAdViewModel)object3).shouldCallBannerApi((bv2_0)(object2 = this.cb().d), (String)(object = this.R0), string2 = (String)this.g1.getValue());
        if (bl2) {
            int n3;
            boolean bl3;
            String string3;
            Object object4;
            Object object5;
            object3 = h40_0.a;
            object3 = z40_0.Companion;
            object3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a;
            object2 = "banner_ad_spot_id";
            string2 = ((ao0_0)object3).b((String)object2);
            bl2 = false;
            object3 = null;
            object2 = new Gson();
            object = AJIOApplication$a.a();
            object = z40$a.a((Context)object);
            object = ((z40_0)object).a;
            Class<JioBannerAdsPLPFacet> clazz = "banner_ad_facet_percentage_config";
            object = ((ao0_0)object).b((String)((Object)clazz));
            clazz = BannerAdTargetedFormulaData.class;
            object2 = ((Gson)object2).fromJson((String)object, (Class)clazz);
            try {
                object5 = object2 = (BannerAdTargetedFormulaData)object2;
            }
            catch (Exception exception) {
                object5 = null;
            }
            object2 = new Gson();
            object = h40_0.a;
            object = z40_0.Companion;
            clazz = AJIOApplication.Companion;
            clazz.getClass();
            clazz = AJIOApplication$a.a();
            object.getClass();
            object = z40$a.a((Context)clazz);
            object = ((z40_0)object).a;
            clazz = "jio_ads_plp_facets_config";
            object = ((ao0_0)object).b((String)((Object)clazz));
            clazz = JioBannerAdsPLPFacet.class;
            object2 = ((Gson)object2).fromJson((String)object, clazz);
            try {
                object4 = object2 = (JioBannerAdsPLPFacet)object2;
            }
            catch (Exception exception) {
                object4 = null;
            }
            object = this.Wa();
            clazz = this.cb().d;
            object2 = this.cb();
            if (object5 != null) {
                string3 = ((BannerAdTargetedFormulaData)object5).getFacetType();
            } else {
                bl3 = false;
                string3 = null;
            }
            object2 = ((F12)object2).d.W;
            if (object2 != null && (object2 = (Integer)((HashMap)object2).get(string3)) != null) {
                n3 = (Integer)object2;
            } else {
                n3 = 0;
                object2 = null;
            }
            if (n3 > 0) {
                n3 = 1;
                bl3 = true;
            } else {
                bl3 = false;
                string3 = null;
            }
            object2 = this.cb();
            if (object4 != null) {
                object3 = ((JioBannerAdsPLPFacet)object4).getFacetsList();
            }
            object2 = ((F12)object2).d;
            object2.getClass();
            HashMap<Object, HashMap> hashMap = new HashMap<Object, HashMap>();
            if (object3 != null) {
                boolean bl4;
                object3 = object3.iterator();
                while (bl4 = object3.hasNext()) {
                    int n4;
                    String string4;
                    Object object6 = (JioBannerAdsPLPFacetData)object3.next();
                    Serializable serializable = ((bv2_0)object2).W;
                    if (serializable != null && (serializable = (Integer)serializable.get(string4 = ((JioBannerAdsPLPFacetData)object6).getFacet_type())) != null) {
                        n4 = (Integer)serializable;
                    } else {
                        n4 = 0;
                        serializable = null;
                    }
                    if (n4 > 0) {
                        object6 = ((JioBannerAdsPLPFacetData)object6).getFacet_type();
                        serializable = Boolean.TRUE;
                        object6 = (Boolean)((Object)hashMap.put(object6, (HashMap)serializable));
                        continue;
                    }
                    object6 = ((JioBannerAdsPLPFacetData)object6).getFacet_type();
                    serializable = Boolean.FALSE;
                    object6 = (Boolean)((Object)hashMap.put(object6, (HashMap)serializable));
                }
            }
            ((BannerAdViewModel)object).callBannerAdApi(string2, (bv2_0)((Object)clazz), (BannerAdTargetedFormulaData)object5, (JioBannerAdsPLPFacet)object4, bl3, hashMap);
        }
    }

    public final void T7(ArrayList object) {
        Intrinsics.checkNotNullParameter(object, "appliedFaceValueList");
        this.w0 = object;
        this.i = object = new fv_0(this);
        FragmentManager fragmentManager = this.requireActivity().getSupportFragmentManager();
        Object object2 = this.i;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearAllFilterBottomSheetFragment");
            object2 = null;
        }
        object2 = ((Fragment)object2).getTag();
        ((DialogFragment)object).show(fragmentManager, (String)object2);
    }

    public abstract void Ta(ProductsList var1);

    public final void U0(int n3, int n4, String string2) {
        bv2_0 bv2_02 = this.cb().d;
        c80 c802 = bv2_02.e;
        gv2_0 gv2_02 = new gv2_0(bv2_02, n4, n3, string2, null);
        Ae3.d(c802, null, null, gv2_02, 3);
    }

    public final void U4() {
        this.cb().d.getClass();
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        GTMEvents gTMEvents = analyticsManager$Companion.getInstance().getGtmEvents();
        String string2 = av_0.a(analyticsManager$Companion);
        GTMEvents.gtmEventsToGaWithCategory$default(gTMEvents, "widget interaction", "widget_interaction_nudget", "nudget click", "", string2, null, 32, null);
    }

    public final j3_0 Ua() {
        j3_0 j3_02 = this.o;
        if (j3_02 != null) {
            return j3_02;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
        return null;
    }

    public final jo_2 Va() {
        return (jo_2)this.A.getValue();
    }

    public final BannerAdViewModel Wa() {
        return (BannerAdViewModel)this.Q0.getValue();
    }

    public final xw0_2 Xa() {
        return (xw0_2)this.e1.getValue();
    }

    public final void Y0(Product product, String string2, boolean bl2) {
        this.C(product, string2);
    }

    public abstract int Ya();

    public final int Za() {
        boolean bl2;
        int n3;
        Object object = this.B;
        if (object != null) {
            object = ((RecyclerView)object).getLayoutManager();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null && (bl2 = object instanceof GridLayoutManager)) {
            object = (GridLayoutManager)object;
            n3 = ((LinearLayoutManager)object).findLastVisibleItemPosition();
        } else {
            bl2 = object instanceof LinearLayoutManager;
            if (bl2) {
                object = (LinearLayoutManager)object;
                n3 = ((LinearLayoutManager)object).findLastVisibleItemPosition();
            } else {
                n3 = -1;
            }
        }
        return n3;
    }

    /*
     * Unable to fully structure code
     */
    public final String ab() {
        block8: {
            var1_1 = this.cb().d;
            var2_2 = this.y0;
            var3_3 = " - plp list";
            if (var2_2) {
                var1_1 = this.z0;
lbl6:
                // 2 sources

                while (true) {
                    var1_1 = Ft2.a((String)var1_1, var3_3);
                    break block8;
                    break;
                }
            }
            var2_2 = var1_1.n1;
            if (var2_2 || (var2_2 = var1_1.p1)) ** GOTO lbl37
            var4_4 = var1_1.A1;
            var5_5 = null;
            if (var4_4 != null) {
                var6_6 = "CURATED_WIDGET";
                var2_2 = var4_4.equalsIgnoreCase((String)var6_6);
                var4_4 = var2_2;
            } else {
                var2_2 = false;
                var4_4 = null;
            }
            var6_6 = Boolean.TRUE;
            var2_2 = Intrinsics.areEqual(var4_4, var6_6);
            if (var2_2) {
                var4_4 = var1_1.D1;
                var1_1 = var1_1.C1;
                var3_3 = "cw_";
                var5_5 = "_";
                var1_1 = UX.c(var3_3, (String)var4_4, (String)var5_5, (String)var1_1);
            } else {
                var1_1 = var1_1.s0;
                if (var1_1 != null) {
                    var4_4 = "plp_page_title";
                    var5_5 = var1_1.get((String)var4_4);
                }
                var1_1 = String.valueOf(var5_5).toLowerCase();
                var4_4 = "toLowerCase(...)";
                Intrinsics.checkNotNullExpressionValue(var1_1, (String)var4_4);
                ** continue;
lbl37:
                // 1 sources

                var1_1 = "jio ads banner plp screen";
            }
        }
        var2_2 = TextUtils.isEmpty((CharSequence)var1_1);
        if (var2_2) {
            var1_1 = "";
        }
        return var1_1;
    }

    public final void b1(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(string3, "linkText");
    }

    public final bu2_0 bb() {
        return (bu2_0)this.f1.getValue();
    }

    public final void ca(Facet object) {
        Object object2;
        Object object3 = object != null ? ((Facet)object).getValues() : null;
        if (object3 != null && (object2 = this.cb().d.M) != null) {
            boolean bl2;
            boolean bl3;
            object2 = ((Facet)object).getName();
            if (object2 != null) {
                object2 = ((Facet)object).getName();
                Intrinsics.checkNotNull(object2);
                object2 = this.A2((String)object2);
            } else {
                object2 = new HashSet();
            }
            Object object4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            String string2 = ((Facet)object).getName();
            String string3 = ((Facet)object).getName();
            String string4 = this.cb().d.x0;
            String string5 = o72_0.a;
            String string6 = "Selected";
            StringBuilder stringBuilder = new StringBuilder(string6);
            stringBuilder.append(string2);
            string2 = "-";
            stringBuilder.append(string2);
            stringBuilder.append(object2);
            stringBuilder.append("_AutoApplied");
            X50.a(stringBuilder, string3, string2, string4, "_ClearFilter_");
            stringBuilder.append(string5);
            object2 = stringBuilder.toString();
            string2 = o72_0.a;
            string3 = "Visual Filter Clicked";
            ((GTMEvents)object4).pushButtonTapEvent(string3, object2, string2);
            object3 = ((ArrayList)object3).iterator();
            object2 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
            while (bl3 = object3.hasNext()) {
                object2 = object3.next();
                object4 = "next(...)";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                bl2 = ((FacetValue)(object2 = (FacetValue)object2)).getSelected();
                if (!bl2) continue;
                object4 = ((Facet)object).getCode();
                ((FacetValue)object2).setFacetCode((String)object4);
                object4 = ((FacetValue)object2).getFacetCode();
                if (object4 == null || (object4 = ((FacetValue)object2).getCode()) == null) continue;
                object4 = this.cb().d.S;
                string2 = ((FacetValue)object2).getCode();
                Intrinsics.checkNotNull(string2);
                ((HashMap)object4).put(string2, object2);
            }
            object = this.cb().d.S;
            boolean bl4 = ((HashMap)object).isEmpty() ^ true;
            if (bl4) {
                object3 = this.cb();
                object = this.cb().d;
                object2 = ((bv2_0)object).M;
                Intrinsics.checkNotNull(object2);
                string3 = null;
                string4 = null;
                bl2 = false;
                object4 = null;
                string2 = null;
                int n3 = 28;
                F12.j((F12)object3, (ProductsList)object2, false, null, null, null, n3);
                this.P2();
            }
        }
    }

    public final F12 cb() {
        return (F12)this.k.getValue();
    }

    public final boolean d1(int n3, int n4) {
        int n7 = 53;
        int n8 = -1;
        if (n3 == n7 && n4 == n8) {
            Object object;
            Object object2 = this.getArguments();
            n4 = 100;
            if (object2 != null && (n3 = (int)((object2 = this.requireArguments()).containsKey((String)(object = "PLP_TYPE")) ? 1 : 0)) != 0) {
                object2 = this.requireArguments();
                n4 = object2.getInt((String)object, n4);
            }
            if ((object2 = this.cb().e.b) != null && (object2 = ((Product)object2).getFnlColorVariantData()) != null && (object2 = ((ProductFnlColorVariantData)object2).getColorGroup()) != null && (n7 = ((String)object2).length()) > 0) {
                this.Ua().startLoader();
                object = this.cb();
                object.getClass();
                Intrinsics.checkNotNullParameter(object2, "productCode");
                aW aW2 = md3_0.c((jD3)object);
                G12 g12 = new G12(n4, (F12)object, (String)object2, null);
                n3 = 3;
                Ae3.d(aW2, null, null, g12, n3);
            }
            this.ib();
            n3 = (int)(og1_1.c() ? 1 : 0);
            if (n3 == 0 && (object2 = this.u0) != null) {
                pg2_2 pg2_22;
                object = "bag screen";
                this.t0 = pg2_22 = new pg2_2((View)object2, (String)object);
            }
            return true;
        }
        n7 = 58;
        if (n3 == n7 && n4 == n8) {
            this.ib();
        }
        return false;
    }

    public final void d2() {
        View view = this.J;
        if (view != null) {
            view.performClick();
        }
    }

    public final K43 db() {
        return (K43)this.O0.getValue();
    }

    public final ArrayList e7(ArrayList arrayList) {
        ArrayList arrayList2 = this.cb().d;
        arrayList2.getClass();
        if (arrayList != null) {
            arrayList2 = new ArrayList();
            Qu2 qu2 = new Qu2((pu2_1)((Object)arrayList2));
            bx_2.q(arrayList, qu2);
            arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public abstract void eb(ProductsList var1);

    public abstract void fb();

    public final void g0() {
        this.L0 = null;
        this.db().b();
    }

    public abstract void gb();

    /*
     * Enabled aggressive block sorting
     */
    public final void h9(Product product, String string2) {
        Object object;
        Object object2 = product;
        this.Ua().startLoader();
        Object object3 = this.D0;
        Object object4 = ((NewCustomEventsRevamp)object3).getEC_PRODUCT_LIST_INTERACTIONS();
        String string3 = o72_0.a;
        String string4 = this.E0;
        String string5 = this.F0;
        String string6 = "similar to click";
        String string7 = "product_list_interactions";
        String string8 = "plp screen";
        int n3 = 1664;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, (String)object4, string6, string2, string7, string3, string8, string4, null, string5, false, null, n3, null);
        this.M0 = product;
        object3 = object = this.N0.getValue();
        object3 = (r43_0)object;
        object2 = product != null ? product.getCode() : null;
        object4 = object2;
        object2 = h40_0.a;
        boolean bl2 = h40_0.T1();
        string8 = this.cb().d.l();
        r43_0.b((r43_0)object3, (String)object4, bl2, null, null, null, string8, false, 376);
    }

    public abstract void hb(View var1);

    public final void ib() {
        Object object = (PLPExtras)this.bb().a.d();
        if (object != null) {
            this.P2();
            F12 f12 = this.cb();
            f12.f((PLPExtras)object);
            this.h = object = ((PLPExtras)object).l;
        } else {
            object = this.B;
            int n3 = 8;
            if (object != null) {
                object.setVisibility(n3);
            }
            if ((object = this.E) != null) {
                object.setVisibility(n3);
            }
            if ((object = this.G) != null) {
                object.setVisibility(n3);
            }
            if ((object = this.Y) != null) {
                n3 = 0;
                Object var2_3 = null;
                object.setVisibility(0);
            }
        }
    }

    public final void ja() {
        boolean bl2 = this.isAdded();
        if (bl2) {
            Bundle bundle = new Bundle();
            Object object = this.cb().d.h1;
            bundle.putString("plp_source", (String)object);
            object = this.cb().d.i1;
            bundle.putString("plp_source_details", (String)object);
            Object object2 = this.D0;
            Object object3 = ((NewCustomEventsRevamp)object2).getEC_PRODUCT_LIST_INTERACTIONS();
            String string2 = o72_0.a;
            String string3 = this.E0;
            String string4 = this.F0;
            String string5 = "filter menu open";
            String string6 = "";
            String string7 = "plp_filter_menu_open";
            String string8 = "plp screen";
            int n3 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, (String)object3, string5, string6, string7, string2, string8, string3, bundle, string4, false, null, n3, null);
            object = this.getArguments();
            if (object != null && (bl2 = (object = this.requireArguments()).containsKey((String)(object2 = "PLP_TYPE")))) {
                object = s12.Companion;
                int n4 = this.requireArguments().getInt((String)object2);
                object3 = this.cb().d.l();
                object.getClass();
                object = s12$a.a(n4, (String)object3);
                object2 = this.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(object2, "getChildFragmentManager(...)");
                object2.getClass();
                object3 = new a((FragmentManager)object2);
                string5 = "beginTransaction(...)";
                Intrinsics.checkNotNullExpressionValue(object3, string5);
                int n7 = R$anim.slide_in_bottom;
                int n8 = R$anim.slide_out_top;
                string7 = null;
                ((k)object3).k(n7, n8, 0, 0);
                n7 = this.Ya();
                string6 = this.getTag();
                ((k)object3).j(n7, (Fragment)object, string6);
                object = this.getTag();
                ((k)object3).c((String)object);
                object = this.getActivity();
                if (object != null) {
                    object = this.getActivity();
                    if (object != null) {
                        bl2 = object.isDestroyed();
                        object = bl2;
                    } else {
                        bl2 = false;
                        object = null;
                    }
                    Intrinsics.checkNotNull(object);
                    bl2 = (Boolean)object;
                    if (!bl2 && !(bl2 = ((FragmentManager)object2).K)) {
                        bl2 = true;
                        ((a)object3).o(bl2, bl2);
                        try {
                            ((FragmentManager)object2).C();
                        }
                        catch (IllegalStateException illegalStateException) {
                            object2 = yn3_0.a;
                            ((yn3$a)object2).e(illegalStateException);
                        }
                    }
                }
            }
        }
    }

    public final boolean jb() {
        return (Boolean)this.X0.getValue();
    }

    public final void kb(Integer n3) {
        String string2;
        boolean bl2;
        Object object;
        Object object2;
        boolean bl3;
        int n4;
        q22_0 q22_02 = this;
        if (n3 != null && (n4 = ((Number)n3).intValue()) > 0) {
            return;
        }
        Object object3 = this.cb().d.X1;
        Object object4 = new ArrayList();
        object3 = ((ArrayList)object3).iterator();
        while (bl3 = object3.hasNext()) {
            object = object2 = object3.next();
            object = (FacetValue)object2;
            bl2 = ((FacetValue)object).getSelected() ^ true;
            if (!bl2) continue;
            ((ArrayList)object4).add(object2);
        }
        n4 = ((ArrayList)object4).size();
        object4 = this.cb().d.X1.iterator();
        object2 = "";
        while (bl2 = object4.hasNext()) {
            object = (FacetValue)object4.next();
            int n7 = ((FacetValue)object).getSelected();
            if (n7 != 0) continue;
            n7 = ((String)object2).length();
            object = ((FacetValue)object).getCode();
            if (n7 != 0) {
                string2 = ",";
                object = kp1_0.c(string2, (String)object);
            }
            object2 = Qj0.b((String)object2, (String)object);
        }
        object = q22_02.D0;
        string2 = ((NewCustomEventsRevamp)object).getEVENT_CATEGORY_QUICK_FILTER_INTERACTIONS();
        object4 = "quick filter impression-";
        String string3 = hj0_0.a(n4, (String)object4);
        n4 = 100;
        object3 = le3_2.E(n4, (String)object2);
        int n8 = ((String)object3).length();
        if (n8 == 0) {
            object3 = "none";
        }
        String string4 = ((NewCustomEventsRevamp)object).getEVENT_NAME_QUICK_FILTER_INTERACTIONS();
        String string5 = o72_0.a;
        String string6 = q22_02.E0;
        String string7 = q22_02.F0;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string2, string3, (String)object3, string4, string5, "plp screen", string6, null, string7, false, null, 1664, null);
    }

    public boolean l() {
        this.z2();
        FragmentManager fragmentManager = this.getChildFragmentManager();
        int n3 = fragmentManager.J();
        if (n3 > 0) {
            this.getChildFragmentManager().W();
            return true;
        }
        return false;
    }

    public final void lb() {
        Object object = CustomerStoreType.a;
        object = od3_2.a();
        Object object2 = "";
        int n3 = ((String)object2).length();
        if (n3) {
            object = object2;
        }
        object2 = ld3_2.STORE_AJIO.getStoreId();
        boolean bl2 = Intrinsics.areEqual(object, object2);
        if (bl2) {
            object = "rilfnl";
        }
        object2 = ScreenType.SCREEN_HOME;
        object = CustomerStoreType.a((String)object, (ScreenType)((Object)object2));
        object2 = this.B;
        if (object2 != null) {
            object2 = ((RecyclerView)object2).getAdapter();
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 != null) {
            object2 = this.Xa();
            n3 = (int)(this.s0 ? 1 : 0);
            object2.getClass();
            boolean bl3 = xw0_2.b((String)object, n3 != 0);
            if (bl3) {
                object = this.Xa().c;
                this.mb();
            }
        }
    }

    public abstract void mb();

    public final void n0() {
        Object object;
        int n3 = (int)(this.X ? 1 : 0);
        if (n3 == 0 && (object = this.getContext()) != null) {
            n3 = 1;
            this.X = n3;
            Object object2 = this.requireContext();
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog((Context)object2);
            bottomSheetDialog.requestWindowFeature(n3);
            n3 = R$layout.dod_bottom_sheet_pop_up_view;
            bottomSheetDialog.setContentView(n3);
            n3 = 0;
            object = null;
            bottomSheetDialog.setCancelable(false);
            int n4 = R$id.dod_bottom_sheet_pop_up_ends_in_layout;
            object2 = (LinearLayout)bottomSheetDialog.findViewById(n4);
            if (object2 != null) {
                object2.setVisibility(0);
            }
            if ((object = (TextView)bottomSheetDialog.findViewById(n3 = R$id.dod_bottom_sheet_pop_up_msg_tv)) != null) {
                n4 = R$string.dod_stock_over_msg;
                object.setText(n4);
            }
            if ((object = (TextView)bottomSheetDialog.findViewById(n3 = R$id.main_title)) != null) {
                n4 = R$string.dod_pop_up_heading;
                object.setText(n4);
            }
            if ((object = (AjioTextView)bottomSheetDialog.findViewById(n3 = R$id.dod_bottom_sheet_pop_up_ok_tv)) != null) {
                object2 = new u22(this, bottomSheetDialog);
                object.setOnClickListener((View.OnClickListener)object2);
            }
            object = new v22(bottomSheetDialog);
            bottomSheetDialog.setOnShowListener((DialogInterface.OnShowListener)object);
            bottomSheetDialog.show();
        }
    }

    public abstract void nb(NewUserBanner var1, String var2);

    public final void ob() {
        boolean bl2;
        Object object;
        Object object2;
        Object object3;
        String string2 = od3_2.a;
        int n3 = string2.length();
        if (n3 == 0) {
            string2 = od3_2.a();
        }
        if (((n3 = (int)(s20.a ? 1 : 0)) != 0 || (n3 = (int)(Intrinsics.areEqual(object3 = od3_2.a(), object2 = (object = ld3_2.STORE_AJIOGRAM).getStoreId()) ? 1 : 0)) != 0 || (bl2 = Intrinsics.areEqual(string2, object3 = object.getStoreId()))) && (bl2 = Intrinsics.areEqual(string2 = this.cb().d.l(), object3 = ld3_2.STORE_AJIOGRAM.getStoreId()))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        object3 = this.s;
        object = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productDetailListener");
            n3 = 0;
            object3 = null;
        }
        object2 = (object2 = this.cb().d.M) != null && (object2 = ((ProductsList)object2).getBrandDetails()) != null ? ((BrandDetails)object2).getBrandCode() : null;
        Object object4 = this.cb().d.M;
        if (object4 != null && (object4 = ((ProductsList)object4).getBrandDetails()) != null) {
            object = ((BrandDetails)object4).getName();
        }
        object3.M1((String)object2, (String)object, bl2);
    }

    public void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object2 = object;
            object2 = (j3_0)object;
            String string2 = "<set-?>";
            Intrinsics.checkNotNullParameter(object2, string2);
            this.o = object2;
            bl2 = object instanceof fo3;
            if (bl2) {
                object2 = object;
                object2 = (fo3)object;
                Intrinsics.checkNotNullParameter(object2, string2);
                this.p = object2;
                bl2 = object instanceof vh3_2;
                if (bl2) {
                    object2 = object;
                    object2 = (vh3_2)object;
                    Intrinsics.checkNotNullParameter(object2, string2);
                    this.q = object2;
                    bl2 = object instanceof A71;
                    if (bl2) {
                        object2 = object;
                        this.r = object2 = (A71)object;
                        bl2 = object instanceof ea2_1;
                        if (bl2) {
                            object2 = object;
                            this.s = object2 = (ea2_1)object;
                            bl2 = object instanceof lz1_1;
                            if (bl2) {
                                object = (lz1_1)object;
                                Intrinsics.checkNotNullParameter(object, string2);
                                this.u = object;
                                return;
                            }
                            object = pn_2.b(object, " must implement LoginListener");
                            object2 = new ClassCastException((String)object);
                            throw object2;
                        }
                        object = pn_2.b(object, " must implement PDPListener");
                        object2 = new ClassCastException((String)object);
                        throw object2;
                    }
                    object = pn_2.b(object, " must implement HomeListener");
                    object2 = new ClassCastException((String)object);
                    throw object2;
                }
                object = pn_2.b(object, " must implement TabListener");
                object2 = new ClassCastException((String)object);
                throw object2;
            }
            object = pn_2.b(object, " must implement ToolbarListener");
            object2 = new ClassCastException((String)object);
            throw object2;
        }
        object = pn_2.b(object, " must implement ActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public void onCreate(Bundle object) {
        boolean bl2;
        Object object2;
        int n3;
        super.onCreate((Bundle)object);
        fq2_1.e.start();
        object = this.cb();
        Object object3 = this.getArguments();
        object.getClass();
        if (object3 != null) {
            n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            if (n3 >= n4) {
                object3 = (Parcelable)E12.a(object3);
            } else {
                object2 = "PLP_DATA";
                n3 = (object3 = object3.getParcelable((String)object2)) instanceof PLPExtras;
                if (n3 == 0) {
                    object3 = null;
                }
                object3 = (PLPExtras)object3;
            }
            object3 = (PLPExtras)object3;
            object = ((F12)object).d;
            ((bv2_0)object).N0 = object3;
        }
        this.s0 = bl2 = og1_1.e(this.cb().d.l());
        bl2 = true;
        this.setHasOptionsMenu(bl2);
        object = this.cb().d.l();
        object3 = ld3_2.STORE_LUXE;
        object2 = object3.getStoreId();
        n3 = (int)(Intrinsics.areEqual(object, object2) ? 1 : 0);
        if (n3 != 0) {
            object = object3.getStoreId();
            this.Oa((String)object);
        } else {
            object3 = ld3_2.STORE_AJIOGRAM;
            object2 = object3.getStoreId();
            bl2 = Intrinsics.areEqual(object, object2);
            if (bl2) {
                object = object3.getStoreId();
                this.Oa((String)object);
            } else {
                object = ld3_2.STORE_AJIO.getStoreId();
                this.Oa((String)object);
            }
        }
        object = z40_0.Companion;
        object3 = this.requireContext();
        object2 = "requireContext(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object.getClass();
        object = z40$a.a((Context)object3).a;
        object3 = "PLP_List_Grid_Toggle";
        this.j = object = ((ao0_0)object).b((String)object3);
        object = this.getActivity();
        if (object != null) {
            object3 = "owner";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            object2 = object.getViewModelStore();
            Intrinsics.checkNotNullParameter(object, (String)object3);
            Object object4 = object.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(object, (String)object3);
            object = object.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object2, "store");
            Intrinsics.checkNotNullParameter(object4, "factory");
            Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
            object3 = gj2_1.class;
            String string2 = "modelClass";
            object = rl3_0.b((rd3_0)object2, (E$b)object4, (Wd0)object, (Class)object3, string2);
            object2 = "<this>";
            object3 = sw0_0.a((Class)object3, (String)object2, (Class)object3, string2, string2);
            Intrinsics.checkNotNullParameter(object3, (String)object2);
            object2 = object3.getQualifiedName();
            if (object2 != null) {
                object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                object2 = ((String)object4).concat((String)object2);
                this.d1 = object = (gj2_1)((pD3)object).a((yn1_2)object3, (String)object2);
            } else {
                object3 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object3);
                throw object;
            }
        }
    }

    public void onDestroyView() {
        Q22$b q22$b;
        super.onDestroyView();
        Object object = this.getContext();
        if (object != null) {
            object = this.getContext();
            cc1_0.b((Context)object);
        }
        bv2_0.Companion.getClass();
        bv2_0.Z1 = "";
        bv2_0.a2 = kv2_0.PLP_DEFAULT;
        object = this.Q;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            object.cancel();
        }
        this.Ua().stopLoader();
        object = this.B;
        if (object != null) {
            q22$b = this.P;
            Intrinsics.checkNotNull(q22$b);
            ((RecyclerView)object).removeOnScrollListener(q22$b);
        }
        object = this.B;
        q22$b = null;
        if (object != null) {
            ((RecyclerView)object).setAdapter(null);
        }
        this.P = null;
        this.cb().d.x = false;
        this.T = null;
        this.N = null;
        this.O = null;
        this.B = null;
        this.E = null;
        this.G = null;
        this.J = null;
        this.K = null;
        this.H = null;
        this.L = null;
        this.M = null;
        this.R = null;
        this.S = null;
        this.U = null;
        this.Y = null;
        object = this.t0;
        if (object != null) {
            ((pg2_2)object).a();
        }
    }

    public final void onNavigationClick() {
        q22_0 q22_02 = this;
        Object object = this.getActivity();
        if (object != null) {
            ((ComponentActivity)object).onBackPressed();
        }
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string2 = o72_0.a;
        ((GTMEvents)object).pushButtonTapEvent("Header Click", "Hamburger Button", string2);
        NewCustomEventsRevamp newCustomEventsRevamp = q22_02.D0;
        String string3 = newCustomEventsRevamp.getEC_USER_INTERACTION();
        object = q22_02.D0;
        String string4 = ((NewCustomEventsRevamp)object).getEA_NAV_CLICK_HEADER();
        String string5 = ((NewCustomEventsRevamp)object).getEN_NAV_CLICK();
        String string6 = o72_0.a;
        String string7 = q22_02.E0;
        String string8 = q22_02.F0;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string3, string4, "hamburger button", string5, string6, "plp screen", string7, null, string8, false, null, 1536, null);
    }

    public final void onPause() {
        super.onPause();
        int n3 = gz3.a;
        int n4 = 23;
        if (n3 <= n4) {
            Object object = this.U0;
            if (object != null) {
                ((ma_2)object).m();
            }
            object = xl1_1.STOP;
            Intent intent = new Intent("media_stop_notification");
            String string2 = "action_type";
            intent.putExtra(string2, (Serializable)object);
            object = Xv1.a(this.requireContext());
            ((Xv1)object).c(intent);
        }
    }

    public void onResume() {
        Object object;
        super.onResume();
        Object object2 = this.getActivity();
        if (object2 != null) {
            object = this.cb().d.l();
            tm3_0.e((FragmentActivity)object2, object);
        }
        object2 = h40_0.a;
        boolean bl2 = h40_0.e2();
        if (bl2) {
            object2 = SV2.a;
            object2 = this.cb().d;
            SV2.b = bl2 = ((bv2_0)object2).z0;
        }
        object2 = this.C0;
        this.E0 = object = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        this.F0 = object2 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        object2 = this.cb();
        boolean bl3 = false;
        object = null;
        ((F12)object2).k(false);
        object2 = this.B;
        if (object2 != null && (object2 = ((RecyclerView)object2).getAdapter()) != null && (bl3 = object2 instanceof q22)) {
            object2 = (q22)object2;
            object = this.G0;
            if (object == null) {
                object = Yj2.GRID;
            }
            String string2 = "<set-?>";
            Intrinsics.checkNotNullParameter(object, string2);
            ((q22)object2).e = object;
        }
        this.rb();
    }

    public void onStart() {
        block7: {
            super.onStart();
            Object object = CustomerStoreType.a;
            object = od3_2.a();
            Object object2 = ld3_2.STORE_AJIO.getStoreId();
            int n3 = Intrinsics.areEqual(object, object2);
            if (n3 != 0) {
                object = "rilfnl";
            }
            object2 = ScreenType.SCREEN_HOME;
            object = CustomerStoreType.a((String)object, (ScreenType)((Object)object2));
            object2 = tr2_2.a;
            object2 = tr2_2.b();
            int n4 = 0;
            Object object3 = null;
            if (object2 != null) {
                object2 = ((EarlyAccessBannerData)object2).getPlpCMSBannerPath();
            } else {
                n3 = 0;
                object2 = null;
            }
            object2 = String.valueOf(object2);
            n3 = ((String)object2).length();
            if (n3 <= 0) break block7;
            object2 = this.Xa();
            int n7 = this.s0;
            object2.getClass();
            n3 = (int)(xw0_2.b((String)object, n7 != 0) ? 1 : 0);
            if (n3 != 0) {
                Object object4 = tr2_2.b();
                if (object4 != null) {
                    object3 = ((EarlyAccessBannerData)object4).getPlpCMSBannerPath();
                }
                Object object5 = String.valueOf(object3);
                Object object6 = this.Va().f();
                object3 = h40_0.a;
                boolean bl2 = h40_0.B0();
                int n8 = 0xEFFFFA;
                String string2 = null;
                Object object7 = null;
                object4 = object2;
                object2 = new HomeReq((String)object5, null, (String)object6, null, null, null, null, null, null, null, false, false, false, null, false, false, null, false, false, false, bl2, false, false, null, n8, null);
                object3 = new HashMap();
                HashMap hashMap = new HashMap();
                n7 = ((String)object).length();
                if (n7 == 0) {
                    object7 = object3;
                } else {
                    object3 = "userGroup";
                    object7 = object = p3.a((String)object3, (String)object);
                }
                int n10 = og1_1.c();
                object = n10 != 0 ? "LUXE" : "AJIO";
                ((HomeReq)object2).setStore((String)object);
                object = UrlHelper.Companion.getInstance();
                object3 = new Object[]{};
                string2 = ((UrlHelper)object).getApiUrl("homepage", "home_cms", (Object[])object3);
                object4 = this.Xa();
                n10 = hv3_0.F();
                object3 = hv3_0.a;
                object3.getClass();
                n4 = hv3_0.E();
                object5 = new ScreenInfo(n10, n4);
                object6 = object2;
                ((xw0_2)object4).c((ScreenInfo)object5, string2, (HomeReq)object2, (Map)object7, hashMap);
            }
        }
    }

    public void onStop() {
        Object object;
        super.onStop();
        int n3 = gz3.a;
        int n4 = 23;
        if (n3 > n4) {
            object = this.U0;
            if (object != null) {
                ((ma_2)object).m();
            }
            object = xl1_1.STOP;
            Intent intent = new Intent("media_stop_notification");
            String string2 = "action_type";
            intent.putExtra(string2, (Serializable)object);
            object = Xv1.a(this.requireContext());
            ((Xv1)object).c(intent);
        }
        object = o72_0.a;
        this.C0.setPreviousScreenData((String)object, "plp screen");
        object = new Message();
        ((Message)object).what = 1002;
        AnalyticsGAEventHandler.Companion.getInstance().sendMessage((Message)object);
    }

    public void onViewCreated(View object, Bundle object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        this.P = object2 = new Q22$b(this);
        object2 = this.getViewLifecycleOwner();
        Object object3 = "getViewLifecycleOwner(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = nu1_0.a((mu1_1)object2);
        AddressType addressType = null;
        Object object4 = new s22_0(this, null);
        ((iu1_0)object2).c((Function2)object4);
        object2 = this.cb().d.g;
        object4 = this.getViewLifecycleOwner();
        Object object5 = new GR0(this, 1);
        Q22$d q22$d = new Q22$d((Function1)object5);
        ((LiveData)object2).e((mu1_1)object4, q22$d);
        object2 = this.cb().d.l;
        object4 = this.getViewLifecycleOwner();
        object5 = new f81_0(this, 1);
        q22$d = new Q22$d((Function1)object5);
        ((LiveData)object2).e((mu1_1)object4, q22$d);
        object2 = this.cb().d.h;
        object4 = this.getViewLifecycleOwner();
        object5 = new B22(this, 0);
        q22$d = new Q22$d((Function1)object5);
        ((LiveData)object2).e((mu1_1)object4, q22$d);
        object2 = this.cb().d.q;
        object4 = this.getViewLifecycleOwner();
        object5 = new mc0_2(this, 1);
        q22$d = new Q22$d((Function1)object5);
        ((LiveData)object2).e((mu1_1)object4, q22$d);
        object2 = this.cb().d.i;
        object4 = this.getViewLifecycleOwner();
        object5 = new nc0_2(this, 1);
        q22$d = new Q22$d((Function1)object5);
        ((LiveData)object2).e((mu1_1)object4, q22$d);
        object2 = this.cb().e.e;
        object4 = this.getViewLifecycleOwner();
        object5 = new oc0_1(this, 1);
        q22$d = new Q22$d((Function1)object5);
        ((LiveData)object2).e((mu1_1)object4, q22$d);
        object2 = this.cb().d.j;
        object4 = this.getViewLifecycleOwner();
        object5 = new C22(this);
        q22$d = new Q22$d((Function1)object5);
        ((LiveData)object2).e((mu1_1)object4, q22$d);
        object2 = this.cb().d.k;
        object4 = this.getViewLifecycleOwner();
        object5 = new K81(this, 1);
        q22$d = new Q22$d((Function1)object5);
        ((LiveData)object2).e((mu1_1)object4, q22$d);
        object2 = this.cb().b.f;
        object4 = this.getViewLifecycleOwner();
        object5 = new D22(this);
        q22$d = new Q22$d((Function1)object5);
        ((LiveData)object2).e((mu1_1)object4, q22$d);
        object2 = this.cb().b.e;
        object4 = this.getViewLifecycleOwner();
        object5 = new E22(this, 0);
        q22$d = new Q22$d((Function1)object5);
        ((LiveData)object2).e((mu1_1)object4, q22$d);
        object2 = this.cb().e.g;
        object4 = this.getViewLifecycleOwner();
        object5 = new x22_0(this, 0);
        q22$d = new Q22$d((Function1)object5);
        ((LiveData)object2).e((mu1_1)object4, q22$d);
        object2 = this.cb().e.i;
        object4 = this.getViewLifecycleOwner();
        object5 = new jb_2(this, 1);
        q22$d = new Q22$d((Function1)object5);
        ((LiveData)object2).e((mu1_1)object4, q22$d);
        object2 = this.cb().d.o;
        object4 = this.getViewLifecycleOwner();
        object5 = new y22_0(this);
        q22$d = new Q22$d((Function1)object5);
        ((LiveData)object2).e((mu1_1)object4, q22$d);
        object2 = ((r43_0)this.N0.getValue()).d;
        object4 = this.getViewLifecycleOwner();
        int n4 = 1;
        object5 = new yf1_0(this, n4);
        q22$d = new Q22$d((Function1)object5);
        ((LiveData)object2).e((mu1_1)object4, q22$d);
        object2 = this.d1;
        if (object2 != null && (object2 = ((gj2_1)object2).b) != null) {
            object4 = this.getViewLifecycleOwner();
            n4 = 0;
            object5 = new A22(this, 0);
            q22$d = new Q22$d((Function1)object5);
            ((LiveData)object2).e((mu1_1)object4, q22$d);
        }
        object2 = this.Wa().getBannerAdLD();
        object4 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
        object3 = new I22(this, 0);
        object5 = new Q22$d((Function1)object3);
        ((R53)object2).e((mu1_1)object4, (F62)object5);
        this.hb((View)object);
        int n7 = h40_0.Q1();
        if (n7 != 0) {
            this.c1 = object2 = this.Va().l();
            object3 = UserInformation.getInstance(this.requireContext());
            boolean n3 = ((UserInformation)object3).isUserOnline();
            if (n3) {
                if (object2 != null) {
                    this.c1 = object2;
                    this.Bb((CartDeliveryAddress)object2);
                }
            } else {
                int n8;
                if (object2 != null) {
                    object3 = ((CartDeliveryAddress)object2).getPostalCode();
                } else {
                    boolean bl3 = false;
                    object3 = null;
                }
                if (object3 != null && (n8 = ((String)object3).length()) != 0) {
                    if (object2 != null) {
                        object3 = AddressType.Pincode;
                        ((CartDeliveryAddress)object2).setAddressType((AddressType)((Object)object3));
                    }
                    this.Bb((CartDeliveryAddress)object2);
                } else {
                    if (object2 != null) {
                        addressType = ((CartDeliveryAddress)object2).getAddressType();
                    }
                    if (addressType == (object2 = AddressType.Pincode)) {
                        object3 = new CartDeliveryAddress();
                        ((CartDeliveryAddress)object3).setAddressType((AddressType)((Object)object2));
                        object2 = object3;
                    } else {
                        object2 = new CartDeliveryAddress();
                        object3 = AddressType.None;
                        ((CartDeliveryAddress)object2).setAddressType((AddressType)((Object)object3));
                    }
                }
                this.Bb((CartDeliveryAddress)object2);
            }
        }
        long l2 = System.currentTimeMillis();
        this.W0 = object2 = k7.f(l2, "yyyy-MM-dd'T'hh:mm:ss+0530");
        n7 = R$id.confettiSaleAnim;
        object = (LottieAnimationView)object.findViewById(n7);
        this.v0 = object;
        object = this.H;
        if (object != null) {
            boolean bl4 = false;
            object3 = null;
            object2 = new r22(this, 0);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.J) != null) {
            boolean bl5 = false;
            object3 = null;
            object2 = new z22_0(this, 0);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.K) != null) {
            int n10 = 1;
            object2 = new zb_2(this, n10);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if (bl2 = ((ArrayList)(object = this.cb().d.K)).isEmpty()) {
            this.ib();
        } else {
            object = this.B;
            n7 = 0;
            object2 = null;
            if (object != null) {
                object.setVisibility(0);
            }
            if ((object = this.E) != null) {
                object.setVisibility(0);
            }
            if ((object = this.G) != null) {
                object.setVisibility(0);
            }
            object = this.c1;
            this.Bb((CartDeliveryAddress)object);
            this.ub();
        }
        this.cb().d.D();
    }

    public final void qb(Integer n3) {
        Object object;
        boolean bl2;
        boolean bl3;
        if (n3 != null && (bl3 = n3.intValue()) > (bl2 = -1 != 0) && (bl3 = n3.intValue()) < (bl2 = (object = this.cb().d.K).size())) {
            Object object2 = this.P0;
            bl2 = n3.intValue();
            object2 = (cB2)CollectionsKt.N((int)(bl2 ? 1 : 0), (List)object2);
            if (object2 != null) {
                object = ((cB2)object2).b;
            } else {
                bl2 = false;
                object = null;
            }
            db2_0 db2_02 = db2_0.IS_PRODUCT;
            if (object == db2_02 && (object2 = ((cB2)object2).h) != null) {
                if (object2 != null) {
                    bl2 = ((PlpProductUIModel)object2).isProductWishlisted();
                } else {
                    bl2 = false;
                    object = null;
                }
                ((PlpProductUIModel)object2).setProductWishlisted(bl2 ^= 1);
            }
            if ((object2 = this.B) != null && (object2 = ((RecyclerView)object2).getAdapter()) != null) {
                bl2 = n3.intValue();
                ((RecyclerView$f)object2).notifyItemChanged((int)(bl2 ? 1 : 0));
            }
            object = Looper.getMainLooper();
            object2 = new Handler((Looper)object);
            object = new J22(this, n3);
            long l2 = 1000L;
            object2.postDelayed((Runnable)object, l2);
        }
    }

    public final void rb() {
        Object object;
        int n3 = 1;
        Object object2 = this.cb().d.M;
        Object object3 = null;
        if ((object2 = object2 != null && (object2 = ((ProductsList)object2).getBrandDetails()) != null ? ((BrandDetails)object2).getLogo() : null) != null) {
            this.cb().d.s = n3;
            Object object4 = this.cb().d;
            Object object5 = this.cb().d.M;
            if (object5 != null && (object5 = ((ProductsList)object5).getBrandDetails()) != null) {
                object3 = ((BrandDetails)object5).getBrandCode();
            }
            ((bv2_0)object4).t = object3;
            object3 = this.I0;
            if (object3 != null) {
                ai0_2.B((View)object3);
            }
            if ((object3 = this.I0) != null) {
                int n4;
                object4 = new da$a();
                ((da$a)object4).a = n4 = R$drawable.component_placeholder;
                ((da$a)object4).b = n4;
                ((da$a)object4).n = object2;
                ((da$a)object4).u = object3;
                ((da$a)object4).a();
            }
            if ((object2 = this.cb().d.M) != null && (object2 = ((ProductsList)object2).getBrandDetails()) != null && (object2 = ((BrandDetails)object2).getName()) != null && (object3 = this.V0) != null) {
                int n7 = R$string.search_in;
                object = new Object[n3];
                object[0] = object2;
                object = this.getString(n7, object);
                object3.setText((CharSequence)object);
            }
        }
        if ((n3 = this.a) != 0) {
            object = this.cb().d;
            n3 = object.s;
            if (n3 != 0 && (object = this.J0) != null) {
                object.setVisible(false);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void sb() {
        Object object = this.cb().d;
        boolean bl2 = ((bv2_0)object).j0;
        if (bl2 && (object = this.cb().d.k0) != null) {
            object = this.cb().d;
            bl2 = ((bv2_0)object).y;
            if (!bl2) {
                Object object2;
                String string2;
                boolean bl3;
                object = this.K;
                if (object != null) {
                    bl3 = false;
                    string2 = null;
                    object.setVisibility(0);
                }
                object = this.K;
                bl3 = false;
                string2 = null;
                if (object != null) {
                    object2 = this.cb().d.k0;
                    object2 = object2 != null ? ((Facet)object2).getName() : null;
                    object.setContentDescription((CharSequence)object2);
                }
                if ((object = this.L) == null) return;
                object2 = this.cb().d.k0;
                if (object2 != null) {
                    string2 = ((Facet)object2).getName();
                }
                object.setText((CharSequence)string2);
                return;
            }
        }
        if ((object = this.K) == null) return;
        int n3 = 8;
        object.setVisibility(n3);
    }

    public abstract void tb();

    public final void ub() {
        CharSequence charSequence;
        Object object;
        int n3;
        Object object2;
        Object object3 = this.cb().d;
        int n4 = ((bv2_0)object3).r();
        int n7 = 8;
        Object object4 = " ";
        if (n4 > 0) {
            object2 = this.R;
            if (object2 != null) {
                object2.setVisibility(0);
            }
            if ((object2 = this.S) != null) {
                object2.setVisibility(0);
            }
            if (n4 > (n3 = 1)) {
                object2 = this.J;
                object = " filters";
                if (object2 != null) {
                    int n8 = R$string.filters;
                    charSequence = hv3_0.K(n8);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((String)charSequence);
                    stringBuilder.append((String)object4);
                    stringBuilder.append(n4);
                    stringBuilder.append((String)object);
                    charSequence = stringBuilder.toString();
                    object2.setContentDescription(charSequence);
                }
                object3 = UX.a(n4, (String)object);
                object2 = this.S;
                if (object2 != null) {
                    object2.setText((CharSequence)object3);
                }
            } else {
                object2 = this.J;
                object = " filter";
                if (object2 != null) {
                    int n10 = R$string.filters;
                    charSequence = hv3_0.K(n10);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((String)charSequence);
                    stringBuilder.append((String)object4);
                    stringBuilder.append(n4);
                    stringBuilder.append((String)object);
                    charSequence = stringBuilder.toString();
                    object2.setContentDescription(charSequence);
                }
                object3 = UX.a(n4, (String)object);
                object2 = this.S;
                if (object2 != null) {
                    object2.setText((CharSequence)object3);
                }
            }
        } else {
            object3 = this.R;
            if (object3 != null) {
                object3.setVisibility(n7);
            }
            if ((object3 = this.S) != null) {
                object3.setVisibility(n7);
            }
        }
        if ((object3 = this.cb().d.z) != null) {
            object3 = this.H;
            n7 = 0;
            String string2 = null;
            if (object3 != null) {
                n3 = R$string.plp_sort_by;
                object2 = hv3_0.K(n3);
                object = this.cb().d.z;
                object = object != null ? ((Sort)object).getName() : null;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object2);
                ((StringBuilder)charSequence).append((String)object4);
                ((StringBuilder)charSequence).append((String)object);
                object4 = ((StringBuilder)charSequence).toString();
                object3.setContentDescription((CharSequence)object4);
            }
            if ((object3 = this.U) != null) {
                object3.setVisibility(0);
            }
            if ((object3 = this.U) != null) {
                object4 = this.cb().d.z;
                if (object4 != null) {
                    string2 = ((Sort)object4).getName();
                }
                object3.setText((CharSequence)string2);
            }
        } else {
            object3 = this.U;
            if (object3 != null) {
                object3.setVisibility(n7);
            }
        }
    }

    public final void v8() {
        View view = this.J;
        if (view != null) {
            view.performClick();
        }
    }

    public final void vb() {
        Object object;
        Object object2 = this.D;
        if (object2 != null) {
            Context context = this.requireContext();
            object = new LinearLayoutManager(context, 0, false);
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
        }
        object = this;
        object = (ia_0)this;
        this.t = object2 = new hZ1((ia_0)object);
        object = this.n;
        ((hZ1)object2).g((ArrayList)object);
        object2 = this.D;
        if (object2 != null) {
            object = this.t;
            ((RecyclerView)object2).setAdapter((RecyclerView$f)object);
        }
    }

    public final void wb(ProductsList object) {
        Collection collection;
        int n3;
        String string2 = this.h;
        String string3 = null;
        if (string2 == null || (n3 = string2.length()) == 0) {
            string2 = object != null ? ((ProductsList)object).getFreeTextSearch() : null;
        }
        if (object != null) {
            collection = ((ProductsList)object).getProducts();
        } else {
            n3 = 0;
            collection = null;
        }
        collection = collection;
        if (collection != null && (n3 = (int)(collection.isEmpty() ? 1 : 0)) == 0) {
            int n4;
            Object object2;
            n3 = 0;
            collection = null;
            if (object != null && (object2 = ((ProductsList)object).getProducts()) != null && (object2 = (Product)object2.get(0)) != null) {
                object2 = ((Product)object2).getImages();
            } else {
                n4 = 0;
                object2 = null;
            }
            object2 = (Collection)object2;
            if (object2 != null && (n4 = object2.isEmpty()) == 0 && (n4 = og1_1.c()) == 0 && string2 != null && (n4 = string2.length()) != 0) {
                block14: {
                    boolean bl2;
                    if (object != null && (object2 = ((ProductsList)object).getProducts()) != null && (object2 = (Product)object2.get(0)) != null) {
                        object2 = ((Product)object2).getImages();
                    } else {
                        n4 = 0;
                        object2 = null;
                    }
                    Intrinsics.checkNotNull(object2);
                    object2 = object2.iterator();
                    while (bl2 = object2.hasNext()) {
                        boolean bl3;
                        String string4;
                        boolean bl4;
                        ProductImage productImage = (ProductImage)object2.next();
                        String string5 = productImage.getFormat();
                        if (string5 == null || (bl4 = string5.equalsIgnoreCase(string4 = "mobileProductListingImage")) != (bl3 = true)) continue;
                        object2 = productImage.getUrl();
                        break block14;
                    }
                    n4 = 0;
                    object2 = null;
                }
                if (object2 != null) {
                    object = this.cb();
                    Intrinsics.checkNotNull(string2);
                    ((F12)object).m((String)object2, string2);
                } else {
                    if (object != null && (object = ((ProductsList)object).getProducts()) != null && (object = (Product)object.get(0)) != null && (object = ((Product)object).getImages()) != null && (object = (ProductImage)CollectionsKt.S((List)object)) != null) {
                        string3 = ((ProductImage)object).getUrl();
                    }
                    if (string3 != null) {
                        object = this.cb();
                        Intrinsics.checkNotNull(string2);
                        ((F12)object).m(string3, string2);
                    }
                }
            }
        }
    }

    public final void x4(Product product, String string2, boolean bl2) {
        if (product != null && string2 != null) {
            this.R4(product, string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void xb(ProductsList object) {
        int n3;
        int n4;
        block5: {
            block6: {
                Object object2;
                block4: {
                    object2 = tr2_2.a;
                    n4 = tr2_2.w(this.s0);
                    if (!n4) {
                        n4 = tr2_2.n(this.s0);
                        if (n4 == 0) return;
                    }
                    if (object == null) return;
                    object2 = ((ProductsList)object).getPagination();
                    if (object2 == null) return;
                    n4 = ((Pagination)object2).getCurrentPage();
                    if (n4 != 0) return;
                    object2 = ((ProductsList)object).getPriceRevealMetaInfo();
                    if (object2 != null) break block4;
                    long l2 = 0L;
                    object = l2;
                    object2 = l2;
                    tr2_2.B((Long)object, (Long)object2);
                    object = this.cb().d;
                    n4 = (int)(this.s0 ? 1 : 0);
                    n3 = (int)(((bv2_0)object).v(n4 != 0) ? 1 : 0);
                    if (n3 == 0) break block5;
                    break block6;
                }
                if ((object = ((ProductsList)object).getPriceRevealMetaInfo()) == null) break block5;
                object2 = ((PriceRevealMetaInfo)object).getSaleStartTime();
                object = ((PriceRevealMetaInfo)object).getSaleEndTime();
                tr2_2.B((Long)object2, (Long)object);
                object = this.cb().d;
                n4 = this.s0;
                n3 = (int)(((bv2_0)object).v(n4 != 0) ? 1 : 0);
                if (n3 != 0) break block6;
                object = null;
                n3 = (int)(tr2_2.n(false) ? 1 : 0);
                if (n3 == 0) break block5;
            }
            this.gb();
            return;
        }
        if ((n3 = this.B0) != (n4 = this.m)) return;
        this.fb();
    }

    public abstract void yb();

    public final void z2() {
        boolean bl2;
        Object object = this.S0;
        if (object != null) {
            ai0_2.B((View)object);
        }
        if (bl2 = km_1.b((cp$a)(object = cp_1.Companion))) {
            bl2 = false;
            this.Ra(0);
            object = this.J;
            if (object != null) {
                ai0_2.a((View)object);
            }
            if ((object = this.p) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbarListener");
                bl2 = false;
                object = null;
            }
            object = object.getToolbar();
            if (object != null) {
                ai0_2.a((View)object);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean zb() {
        block88: {
            block89: {
                var1_1 = h40_0.Q1();
                var2_2 = 0;
                var3_3 = 0.0f;
                var4_4 = null;
                if (var1_1 == 0) break block88;
                var5_5 /* !! */  = this.x;
                if (var5_5 /* !! */  != null) {
                    ai0_2.i(var5_5 /* !! */ );
                }
                if ((var5_5 /* !! */  = this.y) != null) {
                    ai0_2.i(var5_5 /* !! */ );
                }
                if ((var1_1 = this.y0) == 0) break block89;
                var5_5 /* !! */  = this.cb().d.M;
                if (var5_5 /* !! */  != null) {
                    var5_5 /* !! */  = var5_5 /* !! */ .getProducts();
                } else {
                    var1_1 = 0;
                    var5_5 /* !! */  = null;
                }
                var5_5 /* !! */  = (Collection)var5_5 /* !! */ ;
                if (var5_5 /* !! */  == null || (var1_1 = (int)var5_5 /* !! */ .isEmpty()) != 0) break block88;
            }
            if ((var1_1 = this.B0) == (var6_6 = this.l)) {
                var5_5 /* !! */  = this.y;
                if (var5_5 /* !! */  != null) {
                    ai0_2.B(var5_5 /* !! */ );
                }
            } else {
                var5_5 /* !! */  = this.x;
                if (var5_5 /* !! */  != null) {
                    ai0_2.B(var5_5 /* !! */ );
                }
            }
        }
        var5_5 /* !! */  = this.cb().d.M;
        var6_6 = 2;
        var7_7 = true;
        if (var5_5 /* !! */  != null && (var5_5 /* !! */  = var5_5 /* !! */ .getPagination()) != null && (var1_1 = var5_5 /* !! */ .getCurrentPage()) == 0) {
            this.r0 = 0;
            var5_5 /* !! */  = this.cb().d.M;
            this.eb((ProductsList)var5_5 /* !! */ );
            var5_5 /* !! */  = h40_0.a;
            var1_1 = (int)h40_0.z1();
            if (var1_1 == 0) {
                var5_5 /* !! */  = bv2_0.Companion;
                var5_5 /* !! */ .getClass();
                bv2_0.b2 = false;
                this.Sa();
            } else {
                var5_5 /* !! */  = bv2_0.Companion;
                var5_5 /* !! */ .getClass();
                var1_1 = (int)bv2_0.b2;
                if (var1_1 == 0) {
                    this.Sa();
                }
            }
            var5_5 /* !! */  = el1_2.a;
            var5_5 /* !! */  = this.cb().d.M;
            var8_8 = var5_5 /* !! */  != null ? (var5_5 /* !! */  = var5_5 /* !! */ .getProducts()) : null;
            var9_9 /* !! */  = this.W0;
            var10_10 = System.currentTimeMillis();
            var12_11 /* !! */  = k7.f(var10_10, "yyyy-MM-dd'T'hh:mm:ss+0530");
            var13_12 = this.ab();
            Intrinsics.checkNotNullParameter(var9_9 /* !! */ , "startTime");
            Intrinsics.checkNotNullParameter(var12_11 /* !! */ , "endTime");
            var5_5 /* !! */  = "listName";
            Intrinsics.checkNotNullParameter(var13_12, (String)var5_5 /* !! */ );
            var1_1 = (int)el1_2.j();
            if (var1_1 != 0) {
                var5_5 /* !! */  = el1_2.b;
                var14_13 = ir0_2.a;
                var15_14 = em0_2.b;
                var14_13 = var16_15;
                var16_15 = new ql1_1((String)var9_9 /* !! */ , var12_11 /* !! */ , var13_12, (List)var8_8, null);
                Ae3.d((i90_0)var5_5 /* !! */ , var15_14, null, var16_15, var6_6);
            }
            var5_5 /* !! */  = this.cb().d;
            var14_13 = this.cb().d.M;
            if (var14_13 != null) {
                var14_13 = var14_13.getBrandDetails();
            } else {
                var17_16 = 0;
                var14_13 = null;
                var18_17 = 0.0f;
            }
            var5_5 /* !! */ .r = var14_13;
            this.rb();
            var1_1 = Build.VERSION.SDK_INT;
            var17_16 = 23;
            var18_17 = 3.2E-44f;
            if (var1_1 > var17_16 && (var1_1 = (int)this.a) != 0) {
                var5_5 /* !! */  = this.cb().d.M;
                if (var5_5 /* !! */  != null && (var5_5 /* !! */  = var5_5 /* !! */ .getBrandDetails()) != null) {
                    var5_5 /* !! */  = var5_5 /* !! */ .getMetaData();
                } else {
                    var1_1 = 0;
                    var5_5 /* !! */  = null;
                }
                if (var5_5 /* !! */  != null) {
                    var5_5 /* !! */  = this.U0;
                    if (var5_5 /* !! */  == null) {
                        var14_13 = this.requireContext();
                        var9_9 /* !! */  = "requireContext(...)";
                        Intrinsics.checkNotNullExpressionValue(var14_13, (String)var9_9 /* !! */ );
                        var5_5 /* !! */  = new ma_2((Context)var14_13);
                        this.U0 = var5_5 /* !! */ ;
                    }
                    if ((var5_5 /* !! */  = this.U0) != null) {
                        var5_5 /* !! */ .j((int)var7_7, var7_7);
                    }
                }
            }
        }
        var5_5 /* !! */  = this.cb().d.K;
        var17_16 = 8;
        var18_17 = 1.1E-44f;
        if (var5_5 /* !! */  != null && (var1_1 = (int)var5_5 /* !! */ .isEmpty()) == 0) {
            var5_5 /* !! */  = this.Y;
            if (var5_5 /* !! */  != null) {
                var5_5 /* !! */ .setVisibility(var17_16);
            }
            this.Va().A(false);
            this.sb();
            var5_5 /* !! */  = this.B;
            if (var5_5 /* !! */  != null) {
                var5_5 /* !! */ .setVisibility(0);
            }
            if ((var5_5 /* !! */  = this.E) != null) {
                var5_5 /* !! */ .setVisibility(0);
            }
            if ((var5_5 /* !! */  = this.G) != null) {
                var5_5 /* !! */ .setVisibility(0);
            }
            if ((var5_5 /* !! */  = this.P) != null) {
                var5_5 /* !! */ .setLoadingSate(false);
            }
            if ((var5_5 /* !! */  = this.B) != null) {
                var5_5 /* !! */  = var5_5 /* !! */ .getAdapter();
            } else {
                var1_1 = 0;
                var5_5 /* !! */  = null;
            }
            if (var5_5 /* !! */  == null) {
                var5_5 /* !! */  = this.cb();
                var19_18 /* !! */  = this.j;
                var20_20 = this.cb().d.M;
                if (var20_20 == null || (var20_20 = var20_20.getPlpViewType()) == null) {
                    var20_20 = "";
                }
                var5_5 /* !! */ .getClass();
                Intrinsics.checkNotNullParameter(var19_18 /* !! */ , "toggleValue");
                Intrinsics.checkNotNullParameter(var20_20, "viewType");
                var5_5 /* !! */  = "A";
                var17_16 = (int)Intrinsics.areEqual(var19_18 /* !! */ , var5_5 /* !! */ );
                var9_9 /* !! */  = "List";
                if (var17_16 != 0 && (var17_16 = (int)var20_20.equalsIgnoreCase((String)var9_9 /* !! */ )) != 0) {
                    var5_5 /* !! */  = Yj2.LIST;
                } else {
                    var17_16 = (int)Intrinsics.areEqual(var19_18 /* !! */ , var5_5 /* !! */ );
                    var12_11 /* !! */  = "Grid";
                    var5_5 /* !! */  = var17_16 != 0 && (var17_16 = (int)var20_20.equalsIgnoreCase(var12_11 /* !! */ )) != 0 ? Yj2.GRID : ((var1_1 = (int)Intrinsics.areEqual(var19_18 /* !! */ , var5_5 /* !! */ )) != 0 && (var1_1 = var20_20.length()) == 0 ? Yj2.GRID : ((var1_1 = (int)Intrinsics.areEqual(var19_18 /* !! */ , var5_5 /* !! */  = "B")) != 0 ? Yj2.NONE : ((var17_16 = (int)Intrinsics.areEqual(var19_18 /* !! */ , var5_5 /* !! */  = "C")) != 0 && (var17_16 = var20_20.length()) == 0 ? Yj2.NONE : ((var17_16 = (int)Intrinsics.areEqual(var19_18 /* !! */ , var5_5 /* !! */ )) != 0 && (var17_16 = (int)var20_20.equalsIgnoreCase((String)var9_9 /* !! */ )) != 0 ? Yj2.LIST : ((var1_1 = (int)Intrinsics.areEqual(var19_18 /* !! */ , var5_5 /* !! */ )) != 0 && (var1_1 = (int)var20_20.equalsIgnoreCase(var12_11 /* !! */ )) != 0 ? Yj2.GRID : Yj2.NONE)))));
                }
                this.G0 = var5_5 /* !! */ ;
                var5_5 /* !! */  = PlpListViewEvents.Companion.getInstance();
                var19_18 /* !! */  = this.G0;
                var5_5 /* !! */ .logToggleButtonViewEvent((Yj2)var19_18 /* !! */ );
                var5_5 /* !! */  = this.G0;
                var19_18 /* !! */  = Yj2.NONE;
                if (var5_5 /* !! */  == var19_18 /* !! */ ) {
                    this.I5();
                } else {
                    this.z0();
                }
                var5_5 /* !! */  = this.c1;
                this.Bb((CartDeliveryAddress)var5_5 /* !! */ );
            } else {
                this.Ib();
            }
            this.ub();
            var1_1 = this.Za();
            var19_18 /* !! */  = this.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(var19_18 /* !! */ , "getViewLifecycleOwner(...)");
            var19_18 /* !! */  = nu1_0.a((mu1_1)var19_18 /* !! */ );
            var20_20 = new Q22$e(this, var1_1, null);
            Ae3.d((i90_0)var19_18 /* !! */ , null, null, (Function2)var20_20, 3);
            return false;
        }
        var5_5 /* !! */  = this.B;
        if (var5_5 /* !! */  != null) {
            var5_5 /* !! */ .setVisibility(var17_16);
        }
        if ((var5_5 /* !! */  = this.E) != null) {
            var5_5 /* !! */ .setVisibility(var17_16);
        }
        if ((var5_5 /* !! */  = this.G) != null) {
            var5_5 /* !! */ .setVisibility(var17_16);
        }
        var9_9 /* !! */  = Looper.getMainLooper();
        var5_5 /* !! */  = new Handler(var9_9 /* !! */ );
        var9_9 /* !! */  = new H22(this, 0);
        var10_10 = 100;
        var5_5 /* !! */ .postDelayed((Runnable)var9_9 /* !! */ , var10_10);
        var5_5 /* !! */  = this.Y;
        if (var5_5 /* !! */  != null) {
            var5_5 /* !! */ .setVisibility(0);
        }
        this.tb();
        var5_5 /* !! */  = this.Va().l();
        var21_21 = h40_0.Q1();
        if (var21_21 == 0 || (var21_21 = (var9_9 /* !! */  = this.Va()).getPreference(var12_11 /* !! */  = "pd_zsr", false)) == 0) ** GOTO lbl-1000
        if (var5_5 /* !! */  != null) {
            var9_9 /* !! */  = var5_5 /* !! */ .getAddressType();
        } else {
            var21_21 = 0;
            var9_9 /* !! */  = null;
        }
        var12_11 /* !! */  = AddressType.Address;
        if (var9_9 /* !! */  == var12_11 /* !! */ ) ** GOTO lbl-1000
        if (var5_5 /* !! */  != null) {
            var9_9 /* !! */  = var5_5 /* !! */ .getAddressType();
        } else {
            var21_21 = 0;
            var9_9 /* !! */  = null;
        }
        var12_11 /* !! */  = AddressType.Pincode;
        if (var9_9 /* !! */  == var12_11 /* !! */ ) lbl-1000:
        // 2 sources

        {
            this.Va().A(false);
            var9_9 /* !! */  = this.y;
            if (var9_9 /* !! */  != null) {
                var9_9 /* !! */ .setVisibility(var17_16);
            }
            if ((var9_9 /* !! */  = this.x) != null) {
                var9_9 /* !! */ .setVisibility(var17_16);
            }
            if ((var9_9 /* !! */  = this.q0) != null) {
                var9_9 /* !! */ .setVisibility(var17_16);
            }
            if (var5_5 /* !! */  != null) {
                var5_5 /* !! */  = var5_5 /* !! */ .getPostalCode();
            } else {
                var1_1 = 0;
                var5_5 /* !! */  = null;
            }
            var5_5 /* !! */  = E1.a("pincode", (String)var5_5 /* !! */ );
            var14_13 = AnalyticsManager.Companion;
            var9_9 /* !! */  = "No faster delivery screen";
            vb0_0.a((AnalyticsManager$Companion)var14_13, (String)var9_9 /* !! */ , (Bundle)var5_5 /* !! */ );
            var14_13 = this.Z;
            if (var14_13 != null) {
                var14_13.setVisibility(0);
            }
            if ((var14_13 = this.getContext()) != null) {
                var9_9 /* !! */  = od3_2.a();
                var21_21 = Intrinsics.areEqual(var9_9 /* !! */ , var12_11 /* !! */  = ld3_2.STORE_AJIOGRAM.getStoreId());
                if (var21_21 != 0) {
                    var9_9 /* !! */  = this.Z;
                    if (var9_9 /* !! */  != null) {
                        var22_22 = R$color.black;
                        var17_16 = t70.getColor((Context)var14_13, var22_22);
                        var9_9 /* !! */ .setTextColor(var17_16);
                    }
                    if ((var14_13 = this.Z) != null) {
                        var21_21 = R$drawable.bg_yellow_button;
                        var14_13.setBackgroundResource(var21_21);
                    }
                } else {
                    var9_9 /* !! */  = od3_2.a();
                    var21_21 = Intrinsics.areEqual(var9_9 /* !! */ , var12_11 /* !! */  = ld3_2.STORE_LUXE.getStoreId());
                    if (var21_21 != 0) {
                        var9_9 /* !! */  = this.Z;
                        if (var9_9 /* !! */  != null) {
                            var22_22 = R$color.white;
                            var17_16 = t70.getColor((Context)var14_13, var22_22);
                            var9_9 /* !! */ .setTextColor(var17_16);
                        }
                        if ((var14_13 = this.Z) != null) {
                            var21_21 = R$drawable.center_tab_selected_noti_bg;
                            var14_13.setBackgroundResource(var21_21);
                        }
                    } else {
                        var9_9 /* !! */  = this.Z;
                        if (var9_9 /* !! */  != null) {
                            var22_22 = R$color.white;
                            var17_16 = t70.getColor((Context)var14_13, var22_22);
                            var9_9 /* !! */ .setTextColor(var17_16);
                        }
                        if ((var14_13 = this.Z) != null) {
                            var21_21 = R$drawable.bg_black_button;
                            var14_13.setBackgroundResource(var21_21);
                        }
                    }
                }
            }
            if ((var14_13 = this.Z) != null) {
                var9_9 /* !! */  = new K22(this, (Bundle)var5_5 /* !! */ );
                var14_13.setOnClickListener((View.OnClickListener)var9_9 /* !! */ );
            }
            if ((var5_5 /* !! */  = this.k0) != null) {
                var14_13 = h40_0.a;
                var17_16 = (int)h40_0.Q1();
                if (var17_16 == 0 || (var14_13 = h40_0.k0(false)) == null || (var14_13 = var14_13.getPlpDelivery()) == null || (var14_13 = var14_13.getPlpListing()) == null || (var14_13 = var14_13.getPlpEmptyScreenTitle()) == null || (var21_21 = var14_13.length()) <= 0) {
                    var17_16 = 0;
                    var14_13 = null;
                    var18_17 = 0.0f;
                }
                var5_5 /* !! */ .setText((CharSequence)var14_13);
            }
            if ((var5_5 /* !! */  = this.k0) != null) {
                var17_16 = 1099956224;
                var18_17 = 18.0f;
                var5_5 /* !! */ .setTextSize(var6_6, var18_17);
            }
            if ((var5_5 /* !! */  = this.getContext()) != null) {
                var14_13 = od3_2.a();
                var17_16 = (int)Intrinsics.areEqual(var14_13, var9_9 /* !! */  = ld3_2.STORE_AJIOGRAM.getStoreId());
                if (var17_16 != 0) {
                    var14_13 = this.k0;
                    if (var14_13 != null) {
                        var21_21 = R$color.white;
                        var1_1 = t70.getColor((Context)var5_5 /* !! */ , var21_21);
                        var14_13.setTextColor(var1_1);
                    }
                } else {
                    var14_13 = this.k0;
                    if (var14_13 != null) {
                        var21_21 = R$color.accent_color_10;
                        var1_1 = t70.getColor((Context)var5_5 /* !! */ , var21_21);
                        var14_13.setTextColor(var1_1);
                    }
                }
            }
            if ((var5_5 /* !! */  = this.k0) != null) {
                var14_13 = FontsManager.getInstance();
                var9_9 /* !! */  = this.getActivity();
                var22_22 = 10;
                var14_13 = var14_13.getTypefaceWithFont((Context)var9_9 /* !! */ , var22_22);
                var5_5 /* !! */ .setTypeface((Typeface)var14_13);
            }
            if ((var5_5 /* !! */  = this.p0) != null) {
                var14_13 = h40_0.a;
                var17_16 = (int)h40_0.Q1();
                if (var17_16 != 0 && (var14_13 = h40_0.k0(false)) != null && (var14_13 = var14_13.getPlpDelivery()) != null && (var14_13 = var14_13.getPlpListing()) != null && (var14_13 = var14_13.getPlpEmptyScreenSubTitle()) != null && (var21_21 = var14_13.length()) > 0) {
                    var4_4 = var14_13;
                }
                var5_5 /* !! */ .setText(var4_4);
            }
            if ((var5_5 /* !! */  = this.p0) != null) {
                var2_2 = 0x41400000;
                var3_3 = 12.0f;
                var5_5 /* !! */ .setTextSize(var6_6, var3_3);
            }
            if ((var5_5 /* !! */  = this.getContext()) != null) {
                var4_4 = od3_2.a();
                var2_2 = (int)Intrinsics.areEqual(var4_4, var19_19 = ld3_2.STORE_AJIOGRAM.getStoreId());
                if (var2_2 != 0) {
                    var4_4 = this.p0;
                    if (var4_4 != null) {
                        var6_6 = R$color.white;
                        var1_1 = t70.getColor((Context)var5_5 /* !! */ , var6_6);
                        var4_4.setTextColor(var1_1);
                    }
                } else {
                    var4_4 = this.p0;
                    if (var4_4 != null) {
                        var6_6 = R$color.accent_color_10;
                        var1_1 = t70.getColor((Context)var5_5 /* !! */ , var6_6);
                        var4_4.setTextColor(var1_1);
                    }
                }
            }
            if ((var5_5 /* !! */  = this.p0) != null) {
                var4_4 = FontsManager.getInstance();
                var19_19 = this.getActivity();
                var17_16 = 9;
                var18_17 = 1.3E-44f;
                var4_4 = var4_4.getTypefaceWithFont((Context)var19_19, var17_16);
                var5_5 /* !! */ .setTypeface((Typeface)var4_4);
            }
        } else lbl-1000:
        // 2 sources

        {
            this.Va().A(false);
            var5_5 /* !! */  = this.Z;
            if (var5_5 /* !! */  != null) {
                var5_5 /* !! */ .setVisibility(var17_16);
            }
            if ((var5_5 /* !! */  = this.y) != null) {
                var5_5 /* !! */ .setVisibility(0);
            }
            if ((var5_5 /* !! */  = this.x) != null) {
                var5_5 /* !! */ .setVisibility(0);
            }
        }
        this.Va().A(false);
        return var7_7;
    }
}

