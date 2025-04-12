/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class CartAssuredGiftModel
implements Serializable {
    private final String ctaText;
    private final List gifts;
    private final boolean hasGift;

    public CartAssuredGiftModel(String string2, List list, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "ctaText");
        Intrinsics.checkNotNullParameter(list, "gifts");
        this.ctaText = string2;
        this.gifts = list;
        this.hasGift = bl2;
    }

    public static /* synthetic */ CartAssuredGiftModel copy$default(CartAssuredGiftModel cartAssuredGiftModel, String string2, List list, boolean bl2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = cartAssuredGiftModel.ctaText;
        }
        if ((n4 = n3 & 2) != 0) {
            list = cartAssuredGiftModel.gifts;
        }
        if ((n3 &= 4) != 0) {
            bl2 = cartAssuredGiftModel.hasGift;
        }
        return cartAssuredGiftModel.copy(string2, list, bl2);
    }

    public final String component1() {
        return this.ctaText;
    }

    public final List component2() {
        return this.gifts;
    }

    public final boolean component3() {
        return this.hasGift;
    }

    public final CartAssuredGiftModel copy(String string2, List list, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "ctaText");
        Intrinsics.checkNotNullParameter(list, "gifts");
        CartAssuredGiftModel cartAssuredGiftModel = new CartAssuredGiftModel(string2, list, bl2);
        return cartAssuredGiftModel;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CartAssuredGiftModel;
        if (!bl3) {
            return false;
        }
        object = (CartAssuredGiftModel)object;
        Object object2 = this.ctaText;
        Object object3 = ((CartAssuredGiftModel)object).ctaText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.gifts;
        object3 = ((CartAssuredGiftModel)object).gifts;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.hasGift;
        boolean bl4 = ((CartAssuredGiftModel)object).hasGift;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final List getGifts() {
        return this.gifts;
    }

    public final boolean getHasGift() {
        return this.hasGift;
    }

    public int hashCode() {
        String string2 = this.ctaText;
        int n3 = string2.hashCode() * 31;
        List list = this.gifts;
        n3 = ne_0.a(n3, 31, list);
        int n4 = this.hasGift;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public String toString() {
        String string2 = this.ctaText;
        List list = this.gifts;
        boolean bl2 = this.hasGift;
        StringBuilder stringBuilder = new StringBuilder("CartAssuredGiftModel(ctaText=");
        stringBuilder.append(string2);
        stringBuilder.append(", gifts=");
        stringBuilder.append(list);
        stringBuilder.append(", hasGift=");
        return Vm.a(")", bl2, stringBuilder);
    }
}

