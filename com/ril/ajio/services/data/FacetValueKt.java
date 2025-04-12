/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.FacetValue;
import com.ril.ajio.services.query.FacetQuery;
import kotlin.jvm.internal.Intrinsics;

public final class FacetValueKt {
    public static final FacetValue deepCopy(FacetValue facetValue) {
        Intrinsics.checkNotNullParameter(facetValue, "<this>");
        Facet facet = facetValue.getFacet();
        String string2 = facetValue.getFacetCode();
        boolean bl2 = facetValue.isTitleFacet();
        boolean bl3 = facetValue.getSelected();
        int n3 = facetValue.getCount();
        String string3 = facetValue.getCode();
        String string4 = facetValue.getName();
        String string5 = facetValue.getValue();
        String string6 = facetValue.getDisplayName();
        FacetQuery facetQuery = facetValue.getQuery();
        boolean bl4 = facetValue.isQuickFilter();
        boolean bl5 = facetValue.isDeliveryFacetFromApi();
        boolean bl6 = facetValue.isEnabled();
        FacetValue facetValue2 = new FacetValue(facet, string2, bl2, bl3, n3, string3, string4, string5, string6, facetQuery, bl4, bl5, bl6);
        return facetValue2;
    }
}

