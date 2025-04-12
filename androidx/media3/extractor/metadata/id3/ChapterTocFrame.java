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
import androidx.media3.extractor.metadata.id3.ChapterTocFrame$a;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import java.util.Arrays;
import java.util.Objects;

public final class ChapterTocFrame
extends Id3Frame {
    public static final Parcelable.Creator CREATOR;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final Id3Frame[] f;

    static {
        ChapterTocFrame$a chapterTocFrame$a = new Object();
        CREATOR = chapterTocFrame$a;
    }

    public ChapterTocFrame(Parcel parcel) {
        int n3 = 1;
        super("CTOC");
        String[] stringArray = parcel.readString();
        int n4 = gz3.a;
        this.b = stringArray;
        int n7 = parcel.readByte();
        n4 = 0;
        if (n7 != 0) {
            n7 = 1;
        } else {
            n7 = 0;
            stringArray = null;
        }
        this.c = n7;
        n7 = parcel.readByte();
        if (n7 != 0) {
            n7 = 1;
        } else {
            n7 = 0;
            stringArray = null;
        }
        this.d = n7;
        stringArray = parcel.createStringArray();
        this.e = stringArray;
        n7 = parcel.readInt();
        Id3Frame[] id3FrameArray = new Id3Frame[n7];
        this.f = id3FrameArray;
        while (n4 < n7) {
            id3FrameArray = this.f;
            Object object = Id3Frame.class.getClassLoader();
            id3FrameArray[n4] = object = (Id3Frame)parcel.readParcelable((ClassLoader)object);
            n4 += n3;
        }
    }

    public ChapterTocFrame(String string2, boolean bl2, boolean bl3, String[] stringArray, Id3Frame[] id3FrameArray) {
        super("CTOC");
        this.b = string2;
        this.c = bl2;
        this.d = bl3;
        this.e = stringArray;
        this.f = id3FrameArray;
    }

    public final boolean equals(Object objectArray) {
        block4: {
            boolean bl2;
            block6: {
                block5: {
                    boolean bl3;
                    Object object;
                    Object object2;
                    bl2 = true;
                    if (this == objectArray) {
                        return bl2;
                    }
                    if (objectArray == null || (object2 = ChapterTocFrame.class) != (object = objectArray.getClass())) break block4;
                    objectArray = (ChapterTocFrame)objectArray;
                    int n3 = this.c;
                    boolean bl4 = objectArray.c;
                    if (n3 != bl4 || (n3 = this.d) != (bl4 = objectArray.d)) break block5;
                    n3 = gz3.a;
                    object = this.b;
                    object2 = objectArray.b;
                    n3 = (int)(Objects.equals(object, object2) ? 1 : 0);
                    if (n3 != 0 && (n3 = (int)(Arrays.equals(object = this.e, object2 = objectArray.e) ? 1 : 0)) != 0 && (bl3 = Arrays.equals(object = this.f, objectArray = objectArray.f))) break block6;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public final int hashCode() {
        void var1_5;
        int n3 = this.c;
        int n4 = (527 + n3) * 31;
        int n7 = this.d;
        n4 = (n4 + n7) * 31;
        String string2 = this.b;
        if (string2 != null) {
            int n8 = string2.hashCode();
        } else {
            boolean bl2 = false;
            string2 = null;
        }
        return n4 + var1_5;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object[] objectArray = this.b;
        parcel.writeString((String)objectArray);
        n3 = (byte)(this.c ? 1 : 0);
        parcel.writeByte((byte)n3);
        n3 = (byte)(this.d ? 1 : 0);
        parcel.writeByte((byte)n3);
        objectArray = this.e;
        parcel.writeStringArray((String[])objectArray);
        objectArray = this.f;
        int n4 = objectArray.length;
        parcel.writeInt(n4);
        for (Object object : objectArray) {
            parcel.writeParcelable((Parcelable)object, 0);
        }
    }
}

