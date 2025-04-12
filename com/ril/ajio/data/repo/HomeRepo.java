/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.webkit.URLUtil
 *  org.json.JSONArray
 */
package com.ril.ajio.data.repo;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.gson.JsonObject;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.data.ApiFetchAndCallConditions;
import com.ril.ajio.data.model.CMSConfigInitializer;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.data.repo.HomeRepo$Companion;
import com.ril.ajio.data.repo.HomeRepo$WhenMappings;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.services.data.CouponPromotion.CouponPromotion;
import com.ril.ajio.services.data.Home.AppMedia;
import com.ril.ajio.services.data.Home.AppMedia2;
import com.ril.ajio.services.data.Home.BottomNavigationData;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.Child;
import com.ril.ajio.services.data.Home.NavigationDataClass;
import com.ril.ajio.services.data.Home.NavigationNode;
import com.ril.ajio.services.data.Home.NavigationParent;
import com.ril.ajio.services.data.returnexchange.ReturnExchange;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import com.ril.ajio.services.network.api.AjioHomeApi;
import com.ril.ajio.services.network.api.CategoryNavigationApi;
import com.ril.ajio.services.network.api.OrderListApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import com.ril.ajio.services.utils.JsonUtils;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.b;
import org.json.JSONArray;

public final class HomeRepo
implements BaseRepo {
    public static final int $stable;
    public static final HomeRepo$Companion Companion;
    private static final String clientType;
    private static final String clientVersion;
    private final jo_2 appPreferences;
    private final CategoryNavigationApi categoryNavigationApi;
    private final String channel;
    private final t30_0 compositeDisposable;
    private final AjioHomeApi homeApi;
    private final OrderListApi orderListApi;
    private final String platform;
    private final String[] requestIds;
    private final String tenantId;
    private final UserInformation userInformation;

    static {
        HomeRepo$Companion homeRepo$Companion;
        Companion = homeRepo$Companion = new HomeRepo$Companion(null);
        $stable = 8;
        clientType = "Android";
        clientVersion = em_1.a(AJIOApplication.Companion);
    }

    public HomeRepo(Context stringArray) {
        Intrinsics.checkNotNullParameter(stringArray, "context");
        Object object = UserInformation.getInstance((Context)stringArray);
        this.userInformation = object;
        object = AjioApiConnector.INSTANCE;
        Object object2 = ((AjioApiConnector)object).getOrderListApi();
        this.orderListApi = object2;
        this.compositeDisposable = object2 = new t30_0();
        this.appPreferences = object2 = new jo_2((Context)stringArray);
        stringArray = ((AjioApiConnector)object).getHomeApi();
        this.homeApi = stringArray;
        stringArray = ((AjioApiConnector)object).getCategoryNavigation();
        this.categoryNavigationApi = stringArray;
        this.channel = "Android";
        this.platform = "MOBILE";
        this.tenantId = "AJIO";
        stringArray = new String[]{"InitiateCouponBuyRequest", "CouponPromotionRequest", "HomeCategoryContent"};
        this.requestIds = stringArray;
    }

    public static /* synthetic */ Object A(HomeRepo homeRepo, String string2, String string3, dl2_2 dl2_22) {
        return HomeRepo.callCMSBottomTabsApi$lambda$39(homeRepo, string2, string3, dl2_22);
    }

    public static /* synthetic */ Unit B(Throwable throwable) {
        return HomeRepo.fetchCMSSetCallBottomTabsApi$lambda$36(throwable);
    }

    public static /* synthetic */ BottomNavigationData C(HomeRepo homeRepo) {
        return HomeRepo.fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$44(homeRepo);
    }

    public static /* synthetic */ Unit D(HomeRepo homeRepo, zr1_1 zr1_12, ApiFetchAndCallConditions apiFetchAndCallConditions) {
        return HomeRepo.fetchSetCallBottomTabsApi$lambda$18(homeRepo, zr1_12, apiFetchAndCallConditions);
    }

    public static /* synthetic */ Unit E(zr1_1 zr1_12, BottomNavigationData bottomNavigationData) {
        return HomeRepo.fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$24(zr1_12, bottomNavigationData);
    }

    public static /* synthetic */ Unit F(zr1_1 zr1_12, BottomNavigationData bottomNavigationData) {
        return HomeRepo.fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$29(zr1_12, bottomNavigationData);
    }

    public static /* synthetic */ void G(at_1 at_12, Object object) {
        HomeRepo.fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$9(at_12, object);
    }

    public static /* synthetic */ void H(t81_0 t81_02, Object object) {
        HomeRepo.fetchSetCallBottomTabsApi$lambda$21(t81_02, object);
    }

    public static /* synthetic */ Object I(String string2, Throwable throwable) {
        return HomeRepo.callCMSBottomTabsApi$lambda$41(string2, throwable);
    }

    public static /* synthetic */ BottomNavigationData J(HomeRepo homeRepo) {
        return HomeRepo.fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$28(homeRepo);
    }

    public static /* synthetic */ Object K(k81_0 k81_02, Object object) {
        return HomeRepo.callCMSBottomTabsApi$lambda$40(k81_02, object);
    }

    public static /* synthetic */ DataCallback L(b81_0 b81_02, Object object) {
        return HomeRepo.getAjioCouponPromotions$lambda$1(b81_02, object);
    }

    public static /* synthetic */ void M(G81 g81, Object object) {
        HomeRepo.fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$48(g81, object);
    }

    public static /* synthetic */ Unit N(Throwable throwable) {
        return HomeRepo.fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$10(throwable);
    }

    public static /* synthetic */ void O(o81_0 o81_02, Object object) {
        HomeRepo.fetchCMSSetCallLuxeBottomTabsApi$lambda$56(o81_02, object);
    }

    public static /* synthetic */ ApiFetchAndCallConditions P(HomeRepo homeRepo) {
        return HomeRepo.fetchCMSSetCallLuxeBottomTabsApi$lambda$43(homeRepo);
    }

    public static /* synthetic */ int Q(Child child, Child child2) {
        return HomeRepo.isBottomNavigationDataValidated$lambda$38(child, child2);
    }

    public static /* synthetic */ BottomNavigationData R(HomeRepo homeRepo) {
        return HomeRepo.fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$7(homeRepo);
    }

    public static /* synthetic */ void S(g81_0 g81_02, Object object) {
        HomeRepo.fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$11(g81_02, object);
    }

    public static /* synthetic */ void T(d81_0 d81_02, Object object) {
        HomeRepo.fetchCMSSetCallBottomTabsApi$lambda$37(d81_02, object);
    }

    public static /* synthetic */ void U(v81_0 v81_02, Object object) {
        HomeRepo.fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$30(v81_02, object);
    }

    public static /* synthetic */ DataCallback V(x81_0 x81_02, Object object) {
        return HomeRepo.initiateBuyCouponRequest$lambda$4(x81_02, object);
    }

    public static /* synthetic */ void W(qa_1 qa_12, Object object) {
        HomeRepo.fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$25(qa_12, object);
    }

    public static /* synthetic */ DataCallback X(Throwable throwable) {
        return HomeRepo.getAjioCouponPromotions$lambda$2(throwable);
    }

    public static /* synthetic */ DataCallback Y(dl2_2 dl2_22) {
        return HomeRepo.initiateBuyCouponRequest$lambda$3(dl2_22);
    }

    public static /* synthetic */ Unit Z(zr1_1 zr1_12, BottomNavigationData bottomNavigationData) {
        return HomeRepo.fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$8(zr1_12, bottomNavigationData);
    }

    public static /* synthetic */ Unit a(Throwable throwable) {
        return HomeRepo.fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$26(throwable);
    }

    public static /* synthetic */ Unit a0(zr1_1 zr1_12, BottomNavigationData bottomNavigationData) {
        return HomeRepo.fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$50(zr1_12, bottomNavigationData);
    }

    public static /* synthetic */ BottomNavigationData b(HomeRepo homeRepo) {
        return HomeRepo.fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$23(homeRepo);
    }

    public static /* synthetic */ void b0(st_0 st_02, Object object) {
        HomeRepo.fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$51(st_02, object);
    }

    public static /* synthetic */ Unit c(Throwable throwable) {
        return HomeRepo.fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$15(throwable);
    }

    public static /* synthetic */ void c0(wq0_1 wq0_12, Object object) {
        HomeRepo.fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$27(wq0_12, object);
    }

    private static final Object callCMSBottomTabsApi$lambda$39(HomeRepo object, String string2, String object2, dl2_2 object3) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$store");
        Intrinsics.checkNotNullParameter(object2, "$screenName");
        Intrinsics.checkNotNullParameter(object3, "bottomTabsResp");
        Object object4 = (NavigationParent)((dl2_2)object3).b;
        Object object5 = ((dl2_2)object3).a;
        boolean bl2 = ((cl2_2)object5).d();
        if (bl2 && object4 != null) {
            object2 = new BottomNavigationData();
            object3 = ((NavigationParent)object4).getData();
            ((BottomNavigationData)object2).setData((NavigationDataClass)object3);
            ((HomeRepo)object).setCMSBottomTabsPreference((BottomNavigationData)object2, string2);
            object = Unit.a;
        } else {
            object4 = ApiErrorRepo.INSTANCE;
            boolean bl3 = true;
            String string3 = "Forward";
            String string4 = "BackGround_CMS_BOTTOM_TABS_REQUEST";
            object5 = object3;
            object = ((ApiErrorRepo)object4).getApiError((dl2_2)object3, string4, bl3, (String)object2, string3);
        }
        return object;
    }

    private static final Object callCMSBottomTabsApi$lambda$40(Function1 function1, Object object) {
        return oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final Object callCMSBottomTabsApi$lambda$41(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "$screenName");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return ApiErrorRepo.INSTANCE.logApiException(throwable, "BackGround_CMS_BOTTOM_TABS_REQUEST", true, string2, "Forward");
    }

    public static /* synthetic */ Unit d(Throwable throwable) {
        return HomeRepo.fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$31(throwable);
    }

    public static /* synthetic */ Unit e(Throwable throwable) {
        return HomeRepo.fetchCMSSetCallLuxeBottomTabsApi$lambda$57(throwable);
    }

    public static /* synthetic */ BottomNavigationData f(HomeRepo homeRepo) {
        return HomeRepo.fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$49(homeRepo);
    }

    private final void fetchCMSSetCallBottomTabsApi(zr1_1 object) {
        t30_0 t30_02 = this.compositeDisposable;
        Object object2 = new A81(this);
        Object object3 = new o53_0((Callable)object2);
        object2 = qt2_2.c;
        object2 = ((g53_0)object3).h((Scheduler)object2);
        object3 = ti_2.a();
        object2 = ((g53_0)object2).e((Scheduler)object3);
        object3 = new B81(this, (zr1_1)object);
        object = new C81((B81)object3);
        object3 = new Object();
        mf0_0 mf0_02 = new mf0_0(object3);
        object = ((g53_0)object2).f((o60_0)object, mf0_02);
        t30_02.b((yr0_2)object);
    }

    private static final ApiFetchAndCallConditions fetchCMSSetCallBottomTabsApi$lambda$22(HomeRepo object) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        object = ((HomeRepo)object).appPreferences;
        String string2 = "cms_bottom_tab_bar_new_nav";
        String string3 = "";
        object = ((sw_0)object).getPreference(string2, string3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            return ApiFetchAndCallConditions.SetLiveDataAndPreference;
        }
        return ApiFetchAndCallConditions.SetLiveDataAndCallApi;
    }

    private static final Unit fetchCMSSetCallBottomTabsApi$lambda$34(HomeRepo object, zr1_1 object2, ApiFetchAndCallConditions object3) {
        Object object4;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object5 = "$bottomNavigationObservable";
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        if (object3 == null) {
            object4 = -1;
        } else {
            object5 = HomeRepo$WhenMappings.$EnumSwitchMapping$0;
            object4 = ((Enum)object3).ordinal();
            object4 = object5[object4];
        }
        int n3 = 1;
        if (object4 != n3) {
            n3 = 2;
            if (object4 == n3) {
                object3 = ((HomeRepo)object).compositeDisposable;
                object5 = new u81_0((HomeRepo)object);
                object = new o53_0((Callable)object5);
                object5 = qt2_2.c;
                object = ((g53_0)object).h((Scheduler)object5);
                object5 = ti_2.a();
                object = ((g53_0)object).e((Scheduler)object5);
                object5 = new v81_0(object2, 0);
                object2 = new w81((v81_0)object5);
                int n4 = 1;
                object5 = new ar0_0(n4);
                zU zU2 = new zU(object5);
                object = ((g53_0)object).f((o60_0)object2, zU2);
                ((t30_0)object3).b((yr0_2)object);
            }
        } else {
            object3 = ((HomeRepo)object).compositeDisposable;
            object5 = new s81((HomeRepo)object);
            object = new o53_0((Callable)object5);
            object5 = qt2_2.c;
            object = ((g53_0)object).h((Scheduler)object5);
            object5 = ti_2.a();
            object = ((g53_0)object).e((Scheduler)object5);
            object5 = new qa_1(object2, 2);
            object2 = new vq0_1(object5, 1);
            int n7 = 1;
            object5 = new wq0_1(n7);
            ze0_0 ze0_02 = new ze0_0(object5);
            object = ((g53_0)object).f((o60_0)object2, ze0_02);
            ((t30_0)object3).b((yr0_2)object);
        }
        return Unit.a;
    }

    private static final BottomNavigationData fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$23(HomeRepo object) {
        Object object2 = "$this_run";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = AJIOApplication.Companion;
        object2.getClass();
        object2 = AJIOApplication$a.a();
        object2 = object2.getAssets();
        Object object3 = super.getAssetNameForStoreBottomBarCMSAjio();
        object2 = object2.open((String)object3);
        object3 = "open(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        int n3 = ((InputStream)object2).available();
        object3 = new byte[n3];
        ((InputStream)object2).read((byte[])object3);
        ((InputStream)object2).close();
        Charset charset = Charsets.UTF_8;
        try {
            object2 = new String((byte[])object3, charset);
        }
        catch (IOException iOException) {
            object2 = null;
        }
        object = ((HomeRepo)object).appPreferences;
        if (object2 != null) {
            object3 = "cms_bottom_tab_bar_new_nav";
            ((sw_0)object).putPreference((String)object3, (String)object2);
        } else {
            object.getClass();
        }
        return (BottomNavigationData)JsonUtils.fromJson((String)object2, BottomNavigationData.class);
    }

    private static final Unit fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$24(zr1_1 zr1_12, BottomNavigationData object) {
        Intrinsics.checkNotNullParameter(zr1_12, "$bottomNavigationObservable");
        DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
        Intrinsics.checkNotNull(object);
        object = dataCallback$Companion.onSuccess(object);
        zr1_12.k(object);
        return Unit.a;
    }

    private static final void fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$25(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    private static final Unit fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$26(Throwable throwable) {
        return Unit.a;
    }

    private static final void fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$27(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    private static final BottomNavigationData fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$28(HomeRepo homeRepo) {
        Intrinsics.checkNotNullParameter(homeRepo, "$this_run");
        return (BottomNavigationData)JsonUtils.fromJson(homeRepo.appPreferences.getPreference("cms_bottom_tab_bar_new_nav", ""), BottomNavigationData.class);
    }

    private static final Unit fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$29(zr1_1 zr1_12, BottomNavigationData object) {
        Intrinsics.checkNotNullParameter(zr1_12, "$bottomNavigationObservable");
        DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
        Intrinsics.checkNotNull(object);
        object = dataCallback$Companion.onSuccess(object);
        zr1_12.k(object);
        return Unit.a;
    }

    private static final void fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$30(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    private static final Unit fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$31(Throwable throwable) {
        return Unit.a;
    }

    private static final void fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$32(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    private static final void fetchCMSSetCallBottomTabsApi$lambda$35(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    private static final Unit fetchCMSSetCallBottomTabsApi$lambda$36(Throwable throwable) {
        yn3_0.a.b(throwable);
        return Unit.a;
    }

    private static final void fetchCMSSetCallBottomTabsApi$lambda$37(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    private final void fetchCMSSetCallLuxeBottomTabsApi(zr1_1 object) {
        t30_0 t30_02 = this.compositeDisposable;
        Object object2 = new n81_0(this);
        Object object3 = new o53_0((Callable)object2);
        object2 = qt2_2.c;
        object2 = ((g53_0)object3).h((Scheduler)object2);
        object3 = ti_2.a();
        object2 = ((g53_0)object2).e((Scheduler)object3);
        object3 = new o81_0(this, (zr1_1)object);
        object = new p81_0((o81_0)object3);
        object3 = new q81_0(0);
        r81 r812 = new r81((q81_0)object3);
        object = ((g53_0)object2).f((o60_0)object, r812);
        t30_02.b((yr0_2)object);
    }

    private static final ApiFetchAndCallConditions fetchCMSSetCallLuxeBottomTabsApi$lambda$43(HomeRepo object) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        object = ((HomeRepo)object).appPreferences;
        String string2 = "luxe_cms_bottom_tab_bar_new_nav";
        String string3 = "";
        object = ((sw_0)object).getPreference(string2, string3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        object = bl2 ? ApiFetchAndCallConditions.SetLiveDataAndPreference : ApiFetchAndCallConditions.SetLiveDataAndCallApi;
        return object;
    }

    private static final Unit fetchCMSSetCallLuxeBottomTabsApi$lambda$55(HomeRepo object, zr1_1 object2, ApiFetchAndCallConditions object3) {
        Object object4;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object5 = "$luxeBottomNavigationObservable";
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        if (object3 == null) {
            object4 = -1;
        } else {
            object5 = HomeRepo$WhenMappings.$EnumSwitchMapping$0;
            object4 = ((Enum)object3).ordinal();
            object4 = object5[object4];
        }
        int n3 = 1;
        if (object4 != n3) {
            n3 = 2;
            if (object4 == n3) {
                object3 = ((HomeRepo)object).compositeDisposable;
                object5 = new Y71((HomeRepo)object);
                object = new o53_0((Callable)object5);
                object5 = qt2_2.c;
                object = ((g53_0)object).h((Scheduler)object5);
                object5 = ti_2.a();
                object = ((g53_0)object).e((Scheduler)object5);
                object5 = new st_0(object2, 1);
                object2 = new Z71(object5);
                int n4 = 1;
                object5 = new he0_2(n4);
                a81_0 a81_02 = new a81_0((he0_2)object5);
                object = ((g53_0)object).f((o60_0)object2, a81_02);
                ((t30_0)object3).b((yr0_2)object);
            }
        } else {
            object3 = ((HomeRepo)object).compositeDisposable;
            object5 = new jv_0(object, 1);
            object = new o53_0((Callable)object5);
            object5 = qt2_2.c;
            object = ((g53_0)object).h((Scheduler)object5);
            object5 = ti_2.a();
            object = ((g53_0)object).e((Scheduler)object5);
            boolean bl2 = false;
            object5 = new f81_0(object2, 0);
            object2 = new of0_0(object5);
            object5 = new Object();
            h81_0 h81_02 = new h81_0((G81)object5);
            object = ((g53_0)object).f((o60_0)object2, h81_02);
            ((t30_0)object3).b((yr0_2)object);
        }
        return Unit.a;
    }

    private static final BottomNavigationData fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$44(HomeRepo object) {
        Object object2 = "$this_run";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = AJIOApplication.Companion;
        object2.getClass();
        object2 = AJIOApplication$a.a();
        object2 = object2.getAssets();
        Object object3 = super.getAssetNameForStoreBottomBarCMSLuxe();
        object2 = object2.open((String)object3);
        object3 = "open(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        int n3 = ((InputStream)object2).available();
        object3 = new byte[n3];
        ((InputStream)object2).read((byte[])object3);
        ((InputStream)object2).close();
        Charset charset = Charsets.UTF_8;
        try {
            object2 = new String((byte[])object3, charset);
        }
        catch (IOException iOException) {
            object2 = null;
        }
        object = ((HomeRepo)object).appPreferences;
        if (object2 != null) {
            object3 = "luxe_cms_bottom_tab_bar_new_nav";
            ((sw_0)object).putPreference((String)object3, (String)object2);
        } else {
            object.getClass();
        }
        return (BottomNavigationData)JsonUtils.fromJson((String)object2, BottomNavigationData.class);
    }

    private static final Unit fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$45(zr1_1 zr1_12, BottomNavigationData object) {
        Intrinsics.checkNotNullParameter(zr1_12, "$luxeBottomNavigationObservable");
        DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
        Intrinsics.checkNotNull(object);
        object = dataCallback$Companion.onSuccess(object);
        zr1_12.k(object);
        return Unit.a;
    }

    private static final void fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$46(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    private static final Unit fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$47(Throwable throwable) {
        return Unit.a;
    }

    private static final void fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$48(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    private static final BottomNavigationData fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$49(HomeRepo homeRepo) {
        Intrinsics.checkNotNullParameter(homeRepo, "$this_run");
        return (BottomNavigationData)JsonUtils.fromJson(homeRepo.appPreferences.getPreference("luxe_cms_bottom_tab_bar_new_nav", ""), BottomNavigationData.class);
    }

    private static final Unit fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$50(zr1_1 zr1_12, BottomNavigationData object) {
        Intrinsics.checkNotNullParameter(zr1_12, "$luxeBottomNavigationObservable");
        DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
        Intrinsics.checkNotNull(object);
        object = dataCallback$Companion.onSuccess(object);
        zr1_12.k(object);
        return Unit.a;
    }

    private static final void fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$51(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    private static final Unit fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$52(Throwable throwable) {
        return Unit.a;
    }

    private static final void fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$53(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    private static final void fetchCMSSetCallLuxeBottomTabsApi$lambda$56(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    private static final Unit fetchCMSSetCallLuxeBottomTabsApi$lambda$57(Throwable throwable) {
        yn3_0.a.b(throwable);
        return Unit.a;
    }

    private static final void fetchCMSSetCallLuxeBottomTabsApi$lambda$58(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    private final void fetchSetCallBottomTabsApi(zr1_1 object) {
        t30_0 t30_02 = this.compositeDisposable;
        Object object2 = new X71(this);
        Object object3 = new o53_0((Callable)object2);
        object2 = qt2_2.c;
        object2 = ((g53_0)object3).h((Scheduler)object2);
        object3 = ti_2.a();
        object2 = ((g53_0)object2).e((Scheduler)object3);
        object3 = new e81_0(this, (zr1_1)object);
        object = new l81_0((e81_0)object3);
        object3 = new Object();
        ap0_0 ap0_02 = new ap0_0(object3, 1);
        object = ((g53_0)object2).f((o60_0)object, ap0_02);
        t30_02.b((yr0_2)object);
    }

    private static final Unit fetchSetCallBottomTabsApi$lambda$18(HomeRepo object, zr1_1 object2, ApiFetchAndCallConditions object3) {
        Object object4;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object5 = "$bottomNavigationObservable";
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        if (object3 == null) {
            object4 = -1;
        } else {
            object5 = HomeRepo$WhenMappings.$EnumSwitchMapping$0;
            object4 = ((Enum)object3).ordinal();
            object4 = object5[object4];
        }
        int n3 = 1;
        if (object4 != n3) {
            n3 = 2;
            if (object4 == n3) {
                object3 = ((HomeRepo)object).compositeDisposable;
                object5 = new h81((HomeRepo)object);
                object = new o53_0((Callable)object5);
                object5 = qt2_2.c;
                object = ((g53_0)object).h((Scheduler)object5);
                object5 = ti_2.a();
                object = ((g53_0)object).e((Scheduler)object5);
                object5 = new gt_0(object2, 1);
                object2 = new i81_0((gt_0)object5);
                int n4 = 1;
                object5 = new it_0(n4);
                j81_0 j81_02 = new j81_0((it_0)object5);
                object = ((g53_0)object).f((o60_0)object2, j81_02);
                ((t30_0)object3).b((yr0_2)object);
            }
        } else {
            object3 = ((HomeRepo)object).compositeDisposable;
            object5 = new d81((HomeRepo)object);
            object = new o53_0((Callable)object5);
            object5 = qt2_2.c;
            object = ((g53_0)object).h((Scheduler)object5);
            object5 = ti_2.a();
            object = ((g53_0)object).e((Scheduler)object5);
            object5 = new at_1(object2, 1);
            object2 = new f81(object5);
            boolean bl2 = false;
            object5 = new g81_0(0);
            vo_2 vo_22 = new vo_2(object5);
            object = ((g53_0)object).f((o60_0)object2, vo_22);
            ((t30_0)object3).b((yr0_2)object);
        }
        return Unit.a;
    }

    private static final Unit fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$10(Throwable throwable) {
        return Unit.a;
    }

    private static final void fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$11(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    private static final BottomNavigationData fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$12(HomeRepo homeRepo) {
        Intrinsics.checkNotNullParameter(homeRepo, "$this_run");
        BottomNavigationData bottomNavigationData = (BottomNavigationData)JsonUtils.fromJson(homeRepo.appPreferences.getPreference("bottom_tab_bar", ""), BottomNavigationData.class);
        homeRepo.overrideCloset(bottomNavigationData);
        return bottomNavigationData;
    }

    private static final Unit fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$13(zr1_1 zr1_12, BottomNavigationData object) {
        Intrinsics.checkNotNullParameter(zr1_12, "$bottomNavigationObservable");
        DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
        Intrinsics.checkNotNull(object);
        object = dataCallback$Companion.onSuccess(object);
        zr1_12.k(object);
        return Unit.a;
    }

    private static final void fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$14(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    private static final Unit fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$15(Throwable throwable) {
        return Unit.a;
    }

    private static final void fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$16(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    private static final BottomNavigationData fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$7(HomeRepo homeRepo) {
        Object object = "$this_run";
        Intrinsics.checkNotNullParameter(homeRepo, (String)object);
        object = AJIOApplication.Companion;
        object.getClass();
        object = AJIOApplication$a.a();
        object = object.getAssets();
        Object object2 = "bottomTabBar.json";
        object = object.open((String)object2);
        object2 = "open(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        int n3 = ((InputStream)object).available();
        object2 = new byte[n3];
        ((InputStream)object).read((byte[])object2);
        ((InputStream)object).close();
        Object object3 = Charsets.UTF_8;
        try {
            object = new String((byte[])object2, (Charset)object3);
        }
        catch (IOException iOException) {
            object = null;
        }
        object2 = homeRepo.appPreferences;
        if (object != null) {
            object3 = "bottom_tab_bar";
            ((sw_0)object2).putPreference((String)object3, (String)object);
        } else {
            object2.getClass();
        }
        object = (BottomNavigationData)JsonUtils.fromJson((String)object, BottomNavigationData.class);
        homeRepo.overrideCloset((BottomNavigationData)object);
        return object;
    }

    private static final Unit fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$8(zr1_1 zr1_12, BottomNavigationData object) {
        Intrinsics.checkNotNullParameter(zr1_12, "$bottomNavigationObservable");
        DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
        Intrinsics.checkNotNull(object);
        object = dataCallback$Companion.onSuccess(object);
        zr1_12.k(object);
        return Unit.a;
    }

    private static final void fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$9(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    private static final void fetchSetCallBottomTabsApi$lambda$19(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    private static final Unit fetchSetCallBottomTabsApi$lambda$20(Throwable throwable) {
        yn3_0.a.b(throwable);
        return Unit.a;
    }

    private static final void fetchSetCallBottomTabsApi$lambda$21(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    private static final ApiFetchAndCallConditions fetchSetCallBottomTabsApi$lambda$6(HomeRepo object) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        object = ((HomeRepo)object).appPreferences;
        String string2 = "bottom_tab_bar";
        String string3 = "";
        object = ((sw_0)object).getPreference(string2, string3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            return ApiFetchAndCallConditions.SetLiveDataAndPreference;
        }
        return ApiFetchAndCallConditions.SetLiveDataAndCallApi;
    }

    public static /* synthetic */ void g(ar0_0 ar0_02, Object object) {
        HomeRepo.fetchCMSSetCallBottomTabsApi$lambda$34$lambda$33$lambda$32(ar0_02, object);
    }

    private static final DataCallback getAjioCouponPromotions$lambda$0(dl2_2 object) {
        Intrinsics.checkNotNullParameter(object, "couponRequestResp");
        Object object2 = (CouponPromotion)((dl2_2)object).b;
        Object[] objectArray = ((dl2_2)object).a;
        boolean bl2 = objectArray.d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            int n3 = objectArray.d();
            objectArray = null;
            if (n3 != 0) {
                n3 = R$string.pdp_details_not_available;
                object2 = hv3_0.K(n3);
                yn3$a yn3$a = yn3_0.a;
                String string2 = "Data not present";
                objectArray = new Object[]{};
                yn3$a.a(string2, objectArray);
            } else {
                object2 = ((dl2_2)object).c;
                if (object2 != null) {
                    object2 = ((il2_2)object2).k();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                yn3$a yn3$a = yn3_0.a;
                String string3 = kp1_0.c("ErrorBody: ", (String)object2);
                objectArray = new Object[]{};
                yn3$a.d(string3, objectArray);
            }
            ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
            int n4 = 48;
            String string4 = "CouponPromotionRequest";
            boolean bl3 = true;
            object = ApiErrorRepo.handleApiError$default(apiErrorRepo, (String)object2, (dl2_2)object, string4, bl3, null, null, n4, null);
        }
        return object;
    }

    private static final DataCallback getAjioCouponPromotions$lambda$1(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getAjioCouponPromotions$lambda$2(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, "CouponPromotionRequest", false, null, null, 28, null);
    }

    private final String getAssetNameForStoreBottomBarCMSAjio() {
        return "newNavBottomTabsAjio.json";
    }

    private final String getAssetNameForStoreBottomBarCMSLuxe() {
        return "newNavBottomTabsLuxe.json";
    }

    private final JSONArray getCmsUrlList() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("cms_url_list");
        JSONArray jSONArray = new JSONArray((String)object);
        return jSONArray;
    }

    public static /* synthetic */ Unit h(HomeRepo homeRepo, zr1_1 zr1_12, ApiFetchAndCallConditions apiFetchAndCallConditions) {
        return HomeRepo.fetchCMSSetCallLuxeBottomTabsApi$lambda$55(homeRepo, zr1_12, apiFetchAndCallConditions);
    }

    public static /* synthetic */ Unit i(Throwable throwable) {
        return HomeRepo.fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$52(throwable);
    }

    private static final DataCallback initiateBuyCouponRequest$lambda$3(dl2_2 object) {
        Intrinsics.checkNotNullParameter(object, "couponRequestResp");
        Object object2 = (ReturnExchange)((dl2_2)object).b;
        Object[] objectArray = ((dl2_2)object).a;
        boolean bl2 = objectArray.d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            int n3 = objectArray.d();
            objectArray = null;
            if (n3 != 0) {
                n3 = R$string.pdp_details_not_available;
                object2 = hv3_0.K(n3);
                yn3$a yn3$a = yn3_0.a;
                String string2 = "Data not present";
                objectArray = new Object[]{};
                yn3$a.a(string2, objectArray);
            } else {
                object2 = ((dl2_2)object).c;
                if (object2 != null) {
                    object2 = ((il2_2)object2).k();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                yn3$a yn3$a = yn3_0.a;
                String string3 = kp1_0.c("ErrorBody: ", (String)object2);
                objectArray = new Object[]{};
                yn3$a.d(string3, objectArray);
            }
            ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
            int n4 = 48;
            String string4 = "InitiateCouponBuyRequest";
            boolean bl3 = true;
            object = ApiErrorRepo.handleApiError$default(apiErrorRepo, (String)object2, (dl2_2)object, string4, bl3, null, null, n4, null);
        }
        return object;
    }

    private static final DataCallback initiateBuyCouponRequest$lambda$4(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback initiateBuyCouponRequest$lambda$5(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, "InitiateCouponBuyRequest", false, null, null, 28, null);
    }

    private final boolean isBottomNavigationDataValidated(BottomNavigationData object) {
        int n3;
        Object object2;
        int n4 = 1;
        if (object != null) {
            object2 = ((BottomNavigationData)object).getNavigationNode();
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null && (object = ((BottomNavigationData)object).getNavigationNode().getChildren()) != null) {
            Object object3;
            boolean bl2;
            object2 = object.iterator();
            int n7 = 0;
            Object object4 = null;
            while (bl2 = object2.hasNext()) {
                object3 = (Child)object2.next();
                bl2 = ((Child)object3).isVisible();
                if (!bl2) continue;
                n7 += n4;
            }
            n3 = 5;
            if (n7 == n3) {
                boolean bl3;
                block11: {
                    object4 = new Object();
                    bx_2.q((List)object, (Comparator)object4);
                    n7 = 0;
                    object4 = null;
                    while (n7 < n3) {
                        object3 = (Child)object.get(n7);
                        int n8 = n7 + 1;
                        ((Child)object3).setPosition(n8);
                        object3 = ((Child)object.get(n7)).getAppMedia();
                        if (object3 != null && (object3 = ((Child)object.get(n7)).getAppMedia2()) != null && (bl2 = URLUtil.isValidUrl((String)(object3 = ((Child)object.get(n7)).getAppMedia().getURL()))) && (bl2 = URLUtil.isValidUrl((String)(object3 = ((Child)object.get(n7)).getAppMedia2().getURL()))) && !(bl2 = TextUtils.isEmpty((CharSequence)(object3 = ((Child)object.get(n7)).getNodeurlLink())))) {
                            object3 = nk2_1.a;
                            object4 = ((Child)object.get(n7)).getNodeurlLink();
                            if (object4 == null) {
                                n7 = 0;
                                object4 = null;
                            } else {
                                object3 = nk2_1.a;
                                n7 = (int)(object3.contains(object4) ? 1 : 0);
                            }
                            if (n7 != 0) {
                                n7 = n8;
                                continue;
                            }
                        }
                        n3 = 0;
                        object2 = null;
                        break block11;
                    }
                    n3 = 1;
                }
                if (n3 != 0 && (bl3 = ((String)(object = ((Child)object.get(0)).getNodeurlLink())).equals(object2 = "/home"))) {
                    return n4 != 0;
                }
            }
        }
        return false;
    }

    private static final int isBottomNavigationDataValidated$lambda$38(Child child, Child child2) {
        boolean bl2;
        boolean bl3 = child.isVisible();
        if (bl3 && (bl3 = child2.isVisible())) {
            int n3 = child.getPosition();
            int n4 = child2.getPosition();
            return n3 - n4;
        }
        bl3 = child.isVisible();
        if (!bl3 && !(bl2 = child2.isVisible())) {
            return 0;
        }
        int n7 = child.isVisible();
        n7 = n7 != 0 ? -1 : 1;
        return n7;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean isCMSBottomNavigationDataValidated(BottomNavigationData object) {
        boolean bl2;
        int n3;
        Object object2;
        String string2;
        boolean bl3;
        block5: {
            bl3 = false;
            string2 = null;
            if (object == null) return false;
            object2 = ((BottomNavigationData)object).getData();
            if (object2 == null) return false;
            object = ((BottomNavigationData)object).getData();
            Intrinsics.checkNotNull(object);
            object = ((NavigationDataClass)object).getChildDetails();
            if (object == null) return false;
            this.getCmsUrlList();
            n3 = object.size();
            int n4 = 3;
            if (n4 > n3) return false;
            n4 = 6;
            if (n3 >= n4) return false;
            n4 = 0;
            while (true) {
                block7: {
                    block8: {
                        boolean bl4;
                        Object object3;
                        block6: {
                            bl2 = true;
                            if (n4 >= n3) break;
                            object3 = (CMSNavigation)object.get(n4);
                            bl4 = ((CMSNavigation)object3).getSwitchable();
                            if (!bl4) break block6;
                            object3 = ((CMSNavigation)object.get(n4)).getAlternateData();
                            if (object3 != null) {
                                object3 = ((CMSNavigation)object3).getInactiveImageUrl();
                            } else {
                                bl4 = false;
                                object3 = null;
                            }
                            bl4 = URLUtil.isValidUrl((String)object3);
                            if (bl4 && (bl4 = URLUtil.isValidUrl((String)(object3 = ((CMSNavigation)object.get(n4)).getInactiveImageUrl()))) && !(bl4 = TextUtils.isEmpty((CharSequence)(object3 = ((CMSNavigation)object.get(n4)).getUrl())))) break block7;
                            break block8;
                        }
                        object3 = ((CMSNavigation)object.get(n4)).getActiveImageUrl();
                        bl4 = URLUtil.isValidUrl((String)object3);
                        if (bl4 && (bl4 = URLUtil.isValidUrl((String)(object3 = ((CMSNavigation)object.get(n4)).getInactiveImageUrl()))) && !(bl4 = TextUtils.isEmpty((CharSequence)(object3 = ((CMSNavigation)object.get(n4)).getUrl())))) break block7;
                    }
                    bl3 = false;
                    string2 = null;
                    break block5;
                }
                ++n4;
            }
            bl3 = true;
        }
        object2 = (CMSNavigation)object.get(0);
        n3 = (int)(((CMSNavigation)object2).getSwitchable() ? 1 : 0);
        if (n3 != 0) {
            if (!bl3) return false;
            boolean bl5 = b.i((String)(object = ((CMSNavigation)object.get(0)).getUrl()), string2 = "/switch-stores", false);
            if (!bl5) return false;
            return bl2;
        }
        if (!bl3) return false;
        boolean bl6 = b.i((String)(object = ((CMSNavigation)object.get(0)).getUrl()), string2 = "/home", false);
        if (!bl6) return false;
        return bl2;
    }

    public static /* synthetic */ void j(it_0 it_02, Object object) {
        HomeRepo.fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$16(it_02, object);
    }

    public static /* synthetic */ DataCallback k(dl2_2 dl2_22) {
        return HomeRepo.getAjioCouponPromotions$lambda$0(dl2_22);
    }

    public static /* synthetic */ BottomNavigationData l(HomeRepo homeRepo) {
        return HomeRepo.fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$12(homeRepo);
    }

    public static /* synthetic */ void m(B81 b81, Object object) {
        HomeRepo.fetchCMSSetCallBottomTabsApi$lambda$35(b81, object);
    }

    public static /* synthetic */ Unit n(HomeRepo homeRepo, zr1_1 zr1_12, ApiFetchAndCallConditions apiFetchAndCallConditions) {
        return HomeRepo.fetchCMSSetCallBottomTabsApi$lambda$34(homeRepo, zr1_12, apiFetchAndCallConditions);
    }

    public static /* synthetic */ Unit o(Throwable throwable) {
        return HomeRepo.fetchSetCallBottomTabsApi$lambda$20(throwable);
    }

    private final void overrideCloset(BottomNavigationData iterator) {
        if (iterator != null && (iterator = ((BottomNavigationData)((Object)iterator)).getNavigationNode()) != null && (iterator = ((NavigationNode)((Object)iterator)).getChildren()) != null) {
            boolean bl2;
            iterator = ((Iterable)((Object)iterator)).iterator();
            while (bl2 = iterator.hasNext()) {
                int n3;
                String string2;
                int n4;
                Object object;
                Object object2 = (Child)iterator.next();
                if (object2 == null || (object = ((Child)object2).getNodeurlLink()) == null || (n4 = ((String)object).equalsIgnoreCase(string2 = "/wishlist")) != (n3 = 1)) continue;
                n4 = R$string.wish_list;
                object = hv3_0.K(n4);
                ((Child)object2).setTitle((String)object);
                object = ((Child)object2).getAppMedia();
                if (object != null) {
                    string2 = "file:///android_asset/bottomTabDefaultImages/closet_selected_refresh.png";
                    ((AppMedia)object).setURL(string2);
                }
                if ((object2 = ((Child)object2).getAppMedia2()) == null) continue;
                object = "file:///android_asset/bottomTabDefaultImages/closet_unselected_refresh.png";
                ((AppMedia2)object2).setURL((String)object);
            }
        }
    }

    public static /* synthetic */ void p(gt_0 gt_02, Object object) {
        HomeRepo.fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$14(gt_02, object);
    }

    public static /* synthetic */ ApiFetchAndCallConditions q(HomeRepo homeRepo) {
        return HomeRepo.fetchCMSSetCallBottomTabsApi$lambda$22(homeRepo);
    }

    public static /* synthetic */ void r(he0_2 he0_22, Object object) {
        HomeRepo.fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$53(he0_22, object);
    }

    public static /* synthetic */ ApiFetchAndCallConditions s(HomeRepo homeRepo) {
        return HomeRepo.fetchSetCallBottomTabsApi$lambda$6(homeRepo);
    }

    private final void setBottomTabsPreference(BottomNavigationData object) {
        boolean bl2 = this.isBottomNavigationDataValidated((BottomNavigationData)object);
        if (bl2) {
            object = JsonUtils.toJson(object);
            jo_2 jo_22 = this.appPreferences;
            if (object != null) {
                String string2 = "bottom_tab_bar";
                jo_22.putPreference(string2, (String)object);
            } else {
                jo_22.getClass();
            }
        }
    }

    private final void setCMSBottomTabsPreference(BottomNavigationData object, String object2) {
        boolean bl2 = this.isCMSBottomNavigationDataValidated((BottomNavigationData)object);
        if (bl2) {
            boolean bl3;
            object = JsonUtils.toJson(object);
            String string2 = ld3_2.STORE_AJIO.getStoreId();
            boolean bl4 = b.i((String)object2, string2, bl3 = true);
            if (bl4) {
                object2 = this.appPreferences;
                if (object != null) {
                    string2 = "cms_bottom_tab_bar_new_nav";
                    ((sw_0)object2).putPreference(string2, (String)object);
                } else {
                    object2.getClass();
                }
            } else {
                object2 = this.appPreferences;
                if (object != null) {
                    string2 = "luxe_cms_bottom_tab_bar_new_nav";
                    ((sw_0)object2).putPreference(string2, (String)object);
                } else {
                    object2.getClass();
                }
            }
        }
    }

    public static /* synthetic */ void t(f81_0 f81_02, Object object) {
        HomeRepo.fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$46(f81_02, object);
    }

    public static /* synthetic */ void u(e81_0 e81_02, Object object) {
        HomeRepo.fetchSetCallBottomTabsApi$lambda$19(e81_02, object);
    }

    public static /* synthetic */ DataCallback v(Throwable throwable) {
        return HomeRepo.initiateBuyCouponRequest$lambda$5(throwable);
    }

    public static /* synthetic */ Unit w(zr1_1 zr1_12, BottomNavigationData bottomNavigationData) {
        return HomeRepo.fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$45(zr1_12, bottomNavigationData);
    }

    public static /* synthetic */ Unit x(zr1_1 zr1_12, BottomNavigationData bottomNavigationData) {
        return HomeRepo.fetchSetCallBottomTabsApi$lambda$18$lambda$17$lambda$13(zr1_12, bottomNavigationData);
    }

    public static /* synthetic */ Unit y(Throwable throwable) {
        return HomeRepo.fetchCMSSetCallLuxeBottomTabsApi$lambda$55$lambda$54$lambda$47(throwable);
    }

    public static /* synthetic */ void z(q81_0 q81_02, Object object) {
        HomeRepo.fetchCMSSetCallLuxeBottomTabsApi$lambda$58(q81_02, object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final g53_0 callCMSBottomTabsApi(String object, String object2, String object3) {
        Object object4;
        Object object5;
        Object[] objectArray;
        Intrinsics.checkNotNullParameter(object, "screenName");
        Object object6 = "navigationType";
        Intrinsics.checkNotNullParameter(object2, (String)object6);
        String string2 = "store";
        Intrinsics.checkNotNullParameter(object3, string2);
        Object object7 = UrlHelper.Companion;
        boolean bl2 = ((UrlHelper$Companion)object7).getISPREVIEW();
        if (bl2) {
            object7 = CMSConfigInitializer.getPreviewUrlForNav();
        } else {
            object7 = ((UrlHelper$Companion)object7).getInstance();
            bl2 = false;
            objectArray = new Object[]{};
            object5 = "homepage";
            object4 = "cms_nav_menu";
            object7 = ((UrlHelper)object7).getApiUrl((String)object5, (String)object4, objectArray);
        }
        object5 = object7;
        object4 = new JsonObject();
        object7 = "channel";
        objectArray = this.channel;
        ((JsonObject)object4).addProperty((String)object7, (String)objectArray);
        ((JsonObject)object4).addProperty((String)object6, (String)object2);
        object6 = this.platform;
        ((JsonObject)object4).addProperty("platform", (String)object6);
        ((JsonObject)object4).addProperty(string2, (String)object3);
        object2 = "tenantId";
        object6 = this.tenantId;
        ((JsonObject)object4).addProperty((String)object2, (String)object6);
        boolean bl3 = hu1_2.e();
        if (bl3) {
            object2 = hu1_2.e;
            object6 = "experiment";
            ((JsonObject)object4).addProperty((String)object6, (String)object2);
        }
        object2 = CustomerStoreType.a;
        object2 = ScreenType.SCREEN_HOME;
        String string3 = CustomerStoreType.a((String)object3, (ScreenType)((Object)object2));
        object2 = this.categoryNavigationApi.getCMSCategoryNavigation((String)object5, (JsonObject)object4, "application/json", "BackGround_CMS_BOTTOM_TABS_REQUEST", string3);
        object6 = qt2_2.c;
        object2 = ((g53_0)object2).h((Scheduler)object6);
        object6 = ti_2.a();
        object2 = ((g53_0)object2).e((Scheduler)object6);
        object6 = new k81_0(this, (String)object3, (String)object);
        object3 = new mo_1((Function1)object6);
        object6 = new s53_0((q63_0)object2, (bx0_2)object3);
        object2 = new m81_0((String)object);
        object = new u53_0((q63_0)object6, (bx0_2)object2);
        Intrinsics.checkNotNullExpressionValue(object, "onErrorReturn(...)");
        return object;
    }

    public final g53_0 getAjioCouponPromotions() {
        Object object = this.userInformation.getUserId();
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{object};
        String string2 = ((UrlHelper)object2).getApiUrl("homepage", "coupon_promotion", object3);
        AjioHomeApi ajioHomeApi = this.homeApi;
        object = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object, "userInformation");
        object = ServiceUtil.getToken((UserInformation)object);
        String string3 = kp1_0.c("Bearer ", (String)object);
        String string4 = clientType;
        Intrinsics.checkNotNullExpressionValue(string4, "clientType");
        String string5 = clientVersion;
        object = ajioHomeApi.getAjioCouponPromotions(string2, string3, string4, string5, "CouponPromotionRequest");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        object3 = new c81_0((b81_0)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final void getBottomTabsData(zr1_1 zr1_12) {
        Intrinsics.checkNotNullParameter(zr1_12, "bottomNavigationObservable");
        this.fetchCMSSetCallBottomTabsApi(zr1_12);
    }

    public final void getLuxeBottomTabsData(zr1_1 zr1_12) {
        Intrinsics.checkNotNullParameter(zr1_12, "luxeBottomNavigationObservable");
        this.fetchCMSSetCallLuxeBottomTabsApi(zr1_12);
    }

    public final g53_0 initiateBuyCouponRequest(String object) {
        Intrinsics.checkNotNullParameter(object, "coupon");
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("couponCodes", (String)object);
        object = this.userInformation.getUserId();
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{object};
        String string2 = ((UrlHelper)object2).getApiUrl("homepage", "buy_coupon_promotion", (Object[])object3);
        object3 = this.homeApi;
        object = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object, "userInformation");
        object = ServiceUtil.getToken((UserInformation)object);
        String string3 = kp1_0.c("Bearer ", (String)object);
        String string4 = clientType;
        Intrinsics.checkNotNullExpressionValue(string4, "clientType");
        String string5 = clientVersion;
        object = object3.initiateBuyCouponRequest(string2, string3, string4, string5, "InitiateCouponBuyRequest", hashMap);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        object3 = new y81_0(0, (Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final void onViewModelCleared() {
        this.compositeDisposable.dispose();
    }
}

