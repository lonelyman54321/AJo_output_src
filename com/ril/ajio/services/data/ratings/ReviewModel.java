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
import com.ril.ajio.services.data.ratings.ImageModel;
import com.ril.ajio.services.data.ratings.ReviewModel$Creator;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ReviewModel
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final Long reviewId;
    private final String reviewText;
    private final ArrayList reviewsImagesList;

    static {
        ReviewModel$Creator reviewModel$Creator = new ReviewModel$Creator();
        CREATOR = reviewModel$Creator;
    }

    public ReviewModel() {
        this(null, null, null, 7, null);
    }

    public ReviewModel(ArrayList arrayList) {
        this(arrayList, null, null, 6, null);
    }

    public ReviewModel(ArrayList arrayList, String string2) {
        this(arrayList, string2, null, 4, null);
    }

    public ReviewModel(ArrayList arrayList, String string2, Long l2) {
        this.reviewsImagesList = arrayList;
        this.reviewText = string2;
        this.reviewId = l2;
    }

    public /* synthetic */ ReviewModel(ArrayList arrayList, String string2, Long l2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            arrayList = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = null;
        }
        if ((n3 &= 4) != 0) {
            l2 = null;
        }
        this(arrayList, string2, l2);
    }

    public static /* synthetic */ ReviewModel copy$default(ReviewModel reviewModel, ArrayList arrayList, String string2, Long l2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            arrayList = reviewModel.reviewsImagesList;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = reviewModel.reviewText;
        }
        if ((n3 &= 4) != 0) {
            l2 = reviewModel.reviewId;
        }
        return reviewModel.copy(arrayList, string2, l2);
    }

    public final ArrayList component1() {
        return this.reviewsImagesList;
    }

    public final String component2() {
        return this.reviewText;
    }

    public final Long component3() {
        return this.reviewId;
    }

    public final ReviewModel copy(ArrayList arrayList, String string2, Long l2) {
        ReviewModel reviewModel = new ReviewModel(arrayList, string2, l2);
        return reviewModel;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReviewModel;
        if (!bl3) {
            return false;
        }
        object = (ReviewModel)object;
        Object object2 = this.reviewsImagesList;
        Object object3 = ((ReviewModel)object).reviewsImagesList;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reviewText;
        object3 = ((ReviewModel)object).reviewText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reviewId;
        object = ((ReviewModel)object).reviewId;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Long getReviewId() {
        return this.reviewId;
    }

    public final String getReviewText() {
        return this.reviewText;
    }

    public final ArrayList getReviewsImagesList() {
        return this.reviewsImagesList;
    }

    public int hashCode() {
        int n3;
        int n4;
        ArrayList arrayList = this.reviewsImagesList;
        int n7 = 0;
        if (arrayList == null) {
            n4 = 0;
            arrayList = null;
        } else {
            n4 = arrayList.hashCode();
        }
        n4 *= 31;
        Object object = this.reviewText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.reviewId;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        ArrayList arrayList = this.reviewsImagesList;
        String string2 = this.reviewText;
        Long l2 = this.reviewId;
        StringBuilder stringBuilder = new StringBuilder("ReviewModel(reviewsImagesList=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", reviewText=");
        stringBuilder.append(string2);
        stringBuilder.append(", reviewId=");
        stringBuilder.append(l2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.reviewsImagesList;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            int n7 = ((ArrayList)object).size();
            parcel.writeInt(n7);
            object = ((ArrayList)object).iterator();
            while ((n7 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                ImageModel imageModel = (ImageModel)object.next();
                imageModel.writeToParcel(parcel, n3);
            }
        }
        Object object2 = this.reviewText;
        parcel.writeString((String)object2);
        object2 = this.reviewId;
        if (object2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            long l2 = (Long)object2;
            parcel.writeLong(l2);
        }
    }
}

