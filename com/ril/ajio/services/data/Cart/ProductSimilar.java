/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ProductSimilar
implements Serializable {
    private String imageURL;
    private String productCode;
    private String size;

    public ProductSimilar() {
        this(null, null, null, 7, null);
    }

    public ProductSimilar(String string2, String string3, String string4) {
        this.imageURL = string2;
        this.productCode = string3;
        this.size = string4;
    }

    public /* synthetic */ ProductSimilar(String string2, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            string4 = null;
        }
        this(string2, string3, string4);
    }

    public static /* synthetic */ ProductSimilar copy$default(ProductSimilar productSimilar, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = productSimilar.imageURL;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = productSimilar.productCode;
        }
        if ((n3 &= 4) != 0) {
            string4 = productSimilar.size;
        }
        return productSimilar.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.imageURL;
    }

    public final String component2() {
        return this.productCode;
    }

    public final String component3() {
        return this.size;
    }

    public final ProductSimilar copy(String string2, String string3, String string4) {
        ProductSimilar productSimilar = new ProductSimilar(string2, string3, string4);
        return productSimilar;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ProductSimilar;
        if (!bl3) {
            return false;
        }
        object = (ProductSimilar)object;
        String string2 = this.imageURL;
        String string3 = ((ProductSimilar)object).imageURL;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.productCode;
        string3 = ((ProductSimilar)object).productCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.size;
        object = ((ProductSimilar)object).size;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getImageURL() {
        return this.imageURL;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getSize() {
        return this.size;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.imageURL;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.productCode;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.size;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setImageURL(String string2) {
        this.imageURL = string2;
    }

    public final void setProductCode(String string2) {
        this.productCode = string2;
    }

    public final void setSize(String string2) {
        this.size = string2;
    }

    public String toString() {
        String string2 = this.imageURL;
        String string3 = this.productCode;
        String string4 = this.size;
        return h30_0.a(og_1.a("ProductSimilar(imageURL=", string2, ", productCode=", string3, ", size="), string4, ")");
    }
}

