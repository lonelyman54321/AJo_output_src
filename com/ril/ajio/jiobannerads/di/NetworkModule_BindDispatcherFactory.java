/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads.di;

import com.ril.ajio.jiobannerads.di.NetworkModule;
import kotlinx.coroutines.c;

public final class NetworkModule_BindDispatcherFactory
implements nb2_2 {
    private final NetworkModule module;

    public NetworkModule_BindDispatcherFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static c bindDispatcher(NetworkModule object) {
        object = ((NetworkModule)object).bindDispatcher();
        nx2_2.a(object);
        return object;
    }

    public static NetworkModule_BindDispatcherFactory create(NetworkModule networkModule) {
        NetworkModule_BindDispatcherFactory networkModule_BindDispatcherFactory = new NetworkModule_BindDispatcherFactory(networkModule);
        return networkModule_BindDispatcherFactory;
    }

    public c get() {
        return NetworkModule_BindDispatcherFactory.bindDispatcher(this.module);
    }
}

