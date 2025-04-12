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
import androidx.media3.extractor.metadata.id3.MlltFrame$a;
import java.util.Arrays;

public final class MlltFrame
extends Id3Frame {
    public static final Parcelable.Creator CREATOR;
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    static {
        MlltFrame$a mlltFrame$a = new Object();
        CREATOR = mlltFrame$a;
    }

    public MlltFrame(int n3, int n4, int n7, int[] nArray, int[] nArray2) {
        super("MLLT");
        this.b = n3;
        this.c = n4;
        this.d = n7;
        this.e = nArray;
        this.f = nArray2;
    }

    public MlltFrame(Parcel object) {
        super("MLLT");
        int n3;
        this.b = n3 = object.readInt();
        this.c = n3 = object.readInt();
        this.d = n3 = object.readInt();
        int[] nArray = object.createIntArray();
        this.e = nArray;
        object = object.createIntArray();
        this.f = (int[])object;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = MlltFrame.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (MlltFrame)object;
            int n3 = this.b;
            int n4 = ((MlltFrame)object).b;
            if (n3 != n4 || (n3 = this.c) != (n4 = ((MlltFrame)object).c) || (n3 = this.d) != (n4 = ((MlltFrame)object).d) || (n3 = (int)(Arrays.equals((int[])(object2 = (Object)this.e), (int[])(object3 = (Object)((MlltFrame)object).e)) ? 1 : 0)) == 0 || !(bl3 = Arrays.equals((int[])(object2 = (Object)this.f), (int[])(object = (Object)((MlltFrame)object).f)))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.b;
        int n4 = (527 + n3) * 31;
        n3 = this.c;
        n4 = (n4 + n3) * 31;
        n3 = this.d;
        n4 = (n4 + n3) * 31;
        n3 = (Arrays.hashCode(this.e) + n4) * 31;
        return Arrays.hashCode(this.f) + n3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.b;
        parcel.writeInt(n3);
        n3 = this.c;
        parcel.writeInt(n3);
        n3 = this.d;
        parcel.writeInt(n3);
        int[] nArray = this.e;
        parcel.writeIntArray(nArray);
        nArray = this.f;
        parcel.writeIntArray(nArray);
    }
}

