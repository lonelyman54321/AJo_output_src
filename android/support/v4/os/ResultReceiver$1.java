/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;

class ResultReceiver$1
implements Parcelable.Creator {
    public ResultReceiver createFromParcel(Parcel parcel) {
        ResultReceiver resultReceiver = new ResultReceiver(parcel);
        return resultReceiver;
    }

    public ResultReceiver[] newArray(int n3) {
        return new ResultReceiver[n3];
    }
}

