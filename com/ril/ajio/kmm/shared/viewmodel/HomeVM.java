/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.viewmodel;

import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.ResponseStatusType;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.kmm.shared.model.request.HomeReq;
import com.ril.ajio.kmm.shared.util.CommonFlow;
import com.ril.ajio.kmm.shared.util.CommonFlowKt;
import com.ril.ajio.kmm.shared.viewmodel.BaseViewModel;
import com.ril.ajio.kmm.shared.viewmodel.HomeVM$fetchHomeData$$inlined$CoroutineExceptionHandler$1;
import com.ril.ajio.kmm.shared.viewmodel.HomeVM$fetchHomeData$2;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class HomeVM
extends BaseViewModel {
    private final ur1_2 homeDataMSF;
    private final CommonFlow homeDataSF;

    public HomeVM() {
        BaseResponse baseResponse;
        ResponseStatusType responseStatusType = ResponseStatusType.API_LOADING;
        Object object = baseResponse;
        baseResponse = new BaseResponse(responseStatusType, null, null, null, null, null, 62, null);
        this.homeDataMSF = object = lb3_2.a(baseResponse);
        this.homeDataSF = object = CommonFlowKt.asCommonFlow((es0_2)object);
    }

    public static final /* synthetic */ ur1_2 access$getHomeDataMSF$p(HomeVM homeVM) {
        return homeVM.homeDataMSF;
    }

    public static /* synthetic */ void fetchHomeData$default(HomeVM homeVM, ScreenInfo screenInfo, String string2, HomeReq homeReq, Map map2, Map map3, int n3, Object object) {
        int n4 = n3 & 8;
        Map map4 = n4 != 0 ? null : map2;
        int n7 = n3 & 0x10;
        Map map5 = n7 != 0 ? null : map3;
        homeVM.fetchHomeData(screenInfo, string2, homeReq, map4, map5);
    }

    public final void fetchHomeData(ScreenInfo screenInfo, String string2, HomeReq homeReq, Map map2, Map map3) {
        HomeVM$fetchHomeData$2 homeVM$fetchHomeData$2;
        Intrinsics.checkNotNullParameter(screenInfo, "screenInfo");
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(homeReq, "homeReq");
        i90_0 i90_02 = this.getClientScope();
        Object object = C90$a.a;
        HomeVM$fetchHomeData$$inlined$CoroutineExceptionHandler$1 homeVM$fetchHomeData$$inlined$CoroutineExceptionHandler$1 = new HomeVM$fetchHomeData$$inlined$CoroutineExceptionHandler$1((C90$a)object, this);
        object = homeVM$fetchHomeData$2;
        homeVM$fetchHomeData$2 = new HomeVM$fetchHomeData$2(screenInfo, string2, homeReq, map2, map3, this, null);
        Ae3.d(i90_02, homeVM$fetchHomeData$$inlined$CoroutineExceptionHandler$1, null, homeVM$fetchHomeData$2, 2);
    }

    public final CommonFlow getHomeDataSF() {
        return this.homeDataSF;
    }
}

