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
import androidx.media3.common.StreamKey$a;

public final class StreamKey
implements Comparable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final int c;

    static {
        StreamKey$a streamKey$a = new Object();
        CREATOR = streamKey$a;
        gz3.D(0);
        gz3.D(1);
        gz3.D(2);
    }

    public StreamKey(Parcel parcel) {
        int n3;
        int n4;
        this.a = n4 = parcel.readInt();
        this.b = n4 = parcel.readInt();
        this.c = n3 = parcel.readInt();
    }

    public final int compareTo(Object object) {
        object = (StreamKey)object;
        int n3 = ((StreamKey)object).a;
        int n4 = this.a - n3;
        if (n4 == 0) {
            n3 = this.b;
            n4 = ((StreamKey)object).b;
            if ((n4 = n3 - n4) == 0) {
                n3 = this.c;
                int n7 = ((StreamKey)object).c;
                n4 = n3 - n7;
            }
        }
        return n4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<StreamKey> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = StreamKey.class) == (clazz = object.getClass())) {
            int n3;
            object = (StreamKey)object;
            int n4 = this.a;
            int n7 = ((StreamKey)object).a;
            if (n4 != n7 || (n4 = this.b) != (n7 = ((StreamKey)object).b) || (n4 = this.c) != (n3 = ((StreamKey)object).c)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        n4 = this.c;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.a;
        stringBuilder.append(n3);
        String string2 = ".";
        stringBuilder.append(string2);
        int n4 = this.b;
        stringBuilder.append(n4);
        stringBuilder.append(string2);
        n3 = this.c;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.a;
        parcel.writeInt(n3);
        n3 = this.b;
        parcel.writeInt(n3);
        n3 = this.c;
        parcel.writeInt(n3);
    }
}

