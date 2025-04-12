/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product.fleek;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class PostsResponse$Component$Subcomponent$Media$Metadata
implements Serializable {
    private final String aspectRatio;
    private final boolean autoplay;
    private final int duration;
    private final double height;
    private final boolean mute;
    private final double size;
    private final double width;

    public PostsResponse$Component$Subcomponent$Media$Metadata(String string2, boolean bl2, int n3, double d2, boolean bl3, double d5, double d7) {
        Intrinsics.checkNotNullParameter(string2, "aspectRatio");
        this.aspectRatio = string2;
        this.autoplay = bl2;
        this.duration = n3;
        this.height = d2;
        this.mute = bl3;
        this.size = d5;
        this.width = d7;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ PostsResponse$Component$Subcomponent$Media$Metadata copy$default(PostsResponse$Component$Subcomponent$Media$Metadata postsResponse$Component$Subcomponent$Media$Metadata, String string2, boolean bl2, int n3, double d2, boolean bl3, double d5, double d7, int n4, Object object) {
        void var21_23;
        void var16_16;
        PostsResponse$Component$Subcomponent$Media$Metadata postsResponse$Component$Subcomponent$Media$Metadata2 = postsResponse$Component$Subcomponent$Media$Metadata;
        int n7 = n4 & 1;
        String string3 = n7 != 0 ? postsResponse$Component$Subcomponent$Media$Metadata.aspectRatio : string2;
        int bl4 = n4 & 2;
        if (bl4 != 0) {
            boolean bl5 = postsResponse$Component$Subcomponent$Media$Metadata2.autoplay;
        } else {
            boolean bl6 = bl2;
        }
        int n8 = n4 & 4;
        n8 = n8 != 0 ? postsResponse$Component$Subcomponent$Media$Metadata2.duration : n3;
        int n10 = n4 & 8;
        double d9 = n10 != 0 ? postsResponse$Component$Subcomponent$Media$Metadata2.height : d2;
        int n14 = n4 & 0x10;
        if (n14 != 0) {
            boolean bl7 = postsResponse$Component$Subcomponent$Media$Metadata2.mute;
        } else {
            boolean bl8 = bl3;
        }
        int n15 = n4 & 0x20;
        double d12 = n15 != 0 ? postsResponse$Component$Subcomponent$Media$Metadata2.size : d5;
        int n16 = n4 & 0x40;
        double d13 = n16 != 0 ? postsResponse$Component$Subcomponent$Media$Metadata2.width : d7;
        string2 = string3;
        bl2 = var16_16;
        n3 = n8;
        d2 = d9;
        bl3 = var21_23;
        d5 = d12;
        d7 = d13;
        return postsResponse$Component$Subcomponent$Media$Metadata.copy(string3, (boolean)var16_16, n8, d9, (boolean)var21_23, d12, d13);
    }

    public final String component1() {
        return this.aspectRatio;
    }

    public final boolean component2() {
        return this.autoplay;
    }

    public final int component3() {
        return this.duration;
    }

    public final double component4() {
        return this.height;
    }

    public final boolean component5() {
        return this.mute;
    }

    public final double component6() {
        return this.size;
    }

    public final double component7() {
        return this.width;
    }

    public final PostsResponse$Component$Subcomponent$Media$Metadata copy(String string2, boolean bl2, int n3, double d2, boolean bl3, double d5, double d7) {
        Intrinsics.checkNotNullParameter(string2, "aspectRatio");
        PostsResponse$Component$Subcomponent$Media$Metadata postsResponse$Component$Subcomponent$Media$Metadata = new PostsResponse$Component$Subcomponent$Media$Metadata(string2, bl2, n3, d2, bl3, d5, d7);
        return postsResponse$Component$Subcomponent$Media$Metadata;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof PostsResponse$Component$Subcomponent$Media$Metadata;
        if (n3 == 0) {
            return false;
        }
        object = (PostsResponse$Component$Subcomponent$Media$Metadata)object;
        String string2 = this.aspectRatio;
        String string3 = ((PostsResponse$Component$Subcomponent$Media$Metadata)object).aspectRatio;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.autoplay;
        int n4 = ((PostsResponse$Component$Subcomponent$Media$Metadata)object).autoplay;
        if (n3 != n4) {
            return false;
        }
        n3 = this.duration;
        n4 = ((PostsResponse$Component$Subcomponent$Media$Metadata)object).duration;
        if (n3 != n4) {
            return false;
        }
        double d2 = this.height;
        double d5 = ((PostsResponse$Component$Subcomponent$Media$Metadata)object).height;
        n3 = Double.compare(d2, d5);
        if (n3 != 0) {
            return false;
        }
        n3 = (int)(this.mute ? 1 : 0);
        n4 = (int)(((PostsResponse$Component$Subcomponent$Media$Metadata)object).mute ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        d2 = this.size;
        d5 = ((PostsResponse$Component$Subcomponent$Media$Metadata)object).size;
        n3 = Double.compare(d2, d5);
        if (n3 != 0) {
            return false;
        }
        d2 = this.width;
        d5 = ((PostsResponse$Component$Subcomponent$Media$Metadata)object).width;
        int n7 = Double.compare(d2, d5);
        if (n7 != 0) {
            return false;
        }
        return bl2;
    }

    public final String getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getAutoplay() {
        return this.autoplay;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final double getHeight() {
        return this.height;
    }

    public final boolean getMute() {
        return this.mute;
    }

    public final double getSize() {
        return this.size;
    }

    public final double getWidth() {
        return this.width;
    }

    public int hashCode() {
        String string2 = this.aspectRatio;
        int n3 = string2.hashCode() * 31;
        int n4 = this.autoplay;
        int n7 = 1237;
        int n8 = 1231;
        n4 = n4 != 0 ? 1231 : 1237;
        n3 = (n3 + n4) * 31;
        n4 = this.duration;
        n3 = (n3 + n4) * 31;
        double d2 = this.height;
        long l2 = Double.doubleToLongBits(d2);
        n4 = 32;
        long l3 = l2 >>> n4;
        int n10 = (int)(l2 ^= l3);
        n3 = (n3 + n10) * 31;
        boolean bl2 = this.mute;
        if (bl2) {
            n7 = 1231;
        }
        n3 = (n3 + n7) * 31;
        long l4 = Double.doubleToLongBits(this.size);
        l2 = l4 >>> n4;
        n8 = (int)(l4 ^ l2);
        n3 = (n3 + n8) * 31;
        l4 = Double.doubleToLongBits(this.width);
        l2 = l4 >>> n4;
        n7 = (int)(l4 ^ l2);
        return n3 + n7;
    }

    public String toString() {
        String string2 = this.aspectRatio;
        boolean bl2 = this.autoplay;
        int n3 = this.duration;
        double d2 = this.height;
        boolean bl3 = this.mute;
        double d5 = this.size;
        double d7 = this.width;
        StringBuilder stringBuilder = new StringBuilder("Metadata(aspectRatio=");
        stringBuilder.append(string2);
        stringBuilder.append(", autoplay=");
        stringBuilder.append(bl2);
        stringBuilder.append(", duration=");
        stringBuilder.append(n3);
        stringBuilder.append(", height=");
        stringBuilder.append(d2);
        stringBuilder.append(", mute=");
        stringBuilder.append(bl3);
        stringBuilder.append(", size=");
        stringBuilder.append(d5);
        stringBuilder.append(", width=");
        stringBuilder.append(d7);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

