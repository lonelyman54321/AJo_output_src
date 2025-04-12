/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class CartAssuredGiftModel$Gift
implements Serializable {
    private final String bannerText;
    private final float giftValue;
    private final String giftValueText;
    private final boolean hasGift;
    private final String nudgeText;
    private final List offers;
    private final String orderValueRangeText;

    public CartAssuredGiftModel$Gift(String string2, float f5, boolean bl2, String string3, String string4, List list, String string5) {
        Intrinsics.checkNotNullParameter(string2, "giftValueText");
        Intrinsics.checkNotNullParameter(string3, "nudgeText");
        Intrinsics.checkNotNullParameter(string4, "bannerText");
        Intrinsics.checkNotNullParameter(list, "offers");
        Intrinsics.checkNotNullParameter(string5, "orderValueRangeText");
        this.giftValueText = string2;
        this.giftValue = f5;
        this.hasGift = bl2;
        this.nudgeText = string3;
        this.bannerText = string4;
        this.offers = list;
        this.orderValueRangeText = string5;
    }

    public static /* synthetic */ CartAssuredGiftModel$Gift copy$default(CartAssuredGiftModel$Gift cartAssuredGiftModel$Gift, String string2, float f5, boolean bl2, String string3, String string4, List object, String string5, int n3, Object object2) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = cartAssuredGiftModel$Gift.giftValueText;
        }
        if ((n4 = n3 & 2) != 0) {
            f5 = cartAssuredGiftModel$Gift.giftValue;
        }
        float f6 = f5;
        int n7 = n3 & 4;
        if (n7 != 0) {
            bl2 = cartAssuredGiftModel$Gift.hasGift;
        }
        boolean bl3 = bl2;
        n7 = n3 & 8;
        if (n7 != 0) {
            string3 = cartAssuredGiftModel$Gift.nudgeText;
        }
        String string6 = string3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = cartAssuredGiftModel$Gift.bannerText;
        }
        String string7 = string4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            object = cartAssuredGiftModel$Gift.offers;
        }
        List list = object;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            string5 = cartAssuredGiftModel$Gift.orderValueRangeText;
        }
        String string8 = string5;
        object = string6;
        string5 = string7;
        return cartAssuredGiftModel$Gift.copy(string2, f6, bl3, string6, string7, list, string8);
    }

    public final String component1() {
        return this.giftValueText;
    }

    public final float component2() {
        return this.giftValue;
    }

    public final boolean component3() {
        return this.hasGift;
    }

    public final String component4() {
        return this.nudgeText;
    }

    public final String component5() {
        return this.bannerText;
    }

    public final List component6() {
        return this.offers;
    }

    public final String component7() {
        return this.orderValueRangeText;
    }

    public final CartAssuredGiftModel$Gift copy(String string2, float f5, boolean bl2, String string3, String string4, List list, String string5) {
        Intrinsics.checkNotNullParameter(string2, "giftValueText");
        Intrinsics.checkNotNullParameter(string3, "nudgeText");
        Intrinsics.checkNotNullParameter(string4, "bannerText");
        Intrinsics.checkNotNullParameter(list, "offers");
        Intrinsics.checkNotNullParameter(string5, "orderValueRangeText");
        CartAssuredGiftModel$Gift cartAssuredGiftModel$Gift = new CartAssuredGiftModel$Gift(string2, f5, bl2, string3, string4, list, string5);
        return cartAssuredGiftModel$Gift;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof CartAssuredGiftModel$Gift;
        if (n3 == 0) {
            return false;
        }
        object = (CartAssuredGiftModel$Gift)object;
        Object object2 = this.giftValueText;
        Object object3 = ((CartAssuredGiftModel$Gift)object).giftValueText;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        float f5 = this.giftValue;
        float f6 = ((CartAssuredGiftModel$Gift)object).giftValue;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        n3 = (int)(this.hasGift ? 1 : 0);
        int n4 = ((CartAssuredGiftModel$Gift)object).hasGift;
        if (n3 != n4) {
            return false;
        }
        object2 = this.nudgeText;
        object3 = ((CartAssuredGiftModel$Gift)object).nudgeText;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.bannerText;
        object3 = ((CartAssuredGiftModel$Gift)object).bannerText;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.offers;
        object3 = ((CartAssuredGiftModel$Gift)object).offers;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.orderValueRangeText;
        object = ((CartAssuredGiftModel$Gift)object).orderValueRangeText;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getBannerText() {
        return this.bannerText;
    }

    public final float getGiftValue() {
        return this.giftValue;
    }

    public final String getGiftValueText() {
        return this.giftValueText;
    }

    public final boolean getHasGift() {
        return this.hasGift;
    }

    public final String getNudgeText() {
        return this.nudgeText;
    }

    public final List getOffers() {
        return this.offers;
    }

    public final String getOrderValueRangeText() {
        return this.orderValueRangeText;
    }

    public int hashCode() {
        String string2 = this.giftValueText;
        int n3 = string2.hashCode();
        int n4 = 31;
        n3 *= 31;
        float f5 = this.giftValue;
        n3 = UR0.a(f5, n3, n4);
        int n7 = this.hasGift;
        if (n7 != 0) {
            n7 = 1231;
            f5 = 1.725E-42f;
        } else {
            n7 = 1237;
            f5 = 1.733E-42f;
        }
        n3 = (n3 + n7) * 31;
        Object object = this.nudgeText;
        n3 = zy_2.b(n3, n4, (String)object);
        object = this.bannerText;
        n3 = zy_2.b(n3, n4, (String)object);
        object = this.offers;
        n3 = ne_0.a(n3, n4, (List)object);
        return this.orderValueRangeText.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.giftValueText;
        float f5 = this.giftValue;
        boolean bl2 = this.hasGift;
        String string3 = this.nudgeText;
        String string4 = this.bannerText;
        List list = this.offers;
        String string5 = this.orderValueRangeText;
        StringBuilder stringBuilder = new StringBuilder("Gift(giftValueText=");
        stringBuilder.append(string2);
        stringBuilder.append(", giftValue=");
        stringBuilder.append(f5);
        stringBuilder.append(", hasGift=");
        stringBuilder.append(bl2);
        stringBuilder.append(", nudgeText=");
        stringBuilder.append(string3);
        stringBuilder.append(", bannerText=");
        stringBuilder.append(string4);
        stringBuilder.append(", offers=");
        stringBuilder.append(list);
        stringBuilder.append(", orderValueRangeText=");
        return h30_0.a(stringBuilder, string5, ")");
    }
}

