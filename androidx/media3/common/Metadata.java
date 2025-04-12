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
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.Metadata$a;
import com.google.common.primitives.Longs;
import java.util.Arrays;
import java.util.List;

public final class Metadata
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final Metadata$Entry[] a;
    public final long b;

    static {
        Metadata$a metadata$a = new Object();
        CREATOR = metadata$a;
    }

    public Metadata() {
        throw null;
    }

    public Metadata(long l2, Metadata$Entry ... metadata$EntryArray) {
        this.b = l2;
        this.a = metadata$EntryArray;
    }

    public Metadata(Parcel parcel) {
        long l2;
        Metadata$Entry[] metadata$EntryArray;
        int n3;
        Metadata$Entry[] metadata$EntryArray2 = new Metadata$Entry[parcel.readInt()];
        this.a = metadata$EntryArray2;
        metadata$EntryArray2 = null;
        for (int i3 = 0; i3 < (n3 = (metadata$EntryArray = this.a).length); ++i3) {
            Object object = Metadata$Entry.class.getClassLoader();
            metadata$EntryArray[i3] = object = (Metadata$Entry)parcel.readParcelable((ClassLoader)object);
        }
        this.b = l2 = parcel.readLong();
    }

    public Metadata(List metadata$EntryArray) {
        Metadata$Entry[] metadata$EntryArray2 = new Metadata$Entry[]{};
        metadata$EntryArray = metadata$EntryArray.toArray(metadata$EntryArray2);
        this(metadata$EntryArray);
    }

    public Metadata(Metadata$Entry ... metadata$EntryArray) {
        this(-9223372036854775807L, metadata$EntryArray);
    }

    public final Metadata a(Metadata$Entry ... metadata$EntryArray) {
        int n3 = metadata$EntryArray.length;
        if (n3 == 0) {
            return this;
        }
        int n4 = gz3.a;
        Metadata$Entry[] metadata$EntryArray2 = this.a;
        int n7 = metadata$EntryArray2.length;
        int n8 = metadata$EntryArray.length;
        Metadata$Entry[] metadata$EntryArray3 = Arrays.copyOf(metadata$EntryArray2, n7 += n8);
        n4 = metadata$EntryArray2.length;
        n8 = metadata$EntryArray.length;
        System.arraycopy(metadata$EntryArray, 0, metadata$EntryArray3, n4, n8);
        long l2 = this.b;
        Metadata metadata = new Metadata(l2, metadata$EntryArray3);
        return metadata;
    }

    public final Metadata b(Metadata metadata$EntryArray) {
        if (metadata$EntryArray == null) {
            return this;
        }
        metadata$EntryArray = metadata$EntryArray.a;
        return this.a(metadata$EntryArray);
    }

    public final Metadata$Entry c(int n3) {
        return this.a[n3];
    }

    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.a.length;
    }

    public final boolean equals(Object object) {
        Object[] objectArray;
        Object[] objectArray2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (objectArray2 = Metadata.class) == (objectArray = object.getClass())) {
            long l2;
            long l3;
            long l4;
            long l7;
            object = (Metadata)object;
            objectArray = this.a;
            objectArray2 = ((Metadata)object).a;
            boolean bl3 = Arrays.equals(objectArray, objectArray2);
            if (!bl3 || (l7 = (l4 = (l3 = this.b) - (l2 = ((Metadata)object).b)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = Arrays.hashCode(this.a) * 31;
        return Longs.hashCode(this.b) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("entries=");
        CharSequence charSequence = Arrays.toString(this.a);
        stringBuilder.append((String)charSequence);
        long l2 = -9223372036854775807L;
        long l3 = this.b;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (l4 == false) {
            charSequence = "";
        } else {
            String string2 = ", presentationTimeUs=";
            charSequence = new StringBuilder(string2);
            ((StringBuilder)charSequence).append(l3);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        stringBuilder.append((String)charSequence);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Metadata$Entry[] metadata$EntryArray = this.a;
        int n4 = metadata$EntryArray.length;
        parcel.writeInt(n4);
        for (Metadata$Entry metadata$Entry : metadata$EntryArray) {
            parcel.writeParcelable((Parcelable)metadata$Entry, 0);
        }
        long l2 = this.b;
        parcel.writeLong(l2);
    }
}

