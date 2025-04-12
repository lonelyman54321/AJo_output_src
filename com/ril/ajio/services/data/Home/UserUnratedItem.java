/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Home;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Home.HomePageRatingViewType;
import com.ril.ajio.services.data.Home.UserUnratedItem$Creator;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class UserUnratedItem
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String brandName;
    private String brandTitle;
    private String brickCode;
    private String deliveryDate;
    private ArrayList imageList;
    private String imageUrl;
    private Boolean isItemRated;
    private String orderId;
    private String productCode;
    private Float productRating;
    private String skuId;
    private HomePageRatingViewType viewType;

    static {
        UserUnratedItem$Creator userUnratedItem$Creator = new UserUnratedItem$Creator();
        CREATOR = userUnratedItem$Creator;
    }

    public UserUnratedItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public UserUnratedItem(String string2, String string3, String string4, String string5, String string6, Boolean bl2, HomePageRatingViewType homePageRatingViewType, ArrayList arrayList, Float f5, String string7, String string8, String string9) {
        this.brandName = string2;
        this.brandTitle = string3;
        this.deliveryDate = string4;
        this.imageUrl = string5;
        this.skuId = string6;
        this.isItemRated = bl2;
        this.viewType = homePageRatingViewType;
        this.imageList = arrayList;
        this.productRating = f5;
        this.orderId = string7;
        this.productCode = string8;
        this.brickCode = string9;
    }

    public /* synthetic */ UserUnratedItem(String object, String string2, String string3, String string4, String string5, Boolean object2, HomePageRatingViewType object3, ArrayList object4, Float serializable, String object5, String string6, String string7, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string8;
        String string9;
        Float f5;
        ArrayList arrayList;
        HomePageRatingViewType homePageRatingViewType;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        int n4 = n3;
        int n7 = n3 & 1;
        String string15 = null;
        if (n7 != 0) {
            n7 = 0;
            string14 = null;
        } else {
            string14 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string13 = null;
        } else {
            string13 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string12 = null;
        } else {
            string12 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string11 = null;
        } else {
            string11 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string10 = null;
        } else {
            string10 = string5;
        }
        int n16 = n4 & 0x20;
        Object object6 = n16 != 0 ? Boolean.FALSE : object2;
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            homePageRatingViewType = null;
        } else {
            homePageRatingViewType = object3;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            arrayList = null;
        } else {
            arrayList = object4;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            f5 = null;
        } else {
            f5 = serializable;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string9 = null;
        } else {
            string9 = object5;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string8 = null;
        } else {
            string8 = string6;
        }
        if ((n4 &= 0x800) == 0) {
            string15 = string7;
        }
        object = this;
        string2 = string14;
        string3 = string13;
        string4 = string12;
        string5 = string11;
        object2 = string10;
        object3 = object6;
        object4 = homePageRatingViewType;
        serializable = arrayList;
        object5 = f5;
        string6 = string9;
        string7 = string8;
        this(string14, string13, string12, string11, string10, (Boolean)object6, homePageRatingViewType, arrayList, f5, string9, string8, string15);
    }

    public static /* synthetic */ UserUnratedItem copy$default(UserUnratedItem userUnratedItem, String string2, String string3, String string4, String string5, String string6, Boolean bl2, HomePageRatingViewType homePageRatingViewType, ArrayList arrayList, Float f5, String string7, String string8, String string9, int n3, Object object) {
        UserUnratedItem userUnratedItem2 = userUnratedItem;
        int n4 = n3;
        int n7 = n3 & 1;
        String string10 = n7 != 0 ? userUnratedItem.brandName : string2;
        int n8 = n4 & 2;
        String string11 = n8 != 0 ? userUnratedItem2.brandTitle : string3;
        int n10 = n4 & 4;
        String string12 = n10 != 0 ? userUnratedItem2.deliveryDate : string4;
        int n14 = n4 & 8;
        String string13 = n14 != 0 ? userUnratedItem2.imageUrl : string5;
        int n15 = n4 & 0x10;
        String string14 = n15 != 0 ? userUnratedItem2.skuId : string6;
        int n16 = n4 & 0x20;
        Boolean bl3 = n16 != 0 ? userUnratedItem2.isItemRated : bl2;
        int n17 = n4 & 0x40;
        HomePageRatingViewType homePageRatingViewType2 = n17 != 0 ? userUnratedItem2.viewType : homePageRatingViewType;
        int n18 = n4 & 0x80;
        ArrayList arrayList2 = n18 != 0 ? userUnratedItem2.imageList : arrayList;
        int n19 = n4 & 0x100;
        Float f6 = n19 != 0 ? userUnratedItem2.productRating : f5;
        int n20 = n4 & 0x200;
        String string15 = n20 != 0 ? userUnratedItem2.orderId : string7;
        int n21 = n4 & 0x400;
        String string16 = n21 != 0 ? userUnratedItem2.productCode : string8;
        String string17 = (n4 &= 0x800) != 0 ? userUnratedItem2.brickCode : string9;
        string2 = string10;
        string3 = string11;
        string4 = string12;
        string5 = string13;
        string6 = string14;
        bl2 = bl3;
        homePageRatingViewType = homePageRatingViewType2;
        arrayList = arrayList2;
        f5 = f6;
        string7 = string15;
        string8 = string16;
        string9 = string17;
        return userUnratedItem.copy(string10, string11, string12, string13, string14, bl3, homePageRatingViewType2, arrayList2, f6, string15, string16, string17);
    }

    public final String component1() {
        return this.brandName;
    }

    public final String component10() {
        return this.orderId;
    }

    public final String component11() {
        return this.productCode;
    }

    public final String component12() {
        return this.brickCode;
    }

    public final String component2() {
        return this.brandTitle;
    }

    public final String component3() {
        return this.deliveryDate;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final String component5() {
        return this.skuId;
    }

    public final Boolean component6() {
        return this.isItemRated;
    }

    public final HomePageRatingViewType component7() {
        return this.viewType;
    }

    public final ArrayList component8() {
        return this.imageList;
    }

    public final Float component9() {
        return this.productRating;
    }

    public final UserUnratedItem copy(String string2, String string3, String string4, String string5, String string6, Boolean bl2, HomePageRatingViewType homePageRatingViewType, ArrayList arrayList, Float f5, String string7, String string8, String string9) {
        UserUnratedItem userUnratedItem = new UserUnratedItem(string2, string3, string4, string5, string6, bl2, homePageRatingViewType, arrayList, f5, string7, string8, string9);
        return userUnratedItem;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof UserUnratedItem;
        if (!bl3) {
            return false;
        }
        object = (UserUnratedItem)object;
        Object object2 = this.brandName;
        Object object3 = ((UserUnratedItem)object).brandName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brandTitle;
        object3 = ((UserUnratedItem)object).brandTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.deliveryDate;
        object3 = ((UserUnratedItem)object).deliveryDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageUrl;
        object3 = ((UserUnratedItem)object).imageUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.skuId;
        object3 = ((UserUnratedItem)object).skuId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isItemRated;
        object3 = ((UserUnratedItem)object).isItemRated;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.viewType;
        object3 = ((UserUnratedItem)object).viewType;
        if (object2 != object3) {
            return false;
        }
        object2 = this.imageList;
        object3 = ((UserUnratedItem)object).imageList;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.productRating;
        object3 = ((UserUnratedItem)object).productRating;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderId;
        object3 = ((UserUnratedItem)object).orderId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.productCode;
        object3 = ((UserUnratedItem)object).productCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brickCode;
        object = ((UserUnratedItem)object).brickCode;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final String getBrandTitle() {
        return this.brandTitle;
    }

    public final String getBrickCode() {
        return this.brickCode;
    }

    public final String getDeliveryDate() {
        return this.deliveryDate;
    }

    public final ArrayList getImageList() {
        return this.imageList;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final Float getProductRating() {
        return this.productRating;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    public final HomePageRatingViewType getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.brandName;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.brandTitle;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.deliveryDate;
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
        object = this.skuId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isItemRated;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.viewType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.imageList;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productRating;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brickCode;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isItemRated() {
        return this.isItemRated;
    }

    public final void setBrandName(String string2) {
        this.brandName = string2;
    }

    public final void setBrandTitle(String string2) {
        this.brandTitle = string2;
    }

    public final void setBrickCode(String string2) {
        this.brickCode = string2;
    }

    public final void setDeliveryDate(String string2) {
        this.deliveryDate = string2;
    }

    public final void setImageList(ArrayList arrayList) {
        this.imageList = arrayList;
    }

    public final void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public final void setItemRated(Boolean bl2) {
        this.isItemRated = bl2;
    }

    public final void setOrderId(String string2) {
        this.orderId = string2;
    }

    public final void setProductCode(String string2) {
        this.productCode = string2;
    }

    public final void setProductRating(Float f5) {
        this.productRating = f5;
    }

    public final void setSkuId(String string2) {
        this.skuId = string2;
    }

    public final void setViewType(HomePageRatingViewType homePageRatingViewType) {
        this.viewType = homePageRatingViewType;
    }

    public String toString() {
        CharSequence charSequence = this.brandName;
        String string2 = this.brandTitle;
        String string3 = this.deliveryDate;
        String string4 = this.imageUrl;
        String string5 = this.skuId;
        Boolean bl2 = this.isItemRated;
        HomePageRatingViewType homePageRatingViewType = this.viewType;
        ArrayList arrayList = this.imageList;
        Float f5 = this.productRating;
        String string6 = this.orderId;
        String string7 = this.productCode;
        String string8 = this.brickCode;
        charSequence = og_1.a("UserUnratedItem(brandName=", (String)charSequence, ", brandTitle=", string2, ", deliveryDate=");
        X50.a((StringBuilder)charSequence, string3, ", imageUrl=", string4, ", skuId=");
        vw0_1.a(bl2, string5, ", isItemRated=", ", viewType=", (StringBuilder)charSequence);
        ((StringBuilder)charSequence).append((Object)homePageRatingViewType);
        ((StringBuilder)charSequence).append(", imageList=");
        ((StringBuilder)charSequence).append(arrayList);
        ((StringBuilder)charSequence).append(", productRating=");
        ((StringBuilder)charSequence).append(f5);
        ((StringBuilder)charSequence).append(", orderId=");
        ((StringBuilder)charSequence).append(string6);
        ((StringBuilder)charSequence).append(", productCode=");
        return ko_0.a((StringBuilder)charSequence, string7, ", brickCode=", string8, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.brandName;
        parcel.writeString((String)object);
        object = this.brandTitle;
        parcel.writeString((String)object);
        object = this.deliveryDate;
        parcel.writeString((String)object);
        object = this.imageUrl;
        parcel.writeString((String)object);
        object = this.skuId;
        parcel.writeString((String)object);
        object = this.isItemRated;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            yi0_2.a(parcel, n4, (Boolean)object);
        }
        object = this.viewType;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            object = ((Enum)object).name();
            parcel.writeString((String)object);
        }
        object = this.imageList;
        parcel.writeStringList((List)object);
        object = this.productRating;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            float f5 = ((Float)object).floatValue();
            parcel.writeFloat(f5);
        }
        object = this.orderId;
        parcel.writeString((String)object);
        object = this.productCode;
        parcel.writeString((String)object);
        object = this.brickCode;
        parcel.writeString((String)object);
    }
}

