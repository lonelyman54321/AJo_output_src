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
import androidx.media3.extractor.metadata.mp4.SlowMotionData$Segment;
import androidx.media3.extractor.metadata.mp4.SlowMotionData$a;
import java.util.ArrayList;
import java.util.List;

public final class SlowMotionData
implements Metadata$Entry {
    public static final Parcelable.Creator CREATOR;
    public final List a;

    static {
        SlowMotionData$a slowMotionData$a = new Object();
        CREATOR = slowMotionData$a;
    }

    public SlowMotionData(ArrayList arrayList) {
        this.a = arrayList;
        int n3 = arrayList.isEmpty();
        boolean bl2 = false;
        if (n3 == 0) {
            int n4;
            SlowMotionData$Segment slowMotionData$Segment = (SlowMotionData$Segment)arrayList.get(0);
            long l2 = slowMotionData$Segment.b;
            for (n3 = 1; n3 < (n4 = arrayList.size()); ++n3) {
                SlowMotionData$Segment slowMotionData$Segment2 = (SlowMotionData$Segment)arrayList.get(n3);
                long l3 = slowMotionData$Segment2.a;
                long l4 = l3 - l2;
                Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object < 0) {
                    bl2 = true;
                    break;
                }
                SlowMotionData$Segment slowMotionData$Segment3 = (SlowMotionData$Segment)arrayList.get(n3);
                l2 = slowMotionData$Segment3.b;
            }
        }
        ct3.a(bl2 ^ true);
    }

    public final /* synthetic */ d d() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        Object object2;
        Class<SlowMotionData> clazz;
        if (this == object) {
            return true;
        }
        if (object != null && (clazz = SlowMotionData.class) == (object2 = object.getClass())) {
            object = (SlowMotionData)object;
            object2 = this.a;
            object = ((SlowMotionData)object).a;
            return object2.equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SlowMotion: segments=");
        List list = this.a;
        stringBuilder.append(list);
        return stringBuilder.toString();
    }

    public final /* synthetic */ void u(e$a e$a) {
    }

    public final /* synthetic */ byte[] w() {
        return null;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        List list = this.a;
        parcel.writeList(list);
    }
}

