/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzaif;
import com.google.android.gms.internal.ads.zzaii;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzeq;
import java.util.List;

public final class zzaij
implements zzcc {
    public static final Parcelable.Creator CREATOR;
    public final List zza;

    static {
        zzaif zzaif2 = new zzaif();
        CREATOR = zzaif2;
    }

    public zzaij(List list) {
        this.zza = list;
        int n3 = list.isEmpty();
        boolean bl2 = false;
        if (n3 == 0) {
            int n4;
            zzaii zzaii2 = (zzaii)list.get(0);
            long l2 = zzaii2.zzc;
            for (n3 = 1; n3 < (n4 = list.size()); ++n3) {
                zzaii zzaii3 = (zzaii)list.get(n3);
                long l3 = zzaii3.zzb;
                long l4 = l3 - l2;
                Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object < 0) {
                    bl2 = true;
                    break;
                }
                zzaii zzaii4 = (zzaii)list.get(n3);
                l2 = zzaii4.zzc;
            }
        }
        zzeq.zzd(bl2 ^ true);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        Object object2;
        Class<zzaij> clazz;
        if (this == object) {
            return true;
        }
        if (object != null && (clazz = zzaij.class) == (object2 = object.getClass())) {
            object = (zzaij)object;
            object2 = this.zza;
            object = ((zzaij)object).zza;
            return object2.equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return ((Object)this.zza).hashCode();
    }

    public final String toString() {
        String string2 = this.zza.toString();
        return "SlowMotion: segments=".concat(string2);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        List list = this.zza;
        parcel.writeList(list);
    }

    public final /* synthetic */ void zza(zzby zzby2) {
    }
}

