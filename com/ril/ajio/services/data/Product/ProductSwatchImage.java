/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Product.ProductSwatchImage$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ProductSwatchImage
implements Serializable,
Parcelable,
Cloneable {
    public static final Parcelable.Creator CREATOR;
    private String url;

    static {
        ProductSwatchImage$Creator productSwatchImage$Creator = new ProductSwatchImage$Creator();
        CREATOR = productSwatchImage$Creator;
    }

    public ProductSwatchImage() {
        this(null, 1, null);
    }

    public ProductSwatchImage(String string2) {
        this.url = string2;
    }

    public /* synthetic */ ProductSwatchImage(String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            string2 = null;
        }
        this(string2);
    }

    public static /* synthetic */ ProductSwatchImage copy$default(ProductSwatchImage productSwatchImage, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = productSwatchImage.url;
        }
        return productSwatchImage.copy(string2);
    }

    public ProductSwatchImage clone() {
        Object object = super.clone();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.Product.ProductSwatchImage");
        return (ProductSwatchImage)object;
    }

    public final String component1() {
        return this.url;
    }

    public final ProductSwatchImage copy(String string2) {
        ProductSwatchImage productSwatchImage = new ProductSwatchImage(string2);
        return productSwatchImage;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ProductSwatchImage;
        if (!bl3) {
            return false;
        }
        object = (ProductSwatchImage)object;
        String string2 = this.url;
        object = ((ProductSwatchImage)object).url;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int n3;
        String string2 = this.url;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        return n3;
    }

    public final void setUrl(String string2) {
        this.url = string2;
    }

    public String toString() {
        String string2 = this.url;
        return cP.a("ProductSwatchImage(url=", string2, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.url;
        parcel.writeString(string2);
    }
}

