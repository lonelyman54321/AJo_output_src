/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.metrics.Trace;

class Trace$2
implements Parcelable.Creator {
    public Trace createFromParcel(Parcel parcel) {
        Trace trace = new Trace(parcel, true, null);
        return trace;
    }

    public Trace[] newArray(int n3) {
        return new Trace[n3];
    }
}

