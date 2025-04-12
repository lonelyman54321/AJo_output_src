/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.CustomerCare;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.CustomerCare.ImageData$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ImageData
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String contentType;
    private final String fileName;
    private final String filePath;
    private final Uri fileUri;
    private final String imageDetails;

    static {
        ImageData$Creator imageData$Creator = new ImageData$Creator();
        CREATOR = imageData$Creator;
    }

    public ImageData() {
        this(null, null, null, null, null, 31, null);
    }

    public ImageData(String string2, String string3, String string4, String string5, Uri uri) {
        this.fileName = string2;
        this.contentType = string3;
        this.imageDetails = string4;
        this.filePath = string5;
        this.fileUri = uri;
    }

    public /* synthetic */ ImageData(String object, String object2, String string2, String string3, Uri object3, int n3, DefaultConstructorMarker object4) {
        Uri uri;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object4 = null;
        } else {
            object4 = object;
        }
        int n7 = n3 & 2;
        Object object5 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string4 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        String string5 = n7 != 0 ? null : string3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            n3 = 0;
            uri = null;
        } else {
            uri = object3;
        }
        object = this;
        object2 = object4;
        string2 = object5;
        string3 = string4;
        object3 = string5;
        this((String)object4, (String)object5, string4, string5, uri);
    }

    public static /* synthetic */ ImageData copy$default(ImageData imageData, String string2, String object, String string3, String object2, Uri object3, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = imageData.fileName;
        }
        if ((n4 = n3 & 2) != 0) {
            object = imageData.contentType;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = imageData.imageDetails;
        }
        String string4 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = imageData.filePath;
        }
        String string5 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = imageData.fileUri;
        }
        Uri uri = object3;
        object = imageData;
        string3 = string2;
        object2 = object4;
        object3 = string4;
        object4 = uri;
        return imageData.copy(string2, (String)object2, string4, string5, uri);
    }

    public final String component1() {
        return this.fileName;
    }

    public final String component2() {
        return this.contentType;
    }

    public final String component3() {
        return this.imageDetails;
    }

    public final String component4() {
        return this.filePath;
    }

    public final Uri component5() {
        return this.fileUri;
    }

    public final ImageData copy(String string2, String string3, String string4, String string5, Uri uri) {
        ImageData imageData = new ImageData(string2, string3, string4, string5, uri);
        return imageData;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ImageData;
        if (!bl3) {
            return false;
        }
        object = (ImageData)object;
        String string2 = this.fileName;
        String string3 = ((ImageData)object).fileName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.contentType;
        string3 = ((ImageData)object).contentType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.imageDetails;
        string3 = ((ImageData)object).imageDetails;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.filePath;
        string3 = ((ImageData)object).filePath;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.fileUri;
        object = ((ImageData)object).fileUri;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final Uri getFileUri() {
        return this.fileUri;
    }

    public final String getImageDetails() {
        return this.imageDetails;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.fileName;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.contentType;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.imageDetails;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.filePath;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.fileUri;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        CharSequence charSequence = this.fileName;
        String string2 = this.contentType;
        String string3 = this.imageDetails;
        String string4 = this.filePath;
        Uri uri = this.fileUri;
        charSequence = og_1.a("ImageData(fileName=", (String)charSequence, ", contentType=", string2, ", imageDetails=");
        X50.a((StringBuilder)charSequence, string3, ", filePath=", string4, ", fileUri=");
        ((StringBuilder)charSequence).append(uri);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.fileName;
        parcel.writeString(string2);
        string2 = this.contentType;
        parcel.writeString(string2);
        string2 = this.imageDetails;
        parcel.writeString(string2);
        string2 = this.filePath;
        parcel.writeString(string2);
        string2 = this.fileUri;
        parcel.writeParcelable((Parcelable)string2, n3);
    }
}

