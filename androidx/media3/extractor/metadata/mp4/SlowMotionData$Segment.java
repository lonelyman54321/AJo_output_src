/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.metadata.mp4.SlowMotionData$Segment$a;
import com.google.common.base.Objects;
import java.io.Serializable;
import java.util.Locale;

public final class SlowMotionData$Segment
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final long b;
    public final int c;

    static {
        SlowMotionData$Segment$a slowMotionData$Segment$a = new Object();
        CREATOR = slowMotionData$Segment$a;
    }

    public SlowMotionData$Segment(long l2, long l3, int n3) {
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        l4 = l4 < 0 ? (long)1 : (long)0;
        ct3.a((boolean)l4);
        this.a = l2;
        this.b = l3;
        this.c = n3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<SlowMotionData$Segment> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = SlowMotionData$Segment.class) == (clazz = object.getClass())) {
            int n3;
            int n4;
            long l2;
            object = (SlowMotionData$Segment)object;
            long l3 = this.a;
            long l4 = ((SlowMotionData$Segment)object).a;
            long l7 = l3 - l4;
            Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object2 != false || (object2 = (l2 = (l3 = this.b) - (l4 = ((SlowMotionData$Segment)object).b)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false || (n4 = this.c) != (n3 = ((SlowMotionData$Segment)object).c)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        Long l2 = this.a;
        Long l3 = this.b;
        Integer n3 = this.c;
        Object[] objectArray = new Object[]{l2, l3, n3};
        return Objects.hashCode(objectArray);
    }

    public final String toString() {
        Serializable serializable = Locale.US;
        serializable = new StringBuilder("Segment: startTimeMs=");
        long l2 = this.a;
        ((StringBuilder)serializable).append(l2);
        ((StringBuilder)serializable).append(", endTimeMs=");
        l2 = this.b;
        ((StringBuilder)serializable).append(l2);
        ((StringBuilder)serializable).append(", speedDivisor=");
        int n3 = this.c;
        ((StringBuilder)serializable).append(n3);
        return ((StringBuilder)serializable).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        long l2 = this.a;
        parcel.writeLong(l2);
        l2 = this.b;
        parcel.writeLong(l2);
        n3 = this.c;
        parcel.writeInt(n3);
    }
}

