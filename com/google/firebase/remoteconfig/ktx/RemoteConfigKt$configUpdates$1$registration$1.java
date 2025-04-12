/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.ktx;

import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

public final class RemoteConfigKt$configUpdates$1$registration$1
implements ConfigUpdateListener {
    final /* synthetic */ pz2_2 $$this$callbackFlow;
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;

    public RemoteConfigKt$configUpdates$1$registration$1(FirebaseRemoteConfig firebaseRemoteConfig, pz2_2 pz2_22) {
        this.$this_configUpdates = firebaseRemoteConfig;
        this.$$this$callbackFlow = pz2_22;
    }

    public static /* synthetic */ void a(pz2_2 pz2_22, ConfigUpdate configUpdate) {
        RemoteConfigKt$configUpdates$1$registration$1.onUpdate$lambda$0(pz2_22, configUpdate);
    }

    private static final void onUpdate$lambda$0(pz2_2 pz2_22, ConfigUpdate configUpdate) {
        Intrinsics.checkNotNullParameter(pz2_22, "$$this$callbackFlow");
        Intrinsics.checkNotNullParameter(configUpdate, "$configUpdate");
        yr_2.a(pz2_22, configUpdate);
    }

    public void onError(FirebaseRemoteConfigException exception) {
        Intrinsics.checkNotNullParameter(exception, "error");
        pz2_2 pz2_22 = this.$$this$callbackFlow;
        exception = xc0_2.a("Error listening for config updates.", exception);
        d.b(pz2_22, (CancellationException)exception);
    }

    public void onUpdate(ConfigUpdate configUpdate) {
        Intrinsics.checkNotNullParameter(configUpdate, "configUpdate");
        FirebaseRemoteConfig firebaseRemoteConfig = this.$this_configUpdates;
        pz2_2 pz2_22 = this.$$this$callbackFlow;
        BI2 bI2 = new BI2(pz2_22, configUpdate);
        firebaseRemoteConfig.schedule(bI2);
    }
}

