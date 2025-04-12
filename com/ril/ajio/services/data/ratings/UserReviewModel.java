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
import com.ril.ajio.services.data.ratings.ImageMap;
import com.ril.ajio.services.data.ratings.UserReviewModel$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class UserReviewModel
implements Serializable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String createdDate;
    private final ImageMap imageMap;
    private Float rating;
    private final Long reviewId;
    private final String reviewStatus;
    private final String reviewText;
    private final String reviewTitle;
    private final String reviewerName;
    private final String textStatusReason;

    static {
        UserReviewModel$Creator userReviewModel$Creator = new UserReviewModel$Creator();
        CREATOR = userReviewModel$Creator;
    }

    public UserReviewModel() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public UserReviewModel(Long l2, String string2, String string3, Float f5, String string4, String string5, String string6, String string7, ImageMap imageMap) {
        this.reviewId = l2;
        this.reviewTitle = string2;
        this.reviewText = string3;
        this.rating = f5;
        this.reviewStatus = string4;
        this.reviewerName = string5;
        this.textStatusReason = string6;
        this.createdDate = string7;
        this.imageMap = imageMap;
    }

    public /* synthetic */ UserReviewModel(Long serializable, String object, String string2, Float object2, String object3, String string3, String string4, String string5, ImageMap object4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string6;
        String string7;
        String string8;
        String string9;
        Float f5;
        String string10;
        String string11;
        Long l2;
        int n4 = n3;
        int n7 = n3 & 1;
        ImageMap imageMap = null;
        if (n7 != 0) {
            n7 = 0;
            l2 = null;
        } else {
            l2 = serializable;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string11 = null;
        } else {
            string11 = object;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string10 = null;
        } else {
            string10 = string2;
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
            string9 = null;
        } else {
            string9 = object3;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string8 = null;
        } else {
            string8 = string3;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string7 = null;
        } else {
            string7 = string4;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string6 = null;
        } else {
            string6 = string5;
        }
        if ((n4 &= 0x100) == 0) {
            imageMap = object4;
        }
        serializable = this;
        object = l2;
        string2 = string11;
        object2 = string10;
        object3 = f5;
        string3 = string9;
        string4 = string8;
        string5 = string7;
        object4 = string6;
        this(l2, string11, string10, f5, string9, string8, string7, string6, imageMap);
    }

    public static /* synthetic */ UserReviewModel copy$default(UserReviewModel userReviewModel, Long l2, String string2, String string3, Float f5, String string4, String string5, String string6, String string7, ImageMap imageMap, int n3, Object object) {
        UserReviewModel userReviewModel2 = userReviewModel;
        int n4 = n3;
        int n7 = n3 & 1;
        Long l3 = n7 != 0 ? userReviewModel.reviewId : l2;
        int n8 = n4 & 2;
        String string8 = n8 != 0 ? userReviewModel2.reviewTitle : string2;
        int n10 = n4 & 4;
        String string9 = n10 != 0 ? userReviewModel2.reviewText : string3;
        int n14 = n4 & 8;
        Float f6 = n14 != 0 ? userReviewModel2.rating : f5;
        int n15 = n4 & 0x10;
        String string10 = n15 != 0 ? userReviewModel2.reviewStatus : string4;
        int n16 = n4 & 0x20;
        String string11 = n16 != 0 ? userReviewModel2.reviewerName : string5;
        int n17 = n4 & 0x40;
        String string12 = n17 != 0 ? userReviewModel2.textStatusReason : string6;
        int n18 = n4 & 0x80;
        String string13 = n18 != 0 ? userReviewModel2.createdDate : string7;
        ImageMap imageMap2 = (n4 &= 0x100) != 0 ? userReviewModel2.imageMap : imageMap;
        l2 = l3;
        string2 = string8;
        string3 = string9;
        f5 = f6;
        string4 = string10;
        string5 = string11;
        string6 = string12;
        string7 = string13;
        imageMap = imageMap2;
        return userReviewModel.copy(l3, string8, string9, f6, string10, string11, string12, string13, imageMap2);
    }

    public final Long component1() {
        return this.reviewId;
    }

    public final String component2() {
        return this.reviewTitle;
    }

    public final String component3() {
        return this.reviewText;
    }

    public final Float component4() {
        return this.rating;
    }

    public final String component5() {
        return this.reviewStatus;
    }

    public final String component6() {
        return this.reviewerName;
    }

    public final String component7() {
        return this.textStatusReason;
    }

    public final String component8() {
        return this.createdDate;
    }

    public final ImageMap component9() {
        return this.imageMap;
    }

    public final UserReviewModel copy(Long l2, String string2, String string3, Float f5, String string4, String string5, String string6, String string7, ImageMap imageMap) {
        UserReviewModel userReviewModel = new UserReviewModel(l2, string2, string3, f5, string4, string5, string6, string7, imageMap);
        return userReviewModel;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof UserReviewModel;
        if (!bl3) {
            return false;
        }
        object = (UserReviewModel)object;
        Object object2 = this.reviewId;
        Object object3 = ((UserReviewModel)object).reviewId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reviewTitle;
        object3 = ((UserReviewModel)object).reviewTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reviewText;
        object3 = ((UserReviewModel)object).reviewText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.rating;
        object3 = ((UserReviewModel)object).rating;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reviewStatus;
        object3 = ((UserReviewModel)object).reviewStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reviewerName;
        object3 = ((UserReviewModel)object).reviewerName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.textStatusReason;
        object3 = ((UserReviewModel)object).textStatusReason;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.createdDate;
        object3 = ((UserReviewModel)object).createdDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageMap;
        object = ((UserReviewModel)object).imageMap;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCreatedDate() {
        return this.createdDate;
    }

    public final ImageMap getImageMap() {
        return this.imageMap;
    }

    public final Float getRating() {
        return this.rating;
    }

    public final Long getReviewId() {
        return this.reviewId;
    }

    public final String getReviewStatus() {
        return this.reviewStatus;
    }

    public final String getReviewText() {
        return this.reviewText;
    }

    public final String getReviewTitle() {
        return this.reviewTitle;
    }

    public final String getReviewerName() {
        return this.reviewerName;
    }

    public final String getTextStatusReason() {
        return this.textStatusReason;
    }

    public int hashCode() {
        int n3;
        int n4;
        Long l2 = this.reviewId;
        int n7 = 0;
        if (l2 == null) {
            n4 = 0;
            l2 = null;
        } else {
            n4 = ((Object)l2).hashCode();
        }
        n4 *= 31;
        Object object = this.reviewTitle;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.reviewText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.rating;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.reviewStatus;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.reviewerName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.textStatusReason;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.createdDate;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.imageMap;
        if (object != null) {
            n7 = ((ImageMap)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setRating(Float f5) {
        this.rating = f5;
    }

    public String toString() {
        Long l2 = this.reviewId;
        String string2 = this.reviewTitle;
        String string3 = this.reviewText;
        Float f5 = this.rating;
        String string4 = this.reviewStatus;
        String string5 = this.reviewerName;
        String string6 = this.textStatusReason;
        String string7 = this.createdDate;
        ImageMap imageMap = this.imageMap;
        StringBuilder stringBuilder = new StringBuilder("UserReviewModel(reviewId=");
        stringBuilder.append(l2);
        stringBuilder.append(", reviewTitle=");
        stringBuilder.append(string2);
        stringBuilder.append(", reviewText=");
        stringBuilder.append(string3);
        stringBuilder.append(", rating=");
        stringBuilder.append(f5);
        stringBuilder.append(", reviewStatus=");
        X50.a(stringBuilder, string4, ", reviewerName=", string5, ", textStatusReason=");
        X50.a(stringBuilder, string6, ", createdDate=", string7, ", imageMap=");
        stringBuilder.append(imageMap);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.reviewId;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            long l2 = (Long)object;
            parcel.writeLong(l2);
        }
        object = this.reviewTitle;
        parcel.writeString((String)object);
        object = this.reviewText;
        parcel.writeString((String)object);
        object = this.rating;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            float f5 = ((Float)object).floatValue();
            parcel.writeFloat(f5);
        }
        object = this.reviewStatus;
        parcel.writeString((String)object);
        object = this.reviewerName;
        parcel.writeString((String)object);
        object = this.textStatusReason;
        parcel.writeString((String)object);
        object = this.createdDate;
        parcel.writeString((String)object);
        object = this.imageMap;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            ((ImageMap)object).writeToParcel(parcel, n3);
        }
    }
}

