/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.store;

import com.affise.attribution.referrer.AffiseReferrerData;
import kotlin.jvm.functions.Function0;

public interface StoreApi {
    public AffiseReferrerData getInstallReferrerData();

    public void startInstallReferrerRetrieve(Function0 var1);
}

