/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.repo;

import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.kmm.shared.model.request.HomeReq;
import com.ril.ajio.kmm.shared.repo.HomeRepo$getHomeData$2;
import com.ril.ajio.kmm.shared.util.DispatchersKt;
import java.util.Map;
import kotlinx.coroutines.c;

public final class HomeRepo {
    public static final HomeRepo INSTANCE;

    static {
        HomeRepo homeRepo;
        INSTANCE = homeRepo = new HomeRepo();
    }

    private HomeRepo() {
    }

    public static /* synthetic */ Object getHomeData$default(HomeRepo homeRepo, ScreenInfo screenInfo, String string2, HomeReq homeReq, Map map2, Map map3, f80_0 f80_02, int n3, Object object) {
        int n4 = n3 & 8;
        Map map4 = n4 != 0 ? null : map2;
        n4 = n3 & 0x10;
        Map map5 = n4 != 0 ? null : map3;
        return homeRepo.getHomeData(screenInfo, string2, homeReq, map4, map5, f80_02);
    }

    public final Object getHomeData(ScreenInfo screenInfo, String string2, HomeReq homeReq, Map map2, Map map3, f80_0 f80_02) {
        c c2 = DispatchersKt.getIoDispatcher();
        HomeRepo$getHomeData$2 homeRepo$getHomeData$2 = new HomeRepo$getHomeData$2(string2, homeReq, map2, map3, screenInfo, null);
        return Ae3.g(f80_02, c2, homeRepo$getHomeData$2);
    }
}

