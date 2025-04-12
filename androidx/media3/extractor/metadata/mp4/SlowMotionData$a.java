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
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import androidx.media3.extractor.metadata.mp4.SlowMotionData$Segment;
import java.util.ArrayList;

public final class SlowMotionData$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel object) {
        ArrayList arrayList = new ArrayList();
        ClassLoader classLoader = SlowMotionData$Segment.class.getClassLoader();
        object.readList(arrayList, classLoader);
        object = new SlowMotionData(arrayList);
        return object;
    }

    public final Object[] newArray(int n3) {
        return new SlowMotionData[n3];
    }
}

