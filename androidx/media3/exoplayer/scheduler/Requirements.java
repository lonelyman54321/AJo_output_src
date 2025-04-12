/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package androidx.media3.exoplayer.scheduler;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.scheduler.Requirements$a;

public final class Requirements
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;

    static {
        Requirements$a requirements$a = new Object();
        CREATOR = requirements$a;
    }

    public Requirements(int n3) {
        int n4 = n3 & 2;
        if (n4 != 0) {
            n3 |= 1;
        }
        this.a = n3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<Requirements> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = Requirements.class) == (clazz = object.getClass())) {
            object = (Requirements)object;
            int n3 = this.a;
            int n4 = ((Requirements)object).a;
            if (n3 != n4) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.a;
        parcel.writeInt(n3);
    }
}

