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
import com.google.android.gms.location.zzao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SleepClassifyEvent
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final boolean zzh;
    private final int zzi;

    static {
        zzao zzao2 = new zzao();
        CREATOR = zzao2;
    }

    public SleepClassifyEvent(int n3, int n4, int n7, int n8, int n10, int n14, int n15, boolean bl2, int n16) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = n7;
        this.zzd = n8;
        this.zze = n10;
        this.zzf = n14;
        this.zzg = n15;
        this.zzh = bl2;
        this.zzi = n16;
    }

    public static List extractEvents(Intent object) {
        Preconditions.checkNotNull(object);
        boolean bl2 = SleepClassifyEvent.hasEvents((Intent)object);
        if (!bl2) {
            return Collections.emptyList();
        }
        Object object2 = "com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT";
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
            object3 = (SleepClassifyEvent)SafeParcelableSerializer.deserializeFromBytes(object3, creator);
            ((ArrayList)object2).add(object3);
        }
        return Collections.unmodifiableList(object2);
    }

    public static boolean hasEvents(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
    }

    public boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof SleepClassifyEvent;
        if (n4 == 0) {
            return false;
        }
        object = (SleepClassifyEvent)object;
        n4 = this.zza;
        int n7 = ((SleepClassifyEvent)object).zza;
        if (n4 == n7 && (n4 = this.zzb) == (n3 = ((SleepClassifyEvent)object).zzb)) {
            return bl2;
        }
        return false;
    }

    public int getConfidence() {
        return this.zzb;
    }

    public int getLight() {
        return this.zzd;
    }

    public int getMotion() {
        return this.zzc;
    }

    public long getTimestampMillis() {
        return (long)this.zza * 1000L;
    }

    public int hashCode() {
        Integer n3 = this.zza;
        Integer n4 = this.zzb;
        Object[] objectArray = new Object[]{n3, n4};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        int n3 = this.zza;
        int n4 = String.valueOf(n3).length();
        int n7 = this.zzb;
        int n8 = String.valueOf(n7).length();
        int n10 = this.zzc;
        int n14 = String.valueOf(n10).length();
        int n15 = this.zzd;
        int n16 = String.valueOf(n15).length();
        n4 = n4 + 6 + n8 + 8 + n14;
        n4 = n4 + 7 + n16;
        StringBuilder stringBuilder = new StringBuilder(n4);
        m10.a(stringBuilder, n3, " Conf:", n7, " Motion:");
        return Xd0.a(" Light:", n10, n15, stringBuilder);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Preconditions.checkNotNull(parcel);
        n3 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n3);
        int n7 = this.getConfidence();
        SafeParcelWriter.writeInt(parcel, 2, n7);
        n7 = this.getMotion();
        SafeParcelWriter.writeInt(parcel, 3, n7);
        n7 = this.getLight();
        SafeParcelWriter.writeInt(parcel, 4, n7);
        n7 = this.zze;
        SafeParcelWriter.writeInt(parcel, 5, n7);
        n7 = this.zzf;
        SafeParcelWriter.writeInt(parcel, 6, n7);
        n7 = this.zzg;
        SafeParcelWriter.writeInt(parcel, 7, n7);
        n7 = (int)(this.zzh ? 1 : 0);
        SafeParcelWriter.writeBoolean(parcel, 8, n7 != 0);
        n7 = this.zzi;
        SafeParcelWriter.writeInt(parcel, 9, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

