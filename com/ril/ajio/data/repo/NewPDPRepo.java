/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.data.repo;

import android.content.Context;
import com.ajio.ril.core.network.model.DataError;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.JsonObject;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.data.repo.NewPDPRepo$Companion;
import com.ril.ajio.data.repo.NewPDPRepo$getCrossWidget$$inlined$map$1;
import com.ril.ajio.data.repo.NewPDPRepo$getCrossWidget$1;
import com.ril.ajio.data.repo.NewPDPRepo$getProductDetails$$inlined$map$1;
import com.ril.ajio.data.repo.NewPDPRepo$getProductDetails$1;
import com.ril.ajio.services.data.Cart.CartCount;
import com.ril.ajio.services.data.NoModel;
import com.ril.ajio.services.data.Offers.BankOffer;
import com.ril.ajio.services.data.Product.EddResult;
import com.ril.ajio.services.data.Product.ProductUserSizeRecomData;
import com.ril.ajio.services.data.Product.ProductUserSizeRecomResponse;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.PDPApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import com.ril.ajio.services.query.QueryCodWithProductCode;
import com.ril.ajio.services.query.QueryProductDetails;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import java.util.HashMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.b;

public final class NewPDPRepo
implements BaseRepo {
    public static final int $stable = 0;
    public static final NewPDPRepo$Companion Companion;
    private static final String FIELD_FULL = "FULL";
    private static final String FULL_OPTIONS = "fields=FULL";
    private static final String clientParams;
    private static final String clientType;
    private static final String clientVersion;
    private final jo_2 appPreferences;
    private final String clientType$1;
    private final String clientVersion$1;
    private final Context context;
    private final PDPApi pdpApi;
    private final UserInformation userInformation;

    static {
        Object object = new NewPDPRepo$Companion(null);
        Companion = object;
        $stable = 8;
        clientType = "Android";
        clientVersion = object = em_1.a(AJIOApplication.Companion);
        clientParams = "client_type=Android&client_version=".concat((String)object);
    }

    public NewPDPRepo(Context object) {
        jo_2 jo_22;
        Intrinsics.checkNotNullParameter(object, "context");
        this.context = object;
        this.appPreferences = jo_22 = new jo_2((Context)object);
        object = UserInformation.getInstance(object);
        this.userInformation = object;
        object = AjioApiConnector.INSTANCE.gePDPApi();
        this.pdpApi = object;
        this.clientType$1 = "Android";
        object = em_1.a(AJIOApplication.Companion);
        this.clientVersion$1 = object;
    }

    public static /* synthetic */ DataCallback a(dl2_2 dl2_22) {
        return NewPDPRepo.getProductRecommendations$lambda$12(dl2_22);
    }

    public static final /* synthetic */ String access$getClientType$p(NewPDPRepo newPDPRepo) {
        return newPDPRepo.clientType$1;
    }

    public static final /* synthetic */ String access$getClientVersion$p(NewPDPRepo newPDPRepo) {
        return newPDPRepo.clientVersion$1;
    }

    public static final /* synthetic */ PDPApi access$getPdpApi$p(NewPDPRepo newPDPRepo) {
        return newPDPRepo.pdpApi;
    }

    private final String appendNewUserJourneyParams(boolean bl2, boolean bl3) {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = "&isNewUser=true";
        if (bl3) {
            if (bl2) {
                boolean bl4;
                String string3;
                String string4 = this.appPreferences.f();
                bl2 = b.i(string4, string3 = "New", bl4 = true);
                if (bl2) {
                    stringBuilder.append(string2);
                } else {
                    string4 = "&isNewUser=false";
                    stringBuilder.append(string4);
                }
            }
        } else {
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    public static /* synthetic */ DataCallback b(dl2_2 dl2_22) {
        return NewPDPRepo.getProductEdd$lambda$9(dl2_22);
    }

    public static /* synthetic */ DataCallback c(Throwable throwable) {
        return NewPDPRepo.getBankOffers$lambda$8(throwable);
    }

    public static /* synthetic */ DataCallback d(Throwable throwable) {
        return NewPDPRepo.getProductRecommendations$lambda$14(throwable);
    }

    public static /* synthetic */ DataCallback e(dl2_2 dl2_22) {
        return NewPDPRepo.postUepView$lambda$15(dl2_22);
    }

    public static /* synthetic */ DataCallback f(dl2_2 dl2_22) {
        return NewPDPRepo.getWishListCount$lambda$1(dl2_22);
    }

    public static /* synthetic */ DataCallback g(Throwable throwable) {
        return NewPDPRepo.postUepView$lambda$17(throwable);
    }

    private static final DataCallback getBankOffers$lambda$6(dl2_2 object) {
        Intrinsics.checkNotNullParameter(object, "bankResp");
        Object object2 = (BankOffer)((dl2_2)object).b;
        Object object3 = ((dl2_2)object).a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 24;
            String string2 = "PDPBankOffer";
            object3 = object;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, (dl2_2)object, string2, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback getBankOffers$lambda$7(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getBankOffers$lambda$8(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, "PDPBankOffer", false, null, null, 24, null);
    }

    private static final DataCallback getProductEdd$lambda$10(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getProductEdd$lambda$11(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, "PdpEddCheck", true, null, null, 24, null);
    }

    private static final DataCallback getProductEdd$lambda$9(dl2_2 object) {
        Intrinsics.checkNotNullParameter(object, "response");
        Object object2 = (EddResult)((dl2_2)object).b;
        Object object3 = ((dl2_2)object).a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 24;
            String string2 = "PdpEddCheck";
            boolean bl3 = true;
            object3 = object;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, (dl2_2)object, string2, bl3, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback getProductRecommendations$lambda$12(dl2_2 object) {
        Intrinsics.checkNotNullParameter(object, "recommResp");
        Object object2 = (ProductUserSizeRecomResponse)((dl2_2)object).b;
        Object object3 = ((dl2_2)object).a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 24;
            String string2 = "BackGround_GetProductUserSizeRecom";
            object3 = object;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, (dl2_2)object, string2, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback getProductRecommendations$lambda$13(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getProductRecommendations$lambda$14(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, "BackGround_GetProductUserSizeRecom", false, null, null, 24, null);
    }

    private static final DataCallback getUepView$lambda$18(dl2_2 object) {
        Intrinsics.checkNotNullParameter(object, "response");
        Object object2 = (NoModel)((dl2_2)object).b;
        Object object3 = ((dl2_2)object).a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 24;
            String string2 = "getUepView";
            object3 = object;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, (dl2_2)object, string2, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback getUepView$lambda$19(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getUepView$lambda$20(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, "getUepView", false, null, null, 24, null);
    }

    private static final DataCallback getWishListCount$lambda$1(dl2_2 object) {
        Intrinsics.checkNotNullParameter(object, "response");
        Object object2 = (CartCount)((dl2_2)object).b;
        Object object3 = ((dl2_2)object).a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 24;
            String string2 = "BackGround_CartWishListCount";
            object3 = object;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, (dl2_2)object, string2, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback getWishListCount$lambda$2(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getWishListCount$lambda$3(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, "BackGround_CartWishListCount", false, null, null, 24, null);
    }

    public static /* synthetic */ DataCallback h(z02_0 z02_02, Object object) {
        return NewPDPRepo.getBankOffers$lambda$7(z02_02, object);
    }

    public static /* synthetic */ DataCallback i(o02_0 o02_02, Object object) {
        return NewPDPRepo.getWishListCount$lambda$2(o02_02, object);
    }

    public static /* synthetic */ DataCallback j(Throwable throwable) {
        return NewPDPRepo.getWishListCount$lambda$3(throwable);
    }

    public static /* synthetic */ DataCallback k(ya_2 ya_22, Object object) {
        return NewPDPRepo.postUepView$lambda$16(ya_22, object);
    }

    public static /* synthetic */ DataCallback l(Throwable throwable) {
        return NewPDPRepo.getProductEdd$lambda$11(throwable);
    }

    public static /* synthetic */ DataCallback m(Throwable throwable) {
        return NewPDPRepo.getUepView$lambda$20(throwable);
    }

    public static /* synthetic */ DataCallback n(dl2_2 dl2_22) {
        return NewPDPRepo.getBankOffers$lambda$6(dl2_22);
    }

    public static /* synthetic */ DataCallback o(dl2_2 dl2_22) {
        return NewPDPRepo.getUepView$lambda$18(dl2_22);
    }

    public static /* synthetic */ DataCallback p(A02 a02, Object object) {
        return NewPDPRepo.getProductRecommendations$lambda$13(a02, object);
    }

    private static final DataCallback postUepView$lambda$15(dl2_2 object) {
        Intrinsics.checkNotNullParameter(object, "response");
        Object object2 = (NoModel)((dl2_2)object).b;
        Object object3 = ((dl2_2)object).a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 24;
            String string2 = "postUepView";
            object3 = object;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, (dl2_2)object, string2, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback postUepView$lambda$16(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback postUepView$lambda$17(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, "postUepView", false, null, null, 24, null);
    }

    public static /* synthetic */ DataCallback q(r02_0 r02_02, Object object) {
        return NewPDPRepo.getProductEdd$lambda$10(r02_02, object);
    }

    public static /* synthetic */ DataCallback r(w02 w022, Object object) {
        return NewPDPRepo.getUepView$lambda$19(w022, object);
    }

    public final boolean checkValidUserID() {
        cp$a cp$a = cp_1.Companion;
        UserInformation userInformation = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(userInformation, "userInformation");
        cp$a.getClass();
        return cp$a.A(userInformation);
    }

    public final g53_0 getBankOffers() {
        Object object = UrlHelper.Companion.getInstance();
        Object object2 = new Object[]{};
        object = ((UrlHelper)object).getApiUrl("coupon", "offer_bank_list", (Object[])object2);
        object2 = clientParams;
        object = n1.a((String)object, "&", (String)object2);
        object2 = this.pdpApi;
        Object object3 = this.clientType$1;
        String string2 = this.clientVersion$1;
        object = object2.getBankOffers((String)object, (String)object3, string2, "PDPBankOffer");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        object3 = new Tk0(object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final Context getContext() {
        return this.context;
    }

    public final es0_2 getCrossWidget(String object, String object2) {
        String string2 = "brick";
        Intrinsics.checkNotNullParameter(object2, string2);
        HashMap<String, String> hashMap = UrlHelper.Companion.getInstance();
        Object[] objectArray = new Object[]{object};
        object = ((UrlHelper)((Object)hashMap)).getApiUrl("pdp", "crossCellWidgets", objectArray);
        hashMap = new HashMap<String, String>();
        hashMap.put(string2, (String)object2);
        hashMap.put("storeId", "rilfnl");
        hashMap.put("tenantId", "AJIO");
        object2 = new NewPDPRepo$getCrossWidget$1(this, (String)object, hashMap, null);
        object = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object2 = new NewPDPRepo$getCrossWidget$$inlined$map$1((es0_2)object);
        return object2;
    }

    public final Object getPdpFraudEngine(JsonObject jsonObject, f80_0 f80_02) {
        UrlHelper urlHelper = UrlHelper.Companion.getInstance();
        Object[] objectArray = new Object[]{};
        String string2 = urlHelper.getApiUrl("pdp", "fraud_engine_serviceability", objectArray);
        PDPApi pDPApi = this.pdpApi;
        String string3 = this.clientType$1;
        String string4 = this.clientVersion$1;
        return pDPApi.getPdpFraudEngine(string2, jsonObject, string3, string4, "fraudEnginePdpApi", f80_02);
    }

    public final es0_2 getProductDetails(QueryProductDetails object, boolean n3, boolean bl2, String object2) {
        int n4;
        int n7;
        boolean bl3;
        String string2;
        String string3;
        Object object3;
        boolean bl4;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        Ref$ObjectRef ref$ObjectRef;
        block22: {
            Object object9;
            int n8;
            block21: {
                int n10;
                boolean bl5;
                Intrinsics.checkNotNullParameter(object, "query");
                ref$ObjectRef = new Ref$ObjectRef();
                object8 = UrlHelper.Companion.getInstance();
                object7 = ((QueryProductDetails)object).getProductCode();
                int n14 = 1;
                object6 = new Object[n14];
                n8 = 0;
                object6[0] = object7;
                object5 = "product_detail";
                ref$ObjectRef.element = object8 = ((UrlHelper)object8).getApiUrl("pdp", (String)object5, (Object[])object6);
                ref$ObjectRef.element = object8 = Qj0.b((String)object8, "?sortOptionsByColor=true");
                object7 = clientParams;
                object6 = "&";
                ref$ObjectRef.element = object8 = nb0_0.a((String)object8, (String)object6, (String)object7);
                object8 = ld3_2.STORE_AJIOGRAM.getStoreId();
                bl4 = Intrinsics.areEqual(object4, object8);
                if (bl4) {
                    object4 = ref$ObjectRef.element;
                    object8 = new StringBuilder();
                    ((StringBuilder)object8).append(object4);
                    ((StringBuilder)object8).append("&ajiogram=true");
                    ref$ObjectRef.element = object4 = ((StringBuilder)object8).toString();
                }
                object4 = ref$ObjectRef.element;
                object3 = this.appendNewUserJourneyParams(n3 != 0, bl5);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(object4);
                stringBuilder.append((String)object3);
                ref$ObjectRef.element = object3 = stringBuilder.toString();
                object3 = this.userInformation;
                boolean bl6 = ((UserInformation)object3).isUserOnline();
                bl5 = false;
                stringBuilder = null;
                if (bl6) {
                    object3 = this.userInformation.getCustomerUUID();
                    boolean bl7 = ((String)object3).equals(object4 = "");
                    if (bl7) {
                        boolean bl8 = false;
                        object3 = null;
                    } else {
                        object3 = this.userInformation.getCustomerUUID();
                    }
                    object8 = this.userInformation.getUserEmailId();
                    bl4 = ((String)object8).equals(object4);
                    if (bl4) {
                        bl4 = false;
                        object4 = null;
                    } else {
                        object4 = this.userInformation.getUserEmailId();
                    }
                    if (object3 == null || object4 == null) {
                        FirebaseCrashlytics.getInstance().log("product details - uuid or email empty");
                        object8 = FirebaseCrashlytics.getInstance();
                        object6 = "UUID_EMAIL_ERROR";
                        object7 = new Exception((String)object6);
                        ((FirebaseCrashlytics)object8).recordException((Throwable)object7);
                    }
                } else {
                    boolean bl9 = false;
                    object3 = null;
                    bl4 = false;
                    object4 = null;
                }
                if ((object8 = this.userInformation.getUserSegementIds()) != null && (n10 = ((String)object8).length()) != 0) {
                    object8 = ref$ObjectRef.element;
                    object7 = this.userInformation.getUserSegementIds();
                    object6 = new StringBuilder();
                    ((StringBuilder)object6).append(object8);
                    ((StringBuilder)object6).append("&segmentIds=");
                    ((StringBuilder)object6).append((String)object7);
                    ref$ObjectRef.element = object8 = ((StringBuilder)object6).toString();
                }
                object8 = new HashMap();
                object7 = ww0_2.a;
                object7 = ScreenType.SCREEN_PDP;
                object6 = ww0_2.b((ScreenType)((Object)object7));
                n8 = mz3_0.y((String)object6);
                string3 = "USER-CLUSTER-IDS";
                string2 = "enable_cluster_param_pdp";
                if (n8 != 0 && (n8 = ww0_2.c()) != 0 && (n8 = ((String)object6).length()) != 0) break block21;
                object5 = h40_0.a;
                object5 = z40_0.Companion;
                object9 = AJIOApplication.Companion;
                object5 = Q.a((AJIOApplication$a)object9, (z40$a)object5).a;
                n8 = (int)(((ao0_0)object5).a(string2) ? 1 : 0);
                if (n8 == 0) break block22;
            }
            if ((n8 = ((String)object6).length()) != 0) {
                object5 = ref$ObjectRef.element;
                object9 = new StringBuilder();
                ((StringBuilder)object9).append(object5);
                ((StringBuilder)object9).append("&userClusterId=");
                ((StringBuilder)object9).append((String)object6);
                ref$ObjectRef.element = object5 = ((StringBuilder)object9).toString();
                object7 = ww0_2.a((ScreenType)((Object)object7));
                ((HashMap)object8).put(string3, object7);
            }
        }
        if (object3 != null && (bl3 = ((String)object3).length())) {
            ((HashMap)object8).put("X-USER-UUID", object3);
            object7 = "user-id";
            ((HashMap)object8).put(object7, object3);
        }
        if (object4 != null && (n7 = ((String)object4).length()) != 0) {
            object3 = "customer_email_id";
            ((HashMap)object8).put(object3, object4);
        }
        object3 = this.clientType$1;
        object4 = "clientType";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        int n15 = ((String)object3).length();
        if (n15 > 0) {
            object3 = "client_type";
            object4 = this.clientType$1;
            ((HashMap)object8).put(object3, object4);
        }
        if ((n4 = ((String)(object3 = this.clientVersion$1)).length()) > 0) {
            object3 = "client_version";
            object4 = this.clientVersion$1;
            ((HashMap)object8).put(object3, object4);
        }
        ((HashMap)object8).put("RequestId", "ProductDetails");
        ((HashMap)object8).put(string3, object6);
        cp_1.Companion.getClass();
        object3 = cp$a.e();
        object = ((QueryProductDetails)object).getStoreId();
        object4 = od3_2.a();
        if (object == null || !(bl3 = ((String)object).length())) {
            object = object4;
        }
        if (bl4 = Intrinsics.areEqual(object, object4 = ld3_2.STORE_AJIO.getStoreId())) {
            object = "rilfnl";
        }
        object4 = (String)ref$ObjectRef.element;
        object7 = z40_0.Companion;
        object5 = AJIOApplication.Companion;
        object7 = Q.a((AJIOApplication$a)object5, (z40$a)object7).a;
        bl3 = ((ao0_0)object7).a(string2);
        object3.getClass();
        object = cp_1.a((String)object, (String)object4, bl3);
        int n16 = ((String)object).length();
        if (n16 > 0) {
            object3 = "Cookie";
            ((HashMap)object8).put(object3, object);
        }
        object = new NewPDPRepo$getProductDetails$1(this, ref$ObjectRef, (HashMap)object8, null);
        object3 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object3, (CoroutineContext)object);
        object3 = new NewPDPRepo$getProductDetails$$inlined$map$1((es0_2)object, (String)object6);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object3, (CoroutineContext)object);
    }

    public final g53_0 getProductEdd(QueryCodWithProductCode object) {
        Intrinsics.checkNotNullParameter(object, "queryProduct");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = ((QueryCodWithProductCode)object).getProductCode();
        String string2 = ((QueryCodWithProductCode)object).getPincode();
        Integer n3 = ((QueryCodWithProductCode)object).getQuantity();
        Boolean bl2 = ((QueryCodWithProductCode)object).isExchange();
        object = ((QueryCodWithProductCode)object).isPriorityDeliveryEnable();
        Object[] objectArray = new Object[]{object3, string2, n3, bl2, object};
        object = ((UrlHelper)object2).getApiUrl("edd", "product_edd", objectArray);
        object2 = clientParams;
        object = n1.a((String)object, "&", (String)object2);
        object2 = this.pdpApi;
        object3 = this.clientType$1;
        string2 = this.clientVersion$1;
        object = object2.getProductEdd((String)object, (String)object3, string2, "PdpEddCheck");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        object3 = new s02_0((r02_0)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final Object getProductEddNew(QueryCodWithProductCode object, f80_0 f80_02) {
        Object object2 = UrlHelper.Companion.getInstance();
        String string2 = ((QueryCodWithProductCode)object).getProductCode();
        Object object3 = ((QueryCodWithProductCode)object).getPincode();
        int n3 = ((QueryCodWithProductCode)object).getQuantity();
        Object object4 = new Integer(n3);
        Object object5 = ((QueryCodWithProductCode)object).isExchange();
        object = ((QueryCodWithProductCode)object).isPriorityDeliveryEnable();
        Object object6 = new Object[]{string2, object3, object4, object5, object};
        object = ((UrlHelper)object2).getApiUrl("edd", "product_edd", object6);
        object2 = clientParams;
        object5 = n1.a((String)object, "&", (String)object2);
        object3 = this.pdpApi;
        object4 = this.clientType$1;
        object6 = this.clientVersion$1;
        return object3.getProductEddNew((String)object5, (String)object4, (String)object6, "PdpEddCheck", f80_02);
    }

    public final g53_0 getProductRecommendations(ProductUserSizeRecomData productUserSizeRecomData) {
        NewPDPRepo newPDPRepo = this;
        Object object = productUserSizeRecomData;
        Intrinsics.checkNotNullParameter(productUserSizeRecomData, "objProductUserSizeRecomData");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        object2 = ((UrlHelper)object2).getApiUrl("pdp", "size_recommendation_v2", object3);
        object3 = clientParams;
        String string2 = "?";
        String string3 = n1.a((String)object2, string2, (String)object3);
        PDPApi pDPApi = this.pdpApi;
        String string4 = productUserSizeRecomData.getApplicationName();
        String string5 = productUserSizeRecomData.getProductCode();
        String string6 = productUserSizeRecomData.getBrickCode();
        String string7 = productUserSizeRecomData.getBrandCode();
        String string8 = productUserSizeRecomData.getFittingType();
        String string9 = productUserSizeRecomData.getStyleType();
        String string10 = productUserSizeRecomData.getVendorCode();
        String string11 = productUserSizeRecomData.getSeasonCode();
        String string12 = this.userInformation.getCustomerUUID();
        String string13 = productUserSizeRecomData.getBrickName();
        String string14 = productUserSizeRecomData.getSegment();
        object2 = productUserSizeRecomData.getRating();
        if (object2 == null) {
            object2 = Float.valueOf(0.0f);
        }
        String string15 = object2.toString();
        object2 = newPDPRepo.userInformation;
        Intrinsics.checkNotNullExpressionValue(object2, "userInformation");
        object2 = ServiceUtil.getToken((UserInformation)object2);
        String string16 = kp1_0.c("Bearer ", (String)object2);
        String string17 = newPDPRepo.clientType$1;
        object2 = newPDPRepo.clientVersion$1;
        object2 = pDPApi.getProductRecommendations(string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, (String)object2, "BackGround_GetProductUserSizeRecom");
        object = qt2_2.c;
        object2 = ((g53_0)object2).h((Scheduler)object);
        object = ti_2.a();
        object2 = ((g53_0)object2).e((Scheduler)object);
        object = new Object();
        object3 = new p02((Function1)object);
        object = new s53_0((q63_0)object2, (bx0_2)object3);
        object2 = new Object();
        object3 = new u53_0((q63_0)object, (bx0_2)object2);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final g53_0 getUepView(String object, String object2) {
        int n3;
        Object object3 = "productCode";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        if (object2 == null || (n3 = ((String)object2).length()) == 0) {
            object2 = "rilfnl";
        }
        object = uc0_0.a("https://eventcapture-uat.services.ajio.com:8443/uep/eventcapture/webservices/v1/", (String)object2, "/products/", (String)object, "/views");
        object2 = clientParams;
        object = n1.a((String)object, "&", (String)object2);
        object2 = this.pdpApi;
        object3 = this.clientType$1;
        String string2 = this.clientVersion$1;
        object = object2.getUepView((String)object, (String)object3, string2, "getUepView");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        object3 = new x02(object2, 0);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final g53_0 getWishListCount() {
        Object object;
        Object object2 = null;
        Object object3 = this.userInformation.getCustomerUUID();
        Object object4 = this.userInformation;
        boolean bl2 = ((UserInformation)object4).isUserOnline();
        if (!bl2) {
            boolean bl3 = ap_0.c();
            if (!bl3) {
                object2 = DataCallback.Companion;
                object3 = new DataError();
                object2 = g53_0.d(((DataCallback$Companion)object2).onFailed((DataError)object3));
                Intrinsics.checkNotNullExpressionValue(object2, "just(...)");
                return object2;
            }
            object3 = ap_0.a.getGuId();
            object4 = this.userInformation.getUserId();
            object = object3;
            object3 = object4;
        } else {
            object = object4 = "";
        }
        object4 = UrlHelper.Companion.getInstance();
        Object object5 = new Object[]{object3};
        object5 = ww0_2.d(((UrlHelper)object4).getApiUrl("closet", "wishlist_microcart", object5));
        object4 = this.pdpApi;
        object3 = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object3, "userInformation");
        object3 = ServiceUtil.getToken((UserInformation)object3);
        String string2 = kp1_0.c("Bearer ", (String)object3);
        String string3 = this.clientType$1;
        String string4 = this.clientVersion$1;
        object3 = object4.getWishListCount((String)object5, (String)object, string2, string3, string4, "BackGround_CartWishListCount");
        object4 = qt2_2.c;
        object3 = ((g53_0)object3).h((Scheduler)object4);
        object4 = ti_2.a();
        object3 = ((g53_0)object3).e((Scheduler)object4);
        object4 = new Object();
        object5 = new u02(0, (Function1)object4);
        object2 = new s53_0((q63_0)object3, (bx0_2)object5);
        object3 = new Object();
        object4 = new u53_0((q63_0)object2, (bx0_2)object3);
        Intrinsics.checkNotNullExpressionValue(object4, "onErrorReturn(...)");
        return object4;
    }

    public final g53_0 postUepView(JsonObject object, String object2) {
        int n3;
        Object object3 = "uepEvent";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        if (object2 == null || (n3 = ((String)object2).length()) == 0) {
            object2 = "rilfnl";
        }
        String string2 = cP.a("https://eventcapture-uat.services.ajio.com:8443/uep/eventcapture/webservices/v1/", (String)object2, "/event/PDPViewEvent");
        PDPApi pDPApi = this.pdpApi;
        String string3 = this.clientType$1;
        String string4 = this.clientVersion$1;
        object = pDPApi.postUepView(string2, (JsonObject)object, string3, string4, "postUepView");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new ya_2(1);
        object3 = new za_2(object2, 1);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }
}

