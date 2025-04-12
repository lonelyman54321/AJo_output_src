/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.content.Intent
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.D;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.clevertap.android.sdk.a;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$menu;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.GoogleAnalyticsEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import com.ril.ajio.cart.cartlist.fragment.NewCartListFragment$loadCartOrderSummaryEvent$1;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.AjioCenterDrawableButton;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar$DisplayMode;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioSavingsDoneClickListener;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.FragmentTitlesInterface;
import com.ril.ajio.customviews.widgets.onscrolllistener.RecyclerViewScrollListener;
import com.ril.ajio.data.repo.AddressRepo;
import com.ril.ajio.data.repo.CartRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.kmm.shared.model.home.transform.BannerAdsMetaData;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.payment.fragment.c;
import com.ril.ajio.payment.utils.InternalWalletUtil;
import com.ril.ajio.permission.PermissionTrigger;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.AmountData;
import com.ril.ajio.services.data.Cart.AmountDataKt;
import com.ril.ajio.services.data.Cart.BulkMoveToWishlist;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartAndOrder;
import com.ril.ajio.services.data.Cart.CartAppliedVoucher;
import com.ril.ajio.services.data.Cart.CartAssuredGiftModel;
import com.ril.ajio.services.data.Cart.CartConsumedEntry;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEarnPointData;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.CartExchangeReturnPolicy;
import com.ril.ajio.services.data.Cart.CartModification;
import com.ril.ajio.services.data.Cart.CartPromotion;
import com.ril.ajio.services.data.Cart.CartPromotionClick;
import com.ril.ajio.services.data.Cart.CartServiceError;
import com.ril.ajio.services.data.Cart.ConvenienceFee;
import com.ril.ajio.services.data.Cart.Extra;
import com.ril.ajio.services.data.Cart.OptionsCode;
import com.ril.ajio.services.data.Cart.Pancard;
import com.ril.ajio.services.data.Cart.ProfileHealth;
import com.ril.ajio.services.data.Cart.ServicabilityInfo;
import com.ril.ajio.services.data.Cart.ServicabilityInfo$PriorityDelivery;
import com.ril.ajio.services.data.Cart.ServicabilityInfo$PriorityDelivery$Fee;
import com.ril.ajio.services.data.Closet.SaveForLaterResponse;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.ProductfnlProductData;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.StatusNew;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.entity.Banner;
import com.ril.ajio.services.entity.Component;
import com.ril.ajio.services.query.QueryCart;
import com.ril.ajio.services.query.QueryProductDetails;
import com.ril.ajio.services.query.QuerySingleData;
import com.ril.ajio.services.utils.JsonUtils;
import in.juspay.services.HyperServices;
import java.net.URL;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Stack;
import java.util.Timer;
import java.util.TimerTask;
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
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from eX1
 */
public final class ex1_0
extends u51_0
implements j82_0,
AjioSavingsDoneClickListener,
View.OnClickListener,
FragmentTitlesInterface,
ic1_2,
ao_1,
OnNavigationClickListener,
nw_0,
dn_1,
s82_0,
J43,
en_1,
Av,
zm_2,
hy0_0 {
    public static final eX1$a Companion;
    public AjioTextView A;
    public int A0;
    public ShimmerFrameLayout B;
    public ex1$b_0 B0;
    public AjioTextView C;
    public boolean C0;
    public RecyclerView D;
    public pg2_2 D0;
    public A71 E;
    public View E0;
    public LinearLayout F;
    public String F0;
    public View G;
    public String G0;
    public fz0_1 H;
    public final hh3_2 H0;
    public CustomToolbarViewMerger I;
    public n32_0 I0;
    public Toolbar J;
    public boolean J0;
    public TextView K;
    public boolean K0;
    public LinearLayout L;
    public qi2_2 L0;
    public TextView M;
    public TextView M0;
    public int N;
    public RelativeLayout N0;
    public boolean O;
    public final D O0;
    public Dialog P;
    public long P0;
    public no_0 Q;
    public boolean Q0;
    public ep_0 R;
    public Timer R0;
    public bo_1 S;
    public ArrayList S0;
    public final ArrayList T;
    public final int T0;
    public boolean U;
    public boolean U0;
    public xq2_1 V0;
    public fo_1 W0;
    public final Stack X;
    public CartAddressListBottomSheet X0;
    public final Stack Y;
    public ff0_2 Y0;
    public MenuItem Z;
    public String Z0;
    public final hh3_2 a1;
    public final hh3_2 b1;
    public String c1;
    public CartDeliveryAddress d1;
    public boolean e1;
    public boolean f1;
    public final lq2_1 g;
    public final hh3_2 g1;
    public Component h;
    public final hh3_2 h1;
    public boolean i;
    public final eX1$c i1;
    public final int j;
    public String j1;
    public final NewEEcommerceEventsRevamp k;
    public final ArrayList k0;
    public String k1;
    public final NewCustomEventsRevamp l;
    public j3_0 m;
    public fo3 n;
    public vh3_2 o;
    public nm_1 p;
    public boolean p0;
    public lz1_1 q;
    public ProductOptionVariant q0;
    public Rj2 r;
    public ArrayList r0;
    public ea2_1 s;
    public String s0;
    public wx1_1 t;
    public boolean t0;
    public ky1_0 u;
    public boolean u0;
    public ko_2 v;
    public boolean v0;
    public wn_1 w;
    public Product w0;
    public om_1 x;
    public qm_1 x0;
    public zo_0 y;
    public BottomSheetDialog y0;
    public View z;
    public String z0;

    static {
        eX1$a eX1$a;
        Companion = eX1$a = new Object();
    }

    public ex1_0() {
        lq2_1.Companion.getClass();
        Object object = lq2$a_0.a(this);
        ((lq2_1)object).e();
        int n3 = 1;
        Object object2 = new iq2_1[n3];
        Object object3 = Iq2$b.b;
        object2[0] = object3;
        ((lq2_1)object).g((iq2_1[])object2);
        object2 = PermissionTrigger.CART;
        ((lq2_1)object).f((PermissionTrigger)((Object)object2));
        this.g = object;
        this.j = 101;
        object = AnalyticsManager.Companion;
        this.k = object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.l = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        object = new ArrayList();
        this.T = object;
        this.X = object;
        super();
        this.Y = object;
        object = new ArrayList();
        this.k0 = object;
        object = new ArrayList();
        this.r0 = object;
        this.s0 = object = "";
        this.A0 = -1;
        this.F0 = object3 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        this.G0 = object2 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        object2 = new lw1_0(this, 0);
        this.H0 = object2 = yr1_2.b((Function0)object2);
        this.J0 = n3;
        this.K0 = n3;
        new ArrayList();
        object2 = Reflection.getOrCreateKotlinClass(fc0_2.class);
        object3 = new eX1$e(this);
        eX1$f eX1$f = new eX1$f(this);
        eX1$g eX1$g = new eX1$g(this);
        this.O0 = object2 = LW0.a(this, (yn1_2)object2, (Function0)object3, eX1$f, eX1$g);
        this.P0 = 5;
        this.S0 = object2 = new ArrayList();
        this.T0 = 1005;
        this.Z0 = object;
        object2 = new mg0_1(this, n3);
        Object object4 = yr1_2.b((Function0)object2);
        this.a1 = object4;
        object4 = new ZW1(this);
        this.b1 = object4 = yr1_2.b((Function0)object4);
        this.c1 = object;
        object = new ax1_0(this, 0);
        this.g1 = object = yr1_2.b((Function0)object);
        object = new bX1(this, 0);
        this.h1 = object = yr1_2.b((Function0)object);
        this.i1 = object = new eX1$c(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void Mb(Banner object, int n3) {
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

    public static boolean Ta(DataError object) {
        boolean bl2;
        block7: {
            block6: {
                boolean bl3;
                boolean bl4;
                Object object2;
                String string2 = null;
                if (object != null && (object2 = ((DataError)object).getErrorMessage()) != null) {
                    object2 = ((DataError$ErrorMessage)object2).getSubjectType();
                } else {
                    bl4 = false;
                    object2 = null;
                }
                String string3 = "cart";
                bl2 = true;
                bl4 = kotlin.text.b.i((String)object2, string3, bl2);
                if (!bl4) break block6;
                if (object != null && (object = ((DataError)object).getErrorMessage()) != null) {
                    string2 = ((DataError$ErrorMessage)object).getReason();
                }
                if (bl3 = kotlin.text.b.i(string2, (String)(object = "notFound"), bl2)) break block7;
            }
            bl2 = false;
        }
        return bl2;
    }

    public static void yb() {
        Object object = qn1_2.Companion;
        object.getClass();
        boolean bl2 = qn1$a.a();
        Object object2 = yn3_0.a;
        CharSequence charSequence = new StringBuilder("Juspay prefetch in NewCartListFragment: ");
        charSequence.append(bl2);
        charSequence = charSequence.toString();
        Object object3 = new Object[]{};
        ((yn3$a)object2).a((String)charSequence, (Object[])object3);
        if (bl2) {
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            object2 = "ajio_android";
            charSequence = new JSONObject();
            object3 = new JSONObject();
            String string2 = "clientId";
            object3.put(string2, object2);
            object2 = "payload";
            charSequence.put((String)object2, object3);
            object2 = "service";
            object3 = "in.juspay.ec";
            try {
                charSequence.put((String)object2, object3);
            }
            catch (JSONException jSONException) {
                object3 = yn3_0.a;
                ((yn3$a)object3).e(jSONException);
            }
            HyperServices.preFetch((Context)object, (JSONObject)charSequence);
        }
    }

    public final m80_0 A() {
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            wx1_12 = null;
        }
        return wx1_12.o1;
    }

    public final Cart A7() {
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            wx1_12 = null;
        }
        return wx1_12.S0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void Ab() {
        var1_1 = this;
        var2_2 = this.t;
        var3_3 = "cartViewModel";
        var4_4 = 0;
        var5_5 = null;
        if (var2_2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var3_3);
            var6_6 = false;
            var2_2 = null;
        }
        if ((var2_2 = var2_2.S0) != null) {
            var2_2 = var2_2.getEntries();
        } else {
            var6_6 = false;
            var2_2 = null;
        }
        if (var2_2 == null || (var6_6 = var2_2.isEmpty())) ** GOTO lbl251
        var1_1.s0 = var2_2 = "";
        var7_7 = var1_1.t;
        if (var7_7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var3_3);
            var8_8 = 0;
            var7_7 = null;
        }
        if ((var7_7 = var7_7.S0) != null) {
            var7_7 = var7_7.getEntries();
        } else {
            var8_8 = 0;
            var7_7 = null;
        }
        var8_8 = lp_0.d((ArrayList)var7_7);
        var9_9 = var1_1.t;
        if (var9_9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var3_3);
            var9_9 = null;
        }
        if ((var9_9 = (var9_9 = var9_9.S0) != null ? var9_9.getEntries() : null) == null) {
            var9_9 = mz0_2.a;
        }
        var9_9 = var9_9.iterator();
        var10_10 = 0;
        var11_11 = null;
        var12_12 = 0;
        var13_13 = null;
        while (var14_14 = var9_9.hasNext()) {
            var15_15 = (CartEntry)var9_9.next();
            var16_16 = var15_15.getServicabilityInfo();
            if (var16_16 != null) {
                var16_16 = var16_16.getServicability();
                var17_17 = Boolean.FALSE;
                var18_18 = Intrinsics.areEqual(var16_16, var17_17);
            } else {
                var18_18 = 0;
                var19_19 = 0.0f;
                var16_16 = null;
            }
            if (var18_18 == 0) continue;
            var16_16 = var15_15.getReasonForNotServiceability();
            if (var16_16 != null && (var18_18 = var16_16.length()) != 0) {
                var18_18 = 0;
                var19_19 = 0.0f;
                var16_16 = null;
            } else {
                var18_18 = 1;
                var19_19 = 1.4E-45f;
            }
            if (var18_18 != 0) continue;
            var15_15 = var15_15.getReasonForNotServiceability();
            Intrinsics.checkNotNullExpressionValue(var15_15, "getReasonForNotServiceability(...)");
            var15_15 = var15_15.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(var15_15, "toLowerCase(...)");
            var16_16 = "ns";
            var14_14 = Intrinsics.areEqual(var16_16, var15_15);
            if (!var14_14) continue;
            ++var12_12;
        }
        if (var8_8 != 0 || var12_12 != 0) ** GOTO lbl138
        var7_7 = var1_1.t;
        if (var7_7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var3_3);
            var8_8 = 0;
            var7_7 = null;
        }
        if ((var3_3 = var7_7.S0) != null) {
            var3_3 = var3_3.getEntries();
        } else {
            var20_20 /* !! */  = false;
            var3_3 = null;
        }
        var21_21 = -1;
        var23_22 = 0x7FFFFFFFFFFFFFFFL;
        var25_23 = -9223372036854775808L;
        if (var3_3 != null) {
            var3_3 = var3_3.iterator();
            var27_24 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(var3_3, (String)var27_24);
            while ((var28_25 = var3_3.hasNext()) != 0) {
                var27_24 = var3_3.next();
                var29_26 = "next(...)";
                Intrinsics.checkNotNullExpressionValue(var27_24, (String)var29_26);
                var27_24 = ((CartEntry)var27_24).getServicabilityInfo();
                if (var27_24 != null) {
                    var29_26 = var27_24.getServicability();
                    var30_27 = Boolean.FALSE;
                    var31_28 = Intrinsics.areEqual(var29_26, var30_27);
                } else {
                    var31_28 = false;
                    var29_26 = null;
                }
                if (!var31_28) continue;
                var29_26 = var27_24.getEddLower();
                var31_28 = TextUtils.isEmpty((CharSequence)var29_26);
                var30_27 = "yyyy-MM-dd'T'HH:mm:ssZZZZ";
                if (!var31_28) {
                    var29_26 = var27_24.getEddLower();
                    var32_29 = k7.w((String)var29_26, (String)var30_27);
                } else {
                    var32_29 = var21_21;
                }
                var29_26 = var27_24.getEddUpper();
                var31_28 = TextUtils.isEmpty((CharSequence)var29_26);
                if (!var31_28) {
                    var27_24 = var27_24.getEddUpper();
                    var34_30 = k7.w((String)var27_24, (String)var30_27);
                } else {
                    var34_30 = var21_21;
                }
                var36_31 = var32_29 == var21_21 ? 0 : (var32_29 < var21_21 ? -1 : 1);
                if (var36_31 == false) {
                    var32_29 = var34_30;
                }
                if ((var36_31 = var32_29 == var23_22 ? 0 : (var32_29 < var23_22 ? -1 : 1)) < 0) {
                    var23_22 = var32_29;
                }
                if ((var36_31 = var34_30 == var25_23 ? 0 : (var34_30 < var25_23 ? -1 : 1)) <= 0) continue;
                var25_23 = var34_30;
            }
        }
        if (var20_20 /* !! */  = var23_22 == var25_23 ? 0 : (var23_22 < var25_23 ? -1 : 1)) {
            var2_2 = k7.e(var23_22, var25_23);
        } else {
            var20_20 /* !! */  = var23_22 == var21_21 ? 0 : (var23_22 < var21_21 ? -1 : 1);
            if (var20_20 /* !! */ ) {
                var2_2 = k7.e(var23_22, var21_21);
            } else {
                var20_20 /* !! */  = var25_23 == var21_21 ? 0 : (var25_23 < var21_21 ? -1 : 1);
                if (var20_20 /* !! */ ) {
                    var2_2 = k7.e(var21_21, var25_23);
                }
            }
        }
lbl136:
        // 6 sources

        while (true) {
            var1_1.s0 = var2_2;
lbl138:
            // 2 sources

            if ((var2_2 = var1_1.w) != null) {
                var20_20 /* !! */  = this.qb();
                var3_3 = var20_20 /* !! */  != false ? "loggedin" : "guest";
                var7_7 = lp_0.b(this.S2());
                var9_9 = var1_1.s0;
                Intrinsics.checkNotNullParameter(var3_3, "userStatus");
                Intrinsics.checkNotNullParameter(var7_7, "cartSkuId");
                var13_13 = var2_2.a;
                var15_15 = var13_13.S0;
                if (var15_15 != null) {
                    var15_15 = var15_15.getEntries();
                } else {
                    var14_14 = false;
                    var15_15 = null;
                }
                if (var15_15 != null) {
                    var15_15 = new Bundle();
                    var16_16 = var13_13.S0;
                    var17_17 = var2_2.b;
                    if (var16_16 != null && (var16_16 = var16_16.getConvenienceFee()) != null && (var16_16 = var16_16.getDelivery()) != null && (var16_16 = var16_16.getNetAmount()) != null && (var16_16 = var16_16.getValue()) != null) {
                        var27_24 = var17_17.getSV_EP_DELIVERY_FEE();
                        var15_15.putString((String)var27_24, (String)var16_16);
                    }
                    if ((var16_16 = var13_13.S0) != null) {
                        var19_19 = var16_16.getTotalBagSaving();
                        var16_16 = Float.valueOf(var19_19);
                    } else {
                        var18_18 = 0;
                        var16_16 = null;
                        var19_19 = 0.0f;
                    }
                    var16_16 = String.valueOf(var16_16);
                    var27_24 = "total_savings";
                    var15_15.putString((String)var27_24, (String)var16_16);
                    var16_16 = var13_13.S0;
                    if (var16_16 != null) {
                        var19_19 = var16_16.getBagTotal();
                    } else {
                        var18_18 = 0;
                        var19_19 = 0.0f;
                        var16_16 = null;
                    }
                    var27_24 = "bag_total";
                    var15_15.putFloat((String)var27_24, var19_19);
                    var16_16 = var13_13.S0;
                    if (var16_16 != null && (var16_16 = var16_16.getVoucherAmount()) != null && (var16_16 = var16_16.getValue()) != null) {
                        var27_24 = "coupon_savings";
                        var15_15.putString((String)var27_24, (String)var16_16);
                    }
                    if ((var16_16 = var13_13.S0) != null && (var16_16 = var16_16.getTotalPriceWithTax()) != null) {
                        var5_5 = var16_16.getValue();
                    }
                    var16_16 = "cart_value";
                    var15_15.putString((String)var16_16, var5_5);
                    var5_5 = var13_13.S0;
                    if (var5_5 != null && (var5_5 = var5_5.getEntries()) != null) {
                        var4_4 = var5_5.size();
                    } else {
                        var4_4 = 0;
                        var5_5 = null;
                    }
                    var16_16 = var13_13.T0;
                    var28_25 = var16_16.size() + var4_4;
                    var15_15.putInt("item_count", var28_25);
                    var5_5 = var13_13.S0;
                    if (var5_5 != null) {
                        var10_10 = var5_5.getTotalUnitCount();
                    }
                    var15_15.putInt("number_of_items_on_cart", var10_10);
                    var4_4 = var16_16.size();
                    var11_11 = "oos_count";
                    var15_15.putInt(var11_11, var4_4);
                    var5_5 = var17_17.getSV_EP_OOS_SKU();
                    var15_15.putString((String)var5_5, (String)var7_7);
                    var5_5 = var17_17.getSV_ESTIMATE_DELIVERY_DATE();
                    var15_15.putString((String)var5_5, (String)var9_9);
                    var5_5 = var17_17.getUSER_STATUS();
                    var15_15.putString((String)var5_5, var3_3);
                    var5_5 = od3_2.a();
                    var15_15.putString("contains_store", (String)var5_5);
                    var3_3 = cp_1.Companion;
                    var3_3.getClass();
                    var20_20 /* !! */  = cp$a.i();
                    if (var20_20 /* !! */ ) {
                        var3_3 = var13_13.S0;
                        if (var3_3 != null) {
                            var20_20 /* !! */  = var3_3.isOtpValidationRequired();
                            var5_5 = var17_17.getUSER_FRAUD_STATUS();
                            var15_15.putBoolean((String)var5_5, var20_20 /* !! */ );
                        }
                        var3_3 = var13_13.S0;
                        var5_5 = "RELIANCE_ONE_WALLET";
                        if ((var3_3 = lp_0.f((String)var5_5, (Cart)var3_3)) != null) {
                            var5_5 = var17_17.getCM_EP_RONE();
                            var15_15.putString((String)var5_5, (String)var3_3);
                        }
                        var3_3 = var13_13.S0;
                        var5_5 = "MAHA_CASHBACK";
                        if ((var3_3 = lp_0.f((String)var5_5, (Cart)var3_3)) != null) {
                            var5_5 = var17_17.getCM_EP_MAHACASHBACK();
                            var15_15.putString((String)var5_5, (String)var3_3);
                        }
                        var3_3 = var13_13.S0;
                        var5_5 = "AJIO_CASH_WALLET";
                        if ((var3_3 = lp_0.f((String)var5_5, (Cart)var3_3)) != null) {
                            var5_5 = var17_17.getCM_EP_AJIO_WALLET();
                            var15_15.putString((String)var5_5, (String)var3_3);
                        }
                        var3_3 = var13_13.S0;
                        var5_5 = "TAARA_WALLET";
                        if ((var3_3 = lp_0.f((String)var5_5, (Cart)var3_3)) != null) {
                            var5_5 = var17_17.getCM_EP_TAARA();
                            var15_15.putString((String)var5_5, (String)var3_3);
                        }
                    }
                    var3_3 = AnalyticsManager.Companion;
                    var37_32 = bv_0.a((AnalyticsManager$Companion)var3_3);
                    var38_33 = cv_0.a((AnalyticsManager$Companion)var3_3);
                    var29_26 = "";
                    var30_27 = "bag_interaction";
                    var16_16 = var2_2.b;
                    var17_17 = "bag interactions";
                    var27_24 = "bag update";
                    var39_34 = "bag screen";
                    var40_35 = "bag screen";
                    var16_16.newBagPushCustomEvent((String)var17_17, (String)var27_24, (String)var29_26, (String)var30_27, var39_34, var40_35, var37_32, (Bundle)var15_15, var38_33);
                }
            }
lbl251:
            // 6 sources

            return;
        }
        catch (Exception v0) {
            ** continue;
        }
    }

    public final String B3() {
        Object object = this.t;
        String string2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            object = null;
        }
        if ((object = ((wx1_1)object).S0) != null) {
            string2 = ((Cart)object).getPinCode();
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void B8(CartEntry object, String object2, String object3) {
        Exception exception2;
        block3: {
            Object object4;
            block2: {
                boolean bl2;
                Intrinsics.checkNotNullParameter(object, "cartEntry");
                object4 = this.getParentFragment();
                if (object4 == null) return;
                boolean bl3 = ((Fragment)object4).isAdded();
                if (bl3 != (bl2 = true)) return;
                bl3 = this.isAdded();
                if (!bl3) return;
                try {
                    object4 = this.t;
                    if (object4 != null) break block2;
                    object4 = "cartViewModel";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    bl3 = false;
                    object4 = null;
                }
                catch (Exception exception2) {
                    break block3;
                }
            }
            ((wx1_1)object4).l1 = object;
            object = new uo_2();
            object4 = new Bundle();
            String string2 = "PRODUCT_CODE";
            object4.putString(string2, (String)object2);
            object2 = "SELECTED_SIZE";
            object4.putString((String)object2, (String)object3);
            ((Fragment)object).setArguments((Bundle)object4);
            int n3 = 1004;
            ((Fragment)object).setTargetFragment(this, n3);
            object2 = this.requireParentFragment();
            object2 = ((Fragment)object2).getChildFragmentManager();
            object3 = uo_2.Companion;
            object3.getClass();
            object3 = uo_2.d;
            ((DialogFragment)object).show((FragmentManager)object2, (String)object3);
            return;
        }
        object2 = yn3_0.a;
        ((yn3$a)object2).e(exception2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void Bb(ArrayList var1_1) {
        block105: {
            block104: {
                block102: {
                    block103: {
                        var2_2 = this;
                        var3_3 = var1_1;
                        var4_4 = this.k0;
                        var4_4.clear();
                        var4_4.addAll(var1_1);
                        var4_4 = this.T;
                        var4_4.clear();
                        var4_4.addAll(var1_1);
                        var5_5 = this.h;
                        var6_6 = 1;
                        if (var5_5 != null && (var5_5 = var5_5.getBanners()) != null && (var7_7 = var5_5.isEmpty() ^ var6_6) == var6_6) {
                            var7_7 = var4_4.size();
                            if (var7_7 >= var6_6 && (var7_7 = (var5_5 = var4_4.get(0)) instanceof su3) != 0) {
                                var5_5 = var4_4.get(0);
                                var8_8 /* !! */  = "null cannot be cast to non-null type com.ril.ajio.cart.cartlist.UiCartComponent";
                                Intrinsics.checkNotNull(var5_5, (String)var8_8 /* !! */ );
                                var5_5 = (su3)var5_5;
                                var7_7 = var5_5.b;
                                if (var7_7 == var6_6) {
                                    var5_5 = this.h;
                                    if (var5_5 != null) {
                                        var4_4.set(0, var5_5);
                                    }
                                } else {
                                    var5_5 = this.h;
                                    if (var5_5 != null) {
                                        var4_4.add(0, var5_5);
                                    }
                                }
                            } else {
                                var7_7 = var4_4.size();
                                if (var7_7 >= var6_6 && (var7_7 = (var5_5 = var4_4.get(0)) instanceof Component) == 0) {
                                    var5_5 = var2_2.h;
                                    Intrinsics.checkNotNull(var5_5);
                                    var4_4.add(0, var5_5);
                                }
                            }
                        }
                        var1_1.size();
                        this.Sa();
                        var5_5 = var2_2.S;
                        if (var5_5 != null) {
                            var5_5.notifyDataSetChanged();
                        }
                        if ((var5_5 = var2_2.I) != null && (var5_5 = var5_5.getToolbar()) != null) {
                            var9_9 = R$string.acc_page_header_cart_empty;
                            var8_8 /* !! */  = hv3_0.K(var9_9);
                            var5_5.setContentDescription((CharSequence)var8_8 /* !! */ );
                        }
                        if ((var5_5 = var2_2.J) != null) {
                            var9_9 = R$string.acc_page_header_cart_empty;
                            var8_8 /* !! */  = hv3_0.K(var9_9);
                            var5_5.setContentDescription((CharSequence)var8_8 /* !! */ );
                        }
                        var5_5 = var2_2.t;
                        var9_9 = 0;
                        var8_8 /* !! */  = null;
                        var10_10 = "cartViewModel";
                        if (var5_5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                            var7_7 = 0;
                            var5_5 = null;
                            var11_11 = 0.0f;
                        }
                        var5_5 = var5_5.S0;
                        var12_12 = 300L;
                        if (var5_5 == null) {
                            var3_3 = var2_2.G;
                            if (var3_3 != null) {
                                var3_3.setVisibility(0);
                            }
                            var14_13 /* !! */  = Looper.getMainLooper();
                            var3_3 = new Handler(var14_13 /* !! */ );
                            var14_13 /* !! */  = new ow1_0(var2_2);
                            var3_3.postDelayed((Runnable)var14_13 /* !! */ , var12_12);
                            this.mb();
                            return;
                        }
                        var15_15 = var1_1.size();
                        var7_7 = 4;
                        var11_11 = 5.6E-45f;
                        var16_16 = "priceTv";
                        var17_17 = 8;
                        var18_18 = 1.1E-44f;
                        var19_19 = "format(...)";
                        if (var15_15 > var7_7) ** GOTO lbl-1000
                        var3_3 = var2_2.t;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                            var15_15 = 0;
                            var3_3 = null;
                        }
                        if ((var3_3 = var3_3.S0) != null && (var3_3 = var3_3.getEntries()) != null) {
                            var15_15 = var3_3.size();
                        } else {
                            var15_15 = 0;
                            var3_3 = null;
                        }
                        if (var15_15 <= 0) {
                            var3_3 = var2_2.G;
                            if (var3_3 != null) {
                                var3_3.setVisibility(0);
                            }
                            var5_5 = Looper.getMainLooper();
                            var3_3 = new Handler((Looper)var5_5);
                            var5_5 = new qw1_0(var2_2, 0);
                            var3_3.postDelayed((Runnable)var5_5, var12_12);
                            this.mb();
                        } else lbl-1000:
                        // 2 sources

                        {
                            if ((var3_3 = var2_2.J) != null) {
                                var5_5 = StringCompanionObject.INSTANCE;
                                var7_7 = R$string.acc_page_header_cart;
                                var5_5 = hv3_0.K(var7_7);
                                var20_20 /* !! */  = var2_2.t;
                                if (var20_20 /* !! */  == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                                    var21_21 = 0;
                                    var20_20 /* !! */  = null;
                                }
                                if ((var20_20 /* !! */  = var20_20 /* !! */ .S0) != null && (var20_20 /* !! */  = var20_20 /* !! */ .getEntries()) != null) {
                                    var21_21 = var20_20 /* !! */ .size();
                                    var20_20 /* !! */  = var21_21;
                                } else {
                                    var21_21 = 0;
                                    var20_20 /* !! */  = null;
                                }
                                var22_22 = new Object[var6_6];
                                var22_22[0] = var20_20 /* !! */ ;
                                var20_20 /* !! */  = Arrays.copyOf(var22_22, var6_6);
                                var5_5 = String.format((String)var5_5, var20_20 /* !! */ );
                                Intrinsics.checkNotNullExpressionValue(var5_5, var19_19);
                                var3_3.setContentDescription((CharSequence)var5_5);
                            }
                            if ((var3_3 = var2_2.I) != null && (var3_3 = var3_3.getToolbar()) != null) {
                                var5_5 = StringCompanionObject.INSTANCE;
                                var7_7 = R$string.acc_page_header_cart;
                                var5_5 = hv3_0.K(var7_7);
                                var20_20 /* !! */  = var2_2.t;
                                if (var20_20 /* !! */  == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                                    var21_21 = 0;
                                    var20_20 /* !! */  = null;
                                }
                                if ((var20_20 /* !! */  = var20_20 /* !! */ .S0) != null && (var20_20 /* !! */  = var20_20 /* !! */ .getEntries()) != null) {
                                    var21_21 = var20_20 /* !! */ .size();
                                    var20_20 /* !! */  = var21_21;
                                } else {
                                    var21_21 = 0;
                                    var20_20 /* !! */  = null;
                                }
                                var22_22 = new Object[var6_6];
                                var22_22[0] = var20_20 /* !! */ ;
                                var20_20 /* !! */  = Arrays.copyOf(var22_22, var6_6);
                                var5_5 = String.format((String)var5_5, var20_20 /* !! */ );
                                Intrinsics.checkNotNullExpressionValue(var5_5, var19_19);
                                var3_3.setContentDescription((CharSequence)var5_5);
                            }
                            var5_5 = Looper.getMainLooper();
                            var3_3 = new Handler((Looper)var5_5);
                            var5_5 = new pw1_0(var2_2, 0);
                            var3_3.postDelayed((Runnable)var5_5, var12_12);
                            var3_3 = var2_2.z;
                            if (var3_3 != null) {
                                var3_3.setVisibility(0);
                            }
                            if ((var3_3 = var2_2.G) != null) {
                                var3_3.setVisibility(var17_17);
                            }
                            if ((var3_3 = var2_2.A) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var16_16);
                                var15_15 = 0;
                                var3_3 = null;
                            }
                            var11_11 = this.D();
                            var5_5 = qz2_0.u(var11_11);
                            var3_3.setText((CharSequence)var5_5);
                        }
                        this.lb();
                        var3_3 = var2_2.t;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                            var15_15 = 0;
                            var3_3 = null;
                        }
                        if ((var3_3 = var3_3.S0) != null) {
                            var3_3 = var3_3.getAppliedVouchers();
                        } else {
                            var15_15 = 0;
                            var3_3 = null;
                        }
                        var3_3 = (Collection)var3_3;
                        if (var3_3 != null && (var15_15 = (int)var3_3.isEmpty()) == 0) {
                            var15_15 = 0;
                            var3_3 = null;
                        } else {
                            var15_15 = 1;
                        }
                        if (var15_15 == 0 || (var15_15 = (int)var2_2.p0) == 0) ** GOTO lbl-1000
                        var3_3 = var2_2.x0;
                        if (var3_3 != null && (var7_7 = (int)var3_3.c) == var6_6) {
                            var7_7 = 1;
                            var11_11 = 1.4E-45f;
                        } else {
                            var7_7 = 0;
                            var11_11 = 0.0f;
                            var5_5 = null;
                        }
                        if (var7_7 == 0) ** GOTO lbl-1000
                        var2_2.p0 = false;
                        if (var3_3 != null) {
                            var3_3.c = false;
                        }
                        if ((var3_3 = this.getContext()) != null) {
                            var5_5 = new BottomSheetDialog((Context)var3_3);
                            var3_3 = this.getLayoutInflater();
                            var23_23 = R$layout.dialog_cart_coupon_refresh;
                            var3_3 = var3_3.inflate(var23_23, null);
                            var5_5.setContentView((View)var3_3);
                            var23_23 = R$id.cancelBtn;
                            var24_24 = var3_3.findViewById(var23_23);
                            var25_25 = R$id.dialog_cart_coupon_btn_shipping;
                            var26_26 = (TextView)var3_3.findViewById(var25_25);
                            var21_21 = R$id.dialog_cart_coupon_btn_save_more;
                            var20_20 /* !! */  = (TextView)var3_3.findViewById(var21_21);
                            var27_27 = R$id.dialog_cart_coupon_tv_save;
                            var22_22 = (TextView)var3_3.findViewById(var27_27);
                            var28_28 = R$id.dialog_cart_coupon_tv_coupon;
                            var3_3 = (TextView)var3_3.findViewById(var28_28);
                            var14_14 = var2_2.t;
                            if (var14_14 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                                var28_28 = 0;
                                var14_14 = null;
                            }
                            if ((var14_14 = var14_14.S0) != null && (var14_14 = var14_14.getTotalPriceWithTax()) != null) {
                                var14_14 = var14_14.getValue();
                            } else {
                                var28_28 = 0;
                                var14_14 = null;
                            }
                            if (var14_14 != null && (var28_28 = var14_14.length()) != 0) {
                                var14_14 = StringCompanionObject.INSTANCE;
                                var28_28 = R$string.your_bag_total_has_been_updated_refresh;
                                var14_14 = hv3_0.K(var28_28);
                                var29_29 /* !! */  = var2_2.t;
                                if (var29_29 /* !! */  == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                                    var17_17 = 0;
                                    var29_29 /* !! */  = null;
                                    var18_18 = 0.0f;
                                }
                                if ((var29_29 /* !! */  = var29_29 /* !! */ .S0) != null && (var29_29 /* !! */  = var29_29 /* !! */ .getTotalPriceWithTax()) != null) {
                                    var29_29 /* !! */  = var29_29 /* !! */ .getValue();
                                } else {
                                    var17_17 = 0;
                                    var29_29 /* !! */  = null;
                                    var18_18 = 0.0f;
                                }
                                var18_18 = mz3_0.J((String)var29_29 /* !! */ );
                                var29_29 /* !! */  = qz2_0.u(var18_18);
                                var8_8 /* !! */  = new Object[var6_6];
                                var8_8 /* !! */ [0] = var29_29 /* !! */ ;
                                zn0_1.b(var8_8 /* !! */ , var6_6, (String)var14_14, var19_19, var22_22);
                            }
                            if ((var14_14 = var2_2.x0) != null) {
                                var14_14 = var14_14.b;
                            } else {
                                var28_28 = 0;
                                var14_14 = null;
                            }
                            if (var14_14 != null && (var28_28 = var14_14.length()) != 0) {
                                var14_14 = StringCompanionObject.INSTANCE;
                                var28_28 = R$string.looks_like_you_have_already_made;
                                var14_14 = hv3_0.K(var28_28);
                                var8_8 /* !! */  = var2_2.x0;
                                if (var8_8 /* !! */  != null) {
                                    var8_8 /* !! */  = var8_8 /* !! */ .b;
                                } else {
                                    var9_9 = 0;
                                    var8_8 /* !! */  = null;
                                }
                                var29_29 /* !! */  = new Object[var6_6];
                                var29_29 /* !! */ [0] = var8_8 /* !! */ ;
                                zn0_1.b(var29_29 /* !! */ , var6_6, (String)var14_14, var19_19, (TextView)var3_3);
                            }
                            var3_3 = var2_2.x0;
                            var28_28 = 0;
                            var14_14 = null;
                            if (var3_3 != null) {
                                var3_3.a = null;
                                var3_3.b = null;
                                var3_3.c = false;
                                var3_3.d = false;
                            }
                            var3_3 = new VW1(var5_5, 0);
                            var26_26.setOnClickListener((View.OnClickListener)var3_3);
                            var3_3 = new WW1((BottomSheetDialog)var5_5, var2_2);
                            var20_20 /* !! */ .setOnClickListener((View.OnClickListener)var3_3);
                            var3_3 = new XW1(var5_5, 0);
                            var24_24.setOnClickListener((View.OnClickListener)var3_3);
                            var5_5.show();
                            var3_3 = var5_5.getWindow();
                            if (var3_3 != null && (var3_3 = var3_3.findViewById(var7_7 = com.google.android.material.R$id.design_bottom_sheet)) != null) {
                                var7_7 = 17170445;
                                var11_11 = 2.461195E-38f;
                                var3_3.setBackgroundResource(var7_7);
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            var28_28 = 0;
                            var14_14 = null;
                        }
                        if ((var3_3 = var2_2.t) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                            var15_15 = 0;
                            var3_3 = null;
                        }
                        var3_3 = var3_3.T0;
                        var15_15 = var3_3.isEmpty() ^ var6_6;
                        var5_5 = "proceedToShipping";
                        if (var15_15 != 0) break block103;
                        var3_3 = var2_2.t;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                            var15_15 = 0;
                            var3_3 = null;
                        }
                        if ((var15_15 = (var3_3 = var3_3.U0).isEmpty() ^ var6_6) != 0) break block103;
                        var3_3 = var2_2.t;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                            var15_15 = 0;
                            var3_3 = null;
                        }
                        if ((var15_15 = (int)var3_3.i1) != 0) break block103;
                        var3_3 = var2_2.C;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                            var15_15 = 0;
                            var3_3 = null;
                        }
                        var3_3.setClickable((boolean)var6_6);
                        var15_15 = (int)og1_1.b();
                        if (var15_15 != 0) {
                            var3_3 = var2_2.C;
                            if (var3_3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                                var15_15 = 0;
                                var3_3 = null;
                            }
                            var30_30 = hv3_0.m(R$color.luxe_color_121212);
                            var3_3.setBackgroundColor(var30_30);
                            var3_3 = var2_2.C;
                            if (var3_3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                                var15_15 = 0;
                                var3_3 = null;
                            }
                            var30_30 = hv3_0.m(R$color.luxe_color_E0E0E0);
                            var3_3.setTextColor(var30_30);
                        } else {
                            var3_3 = var2_2.C;
                            if (var3_3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                                var15_15 = 0;
                                var3_3 = null;
                            }
                            var30_30 = R$drawable.revamp_secondary_button_bg;
                            var3_3.setBackgroundResource(var30_30);
                            var3_3 = var2_2.C;
                            if (var3_3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                                var15_15 = 0;
                                var3_3 = null;
                            }
                            var30_30 = hv3_0.m(R$color.accent_color_11);
                            var3_3.setTextColor(var30_30);
                        }
                        break block104;
                    }
                    if ((var3_3 = var2_2.z) != null) {
                        var3_3.setVisibility(0);
                    }
                    if ((var3_3 = var2_2.G) != null) {
                        var9_9 = 8;
                        var3_3.setVisibility(var9_9);
                    }
                    if ((var15_15 = (int)this.qb()) == 0) ** GOTO lbl-1000
                    var3_3 = var4_4.iterator();
                    var4_4 = "iterator(...)";
                    Intrinsics.checkNotNullExpressionValue(var3_3, (String)var4_4);
                    while ((var30_30 = var3_3.hasNext()) != 0) {
                        var4_4 = var3_3.next();
                        var8_8 /* !! */  = "next(...)";
                        Intrinsics.checkNotNullExpressionValue(var4_4, (String)var8_8 /* !! */ );
                        var30_30 = var4_4 instanceof CartEntry;
                        if (var30_30 == 0) continue;
                        var15_15 = 1;
                        break block102;
                    }
                    var15_15 = 0;
                    var3_3 = null;
                }
                if (var15_15 == 0) ** GOTO lbl-1000
                var3_3 = cp_1.Companion;
                var3_3.getClass();
                var4_4 = cp$a.j();
                var8_8 /* !! */  = "master_flag";
                var30_30 = (int)var4_4.has((String)var8_8 /* !! */ );
                if (var30_30 != 0 && (var30_30 = (int)(var4_4 = cp$a.j()).getBoolean((String)var8_8 /* !! */ )) != 0) {
                    var30_30 = 1;
                    var31_31 = 1.4E-45f;
                } else {
                    var30_30 = 0;
                    var31_31 = 0.0f;
                    var4_4 = null;
                }
                if (var30_30 == 0) ** GOTO lbl-1000
                var3_3.getClass();
                var3_3 = cp$a.j();
                var4_4 = "is_proceed_enabled";
                var15_15 = (int)var3_3.has((String)var4_4);
                if (var15_15 != 0 && (var15_15 = (int)(var3_3 = cp$a.j()).getBoolean((String)var4_4)) != 0) {
                    var15_15 = 1;
                } else lbl-1000:
                // 2 sources

                {
                    var15_15 = 0;
                    var3_3 = null;
                }
                if (var15_15 == 0) ** GOTO lbl-1000
                var3_3 = var2_2.t;
                if (var3_3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                    var15_15 = 0;
                    var3_3 = null;
                }
                if ((var15_15 = (int)var3_3.i1) == 0) {
                    var3_3 = var2_2.C;
                    if (var3_3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                        var15_15 = 0;
                        var3_3 = null;
                    }
                    var3_3.setClickable((boolean)var6_6);
                    var15_15 = (int)og1_1.b();
                    if (var15_15 != 0) {
                        var3_3 = var2_2.C;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                            var15_15 = 0;
                            var3_3 = null;
                        }
                        var30_30 = hv3_0.m(R$color.luxe_color_121212);
                        var3_3.setBackgroundColor(var30_30);
                        var3_3 = var2_2.C;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                            var15_15 = 0;
                            var3_3 = null;
                        }
                        var30_30 = hv3_0.m(R$color.luxe_color_E0E0E0);
                        var3_3.setTextColor(var30_30);
                    } else {
                        var3_3 = var2_2.C;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                            var15_15 = 0;
                            var3_3 = null;
                        }
                        var30_30 = R$drawable.revamp_secondary_button_bg;
                        var3_3.setBackgroundResource(var30_30);
                        var3_3 = var2_2.C;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                            var15_15 = 0;
                            var3_3 = null;
                        }
                        var30_30 = hv3_0.m(R$color.accent_color_11);
                        var3_3.setTextColor(var30_30);
                    }
                } else lbl-1000:
                // 4 sources

                {
                    if ((var3_3 = var2_2.C) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                        var15_15 = 0;
                        var3_3 = null;
                    }
                    var3_3.setClickable(false);
                    var15_15 = (int)og1_1.b();
                    if (var15_15 != 0) {
                        var3_3 = var2_2.C;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                            var15_15 = 0;
                            var3_3 = null;
                        }
                        var30_30 = hv3_0.m(R$color.luxe_color_F5F5F5);
                        var3_3.setBackgroundColor(var30_30);
                        var3_3 = var2_2.C;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                            var15_15 = 0;
                            var3_3 = null;
                        }
                        var30_30 = hv3_0.m(R$color.luxe_color_A5A5A5);
                        var3_3.setTextColor(var30_30);
                    } else {
                        var3_3 = var2_2.C;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                            var15_15 = 0;
                            var3_3 = null;
                        }
                        var30_30 = R$drawable.revamp_disable_btn_bg;
                        var3_3.setBackgroundResource(var30_30);
                        var3_3 = var2_2.C;
                        if (var3_3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                            var15_15 = 0;
                            var3_3 = null;
                        }
                        var30_30 = hv3_0.m(R$color.accent_color_12);
                        var3_3.setTextColor(var30_30);
                    }
                }
                var3_3 = var2_2.A;
                if (var3_3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var16_16);
                    var15_15 = 0;
                    var3_3 = null;
                }
                var31_31 = this.D();
                var4_4 = qz2_0.u(var31_31);
                var3_3.setText((CharSequence)var4_4);
            }
            var3_3 = var2_2.G;
            if (var3_3 != null && (var15_15 = var3_3.getVisibility()) == 0) {
                var15_15 = 1;
            } else {
                var15_15 = 0;
                var3_3 = null;
            }
            if (var15_15 == 0) break block105;
            var3_3 = var2_2.t;
            if (var3_3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                var15_15 = 0;
                var3_3 = null;
            }
            if ((var15_15 = (int)var3_3.c()) == 0) ** GOTO lbl-1000
            var3_3 = var2_2.x;
            if (var3_3 != null && (var3_3 = var3_3.a) != null) {
                var3_3 = var3_3.getProducts();
            } else {
                var15_15 = 0;
                var3_3 = null;
            }
            var3_3 = (Collection)var3_3;
            if (var3_3 != null && (var15_15 = (int)var3_3.isEmpty()) == 0) {
                var6_6 = 0;
            }
            if (var6_6 != 0) {
                this.Lb();
                var3_3 = var2_2.t;
                if (var3_3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                    var9_9 = 0;
                    var8_8 /* !! */  = null;
                } else {
                    var8_8 /* !! */  = var3_3;
                }
                var8_8 /* !! */ .getClass();
                var3_3 = cp_1.Companion;
                var3_3.getClass();
                var15_15 = (int)cp$a.y();
                if (var15_15 != 0) {
                    var17_17 = 4;
                    var18_18 = 5.6E-45f;
                    var19_19 = null;
                    var10_10 = var8_8 /* !! */ .d;
                    var23_23 = 0;
                    var24_24 = null;
                    var25_25 = 10;
                    var16_16 = null;
                    var3_3 = WishListRepo.getWishList$default((WishListRepo)var10_10, 0, var25_25, false, var17_17, null);
                    var30_30 = 2;
                    var31_31 = 2.8E-45f;
                    var14_14 = new vl_2(var8_8 /* !! */ , var30_30);
                    var5_5 = new iX1(0, (Function1)var14_14);
                    var14_14 = new xl_2(var8_8 /* !! */ , var30_30);
                    var4_4 = new jX1(0, (Function1)var14_14);
                    var3_3 = var3_3.f((o60_0)var5_5, (o60_0)var4_4);
                    var14_14 = var8_8 /* !! */ .g;
                    var14_14.b((yr0_2)var3_3);
                }
            } else if ((var3_3 = var2_2.H) != null) {
                var14_14 = this.Y1();
                var4_4 = this.requireActivity().getApplication();
                var5_5 = "getApplication(...)";
                Intrinsics.checkNotNullExpressionValue(var4_4, (String)var5_5);
                var3_3.b((ProductsList)var14_14, (Application)var4_4);
            }
        }
    }

    public final void Cb() {
        boolean bl2 = this.U;
        int n3 = 1;
        if (bl2) {
            Object object;
            boolean bl3;
            Collection<CartEntry> collection;
            bl2 = false;
            this.U = false;
            Object object2 = this.t;
            String string2 = "cartViewModel";
            Object object3 = null;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object2 = null;
            }
            if ((collection = ((wx1_1)object2).N0) != null && (collection = (Collection)((wx1_1)object2).P0) != null && !(bl3 = collection.isEmpty())) {
                boolean bl4;
                collection = new Collection<CartEntry>();
                Object object4 = ((wx1_1)object2).N0;
                Intrinsics.checkNotNull(object4);
                object4 = ((ArrayList)object4).iterator();
                while (bl4 = object4.hasNext()) {
                    boolean bl5;
                    CartModification cartModification = (CartModification)object4.next();
                    Object object5 = ((wx1_1)object2).P0;
                    Intrinsics.checkNotNull(object5);
                    object5 = object5.iterator();
                    while (bl5 = object5.hasNext()) {
                        Object object6;
                        int n4;
                        Object object7;
                        CartEntry cartEntry = (CartEntry)object5.next();
                        if (cartEntry != null && (object7 = cartEntry.getProduct()) != null) {
                            object7 = ((Product)object7).getCode();
                        } else {
                            n4 = 0;
                            object7 = null;
                        }
                        if (object7 == null || (n4 = ((String)object7).length()) == 0) continue;
                        if (cartModification != null && (object7 = cartModification.getEntry()) != null && (object7 = ((CartEntry)object7).getProduct()) != null) {
                            object7 = ((Product)object7).getCode();
                        } else {
                            n4 = 0;
                            object7 = null;
                        }
                        if (object7 == null || (n4 = ((String)object7).length()) == 0) continue;
                        if (cartModification != null && (object7 = cartModification.getEntry()) != null && (object7 = ((CartEntry)object7).getProduct()) != null) {
                            object7 = ((Product)object7).getCode();
                        } else {
                            n4 = 0;
                            object7 = null;
                        }
                        Intrinsics.checkNotNull(object7);
                        object6 = cartEntry != null && (object6 = cartEntry.getProduct()) != null ? ((Product)object6).getCode() : null;
                        n4 = (int)(kotlin.text.b.i((String)object7, (String)object6, n3 != 0) ? 1 : 0);
                        if (n4 == 0) continue;
                        Intrinsics.checkNotNull(cartEntry);
                        ((ArrayList)collection).add(cartEntry);
                    }
                }
                n3 = ((ArrayList)collection).size();
                if (n3 > 0) {
                    ((wx1_1)object2).N0 = null;
                    object = new Object();
                    object4 = new pX1((ox1_0)object);
                    bx_2.q(collection, (Comparator)object4);
                    object2 = ((wx1_1)object2).Z;
                    object = DataCallback.Companion.onSuccess(collection);
                    ((LiveData)object2).k(object);
                }
            }
            if ((object2 = this.t) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object2 = null;
            }
            object2.getClass();
            object = CartRepo.INSTANCE;
            object2 = ((wx1_1)object2).T0;
            ((CartRepo)object).sendOosEvents((List)object2);
            object2 = this.t;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object2;
            }
            object3.getClass();
            object2 = ((wx1_1)object3).S0;
            object2 = ((CartRepo)object).sendRTBAndCriteoEvents((Cart)object2);
            n3 = ((String)object2).length();
            if (n3 > 0) {
                ((wx1_1)object3).f((String)object2);
            }
        } else {
            this.Za(n3 != 0);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final float D() {
        float f5;
        Object object = cp_1.Companion;
        object.getClass();
        int n3 = cp$a.i();
        float f6 = 0.0f;
        String string2 = "cartViewModel";
        Object object2 = null;
        if (n3 != 0) {
            object = this.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
                f5 = 0.0f;
            }
            if ((object = ((wx1_1)object).S0) != null) {
                object = ((Cart)object).getNetPayable();
            } else {
                n3 = 0;
                object = null;
                f5 = 0.0f;
            }
            if (object != null) {
                object = this.t;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object = null;
                    f5 = 0.0f;
                }
                if ((object = ((wx1_1)object).S0) != null) {
                    object = ((Cart)object).getNetPayable();
                } else {
                    n3 = 0;
                    object = null;
                    f5 = 0.0f;
                }
                Intrinsics.checkNotNull(object);
                f5 = ((Float)object).floatValue();
                float f7 = f5 - 0.0f;
                n3 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
                if (n3 >= 0) {
                    object = this.t;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n3 = 0;
                        object = null;
                        f5 = 0.0f;
                    }
                    if ((object = ((wx1_1)object).S0) != null && (n3 = (int)(((Cart)object).isOtpValidationRequired() ? 1 : 0)) == 0) {
                        object = this.t;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n3 = 0;
                            object = null;
                            f5 = 0.0f;
                        }
                        if ((object = ((wx1_1)object).S0) != null) {
                            object2 = ((Cart)object).getNetPayable();
                        }
                        Intrinsics.checkNotNull(object2);
                        return ((Float)object2).floatValue();
                    }
                }
            }
        }
        if ((object = this.t) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
            f5 = 0.0f;
        }
        if ((object = ((wx1_1)object).S0) != null && (object = ((Cart)object).getTotalPriceWithTax()) != null) {
            object = ((Price)object).getValue();
        } else {
            n3 = 0;
            object = null;
            f5 = 0.0f;
        }
        if (object == null) return f6;
        n3 = ((String)object).length();
        if (n3 == 0) return f6;
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
            f5 = 0.0f;
        }
        if ((object = ((wx1_1)object).S0) != null && (object = ((Cart)object).getTotalPriceWithTax()) != null) {
            object2 = ((Price)object).getValue();
        }
        Intrinsics.checkNotNull(object2);
        return Float.parseFloat(object2);
    }

    public final void D1() {
        block5: {
            Object object;
            block4: {
                object = this.L0;
                if (object == null) break block4;
                object = ((Fragment)object).isAdded();
                Intrinsics.checkNotNull(object);
                boolean bl2 = (Boolean)object;
                if (bl2) break block5;
            }
            this.L0 = object = new qi2_2();
            Intrinsics.checkNotNullParameter(this, "onCartClickListener");
            ((qi2_2)object).g = this;
            object = ((bp_1)this.h1.getValue()).a;
            Object object2 = this.S2();
            ((LiveData)object).k(object2);
            object = this.L0;
            if (object != null) {
                object2 = this.requireActivity().getSupportFragmentManager();
                String string2 = "RemoveAll";
                ((DialogFragment)object).show((FragmentManager)object2, string2);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void Db(Cart var1_1) {
        block60: {
            block61: {
                block62: {
                    var2_2 = this;
                    var3_3 = this.t;
                    var4_4 = "cartViewModel";
                    if (var3_3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                        var5_5 = var1_1;
                        var3_3 = null;
                    } else {
                        var5_5 = var1_1;
                    }
                    var3_3.S0 = var5_5;
                    var3_3 = var2_2.t;
                    if (var3_3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                        var3_3 = null;
                    }
                    var3_3.T0.clear();
                    var3_3 = var2_2.t;
                    if (var3_3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                        var3_3 = null;
                    }
                    var3_3.U0.clear();
                    var3_3 = var2_2.t;
                    if (var3_3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                        var3_3 = null;
                    }
                    var3_3.V0 = var5_5 = new ProductsList();
                    var3_3 = var2_2.t;
                    if (var3_3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                        var3_3 = null;
                    }
                    var6_6 = 0;
                    var4_4 = null;
                    var3_3.W0 = false;
                    var5_5 = var3_3.S0;
                    if (var5_5 == null || (var5_5 = var5_5.getEntries()) == null) break block60;
                    var7_7 = var3_3.Z0;
                    var8_8 = 1;
                    if (var7_7 != 0) {
                        var9_9 = var3_3.S0;
                        if (var9_9 != null && (var9_9 = var9_9.getEntries()) != null) {
                            var10_10 = new StringBuilder();
                            var11_11 = new StringBuilder();
                            var12_12 = new StringBuilder();
                            var13_13 = new StringBuilder();
                            var14_14 = var9_9.size();
                            var16_16 = 0;
                            var17_17 = null;
                            for (var15_15 = 0; var15_15 < var14_14; ++var15_15) {
                                var18_18 = (CartEntry)var9_9.get(var15_15);
                                var19_19 = var18_18.getProduct();
                                var20_20 = var18_18.getSourceStoreId();
                                var22_22 = kotlin.text.b.i((String)var20_20, (String)(var21_21 = "luxe"), false);
                                if (var22_22 != 0) {
                                    ++var16_16;
                                }
                                var21_21 = var19_19.getCode();
                                var10_10.append((String)var21_21);
                                var21_21 = var19_19.getWasPriceData();
                                if (var21_21 != null && (var21_21 = var21_21.getValue()) != null) {
                                    var23_23 = Float.parseFloat((String)var21_21);
                                } else {
                                    var22_22 = 0;
                                    var23_23 = 0.0f;
                                    var21_21 = null;
                                }
                                var11_11.append(var23_23);
                                var21_21 = var18_18.getBasePrice().getValue();
                                if (var21_21 != null) {
                                    var23_23 = Float.parseFloat((String)var21_21);
                                } else {
                                    var22_22 = 0;
                                    var23_23 = 0.0f;
                                    var21_21 = null;
                                }
                                var12_12.append(var23_23);
                                var21_21 = var19_19.getBrandName();
                                var13_13.append((String)var21_21);
                                var21_21 = var19_19.getBaseProduct();
                                if (var21_21 == null) {
                                    var19_19.getCode();
                                } else {
                                    var19_19.getBaseProduct();
                                }
                                var22_22 = var9_9.size() - var8_8;
                                if (var15_15 == var22_22) continue;
                                var21_21 = ",";
                                var10_10.append((String)var21_21);
                                var11_11.append((String)var21_21);
                                var12_12.append((String)var21_21);
                                var13_13.append((String)var21_21);
                            }
                            var21_21 = new HashMap();
                            var20_20 = var10_10.toString();
                            var21_21.put("SKU", var20_20);
                            var9_9 = var3_3.S0;
                            if (var9_9 != null) {
                                var7_7 = var9_9.getTotalItems();
                                var9_9 = var7_7;
                            } else {
                                var7_7 = 0;
                                var9_9 = null;
                            }
                            var21_21.put("Item_count", var9_9);
                            var20_20 = var11_11.toString();
                            var21_21.put("MRP", var20_20);
                            var20_20 = var12_12.toString();
                            var21_21.put("Final_price", var20_20);
                            var20_20 = var13_13.toString();
                            var21_21.put("Brand", var20_20);
                            var9_9 = var16_16;
                            var20_20 = "LUXE Item count";
                            var21_21.put(var20_20, var9_9);
                            var9_9 = var3_3.S0;
                            if (var9_9 != null) {
                                var9_9 = var9_9.getAppliedVouchers();
                            } else {
                                var7_7 = 0;
                                var9_9 = null;
                            }
                            if (var9_9 != null) {
                                var24_24 = var9_9.size();
                            } else {
                                var24_24 = 0;
                                var20_20 = null;
                            }
                            if (var24_24 > 0) {
                                Intrinsics.checkNotNull(var9_9);
                                var9_9 = (CartAppliedVoucher)var9_9.get(0);
                                if (var9_9 != null) {
                                    var20_20 = var9_9.getVoucherCode();
                                } else {
                                    var24_24 = 0;
                                    var20_20 = null;
                                }
                                if (var20_20 != null) {
                                    var20_20 = "Coupon_code";
                                    var9_9 = var9_9.getVoucherCode();
                                    var21_21.put(var20_20, var9_9);
                                }
                            }
                            if ((var9_9 = var3_3.S0) == null || (var9_9 = var9_9.getTotalPrice()) == null || (var9_9 = var9_9.getValue()) == null) {
                                var9_9 = "0";
                            }
                            var25_25 = Double.parseDouble((String)var9_9);
                            var9_9 = var25_25;
                            var21_21.put("Cart_value", var9_9);
                            var9_9 = AnalyticsManager.Companion.getInstance().getCt();
                            var27_26 = 0L;
                            var29_27 = 65279;
                            var20_20 = new AnalyticsData(null, null, null, var27_26, null, null, null, null, (HashMap)var21_21, null, null, null, null, null, null, null, var29_27, null);
                            var9_9.couponApplied((AnalyticsData)var20_20);
                        }
                        var3_3.Z0 = false;
                    }
                    var21_21 = new HashMap();
                    var9_9 = var3_3.S0;
                    if (var9_9 != null) {
                        var20_20 = var3_3.Q0;
                        if (var20_20 != null && (var30_28 = var20_20.size()) > 0) {
                            var9_9.setOosCartEntries((ArrayList)var20_20);
                            var24_24 = 0;
                            var20_20 = null;
                            var3_3.Q0 = null;
                        } else {
                            var24_24 = 0;
                            var20_20 = null;
                        }
                        var10_10 = var3_3.R0;
                        if (var10_10 != null && (var31_29 = var10_10.size()) > 0) {
                            var9_9.setLowStockCartEntries((ArrayList)var10_10);
                            var3_3.R0 = null;
                        }
                    }
                    var9_9 = var3_3.S0;
                    Intrinsics.checkNotNull(var9_9);
                    if (var9_9 == null || (var20_20 = var9_9.getEntries()) == null) break block61;
                    var20_20 = var9_9.getAppliedVouchers();
                    if (var20_20 == null || (var30_28 = var20_20.size()) <= 0) break block62;
                    var10_10 = var9_9.getEntries();
                    var30_28 = var10_10.size();
                    var11_11 = null;
                    for (var31_29 = 0; var31_29 < var30_28; ++var31_29) {
                        block64: {
                            block63: {
                                var12_12 = (CartEntry)var9_9.getEntries().get(var31_29);
                                if (var12_12 != null && (var13_13 = var12_12.getEntryNumber()) != null) break block63;
                                var19_19 = null;
                                break block64;
                            }
                            var13_13 = var12_12.getEntryNumber();
                            if ((var13_13 = (LinkedHashSet)var21_21.get(var13_13)) == null) {
                                var13_13 = new LinkedHashSet();
                            }
                            var32_30 = var20_20;
                            var32_30 = (Collection)var20_20;
                            var14_14 = var32_30.size();
                            for (var15_15 = 0; var15_15 < var14_14; ++var15_15) {
                                var18_18 = (CartAppliedVoucher)var20_20.get(var15_15);
                                var17_17 = new CartPromotion((CartAppliedVoucher)var18_18);
                                var17_17.setCouponCode((boolean)var8_8);
                                var18_18 = var12_12.getVoucherPromoAmt();
                                var33_31 = mz3_0.J((String)var18_18);
                                var19_19 = null;
                                cfr_temp_0 = var33_31 - 0.0f;
                                var34_32 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                if (var34_32 > 0) ** GOTO lbl-1000
                                var18_18 = var12_12.getVoucherMessages();
                                var34_32 = (int)TextUtils.isEmpty((CharSequence)var18_18);
                                if (var34_32 != 0) ** GOTO lbl-1000
                                var18_18 = var12_12.getVoucherMessages();
                                Intrinsics.checkNotNullExpressionValue(var18_18, "getVoucherMessages(...)");
                                var35_33 = var18_18.toLowerCase();
                                Intrinsics.checkNotNullExpressionValue(var35_33, "toLowerCase(...)");
                                var18_18 = "best price";
                                var8_8 = StringsKt.F((CharSequence)var35_33, (CharSequence)var18_18, false);
                                if (var8_8 == 0) lbl-1000:
                                // 2 sources

                                {
                                    var8_8 = 0;
                                    var35_33 = null;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var8_8 = 1;
                                }
                                var17_17.setApplied((boolean)var8_8);
                                var13_13.add(var17_17);
                                var8_8 = 1;
                            }
                            var19_19 = null;
                            var35_33 = var12_12.getEntryNumber();
                            var21_21.put(var35_33, var13_13);
                        }
                        var8_8 = 1;
                    }
                }
                var35_33 = new ArrayList();
                var20_20 = var9_9.getAppliedProductPromotions();
                var20_20 = var20_20 == null ? new ArrayList() : var9_9.getAppliedProductPromotions();
                var35_33.addAll(var20_20);
                var24_24 = var35_33.size();
                var10_10 = var9_9.getPotentialProductPromotions();
                if (var10_10 != null) {
                    var10_10 = var9_9.getPotentialProductPromotions();
                    var11_11 = "getPotentialProductPromotions(...)";
                    Intrinsics.checkNotNullExpressionValue(var10_10, (String)var11_11);
                    bx_2.p((List)var10_10);
                    var10_10 = var9_9.getPotentialProductPromotions();
                    var35_33.addAll(var10_10);
                }
                var30_28 = var35_33.size();
                var11_11 = null;
                for (var31_29 = 0; var31_29 < var30_28; ++var31_29) {
                    var12_12 = var35_33.get(var31_29);
                    Intrinsics.checkNotNullExpressionValue(var12_12, "get(...)");
                    var12_12 = (CartPromotion)var12_12;
                    var13_13 = var12_12.getConsumedEntires();
                    if (var13_13 != null) {
                        var32_30 = var13_13;
                        var32_30 = (Collection)var13_13;
                        var14_14 = var32_30.size();
                        for (var15_15 = 0; var15_15 < var14_14; ++var15_15) {
                            var17_17 = (CartConsumedEntry)var13_13.get(var15_15);
                            if (var17_17 != null) {
                                var16_16 = var17_17.getOrderEntryNumber();
                                var18_18 = var9_9.getEntries();
                                var34_32 = var18_18.size();
                                if (var34_32 > var16_16) {
                                    if (var31_29 < var24_24) {
                                        var34_32 = 1;
                                        var33_31 = 1.4E-45f;
                                        var12_12.setApplied((boolean)var34_32);
                                    }
                                    var18_18 = var16_16;
                                    if ((var18_18 = var21_21.get(var18_18)) == null) {
                                        var18_18 = var16_16;
                                        var4_4 = new LinkedHashSet<Object>();
                                        var21_21.put(var18_18, var4_4);
                                    }
                                    var4_4 = var16_16;
                                    var4_4 = var21_21.get(var4_4);
                                    Intrinsics.checkNotNull(var4_4);
                                    var4_4.add(var12_12);
                                }
                            }
                            var6_6 = 0;
                            var4_4 = null;
                        }
                    }
                    var6_6 = 0;
                    var4_4 = null;
                }
            }
            var6_6 = var5_5.size();
            var9_9 = null;
            for (var7_7 = 0; var7_7 < var6_6; ++var7_7) {
                var35_33 = (CartEntry)var5_5.get(var7_7);
                if (var35_33 != null) {
                    var20_20 = var35_33.getEntryNumber();
                } else {
                    var24_24 = 0;
                    var20_20 = null;
                }
                if (var20_20 == null) {
                    var36_34 = true;
                    continue;
                }
                var20_20 = var35_33.getEntryNumber();
                if ((var20_20 = var21_21.get(var20_20)) != null) {
                    var10_10 = var35_33.getEntryNumber();
                    var10_10 = var21_21.get(var10_10);
                    Intrinsics.checkNotNull(var10_10);
                    var10_10 = (Collection)var10_10;
                    var20_20 = new ArrayList(var10_10);
                    var35_33.setAllPromotionsList((ArrayList)var20_20);
                }
                if ((var20_20 = var35_33.getProduct()) != null) {
                    var20_20 = var35_33.getProduct();
                    var20_20.populate();
                }
                if ((var20_20 = var3_3.S0) != null) {
                    var20_20 = var20_20.getRestoredProducts();
                } else {
                    var24_24 = 0;
                    var20_20 = null;
                }
                if (var20_20 != null) {
                    var20_20 = var3_3.S0;
                    Intrinsics.checkNotNull(var20_20);
                    var20_20 = var20_20.getRestoredProducts();
                    var24_24 = var20_20.size();
                    var10_10 = null;
                    for (var30_28 = 0; var30_28 < var24_24; ++var30_28) {
                        var11_11 = var35_33.getProduct().getCode();
                        var12_12 = var3_3.S0;
                        if (var12_12 != null && (var12_12 = var12_12.getRestoredProducts()) != null) {
                            var12_12 = (String)var12_12.get(var30_28);
lbl326:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var12_12 = null;
                        ** continue;
                        var36_34 = true;
                        var31_29 = (int)kotlin.text.b.i((String)var11_11, (String)var12_12, var36_34);
                        if (var31_29 == 0 || (var11_11 = var3_3.S0) == null || (var11_11 = var11_11.getMergedCartEntries()) == null) continue;
                        var11_11.add(var35_33);
                    }
                }
                var36_34 = true;
                var5_5.set(var7_7, var35_33);
            }
            var4_4 = hv3_0.a;
            var4_4.getClass();
            var6_6 = (int)hv3_0.T();
            if (var6_6 != 0) {
                var4_4 = md3_0.c((jD3)var3_3);
                var7_7 = 0;
                var9_9 = null;
                var21_21 = new qx1_2((ArrayList)var5_5, (wx1_1)var3_3, null);
                var37_35 = 3;
                Ae3.d((i90_0)var4_4, null, null, (Function2)var21_21, var37_35);
            }
            if ((var4_4 = var3_3.S0) != null && (var4_4 = var4_4.getEntries()) != null) {
                cp_1.Companion.getClass();
                var4_4 = cp$a.e();
                var3_3 = var3_3.S0;
                var4_4.getClass();
                if (var3_3 != null) {
                    var4_4 = var3_3.getBagTotalAmount();
                    var5_5 = new zo_2((Cart)var3_3);
                    var21_21 = var3_3.getBagDiscount();
                    if ((var4_4 = (Unit)ai0_2.r((Function2)var5_5, var4_4, var21_21)) == null) {
                        cp_1.P((CartAndOrder)var3_3);
                    }
                }
            }
        }
    }

    public final void E8() {
        boolean bl2;
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            bl2 = false;
            wx1_12 = null;
        }
        if (bl2 = wx1_12.c()) {
            this.xb();
        } else {
            this.T2();
        }
    }

    public final void Eb() {
        GoogleAnalyticsEvents googleAnalyticsEvents = AnalyticsManager.Companion.getInstance().getGa();
        Object object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            object = null;
        }
        object = ((wx1_1)object).a.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        object = ((UserInformation)object).getUserStatusMessage();
        String string2 = "LoggedInStatus";
        googleAnalyticsEvents.trackCustomDimension((String)object, string2, string2, "bag screen");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void F(Product product, int n3, String string2) {
        Object object = this;
        Object object2 = product;
        Object object3 = string2;
        Intrinsics.checkNotNullParameter(string2, "listType");
        Object object4 = AnalyticsManager.Companion;
        object3 = "closet screen";
        Object object5 = "Show PDP";
        String string3 = "closet List";
        tj2_0.e((AnalyticsManager$Companion)object4, (String)object5, string3, (String)object3);
        object4 = this.w;
        if (object4 != null) {
            object4 = object3 = ((wn_1)object4).c;
            object5 = ((NewEEcommerceEventsRevamp)object3).getEE_SELECT_ITEM();
            String string4 = ((NewEEcommerceEventsRevamp)object3).getPrevScreen();
            String string5 = ((NewEEcommerceEventsRevamp)object3).getPrevScreenType();
            int n4 = 4192848;
            string3 = "Closet List";
            String string6 = "closet screen";
            String string7 = "closet screen";
            long l2 = 0L;
            object3 = product;
            object = product;
            NewEEcommerceEventsRevamp.pushEEProductSelect$default((NewEEcommerceEventsRevamp)object4, product, n3, (String)object5, string3, null, string6, false, string4, string7, null, string5, null, null, false, null, null, l2, null, null, null, null, null, n4, null);
        } else {
            object = product;
        }
        object4 = null;
        if (object != null) {
            object3 = product.getSourceStoreId();
            object2 = object;
        } else {
            object2 = object;
            object3 = null;
        }
        object = this;
        object5 = this.s;
        if (object5 == null) {
            object5 = "pdpListener";
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
        } else {
            object4 = object5;
        }
        eA2$a.a((ea2_1)object4, (Product)object2, (String)object3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void F3(Integer object, String string2) {
        int n3;
        Intrinsics.checkNotNullParameter(string2, "action");
        String string3 = "Add to Bag";
        Intrinsics.checkNotNullParameter(string3, "screenNname");
        String string4 = "closet screen";
        object = object != null && (n3 = ((Integer)object).intValue()) == 0 ? AnalyticsManager.Companion : AnalyticsManager.Companion;
        tj2_0.e((AnalyticsManager$Companion)object, string2, string3, string4);
    }

    public final boolean F4() {
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            wx1_12 = null;
        }
        return wx1_12.j1;
    }

    public final void F6() {
        boolean bl2;
        ex1_0 ex1_02 = this;
        Object object = this.w;
        if (object != null) {
            String string2;
            Object object2 = this.s0;
            Bundle bundle = new Bundle();
            Object object3 = ((wn_1)object).a.S0;
            Object object4 = ((wn_1)object).b;
            if (object3 != null && (object3 = ((Cart)object3).getDeliveryAddress()) != null) {
                boolean bl3 = ((CartDeliveryAddress)object3).isDefaultAddress();
                string2 = ((NewCustomEventsRevamp)object4).getSV_EP_DEF_ADD();
                bundle.putBoolean(string2, bl3);
            }
            object3 = ((NewCustomEventsRevamp)object4).getSV_ESTIMATE_DELIVERY_DATE();
            bundle.putString((String)object3, (String)object2);
            object2 = AnalyticsManager.Companion;
            String string3 = bv_0.a((AnalyticsManager$Companion)object2);
            String string4 = cv_0.a((AnalyticsManager$Companion)object2);
            int n3 = 1536;
            object3 = ((wn_1)object).b;
            object4 = "bag interactions";
            string2 = "change click";
            String string5 = "";
            String string6 = "bag_interaction";
            String string7 = "bag screen";
            String string8 = "bag screen";
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, (String)object4, string2, string5, string6, string7, string8, string3, bundle, string4, false, null, n3, null);
        }
        if ((object = ex1_02.t) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            bl2 = false;
            object = null;
        }
        if (bl2 = ((wx1_1)object).c()) {
            this.xb();
        } else {
            bl2 = h40_0.Q1();
            if (bl2) {
                this.xb();
            } else {
                this.T2();
            }
        }
    }

    public final void Fb() {
        Object object;
        int n3;
        int n4 = 1;
        int n7 = 0;
        Object object2 = this.t;
        if (object2 != null && (object2 = ((wx1_1)object2).S0) != null) {
            n3 = ((Cart)object2).getTotalUnitCount();
        } else {
            n3 = 0;
            object2 = null;
        }
        if (n3 > 0) {
            if (n3 == n4) {
                int n8 = R$string.bag_sub_title_one_luxe;
                object2 = n3;
                object = new Object[n4];
                object[0] = object2;
                object = hv3_0.L(n8, (Object[])object);
            } else {
                int n10 = R$string.bag_sub_title_multiple_luxe;
                object2 = n3;
                object = new Object[n4];
                object[0] = object2;
                object = hv3_0.L(n10, (Object[])object);
            }
        } else {
            object = "";
        }
        n3 = object.length();
        if (n3 == 0) {
            object = this.K;
            if (object != null) {
                n7 = 8;
                object.setVisibility(n7);
            }
        } else {
            object2 = this.K;
            if (object2 != null) {
                object2.setText((CharSequence)object);
            }
            if ((object = this.K) != null) {
                object.setVisibility(0);
            }
        }
    }

    public final void G2(Product object) {
        if (object != null) {
            zz_2.a((Product)object);
            Object object2 = h40_0.a;
            object2 = h40_0.r();
            zz_2.b((Product)object, (String)object2);
            object2 = AnalyticsManager.Companion.getInstance().getCt();
            AnalyticsData$Builder analyticsData$Builder = new AnalyticsData$Builder();
            cp_1.Companion.getClass();
            cp_1 cp_12 = cp$a.e();
            cp_12.getClass();
            object = cp_1.i((Product)object);
            object = analyticsData$Builder.eventMap((HashMap)object).build();
            ((CleverTapEvents)object2).pushNotifyMeEvent((AnalyticsData)object);
            object = h40_0.r();
            object2 = null;
            analyticsData$Builder = null;
            hv3_0.o0(0, (String)object, null);
        }
    }

    public final ex1_0 G6() {
        return this;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void Gb() {
        void var5_146;
        void var5_142;
        Cart cart;
        wx1_1 wx1_12;
        void var5_126;
        AjioTextView ajioTextView;
        String string2;
        String string3;
        int n3;
        block73: {
            AjioTextView ajioTextView2;
            block75: {
                AjioTextView ajioTextView3;
                block78: {
                    AjioTextView ajioTextView4;
                    block79: {
                        void var5_114;
                        CartDeliveryAddress cartDeliveryAddress;
                        void var5_108;
                        Cart cart2;
                        void var5_105;
                        CartDeliveryAddress cartDeliveryAddress2;
                        void var5_99;
                        Cart cart3;
                        void var5_96;
                        CartDeliveryAddress cartDeliveryAddress3;
                        void var5_90;
                        Cart cart4;
                        void var5_87;
                        void var5_83;
                        Cart cart5;
                        void var5_78;
                        void var5_74;
                        Cart cart6;
                        wx1_1 wx1_13;
                        AddressType addressType;
                        block76: {
                            AjioTextView ajioTextView5;
                            block77: {
                                void var5_67;
                                CartDeliveryAddress cartDeliveryAddress4;
                                void var5_61;
                                Cart cart7;
                                void var5_58;
                                CartDeliveryAddress cartDeliveryAddress5;
                                void var5_52;
                                Cart cart8;
                                void var5_49;
                                CartDeliveryAddress cartDeliveryAddress6;
                                void var5_43;
                                Cart cart9;
                                ArrayList arrayList;
                                block74: {
                                    void var5_38;
                                    CartDeliveryAddress cartDeliveryAddress7;
                                    void var5_32;
                                    Cart cart10;
                                    void var5_29;
                                    CartDeliveryAddress cartDeliveryAddress8;
                                    void var5_23;
                                    Cart cart11;
                                    void var5_20;
                                    CartDeliveryAddress cartDeliveryAddress9;
                                    void var5_14;
                                    Cart cart12;
                                    void var5_8;
                                    n3 = h40_0.Q1();
                                    string3 = "proceedToShipping";
                                    string2 = "cartViewModel";
                                    ajioTextView = null;
                                    if (n3 == 0) break block73;
                                    wx1_1 wx1_14 = this.t;
                                    if (wx1_14 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n3 = 0;
                                        Object var5_7 = null;
                                    }
                                    if ((n3 = var5_8.c()) == 0) {
                                        AjioTextView ajioTextView6 = this.C;
                                        if (ajioTextView6 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                                        } else {
                                            ajioTextView = ajioTextView6;
                                        }
                                        n3 = R$string.login_sign_up;
                                        String string4 = hv3_0.K(n3);
                                        ajioTextView.setText(string4);
                                        return;
                                    }
                                    ArrayList arrayList2 = this.r0;
                                    if (arrayList2 != null && (n3 = arrayList2.isEmpty()) == 0) break block74;
                                    wx1_1 wx1_15 = this.t;
                                    if (wx1_15 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n3 = 0;
                                        Object var5_13 = null;
                                    }
                                    if ((cart12 = var5_14.S0) != null && (cartDeliveryAddress9 = cart12.getDeliveryAddress()) != null) {
                                        AddressType addressType2 = cartDeliveryAddress9.getAddressType();
                                    } else {
                                        n3 = 0;
                                        Object var5_19 = null;
                                    }
                                    addressType = AddressType.Pincode;
                                    if (var5_20 == addressType) break block75;
                                    wx1_1 wx1_16 = this.t;
                                    if (wx1_16 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n3 = 0;
                                        Object var5_22 = null;
                                    }
                                    if ((cart11 = var5_23.S0) != null && (cartDeliveryAddress8 = cart11.getDeliveryAddress()) != null) {
                                        AddressType addressType3 = cartDeliveryAddress8.getAddressType();
                                    } else {
                                        n3 = 0;
                                        Object var5_28 = null;
                                    }
                                    addressType = AddressType.PinCodeEmpty;
                                    if (var5_29 == addressType) break block75;
                                    wx1_1 wx1_17 = this.t;
                                    if (wx1_17 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n3 = 0;
                                        Object var5_31 = null;
                                    }
                                    if ((cart10 = var5_32.S0) != null && (cartDeliveryAddress7 = cart10.getDeliveryAddress()) != null) {
                                        AddressType addressType4 = cartDeliveryAddress7.getAddressType();
                                    } else {
                                        n3 = 0;
                                        Object var5_37 = null;
                                    }
                                    addressType = AddressType.None;
                                    if (var5_38 == addressType) break block75;
                                }
                                if ((arrayList = this.r0) == null || (n3 = (int)(arrayList.isEmpty() ? 1 : 0)) != 0) break block76;
                                wx1_1 wx1_18 = this.t;
                                if (wx1_18 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                                    n3 = 0;
                                    Object var5_42 = null;
                                }
                                if ((cart9 = var5_43.S0) != null && (cartDeliveryAddress6 = cart9.getDeliveryAddress()) != null) {
                                    AddressType addressType5 = cartDeliveryAddress6.getAddressType();
                                } else {
                                    n3 = 0;
                                    Object var5_48 = null;
                                }
                                addressType = AddressType.Pincode;
                                if (var5_49 == addressType) break block77;
                                wx1_1 wx1_19 = this.t;
                                if (wx1_19 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                                    n3 = 0;
                                    Object var5_51 = null;
                                }
                                if ((cart8 = var5_52.S0) != null && (cartDeliveryAddress5 = cart8.getDeliveryAddress()) != null) {
                                    AddressType addressType6 = cartDeliveryAddress5.getAddressType();
                                } else {
                                    n3 = 0;
                                    Object var5_57 = null;
                                }
                                addressType = AddressType.PinCodeEmpty;
                                if (var5_58 == addressType) break block77;
                                wx1_1 wx1_110 = this.t;
                                if (wx1_110 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                                    n3 = 0;
                                    Object var5_60 = null;
                                }
                                if ((cart7 = var5_61.S0) != null && (cartDeliveryAddress4 = cart7.getDeliveryAddress()) != null) {
                                    AddressType addressType7 = cartDeliveryAddress4.getAddressType();
                                } else {
                                    n3 = 0;
                                    Object var5_66 = null;
                                }
                                addressType = AddressType.None;
                                if (var5_67 != addressType) break block76;
                            }
                            if ((ajioTextView5 = this.C) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string3);
                            } else {
                                ajioTextView = ajioTextView5;
                            }
                            n3 = R$string.select_address;
                            String string5 = hv3_0.K(n3);
                            ajioTextView.setText(string5);
                            return;
                        }
                        if ((wx1_13 = this.t) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n3 = 0;
                            Object var5_73 = null;
                        }
                        if ((cart6 = var5_74.S0) != null) {
                            CartDeliveryAddress cartDeliveryAddress10 = cart6.getDeliveryAddress();
                        } else {
                            n3 = 0;
                            Object var5_77 = null;
                        }
                        if (var5_78 == null) {
                            AjioTextView ajioTextView7 = this.C;
                            if (ajioTextView7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string3);
                            } else {
                                ajioTextView = ajioTextView7;
                            }
                            n3 = R$string.select_address;
                            String string6 = hv3_0.K(n3);
                            ajioTextView.setText(string6);
                            return;
                        }
                        wx1_1 wx1_111 = this.t;
                        if (wx1_111 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n3 = 0;
                            Object var5_82 = null;
                        }
                        if ((cart5 = var5_83.S0) != null) {
                            CartDeliveryAddress cartDeliveryAddress11 = cart5.getDeliveryAddress();
                        } else {
                            n3 = 0;
                            Object var5_86 = null;
                        }
                        if (var5_87 == null) break block78;
                        wx1_1 wx1_112 = this.t;
                        if (wx1_112 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n3 = 0;
                            Object var5_89 = null;
                        }
                        if ((cart4 = var5_90.S0) != null && (cartDeliveryAddress3 = cart4.getDeliveryAddress()) != null) {
                            AddressType addressType8 = cartDeliveryAddress3.getAddressType();
                        } else {
                            n3 = 0;
                            Object var5_95 = null;
                        }
                        addressType = AddressType.Pincode;
                        if (var5_96 == addressType) break block79;
                        wx1_1 wx1_113 = this.t;
                        if (wx1_113 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n3 = 0;
                            Object var5_98 = null;
                        }
                        if ((cart3 = var5_99.S0) != null && (cartDeliveryAddress2 = cart3.getDeliveryAddress()) != null) {
                            AddressType addressType9 = cartDeliveryAddress2.getAddressType();
                        } else {
                            n3 = 0;
                            Object var5_104 = null;
                        }
                        addressType = AddressType.PinCodeEmpty;
                        if (var5_105 == addressType) break block79;
                        wx1_1 wx1_114 = this.t;
                        if (wx1_114 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n3 = 0;
                            Object var5_107 = null;
                        }
                        if ((cart2 = var5_108.S0) != null && (cartDeliveryAddress = cart2.getDeliveryAddress()) != null) {
                            AddressType addressType10 = cartDeliveryAddress.getAddressType();
                        } else {
                            n3 = 0;
                            Object var5_113 = null;
                        }
                        AddressType addressType11 = AddressType.None;
                        if (var5_114 != addressType11) break block78;
                    }
                    if ((ajioTextView4 = this.C) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                    } else {
                        ajioTextView = ajioTextView4;
                    }
                    n3 = R$string.add_address;
                    String string7 = hv3_0.K(n3);
                    ajioTextView.setText(string7);
                    return;
                }
                if ((ajioTextView3 = this.C) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                } else {
                    ajioTextView = ajioTextView3;
                }
                String string8 = this.Z0;
                ajioTextView.setText(string8);
                return;
            }
            if ((ajioTextView2 = this.C) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                ajioTextView = ajioTextView2;
            }
            n3 = R$string.add_address;
            String string9 = hv3_0.K(n3);
            ajioTextView.setText(string9);
            return;
        }
        wx1_1 wx1_115 = this.t;
        if (wx1_115 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            Object var5_125 = null;
        }
        if ((n3 = var5_126.c()) == 0) {
            AjioTextView ajioTextView8 = this.C;
            if (ajioTextView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                ajioTextView = ajioTextView8;
            }
            n3 = R$string.login_sign_up;
            String string10 = hv3_0.K(n3);
            ajioTextView.setText(string10);
            return;
        }
        ArrayList arrayList = this.r0;
        if (arrayList == null || (n3 = arrayList.isEmpty()) != 0) {
            void var5_136;
            void var5_132;
            Cart cart13;
            wx1_1 wx1_116 = this.t;
            if (wx1_116 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                Object var5_131 = null;
            }
            if ((cart13 = var5_132.S0) != null) {
                CartDeliveryAddress cartDeliveryAddress = cart13.getDeliveryAddress();
            } else {
                n3 = 0;
                Object var5_135 = null;
            }
            if (var5_136 == null) {
                AjioTextView ajioTextView9 = this.C;
                if (ajioTextView9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                } else {
                    ajioTextView = ajioTextView9;
                }
                n3 = R$string.add_address;
                String string11 = hv3_0.K(n3);
                ajioTextView.setText(string11);
                return;
            }
        }
        if ((wx1_12 = this.t) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            Object var5_141 = null;
        }
        if ((cart = var5_142.S0) != null) {
            CartDeliveryAddress cartDeliveryAddress = cart.getDeliveryAddress();
        } else {
            n3 = 0;
            Object var5_145 = null;
        }
        if (var5_146 == null) {
            AjioTextView ajioTextView10 = this.C;
            if (ajioTextView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                ajioTextView = ajioTextView10;
            }
            n3 = R$string.select_address;
            String string12 = hv3_0.K(n3);
            ajioTextView.setText(string12);
            return;
        }
        AjioTextView ajioTextView11 = this.C;
        if (ajioTextView11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
        } else {
            ajioTextView = ajioTextView11;
        }
        String string13 = this.Z0;
        ajioTextView.setText(string13);
    }

    public final HashSet H() {
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            wx1_12 = null;
        }
        return wx1_12.p1;
    }

    public final int H1() {
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            wx1_12 = null;
        }
        return wx1_12.k1;
    }

    public final void Hb() {
        Object object;
        int n3;
        int n4;
        int n7 = 1;
        int n8 = 0;
        CustomToolbarViewMerger customToolbarViewMerger = null;
        Object object2 = this.t;
        if (object2 != null && (object2 = ((wx1_1)object2).S0) != null) {
            n4 = ((Cart)object2).getTotalUnitCount();
        } else {
            n4 = 0;
            object2 = null;
        }
        if (n4 > 0) {
            if (n4 == n7) {
                n3 = R$string.bag_count_one_title_refresh;
                object2 = n4;
                object = new Object[n7];
                object[0] = object2;
                object = hv3_0.L(n3, (Object[])object);
            } else {
                n3 = R$string.bag_count_multiple_title_refresh;
                object2 = n4;
                object = new Object[n7];
                object[0] = object2;
                object = hv3_0.L(n3, (Object[])object);
            }
        } else {
            n7 = R$string.empty_bag_title_refresh;
            object = hv3_0.K(n7);
        }
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        int n10 = 9;
        aJIOApplication = mz3_0.t(aJIOApplication, n10);
        object2 = new AjioCustomTypefaceSpan("", (Typeface)aJIOApplication);
        n3 = 6;
        String string2 = "(";
        n8 = StringsKt.O((CharSequence)object, string2, 0, false, n3);
        if (n8 > 0 && (n3 = ((String)object).length()) > 0) {
            string2 = new SpannableString((CharSequence)object);
            int n14 = 33;
            string2.setSpan(object2, n8, n3, n14);
            customToolbarViewMerger = this.I;
            if (customToolbarViewMerger != null) {
                customToolbarViewMerger.setTitleText((SpannableString)string2);
            }
        } else {
            customToolbarViewMerger = this.I;
            if (customToolbarViewMerger != null) {
                customToolbarViewMerger.setTitleText((String)object);
            }
        }
        if ((customToolbarViewMerger = this.I) != null && (customToolbarViewMerger = customToolbarViewMerger.getFloatTitleTv()) != null) {
            customToolbarViewMerger.setContentDescription((CharSequence)object);
        }
        if ((object = this.I) != null && (object = ((CustomToolbarViewMerger)object).getHeaderTitleTv()) != null) {
            n8 = 2;
            object.setImportantForAccessibility(n8);
        }
    }

    public final void I4(Banner object, int n3, String string2) {
        Intrinsics.checkNotNullParameter(object, "banner");
        Object object2 = ((Banner)object).getBannerType();
        boolean n4 = Intrinsics.areEqual(object2, "AD");
        hh3_2 hh3_22 = this.b1;
        String string3 = "Web view Screen";
        String string4 = "ajio";
        String string5 = null;
        if (n4) {
            int n7;
            object2 = h40_0.a;
            xv$a_0 xv$a_0 = xv$a_0.Cart;
            boolean bl2 = ((h40_0)object2).p1(xv$a_0);
            if (bl2 && string2 != null && (n7 = string2.length()) != 0) {
                boolean bl3;
                ex1_0.Mb((Banner)object, n3);
                Object object3 = ((Banner)object).getBannerAdsMetaData();
                if (object3 != null && (object3 = ((BannerAdsMetaData)object3).getClickTracker()) != null) {
                    if ((object = ((Banner)object).getBannerAdsMetaData()) != null) {
                        string5 = ((BannerAdsMetaData)object).getCcbValue();
                    }
                    Intrinsics.checkNotNullParameter(object3, "url");
                    long l2 = k7.p();
                    object = String.valueOf(l2);
                    object2 = "[trq]";
                    object = kotlin.text.b.n((String)object3, (String)object2, (String)object, false);
                    if (string5 == null) {
                        string5 = "";
                    }
                    object = kotlin.text.b.n((String)object, "[ccb]", string5, false);
                    object3 = (BannerAdViewModel)hh3_22.getValue();
                    ((BannerAdViewModel)object3).callBannerClickImpression((String)object);
                }
                if (bl3 = StringsKt.F(string2, string4, false)) {
                    object = AnalyticsManager.Companion;
                    km_1.a((AnalyticsManager$Companion)object, string3);
                }
                object = kj0_1.g();
                object3 = this.getActivity();
                ((kj0_1)object).w((Activity)object3, string2);
            }
        } else {
            int n8;
            String string6;
            object2 = ((Banner)object).getBannerType();
            boolean bl4 = Intrinsics.areEqual(object2, string6 = "EXTERNAL_AD");
            if (bl4) {
                int n10;
                if (string2 != null && (n10 = string2.length()) != 0) {
                    object2 = h40_0.a;
                    object2 = xv$a_0.Cart;
                    boolean bl5 = h40_0.r2((xv$a_0)((Object)object2));
                    if (bl5) {
                        boolean bl6;
                        ex1_0.Mb((Banner)object, n3);
                        object = ((Banner)object).getBannerAdsMetaData();
                        if (object != null) {
                            string5 = ((BannerAdsMetaData)object).getClickTracker();
                        }
                        if (string5 != null) {
                            object = (BannerAdViewModel)hh3_22.getValue();
                            ((BannerAdViewModel)object).callBannerClickImpression(string5);
                        }
                        if (bl6 = StringsKt.F(string2, string4, false)) {
                            object = AnalyticsManager.Companion;
                            km_1.a((AnalyticsManager$Companion)object, string3);
                        }
                        object = kj0_1.g();
                        FragmentActivity fragmentActivity = this.getActivity();
                        ((kj0_1)object).w(fragmentActivity, string2);
                    }
                }
            } else if (string2 != null && (n8 = string2.length()) != 0) {
                object2 = h40_0.a;
                object2 = xv$a_0.Cart;
                boolean bl7 = h40_0.R0((xv$a_0)((Object)object2));
                if (bl7) {
                    ex1_0.Mb((Banner)object, n3);
                    object = kj0_1.g();
                    FragmentActivity fragmentActivity = this.getActivity();
                    ((kj0_1)object).w(fragmentActivity, string2);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Ib(CartEntry object, String object2) {
        Exception exception2;
        block5: {
            Object object3;
            Object object4;
            block4: {
                boolean bl2;
                object4 = "<this>";
                object3 = "modelClass";
                Object object5 = this.getParentFragment();
                if (object5 == null) return;
                boolean bl3 = ((Fragment)object5).isAdded();
                if (bl3 != (bl2 = true)) return;
                bl3 = this.isAdded();
                if (!bl3) return;
                try {
                    object5 = this.requireParentFragment();
                    Object object6 = "requireParentFragment(...)";
                    Intrinsics.checkNotNullExpressionValue(object5, (String)object6);
                    object6 = "owner";
                    Intrinsics.checkNotNullParameter(object5, (String)object6);
                    rd3_0 rd3_02 = object5.getViewModelStore();
                    Intrinsics.checkNotNullParameter(object5, (String)object6);
                    E$b e$b = object5.getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullParameter(object5, (String)object6);
                    object5 = object5.getDefaultViewModelCreationExtras();
                    object6 = "store";
                    Intrinsics.checkNotNullParameter(rd3_02, (String)object6);
                    object6 = "factory";
                    Intrinsics.checkNotNullParameter(e$b, (String)object6);
                    object6 = "defaultCreationExtras";
                    Intrinsics.checkNotNullParameter(object5, (String)object6);
                    object6 = new pD3(rd3_02, e$b, (Wd0)object5);
                    object5 = tm_2.class;
                    Intrinsics.checkNotNullParameter(object5, (String)object3);
                    Intrinsics.checkNotNullParameter(object5, (String)object4);
                    object5 = Reflection.getOrCreateKotlinClass(object5);
                    Intrinsics.checkNotNullParameter(object5, (String)object3);
                    Intrinsics.checkNotNullParameter(object5, (String)object3);
                    Intrinsics.checkNotNullParameter(object5, (String)object4);
                    object4 = object5.getQualifiedName();
                    if (object4 == null) {
                        object2 = "Local and anonymous classes can not be ViewModels";
                        object2 = object2.toString();
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                    object4 = ((String)object3).concat((String)object4);
                    object4 = ((pD3)object6).a((yn1_2)object5, (String)object4);
                    object4 = (tm_2)object4;
                    object3 = this.t;
                    if (object3 != null) break block4;
                    object3 = "cartViewModel";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    object3 = null;
                }
                catch (Exception exception2) {
                    break block5;
                }
            }
            if ((object3 = ((wx1_1)object3).S0) != null) {
                ((Cart)object3).getEntries();
            }
            object4.getClass();
            ((tm_2)object4).a = object;
            object = new bn_2();
            ((bn_2)object).f = object2;
            object2 = this.F0;
            object4 = this.G0;
            object3 = "prevScreen";
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            object3 = "prevScreenType";
            Intrinsics.checkNotNullParameter(object4, (String)object3);
            ((bn_2)object).d = object2;
            ((bn_2)object).e = object4;
            int n3 = 1001;
            ((Fragment)object).setTargetFragment(this, n3);
            object2 = this.requireParentFragment();
            object2 = ((Fragment)object2).getChildFragmentManager();
            object4 = "Delete Dialog";
            ((DialogFragment)object).show((FragmentManager)object2, (String)object4);
            return;
        }
        object2 = yn3_0.a;
        ((yn3$a)object2).e(exception2);
    }

    public final void J0(int n3) {
        int n4 = this.A0;
        int n7 = -1;
        if (n4 > n7) {
            Object object = this.x;
            Object object2 = null;
            if (object != null && (object = ((om_1)object).a) != null && (object = ((ProductsList)object).getProducts()) != null) {
                n7 = object.size();
                object = n7;
            } else {
                n7 = 0;
                object = null;
            }
            Intrinsics.checkNotNull(object);
            n7 = (Integer)object;
            if (n4 < n7 && (n4 = this.A0) != n3) {
                Object object3 = this.x;
                if (object3 != null && (object3 = ((om_1)object3).a) != null && (object3 = ((ProductsList)object3).getProducts()) != null) {
                    n7 = this.A0;
                    object2 = object3 = object3.get(n7);
                    object2 = (Product)object3;
                }
                if (object2 != null) {
                    n4 = 0;
                    object3 = null;
                    ((Product)object2).setShowSizeLayout(false);
                }
                if ((object3 = this.S) != null && (object3 = ((bo_1)object3).m) != null && (object3 = ((op_2)object3).i) != null) {
                    ((RecyclerView$f)object3).notifyItemChanged(n3);
                }
            }
        }
        this.A0 = n3;
    }

    public final void Jb(boolean bl2) {
        int n3 = this.qb();
        Object object = null;
        if (n3 != 0) {
            boolean bl3;
            Object object2 = this.getParentFragment();
            if (object2 != null && (bl3 = this.isAdded())) {
                Object object3;
                om_1 om_12 = this.x;
                if (om_12 != null) {
                    object3 = this.t;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
                        object3 = null;
                    }
                    if ((object3 = ((wx1_1)object3).S0) != null) {
                        object = ((Cart)object3).getEntries();
                    }
                    om_12.b = object;
                }
                t21_0.Companion.getClass();
                object = new t21_0();
                om_12 = new Bundle();
                object3 = "empty_cart";
                om_12.putBoolean((String)object3, bl2);
                ((Fragment)object).setArguments((Bundle)om_12);
                FragmentManager fragmentManager = ((Fragment)object2).getChildFragmentManager();
                object2 = "Closet_bottom_sheet";
                ((DialogFragment)object).show(fragmentManager, (String)object2);
            }
        } else {
            Object object4 = this.q;
            if (object4 == null) {
                object4 = "loginListener";
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            } else {
                object = object4;
            }
            object4 = "source - closet";
            n3 = 6;
            object.z0(n3, (String)object4);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void K7(Product product, String string2) {
        int n3;
        Object object = this;
        Object object2 = product;
        Object object3 = string2;
        Intrinsics.checkNotNullParameter(string2, "listName");
        Object object4 = AnalyticsManager.Companion;
        String string3 = "Show PDP";
        String string4 = "closet List";
        tj2_0.e((AnalyticsManager$Companion)object4, string3, string4, "bag screen");
        boolean bl2 = false;
        Object object5 = null;
        int n4 = product != null ? (n3 = product.getPosition()) : 0;
        object4 = ((ex1_0)object).k;
        string3 = ((NewEEcommerceEventsRevamp)object4).getEE_SELECT_ITEM();
        String string5 = ((NewEEcommerceEventsRevamp)object4).getPrevScreen();
        String string6 = ((NewEEcommerceEventsRevamp)object4).getPrevScreenType();
        object4 = ((ex1_0)object).k;
        string4 = null;
        String string7 = "bag screen";
        String string8 = "bag screen";
        long l2 = 0L;
        int n7 = 4192848;
        object5 = product;
        object = object2;
        object2 = string2;
        NewEEcommerceEventsRevamp.pushEEProductSelect$default((NewEEcommerceEventsRevamp)object4, product, n4, string3, string2, null, string7, false, string5, string8, null, string6, null, null, false, null, null, l2, null, null, null, null, null, n7, null);
        n3 = 0;
        object4 = null;
        if (object != null) {
            object5 = product.getSourceStoreId();
        } else {
            bl2 = false;
            object5 = null;
        }
        object3 = "luxe";
        bl2 = ((String)object3).equalsIgnoreCase((String)object5);
        if (bl2) {
            bl2 = true;
            object3 = null;
            og1_1.g(bl2, false);
        } else {
            object3 = null;
            og1_1.g(false, false);
        }
        object5 = object;
        object = this;
        object3 = this.s;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdpListener");
            object3 = null;
        }
        if (object5 != null) {
            object4 = product.getSourceStoreId();
        }
        eA2$a.a((ea2_1)object3, (Product)object5, (String)object4);
    }

    public final void Kb(String string2, String string3) {
        Object object = this.getContext();
        if (object != null) {
            object = this.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                object = null;
            }
            Context context = this.requireContext();
            String string4 = "requireContext(...)";
            Intrinsics.checkNotNullExpressionValue(context, string4);
            int n3 = 1;
            object.showToastNotification(context, string2, n3, string3);
        }
    }

    public final void Lb() {
        j3_0 j3_02 = this.m;
        if (j3_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
            j3_02 = null;
        }
        j3_02.startLoader();
    }

    public final void M(CartEntry object) {
        String string2 = "cartEntry";
        Intrinsics.checkNotNullParameter(object, string2);
        ba_0 ba_02 = new ba_0();
        Intrinsics.checkNotNullParameter(object, string2);
        ba_02.f = object;
        object = this.requireActivity().getSupportFragmentManager();
        ba_02.show((FragmentManager)object, "bottomSheetgwp");
    }

    public final String M6() {
        Object object = this.t;
        String string2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            object = null;
        }
        if ((object = ((wx1_1)object).S0) != null) {
            string2 = ((Cart)object).getMultipleWalletEnabledAmountMessage();
        }
        return string2;
    }

    public final void M9(String string2) {
        Intrinsics.checkNotNullParameter(string2, "addressId");
        CartAddressListBottomSheet cartAddressListBottomSheet = this.X0;
        if (cartAddressListBottomSheet != null) {
            cartAddressListBottomSheet.dismissAllowingStateLoss();
        }
        this.loadCartBasedOnSelectedAddress("", string2);
    }

    public final void N4() {
        lz1_1 lz1_12 = this.q;
        if (lz1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginListener");
            lz1_12 = null;
        }
        lz1_12.g("source - cart");
    }

    public final void N7() {
        this.wb();
    }

    public final void N8() {
        boolean bl2 = this.qb();
        Object object = null;
        if (!bl2) {
            Object object2 = this.L0;
            if (object2 != null) {
                ((BottomSheetDialogFragment)object2).dismissAllowingStateLoss();
            }
            if ((object2 = this.q) == null) {
                object2 = "loginListener";
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object = object2;
            }
            object2 = "source - move to closet";
            int n3 = 6;
            object.z0(n3, (String)object2);
        } else {
            Object object3;
            Object object4 = this.t;
            Object object5 = "cartViewModel";
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                bl2 = false;
                object4 = null;
            }
            if ((object4 = ((wx1_1)object4).S0) != null && (object4 = ((Cart)object4).getGuid()) != null) {
                Object object6;
                Object object7;
                object4 = this.L0;
                if (object4 != null && (object4 = ((qi2_2)object4).h) != null) {
                    ((AjioLoaderView)((Object)object4)).startLoader();
                }
                if ((object4 = this.w) != null) {
                    object3 = this.A7();
                    object7 = lp_0.b(this.S2());
                    object6 = "Move to wishlist";
                    ((wn_1)object4).e((String)object6, (Cart)object3, (String)object7);
                }
                object4 = h40_0.a;
                bl2 = h40_0.Q0();
                int n4 = 3;
                object7 = "optionCodes";
                object6 = "screenName";
                String string2 = "next(...)";
                Object object8 = "iterator(...)";
                Object object9 = "oosInventoryProduct";
                String string3 = "bag screen";
                if (bl2) {
                    boolean bl3;
                    object4 = this.t;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                        bl2 = false;
                        object4 = null;
                    }
                    Object object10 = this.S2();
                    Intrinsics.checkNotNullParameter(object10, (String)object9);
                    object9 = new BulkMoveToWishlist(null, null, n4, null);
                    ArrayList<OptionsCode> arrayList = new ArrayList<OptionsCode>();
                    object10 = ((ArrayList)object10).iterator();
                    Intrinsics.checkNotNullExpressionValue(object10, (String)object8);
                    while (bl3 = object10.hasNext()) {
                        object8 = object10.next();
                        Intrinsics.checkNotNullExpressionValue(object8, string2);
                        object8 = (CartEntry)object8;
                        Object object11 = ((CartEntry)object8).getProduct();
                        object11 = object11 != null ? ((Product)object11).getCode() : null;
                        object8 = ((CartEntry)object8).getSourceStoreId();
                        OptionsCode optionsCode = new OptionsCode((String)object11, (String)object8);
                        arrayList.add(optionsCode);
                    }
                    ((BulkMoveToWishlist)object9).setOptionsCodes(arrayList);
                    string2 = "AJIO";
                    ((BulkMoveToWishlist)object9).setTenantId(string2);
                    object4.getClass();
                    Intrinsics.checkNotNullParameter(string3, (String)object6);
                    Intrinsics.checkNotNullParameter(object9, (String)object7);
                    object7 = md3_0.c((jD3)object4);
                    object6 = new EX1((wx1_1)object4, (BulkMoveToWishlist)object9, null);
                    Ae3.d((i90_0)object7, null, null, (Function2)object6, n4);
                } else {
                    boolean bl4;
                    object4 = this.t;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                        bl2 = false;
                        object4 = null;
                    }
                    Object object12 = this.S2();
                    Intrinsics.checkNotNullParameter(object12, (String)object9);
                    object9 = new JsonArray();
                    object12 = ((ArrayList)object12).iterator();
                    Intrinsics.checkNotNullExpressionValue(object12, (String)object8);
                    while (bl4 = object12.hasNext()) {
                        object8 = object12.next();
                        Intrinsics.checkNotNullExpressionValue(object8, string2);
                        object8 = ((CartEntry)object8).getProduct();
                        if (object8 != null) {
                            object8 = ((Product)object8).getCode();
                        } else {
                            bl4 = false;
                            object8 = null;
                        }
                        ((JsonArray)object9).add((String)object8);
                    }
                    object4.getClass();
                    Intrinsics.checkNotNullParameter(string3, (String)object6);
                    Intrinsics.checkNotNullParameter(object9, (String)object7);
                    object7 = md3_0.c((jD3)object4);
                    object6 = new dx1_0((wx1_1)object4, (JsonArray)object9, null);
                    Ae3.d((i90_0)object7, null, null, (Function2)object6, n4);
                }
            }
            if ((object4 = this.t) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            } else {
                object = object4;
            }
            object4 = ((wx1_1)object).K0;
            object = this.getViewLifecycleOwner();
            object5 = new fw1_1(this);
            object3 = new eX1$d((Function1)object5);
            ((LiveData)object4).e((mu1_1)object, (F62)object3);
        }
    }

    public final boolean Nb() {
        z40$a z40$a = z40_0.Companion;
        Application application = (Application)this.H0.getValue();
        Intrinsics.checkNotNullExpressionValue(application, "<get-mApplication>(...)");
        z40$a.getClass();
        return z40$a.a((Context)application).a.a("show_wishlist_on_cart");
    }

    public final void O8() {
        j3_0 j3_02;
        oy1_1.Companion.getClass();
        oy1_1 oy1_12 = new oy1_1();
        Object object = new Bundle();
        boolean bl2 = true;
        object.putBoolean("FROM_CART", bl2);
        oy1_12.setArguments((Bundle)object);
        object = this.m;
        Object object2 = null;
        String string2 = "activityFragmentListener";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        if ((j3_02 = this.m) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object2 = j3_02;
        }
        object2 = object2.y();
        j3$a.a((j3_0)object, (Fragment)object2, oy1_12, bl2, "");
        tj2_0.e(AnalyticsManager.Companion, "Closet Button", "View All", "bag screen");
    }

    public final void Pa(CartEntry object) {
        int n3 = this.qb();
        Object object2 = null;
        if (n3 == 0) {
            object = this.q;
            if (object == null) {
                object = "loginListener";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object2 = object;
            }
            object = "source - add to closet";
            n3 = 6;
            object2.z0(n3, (String)object);
        } else if (object != null) {
            this.Lb();
            wx1_1 wx1_12 = this.t;
            String string2 = "cartViewModel";
            if (wx1_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                wx1_12 = null;
            }
            wx1_12.getClass();
            String string3 = "<set-?>";
            Intrinsics.checkNotNullParameter(object, string3);
            wx1_12.b1 = object;
            wx1_12 = this.t;
            if (wx1_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                wx1_12 = null;
            }
            wx1_12.getClass();
            Intrinsics.checkNotNullParameter(object, string3);
            wx1_12.a1 = object;
            wx1_12 = this.t;
            if (wx1_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = wx1_12;
            }
            ((wx1_1)object2).d((CartEntry)object, (CartEntry)object);
        }
    }

    public final void Q1(String string2) {
        String string3 = "productCode";
        Intrinsics.checkNotNullParameter(string2, string3);
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            wx1_12 = null;
        }
        wx1_12.getClass();
        Intrinsics.checkNotNullParameter(string2, string3);
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushOOSItemMoveToWishListClickEvent("Bag screen", "cart_oos_interactions", "cart interactions", "move to wishlist", string2);
    }

    public final void Qa(String object, boolean bl2) {
        Object object2;
        String string2;
        Object object3;
        Object object4;
        if (bl2 && (object4 = this.w) != null) {
            object3 = this.A7();
            string2 = lp_0.b(this.S2());
            object2 = "remove all";
            ((wn_1)object4).e((String)object2, (Cart)object3, string2);
        }
        object4 = this.t;
        object3 = null;
        string2 = "cartViewModel";
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object4 = null;
        }
        if ((object4 = ((wx1_1)object4).S0) != null && (object4 = ((Cart)object4).getGuid()) != null) {
            object2 = this.L0;
            if (object2 != null && (object2 = ((qi2_2)object2).h) != null) {
                ((AjioLoaderView)((Object)object2)).startLoader();
            }
            if ((object2 = this.t) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object2 = null;
            }
            object2.getClass();
            Intrinsics.checkNotNullParameter("bag screen", "screenName");
            Intrinsics.checkNotNullParameter(object4, "guid");
            Intrinsics.checkNotNullParameter(object, "skusId");
            aW aW2 = md3_0.c((jD3)object2);
            cx1_0 cx1_02 = new cx1_0((wx1_1)object2, (String)object4, (String)object, null);
            int n3 = 3;
            Ae3.d(aW2, null, null, cx1_02, n3);
            object = this.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object;
            }
            object = ((wx1_1)object3).I0;
            object4 = this.getViewLifecycleOwner();
            object3 = new jw1_0(this, bl2);
            eX1$d eX1$d = new eX1$d((Function1)object3);
            ((LiveData)object).e((mu1_1)object4, eX1$d);
        }
    }

    public final void R9() {
        int n3 = this.ob();
        if (n3 == 0 && (n3 = this.nb()) != 0) {
            Object object = this.n;
            Object object2 = null;
            String string2 = "toolbarListener";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            if ((object = object.getToolbar()) != null) {
                String string3 = this.ab();
                ((AjioCustomToolbar)object).setTitle(string3);
            }
            if ((object = this.n) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object;
            }
            n3 = R$drawable.ic_close;
            string2 = this.ab();
            boolean bl2 = true;
            int n4 = 3;
            object2.showUpButton(bl2, n4, n3, string2);
            n3 = (int)(og1_1.b() ? 1 : 0);
            if (n3 != 0) {
                this.Fb();
            } else {
                this.Hb();
            }
        }
    }

    public final void Ra(ProductsList iterator) {
        Object object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            object = null;
        }
        if ((object = ((wx1_1)object).S0) != null && (object = ((Cart)object).getEntries()) != null && iterator != null && (iterator = ((ProductsList)((Object)iterator)).getProducts()) != null) {
            boolean bl2;
            iterator = ((Iterable)((Object)iterator)).iterator();
            while (bl2 = iterator.hasNext()) {
                boolean bl3;
                Product product = (Product)iterator.next();
                Iterator iterator2 = object.iterator();
                boolean bl4 = false;
                while (true) {
                    boolean bl5 = iterator2.hasNext();
                    bl3 = true;
                    if (!bl5) break;
                    Object object2 = (CartEntry)iterator2.next();
                    String string2 = product.getCode();
                    if (string2 == null) continue;
                    if (object2 != null && (object2 = ((CartEntry)object2).getProduct()) != null) {
                        object2 = ((Product)object2).getBaseProduct();
                    } else {
                        bl5 = false;
                        object2 = null;
                    }
                    if ((bl5 = string2.equals(object2)) != bl3) continue;
                    bl4 = true;
                }
                if (!bl4) continue;
                product.setAddedToCart(bl3);
            }
        }
    }

    public final ArrayList S2() {
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            wx1_12 = null;
        }
        return wx1_12.T0;
    }

    public final void Sa() {
        boolean bl2;
        ArrayList arrayList = this.T;
        if (arrayList != null && !(bl2 = arrayList.isEmpty())) {
            int n3;
            Object object = arrayList.iterator();
            int n4 = -1;
            int n7 = -1;
            int n8 = 0;
            while ((n3 = object.hasNext()) != 0) {
                Object object2 = object.next();
                int n10 = n8 + 1;
                if (n8 >= 0) {
                    int n14 = object2 instanceof su3;
                    if (n14 != 0) {
                        object2 = (su3)object2;
                        n3 = ((su3)object2).b;
                        n14 = 20;
                        if (n3 == n14) {
                            n7 = n8;
                        }
                    }
                    n8 = n10;
                    continue;
                }
                xx_2.n();
                throw null;
            }
            if (n7 != n4 && (object = CollectionsKt.N(n7, arrayList)) != null) {
                arrayList.remove(n7);
                arrayList.add(0, object);
            }
        }
    }

    public final void T0(Product product) {
        int n3;
        Product product2 = product;
        Object object = "similarProduct";
        Intrinsics.checkNotNullParameter(product, (String)object);
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            n3 = 0;
            wx1_12 = null;
        }
        wx1_12.getClass();
        Intrinsics.checkNotNullParameter(product2, (String)object);
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp();
        object = newEEcommerceEventsRevamp;
        n3 = product.getPosition();
        String string2 = newEEcommerceEventsRevamp.getEE_SELECT_ITEM();
        String string3 = newEEcommerceEventsRevamp.getPrevScreen();
        String string4 = newEEcommerceEventsRevamp.getPrevScreenType();
        product2 = product;
        NewEEcommerceEventsRevamp.pushEEProductSelect$default(newEEcommerceEventsRevamp, product, n3, string2, "bag screen - similar products widget", null, "bag screen - similar products widget", false, string3, "bag screen", null, string4, null, null, false, null, null, 0L, null, null, null, null, null, 4192848, null);
    }

    public final void T2() {
        fo_1 fo_12;
        this.W0 = fo_12 = new fo_1();
        Object object = this.w;
        Object object2 = "";
        if (object != null && (object = ((wn_1)object).a.S0) != null && (object = ((Cart)object).getPinCode()) != null) {
            object2 = object;
        }
        object = "preFillPinCode";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        fo_12.g = object2;
        fo_12 = this.W0;
        if (fo_12 != null) {
            object = "onCartClickListener";
            Intrinsics.checkNotNullParameter(this, (String)object);
            fo_12.f = this;
        }
        if ((fo_12 = this.W0) != null) {
            object = this.requireActivity().getSupportFragmentManager();
            object2 = "CartPinCodeCheckBottomSheet";
            fo_12.show((FragmentManager)object, (String)object2);
        }
    }

    public final void U6(CartEntry cartEntry, String string2, String string3) {
        this.Ib(cartEntry, string3);
    }

    public final boolean Ua(DataError object) {
        boolean bl2;
        String string2;
        int n3;
        Object object2;
        Object object3 = null;
        if (object != null && (object2 = ((DataError)object).getErrorMessage()) != null) {
            object2 = ((DataError$ErrorMessage)object2).getType();
        } else {
            n3 = 0;
            object2 = null;
        }
        n3 = Intrinsics.areEqual("InvalidTokenError", object2);
        String string3 = "UnauthorizedError";
        if (n3 == 0) {
            if (object != null && (object2 = ((DataError)object).getErrorMessage()) != null) {
                object2 = ((DataError$ErrorMessage)object2).getType();
            } else {
                n3 = 0;
                object2 = null;
            }
            n3 = (int)(Intrinsics.areEqual(string3, object2) ? 1 : 0);
            if (n3 == 0) {
                if (object != null && (object2 = ((DataError)object).getErrorMessage()) != null) {
                    object2 = ((DataError$ErrorMessage)object2).getType();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                string2 = "ForbiddenError";
                n3 = (int)(Intrinsics.areEqual(string2, object2) ? 1 : 0);
                if (n3 == 0) {
                    return false;
                }
            }
        }
        n3 = R$string.login_proceed;
        object2 = hv3_0.K(n3);
        this.kb((String)object2, null);
        object2 = this.q;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginListener");
            n3 = 0;
            object2 = null;
        }
        string2 = "source - cart";
        int n4 = 6;
        object2.z0(n4, string2);
        if (object != null && (object = ((DataError)object).getErrorMessage()) != null) {
            object = ((DataError$ErrorMessage)object).getType();
        } else {
            bl2 = false;
            object = null;
        }
        bl2 = Intrinsics.areEqual(string3, object);
        if (bl2) {
            object = this.t;
            if (object == null) {
                object = "cartViewModel";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object3 = object;
            }
            object = ((wx1_1)object3).a.getValue();
            object3 = "getValue(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            object = (UserInformation)object;
            if (object != null) {
                ((UserInformation)object).reset();
            }
            this.sb(false);
        }
        return true;
    }

    public final void V0(CartEntry object, String object2, int n3) {
        int n4 = 3;
        if (n3 == n4) {
            if (object != null && (object2 = this.Q) != null) {
                ((no_0)object2).a = object;
                ((no_0)object2).b = n3 = ((CartEntry)object).getQuantity().intValue();
                ((no_0)object2).c = n3 = ((CartEntry)object).getInventoryQty().intValue();
                ((CartEntry)object).getQuantity().getClass();
                object = new fo_2();
                object2 = this.F0;
                String string2 = this.G0;
                Intrinsics.checkNotNullParameter(object2, "prevScreen");
                String string3 = "prevScreenType";
                Intrinsics.checkNotNullParameter(string2, string3);
                ((fo_2)object).g = object2;
                ((fo_2)object).h = string2;
                n4 = 1003;
                ((Fragment)object).setTargetFragment(this, n4);
                object2 = this.requireParentFragment().getChildFragmentManager();
                string2 = "Quantity Update Dialog";
                ((DialogFragment)object).show((FragmentManager)object2, string2);
            }
        } else {
            int n7 = 1;
            if (n3 == n7) {
                if (object != null) {
                    this.Lb();
                    wx1_1 wx1_12 = this.t;
                    n7 = 0;
                    Object var6_9 = null;
                    Object object3 = "cartViewModel";
                    if (wx1_12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        n3 = 0;
                        wx1_12 = null;
                    }
                    wx1_12.getClass();
                    Object object4 = "<set-?>";
                    Intrinsics.checkNotNullParameter(object, (String)object4);
                    wx1_12.b1 = object;
                    wx1_12 = this.t;
                    if (wx1_12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        n3 = 0;
                        wx1_12 = null;
                    }
                    wx1_12.getClass();
                    Intrinsics.checkNotNullParameter(object, (String)object4);
                    wx1_12.a1 = object;
                    wx1_12 = this.t;
                    if (wx1_12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        n3 = 0;
                        wx1_12 = null;
                    }
                    wx1_12.getClass();
                    Intrinsics.checkNotNullParameter(object, "entry");
                    object3 = new QueryProductDetails();
                    object = ((CartEntry)object).getProduct().getCode();
                    ((QueryProductDetails)object3).setProductCode((String)object);
                    object = md3_0.c(wx1_12);
                    object4 = new mx1_0(wx1_12, (QueryProductDetails)object3, null);
                    Ae3.d((i90_0)object, null, null, (Function2)object4, n4);
                }
            } else {
                n4 = 2;
                if (n3 == n4) {
                    object2 = "instock";
                    this.Ib((CartEntry)object, (String)object2);
                } else {
                    n4 = this.j;
                    if (n3 == n4 && (object2 = this.getActivity()) != null && (n4 = (int)(object2.isFinishing() ? 1 : 0)) == 0) {
                        Object object5 = this.requireActivity();
                        object2 = new Dialog((Context)object5);
                        this.P = object2;
                        n3 = R$layout.dialog_cartitem_limit_exceeded;
                        object2.setContentView(n3);
                        n3 = R$id.cart_item_movetocloset;
                        object5 = (AjioCenterDrawableButton)object2.findViewById(n3);
                        n7 = R$id.iv_cartitem_limitexceeed_close;
                        Object object6 = (AjioTextView)object2.findViewById(n7);
                        cw1_1 cw1_12 = new cw1_1(this);
                        object6.setOnClickListener((View.OnClickListener)cw1_12);
                        object6 = new dw1_1(this, (CartEntry)object);
                        object5.setOnClickListener((View.OnClickListener)object6);
                        object2.show();
                        hv3_0.e0((Dialog)object2);
                    }
                }
            }
        }
    }

    public final void V8(Product product, int n3, String string2, HomeRowData homeRowData, int n4) {
    }

    public final void V9(CartEntry object) {
        if (object != null) {
            int n3;
            this.Lb();
            wx1_1 wx1_12 = this.t;
            Object object2 = "cartViewModel";
            if (wx1_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                wx1_12 = null;
            }
            wx1_12.getClass();
            Object object3 = "<set-?>";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            wx1_12.b1 = object;
            wx1_12 = this.t;
            if (wx1_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                wx1_12 = null;
            }
            wx1_12.getClass();
            Intrinsics.checkNotNullParameter(object, "cartEntry");
            int n4 = 1;
            object2 = new QuerySingleData(null, n4, null);
            object = ((CartEntry)object).getEntryNumber().toString();
            ((QuerySingleData)object2).setData((String)object);
            object = md3_0.c(wx1_12);
            object3 = new yx1_1(wx1_12, (QuerySingleData)object2, null);
            n3 = 3;
            Ae3.d((i90_0)object, null, null, (Function2)object3, n3);
        }
    }

    public final void Va() {
        Object object = this.X;
        boolean bl2 = ((AbstractCollection)object).isEmpty();
        Object object2 = this.Y;
        if (!bl2 || !(bl2 = ((AbstractCollection)object2).isEmpty())) {
            int n3;
            Object object3;
            this.Lb();
            bl2 = ((AbstractCollection)object).isEmpty();
            Object object4 = "<set-?>";
            Object object5 = null;
            Object object6 = "cartViewModel";
            if (!bl2) {
                object = (CartEntry)((Stack)object).peek();
                object3 = this.t;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    bl2 = false;
                    object3 = null;
                }
                object3.getClass();
                Intrinsics.checkNotNullParameter(object, (String)object4);
                ((wx1_1)object3).a1 = object;
            } else {
                n3 = 0;
                object = null;
            }
            bl2 = ((AbstractCollection)object2).isEmpty();
            if (!bl2) {
                object3 = (CartEntry)((Stack)object2).peek();
                object2 = this.t;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    object2 = null;
                }
                object2.getClass();
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                ((wx1_1)object2).b1 = object3;
            } else {
                bl2 = false;
                object3 = null;
            }
            if (object != null && object3 != null) {
                object2 = this.t;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                } else {
                    object5 = object2;
                }
                ((wx1_1)object5).d((CartEntry)object, (CartEntry)object3);
            } else if (object != null) {
                int n4;
                object3 = this.t;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    bl2 = false;
                    object3 = null;
                }
                object3.getClass();
                object2 = new QueryCart();
                object4 = ((CartEntry)object).getProduct();
                if (object4 != null) {
                    object4 = ((Product)object4).getCode();
                } else {
                    n4 = 0;
                    object4 = null;
                }
                ((QueryCart)object2).setProductCode((String)object4);
                n4 = 1;
                ((QueryCart)object2).setQuantity(n4);
                object = ((CartEntry)object).getSourceStoreId();
                if (object == null) {
                    object = "ajio";
                }
                object4 = md3_0.c((jD3)object3);
                object6 = new px1_0((wx1_1)object3, (QueryCart)object2, (String)object, null);
                n3 = 3;
                Ae3.d((i90_0)object4, null, null, (Function2)object6, n3);
            }
        }
    }

    public final void Wa(Cart object) {
        int n3;
        Object object2 = this.getActivity();
        if (object2 != null && (n3 = (object2 = this.requireActivity()).isFinishing()) == 0 && object != null && (object = ((Cart)object).getServiceError()) != null) {
            object2 = ((CartServiceError)object).getMessageHeader();
            object = ((CartServiceError)object).getMessageDescription();
            Context context = this.getContext();
            if (context != null) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context);
                context = this.getLayoutInflater();
                int n4 = R$layout.dialog_cart_price_error;
                context = context.inflate(n4, null);
                bottomSheetDialog.setContentView((View)context);
                n4 = R$id.refresh_btn;
                View view = context.findViewById(n4);
                int n7 = R$id.error_header;
                TextView textView = (TextView)context.findViewById(n7);
                int n8 = R$id.error_info;
                context = (TextView)context.findViewById(n8);
                textView.setText((CharSequence)object2);
                context.setText((CharSequence)object);
                object = new mw1_0(bottomSheetDialog, this);
                view.setOnClickListener((View.OnClickListener)object);
                bottomSheetDialog.setCancelable(false);
                bottomSheetDialog.show();
                object = bottomSheetDialog.getWindow();
                if (object != null && (object = object.findViewById(n3 = com.google.android.material.R$id.design_bottom_sheet)) != null) {
                    n3 = 17170445;
                    object.setBackgroundResource(n3);
                }
            }
        }
    }

    public final void X5(boolean bl2) {
        ex1_0 ex1_02 = this;
        if (!bl2) {
            AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
            String string2 = "bag screen";
            String string3 = "apply coupon";
            String string4 = "applycouponclick";
            tj2_0.e(analyticsManager$Companion, string3, string4, string2);
            NewCustomEventsRevamp newCustomEventsRevamp = this.l;
            String string5 = newCustomEventsRevamp.getEC_COUPON_INTERACTIONS();
            String string6 = this.F0;
            String string7 = this.G0;
            String string8 = "coupon select";
            String string9 = "coupon_select";
            String string10 = "bag screen";
            String string11 = "bag screen";
            Object var15_27 = null;
            int n3 = 1668;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string5, string8, null, string9, string10, string11, string6, null, string7, false, null, n3, null);
            this.db();
        } else {
            int n4;
            Object object = this.t;
            Object var4_6 = null;
            Object object2 = "cartViewModel";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                object = null;
            }
            if ((object = ((wx1_1)object).S0) != null) {
                object = ((Cart)object).getAppliedVouchers();
            } else {
                n4 = 0;
                object = null;
            }
            object = (Collection)object;
            if (object != null && (n4 = object.isEmpty()) == 0) {
                object = ex1_02.t;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n4 = 0;
                    object = null;
                }
                object = ((wx1_1)object).S0;
                wx1_1 wx1_12 = null;
                if (object != null && (object = ((Cart)object).getAppliedVouchers()) != null && (object = (CartAppliedVoucher)object.get(0)) != null) {
                    object = ((CartAppliedVoucher)object).getVoucherCode();
                } else {
                    n4 = 0;
                    object = null;
                }
                if (object != null && (n4 = ((String)object).length()) != 0) {
                    Object object3;
                    object = ex1_02.w;
                    if (object != null) {
                        Bundle bundle = new Bundle();
                        object3 = ((wn_1)object).b;
                        String string12 = ((NewCustomEventsRevamp)object3).getCOUPON_CODE();
                        Object object4 = ((wn_1)object).a.S0;
                        object4 = object4 != null && (object4 = ((Cart)object4).getAppliedVouchers()) != null && (object4 = (CartAppliedVoucher)object4.get(0)) != null ? ((CartAppliedVoucher)object4).getVoucherCode() : null;
                        Intrinsics.checkNotNull(object4);
                        bundle.putString(string12, (String)object4);
                        string12 = ((NewCustomEventsRevamp)object3).getCOUPON_TYPE();
                        bundle.putString(string12, "selected");
                        string12 = ((NewCustomEventsRevamp)object3).getEC_COUPON_INTERACTIONS();
                        String string13 = ((wn_1)object).d;
                        String string14 = ((wn_1)object).e;
                        int n7 = 1540;
                        object4 = "remove";
                        String string15 = "coupon_remove";
                        String string16 = "bag screen";
                        String string17 = "bag screen";
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string12, (String)object4, null, string15, string16, string17, string13, bundle, string14, false, null, n7, null);
                    }
                    if ((object = ex1_02.t) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n4 = 0;
                        object = null;
                    }
                    if ((object = ((wx1_1)object).S0) != null && (object = ((Cart)object).getAppliedVouchers()) != null && (object = (CartAppliedVoucher)object.get(0)) != null) {
                        object = ((CartAppliedVoucher)object).getVoucherCode();
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    Intrinsics.checkNotNull(object);
                    this.Lb();
                    wx1_12 = ex1_02.t;
                    if (wx1_12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        wx1_12 = null;
                    }
                    wx1_12.getClass();
                    Intrinsics.checkNotNullParameter(object, "couponCode");
                    int n8 = 1;
                    object2 = new QuerySingleData(null, n8, null);
                    ((QuerySingleData)object2).setData((String)object);
                    object = md3_0.c(wx1_12);
                    object3 = new rx1_2(wx1_12, (QuerySingleData)object2, null);
                    int n10 = 3;
                    Ae3.d((i90_0)object, null, null, (Function2)object3, n10);
                }
            }
        }
    }

    public final void Xa() {
        Object object = this.m;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
            object = null;
        }
        object.stopLoader();
        object = this.B;
        if (object == null) {
            object = "cartShimmerView";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        hv3_0.s0((ShimmerFrameLayout)((Object)object2));
    }

    public final void Y0(Product object, String string2, boolean bl2) {
        if (string2 != null && (bl2 = string2.length())) {
            Object object2 = this.m;
            Object object3 = null;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                bl2 = false;
                object2 = null;
            }
            object2.startLoader();
            object2 = this.u;
            String string3 = "closetViewModel";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                object2 = null;
            }
            object2 = ((ky1_0)object2).i;
            ((BH3)object2).c = object;
            object = this.u;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                object3 = object;
            }
            ((ky1_0)object3).l(string2);
        }
    }

    public final ProductsList Y1() {
        Object object = this.x;
        object = object != null ? ((om_1)object).a : null;
        return object;
    }

    public final void Ya(DataCallback object) {
        int n3 = 1;
        int n4 = R$string.something_went_wrong_text;
        Object object2 = hv3_0.K(n4);
        if ((object = ((DataCallback)object).getError()) != null && (object = ((DataError)object).getErrorMessage()) != null && (object = ((DataError$ErrorMessage)object).getMessage()) != null) {
            object2 = object;
        }
        object = StringCompanionObject.INSTANCE;
        object = hv3_0.K(R$string.acc_error_message_page_load_fail);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object2;
        object = xh2_0.a(objectArray, n3, (String)object, "format(...)");
        this.kb((String)object2, (String)object);
    }

    public final void Z(CartPromotionClick object) {
        Object object2 = this.getParentFragment();
        boolean bl2 = object2 instanceof qn_2;
        if (bl2 && object != null) {
            boolean bl3;
            object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            Object object3 = ((CartPromotionClick)object).getAction();
            Object object4 = ((CartPromotionClick)object).getLabel();
            String string2 = "bag screen";
            ((GTMEvents)object2).pushButtonTapEvent((String)object3, object4, string2);
            object2 = this.y0;
            if (object2 != null && (bl2 = object2.isShowing()) == (bl3 = true)) {
                object2 = this.y0;
                if (object2 != null) {
                    ((on)object2).dismiss();
                }
                bl2 = false;
                object2 = null;
                this.y0 = null;
            }
            object2 = (qn_2)this.getParentFragment();
            object3 = kj0_1.g();
            object4 = this.getActivity();
            object = ((CartPromotionClick)object).getUrl();
            int n3 = R$id.cart_container;
            ((kj0_1)object3).t((Activity)object4, (String)object, (Fragment)object2, n3);
        }
    }

    public final void Za(boolean bl2) {
        this.Lb();
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            wx1_12 = null;
        }
        wx1_12.getClass();
        aW aW2 = md3_0.c(wx1_12);
        zx1_1 zx1_12 = new zx1_1(null, wx1_12, bl2);
        Ae3.d(aW2, null, null, zx1_12, 3);
    }

    public final void a0(Product object) {
        int n3;
        this.Lb();
        this.w0 = object;
        wx1_1 wx1_12 = this.t;
        Object object2 = null;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            wx1_12 = null;
        }
        if (object != null) {
            object = ((Product)object).getBaseProduct();
        } else {
            n3 = 0;
            object = null;
        }
        wx1_12.getClass();
        aW aW2 = md3_0.c(wx1_12);
        Object object3 = new kx1_1(wx1_12, (String)object, null);
        n3 = 3;
        Ae3.d(aW2, null, null, (Function2)object3, n3);
        object = this.u;
        if (object == null) {
            object = "closetViewModel";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        object2.getClass();
        object3 = "cart wishlist widget";
        Intrinsics.checkNotNullParameter(object3, "screenName");
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushShowSimilarEvent((String)object3, "wishlist_widget_interactions", "bag interactions", "wishlist widget - out of stock click", "show similar");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a5() {
        float f5;
        int n3;
        Object object = this.t;
        Object object2 = null;
        String string2 = "cartViewModel";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
            f5 = 0.0f;
        }
        if ((object = ((wx1_1)object).S0) != null) {
            object = ((Cart)object).getEntries();
        } else {
            n3 = 0;
            object = null;
            f5 = 0.0f;
        }
        if (object == null || (n3 = object.isEmpty()) != 0) {
            object = this.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object;
            }
            object = ((wx1_1)object2).S0;
            if (object != null) {
                f5 = ((Cart)object).getBagTotal();
                n3 = (int)f5;
            } else {
                n3 = 0;
                f5 = 0.0f;
                object = null;
            }
            if (n3 == 0 && (n3 = (int)(this.Nb() ? 1 : 0)) != 0 && (n3 = (int)(og1_1.c() ? 1 : 0)) == 0) {
                n3 = 1;
                f5 = Float.MIN_VALUE;
                this.Jb(n3 != 0);
                return;
            }
        }
        this.Jb(false);
    }

    /*
     * Unable to fully structure code
     */
    public final String ab() {
        var1_1 = this.t;
        if (var1_1 == null) ** GOTO lbl-1000
        if (var1_1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            var2_2 = 0;
            var1_1 = null;
        }
        if ((var1_1 = var1_1.S0) != null) {
            var2_2 = var1_1.getTotalUnitCount();
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = 0;
            var1_1 = null;
        }
        if (var2_2 > 0) {
            var3_3 = R$string.bag_count_title;
            var1_1 = var2_2;
            var4_4 = 1;
            var5_5 = new Object[var4_4];
            var5_5[0] = var1_1;
            var1_1 = hv3_0.L(var3_3, var5_5);
        } else {
            var2_2 = R$string.empty_bag_title;
            var1_1 = hv3_0.K(var2_2);
        }
        return var1_1;
    }

    public final void b1(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(string3, "linkText");
    }

    public final void b8(double d2, double d5) {
        ff0_2 ff0_22;
        this.Y0 = ff0_22 = new ff0_2();
        String string2 = "onCartClickListener";
        Intrinsics.checkNotNullParameter(this, string2);
        ff0_22.h = this;
        ff0_22 = this.Y0;
        if (ff0_22 != null) {
            boolean bl2;
            ff0_22.n = bl2 = true;
        }
        if (ff0_22 != null) {
            string2 = "cartAddressCallBackListener";
            Intrinsics.checkNotNullParameter(this, string2);
            ff0_22.i = this;
        }
        if ((ff0_22 = this.Y0) != null) {
            ff0_22.l = d2;
            ff0_22.m = d5;
        }
        if (ff0_22 != null) {
            FragmentManager fragmentManager = this.requireActivity().getSupportFragmentManager();
            String string3 = "CartLocationBottomSheet";
            ff0_22.show(fragmentManager, string3);
        }
    }

    public final Cart bb() {
        wx1_1 wx1_12 = this.t;
        if (wx1_12 != null) {
            if (wx1_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
                wx1_12 = null;
            }
            return wx1_12.S0;
        }
        return null;
    }

    public final void c() {
        Object object;
        Object object2;
        boolean bl2 = this.isAdded();
        if (bl2 && (object2 = this.getActivity()) != null) {
            object2 = new jb3_0();
            int n3 = this.T0;
            ((Fragment)object2).setTargetFragment(this, n3);
            n3 = 1;
            ((jb3_0)object2).t = n3;
            FragmentManager fragmentManager = this.getFragmentManager();
            if (fragmentManager != null) {
                object = "VerifyOtpBottomSheetFragment";
                ((DialogFragment)object2).show(fragmentManager, (String)object);
            }
        }
        object2 = AnalyticsManager.Companion;
        object = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        String string2 = cv_0.a((AnalyticsManager$Companion)object2);
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, "Fraud engine", "bag_screen_otp_validation", "", "OTP_VALIDATION_fraud_engine_response", "bag screen", null, null, null, string2, false, null, 1760, null);
    }

    public final int cb(int n3) {
        Object object = this.v;
        if (object != null) {
            int n4 = this.Nb();
            object = ((ko_2)object).a(n4 != 0);
            n4 = ((ArrayList)object).size();
            for (int i3 = 0; i3 < n4; ++i3) {
                Object object2 = ((ArrayList)object).get(i3);
                boolean bl2 = object2 instanceof su3;
                if (!bl2) continue;
                object2 = (su3)object2;
                int n7 = ((su3)object2).b;
                if (n7 != n3) continue;
                return i3;
            }
        }
        return 0;
    }

    public final void d5() {
        String string2 = lp_0.b(this.S2());
        this.Qa(string2, true);
    }

    public final void db() {
        Object object;
        Object object2 = this.t;
        DataCallback dataCallback = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            object2 = null;
        }
        if ((object = ((wx1_1)object2).S0) != null) {
            boolean bl2;
            HashMap<String, String> hashMap = new HashMap<String, String>();
            object = ((Cart)object).getEntries().iterator();
            Object object3 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            while (bl2 = object.hasNext()) {
                int n3;
                int n4;
                String string2;
                object3 = ((CartEntry)object.next()).getProduct();
                if (object3 != null) {
                    string2 = ((Product)object3).getCode();
                } else {
                    n4 = 0;
                    string2 = null;
                }
                if (string2 == null || (n4 = string2.length()) == 0) continue;
                string2 = ((Product)object3).getCode();
                Intrinsics.checkNotNull(string2);
                Object object4 = ((Product)object3).getImages();
                Object object5 = "";
                if (object4 != null && (n3 = object4.isEmpty()) == 0) {
                    Object object6;
                    boolean bl3;
                    object4 = ((Product)object3).getImages();
                    Intrinsics.checkNotNull(object4);
                    object4 = object4.iterator();
                    while (bl3 = object4.hasNext()) {
                        object6 = (ProductImage)object4.next();
                        String string3 = ((ProductImage)object6).component1();
                        object6 = ((ProductImage)object6).component2();
                        Intrinsics.checkNotNull(string3);
                        String string4 = "mobileProductListingImage";
                        int n7 = string4.equalsIgnoreCase(string3);
                        if (n7 == 0 || object6 == null || (n7 = ((String)object6).length()) == 0) continue;
                        object5 = object6;
                        break;
                    }
                    if ((n3 = ((String)object5).length()) == 0) {
                        object4 = ((Product)object3).getImages();
                        Intrinsics.checkNotNull(object4);
                        bl3 = false;
                        object6 = null;
                        object4 = ((ProductImage)object4.get(0)).getUrl();
                        if (object4 != null && (n3 = ((String)object4).length()) != 0) {
                            object3 = ((Product)object3).getImages();
                            Intrinsics.checkNotNull(object3);
                            object3 = (ProductImage)object3.get(0);
                            object5 = ((ProductImage)object3).getUrl();
                            Intrinsics.checkNotNull(object5);
                        }
                    }
                }
                hashMap.put(string2, (String)object5);
            }
            object2 = ((wx1_1)object2).r0;
            dataCallback = DataCallback.Companion.onSuccess(hashMap);
            ((LiveData)object2).k(dataCallback);
        }
    }

    public final void eb() {
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            wx1_12 = null;
        }
        wx1_12.getClass();
        aW aW2 = md3_0.c(wx1_12);
        hx1_0 hx1_02 = new hx1_0(wx1_12, null);
        Ae3.d(aW2, null, null, hx1_02, 3);
    }

    public final void fb() {
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            wx1_12 = null;
        }
        wx1_12.getClass();
        aW aW2 = md3_0.c(wx1_12);
        ix1_0 ix1_02 = new ix1_0(wx1_12, null);
        Ae3.d(aW2, null, null, ix1_02, 3);
    }

    public final void g(String string2, String string3, String string4, Bundle bundle, String string5) {
        Intrinsics.checkNotNullParameter(string2, "eventCategory");
        String string6 = "spc interaction";
        Intrinsics.checkNotNullParameter(string6, "eventAction");
        String string7 = "View details selected in redemption option";
        Intrinsics.checkNotNullParameter(string7, "eventLabel");
        String string8 = "spc_interaction";
        Intrinsics.checkNotNullParameter(string8, "eventName");
        String string9 = this.F0;
        String string10 = this.G0;
        NewCustomEventsRevamp.newPushCustomEvent$default(this.l, string2, string6, string7, string8, "bag screen", "bag screen", string9, null, string10, false, null, 1536, null);
    }

    public final void g0() {
        this.I0 = null;
        this.ib().b();
    }

    public final ArrayList g4() {
        Object object = this.t;
        ArrayList arrayList = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            object = null;
        }
        if ((object = ((wx1_1)object).S0) != null) {
            arrayList = ((Cart)object).getInternalWalletAmountList();
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void gb(String string2, HashMap hashMap) {
        block40: {
            String string3;
            int n3;
            ex1_0 ex1_02 = this;
            String string4 = string2;
            HashMap hashMap2 = hashMap;
            String string5 = "_Final_price";
            String string6 = "";
            Object object = this.t;
            Object object2 = "cartViewModel";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object = null;
            }
            if ((object = ((wx1_1)object).S0) == null || (object = ((Cart)object).getEntries()) == null || (n3 = ((ArrayList)object).isEmpty()) != 0) break block40;
            object = ex1_02.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object = null;
            }
            if ((object = ((wx1_1)object).S0) != null) {
                object = ((Cart)object).getEntries();
            } else {
                n3 = 0;
                object = null;
            }
            Intrinsics.checkNotNull(object);
            object2 = ((ArrayList)object).iterator();
            Intrinsics.checkNotNullExpressionValue(object2, "iterator(...)");
            n3 = 0;
            object = null;
            int n4 = 0;
            while (true) {
                int n7;
                Object object3;
                String string7;
                int n8;
                String string8;
                Product product;
                Object object4;
                int n10;
                block41: {
                    Exception exception2;
                    block39: {
                        block38: {
                            block37: {
                                n10 = object2.hasNext();
                                string3 = "Checkout_Initiated";
                                if (n10 == 0) break;
                                object4 = (CartEntry)object2.next();
                                product = ((CartEntry)object4).getProduct();
                                if (product == null) continue;
                                ++n4;
                                String string9 = ((CartEntry)object4).getSourceStoreId();
                                n8 = string9.equals(string8 = "luxe");
                                if (n8 != 0) {
                                    ++n3;
                                }
                                n8 = n3;
                                string8 = "Item ";
                                object = Gj0.b(n4, string8, "_SKU");
                                string7 = product.getCode();
                                hashMap2.put(object, string7);
                                object = new StringBuilder(string8);
                                ((StringBuilder)object).append(n4);
                                ((StringBuilder)object).append("_Name");
                                object = ((StringBuilder)object).toString();
                                string7 = product.getName();
                                hashMap2.put(object, string7);
                                object = new StringBuilder(string8);
                                ((StringBuilder)object).append(n4);
                                ((StringBuilder)object).append("_Brand");
                                object = ((StringBuilder)object).toString();
                                string7 = product.getBrandName();
                                hashMap2.put(object, string7);
                                n3 = (int)(string4.equals(string3) ? 1 : 0);
                                string3 = "_Brick";
                                string7 = "_Vertical";
                                if (n3 != 0) {
                                    object = ((CartEntry)object4).getSourceStoreId();
                                    if (object != null && (n10 = ((String)object).length()) > 0) {
                                        object4 = new StringBuilder(string8);
                                        ((StringBuilder)object4).append(n4);
                                        ((StringBuilder)object4).append("_Store Type");
                                        object3 = ((StringBuilder)object4).toString();
                                        hashMap2.put(object3, object);
                                    }
                                    if ((object = product.getSegmentName()) != null && (n7 = ((String)object).length()) > 0) {
                                        object3 = new StringBuilder(string8);
                                        ((StringBuilder)object3).append(n4);
                                        object4 = "_Category";
                                        ((StringBuilder)object3).append((String)object4);
                                        object3 = ((StringBuilder)object3).toString();
                                        hashMap2.put(object3, object);
                                    }
                                    if ((object = product.getVerticalName()) != null && (n7 = ((String)object).length()) > 0) {
                                        object3 = new StringBuilder(string8);
                                        ((StringBuilder)object3).append(n4);
                                        ((StringBuilder)object3).append(string7);
                                        object3 = ((StringBuilder)object3).toString();
                                        hashMap2.put(object3, object);
                                    }
                                    if ((object = product.getBrickName()) != null && (n7 = ((String)object).length()) > 0) {
                                        object3 = new StringBuilder(string8);
                                        ((StringBuilder)object3).append(n4);
                                        ((StringBuilder)object3).append(string3);
                                        object3 = ((StringBuilder)object3).toString();
                                        hashMap2.put(object3, object);
                                    }
                                    if ((object = product.getBaseProduct()) != null && (n7 = ((String)object).length()) > 0) {
                                        object3 = new StringBuilder(string8);
                                        ((StringBuilder)object3).append(n4);
                                        object4 = "_VariantID";
                                        ((StringBuilder)object3).append((String)object4);
                                        object3 = ((StringBuilder)object3).toString();
                                        hashMap2.put(object3, object);
                                    }
                                    if ((object = product.getCatalogName()) != null && (n7 = ((String)object).length()) > 0) {
                                        object3 = new StringBuilder(string8);
                                        ((StringBuilder)object3).append(n4);
                                        object4 = "_CatalogId";
                                        ((StringBuilder)object3).append((String)object4);
                                        object3 = ((StringBuilder)object3).toString();
                                        hashMap2.put(object3, object);
                                    }
                                }
                                try {
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append(string8);
                                    ((StringBuilder)object).append(n4);
                                    ((StringBuilder)object).append(string5);
                                    object = ((StringBuilder)object).toString();
                                    object3 = product.getPrice();
                                    if (object3 == null) break block37;
                                    object3 = ((Price)object3).getValue();
                                    break block38;
                                }
                                catch (Exception exception2) {
                                    break block39;
                                }
                            }
                            n7 = 0;
                            object3 = null;
                        }
                        hashMap2.put(object, object3);
                        break block41;
                    }
                    object3 = new StringBuilder(string8);
                    ((StringBuilder)object3).append(n4);
                    ((StringBuilder)object3).append(string5);
                    object3 = ((StringBuilder)object3).toString();
                    hashMap2.put(object3, string6);
                    object3 = yn3_0.a;
                    ((yn3$a)object3).e(exception2);
                }
                object = product.getVariantOptions();
                object3 = "0";
                object4 = "_MRP";
                if (object != null && (object = (ProductOptionItem)object.get(0)) != null && (object = ((ProductOptionItem)object).getWasPriceData()) != null) {
                    object4 = Gj0.b(n4, string8, (String)object4);
                    if ((object = ((Price)object).getValue()) != null) {
                        object3 = object;
                    }
                    object = Double.valueOf((String)object3);
                    hashMap2.put(object4, object);
                } else {
                    object = product.getWasPriceData();
                    if (object != null) {
                        object4 = Gj0.b(n4, string8, (String)object4);
                        if ((object = ((Price)object).getValue()) != null) {
                            object3 = object;
                        }
                        object = Double.valueOf((String)object3);
                        hashMap2.put(object4, object);
                    }
                }
                object = product.getFnlProductData();
                if (object != null) {
                    object = ((ProductfnlProductData)object).getPlanningCategory();
                } else {
                    n3 = 0;
                    object = null;
                }
                if (object != null) {
                    object = product.getFnlProductData();
                    Intrinsics.checkNotNull(object);
                    object = ((ProductfnlProductData)object).getPlanningCategory();
                } else {
                    object = string6;
                }
                object3 = "Category";
                hashMap2.put(object3, object);
                object = "View_cart";
                n3 = (int)(string4.equals(object) ? 1 : 0);
                if (n3 != 0) {
                    object = product.getFnlProductData();
                    if (object != null) {
                        object = ((ProductfnlProductData)object).getProductGroups();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    if (object != null) {
                        object = Gj0.b(n4, string8, string7);
                        object3 = product.getFnlProductData();
                        Intrinsics.checkNotNull(object3);
                        object3 = ((ProductfnlProductData)object3).getProductGroups();
                        hashMap2.put(object, object3);
                    } else {
                        object = new StringBuilder(string8);
                        ((StringBuilder)object).append(n4);
                        ((StringBuilder)object).append(string7);
                        object = ((StringBuilder)object).toString();
                        hashMap2.put(object, string6);
                    }
                    object = product.getFnlColorVariantData();
                    if (object != null) {
                        if ((object = ((ProductFnlColorVariantData)object).getBrickName()) != null) {
                            object3 = new StringBuilder(string8);
                            ((StringBuilder)object3).append(n4);
                            ((StringBuilder)object3).append(string3);
                            object3 = ((StringBuilder)object3).toString();
                            hashMap2.put(object3, object);
                        } else {
                            object = new StringBuilder(string8);
                            ((StringBuilder)object).append(n4);
                            ((StringBuilder)object).append(string3);
                            object = ((StringBuilder)object).toString();
                            hashMap2.put(object, string6);
                        }
                    }
                }
                object = product.getProductGalleryImageUrls();
                object3 = "_Image_URL";
                if (object != null && (n3 = (int)(object.isEmpty() ? 1 : 0)) == (n10 = 1)) {
                    object = new StringBuilder(string8);
                    ((StringBuilder)object).append(n4);
                    ((StringBuilder)object).append((String)object3);
                    object = ((StringBuilder)object).toString();
                    hashMap2.put(object, string6);
                } else {
                    object = Gj0.b(n4, string8, (String)object3);
                    object3 = product.getProductGalleryImageUrls();
                    if (object3 != null && (object3 = (ProductImage)object3.get(0)) != null) {
                        object3 = ((ProductImage)object3).getUrl();
                    } else {
                        n7 = 0;
                        object3 = null;
                    }
                    hashMap2.put(object, object3);
                }
                n3 = n8;
            }
            boolean bl2 = string4.equals(string3);
            if (bl2) {
                object = n3;
                string4 = "LUXE Item count";
                hashMap2.put(string4, object);
            }
        }
    }

    public final String getAjioTitle() {
        return null;
    }

    public final AjioCustomToolbar$DisplayMode getDisplayMode() {
        return AjioCustomToolbar$DisplayMode.TITLE;
    }

    public final String getProductListDetail() {
        return null;
    }

    public final String getProductListTitle() {
        return null;
    }

    public final String getToolbarTitle() {
        return this.ab();
    }

    public final Boolean hasBackButton() {
        return Boolean.FALSE;
    }

    public final void hb() {
        int n3;
        Object object = this.t;
        Object object2 = "cartViewModel";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        if ((n3 = ((wx1_1)object).c()) != 0 && ((object = this.r0) == null || (n3 = object.isEmpty()) != 0)) {
            object = this.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object = null;
            }
            object.getClass();
            object2 = md3_0.c((jD3)object);
            ax1_1 ax1_12 = new ax1_1((wx1_1)object, null);
            n3 = 3;
            Ae3.d((i90_0)object2, null, null, ax1_12, n3);
        }
    }

    public final boolean i3() {
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            wx1_12 = null;
        }
        return wx1_12.b;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void i5(Product iterator) {
        int n3;
        String string2;
        boolean bl2;
        Object object;
        Product product;
        boolean bl3;
        String string3;
        int n4;
        String string4;
        Object object2;
        Object object3;
        block28: {
            block27: {
                boolean bl4;
                if (iterator == null) return;
                object3 = this.u;
                object2 = null;
                string4 = "closetViewModel";
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n4 = 0;
                    object3 = null;
                }
                object3.getClass();
                string3 = "<set-?>";
                Intrinsics.checkNotNullParameter(iterator, string3);
                ((ky1_0)object3).r = iterator;
                iterator = ((Product)((Object)iterator)).clone();
                Y63.i((Product)((Object)iterator));
                object3 = this.S;
                if (object3 != null) {
                    object3 = ((bo_1)object3).g();
                } else {
                    n4 = 0;
                    object3 = null;
                }
                bl3 = true;
                if (object3 != null && (n4 = object3.isEmpty()) == 0) {
                    object3 = this.S;
                    if (object3 != null) {
                        object3 = ((bo_1)object3).g();
                    } else {
                        n4 = 0;
                        object3 = null;
                    }
                    Intrinsics.checkNotNull(object3);
                    object3 = object3.iterator();
                    while (bl4 = object3.hasNext()) {
                        product = (Product)object3.next();
                        object = product.getCode();
                        if (object == null || (bl2 = (boolean)((String)object).equalsIgnoreCase(string2 = ((Product)((Object)iterator)).getCode())) != bl3) continue;
                        object3 = ((Product)((Object)iterator)).getProductOptionVariants();
                        product.setProductOptionVariants((List)object3);
                        object3 = ((Product)((Object)iterator)).getProductOptionVariants();
                        n4 = object3.size();
                        if (n4 != bl3) break block27;
                        object3 = (ProductOptionVariant)((Product)((Object)iterator)).getProductOptionVariants().get(0);
                        n4 = (int)(((ProductOptionVariant)object3).isStockAvailable() ? 1 : 0);
                        break block28;
                    }
                }
                bl4 = false;
                product = null;
            }
            n4 = 0;
            object3 = null;
        }
        object = ((Product)((Object)iterator)).getBaseOptions();
        if (object != null && !(bl2 = object.isEmpty())) {
            object = ((Product)((Object)iterator)).getBaseOptions();
            if (object != null && (object = (ProductOption)object.get(0)) != null) {
                object = ((ProductOption)object).getOptions();
            } else {
                bl2 = false;
                object = null;
            }
            object = (Collection)object;
            if (object != null && !(bl2 = (boolean)object.isEmpty())) {
                if ((iterator = ((Product)((Object)iterator)).getBaseOptions()) != null && (iterator = (ProductOption)iterator.get(0)) != null && (iterator = ((ProductOption)((Object)iterator)).getOptions()) != null) {
                    iterator = (ProductOptionItem)iterator.get(0);
                } else {
                    n3 = 0;
                    iterator = null;
                }
                if (iterator != null) {
                    object = ((ProductOptionItem)((Object)iterator)).getAttributes();
                } else {
                    bl2 = false;
                    object = null;
                }
                if (object != null) {
                    iterator = ((ProductOptionItem)((Object)iterator)).getAttributes();
                    Intrinsics.checkNotNull(iterator);
                    iterator = iterator.iterator();
                    while (bl2 = (boolean)iterator.hasNext()) {
                        object = (ProductOptionVariant)iterator.next();
                        string2 = ((ProductOptionVariant)object).getAttributeName();
                        int n7 = "selection1".equalsIgnoreCase(string2);
                        String string5 = "null";
                        if (n7 != 0 && (string2 = ((ProductOptionVariant)object).getAttributeValue()) != null && (n7 = string2.length()) != 0 && (n7 = (int)(kotlin.text.b.i(string2 = ((ProductOptionVariant)object).getAttributeValue(), string5, bl3) ? 1 : 0)) == 0) {
                            this.j1 = object = ((ProductOptionVariant)object).getAttributeValue();
                            continue;
                        }
                        String string6 = "selection2";
                        string2 = ((ProductOptionVariant)object).getAttributeName();
                        n7 = (int)(string6.equalsIgnoreCase(string2) ? 1 : 0);
                        if (n7 == 0 || (string2 = ((ProductOptionVariant)object).getAttributeValue()) == null || (n7 = string2.length()) == 0 || (n7 = (int)(kotlin.text.b.i(string2 = ((ProductOptionVariant)object).getAttributeValue(), string5, bl3) ? 1 : 0)) != 0) continue;
                        this.k1 = object = ((ProductOptionVariant)object).getAttributeValue();
                    }
                }
            }
        }
        if (product != null) {
            iterator = product.getVariantOptions();
        } else {
            n3 = 0;
            iterator = null;
        }
        if (product != null && iterator != null && (bl2 = iterator.size()) == bl3 && ((string3 = this.k1) != null && !(bl3 = (boolean)kotlin.text.b.k(string3)) || (string3 = this.j1) != null && !(bl3 = (boolean)kotlin.text.b.k(string3)))) {
            string3 = this.k1;
            if (string3 != null && !(bl3 = (boolean)kotlin.text.b.k(string3))) {
                object3 = this.j1;
                if (object3 != null) {
                    n4 = (int)(kotlin.text.b.k((CharSequence)object3) ? 1 : 0);
                }
            } else {
                if (n4 != 0) {
                    iterator = (ProductOptionItem)iterator.get(0);
                    this.t4(product, (ProductOptionItem)((Object)iterator));
                    return;
                }
                n3 = R$string.selected_product_out_of_stock;
                iterator = hv3_0.K(n3);
                hv3_0.o0(0, (String)((Object)iterator), null);
                return;
            }
        }
        if ((object3 = this.u) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
        } else {
            object2 = object3;
        }
        object3 = ((ky1_0)object2).r;
        ((Product)object3).setVariantOptions((List)((Object)iterator));
        iterator = this.S;
        if (iterator == null) return;
        ((bo_1)((Object)iterator)).h();
    }

    public final void i9(String string2) {
        Object object;
        Object object2;
        ex1_0 ex1_02 = this;
        String string3 = string2;
        Intrinsics.checkNotNullParameter(string2, "entryType");
        Object object3 = this.t;
        Object object4 = "cartViewModel";
        Object object5 = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            object3 = null;
        }
        int n3 = 0;
        ((wx1_1)object3).p = false;
        object3 = ex1_02.t;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            object3 = null;
        }
        if ((object3 = (object3 = ((wx1_1)object3).S0) != null ? ((Cart)object3).getPROFILE_HEALTH() : null) != null) {
            object2 = wq2_2.Companion;
            object2.getClass();
            object3 = WQ2$a.a(string3, (ProfileHealth)object3);
        } else {
            object3 = null;
        }
        if (object3 != null) {
            object2 = this.getChildFragmentManager();
            object = "RvpInfoBottomSheet";
            ((DialogFragment)object3).show((FragmentManager)object2, (String)object);
        }
        if ((object3 = ex1_02.t) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
        } else {
            object5 = object3;
        }
        object3 = ((wx1_1)object5).S0;
        if (object3 != null && (object3 = ((Cart)object3).getPROFILE_HEALTH()) != null && (object4 = ex1_02.w) != null) {
            object5 = ((ProfileHealth)object3).getRule();
            object2 = "";
            Object object6 = object5 == null ? object2 : object5;
            object5 = ((ProfileHealth)object3).getMessage();
            Object object7 = object5 == null ? object2 : object5;
            if ((object3 = ((ProfileHealth)object3).getExtra()) != null) {
                n3 = ((Extra)object3).getRvpPercent();
            }
            Intrinsics.checkNotNullParameter(string3, "entryPoint");
            Bundle bundle = dm_1.a((String)object6, "rule", (String)object7, "message");
            object5 = String.valueOf(n3);
            bundle.putString("rvp_percent", (String)object5);
            object3 = "ProceedPayment";
            boolean bl2 = Intrinsics.areEqual(string3, object3);
            if (bl2) {
                String string4 = ((wn_1)object4).d;
                string3 = ((wn_1)object4).e;
                int n4 = 1536;
                object = ((wn_1)object4).b;
                String string5 = "rvp alert halfcut screen - auto load";
                String string6 = "RVP_fraud_engine_response";
                String string7 = "bag screen";
                String string8 = "bag screen";
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string5, (String)object6, (String)object7, string6, string7, string8, string4, bundle, string3, false, null, n4, null);
            } else {
                String string9 = ((wn_1)object4).d;
                string3 = ((wn_1)object4).e;
                int n7 = 1536;
                object = ((wn_1)object4).b;
                String string10 = "rvp alert halfcut screen - manual load";
                String string11 = "RVP_fraud_engine_response";
                String string12 = "bag screen";
                String string13 = "bag screen";
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string10, (String)object6, (String)object7, string11, string12, string13, string9, bundle, string3, false, null, n7, null);
            }
        }
    }

    public final K43 ib() {
        return (K43)this.a1.getValue();
    }

    public final void j(PaymentInstrumentInfo object) {
        block14: {
            boolean bl2 = this.isAdded();
            if (!bl2) break block14;
            float f5 = this.D();
            Object object2 = this.g1;
            object2 = ((hh3_2)object2).getValue();
            object2 = (io2_1)object2;
            object2 = ((io2_1)object2).c;
            ((LiveData)object2).k(object);
            object = com.ril.ajio.payment.fragment.c.Companion;
            object.getClass();
            object = new c();
            object2 = new Bundle();
            String string2 = "OrderTotal";
            object2.putFloat(string2, f5);
            ((Fragment)object).setArguments((Bundle)object2);
            Object object3 = this.getChildFragmentManager();
            object2 = "InternalWalletBottomFragment";
            try {
                ((DialogFragment)object).show((FragmentManager)object3, (String)object2);
            }
            catch (Exception exception) {
                object3 = yn3_0.a;
                ((yn3$a)object3).e(exception);
            }
        }
    }

    public final String j7() {
        Object object = this.t;
        String string2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            object = null;
        }
        if ((object = ((wx1_1)object).S0) != null) {
            string2 = ((Cart)object).getPriorityDeliveryAlertMessage();
        }
        return string2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void jb() {
        block62: {
            block61: {
                var1_1 = this;
                var2_2 = this.qb();
                var3_3 = null;
                if (var2_2 != 0) break block61;
                this.J0 = var2_2 = 1;
                var4_4 = this.q;
                if (var4_4 == null) {
                    var4_4 = "loginListener";
                    Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                } else {
                    var3_3 = var4_4;
                }
                var4_4 = "source - cart";
                var5_6 = 6;
                var3_3.z0(var5_6, (String)var4_4);
                break block62;
            }
            var4_5 = this.t;
            var6_8 = "cartViewModel";
            if (var4_5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var6_8);
                var2_2 = 0;
                var4_5 = null;
            }
            if ((var4_5 = var4_5.S0) != null) {
                var4_5 = var4_5.getEntries();
            } else {
                var2_2 = 0;
                var4_5 = null;
            }
            var7_9 = false;
            var8_10 = null;
            var9_11 = 0.0;
            var11_12 = "bag screen";
            if (var4_5 != null && (var2_2 = var4_5.isEmpty()) == 0) {
                var4_5 = z40_0.Companion;
                var12_13 = (Application)var1_1.H0.getValue();
                var13_14 = "<get-mApplication>(...)";
                Intrinsics.checkNotNullExpressionValue(var12_13, (String)var13_14);
                var4_5.getClass();
                var4_5 = z40$a.a((Context)var12_13).a.b("experimentEvents");
                var12_13 = "proceed_to_shipping_ab";
                var2_2 = StringsKt.F((CharSequence)var4_5, (CharSequence)var12_13, false);
                if (var2_2 != 0) {
                    var4_5 = FirebaseEvents.Companion.getInstance();
                    var12_13 = var1_1.t;
                    if (var12_13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var6_8);
                        var14_15 = 0;
                        var12_13 = null;
                    }
                    if ((var12_13 = var12_13.S0) != null && (var12_13 = var12_13.getEntries()) != null) {
                        var14_15 = var12_13.size();
                    } else {
                        var14_15 = 0;
                        var12_13 = null;
                    }
                    var4_5.proceedToShippingAb(var14_15);
                }
                var4_5 = AnalyticsManager.Companion;
                var12_13 = var4_5.getInstance().getGtmEvents();
                var13_14 = var1_1.t;
                if (var13_14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_8);
                    var15_16 = 0;
                    var13_14 = null;
                }
                if ((var13_14 = var13_14.S0) != null && (var13_14 = var13_14.getEntries()) != null) {
                    var15_16 = var13_14.size();
                    var13_14 = var15_16;
                } else {
                    var15_16 = 0;
                    var13_14 = null;
                }
                var17_18 = "Item count in bag : ";
                var16_17 = new StringBuilder(var17_18);
                var16_17.append(var13_14);
                var13_14 = var16_17.toString();
                var16_17 = "Proceed to Single page checkout";
                var12_13.pushButtonTapEvent((String)var16_17, var13_14, var11_12);
                var12_13 = new HashMap();
                var13_14 = var1_1.t;
                if (var13_14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_8);
                    var15_16 = 0;
                    var13_14 = null;
                }
                if ((var13_14 = var13_14.S0) != null && (var13_14 = var13_14.getTotalPrice()) != null) {
                    var13_14 = var13_14.getValue();
                } else {
                    var15_16 = 0;
                    var13_14 = null;
                }
                if (var13_14 != null && (var15_16 = var13_14.length()) != 0) {
                    var13_14 = var1_1.t;
                    if (var13_14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var6_8);
                        var15_16 = 0;
                        var13_14 = null;
                    }
                    var13_14 = var13_14.S0;
                    Intrinsics.checkNotNull(var13_14);
                    var13_14 = var13_14.getTotalPrice();
                    Intrinsics.checkNotNull(var13_14);
                    var13_14 = var13_14.getValue();
                    Intrinsics.checkNotNull(var13_14);
                    var18_19 = Double.parseDouble((String)var13_14);
                } else {
                    var18_19 = var9_11;
                }
                var13_14 = var18_19;
                var16_17 = "order_total";
                var12_13.put(var16_17, var13_14);
                var13_14 = var1_1.t;
                if (var13_14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_8);
                    var15_16 = 0;
                    var13_14 = null;
                }
                if ((var13_14 = var13_14.S0) != null) {
                    var13_14 = var13_14.getAppliedVouchers();
                } else {
                    var15_16 = 0;
                    var13_14 = null;
                }
                var16_17 = "Y";
                var17_18 = "N";
                var13_14 = var13_14 == null ? var17_18 : var16_17;
                var20_20 = "coupon_applied";
                var12_13.put(var20_20, var13_14);
                var13_14 = var1_1.t;
                if (var13_14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_8);
                    var15_16 = 0;
                    var13_14 = null;
                }
                if ((var13_14 = var13_14.S0) != null) {
                    var13_14 = var13_14.getAppliedProductPromotions();
                } else {
                    var15_16 = 0;
                    var13_14 = null;
                }
                if (var13_14 == null) {
                    var16_17 = var17_18;
                }
                var12_13.put("promo_applied", var16_17);
                var13_14 = var1_1.a.f();
                var16_17 = "User type";
                var12_13.put(var16_17, var13_14);
                var1_1.gb("Checkout_Initiated", (HashMap)var12_13);
                var4_5 = var4_5.getInstance().getCt();
                var13_14 = new AnalyticsData$Builder();
                var12_13 = var13_14.eventMap((HashMap)var12_13).build();
                var4_5.checkoutInitiated((AnalyticsData)var12_13);
            }
            if ((var4_5 = var1_1.t) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var6_8);
                var2_2 = 0;
                var4_5 = null;
            }
            if ((var4_5 = var4_5.S0) != null) {
                var4_5 = var4_5.getAppliedVouchers();
            } else {
                var2_2 = 0;
                var4_5 = null;
            }
            var12_13 = "NA";
            if (var4_5 == null) lbl-1000:
            // 3 sources

            {
                while (true) {
                    continue;
                    break;
                }
            }
            var4_5 = var1_1.t;
            if (var4_5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var6_8);
                var2_2 = 0;
                var4_5 = null;
            }
            if ((var4_5 = var4_5.S0) != null && (var4_5 = var4_5.getAppliedVouchers()) != null && (var4_5 = (CartAppliedVoucher)var4_5.get(0)) != null) {
                var4_5 = var4_5.getVoucherCode();
            } else {
                var2_2 = 0;
                var4_5 = null;
            }
            if (var4_5 == null || (var2_2 = var4_5.length()) == 0) ** GOTO lbl-1000
            var4_5 = var1_1.t;
            if (var4_5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var6_8);
                var2_2 = 0;
                var4_5 = null;
            }
            var4_5 = var4_5.S0;
            Intrinsics.checkNotNull(var4_5);
            var4_5 = (CartAppliedVoucher)var4_5.getAppliedVouchers().get(0);
            var12_13 = var4_5.getVoucherCode();
            ** while (true)
            var21_21 /* !! */  = var12_13;
            var4_5 = var1_1.t;
            if (var4_5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var6_8);
                var2_2 = 0;
                var4_5 = null;
            }
            if ((var4_5 = var4_5.S0) != null && (var4_5 = var4_5.getTotalPrice()) != null) {
                var4_5 = var4_5.getValue();
            } else {
                var2_2 = 0;
                var4_5 = null;
            }
            if (var4_5 != null && (var2_2 = var4_5.length()) != 0) {
                var4_5 = var1_1.t;
                if (var4_5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_8);
                    var2_2 = 0;
                    var4_5 = null;
                }
                var4_5 = var4_5.S0;
                Intrinsics.checkNotNull(var4_5);
                var4_5 = var4_5.getTotalPrice();
                Intrinsics.checkNotNull(var4_5);
                var4_5 = var4_5.getValue();
                Intrinsics.checkNotNull(var4_5);
                var9_11 = Double.parseDouble((String)var4_5);
            }
            var22_22 = var9_11;
            var4_5 = this.bb();
            var24_23 = var1_1.k;
            if (var4_5 != null) {
                var4_5 = var1_1.w;
                if (var4_5 != null) {
                    var25_24 = new Bundle();
                    var12_13 = var4_5.a;
                    var13_14 = var12_13.S0;
                    if (var13_14 != null && (var13_14 = var13_14.getInternalWallets()) != null) {
                        var25_24 = in_0.a;
                        var12_13 = var12_13.p1;
                        var25_24.getClass();
                        Intrinsics.checkNotNullParameter(var13_14, "internalWallets");
                        Intrinsics.checkNotNullParameter(var12_13, "internalWalletSelectedViews");
                        var25_24 = new Bundle();
                        var13_14 = var13_14.iterator();
                        while (var26_25 = var13_14.hasNext()) {
                            var16_17 = (PaymentInstrumentInfo)var13_14.next();
                            if (var16_17 == null || (var17_18 = var16_17.getCode()) == null || (var27_26 = var17_18.length()) <= 0) continue;
                            InternalWalletUtil.a.getClass();
                            var28_27 = InternalWalletUtil.c(var17_18);
                            var29_28 = var12_13.contains(var17_18);
                            if (var29_28) {
                                var25_24.putString((String)var28_27, "used");
                                var17_18 = var28_27.concat("_cm");
                                var30_29 = InternalWalletUtil.b((PaymentInstrumentInfo)var16_17, (HashSet)var12_13);
                                var25_24.putFloat(var17_18, var30_29);
                                continue;
                            }
                            var16_17 = "not used";
                            var25_24.putString((String)var28_27, (String)var16_17);
                        }
                    }
                    var4_5.b((Bundle)var25_24);
                    var4_5 = AnalyticsManager.Companion.getInstance();
                    var31_30 = var4_5.getGtmEvents();
                    var32_31 = "Confirm order Button";
                    var33_32 = "buttonTap";
                    var34_33 = "Show single page checkout Screen";
                    var35_34 = "bag screen";
                    var36_35 = "buttonTap";
                    var31_30.pushCartInteractionsEvent(var34_33, (String)var32_31, var33_32, var35_34, var36_35, (Bundle)var25_24);
                }
                if ((var4_5 = var1_1.w) != null) {
                    var4_5.a();
                }
                var28_27 = GAEcommerceEvents.INSTANCE;
                var4_5 = this.bb();
                var32_31 = var4_5 != null ? (var4_5 = var4_5.getEntries()) : null;
                var4_5 = var1_1.t;
                if (var4_5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_8);
                    var2_2 = 0;
                    var4_5 = null;
                }
                var37_36 = (var4_5 = var4_5.S0) != null ? (var4_5 = var4_5.getAppliedVouchers()) : null;
                var38_37 = 736;
                var39_38 = 2;
                var34_33 = "Proceed To Checkout";
                var33_32 = "bag screen";
                var35_34 = "checkout_progress";
                var36_35 = null;
                GAEcommerceEvents.sendCheckoutOptions$default((GAEcommerceEvents)var28_27, var39_38, var34_33, (ArrayList)var32_31, var33_32, var35_34, null, null, null, (List)var37_36, null, var38_37, null);
                var4_5 = this.bb();
                if (var4_5 != null) {
                    var16_17 = var4_5 = var4_5.getEntries();
                } else {
                    var26_25 = false;
                    var16_17 = null;
                    var30_29 = 0.0f;
                }
                var17_18 = var24_23.getEE_BEGIN_CHECKOUT();
                Intrinsics.checkNotNull(var21_21 /* !! */ );
                var4_5 = var1_1.F0;
                var25_24 = var1_1.G0;
                var28_27 = "bag screen";
                var34_33 = "bag screen";
                var13_14 = var1_1.k;
                var31_30 = var4_5;
                var32_31 = var25_24;
                var13_14.pushEECheckoutStep1((ArrayList)var16_17, var17_18, var22_22, (String)var21_21 /* !! */ , (String)var28_27, (String)var4_5, var34_33, (String)var25_24);
            }
            var24_23.setPreviousScreenData(var11_12, var11_12);
            this.Ab();
            var4_5 = h40_0.a;
            var2_2 = (int)h40_0.J1();
            var24_23 = "cartClosetListener";
            if (var2_2 == 0) ** GOTO lbl-1000
            var4_5 = var1_1.t;
            if (var4_5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var6_8);
                var2_2 = 0;
                var4_5 = null;
            }
            if ((var4_5 = var4_5.S0) != null && (var4_5 = var4_5.getPancard()) != null) {
                var4_5 = var4_5.isPanRequired();
                var8_10 = Boolean.TRUE;
                var7_9 = Intrinsics.areEqual(var4_5, var8_10);
            }
            if (var7_9) {
                var4_5 = var1_1.p;
                if (var4_5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var24_23);
                    var2_2 = 0;
                    var4_5 = null;
                }
                if ((var4_5 = var4_5.e1()) != null) {
                    var8_10 = var1_1.t;
                    if (var8_10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var6_8);
                        var7_9 = false;
                        var8_10 = null;
                    }
                    if ((var6_8 = var8_10.S0) != null) {
                        var6_8 = var6_8.getPancard();
                    } else {
                        var5_7 = false;
                        var6_8 = null;
                    }
                    var4_5.F9((Pancard)var6_8);
                }
                var2_2 = 5;
            } else lbl-1000:
            // 2 sources

            {
                var2_2 = 2;
            }
            var6_8 = var1_1.p;
            if (var6_8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var24_23);
            } else {
                var3_3 = var6_8;
            }
            var3_3 = var3_3.e1();
            if (var3_3 != null) {
                var3_3.H5(var2_2);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void k4(String var1_1) {
        block21: {
            block20: {
                var2_2 = this;
                var3_3 = var1_1;
                Intrinsics.checkNotNullParameter(var1_1, "entryType");
                var4_4 = this.t;
                var5_5 = "cartViewModel";
                var6_6 = 0.0f;
                var7_7 = null;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                    var8_8 = false;
                    var4_4 = null;
                }
                var9_9 = 0;
                var4_4.p = false;
                var4_4 = var2_2.w;
                var10_10 = "return_fee";
                if (var4_4 == null) break block21;
                var11_11 /* !! */  = DE.a();
                var12_12 = h40_0.a;
                var13_13 = h40_0.k2();
                var14_14 = var4_4.a;
                if (var13_13 == 0) ** GOTO lbl31
                var12_12 = var14_14.S0;
                if (var12_12 != null) {
                    var12_12 = var12_12.getRvpReturnFee();
                } else {
                    while (true) {
                        var13_13 = 0;
                        var12_12 = null;
                        var15_15 = 0.0f;
                        break block20;
                        break;
                    }
lbl31:
                    // 1 sources

                    if ((var12_12 = var14_14.S0) == null) ** continue;
                    var12_12 = var12_12.getPROFILE_HEALTH();
                }
            }
            if (var12_12 != null && (var12_12 = var12_12.getActionContent()) != null && (var12_12 = var12_12.getReturn_fee()) != null) {
                var15_15 = var12_12.floatValue();
                var13_13 = (int)var15_15;
            } else {
                var13_13 = 0;
                var15_15 = 0.0f;
                var12_12 = null;
            }
            var11_11 /* !! */ .putInt(var10_10, var13_13);
            var12_12 = AnalyticsManager.Companion;
            var16_16 = bv_0.a((AnalyticsManager$Companion)var12_12);
            var17_17 = cv_0.a((AnalyticsManager$Companion)var12_12);
            var18_18 = 1536;
            var19_19 = 0;
            var12_12 = var4_4.b;
            var14_14 = "bag interactions";
            var20_20 = "return - know why CTA";
            var21_21 = "return_processing_fee";
            var22_22 = "bag_interaction";
            var23_23 = "bag screen";
            var24_24 = "bag screen";
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var12_12, (String)var14_14, var20_20, var21_21, (String)var22_22, var23_23, var24_24, var16_16, var11_11 /* !! */ , (String)var17_17, false, null, var18_18, null);
        }
        if ((var4_4 = var2_2.t) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
            var8_8 = false;
            var4_4 = null;
        }
        if ((var4_4 = var4_4.S0) != null) {
            var4_4 = var4_4.getRvpReturnFee();
        } else {
            var8_8 = false;
            var4_4 = null;
        }
        if (var4_4 != null) {
            var12_12 = wq2_2.Companion;
            var12_12.getClass();
            var4_4 = WQ2$a.a(var3_3, (ProfileHealth)var4_4);
        } else {
            var8_8 = false;
            var4_4 = null;
        }
        if (var4_4 != null) {
            var12_12 = this.getChildFragmentManager();
            var14_14 = "RvpInfoBottomSheet";
            var4_4.show((FragmentManager)var12_12, (String)var14_14);
        }
        var4_4 = h40_0.a;
        var8_8 = h40_0.k2();
        if (var8_8) {
            var4_4 = var2_2.t;
            if (var4_4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
            } else {
                var7_7 = var4_4;
            }
            var4_4 = var7_7.S0;
            if (var4_4 != null && (var4_4 = var4_4.getRvpReturnFee()) != null && (var5_5 = var2_2.w) != null) {
                var7_7 = var4_4.getRule();
                var12_12 = "";
                if (var7_7 == null) {
                    var7_7 = var12_12;
                }
                var22_22 = (var4_4 = var4_4.getMessage()) == null ? var12_12 : var4_4;
                Intrinsics.checkNotNullParameter(var3_3, "entryPoint");
                var12_12 = "message";
                var4_4 = dm_1.a((String)var7_7, "rule", (String)var22_22, (String)var12_12);
                var7_7 = var5_5.a.S0;
                if (var7_7 != null && (var7_7 = var7_7.getRvpReturnFee()) != null && (var7_7 = var7_7.getActionContent()) != null && (var7_7 = var7_7.getReturn_fee()) != null) {
                    var6_6 = var7_7.floatValue();
                    var9_9 = (int)var6_6;
                }
                var4_4.putInt(var10_10, var9_9);
                var7_7 = "ProceedPayment";
                var25_25 = Intrinsics.areEqual(var3_3, var7_7);
                if (var25_25) {
                    var3_3 = "rvp alert halfcut screen - auto load";
lbl104:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var3_3 = "rvp alert halfcut screen - manual load";
                ** continue;
                var20_20 = var3_3;
                var11_11 /* !! */  = var5_5.d;
                var3_3 = var5_5.e;
                var19_19 = 1536;
                var14_14 = var5_5.b;
                var21_21 = "Return_Processing_Fee";
                var23_23 = "RVP_fraud_engine_response";
                var24_24 = "bag screen";
                var16_16 = "bag screen";
                var18_18 = 0;
                var17_17 = var4_4;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var14_14, var20_20, var21_21, (String)var22_22, var23_23, var24_24, var16_16, (String)var11_11 /* !! */ , (Bundle)var4_4, var3_3, false, null, var19_19, null);
            }
        }
    }

    public final void kb(String string2, String string3) {
        Object object;
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0 && (object = this.getContext()) != null) {
            object = this.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                n3 = 0;
                object = null;
            }
            Context context = this.requireContext();
            String string4 = "requireContext(...)";
            Intrinsics.checkNotNullExpressionValue(context, string4);
            int n4 = 1;
            object.showToastNotification(context, string2, n4, string3);
        }
    }

    public final CartAssuredGiftModel l0() {
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            wx1_12 = null;
        }
        return wx1_12.m1;
    }

    public final void lb() {
        int n3 = 1;
        int n4 = 2;
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object2 = "showTotalHighlightedSavings";
        boolean n7 = ((ao0_0)object).a((String)object2);
        if (n7) {
            float f5;
            int n8;
            float f6;
            object = this.t;
            object2 = "cartViewModel";
            int n10 = 0;
            String string2 = null;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                boolean bl2 = false;
                object = null;
                f6 = 0.0f;
            }
            if ((object = ((wx1_1)object).S0) != null && (object = ((Cart)object).getTotalSaving()) != null) {
                object = ((Price)object).getValue();
            } else {
                boolean bl3 = false;
                object = null;
                f6 = 0.0f;
            }
            Object[] objectArray = null;
            if (object != null && (n8 = ((String)object).length()) != 0) {
                object = this.t;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    boolean bl4 = false;
                    object = null;
                    f6 = 0.0f;
                }
                if ((object = ((wx1_1)object).S0) != null && (object = ((Cart)object).getTotalSaving()) != null) {
                    object = ((Price)object).getValue();
                } else {
                    boolean bl5 = false;
                    object = null;
                    f6 = 0.0f;
                }
                f6 = mz3_0.J((String)object);
            } else {
                boolean bl6 = false;
                f6 = 0.0f;
                object = null;
            }
            float f7 = (f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
            if (f7 > 0) {
                object2 = this.N0;
                if (object2 != null) {
                    ai0_2.B((View)object2);
                }
                object2 = h40_0.a;
                f7 = (float)h40_0.l();
                if (f7 != false) {
                    int n14 = ok1_1.b(f6);
                    object = qz2_0.v(n14);
                } else {
                    object = qz2_0.u(f6);
                }
                object2 = StringCompanionObject.INSTANCE;
                f7 = R$string.total_saving_bold;
                object2 = hv3_0.K((int)f7);
                objectArray = new Object[n4];
                String string3 = null;
                objectArray[0] = object2;
                objectArray[n3] = object;
                object2 = "format(...)";
                Object object3 = xh2_0.a(objectArray, n4, "%s%s", (String)object2);
                object = this.M0;
                if (object != null) {
                    object.setText((CharSequence)object3);
                }
                if ((object = this.N0) != null) {
                    object2 = object.getContext();
                    if (object2 != null && (object2 = object2.getResources()) != null) {
                        n10 = R$string.total_saving_regular;
                        string2 = object2.getString(n10);
                    }
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(string2);
                    string2 = " ";
                    ((StringBuilder)object2).append(string2);
                    ((StringBuilder)object2).append((String)object3);
                    object3 = ((StringBuilder)object2).toString();
                    object.setContentDescription((CharSequence)object3);
                }
                if ((n4 = (int)(this.i ? 1 : 0)) == 0) {
                    this.i = n3;
                    Object object4 = this.w;
                    if (object4 != null) {
                        object4 = AnalyticsManager.Companion.getInstance();
                        object3 = ((AnalyticsManager)object4).getGtmEvents();
                        string3 = "bag screen";
                        object = "bag interactions";
                        object2 = "non_zero_cart_savings";
                        string2 = "non zero cart savings";
                        objectArray = null;
                        int n15 = 40;
                        GTMEvents.gtmEventsToGaWithCategory$default((GTMEvents)object3, (String)object, (String)object2, string2, null, string3, null, n15, null);
                    }
                }
            } else {
                RelativeLayout relativeLayout = this.N0;
                if (relativeLayout != null) {
                    ai0_2.i((View)relativeLayout);
                }
            }
        }
    }

    public final void loadCartBasedOnSelectedAddress(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "postalPinCode");
        Intrinsics.checkNotNullParameter(string3, "addressId");
        Object object = this.X0;
        if (object != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
        if ((object = this.Y0) != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
        this.c1 = string2;
        this.f1 = true;
        boolean bl2 = ap_0.b();
        if (bl2) {
            object = this.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
                bl2 = false;
                object = null;
            }
            ((wx1_1)object).h(string2, string3);
        }
    }

    public final void m0() {
        float f5;
        Object object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            f5 = 0.0f;
            object = null;
        }
        if ((object = ((wx1_1)object).S0) != null && (object = ((Cart)object).getTotalPriceWithTax()) != null && (object = ((Price)object).getValue()) != null) {
            f5 = Float.parseFloat((String)object);
            this.a.o(f5);
            object = kj0_1.g();
            FragmentActivity fragmentActivity = this.getActivity();
            String string2 = "/assured-gifts";
            ((kj0_1)object).p(fragmentActivity, string2);
        }
    }

    public final void mb() {
        View view = this.z;
        if (view != null) {
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomBtnLayout");
                view = null;
            }
            int n3 = 8;
            view.setVisibility(n3);
        }
    }

    public final void n0() {
        Object object;
        int n3 = (int)(this.t0 ? 1 : 0);
        if (n3 == 0 && (object = this.getContext()) != null) {
            n3 = 1;
            this.t0 = n3;
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
                int n7 = 2;
                object2 = new wd_0(n7, this, bottomSheetDialog);
                object.setOnClickListener((View.OnClickListener)object2);
            }
            object = new aw1_0(bottomSheetDialog);
            bottomSheetDialog.setOnShowListener((DialogInterface.OnShowListener)object);
            bottomSheetDialog.show();
        }
    }

    public final void n1(int n3, Product object) {
        if (object == null) {
            return;
        }
        Object object2 = ((Product)object).getBaseProduct();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
        object = !bl2 ? ((Product)object).getBaseProduct() : ((Product)object).getCode();
        object2 = AnalyticsManager.Companion;
        String string2 = "bag screen";
        tj2_0.e((AnalyticsManager$Companion)object2, "Product Click", (String)object, string2);
        object = this.t;
        bl2 = false;
        object2 = null;
        Object object3 = "cartViewModel";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        ((wx1_1)object).f1 = n3;
        this.Lb();
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n3 = 0;
            wx1_12 = null;
        }
        wx1_12.getClass();
        object = md3_0.c(wx1_12);
        object3 = new jx1_0(wx1_12, null);
        Ae3.d((i90_0)object, null, null, (Function2)object3, 3);
    }

    public final void n2(String object) {
        int n3;
        Object object2;
        int n4;
        if (object != null && (n4 = ((String)object).length()) != 0 && (object2 = this.getParentFragment()) != null && (n4 = (int)(((Fragment)object2).isAdded() ? 1 : 0)) == (n3 = 1) && (n4 = (int)(this.isAdded() ? 1 : 0)) != 0) {
            object2 = new ib_2();
            Object object3 = new Bundle();
            String string2 = "WALLET_INFO";
            object3.putString(string2, (String)object);
            ((Fragment)object2).setArguments((Bundle)object3);
            object = this.requireParentFragment();
            object = ((Fragment)object).getChildFragmentManager();
            object3 = "AjioWalletInfoBTS";
            try {
                ((DialogFragment)object2).show((FragmentManager)object, (String)object3);
            }
            catch (Exception exception) {
                object2 = yn3_0.a;
                ((yn3$a)object2).e(exception);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean nb() {
        Object object = this.getParentFragment();
        boolean bl2 = object instanceof qn_2;
        if (!bl2) return false;
        object = this.getParentFragment();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.cart.CartFragment");
        object = ((qn_2)object).getChildFragmentManager();
        String string2 = "getChildFragmentManager(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        int n3 = ((FragmentManager)object).J();
        if (n3 <= 0) return false;
        object = ((FragmentManager)object).I(n3 += -1);
        Intrinsics.checkNotNullExpressionValue(object, "getBackStackEntryAt(...)");
        string2 = "cart_list";
        object = object.getName();
        return Intrinsics.areEqual(string2, object);
    }

    public final CartExchangeReturnPolicy o7() {
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            wx1_12 = null;
        }
        return wx1_12.n1.b;
    }

    public final boolean ob() {
        int n3;
        Object object = this.getActivity();
        boolean bl2 = false;
        int n4 = 1;
        if (object != null && (n3 = object.isFinishing()) == n4) {
            return false;
        }
        object = this.getActivity();
        if (object != null) {
            object = ((FragmentActivity)object).getSupportFragmentManager();
            String string2 = "getSupportFragmentManager(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            int n7 = ((FragmentManager)object).J();
            if (n7 > n4) {
                object = ((FragmentManager)object).I(n7 -= n4);
                Intrinsics.checkNotNullExpressionValue(object, "getBackStackEntryAt(...)");
                string2 = object.getName();
                if (string2 != null && (n3 = (int)(Intrinsics.areEqual(object = object.getName(), string2 = "CLOSET") ? 1 : 0)) != 0) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    public final void onActivityResult(int n3, int n4, Intent object) {
        String string2;
        Object[] objectArray;
        int n7 = 1;
        ProductOptionVariant productOptionVariant = null;
        int n8 = -1;
        if (n4 != n8) {
            return;
        }
        n4 = 0;
        Object object2 = null;
        if (object != null) {
            objectArray = object.getExtras();
        } else {
            n8 = 0;
            objectArray = null;
        }
        if (objectArray != null) {
            objectArray = object.getExtras();
            Intrinsics.checkNotNull(objectArray);
            string2 = "SHOW_PLP_PAGE";
            n8 = (int)(objectArray.containsKey(string2) ? 1 : 0);
            if (n8 != 0) {
                Object object3 = this.r;
                if (object3 == null) {
                    object3 = "plpListener";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    object2 = object3;
                }
                object2.K((Intent)object);
                return;
            }
        }
        n8 = 3;
        string2 = "cartViewModel";
        if (n3 == n8) {
            Object object4;
            if (object != null && (object4 = object.getExtras()) != null) {
                object4 = "CouponAppliedSuccessfully";
                n3 = (int)(object.getBooleanExtra((String)object4, false) ? 1 : 0);
                objectArray = object.getStringExtra("COUPON_DISCOUNT_VALUE");
                if (n3 != 0) {
                    int n10;
                    String string3;
                    object4 = this.x0;
                    if (object4 != null) {
                        string3 = "IS_FIRST_PURCHASE_COUPON_APPLIED";
                        object4.c = n10 = object.getBooleanExtra(string3, false);
                    }
                    if ((object4 = this.x0) != null && (n10 = object4.c) == n7) {
                        string3 = "COUPON_CODE";
                        object = object.getStringExtra(string3);
                        object4.b = object;
                    }
                    if ((n3 = (int)(TextUtils.isEmpty((CharSequence)objectArray) ? 1 : 0)) != 0) {
                        n3 = R$string.coupon_applied_success_refresh;
                        object4 = hv3_0.K(n3);
                        object = StringCompanionObject.INSTANCE;
                        int n14 = R$string.acc_alert_message;
                        object = hv3_0.K(n14);
                        objectArray = new Object[n7];
                        objectArray[0] = object4;
                        string3 = "format(...)";
                        object = xh2_0.a(objectArray, n7, (String)object, string3);
                        this.kb((String)object4, (String)object);
                    } else {
                        n3 = R$string.coupon_applied_text;
                        object = new Object[n7];
                        object[0] = objectArray;
                        object4 = hv3_0.L(n3, object);
                        this.kb((String)object4, null);
                    }
                    object4 = this.t;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object2 = object4;
                    }
                    ((wx1_1)object2).Z0 = n7;
                    this.sb(false);
                }
            }
        } else {
            n7 = 4;
            if (n3 == n7) {
                Object object5 = this.t;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object2 = object5;
                }
                object5 = ((wx1_1)object2).S0;
                if (object5 != null) {
                    n3 = ((Cart)object5).getTotalUnitCount();
                } else {
                    n3 = 0;
                    object5 = null;
                }
                object2 = this.a;
                n4 = ((jo_2)object2).d();
                if (n3 != n4) {
                    this.sb(false);
                }
            } else {
                n7 = 1001;
                if (n3 == n7) {
                    CartEntry cartEntry = (CartEntry)((bp_1)this.h1.getValue()).b.d();
                    if (cartEntry != null && object != null) {
                        object2 = "MOVE_TO_CLOSET";
                        n4 = (int)(object.getBooleanExtra((String)object2, false) ? 1 : 0);
                        if (n4 != 0) {
                            this.Pa(cartEntry);
                        } else {
                            this.V9(cartEntry);
                        }
                    }
                } else {
                    int n15 = 1002;
                    if (n3 == n15) {
                        Object object6 = this.R;
                        if (object6 != null) {
                            n15 = ((ep_0)object6).d;
                            Comparable comparable = ((ep_0)object6).a;
                            this.q0 = object6 = ((ep_0)object6).c;
                            if (comparable != null) {
                                object6 = ((CartEntry)comparable).getEntryNumber();
                            } else {
                                n3 = 0;
                                object6 = null;
                            }
                            if (object6 != null) {
                                object6 = this.q0;
                                if (object6 != null) {
                                    object6 = ((ProductOptionVariant)object6).getCode();
                                } else {
                                    n3 = 0;
                                    object6 = null;
                                }
                                if (object6 != null && (n3 = ((String)object6).length()) != 0) {
                                    object6 = this.t;
                                    if (object6 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n3 = 0;
                                        object6 = null;
                                    }
                                    ((wx1_1)object6).g1 = n15;
                                    this.Lb();
                                    object6 = this.t;
                                    if (object6 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n3 = 0;
                                        object6 = null;
                                    }
                                    comparable = ((CartEntry)comparable).getEntryNumber();
                                    Intrinsics.checkNotNull(comparable);
                                    n7 = (Integer)comparable;
                                    productOptionVariant = this.q0;
                                    if (productOptionVariant != null) {
                                        object2 = productOptionVariant.getCode();
                                    }
                                    Intrinsics.checkNotNull(object2);
                                    ((wx1_1)object6).i(n15, n7, (String)object2);
                                }
                            }
                        }
                    } else {
                        n15 = 1003;
                        if (n3 == n15) {
                            Object object7 = this.Q;
                            if (object7 != null) {
                                Object object8;
                                n15 = ((no_0)object7).b;
                                object7 = ((no_0)object7).a;
                                if (object7 != null) {
                                    object8 = ((CartEntry)object7).getEntryNumber();
                                } else {
                                    n7 = 0;
                                    object8 = null;
                                }
                                if (object8 != null) {
                                    object8 = ((CartEntry)object7).getProduct();
                                    if (object8 != null) {
                                        object8 = ((Product)object8).getCode();
                                    } else {
                                        n7 = 0;
                                        object8 = null;
                                    }
                                    if (object8 != null) {
                                        object8 = this.t;
                                        if (object8 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                                            n7 = 0;
                                            object8 = null;
                                        }
                                        ((wx1_1)object8).g1 = n15;
                                        object8 = this.t;
                                        if (object8 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        } else {
                                            object2 = object8;
                                        }
                                        object8 = ((CartEntry)object7).getEntryNumber();
                                        Intrinsics.checkNotNull(object8);
                                        n7 = (Integer)object8;
                                        object7 = ((CartEntry)object7).getProduct();
                                        Intrinsics.checkNotNull(object7);
                                        object7 = ((Product)object7).getCode();
                                        Intrinsics.checkNotNull(object7);
                                        ((wx1_1)object2).i(n15, n7, (String)object7);
                                    }
                                }
                            }
                        } else {
                            n15 = 1004;
                            if (n3 == n15) {
                                Object object9 = this.t;
                                if (object9 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                                    n3 = 0;
                                    object9 = null;
                                }
                                if ((object9 = ((wx1_1)object9).l1) != null) {
                                    object9 = this.t;
                                    if (object9 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n3 = 0;
                                        object9 = null;
                                    }
                                    object9 = ((wx1_1)object9).l1;
                                    this.V9((CartEntry)object9);
                                    object9 = this.t;
                                    if (object9 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n3 = 0;
                                        object9 = null;
                                    }
                                    ((wx1_1)object9).l1 = null;
                                } else {
                                    this.sb(false);
                                }
                            } else {
                                n4 = this.T0;
                                if (n3 == n4) {
                                    this.sb(false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object2 = object;
            this.m = object2 = (j3_0)object;
            bl2 = object instanceof fo3;
            if (bl2) {
                object2 = object;
                this.n = object2 = (fo3)object;
                bl2 = object instanceof A71;
                if (bl2) {
                    object2 = object;
                    this.E = object2 = (A71)object;
                    bl2 = object instanceof vh3_2;
                    if (bl2) {
                        object2 = object;
                        this.o = object2 = (vh3_2)object;
                        bl2 = object instanceof nm_1;
                        if (bl2) {
                            object2 = object;
                            this.p = object2 = (nm_1)object;
                            bl2 = object instanceof lz1_1;
                            if (bl2) {
                                object2 = object;
                                this.q = object2 = (lz1_1)object;
                                bl2 = object instanceof Rj2;
                                if (bl2) {
                                    object2 = object;
                                    this.r = object2 = (Rj2)object;
                                    bl2 = object instanceof ea2_1;
                                    if (bl2) {
                                        object = (ea2_1)object;
                                        this.s = object;
                                        return;
                                    }
                                    object = pn_2.b(object, " Must implement ProductDetailListener");
                                    object2 = new ClassCastException((String)object);
                                    throw object2;
                                }
                                object = pn_2.b(object, " must implement PLPListener");
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
                    object = pn_2.b(object, " must implement TabListener");
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
        object = pn_2.b(object, " Must implement ActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onClick(View view) {
        Object object;
        Object object2;
        boolean bl2;
        Object object3;
        int n3;
        Object object4;
        boolean bl3;
        ex1_0 ex1_02;
        block46: {
            JSONObject jSONObject;
            int n4;
            block45: {
                int n7;
                String string2;
                int n8;
                ex1_02 = this;
                bl3 = false;
                object4 = null;
                if (view != null) {
                    n3 = view.getId();
                    object3 = n3;
                } else {
                    n3 = 0;
                    object3 = null;
                }
                n4 = R$id.fragment_cart_list_layout_detail;
                bl2 = false;
                object2 = "cartViewModel";
                if (object3 != null && (n8 = ((Integer)object3).intValue()) == n4) {
                    Object object5;
                    object3 = ex1_02.t;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n3 = 0;
                        object3 = null;
                    }
                    if ((object3 = ((wx1_1)object3).S0) != null) {
                        object3 = ((Cart)object3).getEntries();
                    } else {
                        n3 = 0;
                        object3 = null;
                    }
                    if (object3 != null && (n3 = (int)(object3.isEmpty() ? 1 : 0)) == 0) {
                        void var11_19;
                        ArrayList arrayList;
                        void var11_13;
                        Cart cart;
                        object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        wx1_1 wx1_12 = ex1_02.t;
                        if (wx1_12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                            n4 = 0;
                            Object var11_12 = null;
                        }
                        if ((cart = var11_13.S0) != null && (arrayList = cart.getEntries()) != null) {
                            n4 = arrayList.size();
                            Integer n10 = n4;
                        } else {
                            n4 = 0;
                            Object var11_18 = null;
                        }
                        object2 = new StringBuilder("Item count in bag : ");
                        ((StringBuilder)object2).append(var11_19);
                        String string3 = ((StringBuilder)object2).toString();
                        object2 = "bag screen";
                        object5 = "Order Summary";
                        ((GTMEvents)object3).pushButtonTapEvent((String)object5, string3, (String)object2);
                        NewCustomEventsRevamp newCustomEventsRevamp = ex1_02.l;
                        String string4 = newCustomEventsRevamp.getEC_USER_INTERACTION();
                        String string5 = ex1_02.F0;
                        object3 = ex1_02.G0;
                        String string6 = "view order summary";
                        String string7 = "view_order_summary";
                        String string8 = "bag screen";
                        String string9 = "bag screen";
                        int n14 = 1668;
                        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string4, string6, null, string7, string8, string9, string5, null, (String)object3, false, null, n14, null);
                    }
                    n3 = ex1_02.cb(9);
                    RecyclerView recyclerView = ex1_02.D;
                    if (recyclerView == null) {
                        String string10 = "cartRv";
                        Intrinsics.throwUninitializedPropertyAccessException(string10);
                    } else {
                        object4 = recyclerView;
                    }
                    object4 = ((RecyclerView)object4).getLayoutManager();
                    String string11 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager";
                    Intrinsics.checkNotNull(object4, string11);
                    ((LinearLayoutManager)object4).scrollToPositionWithOffset(n3, 0);
                    object4 = ex1_02.S;
                    long l2 = 500L;
                    if (object4 != null && (object4 = ((bo_1)object4).n) != null) {
                        object5 = Looper.getMainLooper();
                        object2 = new Handler((Looper)object5);
                        object5 = new gp_0((iP)object4);
                        object2.postDelayed((Runnable)object5, l2);
                    }
                    object2 = Looper.getMainLooper();
                    object4 = new Handler((Looper)object2);
                    object2 = new bw1_0(ex1_02, n3);
                    object4.postDelayed((Runnable)object2, l2);
                    return;
                }
                n4 = R$id.fragment_cart_list_tv_proceed;
                if (object3 == null) {
                    return;
                }
                n3 = (Integer)object3;
                if (n3 != n4) return;
                n3 = (int)(this.qb() ? 1 : 0);
                n4 = 1;
                if (n3 == 0) {
                    ex1_02.J0 = n4;
                    object3 = ex1_02.q;
                    if (object3 == null) {
                        object3 = "loginListener";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    } else {
                        object4 = object3;
                    }
                    object3 = "source - cart";
                    n4 = 6;
                    object4.z0(n4, (String)object3);
                    return;
                }
                object3 = ex1_02.C;
                object = "proceedToShipping";
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    n3 = 0;
                    object3 = null;
                }
                if ((n3 = (int)((object3 = ((AppCompatTextView)object3).getText()).equals(string2 = hv3_0.K(n7 = R$string.add_address)) ? 1 : 0)) != 0) {
                    this.wb();
                    return;
                }
                object3 = ex1_02.C;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    n3 = 0;
                    object3 = null;
                }
                if ((n3 = (int)((object3 = ((AppCompatTextView)object3).getText()).equals(object = hv3_0.K(n8 = R$string.select_address)) ? 1 : 0)) != 0) {
                    this.xb();
                    return;
                }
                object3 = ex1_02.t;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n3 = 0;
                    object3 = null;
                }
                if ((n3 = ((ArrayList)(object3 = ((wx1_1)object3).T0)).isEmpty() ^ n4) != 0) break block45;
                object3 = ex1_02.t;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n3 = 0;
                    object3 = null;
                }
                if ((n3 = ((ArrayList)(object3 = ((wx1_1)object3).U0)).isEmpty() ^ n4) != 0) break block45;
                object3 = ex1_02.t;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n3 = 0;
                    object3 = null;
                }
                if ((n3 = (int)(((wx1_1)object3).i1 ? 1 : 0)) == 0) break block46;
            }
            object3 = cp_1.Companion;
            object3.getClass();
            JSONObject jSONObject2 = cp$a.j();
            object = "master_flag";
            n4 = (int)(jSONObject2.has((String)object) ? 1 : 0);
            if (n4 != 0 && (n4 = (int)((jSONObject = cp$a.j()).getBoolean((String)object) ? 1 : 0)) != 0) {
                object3.getClass();
                object3 = cp$a.j();
                String string12 = "is_proceed_enabled";
                n3 = (int)(object3.has(string12) ? 1 : 0);
                if (n3 != 0 && (n3 = (int)((object3 = cp$a.j()).getBoolean(string12) ? 1 : 0)) != 0) {
                    this.D1();
                    return;
                }
            }
        }
        if ((object3 = ex1_02.t) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object3 = null;
        }
        n3 = (int)(((wx1_1)object3).p ? 1 : 0);
        String string13 = "ProceedPayment";
        if (n3 != 0) {
            object3 = ex1_02.t;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object3 = null;
            }
            if ((n3 = (int)(mz3_0.D((Cart)(object3 = ((wx1_1)object3).S0)) ? 1 : 0)) != 0) {
                object3 = ex1_02.t;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n3 = 0;
                    object3 = null;
                }
                if ((object3 = ((wx1_1)object3).S0) != null && (object3 = ((Cart)object3).getRvpReturnFee()) != null && (object3 = ((ProfileHealth)object3).getActionContent()) != null) {
                    object3 = ((ActionContent)object3).getForce_nudge();
                    object = Boolean.TRUE;
                    n3 = (int)(Intrinsics.areEqual(object3, object) ? 1 : 0);
                } else {
                    n3 = 0;
                    object3 = null;
                }
                if (n3 != 0) {
                    object3 = h40_0.a;
                    n3 = (int)(h40_0.k2() ? 1 : 0);
                    if (n3 != 0) {
                        ex1_02.k4(string13);
                        return;
                    }
                }
            }
        }
        if ((object3 = ex1_02.t) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object3 = null;
        }
        if ((n3 = (int)(((wx1_1)object3).p ? 1 : 0)) != 0) {
            object3 = ex1_02.t;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object4 = object3;
            }
            object4 = ((wx1_1)object4).S0;
            if (object4 != null && (object4 = ((Cart)object4).getPROFILE_HEALTH()) != null && (object4 = ((ProfileHealth)object4).getActionContent()) != null) {
                object4 = ((ActionContent)object4).getForce_nudge();
                object3 = Boolean.TRUE;
                bl2 = Intrinsics.areEqual(object4, object3);
            }
            if (bl2) {
                object4 = h40_0.a;
                bl3 = h40_0.R1();
                if (bl3) {
                    ex1_02.i9(string13);
                    return;
                }
            }
        }
        this.jb();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onCreate(Bundle bundle) {
        long l2;
        ex1_0 ex1_02 = this;
        super.onCreate(bundle);
        Object object = cp_1.Companion;
        Object object2 = this.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(object2, "getChildFragmentManager(...)");
        object.getClass();
        cp$a.D((FragmentManager)object2);
        object = z40_0.Companion;
        object2 = AJIOApplication.Companion;
        Object object3 = Q.a((AJIOApplication$a)object2, (z40$a)object).a;
        Object object4 = "cart_swicthToAjio";
        boolean bl2 = ((ao0_0)object3).a((String)object4);
        boolean bl3 = og1_1.f();
        boolean bl4 = false;
        Object object5 = null;
        if (bl3 && !bl2) {
            object3 = od3_2.a();
            bl2 = Intrinsics.areEqual(object3, object4 = ld3_2.STORE_LUXE.getStoreId());
            if (bl2) {
                og1_1.a = bl2 = true;
            } else {
                object3 = od3_2.a();
                bl2 = Intrinsics.areEqual(object3, object4 = ld3_2.STORE_AJIOGRAM.getStoreId());
                if (bl2 || (bl2 = Intrinsics.areEqual(object3 = od3_2.a(), object4 = ld3_2.STORE_AJIO.getStoreId()))) {
                    og1_1.a = false;
                }
            }
            bl4 = og1_1.a;
        }
        ex1_02.v0 = bl4;
        object3 = "owner";
        Intrinsics.checkNotNullParameter(ex1_02, (String)object3);
        object4 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(ex1_02, (String)object3);
        object5 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(ex1_02, (String)object3);
        Object object6 = this.getDefaultViewModelCreationExtras();
        Object object7 = "store";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        String string2 = "factory";
        Intrinsics.checkNotNullParameter(object5, string2);
        String string3 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object6, string3);
        Object object8 = wx1_1.class;
        String string4 = "modelClass";
        object4 = rl3_0.b((rd3_0)object4, (E$b)object5, (Wd0)object6, object8, string4);
        object5 = "<this>";
        object6 = sw0_0.a(object8, (String)object5, object8, string4, string4);
        Intrinsics.checkNotNullParameter(object6, (String)object5);
        object8 = object6.getQualifiedName();
        String string5 = "Local and anonymous classes can not be ViewModels";
        if (object8 == null) {
            object2 = string5.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        String string6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
        object8 = string6.concat((String)object8);
        ex1_02.t = object4 = (wx1_1)((pD3)object4).a((yn1_2)object6, (String)object8);
        Intrinsics.checkNotNullParameter(ex1_02, (String)object3);
        object4 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(ex1_02, (String)object3);
        object6 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(ex1_02, (String)object3);
        object8 = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        Intrinsics.checkNotNullParameter(object6, string2);
        Intrinsics.checkNotNullParameter(object8, string3);
        Class<ky1_0> clazz = ky1_0.class;
        object4 = rl3_0.b((rd3_0)object4, (E$b)object6, (Wd0)object8, clazz, string4);
        object6 = sw0_0.a(clazz, (String)object5, clazz, string4, string4);
        Intrinsics.checkNotNullParameter(object6, (String)object5);
        object8 = object6.getQualifiedName();
        if (object8 == null) {
            object2 = string5.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object8 = string6.concat((String)object8);
        ex1_02.u = object4 = (ky1_0)((pD3)object4).a((yn1_2)object6, (String)object8);
        object4 = kd3_2.a();
        object6 = new AddressRepo();
        object8 = this.requireActivity().getApplication();
        ((kd3_2)object4).a = object6;
        ((kd3_2)object4).b = object8;
        Intrinsics.checkNotNull(object4);
        Intrinsics.checkNotNullParameter(ex1_02, (String)object3);
        Intrinsics.checkNotNullParameter(object4, string2);
        object6 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(ex1_02, (String)object3);
        object8 = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object6, (String)object7);
        Intrinsics.checkNotNullParameter(object4, string2);
        Intrinsics.checkNotNullParameter(object8, string3);
        Class<h5_0> clazz2 = h5_0.class;
        object4 = im_1.a((rd3_0)object6, (kd3_2)object4, (Wd0)object8, clazz2, string4);
        object6 = sw0_0.a(clazz2, (String)object5, clazz2, string4, string4);
        Intrinsics.checkNotNullParameter(object6, (String)object5);
        object8 = object6.getQualifiedName();
        if (object8 == null) {
            object2 = string5.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object8 = string6.concat((String)object8);
        object4 = (h5_0)((pD3)object4).a((yn1_2)object6, (String)object8);
        object4 = this.getParentFragment();
        if (object4 != null) {
            Intrinsics.checkNotNullParameter(object4, (String)object3);
            object8 = object4.getViewModelStore();
            Intrinsics.checkNotNullParameter(object4, (String)object3);
            E$b e$b = object4.getDefaultViewModelProviderFactory();
            Wd0 wd0 = oh2_0.a((Fragment)object4, (String)object3, (rd3_0)object8, (String)object7);
            Intrinsics.checkNotNullParameter(e$b, string2);
            Intrinsics.checkNotNullParameter(wd0, string3);
            object6 = om_1.class;
            object8 = rl3_0.b((rd3_0)object8, e$b, wd0, object6, string4);
            object6 = sw0_0.a(object6, (String)object5, object6, string4, string4);
            Intrinsics.checkNotNullParameter(object6, (String)object5);
            String string7 = object6.getQualifiedName();
            if (string7 == null) {
                object2 = string5.toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            String string8 = string6.concat(string7);
            ex1_02.x = object6 = (om_1)((pD3)object8).a((yn1_2)object6, string8);
            Intrinsics.checkNotNullParameter(object4, (String)object3);
            object6 = object4.getViewModelStore();
            Intrinsics.checkNotNullParameter(object4, (String)object3);
            object8 = object4.getDefaultViewModelProviderFactory();
            Wd0 wd02 = oh2_0.a((Fragment)object4, (String)object3, (rd3_0)object6, (String)object7);
            Intrinsics.checkNotNullParameter(object8, string2);
            Intrinsics.checkNotNullParameter(wd02, string3);
            Class<ep_0> clazz3 = ep_0.class;
            object6 = rl3_0.b((rd3_0)object6, (E$b)object8, wd02, clazz3, string4);
            object8 = sw0_0.a(clazz3, (String)object5, clazz3, string4, string4);
            Intrinsics.checkNotNullParameter(object8, (String)object5);
            String string9 = object8.getQualifiedName();
            if (string9 == null) {
                object2 = string5.toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            String string10 = string6.concat(string9);
            ex1_02.R = object6 = (ep_0)((pD3)object6).a((yn1_2)object8, string10);
            Intrinsics.checkNotNullParameter(object4, (String)object3);
            object6 = object4.getViewModelStore();
            Intrinsics.checkNotNullParameter(object4, (String)object3);
            object8 = object4.getDefaultViewModelProviderFactory();
            Wd0 wd03 = oh2_0.a((Fragment)object4, (String)object3, (rd3_0)object6, (String)object7);
            Intrinsics.checkNotNullParameter(object8, string2);
            Intrinsics.checkNotNullParameter(wd03, string3);
            Class<no_0> clazz4 = no_0.class;
            object6 = rl3_0.b((rd3_0)object6, (E$b)object8, wd03, clazz4, string4);
            object8 = sw0_0.a(clazz4, (String)object5, clazz4, string4, string4);
            Intrinsics.checkNotNullParameter(object8, (String)object5);
            String string11 = object8.getQualifiedName();
            if (string11 == null) {
                object2 = string5.toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            String string12 = string6.concat(string11);
            ex1_02.Q = object6 = (no_0)((pD3)object6).a((yn1_2)object8, string12);
            Intrinsics.checkNotNullParameter(object4, (String)object3);
            object6 = object4.getViewModelStore();
            Intrinsics.checkNotNullParameter(object4, (String)object3);
            object8 = object4.getDefaultViewModelProviderFactory();
            Wd0 wd04 = oh2_0.a((Fragment)object4, (String)object3, (rd3_0)object6, (String)object7);
            Intrinsics.checkNotNullParameter(object8, string2);
            Intrinsics.checkNotNullParameter(wd04, string3);
            Class<zo_0> clazz5 = zo_0.class;
            object6 = rl3_0.b((rd3_0)object6, (E$b)object8, wd04, clazz5, string4);
            object8 = sw0_0.a(clazz5, (String)object5, clazz5, string4, string4);
            Intrinsics.checkNotNullParameter(object8, (String)object5);
            String string13 = object8.getQualifiedName();
            if (string13 == null) {
                object2 = string5.toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            String string14 = string6.concat(string13);
            ex1_02.y = object6 = (zo_0)((pD3)object6).a((yn1_2)object8, string14);
            Intrinsics.checkNotNullParameter(object4, (String)object3);
            object6 = object4.getViewModelStore();
            Intrinsics.checkNotNullParameter(object4, (String)object3);
            object8 = object4.getDefaultViewModelProviderFactory();
            object4 = oh2_0.a((Fragment)object4, (String)object3, (rd3_0)object6, (String)object7);
            Intrinsics.checkNotNullParameter(object8, string2);
            Intrinsics.checkNotNullParameter(object4, string3);
            Class<qm_1> clazz6 = qm_1.class;
            object4 = rl3_0.b((rd3_0)object6, (E$b)object8, (Wd0)object4, clazz6, string4);
            object6 = sw0_0.a(clazz6, (String)object5, clazz6, string4, string4);
            Intrinsics.checkNotNullParameter(object6, (String)object5);
            object8 = object6.getQualifiedName();
            if (object8 == null) {
                object2 = string5.toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            object8 = string6.concat((String)object8);
            ex1_02.x0 = object4 = (qm_1)((pD3)object4).a((yn1_2)object6, (String)object8);
            object4 = this.getActivity();
            if (object4 != null) {
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                object6 = object4.getViewModelStore();
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                object8 = object4.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                object4 = object4.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(object6, (String)object7);
                Intrinsics.checkNotNullParameter(object8, string2);
                Intrinsics.checkNotNullParameter(object4, string3);
                Class<xq2_1> clazz7 = xq2_1.class;
                object4 = rl3_0.b((rd3_0)object6, (E$b)object8, (Wd0)object4, clazz7, string4);
                object6 = sw0_0.a(clazz7, (String)object5, clazz7, string4, string4);
                Intrinsics.checkNotNullParameter(object6, (String)object5);
                object8 = object6.getQualifiedName();
                if (object8 == null) {
                    object2 = string5.toString();
                    object = new IllegalArgumentException((String)object2);
                    throw object;
                }
                object8 = string6.concat((String)object8);
                object4 = (xq2_1)((pD3)object4).a((yn1_2)object6, (String)object8);
            } else {
                bl3 = false;
                object4 = null;
            }
            ex1_02.V0 = object4;
        }
        if (!(bl3 = og1_1.b())) {
            ex1_02.I = object4 = new CustomToolbarViewMerger(ex1_02);
        }
        object4 = ex1_02.k;
        ex1_02.F0 = object6 = ((NewEEcommerceEventsRevamp)object4).getPrevScreen();
        ex1_02.G0 = object4 = ((NewEEcommerceEventsRevamp)object4).getPrevScreenType();
        ex1_02.B0 = object4 = new ex1$b_0(ex1_02);
        object4 = h40_0.a;
        ex1_02.P0 = l2 = z40$a.a((Context)AJIOApplication$a.a()).a.h("cart_load_event_x_second");
        Intrinsics.checkNotNullParameter(ex1_02, (String)object3);
        object4 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(ex1_02, (String)object3);
        object6 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(ex1_02, (String)object3);
        object3 = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        Intrinsics.checkNotNullParameter(object6, string2);
        Intrinsics.checkNotNullParameter(object3, string3);
        object7 = v33.class;
        object3 = rl3_0.b((rd3_0)object4, (E$b)object6, (Wd0)object3, (Class)object7, string4);
        object4 = sw0_0.a((Class)object7, (String)object5, (Class)object7, string4, string4);
        Intrinsics.checkNotNullParameter(object4, (String)object5);
        object5 = object4.getQualifiedName();
        if (object5 == null) {
            object2 = string5.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object5 = string6.concat((String)object5);
        object3 = (v33)((pD3)object3).a((yn1_2)object4, (String)object5);
        object3 = ex1_02.t;
        object4 = "cartViewModel";
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            bl2 = false;
            object3 = null;
        }
        ((wx1_1)object3).o1.c();
        object3 = ex1_02.t;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            object6 = null;
        } else {
            object6 = object3;
        }
        object3 = ((wx1_1)object6).n1;
        object3.getClass();
        object2.getClass();
        object2 = AJIOApplication$a.a();
        object.getClass();
        object = z40$a.a((Context)object2).a;
        object2 = "cartExchangeReturnPolicy";
        ((cn_1)object3).a = object = ((ao0_0)object).b((String)object2);
        int n3 = ((String)object).length();
        if (n3 == 0) {
            return;
        }
        object = ((cn_1)object3).a;
        object2 = CartExchangeReturnPolicy.class;
        ((cn_1)object3).b = object = (CartExchangeReturnPolicy)JsonUtils.fromJson((String)object, object2);
    }

    public final void onCreateOptionsMenu(Menu menu2, MenuInflater object) {
        Intrinsics.checkNotNullParameter(menu2, "menu");
        String string2 = "inflater";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$menu.cart_menu_luxe;
            object.inflate(n3, menu2);
        } else {
            n3 = R$menu.cart_menu_refresh;
            object.inflate(n3, menu2);
        }
        int bl2 = R$id.closet;
        menu2 = menu2.findItem(bl2);
        this.Z = menu2;
        if (menu2 != null && (menu2 = menu2.getActionView()) != null) {
            object = new fw1_0(this);
            menu2.setOnClickListener((View.OnClickListener)object);
        }
        menu2 = this.Z;
        boolean bl3 = true;
        if (menu2 != null) {
            menu2.setVisible(bl3);
        }
        if ((menu2 = this.Z) != null) {
            menu2.setEnabled(bl3);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        boolean bl2;
        object2 = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object2);
        int n3 = 1;
        this.setHasOptionsMenu(n3 != 0);
        vh3_2 vh3_22 = this.o;
        if (vh3_22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabListener");
            bl2 = false;
            vh3_22 = null;
        }
        vh3_22.showTabLayout(false);
        bl2 = this.v0;
        og1_1.g(bl2, false);
        this.J0 = n3;
        n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.fragment_cart_list_luxe;
            layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        } else {
            n3 = R$layout.fragment_cart_list_refresh;
            layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
            object = new CustomToolbarViewMerger(this);
            this.I = object;
            ((CustomToolbarViewMerger)object).initViews((View)layoutInflater);
        }
        return layoutInflater;
    }

    public final void onDestroy() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = this.k;
        String string2 = "bag screen";
        newEEcommerceEventsRevamp.setPreviousScreenData(string2, string2);
        super.onDestroy();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        Object object = this.m;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
            object = null;
        }
        object.stopLoader();
        object = null;
        this.u0 = false;
        Object object2 = this.D;
        Object object3 = "cartRv";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object2 = null;
        }
        ((RecyclerView)object2).setAdapter(null);
        object2 = this.S;
        if (object2 != null) {
            this.S = null;
        }
        if ((object2 = this.P) != null) {
            object2.dismiss();
        }
        this.P = null;
        object2 = this.D;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object2 = null;
        }
        object3 = this.i1;
        ((RecyclerView)object2).removeOnScrollListener((RecyclerView$s)object3);
        pa_1.a = false;
        object = this.D0;
        if (object != null) {
            ((pg2_2)object).a();
        }
        if ((object = this.R0) != null) {
            ((Timer)object).cancel();
            this.R0 = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onDetach() {
        block9: {
            int n3;
            HashMap<String, Object> hashMap = this.t;
            Object object = "cartViewModel";
            wx1_1 wx1_12 = null;
            if (hashMap == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                n3 = 0;
                hashMap = null;
            }
            if ((hashMap = ((wx1_1)((Object)hashMap)).S0) != null && (hashMap = ((Cart)((Object)hashMap)).getTotalPriceWithTax()) != null) {
                hashMap = ((Price)((Object)hashMap)).getValue();
            } else {
                n3 = 0;
                hashMap = null;
            }
            if (hashMap != null && (n3 = ((String)((Object)hashMap)).length()) != 0) {
                Exception exception2;
                block8: {
                    String string2;
                    block7: {
                        wx1_1 wx1_13;
                        block6: {
                            try {
                                hashMap = new HashMap<String, Object>();
                                string2 = "Cart exit";
                                wx1_13 = this.t;
                                if (wx1_13 != null) break block6;
                                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                                break block7;
                            }
                            catch (Exception exception2) {
                                break block8;
                            }
                        }
                        wx1_12 = wx1_13;
                    }
                    object = wx1_12.S0;
                    Intrinsics.checkNotNull(object);
                    object = ((Cart)object).getTotalPriceWithTax();
                    Intrinsics.checkNotNull(object);
                    object = ((Price)object).getValue();
                    Intrinsics.checkNotNull(object);
                    hashMap.put(string2, object);
                    object = AJIOApplication.Companion;
                    object.getClass();
                    object = AJIOApplication$a.a();
                    object = com.clevertap.android.sdk.a.g((Context)object);
                    Intrinsics.checkNotNull(object);
                    ((a)object).q(hashMap);
                    break block9;
                }
                object = yn3_0.a;
                ((yn3$a)object).e(exception2);
            }
        }
        super.onDetach();
    }

    public final void onDoneClick() {
        Dialog dialog = this.P;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.P = null;
    }

    public final void onNavigationClick() {
        boolean bl2;
        Object object = this.getActivity();
        if (object != null && !(bl2 = (object = this.requireActivity()).isFinishing())) {
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            String string2 = "Cart Close";
            String string3 = "bag screen";
            String string4 = "Header Click";
            ((GTMEvents)object).pushButtonTapEvent(string4, string2, string3);
            object = this.getActivity();
            if (object != null) {
                ((ComponentActivity)object).onBackPressed();
            }
        }
    }

    public final void onResume() {
        super.onResume();
        boolean bl2 = this.v0;
        boolean bl3 = false;
        Object object = null;
        og1_1.g(bl2, false);
        Object object2 = yn3_0.a;
        String string2 = od3_2.a();
        string2 = kp1_0.c("cart store frag :", string2);
        Object object3 = new Object[]{};
        ((yn3$a)object2).a(string2, object3);
        object2 = this.o;
        string2 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabListener");
            bl2 = false;
            object2 = null;
        }
        object2.t();
        object2 = this.p;
        object3 = "cartClosetListener";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            bl2 = false;
            object2 = null;
        }
        bl2 = object2.B1();
        String string3 = "bag screen";
        if (bl2) {
            object2 = AnalyticsManager.Companion;
            String string4 = "Screen load";
            String string5 = "Price_Drop";
            tj2_0.e((AnalyticsManager$Companion)object2, string4, string5, string3);
            object2 = this.p;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                bl2 = false;
                object2 = null;
            }
            object2.g0();
        }
        this.U0 = false;
        object2 = this.k;
        object = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        this.F0 = object;
        this.G0 = object2 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        object2 = this.R0;
        if (object2 != null) {
            ((Timer)object2).cancel();
            this.R0 = null;
        }
        if (!(bl2 = og1_1.c()) && (object2 = this.E0) != null) {
            this.D0 = object = new pg2_2((View)object2, string3);
        }
        if ((object2 = this.getView()) != null) {
            bl3 = true;
            object2.setFocusableInTouchMode(bl3);
            object2.requestFocus();
            object = new aw1_1(this);
            object2.setOnKeyListener((View.OnKeyListener)object);
        }
    }

    public final void onStop() {
        super.onStop();
        AnalyticsGAEventHandler analyticsGAEventHandler = AnalyticsGAEventHandler.Companion.getInstance();
        Message message = new Message();
        message.what = 1004;
        analyticsGAEventHandler.sendMessage(message);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        int n3;
        Object object5;
        Object object6;
        boolean bl2;
        Object object7;
        int n4;
        Object object8;
        int n7;
        int n8;
        ex1_0 ex1_02 = this;
        View view2 = view;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        int n10 = 1;
        this.u0 = n10;
        Object object9 = this.n;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarListener");
            n8 = 0;
            object9 = null;
        }
        object9.hideToolbarLayout();
        n8 = og1_1.b();
        int n14 = 8;
        Object object10 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity";
        if (n8 != 0) {
            n8 = R$id.cart_toolbar_luxe;
            ex1_02.J = object9 = (Toolbar)view2.findViewById(n8);
            n8 = R$id.luxe_cart_toolbar_title;
            object9 = (TextView)view2.findViewById(n8);
            n7 = R$id.luxe_cart_toolbar_sub_title;
            object8 = (TextView)view2.findViewById(n7);
            ex1_02.K = object8;
            object8 = this.getActivity();
            n7 = object8 instanceof AppCompatActivity;
            if (n7 != 0) {
                object8 = this.getActivity();
                Intrinsics.checkNotNull(object8, (String)object10);
                object8 = (AppCompatActivity)object8;
                object10 = ex1_02.J;
                ((AppCompatActivity)object8).setSupportActionBar((Toolbar)object10);
            }
            if ((object10 = ex1_02.J) != null) {
                n7 = R$drawable.ic_cancel_cart_luxe;
                ((Toolbar)object10).setNavigationIcon(n7);
            }
            if ((object10 = ex1_02.J) != null) {
                n7 = R$string.close;
                object8 = hv3_0.K(n7);
                ((Toolbar)object10).setNavigationContentDescription((CharSequence)object8);
            }
            if ((object10 = ex1_02.J) != null) {
                int n15 = 1;
                object8 = new Id(ex1_02, n15);
                ((Toolbar)object10).setNavigationOnClickListener((View.OnClickListener)object8);
            }
            n4 = R$string.empty_bag_title_refresh;
            object10 = hv3_0.K(n4);
            object9.setText((CharSequence)object10);
            object9 = ex1_02.K;
            if (object9 != null) {
                object9.setVisibility(n14);
            }
        } else {
            object9 = ex1_02.I;
            if (object9 != null) {
                object9 = ((CustomToolbarViewMerger)object9).getToolbar();
            } else {
                n8 = 0;
                object9 = null;
            }
            ex1_02.J = object9;
            object9 = this.getActivity();
            n8 = object9 instanceof AppCompatActivity;
            if (n8 != 0) {
                object9 = this.getActivity();
                Intrinsics.checkNotNull(object9, (String)object10);
                object9 = (AppCompatActivity)object9;
                object10 = ex1_02.J;
                ((AppCompatActivity)object9).setSupportActionBar((Toolbar)object10);
            }
            if ((object9 = ex1_02.I) != null) {
                ((CustomToolbarViewMerger)object9).setNavigationClick();
            }
            if ((object9 = ex1_02.J) != null) {
                object10 = new iw1_0(ex1_02);
                ((Toolbar)object9).setNavigationOnClickListener((View.OnClickListener)object10);
            }
            if ((object9 = this.getActivity()) != null) {
                object9.invalidateOptionsMenu();
            }
            if ((object9 = ex1_02.I) != null) {
                ((CustomToolbarViewMerger)object9).setSubTitleVisibility(n14);
            }
            if ((object10 = ex1_02.I) != null) {
                n7 = R$drawable.ic_cancel_cart_refresh;
                n8 = R$string.close;
                object7 = ex1_02.getString(n8);
                int n16 = 8;
                bl2 = false;
                object6 = null;
                object5 = "cartpage";
                n3 = 0;
                object4 = null;
                CustomToolbarViewMerger.setNavigationIcon$default((CustomToolbarViewMerger)object10, n7, (String)object7, (String)object5, null, n16, null);
            }
            n8 = R$id.app_bar_layout;
            object9 = (AppBarLayout)view2.findViewById(n8);
            ((AppBarLayout)object9).setExpanded(n10 != 0);
        }
        object9 = ex1_02.u;
        object10 = "closetViewModel";
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object10);
            n8 = 0;
            object9 = null;
        }
        object9 = ((ky1_0)object9).i.e;
        object8 = this.getViewLifecycleOwner();
        int n17 = 0;
        object7 = new jw1_1(ex1_02, 0);
        object5 = new eX1$d((Function1)object7);
        ((LiveData)object9).e((mu1_1)object8, (F62)object5);
        object9 = ex1_02.u;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object10);
            n8 = 0;
            object9 = null;
        }
        object9 = ((ky1_0)object9).i.g;
        object8 = this.getViewLifecycleOwner();
        n17 = 0;
        object7 = new uw1_1(ex1_02, 0);
        object5 = new eX1$d((Function1)object7);
        ((LiveData)object9).e((mu1_1)object8, (F62)object5);
        object9 = ex1_02.t;
        object8 = "cartViewModel";
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).q0;
        object7 = this.getViewLifecycleOwner();
        object5 = new dw1_2(ex1_02);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).t;
        object7 = this.getViewLifecycleOwner();
        object5 = new hw1_1(ex1_02);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).E;
        object7 = this.getViewLifecycleOwner();
        n3 = 1;
        object5 = new xx1_0(ex1_02, n3);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).m;
        object7 = this.getViewLifecycleOwner();
        n3 = 1;
        object5 = new yx1_0(ex1_02, n3);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).C;
        object7 = this.getViewLifecycleOwner();
        n3 = 1;
        object5 = new zx1_0(ex1_02, n3);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).I;
        object7 = this.getViewLifecycleOwner();
        n3 = 1;
        object5 = new ay1_2(ex1_02, n3);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).o;
        object7 = this.getViewLifecycleOwner();
        n3 = 1;
        object5 = new by1_2(ex1_02, n3);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).A;
        object7 = this.getViewLifecycleOwner();
        object5 = new iw1_1(ex1_02);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.V0;
        if (object9 != null && (object9 = ((xq2_1)object9).a) != null) {
            object7 = this.getViewLifecycleOwner();
            object5 = new kw1_1(ex1_02);
            object4 = new eX1$d((Function1)object5);
            ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        }
        if ((object9 = ex1_02.t) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).i;
        object7 = this.getViewLifecycleOwner();
        n3 = 0;
        object5 = new lw1_1(ex1_02, 0);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).r;
        object7 = this.getViewLifecycleOwner();
        object5 = new mw1_1(ex1_02);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).k;
        object7 = this.getViewLifecycleOwner();
        n3 = 0;
        object5 = new nw1_1(ex1_02, 0);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).G;
        object7 = this.getViewLifecycleOwner();
        object5 = new ow1_1(ex1_02);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).K;
        object7 = this.getViewLifecycleOwner();
        n3 = 0;
        object5 = new pw1_1(ex1_02, 0);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).M;
        object7 = this.getViewLifecycleOwner();
        object5 = new qw1_1(ex1_02);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).z;
        object7 = this.getViewLifecycleOwner();
        object5 = new rw1_1(ex1_02);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).O;
        object7 = this.getViewLifecycleOwner();
        object5 = new sw1_1(ex1_02);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).U;
        object7 = this.getViewLifecycleOwner();
        object5 = new tw1_1(ex1_02);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).Y;
        object7 = this.getViewLifecycleOwner();
        object5 = new vw1_0(ex1_02);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).S;
        object7 = this.getViewLifecycleOwner();
        object5 = new ww1_0(ex1_02);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).k0;
        object7 = this.getViewLifecycleOwner();
        n3 = 1;
        object5 = new ef0_2(ex1_02, n3);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).Q;
        object7 = this.getViewLifecycleOwner();
        n3 = 1;
        object5 = new cy0_2(ex1_02, n3);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).s0;
        object7 = this.getViewLifecycleOwner();
        n3 = 0;
        object5 = new xw1_0(ex1_02, 0);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).u0;
        object7 = this.getViewLifecycleOwner();
        n3 = 0;
        object5 = new yw1_0(ex1_02, 0);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).w0;
        object7 = this.getViewLifecycleOwner();
        object5 = new zw1_0(ex1_02);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).y0;
        object7 = this.getViewLifecycleOwner();
        n3 = 1;
        object5 = new ik_2(ex1_02, n3);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).A0;
        object7 = this.getViewLifecycleOwner();
        object5 = new bw1_1(ex1_02);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).C0;
        object7 = this.getViewLifecycleOwner();
        object5 = new cw1_2(ex1_02);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).E0;
        object7 = this.getViewLifecycleOwner();
        n3 = 1;
        object5 = new ry0_2(ex1_02, n3);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.u;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object10);
            n8 = 0;
            object9 = null;
        }
        object9 = ((ky1_0)object9).j;
        object7 = this.getViewLifecycleOwner();
        n3 = 2;
        object5 = new rh0_2(ex1_02, n3);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.u;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object10);
            n8 = 0;
            object9 = null;
        }
        object9 = ((ky1_0)object9).l;
        object7 = this.getViewLifecycleOwner();
        n3 = 1;
        object5 = new ty0_2(ex1_02, n3);
        object4 = new eX1$d((Function1)object5);
        ((LiveData)object9).e((mu1_1)object7, (F62)object4);
        object9 = ex1_02.u;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object10);
            n8 = 0;
            object9 = null;
        }
        object9 = ((ky1_0)object9).m;
        object10 = this.getViewLifecycleOwner();
        object7 = new ew1_1(ex1_02, 0);
        object5 = new eX1$d((Function1)object7);
        ((LiveData)object9).e((mu1_1)object10, (F62)object5);
        object9 = ((BannerAdViewModel)ex1_02.b1.getValue()).getAdditionalBannerLD();
        object10 = this.getViewLifecycleOwner();
        n17 = 1;
        object7 = new xy0_2(ex1_02, n17);
        object5 = new eX1$d((Function1)object7);
        ((LiveData)object9).e((mu1_1)object10, (F62)object5);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).v;
        object10 = this.getViewLifecycleOwner();
        n17 = 1;
        object7 = new yy0_0(ex1_02, n17);
        object5 = new eX1$d((Function1)object7);
        ((LiveData)object9).e((mu1_1)object10, (F62)object5);
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        object9 = ((wx1_1)object9).x;
        object10 = this.getViewLifecycleOwner();
        object7 = new gw1_1(ex1_02);
        object5 = new eX1$d((Function1)object7);
        ((LiveData)object9).e((mu1_1)object10, (F62)object5);
        ex1_02.U = false;
        object9 = ex1_02.t;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n8 = 0;
            object9 = null;
        }
        if ((object10 = ex1_02.y) != null) {
            object10 = ((zo_0)object10).a;
        } else {
            n4 = 0;
            object10 = null;
        }
        object9.getClass();
        if (object10 != null && (object7 = ((co_1)object10).c) != null && (object5 = ((wx1_1)object9).S0) != null) {
            Intrinsics.checkNotNull(object5);
            object5 = ((Cart)object5).getEntries();
            if (object5 != null) {
                object5 = object7.iterator();
                while ((n3 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                    object4 = (CartModification)object5.next();
                    object3 = ((wx1_1)object9).S0;
                    Intrinsics.checkNotNull(object3);
                    object3 = ((Cart)object3).getEntries().iterator();
                    object6 = "iterator(...)";
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object6);
                    while (bl2 = object3.hasNext()) {
                        boolean bl3;
                        object6 = (CartEntry)object3.next();
                        if (object4 != null && (object2 = ((CartModification)object4).getEntry()) != null && (object2 = ((CartEntry)object2).getProduct()) != null) {
                            object2 = ((Product)object2).getCode();
                        } else {
                            bl3 = false;
                            object2 = null;
                        }
                        Intrinsics.checkNotNull(object2);
                        object = ((CartEntry)object6).getProduct().getCode();
                        Intrinsics.checkNotNull(object);
                        bl3 = kotlin.text.b.i((String)object2, (String)object, n10 != 0);
                        if (!bl3) continue;
                        object2 = ((CartModification)object4).getEntry();
                        if (object2 != null && (object2 = ((CartEntry)object2).getProduct()) != null) {
                            object = ((CartEntry)object6).getProduct().getImages();
                            ((Product)object2).setImages((List)object);
                        }
                        if ((object2 = ((CartModification)object4).getEntry()) == null) continue;
                        object6 = ((CartEntry)object6).getEntryNumber();
                        ((CartEntry)object2).setEntryNumber((Integer)object6);
                    }
                }
                object5 = object10 = ((co_1)object10).b;
                object5 = (Collection)object10;
                if (object5 == null || (n17 = (int)(object5.isEmpty() ? 1 : 0)) != 0) {
                    n4 = 0;
                    object10 = null;
                }
                ((wx1_1)object9).P0 = object10;
                object10 = ((wx1_1)object9).p0;
                object5 = Boolean.TRUE;
                ((LiveData)object10).k(object5);
                object7 = (Collection)object7;
                ((wx1_1)object9).N0 = object10 = CollectionsKt.m0((Collection)object7);
                ((wx1_1)object9).O0 = object10 = CollectionsKt.m0((Collection)object7);
            }
        }
        if ((object10 = ex1_02.t) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n4 = 0;
            object10 = null;
        }
        ex1_02.v = object9 = new ko_2((wx1_1)object10);
        object10 = ex1_02.t;
        if (object10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n4 = 0;
            object10 = null;
        }
        ex1_02.w = object9 = new wn_1((wx1_1)object10);
        n8 = R$id.fragment_cart_list_layout_button;
        object9 = view2.findViewById(n8);
        ex1_02.z = object9;
        String string2 = "bottomBtnLayout";
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n8 = 0;
            object9 = null;
        }
        n4 = R$id.fragment_cart_list_tv_price;
        ex1_02.A = object9 = (AjioTextView)object9.findViewById(n4);
        object9 = ex1_02.z;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n8 = 0;
            object9 = null;
        }
        n4 = R$id.LayoutHighlightOffer;
        object9 = (RelativeLayout)object9.findViewById(n4);
        ex1_02.N0 = object9;
        object9 = ex1_02.z;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n8 = 0;
            object9 = null;
        }
        n4 = R$id.txtHighlightOffer;
        object9 = (TextView)object9.findViewById(n4);
        ex1_02.M0 = object9;
        n8 = R$id.new_fragment_cart_list_progress_bar;
        object9 = (AjioProgressView)view2.findViewById(n8);
        n8 = R$id.cart_shimmer_view;
        object9 = (ShimmerFrameLayout)view2.findViewById(n8);
        ex1_02.B = object9;
        n8 = R$id.cart_rv;
        object9 = (RecyclerView)view2.findViewById(n8);
        ex1_02.D = object9;
        String string3 = "cartRv";
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            n8 = 0;
            object9 = null;
        }
        object8 = this.getContext();
        object10 = new WrapperLinearLayoutManager((Context)object8);
        ((RecyclerView)object9).setLayoutManager((RecyclerView$o)object10);
        object9 = ex1_02.D;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            n8 = 0;
            object9 = null;
        }
        ((RecyclerView)object9).setHasFixedSize(n10 != 0);
        object10 = ex1_02.T;
        object4 = ex1_02.B0;
        object9 = object;
        object8 = this;
        object7 = this;
        object5 = this;
        object3 = this;
        object6 = this;
        object2 = this;
        Object object11 = object;
        object = this;
        ex1_02.S = object9 = new bo_1((ArrayList)object10, this, this, this, (RecyclerViewScrollListener)object4, this, this, this, this);
        object9 = ex1_02.D;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            n8 = 0;
            object9 = null;
        }
        object10 = ex1_02.S;
        ((RecyclerView)object9).setAdapter((RecyclerView$f)object10);
        object9 = ex1_02.D;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            n8 = 0;
            object9 = null;
        }
        object10 = ex1_02.i1;
        ((RecyclerView)object9).addOnScrollListener((RecyclerView$s)object10);
        object9 = ex1_02.z;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n8 = 0;
            object9 = null;
        }
        if ((object9 = (LinearLayout)object9.findViewById(n4 = R$id.fragment_cart_list_layout_detail)) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewOrderSumary");
            n8 = 0;
            object9 = null;
        }
        object9.setOnClickListener((View.OnClickListener)ex1_02);
        object9 = ex1_02.z;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n8 = 0;
            object9 = null;
        }
        n4 = R$id.fragment_cart_list_tv_proceed;
        ex1_02.C = object9 = (AjioTextView)object9.findViewById(n4);
        object10 = "proceedToShipping";
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object10);
            n8 = 0;
            object9 = null;
        }
        object9.setOnClickListener((View.OnClickListener)ex1_02);
        object9 = z40_0.Companion;
        object9 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object9).a;
        object8 = "shippingButtonTitleToShowInCart";
        ex1_02.Z0 = object9 = ((ao0_0)object9).b((String)object8);
        n8 = (int)(TextUtils.isEmpty((CharSequence)object9) ? 1 : 0);
        if (n8 != 0 || (n8 = ((String)(object9 = ex1_02.Z0)).length()) > (n7 = 21)) {
            n8 = R$string.confirm_order_cart;
            ex1_02.Z0 = object9 = hv3_0.K(n8);
        }
        if ((object9 = ex1_02.C) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object10);
            n8 = 0;
            object9 = null;
        }
        object10 = ex1_02.Z0;
        object9.setText((CharSequence)object10);
        n8 = R$id.emptyCartLayout;
        object9 = view2.findViewById(n8);
        ex1_02.G = object9;
        object10 = this.getContext();
        object8 = ex1_02.G;
        Intrinsics.checkNotNull(object8);
        object10 = (gc3_2)((Object)object10);
        ex1_02.H = object9 = new fz0_1((gc3_2)((Object)object10), (View)object8, ex1_02);
        n8 = (int)(og1_1.b() ? 1 : 0);
        if (n8 != 0) {
            n8 = R$id.view_detail_tv_order_summary;
            object9 = (AjioTextView)view2.findViewById(n8);
            n4 = object9.getPaintFlags() | n14;
            object9.setPaintFlags(n4);
        } else {
            n8 = R$id.refereeWidget;
            object9 = view2.findViewById(n8);
            ex1_02.E0 = object9;
            n8 = R$id.id_floating_assured_gift_view;
            object9 = (LinearLayout)view2.findViewById(n8);
            ex1_02.L = object9;
            n8 = R$id.id_floating_assured_gift_amount;
            object9 = (TextView)view2.findViewById(n8);
            ex1_02.M = object9;
            n8 = R$id.id_cart_assured_anim;
            object9 = (ImageView)view2.findViewById(n8);
        }
        object9 = ex1_02.x0;
        if (object9 != null && (n4 = (int)(((qm_1)object9).d ? 1 : 0)) == n10) {
            ((qm_1)object9).d = false;
        } else {
            object9 = ex1_02.B;
            if (object9 == null) {
                object9 = "cartShimmerView";
                Intrinsics.throwUninitializedPropertyAccessException((String)object9);
                object11 = null;
            } else {
                object11 = object9;
            }
            hv3_0.p0((ShimmerFrameLayout)((Object)object11));
            ex1_02.sb(n10 != 0);
        }
        object10 = Looper.getMainLooper();
        object9 = new Handler((Looper)object10);
        object10 = new zv1_0(ex1_02);
        object9.postDelayed((Runnable)object10, 500L);
        n8 = R$id.emptyCartProductContainer;
        object9 = (LinearLayout)view2.findViewById(n8);
        ex1_02.F = object9;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void p(String object, boolean bl2) {
        Object object2;
        if (object == null) return;
        int n3 = ((String)object).length();
        if (n3 == 0) {
            return;
        }
        n3 = 0;
        Object object3 = null;
        if (bl2) {
            object2 = this.t;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
                bl2 = false;
                object2 = null;
            }
            object2 = ((wx1_1)object2).p1;
            ((HashSet)object2).add(object);
        } else {
            object2 = this.t;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
                bl2 = false;
                object2 = null;
            }
            object2 = ((wx1_1)object2).p1;
            ((HashSet)object2).remove(object);
        }
        object = this.m;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
            object = null;
        }
        object.startLoader();
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            object = null;
        }
        if ((object2 = this.t) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            bl2 = false;
            object2 = null;
        }
        object2 = ((wx1_1)object2).p1;
        Object object4 = this.t;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            object4 = null;
        }
        object4 = ((wx1_1)object4).S0;
        synchronized (object) {
            aW aW2 = md3_0.c((jD3)object);
            ux1_1 ux1_12 = new ux1_1((wx1_1)object, (HashSet)object2, (Cart)object4, null);
            bl2 = 3;
            Ae3.d(aW2, null, null, ux1_12, (int)(bl2 ? 1 : 0));
        }
        object = this.t;
        if (object == null) {
            object = "cartViewModel";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object3 = object;
        }
        object = ((wx1_1)object3).M0;
        object2 = this.getViewLifecycleOwner();
        object3 = new nw1_0(this);
        object4 = new eX1$d((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
    }

    public final boolean pb() {
        boolean bl2;
        Object object = this.t;
        ArrayList arrayList = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            bl2 = false;
            object = null;
        }
        if ((object = ((wx1_1)object).S0) != null) {
            arrayList = ((Cart)object).getEntries();
        }
        if ((bl2 = lp_0.d(arrayList)) > false) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final void q0(ConvenienceFee convenienceFee) {
        ex1_0 ex1_02 = this;
        Object object = convenienceFee;
        Intrinsics.checkNotNullParameter(convenienceFee, "convenienceFee");
        r80_0 r80_02 = new r80_0();
        Object object2 = convenienceFee.getDelivery();
        Object object3 = null;
        object2 = object2 != null && (object2 = ((AmountData)object2).getAmount()) != null ? ((Price)object2).getValue() : null;
        Object object4 = convenienceFee.getDelivery();
        object4 = object4 != null && (object4 = ((AmountData)object4).getNetAmount()) != null ? ((Price)object4).getValue() : null;
        Object object5 = convenienceFee.getRVP();
        object5 = object5 != null && (object5 = ((AmountData)object5).getAmount()) != null ? ((Price)object5).getValue() : null;
        Object object6 = convenienceFee.getRVP();
        object6 = object6 != null && (object6 = ((AmountData)object6).getNetAmount()) != null ? ((Price)object6).getValue() : null;
        Object object7 = convenienceFee.getCOD();
        object7 = object7 != null && (object7 = ((AmountData)object7).getAmount()) != null ? ((Price)object7).getValue() : null;
        Object object8 = convenienceFee.getCOD();
        object8 = object8 != null && (object8 = ((AmountData)object8).getNetAmount()) != null ? ((Price)object8).getValue() : null;
        Object object9 = convenienceFee.getTotal();
        if (object9 != null && (object9 = ((AmountData)object9).getAmount()) != null) {
            ((Price)object9).getValue();
        }
        object9 = (object9 = convenienceFee.getTotal()) != null && (object9 = ((AmountData)object9).getNetAmount()) != null ? ((Price)object9).getValue() : null;
        Object object10 = convenienceFee.getPriorityDelivery();
        Object object11 = object10 != null && (object10 = ((AmountData)object10).getAmount()) != null ? (object10 = ((Price)object10).getValue()) : null;
        object10 = convenienceFee.getPriorityDelivery();
        Object object12 = object10 != null && (object10 = ((AmountData)object10).getNetAmount()) != null ? (object10 = ((Price)object10).getValue()) : null;
        object10 = ex1_02.t;
        Object object13 = "cartViewModel";
        if (object10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object13);
            object10 = null;
        }
        object10 = ((wx1_1)object10).o1;
        Object object14 = ex1_02.t;
        if (object14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object13);
            object14 = null;
        }
        if ((object13 = ((wx1_1)object14).S0) != null) {
            int bl2 = ((Cart)object13).getDeliveryFeeThresholdAmount();
            object14 = object13 = Integer.valueOf(bl2);
        } else {
            object14 = null;
        }
        object13 = convenienceFee.getDelivery();
        if (object13 != null) {
            object13 = ((AmountData)object13).getCohort();
        } else {
            boolean bl2 = false;
            object13 = null;
        }
        boolean bl3 = AmountDataKt.isFeeCharged((String)object13);
        Boolean bl4 = bl3;
        object13 = convenienceFee.getRVP();
        if (object13 != null) {
            object13 = ((AmountData)object13).getCohort();
        } else {
            boolean bl5 = false;
            object13 = null;
        }
        boolean bl6 = AmountDataKt.isFeeCharged((String)object13);
        Boolean bl7 = bl6;
        object = convenienceFee.getCOD();
        if (object != null) {
            object3 = ((AmountData)object).getCohort();
        }
        Boolean bl8 = AmountDataKt.isFeeCharged(object3);
        Boolean bl9 = Boolean.FALSE;
        Boolean bl10 = Boolean.TRUE;
        object = r80_02;
        object3 = object4;
        object4 = object5;
        object5 = object6;
        object6 = object7;
        object7 = object8;
        object8 = object9;
        object9 = object10;
        object10 = object14;
        object14 = bl4;
        bl4 = bl7;
        r80_02.Oa((String)object2, (String)object3, (String)object4, (String)object5, (String)object6, (String)object7, (String)object8, (m80_0)object9, (Integer)object10, false, (Boolean)object14, bl7, bl8, (String)object11, (String)object12, bl9, bl10);
        object = this.requireActivity().getSupportFragmentManager();
        r80_0.Companion.getClass();
        r80_02.show((FragmentManager)object, "ConvenienceFeeInfoBottomSheet");
    }

    public final void q4(String object) {
        Intrinsics.checkNotNullParameter(object, "pinCode");
        Object object2 = new fo_1();
        this.W0 = object2;
        ((fo_1)object2).Ra((String)object);
        object = this.W0;
        if (object != null) {
            object2 = "onCartClickListener";
            Intrinsics.checkNotNullParameter(this, (String)object2);
            ((fo_1)object).f = this;
        }
        if ((object = this.W0) != null) {
            object2 = this.requireActivity().getSupportFragmentManager();
            String string2 = "CartPinCodeCheckBottomSheet";
            ((DialogFragment)object).show((FragmentManager)object2, string2);
        }
    }

    public final void q6(CartEntry cartEntry) {
        if (cartEntry != null) {
            this.Lb();
            boolean bl2 = this.qb();
            if (bl2) {
                wx1_1 wx1_12 = this.t;
                wx1_1 wx1_13 = null;
                String string2 = "cartViewModel";
                if (wx1_12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    wx1_12 = null;
                }
                wx1_12.getClass();
                String string3 = "<set-?>";
                Intrinsics.checkNotNullParameter(cartEntry, string3);
                wx1_12.b1 = cartEntry;
                wx1_12 = this.t;
                if (wx1_12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    wx1_12 = null;
                }
                wx1_12.getClass();
                Intrinsics.checkNotNullParameter(cartEntry, string3);
                wx1_12.a1 = cartEntry;
                wx1_12 = this.t;
                if (wx1_12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    wx1_13 = wx1_12;
                }
                wx1_13.d(cartEntry, cartEntry);
            } else {
                this.V9(cartEntry);
            }
        }
    }

    public final void qa() {
        Object object = this.getContext();
        if (object != null) {
            int n3;
            Object object2 = this.requireContext();
            object = new BottomSheetDialog((Context)object2);
            object.requestWindowFeature(1);
            int n4 = R$layout.dod_bottom_sheet_pop_up_view;
            ((BottomSheetDialog)object).setContentView(n4);
            ((BottomSheetDialog)object).setCancelable(false);
            n4 = R$id.dod_bottom_sheet_pop_up_ends_in_layout;
            object2 = (LinearLayout)((on)object).findViewById(n4);
            if (object2 != null) {
                n3 = 8;
                object2.setVisibility(n3);
            }
            if ((object2 = (TextView)((on)object).findViewById(n4 = R$id.dod_bottom_sheet_pop_up_msg_tv)) != null) {
                n3 = R$string.dod_quantity_update_msg;
                object2.setText(n3);
            }
            if ((object2 = (TextView)((on)object).findViewById(n4 = R$id.main_title)) != null) {
                n3 = R$string.dod_quantity_update_title;
                object2.setText(n3);
            }
            if ((object2 = (AjioTextView)((on)object).findViewById(n4 = R$id.dod_bottom_sheet_pop_up_ok_tv)) != null) {
                gw1_0 gw1_02 = new gw1_0((BottomSheetDialog)object);
                object2.setOnClickListener((View.OnClickListener)gw1_02);
            }
            object2 = new hw1_0((BottomSheetDialog)object);
            object.setOnShowListener((DialogInterface.OnShowListener)object2);
            object.show();
        }
    }

    public final boolean qb() {
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            wx1_12 = null;
        }
        return wx1_12.c();
    }

    public final void rb() {
        Timer timer;
        int n3;
        this.Q0 = n3 = 1;
        long l2 = this.P0;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0 && (timer = this.R0) == null) {
            Timer timer2;
            this.R0 = timer2 = new Timer();
            NewCartListFragment$loadCartOrderSummaryEvent$1 newCartListFragment$loadCartOrderSummaryEvent$1 = new NewCartListFragment$loadCartOrderSummaryEvent$1(this);
            long l7 = this.P0;
            n3 = 1000;
            long l8 = (long)n3 * l7;
            l7 = 0L;
            timer2.scheduleAtFixedRate((TimerTask)newCartListFragment$loadCartOrderSummaryEvent$1, l7, l8);
        }
    }

    public final void s(PaymentInstrumentInfo object) {
        block9: {
            boolean bl2 = this.isAdded();
            if (!bl2) break block9;
            Object object2 = this.g1;
            object2 = ((hh3_2)object2).getValue();
            object2 = (io2_1)object2;
            object2 = ((io2_1)object2).c;
            ((LiveData)object2).k(object);
            object = new fj1_2();
            object2 = this.getChildFragmentManager();
            String string2 = "InternalWalletDescBottomFragment";
            try {
                ((DialogFragment)object).show((FragmentManager)object2, string2);
            }
            catch (Exception exception) {
                object2 = yn3_0.a;
                ((yn3$a)object2).e(exception);
            }
        }
    }

    public final void s2(int n3) {
        int n4 = 3;
        wx1_1 wx1_12 = null;
        String string2 = "cartViewModel";
        if (n3 != n4) {
            n4 = 4;
            if (n3 != n4) {
                n4 = 5;
                if (n3 != n4) {
                    n4 = 11;
                    boolean bl2 = true;
                    if (n3 != n4) {
                        n4 = 24;
                        if (n3 == n4) {
                            wx1_1 wx1_13 = this.t;
                            if (wx1_13 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                            } else {
                                wx1_12 = wx1_13;
                            }
                            wx1_12.Y0 = bl2;
                        }
                    } else {
                        wx1_1 wx1_14 = this.t;
                        if (wx1_14 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                        } else {
                            wx1_12 = wx1_14;
                        }
                        wx1_12.X0 = bl2;
                    }
                } else {
                    Object object = this.t;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        wx1_12 = object;
                    }
                    object = wx1_12.S0;
                    if (object != null && (object = ((Cart)object).getLowStockCartEntries()) != null) {
                        ((ArrayList)object).clear();
                    }
                }
            } else {
                Object object = this.t;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    wx1_12 = object;
                }
                object = wx1_12.S0;
                if (object != null && (object = ((Cart)object).getOosCartEntries()) != null) {
                    ((ArrayList)object).clear();
                }
            }
        } else {
            Object object = this.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                wx1_12 = object;
            }
            object = wx1_12.S0;
            if (object != null && (object = ((Cart)object).getMergedCartEntries()) != null) {
                ((ArrayList)object).clear();
            }
        }
        this.Cb();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void s7() {
        block10: {
            block11: {
                var1_1 = "Bag screen";
                var2_2 = "screenName";
                Intrinsics.checkNotNullParameter(var1_1, (String)var2_2);
                Intrinsics.checkNotNullParameter("low_inventory_on_cart", "eventName");
                Intrinsics.checkNotNullParameter("bag interaction", "category");
                var3_3 = "action";
                var4_4 = "cart_low_inventory";
                Intrinsics.checkNotNullParameter(var4_4, (String)var3_3);
                var5_5 = this.K0;
                if (var5_5 == 0) {
                    return;
                }
                var3_3 = this.w;
                if (var3_3 == null) break block11;
                var3_3 = this.T;
                Intrinsics.checkNotNullParameter(var1_1, (String)var2_2);
                try {
                    var2_2 = new ArrayList();
                    if (var3_3 != null) {
                        var3_3 = var3_3.iterator();
lbl20:
                        // 3 sources

                        while ((var6_6 = var3_3.hasNext()) != 0) {
                            break block10;
                        }
                    }
                    ** GOTO lbl36
                }
                catch (Exception v0) {
                    ** GOTO lbl24
                }
            }
lbl24:
            // 4 sources

            while (true) {
                this.K0 = false;
                return;
            }
        }
        var4_4 = var3_3.next();
        var7_7 = var4_4 instanceof CartEntry;
        if (!var7_7) ** GOTO lbl20
        {
            var2_2.add(var4_4);
            ** GOTO lbl20
lbl36:
            // 1 sources

            var5_5 = var2_2.isEmpty();
            if (var5_5 != 0) ** GOTO lbl24
            var2_2 = var2_2.iterator();
            var5_5 = -1 >>> 1;
            var6_6 = 0;
            var4_4 = null;
        }
        {
            while (var7_7 = var2_2.hasNext()) {
                var8_8 = var2_2.next();
                var8_8 = (CartEntry)var8_8;
                var9_9 = var8_8.getInventoryQty();
                var10_10 = var9_9.intValue();
                var11_11 = h40_0.a;
                var11_11 = z40_0.Companion;
                var12_12 = AJIOApplication.Companion;
                var12_12.getClass();
                var12_12 = AJIOApplication$a.a();
                var11_11.getClass();
                var11_11 = z40$a.a((Context)var12_12);
                var11_11 = var11_11.a;
                var12_12 = "maxLimitForShowLowInventoryLabel";
                var13_13 = var11_11.g((String)var12_12);
                if (var10_10 <= var13_13) {
                    ++var6_6;
                }
                if ((var10_10 = (var9_9 = var8_8.getInventoryQty()).intValue()) >= var5_5) continue;
                var3_3 = var8_8.getInventoryQty();
                var5_5 = var3_3.intValue();
            }
            var2_2 = new Bundle();
            var8_8 = "Number_of_item_with_low_inventory";
            var4_4 = String.valueOf(var6_6);
            var2_2.putString((String)var8_8, (String)var4_4);
            var4_4 = "lowest_inventory_value";
            var3_3 = String.valueOf(var5_5);
            var2_2.putString((String)var4_4, (String)var3_3);
            var3_3 = AnalyticsManager.Companion;
            var3_3 = var3_3.getInstance();
            var3_3 = var3_3.getGtmEvents();
            var4_4 = "low_inventory_on_cart";
            var8_8 = "bag interaction";
            var9_9 = "cart_low_inventory";
            var11_11 = new AnalyticsData$Builder();
            var2_2 = var11_11.bundle((Bundle)var2_2);
            var11_11 = var2_2.build();
            var2_2 = var3_3;
            var3_3 = var4_4;
            var4_4 = var8_8;
            var8_8 = var9_9;
            var9_9 = var11_11;
            var2_2.showXLeftInventoryEvent(var1_1, (String)var3_3, (String)var4_4, (String)var8_8, (AnalyticsData)var11_11);
            ** continue;
        }
    }

    public final void s9(String string2) {
        String string3 = "productCode";
        Intrinsics.checkNotNullParameter(string2, string3);
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            wx1_12 = null;
        }
        wx1_12.getClass();
        Intrinsics.checkNotNullParameter(string2, string3);
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushRemoveOOSItemClickEvent("Bag screen", "cart_oos_interactions", "cart interactions", "remove", string2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void sb(boolean var1_1) {
        block16: {
            block18: {
                block17: {
                    var2_2 = this;
                    var3_3 = this.L;
                    if (var3_3 != null) {
                        ai0_2.i((View)var3_3);
                    }
                    var4_4 = false;
                    var3_3 = null;
                    pa_1.a = false;
                    var2_2.O = false;
                    var5_5 = var2_2.t;
                    var6_6 = "cartViewModel";
                    if (var5_5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                        var7_7 = false;
                        var5_5 = null;
                    }
                    var5_5.m1 = null;
                    this.mb();
                    var5_5 = var2_2.L;
                    if (var5_5 != null) {
                        ai0_2.i((View)var5_5);
                    }
                    if ((var5_5 = var2_2.t) == null) break block16;
                    var5_5 = yn3_0.a;
                    var8_8 /* !! */  = new Object[]{};
                    var9_9 = "load cart data";
                    var5_5.a((String)var9_9, var8_8 /* !! */ );
                    if (!var1_1) {
                        this.Lb();
                    }
                    var10_10 = this.qb();
                    var11_11 = 3;
                    if (!var10_10) break block17;
                    var10_10 = ap_0.c();
                    if (var10_10) {
                        var8_8 /* !! */  = "load merge cart data";
                        var3_3 = new Object[]{};
                        var5_5.a((String)var8_8 /* !! */ , (Object[])var3_3);
                        var4_4 = ap_0.b();
                        if (var4_4) {
                            var3_3 = var2_2.t;
                            if (var3_3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                                var4_4 = false;
                                var3_3 = null;
                            }
                            var3_3.getClass();
                            var5_5 = md3_0.c((jD3)var3_3);
                            var6_6 = new nx1_1((wx1_1)var3_3, null);
                            Ae3.d((i90_0)var5_5, null, null, (Function2)var6_6, var11_11);
                        } else {
                            this.eb();
                        }
                    } else {
                        var3_3 = new Object[]{};
                        var5_5.a((String)var9_9, (Object[])var3_3);
                        this.tb();
                    }
                    break block16;
                }
                var8_8 /* !! */  = "load anonymous cart data";
                var9_9 = new Object[]{};
                var5_5.a((String)var8_8 /* !! */ , var9_9);
                var5_5 = this.getActivity();
                if (var5_5 == null || (var7_7 = (var5_5 = this.requireActivity()).isFinishing())) break block16;
                var7_7 = ap_0.c();
                if (!var7_7) break block18;
                var5_5 = var2_2.t;
                if (var5_5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                    var12_12 = null;
                } else {
                    var12_12 = var5_5;
                }
                var5_5 = var2_2.t;
                if (var5_5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                    var7_7 = false;
                    var5_5 = null;
                }
                var13_13 = var5_5.o1.e();
                var5_5 = var2_2.t;
                if (var5_5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                    var7_7 = false;
                    var5_5 = null;
                }
                var14_14 = var5_5.o1.f();
                var5_5 = var2_2.t;
                if (var5_5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                    var7_7 = false;
                    var5_5 = null;
                }
                var15_15 = var5_5.o1.d();
                cp_1.Companion.getClass();
                var16_16 = cp$a.i();
                var5_5 = h40_0.a;
                var7_7 = h40_0.d1();
                if (!var7_7) ** GOTO lbl-1000
                var5_5 = z40_0.Companion;
                var5_5 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var5_5).a;
                var6_6 = "employee_offer_restriction_enabled";
                var7_7 = var5_5.a((String)var6_6);
                if (var7_7) {
                    var4_4 = true;
                    var17_17 = true;
                } else lbl-1000:
                // 2 sources

                {
                    var17_17 = false;
                }
                var18_18 = h40_0.k2();
                var12_12.getClass();
                var3_3 = md3_0.c((jD3)var12_12);
                var19_19 = true;
                var5_5 = new fx1_0((wx1_1)var12_12, var13_13, var14_14, var15_15, var16_16, var17_17, var18_18, var19_19, null);
                Ae3.d((i90_0)var3_3, null, null, (Function2)var5_5, var11_11);
                break block16;
            }
            this.fb();
        }
    }

    public final void t1() {
        this.db();
    }

    public final void t4(Product object, ProductOptionItem object2) {
        int n3;
        Object object3 = this.u;
        String string2 = "closetViewModel";
        Object object4 = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object3 = null;
        }
        if ((n3 = ((ky1_0)object3).j()) != 0) {
            object3 = this.a;
            n3 = ((jo_2)object3).d();
            Object object5 = yn3_0.a;
            Object object6 = n3;
            int n4 = 1;
            Object object7 = new Object[n4];
            object7[0] = object6;
            ((yn3$a)object5).a("Bag Count%s", object7);
            object5 = "bag screen";
            object6 = "Added to Bag";
            if (n3 == 0) {
                object3 = AnalyticsManager.Companion;
                object7 = "Closet Button/Empty Cart";
                tj2_0.e((AnalyticsManager$Companion)object3, (String)object7, (String)object6, (String)object5);
            } else {
                object3 = AnalyticsManager.Companion;
                object7 = "Closet Button";
                tj2_0.e((AnalyticsManager$Companion)object3, (String)object7, (String)object6, (String)object5);
            }
            if (object2 != null) {
                object3 = ((ProductOptionItem)object2).getCode();
            } else {
                n3 = 0;
                object3 = null;
            }
            this.z0 = object3;
            object3 = this.u;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object3 = null;
            }
            Intrinsics.checkNotNull(object);
            object3.getClass();
            object5 = "<set-?>";
            Intrinsics.checkNotNullParameter(object, (String)object5);
            ((ky1_0)object3).r = object;
            object = object2 != null ? ((ProductOptionItem)object2).getCommercialType() : null;
            if (object2 != null && (object3 = ((ProductOptionItem)object2).getCode()) != null) {
                hv3_0.a.getClass();
                object2 = hv3_0.d((ProductOptionItem)object2);
                object5 = this.u;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object4 = object5;
                }
                if (object == null) {
                    object = "";
                }
                ((ky1_0)object4).e((String)object3, (String)object2, (String)object);
            }
        } else {
            object = this.q;
            if (object == null) {
                object = "loginListener";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object4 = object;
            }
            object = "source - cart";
            int n7 = 6;
            object4.z0(n7, (String)object);
        }
    }

    public final CartEarnPointData ta() {
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            wx1_12 = null;
        }
        return wx1_12.d1;
    }

    /*
     * Unable to fully structure code
     */
    public final void tb() {
        block8: {
            block7: {
                this.Lb();
                var1_1 = ap_0.b();
                if (!var1_1) break block7;
                var2_2 = this.t;
                var3_3 = "cartViewModel";
                if (var2_2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var3_3);
                    var4_4 = null;
                } else {
                    var4_4 = var2_2;
                }
                var2_2 = this.t;
                if (var2_2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var3_3);
                    var1_1 = false;
                    var2_2 = null;
                }
                var5_5 = var2_2.o1.e();
                var2_2 = this.t;
                if (var2_2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var3_3);
                    var1_1 = false;
                    var2_2 = null;
                }
                var6_6 = var2_2.o1.f();
                var2_2 = this.t;
                if (var2_2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var3_3);
                    var1_1 = false;
                    var2_2 = null;
                }
                var7_7 = var2_2.o1.d();
                cp_1.Companion.getClass();
                var8_8 = cp$a.i();
                var2_2 = h40_0.a;
                var1_1 = h40_0.d1();
                if (!var1_1) ** GOTO lbl-1000
                var2_2 = z40_0.Companion;
                var2_2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var2_2).a;
                var3_3 = "employee_offer_restriction_enabled";
                var1_1 = var2_2.a((String)var3_3);
                if (var1_1) {
                    var1_1 = true;
                    var9_9 = true;
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = false;
                    var2_2 = null;
                    var9_9 = false;
                }
                var10_10 = h40_0.k2();
                var4_4.getClass();
                var2_2 = md3_0.c(var4_4);
                var3_3 = new fx1_0(var4_4, var5_5, var6_6, var7_7, var8_8, var9_9, var10_10, false, null);
                var11_11 = 3;
                Ae3.d((i90_0)var2_2, null, null, (Function2)var3_3, var11_11);
                break block8;
            }
            this.eb();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void u0(CartEntry object, Boolean object2) {
        String string2;
        boolean bl2;
        Object object3;
        object2.getClass();
        this.Lb();
        Object object4 = Boolean.TRUE;
        boolean bl3 = Intrinsics.areEqual(object2, object4);
        object4 = bl3 ? "check" : "uncheck";
        Object object5 = object4;
        object4 = this.w;
        if (object4 != null) {
            object4 = ((wn_1)object4).c();
        } else {
            bl3 = false;
            object4 = null;
        }
        Bundle bundle = new Bundle();
        if (object != null && (object3 = ((CartEntry)object).getProduct()) != null) {
            object3 = ((Product)object3).getCode();
        } else {
            bl2 = false;
            object3 = null;
        }
        Object object6 = "product_id";
        bundle.putString((String)object6, (String)object3);
        object3 = "pincode";
        bundle.putString((String)object3, (String)object4);
        if (object != null && (object4 = ((CartEntry)object).getServicabilityInfo()) != null && (object4 = ((ServicabilityInfo)object4).getPriorityDelivery()) != null) {
            object3 = h40_0.a;
            bl2 = h40_0.O1();
            if (bl2) {
                object3 = ((ServicabilityInfo$PriorityDelivery)object4).getDeliveryDate();
                if (object3 != null) {
                    string2 = "yyyy-MM-dd";
                    object3 = k7.c((String)object3, "yyyyMMdd", string2);
                    object6 = "event_priority_delivery_edd";
                    bundle.putString((String)object6, (String)object3);
                }
                if ((object4 = ((ServicabilityInfo$PriorityDelivery)object4).getFee()) != null) {
                    double d2 = ((ServicabilityInfo$PriorityDelivery$Fee)object4).getValue();
                    object6 = "event_priority_delivery_fee";
                    bundle.putDouble((String)object6, d2);
                }
            }
        }
        object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object6 = "Priority delivery";
        string2 = "bag_interaction";
        Object object7 = "bag screen";
        Object object8 = "bag interactions";
        ((GTMEvents)object3).pushCartInteractionsEvent((String)object6, (String)object5, string2, (String)object7, (String)object8, bundle);
        object4 = this.t;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            bl3 = false;
            object4 = null;
        }
        object4.getClass();
        object3 = new JsonObject();
        object6 = new JsonArray();
        object5 = new JsonObject();
        object = object != null && (object = ((CartEntry)object).getProduct()) != null ? ((Product)object).getCode() : null;
        string2 = "skuId";
        ((JsonObject)object5).addProperty(string2, (String)object);
        object = "applied";
        ((JsonObject)object5).addProperty((String)object, (Boolean)object2);
        ((JsonArray)object6).add((JsonElement)object5);
        object2 = ((wx1_1)object4).S0;
        if (object2 != null && (object2 = ((Cart)object2).getEntries()) != null) {
            boolean bl4;
            object2 = ((ArrayList)object2).iterator();
            object5 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
            while (bl4 = object2.hasNext()) {
                String string3;
                object5 = (CartEntry)object2.next();
                if (object5 == null || (object7 = ((CartEntry)object5).getServicabilityInfo()) == null || (object7 = ((ServicabilityInfo)object7).getPriorityDelivery()) == null) continue;
                boolean bl5 = ((ServicabilityInfo$PriorityDelivery)object7).isApplied();
                object8 = ((CartEntry)object5).getCode();
                boolean bl6 = Intrinsics.areEqual(object8, string3 = ((CartEntry)object5).getCode());
                if (bl6 || !bl5) continue;
                object8 = new JsonObject();
                object5 = ((CartEntry)object5).getProduct().getCode();
                ((JsonObject)object8).addProperty(string2, (String)object5);
                object5 = bl5;
                ((JsonObject)object8).addProperty((String)object, (Boolean)object5);
                ((JsonArray)object6).add((JsonElement)object8);
            }
        }
        ((JsonObject)object3).add("applyPriorityDeliveryList", (JsonElement)object6);
        object = md3_0.c((jD3)object4);
        object2 = new tx1_1((wx1_1)object4, (JsonObject)object3, null);
        Ae3.d((i90_0)object, null, null, (Function2)object2, 3);
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
            object2 = (BannerAdViewModel)this.b1.getValue();
            ((BannerAdViewModel)object2).callBannerViewImpression((String)object);
        }
    }

    public final void ub(SaveForLaterResponse object, StringBuilder object2) {
        int n3;
        int n4;
        Object object3 = ((SaveForLaterResponse)object).getStatusCode();
        int n7 = 3;
        Object object4 = "";
        String string2 = "cartViewModel";
        Object object5 = null;
        if (object3 != null && (n4 = ((Integer)object3).intValue()) == 0) {
            int n8;
            int n10;
            object3 = ((SaveForLaterResponse)object).getStatus();
            if (object3 != null) {
                object3 = ((StatusNew)object3).getMessageDescription();
            } else {
                n10 = 0;
                object3 = null;
            }
            if (object3 != null && (n10 = ((String)object3).length()) != 0) {
                if ((object = ((SaveForLaterResponse)object).getStatus()) != null && (object = ((StatusNew)object).getMessageDescription()) != null) {
                    object4 = object;
                }
            } else {
                n8 = R$string.cart_add_to_closet_success_refresh;
                object4 = hv3_0.K(n8);
            }
            n8 = ((StringBuilder)object2).length();
            ((StringBuilder)object2).replace(0, n8, (String)object4);
            object = this.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n8 = 0;
                object = null;
            }
            if ((object = ((wx1_1)object).a1.getProduct().getBaseProduct()) != null) {
                object = this.t;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n8 = 0;
                    object = null;
                }
                if ((object = ((wx1_1)object).a1.getBasePrice()) != null) {
                    object = this.t;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n8 = 0;
                        object = null;
                    }
                    if ((object = ((wx1_1)object).a1.getBasePrice().getValue()) != null) {
                        object = this.t;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n8 = 0;
                            object = null;
                        }
                        if ((object2 = this.t) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            object2 = null;
                        }
                        object2 = ((wx1_1)object2).a1.getProduct().getBaseProduct();
                        Intrinsics.checkNotNull(object2);
                        object3 = this.t;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n10 = 0;
                            object3 = null;
                        }
                        object3 = ((wx1_1)object3).a1.getBasePrice().getValue();
                        Intrinsics.checkNotNull(object3);
                        object.getClass();
                        Intrinsics.checkNotNullParameter(object2, "baseProduct");
                        Intrinsics.checkNotNullParameter(object3, "value");
                        object = md3_0.c((jD3)object);
                        object4 = new sx1_2((String)object2, (String)object3, null);
                        Ae3.d((i90_0)object, null, null, (Function2)object4, n7);
                    }
                }
            }
            if ((object = this.w) != null) {
                object = this.t;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n8 = 0;
                    object = null;
                }
                object = ((wx1_1)object).a1.getProduct();
                wn_1.d((Product)object);
            }
            if ((object = this.p) == null) {
                object = "cartClosetListener";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object5 = object;
            }
            object5.updateCartWishCount();
        } else if (object3 != null && (n3 = ((Integer)object3).intValue()) == n7) {
            int n14;
            object3 = ((SaveForLaterResponse)object).getStatus();
            if (object3 != null) {
                object3 = ((StatusNew)object3).getMessageDescription();
            } else {
                n3 = 0;
                object3 = null;
            }
            if (object3 != null && (n3 = ((String)object3).length()) != 0) {
                if ((object = ((SaveForLaterResponse)object).getStatus()) != null && (object = ((StatusNew)object).getMessageDescription()) != null) {
                    object4 = object;
                }
            } else {
                n14 = R$string.cart_already_part_of_closet_refresh;
                object4 = hv3_0.K(n14);
            }
            n14 = ((StringBuilder)object2).length();
            ((StringBuilder)object2).replace(0, n14, (String)object4);
            object = this.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n14 = 0;
                object = null;
            }
            if ((object = ((wx1_1)object).S0) != null) {
                object = FirebaseEvents.Companion.getInstance();
                object2 = this.t;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    object2 = null;
                }
                object2 = ((wx1_1)object2).a1;
                object3 = this.t;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object3 = null;
                }
                if ((object3 = ((wx1_1)object3).S0) != null) {
                    object3 = ((Cart)object3).getAppliedVouchers();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                Object object6 = this.t;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n7 = 0;
                    object6 = null;
                }
                if ((object6 = ((wx1_1)object6).S0) != null) {
                    object6 = ((Cart)object6).getAppliedProductPromotions();
                } else {
                    n7 = 0;
                    object6 = null;
                }
                object4 = "add_to_wishlist";
                ((FirebaseEvents)object).pushCartEvent((String)object4, (CartEntry)object2, (List)object3, (ArrayList)object6);
                object = this.w;
                if (object != null) {
                    object = this.t;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object5 = object;
                    }
                    object = ((wx1_1)object5).a1.getProduct();
                    wn_1.d((Product)object);
                }
            }
        } else {
            int n15 = ((StringBuilder)object2).length();
            n3 = R$string.cart_add_to_closet_error;
            object3 = hv3_0.K(n3);
            ((StringBuilder)object2).replace(0, n15, (String)object3);
        }
    }

    public final void vb(StringBuilder object) {
        Object[] objectArray;
        int n3;
        Object object2;
        int n4 = R$string.cart_item_removed_success_refresh;
        Object object3 = hv3_0.K(n4);
        int n7 = ((StringBuilder)object).length();
        ((StringBuilder)object).replace(0, n7, (String)object3);
        object = this.t;
        object3 = "cartViewModel";
        n7 = 0;
        ProductsList productsList = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        if ((object2 = this.t) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n3 = 0;
            object2 = null;
        }
        if ((object2 = ((wx1_1)object2).b1.getProduct()) != null) {
            object2 = ((Product)object2).getCode();
        } else {
            n3 = 0;
            object2 = null;
        }
        object.getClass();
        if (object2 != null) {
            object = md3_0.c((jD3)object);
            objectArray = new xx1_1((String)object2, null);
            n3 = 3;
            Ae3.d((i90_0)object, null, null, (Function2)objectArray, n3);
        }
        if ((object = this.t) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        if ((object2 = this.t) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n3 = 0;
            object2 = null;
        }
        object2 = ((wx1_1)object2).b1;
        object.getClass();
        CartRepo.INSTANCE.sendCartItemRemovedEvent((CartEntry)object2);
        object = yn3_0.a;
        object2 = "closet delete ga event sent";
        objectArray = new Object[]{};
        ((yn3$a)object).a((String)object2, objectArray);
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        if ((object3 = this.x) != null) {
            productsList = ((om_1)object3).a;
        }
        ((wx1_1)object).b(productsList, false);
    }

    public final void wb() {
        lm_2 lm_22 = new lm_2();
        Intrinsics.checkNotNullParameter(this, "cartAddressCallBackListener");
        lm_22.S = this;
        Object object = this.w;
        Object object2 = "";
        if (object != null && (object = ((wn_1)object).a.S0) != null && (object = ((Cart)object).getPinCode()) != null) {
            object2 = object;
        }
        Intrinsics.checkNotNullParameter(object2, "preFillPinCode");
        lm_22.R = object2;
        object = this.requireActivity().getSupportFragmentManager();
        lm_22.show((FragmentManager)object, "CartAddAddressBottomSheet");
    }

    public final void x4(Product object, String string2, boolean bl2) {
        Object object2 = this.getActivity();
        if (object2 != null && !(bl2 = (object2 = this.requireActivity()).isFinishing()) && object != null && string2 != null && (bl2 = string2.length())) {
            object2 = this.m;
            Object object3 = null;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                bl2 = false;
                object2 = null;
            }
            object2.startLoader();
            object2 = this.u;
            String string3 = "closetViewModel";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                object2 = null;
            }
            object2 = ((ky1_0)object2).i;
            ((BH3)object2).b = object;
            if ((object = ((Product)object).getSourceStoreId()) == null) {
                object = ld3_2.STORE_AJIO.getStoreId();
            }
            if ((object2 = this.u) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                object3 = object2;
            }
            object2 = "similar products widget";
            ((ky1_0)object3).f(string2, (String)object, (String)object2);
        }
    }

    public final CartDeliveryAddress x6() {
        int n3;
        ex1_0 ex1_02 = this;
        Object object = this.t;
        String string2 = "cartViewModel";
        CartDeliveryAddress cartDeliveryAddress = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        if ((object = ((wx1_1)object).S0) != null) {
            object = ((Cart)object).getDeliveryAddress();
        } else {
            n3 = 0;
            object = null;
        }
        boolean bl2 = h40_0.Q1();
        if (bl2) {
            Object object2;
            Object object3;
            Object object4;
            int n4;
            Object object5 = ex1_02.a;
            Object object6 = ((jo_2)object5).l();
            if (object6 == null) {
                object6 = ((jo_2)object5).m();
                if (object6 != null && (n4 = object6.length()) != 0) {
                    if (object != null) {
                        object6 = ((jo_2)object5).m();
                        ((CartDeliveryAddress)object).setPostalCode((String)object6);
                    }
                    ex1_02.d1 = object;
                    object6 = ex1_02.t;
                    if (object6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n4 = 0;
                        object6 = null;
                    }
                    if ((object6 = ((wx1_1)object6).S0) != null) {
                        ((Cart)object6).setDeliveryAddress((CartDeliveryAddress)object);
                    }
                }
            } else {
                object4 = object6 != null ? ((CartDeliveryAddress)object6).getAddressType() : null;
                if (object4 == (object3 = AddressType.Pincode)) {
                    object4 = ((CartDeliveryAddress)object6).getPostalCode();
                    if (object != null) {
                        object = ((CartDeliveryAddress)object).getPostalCode();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    n3 = Intrinsics.areEqual(object4, object);
                    if (n3 == 0) {
                        ex1_02.d1 = object6;
                        object = ex1_02.t;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n3 = 0;
                            object = null;
                        }
                        if ((object = ((wx1_1)object).S0) != null) {
                            ((Cart)object).setDeliveryAddress((CartDeliveryAddress)object6);
                        }
                    }
                } else {
                    object = ((jo_2)object5).l();
                    if (object != null) {
                        object = ((CartDeliveryAddress)object).getPostalCode();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    if (object != null && (n3 = object.length()) != 0) {
                        ex1_02.d1 = object = ((jo_2)object5).l();
                        object6 = ex1_02.t;
                        if (object6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n4 = 0;
                            object6 = null;
                        }
                        if ((object6 = ((wx1_1)object6).S0) != null) {
                            ((Cart)object6).setDeliveryAddress((CartDeliveryAddress)object);
                        }
                    }
                }
            }
            if ((object = ex1_02.d1) != null) {
                object = ((CartDeliveryAddress)object).getFormattedAddress();
            } else {
                n3 = 0;
                object = null;
            }
            object = String.valueOf(object);
            object5 = ((jo_2)object5).m();
            n4 = ((String)object).length();
            object4 = "default_address";
            if (n4 > 0) {
                object5 = DE.a();
                object5.putString((String)object4, (String)object);
                object2 = object5;
            } else if (object5 != null && (n3 = ((String)object5).length()) > 0) {
                object = DE.a();
                object.putString((String)object4, (String)object5);
                object2 = object;
            } else {
                object2 = null;
            }
            object = ex1_02.k;
            String string3 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
            String string4 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
            object3 = ex1_02.l;
            String string5 = "address interaction";
            String string6 = "address_loaded";
            String string7 = "";
            String string8 = "address_loaded";
            String string9 = "bag screen";
            String string10 = "bag screen";
            int n7 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string5, string6, string7, string8, string9, string10, string3, (Bundle)object2, string4, false, null, n7, null);
            object = ex1_02.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            if ((object = ((wx1_1)object).S0) != null) {
                cartDeliveryAddress = ((Cart)object).getDeliveryAddress();
            }
            return cartDeliveryAddress;
        }
        object = ex1_02.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        if ((object = ((wx1_1)object).S0) != null) {
            object = ((Cart)object).getDeliveryAddress();
        } else {
            n3 = 0;
            object = null;
        }
        ex1_02.d1 = object;
        object = ex1_02.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        if ((object = ((wx1_1)object).S0) != null) {
            cartDeliveryAddress = ((Cart)object).getDeliveryAddress();
        }
        return cartDeliveryAddress;
    }

    public final void xb() {
        CartAddressListBottomSheet cartAddressListBottomSheet;
        Object object = this.w;
        Object object2 = "";
        object = object != null ? ((wn_1)object).c() : object2;
        Object object3 = this.t;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            object3 = null;
        }
        if ((object3 = ((wx1_1)object3).S0) == null || (object3 = ((Cart)object3).getConvenienceFee()) == null || (object3 = ((ConvenienceFee)object3).getPriorityDelivery()) == null || (object3 = ((AmountData)object3).getNetAmount()) == null || (object3 = ((Price)object3).getValue()) == null) {
            object3 = object2;
        }
        this.X0 = cartAddressListBottomSheet = new CartAddressListBottomSheet();
        String string2 = "cartAddressCallBackListener";
        Intrinsics.checkNotNullParameter(this, string2);
        cartAddressListBottomSheet.u = this;
        cartAddressListBottomSheet = this.X0;
        if (cartAddressListBottomSheet != null) {
            Intrinsics.checkNotNullParameter(object, "deliveryPincode");
            string2 = "priorityDeliveryFee";
            Intrinsics.checkNotNullParameter(object3, string2);
            cartAddressListBottomSheet.E = object;
            cartAddressListBottomSheet.F = object3;
        }
        if ((object = this.X0) != null) {
            object = this.w;
            if (object != null && (object = ((wn_1)object).a.S0) != null && (object = ((Cart)object).getPinCode()) != null) {
                object2 = object;
            }
            object = "preFillPinCode";
            Intrinsics.checkNotNullParameter(object2, (String)object);
        }
        if ((object = this.X0) != null) {
            object2 = this.requireActivity().getSupportFragmentManager();
            object3 = "CartAddressFragment";
            ((DialogFragment)object).show((FragmentManager)object2, (String)object3);
        }
    }

    public final void y1(int n3) {
        Object object = this.S;
        if (object != null && (object = ((bo_1)object).m) != null && (object = ((op_2)object).i) != null) {
            ((RecyclerView$f)object).notifyItemChanged(n3);
        }
    }

    public final void y2(String object, ArrayList object2) {
        boolean bl2;
        if (object2 != null && !(bl2 = object2.isEmpty())) {
            Object object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            Object object4 = "More Offers";
            String string2 = "Offer Link";
            ((GTMEvents)object3).pushButtonTapEvent((String)object4, string2, "bag screen");
            Object object5 = this.requireContext();
            this.y0 = object3 = new BottomSheetDialog((Context)object5);
            int n3 = 1;
            object3.requestWindowFeature(n3);
            object3 = this.y0;
            if (object3 != null) {
                n3 = R$layout.offers_btmsheet_layout;
                ((BottomSheetDialog)object3).setContentView(n3);
            }
            object3 = this.y0;
            n3 = 0;
            object5 = null;
            if (object3 != null) {
                int n4 = R$id.cancelBtn;
                object3 = ((on)object3).findViewById(n4);
            } else {
                bl2 = false;
                object3 = null;
            }
            object4 = this.y0;
            if (object4 != null) {
                n3 = R$id.offer_list;
                object5 = (RecyclerView)((on)object4).findViewById(n3);
            }
            if (object5 != null) {
                string2 = this.getContext();
                object4 = new WrapperLinearLayoutManager((Context)string2);
                ((RecyclerView)object5).setLayoutManager((RecyclerView$o)object4);
            }
            if (object5 != null) {
                object4 = new n62_0((List)object2, (String)object, this);
                ((RecyclerView)object5).setAdapter((RecyclerView$f)object4);
            }
            if ((object = this.y0) != null) {
                object2 = new tw1_0(this);
                object.setOnShowListener((DialogInterface.OnShowListener)object2);
            }
            if (object3 != null) {
                object = new uw1_0(this);
                object3.setOnClickListener((View.OnClickListener)object);
            }
            if ((object = this.y0) != null) {
                object.show();
            }
        }
    }

    public final void y7(int n3) {
        wx1_1 wx1_12 = this.t;
        if (wx1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            wx1_12 = null;
        }
        wx1_12.getClass();
        wx1_12 = new Bundle();
        String string2 = String.valueOf(n3);
        wx1_12.putString("show_similar_count", string2);
        GTMEvents gTMEvents = AnalyticsManager.Companion.getInstance().getGtmEvents();
        AnalyticsData analyticsData = ne_0.b((Bundle)wx1_12);
        gTMEvents.onSimilarItemsLoaded("Bag screen", "cart_oos_interactions", "cart interactions", "view of show similar on bag", analyticsData);
    }

    public final void z8(CartDeliveryAddress object) {
        Intrinsics.checkNotNullParameter(object, "address");
        Object object2 = this.X0;
        if (object2 != null) {
            ((BottomSheetDialogFragment)object2).dismissAllowingStateLoss();
        }
        this.c1 = object2 = ((CartDeliveryAddress)object).getPostalCode();
        this.d1 = object;
        this.e1 = true;
        object2 = AddressType.Address;
        ((CartDeliveryAddress)object).setAddressType((AddressType)((Object)object2));
        object2 = this.a;
        ((jo_2)object2).F((CartDeliveryAddress)object);
        String string2 = this.c1;
        ((jo_2)object2).G(string2);
        object = ((CartDeliveryAddress)object).getId().toString();
        this.loadCartBasedOnSelectedAddress("", (String)object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zb() {
        block39: {
            var1_1 = this;
            var2_2 = this.t;
            var3_3 = null;
            if (var2_2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
                var4_4 = 0;
                var2_2 = null;
            }
            if ((var2_2 = var2_2.S0) != null) {
                var2_2 = var2_2.getEntries();
            } else {
                var4_4 = 0;
                var2_2 = null;
            }
            if (var2_2 == null || (var4_4 = var1_1.J0) == 0) break block39;
            var4_4 = 0;
            var2_2 = null;
            var1_1.J0 = false;
            var5_5 = var1_1.w;
            var6_6 = "contains_store";
            var7_7 = "";
            if (var5_5 != null) {
                var8_8 = var5_5.a;
                var9_9 = lp_0.b(var8_8.T0);
                var10_10 = lp_0.c(var8_8.T0);
                var11_11 /* !! */  = var8_8.S0;
                var11_11 /* !! */  = var11_11 /* !! */  != null ? var11_11 /* !! */ .getEntries() : null;
                var11_11 /* !! */  = lp_0.b(var11_11 /* !! */ );
                var12_12 = var8_8.S0;
                var12_12 = var12_12 != null ? var12_12.getEntries() : null;
                var12_12 = lp_0.c((ArrayList)var12_12);
                var13_13 /* !! */  = new Bundle();
                var14_14 = var5_5.b.getSV_EP_OOS_SKU();
                var13_13 /* !! */ .putString((String)var14_14, (String)var9_9);
                var8_8 = var8_8.S0;
                if (var8_8 == null || (var8_8 = var8_8.getAge()) == null) {
                    var8_8 = var7_7;
                }
                var14_14 = "cart_age";
                var13_13 /* !! */ .putString((String)var14_14, (String)var8_8);
                var8_8 = od3_2.a();
                var13_13 /* !! */ .putString((String)var6_6, (String)var8_8);
                var8_8 = ",";
                if (var9_9 != null && (var15_15 = var9_9.length()) != 0) {
                    if (var11_11 /* !! */  != null && (var15_15 = var11_11 /* !! */ .length()) != 0) {
                        var9_9 = n1.a((String)var11_11 /* !! */ , (String)var8_8, (String)var9_9);
                    }
                    var16_16 = var9_9;
                } else {
                    var16_16 = var11_11 /* !! */ ;
                }
                if (var10_10 != null && (var17_17 = var10_10.length()) != 0) {
                    if (var12_12 != null && (var17_17 = var12_12.length()) != 0) {
                        var10_10 = n1.a((String)var12_12, (String)var8_8, (String)var10_10);
                    }
                    var18_18 = var10_10;
                } else {
                    var18_18 = var12_12;
                }
                var8_8 = AnalyticsManager.Companion;
                var19_19 = bv_0.a((AnalyticsManager$Companion)var8_8);
                var20_20 = cv_0.a((AnalyticsManager$Companion)var8_8);
                var21_21 = 1536;
                var14_14 = var5_5.b;
                var22_22 = "bag interactions - item age";
                var5_5 = "bag_interaction";
                var23_23 = "bag screen";
                var24_24 = "bag screen";
                var8_8 = var13_13 /* !! */ ;
                var13_13 /* !! */  = var5_5;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var14_14, (String)var22_22, (String)var16_16, (String)var18_18, (String)var5_5, var23_23, var24_24, var19_19, (Bundle)var8_8, var20_20, false, null, var21_21, null);
            }
            if ((var5_5 = var1_1.w) == null) break block39;
            var8_8 = new Bundle();
            var9_9 = var5_5.a;
            var10_10 = var9_9.T0;
            var25_25 = var10_10.isEmpty() ^ 1;
            var10_10 = var25_25 == 0 && (var25_25 = (var10_10 = var9_9.U0).isEmpty() ^ 1) == 0 && (var25_25 = var9_9.i1) == 0 ? var7_7 : "OutOfStock";
            var11_11 /* !! */  = var5_5.b;
            var12_12 = var11_11 /* !! */ .getSV_EP_CTA_DISABLE();
            var8_8.putString((String)var12_12, (String)var10_10);
            var10_10 = var9_9.S0;
            if (var10_10 != null) {
                var10_10 = var10_10.getAppliedProductPromotions();
            } else {
                var25_25 = 0;
                var10_10 = null;
                var26_26 = 0.0f;
            }
            if (var10_10 == null) ** GOTO lbl-1000
            var10_10 = var9_9.S0;
            if (var10_10 != null && (var10_10 = var10_10.getAppliedProductPromotions()) != null && (var10_10 = (CartPromotion)var10_10.get(0)) != null) {
                var10_10 = var10_10.getVoucherMessages();
            } else {
                var25_25 = 0;
                var10_10 = null;
                var26_26 = 0.0f;
            }
            if (var10_10 != null) {
                var10_10 = var11_11 /* !! */ .getSV_EP_PROMO_PRE_APLD();
                var12_12 = var9_9.S0;
                var12_12 = var12_12 != null && (var12_12 = var12_12.getAppliedProductPromotions()) != null && (var12_12 = (CartPromotion)var12_12.get(0)) != null ? var12_12.getDescription() : null;
                var8_8.putString((String)var10_10, (String)var12_12);
                var10_10 = var11_11 /* !! */ .getSV_EP_PROMO_MSG();
                var12_12 = var9_9.S0;
                var12_12 = var12_12 != null && (var12_12 = var12_12.getAppliedProductPromotions()) != null && (var12_12 = (CartPromotion)var12_12.get(0)) != null ? var12_12.getVoucherMessages() : null;
                var8_8.putString((String)var10_10, (String)var12_12);
            } else lbl-1000:
            // 2 sources

            {
                var10_10 = var11_11 /* !! */ .getSV_EP_PROMO_PRE_APLD();
                var12_12 = "NA";
                var8_8.putString((String)var10_10, (String)var12_12);
                var10_10 = var11_11 /* !! */ .getSV_EP_PROMO_MSG();
                var8_8.putString((String)var10_10, (String)var12_12);
            }
            var10_10 = var5_5.c();
            var12_12 = "pincode";
            var8_8.putString((String)var12_12, (String)var10_10);
            var10_10 = var9_9.S0;
            if (var10_10 != null && (var10_10 = var10_10.getConvenienceFee()) != null && (var10_10 = var10_10.getPriorityDelivery()) != null && (var10_10 = var10_10.getNetAmount()) != null && (var10_10 = var10_10.getValue()) != null) {
                var12_12 = "event_priority_delivery_fee";
                var8_8.putString((String)var12_12, (String)var10_10);
            }
            if ((var10_10 = var9_9.S0) != null && (var10_10 = var10_10.getEntries()) != null) {
                var25_25 = var10_10.size();
            } else {
                var25_25 = 0;
                var26_26 = 0.0f;
                var10_10 = null;
            }
            var12_12 = var9_9.T0;
            var15_15 = var12_12.size() + var25_25;
            var8_8.putInt("item_count", var15_15);
            var25_25 = var12_12.size();
            var14_14 = "oos_count";
            var8_8.putInt((String)var14_14, var25_25);
            var10_10 = var9_9.S0;
            if (var10_10 != null && (var10_10 = var10_10.getDeliveryCost()) != null) {
                var10_10 = var10_10.getValue();
            } else {
                var25_25 = 0;
                var10_10 = null;
                var26_26 = 0.0f;
            }
            var27_27 = 0.0;
            if (var10_10 != null) {
                var10_10 = var9_9.S0;
                if (var10_10 != null && (var10_10 = var10_10.getDeliveryCost()) != null && (var10_10 = var10_10.getValue()) != null) {
                    var10_10 = je3_2.d((String)var10_10);
                } else {
                    var25_25 = 0;
                    var10_10 = null;
                    var26_26 = 0.0f;
                }
                if (var10_10 != null) {
                    var29_28 = var10_10.doubleValue();
                    var10_10 = var11_11 /* !! */ .getSHIPPING_CHARGES();
                    var8_8.putDouble((String)var10_10, var29_28);
                }
            } else {
                var10_10 = var11_11 /* !! */ .getSHIPPING_CHARGES();
                var8_8.putDouble((String)var10_10, var27_27);
            }
            if ((var10_10 = var9_9.S0) != null && (var10_10 = var10_10.getTotalSaving()) != null && (var10_10 = var10_10.getValue()) != null) {
                var29_28 = Double.parseDouble((String)var10_10);
                var10_10 = "total_savings";
                var8_8.putDouble((String)var10_10, var29_28);
            }
            if ((var10_10 = var9_9.S0) != null) {
                var26_26 = var10_10.getBagTotal();
                var27_27 = var26_26;
            }
            var8_8.putDouble("bag_total", var27_27);
            var10_10 = var9_9.S0;
            if (var10_10 != null && (var10_10 = var10_10.getTotalPriceWithTax()) != null && (var10_10 = var10_10.getValue()) != null) {
                var10_10 = je3_2.d((String)var10_10);
            } else {
                var25_25 = 0;
                var10_10 = null;
                var26_26 = 0.0f;
            }
            if (var10_10 != null) {
                var27_27 = var10_10.doubleValue();
                var8_8.putDouble("amount_payable", var27_27);
                var8_8.putDouble("cart_value", var27_27);
                var10_10 = "ecomm_total_value";
                var8_8.putDouble((String)var10_10, var27_27);
            }
            if ((var10_10 = var9_9.S0) != null && (var10_10 = var10_10.getVoucherAmount()) != null && (var10_10 = var10_10.getValue()) != null && (var10_10 = je3_2.d((String)var10_10)) != null) {
                var27_27 = var10_10.doubleValue();
                var10_10 = "coupon_savings";
                var8_8.putDouble(var10_10, var27_27);
            }
            if ((var10_10 = var9_9.S0) != null && (var10_10 = var10_10.getAge()) != null) {
                var14_14 = var11_11 /* !! */ .getSV_EP_AGE();
                var8_8.putString((String)var14_14, (String)var10_10);
            }
            var10_10 = var11_11 /* !! */ .getSV_EP_OOS_SKU();
            var11_11 /* !! */  = lp_0.b((ArrayList)var12_12);
            var8_8.putString((String)var10_10, (String)var11_11 /* !! */ );
            var8_8.putString("ecomm_pageType", "cart");
            var10_10 = new ArrayList();
            var11_11 /* !! */  = new ArrayList<Object>();
            var12_12 = var9_9.S0;
            if (var12_12 != null && (var12_12 = var12_12.getEntries()) != null) {
                var12_12 = var12_12.iterator();
                while ((var15_15 = (int)var12_12.hasNext()) != 0) {
                    var14_14 = ((CartEntry)var12_12.next()).getProduct();
                    if (var14_14 == null) continue;
                    var22_22 = var14_14.getCode();
                    if (var22_22 == null) {
                        var22_22 = var7_7;
                    }
                    var10_10.add(var22_22);
                    var11_11 /* !! */ .add(var14_14);
                }
            }
            var7_7 = new Gson();
            var7_7 = var7_7.toJson(var10_10);
            var10_10 = "ecomm_prodid";
            var8_8.putString((String)var10_10, (String)var7_7);
            var7_7 = od3_2.a();
            var8_8.putString((String)var6_6, (String)var7_7);
            var6_6 = var9_9.S0;
            if (var6_6 != null) {
                var4_4 = var6_6.getTotalUnitCount();
            }
            var6_6 = "number_of_items_on_cart";
            var8_8.putInt((String)var6_6, var4_4);
            var2_2 = el1_2.a;
            var2_2 = "products";
            Intrinsics.checkNotNullParameter(var11_11 /* !! */ , (String)var2_2);
            var4_4 = (int)el1_2.j();
            if (var4_4 != 0) {
                var2_2 = el1_2.b;
                var6_6 = new hl1_2(var11_11 /* !! */ , null);
                var31_29 = 3;
                Ae3.d((i90_0)var2_2, null, null, (Function2)var6_6, var31_29);
            }
            var5_5.b((Bundle)var8_8);
            var2_2 = AnalyticsManager.Companion;
            var3_3 = "bag screen";
            vb0_0.a((AnalyticsManager$Companion)var2_2, var3_3, (Bundle)var8_8);
        }
    }
}

