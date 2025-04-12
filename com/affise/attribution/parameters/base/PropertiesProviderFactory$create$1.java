/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.base;

import com.affise.attribution.parameters.providers.FirstOpenTimeProvider;
import com.affise.attribution.parameters.providers.LastSessionTimeProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class PropertiesProviderFactory$create$1
extends Lambda
implements Function0 {
    final /* synthetic */ FirstOpenTimeProvider $firstOpenTimeProvider;
    final /* synthetic */ LastSessionTimeProvider $lastSessionTimeProvider;

    public PropertiesProviderFactory$create$1(LastSessionTimeProvider lastSessionTimeProvider, FirstOpenTimeProvider firstOpenTimeProvider) {
        this.$lastSessionTimeProvider = lastSessionTimeProvider;
        this.$firstOpenTimeProvider = firstOpenTimeProvider;
        super(0);
    }

    public final Long invoke() {
        Long l2;
        block5: {
            block4: {
                long l3;
                l2 = this.$lastSessionTimeProvider.provide();
                if (l2 == null) break block4;
                long l4 = l2;
                long l7 = l4 - (l3 = 0L);
                Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object <= 0) {
                    l2 = null;
                }
                if (l2 != null) break block5;
            }
            l2 = (Long)this.$firstOpenTimeProvider.provideWithDefault();
        }
        return l2;
    }
}

