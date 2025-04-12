/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import com.ril.ajio.services.data.fleek.feedModel.FnlColorVariantData;
import com.ril.ajio.services.data.fleek.feedModel.OfferPrice;
import com.ril.ajio.services.data.fleek.feedModel.Price;
import com.ril.ajio.services.data.fleek.feedModel.Promotion;
import com.ril.ajio.services.data.fleek.feedModel.WasPriceData;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class InnerResource {
    private String description;
    private String discountPercent;
    private FnlColorVariantData fnlColorVariantData;
    private String id;
    private String imageUrl;
    private List images;
    private Boolean isWishlisted;
    private String name;
    private OfferPrice offerPrice;
    private Price price;
    private Promotion promotion;
    private String resourceUrl;
    private String type;
    private WasPriceData wasPriceData;
    private Integer wishlistCount;

    public InnerResource() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Short.MAX_VALUE, null);
    }

    public InnerResource(String string2, String string3, FnlColorVariantData fnlColorVariantData, String string4, String string5, List list, Boolean bl2, String string6, OfferPrice offerPrice, Price price, Promotion promotion, String string7, String string8, WasPriceData wasPriceData, Integer n3) {
        this.description = string2;
        this.discountPercent = string3;
        this.fnlColorVariantData = fnlColorVariantData;
        this.id = string4;
        this.imageUrl = string5;
        this.images = list;
        this.isWishlisted = bl2;
        this.name = string6;
        this.offerPrice = offerPrice;
        this.price = price;
        this.promotion = promotion;
        this.resourceUrl = string7;
        this.type = string8;
        this.wasPriceData = wasPriceData;
        this.wishlistCount = n3;
    }

    public /* synthetic */ InnerResource(String object, String string2, FnlColorVariantData object2, String object3, String string3, List object4, Boolean object5, String object6, OfferPrice object7, Price object8, Promotion object9, String object10, String string4, WasPriceData object11, Integer object12, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        WasPriceData wasPriceData;
        String string5;
        String string6;
        Promotion promotion;
        Price price;
        OfferPrice offerPrice;
        String string7;
        Boolean bl2;
        List list;
        String string8;
        String string9;
        FnlColorVariantData fnlColorVariantData;
        String string10;
        String string11;
        int n4 = n3;
        int n7 = n3 & 1;
        Integer n8 = null;
        if (n7 != 0) {
            n7 = 0;
            string11 = null;
        } else {
            string11 = object;
        }
        int n10 = n4 & 2;
        if (n10 != 0) {
            n10 = 0;
            string10 = null;
        } else {
            string10 = string2;
        }
        int n14 = n4 & 4;
        if (n14 != 0) {
            n14 = 0;
            fnlColorVariantData = null;
        } else {
            fnlColorVariantData = object2;
        }
        int n15 = n4 & 8;
        if (n15 != 0) {
            n15 = 0;
            string9 = null;
        } else {
            string9 = object3;
        }
        int n16 = n4 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            string8 = null;
        } else {
            string8 = string3;
        }
        int n17 = n4 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            list = null;
        } else {
            list = object4;
        }
        int n18 = n4 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            bl2 = null;
        } else {
            bl2 = object5;
        }
        int n19 = n4 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            string7 = null;
        } else {
            string7 = object6;
        }
        int n20 = n4 & 0x100;
        if (n20 != 0) {
            n20 = 0;
            offerPrice = null;
        } else {
            offerPrice = object7;
        }
        int n21 = n4 & 0x200;
        if (n21 != 0) {
            n21 = 0;
            price = null;
        } else {
            price = object8;
        }
        int n22 = n4 & 0x400;
        if (n22 != 0) {
            n22 = 0;
            promotion = null;
        } else {
            promotion = object9;
        }
        int n24 = n4 & 0x800;
        if (n24 != 0) {
            n24 = 0;
            string6 = null;
        } else {
            string6 = object10;
        }
        int n25 = n4 & 0x1000;
        if (n25 != 0) {
            n25 = 0;
            string5 = null;
        } else {
            string5 = string4;
        }
        int n26 = n4 & 0x2000;
        if (n26 != 0) {
            n26 = 0;
            wasPriceData = null;
        } else {
            wasPriceData = object11;
        }
        if ((n4 &= 0x4000) == 0) {
            n8 = object12;
        }
        object = this;
        string2 = string11;
        object2 = string10;
        object3 = fnlColorVariantData;
        string3 = string9;
        object4 = string8;
        object5 = list;
        object6 = bl2;
        object7 = string7;
        object8 = offerPrice;
        object9 = price;
        object10 = promotion;
        string4 = string6;
        object11 = string5;
        object12 = wasPriceData;
        this(string11, string10, fnlColorVariantData, string9, string8, list, bl2, string7, offerPrice, price, promotion, string6, string5, wasPriceData, n8);
    }

    public static /* synthetic */ InnerResource copy$default(InnerResource innerResource, String string2, String string3, FnlColorVariantData fnlColorVariantData, String string4, String string5, List list, Boolean bl2, String string6, OfferPrice offerPrice, Price price, Promotion promotion, String string7, String string8, WasPriceData wasPriceData, Integer n3, int n4, Object object) {
        InnerResource innerResource2 = innerResource;
        int n7 = n4;
        int n8 = n4 & 1;
        String string9 = n8 != 0 ? innerResource.description : string2;
        int n10 = n7 & 2;
        String string10 = n10 != 0 ? innerResource2.discountPercent : string3;
        int n14 = n7 & 4;
        FnlColorVariantData fnlColorVariantData2 = n14 != 0 ? innerResource2.fnlColorVariantData : fnlColorVariantData;
        int n15 = n7 & 8;
        String string11 = n15 != 0 ? innerResource2.id : string4;
        int n16 = n7 & 0x10;
        String string12 = n16 != 0 ? innerResource2.imageUrl : string5;
        int n17 = n7 & 0x20;
        List list2 = n17 != 0 ? innerResource2.images : list;
        int n18 = n7 & 0x40;
        Boolean bl3 = n18 != 0 ? innerResource2.isWishlisted : bl2;
        int n19 = n7 & 0x80;
        String string13 = n19 != 0 ? innerResource2.name : string6;
        int n20 = n7 & 0x100;
        OfferPrice offerPrice2 = n20 != 0 ? innerResource2.offerPrice : offerPrice;
        int n21 = n7 & 0x200;
        Price price2 = n21 != 0 ? innerResource2.price : price;
        int n22 = n7 & 0x400;
        Promotion promotion2 = n22 != 0 ? innerResource2.promotion : promotion;
        int n24 = n7 & 0x800;
        String string14 = n24 != 0 ? innerResource2.resourceUrl : string7;
        int n25 = n7 & 0x1000;
        String string15 = n25 != 0 ? innerResource2.type : string8;
        int n26 = n7 & 0x2000;
        WasPriceData wasPriceData2 = n26 != 0 ? innerResource2.wasPriceData : wasPriceData;
        Integer n27 = (n7 &= 0x4000) != 0 ? innerResource2.wishlistCount : n3;
        string2 = string9;
        string3 = string10;
        fnlColorVariantData = fnlColorVariantData2;
        string4 = string11;
        string5 = string12;
        list = list2;
        bl2 = bl3;
        string6 = string13;
        offerPrice = offerPrice2;
        price = price2;
        promotion = promotion2;
        string7 = string14;
        string8 = string15;
        wasPriceData = wasPriceData2;
        n3 = n27;
        return innerResource.copy(string9, string10, fnlColorVariantData2, string11, string12, list2, bl3, string13, offerPrice2, price2, promotion2, string14, string15, wasPriceData2, n27);
    }

    public final String component1() {
        return this.description;
    }

    public final Price component10() {
        return this.price;
    }

    public final Promotion component11() {
        return this.promotion;
    }

    public final String component12() {
        return this.resourceUrl;
    }

    public final String component13() {
        return this.type;
    }

    public final WasPriceData component14() {
        return this.wasPriceData;
    }

    public final Integer component15() {
        return this.wishlistCount;
    }

    public final String component2() {
        return this.discountPercent;
    }

    public final FnlColorVariantData component3() {
        return this.fnlColorVariantData;
    }

    public final String component4() {
        return this.id;
    }

    public final String component5() {
        return this.imageUrl;
    }

    public final List component6() {
        return this.images;
    }

    public final Boolean component7() {
        return this.isWishlisted;
    }

    public final String component8() {
        return this.name;
    }

    public final OfferPrice component9() {
        return this.offerPrice;
    }

    public final InnerResource copy(String string2, String string3, FnlColorVariantData fnlColorVariantData, String string4, String string5, List list, Boolean bl2, String string6, OfferPrice offerPrice, Price price, Promotion promotion, String string7, String string8, WasPriceData wasPriceData, Integer n3) {
        InnerResource innerResource = new InnerResource(string2, string3, fnlColorVariantData, string4, string5, list, bl2, string6, offerPrice, price, promotion, string7, string8, wasPriceData, n3);
        return innerResource;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof InnerResource;
        if (!bl3) {
            return false;
        }
        object = (InnerResource)object;
        Object object2 = this.description;
        Object object3 = ((InnerResource)object).description;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.discountPercent;
        object3 = ((InnerResource)object).discountPercent;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.fnlColorVariantData;
        object3 = ((InnerResource)object).fnlColorVariantData;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.id;
        object3 = ((InnerResource)object).id;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageUrl;
        object3 = ((InnerResource)object).imageUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.images;
        object3 = ((InnerResource)object).images;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isWishlisted;
        object3 = ((InnerResource)object).isWishlisted;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.name;
        object3 = ((InnerResource)object).name;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerPrice;
        object3 = ((InnerResource)object).offerPrice;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.price;
        object3 = ((InnerResource)object).price;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.promotion;
        object3 = ((InnerResource)object).promotion;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.resourceUrl;
        object3 = ((InnerResource)object).resourceUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.type;
        object3 = ((InnerResource)object).type;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.wasPriceData;
        object3 = ((InnerResource)object).wasPriceData;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.wishlistCount;
        object = ((InnerResource)object).wishlistCount;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDiscountPercent() {
        return this.discountPercent;
    }

    public final FnlColorVariantData getFnlColorVariantData() {
        return this.fnlColorVariantData;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List getImages() {
        return this.images;
    }

    public final String getName() {
        return this.name;
    }

    public final OfferPrice getOfferPrice() {
        return this.offerPrice;
    }

    public final Price getPrice() {
        return this.price;
    }

    public final Promotion getPromotion() {
        return this.promotion;
    }

    public final String getResourceUrl() {
        return this.resourceUrl;
    }

    public final String getType() {
        return this.type;
    }

    public final WasPriceData getWasPriceData() {
        return this.wasPriceData;
    }

    public final Integer getWishlistCount() {
        return this.wishlistCount;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.description;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.discountPercent;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.fnlColorVariantData;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((FnlColorVariantData)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.id;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.imageUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.images;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isWishlisted;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.name;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.offerPrice;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((OfferPrice)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.price;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Price)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.promotion;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Promotion)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.resourceUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.type;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.wasPriceData;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((WasPriceData)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.wishlistCount;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isWishlisted() {
        return this.isWishlisted;
    }

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setDiscountPercent(String string2) {
        this.discountPercent = string2;
    }

    public final void setFnlColorVariantData(FnlColorVariantData fnlColorVariantData) {
        this.fnlColorVariantData = fnlColorVariantData;
    }

    public final void setId(String string2) {
        this.id = string2;
    }

    public final void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public final void setImages(List list) {
        this.images = list;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setOfferPrice(OfferPrice offerPrice) {
        this.offerPrice = offerPrice;
    }

    public final void setPrice(Price price) {
        this.price = price;
    }

    public final void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public final void setResourceUrl(String string2) {
        this.resourceUrl = string2;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public final void setWasPriceData(WasPriceData wasPriceData) {
        this.wasPriceData = wasPriceData;
    }

    public final void setWishlistCount(Integer n3) {
        this.wishlistCount = n3;
    }

    public final void setWishlisted(Boolean bl2) {
        this.isWishlisted = bl2;
    }

    public String toString() {
        Object object = this;
        Object object2 = this.description;
        String string2 = this.discountPercent;
        FnlColorVariantData fnlColorVariantData = this.fnlColorVariantData;
        String string3 = this.id;
        String string4 = this.imageUrl;
        List list = this.images;
        Boolean bl2 = this.isWishlisted;
        String string5 = this.name;
        OfferPrice offerPrice = this.offerPrice;
        Price price = this.price;
        Promotion promotion = this.promotion;
        String string6 = this.resourceUrl;
        String string7 = this.type;
        WasPriceData wasPriceData = this.wasPriceData;
        Integer n3 = this.wishlistCount;
        object = og_1.a("InnerResource(description=", (String)object2, ", discountPercent=", string2, ", fnlColorVariantData=");
        ((StringBuilder)object).append(fnlColorVariantData);
        ((StringBuilder)object).append(", id=");
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append(", imageUrl=");
        ((StringBuilder)object).append(string4);
        ((StringBuilder)object).append(", images=");
        ((StringBuilder)object).append(list);
        ((StringBuilder)object).append(", isWishlisted=");
        xi0_2.a(bl2, ", name=", string5, ", offerPrice=", (StringBuilder)object);
        ((StringBuilder)object).append(offerPrice);
        ((StringBuilder)object).append(", price=");
        ((StringBuilder)object).append(price);
        ((StringBuilder)object).append(", promotion=");
        ((StringBuilder)object).append(promotion);
        ((StringBuilder)object).append(", resourceUrl=");
        ((StringBuilder)object).append(string6);
        ((StringBuilder)object).append(", type=");
        ((StringBuilder)object).append(string7);
        ((StringBuilder)object).append(", wasPriceData=");
        object2 = wasPriceData;
        ((StringBuilder)object).append(wasPriceData);
        ((StringBuilder)object).append(", wishlistCount=");
        object2 = n3;
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }
}

