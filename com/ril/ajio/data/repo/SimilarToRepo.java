/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.ril.ajio.data.repo;

import android.content.Context;
import android.text.TextUtils;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.SimilarToRepo$Companion;
import com.ril.ajio.data.repo.SimilarToRepo$getSimilarProducts$$inlined$map$1;
import com.ril.ajio.data.repo.SimilarToRepo$getSimilarProducts$1;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.PDPApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import com.ril.ajio.services.query.QueryProductDetails;
import java.util.HashMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class SimilarToRepo
implements BaseRepo {
    public static final int $stable;
    public static final SimilarToRepo$Companion Companion;
    private static final String clientType;
    private static final String clientVersion;
    private final jo_2 appPreferences;
    private final AJIOApplication context;
    private final PDPApi pdpApi;
    private final UserInformation userInformation;

    static {
        SimilarToRepo$Companion similarToRepo$Companion;
        Companion = similarToRepo$Companion = new SimilarToRepo$Companion(null);
        $stable = 8;
        clientType = "Android";
        clientVersion = em_1.a(AJIOApplication.Companion);
    }

    public SimilarToRepo() {
        jo_2 jo_22;
        Object object = AjioApiConnector.INSTANCE.gePDPApi();
        this.pdpApi = object;
        AJIOApplication.Companion.getClass();
        this.context = object = AJIOApplication$a.a();
        this.appPreferences = jo_22 = new jo_2((Context)object);
        this.userInformation = object = UserInformation.getInstance((Context)object);
    }

    public static final /* synthetic */ String access$getClientType$cp() {
        return clientType;
    }

    public static final /* synthetic */ String access$getClientVersion$cp() {
        return clientVersion;
    }

    public static final /* synthetic */ PDPApi access$getPdpApi$p(SimilarToRepo similarToRepo) {
        return similarToRepo.pdpApi;
    }

    public static /* synthetic */ es0_2 getSimilarProducts$default(SimilarToRepo similarToRepo, QueryProductDetails queryProductDetails, String string2, String string3, boolean bl2, int n3, Object object) {
        if ((n3 &= 8) != 0) {
            bl2 = false;
        }
        return similarToRepo.getSimilarProducts(queryProductDetails, string2, string3, bl2);
    }

    public final es0_2 getSimilarProducts(QueryProductDetails object, String object2, String object3, boolean bl2) {
        int n3;
        int n4;
        Intrinsics.checkNotNullParameter(object, "queryProduct");
        Intrinsics.checkNotNullParameter(object2, "similarProductsVariantParam");
        Intrinsics.checkNotNullParameter(object3, "storeId");
        object3 = UrlHelper.Companion.getInstance();
        String string2 = ((QueryProductDetails)object).getProductCode();
        int n7 = 1;
        Object object4 = new Object[n7];
        object4[0] = string2;
        string2 = "pdp";
        String string3 = "similar_list";
        String string4 = ((UrlHelper)object3).getApiUrl(string2, string3, object4);
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        object3 = ((QueryProductDetails)object).getStoreId();
        if (object3 != null) {
            cp_1.Companion.getClass();
            object3 = cp$a.e();
            string2 = ((QueryProductDetails)object).getStoreId();
            object4 = "getStoreId(...)";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object4);
            object3.getClass();
            object3 = cp_1.z(string2);
            string2 = "store";
            hashMap.put(string2, object3);
        }
        if ((n4 = ((QueryProductDetails)object).isRatingEnabled()) == n7) {
            object3 = "displayRatings";
            string2 = "true";
            hashMap.put(object3, string2);
        }
        if (bl2 && (object3 = ((QueryProductDetails)object).getUnavailableSize()) != null && (n4 = ((String)object3).length()) != 0) {
            object3 = h40_0.a;
            object3 = z40_0.Companion;
            object3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a.b("pdp_similar_size_filter_key");
            object = ((QueryProductDetails)object).getUnavailableSize();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object3);
            stringBuilder.append(":");
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            object3 = "filters";
            hashMap.put(object3, object);
        }
        if ((n3 = h40_0.Q1()) != 0 && (object = this.appPreferences.m()) != null && (n3 = ((String)object).length()) != 0) {
            object = String.valueOf(this.appPreferences.m());
            object3 = "pincode";
            hashMap.put(object3, object);
        }
        object = cp_1.Companion;
        object.getClass();
        n3 = cp$a.p();
        if (n3 != 0 && (object = this.appPreferences.f()) != null && (n3 = ((String)object).length()) != 0) {
            object = String.valueOf(this.appPreferences.f());
            object3 = "customertype";
            hashMap.put(object3, object);
        }
        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0)) == 0) {
            object = new String[]{"="};
            n4 = 6;
            object = StringsKt.a0((CharSequence)object2, (String[])object, false, 0, n4);
            object2 = new String[0];
            int n8 = ((Object)(object = object.toArray((T[])object2))).length;
            if (n8 > n7) {
                object2 = object[0];
                object = object[n7];
                hashMap.put(object2, object);
            }
        }
        if ((object = this.userInformation.getUserSegementIds()) != null && (n3 = ((String)object).length()) != 0) {
            object = this.userInformation.getUserSegementIds();
            object2 = "segmentIds";
            hashMap.put(object2, object);
        }
        object = CustomerStoreType.a;
        object = "rilfnl_v1";
        object2 = ScreenType.SCREEN_PDP;
        String string5 = CustomerStoreType.a((String)object, (ScreenType)((Object)object2));
        n3 = (int)(mz3_0.y(string5) ? 1 : 0);
        if (n3 != 0 && (n3 = (int)(ww0_2.c() ? 1 : 0)) != 0 && (n3 = string5.length()) != 0) {
            object = "userClusterId";
            hashMap.put(object, string5);
        }
        TU2.a(hashMap);
        object = new SimilarToRepo$getSimilarProducts$1(this, string4, string5, hashMap, null);
        object2 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        object2 = new SimilarToRepo$getSimilarProducts$$inlined$map$1((es0_2)object);
        return object2;
    }

    public final DataCallback handleApiException(String string2, Throwable throwable, String string3, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "requestId");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, bl2, null, null, 24, null);
    }
}

