/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product.fleek;

import java.io.Serializable;

public final class PostsResponse$Component$Subcomponent$PriceRevealMetaInfo
implements Serializable {
    private final int saleEndTime;
    private final int saleStartTime;

    public PostsResponse$Component$Subcomponent$PriceRevealMetaInfo(int n3, int n4) {
        this.saleEndTime = n3;
        this.saleStartTime = n4;
    }

    public static /* synthetic */ PostsResponse$Component$Subcomponent$PriceRevealMetaInfo copy$default(PostsResponse$Component$Subcomponent$PriceRevealMetaInfo postsResponse$Component$Subcomponent$PriceRevealMetaInfo, int n3, int n4, int n7, Object object) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            n3 = postsResponse$Component$Subcomponent$PriceRevealMetaInfo.saleEndTime;
        }
        if ((n7 &= 2) != 0) {
            n4 = postsResponse$Component$Subcomponent$PriceRevealMetaInfo.saleStartTime;
        }
        return postsResponse$Component$Subcomponent$PriceRevealMetaInfo.copy(n3, n4);
    }

    public final int component1() {
        return this.saleEndTime;
    }

    public final int component2() {
        return this.saleStartTime;
    }

    public final PostsResponse$Component$Subcomponent$PriceRevealMetaInfo copy(int n3, int n4) {
        PostsResponse$Component$Subcomponent$PriceRevealMetaInfo postsResponse$Component$Subcomponent$PriceRevealMetaInfo = new PostsResponse$Component$Subcomponent$PriceRevealMetaInfo(n3, n4);
        return postsResponse$Component$Subcomponent$PriceRevealMetaInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof PostsResponse$Component$Subcomponent$PriceRevealMetaInfo;
        if (n3 == 0) {
            return false;
        }
        object = (PostsResponse$Component$Subcomponent$PriceRevealMetaInfo)object;
        n3 = this.saleEndTime;
        int n4 = ((PostsResponse$Component$Subcomponent$PriceRevealMetaInfo)object).saleEndTime;
        if (n3 != n4) {
            return false;
        }
        n3 = this.saleStartTime;
        int n7 = ((PostsResponse$Component$Subcomponent$PriceRevealMetaInfo)object).saleStartTime;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int getSaleEndTime() {
        return this.saleEndTime;
    }

    public final int getSaleStartTime() {
        return this.saleStartTime;
    }

    public int hashCode() {
        int n3 = this.saleEndTime * 31;
        int n4 = this.saleStartTime;
        return n3 + n4;
    }

    public String toString() {
        int n3 = this.saleEndTime;
        int n4 = this.saleStartTime;
        return z41.a("PriceRevealMetaInfo(saleEndTime=", ", saleStartTime=", ")", n3, n4);
    }
}

