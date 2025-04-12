/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.explore_brands;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Image {
    private String altText;
    private String format;
    private Integer galleryIndex;
    private String imageType;
    private String url;

    public Image() {
        this(null, null, null, null, null, 31, null);
    }

    public Image(String string2, String string3, Integer n3, String string4, String string5) {
        this.altText = string2;
        this.format = string3;
        this.galleryIndex = n3;
        this.imageType = string4;
        this.url = string5;
    }

    public /* synthetic */ Image(String object, String object2, Integer object3, String object4, String string2, int n3, DefaultConstructorMarker object5) {
        String string3;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object5 = null;
        } else {
            object5 = object;
        }
        int n7 = n3 & 2;
        Object object6 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        Object object7 = n7 != 0 ? null : object3;
        n7 = n3 & 8;
        Object object8 = n7 != 0 ? null : object4;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            n3 = 0;
            string3 = null;
        } else {
            string3 = string2;
        }
        object = this;
        object2 = object5;
        object3 = object6;
        object4 = object7;
        string2 = object8;
        this((String)object5, (String)object6, (Integer)object7, (String)object8, string3);
    }

    public static /* synthetic */ Image copy$default(Image image, String string2, String object, Integer object2, String object3, String object4, int n3, Object object5) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = image.altText;
        }
        if ((n4 = n3 & 2) != 0) {
            object = image.format;
        }
        object5 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = image.galleryIndex;
        }
        Integer n8 = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = image.imageType;
        }
        String string3 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object4 = image.url;
        }
        String string4 = object4;
        object = image;
        object2 = string2;
        object3 = object5;
        object4 = n8;
        object5 = string4;
        return image.copy(string2, (String)object3, n8, string3, string4);
    }

    public final String component1() {
        return this.altText;
    }

    public final String component2() {
        return this.format;
    }

    public final Integer component3() {
        return this.galleryIndex;
    }

    public final String component4() {
        return this.imageType;
    }

    public final String component5() {
        return this.url;
    }

    public final Image copy(String string2, String string3, Integer n3, String string4, String string5) {
        Image image = new Image(string2, string3, n3, string4, string5);
        return image;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Image;
        if (!bl3) {
            return false;
        }
        object = (Image)object;
        Object object2 = this.altText;
        Object object3 = ((Image)object).altText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.format;
        object3 = ((Image)object).format;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.galleryIndex;
        object3 = ((Image)object).galleryIndex;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageType;
        object3 = ((Image)object).imageType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.url;
        object = ((Image)object).url;
        boolean bl4 = Intrinsics.areEqual(object2, object);
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

    public final Integer getGalleryIndex() {
        return this.galleryIndex;
    }

    public final String getImageType() {
        return this.imageType;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.altText;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.format;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.galleryIndex;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
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
        object = this.url;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setAltText(String string2) {
        this.altText = string2;
    }

    public final void setFormat(String string2) {
        this.format = string2;
    }

    public final void setGalleryIndex(Integer n3) {
        this.galleryIndex = n3;
    }

    public final void setImageType(String string2) {
        this.imageType = string2;
    }

    public final void setUrl(String string2) {
        this.url = string2;
    }

    public String toString() {
        CharSequence charSequence = this.altText;
        String string2 = this.format;
        Integer n3 = this.galleryIndex;
        String string3 = this.imageType;
        String string4 = this.url;
        charSequence = og_1.a("Image(altText=", (String)charSequence, ", format=", string2, ", galleryIndex=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(", imageType=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", url=");
        return h30_0.a((StringBuilder)charSequence, string4, ")");
    }
}

