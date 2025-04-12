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
import com.ril.ajio.services.data.ratings.PopUpImageModel$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PopUpImageModel
implements Serializable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String countText;
    private final String imageStatus;
    private final String imageStatusReason;
    private final String imageUrl;
    private final Float rating;
    private final String reviewStatus;
    private final String reviewText;
    private final String reviewTitle;
    private final String textStatusReason;

    static {
        PopUpImageModel$Creator popUpImageModel$Creator = new PopUpImageModel$Creator();
        CREATOR = popUpImageModel$Creator;
    }

    public PopUpImageModel() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public PopUpImageModel(String string2, String string3, Float f5, String string4, String string5, String string6, String string7, String string8, String string9) {
        this.reviewTitle = string2;
        this.reviewText = string3;
        this.rating = f5;
        this.imageUrl = string4;
        this.imageStatus = string5;
        this.reviewStatus = string6;
        this.countText = string7;
        this.imageStatusReason = string8;
        this.textStatusReason = string9;
    }

    public /* synthetic */ PopUpImageModel(String object, String string2, Float object2, String object3, String string3, String string4, String string5, String string6, String string7, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        Float f5;
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
            f5 = null;
        } else {
            f5 = object2;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string12 = null;
        } else {
            string12 = object3;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string11 = null;
        } else {
            string11 = string3;
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
            string9 = null;
        } else {
            string9 = string5;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string8 = null;
        } else {
            string8 = string6;
        }
        if ((n4 &= 0x100) == 0) {
            string15 = string7;
        }
        object = this;
        string2 = string14;
        object2 = string13;
        object3 = f5;
        string3 = string12;
        string4 = string11;
        string5 = string10;
        string6 = string9;
        string7 = string8;
        this(string14, string13, f5, string12, string11, string10, string9, string8, string15);
    }

    public static /* synthetic */ PopUpImageModel copy$default(PopUpImageModel popUpImageModel, String string2, String string3, Float f5, String string4, String string5, String string6, String string7, String string8, String string9, int n3, Object object) {
        PopUpImageModel popUpImageModel2 = popUpImageModel;
        int n4 = n3;
        int n7 = n3 & 1;
        String string10 = n7 != 0 ? popUpImageModel.reviewTitle : string2;
        int n8 = n4 & 2;
        String string11 = n8 != 0 ? popUpImageModel2.reviewText : string3;
        int n10 = n4 & 4;
        Float f6 = n10 != 0 ? popUpImageModel2.rating : f5;
        int n14 = n4 & 8;
        String string12 = n14 != 0 ? popUpImageModel2.imageUrl : string4;
        int n15 = n4 & 0x10;
        String string13 = n15 != 0 ? popUpImageModel2.imageStatus : string5;
        int n16 = n4 & 0x20;
        String string14 = n16 != 0 ? popUpImageModel2.reviewStatus : string6;
        int n17 = n4 & 0x40;
        String string15 = n17 != 0 ? popUpImageModel2.countText : string7;
        int n18 = n4 & 0x80;
        String string16 = n18 != 0 ? popUpImageModel2.imageStatusReason : string8;
        String string17 = (n4 &= 0x100) != 0 ? popUpImageModel2.textStatusReason : string9;
        string2 = string10;
        string3 = string11;
        f5 = f6;
        string4 = string12;
        string5 = string13;
        string6 = string14;
        string7 = string15;
        string8 = string16;
        string9 = string17;
        return popUpImageModel.copy(string10, string11, f6, string12, string13, string14, string15, string16, string17);
    }

    public final String component1() {
        return this.reviewTitle;
    }

    public final String component2() {
        return this.reviewText;
    }

    public final Float component3() {
        return this.rating;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final String component5() {
        return this.imageStatus;
    }

    public final String component6() {
        return this.reviewStatus;
    }

    public final String component7() {
        return this.countText;
    }

    public final String component8() {
        return this.imageStatusReason;
    }

    public final String component9() {
        return this.textStatusReason;
    }

    public final PopUpImageModel copy(String string2, String string3, Float f5, String string4, String string5, String string6, String string7, String string8, String string9) {
        PopUpImageModel popUpImageModel = new PopUpImageModel(string2, string3, f5, string4, string5, string6, string7, string8, string9);
        return popUpImageModel;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PopUpImageModel;
        if (!bl3) {
            return false;
        }
        object = (PopUpImageModel)object;
        Object object2 = this.reviewTitle;
        Object object3 = ((PopUpImageModel)object).reviewTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reviewText;
        object3 = ((PopUpImageModel)object).reviewText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.rating;
        object3 = ((PopUpImageModel)object).rating;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageUrl;
        object3 = ((PopUpImageModel)object).imageUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageStatus;
        object3 = ((PopUpImageModel)object).imageStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reviewStatus;
        object3 = ((PopUpImageModel)object).reviewStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.countText;
        object3 = ((PopUpImageModel)object).countText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageStatusReason;
        object3 = ((PopUpImageModel)object).imageStatusReason;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.textStatusReason;
        object = ((PopUpImageModel)object).textStatusReason;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCountText() {
        return this.countText;
    }

    public final String getImageStatus() {
        return this.imageStatus;
    }

    public final String getImageStatusReason() {
        return this.imageStatusReason;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Float getRating() {
        return this.rating;
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

    public final String getTextStatusReason() {
        return this.textStatusReason;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.reviewTitle;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
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
        object = this.rating;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
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
        object = this.imageStatus;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
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
        object = this.countText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.imageStatusReason;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.textStatusReason;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        CharSequence charSequence = this.reviewTitle;
        String string2 = this.reviewText;
        Float f5 = this.rating;
        String string3 = this.imageUrl;
        String string4 = this.imageStatus;
        String string5 = this.reviewStatus;
        String string6 = this.countText;
        String string7 = this.imageStatusReason;
        String string8 = this.textStatusReason;
        charSequence = og_1.a("PopUpImageModel(reviewTitle=", (String)charSequence, ", reviewText=", string2, ", rating=");
        ((StringBuilder)charSequence).append(f5);
        ((StringBuilder)charSequence).append(", imageUrl=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", imageStatus=");
        X50.a((StringBuilder)charSequence, string4, ", reviewStatus=", string5, ", countText=");
        X50.a((StringBuilder)charSequence, string6, ", imageStatusReason=", string7, ", textStatusReason=");
        return h30_0.a((StringBuilder)charSequence, string8, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.reviewTitle;
        parcel.writeString((String)object);
        object = this.reviewText;
        parcel.writeString((String)object);
        object = this.rating;
        if (object == null) {
            float f5 = 0.0f;
            object = null;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            parcel.writeInt(n4);
            float f6 = ((Float)object).floatValue();
            parcel.writeFloat(f6);
        }
        object = this.imageUrl;
        parcel.writeString((String)object);
        object = this.imageStatus;
        parcel.writeString((String)object);
        object = this.reviewStatus;
        parcel.writeString((String)object);
        object = this.countText;
        parcel.writeString((String)object);
        object = this.imageStatusReason;
        parcel.writeString((String)object);
        object = this.textStatusReason;
        parcel.writeString((String)object);
    }
}

