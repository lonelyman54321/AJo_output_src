/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BulkMoveToWishlist {
    private ArrayList optionsCodes;
    private String tenantId;

    public BulkMoveToWishlist() {
        this(null, null, 3, null);
    }

    public BulkMoveToWishlist(ArrayList arrayList, String string2) {
        this.optionsCodes = arrayList;
        this.tenantId = string2;
    }

    public /* synthetic */ BulkMoveToWishlist(ArrayList arrayList, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            arrayList = null;
        }
        if ((n3 &= 2) != 0) {
            string2 = null;
        }
        this(arrayList, string2);
    }

    public static /* synthetic */ BulkMoveToWishlist copy$default(BulkMoveToWishlist bulkMoveToWishlist, ArrayList arrayList, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            arrayList = bulkMoveToWishlist.optionsCodes;
        }
        if ((n3 &= 2) != 0) {
            string2 = bulkMoveToWishlist.tenantId;
        }
        return bulkMoveToWishlist.copy(arrayList, string2);
    }

    public final ArrayList component1() {
        return this.optionsCodes;
    }

    public final String component2() {
        return this.tenantId;
    }

    public final BulkMoveToWishlist copy(ArrayList arrayList, String string2) {
        BulkMoveToWishlist bulkMoveToWishlist = new BulkMoveToWishlist(arrayList, string2);
        return bulkMoveToWishlist;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BulkMoveToWishlist;
        if (!bl3) {
            return false;
        }
        object = (BulkMoveToWishlist)object;
        Object object2 = this.optionsCodes;
        ArrayList arrayList = ((BulkMoveToWishlist)object).optionsCodes;
        bl3 = Intrinsics.areEqual(object2, arrayList);
        if (!bl3) {
            return false;
        }
        object2 = this.tenantId;
        object = ((BulkMoveToWishlist)object).tenantId;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getOptionsCodes() {
        return this.optionsCodes;
    }

    public final String getTenantId() {
        return this.tenantId;
    }

    public int hashCode() {
        int n3;
        ArrayList arrayList = this.optionsCodes;
        int n4 = 0;
        if (arrayList == null) {
            n3 = 0;
            arrayList = null;
        } else {
            n3 = arrayList.hashCode();
        }
        n3 *= 31;
        String string2 = this.tenantId;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        return n3 + n4;
    }

    public final void setOptionsCodes(ArrayList arrayList) {
        this.optionsCodes = arrayList;
    }

    public final void setTenantId(String string2) {
        this.tenantId = string2;
    }

    public String toString() {
        ArrayList arrayList = this.optionsCodes;
        String string2 = this.tenantId;
        StringBuilder stringBuilder = new StringBuilder("BulkMoveToWishlist(optionsCodes=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", tenantId=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

