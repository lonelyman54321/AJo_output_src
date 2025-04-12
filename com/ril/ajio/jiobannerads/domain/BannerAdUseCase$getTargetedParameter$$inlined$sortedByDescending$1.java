/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads.domain;

import com.ril.ajio.services.data.FacetValue;
import java.util.Comparator;

public final class BannerAdUseCase$getTargetedParameter$$inlined$sortedByDescending$1
implements Comparator {
    public final int compare(Object object, Object object2) {
        object2 = ((FacetValue)object2).getCount();
        object = ((FacetValue)object).getCount();
        return q00_0.a((Comparable)object2, (Comparable)object);
    }
}

