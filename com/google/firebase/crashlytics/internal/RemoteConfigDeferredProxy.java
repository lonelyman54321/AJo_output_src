/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;

public class RemoteConfigDeferredProxy {
    private final Deferred remoteConfigInteropDeferred;

    public RemoteConfigDeferredProxy(Deferred deferred) {
        this.remoteConfigInteropDeferred = deferred;
    }

    public static /* synthetic */ void a(CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener, Provider provider) {
        RemoteConfigDeferredProxy.lambda$setupListener$0(crashlyticsRemoteConfigListener, provider);
    }

    private static /* synthetic */ void lambda$setupListener$0(CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener, Provider provider) {
        ((FirebaseRemoteConfigInterop)provider.get()).registerRolloutsStateSubscriber("firebase", crashlyticsRemoteConfigListener);
        Logger.getLogger().d("Registering RemoteConfig Rollouts subscriber");
    }

    public void setupListener(UserMetadata object) {
        if (object == null) {
            Logger.getLogger().w("Didn't successfully register with UserMetadata for rollouts listener");
            return;
        }
        CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener = new CrashlyticsRemoteConfigListener((UserMetadata)object);
        object = this.remoteConfigInteropDeferred;
        AI2 aI2 = new AI2(crashlyticsRemoteConfigListener);
        object.whenAvailable(aI2);
    }
}

