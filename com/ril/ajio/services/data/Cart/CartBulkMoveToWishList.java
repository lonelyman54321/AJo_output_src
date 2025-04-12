/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class CartBulkMoveToWishList
implements Serializable {
    private final List failedOptionsCode;
    private final String message;
    private final int statusCode;
    private final List successOptionsCode;
    private final String uuid;

    public CartBulkMoveToWishList(List list, String string2, int n3, List list2, String string3) {
        Intrinsics.checkNotNullParameter(list, "failedOptionsCode");
        Intrinsics.checkNotNullParameter(string2, "message");
        Intrinsics.checkNotNullParameter(list2, "successOptionsCode");
        Intrinsics.checkNotNullParameter(string3, "uuid");
        this.failedOptionsCode = list;
        this.message = string2;
        this.statusCode = n3;
        this.successOptionsCode = list2;
        this.uuid = string3;
    }

    public static /* synthetic */ CartBulkMoveToWishList copy$default(CartBulkMoveToWishList cartBulkMoveToWishList, List list, String object, int n3, List object2, String string2, int n4, Object object3) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            list = cartBulkMoveToWishList.failedOptionsCode;
        }
        if ((n7 = n4 & 2) != 0) {
            object = cartBulkMoveToWishList.message;
        }
        object3 = object;
        int n8 = n4 & 4;
        if (n8 != 0) {
            n3 = cartBulkMoveToWishList.statusCode;
        }
        int n10 = n3;
        n8 = n4 & 8;
        if (n8 != 0) {
            object2 = cartBulkMoveToWishList.successOptionsCode;
        }
        List list2 = object2;
        n8 = n4 & 0x10;
        if (n8 != 0) {
            string2 = cartBulkMoveToWishList.uuid;
        }
        object = cartBulkMoveToWishList;
        object2 = object3;
        object3 = string2;
        return cartBulkMoveToWishList.copy(list, (String)object2, n10, list2, string2);
    }

    public final List component1() {
        return this.failedOptionsCode;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.statusCode;
    }

    public final List component4() {
        return this.successOptionsCode;
    }

    public final String component5() {
        return this.uuid;
    }

    public final CartBulkMoveToWishList copy(List list, String string2, int n3, List list2, String string3) {
        Intrinsics.checkNotNullParameter(list, "failedOptionsCode");
        Intrinsics.checkNotNullParameter(string2, "message");
        Intrinsics.checkNotNullParameter(list2, "successOptionsCode");
        Intrinsics.checkNotNullParameter(string3, "uuid");
        CartBulkMoveToWishList cartBulkMoveToWishList = new CartBulkMoveToWishList(list, string2, n3, list2, string3);
        return cartBulkMoveToWishList;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof CartBulkMoveToWishList;
        if (n3 == 0) {
            return false;
        }
        object = (CartBulkMoveToWishList)object;
        Object object2 = this.failedOptionsCode;
        Object object3 = ((CartBulkMoveToWishList)object).failedOptionsCode;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.message;
        object3 = ((CartBulkMoveToWishList)object).message;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.statusCode;
        int n4 = ((CartBulkMoveToWishList)object).statusCode;
        if (n3 != n4) {
            return false;
        }
        object2 = this.successOptionsCode;
        object3 = ((CartBulkMoveToWishList)object).successOptionsCode;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.uuid;
        object = ((CartBulkMoveToWishList)object).uuid;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final List getFailedOptionsCode() {
        return this.failedOptionsCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final List getSuccessOptionsCode() {
        return this.successOptionsCode;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int n3 = ((Object)this.failedOptionsCode).hashCode();
        int n4 = 31;
        n3 *= 31;
        Object object = this.message;
        n3 = zy_2.b(n3, n4, (String)object);
        int n7 = this.statusCode;
        n3 = (n3 + n7) * 31;
        object = this.successOptionsCode;
        n3 = ne_0.a(n3, n4, (List)object);
        return this.uuid.hashCode() + n3;
    }

    public String toString() {
        List list = this.failedOptionsCode;
        String string2 = this.message;
        int n3 = this.statusCode;
        List list2 = this.successOptionsCode;
        String string3 = this.uuid;
        StringBuilder stringBuilder = new StringBuilder("CartBulkMoveToWishList(failedOptionsCode=");
        stringBuilder.append(list);
        stringBuilder.append(", message=");
        stringBuilder.append(string2);
        stringBuilder.append(", statusCode=");
        stringBuilder.append(n3);
        stringBuilder.append(", successOptionsCode=");
        stringBuilder.append(list2);
        stringBuilder.append(", uuid=");
        return h30_0.a(stringBuilder, string3, ")");
    }
}

