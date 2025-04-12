/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductOptionVariant$Creator;
import com.ril.ajio.services.data.Product.ProductSwatchImage;
import com.ril.ajio.services.data.flashsale.pdp.ModelImage;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ProductOptionVariant
implements Serializable,
Parcelable,
Cloneable {
    public static final Parcelable.Creator CREATOR;
    private String attributeName;
    private String attributeValue;
    private String batchID;
    private String brandSizeFormat;
    private String brandValue;
    private String brickBrandSize;
    private String code;
    private String color;
    private String commercialType;
    private ProductImage image;
    private boolean isHighlighted;
    private boolean isSelected;
    private boolean isStockAvailable;
    private ModelImage modelImage;
    private String name;
    private Price priceData;
    private String qualifier;
    private String sizeDisplayType;
    private String sizeValue;
    private int stockLevel;
    private ProductSwatchImage swatchImage;
    private String thumbnail;
    private String universalSizeFormat;
    private String universalSizeValue;
    private String value;
    private Price wasPriceData;

    static {
        ProductOptionVariant$Creator productOptionVariant$Creator = new ProductOptionVariant$Creator();
        CREATOR = productOptionVariant$Creator;
    }

    public ProductOptionVariant() {
        this(null, null, null, null, null, null, false, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x3FFFFFF, null);
    }

    public ProductOptionVariant(String string2, String string3, String string4, String string5, ProductImage productImage, ProductSwatchImage productSwatchImage, boolean bl2, boolean bl3, boolean bl4, String string6, String string7, int n3, Price price, Price price2, ModelImage modelImage, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18) {
        this.name = string2;
        this.value = string3;
        this.brandValue = string4;
        this.qualifier = string5;
        this.image = productImage;
        this.swatchImage = productSwatchImage;
        this.isSelected = bl2;
        this.isHighlighted = bl3;
        this.isStockAvailable = bl4;
        this.color = string6;
        this.code = string7;
        this.stockLevel = n3;
        this.priceData = price;
        this.wasPriceData = price2;
        this.modelImage = modelImage;
        this.sizeDisplayType = string8;
        this.universalSizeValue = string9;
        this.brandSizeFormat = string10;
        this.universalSizeFormat = string11;
        this.sizeValue = string12;
        this.attributeName = string13;
        this.attributeValue = string14;
        this.thumbnail = string15;
        this.brickBrandSize = string16;
        this.commercialType = string17;
        this.batchID = string18;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ ProductOptionVariant(String object, String string2, String string3, String string4, ProductImage object2, ProductSwatchImage parcelable, boolean bl2, boolean bl3, boolean bl4, String string5, String string6, int n3, Price price, Price price2, ModelImage parcelable2, String object3, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        void var46_55;
        void var45_51;
        void var43_46;
        String string17;
        String string18;
        String string19;
        String string20;
        Price price3;
        Price price4;
        String string21;
        String string22;
        Parcelable productSwatchImage;
        Object productImage;
        String string23;
        String string24;
        Object string25;
        int n7 = n4;
        int n8 = n4 & 1;
        if (n8 != 0) {
            n8 = 0;
            string25 = null;
        } else {
            string25 = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            string24 = null;
        } else {
            string24 = string2;
        }
        int n14 = n7 & 4;
        String object4 = "";
        String object5 = n14 != 0 ? object4 : string3;
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            string23 = null;
        } else {
            string23 = string4;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            productImage = null;
        } else {
            productImage = object2;
        }
        int n17 = n7 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            productSwatchImage = null;
        } else {
            productSwatchImage = parcelable;
        }
        int bl5 = n7 & 0x40;
        int n18 = 0;
        if (bl5 != 0) {
            boolean bl6 = false;
        } else {
            boolean bl7 = bl2;
        }
        int n19 = n7 & 0x80;
        if (n19 != 0) {
            boolean bl8 = false;
        } else {
            boolean bl9 = bl3;
        }
        int n20 = n7 & 0x100;
        if (n20 != 0) {
            boolean bl10 = false;
        } else {
            boolean bl11 = bl4;
        }
        int n21 = n7 & 0x200;
        if (n21 != 0) {
            n21 = 0;
            string22 = null;
        } else {
            string22 = string5;
        }
        int n22 = n7 & 0x400;
        if (n22 != 0) {
            n22 = 0;
            string21 = null;
        } else {
            string21 = string6;
        }
        int n24 = n7 & 0x800;
        if (n24 == 0) {
            n18 = n3;
        }
        n24 = n7 & 0x1000;
        if (n24 != 0) {
            n24 = 0;
            price4 = null;
        } else {
            price4 = price;
        }
        int n25 = n7 & 0x2000;
        if (n25 != 0) {
            n25 = 0;
            price3 = null;
        } else {
            price3 = price2;
        }
        object = object4;
        int n26 = n7 & 0x4000;
        if (n26 != 0) {
            n26 = 0;
            object4 = null;
        } else {
            object4 = parcelable2;
        }
        int n27 = n7 & 0x8000;
        Object object6 = n27 != 0 ? object : object3;
        int n28 = n7 & 0x10000;
        Object object7 = n28 != 0 ? object : string7;
        int n29 = n7 & 0x20000;
        Object object8 = n29 != 0 ? object : string8;
        int n30 = n7 & 0x40000;
        Object object9 = n30 != 0 ? object : string9;
        int n32 = n7 & 0x80000;
        Object object10 = n32 != 0 ? object : string10;
        int n34 = n7 & 0x100000;
        Object object11 = n34 != 0 ? object : string11;
        int n35 = n7 & 0x200000;
        Object object12 = n35 != 0 ? object : string12;
        int n36 = n7 & 0x400000;
        if (n36 != 0) {
            n36 = 0;
            string20 = null;
        } else {
            string20 = string13;
        }
        int n37 = n7 & 0x800000;
        if (n37 != 0) {
            n37 = 0;
            string19 = null;
        } else {
            string19 = string14;
        }
        int n38 = n7 & 0x1000000;
        if (n38 != 0) {
            n38 = 0;
            string18 = null;
        } else {
            string18 = string15;
        }
        int n39 = 0x2000000;
        if ((n7 &= n39) != 0) {
            n7 = 0;
            string17 = null;
        } else {
            string17 = string16;
        }
        object = this;
        string2 = string25;
        string3 = string24;
        string4 = object5;
        object2 = string23;
        parcelable = productImage;
        bl3 = var43_46;
        bl4 = var45_51;
        string6 = string22;
        price2 = price4;
        parcelable2 = price3;
        object3 = object4;
        string7 = object6;
        string8 = object7;
        string9 = object8;
        string10 = object9;
        string11 = object10;
        string12 = object11;
        string13 = object12;
        string14 = string20;
        string15 = string19;
        string16 = string18;
        this((String)string25, string24, object5, string23, (ProductImage)productImage, (ProductSwatchImage)productSwatchImage, (boolean)var43_46, (boolean)var45_51, (boolean)var46_55, string22, string21, n18, price4, price3, (ModelImage)((Object)object4), (String)object6, (String)object7, (String)object8, (String)object9, (String)object10, (String)object11, (String)object12, string20, string19, string18, string17);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ ProductOptionVariant copy$default(ProductOptionVariant productOptionVariant, String string2, String string3, String string4, String string5, ProductImage productImage, ProductSwatchImage productSwatchImage, boolean bl2, boolean bl3, boolean bl4, String string6, String string7, int n3, Price price, Price price2, ModelImage parcelable, String object, String object2, String object3, String object4, String object5, String object6, String object7, String object8, String object9, String object10, String string8, int n4, Object object11) {
        void var45_54;
        void var44_50;
        void var43_46;
        ProductOptionVariant productOptionVariant2 = productOptionVariant;
        int n7 = n4;
        int n8 = n4 & 1;
        String string9 = n8 != 0 ? productOptionVariant.name : string2;
        int n10 = n7 & 2;
        String string10 = n10 != 0 ? productOptionVariant2.value : string3;
        int n14 = n7 & 4;
        String string11 = n14 != 0 ? productOptionVariant2.brandValue : string4;
        int n15 = n7 & 8;
        String string12 = n15 != 0 ? productOptionVariant2.qualifier : string5;
        int n16 = n7 & 0x10;
        ProductImage productImage2 = n16 != 0 ? productOptionVariant2.image : productImage;
        int n17 = n7 & 0x20;
        ProductSwatchImage productSwatchImage2 = n17 != 0 ? productOptionVariant2.swatchImage : productSwatchImage;
        int bl5 = n7 & 0x40;
        if (bl5 != 0) {
            boolean bl6 = productOptionVariant2.isSelected;
        } else {
            boolean bl7 = bl2;
        }
        int n18 = n7 & 0x80;
        if (n18 != 0) {
            boolean bl8 = productOptionVariant2.isHighlighted;
        } else {
            boolean bl9 = bl3;
        }
        int n19 = n7 & 0x100;
        if (n19 != 0) {
            boolean bl10 = productOptionVariant2.isStockAvailable;
        } else {
            boolean bl11 = bl4;
        }
        int n20 = n7 & 0x200;
        String string13 = n20 != 0 ? productOptionVariant2.color : string6;
        int n21 = n7 & 0x400;
        String string14 = n21 != 0 ? productOptionVariant2.code : string7;
        int n22 = n7 & 0x800;
        n22 = n22 != 0 ? productOptionVariant2.stockLevel : n3;
        int n24 = n7 & 0x1000;
        Price price3 = n24 != 0 ? productOptionVariant2.priceData : price;
        int n25 = n7 & 0x2000;
        Object object12 = n25 != 0 ? productOptionVariant2.wasPriceData : price2;
        price2 = object12;
        n25 = n7 & 0x4000;
        object12 = n25 != 0 ? productOptionVariant2.modelImage : parcelable;
        int n26 = n7 & 0x8000;
        parcelable = object12;
        object12 = n26 != 0 ? productOptionVariant2.sizeDisplayType : object;
        n26 = n7 & 0x10000;
        object = object12;
        object12 = n26 != 0 ? productOptionVariant2.universalSizeValue : object2;
        n26 = n7 & 0x20000;
        object2 = object12;
        object12 = n26 != 0 ? productOptionVariant2.brandSizeFormat : object3;
        n26 = n7 & 0x40000;
        object3 = object12;
        object12 = n26 != 0 ? productOptionVariant2.universalSizeFormat : object4;
        n26 = n7 & 0x80000;
        object4 = object12;
        object12 = n26 != 0 ? productOptionVariant2.sizeValue : object5;
        n26 = n7 & 0x100000;
        object5 = object12;
        object12 = n26 != 0 ? productOptionVariant2.attributeName : object6;
        n26 = n7 & 0x200000;
        object6 = object12;
        object12 = n26 != 0 ? productOptionVariant2.attributeValue : object7;
        n26 = n7 & 0x400000;
        object7 = object12;
        object12 = n26 != 0 ? productOptionVariant2.thumbnail : object8;
        n26 = n7 & 0x800000;
        object8 = object12;
        object12 = n26 != 0 ? productOptionVariant2.brickBrandSize : object9;
        n26 = n7 & 0x1000000;
        object9 = object12;
        object12 = n26 != 0 ? productOptionVariant2.commercialType : object10;
        n26 = 0x2000000;
        String string15 = (n7 &= n26) != 0 ? productOptionVariant2.batchID : string8;
        string2 = string9;
        string3 = string10;
        string4 = string11;
        string5 = string12;
        productImage = productImage2;
        productSwatchImage = productSwatchImage2;
        bl2 = var43_46;
        bl3 = var44_50;
        bl4 = var45_54;
        string6 = string13;
        string7 = string14;
        n3 = n22;
        price = price3;
        object10 = object12;
        string8 = string15;
        return productOptionVariant.copy(string9, string10, string11, string12, productImage2, productSwatchImage2, (boolean)var43_46, (boolean)var44_50, (boolean)var45_54, string13, string14, n22, price3, price2, (ModelImage)parcelable, (String)object, (String)object2, (String)object3, (String)object4, (String)object5, (String)object6, (String)object7, (String)object8, (String)object9, (String)object12, string15);
    }

    public ProductOptionVariant clone() {
        Object object = super.clone();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.Product.ProductOptionVariant");
        object = (ProductOptionVariant)object;
        Parcelable parcelable = this.image;
        ModelImage modelImage = null;
        parcelable = parcelable != null ? parcelable.clone() : null;
        ((ProductOptionVariant)object).image = parcelable;
        parcelable = this.swatchImage;
        parcelable = parcelable != null ? parcelable.clone() : null;
        ((ProductOptionVariant)object).swatchImage = parcelable;
        parcelable = this.priceData;
        parcelable = parcelable != null ? parcelable.clone() : null;
        ((ProductOptionVariant)object).priceData = parcelable;
        parcelable = this.wasPriceData;
        parcelable = parcelable != null ? parcelable.clone() : null;
        ((ProductOptionVariant)object).wasPriceData = parcelable;
        parcelable = this.modelImage;
        if (parcelable != null) {
            modelImage = parcelable.clone();
        }
        ((ProductOptionVariant)object).modelImage = modelImage;
        return object;
    }

    public final String component1() {
        return this.name;
    }

    public final String component10() {
        return this.color;
    }

    public final String component11() {
        return this.code;
    }

    public final int component12() {
        return this.stockLevel;
    }

    public final Price component13() {
        return this.priceData;
    }

    public final Price component14() {
        return this.wasPriceData;
    }

    public final ModelImage component15() {
        return this.modelImage;
    }

    public final String component16() {
        return this.sizeDisplayType;
    }

    public final String component17() {
        return this.universalSizeValue;
    }

    public final String component18() {
        return this.brandSizeFormat;
    }

    public final String component19() {
        return this.universalSizeFormat;
    }

    public final String component2() {
        return this.value;
    }

    public final String component20() {
        return this.sizeValue;
    }

    public final String component21() {
        return this.attributeName;
    }

    public final String component22() {
        return this.attributeValue;
    }

    public final String component23() {
        return this.thumbnail;
    }

    public final String component24() {
        return this.brickBrandSize;
    }

    public final String component25() {
        return this.commercialType;
    }

    public final String component26() {
        return this.batchID;
    }

    public final String component3() {
        return this.brandValue;
    }

    public final String component4() {
        return this.qualifier;
    }

    public final ProductImage component5() {
        return this.image;
    }

    public final ProductSwatchImage component6() {
        return this.swatchImage;
    }

    public final boolean component7() {
        return this.isSelected;
    }

    public final boolean component8() {
        return this.isHighlighted;
    }

    public final boolean component9() {
        return this.isStockAvailable;
    }

    public final ProductOptionVariant copy(String string2, String string3, String string4, String string5, ProductImage productImage, ProductSwatchImage productSwatchImage, boolean bl2, boolean bl3, boolean bl4, String string6, String string7, int n3, Price price, Price price2, ModelImage modelImage, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18) {
        ProductOptionVariant productOptionVariant = new ProductOptionVariant(string2, string3, string4, string5, productImage, productSwatchImage, bl2, bl3, bl4, string6, string7, n3, price, price2, modelImage, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18);
        return productOptionVariant;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ProductOptionVariant;
        if (n3 == 0) {
            return false;
        }
        object = (ProductOptionVariant)object;
        Object object2 = this.name;
        Object object3 = ((ProductOptionVariant)object).name;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.value;
        object3 = ((ProductOptionVariant)object).value;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.brandValue;
        object3 = ((ProductOptionVariant)object).brandValue;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.qualifier;
        object3 = ((ProductOptionVariant)object).qualifier;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.image;
        object3 = ((ProductOptionVariant)object).image;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.swatchImage;
        object3 = ((ProductOptionVariant)object).swatchImage;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.isSelected;
        int n4 = ((ProductOptionVariant)object).isSelected;
        if (n3 != n4) {
            return false;
        }
        n3 = this.isHighlighted;
        n4 = ((ProductOptionVariant)object).isHighlighted;
        if (n3 != n4) {
            return false;
        }
        n3 = this.isStockAvailable;
        n4 = ((ProductOptionVariant)object).isStockAvailable;
        if (n3 != n4) {
            return false;
        }
        object2 = this.color;
        object3 = ((ProductOptionVariant)object).color;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.code;
        object3 = ((ProductOptionVariant)object).code;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.stockLevel;
        n4 = ((ProductOptionVariant)object).stockLevel;
        if (n3 != n4) {
            return false;
        }
        object2 = this.priceData;
        object3 = ((ProductOptionVariant)object).priceData;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.wasPriceData;
        object3 = ((ProductOptionVariant)object).wasPriceData;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.modelImage;
        object3 = ((ProductOptionVariant)object).modelImage;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.sizeDisplayType;
        object3 = ((ProductOptionVariant)object).sizeDisplayType;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.universalSizeValue;
        object3 = ((ProductOptionVariant)object).universalSizeValue;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.brandSizeFormat;
        object3 = ((ProductOptionVariant)object).brandSizeFormat;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.universalSizeFormat;
        object3 = ((ProductOptionVariant)object).universalSizeFormat;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.sizeValue;
        object3 = ((ProductOptionVariant)object).sizeValue;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.attributeName;
        object3 = ((ProductOptionVariant)object).attributeName;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.attributeValue;
        object3 = ((ProductOptionVariant)object).attributeValue;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.thumbnail;
        object3 = ((ProductOptionVariant)object).thumbnail;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.brickBrandSize;
        object3 = ((ProductOptionVariant)object).brickBrandSize;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.commercialType;
        object3 = ((ProductOptionVariant)object).commercialType;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.batchID;
        object = ((ProductOptionVariant)object).batchID;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getAttributeName() {
        return this.attributeName;
    }

    public final String getAttributeValue() {
        return this.attributeValue;
    }

    public final String getBatchID() {
        return this.batchID;
    }

    public final String getBrandSizeFormat() {
        return this.brandSizeFormat;
    }

    public final String getBrandValue() {
        return this.brandValue;
    }

    public final String getBrickBrandSize() {
        return this.brickBrandSize;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getCommercialType() {
        return this.commercialType;
    }

    public final ProductImage getImage() {
        return this.image;
    }

    public final ModelImage getModelImage() {
        return this.modelImage;
    }

    public final String getName() {
        return this.name;
    }

    public final Price getPriceData() {
        return this.priceData;
    }

    public final String getQualifier() {
        return this.qualifier;
    }

    public final String getSizeDisplayType() {
        return this.sizeDisplayType;
    }

    public final String getSizeValue() {
        return this.sizeValue;
    }

    public final int getStockLevel() {
        return this.stockLevel;
    }

    public final ProductSwatchImage getSwatchImage() {
        return this.swatchImage;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final String getUniversalSizeFormat() {
        return this.universalSizeFormat;
    }

    public final String getUniversalSizeValue() {
        return this.universalSizeValue;
    }

    public final String getValue() {
        return this.value;
    }

    public final Price getWasPriceData() {
        return this.wasPriceData;
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
        Object object = this.value;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brandValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.qualifier;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.image;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ProductImage)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.swatchImage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ProductSwatchImage)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isSelected ? 1 : 0);
        int n8 = 1237;
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isHighlighted ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isStockAvailable ? 1 : 0);
        if (n3 != 0) {
            n8 = 1231;
        }
        n4 = (n4 + n8) * 31;
        object = this.color;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.code;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = this.stockLevel;
        n4 = (n4 + n3) * 31;
        object = this.priceData;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.wasPriceData;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.modelImage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ModelImage)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.sizeDisplayType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.universalSizeValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brandSizeFormat;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.universalSizeFormat;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.sizeValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.attributeName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.attributeValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.thumbnail;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brickBrandSize;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.commercialType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.batchID;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final boolean isHighlighted() {
        return this.isHighlighted;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean isStockAvailable() {
        return this.isStockAvailable;
    }

    public final void setAttributeName(String string2) {
        this.attributeName = string2;
    }

    public final void setAttributeValue(String string2) {
        this.attributeValue = string2;
    }

    public final void setBatchID(String string2) {
        this.batchID = string2;
    }

    public final void setBrandSizeFormat(String string2) {
        this.brandSizeFormat = string2;
    }

    public final void setBrandValue(String string2) {
        this.brandValue = string2;
    }

    public final void setBrickBrandSize(String string2) {
        this.brickBrandSize = string2;
    }

    public final void setCode(String string2) {
        this.code = string2;
    }

    public final void setColor(String string2) {
        this.color = string2;
    }

    public final void setCommercialType(String string2) {
        this.commercialType = string2;
    }

    public final void setHighlighted(boolean bl2) {
        this.isHighlighted = bl2;
    }

    public final void setImage(ProductImage productImage) {
        this.image = productImage;
    }

    public final void setModelImage(ModelImage modelImage) {
        this.modelImage = modelImage;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setPriceData(Price price) {
        this.priceData = price;
    }

    public final void setQualifier(String string2) {
        this.qualifier = string2;
    }

    public final void setSelected(boolean bl2) {
        this.isSelected = bl2;
    }

    public final void setSizeDisplayType(String string2) {
        this.sizeDisplayType = string2;
    }

    public final void setSizeValue(String string2) {
        this.sizeValue = string2;
    }

    public final void setStockAvailable(boolean bl2) {
        this.isStockAvailable = bl2;
    }

    public final void setStockLevel(int n3) {
        this.stockLevel = n3;
    }

    public final void setSwatchImage(ProductSwatchImage productSwatchImage) {
        this.swatchImage = productSwatchImage;
    }

    public final void setThumbnail(String string2) {
        this.thumbnail = string2;
    }

    public final void setUniversalSizeFormat(String string2) {
        this.universalSizeFormat = string2;
    }

    public final void setUniversalSizeValue(String string2) {
        this.universalSizeValue = string2;
    }

    public final void setValue(String string2) {
        this.value = string2;
    }

    public final void setWasPriceData(Price price) {
        this.wasPriceData = price;
    }

    public String toString() {
        Serializable serializable = this;
        Object object = this.name;
        String string2 = this.value;
        String string3 = this.brandValue;
        String string4 = this.qualifier;
        ProductImage productImage = this.image;
        ProductSwatchImage productSwatchImage = this.swatchImage;
        boolean bl2 = this.isSelected;
        boolean bl3 = this.isHighlighted;
        boolean bl4 = this.isStockAvailable;
        String string5 = this.color;
        String string6 = this.code;
        int n3 = this.stockLevel;
        Price price = this.priceData;
        Price price2 = this.wasPriceData;
        ModelImage modelImage = this.modelImage;
        String string7 = this.sizeDisplayType;
        String string8 = this.universalSizeValue;
        String string9 = this.brandSizeFormat;
        String string10 = this.universalSizeFormat;
        String string11 = this.sizeValue;
        String string12 = this.attributeName;
        String string13 = this.attributeValue;
        String string14 = this.thumbnail;
        String string15 = this.brickBrandSize;
        String string16 = this.commercialType;
        String string17 = this.batchID;
        serializable = og_1.a("ProductOptionVariant(name=", (String)object, ", value=", string2, ", brandValue=");
        X50.a((StringBuilder)serializable, string3, ", qualifier=", string4, ", image=");
        ((StringBuilder)serializable).append(productImage);
        ((StringBuilder)serializable).append(", swatchImage=");
        ((StringBuilder)serializable).append(productSwatchImage);
        ((StringBuilder)serializable).append(", isSelected=");
        I81.a(", isHighlighted=", ", isStockAvailable=", (StringBuilder)serializable, bl2, bl3);
        ((StringBuilder)serializable).append(bl4);
        ((StringBuilder)serializable).append(", color=");
        ((StringBuilder)serializable).append(string5);
        ((StringBuilder)serializable).append(", code=");
        ((StringBuilder)serializable).append(string6);
        ((StringBuilder)serializable).append(", stockLevel=");
        ((StringBuilder)serializable).append(n3);
        ((StringBuilder)serializable).append(", priceData=");
        ((StringBuilder)serializable).append(price);
        ((StringBuilder)serializable).append(", wasPriceData=");
        object = price2;
        ((StringBuilder)serializable).append(price2);
        ((StringBuilder)serializable).append(", modelImage=");
        object = modelImage;
        ((StringBuilder)serializable).append(modelImage);
        ((StringBuilder)serializable).append(", sizeDisplayType=");
        object = string7;
        ((StringBuilder)serializable).append(string7);
        ((StringBuilder)serializable).append(", universalSizeValue=");
        string3 = string8;
        string4 = string9;
        X50.a((StringBuilder)serializable, string8, ", brandSizeFormat=", string9, ", universalSizeFormat=");
        string3 = string10;
        string4 = string11;
        X50.a((StringBuilder)serializable, string10, ", sizeValue=", string11, ", attributeName=");
        string3 = string12;
        string4 = string13;
        X50.a((StringBuilder)serializable, string12, ", attributeValue=", string13, ", thumbnail=");
        string3 = string14;
        string4 = string15;
        X50.a((StringBuilder)serializable, string14, ", brickBrandSize=", string15, ", commercialType=");
        string3 = string16;
        string4 = string17;
        return ko_0.a((StringBuilder)serializable, string16, ", batchID=", string17, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.name;
        parcel.writeString((String)object);
        object = this.value;
        parcel.writeString((String)object);
        object = this.brandValue;
        parcel.writeString((String)object);
        object = this.qualifier;
        parcel.writeString((String)object);
        object = this.image;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            ((ProductImage)object).writeToParcel(parcel, n3);
        }
        object = this.swatchImage;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            ((ProductSwatchImage)object).writeToParcel(parcel, n3);
        }
        int n7 = this.isSelected;
        parcel.writeInt(n7);
        int n8 = this.isHighlighted;
        parcel.writeInt(n8);
        int n10 = this.isStockAvailable;
        parcel.writeInt(n10);
        object = this.color;
        parcel.writeString((String)object);
        object = this.code;
        parcel.writeString((String)object);
        int n14 = this.stockLevel;
        parcel.writeInt(n14);
        object = this.priceData;
        parcel.writeParcelable((Parcelable)object, n3);
        object = this.wasPriceData;
        parcel.writeParcelable((Parcelable)object, n3);
        object = this.modelImage;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            ((ModelImage)object).writeToParcel(parcel, n3);
        }
        String string2 = this.sizeDisplayType;
        parcel.writeString(string2);
        string2 = this.universalSizeValue;
        parcel.writeString(string2);
        string2 = this.brandSizeFormat;
        parcel.writeString(string2);
        string2 = this.universalSizeFormat;
        parcel.writeString(string2);
        string2 = this.sizeValue;
        parcel.writeString(string2);
        string2 = this.attributeName;
        parcel.writeString(string2);
        string2 = this.attributeValue;
        parcel.writeString(string2);
        string2 = this.thumbnail;
        parcel.writeString(string2);
        string2 = this.brickBrandSize;
        parcel.writeString(string2);
        string2 = this.commercialType;
        parcel.writeString(string2);
        string2 = this.batchID;
        parcel.writeString(string2);
    }
}

