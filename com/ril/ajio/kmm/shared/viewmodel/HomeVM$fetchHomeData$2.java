/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.viewmodel;

import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.kmm.shared.model.request.HomeReq;
import com.ril.ajio.kmm.shared.repo.HomeRepo;
import com.ril.ajio.kmm.shared.viewmodel.HomeVM;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class HomeVM$fetchHomeData$2
extends qg3_2
implements Function2 {
    final /* synthetic */ Map $extraBodyParams;
    final /* synthetic */ Map $extraHeaders;
    final /* synthetic */ HomeReq $homeReq;
    final /* synthetic */ ScreenInfo $screenInfo;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ HomeVM this$0;

    public HomeVM$fetchHomeData$2(ScreenInfo screenInfo, String string2, HomeReq homeReq, Map map2, Map map3, HomeVM homeVM, f80_0 f80_02) {
        this.$screenInfo = screenInfo;
        this.$url = string2;
        this.$homeReq = homeReq;
        this.$extraBodyParams = map2;
        this.$extraHeaders = map3;
        this.this$0 = homeVM;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ScreenInfo screenInfo = this.$screenInfo;
        String string2 = this.$url;
        HomeReq homeReq = this.$homeReq;
        Map map2 = this.$extraBodyParams;
        Map map3 = this.$extraHeaders;
        HomeVM homeVM = this.this$0;
        object = new HomeVM$fetchHomeData$2(screenInfo, string2, homeReq, map2, map3, homeVM, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (HomeVM$fetchHomeData$2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((HomeVM$fetchHomeData$2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            HomeRepo homeRepo = HomeRepo.INSTANCE;
            object = this.$screenInfo;
            String string2 = this.$url;
            HomeReq homeReq = this.$homeReq;
            Map map2 = this.$extraBodyParams;
            Map map3 = this.$extraHeaders;
            this.label = n4;
            object = homeRepo.getHomeData((ScreenInfo)object, string2, homeReq, map2, map3, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = (BaseResponse)object;
        HomeVM.access$getHomeDataMSF$p(this.this$0).setValue(object);
        return Unit.a;
    }
}

