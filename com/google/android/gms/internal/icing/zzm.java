/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.icing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.icing.zzn;
import java.util.ArrayList;

public final class zzm
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    final Bundle zzb;

    static {
        zzn zzn2 = new zzn();
        CREATOR = zzn2;
    }

    public zzm(int n3, Bundle bundle) {
        this.zza = n3;
        this.zzb = bundle;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof zzm;
        if (n3 == 0) {
            return false;
        }
        object = (zzm)object;
        n3 = this.zza;
        int n4 = ((zzm)object).zza;
        if (n3 != n4) {
            return false;
        }
        Object object2 = this.zzb;
        if (object2 == null) {
            object = ((zzm)object).zzb;
            if (object == null) {
                return bl2;
            }
            return false;
        }
        Object object3 = ((zzm)object).zzb;
        if (object3 == null) {
            return false;
        }
        n3 = object2.size();
        if (n3 != (n4 = (object3 = ((zzm)object).zzb).size())) {
            return false;
        }
        object2 = this.zzb.keySet().iterator();
        while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            Bundle bundle;
            Object object4 = ((zzm)object).zzb;
            object3 = (String)object2.next();
            boolean bl3 = object4.containsKey((String)object3);
            if (bl3 && (n4 = (int)(Objects.equal(object4 = this.zzb.getString((String)object3), object3 = (bundle = ((zzm)object).zzb).getString((String)object3)) ? 1 : 0)) != 0) continue;
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n3 = this.zza;
        Object object = Integer.valueOf(n3);
        arrayList.add(object);
        object = this.zzb;
        if (object != null) {
            boolean bl2;
            object = object.keySet().iterator();
            while (bl2 = object.hasNext()) {
                String string2 = (String)object.next();
                arrayList.add(string2);
                Bundle bundle = this.zzb;
                if ((string2 = bundle.getString(string2)) == null) continue;
                arrayList.add(string2);
            }
        }
        object = new Object[]{};
        return Objects.hashCode(arrayList.toArray((T[])object));
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1, n4);
        Bundle bundle = this.zzb;
        SafeParcelWriter.writeBundle(parcel, 2, bundle, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

