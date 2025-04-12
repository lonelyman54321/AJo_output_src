/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class CartBulkDelete
implements Serializable {
    private final List failed;
    private final List success;

    public CartBulkDelete(List list, List list2) {
        Intrinsics.checkNotNullParameter(list, "failed");
        Intrinsics.checkNotNullParameter(list2, "success");
        this.failed = list;
        this.success = list2;
    }

    public static /* synthetic */ CartBulkDelete copy$default(CartBulkDelete cartBulkDelete, List list, List list2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = cartBulkDelete.failed;
        }
        if ((n3 &= 2) != 0) {
            list2 = cartBulkDelete.success;
        }
        return cartBulkDelete.copy(list, list2);
    }

    public final List component1() {
        return this.failed;
    }

    public final List component2() {
        return this.success;
    }

    public final CartBulkDelete copy(List list, List list2) {
        Intrinsics.checkNotNullParameter(list, "failed");
        Intrinsics.checkNotNullParameter(list2, "success");
        CartBulkDelete cartBulkDelete = new CartBulkDelete(list, list2);
        return cartBulkDelete;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CartBulkDelete;
        if (!bl3) {
            return false;
        }
        object = (CartBulkDelete)object;
        List list = this.failed;
        List list2 = ((CartBulkDelete)object).failed;
        bl3 = Intrinsics.areEqual(list, list2);
        if (!bl3) {
            return false;
        }
        list = this.success;
        object = ((CartBulkDelete)object).success;
        boolean bl4 = Intrinsics.areEqual(list, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getFailed() {
        return this.failed;
    }

    public final List getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int n3 = ((Object)this.failed).hashCode() * 31;
        return ((Object)this.success).hashCode() + n3;
    }

    public String toString() {
        List list = this.failed;
        List list2 = this.success;
        StringBuilder stringBuilder = new StringBuilder("CartBulkDelete(failed=");
        stringBuilder.append(list);
        stringBuilder.append(", success=");
        stringBuilder.append(list2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

