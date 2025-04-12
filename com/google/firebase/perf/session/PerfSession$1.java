/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.session.PerfSession;

class PerfSession$1
implements Parcelable.Creator {
    public PerfSession createFromParcel(Parcel parcel) {
        PerfSession perfSession = new PerfSession(parcel, null);
        return perfSession;
    }

    public PerfSession[] newArray(int n3) {
        return new PerfSession[n3];
    }
}

