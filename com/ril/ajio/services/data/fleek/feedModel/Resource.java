/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import com.ril.ajio.services.data.fleek.feedModel.FnlColorVariantData;
import com.ril.ajio.services.data.fleek.feedModel.OfferPrice;
import com.ril.ajio.services.data.fleek.feedModel.PostData;
import com.ril.ajio.services.data.fleek.feedModel.Price;
import com.ril.ajio.services.data.fleek.feedModel.Promotion;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.WasPriceData;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Resource {
    private String code;
    private String description;
    private String discountPercent;
    private FnlColorVariantData fnlColorVariantData;
    private String id;
    private String imageUrl;
    private List images;
    private boolean isGaFiredInCurrentSession;
    private Boolean isWishlisted;
    private String name;
    private OfferPrice offerPrice;
    private PostData postData;
    private Price price;
    private Promotion promotion;
    private ResourceOwner resourceOwner;
    private String resourceUrl;
    private String title;
    private String type;
    private WasPriceData wasPriceData;
    private Integer wishlistCount;

    public Resource() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 1048575, null);
    }

    public Resource(String string2, String string3, FnlColorVariantData fnlColorVariantData, String string4, List list, String string5, OfferPrice offerPrice, PostData postData, Price price, ResourceOwner resourceOwner, String string6, WasPriceData wasPriceData, String string7, String string8, String string9, Promotion promotion, Integer n3, Boolean bl2, String string10, boolean bl3) {
        this.code = string2;
        this.discountPercent = string3;
        this.fnlColorVariantData = fnlColorVariantData;
        this.id = string4;
        this.images = list;
        this.name = string5;
        this.offerPrice = offerPrice;
        this.postData = postData;
        this.price = price;
        this.resourceOwner = resourceOwner;
        this.type = string6;
        this.wasPriceData = wasPriceData;
        this.title = string7;
        this.description = string8;
        this.resourceUrl = string9;
        this.promotion = promotion;
        this.wishlistCount = n3;
        this.isWishlisted = bl2;
        this.imageUrl = string10;
        this.isGaFiredInCurrentSession = bl3;
    }

    public /* synthetic */ Resource(String object, String string2, FnlColorVariantData object2, String object3, List object4, String object5, OfferPrice object6, PostData object7, Price object8, ResourceOwner object9, String object10, WasPriceData object11, String object12, String string3, String string4, Promotion object13, Integer object14, Boolean comparable, String object15, boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string5;
        Integer n4;
        Promotion promotion;
        String string6;
        String string7;
        String string8;
        WasPriceData wasPriceData;
        String string9;
        ResourceOwner resourceOwner;
        Price price;
        PostData postData;
        OfferPrice offerPrice;
        String string10;
        List list;
        String string11;
        FnlColorVariantData fnlColorVariantData;
        String string12;
        String string13;
        int n7 = n3;
        int n8 = n3 & 1;
        if (n8 != 0) {
            n8 = 0;
            string13 = null;
        } else {
            string13 = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            string12 = null;
        } else {
            string12 = string2;
        }
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            fnlColorVariantData = null;
        } else {
            fnlColorVariantData = object2;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            string11 = null;
        } else {
            string11 = object3;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            list = null;
        } else {
            list = object4;
        }
        int n17 = n7 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            string10 = null;
        } else {
            string10 = object5;
        }
        int n18 = n7 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            offerPrice = null;
        } else {
            offerPrice = object6;
        }
        int n19 = n7 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            postData = null;
        } else {
            postData = object7;
        }
        int n20 = n7 & 0x100;
        if (n20 != 0) {
            n20 = 0;
            price = null;
        } else {
            price = object8;
        }
        int n21 = n7 & 0x200;
        if (n21 != 0) {
            n21 = 0;
            resourceOwner = null;
        } else {
            resourceOwner = object9;
        }
        int n22 = n7 & 0x400;
        if (n22 != 0) {
            n22 = 0;
            string9 = null;
        } else {
            string9 = object10;
        }
        int n24 = n7 & 0x800;
        if (n24 != 0) {
            n24 = 0;
            wasPriceData = null;
        } else {
            wasPriceData = object11;
        }
        int n25 = n7 & 0x1000;
        if (n25 != 0) {
            n25 = 0;
            string8 = null;
        } else {
            string8 = object12;
        }
        int n26 = n7 & 0x2000;
        if (n26 != 0) {
            n26 = 0;
            string7 = null;
        } else {
            string7 = string3;
        }
        int n27 = n7 & 0x4000;
        if (n27 != 0) {
            n27 = 0;
            string6 = null;
        } else {
            string6 = string4;
        }
        int n28 = n7 & 0x8000;
        if (n28 != 0) {
            n28 = 0;
            promotion = null;
        } else {
            promotion = object13;
        }
        int n29 = n7 & 0x10000;
        if (n29 != 0) {
            n29 = 0;
            n4 = null;
        } else {
            n4 = object14;
        }
        int n30 = n7 & 0x20000;
        Boolean bl3 = n30 != 0 ? Boolean.FALSE : comparable;
        int n32 = n7 & 0x40000;
        if (n32 != 0) {
            n32 = 0;
            string5 = null;
        } else {
            string5 = object15;
        }
        int n34 = 524288;
        n7 = (n7 &= n34) != 0 ? 0 : (int)(bl2 ? 1 : 0);
        object = this;
        string2 = string13;
        object2 = string12;
        object3 = fnlColorVariantData;
        object4 = string11;
        object5 = list;
        object6 = string10;
        object7 = offerPrice;
        object8 = postData;
        object9 = price;
        object10 = resourceOwner;
        object11 = string9;
        object12 = wasPriceData;
        string3 = string8;
        string4 = string7;
        object13 = string6;
        object14 = promotion;
        comparable = n4;
        object15 = bl3;
        n3 = n7;
        this(string13, string12, fnlColorVariantData, string11, list, string10, offerPrice, postData, price, resourceOwner, string9, wasPriceData, string8, string7, string6, promotion, n4, bl3, string5, n7 != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ Resource copy$default(Resource resource, String string2, String string3, FnlColorVariantData fnlColorVariantData, String string4, List list, String string5, OfferPrice offerPrice, PostData postData, Price price, ResourceOwner resourceOwner, String string6, WasPriceData wasPriceData, String string7, String string8, String string9, Promotion object, Integer object2, Boolean object3, String object4, boolean bl2, int n3, Object object5) {
        void var21_22;
        Resource resource2 = resource;
        int bl3 = var21_22;
        int n4 = var21_22 & 1;
        String string10 = n4 != 0 ? resource.code : string2;
        int n7 = bl3 & 2;
        String string11 = n7 != 0 ? resource2.discountPercent : string3;
        int n8 = bl3 & 4;
        FnlColorVariantData fnlColorVariantData2 = n8 != 0 ? resource2.fnlColorVariantData : fnlColorVariantData;
        int n10 = bl3 & 8;
        String string12 = n10 != 0 ? resource2.id : string4;
        int n14 = bl3 & 0x10;
        List list2 = n14 != 0 ? resource2.images : list;
        int n15 = bl3 & 0x20;
        String string13 = n15 != 0 ? resource2.name : string5;
        int n16 = bl3 & 0x40;
        OfferPrice offerPrice2 = n16 != 0 ? resource2.offerPrice : offerPrice;
        int n17 = bl3 & 0x80;
        PostData postData2 = n17 != 0 ? resource2.postData : postData;
        int n18 = bl3 & 0x100;
        Price price2 = n18 != 0 ? resource2.price : price;
        int n19 = bl3 & 0x200;
        ResourceOwner resourceOwner2 = n19 != 0 ? resource2.resourceOwner : resourceOwner;
        int n20 = bl3 & 0x400;
        String string14 = n20 != 0 ? resource2.type : string6;
        int n21 = bl3 & 0x800;
        WasPriceData wasPriceData2 = n21 != 0 ? resource2.wasPriceData : wasPriceData;
        int n22 = bl3 & 0x1000;
        String string15 = n22 != 0 ? resource2.title : string7;
        int n24 = bl3 & 0x2000;
        Object object6 = n24 != 0 ? resource2.description : string8;
        string8 = object6;
        n24 = bl3 & 0x4000;
        object6 = n24 != 0 ? resource2.resourceUrl : string9;
        int n25 = bl3 & 0x8000;
        string9 = object6;
        object6 = n25 != 0 ? resource2.promotion : object;
        n25 = bl3 & 0x10000;
        object = object6;
        object6 = n25 != 0 ? resource2.wishlistCount : object2;
        n25 = bl3 & 0x20000;
        object2 = object6;
        object6 = n25 != 0 ? resource2.isWishlisted : object3;
        n25 = bl3 & 0x40000;
        object3 = object6;
        object6 = n25 != 0 ? resource2.imageUrl : object4;
        n25 = 524288;
        bl3 = (bl3 &= n25) ? (int)resource2.isGaFiredInCurrentSession : (int)bl2;
        string2 = string10;
        string3 = string11;
        fnlColorVariantData = fnlColorVariantData2;
        string4 = string12;
        list = list2;
        string5 = string13;
        offerPrice = offerPrice2;
        postData = postData2;
        price = price2;
        resourceOwner = resourceOwner2;
        string6 = string14;
        wasPriceData = wasPriceData2;
        string7 = string15;
        object4 = object6;
        int bl4 = bl3;
        return resource.copy(string10, string11, fnlColorVariantData2, string12, list2, string13, offerPrice2, postData2, price2, resourceOwner2, string14, wasPriceData2, string15, string8, string9, (Promotion)object, (Integer)object2, (Boolean)object3, (String)object6, (boolean)bl3);
    }

    public final String component1() {
        return this.code;
    }

    public final ResourceOwner component10() {
        return this.resourceOwner;
    }

    public final String component11() {
        return this.type;
    }

    public final WasPriceData component12() {
        return this.wasPriceData;
    }

    public final String component13() {
        return this.title;
    }

    public final String component14() {
        return this.description;
    }

    public final String component15() {
        return this.resourceUrl;
    }

    public final Promotion component16() {
        return this.promotion;
    }

    public final Integer component17() {
        return this.wishlistCount;
    }

    public final Boolean component18() {
        return this.isWishlisted;
    }

    public final String component19() {
        return this.imageUrl;
    }

    public final String component2() {
        return this.discountPercent;
    }

    public final boolean component20() {
        return this.isGaFiredInCurrentSession;
    }

    public final FnlColorVariantData component3() {
        return this.fnlColorVariantData;
    }

    public final String component4() {
        return this.id;
    }

    public final List component5() {
        return this.images;
    }

    public final String component6() {
        return this.name;
    }

    public final OfferPrice component7() {
        return this.offerPrice;
    }

    public final PostData component8() {
        return this.postData;
    }

    public final Price component9() {
        return this.price;
    }

    public final Resource copy(String string2, String string3, FnlColorVariantData fnlColorVariantData, String string4, List list, String string5, OfferPrice offerPrice, PostData postData, Price price, ResourceOwner resourceOwner, String string6, WasPriceData wasPriceData, String string7, String string8, String string9, Promotion promotion, Integer n3, Boolean bl2, String string10, boolean bl3) {
        Resource resource = new Resource(string2, string3, fnlColorVariantData, string4, list, string5, offerPrice, postData, price, resourceOwner, string6, wasPriceData, string7, string8, string9, promotion, n3, bl2, string10, bl3);
        return resource;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof Resource;
        boolean bl4 = false;
        if (!bl3) {
            return false;
        }
        String string2 = this.id;
        object = (Resource)object;
        String string3 = ((Resource)object).id;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (bl3 && (bl2 = Intrinsics.areEqual(string2 = this.code, object = ((Resource)object).code))) {
            bl4 = true;
        }
        return bl4;
    }

    public final String getCode() {
        return this.code;
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

    public final PostData getPostData() {
        return this.postData;
    }

    public final Price getPrice() {
        return this.price;
    }

    public final Promotion getPromotion() {
        return this.promotion;
    }

    public final ResourceOwner getResourceOwner() {
        return this.resourceOwner;
    }

    public final String getResourceUrl() {
        return this.resourceUrl;
    }

    public final String getTitle() {
        return this.title;
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
        String string2 = this.code;
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
        object = this.images;
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
        object = this.postData;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((PostData)object).hashCode();
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
        object = this.resourceOwner;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ResourceOwner)object).hashCode();
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
        object = this.title;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.description;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
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
        object = this.promotion;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Promotion)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.wishlistCount;
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
        object = this.imageUrl;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.isGaFiredInCurrentSession ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        return n4 + n7;
    }

    public final boolean isGaFiredInCurrentSession() {
        return this.isGaFiredInCurrentSession;
    }

    public final Boolean isWishlisted() {
        return this.isWishlisted;
    }

    public final void setCode(String string2) {
        this.code = string2;
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

    public final void setGaFiredInCurrentSession(boolean bl2) {
        this.isGaFiredInCurrentSession = bl2;
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

    public final void setPostData(PostData postData) {
        this.postData = postData;
    }

    public final void setPrice(Price price) {
        this.price = price;
    }

    public final void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public final void setResourceOwner(ResourceOwner resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    public final void setResourceUrl(String string2) {
        this.resourceUrl = string2;
    }

    public final void setTitle(String string2) {
        this.title = string2;
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
        Object object2 = this.code;
        String string2 = this.discountPercent;
        Object object3 = this.fnlColorVariantData;
        String string3 = this.id;
        List list = this.images;
        String string4 = this.name;
        OfferPrice offerPrice = this.offerPrice;
        PostData postData = this.postData;
        Price price = this.price;
        ResourceOwner resourceOwner = this.resourceOwner;
        String string5 = this.type;
        WasPriceData wasPriceData = this.wasPriceData;
        String string6 = this.title;
        String string7 = this.description;
        String string8 = this.resourceUrl;
        Promotion promotion = this.promotion;
        Integer n3 = this.wishlistCount;
        Boolean bl2 = this.isWishlisted;
        String string9 = this.imageUrl;
        boolean bl3 = this.isGaFiredInCurrentSession;
        object = og_1.a("Resource(code=", (String)object2, ", discountPercent=", string2, ", fnlColorVariantData=");
        ((StringBuilder)object).append(object3);
        ((StringBuilder)object).append(", id=");
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append(", images=");
        ((StringBuilder)object).append(list);
        ((StringBuilder)object).append(", name=");
        ((StringBuilder)object).append(string4);
        ((StringBuilder)object).append(", offerPrice=");
        ((StringBuilder)object).append(offerPrice);
        ((StringBuilder)object).append(", postData=");
        ((StringBuilder)object).append(postData);
        ((StringBuilder)object).append(", price=");
        ((StringBuilder)object).append(price);
        ((StringBuilder)object).append(", resourceOwner=");
        ((StringBuilder)object).append(resourceOwner);
        ((StringBuilder)object).append(", type=");
        ((StringBuilder)object).append(string5);
        ((StringBuilder)object).append(", wasPriceData=");
        ((StringBuilder)object).append(wasPriceData);
        ((StringBuilder)object).append(", title=");
        object3 = string6;
        X50.a((StringBuilder)object, string6, ", description=", string7, ", resourceUrl=");
        object2 = string8;
        ((StringBuilder)object).append(string8);
        ((StringBuilder)object).append(", promotion=");
        object2 = promotion;
        ((StringBuilder)object).append(promotion);
        ((StringBuilder)object).append(", wishlistCount=");
        object2 = n3;
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(", isWishlisted=");
        object2 = bl2;
        ((StringBuilder)object).append(bl2);
        ((StringBuilder)object).append(", imageUrl=");
        object2 = string9;
        ((StringBuilder)object).append(string9);
        ((StringBuilder)object).append(", isGaFiredInCurrentSession=");
        ((StringBuilder)object).append(bl3);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }
}

