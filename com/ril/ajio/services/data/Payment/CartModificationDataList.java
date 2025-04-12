/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Entry;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CartModificationDataList
implements Serializable {
    private Entry entry;
    private Integer quantity;
    private Integer quantityAdded;
    private String statusCode;

    public CartModificationDataList() {
        this(null, null, null, null, 15, null);
    }

    public CartModificationDataList(Entry entry, Integer n3, Integer n4, String string2) {
        this.entry = entry;
        this.quantity = n3;
        this.quantityAdded = n4;
        this.statusCode = string2;
    }

    public /* synthetic */ CartModificationDataList(Entry entry, Integer n3, Integer n4, String string2, int n7, DefaultConstructorMarker defaultConstructorMarker) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            entry = null;
        }
        if ((n8 = n7 & 2) != 0) {
            n3 = 0;
        }
        if ((n8 = n7 & 4) != 0) {
            n4 = 0;
        }
        if ((n7 &= 8) != 0) {
            string2 = null;
        }
        this(entry, n3, n4, string2);
    }

    public static /* synthetic */ CartModificationDataList copy$default(CartModificationDataList cartModificationDataList, Entry entry, Integer n3, Integer n4, String string2, int n7, Object object) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            entry = cartModificationDataList.entry;
        }
        if ((n8 = n7 & 2) != 0) {
            n3 = cartModificationDataList.quantity;
        }
        if ((n8 = n7 & 4) != 0) {
            n4 = cartModificationDataList.quantityAdded;
        }
        if ((n7 &= 8) != 0) {
            string2 = cartModificationDataList.statusCode;
        }
        return cartModificationDataList.copy(entry, n3, n4, string2);
    }

    public final Entry component1() {
        return this.entry;
    }

    public final Integer component2() {
        return this.quantity;
    }

    public final Integer component3() {
        return this.quantityAdded;
    }

    public final String component4() {
        return this.statusCode;
    }

    public final CartModificationDataList copy(Entry entry, Integer n3, Integer n4, String string2) {
        CartModificationDataList cartModificationDataList = new CartModificationDataList(entry, n3, n4, string2);
        return cartModificationDataList;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CartModificationDataList;
        if (!bl3) {
            return false;
        }
        object = (CartModificationDataList)object;
        Object object2 = this.entry;
        Serializable serializable = ((CartModificationDataList)object).entry;
        bl3 = Intrinsics.areEqual(object2, serializable);
        if (!bl3) {
            return false;
        }
        object2 = this.quantity;
        serializable = ((CartModificationDataList)object).quantity;
        bl3 = Intrinsics.areEqual(object2, serializable);
        if (!bl3) {
            return false;
        }
        object2 = this.quantityAdded;
        serializable = ((CartModificationDataList)object).quantityAdded;
        bl3 = Intrinsics.areEqual(object2, serializable);
        if (!bl3) {
            return false;
        }
        object2 = this.statusCode;
        object = ((CartModificationDataList)object).statusCode;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Entry getEntry() {
        return this.entry;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final Integer getQuantityAdded() {
        return this.quantityAdded;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        int n3;
        int n4;
        Entry entry = this.entry;
        int n7 = 0;
        if (entry == null) {
            n4 = 0;
            entry = null;
        } else {
            n4 = entry.hashCode();
        }
        n4 *= 31;
        Object object = this.quantity;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.quantityAdded;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.statusCode;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setEntry(Entry entry) {
        this.entry = entry;
    }

    public final void setQuantity(Integer n3) {
        this.quantity = n3;
    }

    public final void setQuantityAdded(Integer n3) {
        this.quantityAdded = n3;
    }

    public final void setStatusCode(String string2) {
        this.statusCode = string2;
    }

    public String toString() {
        Entry entry = this.entry;
        Integer n3 = this.quantity;
        Integer n4 = this.quantityAdded;
        String string2 = this.statusCode;
        StringBuilder stringBuilder = new StringBuilder("CartModificationDataList(entry=");
        stringBuilder.append(entry);
        stringBuilder.append(", quantity=");
        stringBuilder.append(n3);
        stringBuilder.append(", quantityAdded=");
        stringBuilder.append(n4);
        stringBuilder.append(", statusCode=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

