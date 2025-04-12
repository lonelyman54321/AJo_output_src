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
import androidx.media3.container.Mp4LocationData$a;
import com.google.common.primitives.Floats;

public final class Mp4LocationData
implements Metadata$Entry {
    public static final Parcelable.Creator CREATOR;
    public final float a;
    public final float b;

    static {
        Mp4LocationData$a mp4LocationData$a = new Object();
        CREATOR = mp4LocationData$a;
    }

    public Mp4LocationData(float f5, float f6) {
        float f7;
        float f8;
        float f11;
        float f12 = -90.0f;
        float f14 = f5 == f12 ? 0 : (f5 > f12 ? 1 : -1);
        if (f14 >= 0 && (f14 = (f11 = f5 - (f12 = 90.0f)) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) <= 0 && (f14 = (f8 = f6 - (f12 = -180.0f)) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) >= 0 && (f14 = (f7 = f6 - (f12 = 180.0f)) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) <= 0) {
            f14 = 1.0f;
            f12 = Float.MIN_VALUE;
        } else {
            f14 = 0.0f;
            f12 = 0.0f;
        }
        ct3.b((boolean)f14, "Invalid latitude or longitude");
        this.a = f5;
        this.b = f6;
    }

    public Mp4LocationData(Parcel parcel) {
        float f5;
        float f6;
        this.a = f6 = parcel.readFloat();
        this.b = f5 = parcel.readFloat();
    }

    public final /* synthetic */ d d() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<Mp4LocationData> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = Mp4LocationData.class) == (clazz = object.getClass())) {
            float f5;
            float f6;
            float f7;
            object = (Mp4LocationData)object;
            float f8 = this.a;
            float f11 = ((Mp4LocationData)object).a;
            float f12 = f8 - f11;
            Object object2 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            if (object2 != false || (f7 = (f6 = (f8 = this.b) - (f5 = ((Mp4LocationData)object).b)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) != false) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = (Floats.hashCode(this.a) + 527) * 31;
        return Floats.hashCode(this.b) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("xyz: latitude=");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append(", longitude=");
        f5 = this.b;
        stringBuilder.append(f5);
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
        f5 = this.b;
        parcel.writeFloat(f5);
    }
}

