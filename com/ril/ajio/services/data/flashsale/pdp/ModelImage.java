/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.flashsale.pdp;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.flashsale.pdp.ModelImage$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ModelImage
implements Serializable,
Parcelable,
Cloneable {
    public static final Parcelable.Creator CREATOR;
    private final String altText;
    private final String format;
    private final Integer galleryIndex;
    private final String imageType;
    private final String url;
    private final Integer width;

    static {
        ModelImage$Creator modelImage$Creator = new ModelImage$Creator();
        CREATOR = modelImage$Creator;
    }

    public ModelImage() {
        this(null, null, null, null, null, null, 63, null);
    }

    public ModelImage(String string2, String string3, Integer n3, String string4, String string5, Integer n4) {
        this.altText = string2;
        this.format = string3;
        this.galleryIndex = n3;
        this.imageType = string4;
        this.url = string5;
        this.width = n4;
    }

    public /* synthetic */ ModelImage(String object, String object2, Integer object3, String object4, String string2, Integer object5, int n3, DefaultConstructorMarker object6) {
        Integer n4;
        int n7 = n3 & 1;
        if (n7 != 0) {
            n7 = 0;
            object6 = null;
        } else {
            object6 = object;
        }
        int n8 = n3 & 2;
        Object object7 = n8 != 0 ? null : object2;
        n8 = n3 & 4;
        Object object8 = n8 != 0 ? null : object3;
        n8 = n3 & 8;
        Object object9 = n8 != 0 ? null : object4;
        n8 = n3 & 0x10;
        String string3 = n8 != 0 ? null : string2;
        n8 = n3 & 0x20;
        if (n8 != 0) {
            n3 = 0;
            n4 = null;
        } else {
            n4 = object5;
        }
        object = this;
        object2 = object6;
        object3 = object7;
        object4 = object8;
        string2 = object9;
        object5 = string3;
        this((String)object6, (String)object7, (Integer)object8, (String)object9, string3, n4);
    }

    public static /* synthetic */ ModelImage copy$default(ModelImage modelImage, String string2, String object, Integer object2, String object3, String object4, Integer object5, int n3, Object object6) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = modelImage.altText;
        }
        if ((n4 = n3 & 2) != 0) {
            object = modelImage.format;
        }
        object6 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = modelImage.galleryIndex;
        }
        Integer n8 = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = modelImage.imageType;
        }
        String string3 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object4 = modelImage.url;
        }
        String string4 = object4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            object5 = modelImage.width;
        }
        Integer n10 = object5;
        object = modelImage;
        object2 = string2;
        object3 = object6;
        object4 = n8;
        object5 = string3;
        object6 = n10;
        return modelImage.copy(string2, (String)object3, n8, string3, string4, n10);
    }

    public ModelImage clone() {
        Object object = super.clone();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.flashsale.pdp.ModelImage");
        return (ModelImage)object;
    }

    public final String component1() {
        return this.altText;
    }

    public final String component2() {
        return this.format;
    }

    public final Integer component3() {
        return this.galleryIndex;
    }

    public final String component4() {
        return this.imageType;
    }

    public final String component5() {
        return this.url;
    }

    public final Integer component6() {
        return this.width;
    }

    public final ModelImage copy(String string2, String string3, Integer n3, String string4, String string5, Integer n4) {
        ModelImage modelImage = new ModelImage(string2, string3, n3, string4, string5, n4);
        return modelImage;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ModelImage;
        if (!bl3) {
            return false;
        }
        object = (ModelImage)object;
        Object object2 = this.altText;
        Object object3 = ((ModelImage)object).altText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.format;
        object3 = ((ModelImage)object).format;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.galleryIndex;
        object3 = ((ModelImage)object).galleryIndex;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageType;
        object3 = ((ModelImage)object).imageType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.url;
        object3 = ((ModelImage)object).url;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.width;
        object = ((ModelImage)object).width;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAltText() {
        return this.altText;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Integer getGalleryIndex() {
        return this.galleryIndex;
    }

    public final String getImageType() {
        return this.imageType;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.altText;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.format;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.galleryIndex;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.imageType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.url;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.width;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        CharSequence charSequence = this.altText;
        String string2 = this.format;
        Integer n3 = this.galleryIndex;
        String string3 = this.imageType;
        String string4 = this.url;
        Integer n4 = this.width;
        charSequence = og_1.a("ModelImage(altText=", (String)charSequence, ", format=", string2, ", galleryIndex=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(", imageType=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", url=");
        ((StringBuilder)charSequence).append(string4);
        ((StringBuilder)charSequence).append(", width=");
        ((StringBuilder)charSequence).append(n4);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.altText;
        parcel.writeString((String)object);
        object = this.format;
        parcel.writeString((String)object);
        object = this.galleryIndex;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            n3 = (Integer)object;
            parcel.writeInt(n3);
        }
        object = this.imageType;
        parcel.writeString((String)object);
        object = this.url;
        parcel.writeString((String)object);
        object = this.width;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            n3 = (Integer)object;
            parcel.writeInt(n3);
        }
    }
}

