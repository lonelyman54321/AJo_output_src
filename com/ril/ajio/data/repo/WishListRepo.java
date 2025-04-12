/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.data.repo;

import android.content.Context;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.ServiceErrorEventTracker;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.data.repo.WishListRepo$Companion;
import com.ril.ajio.data.repo.WishListRepo$addToWishList$$inlined$map$1;
import com.ril.ajio.data.repo.WishListRepo$addToWishList$2;
import com.ril.ajio.data.repo.WishListRepo$getWishlistProducts$$inlined$map$1;
import com.ril.ajio.data.repo.WishListRepo$getWishlistProducts$1;
import com.ril.ajio.data.repo.WishListRepo$removeFromWishList$$inlined$map$1;
import com.ril.ajio.data.repo.WishListRepo$removeFromWishList$2;
import com.ril.ajio.services.data.Closet.WishListSizeChartRequestBody;
import com.ril.ajio.services.data.Closet.WishlistSizeChartResponse;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.WishListApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import com.ril.ajio.services.query.QueryCart;
import com.ril.ajio.services.query.QueryProductDetails;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class WishListRepo
implements BaseRepo {
    public static final int $stable = 0;
    public static final WishListRepo$Companion Companion;
    private static final String FIELD_FULL = "FULL";
    private static final String clientType;
    private static final String clientVersion;
    private final ServiceErrorEventTracker serviceErrorEventTracker;
    private final UserInformation userInformation;
    private final WishListApi wishListApi;

    static {
        WishListRepo$Companion wishListRepo$Companion;
        Companion = wishListRepo$Companion = new WishListRepo$Companion(null);
        $stable = 8;
        clientType = "Android";
        clientVersion = em_1.a(AJIOApplication.Companion);
    }

    public WishListRepo(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        object = UserInformation.getInstance(object);
        this.userInformation = object;
        object = AjioApiConnector.INSTANCE.getWishListDataApi();
        this.wishListApi = object;
        object = ServiceErrorEventTracker.INSTANCE;
        this.serviceErrorEventTracker = object;
    }

    public static /* synthetic */ DataCallback a(dl2_2 dl2_22) {
        return WishListRepo.getSizeChartForProduct$lambda$9(dl2_22);
    }

    public static final /* synthetic */ String access$getClientType$cp() {
        return clientType;
    }

    public static final /* synthetic */ String access$getClientVersion$cp() {
        return clientVersion;
    }

    public static final /* synthetic */ UserInformation access$getUserInformation$p(WishListRepo wishListRepo) {
        return wishListRepo.userInformation;
    }

    public static final /* synthetic */ WishListApi access$getWishListApi$p(WishListRepo wishListRepo) {
        return wishListRepo.wishListApi;
    }

    public static final /* synthetic */ DataCallback access$parseApiError(WishListRepo wishListRepo, dl2_2 dl2_22, String string2) {
        return wishListRepo.parseApiError(dl2_22, string2);
    }

    public static /* synthetic */ Object addToWishList$default(WishListRepo wishListRepo, QueryCart queryCart, String string2, f80_0 f80_02, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            string2 = "ajio";
        }
        return wishListRepo.addToWishList(queryCart, string2, f80_02);
    }

    public static /* synthetic */ DataCallback b(WishListRepo wishListRepo, String string2, Throwable throwable) {
        return WishListRepo.getWishList$lambda$6(wishListRepo, string2, throwable);
    }

    public static /* synthetic */ DataCallback c(zh3_2 zh3_22, Object object) {
        return WishListRepo.getSizeChartForProduct$lambda$10(zh3_22, object);
    }

    public static /* synthetic */ DataCallback d(WishListRepo wishListRepo, dl2_2 dl2_22) {
        return WishListRepo.getProductSize$lambda$1(wishListRepo, "CartProductsSizeVariantAuth", dl2_22);
    }

    public static /* synthetic */ DataCallback e(aH2 aH22, Object object) {
        return WishListRepo.getWishList$lambda$5(aH22, object);
    }

    public static /* synthetic */ DataCallback f(fd3_2 fd3_22, Object object) {
        return WishListRepo.getProductSize$lambda$2(fd3_22, object);
    }

    public static /* synthetic */ DataCallback g(Throwable throwable) {
        return WishListRepo.getSizeChartForProduct$lambda$11(throwable);
    }

    private static final DataCallback getProductSize$lambda$1(WishListRepo object, String string2, dl2_2 dl2_22) {
        cl2_2 cl2_22;
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Product product = (Product)dl2_22.b;
        if (product != null && (bl2 = (cl2_22 = dl2_22.a).d())) {
            Y63.i(product);
            object = DataCallback.Companion.onSuccess(product);
        } else {
            object = ((WishListRepo)object).parseApiError(dl2_22, string2);
        }
        return object;
    }

    private static final DataCallback getProductSize$lambda$2(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getProductSize$lambda$3(WishListRepo wishListRepo, String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(wishListRepo, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return wishListRepo.handleApiException(throwable, string2);
    }

    private static final DataCallback getSizeChartForProduct$lambda$10(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getSizeChartForProduct$lambda$11(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        yn3$a yn3$a = yn3_0.a;
        String string2 = throwable.getLocalizedMessage();
        if (string2 == null) {
            string2 = "";
        }
        string2 = "error is :".concat(string2);
        Object[] objectArray = new Object[]{};
        yn3$a.f(string2, objectArray);
        return ApiErrorRepo.INSTANCE.handleApiException(throwable, "wishlistSizeChart", true, "", "Forward");
    }

    private static final DataCallback getSizeChartForProduct$lambda$9(dl2_2 object) {
        Intrinsics.checkNotNullParameter(object, "walletResp");
        Object object2 = (WishlistSizeChartResponse)((dl2_2)object).b;
        Object object3 = ((dl2_2)object).a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            String string2 = "";
            String string3 = "Forward";
            String string4 = "wishlistSizeChart";
            boolean bl3 = true;
            object3 = object;
            object = ((ApiErrorRepo)object2).handleApiError((dl2_2)object, string4, bl3, string2, string3);
        }
        return object;
    }

    public static /* synthetic */ g53_0 getWishList$default(WishListRepo wishListRepo, int n3, int n4, boolean bl2, int n7, Object object) {
        if ((n7 &= 4) != 0) {
            bl2 = false;
        }
        return wishListRepo.getWishList(n3, n4, bl2);
    }

    private static final DataCallback getWishList$lambda$4(WishListRepo object, String string2, dl2_2 dl2_22) {
        cl2_2 cl2_22;
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        ProductsList productsList = (ProductsList)dl2_22.b;
        object = productsList != null && (bl2 = (cl2_22 = dl2_22.a).d()) ? DataCallback.Companion.onSuccess(productsList) : ((WishListRepo)object).parseApiError(dl2_22, string2);
        return object;
    }

    private static final DataCallback getWishList$lambda$5(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getWishList$lambda$6(WishListRepo wishListRepo, String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(wishListRepo, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return wishListRepo.handleApiExceptionForWishList(throwable, string2);
    }

    public static /* synthetic */ DataCallback h(WishListRepo wishListRepo, Throwable throwable) {
        return WishListRepo.getProductSize$lambda$3(wishListRepo, "CartProductsSizeVariantAuth", throwable);
    }

    private final DataCallback handleApiError(String string2, dl2_2 dl2_22, String string3) {
        return ApiErrorRepo.handleApiError$default(ApiErrorRepo.INSTANCE, string2, dl2_22, string3, false, null, null, 56, null);
    }

    private final Map handleQueryParamters(WishListSizeChartRequestBody object) {
        String string2;
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        String string3 = ((WishListSizeChartRequestBody)object).getApplicationName();
        if (string3 != null) {
            string3 = "applicationName";
            string2 = ((WishListSizeChartRequestBody)object).getApplicationName();
            linkedHashMap.put(string3, string2);
        }
        if ((string3 = ((WishListSizeChartRequestBody)object).getProductCode()) != null) {
            string3 = "productCode";
            string2 = ((WishListSizeChartRequestBody)object).getProductCode();
            linkedHashMap.put(string3, string2);
        }
        if ((string3 = ((WishListSizeChartRequestBody)object).getBrickCode()) != null) {
            string3 = "brickCode";
            string2 = ((WishListSizeChartRequestBody)object).getBrickCode();
            linkedHashMap.put(string3, string2);
        }
        if ((string3 = ((WishListSizeChartRequestBody)object).getBrandCode()) != null) {
            string3 = "brandCode";
            string2 = ((WishListSizeChartRequestBody)object).getBrandCode();
            linkedHashMap.put(string3, string2);
        }
        if ((string3 = ((WishListSizeChartRequestBody)object).getGender()) != null) {
            string3 = "gender";
            string2 = ((WishListSizeChartRequestBody)object).getGender();
            linkedHashMap.put(string3, string2);
        }
        if ((string3 = ((WishListSizeChartRequestBody)object).getSubCategory()) != null) {
            string3 = "subCategory";
            string2 = ((WishListSizeChartRequestBody)object).getSubCategory();
            linkedHashMap.put(string3, string2);
        }
        if ((string3 = ((WishListSizeChartRequestBody)object).getSeasonCode()) != null) {
            string3 = "seasonCode";
            string2 = ((WishListSizeChartRequestBody)object).getSeasonCode();
            linkedHashMap.put(string3, string2);
        }
        if ((string3 = ((WishListSizeChartRequestBody)object).getVendorCode()) != null) {
            string3 = "vendorCode";
            string2 = ((WishListSizeChartRequestBody)object).getVendorCode();
            linkedHashMap.put(string3, string2);
        }
        if ((string3 = ((WishListSizeChartRequestBody)object).getFittingType()) != null) {
            string3 = "fittingType";
            string2 = ((WishListSizeChartRequestBody)object).getFittingType();
            linkedHashMap.put(string3, string2);
        }
        if ((string3 = ((WishListSizeChartRequestBody)object).getStyleType()) != null) {
            string3 = "styleType";
            object = ((WishListSizeChartRequestBody)object).getStyleType();
            linkedHashMap.put(string3, object);
        }
        return linkedHashMap;
    }

    public static /* synthetic */ DataCallback i(WishListRepo wishListRepo, String string2, dl2_2 dl2_22) {
        return WishListRepo.getWishList$lambda$4(wishListRepo, string2, dl2_22);
    }

    private final DataError logApiExceptionForWishList(Throwable arrayList, String string2) {
        yn3_0.a.e((Throwable)((Object)arrayList));
        DataError dataError = new DataError();
        DataError$ErrorMessage dataError$ErrorMessage = new DataError$ErrorMessage();
        String string3 = ((Throwable)((Object)arrayList)).getMessage();
        String string4 = String.valueOf(string3);
        boolean bl2 = arrayList instanceof SocketTimeoutException;
        if (bl2) {
            arrayList = "";
            dataError$ErrorMessage.setMessage((String)((Object)arrayList));
        } else {
            arrayList = ((Throwable)((Object)arrayList)).getMessage();
            dataError$ErrorMessage.setMessage((String)((Object)arrayList));
        }
        dataError.errors = arrayList = new ArrayList<DataError$ErrorMessage>();
        arrayList.add(dataError$ErrorMessage);
        WishListRepo.logServiceErrorEvent$default(this, string2, string4, 0, null, 8, null);
        return dataError;
    }

    private final void logServiceErrorEvent(String string2, String string3, int n3, DataError dataError) {
        ServiceErrorEventTracker.trackServiceErrorEvent$default(this.serviceErrorEventTracker, string2, string3, n3, dataError, null, null, null, 112, null);
    }

    public static /* synthetic */ void logServiceErrorEvent$default(WishListRepo wishListRepo, String string2, String string3, int n3, DataError dataError, int n4, Object object) {
        if ((n4 &= 8) != 0) {
            dataError = null;
        }
        wishListRepo.logServiceErrorEvent(string2, string3, n3, dataError);
    }

    private final DataCallback parseApiError(dl2_2 dl2_22, String string2) {
        Object object = dl2_22.a;
        boolean n3 = ((cl2_2)object).d();
        Object[] objectArray = null;
        if (n3) {
            int n4 = R$string.pdp_details_not_available;
            object = hv3_0.K(n4);
            yn3$a yn3$a = yn3_0.a;
            String string3 = "Data not present";
            objectArray = new Object[]{};
            yn3$a.a(string3, objectArray);
        } else {
            object = dl2_22.c;
            if (object != null) {
                object = ((il2_2)object).k();
            } else {
                boolean bl2 = false;
                object = null;
            }
            yn3$a yn3$a = yn3_0.a;
            String string4 = kp1_0.c("ErrorBody: ", (String)object);
            objectArray = new Object[]{};
            yn3$a.d(string4, objectArray);
        }
        return this.handleApiError((String)object, dl2_22, string2);
    }

    public final Object addToWishList(QueryCart object, String object2, f80_0 object3) {
        object3 = UrlHelper.Companion.getInstance();
        String string2 = this.userInformation.getCustomerUUID();
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        String string3 = ((UrlHelper)object3).getApiUrl("closet", "wishlist_add", objectArray);
        kx3_0.c = n3;
        kx3_0.a = n3;
        kx3_0.b = null;
        string2 = "AddtoCloset";
        object3 = new WishListRepo$addToWishList$2(this, string3, (QueryCart)object, (String)object2, string2, null);
        object = new br2_2((Function2)object3);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object2 = new WishListRepo$addToWishList$$inlined$map$1((es0_2)object, this, string2);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final g53_0 getProductSize(QueryProductDetails object) {
        Intrinsics.checkNotNullParameter(object, "query");
        Object object2 = UrlHelper.Companion.getInstance();
        object = ((QueryProductDetails)object).getProductCode();
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        String string2 = ((UrlHelper)object2).getApiUrl("cart", "product_size_auth", objectArray);
        WishListApi wishListApi = this.wishListApi;
        object = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object, "userInformation");
        object = ServiceUtil.getToken((UserInformation)object);
        String string3 = kp1_0.c("Bearer ", (String)object);
        String string4 = clientType;
        String string5 = clientVersion;
        object = wishListApi.getProductSize(string2, string3, string4, string5, FIELD_FULL, "CartProductsSizeVariantAuth");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new fd3_2(this, n3);
        Object object3 = new d91_0((Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new nh1_1(this, 2);
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final g53_0 getSizeChartForProduct(WishListSizeChartRequestBody object) {
        Intrinsics.checkNotNullParameter(object, "requestBody");
        object = this.handleQueryParamters((WishListSizeChartRequestBody)object);
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        object2 = ((UrlHelper)object2).getApiUrl("closet", "wishlist_size_chart", (Object[])object3);
        object3 = this.wishListApi;
        Object object4 = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object4, "userInformation");
        object4 = ServiceUtil.getToken((UserInformation)object4);
        object4 = kp1_0.c("Bearer ", (String)object4);
        object = object3.getProductSizeChart((String)object2, (String)object4, "wishlistSizeChart", (Map)object);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        object3 = new jw2_1(object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final g53_0 getWishList(int n3, int n4, boolean bl2) {
        int n7;
        WishListRepo wishListRepo = this;
        Object object = UrlHelper.Companion.getInstance();
        Object object2 = this.userInformation.getCustomerUUID();
        int n8 = 1;
        Object object3 = new Object[n8];
        object3[0] = object2;
        Object object4 = "wishlist_view_all";
        object = ((UrlHelper)object).getApiUrl("closet", (String)object4, (Object[])object3);
        object2 = this.userInformation.getUserSegementIds();
        if (object2 != null && (n7 = ((String)object2).length()) != 0) {
            object2 = this.userInformation.getUserSegementIds();
            object3 = "?segmentIds=";
            object = n1.a((String)object, (String)object3, (String)object2);
        }
        object2 = ww0_2.a;
        object2 = ScreenType.SCREEN_WISHLIST;
        String string2 = ww0_2.b((ScreenType)((Object)object2));
        n7 = (int)(mz3_0.y(string2) ? 1 : 0);
        if (n7 != 0 && (n7 = (int)(ww0_2.c() ? 1 : 0)) != 0 && (n7 = string2.length()) != 0) {
            object2 = "?";
            n7 = (int)(StringsKt.F((CharSequence)object, (CharSequence)object2, n8 != 0) ? 1 : 0);
            object2 = n7 != 0 ? "&userClusterId=".concat(string2) : "?userClusterId=".concat(string2);
            object = Ft2.a((String)object, (String)object2);
        }
        object4 = object;
        object = bl2 ? "ShowWishList" : "BackGround_ShowWishList";
        object3 = wishListRepo.wishListApi;
        object2 = wishListRepo.userInformation;
        Intrinsics.checkNotNullExpressionValue(object2, "userInformation");
        object2 = ServiceUtil.getToken((UserInformation)object2);
        String string3 = kp1_0.c("Bearer ", (String)object2);
        String string4 = String.valueOf(n3);
        String string5 = String.valueOf(n4);
        String string6 = clientType;
        String string7 = clientVersion;
        object2 = object3.getWishList((String)object4, string3, string2, string4, string5, string6, string7, FIELD_FULL, (String)object);
        object3 = qt2_2.c;
        object2 = ((g53_0)object2).h((Scheduler)object3);
        object3 = ti_2.a();
        object2 = ((g53_0)object2).e((Scheduler)object3);
        object3 = new aH2(n8, this, object);
        Y81 y81 = new Y81(2, (Function1)object3);
        object3 = new s53_0((q63_0)object2, y81);
        object2 = new yh3_1(this, (String)object);
        object = new u53_0((q63_0)object3, (bx0_2)object2);
        Intrinsics.checkNotNullExpressionValue(object, "onErrorReturn(...)");
        return object;
    }

    public final es0_2 getWishlistProducts() {
        Object object = UrlHelper.Companion.getInstance();
        Object object2 = this.userInformation.getCustomerUUID();
        Object[] objectArray = new Object[]{object2};
        object = ((UrlHelper)object).getApiUrl("closet", "option_codes", objectArray);
        object2 = new WishListRepo$getWishlistProducts$1(this, (String)object, null);
        object = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object2 = new WishListRepo$getWishlistProducts$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final DataCallback handleApiException(Throwable throwable, String string2) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(string2, "requestID");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    public final DataCallback handleApiExceptionForWishList(Throwable serializable, String string2) {
        Intrinsics.checkNotNullParameter(serializable, "throwable");
        Intrinsics.checkNotNullParameter(string2, "requestID");
        DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
        serializable = this.logApiExceptionForWishList((Throwable)serializable, string2);
        return dataCallback$Companion.onFailed((DataError)serializable);
    }

    public final boolean isUserOnline() {
        return this.userInformation.isUserOnline();
    }

    public final Object removeFromWishList(QueryCart object, f80_0 object2) {
        object2 = UrlHelper.Companion.getInstance();
        String string2 = this.userInformation.getCustomerUUID();
        object = ((QueryCart)object).getProductCode();
        object = kp1_0.c("productCodePost=", (String)object);
        Object[] objectArray = new Object[]{string2, object};
        object = ((UrlHelper)object2).getApiUrl("closet", "wishlist_remove", objectArray);
        string2 = "RemoveFromWishList";
        object2 = new WishListRepo$removeFromWishList$2(this, (String)object, string2, null);
        object = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object2 = new WishListRepo$removeFromWishList$$inlined$map$1((es0_2)object, this, string2);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final void removedFromClosetAnalytics(Product product, String string2) {
        if (product == null) {
            return;
        }
        FirebaseEvents.pushProductEvent$default(FirebaseEvents.Companion.getInstance(), "delete_from_closet", product, 2, null, 8, null);
        tj2_0.e(AnalyticsManager.Companion, "Delete From Closet", "Delete Button", string2);
    }
}

