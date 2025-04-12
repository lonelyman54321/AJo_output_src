/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads;

import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.jiobannerads.domain.BannerAdUseCase;
import javax.inject.Provider;
import kotlinx.coroutines.c;

public final class BannerAdViewModel_Factory
implements nb2_2 {
    private final nb2_2 bannerAdUseCaseProvider;
    private final nb2_2 dispatcherProvider;

    public BannerAdViewModel_Factory(nb2_2 nb2_22, nb2_2 nb2_23) {
        this.bannerAdUseCaseProvider = nb2_22;
        this.dispatcherProvider = nb2_23;
    }

    public static BannerAdViewModel_Factory create(nb2_2 nb2_22, nb2_2 nb2_23) {
        BannerAdViewModel_Factory bannerAdViewModel_Factory = new BannerAdViewModel_Factory(nb2_22, nb2_23);
        return bannerAdViewModel_Factory;
    }

    public static BannerAdViewModel_Factory create(Provider provider, Provider provider2) {
        provider = ob2_2.a(provider);
        provider2 = ob2_2.a(provider2);
        BannerAdViewModel_Factory bannerAdViewModel_Factory = new BannerAdViewModel_Factory((nb2_2)provider, (nb2_2)provider2);
        return bannerAdViewModel_Factory;
    }

    public static BannerAdViewModel newInstance(BannerAdUseCase bannerAdUseCase, c c2) {
        BannerAdViewModel bannerAdViewModel = new BannerAdViewModel(bannerAdUseCase, c2);
        return bannerAdViewModel;
    }

    public BannerAdViewModel get() {
        BannerAdUseCase bannerAdUseCase = (BannerAdUseCase)this.bannerAdUseCaseProvider.get();
        c c2 = (c)this.dispatcherProvider.get();
        return BannerAdViewModel_Factory.newInstance(bannerAdUseCase, c2);
    }
}

