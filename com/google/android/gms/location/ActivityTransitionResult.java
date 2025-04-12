/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.zzi;
import java.util.Collections;
import java.util.List;

public class ActivityTransitionResult
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final List zza;
    private Bundle zzb;

    static {
        zzi zzi2 = new zzi();
        CREATOR = zzi2;
    }

    public ActivityTransitionResult(List list) {
        int n3 = 1;
        this.zzb = null;
        String string2 = "transitionEvents list can't be null.";
        Preconditions.checkNotNull(list, string2);
        int n4 = list.isEmpty();
        if (n4 == 0) {
            int n7;
            for (n4 = 1; n4 < (n7 = list.size()); n4 += n3) {
                int n8;
                Object[] objectArray;
                long l2;
                ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent)list.get(n4);
                long l3 = activityTransitionEvent.getElapsedRealTimeNanos();
                long l4 = l3 - (l2 = (objectArray = (Object[])list.get(n8 = n4 + -1)).getElapsedRealTimeNanos());
                Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object >= 0) {
                    n7 = 1;
                } else {
                    n7 = 0;
                    activityTransitionEvent = null;
                }
                l2 = ((ActivityTransitionEvent)list.get(n4)).getElapsedRealTimeNanos();
                Object object2 = l2;
                long l7 = ((ActivityTransitionEvent)list.get(n8)).getElapsedRealTimeNanos();
                Long l8 = l7;
                int n10 = 2;
                objectArray = new Object[n10];
                objectArray[0] = object2;
                objectArray[n3] = l8;
                object2 = "Transition out of order: ts1=%d, ts2=%d";
                Preconditions.checkArgument(n7 != 0, (String)object2, objectArray);
            }
        }
        this.zza = list = Collections.unmodifiableList(list);
    }

    public ActivityTransitionResult(List list, Bundle bundle) {
        this(list);
        this.zzb = bundle;
    }

    public static ActivityTransitionResult extractResult(Intent intent) {
        boolean bl2 = ActivityTransitionResult.hasResult(intent);
        if (!bl2) {
            return null;
        }
        Parcelable.Creator creator = CREATOR;
        return (ActivityTransitionResult)SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", creator);
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
    }

    public boolean equals(Object object) {
        Class<?> clazz;
        Object object2;
        if (this == object) {
            return true;
        }
        if (object != null && (object2 = this.getClass()) == (clazz = object.getClass())) {
            object2 = this.zza;
            object = ((ActivityTransitionResult)object).zza;
            return object2.equals(object);
        }
        return false;
    }

    public List getTransitionEvents() {
        return this.zza;
    }

    public int hashCode() {
        return ((Object)this.zza).hashCode();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Preconditions.checkNotNull(parcel);
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        List list = this.getTransitionEvents();
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        Bundle bundle = this.zzb;
        SafeParcelWriter.writeBundle(parcel, 2, bundle, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

