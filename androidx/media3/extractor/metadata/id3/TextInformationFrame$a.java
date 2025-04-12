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
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.common.collect.ImmutableList;

public final class TextInformationFrame$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel object) {
        String string2 = object.readString();
        string2.getClass();
        String string3 = object.readString();
        object = object.createStringArray();
        object.getClass();
        object = ImmutableList.copyOf(object);
        TextInformationFrame textInformationFrame = new TextInformationFrame(string2, string3, (ImmutableList)object);
        return textInformationFrame;
    }

    public final Object[] newArray(int n3) {
        return new TextInformationFrame[n3];
    }
}

