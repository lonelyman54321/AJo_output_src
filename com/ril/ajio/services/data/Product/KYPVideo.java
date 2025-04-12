/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import com.ril.ajio.services.data.Product.KYPImage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class KYPVideo {
    private String codec;
    private String format;
    private Long height;
    private Long kypSequence;
    private KYPImage thumbnail;
    private String url;
    private String videoName;
    private Long width;

    public KYPVideo() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public KYPVideo(String string2, String string3, String string4, String string5, Long l2, KYPImage kYPImage, Long l3, Long l4) {
        this.codec = string2;
        this.format = string3;
        this.url = string4;
        this.videoName = string5;
        this.kypSequence = l2;
        this.thumbnail = kYPImage;
        this.width = l3;
        this.height = l4;
    }

    public /* synthetic */ KYPVideo(String object, String string2, String string3, String string4, Long object2, KYPImage object3, Long object4, Long l2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        Long l3;
        KYPImage kYPImage;
        Long l4;
        String string5;
        String string6;
        String string7;
        String string8;
        int n4 = n3;
        int n7 = n3 & 1;
        Long l7 = null;
        if (n7 != 0) {
            n7 = 0;
            string8 = null;
        } else {
            string8 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string7 = null;
        } else {
            string7 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string6 = null;
        } else {
            string6 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string5 = null;
        } else {
            string5 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            l4 = null;
        } else {
            l4 = object2;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            kYPImage = null;
        } else {
            kYPImage = object3;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            l3 = null;
        } else {
            l3 = object4;
        }
        if ((n4 &= 0x80) == 0) {
            l7 = l2;
        }
        object = this;
        string2 = string8;
        string3 = string7;
        string4 = string6;
        object2 = string5;
        object3 = l4;
        object4 = kYPImage;
        l2 = l3;
        this(string8, string7, string6, string5, l4, kYPImage, l3, l7);
    }

    public static /* synthetic */ KYPVideo copy$default(KYPVideo kYPVideo, String string2, String string3, String string4, String string5, Long l2, KYPImage kYPImage, Long l3, Long l4, int n3, Object object) {
        KYPVideo kYPVideo2 = kYPVideo;
        int n4 = n3;
        int n7 = n3 & 1;
        String string6 = n7 != 0 ? kYPVideo.codec : string2;
        int n8 = n4 & 2;
        String string7 = n8 != 0 ? kYPVideo2.format : string3;
        int n10 = n4 & 4;
        String string8 = n10 != 0 ? kYPVideo2.url : string4;
        int n14 = n4 & 8;
        String string9 = n14 != 0 ? kYPVideo2.videoName : string5;
        int n15 = n4 & 0x10;
        Long l7 = n15 != 0 ? kYPVideo2.kypSequence : l2;
        int n16 = n4 & 0x20;
        KYPImage kYPImage2 = n16 != 0 ? kYPVideo2.thumbnail : kYPImage;
        int n17 = n4 & 0x40;
        Long l8 = n17 != 0 ? kYPVideo2.width : l3;
        Long l12 = (n4 &= 0x80) != 0 ? kYPVideo2.height : l4;
        string2 = string6;
        string3 = string7;
        string4 = string8;
        string5 = string9;
        l2 = l7;
        kYPImage = kYPImage2;
        l3 = l8;
        l4 = l12;
        return kYPVideo.copy(string6, string7, string8, string9, l7, kYPImage2, l8, l12);
    }

    public final String component1() {
        return this.codec;
    }

    public final String component2() {
        return this.format;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.videoName;
    }

    public final Long component5() {
        return this.kypSequence;
    }

    public final KYPImage component6() {
        return this.thumbnail;
    }

    public final Long component7() {
        return this.width;
    }

    public final Long component8() {
        return this.height;
    }

    public final KYPVideo copy(String string2, String string3, String string4, String string5, Long l2, KYPImage kYPImage, Long l3, Long l4) {
        KYPVideo kYPVideo = new KYPVideo(string2, string3, string4, string5, l2, kYPImage, l3, l4);
        return kYPVideo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof KYPVideo;
        if (!bl3) {
            return false;
        }
        object = (KYPVideo)object;
        Object object2 = this.codec;
        Object object3 = ((KYPVideo)object).codec;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.format;
        object3 = ((KYPVideo)object).format;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.url;
        object3 = ((KYPVideo)object).url;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.videoName;
        object3 = ((KYPVideo)object).videoName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.kypSequence;
        object3 = ((KYPVideo)object).kypSequence;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.thumbnail;
        object3 = ((KYPVideo)object).thumbnail;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.width;
        object3 = ((KYPVideo)object).width;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.height;
        object = ((KYPVideo)object).height;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCodec() {
        return this.codec;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Long getHeight() {
        return this.height;
    }

    public final Long getKypSequence() {
        return this.kypSequence;
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
        String string2 = this.codec;
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
        object = this.url;
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
        object = this.kypSequence;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
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

    public final void setFormat(String string2) {
        this.format = string2;
    }

    public final void setHeight(Long l2) {
        this.height = l2;
    }

    public final void setKypSequence(Long l2) {
        this.kypSequence = l2;
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
        CharSequence charSequence = this.codec;
        String string2 = this.format;
        String string3 = this.url;
        String string4 = this.videoName;
        Long l2 = this.kypSequence;
        KYPImage kYPImage = this.thumbnail;
        Long l3 = this.width;
        Long l4 = this.height;
        charSequence = og_1.a("KYPVideo(codec=", (String)charSequence, ", format=", string2, ", url=");
        X50.a((StringBuilder)charSequence, string3, ", videoName=", string4, ", kypSequence=");
        ((StringBuilder)charSequence).append(l2);
        ((StringBuilder)charSequence).append(", thumbnail=");
        ((StringBuilder)charSequence).append(kYPImage);
        ((StringBuilder)charSequence).append(", width=");
        ((StringBuilder)charSequence).append(l3);
        ((StringBuilder)charSequence).append(", height=");
        ((StringBuilder)charSequence).append(l4);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

