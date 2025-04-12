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
import androidx.media3.common.e$a;
import androidx.media3.extractor.metadata.id3.ApicFrame$a;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import java.util.Arrays;
import java.util.Objects;

public final class ApicFrame
extends Id3Frame {
    public static final Parcelable.Creator CREATOR;
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    static {
        ApicFrame$a apicFrame$a = new Object();
        CREATOR = apicFrame$a;
    }

    public ApicFrame(Parcel object) {
        super("APIC");
        int n3;
        String string2 = object.readString();
        this.b = string2;
        this.c = string2 = object.readString();
        this.d = n3 = object.readInt();
        object = object.createByteArray();
        this.e = (byte[])object;
    }

    public ApicFrame(String string2, String string3, int n3, byte[] byArray) {
        super("APIC");
        this.b = string2;
        this.c = string3;
        this.d = n3;
        this.e = byArray;
    }

    public final boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                block5: {
                    boolean bl3;
                    Object object2;
                    Object object3;
                    bl2 = true;
                    if (this == object) {
                        return bl2;
                    }
                    if (object == null || (object3 = ApicFrame.class) != (object2 = object.getClass())) break block4;
                    object = (ApicFrame)object;
                    int n3 = this.d;
                    int n4 = ((ApicFrame)object).d;
                    if (n3 != n4) break block5;
                    n3 = gz3.a;
                    object2 = this.b;
                    object3 = ((ApicFrame)object).b;
                    n3 = (int)(Objects.equals(object2, object3) ? 1 : 0);
                    if (n3 != 0 && (n3 = (int)(Objects.equals(object2 = this.c, object3 = ((ApicFrame)object).c) ? 1 : 0)) != 0 && (bl3 = Arrays.equals((byte[])(object2 = (Object)this.e), (byte[])(object = (Object)((ApicFrame)object).e)))) break block6;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.d;
        int n7 = (527 + n4) * 31;
        n4 = 0;
        String string2 = this.b;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        n7 = (n7 + n3) * 31;
        string2 = this.c;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        n7 = (n7 + n4) * 31;
        return Arrays.hashCode(this.e) + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(": mimeType=");
        string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append(", description=");
        string2 = this.c;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void u(e$a e$a) {
        byte[] byArray = this.e;
        int n3 = this.d;
        e$a.a(n3, byArray);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.b;
        parcel.writeString((String)object);
        object = this.c;
        parcel.writeString((String)object);
        n3 = this.d;
        parcel.writeInt(n3);
        object = this.e;
        parcel.writeByteArray((byte[])object);
    }
}

