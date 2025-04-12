/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.DrmInitData$SchemeData;
import androidx.media3.common.DrmInitData$a;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

public final class DrmInitData
implements Comparator,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final DrmInitData$SchemeData[] a;
    public int b;
    public final String c;
    public final int d;

    static {
        DrmInitData$a drmInitData$a = new Object();
        CREATOR = drmInitData$a;
    }

    public DrmInitData() {
        throw null;
    }

    public DrmInitData(Parcel drmInitData$SchemeDataArray) {
        int n3;
        String string2;
        this.c = string2 = drmInitData$SchemeDataArray.readString();
        string2 = DrmInitData$SchemeData.CREATOR;
        drmInitData$SchemeDataArray = (DrmInitData$SchemeData[])drmInitData$SchemeDataArray.createTypedArray((Parcelable.Creator)string2);
        this.a = drmInitData$SchemeDataArray;
        this.d = n3 = drmInitData$SchemeDataArray.length;
    }

    public DrmInitData(String object, boolean bl2, DrmInitData$SchemeData ... object2) {
        int n3;
        this.c = object;
        if (bl2) {
            object = object2.clone();
            object2 = object;
            object2 = (DrmInitData$SchemeData[])object;
        }
        this.a = object2;
        this.d = n3 = ((DrmInitData$SchemeData[])object2).length;
        Arrays.sort(object2, this);
    }

    public final DrmInitData a(String string2) {
        int n3 = gz3.a;
        Object object = this.c;
        n3 = (int)(Objects.equals(object, string2) ? 1 : 0);
        if (n3 != 0) {
            return this;
        }
        DrmInitData$SchemeData[] drmInitData$SchemeDataArray = this.a;
        object = new DrmInitData(string2, false, drmInitData$SchemeDataArray);
        return object;
    }

    public final int compare(Object object, Object object2) {
        int n3;
        object = (DrmInitData$SchemeData)object;
        object2 = (DrmInitData$SchemeData)object2;
        UUID uUID = OF.a;
        UUID uUID2 = ((DrmInitData$SchemeData)object).b;
        boolean bl2 = uUID.equals(uUID2);
        if (bl2) {
            object = ((DrmInitData$SchemeData)object2).b;
            n3 = uUID.equals(object);
            if (n3 != 0) {
                n3 = 0;
                object = null;
            } else {
                n3 = 1;
            }
        } else {
            object = ((DrmInitData$SchemeData)object).b;
            object2 = ((DrmInitData$SchemeData)object2).b;
            n3 = ((UUID)object).compareTo((UUID)object2);
        }
        return n3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object objectArray) {
        Object object;
        Object object2;
        boolean bl2 = true;
        if (this == objectArray) {
            return bl2;
        }
        if (objectArray != null && (object2 = DrmInitData.class) == (object = objectArray.getClass())) {
            boolean bl3;
            objectArray = (DrmInitData)objectArray;
            int n3 = gz3.a;
            object = this.c;
            object2 = objectArray.c;
            n3 = (int)(Objects.equals(object, object2) ? 1 : 0);
            if (n3 == 0 || !(bl3 = Arrays.equals(object = this.a, objectArray = objectArray.a))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.b;
        if (n3 == 0) {
            String string2 = this.c;
            if (string2 == null) {
                n3 = 0;
                string2 = null;
            } else {
                n3 = string2.hashCode();
            }
            n3 *= 31;
            Object[] objectArray = this.a;
            int n4 = Arrays.hashCode(objectArray);
            this.b = n3 += n4;
        }
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Parcelable[] parcelableArray = this.c;
        parcel.writeString((String)parcelableArray);
        parcelableArray = this.a;
        parcel.writeTypedArray(parcelableArray, 0);
    }
}

