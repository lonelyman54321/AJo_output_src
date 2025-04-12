/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.ktx;

import com.google.firebase.FirebaseApp;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings$Builder;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.ktx.RemoteConfigKt$configUpdates$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class RemoteConfigKt {
    public static final FirebaseRemoteConfigValue get(FirebaseRemoteConfig object, String string2) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(string2, "key");
        object = ((FirebaseRemoteConfig)object).getValue(string2);
        Intrinsics.checkNotNullExpressionValue(object, "this.getValue(key)");
        return object;
    }

    public static final es0_2 getConfigUpdates(FirebaseRemoteConfig firebaseRemoteConfig) {
        Intrinsics.checkNotNullParameter(firebaseRemoteConfig, "<this>");
        RemoteConfigKt$configUpdates$1 remoteConfigKt$configUpdates$1 = new RemoteConfigKt$configUpdates$1(firebaseRemoteConfig, null);
        return ms0_1.d(remoteConfigKt$configUpdates$1);
    }

    public static /* synthetic */ void getConfigUpdates$annotations(FirebaseRemoteConfig firebaseRemoteConfig) {
    }

    public static final FirebaseRemoteConfig getRemoteConfig(Firebase object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = FirebaseRemoteConfig.getInstance();
        Intrinsics.checkNotNullExpressionValue(object, "getInstance()");
        return object;
    }

    public static final FirebaseRemoteConfig remoteConfig(Firebase object, FirebaseApp firebaseApp) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(firebaseApp, "app");
        object = FirebaseRemoteConfig.getInstance(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(object, "getInstance(app)");
        return object;
    }

    public static final FirebaseRemoteConfigSettings remoteConfigSettings(Function1 object) {
        Intrinsics.checkNotNullParameter(object, "init");
        FirebaseRemoteConfigSettings$Builder firebaseRemoteConfigSettings$Builder = new FirebaseRemoteConfigSettings$Builder();
        object.invoke(firebaseRemoteConfigSettings$Builder);
        object = firebaseRemoteConfigSettings$Builder.build();
        Intrinsics.checkNotNullExpressionValue(object, "builder.build()");
        return object;
    }
}

