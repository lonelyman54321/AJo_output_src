/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads.di;

import com.ril.ajio.jiobannerads.BannerAdsRepository;
import com.ril.ajio.jiobannerads.di.NetworkModule;
import com.ril.ajio.jiobannerads.domain.BannerAdUseCase;
import javax.inject.Provider;

public final class NetworkModule_BindBannerAdUseCaseFactory
implements nb2_2 {
    private final nb2_2 bannerAdsRepositoryProvider;
    private final NetworkModule module;

    public NetworkModule_BindBannerAdUseCaseFactory(NetworkModule networkModule, nb2_2 nb2_22) {
        this.module = networkModule;
        this.bannerAdsRepositoryProvider = nb2_22;
    }

    public static BannerAdUseCase bindBannerAdUseCase(NetworkModule object, BannerAdsRepository bannerAdsRepository) {
        object = ((NetworkModule)object).bindBannerAdUseCase(bannerAdsRepository);
        nx2_2.a(object);
        return object;
    }

    public static NetworkModule_BindBannerAdUseCaseFactory create(NetworkModule networkModule, nb2_2 nb2_22) {
        NetworkModule_BindBannerAdUseCaseFactory networkModule_BindBannerAdUseCaseFactory = new NetworkModule_BindBannerAdUseCaseFactory(networkModule, nb2_22);
        return networkModule_BindBannerAdUseCaseFactory;
    }

    public static NetworkModule_BindBannerAdUseCaseFactory create(NetworkModule networkModule, Provider provider) {
        provider = ob2_2.a(provider);
        NetworkModule_BindBannerAdUseCaseFactory networkModule_BindBannerAdUseCaseFactory = new NetworkModule_BindBannerAdUseCaseFactory(networkModule, (nb2_2)provider);
        return networkModule_BindBannerAdUseCaseFactory;
    }

    public BannerAdUseCase get() {
        NetworkModule networkModule = this.module;
        BannerAdsRepository bannerAdsRepository = (BannerAdsRepository)this.bannerAdsRepositoryProvider.get();
        return NetworkModule_BindBannerAdUseCaseFactory.bindBannerAdUseCase(networkModule, bannerAdsRepository);
    }
}

