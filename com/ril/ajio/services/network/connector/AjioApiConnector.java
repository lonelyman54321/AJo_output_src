/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.connector;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ril.ajio.services.network.AjioOkHttpClient;
import com.ril.ajio.services.network.api.AddressApi;
import com.ril.ajio.services.network.api.AjioCashApi;
import com.ril.ajio.services.network.api.AjioGiftCardApi;
import com.ril.ajio.services.network.api.AjioHomeApi;
import com.ril.ajio.services.network.api.BannerAdsServiceApi;
import com.ril.ajio.services.network.api.CartApi;
import com.ril.ajio.services.network.api.CategoryNavigationApi;
import com.ril.ajio.services.network.api.CcApi;
import com.ril.ajio.services.network.api.CouponApi;
import com.ril.ajio.services.network.api.CouponListApi;
import com.ril.ajio.services.network.api.CustomerReviewsApi;
import com.ril.ajio.services.network.api.DressToolApi;
import com.ril.ajio.services.network.api.FleekApi;
import com.ril.ajio.services.network.api.GameZoneApi;
import com.ril.ajio.services.network.api.ImpsApi;
import com.ril.ajio.services.network.api.LoginApi;
import com.ril.ajio.services.network.api.NavigationTypeApi;
import com.ril.ajio.services.network.api.OrderDetailApi;
import com.ril.ajio.services.network.api.OrderListApi;
import com.ril.ajio.services.network.api.PDPApi;
import com.ril.ajio.services.network.api.PaymentApi;
import com.ril.ajio.services.network.api.PlpApi;
import com.ril.ajio.services.network.api.ProDetailsApi;
import com.ril.ajio.services.network.api.RVApi;
import com.ril.ajio.services.network.api.RatingsApi;
import com.ril.ajio.services.network.api.ReferralApi;
import com.ril.ajio.services.network.api.RtbApi;
import com.ril.ajio.services.network.api.RtoAPI;
import com.ril.ajio.services.network.api.SearchApi;
import com.ril.ajio.services.network.api.ShippingApi;
import com.ril.ajio.services.network.api.StoreApi;
import com.ril.ajio.services.network.api.StoreLpApi;
import com.ril.ajio.services.network.api.UserApi;
import com.ril.ajio.services.network.api.WishListApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

public final class AjioApiConnector {
    public static final AjioApiConnector INSTANCE;
    private static final x72_0 okHttpClient;
    private static dm2_1 retrofit;
    private static final cr2_2 rxJava2CallAdapterFactory;

    static {
        Object object = new AjioApiConnector();
        INSTANCE = object;
        okHttpClient = AjioOkHttpClient.INSTANCE.getOkHttpClient();
        rxJava2CallAdapterFactory = object = new kj$a_0();
    }

    private AjioApiConnector() {
    }

    private final dm2_1 getRetrofit() {
        Object object;
        block3: {
            ob1_1 ob1_12;
            Object object2;
            block4: {
                block2: {
                    object = retrofit;
                    if (object != null) break block2;
                    object = new ArrayList();
                    object2 = new ArrayList();
                    Object object3 = rxJava2CallAdapterFactory;
                    ArrayList arrayList = "factory == null";
                    Objects.requireNonNull(object3, (String)((Object)arrayList));
                    ((ArrayList)object2).add(object3);
                    object3 = new GsonBuilder();
                    object3 = ((GsonBuilder)object3).setLenient().create();
                    if (object3 == null) break block3;
                    arrayList = new ArrayList((Gson)object3);
                    ((ArrayList)object).add(arrayList);
                    x72_0 x72_02 = okHttpClient;
                    Objects.requireNonNull(x72_02, "client == null");
                    object3 = "https://www.ajio.com";
                    Intrinsics.checkNotNullParameter(object3, "<this>");
                    arrayList = new ArrayList();
                    int n3 = 0;
                    Object object4 = null;
                    ((Ob1$a)((Object)arrayList)).e(null, (String)object3);
                    ob1_12 = ((Ob1$a)((Object)arrayList)).b();
                    object3 = ob1_12.f;
                    int n4 = object3.size() + -1;
                    object3 = object3.get(n4);
                    arrayList = "";
                    boolean bl2 = ((String)((Object)arrayList)).equals(object3);
                    if (!bl2) break block4;
                    ci_2 ci_22 = at2_2.a;
                    object3 = at2_2.c;
                    arrayList = new ArrayList(object2);
                    object2 = ((we_2)object3).a(ci_22);
                    arrayList.addAll(object2);
                    object3 = ((we_2)object3).b();
                    n3 = object3.size();
                    int n7 = ((ArrayList)object).size() + 1 + n3;
                    List<ve_2> list = new List<ve_2>(n7);
                    object4 = new x80$a();
                    list.add((ve_2)object4);
                    list.addAll((Collection<ve_2>)object);
                    list.addAll((Collection<ve_2>)object3);
                    list = Collections.unmodifiableList(list);
                    List list2 = Collections.unmodifiableList(arrayList);
                    object2.size();
                    object4 = object;
                    retrofit = object = new dm2_1(x72_02, ob1_12, list, list2, ci_22);
                }
                return object;
            }
            object2 = new StringBuilder("baseUrl must end in /: ");
            ((StringBuilder)object2).append(ob1_12);
            object2 = ((StringBuilder)object2).toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object = new NullPointerException("gson == null");
        throw object;
    }

    public final PDPApi gePDPApi() {
        Object object = this.getRetrofit().b(PDPApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (PDPApi)object;
    }

    public final CustomerReviewsApi gePDPReviewsApi() {
        Object object = this.getRetrofit().b(CustomerReviewsApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (CustomerReviewsApi)object;
    }

    public final AddressApi getAddressApi() {
        Object object = this.getRetrofit().b(AddressApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (AddressApi)object;
    }

    public final AjioCashApi getAjioCashApi() {
        Object object = this.getRetrofit().b(AjioCashApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (AjioCashApi)object;
    }

    public final BannerAdsServiceApi getBannerAdsServiceApi() {
        Object object = this.getRetrofit().b(BannerAdsServiceApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (BannerAdsServiceApi)object;
    }

    public final CartApi getCartDataApi() {
        Object object = this.getRetrofit().b(CartApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (CartApi)object;
    }

    public final CategoryNavigationApi getCategoryNavigation() {
        Object object = this.getRetrofit().b(CategoryNavigationApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (CategoryNavigationApi)object;
    }

    public final CcApi getCcApi() {
        Object object = this.getRetrofit().b(CcApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (CcApi)object;
    }

    public final CouponApi getCouponApi() {
        Object object = this.getRetrofit().b(CouponApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (CouponApi)object;
    }

    public final CouponListApi getCouponListApi() {
        Object object = this.getRetrofit().b(CouponListApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (CouponListApi)object;
    }

    public final DressToolApi getDressToolApi() {
        Object object = this.getRetrofit().b(DressToolApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (DressToolApi)object;
    }

    public final FleekApi getFleekApi() {
        Object object = this.getRetrofit().b(FleekApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (FleekApi)object;
    }

    public final GameZoneApi getGameZoneApi() {
        Object object = this.getRetrofit().b(GameZoneApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (GameZoneApi)object;
    }

    public final AjioGiftCardApi getGiftCardAPI() {
        Object object = this.getRetrofit().b(AjioGiftCardApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (AjioGiftCardApi)object;
    }

    public final AjioHomeApi getHomeApi() {
        Object object = this.getRetrofit().b(AjioHomeApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (AjioHomeApi)object;
    }

    public final ImpsApi getImpsApi() {
        Object object = this.getRetrofit().b(ImpsApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (ImpsApi)object;
    }

    public final LoginApi getLoginApi() {
        Object object = this.getRetrofit().b(LoginApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (LoginApi)object;
    }

    public final CategoryNavigationApi getLuxBrandCategory() {
        Object object = this.getRetrofit().b(CategoryNavigationApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (CategoryNavigationApi)object;
    }

    public final NavigationTypeApi getNavigationTypeApi() {
        Object object = this.getRetrofit().b(NavigationTypeApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (NavigationTypeApi)object;
    }

    public final OrderDetailApi getOrderDetailApi() {
        Object object = this.getRetrofit().b(OrderDetailApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (OrderDetailApi)object;
    }

    public final OrderListApi getOrderListApi() {
        Object object = this.getRetrofit().b(OrderListApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (OrderListApi)object;
    }

    public final PaymentApi getPaymentApi() {
        Object object = this.getRetrofit().b(PaymentApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (PaymentApi)object;
    }

    public final PlpApi getPlpApi() {
        Object object = this.getRetrofit().b(PlpApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (PlpApi)object;
    }

    public final ProDetailsApi getProDetailsApi() {
        Object object = this.getRetrofit().b(ProDetailsApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (ProDetailsApi)object;
    }

    public final RVApi getRVApi() {
        Object object = this.getRetrofit().b(RVApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (RVApi)object;
    }

    public final RatingsApi getRatingsApi() {
        Object object = this.getRetrofit().b(RatingsApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (RatingsApi)object;
    }

    public final ReferralApi getReferralApi() {
        Object object = this.getRetrofit().b(ReferralApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (ReferralApi)object;
    }

    public final RtbApi getRtbApi() {
        Object object = this.getRetrofit().b(RtbApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (RtbApi)object;
    }

    public final RtoAPI getRtoApi() {
        Object object = this.getRetrofit().b(RtoAPI.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (RtoAPI)object;
    }

    public final SearchApi getSearchApi() {
        Object object = this.getRetrofit().b(SearchApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (SearchApi)object;
    }

    public final ShippingApi getShippingApi() {
        Object object = this.getRetrofit().b(ShippingApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (ShippingApi)object;
    }

    public final StoreApi getStoreApi() {
        Object object = this.getRetrofit().b(StoreApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (StoreApi)object;
    }

    public final CategoryNavigationApi getStoreInfo() {
        Object object = this.getRetrofit().b(CategoryNavigationApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (CategoryNavigationApi)object;
    }

    public final StoreLpApi getStoreLpApi() {
        Object object = this.getRetrofit().b(StoreLpApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (StoreLpApi)object;
    }

    public final UserApi getUserApi() {
        Object object = this.getRetrofit().b(UserApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (UserApi)object;
    }

    public final WishListApi getWishListDataApi() {
        Object object = this.getRetrofit().b(WishListApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (WishListApi)object;
    }

    public final OrderDetailApi getcancelReturnRequestApi() {
        Object object = this.getRetrofit().b(OrderDetailApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return (OrderDetailApi)object;
    }
}

