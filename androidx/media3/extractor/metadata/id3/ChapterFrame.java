/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.metadata.id3.ChapterFrame$a;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import java.util.Arrays;
import java.util.Objects;

public final class ChapterFrame
extends Id3Frame {
    public static final Parcelable.Creator CREATOR;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final Id3Frame[] g;

    static {
        ChapterFrame$a chapterFrame$a = new Object();
        CREATOR = chapterFrame$a;
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        long l2;
        int n3;
        String string2 = parcel.readString();
        int n4 = gz3.a;
        this.b = string2;
        this.c = n3 = parcel.readInt();
        this.d = n3 = parcel.readInt();
        this.e = l2 = parcel.readLong();
        this.f = l2 = parcel.readLong();
        n3 = parcel.readInt();
        Id3Frame[] id3FrameArray = new Id3Frame[n3];
        this.g = id3FrameArray;
        id3FrameArray = null;
        for (n4 = 0; n4 < n3; ++n4) {
            Id3Frame[] id3FrameArray2 = this.g;
            Object object = Id3Frame.class.getClassLoader();
            id3FrameArray2[n4] = object = (Id3Frame)parcel.readParcelable((ClassLoader)object);
        }
    }

    public ChapterFrame(String string2, int n3, int n4, long l2, long l3, Id3Frame[] id3FrameArray) {
        super("CHAP");
        this.b = string2;
        this.c = n3;
        this.d = n4;
        this.e = l2;
        this.f = l3;
        this.g = id3FrameArray;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object objectArray) {
        block4: {
            boolean bl2;
            block6: {
                block5: {
                    boolean bl3;
                    long l2;
                    long l3;
                    long l4;
                    long l7;
                    long l8;
                    Object object;
                    Object object2;
                    bl2 = true;
                    if (this == objectArray) {
                        return bl2;
                    }
                    if (objectArray == null || (object2 = ChapterFrame.class) != (object = objectArray.getClass())) break block4;
                    objectArray = (ChapterFrame)objectArray;
                    int n3 = this.c;
                    int n4 = objectArray.c;
                    if (n3 != n4 || (n3 = this.d) != (n4 = objectArray.d) || (l8 = (l7 = (l4 = this.e) - (l3 = objectArray.e)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false || (l8 = (l2 = (l4 = this.f) - (l3 = objectArray.f)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) break block5;
                    n3 = gz3.a;
                    object = this.b;
                    object2 = objectArray.b;
                    n3 = (int)(Objects.equals(object, object2) ? 1 : 0);
                    if (n3 != 0 && (bl3 = Arrays.equals(object = this.g, objectArray = objectArray.g))) break block6;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.c;
        int n4 = (527 + n3) * 31;
        n3 = this.d;
        n4 = (n4 + n3) * 31;
        int n7 = (int)this.e;
        n4 = (n4 + n7) * 31;
        long l2 = this.f;
        n7 = (int)l2;
        n4 = (n4 + n7) * 31;
        String string2 = this.b;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        return n4 + n3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Id3Frame[] id3FrameArray = this.b;
        parcel.writeString((String)id3FrameArray);
        n3 = this.c;
        parcel.writeInt(n3);
        n3 = this.d;
        parcel.writeInt(n3);
        long l2 = this.e;
        parcel.writeLong(l2);
        l2 = this.f;
        parcel.writeLong(l2);
        id3FrameArray = this.g;
        int n4 = id3FrameArray.length;
        parcel.writeInt(n4);
        for (Id3Frame id3Frame : id3FrameArray) {
            parcel.writeParcelable((Parcelable)id3Frame, 0);
        }
    }
}

