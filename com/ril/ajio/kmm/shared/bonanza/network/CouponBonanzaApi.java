/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.network;

import com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaInfoRequest;
import com.ril.ajio.kmm.shared.network.AJioServiceLocator;
import kotlin.jvm.internal.Intrinsics;

public final class CouponBonanzaApi {
    private static final String AUTHORIZATION = "Authorization";
    private static final String FILTER = "filter";
    public static final CouponBonanzaApi INSTANCE;
    private static final String PAGE_NUMBER = "pageNumber";
    private static final String PAGE_SIZE = "pageSize";
    private static final String REQUEST_ID = "RequestId";

    static {
        CouponBonanzaApi couponBonanzaApi;
        INSTANCE = couponBonanzaApi = new CouponBonanzaApi();
    }

    private CouponBonanzaApi() {
    }

    public final Object getBonanzaCouponInfo(String object, String object2, CouponBonanzaInfoRequest couponBonanzaInfoRequest, f80_0 f80_02) {
        da1_2 da1_22 = AJioServiceLocator.INSTANCE.getHttpApiClient();
        db1_2 db1_22 = new db1_2();
        Intrinsics.checkNotNullParameter(db1_22, "<this>");
        Intrinsics.checkNotNullParameter(object2, "urlString");
        hu3_0.b(db1_22.a, (String)object2);
        object2 = couponBonanzaInfoRequest.getAuthorization();
        nz3_0.a(db1_22, AUTHORIZATION, object2);
        nz3_0.a(db1_22, REQUEST_ID, object);
        object2 = couponBonanzaInfoRequest.getPageSize();
        nz3_0.b(db1_22, PAGE_SIZE, object2);
        object2 = couponBonanzaInfoRequest.getFilter();
        nz3_0.b(db1_22, FILTER, object2);
        int n3 = couponBonanzaInfoRequest.getPageNumber();
        object2 = new Integer(n3);
        nz3_0.b(db1_22, PAGE_NUMBER, object2);
        object = pa1_0.b;
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        db1_22.b = object;
        object = new tb1_1(db1_22, da1_22);
        return ((tb1_1)object).b(f80_02);
    }

    public final Object purchaseCoupons(String object, String object2, CouponBonanzaInfoRequest object3, f80_0 f80_02) {
        da1_2 da1_22 = AJioServiceLocator.INSTANCE.getHttpApiClient();
        db1_2 db1_22 = new db1_2();
        Intrinsics.checkNotNullParameter(db1_22, "<this>");
        Intrinsics.checkNotNullParameter(object2, "urlString");
        hu3_0.b(db1_22.a, (String)object2);
        object2 = ((CouponBonanzaInfoRequest)object3).getAuthorization();
        nz3_0.a(db1_22, AUTHORIZATION, object2);
        nz3_0.a(db1_22, REQUEST_ID, object);
        object2 = ((CouponBonanzaInfoRequest)object3).getPageSize();
        nz3_0.b(db1_22, PAGE_SIZE, object2);
        object2 = ((CouponBonanzaInfoRequest)object3).getFilter();
        nz3_0.b(db1_22, FILTER, object2);
        int n3 = ((CouponBonanzaInfoRequest)object3).getPageNumber();
        object2 = new Integer(n3);
        nz3_0.b(db1_22, PAGE_NUMBER, object2);
        object2 = ((CouponBonanzaInfoRequest)object3).getOfferIds();
        Intrinsics.checkNotNull(object2);
        object3 = k70$a.a;
        object = new hj3_1((String)object2, (k70_0)object3);
        object2 = "<set-?>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        db1_22.d = object;
        db1_22.a(null);
        object = pa1_0.c;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        db1_22.b = object;
        object = new tb1_1(db1_22, da1_22);
        return ((tb1_1)object).b(f80_02);
    }
}

