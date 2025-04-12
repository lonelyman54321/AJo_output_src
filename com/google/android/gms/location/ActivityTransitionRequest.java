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
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.zzg;
import com.google.android.gms.location.zzh;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ActivityTransitionRequest
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final Comparator IS_SAME_TRANSITION;
    private final List zza;
    private final String zzb;
    private final List zzc;
    private String zzd;

    static {
        Object object = new zzh();
        CREATOR = object;
        IS_SAME_TRANSITION = object = new zzg();
    }

    public ActivityTransitionRequest(List list) {
        this(list, null, null, null);
    }

    public ActivityTransitionRequest(List list, String string2, List list2, String string3) {
        boolean bl2;
        Preconditions.checkNotNull(list, "transitions can't be null");
        boolean bl3 = list.isEmpty();
        int n3 = 1;
        Preconditions.checkArgument(bl3 ^= n3, "transitions can't be empty.");
        Preconditions.checkNotNull(list);
        Object object = IS_SAME_TRANSITION;
        TreeSet<ActivityTransition> treeSet = new TreeSet<ActivityTransition>((Comparator<ActivityTransition>)object);
        object = list.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (ActivityTransition)object.next();
            boolean bl4 = treeSet.add((ActivityTransition)object2);
            Object[] objectArray = new Object[n3];
            objectArray[0] = object2;
            object2 = String.format("Found duplicated transition: %s.", objectArray);
            Preconditions.checkArgument(bl4, object2);
        }
        this.zza = list = Collections.unmodifiableList(list);
        this.zzb = string2;
        list = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.zzc = list;
        this.zzd = string3;
    }

    public boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = this.getClass()) == (object2 = object.getClass())) {
            boolean bl3;
            object = (ActivityTransitionRequest)object;
            object3 = this.zza;
            object2 = ((ActivityTransitionRequest)object).zza;
            boolean bl4 = Objects.equal(object3, object2);
            if (bl4 && (bl4 = Objects.equal(object3 = this.zzb, object2 = ((ActivityTransitionRequest)object).zzb)) && (bl4 = Objects.equal(object3 = this.zzd, object2 = ((ActivityTransitionRequest)object).zzd)) && (bl3 = Objects.equal(object3 = this.zzc, object = ((ActivityTransitionRequest)object).zzc))) {
                return bl2;
            }
        }
        return false;
    }

    public int hashCode() {
        int n3;
        List list = this.zza;
        int n4 = ((Object)list).hashCode() * 31;
        Object object = this.zzb;
        int n7 = 0;
        if (object != null) {
            n3 = ((String)object).hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.zzc;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.zzd;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public void serializeToIntentExtra(Intent intent) {
        Preconditions.checkNotNull(intent);
        SafeParcelableSerializer.serializeToIntentExtra(this, intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
    }

    public String toString() {
        Object object = this.zzc;
        String string2 = String.valueOf(this.zza);
        object = String.valueOf(object);
        String string3 = this.zzd;
        int n3 = string2.length();
        String string4 = this.zzb;
        int n4 = String.valueOf(string4).length();
        int n7 = ((String)object).length();
        int n8 = String.valueOf(string3).length();
        n3 = n3 + 48 + n4 + 12 + n7 + 18 + n8;
        StringBuilder stringBuilder = new StringBuilder(++n3);
        X50.a(stringBuilder, "ActivityTransitionRequest [mTransitions=", string2, ", mTag='", string4);
        X50.a(stringBuilder, "', mClients=", (String)object, ", mAttributionTag=", string3);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Preconditions.checkNotNull(parcel);
        List list = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        Object object = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, (String)object, false);
        object = this.zzc;
        SafeParcelWriter.writeTypedList(parcel, 3, (List)object, false);
        object = this.zzd;
        SafeParcelWriter.writeString(parcel, 4, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final ActivityTransitionRequest zza(String string2) {
        this.zzd = string2;
        return this;
    }
}

