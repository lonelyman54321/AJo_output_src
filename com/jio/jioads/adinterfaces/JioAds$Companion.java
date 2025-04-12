/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAds;
import kotlin.jvm.internal.Intrinsics;

public final class JioAds$Companion {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JioAds getInstance() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                String string2;
                JioAds jioAds;
                block3: {
                    try {
                        jioAds = JioAds.access$getJioAdSdkInstance$cp();
                        if (jioAds != null) break block3;
                        string2 = null;
                        jioAds = new JioAds(null);
                        JioAds.access$setJioAdSdkInstance$cp(jioAds);
                        jioAds = null;
                        JioAds.access$setSdkInitialized$cp(false);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                jioAds = JioAds.access$getJioAdSdkInstance$cp();
                string2 = "null cannot be cast to non-null type com.jio.jioads.adinterfaces.JioAds";
                Intrinsics.checkNotNull(jioAds, string2);
                return jioAds;
            }
            throw throwable2;
        }
    }
}

