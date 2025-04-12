/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.user;

import com.ril.ajio.services.data.FacetValue;
import com.ril.ajio.services.data.user.AppliedFacetValue$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AppliedFacetValue {
    public static final String CLEAR = "clear";
    public static final AppliedFacetValue$Companion Companion;
    public static final String FACET = "facet";
    public static final String MORE = "more";
    private FacetValue facetValue;
    private int size;
    private String type;

    static {
        AppliedFacetValue$Companion appliedFacetValue$Companion;
        Companion = appliedFacetValue$Companion = new AppliedFacetValue$Companion(null);
    }

    public AppliedFacetValue(String string2, FacetValue facetValue, int n3) {
        Intrinsics.checkNotNullParameter(string2, "_type");
        this.type = string2;
        this.facetValue = facetValue;
        this.size = n3;
    }

    public /* synthetic */ AppliedFacetValue(String string2, FacetValue facetValue, int n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n4 &= 4) != 0) {
            n3 = 0;
        }
        this(string2, facetValue, n3);
    }

    public final FacetValue getFacetValue() {
        return this.facetValue;
    }

    public final int getSize() {
        return this.size;
    }

    public final String getType() {
        return this.type;
    }

    public final void setFacetValue(FacetValue facetValue) {
        this.facetValue = facetValue;
    }

    public final void setSize(int n3) {
        this.size = n3;
    }

    public final void setType(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.type = string2;
    }
}

