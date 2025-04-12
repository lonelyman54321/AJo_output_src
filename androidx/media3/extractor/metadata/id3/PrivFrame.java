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
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.PrivFrame$a;
import java.util.Arrays;
import java.util.Objects;

public final class PrivFrame
extends Id3Frame {
    public static final Parcelable.Creator CREATOR;
    public final String b;
    public final byte[] c;

    static {
        PrivFrame$a privFrame$a = new Object();
        CREATOR = privFrame$a;
    }

    public PrivFrame(Parcel object) {
        super("PRIV");
        String string2 = object.readString();
        this.b = string2;
        object = object.createByteArray();
        this.c = (byte[])object;
    }

    public PrivFrame(String string2, byte[] byArray) {
        super("PRIV");
        this.b = string2;
        this.c = byArray;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = PrivFrame.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (PrivFrame)object;
            int n3 = gz3.a;
            object2 = this.b;
            object3 = ((PrivFrame)object).b;
            n3 = (int)(Objects.equals(object2, object3) ? 1 : 0);
            if (n3 == 0 || !(bl3 = Arrays.equals((byte[])(object2 = (Object)this.c), (byte[])(object = (Object)((PrivFrame)object).c)))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.b;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        int n4 = (527 + n3) * 31;
        return Arrays.hashCode(this.c) + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(": owner=");
        string2 = this.b;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.b;
        parcel.writeString((String)object);
        object = this.c;
        parcel.writeByteArray((byte[])object);
    }
}

