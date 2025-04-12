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
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.zzd;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ActivityRecognitionResult
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    List zza;
    long zzb;
    long zzc;
    int zzd;
    Bundle zze;

    static {
        zzd zzd2 = new zzd();
        CREATOR = zzd2;
    }

    public ActivityRecognitionResult(DetectedActivity detectedActivity, long l2, long l3) {
        List<DetectedActivity> list = Collections.singletonList(detectedActivity);
        this(list, l2, l3, 0, null);
    }

    public ActivityRecognitionResult(List list, long l2, long l3) {
        this(list, l2, l3, 0, null);
    }

    public ActivityRecognitionResult(List list, long l2, long l3, int n3, Bundle bundle) {
        boolean bl2;
        boolean bl3 = true;
        bl2 = list != null && !(bl2 = list.isEmpty());
        String string2 = "Must have at least 1 detected activity";
        Preconditions.checkArgument(bl2, string2);
        long l4 = 0L;
        long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (l7 <= 0 || (l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1)) <= 0) {
            bl3 = false;
        }
        Preconditions.checkArgument(bl3, "Must set times");
        this.zza = list;
        this.zzb = l2;
        this.zzc = l3;
        this.zzd = n3;
        this.zze = bundle;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ActivityRecognitionResult extractResult(Intent var0) {
        block6: {
            var1_1 = ActivityRecognitionResult.hasResult((Intent)var0);
            if (var1_1 == 0) lbl-1000:
            // 3 sources

            {
                while (true) {
                    var1_1 = 0;
                    var2_2 /* !! */  = null;
                    break block6;
                    break;
                }
            }
            var2_2 /* !! */  = var0.getExtras();
            if (var2_2 /* !! */  == null) ** GOTO lbl-1000
            var3_3 = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT";
            var4_4 = (var2_2 /* !! */  = var2_2 /* !! */ .get(var3_3)) instanceof byte[];
            if (var4_4) {
                var2_2 /* !! */  = (Bundle)((byte[])var2_2 /* !! */ );
                var3_3 = ActivityRecognitionResult.CREATOR;
                var2_2 /* !! */  = (ActivityRecognitionResult)SafeParcelableSerializer.deserializeFromBytes((byte[])var2_2 /* !! */ , (Parcelable.Creator)var3_3);
            } else {
                var4_4 = var2_2 /* !! */  instanceof ActivityRecognitionResult;
                if (var4_4) ** break;
                ** continue;
                var2_2 /* !! */  = (ActivityRecognitionResult)var2_2 /* !! */ ;
            }
        }
        if (var2_2 /* !! */  != null) {
            return var2_2 /* !! */ ;
        }
        if ((var0 = ActivityRecognitionResult.zza((Intent)var0)) != null && (var1_1 = var0.isEmpty()) == 0) {
            var1_1 = var0.size() + -1;
            return (ActivityRecognitionResult)var0.get(var1_1);
        }
        return null;
    }

    public static boolean hasResult(Intent object) {
        boolean bl2;
        if (object == null) {
            return false;
        }
        String string2 = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT";
        boolean bl3 = object.hasExtra(string2);
        boolean bl4 = true;
        if (bl3) {
            return bl4;
        }
        if ((object = ActivityRecognitionResult.zza((Intent)object)) != null && !(bl2 = object.isEmpty())) {
            return bl4;
        }
        return false;
    }

    public static List zza(Intent intent) {
        String string2;
        boolean bl2;
        if (intent != null && (bl2 = intent.hasExtra(string2 = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST"))) {
            Parcelable.Creator creator = CREATOR;
            return SafeParcelableSerializer.deserializeIterableFromIntentExtra(intent, string2, creator);
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean zzb(Bundle bundle, Bundle bundle2) {
        int n3;
        boolean bl2 = true;
        if (bundle == null) {
            if (bundle2 != null) return false;
            return bl2;
        }
        if (bundle2 == null) {
            return false;
        }
        int n4 = bundle.size();
        if (n4 != (n3 = bundle2.size())) {
            return false;
        }
        Iterator iterator = bundle.keySet().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            Class<?> clazz = (String)iterator.next();
            boolean bl3 = bundle2.containsKey((String)((Object)clazz));
            if (!bl3) {
                return false;
            }
            Object object = bundle.get((String)((Object)clazz));
            Object object2 = bundle2.get((String)((Object)clazz));
            if (object == null) {
                if (object2 == null) continue;
                return false;
            }
            int n7 = object instanceof Bundle;
            if (n7 != 0) {
                object = bundle.getBundle((String)((Object)clazz));
                n3 = (int)(ActivityRecognitionResult.zzb((Bundle)object, (Bundle)(clazz = bundle2.getBundle((String)((Object)clazz)))) ? 1 : 0);
                if (n3 != 0) continue;
                return false;
            }
            clazz = object.getClass();
            n3 = (int)(clazz.isArray() ? 1 : 0);
            if (n3 != 0) {
                if (object2 == null || (n3 = (int)((clazz = object2.getClass()).isArray() ? 1 : 0)) == 0 || (n3 = Array.getLength(object)) != (n7 = Array.getLength(object2))) return false;
                for (n7 = 0; n7 < n3; ++n7) {
                    Object object3;
                    Object object4 = Array.get(object, n7);
                    boolean bl4 = Objects.equal(object4, object3 = Array.get(object2, n7));
                    if (!bl4) return false;
                }
                continue;
            }
            n3 = (int)(object.equals(object2) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        return bl2;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = this.getClass()) == (object2 = object.getClass())) {
            boolean bl3;
            int n3;
            int n4;
            long l2;
            object = (ActivityRecognitionResult)object;
            long l3 = this.zzb;
            long l4 = ((ActivityRecognitionResult)object).zzb;
            long l7 = l3 - l4;
            Object object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object4 == false && (object4 = (l2 = (l3 = this.zzc) - (l4 = ((ActivityRecognitionResult)object).zzc)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false && (n4 = this.zzd) == (n3 = ((ActivityRecognitionResult)object).zzd) && (n4 = (int)(Objects.equal(object3 = this.zza, object2 = ((ActivityRecognitionResult)object).zza) ? 1 : 0)) != 0 && (bl3 = ActivityRecognitionResult.zzb((Bundle)(object3 = this.zze), (Bundle)(object = ((ActivityRecognitionResult)object).zze)))) {
                return bl2;
            }
        }
        return false;
    }

    public int getActivityConfidence(int n3) {
        boolean bl2;
        Iterator iterator = this.zza.iterator();
        while (bl2 = iterator.hasNext()) {
            DetectedActivity detectedActivity = (DetectedActivity)iterator.next();
            int n4 = detectedActivity.getType();
            if (n4 != n3) continue;
            return detectedActivity.getConfidence();
        }
        return 0;
    }

    public long getElapsedRealtimeMillis() {
        return this.zzc;
    }

    public DetectedActivity getMostProbableActivity() {
        return (DetectedActivity)this.zza.get(0);
    }

    public List getProbableActivities() {
        return this.zza;
    }

    public long getTime() {
        return this.zzb;
    }

    public final int hashCode() {
        Long l2 = this.zzb;
        Long l3 = this.zzc;
        Integer n3 = this.zzd;
        List list = this.zza;
        Bundle bundle = this.zze;
        Object[] objectArray = new Object[]{l2, l3, n3, list, bundle};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        String string2 = String.valueOf(this.zza);
        long l2 = this.zzb;
        long l3 = this.zzc;
        int n3 = string2.length();
        int n4 = String.valueOf(l2).length();
        int n7 = String.valueOf(l3).length();
        n3 = n3 + 59 + n4 + 24 + n7;
        StringBuilder stringBuilder = new StringBuilder(++n3);
        stringBuilder.append("ActivityRecognitionResult [probableActivities=");
        stringBuilder.append(string2);
        stringBuilder.append(", timeMillis=");
        stringBuilder.append(l2);
        stringBuilder.append(", elapsedRealtimeMillis=");
        stringBuilder.append(l3);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        List list = this.zza;
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        long l2 = this.zzb;
        SafeParcelWriter.writeLong(parcel, 2, l2);
        l2 = this.zzc;
        SafeParcelWriter.writeLong(parcel, 3, l2);
        int n4 = this.zzd;
        SafeParcelWriter.writeInt(parcel, 4, n4);
        Bundle bundle = this.zze;
        SafeParcelWriter.writeBundle(parcel, 5, bundle, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

