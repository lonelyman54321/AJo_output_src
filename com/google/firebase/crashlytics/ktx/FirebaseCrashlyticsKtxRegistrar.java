/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.ktx;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.ktx.FirebaseCrashlyticsKtxRegistrar$Companion;
import java.util.List;

public final class FirebaseCrashlyticsKtxRegistrar
implements ComponentRegistrar {
    public static final FirebaseCrashlyticsKtxRegistrar$Companion Companion;

    static {
        FirebaseCrashlyticsKtxRegistrar$Companion firebaseCrashlyticsKtxRegistrar$Companion;
        Companion = firebaseCrashlyticsKtxRegistrar$Companion = new FirebaseCrashlyticsKtxRegistrar$Companion(null);
    }

    public List getComponents() {
        return mz0_2.a;
    }
}

