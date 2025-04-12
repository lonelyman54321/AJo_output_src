/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class KYPImage {
    private String format;
    private Integer galleryIndex;
    private Long height;
    private String imageName;
    private String imageType;
    private Long kypSequence;
    private String url;
    private Long width;

    public KYPImage() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public KYPImage(String string2, String string3, String string4, Long l2, Long l3, Long l4, String string5, Integer n3) {
        this.format = string2;
        this.url = string3;
        this.imageName = string4;
        this.kypSequence = l2;
        this.width = l3;
        this.height = l4;
        this.imageType = string5;
        this.galleryIndex = n3;
    }

    public /* synthetic */ KYPImage(String object, String string2, String string3, Long object2, Long l2, Long l3, String object3, Integer object4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string4;
        Long l4;
        Long l7;
        Long l8;
        String string5;
        String string6;
        String string7;
        int n4 = n3;
        int n7 = n3 & 1;
        Integer n8 = null;
        if (n7 != 0) {
            n7 = 0;
            string7 = null;
        } else {
            string7 = object;
        }
        int n10 = n4 & 2;
        if (n10 != 0) {
            n10 = 0;
            string6 = null;
        } else {
            string6 = string2;
        }
        int n14 = n4 & 4;
        if (n14 != 0) {
            n14 = 0;
            string5 = null;
        } else {
            string5 = string3;
        }
        int n15 = n4 & 8;
        if (n15 != 0) {
            n15 = 0;
            l8 = null;
        } else {
            l8 = object2;
        }
        int n16 = n4 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            l7 = null;
        } else {
            l7 = l2;
        }
        int n17 = n4 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            l4 = null;
        } else {
            l4 = l3;
        }
        int n18 = n4 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            string4 = null;
        } else {
            string4 = object3;
        }
        if ((n4 &= 0x80) == 0) {
            n8 = object4;
        }
        object = this;
        string2 = string7;
        string3 = string6;
        object2 = string5;
        l2 = l8;
        l3 = l7;
        object3 = l4;
        object4 = string4;
        this(string7, string6, string5, l8, l7, l4, string4, n8);
    }

    public static /* synthetic */ KYPImage copy$default(KYPImage kYPImage, String string2, String string3, String string4, Long l2, Long l3, Long l4, String string5, Integer n3, int n4, Object object) {
        KYPImage kYPImage2 = kYPImage;
        int n7 = n4;
        int n8 = n4 & 1;
        String string6 = n8 != 0 ? kYPImage.format : string2;
        int n10 = n7 & 2;
        String string7 = n10 != 0 ? kYPImage2.url : string3;
        int n14 = n7 & 4;
        String string8 = n14 != 0 ? kYPImage2.imageName : string4;
        int n15 = n7 & 8;
        Long l7 = n15 != 0 ? kYPImage2.kypSequence : l2;
        int n16 = n7 & 0x10;
        Long l8 = n16 != 0 ? kYPImage2.width : l3;
        int n17 = n7 & 0x20;
        Long l12 = n17 != 0 ? kYPImage2.height : l4;
        int n18 = n7 & 0x40;
        String string9 = n18 != 0 ? kYPImage2.imageType : string5;
        Integer n19 = (n7 &= 0x80) != 0 ? kYPImage2.galleryIndex : n3;
        string2 = string6;
        string3 = string7;
        string4 = string8;
        l2 = l7;
        l3 = l8;
        l4 = l12;
        string5 = string9;
        n3 = n19;
        return kYPImage.copy(string6, string7, string8, l7, l8, l12, string9, n19);
    }

    public final String component1() {
        return this.format;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.imageName;
    }

    public final Long component4() {
        return this.kypSequence;
    }

    public final Long component5() {
        return this.width;
    }

    public final Long component6() {
        return this.height;
    }

    public final String component7() {
        return this.imageType;
    }

    public final Integer component8() {
        return this.galleryIndex;
    }

    public final KYPImage copy(String string2, String string3, String string4, Long l2, Long l3, Long l4, String string5, Integer n3) {
        KYPImage kYPImage = new KYPImage(string2, string3, string4, l2, l3, l4, string5, n3);
        return kYPImage;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof KYPImage;
        if (!bl3) {
            return false;
        }
        object = (KYPImage)object;
        Object object2 = this.format;
        Object object3 = ((KYPImage)object).format;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.url;
        object3 = ((KYPImage)object).url;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageName;
        object3 = ((KYPImage)object).imageName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.kypSequence;
        object3 = ((KYPImage)object).kypSequence;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.width;
        object3 = ((KYPImage)object).width;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.height;
        object3 = ((KYPImage)object).height;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageType;
        object3 = ((KYPImage)object).imageType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.galleryIndex;
        object = ((KYPImage)object).galleryIndex;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Integer getGalleryIndex() {
        return this.galleryIndex;
    }

    public final Long getHeight() {
        return this.height;
    }

    public final String getImageName() {
        return this.imageName;
    }

    public final String getImageType() {
        return this.imageType;
    }

    public final Long getKypSequence() {
        return this.kypSequence;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Long getWidth() {
        return this.width;
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
        n4 *= 31;
        Object object = this.url;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.imageName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.kypSequence;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.width;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.height;
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
        object = this.galleryIndex;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setFormat(String string2) {
        this.format = string2;
    }

    public final void setGalleryIndex(Integer n3) {
        this.galleryIndex = n3;
    }

    public final void setHeight(Long l2) {
        this.height = l2;
    }

    public final void setImageName(String string2) {
        this.imageName = string2;
    }

    public final void setImageType(String string2) {
        this.imageType = string2;
    }

    public final void setKypSequence(Long l2) {
        this.kypSequence = l2;
    }

    public final void setUrl(String string2) {
        this.url = string2;
    }

    public final void setWidth(Long l2) {
        this.width = l2;
    }

    public String toString() {
        CharSequence charSequence = this.format;
        String string2 = this.url;
        String string3 = this.imageName;
        Long l2 = this.kypSequence;
        Long l3 = this.width;
        Long l4 = this.height;
        String string4 = this.imageType;
        Integer n3 = this.galleryIndex;
        charSequence = og_1.a("KYPImage(format=", (String)charSequence, ", url=", string2, ", imageName=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", kypSequence=");
        ((StringBuilder)charSequence).append(l2);
        ((StringBuilder)charSequence).append(", width=");
        ((StringBuilder)charSequence).append(l3);
        ((StringBuilder)charSequence).append(", height=");
        ((StringBuilder)charSequence).append(l4);
        ((StringBuilder)charSequence).append(", imageType=");
        ((StringBuilder)charSequence).append(string4);
        ((StringBuilder)charSequence).append(", galleryIndex=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

