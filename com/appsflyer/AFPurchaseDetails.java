/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer;

import com.appsflyer.AFPurchaseType;
import kotlin.jvm.internal.Intrinsics;

public final class AFPurchaseDetails {
    private final String currency;
    private final String price;
    private final String productId;
    private final String purchaseToken;
    private final AFPurchaseType purchaseType;

    public AFPurchaseDetails(AFPurchaseType aFPurchaseType, String string2, String string3, String string4, String string5) {
        String string6 = "";
        Intrinsics.checkNotNullParameter((Object)aFPurchaseType, string6);
        Intrinsics.checkNotNullParameter(string2, string6);
        Intrinsics.checkNotNullParameter(string3, string6);
        Intrinsics.checkNotNullParameter(string4, string6);
        Intrinsics.checkNotNullParameter(string5, string6);
        this.purchaseType = aFPurchaseType;
        this.purchaseToken = string2;
        this.productId = string3;
        this.price = string4;
        this.currency = string5;
    }

    public static /* synthetic */ AFPurchaseDetails copy$default(AFPurchaseDetails aFPurchaseDetails, AFPurchaseType aFPurchaseType, String object, String object2, String object3, String string2, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            aFPurchaseType = aFPurchaseDetails.purchaseType;
        }
        if ((n4 = n3 & 2) != 0) {
            object = aFPurchaseDetails.purchaseToken;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = aFPurchaseDetails.productId;
        }
        String string3 = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = aFPurchaseDetails.price;
        }
        String string4 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string2 = aFPurchaseDetails.currency;
        }
        String string5 = string2;
        object = aFPurchaseDetails;
        object2 = aFPurchaseType;
        object3 = object4;
        string2 = string3;
        object4 = string5;
        return aFPurchaseDetails.copy(aFPurchaseType, (String)object3, string3, string4, string5);
    }

    public final AFPurchaseType component1() {
        return this.purchaseType;
    }

    public final String component2() {
        return this.purchaseToken;
    }

    public final String component3() {
        return this.productId;
    }

    public final String component4() {
        return this.price;
    }

    public final String component5() {
        return this.currency;
    }

    public final AFPurchaseDetails copy(AFPurchaseType aFPurchaseType, String string2, String string3, String string4, String string5) {
        Object object = "";
        Intrinsics.checkNotNullParameter((Object)aFPurchaseType, (String)object);
        Intrinsics.checkNotNullParameter(string2, (String)object);
        Intrinsics.checkNotNullParameter(string3, (String)object);
        Intrinsics.checkNotNullParameter(string4, (String)object);
        Intrinsics.checkNotNullParameter(string5, (String)object);
        object = new AFPurchaseDetails(aFPurchaseType, string2, string3, string4, string5);
        return object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AFPurchaseDetails;
        if (!bl3) {
            return false;
        }
        object = (AFPurchaseDetails)object;
        Object object2 = this.purchaseType;
        Object object3 = ((AFPurchaseDetails)object).purchaseType;
        if (object2 != object3) {
            return false;
        }
        object2 = this.purchaseToken;
        object3 = ((AFPurchaseDetails)object).purchaseToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.productId;
        object3 = ((AFPurchaseDetails)object).productId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.price;
        object3 = ((AFPurchaseDetails)object).price;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.currency;
        object = ((AFPurchaseDetails)object).currency;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final AFPurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final int hashCode() {
        int n3 = ((Object)((Object)this.purchaseType)).hashCode() * 31;
        int n4 = (this.purchaseToken.hashCode() + n3) * 31;
        n3 = (this.productId.hashCode() + n4) * 31;
        n4 = (this.price.hashCode() + n3) * 31;
        return this.currency.hashCode() + n4;
    }

    public final String toString() {
        AFPurchaseType aFPurchaseType = this.purchaseType;
        String string2 = this.purchaseToken;
        String string3 = this.productId;
        String string4 = this.price;
        String string5 = this.currency;
        StringBuilder stringBuilder = new StringBuilder("AFPurchaseDetails(purchaseType=");
        stringBuilder.append((Object)aFPurchaseType);
        stringBuilder.append(", purchaseToken=");
        stringBuilder.append(string2);
        stringBuilder.append(", productId=");
        X50.a(stringBuilder, string3, ", price=", string4, ", currency=");
        return h30_0.a(stringBuilder, string5, ")");
    }
}

