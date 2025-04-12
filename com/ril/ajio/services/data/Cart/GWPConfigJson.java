/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Cart;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Cart.GWPConfigJson$Creator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class GWPConfigJson
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String cancelPolicy;
    private final String cartComboProductTitle;
    private final String cartLevelRemoveMsg;
    private final String cartUnlockFreebies;
    private final String cartUnlockFreebiesDescription;
    private final String cartfreebiesHeaderMore;
    private final String cartfreebiesHeaderOne;
    private final String freeTextOnProduct;
    private final String freebiesMoreThanOne;
    private final String freebiesOne;
    private final Boolean master;
    private final String orderCancelDetailFreebies;
    private final String orderCancelDetailMoreFreebies;
    private final String orderCancelInitFreebies;
    private final String orderCancelInitMoreFreebies;
    private final String orderDetailsReturnFreebies;
    private final String orderDetailsReturnMoreFreebies;
    private final String orderFreebiesWithProduct;
    private final String orderListingFreebiesWithProduct;
    private final String orderListingMoreFreebiesWithProduct;
    private final String orderMoreFreebiesWithProduct;
    private final String orderReturnNeededFreebies;
    private final String orderReturnNeededMoreFreebies;
    private final String pdpFreebiesMoreThanOne;
    private final String pdpFreebiesOne;
    private final String productLevelRemoveMsg;
    private final List returnStatusToShowFreebies;
    private final String returnText;
    private final String termsAndCondition;
    private final String viewAllProducts;

    static {
        GWPConfigJson$Creator gWPConfigJson$Creator = new GWPConfigJson$Creator();
        CREATOR = gWPConfigJson$Creator;
    }

    public GWPConfigJson() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1 >>> 2, null);
    }

    public GWPConfigJson(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Boolean bl2, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18, String string19, String string20, String string21, String string22, String string23, String string24, String string25, String string26, String string27, String string28, String string29, List list) {
        this.cartLevelRemoveMsg = string2;
        this.cartUnlockFreebies = string3;
        this.cartUnlockFreebiesDescription = string4;
        this.cartfreebiesHeaderMore = string5;
        this.cartfreebiesHeaderOne = string6;
        this.freeTextOnProduct = string7;
        this.freebiesMoreThanOne = string8;
        this.freebiesOne = string9;
        this.master = bl2;
        this.orderDetailsReturnFreebies = string10;
        this.orderDetailsReturnMoreFreebies = string11;
        this.orderFreebiesWithProduct = string12;
        this.orderListingFreebiesWithProduct = string13;
        this.orderListingMoreFreebiesWithProduct = string14;
        this.orderMoreFreebiesWithProduct = string15;
        this.orderReturnNeededFreebies = string16;
        this.orderReturnNeededMoreFreebies = string17;
        this.pdpFreebiesMoreThanOne = string18;
        this.pdpFreebiesOne = string19;
        this.productLevelRemoveMsg = string20;
        this.returnText = string21;
        this.termsAndCondition = string22;
        this.viewAllProducts = string23;
        this.cartComboProductTitle = string24;
        this.orderCancelInitFreebies = string25;
        this.orderCancelInitMoreFreebies = string26;
        this.orderCancelDetailFreebies = string27;
        this.orderCancelDetailMoreFreebies = string28;
        this.cancelPolicy = string29;
        this.returnStatusToShowFreebies = list;
    }

    public /* synthetic */ GWPConfigJson(String object, String string2, String string3, String string4, String string5, String string6, String string7, String string8, Boolean object2, String object3, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18, String string19, String string20, String string21, String string22, String string23, String string24, String string25, String string26, String string27, List object4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        List list;
        String string28;
        String string29;
        String string30;
        String string31;
        String string32;
        String string33;
        String string34;
        String string35;
        String string36;
        String string37;
        String string38;
        String string39;
        String string40;
        String string41;
        String string42;
        String string43;
        String string44;
        String string45;
        String string46;
        String string47;
        String string48;
        String string49;
        String string50;
        String string51;
        String string52;
        String string53;
        String string54;
        String string55;
        int n4 = n3;
        int n7 = n3 & 1;
        if (n7 != 0) {
            n7 = 0;
            string55 = null;
        } else {
            string55 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string54 = null;
        } else {
            string54 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string53 = null;
        } else {
            string53 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string52 = null;
        } else {
            string52 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string51 = null;
        } else {
            string51 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string50 = null;
        } else {
            string50 = string6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string49 = null;
        } else {
            string49 = string7;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string48 = null;
        } else {
            string48 = string8;
        }
        int n19 = n4 & 0x100;
        Object object5 = n19 != 0 ? Boolean.FALSE : object2;
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string47 = null;
        } else {
            string47 = object3;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string46 = null;
        } else {
            string46 = string9;
        }
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            n22 = 0;
            string45 = null;
        } else {
            string45 = string10;
        }
        int n24 = n4 & 0x1000;
        if (n24 != 0) {
            n24 = 0;
            string44 = null;
        } else {
            string44 = string11;
        }
        int n25 = n4 & 0x2000;
        if (n25 != 0) {
            n25 = 0;
            string43 = null;
        } else {
            string43 = string12;
        }
        int n26 = n4 & 0x4000;
        if (n26 != 0) {
            n26 = 0;
            string42 = null;
        } else {
            string42 = string13;
        }
        int n27 = n4 & 0x8000;
        if (n27 != 0) {
            n27 = 0;
            string41 = null;
        } else {
            string41 = string14;
        }
        int n28 = n4 & 0x10000;
        if (n28 != 0) {
            n28 = 0;
            string40 = null;
        } else {
            string40 = string15;
        }
        int n29 = n4 & 0x20000;
        if (n29 != 0) {
            n29 = 0;
            string39 = null;
        } else {
            string39 = string16;
        }
        int n30 = n4 & 0x40000;
        if (n30 != 0) {
            n30 = 0;
            string38 = null;
        } else {
            string38 = string17;
        }
        int n32 = n4 & 0x80000;
        if (n32 != 0) {
            n32 = 0;
            string37 = null;
        } else {
            string37 = string18;
        }
        int n34 = n4 & 0x100000;
        if (n34 != 0) {
            n34 = 0;
            string36 = null;
        } else {
            string36 = string19;
        }
        int n35 = n4 & 0x200000;
        if (n35 != 0) {
            n35 = 0;
            string35 = null;
        } else {
            string35 = string20;
        }
        int n36 = n4 & 0x400000;
        if (n36 != 0) {
            n36 = 0;
            string34 = null;
        } else {
            string34 = string21;
        }
        int n37 = n4 & 0x800000;
        if (n37 != 0) {
            n37 = 0;
            string33 = null;
        } else {
            string33 = string22;
        }
        int n38 = n4 & 0x1000000;
        if (n38 != 0) {
            n38 = 0;
            string32 = null;
        } else {
            string32 = string23;
        }
        int n39 = n4 & 0x2000000;
        if (n39 != 0) {
            n39 = 0;
            string31 = null;
        } else {
            string31 = string24;
        }
        int n41 = n4 & 0x4000000;
        if (n41 != 0) {
            n41 = 0;
            string30 = null;
        } else {
            string30 = string25;
        }
        int n42 = n4 & 0x8000000;
        if (n42 != 0) {
            n42 = 0;
            string29 = null;
        } else {
            string29 = string26;
        }
        int n43 = n4 & 0x10000000;
        if (n43 != 0) {
            n43 = 0;
            string28 = null;
        } else {
            string28 = string27;
        }
        int n44 = 0x20000000;
        if ((n4 &= n44) != 0) {
            n4 = 0;
            list = null;
        } else {
            list = object4;
        }
        object = this;
        string2 = string55;
        string3 = string54;
        string4 = string53;
        string5 = string52;
        string6 = string51;
        string7 = string50;
        string8 = string49;
        object2 = string48;
        object3 = object5;
        string9 = string47;
        string10 = string46;
        string11 = string45;
        string12 = string44;
        string13 = string43;
        string14 = string42;
        string15 = string41;
        string16 = string40;
        string17 = string39;
        string18 = string38;
        string19 = string37;
        string20 = string36;
        string21 = string35;
        string22 = string34;
        string23 = string33;
        string24 = string32;
        string25 = string31;
        string26 = string30;
        string27 = string29;
        object4 = string28;
        this(string55, string54, string53, string52, string51, string50, string49, string48, (Boolean)object5, string47, string46, string45, string44, string43, string42, string41, string40, string39, string38, string37, string36, string35, string34, string33, string32, string31, string30, string29, string28, list);
    }

    public static /* synthetic */ GWPConfigJson copy$default(GWPConfigJson gWPConfigJson, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Boolean bl2, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18, String string19, String string20, String string21, String string22, String string23, String string24, String string25, String string26, String string27, String string28, String string29, List list, int n3, Object object) {
        GWPConfigJson gWPConfigJson2 = gWPConfigJson;
        int n4 = n3;
        int n7 = n3 & 1;
        String string30 = n7 != 0 ? gWPConfigJson.cartLevelRemoveMsg : string2;
        int n8 = n4 & 2;
        String string31 = n8 != 0 ? gWPConfigJson2.cartUnlockFreebies : string3;
        int n10 = n4 & 4;
        String string32 = n10 != 0 ? gWPConfigJson2.cartUnlockFreebiesDescription : string4;
        int n14 = n4 & 8;
        String string33 = n14 != 0 ? gWPConfigJson2.cartfreebiesHeaderMore : string5;
        int n15 = n4 & 0x10;
        String string34 = n15 != 0 ? gWPConfigJson2.cartfreebiesHeaderOne : string6;
        int n16 = n4 & 0x20;
        String string35 = n16 != 0 ? gWPConfigJson2.freeTextOnProduct : string7;
        int n17 = n4 & 0x40;
        String string36 = n17 != 0 ? gWPConfigJson2.freebiesMoreThanOne : string8;
        int n18 = n4 & 0x80;
        String string37 = n18 != 0 ? gWPConfigJson2.freebiesOne : string9;
        int n19 = n4 & 0x100;
        Boolean bl3 = n19 != 0 ? gWPConfigJson2.master : bl2;
        int n20 = n4 & 0x200;
        String string38 = n20 != 0 ? gWPConfigJson2.orderDetailsReturnFreebies : string10;
        int n21 = n4 & 0x400;
        String string39 = n21 != 0 ? gWPConfigJson2.orderDetailsReturnMoreFreebies : string11;
        int n22 = n4 & 0x800;
        String string40 = n22 != 0 ? gWPConfigJson2.orderFreebiesWithProduct : string12;
        int n24 = n4 & 0x1000;
        String string41 = n24 != 0 ? gWPConfigJson2.orderListingFreebiesWithProduct : string13;
        int n25 = n4 & 0x2000;
        String string42 = n25 != 0 ? gWPConfigJson2.orderListingMoreFreebiesWithProduct : string14;
        string14 = string42;
        n25 = n4 & 0x4000;
        string42 = n25 != 0 ? gWPConfigJson2.orderMoreFreebiesWithProduct : string15;
        int n26 = n4 & 0x8000;
        string15 = string42;
        string42 = n26 != 0 ? gWPConfigJson2.orderReturnNeededFreebies : string16;
        n26 = n4 & 0x10000;
        string16 = string42;
        string42 = n26 != 0 ? gWPConfigJson2.orderReturnNeededMoreFreebies : string17;
        n26 = n4 & 0x20000;
        string17 = string42;
        string42 = n26 != 0 ? gWPConfigJson2.pdpFreebiesMoreThanOne : string18;
        n26 = n4 & 0x40000;
        string18 = string42;
        string42 = n26 != 0 ? gWPConfigJson2.pdpFreebiesOne : string19;
        n26 = n4 & 0x80000;
        string19 = string42;
        string42 = n26 != 0 ? gWPConfigJson2.productLevelRemoveMsg : string20;
        n26 = n4 & 0x100000;
        string20 = string42;
        string42 = n26 != 0 ? gWPConfigJson2.returnText : string21;
        n26 = n4 & 0x200000;
        string21 = string42;
        string42 = n26 != 0 ? gWPConfigJson2.termsAndCondition : string22;
        n26 = n4 & 0x400000;
        string22 = string42;
        string42 = n26 != 0 ? gWPConfigJson2.viewAllProducts : string23;
        n26 = n4 & 0x800000;
        string23 = string42;
        string42 = n26 != 0 ? gWPConfigJson2.cartComboProductTitle : string24;
        n26 = n4 & 0x1000000;
        string24 = string42;
        string42 = n26 != 0 ? gWPConfigJson2.orderCancelInitFreebies : string25;
        n26 = n4 & 0x2000000;
        string25 = string42;
        string42 = n26 != 0 ? gWPConfigJson2.orderCancelInitMoreFreebies : string26;
        n26 = n4 & 0x4000000;
        string26 = string42;
        string42 = n26 != 0 ? gWPConfigJson2.orderCancelDetailFreebies : string27;
        n26 = n4 & 0x8000000;
        string27 = string42;
        string42 = n26 != 0 ? gWPConfigJson2.orderCancelDetailMoreFreebies : string28;
        n26 = n4 & 0x10000000;
        string28 = string42;
        string42 = n26 != 0 ? gWPConfigJson2.cancelPolicy : string29;
        n26 = 0x20000000;
        List list2 = (n4 &= n26) != 0 ? gWPConfigJson2.returnStatusToShowFreebies : list;
        string2 = string30;
        string3 = string31;
        string4 = string32;
        string5 = string33;
        string6 = string34;
        string7 = string35;
        string8 = string36;
        string9 = string37;
        bl2 = bl3;
        string10 = string38;
        string11 = string39;
        string12 = string40;
        string13 = string41;
        string29 = string42;
        list = list2;
        return gWPConfigJson.copy(string30, string31, string32, string33, string34, string35, string36, string37, bl3, string38, string39, string40, string41, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string42, list2);
    }

    public final String component1() {
        return this.cartLevelRemoveMsg;
    }

    public final String component10() {
        return this.orderDetailsReturnFreebies;
    }

    public final String component11() {
        return this.orderDetailsReturnMoreFreebies;
    }

    public final String component12() {
        return this.orderFreebiesWithProduct;
    }

    public final String component13() {
        return this.orderListingFreebiesWithProduct;
    }

    public final String component14() {
        return this.orderListingMoreFreebiesWithProduct;
    }

    public final String component15() {
        return this.orderMoreFreebiesWithProduct;
    }

    public final String component16() {
        return this.orderReturnNeededFreebies;
    }

    public final String component17() {
        return this.orderReturnNeededMoreFreebies;
    }

    public final String component18() {
        return this.pdpFreebiesMoreThanOne;
    }

    public final String component19() {
        return this.pdpFreebiesOne;
    }

    public final String component2() {
        return this.cartUnlockFreebies;
    }

    public final String component20() {
        return this.productLevelRemoveMsg;
    }

    public final String component21() {
        return this.returnText;
    }

    public final String component22() {
        return this.termsAndCondition;
    }

    public final String component23() {
        return this.viewAllProducts;
    }

    public final String component24() {
        return this.cartComboProductTitle;
    }

    public final String component25() {
        return this.orderCancelInitFreebies;
    }

    public final String component26() {
        return this.orderCancelInitMoreFreebies;
    }

    public final String component27() {
        return this.orderCancelDetailFreebies;
    }

    public final String component28() {
        return this.orderCancelDetailMoreFreebies;
    }

    public final String component29() {
        return this.cancelPolicy;
    }

    public final String component3() {
        return this.cartUnlockFreebiesDescription;
    }

    public final List component30() {
        return this.returnStatusToShowFreebies;
    }

    public final String component4() {
        return this.cartfreebiesHeaderMore;
    }

    public final String component5() {
        return this.cartfreebiesHeaderOne;
    }

    public final String component6() {
        return this.freeTextOnProduct;
    }

    public final String component7() {
        return this.freebiesMoreThanOne;
    }

    public final String component8() {
        return this.freebiesOne;
    }

    public final Boolean component9() {
        return this.master;
    }

    public final GWPConfigJson copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Boolean bl2, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18, String string19, String string20, String string21, String string22, String string23, String string24, String string25, String string26, String string27, String string28, String string29, List list) {
        GWPConfigJson gWPConfigJson = new GWPConfigJson(string2, string3, string4, string5, string6, string7, string8, string9, bl2, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, list);
        return gWPConfigJson;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof GWPConfigJson;
        if (!bl3) {
            return false;
        }
        object = (GWPConfigJson)object;
        Object object2 = this.cartLevelRemoveMsg;
        Object object3 = ((GWPConfigJson)object).cartLevelRemoveMsg;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartUnlockFreebies;
        object3 = ((GWPConfigJson)object).cartUnlockFreebies;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartUnlockFreebiesDescription;
        object3 = ((GWPConfigJson)object).cartUnlockFreebiesDescription;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartfreebiesHeaderMore;
        object3 = ((GWPConfigJson)object).cartfreebiesHeaderMore;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartfreebiesHeaderOne;
        object3 = ((GWPConfigJson)object).cartfreebiesHeaderOne;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.freeTextOnProduct;
        object3 = ((GWPConfigJson)object).freeTextOnProduct;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.freebiesMoreThanOne;
        object3 = ((GWPConfigJson)object).freebiesMoreThanOne;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.freebiesOne;
        object3 = ((GWPConfigJson)object).freebiesOne;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.master;
        object3 = ((GWPConfigJson)object).master;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderDetailsReturnFreebies;
        object3 = ((GWPConfigJson)object).orderDetailsReturnFreebies;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderDetailsReturnMoreFreebies;
        object3 = ((GWPConfigJson)object).orderDetailsReturnMoreFreebies;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderFreebiesWithProduct;
        object3 = ((GWPConfigJson)object).orderFreebiesWithProduct;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderListingFreebiesWithProduct;
        object3 = ((GWPConfigJson)object).orderListingFreebiesWithProduct;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderListingMoreFreebiesWithProduct;
        object3 = ((GWPConfigJson)object).orderListingMoreFreebiesWithProduct;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderMoreFreebiesWithProduct;
        object3 = ((GWPConfigJson)object).orderMoreFreebiesWithProduct;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderReturnNeededFreebies;
        object3 = ((GWPConfigJson)object).orderReturnNeededFreebies;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderReturnNeededMoreFreebies;
        object3 = ((GWPConfigJson)object).orderReturnNeededMoreFreebies;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pdpFreebiesMoreThanOne;
        object3 = ((GWPConfigJson)object).pdpFreebiesMoreThanOne;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pdpFreebiesOne;
        object3 = ((GWPConfigJson)object).pdpFreebiesOne;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.productLevelRemoveMsg;
        object3 = ((GWPConfigJson)object).productLevelRemoveMsg;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.returnText;
        object3 = ((GWPConfigJson)object).returnText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.termsAndCondition;
        object3 = ((GWPConfigJson)object).termsAndCondition;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.viewAllProducts;
        object3 = ((GWPConfigJson)object).viewAllProducts;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartComboProductTitle;
        object3 = ((GWPConfigJson)object).cartComboProductTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderCancelInitFreebies;
        object3 = ((GWPConfigJson)object).orderCancelInitFreebies;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderCancelInitMoreFreebies;
        object3 = ((GWPConfigJson)object).orderCancelInitMoreFreebies;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderCancelDetailFreebies;
        object3 = ((GWPConfigJson)object).orderCancelDetailFreebies;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderCancelDetailMoreFreebies;
        object3 = ((GWPConfigJson)object).orderCancelDetailMoreFreebies;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cancelPolicy;
        object3 = ((GWPConfigJson)object).cancelPolicy;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.returnStatusToShowFreebies;
        object = ((GWPConfigJson)object).returnStatusToShowFreebies;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCancelPolicy() {
        return this.cancelPolicy;
    }

    public final String getCartComboProductTitle() {
        return this.cartComboProductTitle;
    }

    public final String getCartLevelRemoveMsg() {
        return this.cartLevelRemoveMsg;
    }

    public final String getCartUnlockFreebies() {
        return this.cartUnlockFreebies;
    }

    public final String getCartUnlockFreebiesDescription() {
        return this.cartUnlockFreebiesDescription;
    }

    public final String getCartfreebiesHeaderMore() {
        return this.cartfreebiesHeaderMore;
    }

    public final String getCartfreebiesHeaderOne() {
        return this.cartfreebiesHeaderOne;
    }

    public final String getFreeTextOnProduct() {
        return this.freeTextOnProduct;
    }

    public final String getFreebiesMoreThanOne() {
        return this.freebiesMoreThanOne;
    }

    public final String getFreebiesOne() {
        return this.freebiesOne;
    }

    public final Boolean getMaster() {
        return this.master;
    }

    public final String getOrderCancelDetailFreebies() {
        return this.orderCancelDetailFreebies;
    }

    public final String getOrderCancelDetailMoreFreebies() {
        return this.orderCancelDetailMoreFreebies;
    }

    public final String getOrderCancelInitFreebies() {
        return this.orderCancelInitFreebies;
    }

    public final String getOrderCancelInitMoreFreebies() {
        return this.orderCancelInitMoreFreebies;
    }

    public final String getOrderDetailsReturnFreebies() {
        return this.orderDetailsReturnFreebies;
    }

    public final String getOrderDetailsReturnMoreFreebies() {
        return this.orderDetailsReturnMoreFreebies;
    }

    public final String getOrderFreebiesWithProduct() {
        return this.orderFreebiesWithProduct;
    }

    public final String getOrderListingFreebiesWithProduct() {
        return this.orderListingFreebiesWithProduct;
    }

    public final String getOrderListingMoreFreebiesWithProduct() {
        return this.orderListingMoreFreebiesWithProduct;
    }

    public final String getOrderMoreFreebiesWithProduct() {
        return this.orderMoreFreebiesWithProduct;
    }

    public final String getOrderReturnNeededFreebies() {
        return this.orderReturnNeededFreebies;
    }

    public final String getOrderReturnNeededMoreFreebies() {
        return this.orderReturnNeededMoreFreebies;
    }

    public final String getPdpFreebiesMoreThanOne() {
        return this.pdpFreebiesMoreThanOne;
    }

    public final String getPdpFreebiesOne() {
        return this.pdpFreebiesOne;
    }

    public final String getProductLevelRemoveMsg() {
        return this.productLevelRemoveMsg;
    }

    public final List getReturnStatusToShowFreebies() {
        return this.returnStatusToShowFreebies;
    }

    public final String getReturnText() {
        return this.returnText;
    }

    public final String getTermsAndCondition() {
        return this.termsAndCondition;
    }

    public final String getViewAllProducts() {
        return this.viewAllProducts;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.cartLevelRemoveMsg;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.cartUnlockFreebies;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cartUnlockFreebiesDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cartfreebiesHeaderMore;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cartfreebiesHeaderOne;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.freeTextOnProduct;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.freebiesMoreThanOne;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.freebiesOne;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.master;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderDetailsReturnFreebies;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderDetailsReturnMoreFreebies;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderFreebiesWithProduct;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderListingFreebiesWithProduct;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderListingMoreFreebiesWithProduct;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderMoreFreebiesWithProduct;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderReturnNeededFreebies;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderReturnNeededMoreFreebies;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pdpFreebiesMoreThanOne;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pdpFreebiesOne;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productLevelRemoveMsg;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.returnText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.termsAndCondition;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.viewAllProducts;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cartComboProductTitle;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderCancelInitFreebies;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderCancelInitMoreFreebies;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderCancelDetailFreebies;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderCancelDetailMoreFreebies;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cancelPolicy;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.returnStatusToShowFreebies;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        Object object = this;
        Object object2 = this.cartLevelRemoveMsg;
        String string2 = this.cartUnlockFreebies;
        String string3 = this.cartUnlockFreebiesDescription;
        String string4 = this.cartfreebiesHeaderMore;
        String string5 = this.cartfreebiesHeaderOne;
        String string6 = this.freeTextOnProduct;
        String string7 = this.freebiesMoreThanOne;
        String string8 = this.freebiesOne;
        Boolean bl2 = this.master;
        String string9 = this.orderDetailsReturnFreebies;
        String string10 = this.orderDetailsReturnMoreFreebies;
        String string11 = this.orderFreebiesWithProduct;
        String string12 = this.orderListingFreebiesWithProduct;
        String string13 = this.orderListingMoreFreebiesWithProduct;
        String string14 = this.orderMoreFreebiesWithProduct;
        String string15 = this.orderReturnNeededFreebies;
        String string16 = this.orderReturnNeededMoreFreebies;
        String string17 = this.pdpFreebiesMoreThanOne;
        String string18 = this.pdpFreebiesOne;
        String string19 = this.productLevelRemoveMsg;
        String string20 = this.returnText;
        String string21 = this.termsAndCondition;
        String string22 = this.viewAllProducts;
        String string23 = this.cartComboProductTitle;
        String string24 = this.orderCancelInitFreebies;
        String string25 = this.orderCancelInitMoreFreebies;
        String string26 = this.orderCancelDetailFreebies;
        String string27 = this.orderCancelDetailMoreFreebies;
        String string28 = this.cancelPolicy;
        List list = this.returnStatusToShowFreebies;
        object = og_1.a("GWPConfigJson(cartLevelRemoveMsg=", (String)object2, ", cartUnlockFreebies=", string2, ", cartUnlockFreebiesDescription=");
        X50.a((StringBuilder)object, string3, ", cartfreebiesHeaderMore=", string4, ", cartfreebiesHeaderOne=");
        X50.a((StringBuilder)object, string5, ", freeTextOnProduct=", string6, ", freebiesMoreThanOne=");
        X50.a((StringBuilder)object, string7, ", freebiesOne=", string8, ", master=");
        xi0_2.a(bl2, ", orderDetailsReturnFreebies=", string9, ", orderDetailsReturnMoreFreebies=", (StringBuilder)object);
        X50.a((StringBuilder)object, string10, ", orderFreebiesWithProduct=", string11, ", orderListingFreebiesWithProduct=");
        string3 = string12;
        X50.a((StringBuilder)object, string12, ", orderListingMoreFreebiesWithProduct=", string13, ", orderMoreFreebiesWithProduct=");
        string3 = string14;
        string4 = string15;
        X50.a((StringBuilder)object, string14, ", orderReturnNeededFreebies=", string15, ", orderReturnNeededMoreFreebies=");
        string3 = string16;
        string4 = string17;
        X50.a((StringBuilder)object, string16, ", pdpFreebiesMoreThanOne=", string17, ", pdpFreebiesOne=");
        string3 = string18;
        string4 = string19;
        X50.a((StringBuilder)object, string18, ", productLevelRemoveMsg=", string19, ", returnText=");
        string3 = string20;
        string4 = string21;
        X50.a((StringBuilder)object, string20, ", termsAndCondition=", string21, ", viewAllProducts=");
        string3 = string22;
        string4 = string23;
        X50.a((StringBuilder)object, string22, ", cartComboProductTitle=", string23, ", orderCancelInitFreebies=");
        string3 = string24;
        string4 = string25;
        X50.a((StringBuilder)object, string24, ", orderCancelInitMoreFreebies=", string25, ", orderCancelDetailFreebies=");
        string3 = string26;
        string4 = string27;
        X50.a((StringBuilder)object, string26, ", orderCancelDetailMoreFreebies=", string27, ", cancelPolicy=");
        object2 = string28;
        ((StringBuilder)object).append(string28);
        ((StringBuilder)object).append(", returnStatusToShowFreebies=");
        object2 = list;
        ((StringBuilder)object).append(list);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.cartLevelRemoveMsg;
        parcel.writeString((String)object);
        object = this.cartUnlockFreebies;
        parcel.writeString((String)object);
        object = this.cartUnlockFreebiesDescription;
        parcel.writeString((String)object);
        object = this.cartfreebiesHeaderMore;
        parcel.writeString((String)object);
        object = this.cartfreebiesHeaderOne;
        parcel.writeString((String)object);
        object = this.freeTextOnProduct;
        parcel.writeString((String)object);
        object = this.freebiesMoreThanOne;
        parcel.writeString((String)object);
        object = this.freebiesOne;
        parcel.writeString((String)object);
        object = this.master;
        if (object == null) {
            object = null;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            yi0_2.a(parcel, n4, (Boolean)object);
        }
        object = this.orderDetailsReturnFreebies;
        parcel.writeString((String)object);
        object = this.orderDetailsReturnMoreFreebies;
        parcel.writeString((String)object);
        object = this.orderFreebiesWithProduct;
        parcel.writeString((String)object);
        object = this.orderListingFreebiesWithProduct;
        parcel.writeString((String)object);
        object = this.orderListingMoreFreebiesWithProduct;
        parcel.writeString((String)object);
        object = this.orderMoreFreebiesWithProduct;
        parcel.writeString((String)object);
        object = this.orderReturnNeededFreebies;
        parcel.writeString((String)object);
        object = this.orderReturnNeededMoreFreebies;
        parcel.writeString((String)object);
        object = this.pdpFreebiesMoreThanOne;
        parcel.writeString((String)object);
        object = this.pdpFreebiesOne;
        parcel.writeString((String)object);
        object = this.productLevelRemoveMsg;
        parcel.writeString((String)object);
        object = this.returnText;
        parcel.writeString((String)object);
        object = this.termsAndCondition;
        parcel.writeString((String)object);
        object = this.viewAllProducts;
        parcel.writeString((String)object);
        object = this.cartComboProductTitle;
        parcel.writeString((String)object);
        object = this.orderCancelInitFreebies;
        parcel.writeString((String)object);
        object = this.orderCancelInitMoreFreebies;
        parcel.writeString((String)object);
        object = this.orderCancelDetailFreebies;
        parcel.writeString((String)object);
        object = this.orderCancelDetailMoreFreebies;
        parcel.writeString((String)object);
        object = this.cancelPolicy;
        parcel.writeString((String)object);
        object = this.returnStatusToShowFreebies;
        parcel.writeStringList((List)object);
    }
}

