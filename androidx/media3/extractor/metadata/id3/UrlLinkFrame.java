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
import androidx.media3.extractor.metadata.id3.UrlLinkFrame$a;
import java.util.Objects;

public final class UrlLinkFrame
extends Id3Frame {
    public static final Parcelable.Creator CREATOR;
    public final String b;
    public final String c;

    static {
        UrlLinkFrame$a urlLinkFrame$a = new Object();
        CREATOR = urlLinkFrame$a;
    }

    public UrlLinkFrame(Parcel object) {
        String string2 = object.readString();
        super(string2);
        this.b = string2 = object.readString();
        object = object.readString();
        this.c = object;
    }

    public UrlLinkFrame(String string2, String string3, String string4) {
        super(string2);
        this.b = string3;
        this.c = string4;
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
                    if (object == null || (object3 = UrlLinkFrame.class) != (object2 = object.getClass())) break block4;
                    object = (UrlLinkFrame)object;
                    object2 = this.a;
                    object3 = ((Id3Frame)object).a;
                    boolean n3 = ((String)object2).equals(object3);
                    if (!n3) break block5;
                    int n4 = gz3.a;
                    object2 = this.b;
                    object3 = ((UrlLinkFrame)object).b;
                    boolean bl4 = Objects.equals(object2, object3);
                    if (bl4 && (bl3 = Objects.equals(object2 = this.c, object = ((UrlLinkFrame)object).c))) break block6;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.a;
        int n4 = 31;
        int n7 = zy_2.b(527, n4, string2);
        int n8 = 0;
        String string3 = this.b;
        if (string3 != null) {
            n3 = string3.hashCode();
        } else {
            n3 = 0;
            string3 = null;
        }
        n7 = (n7 + n3) * 31;
        String string4 = this.c;
        if (string4 != null) {
            n8 = string4.hashCode();
        }
        return n7 + n8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(": url=");
        string2 = this.c;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.a;
        parcel.writeString(string2);
        string2 = this.b;
        parcel.writeString(string2);
        string2 = this.c;
        parcel.writeString(string2);
    }
}

