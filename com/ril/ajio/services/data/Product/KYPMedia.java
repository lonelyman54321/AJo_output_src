/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import com.ril.ajio.services.data.Product.KYPImage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class KYPMedia {
    private String codec;
    private String dimention;
    private String format;
    private Long height;
    private String imageName;
    private Long kypSequence;
    private Integer mediaType;
    private KYPImage thumbnail;
    private String url;
    private String videoName;
    private Long width;

    public KYPMedia() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public KYPMedia(String string2, String string3, String string4, Long l2, String string5, String string6, KYPImage kYPImage, String string7, Integer n3, Long l3, Long l4) {
        this.format = string2;
        this.url = string3;
        this.imageName = string4;
        this.kypSequence = l2;
        this.codec = string5;
        this.videoName = string6;
        this.thumbnail = kYPImage;
        this.dimention = string7;
        this.mediaType = n3;
        this.width = l3;
        this.height = l4;
    }

    public /* synthetic */ KYPMedia(String object, String string2, String string3, Long object2, String object3, String string4, KYPImage object4, String object5, Integer object6, Long number, Long l2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        Long l3;
        Integer n4;
        String string5;
        KYPImage kYPImage;
        String string6;
        String string7;
        Long l4;
        String string8;
        String string9;
        String string10;
        int n7 = n3;
        int n8 = n3 & 1;
        Long l7 = null;
        if (n8 != 0) {
            n8 = 0;
            string10 = null;
        } else {
            string10 = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            string9 = null;
        } else {
            string9 = string2;
        }
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            string8 = null;
        } else {
            string8 = string3;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            l4 = null;
        } else {
            l4 = object2;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            string7 = null;
        } else {
            string7 = object3;
        }
        int n17 = n7 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            string6 = null;
        } else {
            string6 = string4;
        }
        int n18 = n7 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            kYPImage = null;
        } else {
            kYPImage = object4;
        }
        int n19 = n7 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            string5 = null;
        } else {
            string5 = object5;
        }
        int n20 = n7 & 0x100;
        if (n20 != 0) {
            n20 = 0;
            n4 = null;
        } else {
            n4 = object6;
        }
        int n21 = n7 & 0x200;
        if (n21 != 0) {
            n21 = 0;
            l3 = null;
        } else {
            l3 = number;
        }
        if ((n7 &= 0x400) == 0) {
            l7 = l2;
        }
        object = this;
        string2 = string10;
        string3 = string9;
        object2 = string8;
        object3 = l4;
        string4 = string7;
        object4 = string6;
        object5 = kYPImage;
        object6 = string5;
        number = n4;
        l2 = l3;
        this(string10, string9, string8, l4, string7, string6, kYPImage, string5, n4, l3, l7);
    }

    public static /* synthetic */ KYPMedia copy$default(KYPMedia kYPMedia, String string2, String string3, String string4, Long l2, String string5, String string6, KYPImage kYPImage, String string7, Integer n3, Long l3, Long l4, int n4, Object object) {
        KYPMedia kYPMedia2 = kYPMedia;
        int n7 = n4;
        int n8 = n4 & 1;
        String string8 = n8 != 0 ? kYPMedia.format : string2;
        int n10 = n7 & 2;
        String string9 = n10 != 0 ? kYPMedia2.url : string3;
        int n14 = n7 & 4;
        String string10 = n14 != 0 ? kYPMedia2.imageName : string4;
        int n15 = n7 & 8;
        Long l7 = n15 != 0 ? kYPMedia2.kypSequence : l2;
        int n16 = n7 & 0x10;
        String string11 = n16 != 0 ? kYPMedia2.codec : string5;
        int n17 = n7 & 0x20;
        String string12 = n17 != 0 ? kYPMedia2.videoName : string6;
        int n18 = n7 & 0x40;
        KYPImage kYPImage2 = n18 != 0 ? kYPMedia2.thumbnail : kYPImage;
        int n19 = n7 & 0x80;
        String string13 = n19 != 0 ? kYPMedia2.dimention : string7;
        int n20 = n7 & 0x100;
        Integer n21 = n20 != 0 ? kYPMedia2.mediaType : n3;
        int n22 = n7 & 0x200;
        Long l8 = n22 != 0 ? kYPMedia2.width : l3;
        Long l12 = (n7 &= 0x400) != 0 ? kYPMedia2.height : l4;
        string2 = string8;
        string3 = string9;
        string4 = string10;
        l2 = l7;
        string5 = string11;
        string6 = string12;
        kYPImage = kYPImage2;
        string7 = string13;
        n3 = n21;
        l3 = l8;
        l4 = l12;
        return kYPMedia.copy(string8, string9, string10, l7, string11, string12, kYPImage2, string13, n21, l8, l12);
    }

    public final String component1() {
        return this.format;
    }

    public final Long component10() {
        return this.width;
    }

    public final Long component11() {
        return this.height;
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

    public final String component5() {
        return this.codec;
    }

    public final String component6() {
        return this.videoName;
    }

    public final KYPImage component7() {
        return this.thumbnail;
    }

    public final String component8() {
        return this.dimention;
    }

    public final Integer component9() {
        return this.mediaType;
    }

    public final KYPMedia copy(String string2, String string3, String string4, Long l2, String string5, String string6, KYPImage kYPImage, String string7, Integer n3, Long l3, Long l4) {
        KYPMedia kYPMedia = new KYPMedia(string2, string3, string4, l2, string5, string6, kYPImage, string7, n3, l3, l4);
        return kYPMedia;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof KYPMedia;
        if (!bl3) {
            return false;
        }
        object = (KYPMedia)object;
        Object object2 = this.format;
        Object object3 = ((KYPMedia)object).format;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.url;
        object3 = ((KYPMedia)object).url;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageName;
        object3 = ((KYPMedia)object).imageName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.kypSequence;
        object3 = ((KYPMedia)object).kypSequence;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.codec;
        object3 = ((KYPMedia)object).codec;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.videoName;
        object3 = ((KYPMedia)object).videoName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.thumbnail;
        object3 = ((KYPMedia)object).thumbnail;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.dimention;
        object3 = ((KYPMedia)object).dimention;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.mediaType;
        object3 = ((KYPMedia)object).mediaType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.width;
        object3 = ((KYPMedia)object).width;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.height;
        object = ((KYPMedia)object).height;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCodec() {
        return this.codec;
    }

    public final String getDimention() {
        return this.dimention;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Long getHeight() {
        return this.height;
    }

    public final String getImageName() {
        return this.imageName;
    }

    public final Long getKypSequence() {
        return this.kypSequence;
    }

    public final Integer getMediaType() {
        return this.mediaType;
    }

    public final KYPImage getThumbnail() {
        return this.thumbnail;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVideoName() {
        return this.videoName;
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
        object = this.codec;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.videoName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.thumbnail;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((KYPImage)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.dimention;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.mediaType;
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
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setCodec(String string2) {
        this.codec = string2;
    }

    public final void setDimention(String string2) {
        this.dimention = string2;
    }

    public final void setFormat(String string2) {
        this.format = string2;
    }

    public final void setHeight(Long l2) {
        this.height = l2;
    }

    public final void setImageName(String string2) {
        this.imageName = string2;
    }

    public final void setKypSequence(Long l2) {
        this.kypSequence = l2;
    }

    public final void setMediaType(Integer n3) {
        this.mediaType = n3;
    }

    public final void setThumbnail(KYPImage kYPImage) {
        this.thumbnail = kYPImage;
    }

    public final void setUrl(String string2) {
        this.url = string2;
    }

    public final void setVideoName(String string2) {
        this.videoName = string2;
    }

    public final void setWidth(Long l2) {
        this.width = l2;
    }

    public String toString() {
        CharSequence charSequence = this.format;
        String string2 = this.url;
        String string3 = this.imageName;
        Long l2 = this.kypSequence;
        String string4 = this.codec;
        String string5 = this.videoName;
        KYPImage kYPImage = this.thumbnail;
        String string6 = this.dimention;
        Integer n3 = this.mediaType;
        Long l3 = this.width;
        Long l4 = this.height;
        charSequence = og_1.a("KYPMedia(format=", (String)charSequence, ", url=", string2, ", imageName=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", kypSequence=");
        ((StringBuilder)charSequence).append(l2);
        ((StringBuilder)charSequence).append(", codec=");
        X50.a((StringBuilder)charSequence, string4, ", videoName=", string5, ", thumbnail=");
        ((StringBuilder)charSequence).append(kYPImage);
        ((StringBuilder)charSequence).append(", dimention=");
        ((StringBuilder)charSequence).append(string6);
        ((StringBuilder)charSequence).append(", mediaType=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(", width=");
        ((StringBuilder)charSequence).append(l3);
        ((StringBuilder)charSequence).append(", height=");
        ((StringBuilder)charSequence).append(l4);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

