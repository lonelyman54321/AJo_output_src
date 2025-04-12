/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.d;
import androidx.media3.common.e$a;
import androidx.media3.extractor.metadata.icy.IcyInfo$a;
import java.util.Arrays;

public final class IcyInfo
implements Metadata$Entry {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;
    public final String b;
    public final String c;

    static {
        IcyInfo$a icyInfo$a = new Object();
        CREATOR = icyInfo$a;
    }

    public IcyInfo(Parcel object) {
        Object object2 = object.createByteArray();
        object2.getClass();
        this.a = object2;
        object2 = object.readString();
        this.b = object2;
        object = object.readString();
        this.c = object;
    }

    public IcyInfo(byte[] byArray, String string2, String string3) {
        this.a = byArray;
        this.b = string2;
        this.c = string3;
    }

    public final /* synthetic */ d d() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        Object object2;
        Class<IcyInfo> clazz;
        if (this == object) {
            return true;
        }
        if (object != null && (clazz = IcyInfo.class) == (object2 = object.getClass())) {
            object = (IcyInfo)object;
            object2 = this.a;
            object = ((IcyInfo)object).a;
            return Arrays.equals((byte[])object2, (byte[])object);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        int n3 = this.a.length;
        StringBuilder stringBuilder = new StringBuilder("ICY: title=\"");
        String string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append("\", url=\"");
        string2 = this.c;
        stringBuilder.append(string2);
        stringBuilder.append("\", rawMetadata.length=\"");
        stringBuilder.append(n3);
        stringBuilder.append("\"");
        return stringBuilder.toString();
    }

    public final void u(e$a e$a) {
        String string2 = this.b;
        if (string2 != null) {
            e$a.a = string2;
        }
    }

    public final /* synthetic */ byte[] w() {
        return null;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.a;
        parcel.writeByteArray(object);
        object = this.b;
        parcel.writeString((String)object);
        object = this.c;
        parcel.writeString((String)object);
    }
}

