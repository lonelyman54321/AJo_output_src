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
import com.ril.ajio.services.data.Product.MandatoryInfo;
import com.ril.ajio.services.data.Product.PriceBreakUp;
import com.ril.ajio.services.data.Product.ProductOptionItem$Creator;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.Stock;
import com.ril.ajio.services.data.flashsale.pdp.ModelImage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ProductOptionItem
implements Serializable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private List attributes;
    private String code;
    private String color;
    private String commercialType;
    private String displaySizeFormat;
    private String imageFormat;
    private String imageUrl;
    private final boolean isExchangeable;
    private final boolean isReturnable;
    private boolean isSelectedOption;
    private ArrayList mandatoryInfo;
    private ModelImage modelImage;
    private String name;
    private ArrayList priceBreakUp;
    private Price priceData;
    private String qualifier;
    private final int returnWindow;
    private String scDisplaySize;
    private String sizeDisplayType;
    private Stock stock;
    private String url;
    private String value;
    private List variantOptionQualifiers;
    private ProductOptionVariant variantOptionSizeQualifier;
    private Price wasPriceData;

    static {
        ProductOptionItem$Creator productOptionItem$Creator = new ProductOptionItem$Creator();
        CREATOR = productOptionItem$Creator;
    }

    public ProductOptionItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, 0, false, 0x1FFFFFF, null);
    }

    public ProductOptionItem(String string2, String string3, String string4, String string5, String string6, List list, List list2, Price price, String string7, String string8, String string9, ModelImage modelImage, boolean bl2, Stock stock, Price price2, ArrayList arrayList, String string10, String string11, String string12, String string13, ArrayList arrayList2, ProductOptionVariant productOptionVariant, boolean bl3, int n3, boolean bl4) {
        Intrinsics.checkNotNullParameter(string7, "code");
        Intrinsics.checkNotNullParameter(string8, "url");
        Intrinsics.checkNotNullParameter(string10, "sizeDisplayType");
        Intrinsics.checkNotNullParameter(string11, "scDisplaySize");
        Intrinsics.checkNotNullParameter(string12, "displaySizeFormat");
        Intrinsics.checkNotNullParameter(string13, "commercialType");
        this.name = string2;
        this.value = string3;
        this.qualifier = string4;
        this.imageUrl = string5;
        this.imageFormat = string6;
        this.variantOptionQualifiers = list;
        this.attributes = list2;
        this.priceData = price;
        this.code = string7;
        this.url = string8;
        this.color = string9;
        this.modelImage = modelImage;
        this.isSelectedOption = bl2;
        this.stock = stock;
        this.wasPriceData = price2;
        this.mandatoryInfo = arrayList;
        this.sizeDisplayType = string10;
        this.scDisplaySize = string11;
        this.displaySizeFormat = string12;
        this.commercialType = string13;
        this.priceBreakUp = arrayList2;
        this.variantOptionSizeQualifier = productOptionVariant;
        this.isReturnable = bl3;
        this.returnWindow = n3;
        this.isExchangeable = bl4;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ ProductOptionItem(String object, String string2, String string3, String string4, String string5, List object2, List list, Price object3, String object4, String string6, String string7, ModelImage object5, boolean bl2, Stock stock, Price parcelable, ArrayList object6, String object7, String string8, String string9, String string10, ArrayList object8, ProductOptionVariant cloneable, boolean bl3, int n3, boolean bl4, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        void var54_60;
        void var73_82;
        Cloneable cloneable2;
        Object object9;
        Object object10;
        Stock stock2;
        Object object11;
        String string11;
        Object object12;
        List list2;
        Object object13;
        String string12;
        String string13;
        String string14;
        String string15;
        Object object14;
        void var26_28;
        int n7 = var26_28;
        int n8 = var26_28 & 1;
        if (n8 != 0) {
            n8 = 0;
            object14 = null;
        } else {
            object14 = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            string15 = null;
        } else {
            string15 = string2;
        }
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            string14 = null;
        } else {
            string14 = string3;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            string13 = null;
        } else {
            string13 = string4;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            string12 = null;
        } else {
            string12 = string5;
        }
        int n17 = n7 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            object13 = null;
        } else {
            object13 = object2;
        }
        int n18 = n7 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            list2 = null;
        } else {
            list2 = list;
        }
        int n19 = n7 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            object12 = null;
        } else {
            object12 = object3;
        }
        int n20 = n7 & 0x100;
        String string16 = "";
        Object object15 = n20 != 0 ? string16 : object4;
        int n21 = n7 & 0x200;
        Object object16 = n21 != 0 ? string16 : string6;
        int n22 = n7 & 0x400;
        if (n22 != 0) {
            n22 = 0;
            string11 = null;
        } else {
            string11 = string7;
        }
        int n24 = n7 & 0x800;
        if (n24 != 0) {
            n24 = 0;
            object11 = null;
        } else {
            object11 = object5;
        }
        int n25 = n7 & 0x1000;
        boolean bl5 = false;
        if (n25 != 0) {
            boolean bl6 = false;
        } else {
            boolean bl7 = bl2;
        }
        int n26 = n7 & 0x2000;
        if (n26 != 0) {
            n26 = 0;
            stock2 = null;
        } else {
            stock2 = stock;
        }
        object = string16;
        int n27 = n7 & 0x4000;
        if (n27 != 0) {
            n27 = 0;
            string16 = null;
        } else {
            string16 = parcelable;
        }
        int n28 = n7 & 0x8000;
        if (n28 != 0) {
            n28 = 0;
            object10 = null;
        } else {
            object10 = object6;
        }
        int n29 = n7 & 0x10000;
        Object object17 = n29 != 0 ? object : object7;
        int n30 = n7 & 0x20000;
        Object object18 = n30 != 0 ? object : string8;
        int n32 = n7 & 0x40000;
        Object object19 = n32 != 0 ? object : string9;
        int n34 = n7 & 0x80000;
        Object object20 = n34 != 0 ? object : string10;
        int n35 = n7 & 0x100000;
        if (n35 != 0) {
            n35 = 0;
            object9 = null;
        } else {
            object9 = object8;
        }
        int n36 = n7 & 0x200000;
        if (n36 != 0) {
            n36 = 0;
            cloneable2 = null;
        } else {
            cloneable2 = cloneable;
        }
        int n37 = n7 & 0x400000;
        if (n37 != 0) {
            boolean bl8 = false;
        } else {
            boolean bl9 = bl3;
        }
        int n38 = n7 & 0x800000;
        n38 = n38 != 0 ? 0 : n3;
        int n39 = 0x1000000;
        if ((n7 &= n39) == 0) {
            void var25_26;
            bl5 = var25_26;
        }
        object = this;
        string2 = object14;
        string3 = string15;
        string4 = string14;
        string5 = string13;
        object2 = string12;
        list = object13;
        object3 = list2;
        object4 = object12;
        string6 = object15;
        string7 = object16;
        object5 = string11;
        parcelable = stock2;
        object6 = string16;
        object7 = object10;
        string8 = object17;
        string9 = object18;
        string10 = object19;
        object8 = object20;
        cloneable = object9;
        void var24_25 = var73_82;
        int n41 = n38;
        boolean bl10 = bl5;
        this((String)object14, string15, string14, string13, string12, (List)object13, list2, (Price)object12, (String)object15, (String)object16, string11, (ModelImage)object11, (boolean)var54_60, stock2, (Price)((Object)string16), (ArrayList)object10, (String)object17, (String)object18, (String)object19, (String)object20, (ArrayList)object9, (ProductOptionVariant)cloneable2, (boolean)var73_82, n38, bl5);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ ProductOptionItem copy$default(ProductOptionItem productOptionItem, String string2, String string3, String string4, String string5, String string6, List list, List list2, Price price, String string7, String string8, String string9, ModelImage modelImage, boolean bl2, Stock stock, Price parcelable, ArrayList serializable, String object, String object2, String object3, String object4, ArrayList object5, ProductOptionVariant object6, boolean bl3, int n3, boolean bl4, int n4, Object object7) {
        void var54_59;
        void var25_26;
        int n7;
        void var26_28;
        ProductOptionItem productOptionItem2 = productOptionItem;
        int bl5 = var26_28;
        int n8 = var26_28 & 1;
        String string10 = n8 != 0 ? productOptionItem.name : string2;
        int n10 = bl5 & 2;
        String string11 = n10 != 0 ? productOptionItem2.value : string3;
        int n14 = bl5 & 4;
        String string12 = n14 != 0 ? productOptionItem2.qualifier : string4;
        int n15 = bl5 & 8;
        String string13 = n15 != 0 ? productOptionItem2.imageUrl : string5;
        int n16 = bl5 & 0x10;
        String string14 = n16 != 0 ? productOptionItem2.imageFormat : string6;
        int n17 = bl5 & 0x20;
        List list3 = n17 != 0 ? productOptionItem2.variantOptionQualifiers : list;
        int n18 = bl5 & 0x40;
        List list4 = n18 != 0 ? productOptionItem2.attributes : list2;
        int n19 = bl5 & 0x80;
        Price price2 = n19 != 0 ? productOptionItem2.priceData : price;
        int n20 = bl5 & 0x100;
        String string15 = n20 != 0 ? productOptionItem2.code : string7;
        int n21 = bl5 & 0x200;
        String string16 = n21 != 0 ? productOptionItem2.url : string8;
        int n22 = bl5 & 0x400;
        String string17 = n22 != 0 ? productOptionItem2.color : string9;
        int n24 = bl5 & 0x800;
        ModelImage modelImage2 = n24 != 0 ? productOptionItem2.modelImage : modelImage;
        int n25 = bl5 & 0x1000;
        if (n25 != 0) {
            boolean bl6 = productOptionItem2.isSelectedOption;
        } else {
            boolean bl7 = bl2;
        }
        int n26 = bl5 & 0x2000;
        Object object8 = n26 != 0 ? productOptionItem2.stock : stock;
        stock = object8;
        n26 = bl5 & 0x4000;
        object8 = n26 != 0 ? productOptionItem2.wasPriceData : parcelable;
        int n27 = bl5 & 0x8000;
        parcelable = object8;
        object8 = n27 != 0 ? productOptionItem2.mandatoryInfo : serializable;
        n27 = bl5 & 0x10000;
        serializable = object8;
        object8 = n27 != 0 ? productOptionItem2.sizeDisplayType : object;
        n27 = bl5 & 0x20000;
        object = object8;
        object8 = n27 != 0 ? productOptionItem2.scDisplaySize : object2;
        n27 = bl5 & 0x40000;
        object2 = object8;
        object8 = n27 != 0 ? productOptionItem2.displaySizeFormat : object3;
        n27 = bl5 & 0x80000;
        object3 = object8;
        object8 = n27 != 0 ? productOptionItem2.commercialType : object4;
        n27 = bl5 & 0x100000;
        object4 = object8;
        object8 = n27 != 0 ? productOptionItem2.priceBreakUp : object5;
        n27 = bl5 & 0x200000;
        object5 = object8;
        object8 = n27 != 0 ? productOptionItem2.variantOptionSizeQualifier : object6;
        n27 = bl5 & 0x400000;
        object6 = object8;
        n26 = n27 != 0 ? (int)(productOptionItem2.isReturnable ? 1 : 0) : (int)(bl3 ? 1 : 0);
        n27 = bl5 & 0x800000;
        int n28 = n26;
        n26 = n27 != 0 ? productOptionItem2.returnWindow : n7;
        n27 = 0x1000000;
        bl5 = (bl5 &= n27) ? (int)productOptionItem2.isExchangeable : var25_26;
        string2 = string10;
        string3 = string11;
        string4 = string12;
        string5 = string13;
        string6 = string14;
        list = list3;
        list2 = list4;
        price = price2;
        string7 = string15;
        string8 = string16;
        string9 = string17;
        modelImage = modelImage2;
        bl2 = var54_59;
        n7 = n26;
        int bl8 = bl5;
        return productOptionItem.copy(string10, string11, string12, string13, string14, list3, list4, price2, string15, string16, string17, modelImage2, (boolean)var54_59, stock, (Price)parcelable, (ArrayList)serializable, (String)object, (String)object2, (String)object3, (String)object4, (ArrayList)object5, (ProductOptionVariant)object6, n28 != 0, n26, (boolean)bl5);
    }

    public final String component1() {
        return this.name;
    }

    public final String component10() {
        return this.url;
    }

    public final String component11() {
        return this.color;
    }

    public final ModelImage component12() {
        return this.modelImage;
    }

    public final boolean component13() {
        return this.isSelectedOption;
    }

    public final Stock component14() {
        return this.stock;
    }

    public final Price component15() {
        return this.wasPriceData;
    }

    public final ArrayList component16() {
        return this.mandatoryInfo;
    }

    public final String component17() {
        return this.sizeDisplayType;
    }

    public final String component18() {
        return this.scDisplaySize;
    }

    public final String component19() {
        return this.displaySizeFormat;
    }

    public final String component2() {
        return this.value;
    }

    public final String component20() {
        return this.commercialType;
    }

    public final ArrayList component21() {
        return this.priceBreakUp;
    }

    public final ProductOptionVariant component22() {
        return this.variantOptionSizeQualifier;
    }

    public final boolean component23() {
        return this.isReturnable;
    }

    public final int component24() {
        return this.returnWindow;
    }

    public final boolean component25() {
        return this.isExchangeable;
    }

    public final String component3() {
        return this.qualifier;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final String component5() {
        return this.imageFormat;
    }

    public final List component6() {
        return this.variantOptionQualifiers;
    }

    public final List component7() {
        return this.attributes;
    }

    public final Price component8() {
        return this.priceData;
    }

    public final String component9() {
        return this.code;
    }

    public final ProductOptionItem copy(String string2, String string3, String string4, String string5, String string6, List list, List list2, Price price, String string7, String string8, String string9, ModelImage modelImage, boolean bl2, Stock stock, Price price2, ArrayList arrayList, String string10, String string11, String string12, String string13, ArrayList arrayList2, ProductOptionVariant productOptionVariant, boolean bl3, int n3, boolean bl4) {
        Intrinsics.checkNotNullParameter(string7, "code");
        Intrinsics.checkNotNullParameter(string8, "url");
        Intrinsics.checkNotNullParameter(string10, "sizeDisplayType");
        Intrinsics.checkNotNullParameter(string11, "scDisplaySize");
        Intrinsics.checkNotNullParameter(string12, "displaySizeFormat");
        Intrinsics.checkNotNullParameter(string13, "commercialType");
        ProductOptionItem productOptionItem = new ProductOptionItem(string2, string3, string4, string5, string6, list, list2, price, string7, string8, string9, modelImage, bl2, stock, price2, arrayList, string10, string11, string12, string13, arrayList2, productOptionVariant, bl3, n3, bl4);
        return productOptionItem;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ProductOptionItem;
        if (n3 == 0) {
            return false;
        }
        object = (ProductOptionItem)object;
        Object object2 = this.name;
        Object object3 = ((ProductOptionItem)object).name;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.value;
        object3 = ((ProductOptionItem)object).value;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.qualifier;
        object3 = ((ProductOptionItem)object).qualifier;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.imageUrl;
        object3 = ((ProductOptionItem)object).imageUrl;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.imageFormat;
        object3 = ((ProductOptionItem)object).imageFormat;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.variantOptionQualifiers;
        object3 = ((ProductOptionItem)object).variantOptionQualifiers;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.attributes;
        object3 = ((ProductOptionItem)object).attributes;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.priceData;
        object3 = ((ProductOptionItem)object).priceData;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.code;
        object3 = ((ProductOptionItem)object).code;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.url;
        object3 = ((ProductOptionItem)object).url;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.color;
        object3 = ((ProductOptionItem)object).color;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.modelImage;
        object3 = ((ProductOptionItem)object).modelImage;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.isSelectedOption;
        int n4 = ((ProductOptionItem)object).isSelectedOption;
        if (n3 != n4) {
            return false;
        }
        object2 = this.stock;
        object3 = ((ProductOptionItem)object).stock;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.wasPriceData;
        object3 = ((ProductOptionItem)object).wasPriceData;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.mandatoryInfo;
        object3 = ((ProductOptionItem)object).mandatoryInfo;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.sizeDisplayType;
        object3 = ((ProductOptionItem)object).sizeDisplayType;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.scDisplaySize;
        object3 = ((ProductOptionItem)object).scDisplaySize;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.displaySizeFormat;
        object3 = ((ProductOptionItem)object).displaySizeFormat;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.commercialType;
        object3 = ((ProductOptionItem)object).commercialType;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.priceBreakUp;
        object3 = ((ProductOptionItem)object).priceBreakUp;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.variantOptionSizeQualifier;
        object3 = ((ProductOptionItem)object).variantOptionSizeQualifier;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.isReturnable;
        n4 = ((ProductOptionItem)object).isReturnable;
        if (n3 != n4) {
            return false;
        }
        n3 = this.returnWindow;
        n4 = ((ProductOptionItem)object).returnWindow;
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isExchangeable ? 1 : 0);
        int n7 = ((ProductOptionItem)object).isExchangeable;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final List getAttributes() {
        return this.attributes;
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

    public final String getDisplaySizeFormat() {
        return this.displaySizeFormat;
    }

    public final String getImageFormat() {
        return this.imageFormat;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final ArrayList getMandatoryInfo() {
        return this.mandatoryInfo;
    }

    public final ModelImage getModelImage() {
        return this.modelImage;
    }

    public final String getName() {
        return this.name;
    }

    public final ArrayList getPriceBreakUp() {
        return this.priceBreakUp;
    }

    public final Price getPriceData() {
        return this.priceData;
    }

    public final String getQualifier() {
        return this.qualifier;
    }

    public final int getReturnWindow() {
        return this.returnWindow;
    }

    public final String getScDisplaySize() {
        return this.scDisplaySize;
    }

    public final String getSizeDisplayType() {
        return this.sizeDisplayType;
    }

    public final Stock getStock() {
        return this.stock;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getValue() {
        return this.value;
    }

    public final List getVariantOptionQualifiers() {
        return this.variantOptionQualifiers;
    }

    public final ProductOptionVariant getVariantOptionSizeQualifier() {
        return this.variantOptionSizeQualifier;
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
        int n8 = 31;
        n4 *= 31;
        Object object = this.value;
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
        object = this.imageUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.imageFormat;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.variantOptionQualifiers;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.attributes;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.priceData;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.code;
        n4 = zy_2.b(n4, n8, (String)object);
        object = this.url;
        n4 = zy_2.b(n4, n8, (String)object);
        object = this.color;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
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
        n3 = (int)(this.isSelectedOption ? 1 : 0);
        int n10 = 1237;
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.stock;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Stock)object).hashCode();
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
        object = this.mandatoryInfo;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.sizeDisplayType;
        n4 = zy_2.b(n4, n8, (String)object);
        object = this.scDisplaySize;
        n4 = zy_2.b(n4, n8, (String)object);
        object = this.displaySizeFormat;
        n4 = zy_2.b(n4, n8, (String)object);
        object = this.commercialType;
        n4 = zy_2.b(n4, n8, (String)object);
        object = this.priceBreakUp;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.variantOptionSizeQualifier;
        if (object != null) {
            n7 = ((ProductOptionVariant)object).hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.isReturnable ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = this.returnWindow;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.isExchangeable ? 1 : 0);
        if (n7 != 0) {
            n10 = 1231;
        }
        return n4 + n10;
    }

    public final boolean isExchangeable() {
        return this.isExchangeable;
    }

    public final boolean isReturnable() {
        return this.isReturnable;
    }

    public final boolean isSelectedOption() {
        return this.isSelectedOption;
    }

    public final void setAttributes(List list) {
        this.attributes = list;
    }

    public final void setCode(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.code = string2;
    }

    public final void setColor(String string2) {
        this.color = string2;
    }

    public final void setCommercialType(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.commercialType = string2;
    }

    public final void setDisplaySizeFormat(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.displaySizeFormat = string2;
    }

    public final void setImageFormat(String string2) {
        this.imageFormat = string2;
    }

    public final void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public final void setMandatoryInfo(ArrayList arrayList) {
        this.mandatoryInfo = arrayList;
    }

    public final void setModelImage(ModelImage modelImage) {
        this.modelImage = modelImage;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setPriceBreakUp(ArrayList arrayList) {
        this.priceBreakUp = arrayList;
    }

    public final void setPriceData(Price price) {
        this.priceData = price;
    }

    public final void setQualifier(String string2) {
        this.qualifier = string2;
    }

    public final void setScDisplaySize(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.scDisplaySize = string2;
    }

    public final void setSelectedOption(boolean bl2) {
        this.isSelectedOption = bl2;
    }

    public final void setSizeDisplayType(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.sizeDisplayType = string2;
    }

    public final void setStock(Stock stock) {
        this.stock = stock;
    }

    public final void setUrl(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.url = string2;
    }

    public final void setValue(String string2) {
        this.value = string2;
    }

    public final void setVariantOptionQualifiers(List list) {
        this.variantOptionQualifiers = list;
    }

    public final void setVariantOptionSizeQualifier(ProductOptionVariant productOptionVariant) {
        this.variantOptionSizeQualifier = productOptionVariant;
    }

    public final void setWasPriceData(Price price) {
        this.wasPriceData = price;
    }

    public String toString() {
        Serializable serializable = this;
        Object object = this.name;
        String string2 = this.value;
        String string3 = this.qualifier;
        String string4 = this.imageUrl;
        String string5 = this.imageFormat;
        List list = this.variantOptionQualifiers;
        List list2 = this.attributes;
        Price price = this.priceData;
        String string6 = this.code;
        String string7 = this.url;
        String string8 = this.color;
        ModelImage modelImage = this.modelImage;
        boolean bl2 = this.isSelectedOption;
        Stock stock = this.stock;
        Price price2 = this.wasPriceData;
        ArrayList arrayList = this.mandatoryInfo;
        String string9 = this.sizeDisplayType;
        String string10 = this.scDisplaySize;
        String string11 = this.displaySizeFormat;
        String string12 = this.commercialType;
        ArrayList arrayList2 = this.priceBreakUp;
        ProductOptionVariant productOptionVariant = this.variantOptionSizeQualifier;
        boolean bl3 = this.isReturnable;
        int n3 = this.returnWindow;
        boolean bl4 = this.isExchangeable;
        serializable = og_1.a("ProductOptionItem(name=", (String)object, ", value=", string2, ", qualifier=");
        X50.a((StringBuilder)serializable, string3, ", imageUrl=", string4, ", imageFormat=");
        ((StringBuilder)serializable).append(string5);
        ((StringBuilder)serializable).append(", variantOptionQualifiers=");
        ((StringBuilder)serializable).append(list);
        ((StringBuilder)serializable).append(", attributes=");
        ((StringBuilder)serializable).append(list2);
        ((StringBuilder)serializable).append(", priceData=");
        ((StringBuilder)serializable).append(price);
        ((StringBuilder)serializable).append(", code=");
        X50.a((StringBuilder)serializable, string6, ", url=", string7, ", color=");
        ((StringBuilder)serializable).append(string8);
        ((StringBuilder)serializable).append(", modelImage=");
        ((StringBuilder)serializable).append(modelImage);
        ((StringBuilder)serializable).append(", isSelectedOption=");
        ((StringBuilder)serializable).append(bl2);
        ((StringBuilder)serializable).append(", stock=");
        object = stock;
        ((StringBuilder)serializable).append(stock);
        ((StringBuilder)serializable).append(", wasPriceData=");
        object = price2;
        ((StringBuilder)serializable).append(price2);
        ((StringBuilder)serializable).append(", mandatoryInfo=");
        object = arrayList;
        ((StringBuilder)serializable).append(arrayList);
        ((StringBuilder)serializable).append(", sizeDisplayType=");
        string3 = string9;
        string4 = string10;
        X50.a((StringBuilder)serializable, string9, ", scDisplaySize=", string10, ", displaySizeFormat=");
        string3 = string11;
        string4 = string12;
        X50.a((StringBuilder)serializable, string11, ", commercialType=", string12, ", priceBreakUp=");
        object = arrayList2;
        ((StringBuilder)serializable).append(arrayList2);
        ((StringBuilder)serializable).append(", variantOptionSizeQualifier=");
        object = productOptionVariant;
        ((StringBuilder)serializable).append(productOptionVariant);
        ((StringBuilder)serializable).append(", isReturnable=");
        ((StringBuilder)serializable).append(bl3);
        ((StringBuilder)serializable).append(", returnWindow=");
        ((StringBuilder)serializable).append(n3);
        ((StringBuilder)serializable).append(", isExchangeable=");
        return Vm.a(")", bl4, (StringBuilder)serializable);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Parcelable parcelable;
        int n4;
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Iterator iterator = this.name;
        parcel.writeString((String)((Object)iterator));
        iterator = this.value;
        parcel.writeString((String)((Object)iterator));
        iterator = this.qualifier;
        parcel.writeString((String)((Object)iterator));
        iterator = this.imageUrl;
        parcel.writeString((String)((Object)iterator));
        iterator = this.imageFormat;
        parcel.writeString((String)((Object)iterator));
        iterator = this.variantOptionQualifiers;
        int n7 = 1;
        if (iterator == null) {
            parcel.writeInt(0);
        } else {
            iterator = oz0_2.a(parcel, (List)((Object)iterator), n7);
            while ((n4 = iterator.hasNext()) != 0) {
                parcelable = (ProductOptionVariant)iterator.next();
                parcelable.writeToParcel(parcel, n3);
            }
        }
        iterator = this.attributes;
        if (iterator == null) {
            parcel.writeInt(0);
        } else {
            iterator = oz0_2.a(parcel, (List)((Object)iterator), n7);
            while ((n4 = iterator.hasNext()) != 0) {
                parcelable = (ProductOptionVariant)iterator.next();
                parcelable.writeToParcel(parcel, n3);
            }
        }
        iterator = this.priceData;
        parcel.writeParcelable((Parcelable)iterator, n3);
        iterator = this.code;
        parcel.writeString((String)((Object)iterator));
        iterator = this.url;
        parcel.writeString((String)((Object)iterator));
        iterator = this.color;
        parcel.writeString((String)((Object)iterator));
        iterator = this.modelImage;
        if (iterator == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n7);
            ((ModelImage)((Object)iterator)).writeToParcel(parcel, n3);
        }
        int n8 = this.isSelectedOption;
        parcel.writeInt(n8);
        iterator = this.stock;
        if (iterator == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n7);
            ((Stock)((Object)iterator)).writeToParcel(parcel, n3);
        }
        iterator = this.wasPriceData;
        parcel.writeParcelable((Parcelable)iterator, n3);
        iterator = this.mandatoryInfo;
        if (iterator == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n7);
            n4 = ((ArrayList)((Object)iterator)).size();
            parcel.writeInt(n4);
            iterator = ((ArrayList)((Object)iterator)).iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                parcelable = (MandatoryInfo)iterator.next();
                parcelable.writeToParcel(parcel, n3);
            }
        }
        iterator = this.sizeDisplayType;
        parcel.writeString((String)((Object)iterator));
        iterator = this.scDisplaySize;
        parcel.writeString((String)((Object)iterator));
        iterator = this.displaySizeFormat;
        parcel.writeString((String)((Object)iterator));
        iterator = this.commercialType;
        parcel.writeString((String)((Object)iterator));
        iterator = this.priceBreakUp;
        if (iterator == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n7);
            n4 = ((ArrayList)((Object)iterator)).size();
            parcel.writeInt(n4);
            iterator = ((ArrayList)((Object)iterator)).iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                parcelable = (PriceBreakUp)iterator.next();
                if (parcelable == null) {
                    parcel.writeInt(0);
                    continue;
                }
                parcel.writeInt(n7);
                parcelable.writeToParcel(parcel, n3);
            }
        }
        iterator = this.variantOptionSizeQualifier;
        if (iterator == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n7);
            ((ProductOptionVariant)((Object)iterator)).writeToParcel(parcel, n3);
        }
        n3 = (int)(this.isReturnable ? 1 : 0);
        parcel.writeInt(n3);
        n3 = this.returnWindow;
        parcel.writeInt(n3);
        n3 = (int)(this.isExchangeable ? 1 : 0);
        parcel.writeInt(n3);
    }
}

