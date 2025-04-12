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
import com.ril.ajio.services.data.ratings.ImageModel$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ImageModel
implements Serializable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final Long imageId;
    private final String imageStatus;
    private final String imageStatusReason;
    private final String imageUrl;
    private final Long parentImageId;

    static {
        ImageModel$Creator imageModel$Creator = new ImageModel$Creator();
        CREATOR = imageModel$Creator;
    }

    public ImageModel() {
        this(null, null, null, null, null, 31, null);
    }

    public ImageModel(Long l2, Long l3, String string2, String string3, String string4) {
        this.imageId = l2;
        this.parentImageId = l3;
        this.imageStatus = string2;
        this.imageUrl = string3;
        this.imageStatusReason = string4;
    }

    public /* synthetic */ ImageModel(Long serializable, Long object, String object2, String string2, String string3, int n3, DefaultConstructorMarker object3) {
        String string4;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object3 = null;
        } else {
            object3 = serializable;
        }
        int n7 = n3 & 2;
        Object object4 = n7 != 0 ? null : object;
        n7 = n3 & 4;
        Object object5 = n7 != 0 ? null : object2;
        n7 = n3 & 8;
        String string5 = n7 != 0 ? null : string2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            n3 = 0;
            string4 = null;
        } else {
            string4 = string3;
        }
        serializable = this;
        object = object3;
        object2 = object4;
        string2 = object5;
        string3 = string5;
        this((Long)object3, (Long)object4, (String)object5, string5, string4);
    }

    public static /* synthetic */ ImageModel copy$default(ImageModel imageModel, Long l2, Long serializable, String object, String object2, String string2, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            l2 = imageModel.imageId;
        }
        if ((n4 = n3 & 2) != 0) {
            serializable = imageModel.parentImageId;
        }
        object3 = serializable;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object = imageModel.imageStatus;
        }
        String string3 = object;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = imageModel.imageUrl;
        }
        String string4 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string2 = imageModel.imageStatusReason;
        }
        String string5 = string2;
        serializable = imageModel;
        object = l2;
        object2 = object3;
        string2 = string3;
        object3 = string5;
        return imageModel.copy(l2, (Long)object2, string3, string4, string5);
    }

    public final Long component1() {
        return this.imageId;
    }

    public final Long component2() {
        return this.parentImageId;
    }

    public final String component3() {
        return this.imageStatus;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final String component5() {
        return this.imageStatusReason;
    }

    public final ImageModel copy(Long l2, Long l3, String string2, String string3, String string4) {
        ImageModel imageModel = new ImageModel(l2, l3, string2, string3, string4);
        return imageModel;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ImageModel;
        if (!bl3) {
            return false;
        }
        object = (ImageModel)object;
        Object object2 = this.imageId;
        Object object3 = ((ImageModel)object).imageId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.parentImageId;
        object3 = ((ImageModel)object).parentImageId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageStatus;
        object3 = ((ImageModel)object).imageStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageUrl;
        object3 = ((ImageModel)object).imageUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageStatusReason;
        object = ((ImageModel)object).imageStatusReason;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Long getImageId() {
        return this.imageId;
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

    public final Long getParentImageId() {
        return this.parentImageId;
    }

    public int hashCode() {
        int n3;
        int n4;
        Long l2 = this.imageId;
        int n7 = 0;
        if (l2 == null) {
            n4 = 0;
            l2 = null;
        } else {
            n4 = ((Object)l2).hashCode();
        }
        n4 *= 31;
        Object object = this.parentImageId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
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
        object = this.imageUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.imageStatusReason;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        Long l2 = this.imageId;
        Long l3 = this.parentImageId;
        String string2 = this.imageStatus;
        String string3 = this.imageUrl;
        String string4 = this.imageStatusReason;
        StringBuilder stringBuilder = new StringBuilder("ImageModel(imageId=");
        stringBuilder.append(l2);
        stringBuilder.append(", parentImageId=");
        stringBuilder.append(l3);
        stringBuilder.append(", imageStatus=");
        X50.a(stringBuilder, string2, ", imageUrl=", string3, ", imageStatusReason=");
        return h30_0.a(stringBuilder, string4, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.imageId;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            long l2 = (Long)object;
            parcel.writeLong(l2);
        }
        object = this.parentImageId;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            long l3 = (Long)object;
            parcel.writeLong(l3);
        }
        object = this.imageStatus;
        parcel.writeString((String)object);
        object = this.imageUrl;
        parcel.writeString((String)object);
        object = this.imageStatusReason;
        parcel.writeString((String)object);
    }
}

