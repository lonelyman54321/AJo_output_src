/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.permission;

import com.ril.ajio.permission.PopUpDialogModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CartData {
    public static final int $stable;
    private final PopUpDialogModel inAppPopUpDialogModel;
    private final PopUpDialogModel systemDialogModel;

    public CartData() {
        this(null, null, 3, null);
    }

    public CartData(PopUpDialogModel popUpDialogModel, PopUpDialogModel popUpDialogModel2) {
        this.inAppPopUpDialogModel = popUpDialogModel;
        this.systemDialogModel = popUpDialogModel2;
    }

    public /* synthetic */ CartData(PopUpDialogModel popUpDialogModel, PopUpDialogModel popUpDialogModel2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            popUpDialogModel = null;
        }
        if ((n3 &= 2) != 0) {
            popUpDialogModel2 = null;
        }
        this(popUpDialogModel, popUpDialogModel2);
    }

    public static /* synthetic */ CartData copy$default(CartData cartData, PopUpDialogModel popUpDialogModel, PopUpDialogModel popUpDialogModel2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            popUpDialogModel = cartData.inAppPopUpDialogModel;
        }
        if ((n3 &= 2) != 0) {
            popUpDialogModel2 = cartData.systemDialogModel;
        }
        return cartData.copy(popUpDialogModel, popUpDialogModel2);
    }

    public final PopUpDialogModel component1() {
        return this.inAppPopUpDialogModel;
    }

    public final PopUpDialogModel component2() {
        return this.systemDialogModel;
    }

    public final CartData copy(PopUpDialogModel popUpDialogModel, PopUpDialogModel popUpDialogModel2) {
        CartData cartData = new CartData(popUpDialogModel, popUpDialogModel2);
        return cartData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CartData;
        if (!bl3) {
            return false;
        }
        object = (CartData)object;
        PopUpDialogModel popUpDialogModel = this.inAppPopUpDialogModel;
        PopUpDialogModel popUpDialogModel2 = ((CartData)object).inAppPopUpDialogModel;
        bl3 = Intrinsics.areEqual(popUpDialogModel, popUpDialogModel2);
        if (!bl3) {
            return false;
        }
        popUpDialogModel = this.systemDialogModel;
        object = ((CartData)object).systemDialogModel;
        boolean bl4 = Intrinsics.areEqual(popUpDialogModel, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final PopUpDialogModel getInAppPopUpDialogModel() {
        return this.inAppPopUpDialogModel;
    }

    public final PopUpDialogModel getSystemDialogModel() {
        return this.systemDialogModel;
    }

    public int hashCode() {
        int n3;
        PopUpDialogModel popUpDialogModel = this.inAppPopUpDialogModel;
        int n4 = 0;
        if (popUpDialogModel == null) {
            n3 = 0;
            popUpDialogModel = null;
        } else {
            n3 = popUpDialogModel.hashCode();
        }
        n3 *= 31;
        PopUpDialogModel popUpDialogModel2 = this.systemDialogModel;
        if (popUpDialogModel2 != null) {
            n4 = popUpDialogModel2.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        PopUpDialogModel popUpDialogModel = this.inAppPopUpDialogModel;
        PopUpDialogModel popUpDialogModel2 = this.systemDialogModel;
        StringBuilder stringBuilder = new StringBuilder("CartData(inAppPopUpDialogModel=");
        stringBuilder.append(popUpDialogModel);
        stringBuilder.append(", systemDialogModel=");
        stringBuilder.append(popUpDialogModel2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

