/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.myaccount.order.data;

import com.ril.ajio.myaccount.order.data.PriorityDeliveryRefundTrackerData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PriorityDeliveryConfig {
    public static final int $stable = 8;
    private boolean isEnabled;
    private PriorityDeliveryRefundTrackerData postOrder;
    private String priorityDeliveryFeeDes;
    private String priorityDeliveryFeeLabel;
    private String priorityDeliveryIcon;
    private int priorityTagImageHeight;
    private int priorityTagImageWidth;

    public PriorityDeliveryConfig() {
        this(false, null, 0, 0, null, null, null, 127, null);
    }

    public PriorityDeliveryConfig(boolean bl2, String string2, int n3, int n4, PriorityDeliveryRefundTrackerData priorityDeliveryRefundTrackerData, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "priorityDeliveryIcon");
        Intrinsics.checkNotNullParameter(string3, "priorityDeliveryFeeLabel");
        Intrinsics.checkNotNullParameter(string4, "priorityDeliveryFeeDes");
        this.isEnabled = bl2;
        this.priorityDeliveryIcon = string2;
        this.priorityTagImageWidth = n3;
        this.priorityTagImageHeight = n4;
        this.postOrder = priorityDeliveryRefundTrackerData;
        this.priorityDeliveryFeeLabel = string3;
        this.priorityDeliveryFeeDes = string4;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ PriorityDeliveryConfig(boolean bl2, String string2, int n3, int n4, PriorityDeliveryRefundTrackerData priorityDeliveryRefundTrackerData, String object, String string3, int n7, DefaultConstructorMarker defaultConstructorMarker) {
        void var10_19;
        String string4;
        void var6_12;
        Object var5_11;
        int n8;
        void var3_9;
        void var2_8;
        void var8_14;
        int n10 = var8_14 & 1;
        int n14 = 0;
        if (n10 != 0) {
            boolean bl3 = false;
        } else {
            boolean bl4 = bl2;
        }
        int n15 = var8_14 & 2;
        String string5 = "";
        Object object2 = n15 != 0 ? string5 : var2_8;
        int n16 = var8_14 & 4;
        int n17 = n16 != 0 ? 0 : var3_9;
        int n18 = var8_14 & 8;
        if (n18 == 0) {
            n14 = n8;
        }
        int n19 = var8_14 & 0x10;
        if (n19 != 0) {
            var5_11 = null;
        }
        void var15_24 = var5_11;
        int n20 = var8_14 & 0x20;
        Object object3 = n20 != 0 ? string5 : var6_12;
        int n21 = var8_14 & 0x40;
        String string6 = n21 != 0 ? string5 : string4;
        n8 = n17;
        var6_12 = var15_24;
        string4 = object3;
        this((boolean)var10_19, (String)object2, n17, n14, (PriorityDeliveryRefundTrackerData)var15_24, (String)object3, string6);
    }

    public static /* synthetic */ PriorityDeliveryConfig copy$default(PriorityDeliveryConfig priorityDeliveryConfig, boolean bl2, String object, int n3, int n4, PriorityDeliveryRefundTrackerData priorityDeliveryRefundTrackerData, String string2, String object2, int n7, Object object3) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            bl2 = priorityDeliveryConfig.isEnabled;
        }
        if ((n8 = n7 & 2) != 0) {
            object = priorityDeliveryConfig.priorityDeliveryIcon;
        }
        object3 = object;
        int n10 = n7 & 4;
        if (n10 != 0) {
            n3 = priorityDeliveryConfig.priorityTagImageWidth;
        }
        int n14 = n3;
        n10 = n7 & 8;
        if (n10 != 0) {
            n4 = priorityDeliveryConfig.priorityTagImageHeight;
        }
        int n15 = n4;
        n10 = n7 & 0x10;
        if (n10 != 0) {
            priorityDeliveryRefundTrackerData = priorityDeliveryConfig.postOrder;
        }
        PriorityDeliveryRefundTrackerData priorityDeliveryRefundTrackerData2 = priorityDeliveryRefundTrackerData;
        n10 = n7 & 0x20;
        if (n10 != 0) {
            string2 = priorityDeliveryConfig.priorityDeliveryFeeLabel;
        }
        String string3 = string2;
        n10 = n7 & 0x40;
        if (n10 != 0) {
            object2 = priorityDeliveryConfig.priorityDeliveryFeeDes;
        }
        String string4 = object2;
        object = priorityDeliveryConfig;
        n3 = (int)(bl2 ? 1 : 0);
        Object object4 = object3;
        object2 = priorityDeliveryRefundTrackerData2;
        object3 = string4;
        return priorityDeliveryConfig.copy(bl2, (String)object4, n14, n15, priorityDeliveryRefundTrackerData2, string3, string4);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    public final String component2() {
        return this.priorityDeliveryIcon;
    }

    public final int component3() {
        return this.priorityTagImageWidth;
    }

    public final int component4() {
        return this.priorityTagImageHeight;
    }

    public final PriorityDeliveryRefundTrackerData component5() {
        return this.postOrder;
    }

    public final String component6() {
        return this.priorityDeliveryFeeLabel;
    }

    public final String component7() {
        return this.priorityDeliveryFeeDes;
    }

    public final PriorityDeliveryConfig copy(boolean bl2, String string2, int n3, int n4, PriorityDeliveryRefundTrackerData priorityDeliveryRefundTrackerData, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "priorityDeliveryIcon");
        Intrinsics.checkNotNullParameter(string3, "priorityDeliveryFeeLabel");
        Intrinsics.checkNotNullParameter(string4, "priorityDeliveryFeeDes");
        PriorityDeliveryConfig priorityDeliveryConfig = new PriorityDeliveryConfig(bl2, string2, n3, n4, priorityDeliveryRefundTrackerData, string3, string4);
        return priorityDeliveryConfig;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof PriorityDeliveryConfig;
        if (n3 == 0) {
            return false;
        }
        object = (PriorityDeliveryConfig)object;
        n3 = this.isEnabled;
        int n4 = ((PriorityDeliveryConfig)object).isEnabled;
        if (n3 != n4) {
            return false;
        }
        Object object2 = this.priorityDeliveryIcon;
        Object object3 = ((PriorityDeliveryConfig)object).priorityDeliveryIcon;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.priorityTagImageWidth;
        n4 = ((PriorityDeliveryConfig)object).priorityTagImageWidth;
        if (n3 != n4) {
            return false;
        }
        n3 = this.priorityTagImageHeight;
        n4 = ((PriorityDeliveryConfig)object).priorityTagImageHeight;
        if (n3 != n4) {
            return false;
        }
        object2 = this.postOrder;
        object3 = ((PriorityDeliveryConfig)object).postOrder;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.priorityDeliveryFeeLabel;
        object3 = ((PriorityDeliveryConfig)object).priorityDeliveryFeeLabel;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.priorityDeliveryFeeDes;
        object = ((PriorityDeliveryConfig)object).priorityDeliveryFeeDes;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final PriorityDeliveryRefundTrackerData getPostOrder() {
        return this.postOrder;
    }

    public final String getPriorityDeliveryFeeDes() {
        return this.priorityDeliveryFeeDes;
    }

    public final String getPriorityDeliveryFeeLabel() {
        return this.priorityDeliveryFeeLabel;
    }

    public final String getPriorityDeliveryIcon() {
        return this.priorityDeliveryIcon;
    }

    public final int getPriorityTagImageHeight() {
        return this.priorityTagImageHeight;
    }

    public final int getPriorityTagImageWidth() {
        return this.priorityTagImageWidth;
    }

    public int hashCode() {
        int n3 = this.isEnabled;
        n3 = n3 != 0 ? 1231 : 1237;
        int n4 = 31;
        n3 *= 31;
        Object object = this.priorityDeliveryIcon;
        n3 = zy_2.b(n3, n4, (String)object);
        int n7 = this.priorityTagImageWidth;
        n3 = (n3 + n7) * 31;
        n7 = this.priorityTagImageHeight;
        n3 = (n3 + n7) * 31;
        object = this.postOrder;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((PriorityDeliveryRefundTrackerData)object).hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.priorityDeliveryFeeLabel;
        n3 = zy_2.b(n3, n4, (String)object);
        return this.priorityDeliveryFeeDes.hashCode() + n3;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(boolean bl2) {
        this.isEnabled = bl2;
    }

    public final void setPostOrder(PriorityDeliveryRefundTrackerData priorityDeliveryRefundTrackerData) {
        this.postOrder = priorityDeliveryRefundTrackerData;
    }

    public final void setPriorityDeliveryFeeDes(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.priorityDeliveryFeeDes = string2;
    }

    public final void setPriorityDeliveryFeeLabel(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.priorityDeliveryFeeLabel = string2;
    }

    public final void setPriorityDeliveryIcon(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.priorityDeliveryIcon = string2;
    }

    public final void setPriorityTagImageHeight(int n3) {
        this.priorityTagImageHeight = n3;
    }

    public final void setPriorityTagImageWidth(int n3) {
        this.priorityTagImageWidth = n3;
    }

    public String toString() {
        boolean bl2 = this.isEnabled;
        String string2 = this.priorityDeliveryIcon;
        int n3 = this.priorityTagImageWidth;
        int n4 = this.priorityTagImageHeight;
        PriorityDeliveryRefundTrackerData priorityDeliveryRefundTrackerData = this.postOrder;
        String string3 = this.priorityDeliveryFeeLabel;
        String string4 = this.priorityDeliveryFeeDes;
        StringBuilder stringBuilder = new StringBuilder("PriorityDeliveryConfig(isEnabled=");
        stringBuilder.append(bl2);
        stringBuilder.append(", priorityDeliveryIcon=");
        stringBuilder.append(string2);
        stringBuilder.append(", priorityTagImageWidth=");
        m10.a(stringBuilder, n3, ", priorityTagImageHeight=", n4, ", postOrder=");
        stringBuilder.append(priorityDeliveryRefundTrackerData);
        stringBuilder.append(", priorityDeliveryFeeLabel=");
        stringBuilder.append(string3);
        stringBuilder.append(", priorityDeliveryFeeDes=");
        return h30_0.a(stringBuilder, string4, ")");
    }
}

