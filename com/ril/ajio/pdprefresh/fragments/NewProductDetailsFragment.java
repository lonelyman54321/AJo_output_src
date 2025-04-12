/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.content.Intent
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.ril.ajio.pdprefresh.fragments;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.D;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveData$c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager$b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.recyclerview.widget.o;
import com.airbnb.lottie.LottieAnimationView;
import com.ajio.ril.core.network.AnonymousToken;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.getkeepsafe.taptargetview.TapTargetView$Listener;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$attr;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$menu;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.FbEventContentData;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import com.ril.ajio.customviews.ChangeLocationListener;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar$DisplayMode;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.managers.ActivityTransitionManager;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.data.database.dbhelper.RecentlyViewedDaoHelper;
import com.ril.ajio.data.database.entity.ProductExperience;
import com.ril.ajio.data.database.entity.SearchRv;
import com.ril.ajio.data.model.PLPRequest;
import com.ril.ajio.data.repo.CartRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.data.repo.PDPFunctionalRepo;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.kmm.shared.model.home.transform.BannerAdsMetaData;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.login.activity.LoginActivityRevamp;
import com.ril.ajio.login.activity.LoginActivityRevampNew;
import com.ril.ajio.pdp.data.ZoomExtras;
import com.ril.ajio.pdprefresh.customview.PDPCustomDoDView;
import com.ril.ajio.pdprefresh.data.AjiogramInterventions;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment$a;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment$a$a;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment$b;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment$c;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment$d;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment$e;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment$f;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment$g;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment$h;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment$i;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment$j;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment$l;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment$m;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment$setTimer$task$1;
import com.ril.ajio.pdprefresh.fragments.d;
import com.ril.ajio.pdprefresh.fragments.e;
import com.ril.ajio.permission.PermissionTrigger;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Home.LuxeFooterData;
import com.ril.ajio.services.data.Offers.BankOffer;
import com.ril.ajio.services.data.Offers.BankOfferItem;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.CategoryTags;
import com.ril.ajio.services.data.Product.ComprehensiveProductDetails;
import com.ril.ajio.services.data.Product.EddResult;
import com.ril.ajio.services.data.Product.FeatureData;
import com.ril.ajio.services.data.Product.FeatureValue;
import com.ril.ajio.services.data.Product.KYPImage;
import com.ril.ajio.services.data.Product.KYPMedia;
import com.ril.ajio.services.data.Product.KYPVideo;
import com.ril.ajio.services.data.Product.MandatoryInfo;
import com.ril.ajio.services.data.Product.PDPClosetActionIdentifier;
import com.ril.ajio.services.data.Product.PDPPriceError;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.PrepaidOffersItem;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.ProductPromotion;
import com.ril.ajio.services.data.Product.ProductSizeGuideData;
import com.ril.ajio.services.data.Product.ProductSkuInfo;
import com.ril.ajio.services.data.Product.ProductUserSizeRecomData;
import com.ril.ajio.services.data.Product.ProductUserSizeRecomResponse;
import com.ril.ajio.services.data.Product.ProductVideos;
import com.ril.ajio.services.data.Product.ProductfnlProductData;
import com.ril.ajio.services.data.Product.SectionData;
import com.ril.ajio.services.data.Product.SimilarProductWishlistDataHolder;
import com.ril.ajio.services.data.Product.SpotLight;
import com.ril.ajio.services.data.Product.SpotLightAttribute;
import com.ril.ajio.services.data.Product.Stock;
import com.ril.ajio.services.data.Product.Tag;
import com.ril.ajio.services.data.Product.TagPrimary;
import com.ril.ajio.services.data.Product.TagResponse;
import com.ril.ajio.services.data.Product.Video;
import com.ril.ajio.services.data.Product.fleek.BrandResponse;
import com.ril.ajio.services.data.Product.fleek.PostsResponse;
import com.ril.ajio.services.data.flashsale.pdp.ModelImage;
import com.ril.ajio.services.data.flashsale.pdp.RilfnlBreadCrumb;
import com.ril.ajio.services.data.ratings.AggregateRating;
import com.ril.ajio.services.data.ratings.RatingsModel;
import com.ril.ajio.services.data.ratings.RatingsResponse;
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.entity.Banner;
import com.ril.ajio.services.entity.Component;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.query.ProductListQuery;
import com.ril.ajio.utility.customview.InAppBottomUpdatesView;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class NewProductDetailsFragment
extends Y51
implements yi2_1,
zi2_1,
sj2_0,
t82_0,
cq1_2,
q82_0,
c92,
View.OnClickListener,
View.OnTouchListener,
s82_0,
ik3_2,
mf1_0,
WA,
wg2_1,
yv0_1,
J43,
hq_0,
sg1_2,
hd2_0,
Av,
bf3_1,
Kq0,
a92,
v82_0,
zm_2,
ChangeLocationListener,
hy0_0 {
    public static final NewProductDetailsFragment$a Companion;
    public final hh3_2 A;
    public LinearLayout A0;
    public ee0_1 A1;
    public oa1_1 B;
    public ImageView B0;
    public final ArrayList B1;
    public final hh3_2 C;
    public int C0;
    public Long C1;
    public final hh3_2 D;
    public TextView D0;
    public fo_1 D1;
    public final hh3_2 E;
    public Timer E0;
    public ff0_2 E1;
    public final lq2_1 F;
    public ImageButton F0;
    public o12_0 F1;
    public final NewEEcommerceEventsRevamp G;
    public String G0;
    public CartAddressListBottomSheet G1;
    public final NewCustomEventsRevamp H;
    public boolean H0;
    public boolean H1;
    public final hh3_2 I;
    public boolean I0;
    public boolean I1;
    public ImageButton J;
    public boolean J0;
    public String J1;
    public View K;
    public O63 K0;
    public boolean K1;
    public RecyclerView L;
    public LinearLayoutManager L0;
    public boolean L1;
    public sb3_1 M;
    public ArrayList M0;
    public yh2_1 M1;
    public View N;
    public final ArrayList N0;
    public int N1;
    public ShimmerFrameLayout O;
    public ArrayList O0;
    public final NewProductDetailsFragment$c O1;
    public GridLayoutManager P;
    public final ArrayList P0;
    public final NewProductDetailsFragment$d P1;
    public r43_0 Q;
    public ArrayList Q0;
    public ri2_0 R;
    public final ArrayList R0;
    public boolean S;
    public ArrayList S0;
    public final boolean[] T;
    public CartDeliveryAddress T0;
    public final qi_2 U;
    public long U0;
    public long V0;
    public final String W0;
    public boolean X;
    public boolean X0;
    public long Y;
    public boolean Y0;
    public int Z;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public AjioTextView c1;
    public String d1;
    public boolean e1;
    public boolean f1;
    public ea2_1 g;
    public ArrayList g1;
    public j3_0 h;
    public float h1;
    public fo3 i;
    public float i1;
    public vh3_2 j;
    public View j1;
    public A71 k;
    public ProductUserSizeRecomResponse k0;
    public TextView k1;
    public nm_1 l;
    public BankOffer l1;
    public lz1_1 m;
    public boolean m1;
    public ma_2 n;
    public String n1;
    public final HashSet o;
    public String o1;
    public boolean p;
    public B02 p0;
    public LottieAnimationView p1;
    public gE2 q;
    public EddResult q0;
    public pg2_2 q1;
    public final LinkedHashMap r;
    public View r0;
    public View r1;
    public ArrayList s;
    public LinearLayout s0;
    public n32_0 s1;
    public String t;
    public Boolean t0;
    public InAppBottomUpdatesView t1;
    public final zr1_1 u;
    public View u0;
    public boolean u1;
    public final zr1_1 v;
    public LinearLayout v0;
    public final D v1;
    public final hh3_2 w;
    public PDPCustomDoDView w0;
    public Component w1;
    public final hh3_2 x;
    public View x0;
    public N43 x1;
    public final hh3_2 y;
    public Toolbar y0;
    public la0_0 y1;
    public final hh3_2 z;
    public Boolean z0;
    public final D z1;

    static {
        NewProductDetailsFragment$a newProductDetailsFragment$a;
        Companion = newProductDetailsFragment$a = new Object();
    }

    public NewProductDetailsFragment() {
        Object object;
        Object object2 = new HashSet();
        this.o = object2;
        int n3 = 1;
        this.p = n3;
        Object object3 = new LinkedHashMap();
        this.r = object3;
        this.t = object3 = "";
        Serializable serializable = Boolean.FALSE;
        super(serializable);
        this.u = object;
        this.v = object;
        object = new Object();
        this.w = object = yr1_2.b((Function0)object);
        object = new z12_0(this);
        this.x = object = yr1_2.b((Function0)object);
        object = new a22_0(this, 0);
        this.y = object = yr1_2.b((Function0)object);
        object = new g22_0(this, 0);
        this.z = object = yr1_2.b((Function0)object);
        object = new h22_0(this);
        this.A = object = yr1_2.b((Function0)object);
        object = new i22_0(this);
        this.C = object = yr1_2.b((Function0)object);
        object = new j22_0(this);
        this.D = object = yr1_2.b((Function0)object);
        object = new pb0_0(this, n3);
        this.E = object = yr1_2.b((Function0)object);
        lq2_1.Companion.getClass();
        object = lq2$a_0.a(this);
        ((lq2_1)object).e();
        object2 = new iq2_1[n3];
        Iq2$b iq2$b = Iq2$b.b;
        object2[0] = iq2$b;
        ((lq2_1)object).g((iq2_1[])object2);
        Object object4 = PermissionTrigger.RATINGS;
        ((lq2_1)object).f((PermissionTrigger)((Object)object4));
        this.F = object;
        object4 = AnalyticsManager.Companion;
        this.G = object2 = ((AnalyticsManager$Companion)object4).getInstance().getNewEEcommerceEventsRevamp();
        object4 = ((AnalyticsManager$Companion)object4).getInstance().getNewCustomEventsRevamp();
        this.H = object4;
        object4 = new Object();
        object4 = yr1_2.b((Function0)object4);
        this.I = object4;
        object4 = new boolean[5];
        this.T = (boolean[])object4;
        super(2);
        new ArrayList();
        this.U = object4;
        super();
        this.k0 = object4;
        this.t0 = serializable;
        this.z0 = serializable;
        super();
        this.N0 = object4;
        super();
        this.P0 = object4;
        super();
        this.R0 = object4;
        this.W0 = object3;
        this.d1 = object3;
        object4 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        this.n1 = object4;
        object4 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        this.o1 = object4;
        object4 = Reflection.getOrCreateKotlinClass(yh0_0.class);
        object2 = new NewProductDetailsFragment$i(this);
        object = new NewProductDetailsFragment$j(this);
        super(this);
        object4 = LW0.a(this, (yn1_2)object4, (Function0)object2, (Function0)object, (Function0)((Object)serializable));
        this.v1 = object4;
        object4 = la0_0.BRAND_VOICE;
        this.y1 = object4;
        object4 = Reflection.getOrCreateKotlinClass(zp2_1.class);
        object2 = new NewProductDetailsFragment$l(this);
        object = new NewProductDetailsFragment$m(this);
        super(this);
        object4 = LW0.a(this, (yn1_2)object4, (Function0)object2, (Function0)object, (Function0)((Object)serializable));
        this.z1 = object4;
        super();
        this.B1 = object4;
        this.J1 = object3;
        this.N1 = -1;
        super(this);
        this.O1 = object4;
        super(this);
        this.P1 = object4;
    }

    /*
     * Unable to fully structure code
     */
    public static void Eb(Product var0) {
        if (var0 == null) {
            return;
        }
        var1_1 = new ArrayList<FbEventContentData>();
        var3_3 = var0.getCode();
        var4_4 = "";
        if (var3_3 == null) {
            var3_3 = var4_4;
        }
        var5_5 = 1;
        var2_2 = new FbEventContentData(var3_3, var5_5);
        var1_1.add((FbEventContentData)var2_2);
        var2_2 = var0.getPrice();
        var3_3 = null;
        if (var2_2 != null) {
            var2_2 = var0.getPrice();
            var2_2 = var2_2 != null ? var2_2.getValue() : null;
            var5_5 = (int)TextUtils.isEmpty((CharSequence)var2_2);
            if (var5_5 != 0) {
                var2_2 = "0.0";
            }
        } else {
            var2_2 = "0.0d";
        }
        if ((var6_6 = var0.getFnlColorVariantData()) == null) ** GOTO lbl-1000
        var6_6 = var0.getFnlColorVariantData();
        if (var6_6 != null) {
            var6_6 = var6_6.getBrandName();
        } else {
            var5_5 = 0;
            var6_6 = null;
        }
        if (var6_6 != null) {
            var6_6 = var0.getFnlColorVariantData();
            if (var6_6 != null) {
                var3_3 = var6_6.getBrandName();
            }
        } else if ((var6_6 = var0.getBrandName()) != null) {
            var3_3 = var0.getBrandName();
        }
        var6_6 = AnalyticsManager.Companion.getInstance().getFb();
        var7_7 = new AnalyticsData$Builder();
        var8_8 = var0.getCode();
        if (var8_8 == null) {
            var8_8 = var4_4;
        }
        var7_7 = var7_7.productCode(var8_8);
        if (var2_2 != null) {
            var4_4 = var2_2;
        }
        var2_2 = var7_7.price((String)var4_4).setBrand(var3_3);
        var0 = var0.getCatalog();
        var0 = var2_2.setCatalogId((String)var0).fbContentData(var1_1).build();
        var6_6.addToWishlistEvent((AnalyticsData)var0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void Yb(Banner object, int n3) {
        Object object2;
        Object object3 = ((Banner)object).getBannerType();
        int n4 = Intrinsics.areEqual(object3, "EXTERNAL_AD");
        CharSequence charSequence = "getHost(...)";
        String string2 = null;
        String string3 = "";
        if (n4 != 0) {
            object3 = ((Banner)object).getBannerAdsMetaData();
            if (object3 != null) {
                string2 = ((BannerAdsMetaData)object3).getCtaFb();
            }
            if (string2 != null && (n4 = string2.length()) != 0) {
                object3 = new URL(string2);
                object3 = ((URL)object3).getHost();
                Intrinsics.checkNotNullExpressionValue(object3, (String)charSequence);
            } else {
                object3 = string3;
            }
            charSequence = "TPBA";
        } else {
            object3 = ((Banner)object).getBannerType();
            n4 = Intrinsics.areEqual(object3, object2 = "AD");
            if (n4 != 0) {
                object3 = ((Banner)object).getBannerAdsMetaData();
                if (object3 != null) {
                    string2 = ((BannerAdsMetaData)object3).getCtaFb();
                }
                if (string2 != null && (n4 = string2.length()) != 0) {
                    object3 = new URL(string2);
                    object3 = ((URL)object3).getHost();
                    Intrinsics.checkNotNullExpressionValue(object3, (String)charSequence);
                } else {
                    object3 = string3;
                }
                charSequence = "jioads_direct_demand";
            } else {
                object3 = ((Banner)object).getBannerUrl();
                if (object3 == null) {
                    object3 = string3;
                }
                int n7 = 100;
                object3 = le3_2.E(n7, (String)object3);
                charSequence = "paid";
            }
        }
        Object object4 = object3;
        cp_1.Companion.getClass();
        object3 = cp$a.e();
        string2 = ((Banner)object).getBannerUrl();
        if (string2 != null) {
            string3 = string2;
        }
        object3.getClass();
        object3 = cp_1.k(string3);
        String string4 = n1.a((String)charSequence, " - ", (String)object3);
        object3 = ((Banner)object).getWidth();
        object = ((Banner)object).getHeight();
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(object3);
        ((StringBuilder)charSequence).append("x");
        ((StringBuilder)charSequence).append(object);
        String string5 = ((StringBuilder)charSequence).toString();
        String string6 = hj0_0.a(n3, "0|");
        object = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        String string7 = av_0.a((AnalyticsManager$Companion)object);
        String string8 = bv_0.a((AnalyticsManager$Companion)object);
        ((NewEEcommerceEventsRevamp)object2).pushSelectContentEventForThirdPartyBanner(string7, string8, (String)object4, string4, string5, string6);
    }

    public static la0_0 lb(la0_0 la0_02, ArrayList arrayList) {
        int n3;
        Object object = la0_0.BRAND_VOICE;
        if (la0_02 != object) {
            int n4 = arrayList.size();
            boolean bl2 = false;
            Object var6_6 = null;
            for (n3 = 0; n3 < n4; ++n3) {
                Object object2 = (String)arrayList.get(n3);
                LA0$a lA0$a = la0_0.Companion;
                lA0$a.getClass();
                object2 = LA0$a.a(object2);
                if (bl2) {
                    object = object2;
                    break;
                }
                if (object2 != la0_02) continue;
                bl2 = true;
            }
        } else {
            int n7 = arrayList.size();
            while (n3 < n7) {
                Object object3 = (String)arrayList.get(n3);
                la0_0.Companion.getClass();
                object3 = LA0$a.a(object3);
                la0_0 la0_03 = la0_0.BRAND_VOICE;
                if (object3 != la0_03) {
                    object = object3;
                    break;
                }
                ++n3;
            }
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean ub() {
        boolean bl2 = og1_1.c();
        if (bl2) return false;
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = "referral_feature_enable";
        bl2 = ((ao0_0)object).a(string2);
        if (!bl2) return false;
        object = z40$a.a((Context)AJIOApplication$a.a()).a;
        string2 = "referrer_enable";
        bl2 = ((ao0_0)object).a(string2);
        if (!bl2) return false;
        object = z40$a.a((Context)AJIOApplication$a.a()).a;
        string2 = "referral_widget_pdp_enable";
        bl2 = ((ao0_0)object).a(string2);
        if (!bl2) return false;
        return true;
    }

    public final void A1(boolean bl2) {
        this.b1 = bl2;
        String.valueOf(bl2);
    }

    public final void A4(String object, boolean bl2) {
        Bundle bundle = Boolean.valueOf(bl2);
        Pair pair = new Pair("show_banner", bundle);
        int n3 = 1;
        bundle = new Pair[n3];
        bundle[0] = pair;
        bundle = DE.b((Pair[])bundle);
        Object object2 = bl2 ? "add to cart" : "pdp";
        bundle.putString("dress_tool_ingress", (String)object2);
        bundle.putString("dress_tool_source_details", (String)object);
        object = kj0_1.g();
        object2 = this.getActivity();
        ((kj0_1)object).r((Activity)object2, "dresstool", bundle);
    }

    public final ArrayList A5() {
        return this.O0;
    }

    public final ArrayList A8() {
        int n3;
        Object object;
        Object object2;
        Object object3;
        int n4;
        Object object4;
        NewProductDetailsFragment newProductDetailsFragment = this;
        Object object5 = this.cb();
        object5.getClass();
        Object object6 = new ArrayList();
        object5 = ((e12_0)object5).q;
        int n7 = 1;
        int n8 = 2;
        if (object5 != null && (object5 = ((Product)object5).getComprehensiveProductDetails()) != null) {
            Object object7;
            Object object8;
            Integer n10;
            KYPImage kYPImage;
            Long l2;
            Object object9;
            Object object10;
            String string2;
            Object object11;
            String string3;
            object4 = ((ComprehensiveProductDetails)object5).getImages().iterator();
            while ((n4 = object4.hasNext()) != 0) {
                object3 = (KYPImage)object4.next();
                string3 = ((KYPImage)object3).getFormat();
                object11 = ((KYPImage)object3).getUrl();
                string2 = ((KYPImage)object3).getImageName();
                object10 = ((KYPImage)object3).getKypSequence();
                object9 = n7;
                Long l3 = ((KYPImage)object3).getWidth();
                l2 = ((KYPImage)object3).getHeight();
                int n14 = 240;
                kYPImage = null;
                n10 = null;
                n4 = 0;
                object3 = null;
                object7 = object8;
                object2 = object8;
                object8 = null;
                ((KYPMedia)object7)(string3, (String)object11, string2, (Long)object10, null, null, null, null, (Integer)object9, l3, l2, n14, null);
                ((ArrayList)object6).add(object7);
                n7 = 1;
            }
            object5 = ((ComprehensiveProductDetails)object5).getVideos().iterator();
            while ((n7 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                object2 = (KYPVideo)object5.next();
                object3 = ((KYPVideo)object2).getFormat();
                object7 = ((KYPVideo)object2).getUrl();
                object11 = ((KYPVideo)object2).getKypSequence();
                string2 = ((KYPVideo)object2).getCodec();
                object10 = ((KYPVideo)object2).getVideoName();
                kYPImage = ((KYPVideo)object2).getThumbnail();
                n10 = n8;
                object9 = ((KYPVideo)object2).getWidth();
                object2 = ((KYPVideo)object2).getHeight();
                int n15 = 132;
                l2 = null;
                string3 = null;
                object4 = object8;
                object = object8;
                object8 = object9;
                object9 = object2;
                ((KYPMedia)object4)((String)object3, (String)object7, null, (Long)object11, string2, (String)object10, kYPImage, null, n10, (Long)object8, (Long)object2, n15, null);
                ((ArrayList)object6).add(object4);
                n8 = 2;
            }
        }
        object5 = new ArrayList();
        object6 = ((ArrayList)object6).iterator();
        while ((n7 = object6.hasNext()) != 0) {
            object = object2 = object6.next();
            object = ((KYPMedia)object2).getHeight();
            if (object == null) continue;
            ((ArrayList)object5).add(object2);
        }
        int n16 = ((ArrayList)object5).size();
        if (n16 > (n7 = 1)) {
            object6 = new Object();
            bx_2.q((List)object5, object6);
        }
        object6 = new ArrayList();
        object2 = ((ArrayList)object5).iterator();
        while ((n8 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object4 = object = object2.next();
            object4 = ((KYPMedia)object).getMediaType();
            if (object4 == null) {
                n4 = 2;
                continue;
            }
            n3 = (Integer)object4;
            if (n3 != (n4 = 2)) continue;
            ((ArrayList)object6).add(object);
        }
        n16 = (int)(((ArrayList)object6).isEmpty() ? 1 : 0);
        n7 = 1;
        if ((n16 ^= n7) != 0 && (n16 = gz3.a) > (n7 = 23)) {
            object6 = newProductDetailsFragment.n;
            object2 = "ajioVideoPlayer";
            n8 = 0;
            object = null;
            if (object6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n16 = 0;
                object6 = null;
            }
            n3 = 0;
            ((ma_2)object6).j(1, false);
            object6 = newProductDetailsFragment.L;
            object4 = new Object();
            ((bb3_1)object4).a = object6;
            ((bb3_1)object4).d = -1;
            ((bb3_1)object4).h = n4 = 40;
            if (object6 != null) {
                object3 = new ab3_1((bb3_1)object4);
                ((RecyclerView)object6).addOnScrollListener((RecyclerView$s)object3);
            }
            if ((object6 = newProductDetailsFragment.n) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object = object6;
            }
            object.getClass();
            object6 = "videoAutoPlayHelper";
            Intrinsics.checkNotNullParameter(object4, (String)object6);
            ((ma_2)object).t = object4;
        }
        return object5;
    }

    public final NewProductDetailsFragment Aa() {
        return this;
    }

    public final void Ab() {
        int n3;
        Object object = this.L;
        Object object2 = null;
        if (object != null) {
            object = ((RecyclerView)object).getAdapter();
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = object instanceof RecyclerView$f;
        if (n4 != 0) {
            object2 = object;
        }
        if (object2 == null) {
            return;
        }
        n3 = ((RecyclerView$f)object2).getItemCount();
        for (n4 = 0; n4 < n3; ++n4) {
            int n7;
            int n8 = ((RecyclerView$f)object2).getItemViewType(n4);
            if (n8 != (n7 = 5)) continue;
            object = this.L;
            if (object == null) break;
            ((RecyclerView)object).smoothScrollToPosition(n4);
            break;
        }
    }

    public final Pair B1() {
        Object object = this.cb();
        Serializable serializable = (Boolean)((e12_0)object).e1.getValue();
        boolean bl2 = (Boolean)serializable;
        String string2 = null;
        if (bl2 && (object = ((e12_0)object).q) != null && (object = ((Product)object).getTagResponse()) != null && (object = ((TagResponse)object).getTag()) != null && (object = ((Tag)object).getCategoryTags()) != null) {
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                String string3;
                boolean bl4;
                Object object2;
                serializable = (CategoryTags)object.next();
                if (serializable == null || (object2 = ((CategoryTags)serializable).getCategory()) == null || (bl4 = ((String)object2).equalsIgnoreCase(string3 = "SELLING_POINT")) != (bl3 = true)) continue;
                object2 = Boolean.TRUE;
                if ((serializable = ((CategoryTags)serializable).getPrimary()) != null) {
                    string2 = ((TagPrimary)serializable).getValue();
                }
                object = new Pair(object2, string2);
                break;
            }
        } else {
            serializable = Boolean.FALSE;
            object = new Pair(serializable, null);
        }
        return object;
    }

    public final boolean B5() {
        z40$a z40$a = z40_0.Companion;
        Application application = (Application)this.C.getValue();
        Intrinsics.checkNotNullExpressionValue(application, "<get-application>(...)");
        z40$a.getClass();
        return z40$a.a((Context)application).a.a("pdp_bank_offer_enable");
    }

    public final void B6(String string2) {
        Intrinsics.checkNotNullParameter(string2, "sizeInfoValue");
        this.d1 = string2;
    }

    public final boolean B9() {
        boolean bl2;
        PDPClosetActionIdentifier pDPClosetActionIdentifier = this.cb().p.d;
        Object object = this.cb().p;
        PDPClosetActionIdentifier pDPClosetActionIdentifier2 = PDPClosetActionIdentifier.DEFAULT;
        object.getClass();
        String string2 = "<set-?>";
        Intrinsics.checkNotNullParameter((Object)pDPClosetActionIdentifier2, string2);
        object.d = pDPClosetActionIdentifier2;
        object = PDPClosetActionIdentifier.FROM_SIMILAR;
        if (pDPClosetActionIdentifier == object) {
            bl2 = true;
        } else {
            bl2 = false;
            pDPClosetActionIdentifier = null;
        }
        return bl2;
    }

    public final ArrayList Ba() {
        return this.M0;
    }

    public final void Bb() {
        int n3;
        Object object = this.L;
        int n4 = 0;
        Integer n7 = null;
        if (object != null) {
            object = ((RecyclerView)object).getAdapter();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            object = this.L;
            if (object != null && (object = ((RecyclerView)object).getAdapter()) != null) {
                n3 = ((RecyclerView$f)object).getItemCount();
                n7 = n3;
            }
            if (n7 != null && (n3 = n7.intValue()) > 0 && (object = this.L) != null) {
                n4 = n7;
                ((RecyclerView)object).smoothScrollToPosition(n4);
            }
        }
    }

    public final void C0() {
        boolean[] blArray = this.T;
        int n3 = blArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            blArray[i3] = false;
        }
    }

    public final String C3() {
        Object object = this.cb().q;
        String string2 = "";
        if (object != null && (object = ((Product)object).getTagResponse()) != null && (object = ((TagResponse)object).getTag()) != null && (object = ((Tag)object).getCategoryTags()) != null) {
            boolean bl2;
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                String string3;
                boolean bl4;
                String string4;
                Object object2 = (CategoryTags)object.next();
                if (object2 == null || (string4 = ((CategoryTags)object2).getCategory()) == null || (bl4 = string4.equalsIgnoreCase(string3 = "SOCIAL_PROOFING")) != (bl3 = true)) continue;
                object = ((CategoryTags)object2).getPrimary();
                object = object != null ? ((TagPrimary)object).getValue() : null;
                if ((object = JsonParser.parseString(String.valueOf(object)).getAsJsonObject()) == null || !(bl4 = ((JsonObject)object).has((String)(object2 = "longText")))) break;
                object = ((JsonObject)object).get((String)object2);
                string2 = ((JsonElement)object).getAsString();
                Intrinsics.checkNotNull(string2);
                break;
            }
        }
        return string2;
    }

    public final void C4(boolean bl2) {
        boolean bl3 = this.u1;
        if (bl3 != bl2) {
            this.u1 = bl2;
            Object object = this.L;
            if (object != null && (object = ((RecyclerView)object).getAdapter()) != null) {
                ((RecyclerView$f)object).notifyDataSetChanged();
            }
        }
    }

    public final void Cb(Product object) {
        Object object2;
        int n3;
        boolean bl2;
        boolean bl3;
        Object object3 = mz3_0.a;
        Object object4 = this.ma();
        int n4 = 0;
        Object object5 = null;
        if (object4 != null) {
            bl3 = ((ProductOptionItem)object4).isReturnable();
        } else {
            bl3 = false;
            object4 = null;
        }
        ProductOptionItem productOptionItem = this.ma();
        if (productOptionItem != null) {
            bl2 = productOptionItem.isExchangeable();
        } else {
            bl2 = false;
            productOptionItem = null;
        }
        Object object6 = this.ma();
        if (object6 != null) {
            n3 = ((ProductOptionItem)object6).getReturnWindow();
        } else {
            n3 = 0;
            object6 = null;
        }
        object3 = ((mz3_0)object3).l(n3, bl3, bl2);
        object4 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        productOptionItem = new Bundle();
        object6 = ((Product)object).getFnlProductData();
        if (object6 != null) {
            object6 = ((ProductfnlProductData)object6).getCodDetailsHonoredWithFraud();
            object2 = Boolean.TRUE;
            n3 = (int)(Intrinsics.areEqual(object6, object2) ? 1 : 0);
        } else {
            n3 = 0;
            object6 = null;
        }
        object2 = "isCODfraud";
        productOptionItem.putInt((String)object2, n3);
        object6 = ((Product)object).getFnlProductData();
        if (object6 != null) {
            object5 = ((ProductfnlProductData)object6).getReturnDetailsHonoredWithFraud();
            object6 = Boolean.TRUE;
            n4 = (int)(Intrinsics.areEqual(object5, object6) ? 1 : 0);
        }
        productOptionItem.putInt("isRWfraud", n4);
        object5 = ((Product)object).getCode();
        productOptionItem.putString("product_id", (String)object5);
        object5 = ((Product)object).getName();
        productOptionItem.putString("product_name", (String)object5);
        object5 = ((Product)object).getBrickCategory();
        productOptionItem.putString("product_category", (String)object5);
        object5 = ((Product)object).getBrickName();
        object6 = "product_brick";
        productOptionItem.putString((String)object6, (String)object5);
        object = ((Product)object).getFnlProductData();
        if (object != null && (object = ((ProductfnlProductData)object).getCodAllowed()) != null) {
            boolean bl4 = (Boolean)object ^ true;
            object = bl4;
        } else {
            boolean bl5 = false;
            object = null;
        }
        object = String.valueOf(object);
        productOptionItem.putString("isCodBlocked", (String)object);
        ((NewCustomEventsRevamp)object4).newPDPInteractionsCustomEvent("return window & COD status", (String)object3, "pdp screen", (Bundle)productOptionItem);
    }

    public final boolean D2() {
        return this.X;
    }

    public final Price D7() {
        return this.cb().H;
    }

    public final void D9(int n3) {
        boolean bl2;
        Object object;
        Iterator iterator = this.cb();
        iterator.getClass();
        Iterator iterator2 = AnalyticsManager.Companion;
        String string2 = "Image action";
        Object object2 = "Zoom";
        String string3 = "pdp screen";
        tj2_0.e((AnalyticsManager$Companion)((Object)iterator2), string2, (String)object2, string3);
        iterator2 = ((e12_0)((Object)iterator)).q;
        if (iterator2 != null) {
            iterator2 = ((e12_0)((Object)iterator)).q0;
            ((ArrayList)((Object)iterator2)).clear();
            iterator = ((e12_0)((Object)iterator)).q;
            if (iterator != null && (object = ((Product)((Object)iterator)).getProductZoomImages()) != null && (iterator = ((Product)((Object)iterator)).getProductZoomImages()) != null) {
                boolean bl3;
                iterator = ((Iterable)((Object)iterator)).iterator();
                while (bl3 = iterator.hasNext()) {
                    object = ((ProductImage)iterator.next()).getUrl();
                    if (object == null) continue;
                    ((ArrayList)((Object)iterator2)).add(object);
                }
            }
        }
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushButtonTapEvent(string2, object2, string3);
        iterator = this.getActivity();
        if (iterator != null && !(bl2 = (iterator = this.requireActivity()).isFinishing())) {
            object2 = this.cb().q0;
            this.cb().getClass();
            object = this.cb().r;
            iterator2 = this.cb().q;
            ea2_1 ea2_12 = null;
            Iterator iterator3 = iterator2 != null ? (iterator2 = ((Product)((Object)iterator2)).getCode()) : null;
            iterator2 = this.cb().q;
            Iterator iterator4 = iterator2 != null ? (iterator2 = ((Product)((Object)iterator2)).getName()) : null;
            Long l2 = this.C1;
            string3 = null;
            iterator2 = iterator;
            iterator = new Iterator(n3, (ArrayList)object2, null, (ArrayList)object, (String)iterator3, (String)iterator4, l2);
            Object object3 = this.g;
            if (object3 == null) {
                object3 = "productDetailListener";
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            } else {
                ea2_12 = object3;
            }
            ea2_12.R1((ZoomExtras)((Object)iterator));
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void Db() {
        block93: {
            block92: {
                block91: {
                    var1_1 = this.cb();
                    if (var1_1 == null && (var1_1 = this.cb().q) == null) {
                        return;
                    }
                    var1_1 = this.cb().q;
                    var2_2 = null;
                    if (var1_1 != null) {
                        var1_1 = var1_1.getPrice();
                    } else {
                        var3_3 = 0;
                        var1_1 = null;
                    }
                    if (var1_1 != null) {
                        var1_1 = this.cb().q;
                        if (var1_1 != null && (var1_1 = var1_1.getPrice()) != null) {
                            var1_1 = var1_1.getValue();
                        } else {
                            var3_3 = 0;
                            var1_1 = null;
                        }
                        var4_4 = TextUtils.isEmpty((CharSequence)var1_1);
                        if (var4_4) {
                            var1_1 = "0.0";
                        }
                    } else {
                        var1_1 = "0.0d";
                    }
                    if ((var5_5 = this.cb().q) != null) {
                        var5_5 = var5_5.getFnlColorVariantData();
                    } else {
                        var4_4 = false;
                        var5_5 = null;
                    }
                    if (var5_5 == null) break block91;
                    var5_5 = this.cb().q;
                    if (var5_5 != null && (var5_5 = var5_5.getFnlColorVariantData()) != null) {
                        var5_5 = var5_5.getBrandName();
                    } else {
                        var4_4 = false;
                        var5_5 = null;
                    }
                    if (var5_5 == null) break block91;
                    var5_5 = this.cb().q;
                    if (var5_5 == null || (var5_5 = var5_5.getFnlColorVariantData()) == null) ** GOTO lbl-1000
                    var5_5 = var5_5.getBrandName();
                    break block92;
                }
                if ((var5_5 = this.cb().q) != null) {
                    var5_5 = var5_5.getBrandName();
                } else {
                    var4_4 = false;
                    var5_5 = null;
                }
                if (var5_5 != null && (var5_5 = this.cb().q) != null) {
                    var5_5 = var5_5.getBrandName();
                } else lbl-1000:
                // 2 sources

                {
                    var4_4 = false;
                    var5_5 = null;
                }
            }
            var6_6 = AnalyticsManager.Companion;
            var7_7 = var6_6.getInstance().getFb();
            var8_8 = new AnalyticsData$Builder();
            var9_9 = this.cb().q;
            if (var9_9 != null) {
                var9_9 = var9_9.getCode();
            } else {
                var10_10 = 0;
                var9_9 = null;
            }
            if (var9_9 != null && (var10_10 = var9_9.length()) != 0) {
                var9_9 = this.cb().q;
                if (var9_9 != null) {
                    var9_9 = var9_9.getCode();
                } else {
                    var10_10 = 0;
                    var9_9 = null;
                }
                Intrinsics.checkNotNull(var9_9);
            } else {
                var9_9 = "";
            }
            var8_8 = var8_8.productCode((String)var9_9);
            Intrinsics.checkNotNull(var1_1);
            var8_8 = var8_8.price((String)var1_1);
            var9_9 = this.cb().q;
            if (var9_9 != null) {
                var9_9 = var9_9.getCatalog();
            } else {
                var10_10 = 0;
                var9_9 = null;
            }
            var8_8 = var8_8.setCatalogId((String)var9_9);
            var5_5 = var8_8.setBrand((String)var5_5).build();
            var7_7.contentView((AnalyticsData)var5_5);
            var5_5 = this.cb().q;
            if (var5_5 == null) break block93;
            var5_5 = this.cb().q;
            if (var5_5 != null) {
                var5_5 = var5_5.getFnlColorVariantData();
            } else {
                var4_4 = false;
                var5_5 = null;
            }
            if (var5_5 == null) break block93;
            var5_5 = this.cb().q;
            if (var5_5 != null) {
                var5_5 = var5_5.getPrice();
            } else {
                var4_4 = false;
                var5_5 = null;
            }
            if (var5_5 == null) break block93;
            var5_5 = this.cb().q;
            if (var5_5 != null) {
                var5_5 = var5_5.getVariantOptions();
            } else {
                var4_4 = false;
                var5_5 = null;
            }
            var7_7 = "0.0f";
            var11_11 = 1;
            if (var5_5 == null) ** GOTO lbl-1000
            var5_5 = this.cb().q;
            if (var5_5 != null && (var5_5 = var5_5.getVariantOptions()) != null) {
                var4_4 = ((Collection)var5_5).isEmpty() ^ var11_11;
                var5_5 = var4_4;
            } else {
                var4_4 = false;
                var5_5 = null;
            }
            Intrinsics.checkNotNull(var5_5);
            var4_4 = var5_5.booleanValue();
            if (!var4_4) ** GOTO lbl-1000
            var5_5 = this.cb().q;
            if (var5_5 != null && (var5_5 = var5_5.getVariantOptions()) != null && (var5_5 = (ProductOptionItem)var5_5.get(0)) != null) {
                var5_5 = var5_5.getWasPriceData();
            } else {
                var4_4 = false;
                var5_5 = null;
            }
            if (var5_5 == null) ** GOTO lbl-1000
            var5_5 = this.cb().q;
            if (var5_5 != null && (var5_5 = var5_5.getVariantOptions()) != null && (var5_5 = (ProductOptionItem)var5_5.get(0)) != null && (var5_5 = var5_5.getWasPriceData()) != null) {
                var5_5 = var5_5.getValue();
            } else {
                var4_4 = false;
                var5_5 = null;
            }
            var12_12 = TextUtils.isEmpty((CharSequence)var5_5);
            if (var12_12) lbl-1000:
            // 4 sources

            {
                var13_13 = var7_7;
            } else {
                var13_13 = var5_5;
            }
            var5_5 = this.cb().q;
            if (var5_5 != null) {
                var5_5 = this.cb().q;
                var7_7 = new Bundle();
                Intrinsics.checkNotNull(var5_5);
                var8_8 = var5_5.getVerticalColor();
                var7_7.putString("Product_Vertical", (String)var8_8);
                var9_9 = var5_5.getBrickName();
                var7_7.putString("Product_Brick", (String)var9_9);
                var8_8 = "productName";
                var5_5 = var5_5.getName();
                var7_7.putString((String)var8_8, (String)var5_5);
                var5_5 = h40_0.a;
                var4_4 = h40_0.b2();
                if (var4_4) {
                    var5_5 = this.cb().q;
                    Intrinsics.checkNotNull(var5_5);
                    var5_5 = var5_5.getRatingsResponse();
                    if (var5_5 != null && (var5_5 = var5_5.getAggregateRating()) != null) {
                        var5_5 = var5_5.getAverageRating();
                    } else {
                        var4_4 = false;
                        var5_5 = null;
                    }
                    var7_7 = this.cb().q;
                    Intrinsics.checkNotNull(var7_7);
                    var7_7 = var7_7.getRatingsResponse();
                    if (var7_7 != null && (var7_7 = var7_7.getAggregateRating()) != null) {
                        var7_7 = var7_7.getNumUserRatings();
                    } else {
                        var14_14 = 0;
                        var7_7 = null;
                    }
                    var8_8 = new f22_0(this);
                    ai0_2.r((Function2)var8_8, var5_5, var7_7);
                }
            }
            if (!(var4_4 = this.M1())) ** GOTO lbl-1000
            var5_5 = h40_0.a;
            var4_4 = h40_0.m1();
            if (var4_4 && (var5_5 = h40_0.f()) != null) {
                var5_5 = var5_5.getTag_text();
                var15_15 = var5_5;
            } else lbl-1000:
            // 2 sources

            {
                var15_15 = null;
            }
            var5_5 = this.cb().q;
            var7_7 = this.cb().q;
            if (var7_7 != null) {
                var7_7 = var7_7.getName();
            } else {
                var14_14 = 0;
                var7_7 = null;
            }
            var8_8 = this.cb().q;
            if (var8_8 != null) {
                var8_8 = var8_8.getCode();
            } else {
                var12_12 = false;
                var8_8 = null;
            }
            var9_9 = this.cb().q;
            var16_16 = var9_9 != null && (var9_9 = var9_9.getFnlColorVariantData()) != null ? (var9_9 = var9_9.getBrandName()) : null;
            var9_9 = this.cb().q;
            var17_17 = var9_9 != null && (var9_9 = var9_9.getFnlProductData()) != null ? (var9_9 = var9_9.getPlanningCategory()) : null;
            var18_18 = "pdp screen";
            var9_9 = var1_1;
            GAEcommerceEvents.pushProductDetails((Product)var5_5, (String)var7_7, (String)var8_8, (String)var1_1, (String)var16_16, (String)var17_17, var18_18, (String)var15_15);
            var5_5 = new HashMap();
            var7_7 = this.cb().q;
            Intrinsics.checkNotNull(var7_7);
            var7_7 = var7_7.getName();
            var5_5.put("Name", var7_7);
            var7_7 = this.cb().q;
            Intrinsics.checkNotNull(var7_7);
            var7_7 = var7_7.getUrl();
            var8_8 = "Product_url";
            var5_5.put(var8_8, var7_7);
            var7_7 = "Final_price";
            var1_1 = Float.valueOf((String)var1_1);
            var5_5.put(var7_7, var1_1);
            if (var13_13 == null) {
                var13_13 = "0f";
            }
            var1_1 = Float.valueOf((String)var13_13);
            var7_7 = "MRP";
            var5_5.put(var7_7, var1_1);
            var1_1 = this.cb().q;
            if (var1_1 != null && (var1_1 = var1_1.getFnlColorVariantData()) != null) {
                var1_1 = var1_1.getColor();
            } else {
                var3_3 = 0;
                var1_1 = null;
            }
            var3_3 = TextUtils.isEmpty((CharSequence)var1_1);
            if (var3_3 == 0) {
                var1_1 = this.cb().q;
                if (var1_1 != null) {
                    var1_1 = var1_1.getVerticalColor();
                } else {
                    var3_3 = 0;
                    var1_1 = null;
                }
                var7_7 = "color";
                var5_5.put(var7_7, var1_1);
            }
            if ((var1_1 = this.cb().q) != null) {
                var1_1 = var1_1.getProductGalleryImageUrls();
            } else {
                var3_3 = 0;
                var1_1 = null;
            }
            if (var1_1 != null && (var1_1 = this.cb().q) != null && (var1_1 = var1_1.getProductGalleryImageUrls()) != null && (var3_3 = (var1_1 = (Collection)var1_1).isEmpty() ^ var11_11) == var11_11) {
                var1_1 = this.cb().q;
                if (var1_1 != null && (var1_1 = var1_1.getProductGalleryImageUrls()) != null && (var1_1 = (ProductImage)var1_1.get(0)) != null) {
                    var1_1 = var1_1.getUrl();
                } else {
                    var3_3 = 0;
                    var1_1 = null;
                }
                var7_7 = "image_url";
                var5_5.put(var7_7, var1_1);
            }
            if ((var1_1 = this.cb().q) != null && (var1_1 = var1_1.getFnlColorVariantData()) != null) {
                var1_1 = var1_1.getBrandName();
            } else {
                var3_3 = 0;
                var1_1 = null;
            }
            if (var1_1 != null && (var3_3 = var1_1.length()) != 0) {
                var1_1 = this.cb().q;
                if (var1_1 != null && (var1_1 = var1_1.getFnlColorVariantData()) != null) {
                    var1_1 = var1_1.getBrandName();
                } else {
                    var3_3 = 0;
                    var1_1 = null;
                }
                var7_7 = "Brand";
                var5_5.put(var7_7, var1_1);
            }
            if ((var1_1 = this.cb().q) != null) {
                var1_1 = var1_1.getFnlProductData();
            } else {
                var3_3 = 0;
                var1_1 = null;
            }
            if (var1_1 != null) {
                var1_1 = this.cb().q;
                if (var1_1 != null && (var1_1 = var1_1.getFnlProductData()) != null) {
                    var1_1 = var1_1.getPlanningCategory();
                } else {
                    var3_3 = 0;
                    var1_1 = null;
                }
                if (var1_1 != null) {
                    var1_1 = this.cb().q;
                    if (var1_1 != null && (var1_1 = var1_1.getFnlProductData()) != null) {
                        var1_1 = var1_1.getPlanningCategory();
                    } else {
                        var3_3 = 0;
                        var1_1 = null;
                    }
                    var7_7 = "Category";
                    var5_5.put(var7_7, var1_1);
                }
            }
            if ((var1_1 = this.cb().q) != null && (var1_1 = var1_1.getRilfnlBreadCrumbList()) != null && (var1_1 = var1_1.getRilfnlBreadCrumb()) != null && (var14_14 = var1_1.size()) > var11_11) {
                var1_1 = ((RilfnlBreadCrumb)var1_1.get(var11_11)).getName();
                var7_7 = "Vertical";
                var5_5.put(var7_7, var1_1);
            }
            var1_1 = this.cb().q;
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getFnlColorVariantData();
            if (var1_1 == null) ** GOTO lbl-1000
            var1_1 = this.cb().q;
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getFnlColorVariantData();
            if (var1_1 != null) {
                var1_1 = var1_1.getBrickName();
            } else lbl-1000:
            // 2 sources

            {
                var3_3 = 0;
                var1_1 = null;
            }
            var14_14 = (int)TextUtils.isEmpty((CharSequence)var1_1);
            if (var14_14 != 0) {
                var1_1 = this.cb().q;
                Intrinsics.checkNotNull(var1_1);
                var1_1 = var1_1.getBrickName();
            }
            if ((var14_14 = (int)TextUtils.isEmpty((CharSequence)var1_1)) == 0) {
                var7_7 = "Brick";
                var5_5.put(var7_7, var1_1);
            }
            if ((var1_1 = this.cb().q) != null) {
                var1_1 = this.cb().q;
                if (var1_1 != null) {
                    var1_1 = var1_1.getCatalog();
                } else {
                    var3_3 = 0;
                    var1_1 = null;
                }
                var3_3 = (int)TextUtils.isEmpty((CharSequence)var1_1);
                if (var3_3 == 0) {
                    var1_1 = this.cb().q;
                    if (var1_1 != null) {
                        var1_1 = var1_1.getCatalog();
                    } else {
                        var3_3 = 0;
                        var1_1 = null;
                    }
                    var7_7 = "catalogId";
                    var5_5.put(var7_7, var1_1);
                }
            }
            if ((var14_14 = (var1_1 = od3_2.a()).length()) > 0) {
                var7_7 = "Store Type";
                var5_5.put(var7_7, var1_1);
            }
            if ((var1_1 = this.cb().q) != null && (var1_1 = var1_1.getCode()) != null && (var14_14 = var1_1.length()) > 0) {
                var7_7 = "SKU";
                var5_5.put(var7_7, var1_1);
            }
            var1_1 = var6_6.getInstance().getCt();
            var7_7 = new AnalyticsData$Builder();
            var5_5 = var7_7.eventMap((HashMap)var5_5).build();
            var1_1.pdpViewed((AnalyticsData)var5_5);
            var1_1 = this.cb();
            var5_5 = this.cb().q;
            if (var5_5 != null) {
                var2_2 = var5_5.getBrickCategory();
            }
            var1_1.getClass();
            if (var2_2 != null && (var3_3 = var2_2.length()) != 0) {
                var1_1 = "Men";
                var3_3 = (int)var2_2.equalsIgnoreCase((String)var1_1);
                var5_5 = "Girls";
                var7_7 = "Boys";
                if (var3_3 != 0 || (var3_3 = (int)var2_2.equalsIgnoreCase((String)(var1_1 = "Women"))) != 0 || (var3_3 = (int)var2_2.equalsIgnoreCase((String)var7_7)) != 0 || (var3_3 = (int)var2_2.equalsIgnoreCase((String)var5_5)) != 0) {
                    var3_3 = (int)var2_2.equalsIgnoreCase((String)var7_7);
                    if (var3_3 != 0 || (var3_3 = (int)var2_2.equalsIgnoreCase((String)var5_5)) != 0) {
                        var2_2 = "Kids";
                    }
                    var19_19 = p3.a("CategoryName", (String)var2_2);
                    var1_1 = var6_6.getInstance().getCt();
                    var20_20 = 65279;
                    var21_21 = 0L;
                    var2_2 = new AnalyticsData(null, null, null, var21_21, null, null, null, null, var19_19, null, null, null, null, null, null, null, var20_20, null);
                    var1_1.lineOfBuisness((AnalyticsData)var2_2);
                }
            }
        }
    }

    public final boolean E0() {
        return this.cb().u;
    }

    public final String E1() {
        Object object = this.T0;
        object = object != null ? ((CartDeliveryAddress)object).getPostalCode() : null;
        return String.valueOf(object);
    }

    public final ArrayList E2() {
        return this.cb().r;
    }

    public final LinkedHashMap E7() {
        return this.r;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void F(Product product, int n3, String string2) {
        String string3;
        Object object;
        boolean bl2;
        Object object2;
        boolean bl3;
        NewProductDetailsFragment newProductDetailsFragment = this;
        Object object3 = product;
        Object object4 = string2;
        Intrinsics.checkNotNullParameter(string2, "listType");
        this.p = false;
        Object object5 = "SHOPPING ASSISTANT MODEL";
        int n4 = Intrinsics.areEqual(string2, object5);
        if (n4 != 0) {
            this.xb();
            return;
        }
        if (product == null) {
            return;
        }
        object5 = this.x1;
        if (object5 != null) {
            ((BottomSheetDialogFragment)object5).dismissAllowingStateLoss();
        }
        if (bl3 = TextUtils.isEmpty((CharSequence)(object5 = product.getCode()))) {
            return;
        }
        Object object6 = new ri2$a();
        ((ri2$a)object6).a = object3;
        ((ri2$a)object6).b((String)object5);
        String string4 = "AJIOGRAM_PRODUCT_WIDGET";
        boolean bl4 = Intrinsics.areEqual(object4, string4);
        String string5 = null;
        String string6 = "";
        if (bl4) {
            object2 = this.getActivity();
            bl2 = object2 instanceof AjioHomeActivity;
            if (bl2) {
                object2 = (AjioHomeActivity)object2;
            } else {
                bl4 = false;
                object2 = null;
            }
            if (object2 != null) {
                ((AjioHomeActivity)object2).p();
            }
            od3_2.a = string6;
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            object2 = new jo_2((Context)object);
            object = ld3_2.STORE_AJIOGRAM;
            string3 = ((ld3_2)((Object)object)).getStoreId();
            ((jo_2)object2).E(string3);
            ((ri2$a)object6).d = object2 = ((ld3_2)((Object)object)).getStoreId();
        } else {
            ((ri2$a)object6).d = object2 = this.o5();
        }
        object6 = ((ri2$a)object6).a();
        object2 = newProductDetailsFragment.g;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productDetailListener");
            bl4 = false;
            object2 = null;
        }
        object2.n0((ri2_0)object6);
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        object6 = analyticsManager$Companion.getInstance().getGtmEvents();
        object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object4);
        object = "/";
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append((String)object5);
        ((StringBuilder)object2).append((String)object);
        n4 = n3;
        ((StringBuilder)object2).append(n3);
        object2 = ((StringBuilder)object2).toString();
        object = "PDP Click";
        String string7 = "pdp screen";
        ((GTMEvents)object6).pushButtonTapEvent((String)object, object2, string7);
        boolean bl5 = Intrinsics.areEqual(object4, string4);
        if (bl5) {
            object4 = this.Y6();
            object6 = h40_0.a;
            object6 = h40_0.f();
            if (object6 != null) {
                string5 = ((AjiogramInterventions)object6).getTag_text();
            }
        } else {
            object4 = "pdp screen- similar products widget";
        }
        string4 = object4;
        String string8 = string5;
        object4 = object2 = newProductDetailsFragment.G;
        object6 = ((NewEEcommerceEventsRevamp)object2).getEE_SELECT_ITEM();
        string3 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        String string9 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        Bundle bundle = newProductDetailsFragment.bb(true);
        bl4 = false;
        object2 = null;
        string5 = "pdp screen";
        bl2 = false;
        object = null;
        String string10 = "landing screen";
        String string11 = string7;
        string7 = null;
        long l2 = 0L;
        int n7 = 1571408;
        object3 = product;
        n4 = n3;
        NewEEcommerceEventsRevamp.pushEEProductSelect$default((NewEEcommerceEventsRevamp)object4, product, n3, (String)object6, string4, null, string5, false, string3, string10, null, string9, null, null, false, null, null, l2, null, null, bundle, null, string8, n7, null);
        object4 = analyticsManager$Companion.getInstance().getGtmEvents();
        object3 = this.cb().q;
        if (object3 != null) {
            object3 = this.cb().q;
            Intrinsics.checkNotNull(object3);
            string6 = ((Product)object3).getName();
        }
        object3 = string6;
        object5 = "Recommendation PDP";
        object6 = string11;
        ((GTMEvents)object4).pushButtonTapEvent((String)object5, string6, string11);
    }

    public final ArrayList F1() {
        return this.R0;
    }

    public final void F3(Integer n3, String string2) {
        Intrinsics.checkNotNullParameter(string2, "action");
        Intrinsics.checkNotNullParameter("Add to Bag", "name");
    }

    public final ArrayList F7() {
        Object object = this.cb().q;
        object = object != null ? ((Product)object).getPotentialPromotions() : null;
        return (ArrayList)object;
    }

    public final void F8(String object, String string2) {
        Intrinsics.checkNotNullParameter(object, "brandCode");
        Intrinsics.checkNotNullParameter(string2, "brandName");
        this.p = false;
        Bundle bundle = px1_2.b("brand_name", string2, "brand_id", (String)object);
        object = this.getActivity();
        Qj2 qj2 = new zj0_0((Activity)object);
        String string3 = this.o5();
        qj2.d(0, null, bundle, "", string3, "s", null);
    }

    public final boolean Fa() {
        boolean bl2;
        PDPPriceError pDPPriceError = this.cb().G0;
        if (pDPPriceError != null) {
            bl2 = pDPPriceError.getShowError();
        } else {
            bl2 = false;
            pDPPriceError = null;
        }
        return bl2;
    }

    public final void Fb(List object) {
        int n3;
        boolean bl2;
        int n4 = 0;
        Object object2 = null;
        if (object != null) {
            object = (Iterable)object;
            bl2 = false;
            int n7 = 5;
            object = CollectionsKt.p0((Iterable)object, n7, n7, false);
        } else {
            n3 = 0;
            object = null;
        }
        this.S0 = object;
        object = this.L;
        if (object != null) {
            object = ((RecyclerView)object).getAdapter();
        } else {
            n3 = 0;
            object = null;
        }
        bl2 = object instanceof yh2_1;
        if (bl2) {
            object = (yh2_1)object;
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            n4 = 37;
            object2 = ((yh2_1)object).g(n4);
        }
        if (object2 != null) {
            n3 = ((Number)object2).intValue();
            object2 = this.L;
            if (object2 != null && (object2 = ((RecyclerView)object2).getAdapter()) != null) {
                ((RecyclerView$f)object2).notifyItemChanged(n3);
            }
        }
    }

    public final void G(boolean bl2) {
        this.H0 = bl2;
    }

    public final ProductOptionVariant G1() {
        return this.cb().E;
    }

    public final void G2(Product product) {
    }

    public final void G3() {
        Object object;
        this.p = false;
        Object object2 = this.h;
        Object object3 = "activityFragmentListener";
        String string2 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object2 = null;
        }
        if ((object = this.h) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        object3 = object.y();
        com.ril.ajio.pdprefresh.fragments.e.Companion.getClass();
        object = new e();
        ((e)object).h = this;
        boolean bl2 = true;
        String string3 = "CustomerReviewsFragment";
        j3$a.a((j3_0)object2, (Fragment)object3, (Fragment)object, bl2, string3);
        object2 = LD2.a;
        object2 = this.cb().q;
        object2 = object2 != null ? ((Product)object2).getCode() : null;
        object3 = this.cb().q;
        object3 = object3 != null ? ((Product)object3).getName() : null;
        object = this.cb().q;
        if (object != null) {
            string2 = ((Product)object).getBrickCode();
        }
        LD2.c("view all", "clicked", (String)object2, (String)object3, string2);
    }

    public final void G5(boolean bl2) {
        this.Z0 = bl2;
        String.valueOf(bl2);
    }

    public final String G8() {
        boolean bl2;
        boolean bl3;
        e12_0 e12_02 = this.cb();
        O63 o63 = this.K0;
        boolean bl4 = false;
        if (o63 != null && (bl3 = o63.h()) == (bl2 = true)) {
            bl4 = true;
        }
        return e12_02.p(bl4);
    }

    public final void Gb(String object) {
        Serializable serializable = this.cb().q;
        String string2 = "";
        if (serializable != null && (serializable = ((Product)serializable).getFnlColorVariantData()) != null && (serializable = ((ProductFnlColorVariantData)serializable).getSizeJSONArray()) != null) {
            int n3 = serializable.length();
            for (int i3 = 0; i3 < n3; ++i3) {
                boolean bl2;
                Object object2 = serializable.get(i3);
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type org.json.JSONObject");
                object2 = (JSONObject)object2;
                String string3 = object2.optString("SIZE_NAME");
                Intrinsics.checkNotNull(string3);
                int n4 = string3.length();
                if (n4 <= 0 || !(bl2 = string3.equals(object))) continue;
                object = "DESCRIPTION";
                string2 = object2.optString((String)object);
                break;
            }
        }
        if ((object = this.k0) != null) {
            ((ProductUserSizeRecomResponse)object).setBrandVoiceMessage(string2);
        }
    }

    public final boolean H0() {
        boolean bl2 = this.X0;
        bl2 = bl2 || (bl2 = this.Y0) || (bl2 = this.a1) || (bl2 = this.b1) || (bl2 = this.Z0);
        return bl2;
    }

    public final ArrayList H3(String string2) {
        Object object = this.cb();
        object.getClass();
        PDPFunctionalRepo pDPFunctionalRepo = PDPFunctionalRepo.INSTANCE;
        object = ((e12_0)object).F0;
        return pDPFunctionalRepo.getPriceBreakUpData(string2, (HashMap)object);
    }

    public final boolean H7() {
        return this.e1;
    }

    public final Price H8() {
        return this.cb().I;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void Hb(Boolean var1_1, boolean var2_2) {
        block51: {
            block53: {
                block52: {
                    var3_3 = this.getActivity();
                    if (var3_3 == null || (var4_4 = (var3_3 = this.requireActivity()).isFinishing()) != 0 || (var3_3 = this.A0) == null) break block51;
                    this.Ta();
                    this.C0 = 100;
                    var3_3 = Boolean.TRUE;
                    var5_5 = Intrinsics.areEqual(var1_1, var3_3);
                    var4_4 = 26;
                    var6_6 = null;
                    if (var5_5 == 0) break block52;
                    if (var2_2) {
                        var1_1 = this.D0;
                        Intrinsics.checkNotNull(var1_1);
                        var2_2 = R$string.refresh_view_bag;
                        var7_7 = this.getString((int)var2_2);
                        var1_1.setText((CharSequence)var7_7);
                        var1_1 = this.A0;
                        if (var1_1 != null) {
                            ai0_2.a((View)var1_1);
                        }
                        var1_1 = this.D0;
                        Intrinsics.checkNotNull(var1_1);
                        var2_2 = R$style.header_large;
                        Hm3.f((TextView)var1_1, (int)var2_2);
                        var1_1 = this.A0;
                        if (var1_1 != null) {
                            var2_2 = R$drawable.view_bag_pdp_bg;
                            var1_1.setBackgroundResource((int)var2_2);
                        }
                        if ((var1_1 = this.D0) != null) {
                            var7_7 = var1_1.getContext();
                            if (var7_7 != null) {
                                var8_8 = R$attr.bg_color_accent_3;
                                var2_2 = tm3_0.a(var8_8, (Context)var7_7);
                                var7_7 = (int)var2_2;
                            } else {
                                var2_2 = false;
                                var7_7 = null;
                            }
                            Intrinsics.checkNotNull(var7_7);
                            var2_2 = var7_7.intValue();
                            var1_1.setTextColor((int)var2_2);
                        }
                        if ((var1_1 = this.B0) != null) {
                            var7_7 = var1_1.getContext();
                            if (var7_7 != null) {
                                var8_8 = R$attr.footer_cart_added;
                                var2_2 = tm3_0.b(var8_8, (Context)var7_7);
                                var7_7 = (int)var2_2;
                            } else {
                                var2_2 = false;
                                var7_7 = null;
                            }
                            Intrinsics.checkNotNull(var7_7);
                            var2_2 = var7_7.intValue();
                            var1_1.setImageResource((int)var2_2);
                        }
                        if ((var1_1 = this.B0) != null) {
                            var2_2 = false;
                            var7_7 = null;
                            var1_1.setVisibility(0);
                        }
                        if ((var1_1 = this.L) != null) {
                            var1_1 = var1_1.getAdapter();
                        } else {
                            var5_5 = 0;
                            var1_1 = null;
                        }
                        var2_2 = var1_1 instanceof yh2_1;
                        if (var2_2) {
                            var1_1 = (yh2_1)var1_1;
                        } else {
                            var5_5 = 0;
                            var1_1 = null;
                        }
                        if (var1_1 != null) {
                            var1_1 = var1_1.g(var4_4);
                        } else {
                            var5_5 = 0;
                            var1_1 = null;
                        }
                        if (var1_1 != null) {
                            var5_5 = ((Number)var1_1).intValue();
                            var7_7 = this.L;
                            if (var7_7 != null && (var7_7 = var7_7.getAdapter()) != null) {
                                var7_7.notifyItemChanged(var5_5);
                            }
                        }
                    } else {
                        this.Ib();
                    }
                    break block53;
                }
                var1_1 = h40_0.a;
                var5_5 = h40_0.W0();
                if (var5_5 == 0) ** GOTO lbl-1000
                var1_1 = hv3_0.a;
                var7_7 = this.cb().q;
                var1_1.getClass();
                var5_5 = hv3_0.V((Product)var7_7);
                if (var5_5 != 0) {
                    var1_1 = this.D0;
                    Intrinsics.checkNotNull(var1_1);
                    var2_2 = R$style.header_large;
                    Hm3.f((TextView)var1_1, (int)var2_2);
                    var1_1 = this.o5();
                    var7_7 = ld3_2.STORE_AJIOGRAM.getStoreId();
                    var5_5 = (int)Intrinsics.areEqual(var1_1, var7_7);
                    if (var5_5 != 0) {
                        var1_1 = this.A0;
                        if (var1_1 != null) {
                            var2_2 = R$drawable.view_bag_pdp_ajiogram_coming_soon;
                            var1_1.setBackgroundResource((int)var2_2);
                        }
                        if ((var1_1 = this.D0) != null) {
                            var2_2 = -16777216;
                            var1_1.setTextColor((int)var2_2);
                        }
                        if ((var1_1 = this.B0) != null) {
                            var2_2 = R$drawable.ic_notify_me_dark;
                            var1_1.setImageResource((int)var2_2);
                        }
                    } else {
                        var5_5 = (int)og1_1.b();
                        var2_2 = -1;
                        if (var5_5 != 0) {
                            var1_1 = this.A0;
                            if (var1_1 != null) {
                                var8_9 = R$drawable.bg_black_button;
                                var1_1.setBackgroundResource(var8_9);
                            }
                            if ((var1_1 = this.D0) != null) {
                                var1_1.setTextColor((int)var2_2);
                            }
                            if ((var1_1 = this.B0) != null) {
                                var2_2 = R$drawable.ic_notify_me_luxe;
                                var1_1.setImageResource((int)var2_2);
                            }
                        } else {
                            var1_1 = this.A0;
                            if (var1_1 != null) {
                                var8_10 = R$drawable.bg_black_button;
                                var1_1.setBackgroundResource(var8_10);
                            }
                            if ((var1_1 = this.D0) != null) {
                                var1_1.setTextColor((int)var2_2);
                            }
                            if ((var1_1 = this.B0) != null) {
                                var2_2 = R$drawable.ic_notify_me;
                                var1_1.setImageResource((int)var2_2);
                            }
                        }
                    }
                    if ((var1_1 = this.D0) != null) {
                        var2_2 = R$string.notify_me;
                        var7_7 = this.getString((int)var2_2);
                        var1_1.setText((CharSequence)var7_7);
                    }
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = this.D0;
                    Intrinsics.checkNotNull(var1_1);
                    var2_2 = R$style.header_large;
                    Hm3.f((TextView)var1_1, (int)var2_2);
                    var1_1 = this.A0;
                    if (var1_1 != null) {
                        var2_2 = R$drawable.cart_oos_btn_bg;
                        var1_1.setBackgroundResource((int)var2_2);
                    }
                    if ((var1_1 = this.D0) != null) {
                        var7_7 = var1_1.getContext();
                        if (var7_7 != null) {
                            var8_11 = R$attr.cart_oos_text_color;
                            var2_2 = tm3_0.a(var8_11, (Context)var7_7);
                            var7_7 = (int)var2_2;
                        } else {
                            var2_2 = false;
                            var7_7 = null;
                        }
                        Intrinsics.checkNotNull(var7_7);
                        var2_2 = var7_7.intValue();
                        var1_1.setTextColor((int)var2_2);
                    }
                    if ((var1_1 = this.B0) != null) {
                        var7_7 = var1_1.getContext();
                        if (var7_7 != null) {
                            var8_11 = R$attr.footer_cart_oos;
                            var2_2 = tm3_0.b(var8_11, (Context)var7_7);
                            var7_7 = (int)var2_2;
                        } else {
                            var2_2 = false;
                            var7_7 = null;
                        }
                        Intrinsics.checkNotNull(var7_7);
                        var2_2 = var7_7.intValue();
                        var1_1.setImageResource((int)var2_2);
                    }
                    if ((var1_1 = this.A0) != null) {
                        var1_1.setOnClickListener(null);
                    }
                    if ((var1_1 = this.D0) != null) {
                        var2_2 = R$string.refresh_out_of_stock;
                        var7_7 = this.getString((int)var2_2);
                        var1_1.setText((CharSequence)var7_7);
                    }
                }
            }
            if ((var1_1 = this.L) != null) {
                var1_1 = var1_1.getAdapter();
            } else {
                var5_5 = 0;
                var1_1 = null;
            }
            var2_2 = var1_1 instanceof yh2_1;
            if (var2_2) {
                var1_1 = (yh2_1)var1_1;
            } else {
                var5_5 = 0;
                var1_1 = null;
            }
            if (var1_1 != null) {
                var6_6 = ((yh2_1)var1_1).g(var4_4);
            }
            if (var6_6 != null) {
                var5_5 = ((Number)var6_6).intValue();
                var7_7 = this.L;
                if (var7_7 != null && (var7_7 = var7_7.getAdapter()) != null) {
                    var7_7.notifyItemChanged(var5_5);
                }
            }
        }
    }

    public final void I0() {
        Object object = this.t0;
        Intrinsics.checkNotNull(object);
        boolean bl2 = object;
        String string2 = "footerView";
        String string3 = "footerViewParent";
        Boolean bl3 = null;
        if (!bl2 && !(bl2 = this.H0())) {
            object = this.s0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                object = null;
            }
            boolean bl4 = false;
            string3 = null;
            object.setVisibility(0);
            object = this.r0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                bl3 = object;
            }
            bl3.setVisibility(0);
            object = this.w0;
            if (object != null) {
                object.setVisibility(0);
            }
        } else {
            object = this.s0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                object = null;
            }
            int n3 = 8;
            object.setVisibility(n3);
            object = this.r0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                bl3 = object;
            }
            bl3.setVisibility(n3);
            object = this.w0;
            if (object != null) {
                object.setVisibility(n3);
            }
        }
    }

    public final void I4(Banner object, int n3, String string2) {
        block15: {
            block17: {
                Object object2;
                int n4;
                block16: {
                    String string3;
                    String string4;
                    String string5;
                    String string6;
                    hh3_2 hh3_22;
                    int n7;
                    Object object3;
                    block14: {
                        xv$a_0 xv$a_0;
                        Intrinsics.checkNotNullParameter(object, "banner");
                        n4 = 0;
                        object2 = null;
                        this.p = false;
                        object3 = ((Banner)object).getBannerType();
                        n7 = Intrinsics.areEqual(object3, "AD");
                        hh3_22 = this.A;
                        string6 = "Web view Screen";
                        string5 = "ajio";
                        string4 = null;
                        if (n7 == 0) break block14;
                        if (string2 != null && (n7 = string2.length()) != 0 && (n7 = (int)(((h40_0)(object3 = h40_0.a)).p1(xv$a_0 = xv$a_0.PDP) ? 1 : 0)) != 0) {
                            Object object4;
                            NewProductDetailsFragment.Yb((Banner)object, n3);
                            n3 = (int)(StringsKt.F(string2, string5, false) ? 1 : 0);
                            if (n3 != 0) {
                                object4 = AnalyticsManager.Companion;
                                km_1.a((AnalyticsManager$Companion)object4, string6);
                            }
                            if ((object4 = ((Banner)object).getBannerAdsMetaData()) != null && (object4 = ((BannerAdsMetaData)object4).getClickTracker()) != null) {
                                if ((object = ((Banner)object).getBannerAdsMetaData()) != null) {
                                    string4 = ((BannerAdsMetaData)object).getCcbValue();
                                }
                                Intrinsics.checkNotNullParameter(object4, "url");
                                long l2 = k7.p();
                                object = String.valueOf(l2);
                                object3 = "[trq]";
                                object = kotlin.text.b.n((String)object4, (String)object3, (String)object, false);
                                if (string4 == null) {
                                    string4 = "";
                                }
                                object = kotlin.text.b.n((String)object, "[ccb]", string4, false);
                                object4 = (BannerAdViewModel)hh3_22.getValue();
                                ((BannerAdViewModel)object4).callBannerClickImpression((String)object);
                            }
                            object = kj0_1.g();
                            object4 = this.getActivity();
                            ((kj0_1)object).w((Activity)object4, string2);
                        }
                        break block15;
                    }
                    object3 = ((Banner)object).getBannerType();
                    n7 = (int)(Intrinsics.areEqual(object3, string3 = "EXTERNAL_AD") ? 1 : 0);
                    if (n7 == 0) break block16;
                    if (string2 != null && (n7 = string2.length()) != 0) {
                        object3 = h40_0.a;
                        object3 = xv$a_0.PDP;
                        n7 = (int)(h40_0.r2((xv$a_0)((Object)object3)) ? 1 : 0);
                        if (n7 != 0) {
                            Object object5;
                            NewProductDetailsFragment.Yb((Banner)object, n3);
                            n3 = (int)(StringsKt.F(string2, string5, false) ? 1 : 0);
                            if (n3 != 0) {
                                object5 = AnalyticsManager.Companion;
                                km_1.a((AnalyticsManager$Companion)object5, string6);
                            }
                            if ((object = ((Banner)object).getBannerAdsMetaData()) != null) {
                                string4 = ((BannerAdsMetaData)object).getClickTracker();
                            }
                            if (string4 != null) {
                                object = (BannerAdViewModel)hh3_22.getValue();
                                ((BannerAdViewModel)object).callBannerClickImpression(string4);
                            }
                            object = kj0_1.g();
                            object5 = this.getActivity();
                            ((kj0_1)object).w((Activity)object5, string2);
                        }
                    }
                    break block15;
                }
                if (string2 == null || (n4 = string2.length()) == 0) break block15;
                n4 = (int)(((Banner)object).isCmsAdBanner() ? 1 : 0);
                if (n4 == 0) break block17;
                object2 = h40_0.a;
                object2 = xv$a_0.PDP;
                n4 = (int)(h40_0.R0((xv$a_0)((Object)object2)) ? 1 : 0);
                if (n4 == 0) break block15;
            }
            NewProductDetailsFragment.Yb((Banner)object, n3);
            object = kj0_1.g();
            FragmentActivity fragmentActivity = this.getActivity();
            ((kj0_1)object).w(fragmentActivity, string2);
        }
    }

    public final int I6() {
        return this.cb().I0;
    }

    public final boolean I8() {
        return this.m1;
    }

    public final boolean Ia() {
        return this.cb().y;
    }

    public final void Ib() {
        Object object;
        TextView textView = this.D0;
        Intrinsics.checkNotNull(textView);
        int n3 = R$style.header_large;
        Hm3.f(textView, n3);
        textView = this.A0;
        if (textView != null) {
            n3 = R$drawable.rounded_rect_black_bg_fleek;
            textView.setBackgroundResource(n3);
        }
        textView = this.D0;
        n3 = 0;
        Object object2 = null;
        if (textView != null) {
            int n4;
            object = textView.getContext();
            if (object != null) {
                int n7 = R$attr.plp_product_bg;
                n4 = tm3_0.a(n7, object);
                object = n4;
            } else {
                n4 = 0;
                object = null;
            }
            Intrinsics.checkNotNull(object);
            n4 = object.intValue();
            textView.setTextColor(n4);
        }
        if ((textView = this.B0) != null) {
            object = textView.getContext();
            if (object != null) {
                n3 = tm3_0.b(R$attr.footer_cart, object);
                object2 = n3;
            }
            Intrinsics.checkNotNull(object2);
            n3 = (Integer)object2;
            textView.setImageResource(n3);
        }
        if ((textView = this.A0) != null) {
            textView.setOnClickListener((View.OnClickListener)this);
        }
        if ((textView = this.D0) != null) {
            object2 = this.G0;
            textView.setText((CharSequence)object2);
        }
        if ((textView = this.B0) != null) {
            n3 = 0;
            object2 = null;
            textView.setVisibility(0);
        }
    }

    public final void Jb() {
        Object object = this.L;
        if (object != null && (object = ((RecyclerView)object).getAdapter()) != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
    }

    public final ArrayList K() {
        return this.g1;
    }

    public final boolean K2() {
        return this.I1;
    }

    public final ProductUserSizeRecomResponse K4() {
        return this.k0;
    }

    public final boolean K5() {
        boolean bl2;
        boolean bl3;
        Product product = this.cb().q;
        boolean bl4 = false;
        if (product != null && (bl3 = product.isComingSoonProduct()) == (bl2 = true)) {
            bl4 = true;
        }
        return bl4;
    }

    public final void K6() {
        Object object = px0_2.Companion;
        Object object2 = this.cb().q;
        object2 = object2 != null ? ((Product)object2).getGiftPromotion() : null;
        object.getClass();
        object = new px0_2();
        Bundle bundle = new Bundle();
        bundle.putParcelable("freeBies", (Parcelable)object2);
        ((Fragment)object).setArguments(bundle);
        object2 = this.requireActivity().getSupportFragmentManager();
        ((DialogFragment)object).show((FragmentManager)object2, "FreebiesBottomSheet");
    }

    public final String K9() {
        Object object = this.cb();
        boolean bl2 = ((e12_0)object).A;
        boolean bl3 = true;
        if (bl2 == bl3) {
            object = this.cb().y0;
        } else {
            bl2 = false;
            object = null;
        }
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void Kb(Boolean var1_1, boolean var2_2) {
        block19: {
            block21: {
                block20: {
                    var3_3 = this.getActivity();
                    if (var3_3 == null || (var4_4 = (var3_3 = this.requireActivity()).isFinishing()) != 0 || (var3_3 = this.A0) == null) break block19;
                    this.Ta();
                    this.C0 = var4_4 = 100;
                    var3_3 = Boolean.TRUE;
                    var5_5 = Intrinsics.areEqual(var1_1, var3_3);
                    if (!var5_5) break block20;
                    if (var2_2) {
                        var1_1 = this.D0;
                        if (var1_1 != null) {
                            var2_2 = R$string.refresh_view_bag;
                            var6_6 = this.getString((int)var2_2);
                            var1_1.setText((CharSequence)var6_6);
                        }
                        if ((var1_1 = this.A0) != null) {
                            ai0_2.a((View)var1_1);
                        }
                        var1_1 = this.D0;
                        Intrinsics.checkNotNull(var1_1);
                        var2_2 = R$style.luxe_header_dim_14;
                        Hm3.f((TextView)var1_1, (int)var2_2);
                        var1_1 = this.A0;
                        if (var1_1 != null) {
                            var2_2 = R$drawable.luxe_view_bag_pdp_bg;
                            var1_1.setBackgroundResource((int)var2_2);
                        }
                        if ((var1_1 = this.B0) != null) {
                            var2_2 = R$drawable.ic_luxe_view_bag;
                            var1_1.setImageResource((int)var2_2);
                        }
                        if ((var1_1 = this.B0) != null) {
                            var2_2 = false;
                            var6_6 = null;
                            var1_1.setVisibility(0);
                        }
                        if ((var1_1 = this.L) != null && (var1_1 = var1_1.getAdapter()) != null) {
                            var1_1.notifyDataSetChanged();
                        }
                    } else {
                        this.Mb();
                    }
                    break block21;
                }
                var1_1 = h40_0.a;
                var5_5 = h40_0.W0();
                if (!var5_5) ** GOTO lbl-1000
                var1_1 = hv3_0.a;
                var6_7 = this.cb().q;
                var1_1.getClass();
                var5_5 = hv3_0.V((Product)var6_7);
                if (var5_5) {
                    var1_1 = this.D0;
                    Intrinsics.checkNotNull(var1_1);
                    var2_2 = R$style.luxe_header_dim_14;
                    Hm3.f((TextView)var1_1, (int)var2_2);
                    var1_1 = this.A0;
                    if (var1_1 != null) {
                        var2_2 = R$drawable.luxe_add_to_cart_bg;
                        var1_1.setBackgroundResource((int)var2_2);
                    }
                    if ((var1_1 = this.B0) != null) {
                        var2_2 = R$drawable.ic_notify_me_luxe;
                        var1_1.setImageResource((int)var2_2);
                    }
                    if ((var1_1 = this.D0) != null) {
                        var2_2 = -1;
                        var1_1.setTextColor((int)var2_2);
                    }
                    if ((var1_1 = this.D0) != null) {
                        var2_2 = R$string.notify_me;
                        var6_7 = this.getString((int)var2_2);
                        var1_1.setText((CharSequence)var6_7);
                    }
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = this.D0;
                    Intrinsics.checkNotNull(var1_1);
                    var2_2 = R$style.luxe_header_dim_14_989898;
                    Hm3.f((TextView)var1_1, (int)var2_2);
                    var1_1 = this.A0;
                    if (var1_1 != null) {
                        var2_2 = R$drawable.luxe_disable_btn_bg;
                        var1_1.setBackgroundResource((int)var2_2);
                    }
                    if ((var1_1 = this.B0) != null) {
                        var2_2 = R$drawable.ic_luxe_bag_disable;
                        var1_1.setImageResource((int)var2_2);
                    }
                    if ((var1_1 = this.A0) != null) {
                        var2_2 = false;
                        var6_7 = null;
                        var1_1.setOnClickListener(null);
                    }
                    if ((var1_1 = this.D0) != null) {
                        var6_7 = this.G0;
                        var1_1.setText((CharSequence)var6_7);
                    }
                }
            }
            if ((var1_1 = this.L) != null && (var1_1 = var1_1.getAdapter()) != null) {
                var1_1.notifyDataSetChanged();
            }
        }
    }

    public final void Lb() {
        int n3;
        Toolbar toolbar = this.y0;
        int n4 = 0;
        Object object = null;
        if (toolbar != null) {
            n3 = R$id.menu_cart_count_tv;
            toolbar = (TextView)toolbar.findViewById(n3);
        } else {
            toolbar = null;
        }
        if (toolbar != null) {
            Object object2 = this.Wa();
            n3 = ((jo_2)object2).d();
            if (n3 == 0) {
                Object object3 = z40_0.Companion;
                object3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a;
                String string2 = "enable_highlight_empty_cart";
                boolean bl2 = ((ao0_0)object3).a(string2);
                if (bl2) {
                    toolbar.setVisibility(0);
                    object2 = String.valueOf(n3);
                    toolbar.setText((CharSequence)object2);
                    object2 = this.getContext();
                    if (object2 != null) {
                        n4 = R$drawable.circle_shape_cart_count_product;
                        object = xn.a((Context)object2, n4);
                    }
                    toolbar.setBackground((Drawable)object);
                } else {
                    n4 = 8;
                    toolbar.setVisibility(n4);
                }
            } else {
                Context context = this.getContext();
                if (context != null) {
                    n4 = R$drawable.circle_shape_cart_count_product;
                    object = xn.a(context, n4);
                }
                toolbar.setBackground((Drawable)object);
                toolbar.setVisibility(0);
                n4 = 9;
                if (n3 <= n4) {
                    object = String.valueOf(n3);
                    toolbar.setText((CharSequence)object);
                } else {
                    object = hv3_0.f("9<sup>+</sup>");
                    toolbar.setText((CharSequence)object);
                }
            }
        }
    }

    public final boolean M1() {
        String string2;
        boolean bl2;
        Object object = this.cb().q;
        if (object == null || (object = ((Product)object).getCatalog()) == null) {
            object = this.cb().q;
            if (object != null) {
                object = ((Product)object).getCatalogName();
            } else {
                bl2 = false;
                object = null;
            }
        }
        if ((bl2 = Intrinsics.areEqual(object, string2 = "ajioGram")) && (bl2 = Intrinsics.areEqual(object = this.o5(), string2 = ld3_2.STORE_AJIO.getStoreId()))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final ArrayList M4(String object) {
        ArrayList<Object> arrayList;
        block19: {
            FeatureData featureData;
            String string2;
            boolean bl2;
            Object object2 = this.cb();
            object2.getClass();
            arrayList = new ArrayList<Object>();
            Object object3 = ((e12_0)object2).B0;
            if (object3 != null && (object3 = (ArrayList)((HashMap)object3).get(object)) != null) {
                object3 = object3.iterator();
                while (bl2 = object3.hasNext()) {
                    string2 = (String)object3.next();
                    featureData = new FeatureData();
                    featureData.setValue(string2);
                    featureData.setName(string2);
                    arrayList.add(featureData);
                }
            }
            if ((object3 = ((e12_0)object2).C0) != null && (object = (ProductSkuInfo)((HashMap)object3).get(object)) != null) {
                ((ProductSkuInfo)object).getImsBatchId();
            }
            if ((object = ((e12_0)object2).q) == null || (object = ((Product)object).getFeatureData()) == null) break block19;
            object3 = object;
            object3 = (Collection)object;
            int n3 = object3.size();
            bl2 = false;
            string2 = null;
            int n4 = 0;
            featureData = null;
            while (true) {
                block20: {
                    FeatureData featureData2;
                    block21: {
                        boolean bl3;
                        Object object4;
                        boolean bl4;
                        boolean bl5 = false;
                        String string3 = null;
                        if (n4 >= n3) break;
                        featureData2 = (FeatureData)object.get(n4);
                        String string4 = featureData2.getCode();
                        if (string4 == null) break block20;
                        string4 = featureData2.getCode();
                        if (string4 != null) {
                            bl4 = StringsKt.F(string4, ".segmentusp", false);
                            object4 = bl4;
                        } else {
                            bl4 = false;
                            object4 = null;
                        }
                        Intrinsics.checkNotNull(object4);
                        bl4 = (Boolean)object4;
                        if (bl4 || !(bl4 = StringsKt.F(string4, (CharSequence)(object4 = "verticalsizewornbymodel"), false)) && !(bl4 = StringsKt.F(string4, (CharSequence)(object4 = "brickmodelheight"), false)) && !(bl4 = StringsKt.F(string4, (CharSequence)(object4 = "brickmodelchestsize"), false)) && !(bl4 = StringsKt.F(string4, (CharSequence)(object4 = "brickmodelwaistsize"), false)) && !(bl4 = StringsKt.F(string4, (CharSequence)(object4 = "verticalsizeformat"), false)) && !(bl3 = StringsKt.F(string4, (CharSequence)(object4 = "verticalmodelheight"), false))) break block21;
                        cp_1.Companion.getClass();
                        string4 = cp$a.c();
                        object4 = ((e12_0)object2).q;
                        if (object4 != null) {
                            string3 = ((Product)object4).getBrickCode();
                        }
                        if (!(bl5 = ai0_2.d(string3, (JSONArray)string4))) break block20;
                    }
                    arrayList.add(featureData2);
                }
                ++n4;
            }
            object = ((e12_0)object2).q;
            Intrinsics.checkNotNull(object);
            object = ((Product)object).getCode();
            boolean bl6 = TextUtils.isEmpty((CharSequence)object);
            if (!bl6) {
                cp_1.Companion.getClass();
                object = cp$a.c();
                object3 = ((e12_0)object2).q;
                if (object3 != null) {
                    object3 = ((Product)object3).getBrickCode();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                bl6 = ai0_2.d((String)object3, (JSONArray)object);
                if (!bl6) {
                    object = new FeatureData();
                    n3 = R$string.product_code;
                    object3 = hv3_0.K(n3);
                    ((FeatureData)object).setName((String)object3);
                    object3 = ((e12_0)object2).q;
                    if (object3 == null || (object3 = ((Product)object3).getCode()) == null) {
                        object3 = "";
                    }
                    ((FeatureData)object).setValue((String)object3);
                    arrayList.add(object);
                }
            }
            if (!(bl6 = TextUtils.isEmpty((CharSequence)(object = ((e12_0)object2).L)))) {
                cp_1.Companion.getClass();
                object = cp$a.c();
                object3 = ((e12_0)object2).q;
                if (object3 != null) {
                    object3 = ((Product)object3).getBrickCode();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                bl6 = ai0_2.d((String)object3, (JSONArray)object);
                if (!bl6) {
                    object = new FeatureData();
                    ((FeatureData)object).setName(null);
                    object2 = ((e12_0)object2).L;
                    ((FeatureData)object).setValue((String)object2);
                    arrayList.add(object);
                }
            }
        }
        return arrayList;
    }

    public final HashSet M8() {
        return this.o;
    }

    public final void M9(String object) {
        String string2 = "addressId";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = h40_0.Q1();
        if (bl2 && (object = this.G1) != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
    }

    public final void Mb() {
        String string2;
        TextView textView = this.D0;
        Intrinsics.checkNotNull(textView);
        int n3 = R$style.luxe_header_dim_14_e0e0e0;
        Hm3.f(textView, n3);
        textView = this.A0;
        if (textView != null) {
            n3 = R$drawable.luxe_add_to_cart_bg;
            textView.setBackgroundResource(n3);
        }
        if ((textView = this.B0) != null) {
            n3 = R$drawable.ic_luxe_add_to_bag_pdp;
            textView.setImageResource(n3);
        }
        if ((textView = this.A0) != null) {
            textView.setOnClickListener((View.OnClickListener)this);
        }
        if ((textView = this.D0) != null) {
            string2 = this.G0;
            textView.setText((CharSequence)string2);
        }
        if ((textView = this.B0) != null) {
            n3 = 0;
            string2 = null;
            textView.setVisibility(0);
        }
    }

    public final boolean N0() {
        return this.u1;
    }

    public final boolean N2() {
        Object object = this.cb();
        object.getClass();
        PDPFunctionalRepo pDPFunctionalRepo = PDPFunctionalRepo.INSTANCE;
        object = ((e12_0)object).F0;
        return pDPFunctionalRepo.isPriceBreakUpAvailable((HashMap)object);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void N5(int n3, View view) {
        NewProductDetailsFragment newProductDetailsFragment = this;
        int n4 = n3;
        Object object = view;
        int n7 = 2;
        int n8 = 1;
        if (n3 != n8) {
            object = "";
            String string2 = "product_id";
            if (n3 != n7) {
                void var10_17;
                n7 = 3;
                if (n3 != n7) {
                    return;
                }
                Bundle bundle = new Bundle();
                String string3 = this.l6();
                n4 = string3.length();
                if (n4 != 0) {
                    object = this.l6();
                }
                bundle.putString(string2, (String)object);
                AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
                Object object2 = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
                String string4 = bv_0.a(analyticsManager$Companion);
                String string5 = cv_0.a(analyticsManager$Companion);
                String string6 = "widget_interaction";
                String string7 = "pdp screen";
                int n10 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, "widget interaction", "bbs widget", "go to wishlist", string6, "pdp screen", string7, string4, bundle, string5, false, null, n10, null);
                object = analyticsManager$Companion.getInstance().getGtmEvents();
                String string8 = "pdp screen";
                boolean bl2 = false;
                Object var19_44 = null;
                String string9 = "pdp widget";
                string2 = "pdp_widget_interaction";
                object2 = "price reveal widget";
                String string10 = "go to wishlist";
                int n14 = 32;
                Object var23_54 = null;
                GTMEvents.gtmEventsToGaWithCategory$default((GTMEvents)object, string9, string2, (String)object2, string10, string8, null, n14, null);
                nm_1 nm_12 = newProductDetailsFragment.l;
                if (nm_12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cartClosetListener");
                    n4 = 0;
                    Object var10_16 = null;
                }
                var10_17.B0();
                return;
            }
            Bundle bundle = new Bundle();
            String string11 = this.l6();
            n4 = string11.length();
            if (n4 != 0) {
                object = this.l6();
            }
            bundle.putString(string2, (String)object);
            AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
            object = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
            String string12 = bv_0.a(analyticsManager$Companion);
            String string13 = cv_0.a(analyticsManager$Companion);
            boolean bl3 = false;
            Object var12_30 = null;
            Object var9_11 = null;
            String string14 = "widget interaction";
            string2 = "bbs widget";
            String string15 = "add to wishlist";
            String string16 = "widget_interaction";
            String string17 = "pdp screen";
            String string18 = "pdp screen";
            int n15 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string14, string2, string15, string16, string17, string18, string12, bundle, string13, false, null, n15, null);
            Product product = this.cb().q;
            if (product != null) {
                object = el1_2.a;
                object = yt2_2.PDP;
                el1_2.c((yt2_2)((Object)object), product);
            }
            this.Ra();
            return;
        }
        Object object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string19 = "pdp screen";
        Object var15_37 = null;
        Object object4 = "pdp widget";
        String string20 = "pdp_widget_interaction";
        String string21 = "price reveal widget";
        String string22 = "reveal price";
        int n16 = 32;
        Object var9_12 = null;
        GTMEvents.gtmEventsToGaWithCategory$default((GTMEvents)object3, (String)object4, string20, string21, string22, string19, null, n16, null);
        hy3_0 hy3_02 = this.mb();
        n4 = (int)(hy3_02.p() ? 1 : 0);
        if (n4 == n8) {
            hv3_0 hv3_02 = hv3_0.a;
            if (view != null) {
                view.performHapticFeedback(n8, n7);
            }
            tr2_2 tr2_22 = tr2_2.a;
            object = tr2_2.b;
            ((sw_0)object).putPreference("SALE_BTN_CLICKED", n8 != 0);
            LottieAnimationView lottieAnimationView = newProductDetailsFragment.p1;
            tr2_2.h(lottieAnimationView);
            newProductDetailsFragment.ac(n7);
            return;
        }
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity == null) return;
        object = at2_1.a;
        object = "activity";
        Intrinsics.checkNotNullParameter(fragmentActivity, (String)object);
        Object object5 = "fragment";
        Intrinsics.checkNotNullParameter(this, (String)object5);
        Object object6 = "source - price reveal widget";
        object3 = "source";
        Intrinsics.checkNotNullParameter(object6, (String)object3);
        at2_1.a((String)object6);
        boolean bl4 = at2_1.c();
        int n17 = 56;
        int n18 = 1002;
        string22 = "SOURCE";
        if (!bl4) {
            object4 = h40_0.a;
            bl4 = h40_0.u2();
            if (!bl4) {
                object4 = LoginActivityRevamp.Companion;
                object4.getClass();
                Intrinsics.checkNotNullParameter(fragmentActivity, (String)object);
                Intrinsics.checkNotNullParameter(this, (String)object5);
                Intrinsics.checkNotNullParameter(object6, (String)object3);
                object = new Intent((Context)fragmentActivity, LoginActivityRevamp.class);
                object.putExtra(string22, (String)object6);
                object5 = g62_0.c;
                object6 = Boolean.TRUE;
                ((g62_0)object5).b(object6, n18);
                this.startActivityForResult((Intent)object, n17);
                object = ActivityTransitionManager.getInstance();
                ((ActivityTransitionManager)object).slideUpAndStay(fragmentActivity);
                return;
            }
        }
        object4 = LoginActivityRevampNew.Companion;
        object4.getClass();
        Intrinsics.checkNotNullParameter(fragmentActivity, (String)object);
        Intrinsics.checkNotNullParameter(newProductDetailsFragment, (String)object5);
        Intrinsics.checkNotNullParameter(object6, (String)object3);
        object = new Intent((Context)fragmentActivity, LoginActivityRevampNew.class);
        object.putExtra(string22, (String)object6);
        object5 = g62_0.c;
        object6 = Boolean.TRUE;
        ((g62_0)object5).b(object6, n18);
        newProductDetailsFragment.startActivityForResult((Intent)object, n17);
        object = ActivityTransitionManager.getInstance();
        ((ActivityTransitionManager)object).slideUpAndStay(fragmentActivity);
    }

    public final PostsResponse N6() {
        Serializable serializable = this.cb().q;
        serializable = serializable != null ? serializable.getPostsResponse() : null;
        return serializable;
    }

    public final void N7() {
        lm_2 lm_22 = new lm_2();
        Intrinsics.checkNotNullParameter(this, "cartAddressCallBackListener");
        lm_22.S = this;
        Object object = this.Wa().l();
        object = object != null ? object.getAddressType() : null;
        Object object2 = AddressType.Pincode;
        if (object == object2) {
            object = this.Wa().m();
            if (object == null) {
                object = "";
            }
            object2 = "preFillPinCode";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            lm_22.R = object;
        }
        object = this.requireActivity().getSupportFragmentManager();
        lm_22.show((FragmentManager)object, "CartAddAddressBottomSheet");
    }

    public final BankOffer N9() {
        return this.l1;
    }

    public final void Nb(EddResult object) {
        int n3;
        if (object == null) {
            return;
        }
        this.q0 = object;
        object = this.L;
        int n4 = 0;
        Object object2 = null;
        if (object != null) {
            object = ((RecyclerView)object).getAdapter();
        } else {
            n3 = 0;
            object = null;
        }
        boolean bl2 = object instanceof yh2_1;
        if (bl2) {
            object = (yh2_1)object;
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            n4 = 17;
            object2 = ((yh2_1)object).g(n4);
        }
        if (object2 != null) {
            n3 = ((Number)object2).intValue();
            object2 = this.L;
            if (object2 != null && (object2 = ((RecyclerView)object2).getAdapter()) != null) {
                ((RecyclerView$f)object2).notifyItemChanged(n3);
            }
        }
    }

    public final void O1(Product object, int n3, String object2) {
        Object object3;
        Intrinsics.checkNotNullParameter(object2, "productColorGroup");
        String string2 = "clickedProduct";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl2) {
            object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            object3 = hj0_0.a(n3, "Recently Viewed/Product_click/");
            string2 = ((Product)object).getName();
            String string3 = "pdp screen";
            ((GTMEvents)object2).pushButtonTapEvent((String)object3, string2, string3);
        }
        n3 = (int)(((Product)object).getStoreType() ? 1 : 0);
        bl2 = false;
        object2 = null;
        if (n3 != 0) {
            n3 = 1;
            og1_1.g(n3 != 0, false);
        } else {
            og1_1.g(false, false);
        }
        object3 = new ri2$a();
        ((ri2$a)object3).a = object;
        ((ri2$a)object3).d = object = this.o5();
        object = ((ri2$a)object3).a();
        object3 = this.g;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productDetailListener");
            n3 = 0;
            object3 = null;
        }
        object3.n0((ri2_0)object);
    }

    public final String O5() {
        Object object = this.cb().q;
        object = object != null && (object = ((Product)object).getFnlProductData()) != null ? ((ProductfnlProductData)object).getTrustMarkerTxt() : null;
        return object;
    }

    public final void O7() {
        int n3;
        Object object = this.L;
        Object object2 = null;
        if (object != null) {
            object = ((RecyclerView)object).getAdapter();
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = object instanceof RecyclerView$f;
        if (n4 != 0) {
            object2 = object;
        }
        if (object2 == null) {
            return;
        }
        n3 = ((RecyclerView$f)object2).getItemCount();
        for (n4 = 0; n4 < n3; ++n4) {
            int n7;
            int n8 = ((RecyclerView$f)object2).getItemViewType(n4);
            if (n8 != (n7 = 8)) continue;
            object = this.L;
            if (object == null) break;
            ((RecyclerView)object).smoothScrollToPosition(n4);
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Ob(List object) {
        boolean bl2;
        ArrayList<BankOfferItem> arrayList = new ArrayList<BankOfferItem>();
        if (object != null) {
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                PrepaidOffersItem prepaidOffersItem = (PrepaidOffersItem)object.next();
                String string2 = prepaidOffersItem.getDescription();
                String string3 = prepaidOffersItem.getBankName();
                String string4 = prepaidOffersItem.getType();
                long l2 = prepaidOffersItem.getEndDate();
                String string5 = prepaidOffersItem.getTncUrl();
                String string6 = prepaidOffersItem.getOfferDetails();
                BankOfferItem bankOfferItem = new BankOfferItem(string2, string3, string4, l2, string5, string6);
                arrayList.add(bankOfferItem);
            }
        }
        object = h40_0.a;
        boolean bl3 = h40_0.A1();
        if (bl3 && (object = this.l1) != null && (object = ((BankOffer)object).getAllBankOffer()) != null) {
            bl3 = object.isEmpty();
            bl2 = true;
            if ((bl3 ^= bl2) == bl2) {
                object = this.l1;
                if (object != null) {
                    object = ((BankOffer)object).getAllBankOffer();
                } else {
                    bl3 = false;
                    object = null;
                }
                Intrinsics.checkNotNull(object);
                ((ArrayList)object).addAll(arrayList);
                return;
            }
        }
        this.l1 = object = new BankOffer(arrayList);
    }

    public final SpotLight P() {
        return this.cb().s;
    }

    public final boolean P1() {
        return this.H1;
    }

    public final long P3() {
        return this.Y;
    }

    public final BrandResponse P4() {
        Serializable serializable = this.cb().q;
        serializable = serializable != null ? serializable.getBrandResponse() : null;
        return serializable;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String[] P5() {
        block55: {
            block56: {
                block52: {
                    block50: {
                        block51: {
                            block48: {
                                block54: {
                                    block53: {
                                        block49: {
                                            var1_1 = this.cb();
                                            var2_2 = "DESCRIPTION";
                                            var3_6 = var1_1.E;
                                            if (var3_6 == null) break block55;
                                            var4_7 = hv3_0.Y();
                                            var5_8 = false;
                                            var6_9 = null;
                                            var7_10 = 1;
                                            if (var4_7) {
                                                var8_11 = var3_6.getSizeValue();
                                            } else {
                                                var8_11 = var3_6.getValue();
                                                if (var8_11 != null) {
                                                    var9_12 = var8_11.length() - var7_10;
                                                    var10_13 = 0;
                                                    var11_14 = null;
                                                    var12_15 = false;
                                                    var13_16 = null;
                                                    while (var10_13 <= var9_12) {
                                                        var14_17 = var12_15 == false ? var10_13 : var9_12;
                                                        var14_17 = var8_11.charAt(var14_17);
                                                        var15_18 = 32;
                                                        if ((var14_17 = Intrinsics.compare(var14_17, var15_18)) <= 0) {
                                                            var14_17 = 1;
                                                        } else {
                                                            var14_17 = 0;
                                                            var16_19 = null;
                                                        }
                                                        if (!var12_15) {
                                                            if (var14_17 == 0) {
                                                                var12_15 = true;
                                                                continue;
                                                            }
                                                            ++var10_13;
                                                            continue;
                                                        }
                                                        if (var14_17 == 0) break;
                                                        var9_12 += -1;
                                                    }
                                                    var8_11 = com.jio.jioads.adinterfaces.a.a(var9_12, var7_10, var10_13, var8_11);
                                                } else {
                                                    var4_7 = false;
                                                    var8_11 = null;
                                                }
                                            }
                                            var17_20 = "_attribute";
                                            var11_14 = var1_1.q;
                                            if (var11_14 == null) break block56;
                                            Intrinsics.checkNotNull(var11_14);
                                            var11_14 = var11_14.getFnlColorVariantData();
                                            if (var11_14 == null) break block56;
                                            var11_14 = var1_1.q;
                                            Intrinsics.checkNotNull(var11_14);
                                            var11_14 = var11_14.getFnlColorVariantData();
                                            if (var11_14 != null) {
                                                var11_14 = var11_14.getSizeJSONArray();
                                            } else {
                                                var10_13 = 0;
                                                var11_14 = null;
                                            }
                                            if (var11_14 == null || (var10_13 = (int)TextUtils.isEmpty((CharSequence)var8_11)) != 0) break block56;
                                            var11_14 = new StringBuilder();
                                            var13_16 = var1_1.q;
                                            if (var13_16 != null && (var13_16 = var13_16.getFnlColorVariantData()) != null) {
                                                var13_16 = var13_16.getSizeJSONArray();
                                            } else {
                                                var12_15 = false;
                                                var13_16 = null;
                                            }
                                            var16_19 = "";
                                            if (var13_16 == null) break block50;
                                            try {
                                                var15_18 = var13_16.length();
                                                var18_21 = 0;
lbl68:
                                                // 2 sources

                                                while (var18_21 < var15_18) {
                                                    var19_22 = var13_16.get(var18_21);
                                                    var20_23 = "null cannot be cast to non-null type org.json.JSONObject";
                                                    Intrinsics.checkNotNull(var19_22, (String)var20_23);
                                                    var19_22 = (JSONObject)var19_22;
                                                    var20_23 = var19_22.keys();
                                                    var21_24 = "SIZE_NAME";
                                                    var21_24 = var19_22.optString((String)var21_24);
                                                    var22_25 = kotlin.text.b.i(var8_11, (String)var21_24, (boolean)var7_10);
                                                    if (!var22_25) break block48;
                                                    var12_15 = var19_22.has((String)var2_2);
                                                    var13_16 = var12_15 != false ? (var2_2 = var19_22.getString((String)var2_2)) : var16_19;
                                                    break block49;
                                                }
                                                break block50;
                                            }
                                            catch (JSONException var2_3) {
                                                var13_16 = var16_19;
                                                break block51;
                                            }
                                        }
                                        var2_2 = "Show_Tool_Tip";
                                        try {
                                            var15_18 = var19_22.optInt((String)var2_2);
                                            if (var15_18 == 0) break block52;
                                            var18_21 = 0;
lbl91:
                                            // 5 sources

                                            while ((var23_26 = (int)var20_23.hasNext()) != 0) {
                                                var2_2 = var20_23.next();
                                                var2_2 = (String)var2_2;
                                                var21_24 = "Brand Size_attribute";
                                                break block53;
                                            }
                                            break block52;
                                        }
                                        catch (JSONException var2_5) {
                                            break block51;
                                        }
                                    }
                                    try {
                                        var22_25 = kotlin.text.b.i((String)var2_2, (String)var21_24, (boolean)var7_10);
                                        if (var22_25 || (var22_25 = kotlin.text.b.i((String)var2_2, (String)(var21_24 = "Brand size format_Attribute"), (boolean)var7_10)) || (var22_25 = kotlin.text.b.i((String)var2_2, (String)(var21_24 = "Universal Size_Attribute"), (boolean)var7_10)) || (var22_25 = kotlin.text.b.i((String)var2_2, (String)(var21_24 = "Universal size format_Attribute"), (boolean)var7_10))) ** GOTO lbl91
                                        if (var18_21 == var15_18) break block52;
                                        Intrinsics.checkNotNull(var2_2);
                                        var22_25 = StringsKt.F((CharSequence)var2_2, var17_20, false);
                                        if (!var22_25) ** GOTO lbl91
                                        var21_24 = var19_22.get((String)var2_2);
                                        var24_27 = TextUtils.isEmpty((CharSequence)var11_14);
                                        if (var24_27) break block54;
                                        var25_28 = " | ";
                                        var11_14.append((String)var25_28);
                                    }
                                    catch (JSONException var2_4) {
                                        ** GOTO lbl-1000
                                    }
                                }
                                ++var18_21;
                                var2_2 = kotlin.text.b.n((String)var2_2, var17_20, var16_19, false);
                                var11_14.append((String)var2_2);
                                var2_2 = "-";
                                var11_14.append((String)var2_2);
                                var11_14.append(var21_24);
                                var2_2 = "\"";
                                var11_14.append((String)var2_2);
                                ** GOTO lbl91
lbl-1000:
                                // 1 sources

                                {
                                    var25_28 = yn3_0.a;
                                    var25_28.e(var2_4);
                                    ** GOTO lbl91
                                }
                            }
                            ++var18_21;
                            ** GOTO lbl68
                        }
                        var25_28 = yn3_0.a;
                        var25_28.e((Throwable)var2_2);
                        break block52;
                    }
                    var13_16 = var16_19;
                }
                var23_26 = hv3_0.Y();
                if (var23_26 != 0) {
                    var2_2 = var1_1.q;
                    if (var2_2 != null && (var2_2 = var2_2.getBaseOptions()) != null && (var2_2 = (ProductOption)var2_2.get(0)) != null && (var2_2 = var2_2.getOptions()) != null && (var2_2 = (ProductOptionItem)var2_2.get(0)) != null) {
                        var2_2 = var2_2.getSizeDisplayType();
                    } else {
                        var23_26 = 0;
                        var2_2 = null;
                    }
                    if (var2_2 == null || (var26_29 = var2_2.length()) == 0) {
                        var2_2 = var1_1.q;
                        if (var2_2 != null && (var2_2 = var2_2.getVariantOptions()) != null && (var2_2 = (ProductOptionItem)var2_2.get(0)) != null) {
                            var2_2 = var2_2.getSizeDisplayType();
                        } else {
                            var23_26 = 0;
                            var2_2 = null;
                        }
                    }
                    if (var2_2 != null && (var23_26 = var2_2.equals(var25_28 = "STANDARD")) == var7_10) {
                        var2_2 = var3_6.getBrandValue();
                        Intrinsics.checkNotNull(var2_2);
                        var23_26 = var2_2.length();
                        if (var23_26 > 0) {
                            var2_2 = var1_1.q;
                            if (var2_2 != null && (var2_2 = var2_2.getFeatureData()) != null) {
                                var2_2 = var1_1.q;
                                if (var2_2 != null) {
                                    var2_2 = var2_2.getFeatureData();
                                } else {
                                    var23_26 = 0;
                                    var2_2 = null;
                                }
                                Intrinsics.checkNotNull(var2_2);
                                var2_2 = var2_2.iterator();
                                while ((var26_29 = (int)var2_2.hasNext()) != 0) {
                                    var25_28 = (FeatureData)var2_2.next();
                                    var17_20 = var25_28.getName();
                                    if ((var17_20 == null || (var9_12 = (int)var17_20.equalsIgnoreCase(var27_30 = "Size Format")) != var7_10) && ((var17_20 = var25_28.getName()) == null || (var9_12 = (int)var17_20.equalsIgnoreCase(var27_30 = "sizeFormat")) != var7_10)) continue;
                                    var2_2 = var25_28.getFeatureValues();
                                    if (var2_2 != null) {
                                        var23_26 = var2_2.size();
                                    } else {
                                        var23_26 = 0;
                                        var2_2 = null;
                                    }
                                    if (var23_26 <= 0) break;
                                    var2_2 = var25_28.getFeatureValues();
                                    if (var2_2 != null && (var2_2 = (FeatureValue)var2_2.get(0)) != null) {
                                        var2_2 = var2_2.getValue();
                                    } else {
                                        var23_26 = 0;
                                        var2_2 = null;
                                    }
                                    var17_20 = "UNI";
                                    var23_26 = (int)kotlin.text.b.i((String)var2_2, var17_20, false);
                                    if (var23_26 != 0) break;
                                    var2_2 = var25_28.getFeatureValues();
                                    if (var2_2 != null && (var2_2 = (FeatureValue)var2_2.get(0)) != null) {
                                        var16_19 = var2_2.getValue();
                                        break;
                                    }
                                    var14_17 = 0;
                                    var16_19 = null;
                                    break;
                                }
                            }
                            if ((var2_2 = var1_1.E) != null) {
                                var2_2 = var2_2.getValue();
                            } else {
                                var23_26 = 0;
                                var2_2 = null;
                            }
                            var25_28 = var1_1.r();
                            var1_1 = var1_1.E;
                            var1_1 = var1_1 != null ? var1_1.getBrandValue() : null;
                            var23_26 = kotlin.text.b.i((String)var2_2, (String)var1_1, (boolean)var7_10);
                            if (var23_26 != 0 && (var23_26 = (int)(var2_2 = Y63.e((String)var25_28)).equalsIgnoreCase((String)(var1_1 = Y63.e(var16_19)))) != 0) {
                                var23_26 = 1;
                            } else {
                                var23_26 = 0;
                                var2_2 = null;
                            }
                            if (var23_26 == 0) {
                                var23_26 = var11_14.length();
                                if (var23_26 > 0) {
                                    var5_8 = true;
                                }
                                var2_2 = " ";
                                if (var5_8) {
                                    var1_1 = var3_6.getBrandValue();
                                    var6_9 = "| Brand Size ";
                                    var3_6 = new StringBuilder(var6_9);
                                    var3_6.append(var16_19);
                                    var3_6.append((String)var2_2);
                                    var3_6.append((String)var1_1);
                                    var2_2 = var3_6.toString();
                                    var11_14.append((String)var2_2);
                                } else {
                                    var1_1 = var3_6.getBrandValue();
                                    var6_9 = "Brand Size ";
                                    var3_6 = new StringBuilder(var6_9);
                                    var3_6.append(var16_19);
                                    var3_6.append((String)var2_2);
                                    var3_6.append((String)var1_1);
                                    var2_2 = var3_6.toString();
                                    var11_14.append((String)var2_2);
                                }
                            }
                        }
                    }
                }
                if ((var23_26 = TextUtils.isEmpty((CharSequence)var11_14)) == 0) {
                    var2_2 = var11_14.toString();
                    return new String[]{var2_2, var13_16, var8_11};
                }
                break block55;
            }
            var2_2 = new String();
            return new String[]{var2_2};
        }
        var2_2 = new String();
        return new String[]{var2_2};
    }

    public final void P8(int n3) {
        int n4;
        Object object;
        NewProductDetailsFragment newProductDetailsFragment = this;
        int n7 = n3;
        int n8 = 4;
        if (n3 == n8 && (object = this.t1) != null && (n8 = object.getVisibility()) == (n4 = 8)) {
            NewCustomEventsRevamp newCustomEventsRevamp = this.H;
            String string2 = newCustomEventsRevamp.getEC_APP_UPDATE_INTERACTION();
            String string3 = this.H.getINSTALL_NOW_CTA_VIEW();
            object = AnalyticsManager.Companion;
            String string4 = av_0.a((AnalyticsManager$Companion)object);
            String string5 = av_0.a((AnalyticsManager$Companion)object);
            String string6 = this.n1;
            String string7 = this.o1;
            int n10 = 1536;
            String string8 = "";
            String string9 = "event_app_update_interaction";
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string8, string9, string4, string5, string6, null, string7, false, null, n10, null);
        }
        if ((n8 = (int)(og1_1.c() ? 1 : 0)) == 0 && (object = newProductDetailsFragment.t1) != null) {
            object.setUIForState(n7);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void Pb(Product var1_1) {
        block191: {
            block190: {
                block189: {
                    block179: {
                        block183: {
                            block188: {
                                block184: {
                                    block180: {
                                        var2_2 = this;
                                        var3_3 = var1_1;
                                        var4_4 = 0;
                                        var5_5 = 2 != 0;
                                        var6_6 = true;
                                        var7_7 = var1_1.getBrandName();
                                        var8_8 /* !! */  = var1_1.getName();
                                        var7_7 = n1.a((String)var7_7, " ", (String)var8_8 /* !! */ );
                                        var8_8 /* !! */  = this.kb().getToolbar();
                                        var9_9 = "getString(...)";
                                        var10_10 = "format(...)";
                                        if (var8_8 /* !! */  != null) {
                                            var11_11 = StringCompanionObject.INSTANCE;
                                            var12_12 = R$string.acc_page_header_pdp;
                                            var11_11 = this.getString(var12_12);
                                            Intrinsics.checkNotNullExpressionValue(var11_11, (String)var9_9);
                                            var13_13 = new Object[var6_6];
                                            var13_13[0] = var7_7;
                                            var13_13 = Arrays.copyOf(var13_13, (int)var6_6);
                                            var11_11 = String.format((String)var11_11, (Object[])var13_13);
                                            Intrinsics.checkNotNullExpressionValue(var11_11, (String)var10_10);
                                            var8_8 /* !! */ .setContentDescription((CharSequence)var11_11);
                                        }
                                        if ((var8_8 /* !! */  = var2_2.y0) != null) {
                                            var11_11 = StringCompanionObject.INSTANCE;
                                            var12_12 = R$string.acc_page_header_pdp;
                                            var11_11 = var2_2.getString(var12_12);
                                            Intrinsics.checkNotNullExpressionValue(var11_11, (String)var9_9);
                                            var9_9 = new Object[var6_6];
                                            var9_9[0] = var7_7;
                                            var7_7 = Arrays.copyOf(var9_9, (int)var6_6);
                                            var7_7 = String.format((String)var11_11, (Object[])var7_7);
                                            Intrinsics.checkNotNullExpressionValue(var7_7, (String)var10_10);
                                            var8_8 /* !! */ .setContentDescription((CharSequence)var7_7);
                                        }
                                        var8_8 /* !! */  = Looper.getMainLooper();
                                        var7_7 = new Handler((Looper)var8_8 /* !! */ );
                                        var8_8 /* !! */  = new Ga(var2_2, (int)var5_5);
                                        var14_14 = 300L;
                                        var7_7.postDelayed((Runnable)var8_8 /* !! */ , var14_14);
                                        var1_1.populate();
                                        var7_7 = this.cb();
                                        var7_7.getClass();
                                        Intrinsics.checkNotNullParameter(var3_3, "product");
                                        var7_7.q = var3_3;
                                        var7_7.s = var8_8 /* !! */  = var1_1.getSpotlight();
                                        var8_8 /* !! */  = var7_7.r;
                                        var8_8 /* !! */ .clear();
                                        var9_9 = var7_7.q;
                                        if (var9_9 != null) {
                                            var9_9 = var9_9.getProductGalleryImageUrls();
                                        } else {
                                            var16_15 = 0;
                                            var9_9 = null;
                                        }
                                        var9_9 = (Collection)var9_9;
                                        var17_16 = 10 != 0;
                                        var18_17 = "";
                                        if (var9_9 != null && (var16_15 = var9_9.isEmpty()) == 0) {
                                            var9_9 = var7_7.q;
                                            if (var9_9 != null && (var9_9 = var9_9.getProductGalleryImageUrls()) != null) {
                                                var9_9 = ((Iterable)var9_9).iterator();
                                                while ((var12_12 = (int)var9_9.hasNext()) != 0) {
                                                    var11_11 = (ProductImage)var9_9.next();
                                                    var8_8 /* !! */ .add(var11_11);
                                                }
                                            }
                                            var9_9 = h40_0.a;
                                            var9_9 = h40_0.Z();
                                            var16_15 = var9_9.isPdpVideosEnabled();
                                            if (var16_15 != 0 && (var9_9 = var7_7.q) != null && (var9_9 = var9_9.getProductVideos()) != null && (var9_9 = var9_9.getVideos()) != null) {
                                                var9_9 = (Iterable)var9_9;
                                                var19_18 = yx_2.o((Iterable)var9_9, (int)var17_16);
                                                var11_11 = new ArrayList(var19_18);
                                                var9_9 = var9_9.iterator();
                                                while ((var19_18 = (int)var9_9.hasNext()) != 0) {
                                                    var13_13 = (Video)var9_9.next();
                                                    var21_20 = Boolean.TRUE;
                                                    var22_21 = var13_13.getUrl();
                                                    var23_22 = (var13_13 = var13_13.getThumbnail()) != null && (var13_13 = var13_13.getUrl()) != null ? var13_13 : var18_17;
                                                    var13_13 = var7_7.q;
                                                    if (var13_13 != null) {
                                                        var24_23 = var13_13 = var13_13.getProductVideos();
                                                    } else {
                                                        var25_24 = false;
                                                        var24_23 = null;
                                                    }
                                                    var26_25 = null;
                                                    var27_26 = null;
                                                    var28_27 = 0;
                                                    var29_28 = "";
                                                    var30_29 = null;
                                                    var31_30 = var20_19;
                                                    var20_19 = new ProductImage(null, var29_28, null, 0, null, var21_20, (String)var22_21, (String)var23_22, (ProductVideos)var24_23);
                                                    var11_11.add(var20_19);
                                                    var17_16 = 10 != 0;
                                                }
                                                var9_9 = var7_7.q;
                                                if (var9_9 != null && (var9_9 = var9_9.getProductVideos()) != null) {
                                                    var16_15 = var9_9.getVideoPosition();
                                                    if (var16_15 < 0 || var16_15 > (var19_18 = var8_8 /* !! */ .size())) {
                                                        var16_15 = var8_8 /* !! */ .size();
                                                    }
                                                    var8_8 /* !! */ .addAll(var16_15, var11_11);
                                                }
                                            }
                                        }
                                        if ((var8_8 /* !! */  = var7_7.q) != null && (var8_8 /* !! */  = var8_8 /* !! */ .getFnlColorVariantData()) != null) {
                                            var8_8 /* !! */  = var8_8 /* !! */ .getMobileAppVideoUrl();
                                        } else {
                                            var32_31 = 0;
                                            var8_8 /* !! */  = null;
                                        }
                                        var7_7.t = var8_8 /* !! */ ;
                                        var8_8 /* !! */  = var7_7.q;
                                        if (var8_8 /* !! */  != null) {
                                            var8_8 /* !! */  = var8_8 /* !! */ .getPrepaidOffers();
                                        } else {
                                            var32_31 = 0;
                                            var8_8 /* !! */  = null;
                                        }
                                        var7_7.E0 = var8_8 /* !! */ ;
                                        var7_7.D();
                                        var8_8 /* !! */  = var7_7.v0;
                                        var8_8 /* !! */ .clear();
                                        var7_7.A0 = var18_17;
                                        var9_9 = var7_7.q;
                                        if (var9_9 != null) {
                                            var9_9 = var9_9.getBaseOptions();
                                        } else {
                                            var16_15 = 0;
                                            var9_9 = null;
                                        }
                                        if (var9_9 == null || (var16_15 = var7_7.y) == 0) break block180;
                                        var9_9 = var7_7.q;
                                        if (var9_9 != null) {
                                            var9_9 = var9_9.getBaseOptions();
                                        } else {
                                            var16_15 = 0;
                                            var9_9 = null;
                                        }
                                        Intrinsics.checkNotNull(var9_9);
                                        var9_9 = var9_9.iterator();
                                        while ((var12_12 = (int)var9_9.hasNext()) != 0) {
                                            var20_19 = "FnlColorVariant";
                                            var11_11 = (ProductOption)var9_9.next();
                                            var13_13 = var11_11.getVariantType();
                                            var19_18 = (int)Intrinsics.areEqual(var20_19, var13_13);
                                            if (var19_18 == 0) continue;
                                            var13_13 = var11_11.getSelected();
                                            if (var13_13 != null) {
                                                var20_19 = var13_13.getVariantOptionQualifiers();
                                            } else {
                                                var17_16 = false;
                                                var20_19 = null;
                                            }
                                            if (var13_13 != null) {
                                                var13_13 = var13_13.getCode();
                                            } else {
                                                var19_18 = 0;
                                                var13_13 = null;
                                            }
                                            if (var20_19 != null) {
                                                var20_19 = var20_19.iterator();
                                                while ((var33_32 = var20_19.hasNext()) != 0) {
                                                    var31_30 = (ProductOptionVariant)var20_19.next();
                                                    var34_33 = var31_30.getQualifier();
                                                    var36_35 = kotlin.text.b.i((String)var34_33, (String)(var35_34 = var7_7.w0), var6_6);
                                                    if (!var36_35) continue;
                                                    var7_7.y0 = var35_34 = var31_30.getName();
                                                }
                                            }
                                            if ((var11_11 = var11_11.getOptions()) == null) continue;
                                            var20_19 = var11_11;
                                            var20_19 = (Collection)var11_11;
                                            var17_16 = var20_19.size();
                                            var35_34 = null;
                                            for (var36_35 = false; var36_35 < var17_16; var36_35 += var16_15) {
                                                block181: {
                                                    var34_33 = (ProductOptionItem)var11_11.get((int)var36_35);
                                                    var37_36 = var34_33.getVariantOptionQualifiers();
                                                    if (var37_36 == null) break block181;
                                                    var30_29 = var37_36;
                                                    var30_29 = (Collection)var37_36;
                                                    var38_37 = var30_29.size();
                                                    while (var4_4 < var38_37) {
                                                        block182: {
                                                            var39_38 = var27_26 = var37_36.get(var4_4);
                                                            var39_38 = (ProductOptionVariant)var27_26;
                                                            var27_26 = var9_9;
                                                            var9_9 = var39_38.getQualifier();
                                                            var22_21 = var11_11;
                                                            var11_11 = var7_7.w0;
                                                            var23_22 = var18_17;
                                                            var40_39 = true;
                                                            var16_15 = (int)kotlin.text.b.i((String)var9_9, (String)var11_11, var40_39);
                                                            if (var16_15 == 0) ** GOTO lbl-1000
                                                            var9_9 = var39_38.getQualifier();
                                                            var16_15 = (int)kotlin.text.b.i((String)var9_9, (String)(var11_11 = "color"), var40_39);
                                                            if (var16_15 == 0) break block182;
                                                            var9_9 = var39_38.getSwatchImage();
                                                            if (var9_9 == null) ** GOTO lbl-1000
                                                            var9_9 = var39_38.getSwatchImage();
                                                            if (var9_9 != null) {
                                                                var9_9 = var9_9.getUrl();
                                                            } else {
                                                                var16_15 = 0;
                                                                var9_9 = null;
                                                            }
                                                            if (var9_9 != null && (var16_15 = var9_9.length()) != 0) {
                                                                var9_9 = UrlHelper.Companion.getInstance();
                                                                var11_11 = var39_38.getSwatchImage();
                                                                if (var11_11 != null) {
                                                                    var11_11 = var11_11.getUrl();
                                                                } else {
                                                                    var12_12 = 0;
                                                                    var41_40 = 0.0f;
                                                                    var11_11 = null;
                                                                }
                                                                var9_9 = var9_9.getImageUrl((String)var11_11);
                                                                var11_11 = var39_38.getSwatchImage();
                                                                if (var11_11 != null) {
                                                                    var11_11.setUrl((String)var9_9);
                                                                }
                                                            } else lbl-1000:
                                                            // 4 sources

                                                            {
                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        var9_9 = var34_33.getPriceData();
                                                        var39_38.setPriceData((Price)var9_9);
                                                        var9_9 = var34_33.getWasPriceData();
                                                        var39_38.setWasPriceData((Price)var9_9);
                                                        var9_9 = var34_33.getModelImage();
                                                        var39_38.setModelImage((ModelImage)var9_9);
                                                        var9_9 = var34_33.getCode();
                                                        var39_38.setCode((String)var9_9);
                                                        var9_9 = var34_33.getColor();
                                                        var39_38.setColor((String)var9_9);
                                                        var9_9 = UrlHelper.Companion.getInstance();
                                                        var11_11 = var34_33.getModelImage();
                                                        if (var11_11 != null) {
                                                            var11_11 = var11_11.getUrl();
                                                        } else {
                                                            var12_12 = 0;
                                                            var41_40 = 0.0f;
                                                            var11_11 = null;
                                                        }
                                                        var9_9 = var9_9.getImageUrl((String)var11_11);
                                                        var39_38.setThumbnail((String)var9_9);
                                                        if (var13_13 != null && (var16_15 = (int)Intrinsics.areEqual(var13_13, var9_9 = var34_33.getCode())) != 0) {
                                                            var16_15 = 1;
                                                            var39_38.setSelected((boolean)var16_15);
                                                            var9_9 = var39_38.getValue();
                                                            if (var9_9 == null) {
                                                                var9_9 = var23_22;
                                                            }
                                                            var7_7.A0 = var9_9;
                                                        }
                                                        var8_8 /* !! */ .add(var39_38);
                                                        ** continue;
                                                        var16_15 = 1;
                                                        var4_4 += var16_15;
                                                        var9_9 = var27_26;
                                                        var11_11 = var22_21;
                                                        var18_17 = var23_22;
                                                        var6_6 = true;
                                                    }
                                                }
                                                var27_26 = var9_9;
                                                var22_21 = var11_11;
                                                var23_22 = var18_17;
                                                var16_15 = 1;
                                                var4_4 = 0;
                                                var5_5 = 2 != 0;
                                                var6_6 = true;
                                            }
                                        }
                                    }
                                    var23_22 = var18_17;
                                    var8_8 /* !! */  = var7_7.q;
                                    if (var8_8 /* !! */  != null) {
                                        var8_8 /* !! */  = var8_8 /* !! */ .getImages();
                                    } else {
                                        var32_31 = 0;
                                        var8_8 /* !! */  = null;
                                    }
                                    var8_8 /* !! */  = (Collection)var8_8 /* !! */ ;
                                    if (var8_8 /* !! */  != null && (var32_31 = var8_8 /* !! */ .isEmpty()) == 0 && (var8_8 /* !! */  = var7_7.q) != null && (var8_8 /* !! */  = var8_8 /* !! */ .getImages()) != null) {
                                        var8_8 /* !! */  = ((Iterable)var8_8 /* !! */ ).iterator();
                                        while ((var16_15 = (int)var8_8 /* !! */ .hasNext()) != 0) {
                                            var13_13 = "TRUST_MARKER";
                                            var9_9 = (ProductImage)var8_8 /* !! */ .next();
                                            var11_11 = var9_9.getImageType();
                                            var12_12 = (int)Intrinsics.areEqual(var13_13, var11_11);
                                            if (var12_12 == 0) continue;
                                            var11_11 = var7_7.u0;
                                            if (var11_11 == null) {
                                                var11_11 = new ArrayList();
                                                var7_7.u0 = var11_11;
                                            }
                                            if ((var11_11 = var7_7.u0) == null) continue;
                                            var11_11.add(var9_9);
                                        }
                                    }
                                    var8_8 /* !! */  = PDPFunctionalRepo.INSTANCE;
                                    var9_9 = var7_7.q;
                                    if (var9_9 != null) {
                                        var9_9 = var9_9.getVariantOptions();
                                    } else {
                                        var16_15 = 0;
                                        var9_9 = null;
                                    }
                                    var11_11 = var7_7.F0;
                                    var8_8 /* !! */ .setPriceBreakUpMap((List)var9_9, (HashMap)var11_11);
                                    var8_8 /* !! */  = var7_7.s();
                                    var32_31 = var8_8 /* !! */ .isUserOnline();
                                    if (var32_31 != 0 && (var32_31 = (var8_8 /* !! */  = var7_7.d()).n()) != 0) {
                                        var32_31 = 1;
                                    } else {
                                        var32_31 = 0;
                                        var8_8 /* !! */  = null;
                                    }
                                    var32_31 = var32_31 != 0 ? 2 : 1;
                                    var7_7.I0 = var32_31;
                                    var32_31 = (int)mz3_0.B();
                                    if (var32_31 != 0 && (var32_31 = (int)(var8_8 /* !! */  = var7_7.s()).isUserOnline()) != 0) {
                                        AJIOApplication.Companion.getClass();
                                        var9_9 = AJIOApplication$a.a();
                                        var8_8 /* !! */  = new jo_2((Context)var9_9);
                                        var8_8 /* !! */  = var8_8 /* !! */ .i();
                                        if (var8_8 /* !! */  != null) {
                                            var8_8 /* !! */  = var8_8 /* !! */ .getPincode();
                                        } else {
                                            var32_31 = 0;
                                            var8_8 /* !! */  = null;
                                        }
                                        tj2_2.Companion.getClass();
                                        var9_9 = tj2$a_0.a().a;
                                        if (var9_9 != null && (var16_15 = var9_9.length()) > 0) {
                                            var8_8 /* !! */  = tj2$a_0.a().a;
                                        } else if (var8_8 /* !! */  == null || (var16_15 = var8_8 /* !! */ .length()) <= 0) {
                                            var8_8 /* !! */  = var23_22;
                                        }
                                        if (var8_8 /* !! */  == null) {
                                            var8_8 /* !! */  = var23_22;
                                        }
                                        if ((var9_9 = var7_7.q) == null || (var9_9 = var9_9.getCode()) == null) {
                                            var9_9 = var23_22;
                                        }
                                        if ((var11_11 = var7_7.q) != null && (var11_11 = var11_11.getQuantity()) != null) {
                                            var12_12 = var11_11.intValue();
                                        } else {
                                            var12_12 = 0;
                                            var41_40 = 0.0f;
                                            var11_11 = null;
                                        }
                                        var13_13 = var7_7.j();
                                        if (var13_13 != null) {
                                            var19_18 = (int)var13_13.isExchangeable();
                                        } else {
                                            var19_18 = 0;
                                            var13_13 = null;
                                        }
                                        var17_16 = true;
                                        var35_34 = var23_22;
                                        var18_17 = var1_1;
                                        var4_4 = 10;
                                        var7_7.m((String)var8_8 /* !! */ , (String)var9_9, var12_12, (boolean)var19_18, var1_1, var17_16);
                                    } else {
                                        var35_34 = var23_22;
                                        var4_4 = 10;
                                    }
                                    var7_7 = this.cb();
                                    var42_41 = var7_7.u();
                                    var32_31 = 1;
                                    if (var42_41 == var32_31) {
                                        this.Sa();
                                    }
                                    if ((var7_7 = var2_2.w0) != null) {
                                        var8_8 /* !! */  = this.cb().C;
                                        var7_7.setSizeProductOptionList((List)var8_8 /* !! */ );
                                    }
                                    if ((var7_7 = this.cb().q) != null) {
                                        var7_7 = var7_7.getPotentialPromotions();
                                    } else {
                                        var42_41 = 0;
                                        var7_7 = null;
                                    }
                                    var7_7 = (ArrayList)var7_7;
                                    var2_2.U.getClass();
                                    var7_7 = this.cb().q;
                                    if (var7_7 != null) {
                                        var42_41 = (int)var7_7.isBundleOfferAvailable();
                                        var7_7 = (boolean)var42_41;
                                    } else {
                                        var42_41 = 0;
                                        var7_7 = null;
                                    }
                                    Intrinsics.checkNotNull(var7_7);
                                    var7_7.getClass();
                                    this.cb().B();
                                    var7_7 = this.cb();
                                    var7_7.M = var35_34;
                                    var8_8 /* !! */  = var7_7.q;
                                    if (var8_8 /* !! */  == null) break block183;
                                    Intrinsics.checkNotNull(var8_8 /* !! */ );
                                    var8_8 /* !! */  = var8_8 /* !! */ .getFeatureData();
                                    if (var8_8 /* !! */  == null) break block184;
                                    var8_8 /* !! */  = var8_8 /* !! */ .iterator();
                                    var9_9 = var35_34;
                                    var11_11 = var35_34;
                                    var13_13 = var35_34;
                                    var18_17 = var35_34;
                                    var17_16 = false;
                                    var20_19 = null;
                                    block8: while ((var38_37 = (int)var8_8 /* !! */ .hasNext()) != 0) {
                                        block185: {
                                            block187: {
                                                block186: {
                                                    var43_42 = (Object[])var8_8 /* !! */ .next();
                                                    var37_36 = var43_42.getCode();
                                                    if (var37_36 != null) {
                                                        var39_38 = "verticalsizewornbymodel";
                                                        var44_43 = 0;
                                                        var34_33 = null;
                                                        var5_5 = StringsKt.F((CharSequence)var37_36, (CharSequence)var39_38, false);
                                                        var37_36 = var5_5;
                                                    } else {
                                                        var44_43 = 0;
                                                        var34_33 = null;
                                                        var5_5 = false;
                                                        var37_36 = null;
                                                    }
                                                    Intrinsics.checkNotNull(var37_36);
                                                    var5_5 = var37_36.booleanValue();
                                                    if (var5_5) {
                                                        if ((var43_42 = var43_42.getFeatureValues()) == null || (var43_42 = (FeatureValue)var43_42.get(0)) == null || (var43_42 = var43_42.getValue()) == null) continue;
                                                        var13_13 = "Size ".concat((String)var43_42);
lbl407:
                                                        // 4 sources

                                                        while (true) {
                                                            var17_16 = true;
                                                            continue block8;
                                                            break;
                                                        }
                                                    }
                                                    var37_36 = var43_42.getCode();
                                                    if (var37_36 != null) {
                                                        var39_38 = "brickmodelheight";
                                                        var44_43 = 0;
                                                        var34_33 = null;
                                                        var5_5 = StringsKt.F((CharSequence)var37_36, (CharSequence)var39_38, false);
                                                        var37_36 = var5_5;
                                                    } else {
                                                        var44_43 = 0;
                                                        var34_33 = null;
                                                        var5_5 = false;
                                                        var37_36 = null;
                                                    }
                                                    Intrinsics.checkNotNull(var37_36);
                                                    var5_5 = var37_36.booleanValue();
                                                    if (var5_5) break block185;
                                                    var37_36 = var43_42.getCode();
                                                    if (var37_36 != null) {
                                                        var39_38 = "verticalmodelheight";
                                                        var5_5 = StringsKt.F((CharSequence)var37_36, (CharSequence)var39_38, false);
                                                        var37_36 = var5_5;
                                                    } else {
                                                        var5_5 = false;
                                                        var37_36 = null;
                                                    }
                                                    Intrinsics.checkNotNull(var37_36);
                                                    var5_5 = var37_36.booleanValue();
                                                    if (var5_5) break block185;
                                                    var37_36 = var43_42.getCode();
                                                    if (var37_36 != null) {
                                                        var39_38 = "brickmodelchestsize";
                                                        var44_43 = 0;
                                                        var34_33 = null;
                                                        var5_5 = StringsKt.F((CharSequence)var37_36, (CharSequence)var39_38, false);
                                                        var37_36 = var5_5;
                                                    } else {
                                                        var44_43 = 0;
                                                        var34_33 = null;
                                                        var5_5 = false;
                                                        var37_36 = null;
                                                    }
                                                    Intrinsics.checkNotNull(var37_36);
                                                    var5_5 = var37_36.booleanValue();
                                                    if (!var5_5) break block186;
                                                    if ((var43_42 = var43_42.getFeatureValues()) == null || (var43_42 = (FeatureValue)var43_42.get(0)) == null || (var43_42 = var43_42.getValue()) == null) continue;
                                                    var9_9 = " and Chest ".concat((String)var43_42);
                                                    ** GOTO lbl407
                                                }
                                                var37_36 = var43_42.getCode();
                                                if (var37_36 != null) {
                                                    var39_38 = "brickmodelwaistsize";
                                                    var44_43 = 0;
                                                    var34_33 = null;
                                                    var5_5 = StringsKt.F((CharSequence)var37_36, (CharSequence)var39_38, false);
                                                    var37_36 = var5_5;
                                                } else {
                                                    var44_43 = 0;
                                                    var34_33 = null;
                                                    var5_5 = false;
                                                    var37_36 = null;
                                                }
                                                Intrinsics.checkNotNull(var37_36);
                                                var5_5 = var37_36.booleanValue();
                                                if (!var5_5) break block187;
                                                if ((var43_42 = var43_42.getFeatureValues()) == null || (var43_42 = (FeatureValue)var43_42.get(0)) == null || (var43_42 = var43_42.getValue()) == null) continue;
                                                var11_11 = " and Waist ".concat((String)var43_42);
                                                ** GOTO lbl407
                                            }
                                            var37_36 = var43_42.getName();
                                            var5_5 = kotlin.text.b.i((String)var37_36, (String)(var39_38 = "Size Format"), (boolean)(var44_43 = 1));
                                            if (!var5_5 || (var43_42 = var43_42.getFeatureValues()) == null) continue;
                                            var5_5 = false;
                                            var37_36 = null;
                                            if ((var43_42 = (FeatureValue)var43_42.get(0)) == null || (var43_42 = var43_42.getValue()) == null) continue;
                                            var7_7.M = var43_42;
                                            continue;
                                        }
                                        if ((var43_42 = var43_42.getFeatureValues()) == null) continue;
                                        var5_5 = false;
                                        var37_36 = null;
                                        if ((var43_42 = (FeatureValue)var43_42.get(0)) == null || (var43_42 = var43_42.getValue()) == null) continue;
                                        var20_19 = " ft.";
                                        var18_17 = cP.a(", with Height ", (String)var43_42, (String)var20_19);
                                        ** continue;
                                    }
                                    var8_8 /* !! */  = var18_17;
                                    var18_17 = var13_13;
                                    break block188;
                                }
                                var8_8 /* !! */  = var35_34;
                                var9_9 = var35_34;
                                var11_11 = var35_34;
                                var18_17 = var35_34;
                                var17_16 = false;
                                var20_19 = null;
                            }
                            if (var17_16) {
                                var13_13 = StringCompanionObject.INSTANCE;
                                var19_18 = R$string.our_model_wears_a;
                                var13_13 = hv3_0.K(var19_18);
                                var17_16 = 4 != 0;
                                var43_42 = new Object[var17_16];
                                var5_5 = false;
                                var37_36 = null;
                                var43_42[0] = var18_17;
                                var40_39 = true;
                                var43_42[var40_39] = var8_8 /* !! */ ;
                                var43_42[2] = var9_9;
                                var32_31 = 3;
                                var43_42[var32_31] = var11_11;
                                var18_17 = xh2_0.a((Object[])var43_42, (int)var17_16, (String)var13_13, (String)var10_10);
                            } else {
                                var18_17 = var35_34;
                            }
                            var7_7.L = var18_17;
                        }
                        var7_7 = this.cb();
                        var7_7.getClass();
                        var8_8 /* !! */  = PDPFunctionalRepo.INSTANCE;
                        var9_9 = var7_7.q;
                        var7_7.G0 = var8_8 /* !! */  = var8_8 /* !! */ .checkPriceError((Product)var9_9);
                        if (var8_8 /* !! */  != null) {
                            var42_41 = var8_8 /* !! */ .getShowError();
lbl528:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var42_41 = 0;
                        var7_7 = null;
                        ** while (true)
                        var32_31 = 1;
                        if (var42_41 == var32_31 && (var42_41 = (int)this.H0()) == 0) {
                            var7_7 = var2_2.j1;
                            if (var7_7 != null) {
                                var32_31 = 0;
                                var8_8 /* !! */  = null;
                                var7_7.setVisibility(0);
                            }
                            if ((var7_7 = var2_2.k1) != null) {
                                var8_8 /* !! */  = this.cb().G0;
                                if (var8_8 /* !! */  != null) {
                                    var8_8 /* !! */  = var8_8 /* !! */ .getErrorMsg();
                                } else {
                                    var32_31 = 0;
                                    var8_8 /* !! */  = null;
                                }
                                var7_7.setText((CharSequence)var8_8 /* !! */ );
                            }
                        } else {
                            var7_7 = var2_2.j1;
                            if (var7_7 != null) {
                                var32_31 = 8;
                                var7_7.setVisibility(var32_31);
                            }
                        }
                        if ((var7_7 = this.cb().q) != null) {
                            var7_7 = var7_7.getPrice();
                        } else {
                            var42_41 = 0;
                            var7_7 = null;
                        }
                        var8_8 /* !! */  = "storeId";
                        if (var7_7 != null) {
                            var7_7 = this.cb().q;
                            Intrinsics.checkNotNull(var7_7);
                            var7_7 = var7_7.getPrice();
                            Intrinsics.checkNotNull(var7_7);
                            var7_7 = var7_7.getValue();
                            var16_15 = (int)TextUtils.isEmpty((CharSequence)var7_7);
                            if (var16_15 != 0) {
                                var7_7 = "0.0";
                            }
                            if ((var16_15 = (int)this.u7()) == 0) {
                                var9_9 = this.cb();
                                var16_15 = (int)var9_9.u();
                                if (var16_15 != 0) {
                                    var9_9 = this.ib();
                                    var11_11 = this.cb().q;
                                    if (var11_11 == null || (var18_17 = var11_11.getCode()) == null) {
                                        var18_17 = var35_34;
                                    }
                                    if ((var11_11 = this.cb().q) == null || (var11_11 = var11_11.getPrice()) == null || (var11_11 = var11_11.getValue()) == null) {
                                        var11_11 = "0f";
                                    }
                                    var11_11 = Float.valueOf((String)var11_11);
                                    var13_13 = this.o5();
                                    var9_9.getClass();
                                    Intrinsics.checkNotNullParameter(var18_17, "code");
                                    Intrinsics.checkNotNullParameter(var13_13, (String)var8_8 /* !! */ );
                                    var20_19 = new ProductExperience();
                                    var20_19.setProductId((String)var18_17);
                                    Intrinsics.checkNotNull(var11_11);
                                    var41_40 = var11_11.floatValue();
                                    var20_19.setSellingPrice(var41_40);
                                    var45_44 = System.currentTimeMillis();
                                    var20_19.setViewedMillis(var45_44);
                                    var11_11 = ld3_2.STORE_AJIO.getStoreId();
                                    var12_12 = (int)Intrinsics.areEqual(var13_13, var11_11);
                                    if (var12_12 != 0) {
                                        var11_11 = null;
                                        var20_19.setStoreType(0);
                                        var12_12 = 1;
                                        var41_40 = 1.4E-45f;
                                    } else {
                                        var11_11 = ld3_2.STORE_LUXE.getStoreId();
                                        var12_12 = (int)Intrinsics.areEqual(var13_13, var11_11);
                                        if (var12_12 != 0) {
                                            var12_12 = 1;
                                            var41_40 = 1.4E-45f;
                                            var20_19.setStoreType(var12_12);
                                        } else {
                                            var12_12 = 1;
                                            var41_40 = 1.4E-45f;
                                            var18_17 = ld3_2.STORE_AJIOGRAM.getStoreId();
                                            var19_18 = (int)Intrinsics.areEqual(var13_13, var18_17);
                                            if (var19_18 != 0) {
                                                var19_18 = 2;
                                                var20_19.setStoreType(var19_18);
                                            }
                                        }
                                    }
                                    var20_19.setExpType(var12_12);
                                    var11_11 = RecentlyViewedDaoHelper.INSTANCE;
                                    var19_18 = var20_19.getStoreType();
                                    var11_11.setStoreId(var19_18);
                                    var11_11 = md3_0.c((jD3)var9_9);
                                    var40_39 = false;
                                    var18_17 = null;
                                    var13_13 = new YC2((ProductExperience)var20_19, (ZC2)var9_9, null);
                                    var16_15 = 3;
                                    Ae3.d((i90_0)var11_11, null, null, (Function2)var13_13, var16_15);
                                } else {
                                    var9_9 = this.ib();
                                    var12_12 = this.hb();
                                    var9_9.b(var12_12);
                                }
                            }
                        } else {
                            var42_41 = (int)this.u7();
                            if (var42_41 == 0) {
                                var7_7 = this.ib();
                                var16_15 = this.hb();
                                var7_7.b(var16_15);
                            }
                            var7_7 = "0.0d";
                        }
                        if ((var16_15 = (int)this.u7()) != 0) break block189;
                        var9_9 = this.cb().C;
                        if (var9_9 != null) {
                            var19_18 = yx_2.o((Iterable)var9_9, var4_4);
                            var11_11 = new ArrayList(var19_18);
                            var9_9 = var9_9.iterator();
                            while ((var19_18 = (int)var9_9.hasNext()) != 0) {
                                var13_13 = ((ProductOptionVariant)var9_9.next()).clone();
                                var11_11.add(var13_13);
                            }
                        } else {
                            var12_12 = 0;
                            var41_40 = 0.0f;
                            var11_11 = null;
                        }
                        Intrinsics.checkNotNull(var11_11, "null cannot be cast to non-null type java.util.ArrayList<com.ril.ajio.services.data.Product.ProductOptionVariant>");
                        var2_2.s = var11_11;
                        var9_9 = this.cb().D;
                        var11_11 = var2_2.r;
                        if (var9_9 != null) {
                            var9_9 = var9_9.getCode();
                        } else {
                            var16_15 = 0;
                            var9_9 = null;
                        }
                        var13_13 = this.cb().q;
                        if (var13_13 != null) {
                            var13_13 = var13_13.getCode();
                        } else {
                            var19_18 = 0;
                            var13_13 = null;
                        }
                        var19_18 = (int)var11_11.containsKey(var13_13);
                        if (var19_18 != 0) {
                            var13_13 = this.cb().q;
                            if (var13_13 != null) {
                                var13_13 = var13_13.getCode();
                            } else {
                                var19_18 = 0;
                                var13_13 = null;
                            }
                            var18_17 = var11_11 = var11_11.get(var13_13);
                            var18_17 = (String)var11_11;
                            if (var18_17 == null) {
                                var18_17 = var35_34;
                            }
                            if ((var12_12 = var18_17.length()) > 0) {
                                var12_12 = 1;
                                var41_40 = 1.4E-45f;
                            } else {
                                var12_12 = 0;
                                var41_40 = 0.0f;
                                var11_11 = null;
                            }
                            if (var12_12 != 0) {
                                var9_9 = var18_17;
                            }
                        }
                        if (var9_9 != null && (var11_11 = var2_2.s) != null) {
                            var11_11 = var11_11.iterator();
                            while ((var19_18 = (int)var11_11.hasNext()) != 0) {
                                var13_13 = (ProductOptionVariant)var11_11.next();
                                var18_17 = var13_13.getCode();
                                var40_39 = Intrinsics.areEqual(var18_17, var9_9);
                                var13_13.setSelected(var40_39);
                            }
                        }
                        if ((var9_9 = var2_2.s) == null) ** GOTO lbl-1000
                        var9_9 = var9_9.iterator();
                        while ((var12_12 = (int)var9_9.hasNext()) != 0) {
                            var13_13 = var11_11 = var9_9.next();
                            var13_13 = (ProductOptionVariant)var11_11;
                            var19_18 = (int)var13_13.isSelected();
                            if (var19_18 == 0) continue;
                            break block179;
                        }
                        var12_12 = 0;
                        var41_40 = 0.0f;
                        var11_11 = null;
                    }
                    var11_11 = (ProductOptionVariant)var11_11;
                    if (var11_11 != null && (var9_9 = var11_11.getValue()) != null) {
                        var18_17 = var9_9;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var40_39 = false;
                        var18_17 = null;
                    }
                    if (var18_17 == null) {
                        var18_17 = var35_34;
                    }
                    var2_2.t = var18_17;
                    var9_9 = this.cb();
                    var11_11 = this.o5();
                    var9_9.getClass();
                    Intrinsics.checkNotNullParameter(var11_11, (String)var8_8 /* !! */ );
                    var32_31 = od3_2.c();
                    if (var32_31 != 0) {
                        var8_8 /* !! */  = z40_0.Companion;
                        var8_8 /* !! */  = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var8_8 /* !! */ ).a;
                        var9_9 = "pdp_similar_product_luxe";
                        var32_31 = (int)var8_8 /* !! */ .a((String)var9_9);
                    } else {
                        var32_31 = od3_2.b();
                        if (var32_31 == 0 && (var32_31 = (int)Intrinsics.areEqual(var11_11, var8_8 /* !! */  = ld3_2.STORE_AJIOGRAM.getStoreId())) == 0) {
                            var8_8 /* !! */  = z40_0.Companion;
                            var8_8 /* !! */  = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var8_8 /* !! */ ).a;
                            var9_9 = "pdp_similar_product_ajio";
                            var32_31 = (int)var8_8 /* !! */ .a((String)var9_9);
                        } else {
                            var8_8 /* !! */  = z40_0.Companion;
                            var8_8 /* !! */  = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var8_8 /* !! */ ).a;
                            var9_9 = "pdp_similar_product_ajiogram";
                            var32_31 = (int)var8_8 /* !! */ .a((String)var9_9);
                        }
                    }
                    if (var32_31 != 0 && (var8_8 /* !! */  = var2_2.Q) != null) {
                        var9_9 = this.cb().q;
                        var23_22 = var9_9 != null ? (var9_9 = var9_9.getCode()) : null;
                        this.cb().u();
                        var9_9 = h40_0.a;
                        var25_24 = h40_0.b2();
                        var9_9 = var2_2.t;
                        var11_11 = var2_2.u;
                        var47_45 = this.o5();
                        var48_46 = this.c7();
                        var49_47 = 72;
                        var50_48 = null;
                        var22_21 = var8_8 /* !! */ ;
                        var51_49 = var9_9;
                        var52_50 = var11_11;
                        r43_0.b((r43_0)var8_8 /* !! */ , (String)var23_22, var25_24, (String)var9_9, (zr1_1)var11_11, null, var47_45, var48_46, var49_47);
                    }
                }
                if ((var32_31 = (int)this.u7()) == 0) {
                    var8_8 /* !! */  = h40_0.a;
                    var8_8 /* !! */  = z40_0.Companion;
                    var8_8 /* !! */  = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var8_8 /* !! */ ).a;
                    var9_9 = "ABAjioPdpCrossCellWidgetEnable";
                    var32_31 = (int)var8_8 /* !! */ .a((String)var9_9);
                    if (var32_31 != 0 && (var32_31 = (int)Intrinsics.areEqual(var8_8 /* !! */  = this.o5(), var9_9 = ld3_2.STORE_AJIO.getStoreId())) != 0) {
                        var8_8 /* !! */  = this.cb();
                        var9_9 = this.cb().q;
                        if (var9_9 != null) {
                            var9_9 = var9_9.getCode();
                        } else {
                            var16_15 = 0;
                            var9_9 = null;
                        }
                        var11_11 = this.cb().q;
                        if (var11_11 != null) {
                            var11_11 = var11_11.getBrickCode();
                        } else {
                            var12_12 = 0;
                            var41_40 = 0.0f;
                            var11_11 = null;
                        }
                        var11_11 = String.valueOf(var11_11);
                        var8_8 /* !! */ .getClass();
                        Intrinsics.checkNotNullParameter(var11_11, "brick");
                        var13_13 = md3_0.c((jD3)var8_8 /* !! */ );
                        var17_16 = false;
                        var20_19 = null;
                        var18_17 = new a12_0((e12_0)var8_8 /* !! */ , (String)var9_9, (String)var11_11, null);
                        var32_31 = 3;
                        Ae3.d((i90_0)var13_13, null, null, (Function2)var18_17, var32_31);
                    }
                }
                if ((var32_31 = (int)this.u7()) != 0 || (var32_31 = (int)this.M1()) == 0) ** GOTO lbl-1000
                var8_8 /* !! */  = h40_0.a;
                var32_31 = (int)h40_0.n1();
                if (var32_31 == 0) ** GOTO lbl-1000
                var8_8 /* !! */  = this.cb();
                var9_9 = this.cb().q;
                if (var9_9 != null) {
                    var18_17 = var9_9.getBrickCode();
                } else {
                    var40_39 = false;
                    var18_17 = null;
                }
                var8_8 /* !! */ .getClass();
                if (var18_17 != null) {
                    var9_9 = new ProductListQuery();
                    var9_9.setCurrentPage(0);
                    var12_12 = 21;
                    var41_40 = 2.9E-44f;
                    var9_9.setPageSize(var12_12);
                    var9_9.setCategoryId((String)var18_17);
                    var11_11 = ld3_2.STORE_AJIOGRAM.getStoreId();
                    var9_9.setStoreId((String)var11_11);
                    var11_11 = (Boolean)var8_8 /* !! */ .e1.getValue();
                    var11_11.getClass();
                    var9_9.setUrgencyDriverEnabled((Boolean)var11_11);
                    z40_0.Companion.getClass();
                    var51_49 = z40$a.a((Context)var8_8 /* !! */ .a).a.b("plp_variant");
                    var19_18 = var9_9.getCurrentPage();
                    var5_5 = false;
                    var37_36 = null;
                    var11_11 = new PLPRequest(null, var19_18);
                    var25_24 = var8_8 /* !! */ .s().isUserOnline();
                    var52_50 = var8_8 /* !! */ .s().getCustomerUUID();
                    var47_45 = null;
                    var48_46 = true;
                    var13_13 = var8_8 /* !! */ .b;
                    var50_48 = null;
                    var22_21 = var13_13;
                    var23_22 = var9_9;
                    var9_9 = var13_13.getCategoryProduct((ProductListQuery)var9_9, var25_24, (String)var51_49, (String)var52_50, false, false, var48_46, (PLPRequest)var11_11);
                    var19_18 = 2;
                    var11_11 = new z8_0(var8_8 /* !! */ , var19_18);
                    var17_16 = true;
                    var18_17 = new zq_2((int)var17_16, (Function1)var11_11);
                    var11_11 = new b8_0(var8_8 /* !! */ , var19_18);
                    var13_13 = new aq_2((int)var17_16, (Function1)var11_11);
                    var9_9 = var9_9.f((o60_0)var18_17, (o60_0)var13_13);
                    var8_8 /* !! */  = var8_8 /* !! */ .e;
                    var8_8 /* !! */ .b((yr0_2)var9_9);
                } else lbl-1000:
                // 3 sources

                {
                    var5_5 = false;
                    var37_36 = null;
                }
                var8_8 /* !! */  = this.cb().q;
                if (var8_8 /* !! */  != null) {
                    var18_17 = var8_8 /* !! */ .getFnlColorVariantData();
                } else {
                    var40_39 = false;
                    var18_17 = null;
                }
                if (var18_17 == null) break block190;
                var8_8 /* !! */  = this.cb().q;
                if (var8_8 /* !! */  != null && (var8_8 /* !! */  = var8_8 /* !! */ .getFnlColorVariantData()) != null) {
                    var18_17 = var8_8 /* !! */ .getBrandName();
                } else {
                    var40_39 = false;
                    var18_17 = null;
                }
                if (var18_17 == null) break block190;
                var8_8 /* !! */  = this.cb().q;
                if (var8_8 /* !! */  == null || (var8_8 /* !! */  = var8_8 /* !! */ .getFnlColorVariantData()) == null) ** GOTO lbl-1000
                var18_17 = var8_8 /* !! */ .getBrandName();
                break block191;
            }
            if ((var8_8 /* !! */  = this.cb().q) != null) {
                var18_17 = var8_8 /* !! */ .getBrandName();
            } else {
                var40_39 = false;
                var18_17 = null;
            }
            if (var18_17 != null && (var8_8 /* !! */  = this.cb().q) != null) {
                var18_17 = var8_8 /* !! */ .getBrandName();
            } else lbl-1000:
            // 2 sources

            {
                var40_39 = false;
                var18_17 = null;
            }
        }
        var8_8 /* !! */  = this.cb().q;
        if (var8_8 /* !! */  != null) {
            var8_8 /* !! */  = this.cb().q;
            if (var8_8 /* !! */  != null) {
                var8_8 /* !! */  = var8_8 /* !! */ .getCode();
            } else {
                var32_31 = 0;
                var8_8 /* !! */  = null;
            }
            var32_31 = (int)TextUtils.isEmpty((CharSequence)var8_8 /* !! */ );
            if (var32_31 == 0) {
                var8_8 /* !! */  = AnalyticsManager.Companion.getInstance().getFb();
                var9_9 = new AnalyticsData$Builder();
                var11_11 = this.cb().q;
                if (var11_11 != null) {
                    var11_11 = var11_11.getCode();
                } else {
                    var12_12 = 0;
                    var11_11 = null;
                    var41_40 = 0.0f;
                }
                Intrinsics.checkNotNull(var11_11);
                var9_9 = var9_9.productCode((String)var11_11).setBrand((String)var18_17);
                var11_11 = this.cb().q;
                if (var11_11 != null) {
                    var18_17 = var11_11.getCatalog();
                } else {
                    var40_39 = false;
                    var18_17 = null;
                }
                var9_9 = var9_9.setCatalogId((String)var18_17);
                Intrinsics.checkNotNull(var7_7);
                var7_7 = var9_9.price((String)var7_7).build();
                var8_8 /* !! */ .contentView((AnalyticsData)var7_7);
            }
        }
        var42_41 = 0;
        var7_7 = null;
        var2_2.I0 = false;
        var32_31 = (int)var2_2.f1;
        if (var32_31 != 0) {
            var32_31 = (int)this.cb().u();
            var8_8 /* !! */  = (boolean)var32_31;
            var2_2.Kb((Boolean)var8_8 /* !! */ , false);
        } else {
            var32_31 = (int)this.cb().u();
            var8_8 /* !! */  = (boolean)var32_31;
            var2_2.Hb((Boolean)var8_8 /* !! */ , false);
        }
        var7_7 = var2_2.L;
        if (var7_7 != null && (var7_7 = var7_7.getAdapter()) != null) {
            var7_7.notifyDataSetChanged();
        }
        var7_7 = var2_2.H;
        var23_22 = var7_7.getEC_PRODUCT_DETAILS_INTERACTIONS();
        var8_8 /* !! */  = var2_2.n1;
        var9_9 = var2_2.o1;
        var24_23 = "select size view";
        var51_49 = "";
        var52_50 = "event_size_guide_interactions";
        var50_48 = "pdp screen";
        var47_45 = "pdp screen";
        var49_47 = 0;
        var53_51 = 1664;
        var22_21 = var7_7;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var7_7, (String)var23_22, (String)var24_23, (String)var51_49, (String)var52_50, var50_48, var47_45, (String)var8_8 /* !! */ , null, (String)var9_9, false, null, var53_51, null);
        var7_7 = var2_2.u0;
        if (var7_7 == null) {
            var7_7 = "sliderSizeView";
            Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
            var40_39 = false;
            var18_17 = null;
        } else {
            var18_17 = var7_7;
        }
        var7_7 = var2_2.v0;
        if (var7_7 == null) {
            var7_7 = "sliderSizeViewMainLayout";
            Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
            var17_16 = false;
            var20_19 = null;
        } else {
            var20_19 = var7_7;
        }
        var36_35 = true;
        var43_42 = var2_2.L;
        var7_7 = var39_38;
        var8_8 /* !! */  = this;
        var9_9 = this;
        var11_11 = this;
        var13_13 = this;
        var2_2.K0 = var39_38 = new O63(this, this, this, this, (View)var18_17, (LinearLayout)var20_19, var36_35, (RecyclerView)var43_42);
        var7_7 = var2_2.L0;
        var8_8 /* !! */  = this.cb().C;
        var16_15 = (int)var2_2.f1;
        var12_12 = 1;
        var41_40 = 1.4E-45f;
        var54_52 = var16_15 ^ 1;
        var55_53 = 24;
        O63.p((O63)var39_38, (LinearLayoutManager)var7_7, (ArrayList)var8_8 /* !! */ , var54_52, false, false, var55_53);
        var7_7 = var2_2.K0;
        if (var7_7 != null) {
            var8_8 /* !! */  = var2_2.k0;
            var7_7.l(var3_3, (ProductUserSizeRecomResponse)var8_8 /* !! */ );
        }
        if ((var42_41 = (int)this.u7()) == 0 && (var7_7 = var2_2.w0) != null) {
            var7_7.a();
        }
        this.Db();
        var42_41 = (int)mz3_0.E();
        if (var42_41 != 0) {
            this.Cb(var1_1);
            var7_7 = mz3_0.r();
            var8_8 /* !! */  = NewProductDetailsFragment.lb(la0_0.BRAND_VOICE, (ArrayList)var7_7);
            var16_15 = 1;
            var2_2.nb((la0_0)var8_8 /* !! */ , (ArrayList)var7_7, var3_3, (boolean)var16_15);
        } else {
            var42_41 = (int)this.vb();
            var8_8 /* !! */  = "<set-?>";
            if (var42_41 != 0) {
                var7_7 = la0_0.USER_VOICE;
                var2_2.y1 = var7_7;
                var9_9 = this.cb();
                var9_9.getClass();
                Intrinsics.checkNotNullParameter(var7_7, (String)var8_8 /* !! */ );
                var9_9.h1 = var7_7;
            } else {
                var7_7 = la0_0.BRAND_VOICE;
                var2_2.y1 = var7_7;
                var9_9 = this.cb();
                var9_9.getClass();
                Intrinsics.checkNotNullParameter(var7_7, (String)var8_8 /* !! */ );
                var9_9.h1 = var7_7;
            }
        }
        var42_41 = (int)var2_2.f1;
        if (var42_41 != 0) {
            this.rb();
        } else {
            var7_7 = cp_1.Companion;
            var7_7.getClass();
            cp$a.h();
            var42_41 = (int)cp$a.h();
            var32_31 = 1;
            var42_41 ^= var32_31;
            var9_9 = this.cb().d();
            var11_11 = "pdp_footer_coachmark_in_revamp";
            var19_18 = 0;
            var13_13 = null;
            var16_15 = var9_9.getPreference((String)var11_11, false);
            if ((var32_31 ^= var16_15) != 0 && var42_41 != 0) {
                var39_38 = this.requireActivity();
                var7_7 = var2_2.J;
                if (var7_7 == null) {
                    var7_7 = "addToCloset";
                    Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
                    var10_10 = null;
                } else {
                    var10_10 = var7_7;
                }
                var44_43 = R$color.color_2c4152;
                var33_32 = R$string.wishlist_for_later;
                var28_27 = R$string.pdp_revamp_coachmark_desc;
                var7_7 = FontsManager.getInstance();
                AJIOApplication.Companion.getClass();
                var8_8 /* !! */  = AJIOApplication$a.a();
                var30_29 = var7_7.getTypefaceWithFont((Context)var8_8 /* !! */ , var4_4);
                var7_7 = FontsManager.getInstance();
                var8_8 /* !! */  = AJIOApplication$a.a();
                var16_15 = 9;
                var26_25 = var7_7.getTypefaceWithFont((Context)var8_8 /* !! */ , var16_15);
                var7_7 = new NewProductDetailsFragment$h(var2_2);
                var56_54 = 100;
                var27_26 = var7_7;
                iw_2.a((FragmentActivity)var39_38, (View)var10_10, var44_43, var33_32, var28_27, var56_54, var30_29, var26_25, (TapTargetView$Listener)var7_7);
            }
        }
    }

    public final Component Q() {
        return this.w1;
    }

    public final void Q0() {
        int n3;
        int n4 = 0;
        this.p = false;
        Object object = this.L;
        Object object2 = null;
        if (object != null) {
            object = ((RecyclerView)object).getAdapter();
        } else {
            n3 = 0;
            object = null;
        }
        int n7 = object instanceof RecyclerView$f;
        if (n7 != 0) {
            object2 = object;
        }
        if (object2 == null) {
            return;
        }
        n3 = ((RecyclerView$f)object2).getItemCount();
        while (n4 < n3) {
            int n8;
            n7 = ((RecyclerView$f)object2).getItemViewType(n4);
            if (n7 == (n8 = 9)) {
                object = this.L;
                if (object == null) break;
                ((RecyclerView)object).smoothScrollToPosition(n4);
                break;
            }
            ++n4;
        }
    }

    public final int Q2() {
        return this.Z;
    }

    public final void Q6(EddResult eddResult) {
        boolean bl2 = h40_0.Q1();
        if (bl2) {
            CartAddressListBottomSheet cartAddressListBottomSheet = this.G1;
            if (cartAddressListBottomSheet != null) {
                cartAddressListBottomSheet.dismissAllowingStateLoss();
            }
            this.Nb(eddResult);
        } else {
            this.Nb(eddResult);
        }
    }

    public final void Qa() {
        Object object = this.mb();
        boolean bl2 = ((hy3_0)object).p();
        int n3 = 1;
        Object object2 = null;
        if (!bl2) {
            object = AnonymousToken.getAccessToken();
            bl2 = TextUtils.isEmpty((CharSequence)object);
            if (bl2) {
                object = this.B;
                if (object == null) {
                    object = "loginViewModel";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    object2 = object;
                }
                ((oa1_1)object2).j("pdp screen");
                return;
            }
            bl2 = ap_0.c();
            if (bl2) {
                object = this.cb().E;
                if (object != null) {
                    object = this.cb().E;
                    Intrinsics.checkNotNull(object);
                    object = ((ProductOptionVariant)object).getCode();
                    if (object != null) {
                        this.Sb();
                        object = this.cb();
                        Object object3 = this.cb().E;
                        Intrinsics.checkNotNull(object3);
                        object3 = ((ProductOptionVariant)object3).getCode();
                        Intrinsics.checkNotNull(object3);
                        Object object4 = this.cb().E;
                        object4 = object4 != null ? ((ProductOptionVariant)object4).getCommercialType() : null;
                        Object object5 = this.cb().E;
                        if (object5 != null) {
                            object2 = ((ProductOptionVariant)object5).getBatchID();
                        }
                        object5 = this.o5();
                        ((e12_0)object).b((String)object3, (String)object4, (String)object2, (String)object5);
                    }
                }
            } else {
                object = new Message();
                ((Message)object).arg1 = n3;
                this.ab((Message)object);
            }
        } else {
            bl2 = ap_0.b();
            if (bl2) {
                object = this.cb().E;
                if (object != null) {
                    object = this.cb().E;
                    Intrinsics.checkNotNull(object);
                    object = ((ProductOptionVariant)object).getCode();
                    if (object != null) {
                        this.Sb();
                        object = this.cb();
                        Object object6 = this.cb().E;
                        Intrinsics.checkNotNull(object6);
                        object6 = ((ProductOptionVariant)object6).getCode();
                        Intrinsics.checkNotNull(object6);
                        Object object7 = this.cb().E;
                        object7 = object7 != null ? ((ProductOptionVariant)object7).getCommercialType() : null;
                        Object object8 = this.cb().E;
                        if (object8 != null) {
                            object2 = ((ProductOptionVariant)object8).getBatchID();
                        }
                        object8 = this.o5();
                        ((e12_0)object).b((String)object6, (String)object7, (String)object2, (String)object8);
                    }
                }
            } else {
                object = new Message();
                ((Message)object).arg1 = n3;
                this.Za((Message)object);
            }
        }
    }

    public final void Qb(ArrayList object) {
        int n3;
        int n4 = 1;
        Object object2 = z40_0.Companion;
        object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
        String string2 = "price_drop_min_value";
        long l2 = ((ao0_0)object2).h(string2);
        if (object != null && (n3 = object.isEmpty() ^ n4) == n4) {
            int n7;
            Serializable serializable;
            block11: {
                this.M0 = object;
                ArrayList arrayList = this.N0;
                if (arrayList != null) {
                    arrayList.clear();
                }
                object = object.iterator();
                int n8 = 0;
                PlpProductUIModel plpProductUIModel = null;
                while (true) {
                    boolean bl2 = object.hasNext();
                    serializable = null;
                    if (!bl2) break block11;
                    Object object3 = object.next();
                    int n10 = n8 + 1;
                    if (n8 < 0) break;
                    object3 = (Product)object3;
                    serializable = n00.a;
                    serializable = Long.valueOf(l2);
                    int n14 = 456;
                    plpProductUIModel = n00.e(object3, n8, false, (Long)serializable, n14);
                    if (arrayList != null) {
                        arrayList.add(plpProductUIModel);
                    }
                    n8 = n10;
                }
                xx_2.n();
                throw null;
            }
            object = this.L;
            if (object != null) {
                object = ((RecyclerView)object).getAdapter();
            } else {
                n7 = 0;
                object = null;
            }
            n4 = object instanceof yh2_1;
            if (n4 != 0) {
                object = (yh2_1)object;
            } else {
                n7 = 0;
                object = null;
            }
            if (object != null) {
                n4 = 29;
                serializable = ((yh2_1)object).g(n4);
            }
            if (serializable != null) {
                n7 = ((Number)serializable).intValue();
                Object object4 = this.L;
                if (object4 != null && (object4 = ((RecyclerView)object4).getAdapter()) != null) {
                    ((RecyclerView$f)object4).notifyItemChanged(n7);
                }
            }
        }
    }

    public final void R() {
        this.Ra();
    }

    public final ArrayList R2() {
        return this.Q0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void R3() {
        var1_1 = this;
        var2_2 = false;
        this.p = false;
        var3_3 = this.cb().q;
        var4_4 = null;
        if (var3_3 != null) {
            var3_3 = var3_3.getPrice();
        } else {
            var2_2 = false;
            var3_3 = null;
        }
        var5_5 = this.cb().q;
        if (var5_5 != null) {
            var5_5 = var5_5.getWasPriceData();
        } else {
            var6_6 = false;
            var5_5 = null;
        }
        var3_3 = qz2_0.g((Price)var3_3, (Price)var5_5);
        var6_6 = hv3_0.Y();
        var7_7 = "";
        if (!var6_6) ** GOTO lbl-1000
        var5_5 = this.cb().q;
        if (var5_5 != null) {
            var5_5 = var5_5.getSelectedSizeVariant();
        } else {
            var6_6 = false;
            var5_5 = null;
        }
        if (var5_5 != null) {
            var5_5 = Y63.c((ProductOptionVariant)var5_5);
        } else lbl-1000:
        // 2 sources

        {
            var5_5 = var7_7;
        }
        var8_8 = this.cb().q;
        Intrinsics.checkNotNull(var8_8);
        var8_8 = hv3_0.n((Product)var8_8);
        var9_9 = new Bundle();
        var10_10 = var1_1.H;
        var11_11 = var10_10.getPRODUCT_NAME();
        var12_12 = this.cb().q;
        if (var12_12 == null || (var12_12 = var12_12.getName()) == null) {
            var12_12 = var7_7;
        }
        var9_9.putString(var11_11, (String)var12_12);
        var11_11 = var10_10.getPRODUCT_ID();
        var12_12 = this.cb().q;
        if (var12_12 == null || (var12_12 = var12_12.getCode()) == null) {
            var12_12 = var7_7;
        }
        var9_9.putString(var11_11, (String)var12_12);
        var11_11 = var10_10.getPRODUCT_BRAND();
        var12_12 = this.cb().q;
        if (var12_12 == null || (var12_12 = var12_12.getBrandName()) == null) {
            var12_12 = var7_7;
        }
        var9_9.putString(var11_11, (String)var12_12);
        var11_11 = var10_10.getPRODUCT_PRICE();
        var12_12 = this.cb().q;
        if (var12_12 == null || (var12_12 = var12_12.getPrice()) == null || (var12_12 = var12_12.getValue()) == null) {
            var12_12 = var7_7;
        }
        var9_9.putString(var11_11, (String)var12_12);
        var11_11 = var10_10.getPRODUCT_COLOR();
        var9_9.putString(var11_11, (String)var8_8);
        var8_8 = var10_10.getPRODUCT_SIZE();
        var9_9.putString((String)var8_8, (String)var5_5);
        var5_5 = var10_10.getPRODUCT_DISCOUNT();
        var9_9.putString((String)var5_5, (String)var3_3);
        var3_3 = var10_10.getPRODUCT_CATEGORY();
        var5_5 = this.cb().q;
        if (var5_5 != null) {
            var5_5 = var5_5.getBrickCategory();
        } else {
            var6_6 = false;
            var5_5 = null;
        }
        var9_9.putString((String)var3_3, (String)var5_5);
        var3_3 = var10_10.getPRODUCT_BRICK();
        var5_5 = this.cb().q;
        if (var5_5 != null) {
            var5_5 = var5_5.getBrickCategory();
        } else {
            var6_6 = false;
            var5_5 = null;
        }
        var9_9.putString((String)var3_3, (String)var5_5);
        var3_3 = var10_10.getPRODUCT_MRP();
        var5_5 = this.cb().q;
        if (var5_5 != null && (var5_5 = var5_5.getPrice()) != null) {
            var5_5 = var5_5.getValue();
        } else {
            var6_6 = false;
            var5_5 = null;
        }
        var9_9.putString((String)var3_3, (String)var5_5);
        var3_3 = var10_10.getPRODUCT_TAG();
        var5_5 = hv3_0.a;
        var8_8 = this.cb().q;
        if (var8_8 != null) {
            var8_8 = var8_8.getFnlColorVariantData();
        } else {
            var8_8 = null;
            var13_13 = 0.0f;
        }
        var5_5.getClass();
        var5_5 = hv3_0.A((ProductFnlColorVariantData)var8_8);
        var6_6 = TextUtils.isEmpty((CharSequence)var5_5);
        if (!var6_6) {
            var5_5 = this.cb().q;
            if (var5_5 != null) {
                var5_5 = var5_5.getFnlColorVariantData();
            } else {
                var6_6 = false;
                var5_5 = null;
            }
            var7_7 = hv3_0.A((ProductFnlColorVariantData)var5_5);
        }
        var9_9.putString((String)var3_3, (String)var7_7);
        var3_3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        var5_5 = "pdp screen";
        var7_7 = "referral card clicked";
        var8_8 = "referral widget";
        var3_3.pushButtonTapEvent((String)var7_7, var8_8, (String)var5_5);
        var11_11 = var10_10.getEC_WIDGET_INTERACTION();
        var14_14 = var1_1.n1;
        var15_15 = var1_1.o1;
        var12_12 = "widget click";
        var16_16 = "referral widget";
        var17_17 = "widget_click";
        var18_18 = "pdp screen";
        var19_19 = "pdp screen";
        var20_20 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default(var10_10, var11_11, (String)var12_12, var16_16, var17_17, var18_18, var19_19, var14_14, var9_9, var15_15, false, null, var20_20, null);
        var3_3 = this.mb();
        var2_2 = var3_3.p();
        var6_6 = true;
        if (var2_2 == var6_6) {
            var3_3 = var1_1.h;
            var7_7 = "activityFragmentListener";
            if (var3_3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
                var2_2 = false;
                var3_3 = null;
            }
            if ((var8_8 = var1_1.h) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
            } else {
                var4_4 = var8_8;
            }
            var4_4 = var4_4.y();
            var7_7 = gg2_1.Companion;
            var13_13 = var1_1.i1;
            var21_21 = var1_1.h1;
            var7_7.getClass();
            var7_7 = GG2$a.a(var13_13, var21_21);
            var8_8 = "ReferralFragment";
            j3$a.a((j3_0)var3_3, (Fragment)var4_4, (Fragment)var7_7, var6_6, (String)var8_8);
        } else {
            var3_3 = var1_1.m;
            if (var3_3 == null) {
                var3_3 = "loginListener";
                Intrinsics.throwUninitializedPropertyAccessException((String)var3_3);
            } else {
                var4_4 = var3_3;
            }
            var3_3 = "source - referral";
            var6_6 = 52 != 0;
            var4_4.z0((int)var6_6, (String)var3_3);
        }
    }

    public final String R5() {
        return this.cb().Q;
    }

    public final RatingsResponse R6() {
        Object object = this.cb().q;
        object = object != null ? ((Product)object).getRatingsResponse() : null;
        return object;
    }

    public final void R8(Boolean object) {
        int n3 = gz3.a;
        int n4 = 23;
        if (n3 > n4) {
            int n7;
            boolean bl2;
            if (object != null) {
                bl2 = (Boolean)object;
            } else {
                bl2 = false;
                object = null;
            }
            Object object2 = this.n;
            n4 = 0;
            Object object3 = null;
            String string2 = "ajioVideoPlayer";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object2 = null;
            }
            ((ma_2)object2).j(1, bl2);
            object = this.L;
            object2 = new Object();
            ((bb3_1)object2).a = object;
            ((bb3_1)object2).d = -1;
            ((bb3_1)object2).h = n7 = 40;
            if (object != null) {
                ab3_1 ab3_12 = new ab3_1((bb3_1)object2);
                ((RecyclerView)object).addOnScrollListener(ab3_12);
            }
            if ((object = this.n) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object;
            }
            object3.getClass();
            object = "videoAutoPlayHelper";
            Intrinsics.checkNotNullParameter(object2, (String)object);
            ((ma_2)object3).t = object2;
        }
    }

    public final void Ra() {
        e12_0 e12_02 = null;
        this.p = false;
        Object object = this.mb();
        boolean bl2 = ((hy3_0)object).p();
        if (!bl2) {
            this.p = false;
            e12_02 = null;
            this.Tb(null);
        } else {
            this.Ub();
            e12_02 = this.cb();
            object = this.o5();
            e12_02.z((String)object);
        }
    }

    public final void Rb(ArrayList object) {
        Object object2;
        Object object3;
        Object object4;
        boolean bl2;
        Object object5;
        int n3;
        int n4;
        Object object6;
        int n7;
        int n8;
        int n10 = 1;
        Set set = null;
        if (object != null) {
            n8 = ((ArrayList)object).size();
            if (n8 >= (n7 = 16) && (object6 = ((ArrayList)object).subList(n7, n8 = ((ArrayList)object).size())) != null) {
                object6.clear();
            }
            object6 = object;
        } else {
            n8 = 0;
            object6 = null;
        }
        this.O0 = object6;
        object6 = this.cb();
        n7 = 0;
        if (object != null && (n4 = object.isEmpty() ^ n10) == n10) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        ((e12_0)object6).o = n4;
        object = this.cb();
        n4 = ((e12_0)object).o;
        if (n4 == 0 && (n4 = this.c7()) != 0) {
            object = this.cb();
            object6 = new Object();
            ((Random)object6).nextInt();
            object.getClass();
            object = this.r;
            n4 = object.isEmpty();
            if (n4 == 0) {
                object = this.cb();
                ((e12_0)object).o = n10;
            }
        }
        if ((object = this.P0) != null) {
            ((ArrayList)object).clear();
        }
        if ((object6 = this.O0) != null) {
            object6 = object6.iterator();
            n3 = 0;
            object5 = null;
            while (bl2 = object6.hasNext()) {
                object4 = object6.next();
                int n14 = n3 + 1;
                if (n3 >= 0) {
                    object4 = (Product)object4;
                    object3 = n00.a;
                    object3 = this.jb().f;
                    object2 = "Similar Products";
                    boolean bl3 = true;
                    int n15 = 4;
                    object4 = n00.c(object4, n3, (Boolean)object3, (String)object2, bl3, n15);
                    if (object != null) {
                        ((ArrayList)object).add(object4);
                    }
                    n3 = n14;
                    continue;
                }
                xx_2.n();
                throw null;
            }
        }
        if ((object = this.L) != null) {
            object = ((RecyclerView)object).getAdapter();
        } else {
            n4 = 0;
            object = null;
        }
        n8 = object instanceof yh2_1;
        if (n8) {
            set = object;
            set = (yh2_1)object;
        }
        if (set != null) {
            object = ((yh2_1)((Object)set)).b;
            object6 = object.A5();
            if (object6 != null) {
                cp_1.Companion.getClass();
                object6 = cp$a.e();
                object4 = object.S5();
                n3 = (int)(object.c9() ? 1 : 0);
                object3 = object.a4();
                object6.getClass();
                n8 = (int)(((yh2_1)((Object)set)).z ? 1 : 0);
                object6 = cp_1.u(object4, n3 != 0, (String)object3, n8 != 0);
                bl2 = object.c9();
                if (!bl2) {
                    object4 = new LinkedHashMap();
                    object6 = ((LinkedHashMap)object6).entrySet().iterator();
                    while ((n3 = object6.hasNext()) != 0) {
                        object5 = object6.next();
                        object3 = (String)object5.getKey();
                        object5 = (Number)object5.getValue();
                        n3 = ((Number)object5).intValue();
                        object2 = "SIMILAR_VIEW_MODEL_PRODUCT";
                        int n16 = Intrinsics.areEqual(object3, object2);
                        if (n16 != 0) {
                            object3 = object.A5();
                            if (object3 == null) continue;
                            int n17 = ((ArrayList)object3).size();
                            object2 = null;
                            for (n16 = 0; n16 < n17; n16 += n10) {
                                Serializable serializable;
                                Object object7 = object.A5();
                                if (object7 != null) {
                                    serializable = ((yh2_1)((Object)set)).A;
                                    Integer n18 = n3;
                                    object7 = ((ArrayList)object7).get(n16);
                                    ((HashMap)serializable).put(n18, object7);
                                }
                                object7 = hj0_0.a(n16, "SIMILAR_VIEW_MODEL_PRODUCT ");
                                serializable = Integer.valueOf(n3);
                                object4.put(object7, serializable);
                                n3 += n10;
                            }
                            continue;
                        }
                        while ((n16 = ((LinkedHashMap)object4).containsValue(object2 = Integer.valueOf(n3))) != 0) {
                            n3 += n10;
                        }
                        object5 = n3;
                        object4.put(object3, object5);
                    }
                    object = CollectionsKt.k0(((LinkedHashMap)object4).entrySet());
                    String string2 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.MutableMap.MutableEntry<kotlin.String, kotlin.Int>>";
                    Intrinsics.checkNotNull(object, string2);
                    ((yh2_1)((Object)set)).D = object;
                } else {
                    object = ((HashMap)object6).entrySet();
                    String string3 = "<get-entries>(...)";
                    Intrinsics.checkNotNullExpressionValue(object, string3);
                    object = CollectionsKt.k0((Iterable)object);
                    ((yh2_1)((Object)set)).D = object;
                }
                ((RecyclerView$f)((Object)set)).notifyDataSetChanged();
            } else {
                ((RecyclerView$f)((Object)set)).notifyDataSetChanged();
            }
        }
    }

    public final la0_0 S0() {
        return this.y1;
    }

    public final boolean S5() {
        return this.cb().u();
    }

    public final void Sa() {
        cs0_2 cs0_22;
        Object object;
        ea2_1 ea2_12;
        Object object2 = this;
        boolean bl2 = NewProductDetailsFragment.ub();
        Object object3 = new uh2_0(this, bl2);
        Object object4 = this.g;
        if (object4 == null) {
            object4 = "productDetailListener";
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            ea2_12 = null;
        } else {
            ea2_12 = object4;
        }
        object4 = ((NewProductDetailsFragment)object2).n;
        if (object4 == null) {
            object4 = "ajioVideoPlayer";
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            object = null;
        } else {
            object = object4;
        }
        zr1_1 zr1_12 = ((NewProductDetailsFragment)object2).v;
        mu1_1 mu1_12 = this.getViewLifecycleOwner();
        NewProductDetailsFragment$d newProductDetailsFragment$d = ((NewProductDetailsFragment)object2).P1;
        object4 = cs0_22;
        Object object5 = this;
        Object object6 = this;
        yh2_1 yh2_12 = cs0_22;
        cs0_22 = this;
        Object object7 = object3;
        object3 = this;
        object2 = object7;
        object7 = this;
        ((yh2_1)object4)(this, this, this, this, this, this, this, this, this, ea2_12, this, this, this, newProductDetailsFragment$d, (uh2_0)object2, (ma_2)object, this, this, this, this, this, zr1_12, mu1_12);
        object4 = this;
        object5 = yh2_12;
        this.M1 = yh2_12;
        object6 = this.requireActivity();
        int n3 = 2;
        int n4 = 1;
        this.P = object5 = new GridLayoutManager((Context)object6, n3, n4, false);
        object6 = new NewProductDetailsFragment$b(this);
        ((GridLayoutManager)object5).setSpanSizeLookup((GridLayoutManager$b)object6);
        object5 = this.L;
        if (object5 != null) {
            object6 = this.P;
            ((RecyclerView)object5).setLayoutManager((RecyclerView$o)object6);
        }
        if ((object5 = ((NewProductDetailsFragment)object4).L) != null) {
            object6 = ((NewProductDetailsFragment)object4).M1;
            ((RecyclerView)object5).setAdapter((RecyclerView$f)object6);
        }
        if ((object5 = ((NewProductDetailsFragment)object4).L) != null) {
            object6 = null;
            ((RecyclerView)object5).setItemAnimator(null);
        }
    }

    public final void Sb() {
        boolean bl2;
        Object object = this.getActivity();
        if (object != null && !(bl2 = (object = this.requireActivity()).isFinishing())) {
            Timer timer;
            object = this.M;
            if (object != null) {
                object.i();
            }
            bl2 = true;
            this.C0 = (int)(bl2 ? 1 : 0);
            ImageView imageView = this.B0;
            Intrinsics.checkNotNull(imageView);
            imageView.setVisibility(8);
            NewProductDetailsFragment$setTimer$task$1 newProductDetailsFragment$setTimer$task$1 = new NewProductDetailsFragment$setTimer$task$1(this);
            this.Ta();
            this.E0 = timer = new Timer();
            long l2 = 0L;
            long l3 = 300L;
            timer.scheduleAtFixedRate((TimerTask)newProductDetailsFragment$setTimer$task$1, l2, l3);
            imageView = this.A0;
            Intrinsics.checkNotNull(imageView);
            imageView.setClickable(false);
            this.X = bl2;
        }
    }

    public final void T2() {
        o12_0 o12_02;
        boolean bl2;
        this.H1 = false;
        this.I1 = bl2 = true;
        this.F1 = o12_02 = new o12_0();
        Object object = this.db();
        Object object2 = this.cb().q;
        String string2 = this.o5();
        o12_02.Qa((Product)object2, (String)object, string2);
        o12_02 = this.F1;
        if (o12_02 != null) {
            object = this.getChildFragmentManager();
            object2 = "EnterPincodeFragment";
            o12_02.show((FragmentManager)object, (String)object2);
        }
    }

    public final String T4() {
        return this.cb().t;
    }

    public final void T8() {
        int n3;
        Object object = new Bundle();
        Object object2 = this.cb().q;
        String string2 = null;
        if (object2 != null) {
            object2 = ((Product)object2).getCode();
        } else {
            n3 = 0;
            object2 = null;
        }
        Object object3 = "product_id";
        object.putString((String)object3, (String)object2);
        object2 = this.cb().q;
        if (object2 != null && (object2 = ((Product)object2).getWasPriceData()) != null) {
            object2 = ((Price)object2).getValue();
        } else {
            n3 = 0;
            object2 = null;
        }
        object3 = "product_price";
        object.putString((String)object3, (String)object2);
        object2 = this.cb().q;
        if (object2 != null) {
            object2 = ((Product)object2).getPrice();
        } else {
            n3 = 0;
            object2 = null;
        }
        object3 = this.cb().q;
        object3 = object3 != null ? ((Product)object3).getWasPriceData() : null;
        object2 = qz2_0.g((Price)object2, (Price)object3);
        object3 = "product_discount";
        object.putString((String)object3, (String)object2);
        object2 = this.cb().q;
        if (object2 != null && (object2 = ((Product)object2).getPrice()) != null) {
            object2 = ((Price)object2).getValue();
        } else {
            n3 = 0;
            object2 = null;
        }
        object3 = "product_selling_price";
        object.putString((String)object3, (String)object2);
        object2 = this.cb().v0;
        if (object2 != null) {
            n3 = ((ArrayList)object2).size();
            object2 = n3;
        } else {
            n3 = 0;
            object2 = null;
        }
        object2 = String.valueOf(object2);
        object.putString("product_no_variant", (String)object2);
        object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object2 = this.cb().q;
        if (object2 != null) {
            string2 = ((Product)object2).getCode();
        }
        AnalyticsData analyticsData = ne_0.b((Bundle)object);
        GTMEvents.pushButtonTapEvent$default((GTMEvents)object3, "color swatch click", string2, "pdp screen", analyticsData, null, 16, null);
        object = new nz1_2();
        object2 = this.getChildFragmentManager();
        ((DialogFragment)object).show((FragmentManager)object2, "ShowColorFragment");
    }

    public final void Ta() {
        Timer timer = this.E0;
        if (timer != null) {
            Intrinsics.checkNotNull(timer);
            timer.purge();
            timer = this.E0;
            Intrinsics.checkNotNull(timer);
            timer.cancel();
            timer = null;
            this.E0 = null;
        }
    }

    public final void Tb(String string2) {
        boolean bl2 = false;
        this.p = false;
        Object object = this.getActivity();
        if (object != null && !(bl2 = (object = this.requireActivity()).isFinishing()) && (object = this.getActivity()) != null && !(bl2 = (object = this.requireActivity()).isFinishing())) {
            object = "notifyme";
            bl2 = Intrinsics.areEqual(string2, object);
            String string3 = "";
            String string4 = "requireActivity(...)";
            if (bl2) {
                object = this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(object, string4);
                int n3 = 72;
                at2_1.g(n3, (Activity)object, string3, string2);
            } else {
                object = this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(object, string4);
                if (string2 == null) {
                    string2 = "source - add to closet";
                }
                int n4 = 53;
                at2_1.g(n4, (Activity)object, string3, string2);
            }
        }
    }

    public final String U2() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.b("trustMarker_config_data");
    }

    public final void U3(String string2, ProductOptionVariant object) {
        Intrinsics.checkNotNullParameter(string2, "size");
        Intrinsics.checkNotNullParameter(object, "optionVariant");
        zr1_1 zr1_12 = this.u;
        Object object2 = this.r;
        Object object3 = this.cb().q;
        Object object4 = null;
        object3 = object3 != null ? ((Product)object3).getCode() : null;
        if (object3 != null && (object3 = ((ProductOptionVariant)object).getCode()) != null) {
            object3 = this.cb().q;
            object3 = object3 != null ? ((Product)object3).getCode() : null;
            Intrinsics.checkNotNull(object3);
            String string3 = ((ProductOptionVariant)object).getCode();
            Intrinsics.checkNotNull(string3);
            object2.put(object3, string3);
        }
        object2 = this.cb();
        ((e12_0)object2).D = object;
        object3 = this.Q;
        if (object3 != null) {
            object = this.cb().q;
            if (object != null) {
                object4 = object = ((Product)object).getCode();
            }
            this.cb().u();
            object = h40_0.a;
            boolean bl2 = h40_0.b2();
            String string4 = this.o5();
            boolean bl3 = this.c7();
            int n3 = 72;
            r43_0.b((r43_0)object3, (String)object4, bl2, string2, zr1_12, null, string4, bl3, n3);
        }
    }

    public final void U7(boolean bl2) {
        this.X0 = bl2;
        String.valueOf(bl2);
    }

    public final SectionData U8() {
        Object object = this.cb();
        object.getClass();
        SectionData sectionData = new SectionData();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object2 = ((e12_0)object).q;
        if (object2 == null) {
            sectionData.setFeatureData(arrayList);
        } else if ((object2 = ((Product)object2).getSectionThree()) != null) {
            int n3;
            Object object3;
            int n4;
            int n7;
            Collection collection = ((SectionData)object2).getFeatureData();
            boolean bl2 = false;
            Object object4 = null;
            if (collection != null) {
                collection = ((SectionData)object2).getFeatureData();
                if (collection != null) {
                    n7 = collection.size();
                } else {
                    n7 = 0;
                    collection = null;
                }
                if (n7 > 0) {
                    collection = ((SectionData)object2).getFeatureData();
                    Intrinsics.checkNotNull(collection);
                    collection = collection;
                    n7 = collection.size();
                    for (n4 = 0; n4 < n7; ++n4) {
                        object3 = ((SectionData)object2).getFeatureData();
                        Intrinsics.checkNotNull(object3);
                        object3 = (FeatureData)object3.get(n4);
                        arrayList.add(object3);
                    }
                }
            }
            sectionData.setFeatureData(arrayList);
            object2 = ((e12_0)object).q;
            n7 = 0;
            collection = null;
            if (object2 != null) {
                object2 = ((Product)object2).getCode();
            } else {
                n3 = 0;
                object2 = null;
            }
            n4 = 1;
            if (object2 != null && (n3 = ((String)object2).length()) != 0) {
                n3 = 0;
                object2 = null;
            } else {
                n3 = 1;
            }
            if (n3 == 0) {
                int n8;
                cp_1.Companion.getClass();
                object2 = cp$a.c();
                object3 = ((e12_0)object).q;
                if (object3 != null) {
                    object3 = ((Product)object3).getBrickCode();
                } else {
                    n8 = 0;
                    object3 = null;
                }
                n3 = (int)(ai0_2.d((String)object3, (JSONArray)object2) ? 1 : 0);
                if (n3 == 0) {
                    object2 = new FeatureData();
                    n8 = R$string.product_code;
                    object3 = hv3_0.K(n8);
                    ((FeatureData)object2).setName((String)object3);
                    object3 = ((e12_0)object).q;
                    if (object3 == null || (object3 = ((Product)object3).getCode()) == null) {
                        object3 = "";
                    }
                    ((FeatureData)object2).setValue((String)object3);
                    arrayList.add(object2);
                }
            }
            if ((object2 = ((e12_0)object).L) == null || (n3 = ((String)object2).length()) == 0) {
                bl2 = true;
            }
            if (!bl2) {
                cp_1.Companion.getClass();
                object2 = cp$a.c();
                object4 = ((e12_0)object).q;
                if (object4 != null) {
                    object4 = ((Product)object4).getBrickCode();
                } else {
                    bl2 = false;
                    object4 = null;
                }
                n3 = (int)(ai0_2.d((String)object4, (JSONArray)object2) ? 1 : 0);
                if (n3 == 0) {
                    object2 = new FeatureData();
                    ((FeatureData)object2).setName(null);
                    object = ((e12_0)object).L;
                    ((FeatureData)object2).setValue((String)object);
                    arrayList.add(object2);
                }
            }
        }
        return sectionData;
    }

    public final void Ua(String string2) {
        Object object = this.cb();
        object.getClass();
        object = md3_0.c((jD3)object);
        y02_0 y02_02 = new y02_0(string2, null);
        Ae3.d((i90_0)object, null, null, y02_02, 3);
    }

    public final void Ub() {
        j3_0 j3_02 = this.h;
        if (j3_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
            j3_02 = null;
        }
        j3_02.startLoader();
    }

    public final void V2(Integer object) {
        this.p = false;
        Object object2 = this.mb();
        boolean n3 = ((hy3_0)object2).p();
        Object object3 = null;
        if (!n3) {
            object2 = this.cb().Y;
            int n4 = object != null ? (Integer)object : -1;
            object = n4;
            ((LiveData)object2).k(object);
            object = this.m;
            if (object == null) {
                object = "loginListener";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object3 = object;
            }
            object = "source - reviews";
            int n7 = 67;
            object3.z0(n7, (String)object);
        } else {
            ((yh0_0)this.v1.getValue()).f((Integer)object);
            object2 = LD2.a;
            object = String.valueOf(object);
            object2 = this.cb().q;
            if (object2 != null) {
                object2 = ((Product)object2).getCode();
            } else {
                boolean bl2 = false;
                object2 = null;
            }
            Object object4 = this.cb().q;
            object4 = object4 != null ? ((Product)object4).getName() : null;
            Object object5 = this.cb().q;
            if (object5 != null) {
                object3 = ((Product)object5).getBrickCode();
            }
            object5 = "Mark as helpful";
            LD2.c((String)object5, (String)object, (String)object2, (String)object4, (String)object3);
        }
    }

    public final void V3(String string2) {
        Intrinsics.checkNotNullParameter(string2, "s");
        this.p = false;
        ea2_1 ea2_12 = this.g;
        if (ea2_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productDetailListener");
            ea2_12 = null;
        }
        ea2_12.F(string2);
    }

    public final EddResult V4() {
        return this.q0;
    }

    public final void V5() {
        this.r.clear();
        Object object = this.cb();
        String string2 = null;
        ((e12_0)object).D = null;
        r43_0 r43_02 = this.Q;
        if (r43_02 != null) {
            object = this.cb().q;
            if (object != null) {
                string2 = ((Product)object).getCode();
            }
            this.cb().u();
            object = h40_0.a;
            boolean bl2 = h40_0.b2();
            zr1_1 zr1_12 = this.u;
            String string3 = this.o5();
            int n3 = 344;
            r43_0.b(r43_02, string2, bl2, null, zr1_12, null, string3, false, n3);
        }
    }

    public final void V8(Product product, int n3, String string2, HomeRowData homeRowData, int n4) {
        Object object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance();
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager)object2).getNewEEcommerceEventsRevamp();
        if (product != null) {
            boolean bl2;
            Object object3;
            int n7 = product.getPosition();
            String string3 = newEEcommerceEventsRevamp.getEE_SELECT_ITEM();
            object2 = null;
            boolean bl3 = false;
            Object object4 = null;
            if (homeRowData != null && (object3 = homeRowData.getBanners()) != null && (object3 = (BannerData)CollectionsKt.N(0, (List)object3)) != null) {
                object3 = ((BannerData)object3).getWidgetLevel();
            } else {
                bl2 = false;
                object3 = null;
            }
            Object object5 = "USER";
            bl2 = Intrinsics.areEqual(object3, object5);
            object3 = bl2 ? "user_level" : "dynamic";
            if (homeRowData != null && (object5 = homeRowData.getBanners()) != null && (object4 = (BannerData)CollectionsKt.N(0, (List)object5)) != null) {
                object4 = ((BannerData)object4).getFeedLogic();
            } else {
                bl3 = false;
                object4 = null;
            }
            if (homeRowData != null) {
                object2 = homeRowData.getHeading();
            }
            object5 = new StringBuilder();
            ((StringBuilder)object5).append((String)object3);
            object3 = "_";
            ((StringBuilder)object5).append((String)object3);
            ((StringBuilder)object5).append((String)object4);
            ((StringBuilder)object5).append((String)object3);
            ((StringBuilder)object5).append((String)object2);
            ((StringBuilder)object5).append((String)object3);
            ((StringBuilder)object5).append(n4);
            ((StringBuilder)object5).append((String)object3);
            ((StringBuilder)object5).append(n3);
            object2 = ((StringBuilder)object5).toString();
            bl3 = TextUtils.isEmpty((CharSequence)object2);
            if (bl3) {
                object2 = "";
            }
            object3 = object2;
            object = av_0.a((AnalyticsManager$Companion)object);
            object2 = " - recently viewed widget";
            String string4 = Ft2.a((String)object, (String)object2);
            String string5 = newEEcommerceEventsRevamp.getPrevScreen();
            String string6 = newEEcommerceEventsRevamp.getPrevScreenType();
            object5 = null;
            String string7 = "bag screen";
            long l2 = 0L;
            int n8 = 4192848;
            object4 = product;
            NewEEcommerceEventsRevamp.pushEEProductSelect$default(newEEcommerceEventsRevamp, product, n7, string3, (String)object3, null, string4, false, string5, string7, null, string6, null, null, false, null, null, l2, null, null, null, null, null, n8, null);
        }
    }

    public final void Va(boolean bl2, boolean bl3) {
        boolean bl4;
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity != null && !(bl4 = (fragmentActivity = this.requireActivity()).isFinishing())) {
            if (!bl3) {
                fragmentActivity = this.A0;
                Intrinsics.checkNotNull(fragmentActivity);
                boolean bl5 = true;
                fragmentActivity.setClickable(bl5);
            }
            bl4 = false;
            fragmentActivity = null;
            this.X = false;
            this.Ta();
            if (!bl2 && !bl3) {
                bl2 = this.f1;
                if (bl2) {
                    this.Mb();
                } else {
                    this.Ib();
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void Vb() {
        block9: {
            var1_1 = new n32_0();
            this.s1 = var1_1;
            var1_1 = this.jb();
            var2_2 = this.O0;
            var1_1.a = var2_2;
            var1_1 = this.jb();
            var2_2 = this.P0;
            var1_1.b = var2_2;
            var1_1 = this.jb();
            var2_2 = this.cb().q;
            var3_3 = null;
            var2_2 = var2_2 != null ? var2_2.getBrandName() : null;
            var4_4 = "";
            if (var2_2 == null) ** GOTO lbl22
            var2_2 = this.cb().q;
            if (var2_2 != null) {
                var2_2 = var2_2.getBrandName();
            } else {
                while (true) {
                    var2_2 = null;
                    break block9;
                    break;
                }
lbl22:
                // 1 sources

                var2_2 = this.cb().q;
                var2_2 = var2_2 != null ? var2_2.getFnlColorVariantData() : null;
                if (var2_2 != null && (var2_2 = (var2_2 = this.cb().q) != null && (var2_2 = var2_2.getFnlColorVariantData()) != null ? var2_2.getBrandName() : null) != null) {
                    if ((var2_2 = this.cb().q) == null || (var2_2 = var2_2.getFnlColorVariantData()) == null) ** continue;
                    var2_2 = var2_2.getBrandName();
                } else {
                    var2_2 = var4_4;
                }
            }
        }
        var1_1.c = var2_2;
        var1_1 = this.jb();
        var2_2 = this.cb().q;
        var2_2 = var2_2 != null ? var2_2.getName() : null;
        if (var2_2 != null) {
            var2_2 = this.cb().q;
            if (var2_2 != null) {
                var3_3 = var2_2.getName();
            }
        } else {
            var3_3 = var4_4;
        }
        var1_1.d = var3_3;
        var1_1 = this.jb();
        var1_1.e = var2_2 = this.cb().q;
        var1_1 = this.jb();
        var1_1.g = var2_2 = "pdp screen";
        var1_1 = this.s1;
        if (var1_1 != null) {
            var2_2 = this.getChildFragmentManager();
            var3_3 = "STL Fragment";
            var1_1.show((FragmentManager)var2_2, var3_3);
        }
    }

    public final int W2() {
        int n3;
        Object object = this.L;
        Object object2 = null;
        if (object != null) {
            object = ((RecyclerView)object).getAdapter();
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = object instanceof RecyclerView$f;
        if (n4 != 0) {
            object2 = object;
        }
        n3 = -1;
        if (object2 == null) {
            return n3;
        }
        n4 = ((RecyclerView$f)object2).getItemCount();
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7;
            int n8 = ((RecyclerView$f)object2).getItemViewType(i3);
            if (n8 != (n7 = 8)) continue;
            return i3;
        }
        return n3;
    }

    public final void W3() {
        this.p = false;
        kj0_1 kj0_12 = kj0_1.g();
        FragmentActivity fragmentActivity = this.getActivity();
        kj0_12.p(fragmentActivity, "/assured-gifts");
    }

    public final void W4() {
        this.xa();
        this.U7(false);
        this.X8(false);
        this.a1 = false;
        String.valueOf(false);
        this.A1(false);
        this.G5(false);
        e12_0 e12_02 = this.cb();
        e12_02.r0 = false;
        Object object = this.cb().q;
        if (object == null || (object = ((Product)object).getCode()) == null) {
            object = "";
        }
        this.eb((String)object, true);
    }

    public final ArrayList W5() {
        return this.N0;
    }

    public final void W6(boolean bl2) {
        Object object = bl2;
        this.t0 = object;
        object = "footerView";
        String string2 = "footerViewParent";
        LinearLayout linearLayout = null;
        if (!bl2 && !(bl2 = this.H0())) {
            boolean bl3;
            Object object2 = this.s0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object2 = null;
            }
            boolean bl4 = false;
            string2 = null;
            object2.setVisibility(0);
            object2 = this.r0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                linearLayout = object2;
            }
            linearLayout.setVisibility(0);
            object2 = this.w0;
            if (object2 != null) {
                object2.setVisibility(0);
            }
            if ((object2 = this.cb().G0) != null && (bl2 = ((PDPPriceError)object2).getShowError()) == (bl3 = true) && (object2 = this.j1) != null) {
                object2.setVisibility(0);
            }
        } else {
            LinearLayout linearLayout2 = this.s0;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                linearLayout2 = null;
            }
            int n3 = 8;
            linearLayout2.setVisibility(n3);
            linearLayout2 = this.r0;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                linearLayout = linearLayout2;
            }
            linearLayout.setVisibility(n3);
            linearLayout2 = this.w0;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(n3);
            }
            if ((linearLayout2 = this.j1) != null) {
                linearLayout2.setVisibility(n3);
            }
        }
    }

    public final jo_2 Wa() {
        return (jo_2)this.I.getValue();
    }

    public final void Wb() {
        Object object;
        boolean bl2;
        boolean bl3 = false;
        Object object2 = null;
        this.p = false;
        Object object3 = this.s0;
        boolean bl4 = false;
        LinearLayout linearLayout = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("footerViewParent");
            bl2 = false;
            object3 = null;
        }
        int n3 = 8;
        object3.setVisibility(n3);
        object3 = this.r0;
        if (object3 == null) {
            object3 = "footerView";
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
        } else {
            linearLayout = object3;
        }
        linearLayout.setVisibility(n3);
        object3 = this.w0;
        if (object3 != null) {
            object3.setVisibility(n3);
        }
        object3 = this.cb();
        bl2 = object3.u;
        bl4 = true;
        if (bl2 && (object3 = this.K0) != null) {
            object = this.L0;
            ArrayList arrayList = this.cb().C;
            object3.o((LinearLayoutManager)object, arrayList, false, bl4);
        }
        if ((object2 = this.K0) != null) {
            object3 = this.cb().C;
            ((O63)object2).q((ArrayList)object3);
        }
        if ((object2 = this.K0) != null) {
            object3 = this.cb().q;
            object = this.k0;
            ((O63)object2).l((Product)object3, (ProductUserSizeRecomResponse)object);
        }
        if ((object2 = this.K0) != null && (bl3 = ((O63)object2).P) == bl4) {
            object2 = AnalyticsManager.Companion;
            object3 = "size selection halfcut screen";
            km_1.a((AnalyticsManager$Companion)object2, (String)object3);
        }
    }

    public final void X(String string2) {
        Intrinsics.checkNotNullParameter(string2, "selectedSize");
        this.o.add(string2);
    }

    public final void X0() {
        mr2_1 mr2_12 = new mr2_1();
        FragmentManager fragmentManager = this.getChildFragmentManager();
        mr2_12.show(fragmentManager, "Sale info Fragment");
    }

    public final Price X1() {
        return this.cb().H;
    }

    public final void X2() {
        this.p = false;
    }

    public final void X7() {
        String string2;
        Object object;
        NewProductDetailsFragment newProductDetailsFragment = this;
        this.p = false;
        Object object2 = AnalyticsManager.Companion;
        Object object3 = "button clicked";
        Object object4 = "more_bank_offers";
        tj2_0.e((AnalyticsManager$Companion)object2, (String)object3, (String)object4, "pdp screen");
        object2 = h40_0.a;
        int n3 = h40_0.x1();
        int n4 = 0;
        Object object5 = null;
        if (n3 != 0) {
            Bundle bundle = new Bundle();
            object3 = this.H;
            object2 = ((NewCustomEventsRevamp)object3).getPRODUCT_ID();
            object4 = this.l6();
            bundle.putString((String)object2, (String)object4);
            object2 = ((NewCustomEventsRevamp)object3).getPRODUCT_NAME();
            object4 = this.cb().q;
            object4 = object4 != null ? ((Product)object4).getName() : null;
            bundle.putString((String)object2, (String)object4);
            object4 = ((NewCustomEventsRevamp)object3).getEC_PRODUCT_DETAILS_INTERACTION();
            object2 = newProductDetailsFragment.l1;
            if (object2 != null && (object2 = ((BankOffer)object2).getAllBankOffer()) != null) {
                n3 = ((ArrayList)object2).size() + -1;
                object2 = n3;
            } else {
                n3 = 0;
                object2 = null;
            }
            object = new StringBuilder("+");
            ((StringBuilder)object).append(object2);
            ((StringBuilder)object).append(" More Offers ");
            string2 = ((StringBuilder)object).toString();
            object2 = newProductDetailsFragment.G;
            String string3 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
            String string4 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
            object = "bank offers mini card - more bank offers";
            String string5 = "product_details_interactions";
            String string6 = "pdp screen";
            String string7 = "pdp screen";
            int n7 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, (String)object4, (String)object, string2, string5, string6, string7, string3, bundle, string4, false, null, n7, null);
        }
        if ((object2 = this.getFragmentManager()) != null) {
            object3 = qv_1.Companion;
            object4 = newProductDetailsFragment.l1;
            if (object4 != null) {
                object5 = ((BankOffer)object4).getAllBankOffer();
            }
            Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type java.util.ArrayList<com.ril.ajio.services.data.Offers.BankOfferItem>");
            object4 = this.o5();
            object3.getClass();
            Intrinsics.checkNotNullParameter(object4, "storeId");
            object3 = new qv_1();
            object = new Bundle();
            string2 = "PDP_BANK_OFFER";
            object.putParcelableArrayList(string2, (ArrayList)object5);
            object.putString("PDP_PRODUCT_STORE_TYPE", (String)object4);
            ((Fragment)object3).setArguments((Bundle)object);
            n4 = 1002;
            ((Fragment)object3).setTargetFragment(newProductDetailsFragment, n4);
            object5 = "POP_PDP_BANK_OFFER";
            ((DialogFragment)object3).show((FragmentManager)object2, (String)object5);
        }
    }

    public final void X8(boolean bl2) {
        this.Y0 = bl2;
        String.valueOf(bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Xa(String string2) {
        boolean bl2;
        Object object = this.cb().E;
        if (object != null) {
            object = ((ProductOptionVariant)object).getCode();
        } else {
            bl2 = false;
            object = null;
        }
        Object object2 = object;
        bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) return;
        bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return;
        }
        bl2 = mz3_0.B();
        if (bl2 && (bl2 = ((hy3_0)(object = this.mb())).p())) {
            e12_0 e12_02 = this.cb();
            Intrinsics.checkNotNull(object2);
            object = this.cb();
            Product product = ((e12_0)object).q;
            int n3 = 1;
            e12_02.m(string2, (String)object2, n3, false, product, false);
            return;
        }
        object = this.cb();
        Intrinsics.checkNotNull(object2);
        int n4 = 1;
        ((e12_0)object).l(n4, string2, (String)object2, false);
    }

    public final void Xb() {
        j3_0 j3_02;
        this.p = false;
        qn_2.Companion.getClass();
        qn_2 qn_22 = new qn_2();
        Object object = new Bundle();
        boolean bl2 = true;
        object.putBoolean("cart_tab_selection", bl2);
        qn_22.setArguments((Bundle)object);
        object = this.h;
        Object object2 = null;
        String string2 = "activityFragmentListener";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        if ((j3_02 = this.h) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object2 = j3_02;
        }
        object2 = object2.y();
        j3$a.a((j3_0)object, (Fragment)object2, qn_22, bl2, "CartFragment");
    }

    public final void Y0(Product object, String string2, boolean n3) {
        int n4 = 0;
        Object object2 = null;
        this.p = false;
        if (string2 != null && (n4 = string2.length()) != 0) {
            this.Ub();
            object2 = this.cb().p;
            Object object3 = n3 != 0 ? PDPClosetActionIdentifier.FROM_SIMILAR_STL : PDPClosetActionIdentifier.FROM_SIMILAR;
            object2.getClass();
            String string3 = "<set-?>";
            Intrinsics.checkNotNullParameter(object3, string3);
            ((BH3)object2).d = object3;
            object3 = this.cb().p;
            ((BH3)object3).c = object;
            object = this.cb();
            object.getClass();
            n3 = string2.length();
            if (n3 > 0) {
                object3 = md3_0.c((jD3)object);
                string3 = null;
                object2 = new h12_0((e12_0)object, string2, null);
                int n7 = 3;
                Ae3.d((i90_0)object3, null, null, (Function2)object2, n7);
            }
        }
    }

    public final void Y2(sb3_1 sb3_12) {
        Intrinsics.checkNotNullParameter(sb3_12, "startAddToCartTimer");
        sb3_1 sb3_13 = this.M;
        if (sb3_13 == null) {
            this.M = sb3_12;
        }
    }

    public final ArrayList Y4() {
        return this.cb().v0;
    }

    public final String Y6() {
        Object object = h40_0.a;
        object = h40_0.f();
        object = object != null ? ((AjiogramInterventions)object).getPdp_widget_title() : null;
        return kp1_0.c("fleek_", (String)object);
    }

    public final Pair Ya() {
        boolean bl2;
        Object object = h40_0.a;
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object2 = "pdp_to_bag_conversation_json";
        object = ((cw)object).d((String)object2);
        Object object3 = "pdp_exit_intent";
        boolean bl3 = object.has((String)object3);
        boolean bl4 = false;
        if (bl3) {
            bl2 = object.getBoolean((String)object3);
        } else {
            bl2 = false;
            object = null;
        }
        object2 = z40$a.a((Context)AJIOApplication$a.a()).a.d((String)object2);
        object3 = "pdp_exit_intent_full_screen";
        bl3 = object2.has((String)object3);
        boolean bl5 = bl3 ? object2.getBoolean((String)object3) : true;
        boolean bl6 = this.p;
        if (bl6) {
            String string2;
            object3 = tj2_2.Companion;
            object3.getClass();
            bl6 = tj2_2.e;
            if (bl6 && (bl6 = tj2_2.d) && (bl6 = Intrinsics.areEqual(object3 = this.o5(), string2 = ld3_2.STORE_AJIO.getStoreId()))) {
                bl4 = true;
            }
        }
        if (bl5) {
            object2 = NewProductDetailsFragment$a$a.FullScreen;
            object3 = bl4;
            object = new Pair(object2, object3);
            return object;
        }
        if (bl2) {
            object2 = NewProductDetailsFragment$a$a.HalfCard;
            object3 = bl4;
            object = new Pair(object2, object3);
            return object;
        }
        object2 = NewProductDetailsFragment$a$a.NavigateBack;
        object3 = Boolean.FALSE;
        object = new Pair(object2, object3);
        return object;
    }

    public final void Z7(String string2) {
        this.p = false;
        CustomWebViewActivity$a customWebViewActivity$a = CustomWebViewActivity.Companion;
        Context context = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Object object = this.cb().q;
        String string3 = null;
        object = object != null ? ((Product)object).getCode() : null;
        Product product = this.cb().q;
        if (product != null) {
            string3 = product.getName();
        }
        customWebViewActivity$a.getClass();
        CustomWebViewActivity$a.c(context, this, string2, (String)object, string3);
    }

    public final boolean Z8() {
        boolean bl2;
        ArrayList arrayList = this.cb().u0;
        boolean bl3 = true;
        if (arrayList != null && !(bl2 = arrayList.isEmpty())) {
            bl2 = false;
            arrayList = null;
        } else {
            bl2 = true;
        }
        return bl2 ^ bl3;
    }

    public final boolean Z9() {
        Object object = this.cb().q;
        if (object != null && (object = ((Product)object).getTagResponse()) != null && (object = ((TagResponse)object).getTag()) != null && (object = ((Tag)object).getCategoryTags()) != null) {
            boolean bl2;
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                String string2;
                boolean bl4;
                String string3;
                Object object2 = (CategoryTags)object.next();
                if (object2 == null || (string3 = ((CategoryTags)object2).getCategory()) == null || (bl4 = string3.equalsIgnoreCase(string2 = "SOCIAL_PROOFING")) != (bl3 = true)) continue;
                if ((object2 = ((CategoryTags)object2).getPrimary()) != null) {
                    object2 = ((TagPrimary)object2).getName();
                } else {
                    bl2 = false;
                    object2 = null;
                }
                if (!(bl2 = Intrinsics.areEqual(object2 = String.valueOf(object2), string3 = "PRODUCTQUALITY"))) continue;
                return bl3;
            }
        }
        return false;
    }

    public final void Za(Message object) {
        Intrinsics.checkNotNullParameter(object, "message");
        this.cb().k0 = false;
        Object object2 = this.cb();
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        ((e12_0)object2).p0 = object;
        object = this.cb();
        object.getClass();
        object2 = md3_0.c((jD3)object);
        b12_0 b12_02 = new b12_0((e12_0)object, null);
        Ae3.d((i90_0)object2, null, null, b12_02, 3);
    }

    public final void Zb() {
        int n3;
        Object object = this.getActivity();
        if (object != null && (n3 = (object = this.requireActivity()).isFinishing()) == 0 && (object = this.c1) != null) {
            object = this.Wa();
            n3 = ((jo_2)object).d();
            int n4 = 0;
            AjioTextView ajioTextView = null;
            AjioTextView ajioTextView2 = null;
            if (n3 == 0) {
                Object object2 = z40_0.Companion;
                object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
                String string2 = "enable_highlight_empty_cart";
                boolean bl2 = ((ao0_0)object2).a(string2);
                if (bl2) {
                    object2 = this.c1;
                    Intrinsics.checkNotNull(object2);
                    object2.setVisibility(0);
                    ajioTextView2 = this.c1;
                    if (ajioTextView2 != null) {
                        object = String.valueOf(n3);
                        ajioTextView2.setText((CharSequence)object);
                    }
                    if ((object = this.c1) != null) {
                        ajioTextView2 = this.getContext();
                        if (ajioTextView2 != null) {
                            n4 = R$drawable.circle_shape_cart_count_product;
                            ajioTextView = xn.a((Context)ajioTextView2, n4);
                        }
                        object.setBackground((Drawable)ajioTextView);
                    }
                } else {
                    object = this.c1;
                    Intrinsics.checkNotNull(object);
                    n4 = 8;
                    object.setVisibility(n4);
                }
            } else {
                AjioTextView ajioTextView3 = this.c1;
                if (ajioTextView3 != null) {
                    Context context = this.getContext();
                    if (context != null) {
                        n4 = R$drawable.circle_shape_pink_cart_menu;
                        ajioTextView = xn.a(context, n4);
                    }
                    ajioTextView3.setBackground((Drawable)ajioTextView);
                }
                ajioTextView = this.c1;
                Intrinsics.checkNotNull(ajioTextView);
                ajioTextView.setVisibility(0);
                n4 = 9;
                if (n3 <= n4) {
                    ajioTextView = this.c1;
                    Intrinsics.checkNotNull(ajioTextView);
                    object = String.valueOf(n3);
                    ajioTextView.setText((CharSequence)object);
                } else {
                    object = this.c1;
                    Intrinsics.checkNotNull(object);
                    ajioTextView = hv3_0.f("9<sup>+</sup>");
                    object.setText((CharSequence)((Object)ajioTextView));
                }
            }
        }
    }

    public final void a1() {
        this.p = false;
        Object object = this.getContext();
        if (object != null) {
            int n3;
            int n4;
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            Object object2 = "about_brand_pdp";
            ((GTMEvents)object).pushButtonTapEvent("about_brand", object2, "pdp screen");
            Object object3 = this.requireContext();
            object = new BottomSheetDialog((Context)object3);
            object.requestWindowFeature(1);
            int n7 = R$layout.brand_desc_bottom_sheet_view;
            ((BottomSheetDialog)object).setContentView(n7);
            n7 = R$id.brand_desc_cancel_layout;
            object3 = ((on)object).findViewById(n7);
            int n8 = R$id.brand_desc_cancel_iv;
            View view = ((on)object).findViewById(n8);
            if (object3 != null) {
                n4 = 1;
                object2 = new iT(object, n4);
                object3.setOnClickListener((View.OnClickListener)object2);
            }
            if (view != null) {
                n3 = 1;
                object3 = new jT(object, n3);
                view.setOnClickListener((View.OnClickListener)object3);
            }
            n7 = R$id.brand_desc_bottom_sheet_title_tv;
            object3 = (TextView)((on)object).findViewById(n7);
            n8 = R$id.brand_desc_bottom_sheet_desc_tv;
            view = (TextView)((on)object).findViewById(n8);
            object2 = this.cb().q;
            n4 = 0;
            String string2 = null;
            if (object2 != null && (object2 = ((Product)object2).getFnlColorVariantData()) != null) {
                object2 = ((ProductFnlColorVariantData)object2).getBrandName();
            } else {
                n3 = 0;
                object2 = null;
            }
            Serializable serializable = this.cb().q;
            if (serializable != null && (serializable = ((Product)serializable).getFnlColorVariantData()) != null) {
                string2 = ((ProductFnlColorVariantData)serializable).getDescriptionV2();
            }
            if (object3 != null) {
                object3.setText((CharSequence)object2);
            }
            if (view != null) {
                view.setText(string2);
            }
            object3 = new U12((BottomSheetDialog)object);
            object.setOnShowListener((DialogInterface.OnShowListener)object3);
            object.show();
        }
    }

    public final void a2(ArrayList arrayList) {
        Object object;
        String string2;
        String string3;
        int n3;
        Object object2;
        Object object3;
        NewProductDetailsFragment newProductDetailsFragment = this;
        Object object4 = arrayList;
        this.p = false;
        Object object5 = h40_0.a;
        int n4 = h40_0.x1();
        if (n4 != 0) {
            Bundle bundle = new Bundle();
            object3 = this.H;
            object5 = ((NewCustomEventsRevamp)object3).getPRODUCT_ID();
            object2 = this.l6();
            bundle.putString((String)object5, (String)object2);
            object5 = ((NewCustomEventsRevamp)object3).getPRODUCT_NAME();
            object2 = this.cb().q;
            n3 = 0;
            Object object6 = null;
            object2 = object2 != null ? ((Product)object2).getName() : null;
            bundle.putString((String)object5, (String)object2);
            object2 = ((NewCustomEventsRevamp)object3).getEC_PRODUCT_DETAILS_INTERACTION();
            if (object4 != null) {
                n4 = arrayList.size() + -1;
                object6 = n4;
            }
            object5 = new StringBuilder("+");
            ((StringBuilder)object5).append(object6);
            ((StringBuilder)object5).append(" More Offers");
            string3 = ((StringBuilder)object5).toString();
            object5 = newProductDetailsFragment.G;
            String string4 = ((NewEEcommerceEventsRevamp)object5).getPrevScreen();
            String string5 = ((NewEEcommerceEventsRevamp)object5).getPrevScreenType();
            object6 = "coupons mini card - more coupons";
            string2 = "product_details_interactions";
            object = "pdp screen";
            String string6 = "pdp screen";
            int n7 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, (String)object2, (String)object6, string3, string2, (String)object, string6, string4, bundle, string5, false, null, n7, null);
        }
        if ((object5 = this.getFragmentManager()) != null) {
            boolean bl2 = h40_0.x1();
            object2 = "POP_PDP_OFFER";
            n3 = 1001;
            string3 = "PDP_OFFER";
            if (bl2 && !(bl2 = newProductDetailsFragment.f1)) {
                R62.Companion.getClass();
                object3 = new R62();
                string2 = new Bundle();
                string2.putParcelableArrayList(string3, (ArrayList)object4);
                ((Fragment)object3).setArguments((Bundle)string2);
                ((Fragment)object3).setTargetFragment(newProductDetailsFragment, n3);
                ((DialogFragment)object3).show((FragmentManager)object5, (String)object2);
            } else {
                object3 = V62.Companion;
                string2 = this.o5();
                object3.getClass();
                Intrinsics.checkNotNullParameter(string2, "storeId");
                object3 = new V62();
                object = new Bundle();
                object.putParcelableArrayList(string3, (ArrayList)object4);
                object4 = "PDP_PRODUCT_STORE_TYPE";
                object.putString((String)object4, string2);
                ((Fragment)object3).setArguments((Bundle)object);
                ((Fragment)object3).setTargetFragment(newProductDetailsFragment, n3);
                ((DialogFragment)object3).show((FragmentManager)object5, (String)object2);
            }
        }
    }

    public final void a3() {
        Object object = this.getActivity();
        Qj2 qj2 = new zj0_0((Activity)object);
        object = this.getActivity();
        boolean bl2 = object instanceof AjioHomeActivity;
        String string2 = null;
        object = bl2 ? (AjioHomeActivity)object : null;
        if (object != null) {
            ((AjioHomeActivity)object).p();
        }
        od3_2.a = "";
        AJIOApplication.Companion.getClass();
        Object object2 = AJIOApplication$a.a();
        object = new jo_2((Context)object2);
        object2 = ld3_2.STORE_AJIOGRAM;
        String string3 = ((ld3_2)((Object)object2)).getStoreId();
        ((jo_2)object).E(string3);
        string3 = DE.a();
        String string4 = "pdp screen  -visit ajiogram store";
        string3.putString("FLEEK_SOURCE", string4);
        object = this.cb().q;
        object = object != null ? ((Product)object).getCode() : null;
        string4 = "FLEEK_SOURCE_DETAILS";
        string3.putString(string4, (String)object);
        boolean bl3 = true;
        string3.putBoolean("IS_AJIOGRAM_INTERVENTION", bl3);
        object = this.cb().q;
        if (object != null) {
            string2 = ((Product)object).getBrickCode();
        }
        string4 = kp1_0.c("c/", string2);
        String string5 = ((ld3_2)((Object)object2)).getStoreId();
        string2 = string3;
        string3 = string4;
        string4 = string5;
        string5 = "c";
        qj2.d(0, null, (Bundle)string2, string3, string4, string5, null);
    }

    public final String a4() {
        return this.cb().K0;
    }

    public final void a6() {
        this.p = false;
        this.wb();
    }

    public final void a7() {
        this.p = false;
        Object object = this.p0;
        if (object != null) {
            object = ((B02)object).c;
            object.o4();
        }
        this.kb().hideToolbarLayout();
        this.H.newPushCustomScreenView("size guide", "size guide", "pdp screen", null, "pdp screen");
    }

    public final boolean a9() {
        int n3;
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = "similarto_popup";
        int n4 = ((ao0_0)object).g(string2);
        if (n4 != (n3 = 1)) {
            n3 = 0;
            string2 = null;
        }
        return n3 != 0;
    }

    public final ArrayList aa() {
        return this.S0;
    }

    public final void ab(Message object) {
        this.cb().k0 = false;
        Object object2 = this.cb();
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        ((e12_0)object2).p0 = object;
        object = this.cb();
        object.getClass();
        object2 = md3_0.c((jD3)object);
        c12_0 c12_02 = new c12_0((e12_0)object, null);
        Ae3.d((i90_0)object2, null, null, c12_02, 3);
    }

    public final void ac(int n3) {
        int n4;
        Object object = this.cb();
        UserInformation userInformation = ((e12_0)object).s();
        boolean bl2 = userInformation.isUserOnline();
        if (bl2 && (n4 = ((jo_2)(object = ((e12_0)object).d())).n()) != 0) {
            this.cb().I0 = n3;
            Object object2 = this.L;
            n4 = 0;
            object = null;
            if (object2 != null) {
                object2 = ((RecyclerView)object2).getAdapter();
            } else {
                n3 = 0;
                object2 = null;
            }
            bl2 = object2 instanceof yh2_1;
            if (bl2) {
                object2 = (yh2_1)object2;
            } else {
                n3 = 0;
                object2 = null;
            }
            if (object2 != null) {
                n4 = 5;
                object = ((yh2_1)object2).g(n4);
            }
            if (object != null) {
                n3 = ((Number)object).intValue();
                object = this.L;
                if (object != null && (object = ((RecyclerView)object).getAdapter()) != null) {
                    ((RecyclerView$f)object).notifyItemChanged(n3);
                }
            }
        }
    }

    public final void b1(String string2, String string3) {
        Object object = string2;
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(string3, "linkText");
        this.p = false;
        kj0_1 kj0_12 = kj0_1.g();
        Object object2 = this.requireActivity();
        kj0_12.w((Activity)object2, string2);
        object2 = this.H;
        String string4 = ((NewCustomEventsRevamp)object2).getEC_PRODUCT_DETAILS_INTERACTION();
        object = AnalyticsManager.Companion;
        String string5 = bv_0.a((AnalyticsManager$Companion)object);
        String string6 = cv_0.a((AnalyticsManager$Companion)object);
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, string4, "pdp similar links suggested links", string3, "product_details_interactions", "similar to half card", "pdp screen", string5, null, string6, false, null, 1536, null);
    }

    public final void b2() {
        this.p = false;
        e12_0 e12_02 = this.cb();
        String string2 = this.o5();
        e12_02.v(string2);
    }

    public final int b3() {
        z40$a z40$a = z40_0.Companion;
        Application application = (Application)this.C.getValue();
        Intrinsics.checkNotNullExpressionValue(application, "<get-application>(...)");
        z40$a.getClass();
        return z40$a.a((Context)application).a.g("pdp_bank_offer_exp");
    }

    public final void b4(ArrayList object) {
        if (object != null) {
            boolean bl2;
            Iterator iterator = object.iterator();
            Object object2 = "";
            int n3 = 0;
            String string2 = null;
            String string3 = object2;
            while (bl2 = iterator.hasNext()) {
                object2 = iterator.next();
                int n4 = n3 + 1;
                if (n3 >= 0) {
                    object2 = (SpotLightAttribute)object2;
                    int n7 = xx_2.h((List)object);
                    if (n3 != n7) {
                        object2 = ((SpotLightAttribute)object2).getAttributeName();
                        string2 = ",";
                        object2 = Ft2.a((String)object2, string2);
                    } else {
                        object2 = ((SpotLightAttribute)object2).getAttributeName();
                    }
                    string3 = Qj0.b(string3, (String)object2);
                    n3 = n4;
                    continue;
                }
                xx_2.n();
                throw null;
            }
            object = AnalyticsManager.Companion.getInstance();
            GTMEvents gTMEvents = ((AnalyticsManager)object).getGtmEvents();
            String string4 = "PDP screen";
            String string5 = "product_spotlight_viewed";
            String string6 = "product details interactions";
            String string7 = "product spotlight viewed";
            gTMEvents.pushProductSpotlightSeenEvent(string4, string5, string6, string7, string3);
        }
    }

    public final void b7() {
        Object object = this.s0;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("footerViewParent");
            object = null;
        }
        int n3 = 8;
        object.setVisibility(n3);
        object = this.r0;
        if (object == null) {
            object = "footerView";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        object2.setVisibility(n3);
        object = this.K0;
        if (object != null) {
            object2 = this.cb().C;
            ((O63)object).q((ArrayList)object2);
        }
        if ((object = this.K0) != null) {
            object2 = this.cb().q;
            ProductUserSizeRecomResponse productUserSizeRecomResponse = this.k0;
            ((O63)object).l((Product)object2, productUserSizeRecomResponse);
        }
    }

    public final void b8(double d2, double d5) {
        ff0_2 ff0_22;
        this.E1 = ff0_22 = new ff0_2();
        String string2 = "cartAddressCallBackListener";
        Intrinsics.checkNotNullParameter(this, string2);
        ff0_22.i = this;
        ff0_22 = this.E1;
        if (ff0_22 != null) {
            string2 = "changeLocationListener";
            Intrinsics.checkNotNullParameter(this, string2);
            ff0_22.j = this;
        }
        if ((ff0_22 = this.E1) != null) {
            ff0_22.l = d2;
            ff0_22.m = d5;
        }
        if (ff0_22 != null) {
            FragmentManager fragmentManager = this.requireActivity().getSupportFragmentManager();
            String string3 = "CartLocationBottomSheet";
            ff0_22.show(fragmentManager, string3);
        }
    }

    public final Pair ba() {
        Object object = this.cb();
        Serializable serializable = (Boolean)((e12_0)object).e1.getValue();
        boolean bl2 = (Boolean)serializable;
        String string2 = null;
        if (bl2 && (object = ((e12_0)object).q) != null && (object = ((Product)object).getTagResponse()) != null && (object = ((TagResponse)object).getTag()) != null && (object = ((Tag)object).getCategoryTags()) != null) {
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                String string3;
                boolean bl4;
                Object object2;
                serializable = (CategoryTags)object.next();
                if (serializable == null || (object2 = ((CategoryTags)serializable).getCategory()) == null || (bl4 = ((String)object2).equalsIgnoreCase(string3 = "BARGAIN")) != (bl3 = true)) continue;
                object2 = Boolean.TRUE;
                if ((serializable = ((CategoryTags)serializable).getPrimary()) != null) {
                    string2 = ((TagPrimary)serializable).getValue();
                }
                object = new Pair(object2, string2);
                break;
            }
        } else {
            serializable = Boolean.FALSE;
            object = new Pair(serializable, null);
        }
        return object;
    }

    public final Bundle bb(boolean bl2) {
        Bundle bundle = new Bundle();
        Object object = this.cb().q;
        String string2 = null;
        object = object != null ? ((Product)object).getCode() : null;
        String string3 = "product_id";
        bundle.putString(string3, (String)object);
        object = this.cb().q;
        object = object != null ? ((Product)object).getName() : null;
        string3 = "product_name";
        bundle.putString(string3, (String)object);
        if (!bl2) {
            Object object2 = this.cb().q;
            if (object2 != null && (object2 = ((Product)object2).getFnlColorVariantData()) != null) {
                object2 = ((ProductFnlColorVariantData)object2).getBrandName();
            } else {
                bl2 = false;
                object2 = null;
            }
            object = "product_brand";
            bundle.putString((String)object, (String)object2);
            object2 = this.cb().q;
            if (object2 != null) {
                object2 = ((Product)object2).getBrickName();
            } else {
                bl2 = false;
                object2 = null;
            }
            object = "product_brick";
            bundle.putString((String)object, (String)object2);
            object2 = this.cb().q;
            if (object2 != null) {
                object2 = ((Product)object2).getBrickCategory();
            } else {
                bl2 = false;
                object2 = null;
            }
            object = "product_category";
            bundle.putString((String)object, (String)object2);
            object2 = this.cb().q;
            if (object2 != null) {
                string2 = ((Product)object2).getVerticalColor();
            }
            object2 = "product_vertical";
            bundle.putString((String)object2, string2);
        }
        return bundle;
    }

    public final NewProductDetailsFragment c0() {
        return this;
    }

    /*
     * Unable to fully structure code
     */
    public final void c3(String var1_1) {
        block33: {
            var2_2 = this;
            var3_3 = var1_1;
            Intrinsics.checkNotNullParameter(var1_1, "colorCode");
            this.p = false;
            var4_4 = this.getActivity();
            if (var4_4 == null || (var5_5 = (var4_4 = this.requireActivity()).isFinishing()) || (var5_5 = this.X)) break block33;
            var4_4 = new Bundle();
            var6_6 = this.cb().q;
            var7_7 = null;
            if (var6_6 != null) {
                var6_6 = var6_6.getCode();
            } else {
                var8_8 = 0;
                var6_6 = null;
            }
            var9_9 = "product_id";
            var4_4.putString((String)var9_9, (String)var6_6);
            var6_6 = this.cb().q;
            if (var6_6 != null && (var6_6 = var6_6.getWasPriceData()) != null) {
                var6_6 = var6_6.getValue();
            } else {
                var8_8 = 0;
                var6_6 = null;
            }
            var9_9 = "product_price";
            var4_4.putString((String)var9_9, (String)var6_6);
            var6_6 = this.cb().q;
            if (var6_6 != null) {
                var6_6 = var6_6.getPrice();
            } else {
                var8_8 = 0;
                var6_6 = null;
            }
            var9_9 = this.cb().q;
            var9_9 = var9_9 != null ? var9_9.getWasPriceData() : null;
            var10_10 = qz2_0.g((Price)var6_6, (Price)var9_9);
            var4_4.putString("product_discount", var10_10);
            var6_6 = this.cb().q;
            if (var6_6 != null && (var6_6 = var6_6.getPrice()) != null) {
                var6_6 = var6_6.getValue();
            } else {
                var8_8 = 0;
                var6_6 = null;
            }
            var9_9 = "product_selling_price";
            var4_4.putString((String)var9_9, (String)var6_6);
            var6_6 = this.cb().v0;
            if (var6_6 != null) {
                var8_8 = var6_6.size();
                var6_6 = var8_8;
            } else {
                var8_8 = 0;
                var6_6 = null;
            }
            var6_6 = String.valueOf(var6_6);
            var4_4.putString("product_no_variant", (String)var6_6);
            var6_6 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            var11_11 = ne_0.b((Bundle)var4_4);
            var12_12 = "pdp screen";
            var13_13 = null;
            var14_14 = 16;
            var4_4 = var6_6;
            var6_6 = "variant image switch";
            var9_9 = var1_1;
            GTMEvents.pushButtonTapEvent$default((GTMEvents)var4_4, (String)var6_6, var1_1, var12_12, (AnalyticsData)var11_11, null, var14_14, null);
            var5_5 = hv3_0.Y();
            var6_6 = "";
            if (!var5_5) ** GOTO lbl-1000
            var4_4 = this.cb().q;
            if (var4_4 != null) {
                var4_4 = var4_4.getSelectedSizeVariant();
            } else {
                var5_5 = false;
                var4_4 = null;
            }
            if (var4_4 != null) {
                var4_4 = Y63.c((ProductOptionVariant)var4_4);
            } else lbl-1000:
            // 2 sources

            {
                var4_4 = var6_6;
            }
            var9_9 = this.cb().q;
            Intrinsics.checkNotNull(var9_9);
            var9_9 = hv3_0.n((Product)var9_9);
            var12_12 = new Bundle();
            var15_15 = var2_2.H;
            var11_11 = var15_15.getPRODUCT_NAME();
            var13_13 = this.cb().q;
            if (var13_13 == null || (var13_13 = var13_13.getName()) == null) {
                var13_13 = var6_6;
            }
            var12_12.putString((String)var11_11, (String)var13_13);
            var11_11 = var15_15.getPRODUCT_ID();
            var13_13 = this.cb().q;
            if (var13_13 == null || (var13_13 = var13_13.getCode()) == null) {
                var13_13 = var6_6;
            }
            var12_12.putString((String)var11_11, (String)var13_13);
            var11_11 = var15_15.getPRODUCT_BRAND();
            var13_13 = this.cb().q;
            if (var13_13 == null || (var13_13 = var13_13.getBrandName()) == null) {
                var13_13 = var6_6;
            }
            var12_12.putString((String)var11_11, (String)var13_13);
            var11_11 = var15_15.getPRODUCT_PRICE();
            var13_13 = this.cb().q;
            if (var13_13 == null || (var13_13 = var13_13.getPrice()) == null || (var13_13 = var13_13.getValue()) == null) {
                var13_13 = var6_6;
            }
            var12_12.putString((String)var11_11, (String)var13_13);
            var11_11 = var15_15.getPRODUCT_COLOR();
            var12_12.putString((String)var11_11, (String)var9_9);
            var11_11 = var15_15.getPRODUCT_SIZE();
            var12_12.putString((String)var11_11, (String)var4_4);
            var4_4 = var15_15.getPRODUCT_DISCOUNT();
            var12_12.putString((String)var4_4, var10_10);
            var4_4 = var15_15.getPRODUCT_CATEGORY();
            var11_11 = this.cb().q;
            if (var11_11 != null) {
                var11_11 = var11_11.getBrickCategory();
            } else {
                var16_16 = false;
                var11_11 = null;
            }
            var12_12.putString((String)var4_4, (String)var11_11);
            var4_4 = var15_15.getPRODUCT_BRICK();
            var11_11 = this.cb().q;
            if (var11_11 != null) {
                var11_11 = var11_11.getBrickCategory();
            } else {
                var16_16 = false;
                var11_11 = null;
            }
            var12_12.putString((String)var4_4, (String)var11_11);
            var4_4 = var15_15.getPRODUCT_MRP();
            var11_11 = this.cb().q;
            if (var11_11 != null && (var11_11 = var11_11.getPrice()) != null) {
                var11_11 = var11_11.getValue();
            } else {
                var16_16 = false;
                var11_11 = null;
            }
            var12_12.putString((String)var4_4, (String)var11_11);
            var4_4 = var15_15.getPRODUCT_TAG();
            var11_11 = hv3_0.a;
            var13_13 = this.cb().q;
            var13_13 = var13_13 != null ? var13_13.getFnlColorVariantData() : null;
            var11_11.getClass();
            var11_11 = hv3_0.A((ProductFnlColorVariantData)var13_13);
            var16_16 = TextUtils.isEmpty((CharSequence)var11_11);
            if (!var16_16) {
                var6_6 = this.cb().q;
                if (var6_6 != null) {
                    var6_6 = var6_6.getFnlColorVariantData();
                } else {
                    var8_8 = 0;
                    var6_6 = null;
                }
                var6_6 = hv3_0.A((ProductFnlColorVariantData)var6_6);
            }
            var12_12.putString((String)var4_4, (String)var6_6);
            var4_4 = h40_0.a;
            var5_5 = h40_0.s1();
            if (var5_5 && !(var5_5 = og1_1.c())) {
                var17_17 = var15_15.getEC_PRODUCT_DETAILS_INTERACTIONS();
                var4_4 = var2_2.n1;
                var6_6 = var2_2.o1;
                var18_19 = "variant image switch";
                var19_21 = "product_details_interactions";
                var20_23 = "pdp screen";
                var21_25 = "pdp screen";
                var22_27 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default(var15_15, var17_17, var18_19, (String)var9_9, var19_21, var20_23, var21_25, (String)var4_4, (Bundle)var12_12, (String)var6_6, false, null, var22_27, null);
            } else {
                var17_18 = var15_15.getEC_PRODUCT_DETAILS_INTERACTIONS();
                var4_4 = var2_2.n1;
                var6_6 = var2_2.o1;
                var18_20 = "variant change";
                var19_22 = "product_variant_change";
                var20_24 = "pdp screen";
                var21_26 = "pdp screen";
                var22_28 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default(var15_15, var17_18, var18_20, (String)var9_9, var19_22, var20_24, var21_26, (String)var4_4, (Bundle)var12_12, (String)var6_6, false, null, var22_28, null);
            }
            var5_5 = TextUtils.isEmpty((CharSequence)var1_1);
            if (!var5_5 && (var4_4 = this.cb()) != null) {
                var4_4 = new ri2$a();
                var4_4.b = var3_3;
                var4_4.d = var6_6 = this.o5();
                var4_4 = var4_4.a();
                var6_6 = var2_2.g;
                if (var6_6 == null) {
                    var6_6 = "productDetailListener";
                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                } else {
                    var7_7 = var6_6;
                }
                var7_7.n0((ri2_0)var4_4);
            }
            if ((var4_4 = var2_2.L) != null) {
                var4_4.scrollToPosition(0);
            }
        }
    }

    public final SectionData c5() {
        Object object = this.cb();
        object.getClass();
        SectionData sectionData = new SectionData();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object2 = ((e12_0)object).q;
        if (object2 != null && (object2 = ((Product)object2).getSectionOne()) != null) {
            int n3;
            Object object3;
            int n4;
            int n7;
            Collection collection = ((SectionData)object2).getFeatureData();
            boolean bl2 = false;
            Object object4 = null;
            if (collection != null) {
                collection = ((SectionData)object2).getFeatureData();
                if (collection != null) {
                    n7 = collection.size();
                } else {
                    n7 = 0;
                    collection = null;
                }
                if (n7 > 0) {
                    collection = ((SectionData)object2).getFeatureData();
                    Intrinsics.checkNotNull(collection);
                    collection = collection;
                    n7 = collection.size();
                    for (n4 = 0; n4 < n7; ++n4) {
                        object3 = ((SectionData)object2).getFeatureData();
                        Intrinsics.checkNotNull(object3);
                        object3 = (FeatureData)object3.get(n4);
                        arrayList.add(object3);
                    }
                }
            }
            sectionData.setFeatureData(arrayList);
            object2 = ((e12_0)object).q;
            n7 = 0;
            collection = null;
            if (object2 != null) {
                object2 = ((Product)object2).getCode();
            } else {
                n3 = 0;
                object2 = null;
            }
            n4 = 1;
            if (object2 != null && (n3 = ((String)object2).length()) != 0) {
                n3 = 0;
                object2 = null;
            } else {
                n3 = 1;
            }
            if (n3 == 0) {
                int n8;
                cp_1.Companion.getClass();
                object2 = cp$a.c();
                object3 = ((e12_0)object).q;
                if (object3 != null) {
                    object3 = ((Product)object3).getBrickCode();
                } else {
                    n8 = 0;
                    object3 = null;
                }
                n3 = (int)(ai0_2.d((String)object3, (JSONArray)object2) ? 1 : 0);
                if (n3 == 0) {
                    object2 = new FeatureData();
                    n8 = R$string.product_code;
                    object3 = hv3_0.K(n8);
                    ((FeatureData)object2).setName((String)object3);
                    object3 = ((e12_0)object).q;
                    if (object3 == null || (object3 = ((Product)object3).getCode()) == null) {
                        object3 = "";
                    }
                    ((FeatureData)object2).setValue((String)object3);
                    arrayList.add(object2);
                }
            }
            if ((object2 = ((e12_0)object).L) == null || (n3 = ((String)object2).length()) == 0) {
                bl2 = true;
            }
            if (!bl2) {
                cp_1.Companion.getClass();
                object2 = cp$a.c();
                object4 = ((e12_0)object).q;
                if (object4 != null) {
                    object4 = ((Product)object4).getBrickCode();
                } else {
                    bl2 = false;
                    object4 = null;
                }
                n3 = (int)(ai0_2.d((String)object4, (JSONArray)object2) ? 1 : 0);
                if (n3 == 0) {
                    object2 = new FeatureData();
                    ((FeatureData)object2).setName(null);
                    object = ((e12_0)object).L;
                    ((FeatureData)object2).setValue((String)object);
                    arrayList.add(object2);
                }
            }
        }
        return sectionData;
    }

    public final void c6() {
        O63 o63 = null;
        this.p = false;
        Object object = this.s0;
        LinearLayout linearLayout = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("footerViewParent");
            object = null;
        }
        object.setVisibility(0);
        object = this.r0;
        if (object == null) {
            object = "footerView";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            linearLayout = object;
        }
        linearLayout.setVisibility(0);
        o63 = this.K0;
        if (o63 != null) {
            o63.c();
        }
        this.Qa();
    }

    public final boolean c7() {
        boolean bl2;
        block9: {
            Iterator iterator;
            block6: {
                block8: {
                    boolean bl3;
                    Object object;
                    Object object2;
                    block7: {
                        iterator = this.cb();
                        object2 = this.o5();
                        iterator.getClass();
                        Intrinsics.checkNotNullParameter(object2, "storeId");
                        object = h40_0.a;
                        bl3 = h40_0.t2((String)object2);
                        if (!bl3 || (iterator = ((e12_0)((Object)iterator)).q) == null || (iterator = ((Product)((Object)iterator)).getVariantOptions()) == null) break block6;
                        bl3 = (iterator = (Iterable)((Object)iterator)) instanceof Collection;
                        if (!bl3) break block7;
                        object2 = iterator;
                        object2 = (Collection)((Object)iterator);
                        bl3 = object2.isEmpty();
                        if (bl3) break block8;
                    }
                    iterator = ((Iterable)((Object)iterator)).iterator();
                    block0: while (bl3 = iterator.hasNext()) {
                        object2 = ((ProductOptionItem)iterator.next()).getVariantOptionQualifiers();
                        if (object2 == null) break block6;
                        boolean bl4 = (object2 = (Iterable)object2) instanceof Collection;
                        if (bl4) {
                            object = object2;
                            object = (Collection)object2;
                            bl4 = object.isEmpty();
                            if (bl4) break block6;
                        }
                        object2 = ((Iterable)object2).iterator();
                        while (bl4 = object2.hasNext()) {
                            String string2;
                            object = ((ProductOptionVariant)object2.next()).getQualifier();
                            bl4 = Intrinsics.areEqual(object, string2 = "standardSize");
                            if (!bl4) continue;
                            continue block0;
                        }
                        break block6;
                    }
                }
                bl2 = true;
                break block9;
            }
            bl2 = false;
            iterator = null;
        }
        return bl2;
    }

    public final boolean c9() {
        return this.f1;
    }

    public final e12_0 cb() {
        return (e12_0)this.x.getValue();
    }

    public final boolean d0() {
        Object object = this.Q;
        if (object != null) {
            object = ((r43_0)object).b;
            String string2 = "pdp_similarto_coachmark_in_revamp";
            boolean bl2 = ((sw_0)object).getPreference(string2, false) ^ true;
            object = bl2;
        } else {
            boolean bl3 = false;
            object = null;
        }
        Intrinsics.checkNotNull(object);
        return (Boolean)object;
    }

    public final boolean d1(int n3, int n4) {
        int n7 = 52;
        boolean bl2 = true;
        int n8 = -1;
        float f5 = 0.0f / 0.0f;
        j3_0 j3_02 = null;
        if (n3 == n7 && n4 == n8) {
            Object object = this.mb();
            n3 = (int)(((hy3_0)object).p() ? 1 : 0);
            if (n3 != 0) {
                Object object2;
                object = this.h;
                Object object3 = "activityFragmentListener";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n3 = 0;
                    object = null;
                }
                if ((object2 = this.h) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    j3_02 = object2;
                }
                object3 = j3_02.y();
                object2 = gg2_1.Companion;
                f5 = this.i1;
                float f6 = this.h1;
                object2.getClass();
                object2 = GG2$a.a(f5, f6);
                String string2 = "ReferralFragment";
                j3$a.a((j3_0)object, (Fragment)object3, (Fragment)object2, bl2, string2);
            }
            return bl2;
        }
        n7 = 53;
        if (n3 == n7 && n4 == n8) {
            Object object;
            Object object4;
            n3 = (int)(og1_1.c() ? 1 : 0);
            if (n3 == 0 && (n3 = (int)(this.u7() ? 1 : 0)) == 0 && (object4 = this.r1) != null) {
                String string3 = "bag screen";
                this.q1 = object = new pg2_2((View)object4, string3);
            }
            this.Ub();
            object4 = this.cb().R;
            if (object4 != null && (n3 = ((String)object4).length()) != 0) {
                object4 = this.cb().p.b;
                if (object4 != null) {
                    object = this.cb();
                    String string4 = ((e12_0)object).R;
                    if (string4 != null && (n4 = string4.length()) != 0) {
                        this.Ub();
                        this.cb().p.b = object4;
                        e12_0 e12_02 = this.cb();
                        String string5 = this.o5();
                        e12_02.getClass();
                        Intrinsics.checkNotNullParameter(string4, "productCode");
                        Intrinsics.checkNotNullParameter(string5, "sourceStoreId");
                        object4 = md3_0.c(e12_02);
                        object = new x02_0(e12_02, string4, string5, null, null);
                        n7 = 3;
                        n8 = 0;
                        f5 = 0.0f;
                        Object var12_19 = null;
                        Ae3.d((i90_0)object4, null, null, (Function2)object, n7);
                    }
                }
                object4 = this.cb();
                ((e12_0)object4).R = null;
            } else {
                object4 = this.cb();
                object = this.o5();
                ((e12_0)object4).z((String)object);
            }
            return bl2;
        }
        n7 = 67;
        if (n3 == n7 && n4 == n8) {
            zr1_1 zr1_12 = this.cb().Z;
            mu1_1 mu1_12 = this.getViewLifecycleOwner();
            pp1_2 pp1_22 = new pp1_2(this, 1);
            NewProductDetailsFragment$f newProductDetailsFragment$f = new NewProductDetailsFragment$f(pp1_22);
            zr1_12.e(mu1_12, newProductDetailsFragment$f);
            return bl2;
        }
        return false;
    }

    public final boolean d4(String string2) {
        return CollectionsKt.F(ih3_1.b, string2);
    }

    public final Boolean d7() {
        return this.mb().p();
    }

    public final String db() {
        int n3;
        Object object = this.cb().E;
        if (object != null) {
            object = ((ProductOptionVariant)object).getCode();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null && (n3 = object.length()) != 0) {
            object = this.cb().E;
            if (object == null || (object = ((ProductOptionVariant)object).getCode()) == null) {
                object = "";
            }
        } else {
            object = this.cb().k();
        }
        return object;
    }

    public final String e1() {
        String string2 = "SIZECART";
        Intrinsics.checkNotNullParameter(string2, "tagKey");
        Object object = this.cb().q;
        if (object != null && (object = ((Product)object).getTagResponse()) != null && (object = ((TagResponse)object).getTag()) != null && (object = ((Tag)object).getCategoryTags()) != null) {
            boolean bl2;
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                boolean bl4;
                String string3;
                CategoryTags categoryTags = (CategoryTags)object.next();
                if (categoryTags == null || (string3 = categoryTags.getCategory()) == null || (bl4 = string3.equalsIgnoreCase(string2)) != (bl3 = true)) continue;
                object = categoryTags.getPrimary();
                object = object != null ? ((TagPrimary)object).getValue() : null;
                return String.valueOf(object);
            }
        }
        return "";
    }

    public final void e3() {
        int n3;
        Object object = this.w;
        Object object2 = (UserInformation)((hh3_2)object).getValue();
        String string2 = null;
        if (object2 != null) {
            object2 = ((UserInformation)object2).getUserEmailId();
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null && (n3 = ((String)object2).length()) != 0) {
            object2 = this.mb();
            if ((object = (UserInformation)((hh3_2)object).getValue()) != null) {
                string2 = ((UserInformation)object).getUserEmailId();
            }
            Intrinsics.checkNotNull(string2);
            object = "User_Type";
            ((hy3_0)object2).o(string2, (String)object);
        }
    }

    public final void eb(String object, boolean bl2) {
        Object object2;
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        if (bl3) {
            return;
        }
        bl3 = false;
        DataCallback$Companion dataCallback$Companion = null;
        if (bl2) {
            this.Ub();
        } else {
            object2 = this.O;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPDPShimmerLayout");
                bl2 = false;
                object2 = null;
            }
            hv3_0.p0(object2);
        }
        object2 = this.N;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdpMainLayout");
            bl2 = false;
            object2 = null;
        }
        int n3 = 8;
        object2.setVisibility(n3);
        e12_0 e12_02 = this.cb();
        String[] stringArray = p50_0.a;
        Intrinsics.checkNotNullExpressionValue(stringArray, "OPTIONS");
        object2 = this.k;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeListener");
            bl2 = false;
            object2 = null;
        }
        boolean bl4 = object2.M();
        String string2 = this.o5();
        e12_02.getClass();
        Intrinsics.checkNotNullParameter(object, "productCode");
        Intrinsics.checkNotNullParameter(stringArray, "options");
        object2 = "storeId";
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        bl2 = e12_02.r0;
        if (bl2 && (object2 = e12_02.q) != null) {
            object = e12_02.L0;
            dataCallback$Companion = DataCallback.Companion;
            Intrinsics.checkNotNull(object2);
            object2 = dataCallback$Companion.onSuccess(object2);
            ((LiveData)object).i(object2);
        } else {
            object2 = md3_0.c(e12_02);
            d12_0 d12_02 = new d12_0((String)object, stringArray, e12_02, bl4, string2, null);
            int n4 = 3;
            Ae3.d((i90_0)object2, null, null, d12_02, n4);
        }
    }

    public final void f2(String object) {
        j3_0 j3_02;
        Intrinsics.checkNotNullParameter(object, "postId");
        this.p = false;
        pj0_2.Companion.getClass();
        pj0_2 pj0_22 = new pj0_2();
        Object object2 = new Bundle();
        boolean bl2 = true;
        object2.putBoolean("IsFromDeepLink", bl2);
        object2.putString("POSTID", (String)object);
        pj0_22.setArguments((Bundle)object2);
        object = this.h;
        object2 = null;
        String string2 = "activityFragmentListener";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        if ((j3_02 = this.h) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object2 = j3_02;
        }
        object2 = object2.y();
        j3$a.a((j3_0)object, (Fragment)object2, pj0_22, bl2, "feed_detail_tag");
    }

    public final String f8() {
        return this.cb().P;
    }

    public final void f9() {
        this.p = false;
        this.Qa();
    }

    public final void fb(String string2) {
        String string3 = this.db();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            boolean bl3;
            e12_0 e12_02 = this.cb();
            Serializable serializable = this.cb().q;
            if (serializable != null) {
                serializable = serializable.isExchangeable();
                Boolean bl4 = Boolean.TRUE;
                bl3 = Intrinsics.areEqual(serializable, bl4);
            } else {
                bl3 = false;
                serializable = null;
            }
            int n3 = 1;
            e12_02.l(n3, string2, string3, bl3);
        }
    }

    public final void g0() {
        this.p = false;
        this.s1 = null;
        this.jb().b();
    }

    public final void g1() {
        Object object;
        Object object2 = null;
        this.p = false;
        Object object3 = this.cb().q;
        Object object4 = null;
        Object object5 = object3 != null ? (object3 = ((Product)object3).getBrandName()) : null;
        object3 = this.cb().q;
        Object object6 = object3 != null ? (object3 = ((Product)object3).getName()) : null;
        object3 = this.cb().r;
        object2 = object3 != null && (object2 = (ProductImage)((ArrayList)object3).get(0)) != null ? ((ProductImage)object2).getUrl() : null;
        Float f5 = Float.valueOf(0.0f);
        String string2 = this.l6();
        object3 = this.cb().q;
        Object object7 = object3 != null ? (object3 = ((Product)object3).getBrickName()) : null;
        String string3 = this.o5();
        object3 = object;
        object4 = object5;
        object5 = object6;
        object6 = object2;
        object2 = object;
        object = object7;
        ((RatingsModel)object3)((String)object4, (String)object5, (String)object6, f5, string2, "PDP", null, null, (String)object7, null, null, null, null, string3, 7680, null);
        object2 = wD2$a.b(wd2_0.Companion, (RatingsModel)object2);
        object3 = this.getChildFragmentManager();
        ((DialogFragment)object2).show((FragmentManager)object3, "RatingBottomSheetFragment");
    }

    public final ArrayList g3() {
        return this.P0;
    }

    public final void g5() {
        int n3;
        int n4 = 0;
        this.p = false;
        this.Ub();
        e12_0 e12_02 = this.cb();
        Object object = e12_02.q;
        if (object != null && (object = ((Product)object).getCode()) != null && (n3 = ((String)object).length()) > 0) {
            aW aW2 = md3_0.c(e12_02);
            g12_0 g12_02 = new g12_0(e12_02, (String)object, null);
            n4 = 3;
            Ae3.d(aW2, null, null, g12_02, n4);
        }
    }

    public final void g7(String string2) {
        Intrinsics.checkNotNullParameter(string2, "link");
        this.p = false;
        Object object = new Bundle();
        GTMEvents gTMEvents = AnalyticsManager.Companion.getInstance().getGtmEvents();
        AnalyticsData analyticsData = ne_0.b((Bundle)object);
        GTMEvents.pushButtonTapEvent$default(gTMEvents, "pdp suggested links", string2, "pdp screen", analyticsData, null, 16, null);
        object = kj0_1.g();
        FragmentActivity fragmentActivity = this.getActivity();
        ((kj0_1)object).p(fragmentActivity, string2);
    }

    public final void gb(String string2) {
        String string3 = this.db();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            boolean bl3;
            e12_0 e12_02 = this.cb();
            Object object = this.cb().q;
            if (object != null) {
                boolean bl4;
                object = ((Product)object).isExchangeable();
                Boolean bl5 = Boolean.TRUE;
                bl3 = bl4 = Intrinsics.areEqual(object, bl5);
            } else {
                boolean bl6 = false;
                object = null;
                bl3 = false;
            }
            Product product = this.cb().q;
            int n3 = 1;
            object = string2;
            e12_02.m(string2, string3, n3, bl3, product, false);
        }
    }

    public final CartDeliveryAddress getAddress() {
        return this.T0;
    }

    public final String h0() {
        return this.cb().J;
    }

    public final Boolean h2() {
        boolean bl2;
        Object object = this.cb().q;
        double d2 = 0.0;
        double d5 = object != null && (object = ((Product)object).getRatingsResponse()) != null && (object = ((RatingsResponse)object).getAggregateRating()) != null && (object = ((AggregateRating)object).getAverageRating()) != null ? (Double)object : d2;
        boolean bl3 = true;
        Object object2 = d5 == d2 ? 0 : (d5 > d2 ? 1 : -1);
        if (object2 <= 0 && !(bl2 = h40_0.a.E1()) && !(bl2 = h40_0.F1())) {
            bl3 = false;
            object = null;
        }
        return bl3;
    }

    public final int hb() {
        int n3;
        String string2;
        String string3 = this.o5();
        boolean bl2 = Intrinsics.areEqual(string3, string2 = ld3_2.STORE_AJIOGRAM.getStoreId());
        if (bl2) {
            n3 = 2;
        } else {
            string2 = ld3_2.STORE_LUXE.getStoreId();
            n3 = (int)(Intrinsics.areEqual(string3, string2) ? 1 : 0);
            if (n3 != 0) {
                n3 = 1;
            } else {
                n3 = 0;
                string3 = null;
            }
        }
        return n3;
    }

    public final ArrayList i2() {
        return this.cb().C;
    }

    public final void i7() {
        boolean bl2 = this.u7();
        if (!bl2) {
            fo3 fo32 = this.kb();
            fo32.T1();
            this.qb();
        }
    }

    public final void ia(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "msg");
        this.showNotification(string2, string3);
    }

    public final ZC2 ib() {
        return (ZC2)this.y.getValue();
    }

    public final SimilarProductWishlistDataHolder j1() {
        return this.cb().J0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean j2() {
        Object object = z40_0.Companion;
        Application application = (Application)this.C.getValue();
        String string2 = "<get-application>(...)";
        Intrinsics.checkNotNullExpressionValue(application, string2);
        object.getClass();
        object = z40$a.a((Context)application).a;
        String string3 = "brand_description_enable";
        int n3 = ((ao0_0)object).a(string3);
        if (n3 == 0) return 0 != 0;
        object = this.cb().q;
        if (object == null) return 0 != 0;
        if ((object = ((Product)object).getFnlColorVariantData()) == null) return 0 != 0;
        object = ((ProductFnlColorVariantData)object).getDescriptionV2();
        if (object == null) return 0 != 0;
        n3 = ((String)object).length();
        if (n3 != 0) return 1 != 0;
        return 0 != 0;
    }

    public final void j3() {
        this.p = false;
        sh1_0.Companion.getClass();
        sh1_0 sh1_02 = new sh1_0();
        FragmentManager fragmentManager = this.getChildFragmentManager();
        sh1_02.show(fragmentManager, "RatingBottomSheetFragment");
    }

    public final void j6(Integer object, Boolean object2, ProductReview object3) {
        int n3 = 0;
        String string2 = null;
        this.p = false;
        Object object4 = Boolean.TRUE;
        boolean bl2 = Intrinsics.areEqual(object2, object4);
        object4 = null;
        if (bl2) {
            object = LD2.a;
            object = this.cb().q;
            object = object != null ? ((Product)object).getCode() : null;
            object2 = this.cb().q;
            if (object2 != null) {
                object2 = ((Product)object2).getName();
            } else {
                bl2 = false;
                object2 = null;
            }
            object3 = this.cb().q;
            if (object3 != null) {
                object4 = ((Product)object3).getBrickCode();
            }
            object3 = "clicked";
            string2 = "customer photos";
            LD2.c(string2, (String)object3, (String)object, (String)object2, (String)object4);
            object = com.ril.ajio.pdprefresh.fragments.d.Companion;
            object2 = this.cb().q;
            if (!(object2 != null && (object2 = ((Product)object2).getFnlColorVariantData()) != null && (object2 = ((ProductFnlColorVariantData)object2).getColorGroup()) != null || (object2 = this.cb()) != null && (object2 = ((e12_0)object2).q) != null && (object2 = ((Product)object2).getCode()) != null)) {
                object2 = "";
            }
            object3 = this.cb().q;
            object.getClass();
            Intrinsics.checkNotNullParameter(object2, "optionCode");
            object = new Bundle();
            string2 = "OptionCode";
            object.putCharSequence(string2, (CharSequence)object2);
            object2 = new d();
            ((d)object2).g = object3;
            ((Fragment)object2).setArguments((Bundle)object);
            object = this.requireActivity().getSupportFragmentManager();
            object3 = "CustomerReviewPhotosBottomSheet";
            ((DialogFragment)object2).show((FragmentManager)object, (String)object3);
        } else {
            if (object3 != null) {
                rz3_0.Companion.getClass();
                object2 = Rz3$a.f((ProductReview)object3);
            } else {
                bl2 = false;
                object2 = null;
            }
            ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
            if (object2 != null) {
                arrayList.add((Boolean)object2);
            }
            object2 = LD2.a;
            if (object3 != null) {
                object2 = ((ProductReview)object3).getReviewId();
            } else {
                bl2 = false;
                object2 = null;
            }
            object2 = String.valueOf(object2);
            object3 = this.cb().q;
            object3 = object3 != null ? ((Product)object3).getCode() : null;
            Object object5 = this.cb().q;
            object5 = object5 != null ? ((Product)object5).getName() : null;
            Object object6 = this.cb().q;
            if (object6 != null) {
                object4 = ((Product)object6).getBrickCode();
            }
            object6 = "review photos - viewed";
            LD2.c((String)object6, (String)object2, (String)object3, (String)object5, (String)object4);
            object2 = this.getActivity();
            if (object2 != null && (object2 = ((FragmentActivity)object2).getSupportFragmentManager()) != null) {
                int n4;
                object5 = EO2.Companion;
                if (object != null) {
                    n4 = n3 = ((Integer)object).intValue();
                } else {
                    n4 = 0;
                    object6 = null;
                }
                String string3 = this.l6();
                Product product = this.cb().q;
                int n7 = 64;
                object = EO2$a.b((EO2$a)object5, arrayList, n4, 0, 0, string3, product, n7);
                object3 = "ReviewImageBottomSheet";
                ((DialogFragment)object).show((FragmentManager)object2, (String)object3);
            }
        }
    }

    public final void j8(String string2, String string3) {
        boolean bl2 = h40_0.Q1();
        if (bl2) {
            CartAddressListBottomSheet cartAddressListBottomSheet;
            this.G1 = cartAddressListBottomSheet = new CartAddressListBottomSheet();
            Object object = "cartAddressCallBackListener";
            Intrinsics.checkNotNullParameter(this, (String)object);
            cartAddressListBottomSheet.u = this;
            cartAddressListBottomSheet = this.G1;
            if (cartAddressListBottomSheet != null) {
                object = this.requireActivity().getSupportFragmentManager();
                String string4 = "CartLocationBottomSheet";
                cartAddressListBottomSheet.show((FragmentManager)object, string4);
            }
        } else {
            String string5 = "";
            Object object = string3;
            Bundle bundle = px1_2.b("pincode", string3, "cod_eligible", string5);
            bundle.putString("serviceable", string5);
            object = this.H;
            String string6 = ((NewCustomEventsRevamp)object).getEC_PRODUCT_DETAILS_INTERACTIONS();
            String string7 = this.n1;
            String string8 = this.o1;
            String string9 = "estimate delivery date";
            String string10 = "initiate";
            String string11 = "edd_initiate";
            String string12 = "pdp screen";
            String string13 = "pdp screen";
            int n3 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string6, string9, string10, string11, string12, string13, string7, bundle, string8, false, null, n3, null);
            o12_0 o12_02 = new o12_0();
            Object object2 = this.cb().q;
            string5 = this.o5();
            object = string2;
            o12_02.Qa((Product)object2, string2, string5);
            object2 = this.getChildFragmentManager();
            string5 = "EnterPincodeFragment";
            o12_02.show((FragmentManager)object2, string5);
        }
    }

    public final boolean j9() {
        return this.cb().x;
    }

    public final K43 jb() {
        return (K43)this.D.getValue();
    }

    public final mu1_1 k2() {
        try {
            return this.getViewLifecycleOwner();
        }
        catch (Exception exception) {
            return null;
        }
    }

    public final String k3() {
        return this.cb().A0;
    }

    public final void k7(int n3, Product product) {
        NewProductDetailsFragment newProductDetailsFragment = this;
        Object object = product;
        String string2 = "";
        Intrinsics.checkNotNullParameter(string2, "listType");
        Object object2 = null;
        this.p = false;
        Object object3 = "SHOPPING ASSISTANT MODEL";
        int n4 = Intrinsics.areEqual(string2, object3);
        if (n4 != 0) {
            this.xb();
        } else {
            boolean bl2;
            if (product == null) {
                return;
            }
            object3 = this.x1;
            if (object3 != null) {
                ((BottomSheetDialogFragment)object3).dismissAllowingStateLoss();
            }
            if (bl2 = TextUtils.isEmpty((CharSequence)(object3 = product.getCode()))) {
                return;
            }
            Object object4 = new ri2$a();
            ((ri2$a)object4).a = object;
            ((ri2$a)object4).b((String)object3);
            Object object5 = this.o5();
            ((ri2$a)object4).d = object5;
            object4 = ((ri2$a)object4).a();
            object5 = newProductDetailsFragment.g;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("productDetailListener");
                object5 = null;
            }
            object5.n0((ri2_0)object4);
            AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
            object4 = analyticsManager$Companion.getInstance().getGtmEvents();
            String string3 = "/";
            object5 = new StringBuilder(string3);
            ((StringBuilder)object5).append((String)object3);
            ((StringBuilder)object5).append(string3);
            n4 = n3;
            ((StringBuilder)object5).append(n3);
            object5 = ((StringBuilder)object5).toString();
            String string4 = "pdp screen";
            ((GTMEvents)object4).pushButtonTapEvent("PDP Click", object5, string4);
            object4 = newProductDetailsFragment.G;
            String string5 = ((NewEEcommerceEventsRevamp)object4).getEE_SELECT_ITEM();
            String string6 = ((NewEEcommerceEventsRevamp)object4).getPrevScreen();
            String string7 = ((NewEEcommerceEventsRevamp)object4).getPrevScreenType();
            Bundle bundle = newProductDetailsFragment.bb(false);
            object5 = "pdp-cross-sell- best paired";
            string3 = null;
            String string8 = "pdp screen";
            String string9 = "landing screen";
            long l2 = 0L;
            int n7 = 3668560;
            object2 = object4;
            object = product;
            object4 = string5;
            String string10 = string4;
            string4 = string6;
            string6 = string2;
            string2 = string7;
            string5 = bundle;
            NewEEcommerceEventsRevamp.pushEEProductSelect$default((NewEEcommerceEventsRevamp)object2, product, n3, (String)object4, (String)object5, null, string8, false, string4, string9, null, string7, null, null, false, null, null, l2, null, null, bundle, null, null, n7, null);
            object2 = analyticsManager$Companion.getInstance().getGtmEvents();
            object = this.cb().q;
            if (object == null) {
                string2 = string6;
            } else {
                object = this.cb().q;
                Intrinsics.checkNotNull(object);
                string2 = ((Product)object).getName();
            }
            object = "Recommendation PDP";
            object3 = string10;
            ((GTMEvents)object2).pushButtonTapEvent((String)object, string2, string10);
        }
    }

    public final String ka() {
        Object object = this.cb().q;
        object = object != null && (object = ((Product)object).getFnlColorVariantData()) != null ? ((ProductFnlColorVariantData)object).getColor() : null;
        return object;
    }

    public final fo3 kb() {
        fo3 fo32 = this.i;
        if (fo32 != null) {
            return fo32;
        }
        Intrinsics.throwUninitializedPropertyAccessException("toolbarListener");
        return null;
    }

    public final boolean l() {
        Object object = this.Ya();
        Object object2 = (Boolean)((Pair)object).b;
        boolean bl2 = object2;
        boolean bl3 = true;
        if (bl2) {
            object = ((Pair)object).a;
            object2 = NewProductDetailsFragment$a$a.FullScreen;
            if (object == object2) {
                object = this.cb().q;
                if (object != null) {
                    object2 = this.A1;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("exitIntentListener");
                        bl2 = false;
                        object2 = null;
                    }
                    object2.d0((Product)object);
                    object = tj2_2.Companion;
                    object.getClass();
                    tj2_2.e = false;
                    tj2_2.d = false;
                }
                return bl3;
            }
            object2 = NewProductDetailsFragment$a$a.HalfCard;
            if (object == object2) {
                this.yb();
                return bl3;
            }
            object = cp_1.Companion;
            boolean bl4 = km_1.b((cp$a)object);
            if (bl4 && (object = this.L) != null) {
                ai0_2.B((View)object);
            }
            if ((object = this.K0) != null && (bl4 = ((O63)object).h()) == bl3) {
                object = this.K0;
                if (object != null) {
                    ((O63)object).c();
                }
                this.I0();
                return bl3;
            }
        } else {
            object = cp_1.Companion;
            boolean bl5 = km_1.b((cp$a)object);
            if (bl5 && (object = this.L) != null) {
                ai0_2.B((View)object);
            }
            if ((object = this.K0) != null && (bl5 = ((O63)object).h()) == bl3) {
                object = this.K0;
                if (object != null) {
                    ((O63)object).c();
                }
                this.I0();
                return bl3;
            }
        }
        return false;
    }

    public final boolean l4() {
        return this.I0;
    }

    public final String l6() {
        return this.cb().k();
    }

    public final String l7() {
        return this.cb().o();
    }

    public final boolean l8() {
        block18: {
            boolean bl2;
            ProductSizeGuideData productSizeGuideData;
            boolean bl3;
            boolean bl4;
            Object object;
            block19: {
                object = this.cb();
                bl4 = ((e12_0)object).B;
                bl3 = false;
                if (bl4) {
                    return false;
                }
                object = z40_0.Companion;
                object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                bl4 = ((ao0_0)object).a("android_enableSizeGuideUrl");
                Object object2 = this.cb().q;
                if (object2 == null) break block18;
                object2 = this.cb().q;
                productSizeGuideData = null;
                if (object2 != null) {
                    object2 = ((Product)object2).getFnlColorVariantData();
                } else {
                    bl2 = false;
                    object2 = null;
                }
                if (object2 == null) break block18;
                object2 = this.cb().q;
                if (object2 != null && (object2 = ((Product)object2).getFnlColorVariantData()) != null) {
                    object2 = ((ProductFnlColorVariantData)object2).getSizeGuideServiceUrl();
                } else {
                    bl2 = false;
                    object2 = null;
                }
                bl2 = TextUtils.isEmpty((CharSequence)object2);
                if (!bl2) break block19;
                object2 = this.cb().q;
                if (object2 != null && (object2 = ((Product)object2).getFnlColorVariantData()) != null) {
                    object2 = ((ProductFnlColorVariantData)object2).getSizeGuideUrl();
                } else {
                    bl2 = false;
                    object2 = null;
                }
                bl2 = TextUtils.isEmpty((CharSequence)object2);
                if (!bl2) break block19;
                if (!bl4) break block18;
                object2 = this.cb().q;
                if (object2 != null && (object2 = ((Product)object2).getFnlColorVariantData()) != null) {
                    object2 = ((ProductFnlColorVariantData)object2).getSizeGuideDesktop();
                } else {
                    bl2 = false;
                    object2 = null;
                }
                bl2 = TextUtils.isEmpty((CharSequence)object2);
                if (bl2) break block18;
            }
            bl2 = true;
            if (bl4) {
                object = this.cb().q;
                if (object != null && (object = ((Product)object).getFnlColorVariantData()) != null) {
                    object = ((ProductFnlColorVariantData)object).getSizeGuideDesktop();
                } else {
                    bl4 = false;
                    object = null;
                }
                bl4 = TextUtils.isEmpty((CharSequence)object);
                if (!bl4) {
                    object = this.cb().q;
                    if (object != null) {
                        productSizeGuideData = ((Product)object).getProductSizeGuideData();
                    }
                    if (productSizeGuideData != null) {
                        bl3 = true;
                    }
                    return bl3;
                }
            }
            return bl2;
        }
        return false;
    }

    public final Double la() {
        return this.cb().G;
    }

    public final void loadCartBasedOnSelectedAddress(String object, String string2) {
        boolean bl2;
        this.H1 = false;
        this.I1 = bl2 = true;
        Object object2 = this.G1;
        if (object2 != null) {
            ((BottomSheetDialogFragment)object2).dismissAllowingStateLoss();
        }
        if ((object2 = this.E1) != null) {
            ((BottomSheetDialogFragment)object2).dismissAllowingStateLoss();
        }
        if ((object2 = this.D1) != null) {
            ((BottomSheetDialogFragment)object2).dismissAllowingStateLoss();
        }
        this.J1 = object2 = String.valueOf(object);
        object2 = new CartDeliveryAddress();
        AddressType addressType = AddressType.Pincode;
        ((CartDeliveryAddress)object2).setAddressType(addressType);
        ((CartDeliveryAddress)object2).setPostalCode((String)object);
        this.K1 = bl2;
        boolean bl3 = mz3_0.B();
        if (bl3 && (bl3 = ((UserInformation)(object = UserInformation.getInstance(this.getContext()))).isUserOnline())) {
            object = this.J1;
            this.gb((String)object);
        } else {
            object = this.J1;
            this.fb((String)object);
        }
    }

    public final boolean m2() {
        Serializable serializable = this.cb().q;
        if (serializable != null) {
            boolean bl2 = ((Product)serializable).isBundleOfferAvailable();
            serializable = Boolean.valueOf(bl2);
        } else {
            boolean bl3 = false;
            serializable = null;
        }
        Intrinsics.checkNotNull(serializable);
        return (Boolean)serializable;
    }

    public final boolean m4() {
        return this.cb().z;
    }

    public final void m6() {
        this.Tb("notifyme");
    }

    public final boolean m7() {
        String string2;
        boolean bl2;
        String string3 = this.cb().D0;
        boolean bl3 = false;
        boolean bl4 = true;
        if (string3 != null && (string3 = ((Object)StringsKt.m0(string3)).toString()) != null && (bl2 = string3.equalsIgnoreCase(string2 = "Fine Jewellery")) == bl4) {
            bl3 = true;
        }
        return bl3 ^ true;
    }

    public final void m8(String string2) {
        Intrinsics.checkNotNullParameter(string2, "brandId");
        this.p = false;
        Object object = this.getActivity();
        boolean bl2 = object instanceof AjioHomeActivity;
        object = bl2 ? (AjioHomeActivity)object : null;
        if (object != null) {
            ((AjioHomeActivity)object).t1 = bl2 = true;
        }
        object = kj0_1.g();
        FragmentActivity fragmentActivity = this.getActivity();
        string2 = "https://ajiogram.ajio.com/brand/".concat(string2);
        Boolean bl3 = Boolean.TRUE;
        ((kj0_1)object).s(fragmentActivity, string2, null, bl3);
    }

    public final ProductOptionItem ma() {
        return this.cb().j();
    }

    public final hy3_0 mb() {
        return (hy3_0)this.z.getValue();
    }

    public final void n0() {
        Object object;
        Object object2;
        boolean bl2 = this.u7();
        if (!bl2 && (bl2 = Intrinsics.areEqual(object2 = this.z0, object = Boolean.FALSE))) {
            object2 = Boolean.TRUE;
            this.z0 = object2;
            object2 = this.w0;
            if (object2 != null) {
                ((PDPCustomDoDView)((Object)object2)).a();
            }
            if ((object2 = this.L) != null && (object2 = ((RecyclerView)object2).getAdapter()) != null) {
                ((RecyclerView$f)object2).notifyDataSetChanged();
            }
            if ((object2 = this.getActivity()) != null && !(bl2 = (object2 = this.requireActivity()).isFinishing())) {
                es0_1.Companion.getClass();
                object2 = new es0_1();
                object = new Bundle();
                object.putBoolean("DOD_SIZE", false);
                ((Fragment)object2).setArguments((Bundle)object);
                object = this.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(object, "getSupportFragmentManager(...)");
                String string2 = "es0";
                ((es0_1)object2).show((FragmentManager)object, string2);
            }
        }
    }

    public final void n4(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        this.p = false;
        ea2_1 ea2_12 = this.g;
        if (ea2_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productDetailListener");
            ea2_12 = null;
        }
        ea2_12.C(string2);
    }

    public final void n6(String object) {
        boolean bl2 = h40_0.Q1();
        if (bl2) {
            int n3;
            object = this.Wa().l();
            bl2 = false;
            String string2 = null;
            if (object != null) {
                object = ((CartDeliveryAddress)object).getPostalCode();
            } else {
                n3 = 0;
                object = null;
            }
            if (object != null && (n3 = object.length()) != 0) {
                object = this.Wa().l();
                if (object != null) {
                    string2 = ((CartDeliveryAddress)object).getPostalCode();
                }
                object = String.valueOf(string2);
                this.Xa((String)object);
            }
        } else if (object != null) {
            this.Xa((String)object);
        }
    }

    public final SectionData n9() {
        Object object = this.cb();
        object.getClass();
        SectionData sectionData = new SectionData();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object2 = ((e12_0)object).q;
        if (object2 == null) {
            sectionData.setFeatureData(arrayList);
        } else if ((object2 = ((Product)object2).getSectionTwo()) != null) {
            int n3;
            Object object3;
            int n4;
            int n7;
            Collection collection = ((SectionData)object2).getFeatureData();
            boolean bl2 = false;
            Object object4 = null;
            if (collection != null) {
                collection = ((SectionData)object2).getFeatureData();
                if (collection != null) {
                    n7 = collection.size();
                } else {
                    n7 = 0;
                    collection = null;
                }
                if (n7 > 0) {
                    collection = ((SectionData)object2).getFeatureData();
                    Intrinsics.checkNotNull(collection);
                    collection = collection;
                    n7 = collection.size();
                    for (n4 = 0; n4 < n7; ++n4) {
                        object3 = ((SectionData)object2).getFeatureData();
                        Intrinsics.checkNotNull(object3);
                        object3 = (FeatureData)object3.get(n4);
                        arrayList.add(object3);
                    }
                }
            }
            sectionData.setFeatureData(arrayList);
            object2 = ((e12_0)object).q;
            n7 = 0;
            collection = null;
            if (object2 != null) {
                object2 = ((Product)object2).getCode();
            } else {
                n3 = 0;
                object2 = null;
            }
            n4 = 1;
            if (object2 != null && (n3 = ((String)object2).length()) != 0) {
                n3 = 0;
                object2 = null;
            } else {
                n3 = 1;
            }
            if (n3 == 0) {
                int n8;
                cp_1.Companion.getClass();
                object2 = cp$a.c();
                object3 = ((e12_0)object).q;
                if (object3 != null) {
                    object3 = ((Product)object3).getBrickCode();
                } else {
                    n8 = 0;
                    object3 = null;
                }
                n3 = (int)(ai0_2.d((String)object3, (JSONArray)object2) ? 1 : 0);
                if (n3 == 0) {
                    object2 = new FeatureData();
                    n8 = R$string.product_code;
                    object3 = hv3_0.K(n8);
                    ((FeatureData)object2).setName((String)object3);
                    object3 = ((e12_0)object).q;
                    if (object3 == null || (object3 = ((Product)object3).getCode()) == null) {
                        object3 = "";
                    }
                    ((FeatureData)object2).setValue((String)object3);
                    arrayList.add(object2);
                }
            }
            if ((object2 = ((e12_0)object).L) == null || (n3 = ((String)object2).length()) == 0) {
                bl2 = true;
            }
            if (!bl2) {
                cp_1.Companion.getClass();
                object2 = cp$a.c();
                object4 = ((e12_0)object).q;
                if (object4 != null) {
                    object4 = ((Product)object4).getBrickCode();
                } else {
                    bl2 = false;
                    object4 = null;
                }
                n3 = (int)(ai0_2.d((String)object4, (JSONArray)object2) ? 1 : 0);
                if (n3 == 0) {
                    object2 = new FeatureData();
                    ((FeatureData)object2).setName(null);
                    object = ((e12_0)object).L;
                    ((FeatureData)object2).setValue((String)object);
                    arrayList.add(object2);
                }
            }
        }
        return sectionData;
    }

    public final void nb(la0_0 object, ArrayList object2, Product object3, boolean bl2) {
        Object object4 = la0_0.SIZE_RECOMMENDATION;
        int n3 = 0;
        if (object == object4) {
            la0_0 la0_02;
            object = this.mb();
            boolean bl3 = ((hy3_0)object).p();
            if (bl3) {
                object = new ProductUserSizeRecomData();
                object2 = ((Product)object3).getCode();
                ((ProductUserSizeRecomData)object).setProductCode((String)object2);
                object2 = ((Product)object3).getProductSizeGuideData();
                if (object2 != null) {
                    object2 = ((Product)object3).getProductSizeGuideData();
                    boolean bl4 = false;
                    Object la0_03 = null;
                    object2 = object2 != null ? ((ProductSizeGuideData)object2).getApplicationName() : null;
                    ((ProductUserSizeRecomData)object).setApplicationName((String)object2);
                    object2 = ((Product)object3).getProductSizeGuideData();
                    object2 = object2 != null ? ((ProductSizeGuideData)object2).getBrickCode() : null;
                    ((ProductUserSizeRecomData)object).setBrickCode((String)object2);
                    object2 = ((Product)object3).getProductSizeGuideData();
                    object2 = object2 != null ? ((ProductSizeGuideData)object2).getBrandCode() : null;
                    ((ProductUserSizeRecomData)object).setBrandCode((String)object2);
                    object2 = ((Product)object3).getProductSizeGuideData();
                    object2 = object2 != null ? ((ProductSizeGuideData)object2).getFittingType() : null;
                    ((ProductUserSizeRecomData)object).setFittingType((String)object2);
                    object2 = ((Product)object3).getProductSizeGuideData();
                    object2 = object2 != null ? ((ProductSizeGuideData)object2).getStyleType() : null;
                    ((ProductUserSizeRecomData)object).setStyleType((String)object2);
                    object2 = ((Product)object3).getProductSizeGuideData();
                    object2 = object2 != null ? ((ProductSizeGuideData)object2).getVendorCode() : null;
                    ((ProductUserSizeRecomData)object).setVendorCode((String)object2);
                    object2 = ((Product)object3).getSeasonCode();
                    ((ProductUserSizeRecomData)object).setSeasonCode((String)object2);
                    object2 = ((Product)object3).getBrickName();
                    ((ProductUserSizeRecomData)object).setBrickName((String)object2);
                    object2 = ((Product)object3).getProductSizeGuideData();
                    object2 = object2 != null ? ((ProductSizeGuideData)object2).getGender() : null;
                    ((ProductUserSizeRecomData)object).setSegment((String)object2);
                    object2 = ((Product)object3).getRatingsResponse();
                    if (object2 != null && (object2 = ((RatingsResponse)object2).getAggregateRating()) != null) {
                        la0_03 = ((AggregateRating)object2).getAverageRating();
                    }
                    ((ProductUserSizeRecomData)object).setRating((Double)la0_03);
                    object2 = this.cb();
                    object2.getClass();
                    Intrinsics.checkNotNullParameter(object, "objProductUserSizeRecomData");
                    object = ((e12_0)object2).f.getProductRecommendations((ProductUserSizeRecomData)object);
                    int n4 = 2;
                    object3 = new d8_0(object2, n4);
                    la0_03 = new cq_2(1, (Function1)object3);
                    int n7 = 2;
                    object3 = new G8(object2, n7);
                    n3 = 1;
                    object4 = new dq_1(n3, (Function1)object3);
                    object = ((g53_0)object).f((o60_0)la0_03, (o60_0)object4);
                    object2 = ((e12_0)object2).e;
                    ((t30_0)object2).b((yr0_2)object);
                }
            } else if (bl2 && (object = NewProductDetailsFragment.lb(object4, (ArrayList)object2)) != (la0_02 = la0_0.BRAND_VOICE)) {
                this.nb((la0_0)((Object)object), (ArrayList)object2, (Product)object3, false);
            }
        } else {
            object4 = la0_0.USER_VOICE;
            if (object == object4) {
                la0_0 la0_03;
                boolean bl5 = this.vb();
                if (bl5) {
                    this.y1 = object4;
                    object = this.cb();
                    object.getClass();
                    object2 = "<set-?>";
                    Intrinsics.checkNotNullParameter(object4, (String)object2);
                    ((e12_0)object).h1 = object4;
                } else if (bl2 && (object = NewProductDetailsFragment.lb(object4, (ArrayList)object2)) != (la0_03 = la0_0.BRAND_VOICE)) {
                    this.nb((la0_0)((Object)object), (ArrayList)object2, (Product)object3, false);
                }
            }
        }
    }

    public final Fragment o1() {
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void o4() {
        int n3;
        int n4;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        boolean bl2;
        Object object5;
        Object object6;
        int n7;
        Object object7;
        block12: {
            block15: {
                block13: {
                    block14: {
                        boolean bl3;
                        boolean bl4;
                        NewProductDetailsFragment newProductDetailsFragment = this;
                        object7 = this.cb().q;
                        if (object7 == null) return;
                        object7 = this.cb().q;
                        n7 = 0;
                        object6 = null;
                        if (object7 == null) return;
                        object7 = ((Product)object7).getFnlColorVariantData();
                        if (object7 == null) {
                            return;
                        }
                        object7 = this.cb();
                        object5 = newProductDetailsFragment.K0;
                        bl2 = false;
                        object4 = null;
                        if (object5 == null || (bl4 = ((O63)object5).h()) != (bl3 = true)) {
                            bl3 = false;
                            object3 = null;
                        }
                        object7 = ((e12_0)object7).p(bl3);
                        bl4 = TextUtils.isEmpty((CharSequence)object7);
                        if (bl4) return;
                        object5 = newProductDetailsFragment.p0;
                        if (object5 == null) return;
                        object3 = ((B02)object5).a;
                        object2 = object3.x5();
                        if (object2 != null && (object = ((Product)object2).getBaseOptions()) != null && (object = (ProductOption)object.get(0)) != null && (object = ((ProductOption)object).getOptions()) != null && (object = (ProductOptionItem)object.get(0)) != null) {
                            object = ((ProductOptionItem)object).getSizeDisplayType();
                        } else {
                            n4 = 0;
                            object = null;
                        }
                        if (object != null && (n3 = ((String)object).length()) != 0) break block12;
                        if (object2 != null && (object = ((Product)object2).getVariantOptions()) != null && (object = (ProductOptionItem)object.get(0)) != null) {
                            object = ((ProductOptionItem)object).getSizeDisplayType();
                        } else {
                            n4 = 0;
                            object = null;
                        }
                        if (object == null || (n4 = ((String)object).length()) == 0) break block13;
                        if (object2 == null || (object = ((Product)object2).getVariantOptions()) == null || (object4 = (ProductOptionItem)object.get(0)) == null) break block14;
                        object4 = ((ProductOptionItem)object4).getSizeDisplayType();
                        break block15;
                    }
                    n4 = 0;
                    object = null;
                    break block12;
                }
                object4 = "BRAND";
            }
            object = object4;
        }
        bl2 = hv3_0.Y();
        Object object8 = new StringBuilder();
        ((StringBuilder)object8).append((String)object7);
        ((StringBuilder)object8).append("&standardSizeFlag=");
        ((StringBuilder)object8).append(bl2);
        ((StringBuilder)object8).append("&sizeDisplayType=");
        ((StringBuilder)object8).append((String)object);
        object7 = ((StringBuilder)object8).toString();
        bl2 = object3.u7();
        object3 = ((B02)object5).b;
        if (bl2) {
            n7 = 10;
            object3.w1(n7, (String)object7);
            return;
        }
        object4 = new Bundle();
        if (object2 != null) {
            object = ((Product)object2).getCode();
        } else {
            n4 = 0;
            object = null;
        }
        object8 = "product_id";
        object4.putString((String)object8, (String)object);
        if (object2 != null) {
            object6 = ((Product)object2).getName();
        }
        object4.putString("product_name", (String)object6);
        object6 = ((B02)object5).d;
        object5 = ((NewCustomEventsRevamp)object6).getPRODUCT_BRAND();
        object = "";
        if (object2 == null || (object8 = ((Product)object2).getBrandName()) == null) {
            object8 = object;
        }
        object4.putString((String)object5, (String)object8);
        object6 = ((NewCustomEventsRevamp)object6).getPRODUCT_SIZE();
        if (object2 != null && (object5 = ((Product)object2).getSelectedSize()) != null) {
            object = object5;
        }
        object4.putString((String)object6, (String)object);
        object6 = AnalyticsManager.Companion;
        ((AnalyticsManager$Companion)object6).getInstance().getGtmEvents().pushOpenScreenEvent("size guide screen", (Bundle)object4);
        object2 = object5;
        int n8 = 65023;
        n4 = 0;
        n3 = 0;
        long l2 = 0L;
        object5 = new AnalyticsData(null, null, null, l2, null, null, null, null, null, (Bundle)object4, null, null, null, null, null, null, n8, null);
        object4 = ((AnalyticsManager$Companion)object6).getInstance();
        object = ((AnalyticsManager)object4).getGtmEvents();
        String string2 = av_0.a((AnalyticsManager$Companion)object6);
        int n10 = 16;
        object8 = "Size Guide";
        String string3 = "Size Guide";
        GTMEvents.pushButtonTapEvent$default((GTMEvents)object, (String)object8, string3, string2, (AnalyticsData)object5, null, n10, null);
        object3.Z7((String)object7);
    }

    public final String o5() {
        Object object = this.R;
        if (object == null || (object = ((ri2_0)object).d) == null) {
            object = ld3_2.STORE_AJIO.getStoreId();
        }
        return object;
    }

    public final String oa() {
        String string2;
        Object object = h40_0.a;
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.d("dressToolPdpBannerConfig");
        boolean bl2 = object.has(string2 = "imgUrl");
        object = bl2 ? object.optString(string2) : null;
        return object;
    }

    public final void ob(boolean bl2) {
        boolean bl3;
        Object object = this.cb().q;
        Object object2 = null;
        if (object != null) {
            object = ((Product)object).getCode();
        } else {
            bl3 = false;
            object = null;
        }
        bl3 = this.d4((String)object);
        int n3 = 8;
        String string2 = "addToCloset";
        if (bl3) {
            View view;
            object = this.J;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object;
            }
            object2.setVisibility(n3);
            object = this.K;
            if (object != null) {
                object.setVisibility(0);
            }
            if (!bl2 && (view = this.K) != null) {
                ai0_2.a(view);
            }
        } else {
            object = this.J;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl3 = false;
                object = null;
            }
            object.setVisibility(0);
            object = this.K;
            if (object != null) {
                object.setVisibility(n3);
            }
            if (!bl2) {
                ImageButton imageButton = this.J;
                if (imageButton == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object2 = imageButton;
                }
                ai0_2.a((View)object2);
            }
        }
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        int n7 = 1;
        int n8 = 6;
        if (n3 != n8) {
            n8 = 56;
            if (n3 != n8) {
                n8 = 61;
                if (n3 == n8) {
                    Object object;
                    String string2;
                    if (intent != null) {
                        string2 = intent.getStringExtra("recommendation_size_chart");
                    } else {
                        n8 = 0;
                        string2 = null;
                    }
                    e12_0 e12_02 = this.cb();
                    e12_02.getClass();
                    boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
                    if (!bl2) {
                        ArrayList arrayList = e12_02.C;
                        int n10 = arrayList.size();
                        for (int i3 = 0; i3 < n10; i3 += n7) {
                            Object object2 = ((ProductOptionVariant)arrayList.get(i3)).getValue();
                            boolean bl3 = kotlin.text.b.i(string2, (String)object2, n7 != 0);
                            if (bl3) {
                                e12_02.E = object2 = (ProductOptionVariant)arrayList.get(i3);
                                ((ProductOptionVariant)arrayList.get(i3)).setSelected(n7 != 0);
                                e12_02.P = object2 = ((ProductOptionVariant)arrayList.get(i3)).getCode();
                                e12_02.Q = object2 = ((ProductOptionVariant)arrayList.get(i3)).getValue();
                                continue;
                            }
                            object2 = (ProductOptionVariant)arrayList.get(i3);
                            ((ProductOptionVariant)object2).setSelected(false);
                        }
                        e12_02.B();
                    }
                    if ((object = this.L) != null && (object = ((RecyclerView)object).getAdapter()) != null) {
                        ((RecyclerView$f)object).notifyDataSetChanged();
                    }
                }
            } else {
                Object object = this.mb();
                n8 = (int)(object.p() ? 1 : 0);
                if (n8 == n7) {
                    int n14 = 2;
                    this.ac(n14);
                }
                Object object3 = CustomerStoreType.a;
                object = ScreenType.SCREEN_PDP;
                object3 = CustomerStoreType.a("rilfnl_v1", (ScreenType)((Object)object));
                boolean bl4 = mz3_0.y((String)object3);
                if (bl4) {
                    this.sb();
                }
            }
        } else {
            Hj hj = this.mb();
            boolean bl5 = ((hy3_0)hj).p();
            if (bl5) {
                hj = this.cb();
                ((e12_0)hj).t();
            }
        }
        super.onActivityResult(n3, n4, intent);
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof ea2_1;
        if (bl2) {
            object2 = object;
            this.g = object2 = (ea2_1)object;
        }
        if (bl2 = object instanceof j3_0) {
            object2 = object;
            this.h = object2 = (j3_0)object;
        }
        if (bl2 = object instanceof fo3) {
            object2 = object;
            object2 = (fo3)object;
            String string2 = "<set-?>";
            Intrinsics.checkNotNullParameter(object2, string2);
            this.i = object2;
            bl2 = object instanceof vh3_2;
            if (bl2) {
                object2 = object;
                object2 = (vh3_2)object;
                Intrinsics.checkNotNullParameter(object2, string2);
                this.j = object2;
                bl2 = object instanceof A71;
                if (bl2) {
                    object2 = object;
                    this.k = object2 = (A71)object;
                    bl2 = object instanceof nm_1;
                    if (bl2) {
                        object2 = object;
                        this.l = object2 = (nm_1)object;
                        bl2 = object instanceof lz1_1;
                        if (bl2) {
                            object2 = object;
                            this.m = object2 = (lz1_1)object;
                            bl2 = object instanceof ee0_1;
                            if (bl2) {
                                boolean bl3;
                                object = (ee0_1)object;
                                this.A1 = object;
                                this.f1 = bl3 = og1_1.c();
                                return;
                            }
                            object = pn_2.b(object, " must implement ExitIntentListener");
                            object2 = new ClassCastException((String)object);
                            throw object2;
                        }
                        object = pn_2.b(object, " must implement LoginListener");
                        object2 = new ClassCastException((String)object);
                        throw object2;
                    }
                    object = pn_2.b(object, " must implement CartClosetListener");
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

    public final void onChangeLocationClick() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View object) {
        int n3;
        int n4;
        int n7 = 1;
        int n8 = 0;
        Object var4_4 = null;
        this.p = false;
        int n10 = 0;
        Object object2 = null;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n14 = R$id.add_to_cart_layout;
        if (object != null && (n3 = ((Integer)object).intValue()) == n14) {
            Object[] objectArray;
            object = this.getActivity();
            if (object == null) return;
            object = this.requireActivity();
            n4 = (int)(object.isFinishing() ? 1 : 0);
            if (n4 != 0) {
                return;
            }
            object = h40_0.a;
            n4 = (int)(h40_0.W0() ? 1 : 0);
            if (n4 != 0) {
                object = hv3_0.a;
                objectArray = this.cb().q;
                object.getClass();
                n4 = (int)(hv3_0.V((Product)objectArray) ? 1 : 0);
                if (n4 != 0) {
                    Object object3;
                    object = this.mb();
                    n4 = (int)(((hy3_0)object).p() ? 1 : 0);
                    if (n4 == 0) {
                        object = "notifyme";
                        this.Tb((String)object);
                        return;
                    }
                    object = this.cb().q;
                    if (object != null) {
                        zz_2.a((Product)object);
                        object3 = h40_0.r();
                        zz_2.b((Product)object, (String)object3);
                    }
                    object = AnalyticsManager.Companion.getInstance().getCt();
                    object3 = new AnalyticsData$Builder();
                    cp_1.Companion.getClass();
                    objectArray = cp$a.e();
                    Product product = this.cb().q;
                    objectArray.getClass();
                    objectArray = cp_1.i(product);
                    object3 = ((AnalyticsData$Builder)object3).eventMap((HashMap)objectArray).build();
                    ((CleverTapEvents)object).pushNotifyMeEvent((AnalyticsData)object3);
                    object = h40_0.r();
                    hv3_0.o0(0, (String)object, null);
                    return;
                }
            }
            if ((object = this.cb()) != null && (object = this.cb().E) == null) {
                object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                objectArray = "pdp screen";
                String string2 = "Add To Bag";
                String string3 = "Add To Bag/Ask To Choose Size";
                ((GTMEvents)object).pushButtonTapEvent(string2, string3, (String)objectArray);
                n4 = (int)(this.u7() ? 1 : 0);
                if (n4 != 0) {
                    object = StringCompanionObject.INSTANCE;
                    n4 = R$string.acc_alert_message;
                    object = hv3_0.K(n4);
                    n10 = R$string.select_the_size;
                    object2 = hv3_0.K(n10);
                    objectArray = new Object[n7];
                    objectArray[0] = object2;
                    String string4 = "format(...)";
                    object = xh2_0.a(objectArray, n7, (String)object, string4);
                    n7 = R$string.select_the_size;
                    String string5 = hv3_0.K(n7);
                    this.showNotification(string5, (String)object);
                    return;
                }
                object = this.K0;
                if (object != null && (n4 = (int)(((O63)object).h() ? 1 : 0)) == n7) {
                    object = this.g;
                    if (object == null) {
                        object = "productDetailListener";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    } else {
                        object2 = object;
                    }
                    n4 = R$string.select_the_size;
                    object = this.getString(n4);
                    String string6 = "getString(...)";
                    Intrinsics.checkNotNullExpressionValue(object, string6);
                    object2.w1((String)object);
                    return;
                }
                this.Wb();
                return;
            }
            object = this.K0;
            if (object != null && (n4 = (int)(((O63)object).h() ? 1 : 0)) == n7 && (object = this.K0) != null) {
                ((O63)object).c();
            }
            if ((object = this.cb()) != null) {
                object = this.G0;
                TextView textView = this.D0;
                Intrinsics.checkNotNull(textView);
                String string7 = ((Object)textView.getText()).toString();
                n4 = (int)(kotlin.text.b.i((String)object, string7, n7 != 0) ? 1 : 0);
                if (n4 != 0) {
                    AJIOApplication.Companion.getClass();
                    object = FirebaseAnalytics.getInstance((Context)AJIOApplication$a.a());
                    String string8 = this.G0;
                    Intrinsics.checkNotNull(string8);
                    Bundle bundle = new Bundle();
                    ((FirebaseAnalytics)object).logEvent(string8, bundle);
                    this.Qa();
                    return;
                }
            }
            n4 = R$string.view_bag;
            object = this.getString(n4);
            TextView textView = this.D0;
            Intrinsics.checkNotNull(textView);
            String string9 = ((Object)textView.getText()).toString();
            n4 = (int)(kotlin.text.b.i((String)object, string9, n7 != 0) ? 1 : 0);
            if (n4 == 0) return;
            this.wb();
            return;
        }
        n8 = R$id.add_to_closet;
        object2 = this.z1;
        if (object != null && (n14 = ((Integer)object).intValue()) == n8) {
            object = (zp2_1)((D)object2).getValue();
            object.getClass();
            this.Ra();
            return;
        }
        n8 = R$id.added_to_closet;
        if (object != null && (n14 = ((Integer)object).intValue()) == n8) {
            object = (zp2_1)((D)object2).getValue();
            object.getClass();
            this.g5();
            return;
        }
        n8 = R$id.pdp_share;
        if (object == null || (n10 = ((Integer)object).intValue()) != n8) {
            n8 = R$id.pdp_share_fleek;
            if (object == null || (n10 = ((Integer)object).intValue()) != n8) {
                n7 = R$id.pdp_refresh;
                if (object == null) {
                    return;
                }
                n4 = (Integer)object;
                if (n4 != n7) return;
                this.W4();
                return;
            }
        }
        if ((n4 = (int)(this.S ? 1 : 0)) != 0) return;
        this.S = n7;
        object = this.cb();
        String string10 = this.o5();
        ((e12_0)object).v(string10);
    }

    public final void onCreate(Bundle object) {
        Object object2;
        super.onCreate((Bundle)object);
        object = fq2_1.f;
        if (object == null) {
            object = FirebasePerformance.getInstance();
            object2 = "page_load_pdp_v2";
            fq2_1.f = object = ((FirebasePerformance)object).newTrace((String)object2);
        }
        if ((object = fq2_1.f) != null) {
            ((Trace)object).start();
        }
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object4 = this.getDefaultViewModelCreationExtras();
        Object object5 = "store";
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        String string2 = "factory";
        Intrinsics.checkNotNullParameter(object3, string2);
        String string3 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object4, string3);
        Object object6 = r43_0.class;
        String string4 = "modelClass";
        object2 = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object4, object6, string4);
        object3 = "<this>";
        object4 = sw0_0.a(object6, (String)object3, object6, string4, string4);
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        object6 = object4.getQualifiedName();
        String string5 = "Local and anonymous classes can not be ViewModels";
        if (object6 != null) {
            String string6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object6 = string6.concat((String)object6);
            this.Q = object2 = (r43_0)((pD3)object2).a((yn1_2)object4, (String)object6);
            Intrinsics.checkNotNullParameter(this, (String)object);
            object2 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object);
            object4 = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(this, (String)object);
            object = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object2, (String)object5);
            Intrinsics.checkNotNullParameter(object4, string2);
            Intrinsics.checkNotNullParameter(object, string3);
            object5 = gE2.class;
            object = rl3_0.b((rd3_0)object2, (E$b)object4, (Wd0)object, (Class)object5, string4);
            object2 = sw0_0.a((Class)object5, (String)object3, (Class)object5, string4, string4);
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            object3 = object2.getQualifiedName();
            if (object3 != null) {
                long l2;
                boolean bl2;
                object3 = string6.concat((String)object3);
                this.q = object = (gE2)((pD3)object).a((yn1_2)object2, (String)object3);
                object = (ri2_0)((bu2_0)this.E.getValue()).b.d();
                if (object != null) {
                    this.R = object;
                }
                if ((object = this.R) != null) {
                    object = this.cb();
                    object2 = this.R;
                    Intrinsics.checkNotNull(object2);
                    object2 = ((ri2_0)object2).p;
                    object.getClass();
                    object = this.cb();
                    object2 = this.R;
                    object3 = null;
                    object2 = object2 != null ? ((ri2_0)object2).r : null;
                    ((e12_0)object).K0 = object2;
                    bl2 = this.u7();
                    if (bl2) {
                        object = this.cb();
                        object2 = this.R;
                        object2 = object2 != null ? ((ri2_0)object2).o : null;
                        ((e12_0)object).H0 = object2;
                    }
                    if ((object = this.R) != null) {
                        object3 = ((ri2_0)object).d;
                    }
                    object = "luxe";
                    this.f1 = bl2 = ((String)object).equalsIgnoreCase((String)object3);
                }
                object = z40_0.Companion;
                this.G0 = object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("pdpBtnText");
                this.U0 = l2 = System.currentTimeMillis();
                object2 = this.requireContext();
                object3 = "requireContext(...)";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                this.n = object = new ma_2((Context)object2);
                bl2 = this.c7();
                if (bl2) {
                    bl2 = false;
                    object = null;
                    gv_1.b = false;
                }
                return;
            }
            object2 = string5.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = string5.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void onCreateOptionsMenu(Menu menu2, MenuInflater object) {
        int n3;
        Intrinsics.checkNotNullParameter(menu2, "menu");
        Intrinsics.checkNotNullParameter(object, "inflater");
        String string2 = this.o5();
        Object object2 = ld3_2.STORE_AJIOGRAM.getStoreId();
        int n4 = Intrinsics.areEqual(string2, object2);
        if (n4 != 0) {
            n4 = R$menu.menu_pdp_fleek;
            object.inflate(n4, menu2);
        } else {
            n4 = R$menu.menu_pdp;
            object.inflate(n4, menu2);
        }
        n4 = R$id.cart;
        string2 = menu2.findItem(n4);
        Intrinsics.checkNotNullExpressionValue(string2, "findItem(...)");
        object2 = string2.getActionView();
        int n7 = 0;
        Object object3 = null;
        if (object2 != null) {
            int n8 = R$id.menu_cart_count_tv;
            object2 = (AjioTextView)object2.findViewById(n8);
        } else {
            n3 = 0;
            object2 = null;
        }
        this.c1 = object2;
        object2 = string2.getActionView();
        if (object2 != null) {
            n7 = R$id.closet_menu_pdp;
            object3 = object2 = object2.findViewById(n7);
            object3 = (ImageView)object2;
        }
        if (object3 != null) {
            n3 = R$string.wish_list;
            object2 = hv3_0.K(n3);
            object3.setContentDescription((CharSequence)object2);
        }
        this.Zb();
        super.onCreateOptionsMenu(menu2, (MenuInflater)object);
        menu2 = string2.getActionView();
        if (menu2 != null) {
            object = new M12(this);
            menu2.setOnClickListener((View.OnClickListener)object);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        object = new LinearLayoutManager((Context)aJIOApplication, 0, false);
        this.L0 = object;
        int n3 = this.u7();
        if (n3 != 0) {
            n3 = R$layout.new_pdp_layout_mini;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.new_pdp_layout;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onDestroy() {
        boolean bl2;
        super.onDestroy();
        ArrayList arrayList = this.B1;
        Iterator iterator = arrayList.iterator();
        while (bl2 = iterator.hasNext()) {
            ob_2 ob_22 = (ob_2)iterator.next();
            if (ob_22 == null) continue;
            ob_22.l();
        }
        arrayList.clear();
        eb_2.b = null;
        eb_2.f = null;
        eb_2.d.clear();
        arrayList = new Message();
        ((Message)arrayList).what = 1002;
        AnalyticsGAEventHandler.Companion.getInstance().sendMessage((Message)arrayList);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        Object object = this.g;
        int n3 = 0;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productDetailListener");
            object = null;
        }
        object.X1();
        this.K0 = null;
        this.L0 = null;
        object = this.w0;
        if (object != null && (object = ((PDPCustomDoDView)((Object)object)).getDodCountDownTimer()) != null) {
            object = this.w0;
            if (object != null && (object = ((PDPCustomDoDView)((Object)object)).getDodCountDownTimer()) != null) {
                object.cancel();
            }
            if ((object = this.w0) != null) {
                ((PDPCustomDoDView)((Object)object)).setDodCountDownTimer(null);
            }
            this.w0 = null;
        }
        if ((object = this.h) == null) {
            object = "activityFragmentListener";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        object2.stopLoader();
        this.cb().y();
        object = new Message();
        ((Message)object).what = n3 = 1002;
        object2 = AnalyticsGAEventHandler.Companion.getInstance();
        object2.sendMessage((Message)object);
        object = this.q1;
        if (object != null) {
            ((pg2_2)object).a();
        }
        object = this.G;
        object2 = "pdp screen";
        ((NewEEcommerceEventsRevamp)object).setPreviousScreenData((String)object2, (String)object2);
        object = this.getContext();
        if (object != null) {
            object = this.getContext();
            cc1_0.b((Context)object);
        }
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        boolean bl2;
        Object object = this.R;
        if (object != null) {
            object = ((ri2_0)object).d;
        } else {
            bl2 = false;
            object = null;
        }
        String string2 = ld3_2.STORE_AJIOGRAM.getStoreId();
        bl2 = Intrinsics.areEqual(object, string2);
        if (bl2) {
            bundle = super.onGetLayoutInflater(bundle);
            string2 = this.requireContext();
            int n3 = R$style.FleekTheme;
            object = new d80((Context)string2, n3);
            bundle = bundle.cloneInContext((Context)object);
            Intrinsics.checkNotNullExpressionValue(bundle, "cloneInContext(...)");
            return bundle;
        }
        return super.onGetLayoutInflater(bundle);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        NewProductDetailsFragment newProductDetailsFragment = this;
        Object object = "item";
        Object object2 = menuItem;
        Intrinsics.checkNotNullParameter(menuItem, (String)object);
        int n3 = menuItem.getItemId();
        int n4 = R$id.closet_menu_pdp;
        if (n3 == n4) {
            object = new Bundle();
            object2 = this.Wa();
            int n7 = ((jo_2)object2).d();
            object2 = n7 > 0 ? "non-empty" : "empty";
            object.putString("cart_status", (String)object2);
            Object object3 = newProductDetailsFragment.H;
            String string2 = ((NewCustomEventsRevamp)object3).getEC_USER_INTERACTION();
            object2 = newProductDetailsFragment.H;
            String string3 = ((NewCustomEventsRevamp)object2).getEA_NAV_CLICK_HEADER();
            String string4 = ((NewCustomEventsRevamp)object2).getEN_NAV_CLICK();
            object2 = AnalyticsManager.Companion;
            String string5 = av_0.a((AnalyticsManager$Companion)object2);
            String string6 = av_0.a((AnalyticsManager$Companion)object2);
            String string7 = newProductDetailsFragment.n1;
            String string8 = newProductDetailsFragment.o1;
            int n8 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string2, string3, "Closet Button", string4, string5, string6, string7, null, string8, false, null, n8, null);
            object2 = ((AnalyticsManager$Companion)object2).getInstance();
            GTMEvents gTMEvents = ((AnalyticsManager)object2).getGtmEvents();
            AnalyticsData analyticsData = ne_0.b((Bundle)object);
            int n10 = 16;
            string6 = null;
            object3 = "Header Click";
            string2 = "Proceed to Closet";
            string3 = "pdp screen";
            string4 = null;
            GTMEvents.pushButtonTapEvent$default(gTMEvents, (String)object3, string2, string3, analyticsData, null, n10, null);
            object = newProductDetailsFragment.l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cartClosetListener");
                n3 = 0;
                object = null;
            }
            object.B0();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onPause() {
        Object object;
        super.onPause();
        Object object2 = null;
        this.p = false;
        int n3 = gz3.a;
        int n4 = 23;
        if (n3 <= n4) {
            object2 = this.n;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ajioVideoPlayer");
                n3 = 0;
                object2 = null;
            }
            ((ma_2)object2).m();
            object2 = xl1_1.STOP;
            object = new Intent("media_stop_notification");
            String string2 = "action_type";
            object.putExtra(string2, (Serializable)object2);
            object2 = Xv1.a(this.requireContext());
            ((Xv1)object2).c((Intent)object);
        }
        object2 = this.B1.iterator();
        while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object = (ob_2)object2.next();
            if (object == null) continue;
            ((ob_2)object).j();
        }
    }

    public final void onResume() {
        String string2;
        super.onResume();
        Object object = this.getActivity();
        if (object != null) {
            string2 = this.o5();
            tm3_0.e((FragmentActivity)object, string2);
        }
        object = this.G;
        this.n1 = string2 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        this.o1 = object = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        boolean bl2 = this.f1;
        if (!bl2 && !(bl2 = this.u7())) {
            object = this.kb();
            object.T1();
            this.qb();
        }
        this.C0();
    }

    public final void onStart() {
        super.onStart();
        boolean bl2 = this.f1;
        if (!bl2 && !(bl2 = this.u7())) {
            fo3 fo32 = this.kb();
            fo32.T1();
        } else {
            fo3 fo33 = this.kb();
            fo33.hideToolbarLayout();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onStop() {
        super.onStop();
        var1_1 = this.o5();
        var2_2 = ld3_2.STORE_AJIOGRAM;
        var3_3 = var2_2.getStoreId();
        var4_4 = Intrinsics.areEqual(var1_1, var3_3);
        var3_3 = "storeId";
        if (var4_4 != 0) {
            var1_1 = this.getActivity();
            if (var1_1 != null) {
                var5_5 = this.o5();
                var6_6 = "<this>";
                Intrinsics.checkNotNullParameter(var1_1, (String)var6_6);
                Intrinsics.checkNotNullParameter(var5_5, var3_3);
                var2_2 = var2_2.getStoreId();
                var7_7 = (int)Intrinsics.areEqual(var5_5, var2_2);
                var7_7 = var7_7 != 0 ? R$color.fleekColorPrimary : R$color.ajioColorPrimary;
                var7_7 = t70.getColor((Context)var1_1, var7_7);
                var5_5 = var1_1.getWindow();
                if (var5_5 != null) {
                    var5_5.setStatusBarColor(var7_7);
                }
                var7_7 = (int)tm3_0.c(var7_7);
                tm3_0.f((FragmentActivity)var1_1, (boolean)var7_7);
            }
        } else {
            var1_1 = this.getActivity();
            if (var1_1 != null) {
                tm3_0.d((FragmentActivity)var1_1);
            }
        }
        var4_4 = gz3.a;
        var7_7 = 23;
        var5_5 = null;
        if (var4_4 > var7_7) {
            var1_1 = this.n;
            if (var1_1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ajioVideoPlayer");
                var4_4 = 0;
                var1_1 = null;
            }
            var1_1.m();
            var1_1 = xl1_1.STOP;
            var2_2 = new Intent("media_stop_notification");
            var6_6 = "action_type";
            var2_2.putExtra((String)var6_6, (Serializable)var1_1);
            var1_1 = Xv1.a(this.requireContext());
            var1_1.c((Intent)var2_2);
        }
        var1_1 = this.ib().e;
        var2_2 = "";
        var1_1.k(var2_2);
        var1_1 = this.ib().e;
        var6_6 = this.requireActivity();
        var1_1.getClass();
        LiveData.a("removeObservers");
        var8_8 = var1_1.b.iterator();
        while (true) {
            var9_9 = var8_8;
            var9_9 = (CR2$e)var8_8;
            var10_10 = var9_9.hasNext();
            if (!var10_10) break;
            var11_11 /* !! */  = (LiveData$c)(var9_9 = (Map.Entry)var9_9.next()).getValue();
            var10_10 = var11_11 /* !! */ .d((mu1_1)var6_6);
            if (!var10_10) continue;
            var9_9 = (F62)var9_9.getKey();
            var1_1.j((F62)var9_9);
        }
        this.V0 = var12_12 = System.currentTimeMillis();
        var1_1 = this.cb();
        var14_13 = this.V0;
        var16_14 = this.U0;
        var18_15 = this.I0;
        var19_16 = this.J0;
        var1_1.getClass();
        var9_9 = this.W0;
        var20_17 = TextUtils.isEmpty((CharSequence)var9_9);
        if (!var20_17 && (var25_20 = (cfr_temp_0 = (var21_18 = var14_13 - var16_14) - (var23_19 = 1000L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) > 0 && var18_15 == 0 && !var19_16 && (var18_15 = var1_1.u()) != 0) {
            var6_6 = var1_1.q;
            Intrinsics.checkNotNull(var6_6);
            var8_8 = var6_6.getPrice();
            if (var8_8 != null) {
                var8_8 = var8_8.getValue();
            } else {
                var19_16 = false;
                var8_8 = null;
            }
            var19_16 = TextUtils.isEmpty((CharSequence)var8_8);
            if (var19_16) {
                var8_8 = "0";
lbl86:
                // 2 sources

                while (true) {
                    var9_9 = var8_8;
                    break;
                }
            } else {
                var8_8 = var6_6.getPrice();
                if (var8_8 != null) {
                    var8_8 = var8_8.getValue();
                    ** continue;
                }
                var20_17 = false;
                var9_9 = null;
            }
            var8_8 = var1_1.Q;
            var19_16 = TextUtils.isEmpty((CharSequence)var8_8);
            if (var19_16) lbl-1000:
            // 2 sources

            {
                while (true) {
                    continue;
                    break;
                }
            }
            var2_2 = var1_1.Q;
            ** continue;
            var11_11 /* !! */  = var2_2;
            var8_8 = var6_6.getCode();
            Intrinsics.checkNotNull(var8_8);
            var26_21 = 32;
            var25_20 = 0;
            var6_6 = var2_2;
            var2_2 = new SearchRv((String)var8_8, (String)var9_9, (String)var11_11 /* !! */ , var16_14, var14_13, null, var26_21, null);
            var1_1 = md3_0.c((jD3)var1_1);
            var6_6 = new f12_0((SearchRv)var2_2, null);
            var7_7 = 3;
            Ae3.d((i90_0)var1_1, null, null, (Function2)var6_6, var7_7);
        }
        this.kb().hideToolbarLayout();
        var1_1 = this.G;
        var2_2 = "pdp screen";
        var1_1.setPreviousScreenData((String)var2_2, (String)var2_2);
        var1_1 = AnalyticsGAEventHandler.Companion.getInstance();
        var2_2 = new Message();
        var2_2.what = var18_15 = 1004;
        var1_1.sendMessage((Message)var2_2);
        var4_4 = this.c7();
        if (var4_4 != 0) {
            var1_1 = this.o5();
            Intrinsics.checkNotNullParameter(var1_1, var3_3);
            var2_2 = h40_0.a;
            var4_4 = h40_0.t2((String)var1_1);
            if (var4_4 != 0 && (var1_1 = gv_1.a) != null && (var7_7 = var1_1.f) == (var27_22 = 1)) {
                var1_1.h();
            }
        }
        this.cb().D = null;
        var1_1 = this.B1.iterator();
        while ((var7_7 = var1_1.hasNext()) != 0) {
            var2_2 = (ob_2)var1_1.next();
            if (var2_2 == null) continue;
            var2_2.j();
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        int n4;
        int n7;
        Object object3;
        Object object4;
        int n8;
        int n10;
        Intrinsics.checkNotNullParameter(object, "mainView");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.getView();
        int n14 = 0;
        Object object5 = null;
        if (object2 != null) {
            n10 = R$id.luxe_plp_toolbar;
            object2 = (Toolbar)object2.findViewById(n10);
        } else {
            n8 = 0;
            object2 = null;
        }
        this.y0 = object2;
        object2 = this.j;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabListener");
            n8 = 0;
            object2 = null;
        }
        n10 = 0;
        Object object6 = null;
        object2.showTabLayout(false);
        n8 = this.f1;
        int n15 = 8;
        boolean bl2 = true;
        Object object7 = "";
        if (n8 == 0) {
            n8 = this.u7();
            if (n8 == 0) {
                this.setHasOptionsMenu(bl2);
                object2 = this.getActivity();
                if (object2 != null) {
                    object2 = (AppCompatActivity)object2;
                    object6 = this.kb().getToolbar();
                    object2.setSupportActionBar((Toolbar)object6);
                    this.kb().T1();
                    object6 = this.kb().getToolbar();
                    if (object6 != null) {
                        object4 = AjioCustomToolbar$DisplayMode.TITLE;
                        ((AjioCustomToolbar)object6).setDisplayMode((AjioCustomToolbar$DisplayMode)((Object)object4));
                    }
                    if ((object6 = this.kb().getToolbar()) != null) {
                        ((AjioCustomToolbar)object6).setTitle((CharSequence)object7);
                    }
                    if ((object6 = object2.getSupportActionBar()) != null) {
                        ((ActionBar)object6).n(bl2);
                    }
                    n10 = (n10 = (int)(Intrinsics.areEqual(object6 = this.o5(), object3 = ((ld3_2)((Object)(object4 = ld3_2.STORE_AJIOGRAM))).getStoreId()) ? 1 : 0)) != 0 ? R$drawable.back_arrow_fleek : R$drawable.nav_back;
                    object3 = object2.getSupportActionBar();
                    if (object3 != null) {
                        ((ActionBar)object3).u(n10);
                    }
                    if ((object6 = object2.getSupportActionBar()) != null) {
                        n7 = R$string.back_button_text;
                        object3 = this.getString(n7);
                        ((ActionBar)object6).t((String)object3);
                    }
                    if ((object6 = this.kb().getToolbar()) != null) {
                        object6.setContentDescription((CharSequence)object7);
                    }
                    if ((object6 = this.kb().getToolbar()) != null) {
                        ((AjioCustomToolbar)object6).setProductListTitleText((String)object7);
                    }
                    if ((object6 = this.kb().getToolbar()) != null) {
                        ((AjioCustomToolbar)object6).setProductListDetailText((String)object7);
                    }
                    if ((n10 = (int)(Intrinsics.areEqual(object6 = this.o5(), object7 = ((ld3_2)((Object)object4)).getStoreId()) ? 1 : 0)) != 0) {
                        this.qb();
                        object6 = this.kb().getToolbar();
                        if (object6 != null) {
                            n4 = hv3_0.m(R$color.plp_bg);
                            ((AjioCustomToolbar)object6).setToolbarBgColor(n4);
                        }
                    } else {
                        object6 = this.kb().getToolbar();
                        if (object6 != null) {
                            n4 = hv3_0.m(R$color.white);
                            ((AjioCustomToolbar)object6).setToolbarBgColor(n4);
                        }
                    }
                    if ((object6 = this.kb().getToolbar()) != null) {
                        n3 = 0;
                        object4 = null;
                        object7 = new O12(0, this, object2);
                        ((Toolbar)object6).setNavigationOnClickListener((View.OnClickListener)object7);
                    }
                }
            }
        } else {
            this.setHasOptionsMenu(false);
            object2 = this.y0;
            if (object2 != null) {
                object2.setVisibility(0);
            }
            this.kb().hideToolbarLayout();
            object2 = this.getActivity();
            n8 = object2 instanceof AppCompatActivity;
            if (n8 != 0) {
                object2 = this.getActivity();
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                object2 = (AppCompatActivity)object2;
                object4 = this.y0;
                object2.setSupportActionBar((Toolbar)object4);
            }
            if ((object2 = this.y0) != null) {
                n3 = R$id.luxe_toolbar_navigation_iv;
                object2 = (ImageView)object2.findViewById(n3);
            } else {
                n8 = 0;
                object2 = null;
            }
            object4 = this.y0;
            if (object4 != null) {
                object4.setContentDescription((CharSequence)object7);
            }
            if (object2 != null) {
                object7 = new p12_0(this);
                object2.setOnClickListener((View.OnClickListener)object7);
            }
            if ((object2 = this.y0) != null && (object2 = object2.findViewById(n4 = R$id.luxe_toolbar_cart_view)) != null) {
                object7 = new q12_0(this);
                object2.setOnClickListener((View.OnClickListener)object7);
            }
            this.Lb();
            object2 = this.y0;
            if (object2 != null && (object2 = object2.findViewById(n4 = R$id.luxe_toolbar_search_iv)) != null) {
                object2.setVisibility(n15);
            }
            if ((object2 = this.y0) != null && (object2 = object2.findViewById(n4 = R$id.luxe_toolbar_wishlist_iv)) != null) {
                object2.setVisibility(0);
            }
            if ((object2 = this.y0) != null && (object2 = object2.findViewById(n10 = R$id.luxe_toolbar_wishlist_iv)) != null) {
                object6 = new r12_0(this);
                object2.setOnClickListener((View.OnClickListener)object6);
            }
        }
        if ((object2 = this.k) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeListener");
            n8 = 0;
            object2 = null;
        }
        if ((object2 = object2.b0()) != null) {
            object2.setDrawerLockMode((int)(bl2 ? 1 : 0));
        }
        n8 = R$id.pdp_rv;
        this.L = object2 = (RecyclerView)object.findViewById(n8);
        n8 = R$id.main_pdp_layout;
        object2 = object.findViewById(n8);
        this.N = object2;
        object2 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        object6 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        object7 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        object2 = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object6, "store");
        Intrinsics.checkNotNullParameter(object7, "factory");
        Intrinsics.checkNotNullParameter(object2, "defaultCreationExtras");
        object4 = oa1_1.class;
        object3 = "modelClass";
        object2 = rl3_0.b((rd3_0)object6, (E$b)object7, (Wd0)object2, (Class)object4, (String)object3);
        object6 = "<this>";
        object7 = sw0_0.a((Class)object4, (String)object6, (Class)object4, (String)object3, (String)object3);
        Intrinsics.checkNotNullParameter(object7, (String)object6);
        object6 = object7.getQualifiedName();
        if (object6 != null) {
            NewProductDetailsFragment$f newProductDetailsFragment$f;
            object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object6 = ((String)object4).concat((String)object6);
            this.B = object2 = (oa1_1)object2.a((yn1_2)object7, (String)object6);
            n8 = (int)(this.f1 ? 1 : 0);
            if (n8 != 0) {
                n8 = R$id.luxe_footer_layout;
                object2 = object.findViewById(n8);
            } else {
                n8 = R$id.footer_layout;
                object2 = object.findViewById(n8);
            }
            this.r0 = object2;
            n8 = R$id.parent_footer_layout;
            object2 = (LinearLayout)object.findViewById(n8);
            this.s0 = object2;
            object2 = this.r0;
            object6 = "footerView";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n8 = 0;
                object2 = null;
            }
            n4 = R$id.add_to_cart_layout;
            object2 = (LinearLayout)object2.findViewById(n4);
            this.A0 = object2;
            n8 = R$id.shadow_layout;
            object2 = object.findViewById(n8);
            this.x0 = object2;
            object2 = this.A0;
            if (object2 != null) {
                object2.setOnClickListener((View.OnClickListener)this);
            }
            if ((object2 = this.r0) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n8 = 0;
                object2 = null;
            }
            n4 = R$id.add_to_cart_imv;
            object2 = (ImageView)object2.findViewById(n4);
            this.B0 = object2;
            object2 = this.r0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n8 = 0;
                object2 = null;
            }
            n4 = R$id.add_to_cart_tv;
            object2 = (TextView)object2.findViewById(n4);
            this.D0 = object2;
            object2 = this.r0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n8 = 0;
                object2 = null;
            }
            n4 = R$id.add_to_closet;
            object2 = (ImageButton)object2.findViewById(n4);
            this.J = object2;
            object7 = "addToCloset";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n8 = 0;
                object2 = null;
            }
            object2.setOnClickListener((View.OnClickListener)this);
            object2 = this.r0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n8 = 0;
                object2 = null;
            }
            n3 = R$id.added_to_closet;
            object2 = object2.findViewById(n3);
            this.K = object2;
            if (object2 != null) {
                object2.setOnClickListener((View.OnClickListener)this);
            }
            if ((object2 = this.r0) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n8 = 0;
                object2 = null;
            }
            n3 = R$id.pdp_share;
            object2 = (ImageButton)object2.findViewById(n3);
            this.F0 = object2;
            if (object2 != null) {
                object2.setOnClickListener((View.OnClickListener)this);
            }
            if ((object2 = this.r0) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n8 = 0;
                object2 = null;
            }
            n10 = R$id.pdp_share_fleek;
            object2 = (LottieAnimationView)object2.findViewById(n10);
            object6 = this.o5();
            n10 = (int)(Intrinsics.areEqual(object6, object4 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0);
            if (n10 != 0) {
                object6 = this.F0;
                if (object6 != null) {
                    ai0_2.i((View)object6);
                }
                if (object2 != null) {
                    ai0_2.B((View)object2);
                }
                if (object2 != null) {
                    object2.setOnClickListener((View.OnClickListener)this);
                }
            } else {
                object6 = this.F0;
                if (object6 != null) {
                    ai0_2.B((View)object6);
                }
                if (object2 != null) {
                    ai0_2.i((View)object2);
                }
            }
            n8 = R$id.pdp_shimmer_view;
            object2 = (ShimmerFrameLayout)object.findViewById(n8);
            this.O = object2;
            n8 = R$id.product_details_progress_bar;
            object2 = (AjioProgressView)object.findViewById(n8);
            n8 = R$id.pdp_refresh;
            object2 = (TextView)object.findViewById(n8);
            if (object2 != null) {
                object2.setOnClickListener((View.OnClickListener)this);
            }
            n8 = R$id.pdp_price_error_layout;
            object2 = object.findViewById(n8);
            this.j1 = object2;
            n8 = R$id.pdp_recalculate_tv;
            object2 = (TextView)object.findViewById(n8);
            this.k1 = object2;
            n8 = R$id.confettiSaleAnim;
            object2 = (LottieAnimationView)object.findViewById(n8);
            this.p1 = object2;
            object3 = this.requireContext();
            Intrinsics.checkNotNullExpressionValue(object3, "requireContext(...)");
            this.cb();
            this.mb();
            Object object8 = object6 = this.w.getValue();
            object8 = (UserInformation)object6;
            object6 = "<get-userInformation>(...)";
            Intrinsics.checkNotNullExpressionValue(object8, (String)object6);
            object4 = object2;
            object2 = new B02((Context)object3, (View)object, (UserInformation)object8, this, this);
            this.p0 = object2;
            object2 = this.L;
            if (object2 != null) {
                object6 = new NewProductDetailsFragment$e(this);
                object2.addOnScrollListener((RecyclerView$s)object6);
            }
            if ((object2 = this.getActivity()) != null && (n8 = (int)((object2 = this.requireActivity()).isFinishing() ? 1 : 0)) == 0) {
                object2 = this.ib().e;
                object6 = this.requireActivity();
                n7 = 0;
                object4 = new n12_0(this, 0);
                object3 = new NewProductDetailsFragment$f((Function1)object4);
                object2.e((mu1_1)object6, (F62)object3);
            }
            n8 = (int)(this.f1 ? 1 : 0);
            object6 = "sliderSizeView";
            if (n8 != 0) {
                n8 = R$id.luxe_new_pdp_size_layout;
                object2 = object.findViewById(n8);
                this.u0 = object2;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n8 = 0;
                    object2 = null;
                }
                n3 = R$id.luxe_main_pdp_size_layout;
                object2 = (LinearLayout)object2.findViewById(n3);
                this.v0 = object2;
            } else {
                n8 = R$id.new_pdp_size_layout;
                object2 = object.findViewById(n8);
                this.u0 = object2;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n8 = 0;
                    object2 = null;
                }
                n3 = R$id.main_pdp_size_layout;
                object2 = (LinearLayout)object2.findViewById(n3);
                this.v0 = object2;
                n8 = (int)(this.u7() ? 1 : 0);
                if (n8 == 0) {
                    n8 = R$id.refereeWidget;
                    object2 = object.findViewById(n8);
                    this.r1 = object2;
                }
            }
            object2 = this.u0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n8 = 0;
                object2 = null;
            }
            object2.setOnTouchListener((View.OnTouchListener)this);
            n8 = R$id.pdp_deal_layout;
            object2 = (PDPCustomDoDView)object.findViewById(n8);
            this.w0 = object2;
            n8 = (int)(this.u7() ? 1 : 0);
            if (n8 != 0) {
                object2 = this.w0;
                if (object2 != null) {
                    object2.setVisibility(n15);
                }
                if ((object2 = this.J) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    n8 = 0;
                    object2 = null;
                }
                object2.setVisibility(n15);
                object2 = this.F0;
                if (object2 != null) {
                    object2.setVisibility(n15);
                }
            } else {
                object2 = this.w0;
                if (object2 != null) {
                    object2.b();
                }
                if ((object2 = this.w0) != null) {
                    object2.setPdpInfoProvider(this);
                }
                if ((object2 = this.w0) != null) {
                    object2.setOnScreenFooterView(bl2);
                }
                if ((object2 = this.w0) != null) {
                    object2.setPdpInfoSetter(this);
                }
                if ((object2 = this.w0) != null) {
                    object2.setDodTimerFinishListener(this);
                }
                if ((object2 = this.w0) != null) {
                    object6 = this.requireActivity().getSupportFragmentManager();
                    object2.setSupportFragmentManager((FragmentManager)object6);
                }
            }
            n8 = R$id.inapp_update_widget;
            object = (InAppBottomUpdatesView)object.findViewById(n8);
            this.t1 = object;
            this.Sa();
            object = this.q;
            if (object != null) {
                object2 = this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(object2, "getViewLifecycleOwner(...)");
                object6 = new v12_0(this);
                newProductDetailsFragment$f = new NewProductDetailsFragment$f((Function1)object6);
                object = ((gE2)object).a;
                ((R53)object).e((mu1_1)object2, newProductDetailsFragment$f);
            }
            object = this.mb().m;
            object2 = this.getViewLifecycleOwner();
            n15 = 1;
            object6 = new dt_0(this, n15);
            newProductDetailsFragment$f = new NewProductDetailsFragment$f((Function1)object6);
            ((LiveData)object).e((mu1_1)object2, newProductDetailsFragment$f);
            object = this.B;
            if (object == null) {
                object = "loginViewModel";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object5 = object;
            }
            object = ((oa1_1)object5).t;
            object2 = this.getViewLifecycleOwner();
            object5 = new et_0(this, 1);
            object6 = new NewProductDetailsFragment$f((Function1)object5);
            ((LiveData)object).e((mu1_1)object2, (F62)object6);
            object = this.cb().T0;
            object2 = this.getViewLifecycleOwner();
            n10 = 2;
            object5 = new ft_1(this, n10);
            object6 = new NewProductDetailsFragment$f((Function1)object5);
            ((LiveData)object).e((mu1_1)object2, (F62)object6);
            object = this.Q;
            if (object != null && (object = ((r43_0)object).d) != null) {
                object2 = this.getViewLifecycleOwner();
                n10 = 2;
                object5 = new gt_0(this, n10);
                object6 = new NewProductDetailsFragment$f((Function1)object5);
                ((LiveData)object).e((mu1_1)object2, (F62)object6);
            }
            object = this.cb().l1;
            object2 = this.getViewLifecycleOwner();
            object5 = new ht_1(this, 2);
            object6 = new NewProductDetailsFragment$f((Function1)object5);
            ((LiveData)object).e((mu1_1)object2, (F62)object6);
            object = this.cb().j1;
            object2 = this.getViewLifecycleOwner();
            object5 = new ya_0(this, 1);
            object6 = new NewProductDetailsFragment$f((Function1)object5);
            ((LiveData)object).e((mu1_1)object2, (F62)object6);
            object = this.ib().h;
            object2 = this.getViewLifecycleOwner();
            object5 = new b22_0(this, 0);
            object6 = new NewProductDetailsFragment$f((Function1)object5);
            ((LiveData)object).e((mu1_1)object2, (F62)object6);
            object = this.cb().R0;
            object2 = this.getViewLifecycleOwner();
            object5 = new NT(this, 1);
            ((LiveData)object).e((mu1_1)object2, (F62)object5);
            object = this.cb().p.e;
            object2 = this.getViewLifecycleOwner();
            object5 = new c22_0(this);
            ((LiveData)object).e((mu1_1)object2, (F62)object5);
            object = this.cb().M0;
            object2 = this.getViewLifecycleOwner();
            object5 = new st_0(this, 2);
            object6 = new NewProductDetailsFragment$f((Function1)object5);
            ((LiveData)object).e((mu1_1)object2, (F62)object6);
            object = this.cb().O0;
            object2 = this.getViewLifecycleOwner();
            object5 = new tt_1(this, 1);
            object6 = new NewProductDetailsFragment$f((Function1)object5);
            ((LiveData)object).e((mu1_1)object2, (F62)object6);
            object = this.cb().Q0;
            object2 = this.getViewLifecycleOwner();
            object5 = new W12(this);
            ((LiveData)object).e((mu1_1)object2, (F62)object5);
            object = this.cb().X0;
            object2 = this.getViewLifecycleOwner();
            object5 = new me1_0(this, 1);
            object6 = new NewProductDetailsFragment$f((Function1)object5);
            ((LiveData)object).e((mu1_1)object2, (F62)object6);
            object = this.cb().Z0;
            object2 = this.getViewLifecycleOwner();
            object5 = new X12(this);
            ((LiveData)object).e((mu1_1)object2, (F62)object5);
            object = this.cb().b1;
            object2 = this.getViewLifecycleOwner();
            object5 = new Y12(this, 0);
            ((LiveData)object).e((mu1_1)object2, (F62)object5);
            object = this.cb().d1;
            object2 = this.getViewLifecycleOwner();
            object5 = new pa_0(this, 2);
            object6 = new NewProductDetailsFragment$f((Function1)object5);
            ((LiveData)object).e((mu1_1)object2, (F62)object6);
            object = this.cb().V0;
            object2 = this.getViewLifecycleOwner();
            object5 = new at_1(this, 2);
            object6 = new NewProductDetailsFragment$f((Function1)object5);
            ((LiveData)object).e((mu1_1)object2, (F62)object6);
            object = this.cb().p.g;
            object2 = this.getViewLifecycleOwner();
            object5 = new bt_1(this, 1);
            object6 = new NewProductDetailsFragment$f((Function1)object5);
            ((LiveData)object).e((mu1_1)object2, (F62)object6);
            object = ((BannerAdViewModel)this.A.getValue()).getAdditionalBannerLD();
            object2 = this.getViewLifecycleOwner();
            n10 = 1;
            object5 = new ct_1(this, n10);
            object6 = new NewProductDetailsFragment$f((Function1)object5);
            ((LiveData)object).e((mu1_1)object2, (F62)object6);
            object = this.cb().U;
            object2 = this.getViewLifecycleOwner();
            object5 = new e22_0(this);
            object6 = new NewProductDetailsFragment$f((Function1)object5);
            ((LiveData)object).e((mu1_1)object2, (F62)object6);
            this.sb();
            object2 = Looper.getMainLooper();
            object = new Handler((Looper)object2);
            n14 = 1;
            object2 = new kd0_0(this, n14);
            long l2 = 500L;
            object.postDelayed((Runnable)object2, l2);
            boolean bl3 = h40_0.Q1();
            if (bl3 && (object = this.Wa().l()) != null) {
                this.T0 = object;
            }
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final String p7() {
        Object object = this.cb().G0;
        object = object != null ? ((PDPPriceError)object).getErrorMsg() : null;
        return object;
    }

    public final ArrayList p8() {
        Object object;
        Object object2 = this.cb();
        object2.getClass();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object3 = ((e12_0)object2).q;
        if (object3 != null) {
            Intrinsics.checkNotNull(object3);
            object3 = ((Product)object3).getCode();
            boolean bl2 = TextUtils.isEmpty((CharSequence)object3);
            if (!bl2) {
                int n3;
                cp_1.Companion.getClass();
                object3 = cp$a.c();
                object = ((e12_0)object2).q;
                if (object != null) {
                    object = ((Product)object).getBrickCode();
                } else {
                    n3 = 0;
                    object = null;
                }
                bl2 = ai0_2.d((String)object, (JSONArray)object3);
                if (bl2) {
                    int n4 = 7;
                    object = object3;
                    object3 = new MandatoryInfo(null, null, null, n4, null);
                    n3 = R$string.product_code;
                    object = hv3_0.K(n3);
                    ((MandatoryInfo)object3).setKey((String)object);
                    object = ((e12_0)object2).q;
                    if (object == null || (object = ((Product)object).getCode()) == null) {
                        object = "";
                    }
                    ((MandatoryInfo)object3).setTitle((String)object);
                    arrayList.add(object3);
                }
            }
        }
        if ((object3 = ((e12_0)object2).F) != null && (object = ((ProductOptionItem)object3).getMandatoryInfo()) != null) {
            object3 = ((ProductOptionItem)object3).getMandatoryInfo();
            Intrinsics.checkNotNull(object3);
            arrayList.addAll((Collection<Object>)object3);
        }
        if ((object2 = ((e12_0)object2).q) != null && (object3 = ((Product)object2).getMandatoryInfo()) != null) {
            object2 = ((Product)object2).getMandatoryInfo();
            Intrinsics.checkNotNull(object2);
            arrayList.addAll((Collection<Object>)object2);
        }
        return arrayList;
    }

    public final ProductOptionVariant pa() {
        return this.cb().D;
    }

    public final void pb() {
        boolean bl2;
        Object object = la0_0.SIZE_RECOMMENDATION;
        Object object2 = mz3_0.r();
        if ((object = NewProductDetailsFragment.lb((la0_0)((Object)object), object2)) == (object2 = la0_0.USER_VOICE) && (bl2 = this.vb())) {
            this.y1 = object2;
            object = this.cb();
            object.getClass();
            String string2 = "<set-?>";
            Intrinsics.checkNotNullParameter(object2, string2);
            ((e12_0)object).h1 = object2;
        }
    }

    public final void q2(String string2, String string3, int n3, boolean bl2, ProductOptionVariant productOptionVariant, boolean bl3) {
        Object object;
        String string4;
        Object object2;
        Object object3;
        Object object4;
        int n4;
        NewProductDetailsFragment newProductDetailsFragment = this;
        String string5 = string3;
        Object object5 = productOptionVariant;
        Object object6 = "sizeName";
        Intrinsics.checkNotNullParameter(string3, (String)object6);
        int n7 = 1;
        String string6 = null;
        if (bl2 && (n4 = this.c7()) != 0 && ((object4 = this.cb().q) == null || (n4 = ((Product)object4).isComingSoonProduct()) != n7)) {
            Object object7;
            Object object8;
            boolean bl4;
            Object object9;
            boolean bl5;
            String string7;
            Object object10;
            boolean bl6;
            this.cb().E = null;
            this.cb().P = null;
            this.cb().Q = null;
            this.cb().y();
            this.cb().getClass();
            object6 = this.cb().q;
            if (object6 != null) {
                object6 = ((Product)object6).getCode();
            } else {
                bl6 = false;
                object6 = null;
            }
            if (object6 != null) {
                if (object5 != null) {
                    object6 = productOptionVariant.getCode();
                } else {
                    bl6 = false;
                    object6 = null;
                }
                if (object6 != null) {
                    object6 = newProductDetailsFragment.r;
                    object4 = this.cb().q;
                    if (object4 != null) {
                        object4 = ((Product)object4).getCode();
                    } else {
                        n4 = 0;
                        object4 = null;
                    }
                    Intrinsics.checkNotNull(object4);
                    object10 = productOptionVariant.getCode();
                    Intrinsics.checkNotNull(object10);
                    object6.put(object4, object10);
                }
            }
            object6 = this.cb();
            ((e12_0)object6).D = object5;
            object5 = newProductDetailsFragment.Q;
            if (object5 != null) {
                object6 = this.cb().q;
                if (object6 != null) {
                    object6 = ((Product)object6).getCode();
                } else {
                    bl6 = false;
                    object6 = null;
                }
                this.cb().u();
                object4 = h40_0.a;
                n4 = (int)(h40_0.b2() ? 1 : 0);
                string7 = this.o5();
                bl5 = this.c7();
                object9 = null;
                bl4 = false;
                object8 = null;
                int n8 = 104;
                object10 = string3;
                r43_0.b((r43_0)object5, (String)object6, n4 != 0, string3, null, null, string7, bl5, n8);
            }
            if (bl3) {
                this.I0();
                object5 = newProductDetailsFragment.K0;
                if (object5 != null) {
                    ((O63)object5).c();
                }
            }
            object6 = Looper.getMainLooper();
            object5 = new Handler((Looper)object6);
            n4 = 2;
            object6 = new so_0(newProductDetailsFragment, n4);
            long l2 = 200L;
            object5.postDelayed((Runnable)object6, l2);
            object5 = newProductDetailsFragment.L;
            if (object5 != null && (object5 = ((RecyclerView)object5).getAdapter()) != null) {
                ((RecyclerView$f)object5).notifyDataSetChanged();
            }
            object5 = d92_0.a;
            object5 = this.cb().q;
            if (object5 != null) {
                object6 = object5 = ((Product)object5).getId();
            } else {
                bl6 = false;
                object6 = null;
            }
            object4 = this.cb().K;
            object5 = this.cb().q;
            object10 = object5 != null ? (object5 = ((Product)object5).getBrandName()) : null;
            object5 = this.cb().q;
            object9 = object5 != null ? (object5 = ((Product)object5).getBrickCategory()) : null;
            object5 = this.cb().q;
            if (object5 != null) {
                object8 = object5 = ((Product)object5).getBrickName();
            } else {
                bl4 = false;
                object8 = null;
            }
            Intrinsics.checkNotNullParameter(string5, "clickedSize");
            c80 c802 = d92_0.b;
            bl5 = false;
            Object var27_36 = null;
            object5 = object7;
            string7 = string3;
            object7 = new c92_0((String)object6, (String)object4, (String)object10, (String)object9, (String)object8, string3, null);
            int n10 = 3;
            Ae3.d(c802, null, null, (Function2)object7, n10);
            object5 = this.cb();
            ((e12_0)object5).w(null);
            newProductDetailsFragment.Gb(null);
            object7 = newProductDetailsFragment.K0;
            if (object7 != null) {
                LinearLayoutManager linearLayoutManager = newProductDetailsFragment.L0;
                object5 = this.cb();
                ArrayList arrayList = ((e12_0)object5).C;
                n10 = (int)(newProductDetailsFragment.f1 ? 1 : 0);
                boolean bl7 = n10 ^ 1;
                int n14 = 8;
                Object var33_48 = null;
                O63.p((O63)object7, linearLayoutManager, arrayList, bl7, false, bl3, n14);
            }
            if ((object5 = newProductDetailsFragment.K0) != null) {
                object6 = this.cb().q;
                object4 = newProductDetailsFragment.k0;
                ((O63)object5).l((Product)object6, (ProductUserSizeRecomResponse)object4);
            }
            if ((object5 = newProductDetailsFragment.K0) != null) {
                object5 = this.cb().C;
            }
            return;
        }
        boolean bl8 = false;
        Object var25_33 = null;
        newProductDetailsFragment.p = false;
        object5 = this.cb();
        n4 = newProductDetailsFragment.u1;
        object5.getClass();
        Intrinsics.checkNotNullParameter(string5, (String)object6);
        int n15 = TextUtils.isEmpty((CharSequence)string3);
        if (n15 == 0 && (n15 = TextUtils.isEmpty((CharSequence)string2)) == 0) {
            boolean bl9;
            boolean bl10;
            object6 = new Bundle();
            Object object11 = ((e12_0)object5).k;
            Object object12 = ((NewCustomEventsRevamp)object11).getPRODUCT_NAME();
            Object object13 = ((e12_0)object5).q;
            Object object14 = "";
            if (object13 == null || (object13 = ((Product)object13).getName()) == null) {
                object13 = object14;
            }
            object6.putString((String)object12, (String)object13);
            object12 = ((NewCustomEventsRevamp)object11).getPRODUCT_ID();
            object13 = ((e12_0)object5).q;
            if (object13 == null || (object13 = ((Product)object13).getCode()) == null) {
                object13 = object14;
            }
            object6.putString((String)object12, (String)object13);
            object12 = ((NewCustomEventsRevamp)object11).getPRODUCT_BRAND();
            object13 = ((e12_0)object5).q;
            if (object13 == null || (object13 = ((Product)object13).getBrandName()) == null) {
                object13 = object14;
            }
            object6.putString((String)object12, (String)object13);
            object12 = ((NewCustomEventsRevamp)object11).getPRODUCT_PRICE();
            object13 = ((e12_0)object5).q;
            if (object13 == null || (object13 = ((Product)object13).getPrice()) == null || (object13 = ((Price)object13).getValue()) == null) {
                object13 = object14;
            }
            object6.putString((String)object12, (String)object13);
            object12 = ((NewCustomEventsRevamp)object11).getPRODUCT_COLOR();
            object13 = ((e12_0)object5).q;
            Intrinsics.checkNotNull(object13);
            object13 = hv3_0.n((Product)object13);
            object6.putString((String)object12, (String)object13);
            object12 = ((NewCustomEventsRevamp)object11).getPRODUCT_SIZE();
            object6.putString((String)object12, string5);
            object12 = ((NewCustomEventsRevamp)object11).getPRODUCT_DISCOUNT();
            object13 = e12_0.i(((e12_0)object5).F);
            object6.putString((String)object12, (String)object13);
            object12 = ((NewCustomEventsRevamp)object11).getPRODUCT_CATEGORY();
            object13 = ((e12_0)object5).q;
            if (object13 != null) {
                object13 = ((Product)object13).getBrickCategory();
            } else {
                bl10 = false;
                object13 = null;
            }
            object6.putString((String)object12, (String)object13);
            object12 = ((NewCustomEventsRevamp)object11).getPRODUCT_BRICK();
            object13 = ((e12_0)object5).q;
            if (object13 != null) {
                object13 = ((Product)object13).getBrickCategory();
            } else {
                bl10 = false;
                object13 = null;
            }
            object6.putString((String)object12, (String)object13);
            object12 = ((NewCustomEventsRevamp)object11).getPRODUCT_MRP();
            object13 = ((e12_0)object5).q;
            if (object13 != null && (object13 = ((Product)object13).getPrice()) != null) {
                object13 = ((Price)object13).getValue();
            } else {
                bl10 = false;
                object13 = null;
            }
            object6.putString((String)object12, (String)object13);
            object12 = ((NewCustomEventsRevamp)object11).getPRODUCT_TAG();
            object13 = hv3_0.a;
            Serializable serializable = ((e12_0)object5).q;
            if (serializable != null) {
                serializable = serializable.getFnlColorVariantData();
            } else {
                bl9 = false;
                serializable = null;
            }
            object13.getClass();
            object13 = hv3_0.A((ProductFnlColorVariantData)serializable);
            bl10 = TextUtils.isEmpty((CharSequence)object13);
            if (bl10) {
                object13 = object14;
            } else {
                object13 = ((e12_0)object5).q;
                if (object13 != null) {
                    object13 = ((Product)object13).getFnlColorVariantData();
                } else {
                    bl10 = false;
                    object13 = null;
                }
                object13 = hv3_0.A((ProductFnlColorVariantData)object13);
            }
            object6.putString((String)object12, (String)object13);
            object3 = ((NewCustomEventsRevamp)object11).getEC_PRODUCT_DETAILS_INTERACTIONS();
            String string8 = String.valueOf(string3);
            object12 = ((e12_0)object5).l;
            object13 = ((e12_0)object5).m;
            int n16 = 1536;
            object2 = "size change";
            string4 = "product_size_change";
            String string9 = "pdp screen";
            String string10 = "pdp screen";
            object = object11;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object11, (String)object3, (String)object2, string8, string4, string9, string10, (String)object12, (Bundle)object6, (String)object13, false, null, n16, null);
            object6 = new Bundle();
            object12 = ((NewCustomEventsRevamp)object11).getPRODUCT_NAME();
            object13 = ((e12_0)object5).q;
            if (object13 == null || (object13 = ((Product)object13).getName()) == null) {
                object13 = object14;
            }
            object6.putString((String)object12, (String)object13);
            object12 = ((NewCustomEventsRevamp)object11).getPRODUCT_ID();
            object13 = ((e12_0)object5).q;
            if (object13 == null || (object13 = ((Product)object13).getCode()) == null) {
                object13 = object14;
            }
            object6.putString((String)object12, (String)object13);
            object12 = ((NewCustomEventsRevamp)object11).getPRODUCT_BRAND();
            object5 = ((e12_0)object5).q;
            if (object5 != null && (object5 = ((Product)object5).getBrandName()) != null) {
                object14 = object5;
            }
            object6.putString((String)object12, (String)object14);
            object5 = ((NewCustomEventsRevamp)object11).getPRODUCT_SIZE();
            object6.putString((String)object5, string5);
            object5 = n4 != 0 ? "brand" : "universal";
            object4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            object11 = "Size Selection - ".concat((String)object5);
            object12 = ne_0.b((Bundle)object6);
            int n17 = 16;
            bl9 = false;
            serializable = null;
            object = null;
            object5 = object4;
            object6 = object11;
            object4 = string3;
            object11 = "pdp screen";
            bl10 = false;
            object13 = null;
            GTMEvents.pushButtonTapEvent$default((GTMEvents)object5, (String)object6, string3, (String)object11, (AnalyticsData)object12, null, n17, null);
        }
        object5 = this.cb();
        object6 = string2;
        ((e12_0)object5).w(string2);
        int n18 = newProductDetailsFragment.f1;
        if (n18 != 0) {
            n18 = this.cb().u();
            object5 = n18 != 0;
            newProductDetailsFragment.Kb((Boolean)object5, false);
        } else {
            n18 = this.cb().u();
            object5 = n18 != 0;
            newProductDetailsFragment.Hb((Boolean)object5, false);
        }
        n18 = this.u7();
        if (n18 == 0 && (object5 = newProductDetailsFragment.w0) != null) {
            ((PDPCustomDoDView)((Object)object5)).a();
        }
        if ((object5 = newProductDetailsFragment.L) != null && (object5 = ((RecyclerView)object5).getAdapter()) != null) {
            ((RecyclerView$f)object5).notifyDataSetChanged();
        }
        if ((object5 = this.cb().E) != null) {
            string6 = ((ProductOptionVariant)object5).getValue();
        }
        newProductDetailsFragment.Gb(string6);
        object5 = newProductDetailsFragment.K0;
        if (object5 != null && (n18 = ((O63)object5).h()) == n7) {
            object = newProductDetailsFragment.K0;
            if (object != null) {
                object3 = newProductDetailsFragment.L0;
                object5 = this.cb();
                object2 = ((e12_0)object5).C;
                n18 = (int)(newProductDetailsFragment.f1 ? 1 : 0);
                boolean bl11 = n18 ^ true;
                int n19 = 8;
                string4 = null;
                O63.p((O63)object, (LinearLayoutManager)object3, (ArrayList)object2, bl11, false, bl3, n19);
            }
            if ((object5 = newProductDetailsFragment.K0) != null) {
                object6 = this.cb().q;
                object4 = newProductDetailsFragment.k0;
                ((O63)object5).l((Product)object6, (ProductUserSizeRecomResponse)object4);
            }
        }
        if ((object5 = newProductDetailsFragment.K0) != null && (n15 = ((O63)object5).P) == n7) {
            n18 = (int)(((O63)object5).L ? 1 : 0);
            if (n18 == 0) {
                this.Wb();
            }
            if ((object5 = newProductDetailsFragment.K0) != null) {
                object6 = this.cb().t0;
                n4 = n3;
                ((O63)object5).s(n3, (ArrayList)object6);
            }
        }
    }

    public final ArrayList q3() {
        return this.cb().C;
    }

    public final void q4(String object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "pinCode");
        Object object2 = null;
        this.H1 = false;
        this.I1 = bl2 = true;
        Object object3 = new fo_1();
        this.D1 = object3;
        ((fo_1)object3).Ra((String)object);
        object = this.D1;
        if (object != null) {
            object = "cartAddressCallBackListener";
            Intrinsics.checkNotNullParameter(this, (String)object);
        }
        if ((object = this.D1) != null) {
            ((fo_1)object).h = bl2;
        }
        if (object != null) {
            object2 = "changeLocationListener";
            Intrinsics.checkNotNullParameter(this, (String)object2);
            ((fo_1)object).i = this;
        }
        if ((object = this.D1) != null) {
            object2 = this.requireActivity().getSupportFragmentManager();
            object3 = "CartPinCodeCheckBottomSheet";
            ((DialogFragment)object).show((FragmentManager)object2, (String)object3);
        }
    }

    public final void qb() {
        String string2;
        Object object = this.o5();
        boolean bl2 = Intrinsics.areEqual(object, string2 = ld3_2.STORE_AJIOGRAM.getStoreId());
        if (bl2) {
            object = this.kb();
            string2 = null;
            object.h1(false);
        }
    }

    public final boolean r5() {
        return this.cb().A;
    }

    public final void r6() {
        Serializable serializable;
        boolean bl2 = false;
        this.p = false;
        O63 o63 = this.K0;
        if (o63 != null) {
            serializable = this.cb().C;
            o63.q((ArrayList)serializable);
        }
        if ((bl2 = mz3_0.E()) && (o63 = this.K0) != null) {
            serializable = this.cb().q;
            ProductUserSizeRecomResponse productUserSizeRecomResponse = this.k0;
            o63.l((Product)serializable, productUserSizeRecomResponse);
        }
    }

    public final String ra() {
        return this.G0;
    }

    public final void rb() {
        block14: {
            Iterator iterator = z40_0.Companion;
            iterator = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)((Object)iterator)).a.b("selfcarekeys");
            ArrayList<Gson> arrayList = new ArrayList<Gson>();
            arrayList = ((TypeToken)((Object)arrayList)).getType();
            Gson gson = new Gson();
            iterator = gson.fromJson((String)((Object)iterator), (Type)((Object)arrayList));
            iterator = (ArrayList)((Object)iterator);
            this.g1 = iterator;
            if (iterator == null) break block14;
            try {
                arrayList = new ArrayList<Gson>();
                iterator = iterator.iterator();
            }
            catch (Exception exception) {
                arrayList = yn3_0.a;
                ((yn3$a)((Object)arrayList)).e(exception);
            }
            while (true) {
                boolean bl2 = iterator.hasNext();
                if (!bl2) break;
                gson = iterator.next();
                Object object = gson;
                object = (LuxeFooterData)((Object)gson);
                boolean bl3 = ((LuxeFooterData)object).isEnable() ^ true;
                if (bl3) continue;
                arrayList.add(gson);
                continue;
                break;
            }
        }
    }

    public final String s3() {
        return this.cb().r();
    }

    public final void s4() {
        boolean bl2;
        this.e1 = bl2 = true;
        Object object = this.L;
        if (object != null && (object = ((RecyclerView)object).getAdapter()) != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
    }

    public final void s5(boolean bl2) {
        if (bl2) {
            String string2;
            AjioCustomToolbar ajioCustomToolbar = this.kb().getToolbar();
            if (ajioCustomToolbar != null) {
                int n3 = R$string.similar_to;
                string2 = this.getString(n3);
                ajioCustomToolbar.setProductListTitleText(string2);
            }
            if ((ajioCustomToolbar = this.kb().getToolbar()) != null) {
                string2 = this.cb().K;
                ajioCustomToolbar.setProductListDetailText(string2);
            }
        } else {
            AjioCustomToolbar ajioCustomToolbar = this.kb().getToolbar();
            String string3 = "";
            if (ajioCustomToolbar != null) {
                ajioCustomToolbar.setProductListTitleText(string3);
            }
            if ((ajioCustomToolbar = this.kb().getToolbar()) != null) {
                ajioCustomToolbar.setProductListDetailText(string3);
            }
        }
    }

    public final String s6() {
        return this.d1;
    }

    public final Boolean sa() {
        return this.z0;
    }

    public final void sb() {
        int n3 = -1;
        int n4 = 1;
        Object object = this.R;
        if (object != null) {
            int n7;
            J02 j02;
            int n8;
            int n10;
            Intrinsics.checkNotNull(object);
            object = ((ri2_0)object).b;
            Object object2 = this.R;
            Intrinsics.checkNotNull(object2);
            object2 = ((ri2_0)object2).a;
            if (object2 != null && (n10 = TextUtils.isEmpty((CharSequence)object)) != 0) {
                object = ((Product)object2).getCode();
            }
            if ((n8 = TextUtils.isEmpty((CharSequence)object)) == 0) {
                Intrinsics.checkNotNull(object);
                n8 = ((String)object).length() - n4;
                n10 = 0;
                j02 = null;
                n7 = 0;
                while (n10 <= n8) {
                    int n14 = n7 == 0 ? n10 : n8;
                    n14 = ((String)object).charAt(n14);
                    int n15 = 32;
                    n14 = Intrinsics.compare(n14, n15);
                    n14 = n14 <= 0 ? 1 : 0;
                    if (n7 == 0) {
                        if (n14 == 0) {
                            n7 = 1;
                            continue;
                        }
                        n10 += n4;
                        continue;
                    }
                    if (n14 == 0) break;
                    n8 += n3;
                }
                object = com.jio.jioads.adinterfaces.a.a(n8, n4, n10, (String)object);
                this.eb((String)object, false);
            }
            if (object != null && (n8 = ((String)object).length()) != 0 && (n7 = StringsKt.N((CharSequence)object, (char)(n8 = 95), 0, false, n10 = 6)) != n3) {
                Object object3 = this.cb();
                n7 = com.ril.mp.services.R$string.rtb_url_product_page;
                n8 = StringsKt.N((CharSequence)object, (char)n8, 0, false, n10);
                object = ((String)object).substring(0, n8);
                Intrinsics.checkNotNullExpressionValue(object, "substring(...)");
                Object object4 = new Object[n4];
                object4[0] = object;
                object4 = this.getString(n7, (Object[])object4);
                Intrinsics.checkNotNullExpressionValue(object4, "getString(...)");
                object3.getClass();
                Intrinsics.checkNotNullParameter(object4, "Url");
                object4 = ((e12_0)object3).i.sendRTBRequest((String)object4, "pdp screen");
                object = new Object();
                object2 = new H02(object, 0);
                object = new Object();
                j02 = new J02(0, (Function1)object);
                object4 = ((g53_0)object4).f((o60_0)object2, j02);
                object3 = ((e12_0)object3).e;
                ((t30_0)object3).b((yr0_2)object4);
            }
        }
    }

    public final void showNotification(String string2, String string3) {
        boolean bl2;
        Object object = this.getActivity();
        if (object != null && !(bl2 = (object = this.requireActivity()).isFinishing()) && !(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            object = this.h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                bl2 = false;
                object = null;
            }
            FragmentActivity fragmentActivity = this.requireActivity();
            String string4 = "requireActivity(...)";
            Intrinsics.checkNotNullExpressionValue(fragmentActivity, string4);
            Intrinsics.checkNotNull(string2);
            int n3 = 1;
            object.showToastNotification((Context)fragmentActivity, string2, n3, string3);
        }
    }

    public final String t3() {
        String string2;
        int n3 = 1;
        Object object = this.cb();
        Object object2 = ((e12_0)object).M;
        int n4 = TextUtils.isEmpty((CharSequence)object2);
        if (n4 != 0) {
            string2 = "";
        } else {
            object2 = StringCompanionObject.INSTANCE;
            n4 = R$string.pdp_size_format;
            object2 = hv3_0.K(n4);
            object = ((e12_0)object).M;
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            object = "format(...)";
            string2 = xh2_0.a(objectArray, n3, (String)object2, (String)object);
        }
        return string2;
    }

    public final ProductfnlProductData t9() {
        Serializable serializable = this.cb().q;
        serializable = serializable != null ? serializable.getFnlProductData() : null;
        return serializable;
    }

    public final boolean tb(String string2) {
        int n3;
        Object object = this.cb().q;
        int n4 = 0;
        Object object2 = null;
        if (object != null) {
            object = ((Product)object).getVariantOptions();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null && (n3 = string2.length()) != 0) {
            object = this.cb().q;
            if (object != null) {
                object2 = ((Product)object).getVariantOptions();
            }
            Intrinsics.checkNotNull(object2);
            object = object2.iterator();
            while ((n4 = object.hasNext()) != 0) {
                object2 = (ProductOptionItem)object.next();
                String string3 = ((ProductOptionItem)object2).getScDisplaySize();
                boolean bl2 = kotlin.text.b.i(string3, string2, false);
                if (!bl2) continue;
                if ((object2 = ((ProductOptionItem)object2).getStock()) != null && (object2 = ((Stock)object2).getStockLevel()) != null) {
                    n4 = (Integer)object2;
                } else {
                    n4 = 0;
                    object2 = null;
                }
                if (n4 <= 0) continue;
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void u(ProductPromotion productPromotion) {
        String string2;
        String string3;
        String string4;
        Object object;
        Object object2;
        ProductPromotion productPromotion2;
        NewProductDetailsFragment newProductDetailsFragment;
        block9: {
            boolean bl2;
            int n3;
            int n4;
            int n7;
            String string5;
            String string6;
            String string7;
            String string8;
            Object object3;
            block8: {
                block7: {
                    newProductDetailsFragment = this;
                    productPromotion2 = productPromotion;
                    if (productPromotion == null) {
                        return;
                    }
                    object2 = null;
                    this.p = false;
                    object3 = bv2_0.Companion;
                    kv2_0 kv2_02 = kv2_0.PLP_COUPON;
                    object3.getClass();
                    bv2_0.a2 = kv2_02;
                    bv2_0.Z1 = productPromotion.getCode();
                    object3 = productPromotion.getTitle();
                    string8 = "pdp screen";
                    string7 = "offerclick (App)";
                    string6 = "PDP: Click";
                    string5 = "Offer_";
                    if (object3 == null) break block7;
                    object3 = productPromotion.getTitle();
                    Intrinsics.checkNotNull(object3);
                    int n8 = ((String)object3).length();
                    if (n8 <= 0) break block7;
                    object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    object = productPromotion.getTitle();
                    Intrinsics.checkNotNull(object);
                    n7 = ((String)object).length();
                    n4 = 1;
                    n7 -= n4;
                    n3 = 0;
                    string4 = null;
                    bl2 = false;
                    string3 = null;
                    break block8;
                }
                object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                ((GTMEvents)object2).pushEvent(string5, string6, string7, string8);
                break block9;
            }
            while (n3 <= n7) {
                int n10 = !bl2 ? n3 : n7;
                n10 = ((String)object).charAt(n10);
                int n14 = 32;
                if ((n10 = Intrinsics.compare(n10, n14)) <= 0) {
                    n10 = 1;
                } else {
                    n10 = 0;
                    string2 = null;
                }
                if (!bl2) {
                    if (n10 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n3;
                    continue;
                }
                if (n10 == 0) break;
                n7 += -1;
            }
            object2 = hv3_0.f(((Object)((String)object).subSequence(n3, n7 += n4)).toString());
            object = new StringBuilder(string5);
            ((StringBuilder)object).append(object2);
            object2 = ((StringBuilder)object).toString();
            ((GTMEvents)object3).pushEvent((String)object2, string6, string7, string8);
        }
        object = newProductDetailsFragment.H;
        String string9 = ((NewCustomEventsRevamp)object).getEC_PRODUCT_DETAILS_INTERACTIONS();
        String string10 = newProductDetailsFragment.n1;
        object2 = newProductDetailsFragment.o1;
        String string11 = "view all product click";
        string4 = "";
        string3 = "pdp_view_all_product_click";
        string2 = "pdp screen";
        String string12 = "pdp screen";
        int n15 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string9, string11, string4, string3, string2, string12, string10, null, (String)object2, false, null, n15, null);
        object2 = newProductDetailsFragment.g;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productDetailListener");
            object2 = null;
        }
        object2.u(productPromotion2);
    }

    public final float u3() {
        return this.h1;
    }

    public final boolean u7() {
        boolean bl2;
        Object object = CartRepo.INSTANCE;
        boolean bl3 = ((CartRepo)object).isOOSimilarEnabled();
        if (!bl3 || (object = this.R) == null || (bl3 = ((ri2_0)object).n) != (bl2 = true)) {
            bl2 = false;
        }
        return bl2;
    }

    public final void u9(BannerAdsMetaData object) {
        Intrinsics.checkNotNullParameter(object, "bannerAdsMetaData");
        Object object2 = ((BannerAdsMetaData)object).getImpressionTracker();
        if (object2 != null) {
            object = ((BannerAdsMetaData)object).getCcbValue();
            Intrinsics.checkNotNullParameter(object2, "url");
            long l2 = k7.p();
            String string2 = String.valueOf(l2);
            String string3 = "[trq]";
            object2 = kotlin.text.b.n((String)object2, string3, string2, false);
            if (object == null) {
                object = "";
            }
            string2 = "[ccb]";
            object = kotlin.text.b.n((String)object2, string2, (String)object, false);
            object2 = (BannerAdViewModel)this.A.getValue();
            ((BannerAdViewModel)object2).callBannerViewImpression((String)object);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean ua() {
        boolean bl2 = this.u7();
        if (bl2) return false;
        Object object = this.cb().q;
        if (object == null) return false;
        Float f5 = ((Product)object).getFutureBestPrice();
        if (f5 == null) return false;
        if ((object = ((Product)object).getFutureDiscountPercent()) == null) return false;
        object = tr2_2.a;
        bl2 = tr2_2.u(this.f1);
        if (!bl2) return false;
        bl2 = tr2_2.o();
        if (!bl2) return false;
        return true;
    }

    public final void v2(ob_2 ob_22) {
        Intrinsics.checkNotNullParameter(ob_22, "ajioVideoPlayer");
        this.B1.add(ob_22);
    }

    public final boolean vb() {
        boolean bl2;
        String string2 = this.e1();
        Object object = this.k0;
        if (object != null) {
            ((ProductUserSizeRecomResponse)object).setUserVoiceMessage(string2);
        }
        object = h40_0.a;
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string3 = "enable_fit_tag";
        boolean bl3 = ((ao0_0)object).a(string3);
        if (bl3 && (bl2 = string2.length()) > false) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public final boolean w0() {
        return this.cb().o;
    }

    public final void w1(int n3, String string2) {
        Fragment fragment;
        int n4;
        if (string2 != null && (n4 = string2.length()) != 0 && (n4 = (fragment = this.getParentFragment()) instanceof uo_2) != 0) {
            fragment = this.getParentFragment();
            Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type com.ril.ajio.cart.cartlist.fragment.CartPDPBSF");
            fragment = (uo_2)fragment;
            wo_1.Companion.getClass();
            wo_1 wo_12 = new wo_1();
            Bundle bundle = new Bundle();
            String string3 = "WEB_URL";
            bundle.putString(string3, string2);
            string2 = "SOURCE";
            bundle.putInt(string2, n3);
            wo_12.setArguments(bundle);
            n3 = 0;
            boolean bl2 = true;
            ((uo_2)fragment).Oa(wo_12, false, bl2);
        }
    }

    public final Boolean w5() {
        return this.Y0;
    }

    public final void wb() {
        Object object;
        NewProductDetailsFragment newProductDetailsFragment = this;
        Object object2 = new Bundle();
        Object object3 = this.cb().q;
        if (object3 != null) {
            object2 = this.bb(false);
            object3 = this.cb();
            boolean bl2 = ((e12_0)object3).u();
            object3 = !bl2 ? "Out Of Stock" : "In Stock";
            object = "outofstock";
            object2.putString((String)object, (String)object3);
        }
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        AnalyticsData analyticsData = ne_0.b(object2);
        GTMEvents.pushButtonTapEvent$default((GTMEvents)object, "Click", "Go To Bag", "pdp screen", analyticsData, null, 16, null);
        NewCustomEventsRevamp newCustomEventsRevamp = newProductDetailsFragment.H;
        String string2 = newCustomEventsRevamp.getEC_PRODUCT_DETAILS_INTERACTIONS();
        object2 = newProductDetailsFragment.n1;
        object3 = newProductDetailsFragment.o1;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "go to cart", "", "view_bag", "pdp screen", "pdp screen", (String)object2, null, (String)object3, false, null, 1664, null);
        this.Xb();
    }

    public final void x2() {
        Object object = this.Q;
        if (object != null) {
            String string2 = "pdp_similarto_coachmark_in_revamp";
            object = ((r43_0)object).b;
            boolean bl2 = true;
            ((sw_0)object).putPreference(string2, bl2);
        }
    }

    public final void x3(long l2) {
        Long l3;
        this.C1 = l3 = Long.valueOf(l2);
    }

    public final void x4(Product object, String object2, boolean bl2) {
        boolean bl3 = false;
        this.p = false;
        Object object3 = this.getActivity();
        if (object3 != null && !(bl3 = (object3 = this.requireActivity()).isFinishing()) && object != null) {
            object3 = this.cb().p;
            Object object4 = bl2 ? PDPClosetActionIdentifier.FROM_SIMILAR_STL : PDPClosetActionIdentifier.FROM_SIMILAR;
            object3.getClass();
            Object object5 = "<set-?>";
            Intrinsics.checkNotNullParameter(object4, (String)object5);
            ((BH3)object3).d = object4;
            object4 = this.mb();
            bl2 = ((hy3_0)object4).p();
            bl3 = false;
            object3 = null;
            if (!bl2) {
                object4 = this.cb();
                ((e12_0)object4).R = object2;
                object2 = this.cb().p;
                ((BH3)object2).b = object;
                this.Tb(null);
            } else if (object2 != null && (bl2 = ((String)object2).length())) {
                this.Ub();
                this.cb().p.b = object;
                e12_0 e12_02 = this.cb();
                String string2 = this.o5();
                e12_02.getClass();
                Intrinsics.checkNotNullParameter(object2, "productCode");
                Intrinsics.checkNotNullParameter(string2, "sourceStoreId");
                object = md3_0.c(e12_02);
                String string3 = "similar products widget";
                object5 = object4;
                object4 = new x02_0(e12_02, (String)object2, string2, string3, null);
                int n3 = 3;
                Ae3.d((i90_0)object, null, null, (Function2)object4, n3);
            }
        }
    }

    public final Product x5() {
        return this.cb().q;
    }

    public final String x7() {
        Object object = this.cb();
        boolean bl2 = ((e12_0)object).z;
        boolean bl3 = true;
        if (bl2 == bl3) {
            object = this.cb().z0;
        } else {
            bl2 = false;
            object = null;
        }
        return object;
    }

    public final String x9() {
        Object object = this.cb().q;
        if (object != null && (object = ((Product)object).getTagResponse()) != null && (object = ((TagResponse)object).getTag()) != null && (object = ((Tag)object).getCategoryTags()) != null) {
            boolean bl2;
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                String string2;
                boolean bl4;
                String string3;
                CategoryTags categoryTags = (CategoryTags)object.next();
                if (categoryTags == null || (string3 = categoryTags.getCategory()) == null || (bl4 = string3.equalsIgnoreCase(string2 = "URGENCY")) != (bl3 = true)) continue;
                object = categoryTags.getPrimary();
                object = object != null ? ((TagPrimary)object).getValue() : null;
                return String.valueOf(object);
            }
        }
        return "";
    }

    public final void xa() {
        RecyclerView recyclerView = this.L;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
    }

    public final void xb() {
        AnalyticsManager.Companion.getInstance().getGtmEvents().talkToUsTapEvent("pdp screen", "talk_to_us_click", "product details interactions", "click");
        i43_0.Companion.getClass();
        i43_0 i43_02 = new i43_0();
        FragmentManager fragmentManager = this.requireActivity().getSupportFragmentManager();
        String string2 = i43_02.getTag();
        i43_02.show(fragmentManager, string2);
    }

    public final mu1_1 y() {
        mu1_1 mu1_12 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(mu1_12, "getViewLifecycleOwner(...)");
        return mu1_12;
    }

    public final ArrayList y4() {
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList arrayList2 = this.cb().v0;
        if (arrayList2 != null) {
            int n3 = arrayList2.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object;
                String string2 = ((ProductOptionVariant)arrayList2.get(i3)).getCode();
                boolean bl2 = kotlin.text.b.i(string2, (String)(object = (object = this.cb().q) != null ? ((Product)object).getCode() : null), false);
                if (bl2) continue;
                string2 = arrayList2.get(i3);
                arrayList.add(string2);
            }
        }
        return arrayList;
    }

    public final void yb() {
        this.p = false;
        Object object = new N43();
        this.x1 = object;
        Object object2 = "pdpInfoProvider";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        ((N43)object).a = this;
        object = this.x1;
        if (object != null) {
            object2 = "onProductClickListener";
            Intrinsics.checkNotNullParameter(this, (String)object2);
            ((N43)object).b = this;
        }
        if ((object = this.x1) != null) {
            object2 = this.requireActivity().getSupportFragmentManager();
            String string2 = "SimilarToBottomSheet";
            ((DialogFragment)object).show((FragmentManager)object2, string2);
        }
        object = tj2_2.Companion;
        object.getClass();
        tj2_2.e = false;
        object.getClass();
        tj2_2.d = false;
    }

    public final void z(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        this.p = false;
        ea2_1 ea2_12 = this.g;
        if (ea2_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productDetailListener");
            ea2_12 = null;
        }
        ea2_12.z(string2);
    }

    public final ArrayList z1() {
        ArrayList arrayList = this.cb().u0;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return arrayList;
    }

    public final void z8(CartDeliveryAddress object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "address");
        BottomSheetDialogFragment bottomSheetDialogFragment = this.D1;
        if (bottomSheetDialogFragment != null) {
            bottomSheetDialogFragment.dismissAllowingStateLoss();
        }
        if ((bottomSheetDialogFragment = this.G1) != null) {
            bottomSheetDialogFragment.dismissAllowingStateLoss();
        }
        this.T0 = object;
        this.H1 = bl2 = true;
        this.I1 = false;
        this.K1 = bl2;
        this.L1 = bl2;
        this.J1 = object = ((CartDeliveryAddress)object).getPostalCode().toString();
        boolean bl3 = mz3_0.B();
        if (bl3 && (bl3 = ((UserInformation)(object = UserInformation.getInstance(this.getContext()))).isUserOnline())) {
            object = this.J1;
            this.gb((String)object);
        } else {
            object = this.J1;
            this.fb((String)object);
        }
    }

    public final void zb() {
        Object object = this.L;
        if (object != null && (object = ((RecyclerView)object).getAdapter()) != null) {
            int n3 = ((RecyclerView$f)object).getItemCount();
            for (int i3 = 0; i3 < n3; ++i3) {
                int n4;
                int n7 = ((RecyclerView$f)object).getItemViewType(i3);
                if (n7 != (n4 = 14)) continue;
                object = this.L;
                object = object != null ? object.getContext() : null;
                NewProductDetailsFragment$g newProductDetailsFragment$g = new o((Context)object);
                newProductDetailsFragment$g.setTargetPosition(i3);
                object = this.L;
                if (object != null && (object = ((RecyclerView)object).getLayoutManager()) != null) {
                    ((RecyclerView$o)object).startSmoothScroll(newProductDetailsFragment$g);
                }
                return;
            }
        }
    }
}

