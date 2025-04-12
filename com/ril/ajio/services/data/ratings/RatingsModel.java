/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.ratings;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.ratings.RatingsModel$Creator;
import com.ril.ajio.services.data.ratings.ReviewModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class RatingsModel
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String baseProductId;
    private final String brandName;
    private final String imageUrl;
    private final String orderId;
    private final String productBrick;
    private final String productDescription;
    private Float productRating;
    private final ArrayList questionsArrayList;
    private final List reviewImages;
    private final ReviewModel reviewModel;
    private final String skuId;
    private final String sourcePage;
    private final String storeId;
    private ArrayList subRatingList;

    static {
        RatingsModel$Creator ratingsModel$Creator = new RatingsModel$Creator();
        CREATOR = ratingsModel$Creator;
    }

    public RatingsModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public RatingsModel(String string2) {
        this(string2, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null);
    }

    public RatingsModel(String string2, String string3) {
        this(string2, string3, null, null, null, null, null, null, null, null, null, null, null, null, 16380, null);
    }

    public RatingsModel(String string2, String string3, String string4) {
        this(string2, string3, string4, null, null, null, null, null, null, null, null, null, null, null, 16376, null);
    }

    public RatingsModel(String string2, String string3, String string4, Float f5) {
        this(string2, string3, string4, f5, null, null, null, null, null, null, null, null, null, null, 16368, null);
    }

    public RatingsModel(String string2, String string3, String string4, Float f5, String string5) {
        this(string2, string3, string4, f5, string5, null, null, null, null, null, null, null, null, null, 16352, null);
    }

    public RatingsModel(String string2, String string3, String string4, Float f5, String string5, String string6) {
        this(string2, string3, string4, f5, string5, string6, null, null, null, null, null, null, null, null, 16320, null);
    }

    public RatingsModel(String string2, String string3, String string4, Float f5, String string5, String string6, ArrayList arrayList) {
        this(string2, string3, string4, f5, string5, string6, arrayList, null, null, null, null, null, null, null, 16256, null);
    }

    public RatingsModel(String string2, String string3, String string4, Float f5, String string5, String string6, ArrayList arrayList, String string7) {
        this(string2, string3, string4, f5, string5, string6, arrayList, string7, null, null, null, null, null, null, 16128, null);
    }

    public RatingsModel(String string2, String string3, String string4, Float f5, String string5, String string6, ArrayList arrayList, String string7, String string8) {
        this(string2, string3, string4, f5, string5, string6, arrayList, string7, string8, null, null, null, null, null, 15872, null);
    }

    public RatingsModel(String string2, String string3, String string4, Float f5, String string5, String string6, ArrayList arrayList, String string7, String string8, String string9) {
        this(string2, string3, string4, f5, string5, string6, arrayList, string7, string8, string9, null, null, null, null, 15360, null);
    }

    public RatingsModel(String string2, String string3, String string4, Float f5, String string5, String string6, ArrayList arrayList, String string7, String string8, String string9, ArrayList arrayList2) {
        this(string2, string3, string4, f5, string5, string6, arrayList, string7, string8, string9, arrayList2, null, null, null, 14336, null);
    }

    public RatingsModel(String string2, String string3, String string4, Float f5, String string5, String string6, ArrayList arrayList, String string7, String string8, String string9, ArrayList arrayList2, List list) {
        Intrinsics.checkNotNullParameter(list, "reviewImages");
        this(string2, string3, string4, f5, string5, string6, arrayList, string7, string8, string9, arrayList2, list, null, null, 12288, null);
    }

    public RatingsModel(String string2, String string3, String string4, Float f5, String string5, String string6, ArrayList arrayList, String string7, String string8, String string9, ArrayList arrayList2, List list, ReviewModel reviewModel) {
        Intrinsics.checkNotNullParameter(list, "reviewImages");
        this(string2, string3, string4, f5, string5, string6, arrayList, string7, string8, string9, arrayList2, list, reviewModel, null, 8192, null);
    }

    public RatingsModel(String string2, String string3, String string4, Float f5, String string5, String string6, ArrayList arrayList, String string7, String string8, String string9, ArrayList arrayList2, List list, ReviewModel reviewModel, String string10) {
        Intrinsics.checkNotNullParameter(list, "reviewImages");
        this.brandName = string2;
        this.productDescription = string3;
        this.imageUrl = string4;
        this.productRating = f5;
        this.skuId = string5;
        this.sourcePage = string6;
        this.subRatingList = arrayList;
        this.orderId = string7;
        this.productBrick = string8;
        this.baseProductId = string9;
        this.questionsArrayList = arrayList2;
        this.reviewImages = list;
        this.reviewModel = reviewModel;
        this.storeId = string10;
    }

    public RatingsModel(String object, String string2, String string3, Float object2, String object3, String string4, ArrayList object4, String object5, String string5, String string6, ArrayList object6, List list, ReviewModel object7, String object8, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        ReviewModel reviewModel;
        ArrayList arrayList;
        String string7;
        String string8;
        String string9;
        ArrayList arrayList2;
        String string10;
        String string11;
        Float f5;
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
            f5 = null;
        } else {
            f5 = object2;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string11 = null;
        } else {
            string11 = object3;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string10 = null;
        } else {
            string10 = string4;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            arrayList2 = null;
        } else {
            arrayList2 = object4;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string9 = null;
        } else {
            string9 = object5;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string8 = null;
        } else {
            string8 = string5;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string7 = null;
        } else {
            string7 = string6;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            arrayList = null;
        } else {
            arrayList = object6;
        }
        int n22 = n4 & 0x800;
        List list2 = n22 != 0 ? mz0_2.a : list;
        int n24 = n4 & 0x1000;
        if (n24 != 0) {
            n24 = 0;
            reviewModel = null;
        } else {
            reviewModel = object7;
        }
        if ((n4 &= 0x2000) == 0) {
            string15 = object8;
        }
        object = this;
        string2 = string14;
        string3 = string13;
        object2 = string12;
        object3 = f5;
        string4 = string11;
        object4 = string10;
        object5 = arrayList2;
        string5 = string9;
        string6 = string8;
        object6 = string7;
        list = arrayList;
        object7 = list2;
        object8 = reviewModel;
        this(string14, string13, string12, f5, string11, string10, arrayList2, string9, string8, string7, arrayList, list2, reviewModel, string15);
    }

    public static /* synthetic */ RatingsModel copy$default(RatingsModel ratingsModel, String string2, String string3, String string4, Float f5, String string5, String string6, ArrayList arrayList, String string7, String string8, String string9, ArrayList arrayList2, List list, ReviewModel reviewModel, String string10, int n3, Object object) {
        RatingsModel ratingsModel2 = ratingsModel;
        int n4 = n3;
        int n7 = n3 & 1;
        String string11 = n7 != 0 ? ratingsModel.brandName : string2;
        int n8 = n4 & 2;
        String string12 = n8 != 0 ? ratingsModel2.productDescription : string3;
        int n10 = n4 & 4;
        String string13 = n10 != 0 ? ratingsModel2.imageUrl : string4;
        int n14 = n4 & 8;
        Float f6 = n14 != 0 ? ratingsModel2.productRating : f5;
        int n15 = n4 & 0x10;
        String string14 = n15 != 0 ? ratingsModel2.skuId : string5;
        int n16 = n4 & 0x20;
        String string15 = n16 != 0 ? ratingsModel2.sourcePage : string6;
        int n17 = n4 & 0x40;
        ArrayList arrayList3 = n17 != 0 ? ratingsModel2.subRatingList : arrayList;
        int n18 = n4 & 0x80;
        String string16 = n18 != 0 ? ratingsModel2.orderId : string7;
        int n19 = n4 & 0x100;
        String string17 = n19 != 0 ? ratingsModel2.productBrick : string8;
        int n20 = n4 & 0x200;
        String string18 = n20 != 0 ? ratingsModel2.baseProductId : string9;
        int n21 = n4 & 0x400;
        ArrayList arrayList4 = n21 != 0 ? ratingsModel2.questionsArrayList : arrayList2;
        int n22 = n4 & 0x800;
        List list2 = n22 != 0 ? ratingsModel2.reviewImages : list;
        int n24 = n4 & 0x1000;
        ReviewModel reviewModel2 = n24 != 0 ? ratingsModel2.reviewModel : reviewModel;
        String string19 = (n4 &= 0x2000) != 0 ? ratingsModel2.storeId : string10;
        string2 = string11;
        string3 = string12;
        string4 = string13;
        f5 = f6;
        string5 = string14;
        string6 = string15;
        arrayList = arrayList3;
        string7 = string16;
        string8 = string17;
        string9 = string18;
        arrayList2 = arrayList4;
        list = list2;
        reviewModel = reviewModel2;
        string10 = string19;
        return ratingsModel.copy(string11, string12, string13, f6, string14, string15, arrayList3, string16, string17, string18, arrayList4, list2, reviewModel2, string19);
    }

    public final String component1() {
        return this.brandName;
    }

    public final String component10() {
        return this.baseProductId;
    }

    public final ArrayList component11() {
        return this.questionsArrayList;
    }

    public final List component12() {
        return this.reviewImages;
    }

    public final ReviewModel component13() {
        return this.reviewModel;
    }

    public final String component14() {
        return this.storeId;
    }

    public final String component2() {
        return this.productDescription;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final Float component4() {
        return this.productRating;
    }

    public final String component5() {
        return this.skuId;
    }

    public final String component6() {
        return this.sourcePage;
    }

    public final ArrayList component7() {
        return this.subRatingList;
    }

    public final String component8() {
        return this.orderId;
    }

    public final String component9() {
        return this.productBrick;
    }

    public final RatingsModel copy(String string2, String string3, String string4, Float f5, String string5, String string6, ArrayList arrayList, String string7, String string8, String string9, ArrayList arrayList2, List list, ReviewModel reviewModel, String string10) {
        Intrinsics.checkNotNullParameter(list, "reviewImages");
        RatingsModel ratingsModel = new RatingsModel(string2, string3, string4, f5, string5, string6, arrayList, string7, string8, string9, arrayList2, list, reviewModel, string10);
        return ratingsModel;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RatingsModel;
        if (!bl3) {
            return false;
        }
        object = (RatingsModel)object;
        Object object2 = this.brandName;
        Object object3 = ((RatingsModel)object).brandName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.productDescription;
        object3 = ((RatingsModel)object).productDescription;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageUrl;
        object3 = ((RatingsModel)object).imageUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.productRating;
        object3 = ((RatingsModel)object).productRating;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.skuId;
        object3 = ((RatingsModel)object).skuId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.sourcePage;
        object3 = ((RatingsModel)object).sourcePage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subRatingList;
        object3 = ((RatingsModel)object).subRatingList;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderId;
        object3 = ((RatingsModel)object).orderId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.productBrick;
        object3 = ((RatingsModel)object).productBrick;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.baseProductId;
        object3 = ((RatingsModel)object).baseProductId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.questionsArrayList;
        object3 = ((RatingsModel)object).questionsArrayList;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reviewImages;
        object3 = ((RatingsModel)object).reviewImages;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reviewModel;
        object3 = ((RatingsModel)object).reviewModel;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.storeId;
        object = ((RatingsModel)object).storeId;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBaseProductId() {
        return this.baseProductId;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getProductBrick() {
        return this.productBrick;
    }

    public final String getProductDescription() {
        return this.productDescription;
    }

    public final Float getProductRating() {
        return this.productRating;
    }

    public final ArrayList getQuestionsArrayList() {
        return this.questionsArrayList;
    }

    public final List getReviewImages() {
        return this.reviewImages;
    }

    public final ReviewModel getReviewModel() {
        return this.reviewModel;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    public final String getSourcePage() {
        return this.sourcePage;
    }

    public final String getStoreId() {
        return this.storeId;
    }

    public final ArrayList getSubRatingList() {
        return this.subRatingList;
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
        int n8 = 31;
        n4 *= 31;
        Object object = this.productDescription;
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
        object = this.productRating;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
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
        object = this.sourcePage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.subRatingList;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
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
        object = this.productBrick;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.baseProductId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.questionsArrayList;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.reviewImages;
        n4 = ne_0.a(n4, n8, (List)object);
        object = this.reviewModel;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ReviewModel)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        String string3 = this.storeId;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setProductRating(Float f5) {
        this.productRating = f5;
    }

    public final void setSubRatingList(ArrayList arrayList) {
        this.subRatingList = arrayList;
    }

    public String toString() {
        Object object = this;
        String string2 = this.brandName;
        String string3 = this.productDescription;
        String string4 = this.imageUrl;
        Float f5 = this.productRating;
        String string5 = this.skuId;
        String string6 = this.sourcePage;
        ArrayList arrayList = this.subRatingList;
        String string7 = this.orderId;
        String string8 = this.productBrick;
        String string9 = this.baseProductId;
        ArrayList arrayList2 = this.questionsArrayList;
        List list = this.reviewImages;
        ReviewModel reviewModel = this.reviewModel;
        String string10 = this.storeId;
        object = og_1.a("RatingsModel(brandName=", string2, ", productDescription=", string3, ", imageUrl=");
        ((StringBuilder)object).append(string4);
        ((StringBuilder)object).append(", productRating=");
        ((StringBuilder)object).append(f5);
        ((StringBuilder)object).append(", skuId=");
        X50.a((StringBuilder)object, string5, ", sourcePage=", string6, ", subRatingList=");
        ((StringBuilder)object).append(arrayList);
        ((StringBuilder)object).append(", orderId=");
        ((StringBuilder)object).append(string7);
        ((StringBuilder)object).append(", productBrick=");
        X50.a((StringBuilder)object, string8, ", baseProductId=", string9, ", questionsArrayList=");
        ((StringBuilder)object).append(arrayList2);
        ((StringBuilder)object).append(", reviewImages=");
        ((StringBuilder)object).append(list);
        ((StringBuilder)object).append(", reviewModel=");
        ((StringBuilder)object).append(reviewModel);
        ((StringBuilder)object).append(", storeId=");
        string2 = string10;
        ((StringBuilder)object).append(string10);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Serializable serializable;
        int n4;
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.brandName;
        parcel.writeString((String)object);
        object = this.productDescription;
        parcel.writeString((String)object);
        object = this.imageUrl;
        parcel.writeString((String)object);
        object = this.productRating;
        int n7 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n7);
            float f5 = ((Float)object).floatValue();
            parcel.writeFloat(f5);
        }
        object = this.skuId;
        parcel.writeString((String)object);
        object = this.sourcePage;
        parcel.writeString((String)object);
        object = this.subRatingList;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n7);
            n4 = ((ArrayList)object).size();
            parcel.writeInt(n4);
            object = ((ArrayList)object).iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                serializable = (Serializable)object.next();
                parcel.writeSerializable(serializable);
            }
        }
        object = this.orderId;
        parcel.writeString((String)object);
        object = this.productBrick;
        parcel.writeString((String)object);
        object = this.baseProductId;
        parcel.writeString((String)object);
        object = this.questionsArrayList;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n7);
            n4 = ((ArrayList)object).size();
            parcel.writeInt(n4);
            object = ((ArrayList)object).iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                serializable = (Serializable)object.next();
                parcel.writeSerializable(serializable);
            }
        }
        object = this.reviewImages;
        parcel.writeStringList((List)object);
        object = this.reviewModel;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n7);
            ((ReviewModel)object).writeToParcel(parcel, n3);
        }
        String string2 = this.storeId;
        parcel.writeString(string2);
    }
}

