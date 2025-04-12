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
import com.ril.ajio.services.data.ratings.ImageMap$Creator;
import com.ril.ajio.services.data.ratings.ImageModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ImageMap
implements Serializable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final List intermediateSize;
    private final List largeSize;
    private final List thumbnail;

    static {
        ImageMap$Creator imageMap$Creator = new ImageMap$Creator();
        CREATOR = imageMap$Creator;
    }

    public ImageMap() {
        this(null, null, null, 7, null);
    }

    public ImageMap(List list, List list2, List list3) {
        this.thumbnail = list;
        this.intermediateSize = list2;
        this.largeSize = list3;
    }

    public /* synthetic */ ImageMap(List list, List list2, List list3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = null;
        }
        if ((n4 = n3 & 2) != 0) {
            list2 = null;
        }
        if ((n3 &= 4) != 0) {
            list3 = null;
        }
        this(list, list2, list3);
    }

    public static /* synthetic */ ImageMap copy$default(ImageMap imageMap, List list, List list2, List list3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = imageMap.thumbnail;
        }
        if ((n4 = n3 & 2) != 0) {
            list2 = imageMap.intermediateSize;
        }
        if ((n3 &= 4) != 0) {
            list3 = imageMap.largeSize;
        }
        return imageMap.copy(list, list2, list3);
    }

    public final List component1() {
        return this.thumbnail;
    }

    public final List component2() {
        return this.intermediateSize;
    }

    public final List component3() {
        return this.largeSize;
    }

    public final ImageMap copy(List list, List list2, List list3) {
        ImageMap imageMap = new ImageMap(list, list2, list3);
        return imageMap;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ImageMap;
        if (!bl3) {
            return false;
        }
        object = (ImageMap)object;
        List list = this.thumbnail;
        List list2 = ((ImageMap)object).thumbnail;
        bl3 = Intrinsics.areEqual(list, list2);
        if (!bl3) {
            return false;
        }
        list = this.intermediateSize;
        list2 = ((ImageMap)object).intermediateSize;
        bl3 = Intrinsics.areEqual(list, list2);
        if (!bl3) {
            return false;
        }
        list = this.largeSize;
        object = ((ImageMap)object).largeSize;
        boolean bl4 = Intrinsics.areEqual(list, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getIntermediateSize() {
        return this.intermediateSize;
    }

    public final List getLargeSize() {
        return this.largeSize;
    }

    public final List getThumbnail() {
        return this.thumbnail;
    }

    public int hashCode() {
        int n3;
        int n4;
        List list = this.thumbnail;
        int n7 = 0;
        if (list == null) {
            n4 = 0;
            list = null;
        } else {
            n4 = ((Object)list).hashCode();
        }
        n4 *= 31;
        List list2 = this.intermediateSize;
        if (list2 == null) {
            n3 = 0;
            list2 = null;
        } else {
            n3 = ((Object)list2).hashCode();
        }
        n4 = (n4 + n3) * 31;
        list2 = this.largeSize;
        if (list2 != null) {
            n7 = ((Object)list2).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        List list = this.thumbnail;
        List list2 = this.intermediateSize;
        List list3 = this.largeSize;
        StringBuilder stringBuilder = new StringBuilder("ImageMap(thumbnail=");
        stringBuilder.append(list);
        stringBuilder.append(", intermediateSize=");
        stringBuilder.append(list2);
        stringBuilder.append(", largeSize=");
        stringBuilder.append(list3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        ImageModel imageModel;
        boolean bl2;
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.thumbnail;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            object = oz0_2.a(parcel, (List)object, n4);
            while (bl2 = object.hasNext()) {
                imageModel = (ImageModel)object.next();
                imageModel.writeToParcel(parcel, n3);
            }
        }
        object = this.intermediateSize;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            object = oz0_2.a(parcel, (List)object, n4);
            while (bl2 = object.hasNext()) {
                imageModel = (ImageModel)object.next();
                imageModel.writeToParcel(parcel, n3);
            }
        }
        object = this.largeSize;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            object = oz0_2.a(parcel, (List)object, n4);
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                ImageModel imageModel2 = (ImageModel)object.next();
                imageModel2.writeToParcel(parcel, n3);
            }
        }
    }
}

