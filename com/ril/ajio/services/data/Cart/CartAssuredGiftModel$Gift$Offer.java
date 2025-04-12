/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class CartAssuredGiftModel$Gift$Offer
implements Serializable {
    private final String bannerImageURL;
    private final String fulfillmentText;
    private final String label;
    private final String plpLink;
    private final String value;

    public CartAssuredGiftModel$Gift$Offer(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "bannerImageURL");
        Intrinsics.checkNotNullParameter(string3, "fulfillmentText");
        Intrinsics.checkNotNullParameter(string4, "label");
        Intrinsics.checkNotNullParameter(string5, "value");
        Intrinsics.checkNotNullParameter(string6, "plpLink");
        this.bannerImageURL = string2;
        this.fulfillmentText = string3;
        this.label = string4;
        this.value = string5;
        this.plpLink = string6;
    }

    public static /* synthetic */ CartAssuredGiftModel$Gift$Offer copy$default(CartAssuredGiftModel$Gift$Offer cartAssuredGiftModel$Gift$Offer, String string2, String object, String string3, String object2, String string4, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = cartAssuredGiftModel$Gift$Offer.bannerImageURL;
        }
        if ((n4 = n3 & 2) != 0) {
            object = cartAssuredGiftModel$Gift$Offer.fulfillmentText;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = cartAssuredGiftModel$Gift$Offer.label;
        }
        String string5 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = cartAssuredGiftModel$Gift$Offer.value;
        }
        String string6 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = cartAssuredGiftModel$Gift$Offer.plpLink;
        }
        String string7 = string4;
        object = cartAssuredGiftModel$Gift$Offer;
        string3 = string2;
        object2 = object3;
        string4 = string5;
        object3 = string7;
        return cartAssuredGiftModel$Gift$Offer.copy(string2, (String)object2, string5, string6, string7);
    }

    public final String component1() {
        return this.bannerImageURL;
    }

    public final String component2() {
        return this.fulfillmentText;
    }

    public final String component3() {
        return this.label;
    }

    public final String component4() {
        return this.value;
    }

    public final String component5() {
        return this.plpLink;
    }

    public final CartAssuredGiftModel$Gift$Offer copy(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "bannerImageURL");
        Intrinsics.checkNotNullParameter(string3, "fulfillmentText");
        Intrinsics.checkNotNullParameter(string4, "label");
        Intrinsics.checkNotNullParameter(string5, "value");
        Intrinsics.checkNotNullParameter(string6, "plpLink");
        CartAssuredGiftModel$Gift$Offer cartAssuredGiftModel$Gift$Offer = new CartAssuredGiftModel$Gift$Offer(string2, string3, string4, string5, string6);
        return cartAssuredGiftModel$Gift$Offer;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CartAssuredGiftModel$Gift$Offer;
        if (!bl3) {
            return false;
        }
        object = (CartAssuredGiftModel$Gift$Offer)object;
        String string2 = this.bannerImageURL;
        String string3 = ((CartAssuredGiftModel$Gift$Offer)object).bannerImageURL;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.fulfillmentText;
        string3 = ((CartAssuredGiftModel$Gift$Offer)object).fulfillmentText;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.label;
        string3 = ((CartAssuredGiftModel$Gift$Offer)object).label;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.value;
        string3 = ((CartAssuredGiftModel$Gift$Offer)object).value;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.plpLink;
        object = ((CartAssuredGiftModel$Gift$Offer)object).plpLink;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBannerImageURL() {
        return this.bannerImageURL;
    }

    public final String getFulfillmentText() {
        return this.fulfillmentText;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPlpLink() {
        return this.plpLink;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3 = this.bannerImageURL.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.fulfillmentText;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.label;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.value;
        n3 = zy_2.b(n3, n4, string2);
        return this.plpLink.hashCode() + n3;
    }

    public String toString() {
        CharSequence charSequence = this.bannerImageURL;
        String string2 = this.fulfillmentText;
        String string3 = this.label;
        String string4 = this.value;
        String string5 = this.plpLink;
        charSequence = og_1.a("Offer(bannerImageURL=", charSequence, ", fulfillmentText=", string2, ", label=");
        X50.a((StringBuilder)charSequence, string3, ", value=", string4, ", plpLink=");
        return h30_0.a((StringBuilder)charSequence, string5, ")");
    }
}

