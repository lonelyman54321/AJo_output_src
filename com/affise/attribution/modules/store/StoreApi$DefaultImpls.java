/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.store;

import com.affise.attribution.modules.store.StoreApi;
import kotlin.jvm.functions.Function0;

public final class StoreApi$DefaultImpls {
    public static /* synthetic */ void startInstallReferrerRetrieve$default(StoreApi object, Function0 function0, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 1) != 0) {
                function0 = null;
            }
            object.startInstallReferrerRetrieve(function0);
            return;
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startInstallReferrerRetrieve");
        throw object;
    }
}

