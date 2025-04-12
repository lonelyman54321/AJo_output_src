/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.prioritydelivery;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PlpFilters {
    private final ArrayList disableFacetValues;
    private final ArrayList displayFacetSequence;
    private final Map enableFacetValues;
    private final String enterLocationMessage;
    private final Integer facetPosition;
    private final String facetTitle;
    private final String filterMessage;
    private final String serviceabilityError;

    public PlpFilters() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public PlpFilters(String string2, String string3, String string4, Integer n3, String string5, Map map2, ArrayList arrayList, ArrayList arrayList2) {
        this.filterMessage = string2;
        this.enterLocationMessage = string3;
        this.facetTitle = string4;
        this.facetPosition = n3;
        this.serviceabilityError = string5;
        this.enableFacetValues = map2;
        this.disableFacetValues = arrayList;
        this.displayFacetSequence = arrayList2;
    }

    public /* synthetic */ PlpFilters(String object, String string2, String string3, Integer object2, String object3, Map object4, ArrayList object5, ArrayList arrayList, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        ArrayList arrayList2;
        Map map2;
        String string4;
        Integer n4;
        String string5;
        String string6;
        String string7;
        int n7 = n3;
        int n8 = n3 & 1;
        ArrayList arrayList3 = null;
        if (n8 != 0) {
            n8 = 0;
            string7 = null;
        } else {
            string7 = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            string6 = null;
        } else {
            string6 = string2;
        }
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            string5 = null;
        } else {
            string5 = string3;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            n4 = null;
        } else {
            n4 = object2;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            string4 = null;
        } else {
            string4 = object3;
        }
        int n17 = n7 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            map2 = null;
        } else {
            map2 = object4;
        }
        int n18 = n7 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            arrayList2 = null;
        } else {
            arrayList2 = object5;
        }
        if ((n7 &= 0x80) == 0) {
            arrayList3 = arrayList;
        }
        object = this;
        string2 = string7;
        string3 = string6;
        object2 = string5;
        object3 = n4;
        object4 = string4;
        object5 = map2;
        arrayList = arrayList2;
        this(string7, string6, string5, n4, string4, map2, arrayList2, arrayList3);
    }

    public static /* synthetic */ PlpFilters copy$default(PlpFilters plpFilters, String string2, String string3, String string4, Integer n3, String string5, Map map2, ArrayList arrayList, ArrayList arrayList2, int n4, Object object) {
        PlpFilters plpFilters2 = plpFilters;
        int n7 = n4;
        int n8 = n4 & 1;
        String string6 = n8 != 0 ? plpFilters.filterMessage : string2;
        int n10 = n7 & 2;
        String string7 = n10 != 0 ? plpFilters2.enterLocationMessage : string3;
        int n14 = n7 & 4;
        String string8 = n14 != 0 ? plpFilters2.facetTitle : string4;
        int n15 = n7 & 8;
        Integer n16 = n15 != 0 ? plpFilters2.facetPosition : n3;
        int n17 = n7 & 0x10;
        String string9 = n17 != 0 ? plpFilters2.serviceabilityError : string5;
        int n18 = n7 & 0x20;
        Map map3 = n18 != 0 ? plpFilters2.enableFacetValues : map2;
        int n19 = n7 & 0x40;
        ArrayList arrayList3 = n19 != 0 ? plpFilters2.disableFacetValues : arrayList;
        ArrayList arrayList4 = (n7 &= 0x80) != 0 ? plpFilters2.displayFacetSequence : arrayList2;
        string2 = string6;
        string3 = string7;
        string4 = string8;
        n3 = n16;
        string5 = string9;
        map2 = map3;
        arrayList = arrayList3;
        arrayList2 = arrayList4;
        return plpFilters.copy(string6, string7, string8, n16, string9, map3, arrayList3, arrayList4);
    }

    public final String component1() {
        return this.filterMessage;
    }

    public final String component2() {
        return this.enterLocationMessage;
    }

    public final String component3() {
        return this.facetTitle;
    }

    public final Integer component4() {
        return this.facetPosition;
    }

    public final String component5() {
        return this.serviceabilityError;
    }

    public final Map component6() {
        return this.enableFacetValues;
    }

    public final ArrayList component7() {
        return this.disableFacetValues;
    }

    public final ArrayList component8() {
        return this.displayFacetSequence;
    }

    public final PlpFilters copy(String string2, String string3, String string4, Integer n3, String string5, Map map2, ArrayList arrayList, ArrayList arrayList2) {
        PlpFilters plpFilters = new PlpFilters(string2, string3, string4, n3, string5, map2, arrayList, arrayList2);
        return plpFilters;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PlpFilters;
        if (!bl3) {
            return false;
        }
        object = (PlpFilters)object;
        Object object2 = this.filterMessage;
        Object object3 = ((PlpFilters)object).filterMessage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.enterLocationMessage;
        object3 = ((PlpFilters)object).enterLocationMessage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.facetTitle;
        object3 = ((PlpFilters)object).facetTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.facetPosition;
        object3 = ((PlpFilters)object).facetPosition;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.serviceabilityError;
        object3 = ((PlpFilters)object).serviceabilityError;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.enableFacetValues;
        object3 = ((PlpFilters)object).enableFacetValues;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.disableFacetValues;
        object3 = ((PlpFilters)object).disableFacetValues;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.displayFacetSequence;
        object = ((PlpFilters)object).displayFacetSequence;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getDisableFacetValues() {
        return this.disableFacetValues;
    }

    public final ArrayList getDisplayFacetSequence() {
        return this.displayFacetSequence;
    }

    public final Map getEnableFacetValues() {
        return this.enableFacetValues;
    }

    public final String getEnterLocationMessage() {
        return this.enterLocationMessage;
    }

    public final Integer getFacetPosition() {
        return this.facetPosition;
    }

    public final String getFacetTitle() {
        return this.facetTitle;
    }

    public final String getFilterMessage() {
        return this.filterMessage;
    }

    public final String getServiceabilityError() {
        return this.serviceabilityError;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.filterMessage;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.enterLocationMessage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.facetTitle;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.facetPosition;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.serviceabilityError;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.enableFacetValues;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.disableFacetValues;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.displayFacetSequence;
        if (object != null) {
            n7 = ((ArrayList)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        CharSequence charSequence = this.filterMessage;
        String string2 = this.enterLocationMessage;
        String string3 = this.facetTitle;
        Integer n3 = this.facetPosition;
        String string4 = this.serviceabilityError;
        Map map2 = this.enableFacetValues;
        ArrayList arrayList = this.disableFacetValues;
        ArrayList arrayList2 = this.displayFacetSequence;
        charSequence = og_1.a("PlpFilters(filterMessage=", (String)charSequence, ", enterLocationMessage=", string2, ", facetTitle=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", facetPosition=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(", serviceabilityError=");
        ((StringBuilder)charSequence).append(string4);
        ((StringBuilder)charSequence).append(", enableFacetValues=");
        ((StringBuilder)charSequence).append(map2);
        ((StringBuilder)charSequence).append(", disableFacetValues=");
        ((StringBuilder)charSequence).append(arrayList);
        ((StringBuilder)charSequence).append(", displayFacetSequence=");
        ((StringBuilder)charSequence).append(arrayList2);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

