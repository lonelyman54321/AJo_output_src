/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads.di;

import com.ril.ajio.jiobannerads.BannerAdsRepository;
import com.ril.ajio.jiobannerads.BannerAdsRepositoryImpl;
import com.ril.ajio.jiobannerads.domain.BannerAdUseCase;
import com.ril.ajio.services.network.api.BannerAdsServiceApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;

public final class NetworkModule {
    public static final int $stable;

    public final BannerAdsRepository bindApiRepo(BannerAdsServiceApi bannerAdsServiceApi) {
        Intrinsics.checkNotNullParameter(bannerAdsServiceApi, "bannerAdsService");
        BannerAdsRepositoryImpl bannerAdsRepositoryImpl = new BannerAdsRepositoryImpl(bannerAdsServiceApi);
        return bannerAdsRepositoryImpl;
    }

    public final BannerAdUseCase bindBannerAdUseCase(BannerAdsRepository bannerAdsRepository) {
        Intrinsics.checkNotNullParameter(bannerAdsRepository, "bannerAdsRepository");
        BannerAdUseCase bannerAdUseCase = new BannerAdUseCase(bannerAdsRepository);
        return bannerAdUseCase;
    }

    public final c bindDispatcher() {
        return em0_2.b;
    }

    public final BannerAdsServiceApi bindService() {
        return AjioApiConnector.INSTANCE.getBannerAdsServiceApi();
    }
}

