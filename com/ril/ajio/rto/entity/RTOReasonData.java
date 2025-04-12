/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.rto.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class RTOReasonData {
    public static final int $stable;
    private final boolean isOtherReason;
    private final Boolean isSelected;
    private final String reason;

    public RTOReasonData() {
        this(null, null, false, 7, null);
    }

    public RTOReasonData(String string2, Boolean bl2, boolean bl3) {
        this.reason = string2;
        this.isSelected = bl2;
        this.isOtherReason = bl3;
    }

    public /* synthetic */ RTOReasonData(String string2, Boolean bl2, boolean bl3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            bl2 = Boolean.FALSE;
        }
        if ((n3 &= 4) != 0) {
            bl3 = false;
        }
        this(string2, bl2, bl3);
    }

    public static /* synthetic */ RTOReasonData copy$default(RTOReasonData rTOReasonData, String string2, Boolean bl2, boolean bl3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = rTOReasonData.reason;
        }
        if ((n4 = n3 & 2) != 0) {
            bl2 = rTOReasonData.isSelected;
        }
        if ((n3 &= 4) != 0) {
            bl3 = rTOReasonData.isOtherReason;
        }
        return rTOReasonData.copy(string2, bl2, bl3);
    }

    public final String component1() {
        return this.reason;
    }

    public final Boolean component2() {
        return this.isSelected;
    }

    public final boolean component3() {
        return this.isOtherReason;
    }

    public final RTOReasonData copy(String string2, Boolean bl2, boolean bl3) {
        RTOReasonData rTOReasonData = new RTOReasonData(string2, bl2, bl3);
        return rTOReasonData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RTOReasonData;
        if (!bl3) {
            return false;
        }
        object = (RTOReasonData)object;
        Object object2 = this.reason;
        Object object3 = ((RTOReasonData)object).reason;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isSelected;
        object3 = ((RTOReasonData)object).isSelected;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.isOtherReason;
        boolean bl4 = ((RTOReasonData)object).isOtherReason;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        int n3;
        String string2 = this.reason;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        Boolean bl2 = this.isSelected;
        if (bl2 != null) {
            n4 = ((Object)bl2).hashCode();
        }
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.isOtherReason ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final boolean isOtherReason() {
        return this.isOtherReason;
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        String string2 = this.reason;
        Boolean bl2 = this.isSelected;
        boolean bl3 = this.isOtherReason;
        StringBuilder stringBuilder = new StringBuilder("RTOReasonData(reason=");
        stringBuilder.append(string2);
        stringBuilder.append(", isSelected=");
        stringBuilder.append(bl2);
        stringBuilder.append(", isOtherReason=");
        return Vm.a(")", bl3, stringBuilder);
    }
}

