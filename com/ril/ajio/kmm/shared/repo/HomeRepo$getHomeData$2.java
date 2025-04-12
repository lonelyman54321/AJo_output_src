/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.repo;

import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.BaseResponse$Companion;
import com.ril.ajio.kmm.shared.model.StatusInfo;
import com.ril.ajio.kmm.shared.model.home.CMSData;
import com.ril.ajio.kmm.shared.model.home.CMSRequestType;
import com.ril.ajio.kmm.shared.model.home.transform.HomeData$Builder;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.kmm.shared.model.request.HomeReq;
import com.ril.ajio.kmm.shared.network.api.HomeApi;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class HomeRepo$getHomeData$2
extends qg3_2
implements Function2 {
    final /* synthetic */ Map $extraBodyParams;
    final /* synthetic */ Map $extraHeaders;
    final /* synthetic */ HomeReq $homeReq;
    final /* synthetic */ ScreenInfo $screenInfo;
    final /* synthetic */ String $url;
    int label;

    public HomeRepo$getHomeData$2(String string2, HomeReq homeReq, Map map2, Map map3, ScreenInfo screenInfo, f80_0 f80_02) {
        this.$url = string2;
        this.$homeReq = homeReq;
        this.$extraBodyParams = map2;
        this.$extraHeaders = map3;
        this.$screenInfo = screenInfo;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.$url;
        HomeReq homeReq = this.$homeReq;
        Map map2 = this.$extraBodyParams;
        Map map3 = this.$extraHeaders;
        ScreenInfo screenInfo = this.$screenInfo;
        object = new HomeRepo$getHomeData$2(string2, homeReq, map2, map3, screenInfo, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (HomeRepo$getHomeData$2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((HomeRepo$getHomeData$2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        HomeRepo$getHomeData$2 homeRepo$getHomeData$2 = this;
        Object object6 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw illegalStateException;
            }
            vl2_2.b(object);
            object5 = object;
        } else {
            vl2_2.b(object);
            object5 = HomeApi.INSTANCE;
            object4 = this.$url;
            object3 = this.$homeReq;
            Map map2 = this.$extraBodyParams;
            Object object7 = this.$extraHeaders;
            this.label = n4;
            object2 = object4;
            object4 = object3;
            object3 = map2;
            map2 = object7;
            object7 = this;
            object5 = ((HomeApi)object5).getHomeData((String)object2, (HomeReq)object4, (Map)object3, map2, this);
            if (object5 == object6) {
                return object6;
            }
        }
        object5 = (CMSData)object5;
        n4 = (int)(((StatusInfo)object5).isSuccess() ? 1 : 0);
        if (n4 == 0) {
            object2 = BaseResponse.Companion;
            return ((BaseResponse$Companion)object2).onFailed((StatusInfo)object5);
        }
        object2 = BaseResponse.Companion;
        object6 = new HomeData$Builder();
        ScreenInfo screenInfo = homeRepo$getHomeData$2.$screenInfo;
        boolean bl2 = homeRepo$getHomeData$2.$homeReq.isProductWidgetEnabled();
        boolean bl3 = homeRepo$getHomeData$2.$homeReq.isSTLEnabled();
        boolean bl4 = homeRepo$getHomeData$2.$homeReq.isRecentlyViewedEnabled();
        boolean bl5 = homeRepo$getHomeData$2.$homeReq.isImageSearchEnabled();
        boolean bl6 = homeRepo$getHomeData$2.$homeReq.isTrendingCategoryEnabled();
        object4 = homeRepo$getHomeData$2.$homeReq.getLoggedIn();
        if (object4 == null) {
            object4 = "";
        }
        object3 = "LOGGED_IN";
        boolean bl7 = ((String)object3).equalsIgnoreCase((String)object4);
        CMSRequestType cMSRequestType = homeRepo$getHomeData$2.$homeReq.getRequestType();
        boolean bl8 = homeRepo$getHomeData$2.$homeReq.isVideoEnableOnSTL();
        boolean bl9 = homeRepo$getHomeData$2.$homeReq.isVideoEnableOnCMS();
        boolean bl10 = homeRepo$getHomeData$2.$homeReq.isWishListEnableOnSearch();
        boolean bl11 = homeRepo$getHomeData$2.$homeReq.isOlpCardsEnabled();
        boolean bl12 = homeRepo$getHomeData$2.$homeReq.isExternalAdEnabled();
        boolean bl13 = homeRepo$getHomeData$2.$homeReq.isSimilarProductWidgetEnabledPDP();
        object4 = ((HomeData$Builder)object6).build((CMSData)object5, screenInfo, bl2, bl3, bl4, bl5, bl6, bl7, cMSRequestType, bl8, bl9, bl10, bl11, bl12, bl13);
        return ((BaseResponse$Companion)object2).onSuccess((StatusInfo)object5, object4);
    }
}

