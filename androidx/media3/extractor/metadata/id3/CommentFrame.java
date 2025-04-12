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
import androidx.media3.extractor.metadata.id3.CommentFrame$a;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import java.util.Objects;

public final class CommentFrame
extends Id3Frame {
    public static final Parcelable.Creator CREATOR;
    public final String b;
    public final String c;
    public final String d;

    static {
        CommentFrame$a commentFrame$a = new Object();
        CREATOR = commentFrame$a;
    }

    public CommentFrame(Parcel object) {
        super("COMM");
        String string2 = object.readString();
        this.b = string2;
        this.c = string2 = object.readString();
        object = object.readString();
        this.d = object;
    }

    public CommentFrame(String string2, String string3, String string4) {
        super("COMM");
        this.b = string2;
        this.c = string3;
        this.d = string4;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = CommentFrame.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (CommentFrame)object;
            int n3 = gz3.a;
            object2 = this.c;
            object3 = ((CommentFrame)object).c;
            n3 = (int)(Objects.equals(object2, object3) ? 1 : 0);
            if (n3 == 0 || (n3 = (int)(Objects.equals(object2 = this.b, object3 = ((CommentFrame)object).b) ? 1 : 0)) == 0 || !(bl3 = Objects.equals(object2 = this.d, object = ((CommentFrame)object).d))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        String string2 = this.b;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        int n7 = (527 + n3) * 31;
        string2 = this.c;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        n7 = (n7 + n3) * 31;
        string2 = this.d;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        return n7 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(": language=");
        string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append(", description=");
        string2 = this.c;
        stringBuilder.append(string2);
        stringBuilder.append(", text=");
        string2 = this.d;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.a;
        parcel.writeString(string2);
        string2 = this.b;
        parcel.writeString(string2);
        string2 = this.d;
        parcel.writeString(string2);
    }
}

