/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.d;
import androidx.media3.common.e$a;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry$a;
import com.google.common.primitives.Floats;

public final class SmtaMetadataEntry
implements Metadata$Entry {
    public static final Parcelable.Creator CREATOR;
    public final float a;
    public final int b;

    static {
        SmtaMetadataEntry$a smtaMetadataEntry$a = new Object();
        CREATOR = smtaMetadataEntry$a;
    }

    public SmtaMetadataEntry(float f5, int n3) {
        this.a = f5;
        this.b = n3;
    }

    public SmtaMetadataEntry(Parcel parcel) {
        int n3;
        float f5;
        this.a = f5 = parcel.readFloat();
        this.b = n3 = parcel.readInt();
    }

    public final /* synthetic */ d d() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<SmtaMetadataEntry> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = SmtaMetadataEntry.class) == (clazz = object.getClass())) {
            int n3;
            object = (SmtaMetadataEntry)object;
            float f5 = this.a;
            float f6 = ((SmtaMetadataEntry)object).a;
            float f7 = f5 - f6;
            Object object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object2 != false || (object2 = (Object)this.b) != (n3 = ((SmtaMetadataEntry)object).b)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = (Floats.hashCode(this.a) + 527) * 31;
        int n4 = this.b;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("smta: captureFrameRate=");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append(", svcTemporalLayerCount=");
        int n3 = this.b;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public final /* synthetic */ void u(e$a e$a) {
    }

    public final /* synthetic */ byte[] w() {
        return null;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        float f5 = this.a;
        parcel.writeFloat(f5);
        n3 = this.b;
        parcel.writeInt(n3);
    }
}

