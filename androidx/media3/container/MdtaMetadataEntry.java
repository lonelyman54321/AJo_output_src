/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.d;
import androidx.media3.common.e$a;
import androidx.media3.container.MdtaMetadataEntry$a;
import com.google.common.base.Joiner;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;

public final class MdtaMetadataEntry
implements Metadata$Entry {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    static {
        MdtaMetadataEntry$a mdtaMetadataEntry$a = new Object();
        CREATOR = mdtaMetadataEntry$a;
    }

    public MdtaMetadataEntry(Parcel parcel) {
        int n3;
        int n4;
        String string2 = parcel.readString();
        this.a = string2;
        byte[] byArray = parcel.createByteArray();
        this.b = byArray;
        this.c = n4 = parcel.readInt();
        this.d = n3 = parcel.readInt();
        MdtaMetadataEntry.b(n3, string2, byArray);
    }

    public MdtaMetadataEntry(String string2, byte[] byArray, int n3, int n4) {
        MdtaMetadataEntry.b(n4, string2, byArray);
        this.a = string2;
        this.b = byArray;
        this.c = n3;
        this.d = n4;
    }

    public static void b(int n3, String string2, byte[] byArray) {
        int n4;
        int n7 = 4;
        string2.getClass();
        boolean bl2 = false;
        int n8 = 1;
        int n10 = -1;
        int n14 = string2.hashCode();
        switch (n14) {
            default: {
                break;
            }
            case 1805012160: {
                String string3 = "editable.tracks.map";
                n4 = (int)(string2.equals(string3) ? 1 : 0);
                if (n4 == 0) break;
                n10 = 4;
                break;
            }
            case 188404399: {
                String string4 = "editable.tracks.offset";
                n4 = (int)(string2.equals(string4) ? 1 : 0);
                if (n4 == 0) break;
                n10 = 3;
                break;
            }
            case 101820674: {
                String string5 = "editable.tracks.length";
                n4 = (int)(string2.equals(string5) ? 1 : 0);
                if (n4 == 0) break;
                n10 = 2;
                break;
            }
            case -1555642602: {
                String string6 = "editable.tracks.samples.location";
                n4 = (int)(string2.equals(string6) ? 1 : 0);
                if (n4 == 0) break;
                n10 = 1;
                break;
            }
            case -1949883051: {
                String string7 = "com.android.capture.fps";
                n4 = (int)(string2.equals(string7) ? 1 : 0);
                if (n4 == 0) break;
                n10 = 0;
            }
        }
        switch (n10) {
            default: {
                break;
            }
            case 4: {
                if (n3 == 0) {
                    bl2 = true;
                }
                ct3.a(bl2);
                break;
            }
            case 2: 
            case 3: {
                n4 = 78;
                if (n3 == n4 && (n3 = byArray.length) == (n4 = 8)) {
                    bl2 = true;
                }
                ct3.a(bl2);
                break;
            }
            case 1: {
                n4 = 75;
                if (n3 == n4 && (n3 = byArray.length) == n8 && ((n3 = byArray[0]) == 0 || n3 == n8)) {
                    bl2 = true;
                }
                ct3.a(bl2);
                break;
            }
            case 0: {
                n4 = 23;
                if (n3 == n4 && (n3 = byArray.length) == n7) {
                    bl2 = true;
                }
                ct3.a(bl2);
            }
        }
    }

    public final ArrayList a() {
        boolean bl2 = this.a.equals("editable.tracks.map");
        String string2 = "Metadata is not an editable tracks map";
        ct3.g(bl2, string2);
        byte[] byArray = this.b;
        int n3 = byArray[1];
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = i3 + 2;
            n4 = byArray[n4];
            Integer n7 = n4;
            arrayList.add(n7);
        }
        return arrayList;
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
        if (object != null && (object3 = MdtaMetadataEntry.class) == (object2 = object.getClass())) {
            int n3;
            int n4;
            int n7;
            int n8;
            boolean bl3;
            object = (MdtaMetadataEntry)object;
            object2 = this.a;
            object3 = ((MdtaMetadataEntry)object).a;
            boolean n74 = ((String)object2).equals(object3);
            if (!n74 || !(bl3 = Arrays.equals((byte[])(object2 = (Object)this.b), (byte[])(object3 = (Object)((MdtaMetadataEntry)object).b))) || (n8 = this.c) != (n7 = ((MdtaMetadataEntry)object).c) || (n4 = this.d) != (n3 = ((MdtaMetadataEntry)object).d)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.a;
        int n3 = zy_2.b(527, 31, string2);
        int n4 = (Arrays.hashCode(this.b) + n3) * 31;
        n3 = this.c;
        n4 = (n4 + n3) * 31;
        n3 = this.d;
        return n4 + n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String toString() {
        CharSequence charSequence;
        int n3;
        Object object;
        int n4 = 1;
        float f5 = Float.MIN_VALUE;
        String string2 = this.a;
        int n7 = 0;
        StringBuilder stringBuilder = null;
        Object object2 = this.b;
        int n8 = this.d;
        if (n8 != 0) {
            if (n8 == n4) {
                object = gz3.l((byte[])object2);
                return UX.c("mdta: key=", string2, ", value=", (String)object);
            }
            n3 = 23;
            if (n8 == n3) {
                n4 = Ints.fromByteArray((byte[])object2);
                f5 = Float.intBitsToFloat(n4);
                object = String.valueOf(f5);
                return UX.c("mdta: key=", string2, ", value=", (String)object);
            }
            n3 = 67;
            if (n8 == n3) {
                n4 = Ints.fromByteArray((byte[])object2);
                object = String.valueOf(n4);
                return UX.c("mdta: key=", string2, ", value=", (String)object);
            }
            n3 = 75;
            if (n8 == n3) {
                n4 = object2[0] & 0xFF;
                object = String.valueOf(n4);
                return UX.c("mdta: key=", string2, ", value=", (String)object);
            }
            n3 = 78;
            if (n8 == n3) {
                object = new Xm2((byte[])object2);
                long l2 = ((Xm2)object).B();
                object = String.valueOf(l2);
                return UX.c("mdta: key=", string2, ", value=", (String)object);
            }
        } else {
            charSequence = "editable.tracks.map";
            n8 = (int)(string2.equals(charSequence) ? 1 : 0);
            if (n8 != 0) {
                object = this.a();
                stringBuilder = Ex0.a("track types = ");
                char c2 = ',';
                object2 = Joiner.on(c2);
                ((Joiner)object2).appendTo(stringBuilder, (Iterable)object);
                object = stringBuilder.toString();
                return UX.c("mdta: key=", string2, ", value=", (String)object);
            }
        }
        n8 = gz3.a;
        n3 = ((byte[])object2).length * 2;
        charSequence = new StringBuilder(n3);
        while (true) {
            if (n7 >= (n3 = ((byte[])object2).length)) {
                object = ((StringBuilder)charSequence).toString();
                return UX.c("mdta: key=", string2, ", value=", (String)object);
            }
            n3 = object2[n7] >> 4 & 0xF;
            int n10 = 16;
            n3 = Character.forDigit(n3, n10);
            ((StringBuilder)charSequence).append((char)n3);
            n3 = Character.forDigit(object2[n7] & 0xF, n10);
            ((StringBuilder)charSequence).append((char)n3);
            n7 += n4;
        }
    }

    public final /* synthetic */ void u(e$a e$a) {
    }

    public final /* synthetic */ byte[] w() {
        return null;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.a;
        parcel.writeString((String)object);
        object = this.b;
        parcel.writeByteArray((byte[])object);
        n3 = this.c;
        parcel.writeInt(n3);
        n3 = this.d;
        parcel.writeInt(n3);
    }
}

