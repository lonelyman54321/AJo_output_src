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
import com.ril.ajio.services.data.Product.ProductImage$Creator;
import com.ril.ajio.services.data.Product.ProductVideos;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ProductImage
implements Serializable,
Parcelable,
Cloneable {
    public static final Parcelable.Creator CREATOR;
    private String altText;
    private Boolean flagForImageAndVideo;
    private String format;
    private int galleryIndex;
    private String imageType;
    private final ProductVideos productVideos;
    private String url;
    private String videoThumbnail;
    private String videoUrl;

    static {
        ProductImage$Creator productImage$Creator = new ProductImage$Creator();
        CREATOR = productImage$Creator;
    }

    public ProductImage() {
        this(null, null, null, 0, null, null, null, null, null, 511, null);
    }

    public ProductImage(String string2, String string3, String string4, int n3, String string5, Boolean bl2, String string6, String string7, ProductVideos productVideos) {
        Intrinsics.checkNotNullParameter(string6, "videoUrl");
        Intrinsics.checkNotNullParameter(string7, "videoThumbnail");
        this.format = string2;
        this.url = string3;
        this.imageType = string4;
        this.galleryIndex = n3;
        this.altText = string5;
        this.flagForImageAndVideo = bl2;
        this.videoUrl = string6;
        this.videoThumbnail = string7;
        this.productVideos = productVideos;
    }

    public /* synthetic */ ProductImage(String object, String string2, String string3, int n3, String string4, Boolean object2, String object3, String string5, ProductVideos object4, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        String string6;
        String string7;
        String string8;
        int n7 = n4;
        int n8 = n4 & 1;
        ProductVideos productVideos = null;
        if (n8 != 0) {
            n8 = 0;
            string8 = null;
        } else {
            string8 = object;
        }
        int n10 = n7 & 2;
        String string9 = "";
        String string10 = n10 != 0 ? string9 : string2;
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            string7 = null;
        } else {
            string7 = string3;
        }
        int n15 = n7 & 8;
        n15 = n15 != 0 ? 0 : n3;
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            string6 = null;
        } else {
            string6 = string4;
        }
        int n17 = n7 & 0x20;
        Object object5 = n17 != 0 ? Boolean.FALSE : object2;
        int n18 = n7 & 0x40;
        Object object6 = n18 != 0 ? string9 : object3;
        int n19 = n7 & 0x80;
        if (n19 == 0) {
            string9 = string5;
        }
        if ((n7 &= 0x100) == 0) {
            productVideos = object4;
        }
        object = this;
        string2 = string8;
        string3 = string10;
        object2 = string6;
        object3 = object5;
        string5 = object6;
        object4 = string9;
        this(string8, string10, string7, n15, string6, (Boolean)object5, (String)object6, string9, productVideos);
    }

    public static /* synthetic */ ProductImage copy$default(ProductImage productImage, String string2, String string3, String string4, int n3, String string5, Boolean bl2, String string6, String string7, ProductVideos productVideos, int n4, Object object) {
        ProductImage productImage2 = productImage;
        int n7 = n4;
        int n8 = n4 & 1;
        String string8 = n8 != 0 ? productImage.format : string2;
        int n10 = n7 & 2;
        String string9 = n10 != 0 ? productImage2.url : string3;
        int n14 = n7 & 4;
        String string10 = n14 != 0 ? productImage2.imageType : string4;
        int n15 = n7 & 8;
        n15 = n15 != 0 ? productImage2.galleryIndex : n3;
        int n16 = n7 & 0x10;
        String string11 = n16 != 0 ? productImage2.altText : string5;
        int n17 = n7 & 0x20;
        Boolean bl3 = n17 != 0 ? productImage2.flagForImageAndVideo : bl2;
        int n18 = n7 & 0x40;
        String string12 = n18 != 0 ? productImage2.videoUrl : string6;
        int n19 = n7 & 0x80;
        String string13 = n19 != 0 ? productImage2.videoThumbnail : string7;
        ProductVideos productVideos2 = (n7 &= 0x100) != 0 ? productImage2.productVideos : productVideos;
        string2 = string8;
        string3 = string9;
        string4 = string10;
        n3 = n15;
        string5 = string11;
        bl2 = bl3;
        string6 = string12;
        string7 = string13;
        productVideos = productVideos2;
        return productImage.copy(string8, string9, string10, n15, string11, bl3, string12, string13, productVideos2);
    }

    public ProductImage clone() {
        Object object = super.clone();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.Product.ProductImage");
        return (ProductImage)object;
    }

    public final String component1() {
        return this.format;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.imageType;
    }

    public final int component4() {
        return this.galleryIndex;
    }

    public final String component5() {
        return this.altText;
    }

    public final Boolean component6() {
        return this.flagForImageAndVideo;
    }

    public final String component7() {
        return this.videoUrl;
    }

    public final String component8() {
        return this.videoThumbnail;
    }

    public final ProductVideos component9() {
        return this.productVideos;
    }

    public final ProductImage copy(String string2, String string3, String string4, int n3, String string5, Boolean bl2, String string6, String string7, ProductVideos productVideos) {
        Intrinsics.checkNotNullParameter(string6, "videoUrl");
        Intrinsics.checkNotNullParameter(string7, "videoThumbnail");
        ProductImage productImage = new ProductImage(string2, string3, string4, n3, string5, bl2, string6, string7, productVideos);
        return productImage;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ProductImage;
        if (n3 == 0) {
            return false;
        }
        object = (ProductImage)object;
        Object object2 = this.format;
        Object object3 = ((ProductImage)object).format;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.url;
        object3 = ((ProductImage)object).url;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.imageType;
        object3 = ((ProductImage)object).imageType;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.galleryIndex;
        int n4 = ((ProductImage)object).galleryIndex;
        if (n3 != n4) {
            return false;
        }
        object2 = this.altText;
        object3 = ((ProductImage)object).altText;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.flagForImageAndVideo;
        object3 = ((ProductImage)object).flagForImageAndVideo;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.videoUrl;
        object3 = ((ProductImage)object).videoUrl;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.videoThumbnail;
        object3 = ((ProductImage)object).videoThumbnail;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.productVideos;
        object = ((ProductImage)object).productVideos;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getAltText() {
        return this.altText;
    }

    public final Boolean getFlagForImageAndVideo() {
        return this.flagForImageAndVideo;
    }

    public final String getFormat() {
        return this.format;
    }

    public final int getGalleryIndex() {
        return this.galleryIndex;
    }

    public final String getImageType() {
        return this.imageType;
    }

    public final ProductVideos getProductVideos() {
        return this.productVideos;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVideoThumbnail() {
        return this.videoThumbnail;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.format;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        int n8 = 31;
        n4 *= 31;
        Object object = this.url;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.imageType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = this.galleryIndex;
        n4 = (n4 + n3) * 31;
        object = this.altText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.flagForImageAndVideo;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.videoUrl;
        n4 = zy_2.b(n4, n8, (String)object);
        object = this.videoThumbnail;
        n4 = zy_2.b(n4, n8, (String)object);
        ProductVideos productVideos = this.productVideos;
        if (productVideos != null) {
            n7 = productVideos.hashCode();
        }
        return n4 + n7;
    }

    public final void setAltText(String string2) {
        this.altText = string2;
    }

    public final void setFlagForImageAndVideo(Boolean bl2) {
        this.flagForImageAndVideo = bl2;
    }

    public final void setFormat(String string2) {
        this.format = string2;
    }

    public final void setGalleryIndex(int n3) {
        this.galleryIndex = n3;
    }

    public final void setImageType(String string2) {
        this.imageType = string2;
    }

    public final void setUrl(String string2) {
        this.url = string2;
    }

    public final void setVideoThumbnail(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.videoThumbnail = string2;
    }

    public final void setVideoUrl(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.videoUrl = string2;
    }

    public String toString() {
        CharSequence charSequence = this.format;
        String string2 = this.url;
        String string3 = this.imageType;
        int n3 = this.galleryIndex;
        String string4 = this.altText;
        Boolean bl2 = this.flagForImageAndVideo;
        String string5 = this.videoUrl;
        String string6 = this.videoThumbnail;
        ProductVideos productVideos = this.productVideos;
        charSequence = og_1.a("ProductImage(format=", (String)charSequence, ", url=", string2, ", imageType=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", galleryIndex=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(", altText=");
        vw0_1.a(bl2, string4, ", flagForImageAndVideo=", ", videoUrl=", (StringBuilder)charSequence);
        X50.a((StringBuilder)charSequence, string5, ", videoThumbnail=", string6, ", productVideos=");
        ((StringBuilder)charSequence).append(productVideos);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.format;
        parcel.writeString((String)object);
        object = this.url;
        parcel.writeString((String)object);
        object = this.imageType;
        parcel.writeString((String)object);
        n3 = this.galleryIndex;
        parcel.writeInt(n3);
        object = this.altText;
        parcel.writeString((String)object);
        object = this.flagForImageAndVideo;
        if (object == null) {
            n3 = 0;
            object = null;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            yi0_2.a(parcel, n4, (Boolean)object);
        }
        object = this.videoUrl;
        parcel.writeString((String)object);
        object = this.videoThumbnail;
        parcel.writeString((String)object);
        object = this.productVideos;
        parcel.writeSerializable((Serializable)object);
    }
}

