/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class Thumbnail
implements Serializable {
    private final String format;
    private final long galleryIndex;
    private final long height;
    private final String imageType;
    private final long kypSequence;
    private final String url;
    private final long width;

    public Thumbnail(String string2, long l2, String string3, String string4, long l3, long l4, long l7) {
        Intrinsics.checkNotNullParameter(string2, "format");
        Intrinsics.checkNotNullParameter(string3, "imageType");
        Intrinsics.checkNotNullParameter(string4, "url");
        this.format = string2;
        this.galleryIndex = l2;
        this.imageType = string3;
        this.url = string4;
        this.width = l3;
        this.height = l4;
        this.kypSequence = l7;
    }

    public static /* synthetic */ Thumbnail copy$default(Thumbnail thumbnail, String string2, long l2, String string3, String string4, long l3, long l4, long l7, int n3, Object object) {
        Thumbnail thumbnail2 = thumbnail;
        int n4 = n3 & 1;
        String string5 = n4 != 0 ? thumbnail.format : string2;
        int n7 = n3 & 2;
        long l8 = n7 != 0 ? thumbnail2.galleryIndex : l2;
        int n8 = n3 & 4;
        String string6 = n8 != 0 ? thumbnail2.imageType : string3;
        int n10 = n3 & 8;
        String string7 = n10 != 0 ? thumbnail2.url : string4;
        int n14 = n3 & 0x10;
        long l12 = n14 != 0 ? thumbnail2.width : l3;
        int n15 = n3 & 0x20;
        long l14 = n15 != 0 ? thumbnail2.height : l4;
        int n16 = n3 & 0x40;
        long l15 = n16 != 0 ? thumbnail2.kypSequence : l7;
        string2 = string5;
        l2 = l8;
        string3 = string6;
        string4 = string7;
        l3 = l12;
        l4 = l14;
        l7 = l15;
        return thumbnail.copy(string5, l8, string6, string7, l12, l14, l15);
    }

    public final String component1() {
        return this.format;
    }

    public final long component2() {
        return this.galleryIndex;
    }

    public final String component3() {
        return this.imageType;
    }

    public final String component4() {
        return this.url;
    }

    public final long component5() {
        return this.width;
    }

    public final long component6() {
        return this.height;
    }

    public final long component7() {
        return this.kypSequence;
    }

    public final Thumbnail copy(String string2, long l2, String string3, String string4, long l3, long l4, long l7) {
        Intrinsics.checkNotNullParameter(string2, "format");
        Intrinsics.checkNotNullParameter(string3, "imageType");
        Intrinsics.checkNotNullParameter(string4, "url");
        Thumbnail thumbnail = new Thumbnail(string2, l2, string3, string4, l3, l4, l7);
        return thumbnail;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof Thumbnail;
        if (!object2) {
            return false;
        }
        object = (Thumbnail)object;
        String string2 = this.format;
        String string3 = ((Thumbnail)object).format;
        object2 = Intrinsics.areEqual(string2, string3);
        if (!object2) {
            return false;
        }
        long l2 = this.galleryIndex;
        long l3 = ((Thumbnail)object).galleryIndex;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        string2 = this.imageType;
        string3 = ((Thumbnail)object).imageType;
        object2 = Intrinsics.areEqual(string2, string3);
        if (!object2) {
            return false;
        }
        string2 = this.url;
        string3 = ((Thumbnail)object).url;
        object2 = Intrinsics.areEqual(string2, string3);
        if (!object2) {
            return false;
        }
        l2 = this.width;
        l3 = ((Thumbnail)object).width;
        long l7 = l2 - l3;
        object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        l2 = this.height;
        l3 = ((Thumbnail)object).height;
        long l8 = l2 - l3;
        object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        l2 = this.kypSequence;
        l3 = ((Thumbnail)object).kypSequence;
        long l12 = l2 - l3;
        Object object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object3 != false) {
            return false;
        }
        return bl2;
    }

    public final String getFormat() {
        return this.format;
    }

    public final long getGalleryIndex() {
        return this.galleryIndex;
    }

    public final long getHeight() {
        return this.height;
    }

    public final String getImageType() {
        return this.imageType;
    }

    public final long getKypSequence() {
        return this.kypSequence;
    }

    public final String getUrl() {
        return this.url;
    }

    public final long getWidth() {
        return this.width;
    }

    public int hashCode() {
        int n3 = this.format.hashCode();
        int n4 = 31;
        n3 *= 31;
        long l2 = this.galleryIndex;
        int n7 = 32;
        long l3 = l2 >>> n7;
        int n8 = (int)(l2 ^ l3);
        n3 = (n3 + n8) * 31;
        String string2 = this.imageType;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.url;
        n3 = zy_2.b(n3, n4, string2);
        l2 = this.width;
        l3 = l2 >>> n7;
        n8 = (int)(l2 ^ l3);
        n3 = (n3 + n8) * 31;
        l2 = this.height;
        l3 = l2 >>> n7;
        n8 = (int)(l2 ^ l3);
        n3 = (n3 + n8) * 31;
        long l4 = this.kypSequence;
        long l7 = l4 >>> n7;
        int n10 = (int)(l4 ^ l7);
        return n3 + n10;
    }

    public String toString() {
        String string2 = this.format;
        long l2 = this.galleryIndex;
        String string3 = this.imageType;
        String string4 = this.url;
        long l3 = this.width;
        long l4 = this.height;
        long l7 = this.kypSequence;
        StringBuilder stringBuilder = new StringBuilder("Thumbnail(format=");
        stringBuilder.append(string2);
        stringBuilder.append(", galleryIndex=");
        stringBuilder.append(l2);
        X50.a(stringBuilder, ", imageType=", string3, ", url=", string4);
        fn0_2.b(stringBuilder, ", width=", l3, ", height=");
        stringBuilder.append(l4);
        stringBuilder.append(", kypSequence=");
        stringBuilder.append(l7);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

