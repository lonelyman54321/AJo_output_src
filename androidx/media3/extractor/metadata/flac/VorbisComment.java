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
import androidx.media3.extractor.metadata.flac.VorbisComment$a;
import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;

public class VorbisComment
implements Metadata$Entry {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;

    static {
        VorbisComment$a vorbisComment$a = new Object();
        CREATOR = vorbisComment$a;
    }

    public VorbisComment(Parcel object) {
        String string2 = object.readString();
        this.a = string2;
        object = object.readString();
        this.b = object;
    }

    public VorbisComment(String string2, String string3) {
        this.a = string2 = Ascii.toUpperCase(string2);
        this.b = string3;
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
        if (object != null && (object3 = this.getClass()) == (object2 = object.getClass())) {
            boolean bl3;
            object = (VorbisComment)object;
            object3 = this.a;
            object2 = ((VorbisComment)object).a;
            boolean bl4 = ((String)object3).equals(object2);
            if (!bl4 || !(bl3 = ((String)(object3 = this.b)).equals(object = ((VorbisComment)object).b))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.a;
        int n3 = zy_2.b(527, 31, string2);
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("VC: ");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append("=");
        string2 = this.b;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void u(e$a e$a) {
        Object object = this.a;
        object.getClass();
        String string2 = this.b;
        int n3 = -1;
        int n4 = ((String)object).hashCode();
        switch (n4) {
            default: {
                break;
            }
            case 1939198791: {
                String string3 = "ARTIST";
                boolean bl2 = ((String)object).equals(string3);
                if (!bl2) break;
                n3 = 9;
                break;
            }
            case 1746739798: {
                String string4 = "ALBUMARTIST";
                boolean bl3 = ((String)object).equals(string4);
                if (!bl3) break;
                n3 = 8;
                break;
            }
            case 993300766: {
                String string5 = "DISCNUMBER";
                boolean bl4 = ((String)object).equals(string5);
                if (!bl4) break;
                n3 = 7;
                break;
            }
            case 428414940: {
                String string6 = "DESCRIPTION";
                boolean bl5 = ((String)object).equals(string6);
                if (!bl5) break;
                n3 = 6;
                break;
            }
            case 79833656: {
                String string7 = "TITLE";
                boolean bl6 = ((String)object).equals(string7);
                if (!bl6) break;
                n3 = 5;
                break;
            }
            case 67703139: {
                String string8 = "GENRE";
                boolean bl7 = ((String)object).equals(string8);
                if (!bl7) break;
                n3 = 4;
                break;
            }
            case 62359119: {
                String string9 = "ALBUM";
                boolean bl8 = ((String)object).equals(string9);
                if (!bl8) break;
                n3 = 3;
                break;
            }
            case -113312716: {
                String string10 = "TRACKNUMBER";
                boolean bl9 = ((String)object).equals(string10);
                if (!bl9) break;
                n3 = 2;
                break;
            }
            case -215998278: {
                String string11 = "TOTALDISCS";
                boolean bl10 = ((String)object).equals(string11);
                if (!bl10) break;
                n3 = 1;
                break;
            }
            case -1935137620: {
                String string12 = "TOTALTRACKS";
                boolean bl11 = ((String)object).equals(string12);
                if (!bl11) break;
                n3 = 0;
            }
        }
        switch (n3) {
            default: {
                break;
            }
            case 9: {
                e$a.b = string2;
                break;
            }
            case 8: {
                e$a.d = string2;
                break;
            }
            case 7: {
                object = Ints.tryParse(string2);
                if (object == null) break;
                e$a.z = object;
                break;
            }
            case 6: {
                e$a.g = string2;
                break;
            }
            case 5: {
                e$a.a = string2;
                break;
            }
            case 4: {
                e$a.B = string2;
                break;
            }
            case 3: {
                e$a.c = string2;
                break;
            }
            case 2: {
                object = Ints.tryParse(string2);
                if (object == null) break;
                e$a.l = object;
                break;
            }
            case 1: {
                object = Ints.tryParse(string2);
                if (object == null) break;
                e$a.A = object;
                break;
            }
            case 0: {
                object = Ints.tryParse(string2);
                if (object == null) break;
                e$a.m = object;
            }
        }
    }

    public final /* synthetic */ byte[] w() {
        return null;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.a;
        parcel.writeString(string2);
        string2 = this.b;
        parcel.writeString(string2);
    }
}

