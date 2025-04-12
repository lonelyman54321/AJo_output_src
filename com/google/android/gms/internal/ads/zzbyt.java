/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  org.json.JSONArray
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbyu;
import org.json.JSONArray;

public final class zzbyt
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final int zzb;

    static {
        zzbyu zzbyu2 = new zzbyu();
        CREATOR = zzbyu2;
    }

    public zzbyt(String string2, int n3) {
        this.zza = string2;
        this.zzb = n3;
    }

    public static zzbyt zza(JSONArray jSONArray) {
        int n3;
        if (jSONArray != null && (n3 = jSONArray.length()) != 0) {
            String string2 = jSONArray.getJSONObject(0).optString("rb_type");
            int n4 = jSONArray.getJSONObject(0).optInt("rb_amount");
            zzbyt zzbyt2 = new zzbyt(string2, n4);
            return zzbyt2;
        }
        return null;
    }

    public final boolean equals(Object object) {
        int n3;
        if (object != null && (n3 = object instanceof zzbyt) != 0) {
            object = (zzbyt)object;
            Object object2 = this.zza;
            String string2 = ((zzbyt)object).zza;
            n3 = Objects.equal(object2, string2);
            if (n3 != 0) {
                n3 = this.zzb;
                int n4 = ((zzbyt)object).zzb;
                object2 = n3;
                n4 = (int)(Objects.equal(object2, object = Integer.valueOf(n4)) ? 1 : 0);
                if (n4 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.zza;
        Integer n3 = this.zzb;
        Object[] objectArray = new Object[]{string2, n3};
        return Objects.hashCode(objectArray);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        int n7 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 3, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

