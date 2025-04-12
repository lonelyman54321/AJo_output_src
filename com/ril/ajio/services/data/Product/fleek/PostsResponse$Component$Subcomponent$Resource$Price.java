/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product.fleek;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class PostsResponse$Component$Subcomponent$Resource$Price
implements Serializable {
    private final String currencyIso;
    private final String displayformattedValue;
    private final String formattedValue;
    private final String priceType;
    private final String value;

    public PostsResponse$Component$Subcomponent$Resource$Price(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "currencyIso");
        Intrinsics.checkNotNullParameter(string3, "displayformattedValue");
        Intrinsics.checkNotNullParameter(string4, "formattedValue");
        Intrinsics.checkNotNullParameter(string5, "priceType");
        Intrinsics.checkNotNullParameter(string6, "value");
        this.currencyIso = string2;
        this.displayformattedValue = string3;
        this.formattedValue = string4;
        this.priceType = string5;
        this.value = string6;
    }

    public static /* synthetic */ PostsResponse$Component$Subcomponent$Resource$Price copy$default(PostsResponse$Component$Subcomponent$Resource$Price postsResponse$Component$Subcomponent$Resource$Price, String string2, String object, String string3, String object2, String string4, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = postsResponse$Component$Subcomponent$Resource$Price.currencyIso;
        }
        if ((n4 = n3 & 2) != 0) {
            object = postsResponse$Component$Subcomponent$Resource$Price.displayformattedValue;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = postsResponse$Component$Subcomponent$Resource$Price.formattedValue;
        }
        String string5 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = postsResponse$Component$Subcomponent$Resource$Price.priceType;
        }
        String string6 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = postsResponse$Component$Subcomponent$Resource$Price.value;
        }
        String string7 = string4;
        object = postsResponse$Component$Subcomponent$Resource$Price;
        string3 = string2;
        object2 = object3;
        string4 = string5;
        object3 = string7;
        return postsResponse$Component$Subcomponent$Resource$Price.copy(string2, (String)object2, string5, string6, string7);
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

    public final String component4() {
        return this.priceType;
    }

    public final String component5() {
        return this.value;
    }

    public final PostsResponse$Component$Subcomponent$Resource$Price copy(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "currencyIso");
        Intrinsics.checkNotNullParameter(string3, "displayformattedValue");
        Intrinsics.checkNotNullParameter(string4, "formattedValue");
        Intrinsics.checkNotNullParameter(string5, "priceType");
        Intrinsics.checkNotNullParameter(string6, "value");
        PostsResponse$Component$Subcomponent$Resource$Price postsResponse$Component$Subcomponent$Resource$Price = new PostsResponse$Component$Subcomponent$Resource$Price(string2, string3, string4, string5, string6);
        return postsResponse$Component$Subcomponent$Resource$Price;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PostsResponse$Component$Subcomponent$Resource$Price;
        if (!bl3) {
            return false;
        }
        object = (PostsResponse$Component$Subcomponent$Resource$Price)object;
        String string2 = this.currencyIso;
        String string3 = ((PostsResponse$Component$Subcomponent$Resource$Price)object).currencyIso;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.displayformattedValue;
        string3 = ((PostsResponse$Component$Subcomponent$Resource$Price)object).displayformattedValue;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.formattedValue;
        string3 = ((PostsResponse$Component$Subcomponent$Resource$Price)object).formattedValue;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.priceType;
        string3 = ((PostsResponse$Component$Subcomponent$Resource$Price)object).priceType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.value;
        object = ((PostsResponse$Component$Subcomponent$Resource$Price)object).value;
        boolean bl4 = Intrinsics.areEqual(string2, object);
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

    public final String getPriceType() {
        return this.priceType;
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
        string2 = this.priceType;
        n3 = zy_2.b(n3, n4, string2);
        return this.value.hashCode() + n3;
    }

    public String toString() {
        CharSequence charSequence = this.currencyIso;
        String string2 = this.displayformattedValue;
        String string3 = this.formattedValue;
        String string4 = this.priceType;
        String string5 = this.value;
        charSequence = og_1.a("Price(currencyIso=", charSequence, ", displayformattedValue=", string2, ", formattedValue=");
        X50.a((StringBuilder)charSequence, string3, ", priceType=", string4, ", value=");
        return h30_0.a((StringBuilder)charSequence, string5, ")");
    }
}

