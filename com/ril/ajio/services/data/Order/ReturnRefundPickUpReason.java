/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class ReturnRefundPickUpReason
implements Serializable {
    private final ArrayList bodyContent;
    private final ArrayList bottomLinkContent;
    private final String pickUpHeader;
    private final String pickUpUserDetails;

    public ReturnRefundPickUpReason(String string2, String string3, ArrayList arrayList, ArrayList arrayList2) {
        this.pickUpHeader = string2;
        this.pickUpUserDetails = string3;
        this.bodyContent = arrayList;
        this.bottomLinkContent = arrayList2;
    }

    public static /* synthetic */ ReturnRefundPickUpReason copy$default(ReturnRefundPickUpReason returnRefundPickUpReason, String string2, String string3, ArrayList arrayList, ArrayList arrayList2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = returnRefundPickUpReason.pickUpHeader;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = returnRefundPickUpReason.pickUpUserDetails;
        }
        if ((n4 = n3 & 4) != 0) {
            arrayList = returnRefundPickUpReason.bodyContent;
        }
        if ((n3 &= 8) != 0) {
            arrayList2 = returnRefundPickUpReason.bottomLinkContent;
        }
        return returnRefundPickUpReason.copy(string2, string3, arrayList, arrayList2);
    }

    public final String component1() {
        return this.pickUpHeader;
    }

    public final String component2() {
        return this.pickUpUserDetails;
    }

    public final ArrayList component3() {
        return this.bodyContent;
    }

    public final ArrayList component4() {
        return this.bottomLinkContent;
    }

    public final ReturnRefundPickUpReason copy(String string2, String string3, ArrayList arrayList, ArrayList arrayList2) {
        ReturnRefundPickUpReason returnRefundPickUpReason = new ReturnRefundPickUpReason(string2, string3, arrayList, arrayList2);
        return returnRefundPickUpReason;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReturnRefundPickUpReason;
        if (!bl3) {
            return false;
        }
        object = (ReturnRefundPickUpReason)object;
        Object object2 = this.pickUpHeader;
        Object object3 = ((ReturnRefundPickUpReason)object).pickUpHeader;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pickUpUserDetails;
        object3 = ((ReturnRefundPickUpReason)object).pickUpUserDetails;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bodyContent;
        object3 = ((ReturnRefundPickUpReason)object).bodyContent;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bottomLinkContent;
        object = ((ReturnRefundPickUpReason)object).bottomLinkContent;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getBodyContent() {
        return this.bodyContent;
    }

    public final ArrayList getBottomLinkContent() {
        return this.bottomLinkContent;
    }

    public final String getPickUpHeader() {
        return this.pickUpHeader;
    }

    public final String getPickUpUserDetails() {
        return this.pickUpUserDetails;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.pickUpHeader;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.pickUpUserDetails;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bodyContent;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bottomLinkContent;
        if (object != null) {
            n7 = ((ArrayList)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        CharSequence charSequence = this.pickUpHeader;
        String string2 = this.pickUpUserDetails;
        ArrayList arrayList = this.bodyContent;
        ArrayList arrayList2 = this.bottomLinkContent;
        charSequence = og_1.a("ReturnRefundPickUpReason(pickUpHeader=", (String)charSequence, ", pickUpUserDetails=", string2, ", bodyContent=");
        ((StringBuilder)charSequence).append(arrayList);
        ((StringBuilder)charSequence).append(", bottomLinkContent=");
        ((StringBuilder)charSequence).append(arrayList2);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

