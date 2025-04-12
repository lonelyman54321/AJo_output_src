/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import com.ril.ajio.services.data.Product.Thumbnail;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class Video
implements Serializable {
    private final String codec;
    private final String format;
    private final long height;
    private final long kypSequence;
    private final Thumbnail thumbnail;
    private final String url;
    private final String videoName;
    private final long width;

    public Video(String string2, String string3, String string4, String string5, long l2, long l3, long l4, Thumbnail thumbnail) {
        Intrinsics.checkNotNullParameter(string2, "codec");
        Intrinsics.checkNotNullParameter(string3, "format");
        Intrinsics.checkNotNullParameter(string4, "url");
        Intrinsics.checkNotNullParameter(string5, "videoName");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        this.codec = string2;
        this.format = string3;
        this.url = string4;
        this.videoName = string5;
        this.kypSequence = l2;
        this.height = l3;
        this.width = l4;
        this.thumbnail = thumbnail;
    }

    public static /* synthetic */ Video copy$default(Video video, String string2, String string3, String string4, String string5, long l2, long l3, long l4, Thumbnail thumbnail, int n3, Object object) {
        Video video2 = video;
        int n4 = n3;
        int n7 = n3 & 1;
        String string6 = n7 != 0 ? video.codec : string2;
        int n8 = n4 & 2;
        String string7 = n8 != 0 ? video2.format : string3;
        int n10 = n4 & 4;
        String string8 = n10 != 0 ? video2.url : string4;
        int n14 = n4 & 8;
        String string9 = n14 != 0 ? video2.videoName : string5;
        int n15 = n4 & 0x10;
        long l7 = n15 != 0 ? video2.kypSequence : l2;
        int n16 = n4 & 0x20;
        long l8 = n16 != 0 ? video2.height : l3;
        int n17 = n4 & 0x40;
        long l12 = n17 != 0 ? video2.width : l4;
        Thumbnail thumbnail2 = (n4 &= 0x80) != 0 ? video2.thumbnail : thumbnail;
        string2 = string6;
        string3 = string7;
        string4 = string8;
        string5 = string9;
        l2 = l7;
        l3 = l8;
        l4 = l12;
        thumbnail = thumbnail2;
        return video.copy(string6, string7, string8, string9, l7, l8, l12, thumbnail2);
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

    public final long component5() {
        return this.kypSequence;
    }

    public final long component6() {
        return this.height;
    }

    public final long component7() {
        return this.width;
    }

    public final Thumbnail component8() {
        return this.thumbnail;
    }

    public final Video copy(String string2, String string3, String string4, String string5, long l2, long l3, long l4, Thumbnail thumbnail) {
        Intrinsics.checkNotNullParameter(string2, "codec");
        Intrinsics.checkNotNullParameter(string3, "format");
        Intrinsics.checkNotNullParameter(string4, "url");
        Intrinsics.checkNotNullParameter(string5, "videoName");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        Video video = new Video(string2, string3, string4, string5, l2, l3, l4, thumbnail);
        return video;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof Video;
        if (!object2) {
            return false;
        }
        object = (Video)object;
        Object object3 = this.codec;
        String string2 = ((Video)object).codec;
        object2 = Intrinsics.areEqual(object3, string2);
        if (!object2) {
            return false;
        }
        object3 = this.format;
        string2 = ((Video)object).format;
        object2 = Intrinsics.areEqual(object3, string2);
        if (!object2) {
            return false;
        }
        object3 = this.url;
        string2 = ((Video)object).url;
        object2 = Intrinsics.areEqual(object3, string2);
        if (!object2) {
            return false;
        }
        object3 = this.videoName;
        string2 = ((Video)object).videoName;
        object2 = Intrinsics.areEqual(object3, string2);
        if (!object2) {
            return false;
        }
        long l2 = this.kypSequence;
        long l3 = ((Video)object).kypSequence;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        l2 = this.height;
        l3 = ((Video)object).height;
        long l7 = l2 - l3;
        object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        l2 = this.width;
        l3 = ((Video)object).width;
        long l8 = l2 - l3;
        object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        object3 = this.thumbnail;
        object = ((Video)object).thumbnail;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
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

    public final long getHeight() {
        return this.height;
    }

    public final long getKypSequence() {
        return this.kypSequence;
    }

    public final Thumbnail getThumbnail() {
        return this.thumbnail;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVideoName() {
        return this.videoName;
    }

    public final long getWidth() {
        return this.width;
    }

    public int hashCode() {
        int n3 = this.codec.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.format;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.url;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.videoName;
        n3 = zy_2.b(n3, n4, string2);
        long l2 = this.kypSequence;
        int n7 = 32;
        long l3 = l2 >>> n7;
        int n8 = (int)(l2 ^ l3);
        n3 = (n3 + n8) * 31;
        l2 = this.height;
        l3 = l2 >>> n7;
        n8 = (int)(l2 ^ l3);
        n3 = (n3 + n8) * 31;
        l2 = this.width;
        long l4 = l2 >>> n7;
        n8 = (int)(l2 ^ l4);
        n3 = (n3 + n8) * 31;
        return this.thumbnail.hashCode() + n3;
    }

    public String toString() {
        CharSequence charSequence = this.codec;
        String string2 = this.format;
        String string3 = this.url;
        String string4 = this.videoName;
        long l2 = this.kypSequence;
        long l3 = this.height;
        long l4 = this.width;
        Thumbnail thumbnail = this.thumbnail;
        charSequence = og_1.a("Video(codec=", (String)charSequence, ", format=", string2, ", url=");
        X50.a((StringBuilder)charSequence, string3, ", videoName=", string4, ", kypSequence=");
        ((StringBuilder)charSequence).append(l2);
        fn0_2.b((StringBuilder)charSequence, ", height=", l3, ", width=");
        ((StringBuilder)charSequence).append(l4);
        ((StringBuilder)charSequence).append(", thumbnail=");
        ((StringBuilder)charSequence).append(thumbnail);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

