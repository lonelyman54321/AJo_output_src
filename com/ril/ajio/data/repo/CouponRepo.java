/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.data.repo;

import android.content.Context;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.CouponRepo$applyCoupon$$inlined$map$1;
import com.ril.ajio.data.repo.CouponRepo$applyCoupon$1;
import com.ril.ajio.data.repo.CouponRepo$getSortedListsOfCoupons$$inlined$map$1;
import com.ril.ajio.data.repo.CouponRepo$getSortedListsOfCoupons$1;
import com.ril.ajio.data.repo.CouponRepo$removeCoupon$$inlined$map$1;
import com.ril.ajio.data.repo.CouponRepo$removeCoupon$1;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.CouponApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import com.ril.ajio.services.query.QuerySingleData;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class CouponRepo
implements BaseRepo {
    public static final int $stable = 8;
    private final CouponApi couponApi;
    private final UserInformation userInformation;

    public CouponRepo(Context object) {
        CouponApi couponApi;
        Intrinsics.checkNotNullParameter(object, "context");
        this.couponApi = couponApi = AjioApiConnector.INSTANCE.getCouponApi();
        object = UserInformation.getInstance(object);
        this.userInformation = object;
    }

    public static final /* synthetic */ CouponApi access$getCouponApi$p(CouponRepo couponRepo) {
        return couponRepo.couponApi;
    }

    public static final /* synthetic */ UserInformation access$getUserInformation$p(CouponRepo couponRepo) {
        return couponRepo.userInformation;
    }

    public final es0_2 applyCoupon(String object, QuerySingleData object2, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "screenName");
        Intrinsics.checkNotNullParameter(object2, "query");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object object3 = UrlHelper.Companion.getInstance();
        Object object4 = this.userInformation.getUserId();
        Object object5 = ap_0.a;
        object5 = ap_0.a(this.userInformation.isUserOnline());
        Object object6 = new Object[]{object4, object5};
        ref$ObjectRef.element = object3 = ((UrlHelper)object3).getApiUrl("cart", "apply_coupon", object6);
        ref$ObjectRef.element = object3 = ww0_2.d((String)object3);
        object4 = object3;
        object5 = this;
        object6 = object2;
        object3 = new CouponRepo$applyCoupon$1(this, ref$ObjectRef, (QuerySingleData)object2, bl2, null);
        object2 = new br2_2((Function2)object3);
        Object object7 = ir0_2.a;
        object7 = em0_2.b;
        object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object7);
        object7 = new CouponRepo$applyCoupon$$inlined$map$1((es0_2)object2, (String)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object7, (CoroutineContext)object);
    }

    public final es0_2 getSortedListsOfCoupons(String object, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "screenName");
        Object object2 = new Ref$ObjectRef();
        Object object3 = UrlHelper.Companion.getInstance();
        String string2 = this.userInformation.getUserId();
        Object object4 = ap_0.a;
        object4 = ap_0.a(this.userInformation.isUserOnline());
        Object[] objectArray = new Object[]{string2, object4};
        ((Ref$ObjectRef)object2).element = object3 = ((UrlHelper)object3).getApiUrl("cart", "coupon_list", objectArray);
        ((Ref$ObjectRef)object2).element = object3 = ww0_2.d((String)object3);
        object3 = new CouponRepo$getSortedListsOfCoupons$1(this, (Ref$ObjectRef)object2, bl2, null);
        es0_2 es0_22 = new br2_2((Function2)object3);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        es0_22 = ms0_1.m(es0_22, (CoroutineContext)object2);
        object2 = new CouponRepo$getSortedListsOfCoupons$$inlined$map$1(es0_22, (String)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 removeCoupon(QuerySingleData object, String string2) {
        Intrinsics.checkNotNullParameter(object, "querySingleData");
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Object object2 = new Ref$ObjectRef();
        UrlHelper urlHelper = UrlHelper.Companion.getInstance();
        String string3 = this.userInformation.getUserId();
        Object object3 = ap_0.a;
        object3 = ap_0.a(this.userInformation.isUserOnline());
        object = ((QuerySingleData)object).getData();
        Object[] objectArray = new Object[]{string3, object3, object};
        ((Ref$ObjectRef)object2).element = object = urlHelper.getApiUrl("cart", "remove_coupon", objectArray);
        ((Ref$ObjectRef)object2).element = object = ww0_2.d((String)object);
        object = new CouponRepo$removeCoupon$1(this, (Ref$ObjectRef)object2, null);
        object2 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        object2 = new CouponRepo$removeCoupon$$inlined$map$1((es0_2)object, string2);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }
}

