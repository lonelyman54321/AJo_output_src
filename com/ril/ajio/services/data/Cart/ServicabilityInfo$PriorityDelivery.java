/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import com.ril.ajio.services.data.Cart.ServicabilityInfo$PriorityDelivery$Fee;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ServicabilityInfo$PriorityDelivery
implements Serializable {
    private String bucketChangeMsg;
    private final String cutoffTime;
    private final String deliveryDate;
    private final String deliveryDateTime;
    private final String deliverySLA;
    private final String deliverySLAName;
    private final String errorMessage;
    private final ServicabilityInfo$PriorityDelivery$Fee fee;
    private final boolean isApplicable;
    private final boolean isApplied;

    public ServicabilityInfo$PriorityDelivery(ServicabilityInfo$PriorityDelivery$Fee servicabilityInfo$PriorityDelivery$Fee, String string2, String string3, String string4, boolean bl2, boolean bl3, String string5, String string6, String string7, String string8) {
        Intrinsics.checkNotNullParameter(servicabilityInfo$PriorityDelivery$Fee, "fee");
        Intrinsics.checkNotNullParameter(string2, "cutoffTime");
        Intrinsics.checkNotNullParameter(string3, "deliveryDate");
        Intrinsics.checkNotNullParameter(string4, "errorMessage");
        Intrinsics.checkNotNullParameter(string7, "bucketChangeMsg");
        this.fee = servicabilityInfo$PriorityDelivery$Fee;
        this.cutoffTime = string2;
        this.deliveryDate = string3;
        this.errorMessage = string4;
        this.isApplicable = bl2;
        this.isApplied = bl3;
        this.deliverySLA = string5;
        this.deliverySLAName = string6;
        this.bucketChangeMsg = string7;
        this.deliveryDateTime = string8;
    }

    public /* synthetic */ ServicabilityInfo$PriorityDelivery(ServicabilityInfo$PriorityDelivery$Fee servicabilityInfo$PriorityDelivery$Fee, String string2, String string3, String string4, boolean bl2, boolean bl3, String string5, String string6, String string7, String string8, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3;
        int n7 = n3 & 0x40;
        String string9 = n7 != 0 ? null : string5;
        n7 = n4 & 0x80;
        String string10 = n7 != 0 ? null : string6;
        String string11 = (n4 &= 0x200) != 0 ? null : string8;
        this(servicabilityInfo$PriorityDelivery$Fee, string2, string3, string4, bl2, bl3, string9, string10, string7, string11);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ ServicabilityInfo$PriorityDelivery copy$default(ServicabilityInfo$PriorityDelivery servicabilityInfo$PriorityDelivery, ServicabilityInfo$PriorityDelivery$Fee servicabilityInfo$PriorityDelivery$Fee, String string2, String string3, String string4, boolean bl2, boolean bl3, String string5, String string6, String string7, String string8, int n3, Object object) {
        void var24_30;
        void var23_26;
        ServicabilityInfo$PriorityDelivery servicabilityInfo$PriorityDelivery2 = servicabilityInfo$PriorityDelivery;
        int n4 = n3;
        int n7 = n3 & 1;
        ServicabilityInfo$PriorityDelivery$Fee servicabilityInfo$PriorityDelivery$Fee2 = n7 != 0 ? servicabilityInfo$PriorityDelivery.fee : servicabilityInfo$PriorityDelivery$Fee;
        int n8 = n4 & 2;
        String string9 = n8 != 0 ? servicabilityInfo$PriorityDelivery2.cutoffTime : string2;
        int n10 = n4 & 4;
        String string10 = n10 != 0 ? servicabilityInfo$PriorityDelivery2.deliveryDate : string3;
        int n14 = n4 & 8;
        String string11 = n14 != 0 ? servicabilityInfo$PriorityDelivery2.errorMessage : string4;
        int bl4 = n4 & 0x10;
        if (bl4 != 0) {
            boolean bl5 = servicabilityInfo$PriorityDelivery2.isApplicable;
        } else {
            boolean bl6 = bl2;
        }
        int n15 = n4 & 0x20;
        if (n15 != 0) {
            boolean bl7 = servicabilityInfo$PriorityDelivery2.isApplied;
        } else {
            boolean bl8 = bl3;
        }
        int n16 = n4 & 0x40;
        String string12 = n16 != 0 ? servicabilityInfo$PriorityDelivery2.deliverySLA : string5;
        int n17 = n4 & 0x80;
        String string13 = n17 != 0 ? servicabilityInfo$PriorityDelivery2.deliverySLAName : string6;
        int n18 = n4 & 0x100;
        String string14 = n18 != 0 ? servicabilityInfo$PriorityDelivery2.bucketChangeMsg : string7;
        String string15 = (n4 &= 0x200) != 0 ? servicabilityInfo$PriorityDelivery2.deliveryDateTime : string8;
        servicabilityInfo$PriorityDelivery$Fee = servicabilityInfo$PriorityDelivery$Fee2;
        string2 = string9;
        string3 = string10;
        string4 = string11;
        bl2 = var23_26;
        bl3 = var24_30;
        string5 = string12;
        string6 = string13;
        string7 = string14;
        string8 = string15;
        return servicabilityInfo$PriorityDelivery.copy(servicabilityInfo$PriorityDelivery$Fee2, string9, string10, string11, (boolean)var23_26, (boolean)var24_30, string12, string13, string14, string15);
    }

    public final ServicabilityInfo$PriorityDelivery$Fee component1() {
        return this.fee;
    }

    public final String component10() {
        return this.deliveryDateTime;
    }

    public final String component2() {
        return this.cutoffTime;
    }

    public final String component3() {
        return this.deliveryDate;
    }

    public final String component4() {
        return this.errorMessage;
    }

    public final boolean component5() {
        return this.isApplicable;
    }

    public final boolean component6() {
        return this.isApplied;
    }

    public final String component7() {
        return this.deliverySLA;
    }

    public final String component8() {
        return this.deliverySLAName;
    }

    public final String component9() {
        return this.bucketChangeMsg;
    }

    public final ServicabilityInfo$PriorityDelivery copy(ServicabilityInfo$PriorityDelivery$Fee servicabilityInfo$PriorityDelivery$Fee, String string2, String string3, String string4, boolean bl2, boolean bl3, String string5, String string6, String string7, String string8) {
        Intrinsics.checkNotNullParameter(servicabilityInfo$PriorityDelivery$Fee, "fee");
        Intrinsics.checkNotNullParameter(string2, "cutoffTime");
        Intrinsics.checkNotNullParameter(string3, "deliveryDate");
        Intrinsics.checkNotNullParameter(string4, "errorMessage");
        Intrinsics.checkNotNullParameter(string7, "bucketChangeMsg");
        ServicabilityInfo$PriorityDelivery servicabilityInfo$PriorityDelivery = new ServicabilityInfo$PriorityDelivery(servicabilityInfo$PriorityDelivery$Fee, string2, string3, string4, bl2, bl3, string5, string6, string7, string8);
        return servicabilityInfo$PriorityDelivery;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ServicabilityInfo$PriorityDelivery;
        if (!bl3) {
            return false;
        }
        object = (ServicabilityInfo$PriorityDelivery)object;
        Object object2 = this.fee;
        Object object3 = ((ServicabilityInfo$PriorityDelivery)object).fee;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cutoffTime;
        object3 = ((ServicabilityInfo$PriorityDelivery)object).cutoffTime;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.deliveryDate;
        object3 = ((ServicabilityInfo$PriorityDelivery)object).deliveryDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.errorMessage;
        object3 = ((ServicabilityInfo$PriorityDelivery)object).errorMessage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.isApplicable;
        boolean bl4 = ((ServicabilityInfo$PriorityDelivery)object).isApplicable;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.isApplied;
        bl4 = ((ServicabilityInfo$PriorityDelivery)object).isApplied;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.deliverySLA;
        object3 = ((ServicabilityInfo$PriorityDelivery)object).deliverySLA;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.deliverySLAName;
        object3 = ((ServicabilityInfo$PriorityDelivery)object).deliverySLAName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bucketChangeMsg;
        object3 = ((ServicabilityInfo$PriorityDelivery)object).bucketChangeMsg;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.deliveryDateTime;
        object = ((ServicabilityInfo$PriorityDelivery)object).deliveryDateTime;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final String getBucketChangeMsg() {
        return this.bucketChangeMsg;
    }

    public final String getCutoffTime() {
        return this.cutoffTime;
    }

    public final String getDeliveryDate() {
        return this.deliveryDate;
    }

    public final String getDeliveryDateTime() {
        return this.deliveryDateTime;
    }

    public final String getDeliverySLA() {
        return this.deliverySLA;
    }

    public final String getDeliverySLAName() {
        return this.deliverySLAName;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final ServicabilityInfo$PriorityDelivery$Fee getFee() {
        return this.fee;
    }

    public int hashCode() {
        ServicabilityInfo$PriorityDelivery$Fee servicabilityInfo$PriorityDelivery$Fee = this.fee;
        int n3 = servicabilityInfo$PriorityDelivery$Fee.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.cutoffTime;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.deliveryDate;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.errorMessage;
        n3 = zy_2.b(n3, n4, string2);
        int n7 = this.isApplicable;
        int n8 = 1237;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        n7 = (int)(this.isApplied ? 1 : 0);
        if (n7 != 0) {
            n8 = 1231;
        }
        n3 = (n3 + n8) * 31;
        string2 = this.deliverySLA;
        n8 = 0;
        if (string2 == null) {
            n7 = 0;
            string2 = null;
        } else {
            n7 = string2.hashCode();
        }
        n3 = (n3 + n7) * 31;
        string2 = this.deliverySLAName;
        if (string2 == null) {
            n7 = 0;
            string2 = null;
        } else {
            n7 = string2.hashCode();
        }
        n3 = (n3 + n7) * 31;
        string2 = this.bucketChangeMsg;
        n3 = zy_2.b(n3, n4, string2);
        String string3 = this.deliveryDateTime;
        if (string3 != null) {
            n8 = string3.hashCode();
        }
        return n3 + n8;
    }

    public final boolean isApplicable() {
        return this.isApplicable;
    }

    public final boolean isApplied() {
        return this.isApplied;
    }

    public final void setBucketChangeMsg(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.bucketChangeMsg = string2;
    }

    public String toString() {
        ServicabilityInfo$PriorityDelivery$Fee servicabilityInfo$PriorityDelivery$Fee = this.fee;
        String string2 = this.cutoffTime;
        String string3 = this.deliveryDate;
        String string4 = this.errorMessage;
        boolean bl2 = this.isApplicable;
        boolean bl3 = this.isApplied;
        String string5 = this.deliverySLA;
        String string6 = this.deliverySLAName;
        String string7 = this.bucketChangeMsg;
        String string8 = this.deliveryDateTime;
        StringBuilder stringBuilder = new StringBuilder("PriorityDelivery(fee=");
        stringBuilder.append(servicabilityInfo$PriorityDelivery$Fee);
        stringBuilder.append(", cutoffTime=");
        stringBuilder.append(string2);
        stringBuilder.append(", deliveryDate=");
        X50.a(stringBuilder, string3, ", errorMessage=", string4, ", isApplicable=");
        I81.a(", isApplied=", ", deliverySLA=", stringBuilder, bl2, bl3);
        X50.a(stringBuilder, string5, ", deliverySLAName=", string6, ", bucketChangeMsg=");
        return ko_0.a(stringBuilder, string7, ", deliveryDateTime=", string8, ")");
    }
}

