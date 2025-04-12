/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.myaccount.ajiocash.datasource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class OrderCancellationRefundConfig {
    public static final int $stable = 8;
    private String businessCancellationReason;
    private Boolean enable;
    private String noRefundCODDescription;
    private String noRefundCODTitle;
    private String waitingForRefundInfo;

    public OrderCancellationRefundConfig() {
        this(null, null, null, null, null, 31, null);
    }

    public OrderCancellationRefundConfig(Boolean bl2, String string2, String string3, String string4, String string5) {
        this.enable = bl2;
        this.waitingForRefundInfo = string2;
        this.businessCancellationReason = string3;
        this.noRefundCODTitle = string4;
        this.noRefundCODDescription = string5;
    }

    public /* synthetic */ OrderCancellationRefundConfig(Boolean object, String object2, String string2, String string3, String string4, int n3, DefaultConstructorMarker object3) {
        String string5;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object3 = null;
        } else {
            object3 = object;
        }
        int n7 = n3 & 2;
        Object object4 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string6 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        String string7 = n7 != 0 ? null : string3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            n3 = 0;
            string5 = null;
        } else {
            string5 = string4;
        }
        object = this;
        object2 = object3;
        string2 = object4;
        string3 = string6;
        string4 = string7;
        this((Boolean)object3, (String)object4, string6, string7, string5);
    }

    public static /* synthetic */ OrderCancellationRefundConfig copy$default(OrderCancellationRefundConfig orderCancellationRefundConfig, Boolean bl2, String object, String object2, String object3, String string2, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = orderCancellationRefundConfig.enable;
        }
        if ((n4 = n3 & 2) != 0) {
            object = orderCancellationRefundConfig.waitingForRefundInfo;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = orderCancellationRefundConfig.businessCancellationReason;
        }
        String string3 = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = orderCancellationRefundConfig.noRefundCODTitle;
        }
        String string4 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string2 = orderCancellationRefundConfig.noRefundCODDescription;
        }
        String string5 = string2;
        object = orderCancellationRefundConfig;
        object2 = bl2;
        object3 = object4;
        string2 = string3;
        object4 = string5;
        return orderCancellationRefundConfig.copy(bl2, (String)object3, string3, string4, string5);
    }

    public final Boolean component1() {
        return this.enable;
    }

    public final String component2() {
        return this.waitingForRefundInfo;
    }

    public final String component3() {
        return this.businessCancellationReason;
    }

    public final String component4() {
        return this.noRefundCODTitle;
    }

    public final String component5() {
        return this.noRefundCODDescription;
    }

    public final OrderCancellationRefundConfig copy(Boolean bl2, String string2, String string3, String string4, String string5) {
        OrderCancellationRefundConfig orderCancellationRefundConfig = new OrderCancellationRefundConfig(bl2, string2, string3, string4, string5);
        return orderCancellationRefundConfig;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof OrderCancellationRefundConfig;
        if (!bl3) {
            return false;
        }
        object = (OrderCancellationRefundConfig)object;
        Object object2 = this.enable;
        Object object3 = ((OrderCancellationRefundConfig)object).enable;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.waitingForRefundInfo;
        object3 = ((OrderCancellationRefundConfig)object).waitingForRefundInfo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.businessCancellationReason;
        object3 = ((OrderCancellationRefundConfig)object).businessCancellationReason;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.noRefundCODTitle;
        object3 = ((OrderCancellationRefundConfig)object).noRefundCODTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.noRefundCODDescription;
        object = ((OrderCancellationRefundConfig)object).noRefundCODDescription;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBusinessCancellationReason() {
        return this.businessCancellationReason;
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final String getNoRefundCODDescription() {
        return this.noRefundCODDescription;
    }

    public final String getNoRefundCODTitle() {
        return this.noRefundCODTitle;
    }

    public final String getWaitingForRefundInfo() {
        return this.waitingForRefundInfo;
    }

    public int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.enable;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        String string2 = this.waitingForRefundInfo;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.businessCancellationReason;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.noRefundCODTitle;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.noRefundCODDescription;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        return n4 + n7;
    }

    public final void setBusinessCancellationReason(String string2) {
        this.businessCancellationReason = string2;
    }

    public final void setEnable(Boolean bl2) {
        this.enable = bl2;
    }

    public final void setNoRefundCODDescription(String string2) {
        this.noRefundCODDescription = string2;
    }

    public final void setNoRefundCODTitle(String string2) {
        this.noRefundCODTitle = string2;
    }

    public final void setWaitingForRefundInfo(String string2) {
        this.waitingForRefundInfo = string2;
    }

    public String toString() {
        Boolean bl2 = this.enable;
        String string2 = this.waitingForRefundInfo;
        String string3 = this.businessCancellationReason;
        String string4 = this.noRefundCODTitle;
        String string5 = this.noRefundCODDescription;
        StringBuilder stringBuilder = new StringBuilder("OrderCancellationRefundConfig(enable=");
        stringBuilder.append(bl2);
        stringBuilder.append(", waitingForRefundInfo=");
        stringBuilder.append(string2);
        stringBuilder.append(", businessCancellationReason=");
        X50.a(stringBuilder, string3, ", noRefundCODTitle=", string4, ", noRefundCODDescription=");
        return h30_0.a(stringBuilder, string5, ")");
    }
}

