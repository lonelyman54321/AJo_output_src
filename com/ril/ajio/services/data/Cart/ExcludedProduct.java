/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class ExcludedProduct
implements Serializable {
    private final String altText;
    private final String code;
    private final String format;
    private final String imageType;
    private final List images;
    private final String url;

    public ExcludedProduct(String string2, String string3, String string4, String string5, List list, String string6) {
        Intrinsics.checkNotNullParameter(string2, "altText");
        Intrinsics.checkNotNullParameter(string3, "code");
        Intrinsics.checkNotNullParameter(string4, "format");
        Intrinsics.checkNotNullParameter(string5, "imageType");
        Intrinsics.checkNotNullParameter(list, "images");
        Intrinsics.checkNotNullParameter(string6, "url");
        this.altText = string2;
        this.code = string3;
        this.format = string4;
        this.imageType = string5;
        this.images = list;
        this.url = string6;
    }

    public static /* synthetic */ ExcludedProduct copy$default(ExcludedProduct excludedProduct, String string2, String object, String string3, String object2, List object3, String string4, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = excludedProduct.altText;
        }
        if ((n4 = n3 & 2) != 0) {
            object = excludedProduct.code;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = excludedProduct.format;
        }
        String string5 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = excludedProduct.imageType;
        }
        String string6 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = excludedProduct.images;
        }
        List list = object3;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            string4 = excludedProduct.url;
        }
        String string7 = string4;
        object = excludedProduct;
        string3 = string2;
        object2 = object4;
        object3 = string5;
        string4 = string6;
        object4 = string7;
        return excludedProduct.copy(string2, (String)object2, string5, string6, list, string7);
    }

    public final String component1() {
        return this.altText;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.format;
    }

    public final String component4() {
        return this.imageType;
    }

    public final List component5() {
        return this.images;
    }

    public final String component6() {
        return this.url;
    }

    public final ExcludedProduct copy(String string2, String string3, String string4, String string5, List list, String string6) {
        Intrinsics.checkNotNullParameter(string2, "altText");
        Intrinsics.checkNotNullParameter(string3, "code");
        Intrinsics.checkNotNullParameter(string4, "format");
        Intrinsics.checkNotNullParameter(string5, "imageType");
        Intrinsics.checkNotNullParameter(list, "images");
        Intrinsics.checkNotNullParameter(string6, "url");
        ExcludedProduct excludedProduct = new ExcludedProduct(string2, string3, string4, string5, list, string6);
        return excludedProduct;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ExcludedProduct;
        if (!bl3) {
            return false;
        }
        object = (ExcludedProduct)object;
        Object object2 = this.altText;
        Object object3 = ((ExcludedProduct)object).altText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.code;
        object3 = ((ExcludedProduct)object).code;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.format;
        object3 = ((ExcludedProduct)object).format;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageType;
        object3 = ((ExcludedProduct)object).imageType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.images;
        object3 = ((ExcludedProduct)object).images;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.url;
        object = ((ExcludedProduct)object).url;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAltText() {
        return this.altText;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getImageType() {
        return this.imageType;
    }

    public final List getImages() {
        return this.images;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int n3 = this.altText.hashCode();
        int n4 = 31;
        n3 *= 31;
        Object object = this.code;
        n3 = zy_2.b(n3, n4, (String)object);
        object = this.format;
        n3 = zy_2.b(n3, n4, (String)object);
        object = this.imageType;
        n3 = zy_2.b(n3, n4, (String)object);
        object = this.images;
        n3 = ne_0.a(n3, n4, (List)object);
        return this.url.hashCode() + n3;
    }

    public String toString() {
        CharSequence charSequence = this.altText;
        String string2 = this.code;
        String string3 = this.format;
        String string4 = this.imageType;
        List list = this.images;
        String string5 = this.url;
        charSequence = og_1.a("ExcludedProduct(altText=", (String)charSequence, ", code=", string2, ", format=");
        X50.a((StringBuilder)charSequence, string3, ", imageType=", string4, ", images=");
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(", url=");
        ((StringBuilder)charSequence).append(string5);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

