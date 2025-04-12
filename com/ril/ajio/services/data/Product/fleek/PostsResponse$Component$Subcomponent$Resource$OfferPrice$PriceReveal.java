/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product.fleek;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal
implements Serializable {
    private final String bestPrice;
    private final String discountPercent;

    public PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "bestPrice");
        Intrinsics.checkNotNullParameter(string3, "discountPercent");
        this.bestPrice = string2;
        this.discountPercent = string3;
    }

    public static /* synthetic */ PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal copy$default(PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal postsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = postsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal.bestPrice;
        }
        if ((n3 &= 2) != 0) {
            string3 = postsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal.discountPercent;
        }
        return postsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal.copy(string2, string3);
    }

    public final String component1() {
        return this.bestPrice;
    }

    public final String component2() {
        return this.discountPercent;
    }

    public final PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal copy(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "bestPrice");
        Intrinsics.checkNotNullParameter(string3, "discountPercent");
        PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal postsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal = new PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal(string2, string3);
        return postsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal;
        if (!bl3) {
            return false;
        }
        object = (PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal)object;
        String string2 = this.bestPrice;
        String string3 = ((PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal)object).bestPrice;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.discountPercent;
        object = ((PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal)object).discountPercent;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBestPrice() {
        return this.bestPrice;
    }

    public final String getDiscountPercent() {
        return this.discountPercent;
    }

    public int hashCode() {
        int n3 = this.bestPrice.hashCode() * 31;
        return this.discountPercent.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.bestPrice;
        String string3 = this.discountPercent;
        return uc0_0.a("PriceReveal(bestPrice=", string2, ", discountPercent=", string3, ")");
    }
}

