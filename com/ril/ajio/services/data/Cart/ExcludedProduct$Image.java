/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class ExcludedProduct$Image
implements Serializable {
    private final String altText;
    private final String format;
    private final String imageType;
    private final String url;

    public ExcludedProduct$Image(String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "altText");
        Intrinsics.checkNotNullParameter(string3, "format");
        Intrinsics.checkNotNullParameter(string4, "imageType");
        Intrinsics.checkNotNullParameter(string5, "url");
        this.altText = string2;
        this.format = string3;
        this.imageType = string4;
        this.url = string5;
    }

    public static /* synthetic */ ExcludedProduct$Image copy$default(ExcludedProduct$Image excludedProduct$Image, String string2, String string3, String string4, String string5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = excludedProduct$Image.altText;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = excludedProduct$Image.format;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = excludedProduct$Image.imageType;
        }
        if ((n3 &= 8) != 0) {
            string5 = excludedProduct$Image.url;
        }
        return excludedProduct$Image.copy(string2, string3, string4, string5);
    }

    public final String component1() {
        return this.altText;
    }

    public final String component2() {
        return this.format;
    }

    public final String component3() {
        return this.imageType;
    }

    public final String component4() {
        return this.url;
    }

    public final ExcludedProduct$Image copy(String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "altText");
        Intrinsics.checkNotNullParameter(string3, "format");
        Intrinsics.checkNotNullParameter(string4, "imageType");
        Intrinsics.checkNotNullParameter(string5, "url");
        ExcludedProduct$Image excludedProduct$Image = new ExcludedProduct$Image(string2, string3, string4, string5);
        return excludedProduct$Image;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ExcludedProduct$Image;
        if (!bl3) {
            return false;
        }
        object = (ExcludedProduct$Image)object;
        String string2 = this.altText;
        String string3 = ((ExcludedProduct$Image)object).altText;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.format;
        string3 = ((ExcludedProduct$Image)object).format;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.imageType;
        string3 = ((ExcludedProduct$Image)object).imageType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.url;
        object = ((ExcludedProduct$Image)object).url;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAltText() {
        return this.altText;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getImageType() {
        return this.imageType;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int n3 = this.altText.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.format;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.imageType;
        n3 = zy_2.b(n3, n4, string2);
        return this.url.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.altText;
        String string3 = this.format;
        String string4 = this.imageType;
        String string5 = this.url;
        return ko_0.a(og_1.a("Image(altText=", string2, ", format=", string3, ", imageType="), string4, ", url=", string5, ")");
    }
}

