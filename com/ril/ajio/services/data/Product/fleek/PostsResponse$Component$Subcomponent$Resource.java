/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product.fleek;

import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$Subcomponent$Resource$OfferPrice;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$Subcomponent$Resource$Price;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$Subcomponent$Resource$WasPriceData;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class PostsResponse$Component$Subcomponent$Resource
implements Serializable {
    private final String code;
    private final String discountPercent;
    private final PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData fnlColorVariantData;
    private final List images;
    private final String name;
    private final PostsResponse$Component$Subcomponent$Resource$OfferPrice offerPrice;
    private final PostsResponse$Component$Subcomponent$Resource$Price price;
    private final String url;
    private final PostsResponse$Component$Subcomponent$Resource$WasPriceData wasPriceData;

    public PostsResponse$Component$Subcomponent$Resource(String string2, String string3, PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData postsResponse$Component$Subcomponent$Resource$FnlColorVariantData, List list, String string4, PostsResponse$Component$Subcomponent$Resource$OfferPrice postsResponse$Component$Subcomponent$Resource$OfferPrice, PostsResponse$Component$Subcomponent$Resource$Price postsResponse$Component$Subcomponent$Resource$Price, String string5, PostsResponse$Component$Subcomponent$Resource$WasPriceData postsResponse$Component$Subcomponent$Resource$WasPriceData) {
        Intrinsics.checkNotNullParameter(string2, "code");
        Intrinsics.checkNotNullParameter(string3, "discountPercent");
        Intrinsics.checkNotNullParameter(postsResponse$Component$Subcomponent$Resource$FnlColorVariantData, "fnlColorVariantData");
        Intrinsics.checkNotNullParameter(list, "images");
        Intrinsics.checkNotNullParameter(string4, "name");
        Intrinsics.checkNotNullParameter(postsResponse$Component$Subcomponent$Resource$OfferPrice, "offerPrice");
        Intrinsics.checkNotNullParameter(postsResponse$Component$Subcomponent$Resource$Price, "price");
        Intrinsics.checkNotNullParameter(string5, "url");
        Intrinsics.checkNotNullParameter(postsResponse$Component$Subcomponent$Resource$WasPriceData, "wasPriceData");
        this.code = string2;
        this.discountPercent = string3;
        this.fnlColorVariantData = postsResponse$Component$Subcomponent$Resource$FnlColorVariantData;
        this.images = list;
        this.name = string4;
        this.offerPrice = postsResponse$Component$Subcomponent$Resource$OfferPrice;
        this.price = postsResponse$Component$Subcomponent$Resource$Price;
        this.url = string5;
        this.wasPriceData = postsResponse$Component$Subcomponent$Resource$WasPriceData;
    }

    public static /* synthetic */ PostsResponse$Component$Subcomponent$Resource copy$default(PostsResponse$Component$Subcomponent$Resource postsResponse$Component$Subcomponent$Resource, String string2, String string3, PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData postsResponse$Component$Subcomponent$Resource$FnlColorVariantData, List list, String string4, PostsResponse$Component$Subcomponent$Resource$OfferPrice postsResponse$Component$Subcomponent$Resource$OfferPrice, PostsResponse$Component$Subcomponent$Resource$Price postsResponse$Component$Subcomponent$Resource$Price, String string5, PostsResponse$Component$Subcomponent$Resource$WasPriceData postsResponse$Component$Subcomponent$Resource$WasPriceData, int n3, Object object) {
        PostsResponse$Component$Subcomponent$Resource postsResponse$Component$Subcomponent$Resource2 = postsResponse$Component$Subcomponent$Resource;
        int n4 = n3;
        int n7 = n3 & 1;
        String string6 = n7 != 0 ? postsResponse$Component$Subcomponent$Resource.code : string2;
        int n8 = n4 & 2;
        String string7 = n8 != 0 ? postsResponse$Component$Subcomponent$Resource2.discountPercent : string3;
        int n10 = n4 & 4;
        PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData postsResponse$Component$Subcomponent$Resource$FnlColorVariantData2 = n10 != 0 ? postsResponse$Component$Subcomponent$Resource2.fnlColorVariantData : postsResponse$Component$Subcomponent$Resource$FnlColorVariantData;
        int n14 = n4 & 8;
        List list2 = n14 != 0 ? postsResponse$Component$Subcomponent$Resource2.images : list;
        int n15 = n4 & 0x10;
        String string8 = n15 != 0 ? postsResponse$Component$Subcomponent$Resource2.name : string4;
        int n16 = n4 & 0x20;
        PostsResponse$Component$Subcomponent$Resource$OfferPrice postsResponse$Component$Subcomponent$Resource$OfferPrice2 = n16 != 0 ? postsResponse$Component$Subcomponent$Resource2.offerPrice : postsResponse$Component$Subcomponent$Resource$OfferPrice;
        int n17 = n4 & 0x40;
        PostsResponse$Component$Subcomponent$Resource$Price postsResponse$Component$Subcomponent$Resource$Price2 = n17 != 0 ? postsResponse$Component$Subcomponent$Resource2.price : postsResponse$Component$Subcomponent$Resource$Price;
        int n18 = n4 & 0x80;
        String string9 = n18 != 0 ? postsResponse$Component$Subcomponent$Resource2.url : string5;
        PostsResponse$Component$Subcomponent$Resource$WasPriceData postsResponse$Component$Subcomponent$Resource$WasPriceData2 = (n4 &= 0x100) != 0 ? postsResponse$Component$Subcomponent$Resource2.wasPriceData : postsResponse$Component$Subcomponent$Resource$WasPriceData;
        string2 = string6;
        string3 = string7;
        postsResponse$Component$Subcomponent$Resource$FnlColorVariantData = postsResponse$Component$Subcomponent$Resource$FnlColorVariantData2;
        list = list2;
        string4 = string8;
        postsResponse$Component$Subcomponent$Resource$OfferPrice = postsResponse$Component$Subcomponent$Resource$OfferPrice2;
        postsResponse$Component$Subcomponent$Resource$Price = postsResponse$Component$Subcomponent$Resource$Price2;
        string5 = string9;
        postsResponse$Component$Subcomponent$Resource$WasPriceData = postsResponse$Component$Subcomponent$Resource$WasPriceData2;
        return postsResponse$Component$Subcomponent$Resource.copy(string6, string7, postsResponse$Component$Subcomponent$Resource$FnlColorVariantData2, list2, string8, postsResponse$Component$Subcomponent$Resource$OfferPrice2, postsResponse$Component$Subcomponent$Resource$Price2, string9, postsResponse$Component$Subcomponent$Resource$WasPriceData2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.discountPercent;
    }

    public final PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData component3() {
        return this.fnlColorVariantData;
    }

    public final List component4() {
        return this.images;
    }

    public final String component5() {
        return this.name;
    }

    public final PostsResponse$Component$Subcomponent$Resource$OfferPrice component6() {
        return this.offerPrice;
    }

    public final PostsResponse$Component$Subcomponent$Resource$Price component7() {
        return this.price;
    }

    public final String component8() {
        return this.url;
    }

    public final PostsResponse$Component$Subcomponent$Resource$WasPriceData component9() {
        return this.wasPriceData;
    }

    public final PostsResponse$Component$Subcomponent$Resource copy(String string2, String string3, PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData postsResponse$Component$Subcomponent$Resource$FnlColorVariantData, List list, String string4, PostsResponse$Component$Subcomponent$Resource$OfferPrice postsResponse$Component$Subcomponent$Resource$OfferPrice, PostsResponse$Component$Subcomponent$Resource$Price postsResponse$Component$Subcomponent$Resource$Price, String string5, PostsResponse$Component$Subcomponent$Resource$WasPriceData postsResponse$Component$Subcomponent$Resource$WasPriceData) {
        Intrinsics.checkNotNullParameter(string2, "code");
        Intrinsics.checkNotNullParameter(string3, "discountPercent");
        Intrinsics.checkNotNullParameter(postsResponse$Component$Subcomponent$Resource$FnlColorVariantData, "fnlColorVariantData");
        Intrinsics.checkNotNullParameter(list, "images");
        Intrinsics.checkNotNullParameter(string4, "name");
        Intrinsics.checkNotNullParameter(postsResponse$Component$Subcomponent$Resource$OfferPrice, "offerPrice");
        Intrinsics.checkNotNullParameter(postsResponse$Component$Subcomponent$Resource$Price, "price");
        Intrinsics.checkNotNullParameter(string5, "url");
        Intrinsics.checkNotNullParameter(postsResponse$Component$Subcomponent$Resource$WasPriceData, "wasPriceData");
        PostsResponse$Component$Subcomponent$Resource postsResponse$Component$Subcomponent$Resource = new PostsResponse$Component$Subcomponent$Resource(string2, string3, postsResponse$Component$Subcomponent$Resource$FnlColorVariantData, list, string4, postsResponse$Component$Subcomponent$Resource$OfferPrice, postsResponse$Component$Subcomponent$Resource$Price, string5, postsResponse$Component$Subcomponent$Resource$WasPriceData);
        return postsResponse$Component$Subcomponent$Resource;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PostsResponse$Component$Subcomponent$Resource;
        if (!bl3) {
            return false;
        }
        object = (PostsResponse$Component$Subcomponent$Resource)object;
        Object object2 = this.code;
        Object object3 = ((PostsResponse$Component$Subcomponent$Resource)object).code;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.discountPercent;
        object3 = ((PostsResponse$Component$Subcomponent$Resource)object).discountPercent;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.fnlColorVariantData;
        object3 = ((PostsResponse$Component$Subcomponent$Resource)object).fnlColorVariantData;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.images;
        object3 = ((PostsResponse$Component$Subcomponent$Resource)object).images;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.name;
        object3 = ((PostsResponse$Component$Subcomponent$Resource)object).name;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerPrice;
        object3 = ((PostsResponse$Component$Subcomponent$Resource)object).offerPrice;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.price;
        object3 = ((PostsResponse$Component$Subcomponent$Resource)object).price;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.url;
        object3 = ((PostsResponse$Component$Subcomponent$Resource)object).url;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.wasPriceData;
        object = ((PostsResponse$Component$Subcomponent$Resource)object).wasPriceData;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDiscountPercent() {
        return this.discountPercent;
    }

    public final PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData getFnlColorVariantData() {
        return this.fnlColorVariantData;
    }

    public final List getImages() {
        return this.images;
    }

    public final String getName() {
        return this.name;
    }

    public final PostsResponse$Component$Subcomponent$Resource$OfferPrice getOfferPrice() {
        return this.offerPrice;
    }

    public final PostsResponse$Component$Subcomponent$Resource$Price getPrice() {
        return this.price;
    }

    public final String getUrl() {
        return this.url;
    }

    public final PostsResponse$Component$Subcomponent$Resource$WasPriceData getWasPriceData() {
        return this.wasPriceData;
    }

    public int hashCode() {
        int n3 = this.code.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.discountPercent;
        n3 = zy_2.b(n3, n4, string2);
        int n7 = (this.fnlColorVariantData.hashCode() + n3) * 31;
        List list = this.images;
        n3 = ne_0.a(n7, n4, list);
        string2 = this.name;
        n3 = zy_2.b(n3, n4, string2);
        n7 = (this.offerPrice.hashCode() + n3) * 31;
        n3 = (this.price.hashCode() + n7) * 31;
        string2 = this.url;
        n3 = zy_2.b(n3, n4, string2);
        return this.wasPriceData.hashCode() + n3;
    }

    public String toString() {
        CharSequence charSequence = this.code;
        String string2 = this.discountPercent;
        PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData postsResponse$Component$Subcomponent$Resource$FnlColorVariantData = this.fnlColorVariantData;
        List list = this.images;
        String string3 = this.name;
        PostsResponse$Component$Subcomponent$Resource$OfferPrice postsResponse$Component$Subcomponent$Resource$OfferPrice = this.offerPrice;
        PostsResponse$Component$Subcomponent$Resource$Price postsResponse$Component$Subcomponent$Resource$Price = this.price;
        String string4 = this.url;
        PostsResponse$Component$Subcomponent$Resource$WasPriceData postsResponse$Component$Subcomponent$Resource$WasPriceData = this.wasPriceData;
        charSequence = og_1.a("Resource(code=", (String)charSequence, ", discountPercent=", string2, ", fnlColorVariantData=");
        ((StringBuilder)charSequence).append(postsResponse$Component$Subcomponent$Resource$FnlColorVariantData);
        ((StringBuilder)charSequence).append(", images=");
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(", name=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", offerPrice=");
        ((StringBuilder)charSequence).append(postsResponse$Component$Subcomponent$Resource$OfferPrice);
        ((StringBuilder)charSequence).append(", price=");
        ((StringBuilder)charSequence).append(postsResponse$Component$Subcomponent$Resource$Price);
        ((StringBuilder)charSequence).append(", url=");
        ((StringBuilder)charSequence).append(string4);
        ((StringBuilder)charSequence).append(", wasPriceData=");
        ((StringBuilder)charSequence).append(postsResponse$Component$Subcomponent$Resource$WasPriceData);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

