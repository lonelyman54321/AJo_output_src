/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.subscription;

import com.affise.attribution.modules.subscription.AffiseProduct;
import kotlin.jvm.internal.Intrinsics;

public final class AffisePurchasedInfo {
    private final String orderId;
    private final String originalOrderId;
    private final AffiseProduct product;
    private final Object purchase;

    public AffisePurchasedInfo(AffiseProduct affiseProduct, String string2, String string3, Object object) {
        this.product = affiseProduct;
        this.orderId = string2;
        this.originalOrderId = string3;
        this.purchase = object;
    }

    public static /* synthetic */ AffisePurchasedInfo copy$default(AffisePurchasedInfo affisePurchasedInfo, AffiseProduct affiseProduct, String string2, String string3, Object object, int n3, Object object2) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            affiseProduct = affisePurchasedInfo.product;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = affisePurchasedInfo.orderId;
        }
        if ((n4 = n3 & 4) != 0) {
            string3 = affisePurchasedInfo.originalOrderId;
        }
        if ((n3 &= 8) != 0) {
            object = affisePurchasedInfo.purchase;
        }
        return affisePurchasedInfo.copy(affiseProduct, string2, string3, object);
    }

    public final AffiseProduct component1() {
        return this.product;
    }

    public final String component2() {
        return this.orderId;
    }

    public final String component3() {
        return this.originalOrderId;
    }

    public final Object component4() {
        return this.purchase;
    }

    public final AffisePurchasedInfo copy(AffiseProduct affiseProduct, String string2, String string3, Object object) {
        AffisePurchasedInfo affisePurchasedInfo = new AffisePurchasedInfo(affiseProduct, string2, string3, object);
        return affisePurchasedInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AffisePurchasedInfo;
        if (!bl3) {
            return false;
        }
        object = (AffisePurchasedInfo)object;
        Object object2 = this.product;
        Object object3 = ((AffisePurchasedInfo)object).product;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderId;
        object3 = ((AffisePurchasedInfo)object).orderId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.originalOrderId;
        object3 = ((AffisePurchasedInfo)object).originalOrderId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.purchase;
        object = ((AffisePurchasedInfo)object).purchase;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getOriginalOrderId() {
        return this.originalOrderId;
    }

    public final AffiseProduct getProduct() {
        return this.product;
    }

    public final Object getPurchase() {
        return this.purchase;
    }

    public int hashCode() {
        int n3;
        int n4;
        AffiseProduct affiseProduct = this.product;
        int n7 = 0;
        if (affiseProduct == null) {
            n4 = 0;
            affiseProduct = null;
        } else {
            n4 = affiseProduct.hashCode();
        }
        n4 *= 31;
        Object object = this.orderId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.originalOrderId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.purchase;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AffisePurchasedInfo(product=");
        Object object = this.product;
        stringBuilder.append(object);
        stringBuilder.append(", orderId=");
        object = this.orderId;
        stringBuilder.append((String)object);
        stringBuilder.append(", originalOrderId=");
        object = this.originalOrderId;
        stringBuilder.append((String)object);
        stringBuilder.append(", purchase=");
        object = this.purchase;
        return gl1_0.a(stringBuilder, object, ')');
    }
}

