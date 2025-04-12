/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads.di;

import com.ril.ajio.jiobannerads.BannerAdsRepository;
import com.ril.ajio.jiobannerads.di.NetworkModule;
import com.ril.ajio.services.network.api.BannerAdsServiceApi;
import javax.inject.Provider;

public final class NetworkModule_BindApiRepoFactory
implements nb2_2 {
    private final nb2_2 bannerAdsServiceProvider;
    private final NetworkModule module;

    public NetworkModule_BindApiRepoFactory(NetworkModule networkModule, nb2_2 nb2_22) {
        this.module = networkModule;
        this.bannerAdsServiceProvider = nb2_22;
    }

    public static BannerAdsRepository bindApiRepo(NetworkModule object, BannerAdsServiceApi bannerAdsServiceApi) {
        object = ((NetworkModule)object).bindApiRepo(bannerAdsServiceApi);
        nx2_2.a(object);
        return object;
    }

    public static NetworkModule_BindApiRepoFactory create(NetworkModule networkModule, nb2_2 nb2_22) {
        NetworkModule_BindApiRepoFactory networkModule_BindApiRepoFactory = new NetworkModule_BindApiRepoFactory(networkModule, nb2_22);
        return networkModule_BindApiRepoFactory;
    }

    public static NetworkModule_BindApiRepoFactory create(NetworkModule networkModule, Provider provider) {
        provider = ob2_2.a(provider);
        NetworkModule_BindApiRepoFactory networkModule_BindApiRepoFactory = new NetworkModule_BindApiRepoFactory(networkModule, (nb2_2)provider);
        return networkModule_BindApiRepoFactory;
    }

    public BannerAdsRepository get() {
        NetworkModule networkModule = this.module;
        BannerAdsServiceApi bannerAdsServiceApi = (BannerAdsServiceApi)this.bannerAdsServiceProvider.get();
        return NetworkModule_BindApiRepoFactory.bindApiRepo(networkModule, bannerAdsServiceApi);
    }
}

