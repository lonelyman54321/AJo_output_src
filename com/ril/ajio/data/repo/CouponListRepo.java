/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.data.repo;

import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.CouponListRepo$Companion;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Offers.BankOffer;
import com.ril.ajio.services.data.Offers.OffersList;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.CouponListApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class CouponListRepo
implements BaseRepo {
    public static final int $stable;
    public static final CouponListRepo$Companion Companion;
    private static final String clientType;
    private static final String clientVersion;
    private final CouponListApi couponListApi;
    private final UserInformation userInformation;

    static {
        CouponListRepo$Companion couponListRepo$Companion;
        Companion = couponListRepo$Companion = new CouponListRepo$Companion(null);
        $stable = 8;
        clientType = "Android";
        clientVersion = em_1.a(AJIOApplication.Companion);
    }

    public CouponListRepo(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        object = UserInformation.getInstance(object);
        this.userInformation = object;
        object = AjioApiConnector.INSTANCE.getCouponListApi();
        this.couponListApi = object;
    }

    public static /* synthetic */ DataCallback a(vc0_2 vc0_22, Object object) {
        return CouponListRepo.getOfferCouponList$lambda$1(vc0_22, object);
    }

    public static /* synthetic */ DataCallback b(dl2_2 dl2_22) {
        return CouponListRepo.getOfferCouponList$lambda$0(dl2_22);
    }

    public static /* synthetic */ DataCallback c(Throwable throwable) {
        return CouponListRepo.getOfferBankList$lambda$5(throwable);
    }

    public static /* synthetic */ DataCallback d(sc0_1 sc0_12, Object object) {
        return CouponListRepo.getOfferBankList$lambda$4(sc0_12, object);
    }

    public static /* synthetic */ DataCallback e(Throwable throwable) {
        return CouponListRepo.getOfferCouponList$lambda$2(throwable);
    }

    public static /* synthetic */ DataCallback f(dl2_2 dl2_22) {
        return CouponListRepo.getOfferBankList$lambda$3(dl2_22);
    }

    private static final DataCallback getOfferBankList$lambda$3(dl2_2 object) {
        Intrinsics.checkNotNullParameter(object, "offerBankListResp");
        Object object2 = (BankOffer)((dl2_2)object).b;
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
            String string4 = "OFFER_BANK_LIST";
            boolean bl3 = true;
            object = ApiErrorRepo.handleApiError$default(apiErrorRepo, (String)object2, (dl2_2)object, string4, bl3, null, null, n4, null);
        }
        return object;
    }

    private static final DataCallback getOfferBankList$lambda$4(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getOfferBankList$lambda$5(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, "OFFER_BANK_LIST", false, null, null, 28, null);
    }

    private static final DataCallback getOfferCouponList$lambda$0(dl2_2 object) {
        Intrinsics.checkNotNullParameter(object, "offerCouponListResp");
        Object object2 = (OffersList)((dl2_2)object).b;
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
            String string4 = "OFFER_COUPON_LIST";
            boolean bl3 = true;
            object = ApiErrorRepo.handleApiError$default(apiErrorRepo, (String)object2, (dl2_2)object, string4, bl3, null, null, n4, null);
        }
        return object;
    }

    private static final DataCallback getOfferCouponList$lambda$1(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getOfferCouponList$lambda$2(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, "OFFER_COUPON_LIST", false, null, null, 28, null);
    }

    public final g53_0 getOfferBankList() {
        Object object = UrlHelper.Companion.getInstance();
        Object object2 = new Object[]{};
        String string2 = ((UrlHelper)object).getApiUrl("coupon", "offer_bank_list", object2);
        CouponListApi couponListApi = this.couponListApi;
        object = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object, "userInformation");
        object = ServiceUtil.getToken((UserInformation)object);
        String string3 = kp1_0.c("Bearer ", (String)object);
        String string4 = clientType;
        Intrinsics.checkNotNullExpressionValue(string4, "clientType");
        String string5 = clientVersion;
        object = couponListApi.getOfferBankList(string2, string3, string4, string5, "OFFER_BANK_LIST");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        Object object3 = new tc0_1(object2, 0);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final g53_0 getOfferCouponList() {
        Object object = UrlHelper.Companion.getInstance();
        Object object2 = new Object[]{};
        Object object3 = ww0_2.d(((UrlHelper)object).getApiUrl("coupon", "offer_coupon_list", (Object[])object2));
        object2 = this.couponListApi;
        object = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object, "userInformation");
        object = ServiceUtil.getToken((UserInformation)object);
        String string2 = kp1_0.c("Bearer ", (String)object);
        String string3 = clientType;
        Intrinsics.checkNotNullExpressionValue(string3, "clientType");
        String string4 = clientVersion;
        object = object2.getOfferCouponList((String)object3, string2, string3, string4, "OFFER_COUPON_LIST");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        object3 = new wc0_0(object2, 0);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }
}

