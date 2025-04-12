/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads.di;

import com.ril.ajio.jiobannerads.di.NetworkModule;
import com.ril.ajio.services.network.api.BannerAdsServiceApi;

public final class NetworkModule_BindServiceFactory
implements nb2_2 {
    private final NetworkModule module;

    public NetworkModule_BindServiceFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static BannerAdsServiceApi bindService(NetworkModule object) {
        object = ((NetworkModule)object).bindService();
        nx2_2.a(object);
        return object;
    }

    public static NetworkModule_BindServiceFactory create(NetworkModule networkModule) {
        NetworkModule_BindServiceFactory networkModule_BindServiceFactory = new NetworkModule_BindServiceFactory(networkModule);
        return networkModule_BindServiceFactory;
    }

    public BannerAdsServiceApi get() {
        return NetworkModule_BindServiceFactory.bindService(this.module);
    }
}

