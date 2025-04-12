/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Closet;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class WishlistSyncModel {
    private List optionsCode;

    public WishlistSyncModel() {
        this(null, 1, null);
    }

    public WishlistSyncModel(List list) {
        this.optionsCode = list;
    }

    public /* synthetic */ WishlistSyncModel(List list, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            list = null;
        }
        this(list);
    }

    public static /* synthetic */ WishlistSyncModel copy$default(WishlistSyncModel wishlistSyncModel, List list, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            list = wishlistSyncModel.optionsCode;
        }
        return wishlistSyncModel.copy(list);
    }

    public final List component1() {
        return this.optionsCode;
    }

    public final WishlistSyncModel copy(List list) {
        WishlistSyncModel wishlistSyncModel = new WishlistSyncModel(list);
        return wishlistSyncModel;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof WishlistSyncModel;
        if (!bl3) {
            return false;
        }
        object = (WishlistSyncModel)object;
        List list = this.optionsCode;
        object = ((WishlistSyncModel)object).optionsCode;
        boolean bl4 = Intrinsics.areEqual(list, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getOptionsCode() {
        return this.optionsCode;
    }

    public int hashCode() {
        int n3;
        List list = this.optionsCode;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        return n3;
    }

    public final void setOptionsCode(List list) {
        this.optionsCode = list;
    }

    public String toString() {
        List list = this.optionsCode;
        StringBuilder stringBuilder = new StringBuilder("WishlistSyncModel(optionsCode=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

