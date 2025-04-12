/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.brand_page;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Price {
    private Integer basePrice;
    private Integer listPrice;
    private Integer offerPrice;

    public Price() {
        this(null, null, null, 7, null);
    }

    public Price(Integer n3, Integer n4, Integer n7) {
        this.basePrice = n3;
        this.listPrice = n4;
        this.offerPrice = n7;
    }

    public /* synthetic */ Price(Integer n3, Integer n4, Integer n7, int n8, DefaultConstructorMarker defaultConstructorMarker) {
        int n10 = n8 & 1;
        if (n10 != 0) {
            n3 = null;
        }
        if ((n10 = n8 & 2) != 0) {
            n4 = null;
        }
        if ((n8 &= 4) != 0) {
            n7 = null;
        }
        this(n3, n4, n7);
    }

    public static /* synthetic */ Price copy$default(Price price, Integer n3, Integer n4, Integer n7, int n8, Object object) {
        int n10 = n8 & 1;
        if (n10 != 0) {
            n3 = price.basePrice;
        }
        if ((n10 = n8 & 2) != 0) {
            n4 = price.listPrice;
        }
        if ((n8 &= 4) != 0) {
            n7 = price.offerPrice;
        }
        return price.copy(n3, n4, n7);
    }

    public final Integer component1() {
        return this.basePrice;
    }

    public final Integer component2() {
        return this.listPrice;
    }

    public final Integer component3() {
        return this.offerPrice;
    }

    public final Price copy(Integer n3, Integer n4, Integer n7) {
        Price price = new Price(n3, n4, n7);
        return price;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Price;
        if (!bl3) {
            return false;
        }
        object = (Price)object;
        Integer n3 = this.basePrice;
        Integer n4 = ((Price)object).basePrice;
        bl3 = Intrinsics.areEqual(n3, n4);
        if (!bl3) {
            return false;
        }
        n3 = this.listPrice;
        n4 = ((Price)object).listPrice;
        bl3 = Intrinsics.areEqual(n3, n4);
        if (!bl3) {
            return false;
        }
        n3 = this.offerPrice;
        object = ((Price)object).offerPrice;
        boolean bl4 = Intrinsics.areEqual(n3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Integer getBasePrice() {
        return this.basePrice;
    }

    public final Integer getListPrice() {
        return this.listPrice;
    }

    public final Integer getOfferPrice() {
        return this.offerPrice;
    }

    public int hashCode() {
        int n3;
        int n4;
        Integer n7 = this.basePrice;
        int n8 = 0;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n4 *= 31;
        Integer n10 = this.listPrice;
        if (n10 == null) {
            n3 = 0;
            n10 = null;
        } else {
            n3 = ((Object)n10).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n10 = this.offerPrice;
        if (n10 != null) {
            n8 = ((Object)n10).hashCode();
        }
        return n4 + n8;
    }

    public final void setBasePrice(Integer n3) {
        this.basePrice = n3;
    }

    public final void setListPrice(Integer n3) {
        this.listPrice = n3;
    }

    public final void setOfferPrice(Integer n3) {
        this.offerPrice = n3;
    }

    public String toString() {
        Integer n3 = this.basePrice;
        Integer n4 = this.listPrice;
        Integer n7 = this.offerPrice;
        StringBuilder stringBuilder = new StringBuilder("Price(basePrice=");
        stringBuilder.append(n3);
        stringBuilder.append(", listPrice=");
        stringBuilder.append(n4);
        stringBuilder.append(", offerPrice=");
        stringBuilder.append(n7);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

