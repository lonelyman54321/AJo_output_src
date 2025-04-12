/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.prioritydelivery;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PlpListing {
    private final Map deliverySlaTag;
    private final String plpEmptyScreenSubTitle;
    private final String plpEmptyScreenTitle;

    public PlpListing() {
        this(null, null, null, 7, null);
    }

    public PlpListing(Map map2, String string2, String string3) {
        this.deliverySlaTag = map2;
        this.plpEmptyScreenTitle = string2;
        this.plpEmptyScreenSubTitle = string3;
    }

    public /* synthetic */ PlpListing(Map map2, String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            map2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = null;
        }
        if ((n3 &= 4) != 0) {
            string3 = null;
        }
        this(map2, string2, string3);
    }

    public static /* synthetic */ PlpListing copy$default(PlpListing plpListing, Map map2, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            map2 = plpListing.deliverySlaTag;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = plpListing.plpEmptyScreenTitle;
        }
        if ((n3 &= 4) != 0) {
            string3 = plpListing.plpEmptyScreenSubTitle;
        }
        return plpListing.copy(map2, string2, string3);
    }

    public final Map component1() {
        return this.deliverySlaTag;
    }

    public final String component2() {
        return this.plpEmptyScreenTitle;
    }

    public final String component3() {
        return this.plpEmptyScreenSubTitle;
    }

    public final PlpListing copy(Map map2, String string2, String string3) {
        PlpListing plpListing = new PlpListing(map2, string2, string3);
        return plpListing;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PlpListing;
        if (!bl3) {
            return false;
        }
        object = (PlpListing)object;
        Object object2 = this.deliverySlaTag;
        Object object3 = ((PlpListing)object).deliverySlaTag;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.plpEmptyScreenTitle;
        object3 = ((PlpListing)object).plpEmptyScreenTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.plpEmptyScreenSubTitle;
        object = ((PlpListing)object).plpEmptyScreenSubTitle;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Map getDeliverySlaTag() {
        return this.deliverySlaTag;
    }

    public final String getPlpEmptyScreenSubTitle() {
        return this.plpEmptyScreenSubTitle;
    }

    public final String getPlpEmptyScreenTitle() {
        return this.plpEmptyScreenTitle;
    }

    public int hashCode() {
        int n3;
        int n4;
        Map map2 = this.deliverySlaTag;
        int n7 = 0;
        if (map2 == null) {
            n4 = 0;
            map2 = null;
        } else {
            n4 = ((Object)map2).hashCode();
        }
        n4 *= 31;
        String string2 = this.plpEmptyScreenTitle;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.plpEmptyScreenSubTitle;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        Map map2 = this.deliverySlaTag;
        String string2 = this.plpEmptyScreenTitle;
        String string3 = this.plpEmptyScreenSubTitle;
        StringBuilder stringBuilder = new StringBuilder("PlpListing(deliverySlaTag=");
        stringBuilder.append(map2);
        stringBuilder.append(", plpEmptyScreenTitle=");
        stringBuilder.append(string2);
        stringBuilder.append(", plpEmptyScreenSubTitle=");
        return h30_0.a(stringBuilder, string3, ")");
    }
}

