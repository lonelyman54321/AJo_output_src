/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl$a;

public class ParcelImpl
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final qB3 a;

    static {
        ParcelImpl$a parcelImpl$a = new Object();
        CREATOR = parcelImpl$a;
    }

    public ParcelImpl(Parcel object) {
        pb3_1 pb3_12 = new pb3_1((Parcel)object);
        object = pb3_12.m();
        this.a = object;
    }

    public ParcelImpl(qB3 qB32) {
        this.a = qB32;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel object, int n3) {
        pb3_1 pb3_12 = new pb3_1((Parcel)object);
        object = this.a;
        pb3_12.v((qB3)object);
    }
}

