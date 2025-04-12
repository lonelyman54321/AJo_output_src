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
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata$a;
import com.google.common.primitives.Longs;

public final class MotionPhotoMetadata
implements Metadata$Entry {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    static {
        MotionPhotoMetadata$a motionPhotoMetadata$a = new Object();
        CREATOR = motionPhotoMetadata$a;
    }

    public MotionPhotoMetadata(long l2, long l3, long l4, long l7, long l8) {
        this.a = l2;
        this.b = l3;
        this.c = l4;
        this.d = l7;
        this.e = l8;
    }

    public MotionPhotoMetadata(Parcel parcel) {
        long l2;
        this.a = l2 = parcel.readLong();
        this.b = l2 = parcel.readLong();
        this.c = l2 = parcel.readLong();
        this.d = l2 = parcel.readLong();
        this.e = l2 = parcel.readLong();
    }

    public final /* synthetic */ d d() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<MotionPhotoMetadata> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = MotionPhotoMetadata.class) == (clazz = object.getClass())) {
            long l2;
            long l3;
            long l4;
            long l7;
            long l8;
            object = (MotionPhotoMetadata)object;
            long l12 = this.a;
            long l14 = ((MotionPhotoMetadata)object).a;
            long l15 = l12 - l14;
            Object object2 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
            if (object2 != false || (object2 = (l8 = (l12 = this.b) - (l14 = ((MotionPhotoMetadata)object).b)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false || (object2 = (l7 = (l12 = this.c) - (l14 = ((MotionPhotoMetadata)object).c)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false || (object2 = (l4 = (l12 = this.d) - (l14 = ((MotionPhotoMetadata)object).d)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false || (l3 = (l2 = (l12 = this.e) - (l14 = ((MotionPhotoMetadata)object).e)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = (Longs.hashCode(this.a) + 527) * 31;
        int n4 = (Longs.hashCode(this.b) + n3) * 31;
        n3 = (Longs.hashCode(this.c) + n4) * 31;
        n4 = (Longs.hashCode(this.d) + n3) * 31;
        return Longs.hashCode(this.e) + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Motion photo metadata: photoStartPosition=");
        long l2 = this.a;
        stringBuilder.append(l2);
        stringBuilder.append(", photoSize=");
        l2 = this.b;
        stringBuilder.append(l2);
        stringBuilder.append(", photoPresentationTimestampUs=");
        l2 = this.c;
        stringBuilder.append(l2);
        stringBuilder.append(", videoStartPosition=");
        l2 = this.d;
        stringBuilder.append(l2);
        stringBuilder.append(", videoSize=");
        l2 = this.e;
        stringBuilder.append(l2);
        return stringBuilder.toString();
    }

    public final /* synthetic */ void u(e$a e$a) {
    }

    public final /* synthetic */ byte[] w() {
        return null;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        long l2 = this.a;
        parcel.writeLong(l2);
        l2 = this.b;
        parcel.writeLong(l2);
        l2 = this.c;
        parcel.writeLong(l2);
        l2 = this.d;
        parcel.writeLong(l2);
        l2 = this.e;
        parcel.writeLong(l2);
    }
}

