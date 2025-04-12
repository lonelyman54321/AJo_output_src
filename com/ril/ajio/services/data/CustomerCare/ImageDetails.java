/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.CustomerCare;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.CustomerCare.ImageDetails$Creator;
import kotlin.jvm.internal.Intrinsics;

public final class ImageDetails
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String imageName;
    private final String imageUrl;

    static {
        ImageDetails$Creator imageDetails$Creator = new ImageDetails$Creator();
        CREATOR = imageDetails$Creator;
    }

    public ImageDetails(String string2, String string3) {
        this.imageUrl = string2;
        this.imageName = string3;
    }

    public static /* synthetic */ ImageDetails copy$default(ImageDetails imageDetails, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = imageDetails.imageUrl;
        }
        if ((n3 &= 2) != 0) {
            string3 = imageDetails.imageName;
        }
        return imageDetails.copy(string2, string3);
    }

    public final String component1() {
        return this.imageUrl;
    }

    public final String component2() {
        return this.imageName;
    }

    public final ImageDetails copy(String string2, String string3) {
        ImageDetails imageDetails = new ImageDetails(string2, string3);
        return imageDetails;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ImageDetails;
        if (!bl3) {
            return false;
        }
        object = (ImageDetails)object;
        String string2 = this.imageUrl;
        String string3 = ((ImageDetails)object).imageUrl;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.imageName;
        object = ((ImageDetails)object).imageName;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getImageName() {
        return this.imageName;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        int n3;
        String string2 = this.imageUrl;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.imageName;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        String string2 = this.imageUrl;
        String string3 = this.imageName;
        return uc0_0.a("ImageDetails(imageUrl=", string2, ", imageName=", string3, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.imageUrl;
        parcel.writeString(string2);
        string2 = this.imageName;
        parcel.writeString(string2);
    }
}

