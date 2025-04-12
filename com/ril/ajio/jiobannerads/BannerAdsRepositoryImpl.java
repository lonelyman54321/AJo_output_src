/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads;

import com.ril.ajio.jiobannerads.BannerAdsRepository;
import com.ril.ajio.services.network.api.BannerAdsServiceApi;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class BannerAdsRepositoryImpl
implements BannerAdsRepository {
    public static final int $stable = 8;
    private final BannerAdsServiceApi bannerAdsService;

    public BannerAdsRepositoryImpl(BannerAdsServiceApi bannerAdsServiceApi) {
        Intrinsics.checkNotNullParameter(bannerAdsServiceApi, "bannerAdsService");
        this.bannerAdsService = bannerAdsServiceApi;
    }

    public Object callClickTracker(String object, f80_0 object2) {
        BannerAdsServiceApi bannerAdsServiceApi = this.bannerAdsService;
        if ((object = bannerAdsServiceApi.callClickImpressionAPI((String)object, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    public Object callViewImpressionTracker(String object, f80_0 object2) {
        BannerAdsServiceApi bannerAdsServiceApi = this.bannerAdsService;
        if ((object = bannerAdsServiceApi.callBannerImpressionAPI((String)object, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    public Object getBannerAds(String string2, Map map2, String string3, f80_0 f80_02) {
        return this.bannerAdsService.getBannerAds(string2, map2, string3, f80_02);
    }

    public Object getBannerAds(String string2, Map map2, HashMap hashMap, f80_0 f80_02) {
        return this.bannerAdsService.getBannerAds(string2, map2, hashMap, f80_02);
    }

    public Object getBannersForDifferentPages(String string2, Map map2, String string3, f80_0 f80_02) {
        return this.bannerAdsService.getBannersForPages(string2, map2, string3, f80_02);
    }

    public Object getThirdPartyAdBannersForDifferentPages(String string2, Map map2, HashMap hashMap, f80_0 f80_02) {
        return this.bannerAdsService.getThirdPartyAdBannersForPages(string2, map2, hashMap, f80_02);
    }
}

