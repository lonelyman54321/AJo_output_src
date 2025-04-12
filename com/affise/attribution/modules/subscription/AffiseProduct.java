/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.subscription;

import com.affise.attribution.modules.subscription.AffiseProduct$WhenMappings;
import com.affise.attribution.modules.subscription.AffiseProductPrice;
import com.affise.attribution.modules.subscription.AffiseProductSubscriptionDetail;
import com.affise.attribution.modules.subscription.AffiseProductType;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseProduct {
    private final AffiseProductPrice price;
    private final String productDescription;
    private final Object productDetails;
    private final String productId;
    private AffiseProductType productType;
    private final AffiseProductSubscriptionDetail subscription;
    private final String title;

    public AffiseProduct(String string2, String string3, String string4, AffiseProductType affiseProductType, AffiseProductPrice affiseProductPrice, AffiseProductSubscriptionDetail affiseProductSubscriptionDetail, Object object) {
        Intrinsics.checkNotNullParameter(string2, "productId");
        Intrinsics.checkNotNullParameter(string3, "title");
        Intrinsics.checkNotNullParameter(string4, "productDescription");
        Intrinsics.checkNotNullParameter((Object)affiseProductType, "productType");
        this.productId = string2;
        this.title = string3;
        this.productDescription = string4;
        this.productType = affiseProductType;
        this.price = affiseProductPrice;
        this.subscription = affiseProductSubscriptionDetail;
        this.productDetails = object;
    }

    public static /* synthetic */ AffiseProduct copy$default(AffiseProduct affiseProduct, String string2, String object, String string3, AffiseProductType object2, AffiseProductPrice object3, AffiseProductSubscriptionDetail object4, Object object5, int n3, Object object6) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = affiseProduct.productId;
        }
        if ((n4 = n3 & 2) != 0) {
            object = affiseProduct.title;
        }
        object6 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = affiseProduct.productDescription;
        }
        String string4 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = affiseProduct.productType;
        }
        AffiseProductType affiseProductType = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = affiseProduct.price;
        }
        AffiseProductPrice affiseProductPrice = object3;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            object4 = affiseProduct.subscription;
        }
        AffiseProductSubscriptionDetail affiseProductSubscriptionDetail = object4;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            object5 = affiseProduct.productDetails;
        }
        Object object7 = object5;
        object = affiseProduct;
        string3 = string2;
        object2 = object6;
        object3 = string4;
        object4 = affiseProductType;
        object5 = affiseProductPrice;
        object6 = object7;
        return affiseProduct.copy(string2, (String)object2, string4, affiseProductType, affiseProductPrice, affiseProductSubscriptionDetail, object7);
    }

    public final AffiseProduct asConsumable() {
        AffiseProductType affiseProductType = this.productType;
        int[] nArray = AffiseProduct$WhenMappings.$EnumSwitchMapping$0;
        int n3 = affiseProductType.ordinal();
        int n4 = 1;
        affiseProductType = (n3 = nArray[n3]) == n4 ? AffiseProductType.CONSUMABLE : this.productType;
        this.productType = affiseProductType;
        return this;
    }

    public final AffiseProduct asNonConsumable() {
        AffiseProductType affiseProductType = this.productType;
        int[] nArray = AffiseProduct$WhenMappings.$EnumSwitchMapping$0;
        int n3 = affiseProductType.ordinal();
        int n4 = 2;
        affiseProductType = (n3 = nArray[n3]) == n4 ? AffiseProductType.NON_CONSUMABLE : this.productType;
        this.productType = affiseProductType;
        return this;
    }

    public final String component1() {
        return this.productId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.productDescription;
    }

    public final AffiseProductType component4() {
        return this.productType;
    }

    public final AffiseProductPrice component5() {
        return this.price;
    }

    public final AffiseProductSubscriptionDetail component6() {
        return this.subscription;
    }

    public final Object component7() {
        return this.productDetails;
    }

    public final AffiseProduct copy(String string2, String string3, String string4, AffiseProductType affiseProductType, AffiseProductPrice affiseProductPrice, AffiseProductSubscriptionDetail affiseProductSubscriptionDetail, Object object) {
        Intrinsics.checkNotNullParameter(string2, "productId");
        Intrinsics.checkNotNullParameter(string3, "title");
        Intrinsics.checkNotNullParameter(string4, "productDescription");
        Intrinsics.checkNotNullParameter((Object)affiseProductType, "productType");
        AffiseProduct affiseProduct = new AffiseProduct(string2, string3, string4, affiseProductType, affiseProductPrice, affiseProductSubscriptionDetail, object);
        return affiseProduct;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AffiseProduct;
        if (!bl3) {
            return false;
        }
        object = (AffiseProduct)object;
        Object object2 = this.productId;
        Object object3 = ((AffiseProduct)object).productId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.title;
        object3 = ((AffiseProduct)object).title;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.productDescription;
        object3 = ((AffiseProduct)object).productDescription;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.productType;
        object3 = ((AffiseProduct)object).productType;
        if (object2 != object3) {
            return false;
        }
        object2 = this.price;
        object3 = ((AffiseProduct)object).price;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subscription;
        object3 = ((AffiseProduct)object).subscription;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.productDetails;
        object = ((AffiseProduct)object).productDetails;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final AffiseProductPrice getPrice() {
        return this.price;
    }

    public final String getProductDescription() {
        return this.productDescription;
    }

    public final Object getProductDetails() {
        return this.productDetails;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final AffiseProductType getProductType() {
        return this.productType;
    }

    public final AffiseProductSubscriptionDetail getSubscription() {
        return this.subscription;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int n3 = this.productId.hashCode();
        int n4 = 31;
        n3 *= 31;
        Object object = this.title;
        n3 = zy_2.b(n3, n4, (String)object);
        object = this.productDescription;
        n3 = zy_2.b(n3, n4, (String)object);
        object = this.productType;
        int n7 = (object.hashCode() + n3) * 31;
        Object object2 = this.price;
        int n8 = 0;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((AffiseProductPrice)object2).hashCode();
        }
        n7 = (n7 + n3) * 31;
        object2 = this.subscription;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((AffiseProductSubscriptionDetail)object2).hashCode();
        }
        n7 = (n7 + n3) * 31;
        object2 = this.productDetails;
        if (object2 != null) {
            n8 = object2.hashCode();
        }
        return n7 + n8;
    }

    public final void setProductType(AffiseProductType affiseProductType) {
        Intrinsics.checkNotNullParameter((Object)affiseProductType, "<set-?>");
        this.productType = affiseProductType;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AffiseProduct(productId=");
        Object object = this.productId;
        stringBuilder.append((String)object);
        stringBuilder.append(", title=");
        object = this.title;
        stringBuilder.append((String)object);
        stringBuilder.append(", productDescription=");
        object = this.productDescription;
        stringBuilder.append((String)object);
        stringBuilder.append(", productType=");
        object = this.productType;
        stringBuilder.append(object);
        stringBuilder.append(", price=");
        object = this.price;
        stringBuilder.append(object);
        stringBuilder.append(", subscription=");
        object = this.subscription;
        stringBuilder.append(object);
        stringBuilder.append(", productDetails=");
        object = this.productDetails;
        return gl1_0.a(stringBuilder, object, ')');
    }
}

