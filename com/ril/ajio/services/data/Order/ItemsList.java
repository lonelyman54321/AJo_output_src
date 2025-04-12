/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ItemsList
implements Serializable {
    private String itemId;
    private Double nonRefundableAmount;
    private Integer qty;
    private Double unitCost;

    public ItemsList() {
        this(null, null, null, null, 15, null);
    }

    public ItemsList(String string2, Integer n3, Double d2, Double d5) {
        this.itemId = string2;
        this.qty = n3;
        this.unitCost = d2;
        this.nonRefundableAmount = d5;
    }

    public /* synthetic */ ItemsList(String string2, Integer n3, Double d2, Double d5, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = null;
        }
        if ((n7 = n4 & 2) != 0) {
            n3 = null;
        }
        if ((n7 = n4 & 4) != 0) {
            d2 = null;
        }
        if ((n4 &= 8) != 0) {
            d5 = null;
        }
        this(string2, n3, d2, d5);
    }

    public static /* synthetic */ ItemsList copy$default(ItemsList itemsList, String string2, Integer n3, Double d2, Double d5, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = itemsList.itemId;
        }
        if ((n7 = n4 & 2) != 0) {
            n3 = itemsList.qty;
        }
        if ((n7 = n4 & 4) != 0) {
            d2 = itemsList.unitCost;
        }
        if ((n4 &= 8) != 0) {
            d5 = itemsList.nonRefundableAmount;
        }
        return itemsList.copy(string2, n3, d2, d5);
    }

    public final String component1() {
        return this.itemId;
    }

    public final Integer component2() {
        return this.qty;
    }

    public final Double component3() {
        return this.unitCost;
    }

    public final Double component4() {
        return this.nonRefundableAmount;
    }

    public final ItemsList copy(String string2, Integer n3, Double d2, Double d5) {
        ItemsList itemsList = new ItemsList(string2, n3, d2, d5);
        return itemsList;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ItemsList;
        if (!bl3) {
            return false;
        }
        object = (ItemsList)object;
        Object object2 = this.itemId;
        Object object3 = ((ItemsList)object).itemId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.qty;
        object3 = ((ItemsList)object).qty;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.unitCost;
        object3 = ((ItemsList)object).unitCost;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.nonRefundableAmount;
        object = ((ItemsList)object).nonRefundableAmount;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final Double getNonRefundableAmount() {
        return this.nonRefundableAmount;
    }

    public final Integer getQty() {
        return this.qty;
    }

    public final Double getUnitCost() {
        return this.unitCost;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.itemId;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Number number = this.qty;
        if (number == null) {
            n3 = 0;
            number = null;
        } else {
            n3 = number.hashCode();
        }
        n4 = (n4 + n3) * 31;
        number = this.unitCost;
        if (number == null) {
            n3 = 0;
            number = null;
        } else {
            n3 = number.hashCode();
        }
        n4 = (n4 + n3) * 31;
        number = this.nonRefundableAmount;
        if (number != null) {
            n7 = number.hashCode();
        }
        return n4 + n7;
    }

    public final void setItemId(String string2) {
        this.itemId = string2;
    }

    public final void setNonRefundableAmount(Double d2) {
        this.nonRefundableAmount = d2;
    }

    public final void setQty(Integer n3) {
        this.qty = n3;
    }

    public final void setUnitCost(Double d2) {
        this.unitCost = d2;
    }

    public String toString() {
        String string2 = this.itemId;
        Integer n3 = this.qty;
        Double d2 = this.unitCost;
        Double d5 = this.nonRefundableAmount;
        StringBuilder stringBuilder = new StringBuilder("ItemsList(itemId=");
        stringBuilder.append(string2);
        stringBuilder.append(", qty=");
        stringBuilder.append(n3);
        stringBuilder.append(", unitCost=");
        stringBuilder.append(d2);
        stringBuilder.append(", nonRefundableAmount=");
        stringBuilder.append(d5);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

