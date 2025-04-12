/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.location.zzap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SleepSegmentEvent
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final int STATUS_MISSING_DATA = 1;
    public static final int STATUS_NOT_DETECTED = 2;
    public static final int STATUS_SUCCESSFUL;
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;

    static {
        zzap zzap2 = new zzap();
        CREATOR = zzap2;
    }

    public SleepSegmentEvent(long l2, long l3, int n3, int n4, int n7) {
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        l4 = l4 <= 0 ? (long)1 : (long)0;
        Preconditions.checkArgument((boolean)l4, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.zza = l2;
        this.zzb = l3;
        this.zzc = n3;
        this.zzd = n4;
        this.zze = n7;
    }

    public static List extractEvents(Intent object) {
        Preconditions.checkNotNull(object);
        boolean bl2 = SleepSegmentEvent.hasEvents((Intent)object);
        if (!bl2) {
            return Collections.emptyList();
        }
        Object object2 = "com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT";
        if ((object = (ArrayList)object.getSerializableExtra((String)object2)) == null) {
            return Collections.emptyList();
        }
        int n3 = object.size();
        object2 = new Object(n3);
        n3 = object.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object3 = (byte[])object.get(i3);
            Preconditions.checkNotNull(object3);
            Parcelable.Creator creator = CREATOR;
            object3 = (SleepSegmentEvent)SafeParcelableSerializer.deserializeFromBytes(object3, creator);
            ((ArrayList)object2).add(object3);
        }
        return Collections.unmodifiableList(object2);
    }

    public static boolean hasEvents(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
    }

    public boolean equals(Object object) {
        int n3;
        int n4;
        long l2;
        long l3;
        long l4;
        long l7;
        int n7 = object instanceof SleepSegmentEvent;
        return n7 != 0 && (n7 = (l7 = (l4 = this.zza) - (l3 = ((SleepSegmentEvent)(object = (SleepSegmentEvent)object)).getStartTimeMillis())) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == 0 && (n7 = (l2 = (l4 = this.zzb) - (l3 = ((SleepSegmentEvent)object).getEndTimeMillis())) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == 0 && (n7 = this.zzc) == (n4 = ((SleepSegmentEvent)object).getStatus()) && (n7 = this.zzd) == (n4 = ((SleepSegmentEvent)object).zzd) && (n7 = this.zze) == (n3 = ((SleepSegmentEvent)object).zze);
    }

    public long getEndTimeMillis() {
        return this.zzb;
    }

    public long getSegmentDurationMillis() {
        long l2 = this.zzb;
        long l3 = this.zza;
        return l2 - l3;
    }

    public long getStartTimeMillis() {
        return this.zza;
    }

    public int getStatus() {
        return this.zzc;
    }

    public int hashCode() {
        Long l2 = this.zza;
        Long l3 = this.zzb;
        Integer n3 = this.zzc;
        Object[] objectArray = new Object[]{l2, l3, n3};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        long l2 = this.zza;
        int n3 = String.valueOf(l2).length();
        long l3 = this.zzb;
        int n4 = String.valueOf(l3).length();
        int n7 = this.zzc;
        int n8 = String.valueOf(n7).length();
        n3 = n3 + 24 + n4;
        n3 = n3 + 9 + n8;
        StringBuilder stringBuilder = new StringBuilder(n3);
        fn0_2.b(stringBuilder, "startMillis=", l2, ", endMillis=");
        stringBuilder.append(l3);
        stringBuilder.append(", status=");
        stringBuilder.append(n7);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Preconditions.checkNotNull(parcel);
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        long l2 = this.getStartTimeMillis();
        SafeParcelWriter.writeLong(parcel, 1, l2);
        l2 = this.getEndTimeMillis();
        SafeParcelWriter.writeLong(parcel, 2, l2);
        int n4 = this.getStatus();
        SafeParcelWriter.writeInt(parcel, 3, n4);
        n4 = this.zzd;
        SafeParcelWriter.writeInt(parcel, 4, n4);
        n4 = this.zze;
        SafeParcelWriter.writeInt(parcel, 5, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

