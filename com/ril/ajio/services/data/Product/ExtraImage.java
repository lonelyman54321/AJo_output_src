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
import com.ril.ajio.services.data.Product.ExtraImage$Creator;
import com.ril.ajio.services.data.Product.ProductImage;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ExtraImage
implements Serializable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final List images;

    static {
        ExtraImage$Creator extraImage$Creator = new ExtraImage$Creator();
        CREATOR = extraImage$Creator;
    }

    public ExtraImage() {
        this(null, 1, null);
    }

    public ExtraImage(List list) {
        this.images = list;
    }

    public /* synthetic */ ExtraImage(List list, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            list = null;
        }
        this(list);
    }

    public static /* synthetic */ ExtraImage copy$default(ExtraImage extraImage, List list, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            list = extraImage.images;
        }
        return extraImage.copy(list);
    }

    public final List component1() {
        return this.images;
    }

    public final ExtraImage copy(List list) {
        ExtraImage extraImage = new ExtraImage(list);
        return extraImage;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ExtraImage;
        if (!bl3) {
            return false;
        }
        object = (ExtraImage)object;
        List list = this.images;
        object = ((ExtraImage)object).images;
        boolean bl4 = Intrinsics.areEqual(list, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getImages() {
        return this.images;
    }

    public int hashCode() {
        int n3;
        List list = this.images;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        return n3;
    }

    public String toString() {
        List list = this.images;
        StringBuilder stringBuilder = new StringBuilder("ExtraImage(images=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.images;
        if (object == null) {
            n3 = 0;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            object = oz0_2.a(parcel, (List)object, n4);
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                ProductImage productImage = (ProductImage)object.next();
                productImage.writeToParcel(parcel, n3);
            }
        }
    }
}

