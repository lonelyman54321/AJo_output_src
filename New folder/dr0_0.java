/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Message
 *  org.json.JSONObject
 */
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.common.f;
import androidx.navigation.e;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.fleek.FleekQueryParameters;
import com.ril.ajio.services.data.fleek.FleekSesConfigs$Triggers;
import com.ril.ajio.services.data.fleek.brand_page.BrandPageModel;
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import com.ril.ajio.services.data.fleek.explore_brands.ExploreBrandsPageModel;
import com.ril.ajio.services.data.fleek.explore_brands.Layout;
import com.ril.ajio.services.data.fleek.explore_brands.Resource;
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.FeedEngineData;
import com.ril.ajio.services.data.fleek.feedModel.FnlColorVariantData;
import com.ril.ajio.services.data.fleek.feedModel.Media;
import com.ril.ajio.services.data.fleek.feedModel.Metadata;
import com.ril.ajio.services.data.fleek.feedModel.OfferPrice;
import com.ril.ajio.services.data.fleek.feedModel.PostData;
import com.ril.ajio.services.data.fleek.feedModel.Price;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import com.ril.ajio.services.data.fleek.feedModel.WasPriceData;
import com.ril.ajio.services.data.fleek.seen_components.FleekSeenComponents;
import com.ril.ajio.services.data.fleek.seen_components.SesActionApiRequestBody;
import com.ril.ajio.services.data.fleek.seen_components.SesActionContent;
import com.ril.ajio.services.data.fleek.seen_components.ShareActionItem;
import com.ril.ajio.services.data.fleek.seen_components.ShareActionRequestBody;
import com.ril.ajio.services.data.user.UserInformation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.a;
import kotlin.time.a$a;
import kotlin.time.b;
import org.json.JSONObject;

/*
 * Renamed from DR0
 */
public final class dr0_0
extends jD3
implements t13_0 {
    public static final DR0$a Companion;
    public static final int R0;
    public static final int S0;
    public static final int T0;
    public final ParcelableSnapshotMutableState A;
    public final BH3 A0;
    public final ParcelableSnapshotMutableState B;
    public boolean B0;
    public final ParcelableSnapshotMutableState C;
    public final ParcelableSnapshotMutableState C0;
    public FeedEngineData D;
    public final ParcelableSnapshotMutableState D0;
    public final ParcelableSnapshotMutableState E;
    public final zr1_1 E0;
    public final ParcelableSnapshotMutableState F;
    public final p83_0 F0;
    public final ParcelableSnapshotMutableState G;
    public final t30_0 G0;
    public final ParcelableSnapshotMutableState H;
    public boolean H0;
    public final ParcelableSnapshotMutableState I;
    public final ParcelableSnapshotMutableState I0;
    public final ParcelableSnapshotMutableState J;
    public final ParcelableSnapshotMutableState J0;
    public final kb3_2 K;
    public final ParcelableSnapshotMutableState K0;
    public final kb3_2 L;
    public final kb3_2 L0;
    public String M;
    public final ge2_2 M0;
    public boolean N;
    public final es0_2 N0;
    public final ParcelableSnapshotMutableState O;
    public boolean O0;
    public final ParcelableSnapshotMutableState P;
    public final DR0$h P0;
    public final ParcelableSnapshotMutableState Q;
    public final ArrayList Q0;
    public final i23_0 R;
    public final ee2_2 S;
    public final i23_0 T;
    public final ee2_2 U;
    public final ParcelableSnapshotMutableState X;
    public final ParcelableSnapshotMutableState Y;
    public boolean Z;
    public final xr0_2 a;
    public final f b;
    public final ParcelableSnapshotMutableState c;
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;
    public final ParcelableSnapshotMutableState f;
    public final ParcelableSnapshotMutableState g;
    public final ParcelableSnapshotMutableState h;
    public final ParcelableSnapshotMutableState i;
    public final ParcelableSnapshotMutableState j;
    public final ParcelableSnapshotMutableState k;
    public boolean k0;
    public final ParcelableSnapshotMutableState l;
    public final ParcelableSnapshotMutableState m;
    public double n;
    public int o;
    public final zr1_1 p;
    public int p0;
    public String q;
    public ArrayList q0;
    public final ParcelableSnapshotMutableState r;
    public final ArrayList r0;
    public final ParcelableSnapshotMutableState s;
    public List s0;
    public final zr1_1 t;
    public final ArrayList t0;
    public final zr1_1 u;
    public ArrayList u0;
    public String v;
    public boolean v0;
    public boolean w;
    public final Ko w0;
    public final LinkedHashMap x;
    public final jo_2 x0;
    public final LinkedHashMap y;
    public final kb3_2 y0;
    public final ParcelableSnapshotMutableState z;
    public final hh3_2 z0;

    static {
        Object object = new Object();
        Companion = object;
        object = h40_0.a;
        object = z40_0.Companion;
        R0 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.g("fleek_feed_pagination_page_size");
        S0 = z40$a.a((Context)AJIOApplication$a.a()).a.g("fleek_stories_pagination_page_size");
        T0 = z40$a.a((Context)AJIOApplication$a.a()).a.g("fleek_brand_directory_page_size");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public dr0_0(xr0_2 xr0_22, f f5) {
        ArrayList arrayList;
        DR0$h dR0$h;
        long l2;
        void var10_67;
        t30_0 t30_02;
        p83_0 p83_02;
        zr1_1 zr1_12;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2;
        BH3 bH3;
        hh3_2 hh3_22;
        zr0_1 zr0_12;
        kb3_2 kb3_22;
        ee2_2 ee2_22;
        i23_0 i23_02;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState3;
        Object object;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState4;
        kb3_2 kb3_23;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState5;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState6;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState7;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState8;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState9;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        int n3;
        String string2;
        zr1_1 zr1_13;
        zr1_1 zr1_14;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState10;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState11;
        zr1_1 zr1_15;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState12;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState13;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState14;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState15;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState16;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState17;
        dr0_0 dr0_02 = this;
        xr0_2 xr0_23 = xr0_22;
        Object object2 = f5;
        Intrinsics.checkNotNullParameter(xr0_22, "fleekUseCase");
        Intrinsics.checkNotNullParameter(f5, "player");
        this.a = xr0_22;
        this.b = f5;
        f5.prepare();
        int n4 = 0;
        Object var4_5 = null;
        object2 = 0;
        this.c = parcelableSnapshotMutableState17 = J83.g(object2);
        Boolean bl2 = Boolean.FALSE;
        this.d = parcelableSnapshotMutableState16 = J83.g(bl2);
        hv1_1 hv1_12 = hv1_1.IDLE;
        this.e = parcelableSnapshotMutableState15 = J83.g((Object)hv1_12);
        this.f = parcelableSnapshotMutableState15 = J83.g(object2);
        this.g = parcelableSnapshotMutableState15 = J83.g(bl2);
        this.h = parcelableSnapshotMutableState15 = J83.g((Object)hv1_12);
        this.i = parcelableSnapshotMutableState15 = J83.g(object2);
        this.j = parcelableSnapshotMutableState15 = J83.g(bl2);
        this.k = parcelableSnapshotMutableState14 = J83.g((Object)hv1_12);
        this.l = parcelableSnapshotMutableState13 = J83.g(bl2);
        this.m = parcelableSnapshotMutableState12 = J83.g(bl2);
        this.o = 101;
        parcelableSnapshotMutableState15 = null;
        super(null);
        this.p = zr1_15;
        this.r = parcelableSnapshotMutableState11 = J83.g(bl2);
        this.s = parcelableSnapshotMutableState10 = J83.g(bl2);
        p83_0 p83_03 = new p83_0();
        super(p83_03);
        this.t = zr1_14;
        super(bl2);
        this.u = zr1_13;
        this.v = string2 = "";
        this.w = n3 = 1;
        this.x = linkedHashMap2 = new LinkedHashMap();
        this.y = linkedHashMap = new LinkedHashMap();
        HK0$c hK0$c = HK0$c.a;
        J83.h();
        Object object3 = wv1_0.b;
        this.z = parcelableSnapshotMutableState9 = J83.f(hK0$c, (I83)object3);
        this.A = parcelableSnapshotMutableState9;
        HD$c hD$c = HD$c.a;
        J83.h();
        this.B = parcelableSnapshotMutableState8 = J83.f(hD$c, (I83)object3);
        this.C = parcelableSnapshotMutableState8;
        GH0$c gH0$c = GH0$c.a;
        J83.h();
        this.E = parcelableSnapshotMutableState7 = J83.f(gH0$c, (I83)object3);
        this.F = parcelableSnapshotMutableState7;
        this.G = parcelableSnapshotMutableState6 = J83.g(uD$d.a);
        this.H = parcelableSnapshotMutableState6;
        this.I = parcelableSnapshotMutableState5 = J83.g(ff2$b_0.a);
        this.J = parcelableSnapshotMutableState5;
        this.K = kb3_23 = lb3_2.a(Qw2$c.a);
        this.L = kb3_23;
        this.O = parcelableSnapshotMutableState4 = J83.g(null);
        new Bundle();
        p83_0 p83_04 = new p83_0();
        Integer n7 = R$drawable.switch_stores;
        Object object4 = R$drawable.switch_stores;
        int n8 = R$drawable.switch_stores;
        Object object5 = object;
        int n10 = n8;
        object = new yz_0("Switch Stores", n7, object4, "switch-store-route", "GIF", "GIF", n8, n8, null);
        p83_04.add(object);
        Integer n14 = R$drawable.fleek_feed_unselected;
        Integer n15 = R$drawable.fleek_feed_selected;
        int n16 = R$drawable.fleek_feed_unselected;
        int n17 = R$drawable.fleek_feed_selected;
        object = new yz_0("Feed", n14, n15, "feed?postId={postId}", "IMAGE", "IMAGE", n16, n17, null);
        p83_04.add(object);
        n7 = R$drawable.fleek_explorebrand_unselected;
        object4 = R$drawable.fleek_explorebrand_selected;
        n10 = R$drawable.fleek_explorebrand_unselected;
        n8 = R$drawable.fleek_explorebrand_selected;
        String string3 = "explore-brands";
        String string4 = "Explore Brands";
        String string5 = "IMAGE";
        String string6 = "IMAGE";
        object5 = object;
        object = new yz_0(string4, n7, object4, string3, string5, string6, n10, n8, null);
        p83_04.add(object);
        n14 = R$drawable.fleek_account_unselected;
        int n18 = R$drawable.fleek_account_selected;
        n15 = n18;
        n16 = R$drawable.fleek_account_unselected;
        n17 = R$drawable.fleek_account_selected;
        String string7 = "account";
        String string8 = "Account";
        String string9 = "IMAGE";
        String string10 = "IMAGE";
        object = new yz_0(string8, n14, n15, string7, string9, string10, n16, n17, null);
        p83_04.add(object);
        this.P = parcelableSnapshotMutableState3 = J83.g(p83_04);
        this.Q = object2 = J83.g(object2);
        int n19 = 7;
        this.R = i23_02 = k23_0.b(0, 0, null, n19);
        this.S = ee2_22 = ms0_1.a(i23_02);
        this.T = object2 = k23_0.b(0, 0, null, n19);
        this.U = object2 = ms0_1.a((i23_0)object2);
        object2 = new p83_0();
        this.X = object2 = J83.g(object2);
        this.Y = object2 = J83.g(bl2);
        object2 = new ArrayList();
        this.q0 = object2;
        object2 = new ArrayList();
        this.r0 = object2;
        object2 = new ArrayList();
        this.s0 = object2;
        object2 = new ArrayList();
        this.t0 = object2;
        object2 = new ArrayList();
        this.u0 = object2;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        this.w0 = object2 = new Ko((Context)aJIOApplication);
        AJIOApplication aJIOApplication2 = AJIOApplication$a.a();
        this.x0 = object2 = new jo_2((Context)aJIOApplication2);
        this.y0 = kb3_22 = lb3_2.a(qX2$c.a);
        super();
        this.z0 = hh3_22 = yr1_2.b(zr0_12);
        Object object6 = AJIOApplication$a.a();
        object = new WishListRepo((Context)object6);
        this.A0 = bH3 = new BH3((WishListRepo)object);
        this.C0 = parcelableSnapshotMutableState2 = J83.g(bl2);
        this.D0 = parcelableSnapshotMutableState = J83.g(bl2);
        this.E0 = zr1_12 = new zr1_1();
        this.F0 = p83_02 = new p83_0();
        this.G0 = t30_02 = new t30_0();
        this.I0 = object2 = J83.g(((jo_2)object2).l());
        this.J0 = object2 = J83.g(bl2);
        object2 = new p83_0();
        J83.h();
        this.K0 = object2 = J83.f(object2, (I83)object3);
        this.L0 = object2 = lb3_2.a(string2);
        object2 = ms0_1.b((kb3_2)object2);
        aW aW2 = md3_0.c(this);
        long l3 = Long.MAX_VALUE;
        long l4 = 0L;
        object3 = new cb3_2(l4, l3);
        object2 = tt0_2.a((es0_2)object2);
        object4 = lb3_2.a(string2);
        n73 n732 = d33$a.a;
        boolean bl3 = Intrinsics.areEqual(object3, n732);
        if (bl3) {
            l90_0 l90_02 = l90_0.DEFAULT;
        } else {
            l90_0 l90_03 = l90_0.UNDISPATCHED;
        }
        void var24_84 = var10_67;
        string5 = null;
        object = ((c33)object2).a;
        Object object7 = object5;
        object6 = object4;
        Object object8 = object5;
        object5 = null;
        ((st0_2)object7)((d33)object3, (es0_2)object, (qr1_2)object4, string2, null);
        object2 = ((c33)object2).d;
        mb3_2 mb3_22 = Ae3.c(aW2, (CoroutineContext)object2, (l90_0)var24_84, (Function2)object7);
        dr0_02.M0 = object2 = new ge2_2((kb3_2)object4, mb3_22);
        a$a a$a = kotlin.time.a.b;
        aw0_1 aw0_12 = aw0_1.MILLISECONDS;
        long l7 = kotlin.time.b.f(300, aw0_12);
        n4 = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1);
        if (n4 > 0) {
            n4 = 1;
        } else {
            n4 = 0;
            Object var4_9 = null;
        }
        if (n4 == n3) {
            aw0_1 aw0_13 = aw0_1.NANOSECONDS;
            l2 = kotlin.time.b.g(999999L, aw0_13);
            l2 = kotlin.time.a.c(kotlin.time.a.f(l7, l2));
        } else {
            if (n4 != 0) {
                NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                throw noWhenBranchMatchedException;
            }
            l2 = l4;
        }
        n4 = (int)(l2 == l4 ? 0 : (l2 < l4 ? -1 : 1));
        if (n4 < 0) {
            object2 = "Debounce timeout should not be negative".toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object2);
            throw illegalArgumentException;
        }
        if (n4 != 0) {
            ss0_2 ss0_22 = new ss0_2(l2);
            ts0_2 ts0_22 = new ts0_2(ss0_22, (ge2_2)object2, null);
            object2 = new hs0_1(ts0_22);
        }
        dr0_02.N0 = object2;
        super();
        dr0_02.P0 = dR0$h;
        dr0_02.Q0 = arrayList = new ArrayList();
    }

    public static boolean E(com.ril.ajio.services.data.fleek.feedModel.Component object) {
        boolean bl2;
        if (object != null && (object = ((com.ril.ajio.services.data.fleek.feedModel.Component)object).getSubcomponents()) != null && (object = (Subcomponent)CollectionsKt.firstOrNull((List)object)) != null && (object = ((Subcomponent)object).getResourceOwner()) != null && (object = ((com.ril.ajio.services.data.fleek.feedModel.ResourceOwner)object).isFollowed()) != null) {
            bl2 = (Boolean)object;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static void F(Activity activity, String string2) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(string2, "productCode");
        di2_2 di2_22 = new zj0_0(activity);
        String string3 = ld3_2.STORE_AJIOGRAM.getStoreId();
        di2_22.b(string2, string3, "", null, null);
    }

    public static void G(String string2, yT1 yT12) {
        String string3 = "fleekAppNavigationController";
        Intrinsics.checkNotNullParameter(yT12, string3);
        if (string2 != null) {
            string3 = "brand?brandId=";
            string2 = string3.concat(string2);
            int n3 = 6;
            androidx.navigation.e.p(yT12, string2, null, n3);
        }
    }

    public static void H(dr0_0 dr0_02, Activity activity, Bundle bundle) {
        dr0_02.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        String string2 = "";
        Intrinsics.checkNotNullParameter(string2, "linkUrl");
        Qj2 qj2 = new zj0_0(activity);
        String string3 = ld3_2.STORE_AJIOGRAM.getStoreId();
        qj2.d(0, null, bundle, string2, string3, "s", null);
    }

    public static void T(Activity activity, boolean bl2, com.ril.ajio.services.data.fleek.feedModel.Resource resource, Function0 function0, Function0 function02) {
        Object object;
        int n3;
        int n4;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        int n7;
        Object object7;
        Function0 function03 = function0;
        Function0 function04 = function02;
        Object object8 = activity;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(function0, "successExecutingFunction");
        Intrinsics.checkNotNullParameter(function02, "failureExecutingFunction");
        Product product = new Product();
        boolean bl3 = false;
        Object object9 = null;
        Object object10 = resource != null ? resource.getDiscountPercent() : null;
        product.setDiscountPercent((String)object10);
        object10 = new ProductFnlColorVariantData();
        object7 = resource != null && (object7 = resource.getFnlColorVariantData()) != null ? ((FnlColorVariantData)object7).getBrandName() : null;
        ((ProductFnlColorVariantData)object10).setBrandName((String)object7);
        object7 = resource != null && (object7 = resource.getFnlColorVariantData()) != null ? ((FnlColorVariantData)object7).getColorGroup() : null;
        ((ProductFnlColorVariantData)object10).setColorGroup((String)object7);
        object7 = resource != null && (object7 = resource.getFnlColorVariantData()) != null ? ((FnlColorVariantData)object7).getOutfitPictureURL() : null;
        ((ProductFnlColorVariantData)object10).setOutfitPictureURL((String)object7);
        product.setFnlColorVariantData((ProductFnlColorVariantData)object10);
        if (resource == null || (object10 = resource.getId()) == null) {
            object10 = "";
        }
        product.setId((String)object10);
        if (resource != null && (object10 = resource.getImages()) != null) {
            object10 = (Iterable)object10;
            n7 = yx_2.o((Iterable)object10, 10);
            object7 = new ArrayList(n7);
            object10 = object10.iterator();
            while ((n7 = (int)(object10.hasNext() ? 1 : 0)) != 0) {
                object6 = (ProductImage)object10.next();
                object4 = object6 != null ? (object5 = ((ProductImage)object6).getFormat()) : null;
                object3 = object6 != null ? (object5 = ((ProductImage)object6).getImageType()) : null;
                object2 = object6 != null ? (object6 = ((ProductImage)object6).getUrl()) : null;
                n4 = 504;
                n3 = 0;
                object = object6;
                object6 = new ProductImage((String)object4, (String)object2, (String)object3, 0, null, null, null, null, null, n4, null);
                ((ArrayList)object7).add(object6);
            }
        } else {
            object7 = null;
        }
        product.setImages((List)object7);
        object10 = resource != null ? resource.getName() : null;
        product.setName((String)object10);
        object5 = resource != null && (object10 = resource.getPrice()) != null ? (object10 = ((Price)object10).getDisplayformattedValue()) : null;
        if (resource != null && (object10 = resource.getPrice()) != null) {
            object6 = object10 = ((Price)object10).getFormattedValue();
        } else {
            n7 = 0;
            object6 = null;
        }
        if (resource != null && (object10 = resource.getPrice()) != null) {
            object9 = ((Price)object10).getValue();
        }
        object = String.valueOf(object9);
        n3 = 8184;
        object4 = null;
        object2 = null;
        object3 = null;
        n4 = 0;
        object7 = object9;
        object9 = new com.ril.ajio.services.data.Price((String)object6, (String)object5, (String)object, null, null, null, null, null, null, null, null, null, null, n3, null);
        product.setPrice((com.ril.ajio.services.data.Price)object9);
        if (bl2) {
            object8 = dr0_0.w(activity);
            bl3 = false;
            object9 = null;
            ((fq0_2)object8).Ua(false, product, function03, function04);
        } else {
            object8 = dr0_0.w(activity);
            bl3 = true;
            ((fq0_2)object8).Ua(bl3, product, function03, function04);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void b(dr0_0 dr0_02, FeedEngineData feedEngineData) {
        com.ril.ajio.services.data.fleek.feedModel.Component component;
        boolean bl2;
        Object object;
        Object object2;
        boolean bl3;
        Object object3;
        block3: {
            dr0_02.getClass();
            boolean bl4 = h40_0.Q1();
            if (!bl4) return;
            if (feedEngineData != null && (object3 = feedEngineData.getLayout()) != null && (object3 = ((com.ril.ajio.services.data.fleek.feedModel.Layout)object3).getComponents()) != null && !(bl3 = ((p83_0)object3).isEmpty())) {
                object3 = ((p83_0)object3).iterator();
                do {
                    object2 = object3;
                    object2 = (ob3_2)object3;
                    bl2 = ((ob3_2)object2).hasNext();
                    if (!bl2) break block3;
                    if ((object2 = (com.ril.ajio.services.data.fleek.feedModel.Component)((ob3_2)object2).next()) != null) {
                        object2 = ((com.ril.ajio.services.data.fleek.feedModel.Component)object2).getType();
                        continue;
                    }
                    bl3 = false;
                    object2 = null;
                } while (!(bl3 = Intrinsics.areEqual(object2, object = "ADDRESS")));
                return;
            }
        }
        if (feedEngineData == null || (object3 = feedEngineData.getLayout()) == null || (object3 = ((com.ril.ajio.services.data.fleek.feedModel.Layout)object3).getComponents()) == null) return;
        object2 = component;
        bl2 = false;
        com.ril.ajio.services.data.fleek.feedModel.Component component2 = component;
        component = null;
        String string2 = "ADDRESS";
        int n3 = 114687;
        ((com.ril.ajio.services.data.fleek.feedModel.Component)object2)(null, null, null, null, null, null, null, null, null, null, null, null, null, null, string2, false, null, n3, null);
        bl3 = false;
        object2 = null;
        object = component2;
        ((p83_0)object3).add(0, component2);
    }

    public static void c(Activity object, Function0 object2) {
        Intrinsics.checkNotNullParameter(object, "activity");
        String string2 = "executingFunction";
        Intrinsics.checkNotNullParameter(object2, string2);
        object = dr0_0.w((Activity)object);
        int n3 = 1;
        fb_2 fb_22 = new fb_2(object2, n3);
        object.getClass();
        Intrinsics.checkNotNullParameter(fb_22, string2);
        object2 = ((fq0_2)object).Sa();
        boolean bl2 = ((UserInformation)object2).isUserOnline();
        if (!bl2) {
            ((fq0_2)object).v = fb_22;
            object = ((fq0_2)object).l;
            if (object != null) {
                object2 = "source - fleek";
                int n4 = 68;
                object.z0(n4, (String)object2);
            }
        } else {
            fb_22.invoke();
        }
    }

    public static ArrayList d(p83_0 p83_02, int n3) {
        Object object;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (p83_02 != null && (object = CollectionsKt.f0(p83_02, n3)) != null) {
            boolean bl2;
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                Object object2 = (Subcomponent)object.next();
                if (object2 == null || (object2 = ((Subcomponent)object2).getProductResources()) == null) continue;
                object2 = object2.iterator();
                while (bl3 = object2.hasNext()) {
                    boolean bl4;
                    Object object3;
                    Object object4;
                    FnlColorVariantData fnlColorVariantData;
                    List list;
                    Object object5;
                    Object object6 = (Product)object2.next();
                    String string2 = null;
                    if (object6 != null) {
                        object5 = ((Product)object6).getImages();
                        list = object5;
                    } else {
                        list = null;
                    }
                    Object object7 = object6 != null ? (object5 = ((Product)object6).getId()) : null;
                    Object object8 = object6 != null ? (object5 = ((Product)object6).getName()) : null;
                    Object object9 = object6 != null ? (object5 = ((Product)object6).getDiscountPercent()) : null;
                    Object object10 = object6 != null && (object5 = ((Product)object6).getFnlColorVariantData()) != null ? (object5 = ((ProductFnlColorVariantData)object5).getOutfitPictureURL()) : null;
                    Object object11 = object6 != null && (object5 = ((Product)object6).getFnlColorVariantData()) != null ? (object5 = ((ProductFnlColorVariantData)object5).getBrandName()) : null;
                    Object object12 = object6 != null && (object5 = ((Product)object6).getFnlColorVariantData()) != null ? (object5 = ((ProductFnlColorVariantData)object5).getColorGroup()) : null;
                    Object object13 = null;
                    int n4 = 8;
                    Object object14 = fnlColorVariantData;
                    fnlColorVariantData = new FnlColorVariantData((String)object11, (String)object12, (String)object10, null, n4, null);
                    Object object15 = object6 != null && (object5 = ((Product)object6).getPrice()) != null ? (object5 = ((com.ril.ajio.services.data.Price)object5).getFormattedValue()) : null;
                    Object object16 = object6 != null && (object5 = ((Product)object6).getPrice()) != null ? (object5 = ((com.ril.ajio.services.data.Price)object5).getValue()) : null;
                    int n7 = 0;
                    Object object17 = null;
                    int n8 = 0;
                    int n10 = 119;
                    object12 = new Price(null, null, null, (String)object15, null, null, null, (String)object16, n10, null);
                    Object object18 = object6 != null && (object5 = ((Product)object6).getOfferPrice()) != null ? (object5 = ((com.ril.ajio.services.data.Price)object5).getFormattedValue()) : null;
                    Object object19 = object6 != null && (object5 = ((Product)object6).getOfferPrice()) != null ? (object5 = ((com.ril.ajio.services.data.Price)object5).getValue()) : null;
                    int n14 = 0;
                    com.ril.ajio.services.data.fleek.feedModel.ResourceOwner resourceOwner = null;
                    int n15 = 11;
                    object14 = new OfferPrice(null, null, (String)object18, null, (String)object19, n15, null);
                    object13 = object6 != null && (object4 = ((Product)object6).getWasPriceData()) != null ? (object4 = ((com.ril.ajio.services.data.Price)object4).getFormattedValue()) : null;
                    object17 = object6 != null && (object4 = ((Product)object6).getWasPriceData()) != null ? (object4 = ((com.ril.ajio.services.data.Price)object4).getValue()) : null;
                    n4 = 0;
                    n8 = 11;
                    object10 = object5;
                    object5 = new WasPriceData(null, null, (String)object13, null, (String)object17, n8, null);
                    object4 = ih3_1.b;
                    if (object6 != null && (object3 = ((Product)object6).getFnlColorVariantData()) != null) {
                        object3 = ((ProductFnlColorVariantData)object3).getColorGroup();
                    } else {
                        bl4 = false;
                        object3 = null;
                    }
                    bl4 = CollectionsKt.F((Iterable)object4, object3);
                    object17 = object6 != null ? (object4 = ((Product)object6).getId()) : null;
                    if (object6 != null && (object6 = ((Product)object6).getFnlColorVariantData()) != null) {
                        string2 = ((ProductFnlColorVariantData)object6).getBrandName();
                    }
                    object15 = string2;
                    n4 = 0;
                    object13 = null;
                    n8 = 0;
                    object16 = null;
                    n10 = 0;
                    n14 = 65391;
                    object18 = null;
                    object10 = resourceOwner;
                    resourceOwner = new com.ril.ajio.services.data.fleek.feedModel.ResourceOwner(null, null, null, null, (String)object17, null, null, string2, null, null, null, null, null, null, null, null, n14, null);
                    object4 = object6;
                    object15 = bl4;
                    bl4 = false;
                    object3 = null;
                    object11 = null;
                    object17 = null;
                    n7 = 914561;
                    object6 = new com.ril.ajio.services.data.fleek.feedModel.Resource(null, (String)object9, fnlColorVariantData, (String)object7, list, (String)object8, (OfferPrice)object14, null, (Price)object12, resourceOwner, null, (WasPriceData)object5, null, null, null, null, null, (Boolean)object15, null, false, n7, null);
                    arrayList.add(object6);
                }
            }
        }
        return arrayList;
    }

    public static Subcomponent e(Subcomponent subcomponent) {
        Subcomponent subcomponent2 = subcomponent;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        ArrayList<Object> arrayList = new ArrayList<Object>();
        p83_0 p83_02 = new p83_0();
        Object object = subcomponent.getMedia();
        Object object2 = null;
        Object object3 = object != null ? (object = ((Media)object).getType()) : null;
        object = subcomponent.getMedia();
        Object object4 = object != null ? (object = ((Media)object).getRedirectionUrl()) : null;
        object = subcomponent.getMedia();
        Object object5 = object != null ? (object = ((Media)object).getUrl()) : null;
        object = subcomponent.getMedia();
        if (object != null) {
            object2 = ((Media)object).getMetadata();
        }
        object = new Media(null, (Metadata)object2, (String)object5, (String)object3, (String)object4, null, null, 97, null);
        arrayList.add(object);
        p83_02.add(subcomponent2);
        ArrayList arrayList2 = dr0_0.d(p83_02, 1);
        String string2 = subcomponent.getId();
        object2 = subcomponent.getDescription();
        subcomponent2 = subcomponent;
        return Subcomponent.copy$default(subcomponent, null, null, (String)object2, null, null, false, null, null, null, arrayList, null, null, null, null, null, null, null, null, arrayList2, null, null, null, null, null, null, null, null, string2, 0L, null, null, false, null, -134480389, 1, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static p83_0 f(p83_0 p83_02, ArrayList arrayList, com.ril.ajio.services.data.fleek.feedModel.ResourceOwner resourceOwner) {
        ArrayList arrayList2 = arrayList;
        Intrinsics.checkNotNullParameter(arrayList, "listSeenPostsIds");
        p83_0 p83_03 = new p83_0();
        if (p83_02 != null) {
            ListIterator listIterator = p83_02.listIterator();
            while (true) {
                boolean bl2;
                ArrayList<Product> arrayList3;
                Object object = listIterator;
                object = (ob3_2)listIterator;
                boolean bl3 = ((ob3_2)object).hasNext();
                if (!bl3) break;
                object = (Subcomponent)((ob3_2)object).next();
                ArrayList<com.ril.ajio.services.data.fleek.feedModel.Resource> arrayList4 = arrayList3;
                int n3 = -1;
                Object object2 = null;
                boolean bl4 = false;
                Object object3 = null;
                Object object4 = null;
                PostData postData = null;
                Object object5 = null;
                Subcomponent subcomponent = arrayList3;
                arrayList3 = null;
                Iterator iterator = null;
                Iterator iterator2 = null;
                Iterator iterator3 = null;
                Iterator iterator4 = null;
                int n4 = 0;
                String string2 = null;
                Object object6 = null;
                ArrayList<Product> arrayList5 = null;
                Object object7 = null;
                String string3 = null;
                long l2 = 0L;
                int n7 = 1;
                ((Subcomponent)((Object)arrayList4))(null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l2, null, null, false, null, n3, n7, null);
                arrayList4 = new ArrayList<com.ril.ajio.services.data.fleek.feedModel.Resource>();
                ArrayList arrayList6 = new ArrayList();
                object2 = object != null ? ((Subcomponent)object).getId() : null;
                object5 = subcomponent;
                subcomponent.setId((String)object2);
                object2 = object != null ? ((Subcomponent)object).getHeading() : null;
                ((Subcomponent)object5).setHeading((String)object2);
                if (object != null) {
                    object2 = ((Subcomponent)object).getId();
                    string3 = object2;
                } else {
                    string3 = null;
                }
                Object object8 = resourceOwner != null ? (object2 = resourceOwner.getName()) : null;
                object7 = resourceOwner != null ? (object2 = resourceOwner.getDescription()) : null;
                Object object9 = resourceOwner != null ? (object2 = resourceOwner.getLogo()) : null;
                object6 = object2;
                subcomponent = null;
                arrayList5 = null;
                n3 = 0;
                n7 = 0;
                int n8 = 65319;
                object2 = new com.ril.ajio.services.data.fleek.feedModel.ResourceOwner(null, null, null, (String)object7, string3, null, (String)object9, (String)object8, null, null, null, null, null, null, null, null, n8, null);
                ((Subcomponent)object5).setResourceOwner((com.ril.ajio.services.data.fleek.feedModel.ResourceOwner)object2);
                object8 = object != null ? (object2 = ((Subcomponent)object).getHeading()) : null;
                object7 = object != null ? (object2 = ((Subcomponent)object).getDescription()) : null;
                object9 = object != null && (object2 = ((Subcomponent)object).getMedia()) != null ? (object2 = ((Media)object2).getUrl()) : null;
                object6 = object2;
                subcomponent = null;
                arrayList5 = null;
                string3 = null;
                n3 = 0;
                n7 = 0;
                n8 = 65335;
                object2 = new com.ril.ajio.services.data.fleek.feedModel.ResourceOwner(null, null, null, (String)object7, null, null, (String)object9, (String)object8, null, null, null, null, null, null, null, null, n8, null);
                ((Subcomponent)object5).setResourceOwnerMock((com.ril.ajio.services.data.fleek.feedModel.ResourceOwner)object2);
                int n10 = 1048575;
                object4 = new com.ril.ajio.services.data.fleek.feedModel.Resource(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, n10, null);
                if (object != null && (object2 = ((Subcomponent)object).getMedia()) != null) {
                    object2 = ((Media)object2).getType();
                    iterator3 = object2;
                } else {
                    iterator3 = null;
                }
                if (object != null && (object2 = ((Subcomponent)object).getMedia()) != null) {
                    object2 = ((Media)object2).getRedirectionUrl();
                    iterator4 = object2;
                } else {
                    iterator4 = null;
                }
                if (object != null && (object2 = ((Subcomponent)object).getMedia()) != null) {
                    object2 = ((Media)object2).getUrl();
                    iterator2 = object2;
                } else {
                    iterator2 = null;
                }
                if (object != null && (object2 = ((Subcomponent)object).getMedia()) != null) {
                    object2 = ((Media)object2).getMetadata();
                    iterator = object2;
                } else {
                    iterator = null;
                }
                n4 = 97;
                arrayList3 = object2;
                object2 = new Media(null, (Metadata)((Object)iterator), (String)((Object)iterator2), (String)((Object)iterator3), (String)((Object)iterator4), null, null, n4, null);
                arrayList6.add(object2);
                arrayList3 = new ArrayList<Product>();
                if (object != null && (object2 = ((Subcomponent)object).getProductResources()) != null) {
                    object2 = object2.iterator();
                    while (bl4 = object2.hasNext()) {
                        object3 = (Product)object2.next();
                        if (object3 == null) continue;
                        arrayList3.add((Product)object3);
                    }
                }
                if (object != null) {
                    object2 = ((Subcomponent)object).getHeading();
                    iterator = object2;
                } else {
                    iterator = null;
                }
                object6 = object != null ? (object2 = ((Subcomponent)object).getId()) : null;
                object2 = postData;
                bl4 = false;
                PostData postData2 = postData;
                postData = null;
                arrayList5 = arrayList3;
                arrayList3 = null;
                iterator2 = null;
                iterator3 = null;
                iterator4 = null;
                n4 = 128635;
                com.ril.ajio.services.data.fleek.feedModel.Resource resource = object4;
                object4 = arrayList5;
                Subcomponent subcomponent2 = object5;
                object5 = object6;
                object3 = object2 = new PostData(null, null, arrayList5, null, null, null, null, arrayList6, (String)object6, null, null, (String)((Object)iterator), null, null, null, null, null, n4, null);
                object2 = resource;
                resource.setPostData(postData2);
                arrayList4.add(resource);
                object2 = subcomponent2;
                subcomponent2.setResources(arrayList4);
                if (object != null) {
                    string2 = ((Subcomponent)object).getId();
                }
                arrayList4 = string2;
                if (object != null && (object = ((Subcomponent)object).isSeen()) != null) {
                    bl2 = (Boolean)object;
                } else {
                    bl2 = false;
                    object = null;
                }
                bl3 = arrayList2.contains(arrayList4);
                if (bl3) {
                    bl2 = true;
                }
                object = bl2;
                ((Subcomponent)object2).setSeen((Boolean)object);
                p83_03.add(object2);
            }
        }
        return p83_03;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static SubcomponentsOwner g(List object, dr0_0 object2) {
        Object object3 = "fleekViewModel";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object2.getClass();
        String string2 = dr0_0.r(dr0_0.q((List)object));
        object2 = dr0_0.q((List)object);
        String string3 = dr0_0.y((com.ril.ajio.services.data.fleek.feedModel.Component)object2);
        object = dr0_0.q((List)object).getSubcomponents();
        object = object != null && (object = (Subcomponent)CollectionsKt.firstOrNull((List)object)) != null && (object = ((Subcomponent)object).getResourceOwner()) != null ? ((com.ril.ajio.services.data.fleek.feedModel.ResourceOwner)object).getId() : null;
        Object object4 = object;
        object3 = object;
        return new SubcomponentsOwner(null, (String)object4, null, null, string2, string3, null, false, 205, null);
    }

    public static SesActionApiRequestBody h(String string2, String string3, boolean bl2) {
        SesActionApiRequestBody sesActionApiRequestBody;
        if (string2 == null) {
            return null;
        }
        int n3 = 15;
        ArrayList<SesActionContent> arrayList = sesActionApiRequestBody;
        sesActionApiRequestBody = new SesActionApiRequestBody(null, null, null, null, n3, null);
        arrayList = new ArrayList<SesActionContent>();
        ArrayList<SesActionContent> arrayList2 = new ArrayList<SesActionContent>();
        int n4 = 7;
        SesActionContent sesActionContent = new SesActionContent(null, null, null, n4, null);
        sesActionContent.setBid(string2);
        sesActionContent.setPageName(string3);
        if (bl2) {
            arrayList.add(sesActionContent);
        } else {
            arrayList2.add(sesActionContent);
        }
        sesActionApiRequestBody.setFollow(arrayList);
        sesActionApiRequestBody.setUnfollow(arrayList2);
        return sesActionApiRequestBody;
    }

    public static SesActionApiRequestBody i(String string2, String string3, String string4, boolean bl2) {
        SesActionApiRequestBody sesActionApiRequestBody;
        if (string2 == null) {
            return null;
        }
        int n3 = 15;
        ArrayList<SesActionContent> arrayList = sesActionApiRequestBody;
        sesActionApiRequestBody = new SesActionApiRequestBody(null, null, null, null, n3, null);
        arrayList = new ArrayList<SesActionContent>();
        ArrayList<SesActionContent> arrayList2 = new ArrayList<SesActionContent>();
        int n4 = 7;
        SesActionContent sesActionContent = new SesActionContent(null, null, null, n4, null);
        sesActionContent.setId(string2);
        if (bl2) {
            sesActionContent.setBid(string3);
        }
        sesActionContent.setPageName(string4);
        if (bl2) {
            arrayList.add(sesActionContent);
        } else {
            arrayList2.add(sesActionContent);
        }
        sesActionApiRequestBody.setLike(arrayList);
        sesActionApiRequestBody.setUnlike(arrayList2);
        return sesActionApiRequestBody;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String m(String object) {
        void var2_8;
        int n3 = 1;
        z40$a z40$a = z40_0.Companion;
        ao0_0 ao0_02 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a;
        Object[] objectArray = "fleek_share_post_message";
        String string2 = ao0_02.b((String)objectArray);
        if (object == null) {
            return "";
        }
        try {
            objectArray = StringCompanionObject.INSTANCE;
        }
        catch (Exception exception) {
            return var2_8;
        }
        objectArray = new Object[n3];
        objectArray[0] = object;
        Object[] objectArray2 = Arrays.copyOf(objectArray, n3);
        String string3 = String.format(string2, objectArray2);
        String string4 = "format(...)";
        Intrinsics.checkNotNullExpressionValue(string3, string4);
        String string5 = string3;
        return var2_8;
    }

    public static ShareActionRequestBody n(String object, String string2) {
        Intrinsics.checkNotNullParameter(string2, "pageName");
        int n3 = 1;
        ShareActionRequestBody shareActionRequestBody = new ShareActionRequestBody(null, n3, null);
        ShareActionItem shareActionItem = new ShareActionItem(null, null, null, 7, null);
        shareActionItem.setId((String)object);
        shareActionItem.setPageName(string2);
        object = new ShareActionItem[n3];
        object[0] = shareActionItem;
        object = xx_2.d(object);
        shareActionRequestBody.setData((ArrayList)object);
        return shareActionRequestBody;
    }

    public static com.ril.ajio.services.data.fleek.feedModel.Component q(List list) {
        Object object;
        Iterator iterator;
        if (list != null) {
            boolean bl2;
            iterator = list;
            iterator = ((Iterable)list).iterator();
            while (bl2 = iterator.hasNext()) {
                boolean bl3;
                String string2;
                boolean bl4;
                String string3;
                com.ril.ajio.services.data.fleek.feedModel.Component component = (com.ril.ajio.services.data.fleek.feedModel.Component)iterator.next();
                if (component == null || (string3 = component.getType()) == null || (bl4 = string3.equals(string2 = "INSERT")) != (bl3 = true) || (string3 = component.getTemplate()) == null || (bl4 = string3.equals(object = "BRAND_COVER")) != bl3) continue;
                return component;
            }
        }
        object = iterator;
        iterator = new Iterator(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 131071, null);
        return iterator;
    }

    public static String r(com.ril.ajio.services.data.fleek.feedModel.Component object) {
        object = (object = ((com.ril.ajio.services.data.fleek.feedModel.Component)object).getSubcomponents()) != null && (object = (Subcomponent)CollectionsKt.firstOrNull((List)object)) != null && (object = ((Subcomponent)object).getResourceOwner()) != null ? ((com.ril.ajio.services.data.fleek.feedModel.ResourceOwner)object).getLogo() : null;
        return object;
    }

    public static int t(String string2, boolean bl2) {
        int n3;
        Object object = Locale.getDefault();
        Intrinsics.checkNotNull(object);
        string2 = string2.toUpperCase((Locale)object);
        String string3 = "toUpperCase(...)";
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        String string4 = "feed?postId={postId}".toUpperCase((Locale)object);
        Intrinsics.checkNotNullExpressionValue(string4, string3);
        boolean bl3 = Intrinsics.areEqual(string2, string4);
        if (bl3) {
            n3 = bl2 ? R$drawable.fleek_feed_selected : R$drawable.fleek_feed_unselected;
        } else {
            string4 = "switch-store-route".toUpperCase((Locale)object);
            Intrinsics.checkNotNullExpressionValue(string4, string3);
            bl3 = Intrinsics.areEqual(string2, string4);
            if (bl3) {
                n3 = R$drawable.switch_stores;
            } else {
                string4 = "explore-brands".toUpperCase((Locale)object);
                Intrinsics.checkNotNullExpressionValue(string4, string3);
                bl3 = Intrinsics.areEqual(string2, string4);
                if (bl3) {
                    n3 = bl2 ? R$drawable.fleek_explorebrand_selected : R$drawable.fleek_explorebrand_unselected;
                } else {
                    string4 = "account";
                    object = string4.toUpperCase((Locale)object);
                    Intrinsics.checkNotNullExpressionValue(object, string3);
                    n3 = (int)(Intrinsics.areEqual(string2, object) ? 1 : 0);
                    n3 = n3 != 0 ? (bl2 ? R$drawable.fleek_account_selected : R$drawable.fleek_account_unselected) : (bl2 ? R$drawable.fleek_feed_selected : R$drawable.fleek_feed_unselected);
                }
            }
        }
        return n3;
    }

    public static fq0_2 w(Activity object) {
        Intrinsics.checkNotNullParameter(object, "activity");
        object = ((AjioHomeActivity)object).T0;
        Object object2 = null;
        object = object != null ? ((Fragment)object).getChildFragmentManager() : null;
        if (object != null) {
            fq0_2.Companion.getClass();
            object2 = fq0_2.J;
            object2 = ((FragmentManager)object).E((String)object2);
        }
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.fleek.fragment.FleekFragment");
        return (fq0_2)object2;
    }

    public static String x(com.ril.ajio.services.data.fleek.feedModel.Component object) {
        object = object != null ? ((com.ril.ajio.services.data.fleek.feedModel.Component)object).getPostId() : null;
        return object;
    }

    public static String y(com.ril.ajio.services.data.fleek.feedModel.Component object) {
        object = object != null && (object = ((com.ril.ajio.services.data.fleek.feedModel.Component)object).getSubcomponents()) != null && (object = (Subcomponent)CollectionsKt.firstOrNull((List)object)) != null && (object = ((Subcomponent)object).getResourceOwner()) != null ? ((com.ril.ajio.services.data.fleek.feedModel.ResourceOwner)object).getName() : null;
        return object;
    }

    public static String z(com.ril.ajio.services.data.fleek.feedModel.Component object) {
        object = (object = ((com.ril.ajio.services.data.fleek.feedModel.Component)object).getSubcomponents()) != null && (object = (Subcomponent)CollectionsKt.firstOrNull((List)object)) != null && (object = ((Subcomponent)object).getResourceOwner()) != null ? ((com.ril.ajio.services.data.fleek.feedModel.ResourceOwner)object).getCode() : null;
        return object;
    }

    public final String A(String string2) {
        boolean bl2;
        Object object = this.q0;
        if (object != null && !(bl2 = object.isEmpty())) {
            boolean bl3;
            Object object2;
            Object object3;
            boolean bl4;
            object = this.q0;
            ArrayList arrayList = new ArrayList();
            object = object.iterator();
            while (bl4 = object.hasNext()) {
                object2 = object3 = object.next();
                object2 = ((FleekSeenComponents)object3).getType();
                bl3 = Intrinsics.areEqual(object2, string2);
                if (!bl3) continue;
                arrayList.add(object3);
            }
            ar0_0 ar0_02 = new ar0_0(0);
            bl3 = false;
            object2 = null;
            object3 = ",";
            int n3 = 30;
            string2 = CollectionsKt.R(arrayList, object3, null, null, ar0_02, n3);
        } else {
            string2 = null;
        }
        return string2;
    }

    public final void B() {
        Object object;
        Object object2;
        int n3 = this.C();
        if (n3 == 0 || (n3 = this.C()) != 0 && (n3 = (int)(((Boolean)(object2 = (Boolean)this.g.getValue())).booleanValue() ? 1 : 0)) != 0 && (object2 = this.D()) == (object = hv1_1.IDLE)) {
            int n4;
            n3 = this.C();
            object2 = n3 == 0 ? hv1_1.LOADING : hv1_1.PAGINATING;
            this.b0((hv1_1)((Object)object2));
            object2 = az3_0.b();
            object = this.q0;
            if (object != null && (n4 = object.isEmpty()) == 0 && (n4 = this.C()) == 0) {
                object = this.A("STORY");
                ((FleekQueryParameters)object2).setSeenStoryPostId((String)object);
            }
            object = md3_0.c(this);
            DR0$g dR0$g = new DR0$g(this, (FleekQueryParameters)object2, null);
            n3 = 3;
            Ae3.d((i90_0)object, null, null, dR0$g, n3);
        }
    }

    public final int C() {
        return ((Number)this.f.getValue()).intValue();
    }

    public final hv1_1 D() {
        return (hv1_1)((Object)this.h.getValue());
    }

    public final void I(BrandPageModel brandPageModel, boolean bl2, String string2) {
        uD$e uD$e;
        boolean bl3;
        int n3;
        Object object;
        Object object2;
        Object object3 = new p83_0();
        BrandPageModel brandPageModel2 = null;
        if (brandPageModel != null && (object2 = brandPageModel.getLayout()) != null && (object2 = ((com.ril.ajio.services.data.fleek.brand_page.Layout)object2).getComponents()) != null) {
            object2 = ((p83_0)object2).listIterator();
            while (true) {
                String string3;
                object = object2;
                object = (ob3_2)object2;
                n3 = (int)(((ob3_2)object).hasNext() ? 1 : 0);
                if (n3 == 0) break;
                Object object4 = object = ((ob3_2)object).next();
                object4 = (com.ril.ajio.services.data.fleek.feedModel.Component)object;
                if (object4 != null && (object = ((com.ril.ajio.services.data.fleek.feedModel.Component)object4).getSubComponentsOwner()) != null) {
                    object = ((SubcomponentsOwner)object).getId();
                    string3 = string2;
                } else {
                    string3 = string2;
                    bl3 = false;
                    object = null;
                }
                bl3 = Intrinsics.areEqual(object, string3);
                if (bl3 && object4 != null && (object = ((com.ril.ajio.services.data.fleek.feedModel.Component)object4).getSubComponentsOwner()) != null) {
                    ((SubcomponentsOwner)object).setUserFollowing(bl2);
                }
                if (object4 != null) {
                    uD$e = null;
                    bl3 = false;
                    string3 = null;
                    int n4 = 131071;
                    object = com.ril.ajio.services.data.fleek.feedModel.Component.copy$default((com.ril.ajio.services.data.fleek.feedModel.Component)object4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, n4, null);
                } else {
                    bl3 = false;
                    object = null;
                }
                ((p83_0)object3).add(object);
            }
        }
        if (brandPageModel != null && (object2 = brandPageModel.getLayout()) != null) {
            ((com.ril.ajio.services.data.fleek.brand_page.Layout)object2).setComponents((p83_0)object3);
        }
        if (brandPageModel != null) {
            object2 = null;
            bl3 = false;
            object = null;
            n3 = 7;
            object3 = brandPageModel;
            brandPageModel2 = BrandPageModel.copy$default(brandPageModel, null, null, null, n3, null);
        }
        uD$e = new uD$e(brandPageModel2);
        object3 = this;
        this.G.setValue(uD$e);
    }

    public final void J(iB object, String string2, Activity activity) {
        Object object2 = "event";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = object instanceof ib_1.a_0;
        if (bl2) {
            if (string2 != null) {
                object = this.G;
                object2 = uD$b.a;
                ((h83_0)object).setValue(object2);
                object = md3_0.c(this);
                object2 = new FR0(null, this, activity, string2);
                int n3 = 3;
                Ae3.d((i90_0)object, null, null, (Function2)object2, n3);
            }
            return;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }

    public final void K(jG0 object) {
        Object object2 = "event";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = object instanceof jG0.a;
        if (bl2) {
            object = md3_0.c(this);
            object2 = new ir0_0(null, this);
            Ae3.d((i90_0)object, null, null, (Function2)object2, 3);
            return;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }

    public final void L(FeedEngineData feedEngineData, boolean bl2, String string2) {
        HK0$d hK0$d;
        int n3;
        boolean bl3;
        Object object;
        boolean bl4;
        Object object2;
        Object object3;
        Object object4 = new p83_0();
        FeedEngineData feedEngineData2 = null;
        if (feedEngineData != null && (object3 = feedEngineData.getLayout()) != null && (object3 = ((com.ril.ajio.services.data.fleek.feedModel.Layout)object3).getComponents()) != null) {
            object3 = ((p83_0)object3).listIterator();
            while (true) {
                String string3;
                object2 = object3;
                object2 = (ob3_2)object3;
                bl4 = ((ob3_2)object2).hasNext();
                if (!bl4) break;
                object = object2 = ((ob3_2)object2).next();
                object = (com.ril.ajio.services.data.fleek.feedModel.Component)object2;
                if (object != null && (object2 = ((com.ril.ajio.services.data.fleek.feedModel.Component)object).getSubComponentsOwner()) != null) {
                    object2 = ((SubcomponentsOwner)object2).getId();
                    string3 = string2;
                } else {
                    string3 = string2;
                    bl3 = false;
                    object2 = null;
                }
                bl3 = Intrinsics.areEqual(object2, string3);
                if (bl3 && object != null && (object2 = ((com.ril.ajio.services.data.fleek.feedModel.Component)object).getSubComponentsOwner()) != null) {
                    ((SubcomponentsOwner)object2).setUserFollowing(bl2);
                }
                if (object != null) {
                    n3 = 0;
                    hK0$d = null;
                    bl3 = false;
                    string3 = null;
                    int n4 = 131071;
                    object2 = com.ril.ajio.services.data.fleek.feedModel.Component.copy$default((com.ril.ajio.services.data.fleek.feedModel.Component)object, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, n4, null);
                } else {
                    bl3 = false;
                    object2 = null;
                }
                ((p83_0)object4).add(object2);
            }
        }
        if (feedEngineData != null && (object3 = feedEngineData.getLayout()) != null) {
            ((com.ril.ajio.services.data.fleek.feedModel.Layout)object3).setComponents((p83_0)object4);
        }
        if (feedEngineData != null) {
            bl3 = false;
            object2 = null;
            bl4 = false;
            object = null;
            object3 = null;
            n3 = 15;
            object4 = feedEngineData;
            feedEngineData2 = FeedEngineData.copy$default(feedEngineData, null, null, null, null, n3, null);
        }
        hK0$d = new HK0$d(feedEngineData2);
        object4 = this;
        this.z.setValue(hK0$d);
    }

    public final void M(vj0_0 object) {
        block4: {
            block3: {
                block2: {
                    Object object2 = "event";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    boolean bl2 = object instanceof vj0_0.b;
                    if (!bl2) break block2;
                    boolean bl3 = false;
                    object2 = 0;
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.c;
                    parcelableSnapshotMutableState.setValue(object2);
                    object = 0;
                    this.f.setValue(object);
                    object = hv1_1.IDLE;
                    Intrinsics.checkNotNullParameter(object, "<set-?>");
                    this.e.setValue(object);
                    this.b0((hv1_1)((Object)object));
                    object = Boolean.FALSE;
                    this.d.setValue(object);
                    object2 = this.g;
                    ((h83_0)object2).setValue(object);
                    this.u();
                    this.B();
                    break block3;
                }
                boolean bl4 = object instanceof vj0_0.a;
                if (!bl4) break block4;
                this.u();
            }
            return;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }

    public final void N(Subcomponent subcomponent, com.ril.ajio.services.data.fleek.feedModel.Component component, String string2, BrandPageModel brandPageModel, boolean bl2) {
        int n3;
        Object object;
        Object object2;
        int n4;
        Object object3;
        Object object4 = this;
        Object object5 = subcomponent;
        com.ril.ajio.services.data.fleek.feedModel.Component component2 = component;
        Intrinsics.checkNotNullParameter(component, "component");
        Object object6 = "brandsPageData";
        Intrinsics.checkNotNullParameter(brandPageModel, (String)object6);
        if (string2 != null) {
            object6 = bl2;
            object3 = this.y;
            object3.put(string2, object6);
        }
        object6 = component.getSubcomponents();
        Subcomponent subcomponent2 = null;
        if (object6 != null) {
            n4 = ((p83_0)object6).indexOf(object5);
            object2 = object6 = Integer.valueOf(n4);
        } else {
            object2 = null;
        }
        object6 = brandPageModel.getLayout();
        if (object6 != null && (object6 = ((com.ril.ajio.services.data.fleek.brand_page.Layout)object6).getComponents()) != null) {
            n4 = ((p83_0)object6).indexOf(component2);
            object = object6 = Integer.valueOf(n4);
        } else {
            object = null;
        }
        if (object2 != null && (n4 = ((Integer)object2).intValue()) != (n3 = -1) && object != null && (n4 = ((Integer)object).intValue()) != n3) {
            int n7;
            int n8;
            pr0_1 pr0_12;
            boolean bl3;
            object6 = component.getSubcomponents();
            if (object6 != null) {
                n3 = (Integer)object2;
                object6 = (Subcomponent)((p83_0)object6).remove(n3);
            }
            if (object5 != null) {
                int n10 = -1;
                n4 = 0;
                object6 = null;
                n3 = 0;
                object3 = null;
                bl3 = false;
                pr0_12 = null;
                n8 = 0;
                component2 = null;
                n7 = 0;
                long l2 = 0L;
                int n14 = 1;
                object5 = subcomponent;
                subcomponent2 = Subcomponent.copy$default(subcomponent, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l2, null, null, false, null, n10, n14, null);
                object5 = subcomponent2;
            } else {
                object5 = null;
            }
            if (subcomponent != null && (object6 = subcomponent.getResourceOwner()) != null) {
                object3 = bl2;
                ((com.ril.ajio.services.data.fleek.feedModel.ResourceOwner)object6).setFollowed((Boolean)object3);
            }
            n4 = 0;
            n3 = 0;
            object3 = null;
            bl3 = false;
            pr0_12 = null;
            n8 = 0;
            subcomponent2 = null;
            component2 = null;
            n7 = 131071;
            object4 = object5;
            object5 = component;
            object5 = com.ril.ajio.services.data.fleek.feedModel.Component.copy$default(component, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, n7, null);
            object6 = ((com.ril.ajio.services.data.fleek.feedModel.Component)object5).getSubcomponents();
            if (object6 != null) {
                n3 = (Integer)object2;
                ((p83_0)object6).add(n3, object4);
            }
            if ((object4 = brandPageModel.getLayout()) != null && (object4 = ((com.ril.ajio.services.data.fleek.brand_page.Layout)object4).getComponents()) != null) {
                n4 = (Integer)object;
                object4 = (com.ril.ajio.services.data.fleek.feedModel.Component)((p83_0)object4).set(n4, object5);
            }
            pr0_12 = null;
            n8 = 7;
            object3 = brandPageModel;
            object4 = BrandPageModel.copy$default(brandPageModel, null, null, null, n8, null);
            object5 = new uD$e((BrandPageModel)object4);
            object4 = this;
            this.G.setValue(object5);
            object6 = string2;
            n3 = (int)(bl2 ? 1 : 0);
            object5 = dr0_0.h(string2, "BRAND_PAGE", bl2);
            bl3 = true;
            this.V(bl3, (SesActionApiRequestBody)object5);
            if (string2 != null) {
                object5 = md3_0.c(this);
                pr0_12 = new pr0_1(this, bl2, string2, null);
                n4 = 3;
                Ae3.d((i90_0)object5, null, null, pr0_12, n4);
            }
        }
    }

    public final void O(ExploreBrandsPageModel object, boolean bl2, String string2) {
        LinkedHashMap linkedHashMap;
        Serializable serializable;
        if (string2 != null) {
            serializable = bl2;
            linkedHashMap = this.y;
            linkedHashMap.put(string2, serializable);
        }
        this.e0((ExploreBrandsPageModel)object, bl2, string2);
        if (string2 != null) {
            object = md3_0.c(this);
            linkedHashMap = null;
            serializable = new QR0(this, bl2, string2, null);
            int n3 = 3;
            Ae3.d((i90_0)object, null, null, (Function2)((Object)serializable), n3);
        }
        object = dr0_0.h(string2, "EXPLORE_BRANDS", bl2);
        this.V(true, (SesActionApiRequestBody)object);
    }

    /*
     * WARNING - void declaration
     */
    public final void P(FeedEngineData object, boolean bl2, String string2) {
        LinkedHashMap linkedHashMap;
        void var3_4;
        Object object2 = "feedEngineData";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        if (var3_4 != null) {
            object2 = bl2;
            linkedHashMap = this.y;
            linkedHashMap.put(var3_4, object2);
            this.L((FeedEngineData)object, bl2, (String)var3_4);
            object = dr0_0.h((String)var3_4, "FEED", bl2);
            boolean bl3 = true;
            this.V(bl3, (SesActionApiRequestBody)object);
        }
        if (var3_4 != null) {
            object = md3_0.c(this);
            linkedHashMap = null;
            object2 = new rr0_1(this, bl2, (String)var3_4, null);
            int n3 = 3;
            Ae3.d((i90_0)object, null, null, (Function2)object2, n3);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void Q(p83_0 var1_1, boolean var2_2, Subcomponent var3_3, String var4_4, int var5_5, String var6_6) {
        var7_7 = this;
        var8_8 = var1_1;
        var9_9 = var2_2;
        var10_10 = var3_3;
        var11_11 = var4_4;
        var12_12 = var5_5;
        var13_13 = var6_6;
        Intrinsics.checkNotNullParameter(var3_3, "subComponent");
        var14_14 = null;
        if (var4_4 == null) ** GOTO lbl-1000
        if (var6_6 != null) {
            var15_15 = var2_2;
            var16_16 = this.x;
            var16_16.put(var6_6, var15_15);
        }
        if (var12_12 != (var17_17 = -1)) {
            var10_10.setLiked(var9_9);
            if (var9_9) {
                var15_15 = var3_3.getLikesCount();
                if (var15_15 != null) {
                    var17_17 = var15_15.intValue();
                } else {
                    var17_17 = 0;
                    var15_15 = null;
                }
                ++var17_17;
            } else {
                var15_15 = var3_3.getLikesCount();
                if (var15_15 != null) {
                    var17_17 = var15_15.intValue();
                } else {
                    var17_17 = 0;
                    var15_15 = null;
                }
                var17_17 += -1;
            }
            var15_15 = var17_17;
            var10_10.setLikesCount((Integer)var15_15);
            var18_18 = -1;
            var17_17 = 0;
            var15_15 = null;
            var16_16 = null;
            var19_19 = 0L;
            var21_20 = 1;
            var22_21 = false;
            var10_10 = null;
            var14_14 = var3_3;
            var14_14 = Subcomponent.copy$default(var3_3, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var19_19, null, null, false, null, var18_18, var21_20, null);
            if (var8_8 != null) {
                var15_15 = (Subcomponent)var8_8.remove(var12_12);
            }
            if (var8_8 != null) {
                var8_8.add(var12_12, var14_14);
            }
            var23_22 = var7_7.K0;
            var23_22.setValue(var8_8);
        } else lbl-1000:
        // 2 sources

        {
            var22_21 = false;
            var10_10 = null;
        }
        var8_8 = dr0_0.i(var13_13, var11_11, "BRAND_PAGE", var9_9);
        var7_7.V(false, (SesActionApiRequestBody)var8_8);
        var8_8 = var7_7.z;
        var10_10 = var8_8.getValue();
        var22_21 = var10_10 instanceof HK0$d;
        if (var22_21) {
            var8_8 = var8_8.getValue();
            Intrinsics.checkNotNull(var8_8, "null cannot be cast to non-null type com.ril.ajio.fleek.ui.composable.home.feed.FeedViewState.SUCCESS");
            var8_8 = (HK0$d)var8_8;
            var10_10 = var8_8.a;
            if (var10_10 != null) {
                var14_14 = null;
                var8_8 = this;
                var9_9 = var2_2;
                var23_22 = var6_6;
                var11_11 = var4_4;
                var13_13 = null;
                this.R((FeedEngineData)var10_10, var2_2, var6_6, var4_4, false);
            }
        }
    }

    public final void R(FeedEngineData feedEngineData, boolean bl2, String string2, String string3, boolean bl3) {
        dr0_0 dr0_02 = this;
        boolean bl4 = bl2;
        String string4 = string2;
        Object object = "feedEngineData";
        Object object2 = feedEngineData;
        Intrinsics.checkNotNullParameter(feedEngineData, (String)object);
        if (string2 != null) {
            Object object3;
            int n3;
            p83_0 p83_02;
            boolean bl5;
            Object object4;
            object = bl2;
            this.x.put(string2, object);
            object = new p83_0();
            Object object5 = feedEngineData.getLayout();
            if (object5 != null && (object5 = ((com.ril.ajio.services.data.fleek.feedModel.Layout)object5).getComponents()) != null) {
                object5 = ((p83_0)object5).listIterator();
                while (true) {
                    int n4;
                    Object object6;
                    boolean bl6;
                    Object object7;
                    String string5;
                    object4 = object5;
                    object4 = (ob3_2)object5;
                    bl5 = ((ob3_2)object4).hasNext();
                    if (!bl5) break;
                    object4 = (com.ril.ajio.services.data.fleek.feedModel.Component)((ob3_2)object4).next();
                    p83_02 = new p83_0();
                    if (object4 != null) {
                        string5 = ((com.ril.ajio.services.data.fleek.feedModel.Component)object4).getPostId();
                    } else {
                        n3 = 0;
                        string5 = null;
                    }
                    n3 = (int)(Intrinsics.areEqual(string5, string4) ? 1 : 0);
                    if (n3 != 0) {
                        n3 = 1;
                        if (object4 != null && (object3 = ((com.ril.ajio.services.data.fleek.feedModel.Component)object4).getSubcomponent()) != null) {
                            object3 = ((p83_0)object3).listIterator();
                            while (true) {
                                object7 = object3;
                                object7 = (ob3_2)object3;
                                bl6 = ((ob3_2)object7).hasNext();
                                if (bl6) {
                                    int n7;
                                    object6 = object7 = ((ob3_2)object7).next();
                                    object6 = (Subcomponent)object7;
                                    if (object6 != null) {
                                        ((Subcomponent)object6).setLiked(bl4);
                                    }
                                    if (object6 != null) {
                                        if (bl4) {
                                            object7 = ((Subcomponent)object6).getLikesCount();
                                            if (object7 != null) {
                                                n7 = (Integer)object7;
                                            } else {
                                                n7 = 0;
                                                object7 = null;
                                            }
                                            n7 += n3;
                                        } else {
                                            object7 = ((Subcomponent)object6).getLikesCount();
                                            if (object7 != null) {
                                                n7 = (Integer)object7;
                                            } else {
                                                n7 = 0;
                                                object7 = null;
                                            }
                                            if (n7 <= 0) {
                                                n7 = 0;
                                                object7 = null;
                                            } else {
                                                object7 = ((Subcomponent)object6).getLikesCount();
                                                if (object7 != null) {
                                                    n7 = (Integer)object7;
                                                } else {
                                                    n7 = 0;
                                                    object7 = null;
                                                }
                                                n7 -= n3;
                                            }
                                        }
                                        object7 = n7;
                                        ((Subcomponent)object6).setLikesCount((Integer)object7);
                                    }
                                    if (object6 != null) {
                                        int n8 = -1;
                                        n4 = 0;
                                        long l2 = 0L;
                                        int n10 = 1;
                                        object7 = Subcomponent.copy$default((Subcomponent)object6, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l2, null, null, false, null, n8, n10, null);
                                    } else {
                                        n7 = 0;
                                        object7 = null;
                                    }
                                    p83_02.add(object7);
                                    continue;
                                }
                                break;
                            }
                        }
                    } else {
                        n3 = 0;
                        string5 = null;
                    }
                    if (object4 != null) {
                        bl6 = false;
                        object6 = null;
                        n4 = 131071;
                        object7 = object4;
                        object3 = com.ril.ajio.services.data.fleek.feedModel.Component.copy$default((com.ril.ajio.services.data.fleek.feedModel.Component)object4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, n4, null);
                    } else {
                        object3 = null;
                    }
                    if (object3 != null) {
                        if (n3 == 0) {
                            if (object4 != null) {
                                p83_02 = ((com.ril.ajio.services.data.fleek.feedModel.Component)object4).getSubcomponent();
                            } else {
                                bl5 = false;
                                p83_02 = null;
                            }
                        }
                        ((com.ril.ajio.services.data.fleek.feedModel.Component)object3).setSubcomponent(p83_02);
                    }
                    ((p83_0)object).add(object3);
                }
            }
            if ((object5 = feedEngineData.getLayout()) != null) {
                ((com.ril.ajio.services.data.fleek.feedModel.Layout)object5).setComponents((p83_0)object);
            }
            bl5 = false;
            p83_02 = null;
            object5 = null;
            object4 = null;
            n3 = 15;
            object3 = null;
            object2 = feedEngineData;
            object2 = FeedEngineData.copy$default(feedEngineData, null, null, null, null, n3, null);
            object = new HK0$d((FeedEngineData)object2);
            object2 = dr0_02.z;
            ((h83_0)object2).setValue(object);
            if (bl3) {
                object = "FEED";
                object2 = string3;
                SesActionApiRequestBody sesActionApiRequestBody = dr0_0.i(string4, string3, (String)object, bl4);
                dr0_02.V(false, sesActionApiRequestBody);
            }
        }
    }

    public final void S(ef2_1 object, String string2, int n3) {
        Object object2 = "event";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = object instanceof ef2_1.a;
        if (bl2) {
            if (string2 != null) {
                object = md3_0.c(this);
                object2 = new lr0_1(n3, null, this, string2);
                int n4 = 3;
                Ae3.d((i90_0)object, null, null, (Function2)object2, n4);
            }
            return;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }

    public final void U() {
        Object object = (UserInformation)this.z0.getValue();
        boolean bl2 = ((UserInformation)object).isUserOnline();
        if (!bl2) {
            return;
        }
        object = this.s0;
        if (object != null && !(bl2 = object.isEmpty())) {
            object = md3_0.c(this);
            DR0$i dR0$i = new DR0$i(null, this);
            int n3 = 3;
            Ae3.d((i90_0)object, null, null, dR0$i, n3);
        }
    }

    public final void V(boolean bl2, SesActionApiRequestBody sesActionApiRequestBody) {
        aW aW2 = md3_0.c(this);
        DR0$j dR0$j = new DR0$j(this, bl2, sesActionApiRequestBody, null);
        Ae3.d(aW2, null, null, dR0$j, 3);
    }

    public final void V1(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "shareLink");
        this.p.k(string2);
    }

    public final void W(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "action");
        Intrinsics.checkNotNullParameter(string3, "screenName");
        aW aW2 = md3_0.c(this);
        DR0$k dR0$k = new DR0$k(string2, string3, null);
        Ae3.d(aW2, null, null, dR0$k, 3);
    }

    public final void X(String object, List object2) {
        Object object3 = "brandName";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        if (object2 != null) {
            object3 = object2;
            object3 = (Collection)object2;
            int n3 = object3.isEmpty();
            int n4 = 1;
            if ((n3 ^= n4) == n4) {
                Object object4;
                Resource resource;
                object3 = new ArrayList();
                object2 = ((Iterable)object2).iterator();
                while ((n4 = object2.hasNext()) != 0) {
                    resource = (Resource)object2.next();
                    object4 = new Product();
                    List list = null;
                    String string2 = resource != null ? resource.getId() : null;
                    ((Product)object4).setId(string2);
                    string2 = resource != null ? resource.getName() : null;
                    ((Product)object4).setName(string2);
                    if (resource != null) {
                        list = resource.getImages();
                    }
                    ((Product)object4).setImages(list);
                    ((ArrayList)object3).add(object4);
                }
                object2 = new Message();
                ((Message)object2).what = n4 = 1008;
                resource = new JSONObject();
                resource.put("productImpression", object3);
                object4 = "fleek_insert_explore_brand_product_";
                object3 = new StringBuilder((String)object4);
                ((StringBuilder)object3).append((String)object);
                object = ((StringBuilder)object3).toString();
                resource.put("listName", object);
                resource.put("sizeText", "");
                n3 = 0;
                resource.put("isPLP", false);
                object3 = "explore brands screen";
                resource.put("screenName", object3);
                resource.put("screenType", object3);
                ((Message)object2).obj = resource;
                object = vg_1.a(AnalyticsGAEventHandler.Companion, (Message)object2);
                object2 = this.P0;
                ((AnalyticsGAEventHandler)((Object)object)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object2);
            }
        }
    }

    public final void Y(String object, String object2, List object3) {
        Intrinsics.checkNotNullParameter(object, "brandName");
        Object object4 = "productWidget";
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        if (object3 != null) {
            object4 = object3;
            object4 = (Collection)object3;
            int n3 = object4.isEmpty();
            int n4 = 1;
            if ((n3 ^= n4) == n4) {
                object4 = new Message();
                ((Message)object4).what = n4 = 1001;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("productImpression", object3);
                object3 = "fleek_insert_";
                String string2 = "_";
                object = UX.c((String)object3, (String)object, string2, (String)object2);
                jSONObject.put("listName", object);
                jSONObject.put("sizeText", (Object)"");
                jSONObject.put("isPLP", false);
                object2 = "brand screen";
                jSONObject.put("screenName", object2);
                jSONObject.put("screenType", object2);
                ((Message)object4).obj = jSONObject;
                object = vg_1.a(AnalyticsGAEventHandler.Companion, (Message)object4);
                object2 = this.P0;
                ((AnalyticsGAEventHandler)((Object)object)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object2);
            }
        }
    }

    public final void Z(boolean bl2) {
        Boolean bl3 = bl2;
        this.r.setValue(bl3);
    }

    public final void a0(hv1_1 hv1_12) {
        Intrinsics.checkNotNullParameter((Object)hv1_12, "<set-?>");
        this.k.setValue((Object)hv1_12);
    }

    public final void b0(hv1_1 hv1_12) {
        Intrinsics.checkNotNullParameter((Object)hv1_12, "<set-?>");
        this.h.setValue((Object)hv1_12);
    }

    public final void c0(String object, String object2, ShareActionRequestBody shareActionRequestBody, String string2) {
        Intrinsics.checkNotNullParameter(object, "shareMsg");
        Intrinsics.checkNotNullParameter(object2, "imageUri");
        String string3 = "shareInfoObj";
        Intrinsics.checkNotNullParameter(shareActionRequestBody, string3);
        boolean bl2 = this.H0;
        if (bl2) {
            return;
        }
        this.H0 = true;
        this.q = string2;
        d23_0.c((String)object, (String)object2, this);
        object = md3_0.c(this);
        object2 = new DR0$l(this, shareActionRequestBody, null);
        Ae3.d((i90_0)object, null, null, (Function2)object2, 3);
    }

    public final void d0() {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.G;
        Object object = parcelableSnapshotMutableState.getValue();
        parcelableSnapshotMutableState.setValue(object);
    }

    public final void e0(ExploreBrandsPageModel exploreBrandsPageModel, boolean bl2, String string2) {
        int n3;
        boolean bl3;
        Object object;
        Object object2;
        Object object3;
        boolean bl4;
        Object object4;
        Object object5;
        Object object6 = new p83_0();
        ExploreBrandsPageModel exploreBrandsPageModel2 = null;
        if (exploreBrandsPageModel != null && (object5 = exploreBrandsPageModel.getLayout()) != null && (object5 = ((Layout)object5).getComponents()) != null) {
            object5 = ((p83_0)object5).listIterator();
            while (true) {
                int n4;
                Boolean bl5;
                String string3;
                boolean bl6;
                Object object7;
                object4 = object5;
                object4 = (ob3_2)object5;
                bl4 = ((ob3_2)object4).hasNext();
                if (!bl4) break;
                object3 = object4 = ((ob3_2)object4).next();
                object3 = (Component)object4;
                object4 = new p83_0();
                if (object3 != null && (object7 = ((Component)object3).getSubcomponents()) != null) {
                    object7 = ((p83_0)object7).listIterator();
                    while (true) {
                        object2 = object7;
                        object2 = (ob3_2)object7;
                        bl6 = ((ob3_2)object2).hasNext();
                        if (!bl6) break;
                        object = object2 = ((ob3_2)object2).next();
                        object = (com.ril.ajio.services.data.fleek.explore_brands.Subcomponent)object2;
                        if (object != null && (object2 = ((com.ril.ajio.services.data.fleek.explore_brands.Subcomponent)object).getResourceOwner()) != null) {
                            object2 = ((ResourceOwner)object2).getId();
                            string3 = string2;
                        } else {
                            string3 = string2;
                            bl3 = false;
                            object2 = null;
                        }
                        bl3 = Intrinsics.areEqual(object2, string3);
                        if (bl3 && object != null && (object2 = ((com.ril.ajio.services.data.fleek.explore_brands.Subcomponent)object).getResourceOwner()) != null) {
                            bl5 = bl2;
                            ((ResourceOwner)object2).setFollowed(bl5);
                        }
                        if (object != null) {
                            bl5 = null;
                            bl3 = false;
                            string3 = null;
                            n4 = 0;
                            int n7 = Short.MAX_VALUE;
                            object2 = com.ril.ajio.services.data.fleek.explore_brands.Subcomponent.copy$default((com.ril.ajio.services.data.fleek.explore_brands.Subcomponent)object, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, n7, null);
                        } else {
                            bl3 = false;
                            object2 = null;
                        }
                        ((p83_0)object4).add(object2);
                    }
                }
                if (object3 != null) {
                    string3 = null;
                    n3 = 0;
                    object7 = null;
                    bl3 = false;
                    object2 = null;
                    bl6 = false;
                    object = null;
                    bl5 = null;
                    n4 = 4095;
                    object3 = Component.copy$default((Component)object3, null, null, null, null, null, null, null, null, null, null, false, null, n4, null);
                } else {
                    bl4 = false;
                    object3 = null;
                }
                if (object3 != null) {
                    ((Component)object3).setSubcomponents((p83_0)object4);
                }
                ((p83_0)object6).add(object3);
            }
        }
        if (exploreBrandsPageModel != null && (object5 = exploreBrandsPageModel.getLayout()) != null) {
            ((Layout)object5).setComponents((p83_0)object6);
        }
        if (exploreBrandsPageModel != null) {
            object4 = null;
            bl4 = false;
            object3 = null;
            object5 = null;
            n3 = 15;
            bl3 = false;
            object2 = null;
            object6 = exploreBrandsPageModel;
            exploreBrandsPageModel2 = ExploreBrandsPageModel.copy$default(exploreBrandsPageModel, null, null, null, null, n3, null);
        }
        object = new GH0$d(exploreBrandsPageModel2);
        object6 = this;
        this.E.setValue(object);
    }

    public final void f0(String object, String collection, ArrayList object2) {
        boolean bl2;
        Object object3;
        boolean bl3;
        Intrinsics.checkNotNullParameter(object2, "postIdList");
        Intrinsics.checkNotNullParameter(object, "pageName");
        Intrinsics.checkNotNullParameter(collection, "type");
        String string2 = "STORY";
        int n3 = Intrinsics.areEqual(collection, string2);
        if (n3 == 0) {
            string2 = "POSTS";
        }
        collection = ((ArrayList)object2).iterator();
        while (bl3 = collection.hasNext()) {
            object2 = (String)collection.next();
            object3 = this.q0;
            if (object2 == null) {
                object2 = "";
            }
            long l2 = System.currentTimeMillis();
            Long l3 = l2;
            FleekSeenComponents fleekSeenComponents = new FleekSeenComponents((String)object2, l3, string2, (String)object);
            ((ArrayList)object3).add(fleekSeenComponents);
        }
        object = this.q0;
        collection = new Collection();
        object2 = new ArrayList();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            string2 = object.next();
            object3 = string2;
            object3 = ((FleekSeenComponents)((Object)string2)).getId();
            boolean bl4 = ((HashSet)collection).add(object3);
            if (!bl4) continue;
            ((ArrayList)object2).add(string2);
        }
        object = CollectionsKt.m0((Collection)object2);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type java.util.ArrayList<com.ril.ajio.services.data.fleek.seen_components.FleekSeenComponents>");
        this.q0 = object;
        collection = this.r0;
        this.s0 = object = CollectionsKt.V((Iterable)object, collection);
        object = h40_0.a;
        object = h40_0.w0().getTriggers();
        int n4 = object != null && (object = ((FleekSesConfigs$Triggers)object).getThreshold()) != null ? (Integer)object : 10;
        collection = this.s0;
        n3 = collection.size();
        if (n3 >= n4 && (n4 = (int)(this.v0 ? 1 : 0)) == 0) {
            this.U();
        }
    }

    public final void j(wq0_0 wq0_02) {
        Intrinsics.checkNotNullParameter(wq0_02, "fleekObj");
        aW aW2 = md3_0.c(this);
        DR0$b dR0$b = new DR0$b(wq0_02, this, null);
        Ae3.d(aW2, null, null, dR0$b, 3);
    }

    public final void k(wq0_0 wq0_02) {
        Intrinsics.checkNotNullParameter(wq0_02, "fleekObj");
        aW aW2 = md3_0.c(this);
        DR0$c dR0$c = new DR0$c(wq0_02, this, null);
        Ae3.d(aW2, null, null, dR0$c, 3);
    }

    public final void l(wq0_0 wq0_02) {
        Intrinsics.checkNotNullParameter(wq0_02, "fleekObj");
        aW aW2 = md3_0.c(this);
        DR0$d dR0$d = new DR0$d(wq0_02, this, null);
        Ae3.d(aW2, null, null, dR0$d, 3);
    }

    public final boolean o() {
        return (Boolean)this.r.getValue();
    }

    public final void onCleared() {
        super.onCleared();
        this.b.release();
        Object object = 0;
        this.c.setValue(object);
        object = 0;
        this.f.setValue(object);
        object = hv1_1.IDLE;
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        this.e.setValue(object);
        this.b0((hv1_1)((Object)object));
        Boolean bl2 = Boolean.FALSE;
        this.d.setValue(bl2);
        this.g.setValue(bl2);
        Integer n3 = 0;
        this.i.setValue(n3);
        this.a0((hv1_1)((Object)object));
        this.j.setValue(bl2);
    }

    public final int p() {
        return ((Number)this.i.getValue()).intValue();
    }

    public final void s() {
        aW aW2 = md3_0.c(this);
        DR0$e dR0$e = new DR0$e(null, this);
        Ae3.d(aW2, null, null, dR0$e, 3);
    }

    public final void u() {
        Object object;
        Object object2;
        int n3 = this.v();
        Object object3 = this.e;
        if (n3 == 0 || (n3 = this.v()) != 0 && (n3 = (int)(((Boolean)(object2 = (Boolean)this.d.getValue())).booleanValue() ? 1 : 0)) != 0 && (object2 = (hv1_1)((Object)((h83_0)object3).getValue())) == (object = hv1_1.IDLE)) {
            n3 = this.v();
            object2 = n3 == 0 ? hv1_1.LOADING : hv1_1.PAGINATING;
            object = "<set-?>";
            Intrinsics.checkNotNullParameter(object2, object);
            ((h83_0)object3).setValue(object2);
            AJIOApplication.Companion.getClass();
            object2 = AJIOApplication$a.a();
            n3 = (int)(vV1.e((Context)object2) ? 1 : 0);
            if (n3 == 0) {
                object2 = new HK0$a("No internet");
                this.z.setValue(object2);
                return;
            }
            object2 = md3_0.c(this);
            object = null;
            object3 = new DR0$f(null, this);
            int n4 = 3;
            Ae3.d((i90_0)object2, null, null, (Function2)object3, n4);
        }
    }

    public final int v() {
        return ((Number)this.c.getValue()).intValue();
    }
}

