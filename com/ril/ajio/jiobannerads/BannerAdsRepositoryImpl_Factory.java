/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads;

import com.ril.ajio.jiobannerads.BannerAdsRepositoryImpl;
import com.ril.ajio.services.network.api.BannerAdsServiceApi;
import javax.inject.Provider;

public final class BannerAdsRepositoryImpl_Factory
implements nb2_2 {
    private final nb2_2 bannerAdsServiceProvider;

    public BannerAdsRepositoryImpl_Factory(nb2_2 nb2_22) {
        this.bannerAdsServiceProvider = nb2_22;
    }

    public static BannerAdsRepositoryImpl_Factory create(nb2_2 nb2_22) {
        BannerAdsRepositoryImpl_Factory bannerAdsRepositoryImpl_Factory = new BannerAdsRepositoryImpl_Factory(nb2_22);
        return bannerAdsRepositoryImpl_Factory;
    }

    public static BannerAdsRepositoryImpl_Factory create(Provider provider) {
        provider = ob2_2.a(provider);
        BannerAdsRepositoryImpl_Factory bannerAdsRepositoryImpl_Factory = new BannerAdsRepositoryImpl_Factory((nb2_2)provider);
        return bannerAdsRepositoryImpl_Factory;
    }

    public static BannerAdsRepositoryImpl newInstance(BannerAdsServiceApi bannerAdsServiceApi) {
        BannerAdsRepositoryImpl bannerAdsRepositoryImpl = new BannerAdsRepositoryImpl(bannerAdsServiceApi);
        return bannerAdsRepositoryImpl;
    }

    public BannerAdsRepositoryImpl get() {
        return BannerAdsRepositoryImpl_Factory.newInstance((BannerAdsServiceApi)this.bannerAdsServiceProvider.get());
    }
}

