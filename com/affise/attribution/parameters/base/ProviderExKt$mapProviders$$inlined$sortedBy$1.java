/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.base;

import com.affise.attribution.parameters.base.Provider;
import java.util.Comparator;

public final class ProviderExKt$mapProviders$$inlined$sortedBy$1
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = Float.valueOf(((Provider)object).getOrder());
        object2 = Float.valueOf(((Provider)object2).getOrder());
        return q00_0.a((Comparable)object, (Comparable)object2);
    }
}

