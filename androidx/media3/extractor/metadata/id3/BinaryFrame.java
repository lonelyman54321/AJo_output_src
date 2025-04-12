/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.metadata.id3.BinaryFrame$a;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import java.util.Arrays;

public final class BinaryFrame
extends Id3Frame {
    public static final Parcelable.Creator CREATOR;
    public final byte[] b;

    static {
        BinaryFrame$a binaryFrame$a = new Object();
        CREATOR = binaryFrame$a;
    }

    public BinaryFrame(Parcel object) {
        String string2 = object.readString();
        super(string2);
        object = object.createByteArray();
        this.b = (byte[])object;
    }

    public BinaryFrame(String string2, byte[] byArray) {
        super(string2);
        this.b = byArray;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = BinaryFrame.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (BinaryFrame)object;
            object2 = this.a;
            object3 = ((Id3Frame)object).a;
            boolean bl4 = ((String)object2).equals(object3);
            if (!bl4 || !(bl3 = Arrays.equals((byte[])(object2 = (Object)this.b), (byte[])(object = (Object)((BinaryFrame)object).b)))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.a;
        int n3 = zy_2.b(527, 31, string2);
        return Arrays.hashCode(this.b) + n3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.a;
        parcel.writeString((String)object);
        object = this.b;
        parcel.writeByteArray((byte[])object);
    }
}

