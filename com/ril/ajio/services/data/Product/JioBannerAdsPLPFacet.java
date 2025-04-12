/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class JioBannerAdsPLPFacet {
    private Boolean enabled;
    private ArrayList facetsList;

    public JioBannerAdsPLPFacet() {
        this(null, null, 3, null);
    }

    public JioBannerAdsPLPFacet(Boolean bl2, ArrayList arrayList) {
        this.enabled = bl2;
        this.facetsList = arrayList;
    }

    public /* synthetic */ JioBannerAdsPLPFacet(Boolean bl2, ArrayList arrayList, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = Boolean.FALSE;
        }
        if ((n3 &= 2) != 0) {
            arrayList = null;
        }
        this(bl2, arrayList);
    }

    public static /* synthetic */ JioBannerAdsPLPFacet copy$default(JioBannerAdsPLPFacet jioBannerAdsPLPFacet, Boolean bl2, ArrayList arrayList, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = jioBannerAdsPLPFacet.enabled;
        }
        if ((n3 &= 2) != 0) {
            arrayList = jioBannerAdsPLPFacet.facetsList;
        }
        return jioBannerAdsPLPFacet.copy(bl2, arrayList);
    }

    public final Boolean component1() {
        return this.enabled;
    }

    public final ArrayList component2() {
        return this.facetsList;
    }

    public final JioBannerAdsPLPFacet copy(Boolean bl2, ArrayList arrayList) {
        JioBannerAdsPLPFacet jioBannerAdsPLPFacet = new JioBannerAdsPLPFacet(bl2, arrayList);
        return jioBannerAdsPLPFacet;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof JioBannerAdsPLPFacet;
        if (!bl3) {
            return false;
        }
        object = (JioBannerAdsPLPFacet)object;
        Serializable serializable = this.enabled;
        Boolean bl4 = ((JioBannerAdsPLPFacet)object).enabled;
        bl3 = Intrinsics.areEqual(serializable, bl4);
        if (!bl3) {
            return false;
        }
        serializable = this.facetsList;
        object = ((JioBannerAdsPLPFacet)object).facetsList;
        boolean bl5 = Intrinsics.areEqual(serializable, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final ArrayList getFacetsList() {
        return this.facetsList;
    }

    public int hashCode() {
        int n3;
        Boolean bl2 = this.enabled;
        int n4 = 0;
        if (bl2 == null) {
            n3 = 0;
            bl2 = null;
        } else {
            n3 = ((Object)bl2).hashCode();
        }
        n3 *= 31;
        ArrayList arrayList = this.facetsList;
        if (arrayList != null) {
            n4 = arrayList.hashCode();
        }
        return n3 + n4;
    }

    public final void setEnabled(Boolean bl2) {
        this.enabled = bl2;
    }

    public final void setFacetsList(ArrayList arrayList) {
        this.facetsList = arrayList;
    }

    public String toString() {
        Boolean bl2 = this.enabled;
        ArrayList arrayList = this.facetsList;
        StringBuilder stringBuilder = new StringBuilder("JioBannerAdsPLPFacet(enabled=");
        stringBuilder.append(bl2);
        stringBuilder.append(", facetsList=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

