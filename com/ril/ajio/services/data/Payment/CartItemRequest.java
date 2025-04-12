/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Product.StockInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CartItemRequest {
    private String brand;
    private String brick;
    private String catalogId;
    private String category;
    private String name;
    private Float price;
    private Integer quantity;
    private String season;
    private String skuId;
    private String sourceStoreId;
    private StockInfo stockInfo;
    private String subCategory;
    private String thumbnailImgUrl;

    public CartItemRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public CartItemRequest(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Float f5, Integer n3, String string10, String string11, StockInfo stockInfo) {
        this.name = string2;
        this.skuId = string3;
        this.catalogId = string4;
        this.category = string5;
        this.subCategory = string6;
        this.brick = string7;
        this.brand = string8;
        this.season = string9;
        this.price = f5;
        this.quantity = n3;
        this.thumbnailImgUrl = string10;
        this.sourceStoreId = string11;
        this.stockInfo = stockInfo;
    }

    public /* synthetic */ CartItemRequest(String object, String string2, String string3, String string4, String string5, String string6, String string7, String string8, Float object2, Integer number, String object3, String string9, StockInfo object4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string10;
        String string11;
        Integer n4;
        Float f5;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        String string19;
        int n7 = n3;
        int n8 = n3 & 1;
        StockInfo stockInfo = null;
        if (n8 != 0) {
            n8 = 0;
            string19 = null;
        } else {
            string19 = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            string18 = null;
        } else {
            string18 = string2;
        }
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            string17 = null;
        } else {
            string17 = string3;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            string16 = null;
        } else {
            string16 = string4;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            string15 = null;
        } else {
            string15 = string5;
        }
        int n17 = n7 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            string14 = null;
        } else {
            string14 = string6;
        }
        int n18 = n7 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            string13 = null;
        } else {
            string13 = string7;
        }
        int n19 = n7 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            string12 = null;
        } else {
            string12 = string8;
        }
        int n20 = n7 & 0x100;
        if (n20 != 0) {
            n20 = 0;
            f5 = Float.valueOf(0.0f);
        } else {
            f5 = object2;
        }
        int n21 = n7 & 0x200;
        if (n21 != 0) {
            n21 = 0;
            n4 = 0;
        } else {
            n4 = number;
        }
        int n22 = n7 & 0x400;
        if (n22 != 0) {
            n22 = 0;
            string11 = null;
        } else {
            string11 = object3;
        }
        int n24 = n7 & 0x800;
        if (n24 != 0) {
            n24 = 0;
            string10 = null;
        } else {
            string10 = string9;
        }
        if ((n7 &= 0x1000) == 0) {
            stockInfo = object4;
        }
        object = this;
        string2 = string19;
        string3 = string18;
        string4 = string17;
        string5 = string16;
        string6 = string15;
        string7 = string14;
        string8 = string13;
        object2 = string12;
        number = f5;
        object3 = n4;
        string9 = string11;
        object4 = string10;
        this(string19, string18, string17, string16, string15, string14, string13, string12, f5, n4, string11, string10, stockInfo);
    }

    public static /* synthetic */ CartItemRequest copy$default(CartItemRequest cartItemRequest, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Float f5, Integer n3, String string10, String string11, StockInfo stockInfo, int n4, Object object) {
        CartItemRequest cartItemRequest2 = cartItemRequest;
        int n7 = n4;
        int n8 = n4 & 1;
        String string12 = n8 != 0 ? cartItemRequest.name : string2;
        int n10 = n7 & 2;
        String string13 = n10 != 0 ? cartItemRequest2.skuId : string3;
        int n14 = n7 & 4;
        String string14 = n14 != 0 ? cartItemRequest2.catalogId : string4;
        int n15 = n7 & 8;
        String string15 = n15 != 0 ? cartItemRequest2.category : string5;
        int n16 = n7 & 0x10;
        String string16 = n16 != 0 ? cartItemRequest2.subCategory : string6;
        int n17 = n7 & 0x20;
        String string17 = n17 != 0 ? cartItemRequest2.brick : string7;
        int n18 = n7 & 0x40;
        String string18 = n18 != 0 ? cartItemRequest2.brand : string8;
        int n19 = n7 & 0x80;
        String string19 = n19 != 0 ? cartItemRequest2.season : string9;
        int n20 = n7 & 0x100;
        Float f6 = n20 != 0 ? cartItemRequest2.price : f5;
        int n21 = n7 & 0x200;
        Integer n22 = n21 != 0 ? cartItemRequest2.quantity : n3;
        int n24 = n7 & 0x400;
        String string20 = n24 != 0 ? cartItemRequest2.thumbnailImgUrl : string10;
        int n25 = n7 & 0x800;
        String string21 = n25 != 0 ? cartItemRequest2.sourceStoreId : string11;
        StockInfo stockInfo2 = (n7 &= 0x1000) != 0 ? cartItemRequest2.stockInfo : stockInfo;
        string2 = string12;
        string3 = string13;
        string4 = string14;
        string5 = string15;
        string6 = string16;
        string7 = string17;
        string8 = string18;
        string9 = string19;
        f5 = f6;
        n3 = n22;
        string10 = string20;
        string11 = string21;
        stockInfo = stockInfo2;
        return cartItemRequest.copy(string12, string13, string14, string15, string16, string17, string18, string19, f6, n22, string20, string21, stockInfo2);
    }

    public final String component1() {
        return this.name;
    }

    public final Integer component10() {
        return this.quantity;
    }

    public final String component11() {
        return this.thumbnailImgUrl;
    }

    public final String component12() {
        return this.sourceStoreId;
    }

    public final StockInfo component13() {
        return this.stockInfo;
    }

    public final String component2() {
        return this.skuId;
    }

    public final String component3() {
        return this.catalogId;
    }

    public final String component4() {
        return this.category;
    }

    public final String component5() {
        return this.subCategory;
    }

    public final String component6() {
        return this.brick;
    }

    public final String component7() {
        return this.brand;
    }

    public final String component8() {
        return this.season;
    }

    public final Float component9() {
        return this.price;
    }

    public final CartItemRequest copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Float f5, Integer n3, String string10, String string11, StockInfo stockInfo) {
        CartItemRequest cartItemRequest = new CartItemRequest(string2, string3, string4, string5, string6, string7, string8, string9, f5, n3, string10, string11, stockInfo);
        return cartItemRequest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CartItemRequest;
        if (!bl3) {
            return false;
        }
        object = (CartItemRequest)object;
        Object object2 = this.name;
        Object object3 = ((CartItemRequest)object).name;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.skuId;
        object3 = ((CartItemRequest)object).skuId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.catalogId;
        object3 = ((CartItemRequest)object).catalogId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.category;
        object3 = ((CartItemRequest)object).category;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subCategory;
        object3 = ((CartItemRequest)object).subCategory;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brick;
        object3 = ((CartItemRequest)object).brick;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brand;
        object3 = ((CartItemRequest)object).brand;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.season;
        object3 = ((CartItemRequest)object).season;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.price;
        object3 = ((CartItemRequest)object).price;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.quantity;
        object3 = ((CartItemRequest)object).quantity;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.thumbnailImgUrl;
        object3 = ((CartItemRequest)object).thumbnailImgUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.sourceStoreId;
        object3 = ((CartItemRequest)object).sourceStoreId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.stockInfo;
        object = ((CartItemRequest)object).stockInfo;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getBrick() {
        return this.brick;
    }

    public final String getCatalogId() {
        return this.catalogId;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getName() {
        return this.name;
    }

    public final Float getPrice() {
        return this.price;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final String getSeason() {
        return this.season;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    public final String getSourceStoreId() {
        return this.sourceStoreId;
    }

    public final StockInfo getStockInfo() {
        return this.stockInfo;
    }

    public final String getSubCategory() {
        return this.subCategory;
    }

    public final String getThumbnailImgUrl() {
        return this.thumbnailImgUrl;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.name;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.skuId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.catalogId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.category;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.subCategory;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brick;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brand;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.season;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.price;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.quantity;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.thumbnailImgUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.sourceStoreId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.stockInfo;
        if (object != null) {
            n7 = ((StockInfo)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setBrand(String string2) {
        this.brand = string2;
    }

    public final void setBrick(String string2) {
        this.brick = string2;
    }

    public final void setCatalogId(String string2) {
        this.catalogId = string2;
    }

    public final void setCategory(String string2) {
        this.category = string2;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setPrice(Float f5) {
        this.price = f5;
    }

    public final void setQuantity(Integer n3) {
        this.quantity = n3;
    }

    public final void setSeason(String string2) {
        this.season = string2;
    }

    public final void setSkuId(String string2) {
        this.skuId = string2;
    }

    public final void setSourceStoreId(String string2) {
        this.sourceStoreId = string2;
    }

    public final void setStockInfo(StockInfo stockInfo) {
        this.stockInfo = stockInfo;
    }

    public final void setSubCategory(String string2) {
        this.subCategory = string2;
    }

    public final void setThumbnailImgUrl(String string2) {
        this.thumbnailImgUrl = string2;
    }

    public String toString() {
        Object object = this;
        String string2 = this.name;
        String string3 = this.skuId;
        String string4 = this.catalogId;
        String string5 = this.category;
        String string6 = this.subCategory;
        String string7 = this.brick;
        String string8 = this.brand;
        String string9 = this.season;
        Float f5 = this.price;
        Integer n3 = this.quantity;
        String string10 = this.thumbnailImgUrl;
        String string11 = this.sourceStoreId;
        StockInfo stockInfo = this.stockInfo;
        object = og_1.a("CartItemRequest(name=", string2, ", skuId=", string3, ", catalogId=");
        X50.a((StringBuilder)object, string4, ", category=", string5, ", subCategory=");
        X50.a((StringBuilder)object, string6, ", brick=", string7, ", brand=");
        X50.a((StringBuilder)object, string8, ", season=", string9, ", price=");
        ((StringBuilder)object).append(f5);
        ((StringBuilder)object).append(", quantity=");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(", thumbnailImgUrl=");
        X50.a((StringBuilder)object, string10, ", sourceStoreId=", string11, ", stockInfo=");
        ((StringBuilder)object).append(stockInfo);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }
}

