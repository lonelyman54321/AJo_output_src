/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.zzaq;
import java.util.List;

public class SleepSegmentRequest
extends AbstractSafeParcelable {
    public static final int CLASSIFY_EVENTS_ONLY = 2;
    public static final Parcelable.Creator CREATOR;
    public static final int SEGMENT_AND_CLASSIFY_EVENTS = 0;
    public static final int SEGMENT_EVENTS_ONLY = 1;
    private final List zza;
    private final int zzb;

    static {
        zzaq zzaq2 = new zzaq();
        CREATOR = zzaq2;
    }

    public SleepSegmentRequest(int n3) {
        this(null, n3);
    }

    public SleepSegmentRequest(List list, int n3) {
        this.zza = list;
        this.zzb = n3;
    }

    public static SleepSegmentRequest getDefaultSleepSegmentRequest() {
        SleepSegmentRequest sleepSegmentRequest = new SleepSegmentRequest(null, 0);
        return sleepSegmentRequest;
    }

    public boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof SleepSegmentRequest;
        if (n4 == 0) {
            return false;
        }
        object = (SleepSegmentRequest)object;
        List list = this.zza;
        List list2 = ((SleepSegmentRequest)object).zza;
        n4 = Objects.equal(list, list2);
        if (n4 != 0 && (n4 = this.zzb) == (n3 = ((SleepSegmentRequest)object).zzb)) {
            return bl2;
        }
        return false;
    }

    public int getRequestedDataType() {
        return this.zzb;
    }

    public int hashCode() {
        List list = this.zza;
        Integer n3 = this.zzb;
        Object[] objectArray = new Object[]{list, n3};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Preconditions.checkNotNull(parcel);
        List list = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        int n7 = this.getRequestedDataType();
        SafeParcelWriter.writeInt(parcel, 2, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

