/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads.domain;

import com.ril.ajio.jiobannerads.BannerAdsRepository;
import com.ril.ajio.jiobannerads.domain.BannerAdUseCase;
import javax.inject.Provider;

public final class BannerAdUseCase_Factory
implements nb2_2 {
    private final nb2_2 bannerAdsRepositoryProvider;

    public BannerAdUseCase_Factory(nb2_2 nb2_22) {
        this.bannerAdsRepositoryProvider = nb2_22;
    }

    public static BannerAdUseCase_Factory create(nb2_2 nb2_22) {
        BannerAdUseCase_Factory bannerAdUseCase_Factory = new BannerAdUseCase_Factory(nb2_22);
        return bannerAdUseCase_Factory;
    }

    public static BannerAdUseCase_Factory create(Provider provider) {
        provider = ob2_2.a(provider);
        BannerAdUseCase_Factory bannerAdUseCase_Factory = new BannerAdUseCase_Factory((nb2_2)provider);
        return bannerAdUseCase_Factory;
    }

    public static BannerAdUseCase newInstance(BannerAdsRepository bannerAdsRepository) {
        BannerAdUseCase bannerAdUseCase = new BannerAdUseCase(bannerAdsRepository);
        return bannerAdUseCase;
    }

    public BannerAdUseCase get() {
        return BannerAdUseCase_Factory.newInstance((BannerAdsRepository)this.bannerAdsRepositoryProvider.get());
    }
}

