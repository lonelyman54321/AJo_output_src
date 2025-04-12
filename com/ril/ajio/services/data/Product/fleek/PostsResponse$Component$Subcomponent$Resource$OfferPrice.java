/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product.fleek;

import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class PostsResponse$Component$Subcomponent$Resource$OfferPrice
implements Serializable {
    private final String currencyIso;
    private final String displayformattedValue;
    private final String formattedValue;
    private final PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal priceReveal;
    private final String value;

    public PostsResponse$Component$Subcomponent$Resource$OfferPrice(String string2, String string3, String string4, PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal postsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal, String string5) {
        Intrinsics.checkNotNullParameter(string2, "currencyIso");
        Intrinsics.checkNotNullParameter(string3, "displayformattedValue");
        Intrinsics.checkNotNullParameter(string4, "formattedValue");
        Intrinsics.checkNotNullParameter(postsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal, "priceReveal");
        Intrinsics.checkNotNullParameter(string5, "value");
        this.currencyIso = string2;
        this.displayformattedValue = string3;
        this.formattedValue = string4;
        this.priceReveal = postsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal;
        this.value = string5;
    }

    public static /* synthetic */ PostsResponse$Component$Subcomponent$Resource$OfferPrice copy$default(PostsResponse$Component$Subcomponent$Resource$OfferPrice postsResponse$Component$Subcomponent$Resource$OfferPrice, String string2, String object, String string3, PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal object2, String string4, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = postsResponse$Component$Subcomponent$Resource$OfferPrice.currencyIso;
        }
        if ((n4 = n3 & 2) != 0) {
            object = postsResponse$Component$Subcomponent$Resource$OfferPrice.displayformattedValue;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = postsResponse$Component$Subcomponent$Resource$OfferPrice.formattedValue;
        }
        String string5 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = postsResponse$Component$Subcomponent$Resource$OfferPrice.priceReveal;
        }
        PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal postsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = postsResponse$Component$Subcomponent$Resource$OfferPrice.value;
        }
        String string6 = string4;
        object = postsResponse$Component$Subcomponent$Resource$OfferPrice;
        string3 = string2;
        object2 = object3;
        string4 = string5;
        object3 = string6;
        return postsResponse$Component$Subcomponent$Resource$OfferPrice.copy(string2, (String)object2, string5, postsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal, string6);
    }

    public final String component1() {
        return this.currencyIso;
    }

    public final String component2() {
        return this.displayformattedValue;
    }

    public final String component3() {
        return this.formattedValue;
    }

    public final PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal component4() {
        return this.priceReveal;
    }

    public final String component5() {
        return this.value;
    }

    public final PostsResponse$Component$Subcomponent$Resource$OfferPrice copy(String string2, String string3, String string4, PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal postsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal, String string5) {
        Intrinsics.checkNotNullParameter(string2, "currencyIso");
        Intrinsics.checkNotNullParameter(string3, "displayformattedValue");
        Intrinsics.checkNotNullParameter(string4, "formattedValue");
        Intrinsics.checkNotNullParameter(postsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal, "priceReveal");
        Intrinsics.checkNotNullParameter(string5, "value");
        PostsResponse$Component$Subcomponent$Resource$OfferPrice postsResponse$Component$Subcomponent$Resource$OfferPrice = new PostsResponse$Component$Subcomponent$Resource$OfferPrice(string2, string3, string4, postsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal, string5);
        return postsResponse$Component$Subcomponent$Resource$OfferPrice;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PostsResponse$Component$Subcomponent$Resource$OfferPrice;
        if (!bl3) {
            return false;
        }
        object = (PostsResponse$Component$Subcomponent$Resource$OfferPrice)object;
        Object object2 = this.currencyIso;
        Object object3 = ((PostsResponse$Component$Subcomponent$Resource$OfferPrice)object).currencyIso;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.displayformattedValue;
        object3 = ((PostsResponse$Component$Subcomponent$Resource$OfferPrice)object).displayformattedValue;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.formattedValue;
        object3 = ((PostsResponse$Component$Subcomponent$Resource$OfferPrice)object).formattedValue;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.priceReveal;
        object3 = ((PostsResponse$Component$Subcomponent$Resource$OfferPrice)object).priceReveal;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.value;
        object = ((PostsResponse$Component$Subcomponent$Resource$OfferPrice)object).value;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCurrencyIso() {
        return this.currencyIso;
    }

    public final String getDisplayformattedValue() {
        return this.displayformattedValue;
    }

    public final String getFormattedValue() {
        return this.formattedValue;
    }

    public final PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal getPriceReveal() {
        return this.priceReveal;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3 = this.currencyIso.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.displayformattedValue;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.formattedValue;
        n3 = zy_2.b(n3, n4, string2);
        int n7 = (this.priceReveal.hashCode() + n3) * 31;
        return this.value.hashCode() + n7;
    }

    public String toString() {
        CharSequence charSequence = this.currencyIso;
        String string2 = this.displayformattedValue;
        String string3 = this.formattedValue;
        PostsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal postsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal = this.priceReveal;
        String string4 = this.value;
        charSequence = og_1.a("OfferPrice(currencyIso=", (String)charSequence, ", displayformattedValue=", string2, ", formattedValue=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", priceReveal=");
        ((StringBuilder)charSequence).append(postsResponse$Component$Subcomponent$Resource$OfferPrice$PriceReveal);
        ((StringBuilder)charSequence).append(", value=");
        return h30_0.a((StringBuilder)charSequence, string4, ")");
    }
}

