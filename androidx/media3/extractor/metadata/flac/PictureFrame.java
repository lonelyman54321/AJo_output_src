/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.d;
import androidx.media3.common.e$a;
import androidx.media3.extractor.metadata.flac.PictureFrame$a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public final class PictureFrame
implements Metadata$Entry {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    static {
        PictureFrame$a pictureFrame$a = new Object();
        CREATOR = pictureFrame$a;
    }

    public PictureFrame(int n3, String string2, String string3, int n4, int n7, int n8, int n10, byte[] byArray) {
        this.a = n3;
        this.b = string2;
        this.c = string3;
        this.d = n4;
        this.e = n7;
        this.f = n8;
        this.g = n10;
        this.h = byArray;
    }

    public PictureFrame(Parcel object) {
        int n3;
        this.a = n3 = object.readInt();
        String string2 = object.readString();
        this.b = string2;
        this.c = string2 = object.readString();
        this.d = n3 = object.readInt();
        this.e = n3 = object.readInt();
        this.f = n3 = object.readInt();
        this.g = n3 = object.readInt();
        object = object.createByteArray();
        this.h = (byte[])object;
    }

    public static PictureFrame a(Xm2 object) {
        int n3 = ((Xm2)object).i();
        int n4 = ((Xm2)object).i();
        Object object2 = StandardCharsets.US_ASCII;
        object2 = ip1_0.l(((Xm2)object).u(n4, (Charset)object2));
        n4 = ((Xm2)object).i();
        Object object3 = StandardCharsets.UTF_8;
        object3 = ((Xm2)object).u(n4, (Charset)object3);
        int n7 = ((Xm2)object).i();
        int n8 = ((Xm2)object).i();
        int n10 = ((Xm2)object).i();
        int n14 = ((Xm2)object).i();
        n4 = ((Xm2)object).i();
        byte[] byArray = new byte[n4];
        ((Xm2)object).g(0, byArray, n4);
        object = new PictureFrame(n3, (String)object2, (String)object3, n7, n8, n10, n14, byArray);
        return object;
    }

    public final /* synthetic */ d d() {
        return null;
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
        if (object != null && (object3 = PictureFrame.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (PictureFrame)object;
            int n3 = this.a;
            int n4 = ((PictureFrame)object).a;
            if (n3 != n4 || (n3 = (int)(((String)(object2 = this.b)).equals(object3 = ((PictureFrame)object).b) ? 1 : 0)) == 0 || (n3 = (int)(((String)(object2 = this.c)).equals(object3 = ((PictureFrame)object).c) ? 1 : 0)) == 0 || (n3 = this.d) != (n4 = ((PictureFrame)object).d) || (n3 = this.e) != (n4 = ((PictureFrame)object).e) || (n3 = this.f) != (n4 = ((PictureFrame)object).f) || (n3 = this.g) != (n4 = ((PictureFrame)object).g) || !(bl3 = Arrays.equals((byte[])(object2 = (Object)this.h), (byte[])(object = (Object)((PictureFrame)object).h)))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a;
        int n4 = 527 + n3;
        n3 = 31;
        n4 *= 31;
        String string2 = this.b;
        n4 = zy_2.b(n4, n3, string2);
        string2 = this.c;
        n4 = zy_2.b(n4, n3, string2);
        int n7 = this.d;
        n4 = (n4 + n7) * 31;
        n7 = this.e;
        n4 = (n4 + n7) * 31;
        n7 = this.f;
        n4 = (n4 + n7) * 31;
        n7 = this.g;
        n4 = (n4 + n7) * 31;
        return Arrays.hashCode(this.h) + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Picture: mimeType=");
        String string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append(", description=");
        string2 = this.c;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void u(e$a e$a) {
        byte[] byArray = this.h;
        int n3 = this.a;
        e$a.a(n3, byArray);
    }

    public final /* synthetic */ byte[] w() {
        return null;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.a;
        parcel.writeInt(n3);
        Object object = this.b;
        parcel.writeString((String)object);
        object = this.c;
        parcel.writeString((String)object);
        n3 = this.d;
        parcel.writeInt(n3);
        n3 = this.e;
        parcel.writeInt(n3);
        n3 = this.f;
        parcel.writeInt(n3);
        n3 = this.g;
        parcel.writeInt(n3);
        object = this.h;
        parcel.writeByteArray((byte[])object);
    }
}

