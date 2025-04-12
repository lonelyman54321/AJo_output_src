/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.prioritydelivery;

import com.ril.ajio.services.data.prioritydelivery.PlpFilters;
import com.ril.ajio.services.data.prioritydelivery.PlpListing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PlpDelivery {
    private final PlpFilters plpFilters;
    private final PlpListing plpListing;

    public PlpDelivery() {
        this(null, null, 3, null);
    }

    public PlpDelivery(PlpListing plpListing, PlpFilters plpFilters) {
        this.plpListing = plpListing;
        this.plpFilters = plpFilters;
    }

    public /* synthetic */ PlpDelivery(PlpListing plpListing, PlpFilters plpFilters, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            plpListing = null;
        }
        if ((n3 &= 2) != 0) {
            plpFilters = null;
        }
        this(plpListing, plpFilters);
    }

    public static /* synthetic */ PlpDelivery copy$default(PlpDelivery plpDelivery, PlpListing plpListing, PlpFilters plpFilters, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            plpListing = plpDelivery.plpListing;
        }
        if ((n3 &= 2) != 0) {
            plpFilters = plpDelivery.plpFilters;
        }
        return plpDelivery.copy(plpListing, plpFilters);
    }

    public final PlpListing component1() {
        return this.plpListing;
    }

    public final PlpFilters component2() {
        return this.plpFilters;
    }

    public final PlpDelivery copy(PlpListing plpListing, PlpFilters plpFilters) {
        PlpDelivery plpDelivery = new PlpDelivery(plpListing, plpFilters);
        return plpDelivery;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PlpDelivery;
        if (!bl3) {
            return false;
        }
        object = (PlpDelivery)object;
        Object object2 = this.plpListing;
        PlpListing plpListing = ((PlpDelivery)object).plpListing;
        bl3 = Intrinsics.areEqual(object2, plpListing);
        if (!bl3) {
            return false;
        }
        object2 = this.plpFilters;
        object = ((PlpDelivery)object).plpFilters;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final PlpFilters getPlpFilters() {
        return this.plpFilters;
    }

    public final PlpListing getPlpListing() {
        return this.plpListing;
    }

    public int hashCode() {
        int n3;
        PlpListing plpListing = this.plpListing;
        int n4 = 0;
        if (plpListing == null) {
            n3 = 0;
            plpListing = null;
        } else {
            n3 = plpListing.hashCode();
        }
        n3 *= 31;
        PlpFilters plpFilters = this.plpFilters;
        if (plpFilters != null) {
            n4 = plpFilters.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        PlpListing plpListing = this.plpListing;
        PlpFilters plpFilters = this.plpFilters;
        StringBuilder stringBuilder = new StringBuilder("PlpDelivery(plpListing=");
        stringBuilder.append(plpListing);
        stringBuilder.append(", plpFilters=");
        stringBuilder.append(plpFilters);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

